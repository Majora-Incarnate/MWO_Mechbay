package com.github.majora_incarnate.mwo.mechbay.entities;

import com.github.majora_incarnate.mwo.mechbay.entities.blueprints.ActuatorBlueprint;
import com.github.majora_incarnate.mwo.mechbay.entities.blueprints.SectionBlueprint;
import com.github.majora_incarnate.mwo.mechbay.entities.enums.CriticalType;
import com.github.majora_incarnate.mwo.mechbay.entities.enums.HardpointType;
import com.github.majora_incarnate.mwo.mechbay.entities.enums.SectionClass;
import com.github.majora_incarnate.mwo.mechbay.entities.enums.SectionType;
import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Section {
    public final boolean hasRearArmor;
    public final int maximumCriticals;
    public int currentCriticals;
    public int maximumArmor;
    public int minimumArmor;
    public int health;
    public int rearArmor;
    public int frontArmor;
    public final Map<HardpointType, Integer> maximumHardpoints = new HashMap<>();
    public final Map<HardpointType, Integer> currentHardpoints = new HashMap<>();
    public final ArrayList<Crittable> components = new ArrayList();
    
    public Section(final SectionBlueprint sectionBlueprint, final double tonnage) {
        this.hasRearArmor = sectionBlueprint.section.hasRear;
        this.maximumCriticals = sectionBlueprint.criticals;
        this.currentCriticals = 0;
        this.health = Constants.INTERNALS_PER_SECTION[((int) ((tonnage - 20.0D) / 5.0D))][sectionBlueprint.section.index];
        this.rearArmor = 0;
        this.minimumArmor = this.frontArmor = 0;
        if (sectionBlueprint.section.equals(SectionType.HEAD)) {
            this.maximumArmor = 18;
        } else {
            this.maximumArmor = this.health * 2;
        }
        this.health += (0);
        for (HardpointType hardpointType : HardpointType.values()) {
            maximumHardpoints.put(hardpointType, sectionBlueprint.hardpoints.get(hardpointType));
            currentHardpoints.put(hardpointType, 0);
        }
        for (int i = 0; i < sectionBlueprint.minimumActuatorCount; i++) {
            /*for (ActuatorBlueprint localActuator_Blueprint : Database.MASTER_ACTUATOR_BLUEPRINTS) {
                if ((localActuator_Blueprint.type.equals(paramSection_Blueprint.actuator_type)) && (localActuator_Blueprint.index == i)) {
                    addComponent(localActuator_Blueprint.Get_Crittable());
                }
            }*/
        }
    }

    public void removeOmniRestrictions() {
        this.components.stream().filter((localCrittable) -> ((localCrittable.isLocked) && ((localCrittable.itemType.equals("Armor")) || (localCrittable.itemType.equals("Structure")) || (localCrittable.itemType.equals("Heat Sink")) || (localCrittable.itemType.equals("Equipment")) || (localCrittable.itemType.equals("Jump Jet")) || (localCrittable.itemType.equals("Weapon"))))).forEach((localCrittable) -> {
            localCrittable.isLocked = false;
        });
    }

    public boolean toggleArmActuator(int actuatorIndex) {
        Iterator<Crittable> componentIterator = this.components.iterator();
        Crittable crittable;
        boolean flag = true;
        
        while (componentIterator.hasNext()) {
            crittable = componentIterator.next();
            ActuatorBlueprint actuatorBlueprint = null;
            
            if ((CriticalType.ACTUATOR.equals(crittable.itemType))) {
                actuatorBlueprint = (ActuatorBlueprint) crittable.reference;
            }
            
            if ((actuatorBlueprint != null) && (actuatorBlueprint.section.equals(SectionClass.ARM)) && (actuatorBlueprint.index == actuatorIndex)) {
                this.components.remove(crittable);
                flag = false;
            }
        }
        /*localIterator = Database.MASTER_ACTUATOR_BLUEPRINTS.iterator();
        while (localIterator.hasNext()) {
            localObject = (ActuatorBlueprint) localIterator.next();
            if ((((ActuatorBlueprint) localObject).type.equals("Arms")) && (((ActuatorBlueprint) localObject).index == paramInt)) {
                this.components.add(paramInt, ((ActuatorBlueprint) localObject).Get_Crittable());
            }
        }*/
        calculateCriticals();
        return flag;
    }

    public void updateSection(SectionBlueprint sectionBlueprint) {
        Lists.reverse(components).stream().filter((crittable) -> (crittable.isLocked)).forEachOrdered((crittable) -> {
            components.remove(crittable);
        });

        sectionBlueprint.hardpoints.keySet().forEach((hardpointType) -> {
            maximumHardpoints.put(hardpointType, sectionBlueprint.hardpoints.get(hardpointType));
        });
        
        calculateCriticals();
        calculateHardpoints();
    }

    public boolean addComponent(Crittable item) {
        if (item == null) {
            return false;
        }
        
        if (!item.hardpointType.toString().equals("None")) {
            for (HardpointType hardpointType : HardpointType.values()) {
                if (hardpointType.equals(item.hardpointType) &&
                        this.currentHardpoints.get(hardpointType) + 1 > this.maximumHardpoints.get(hardpointType)) {
                    return false;
                }
            }
        }
        
        if (this.currentCriticals + item.criticals > this.maximumCriticals) {
            return false;
        }
        
        this.components.add(item);
        calculateCriticals();
        calculateHardpoints();
        return true;
    }

    public boolean addComponent(Crittable item, int paramInt) {
        if (item == null) {
            return false;
        }
        if (!item.hardpointType.toString().equals("None")) {
            return false;
        }
        if (this.currentCriticals + item.criticals > this.maximumCriticals) {
            return false;
        }
        this.components.add(paramInt, item);
        calculateCriticals();
        calculateHardpoints();
        return true;
    }

    public void removeComponentType(String paramString) {
        for (int i = this.components.size() - 1; i >= 0; i--) {
            Crittable localCrittable = this.components.get(i);
            if (localCrittable.itemType.equals(paramString)) {
                this.components.remove(i);
            }
        }
        calculateCriticals();
        calculateHardpoints();
    }

    public Crittable getComponent(int paramInt) {
        if ((paramInt < 0) || (paramInt > this.maximumCriticals)) {
            return null;
        }
        int i = 0;
        for (Crittable localCrittable : this.components) {
            if (paramInt > i) {
                i += localCrittable.criticals;
                if (paramInt <= i) {
                    if (localCrittable.isLocked) {
                        return null;
                    }
                    return localCrittable;
                }
            }
        }
        return null;
    }

    public void removeComponent(Crittable item) {
        this.components.remove(item);
        calculateCriticals();
        calculateHardpoints();
    }

    public void removeComponent(int paramInt) {
        if ((paramInt < 0) || (paramInt > this.maximumCriticals)) {
            return;
        }
        int i = 0;
        for (int j = this.components.size() - 1; j >= 0; j--) {
            if (paramInt > i) {
                i += this.components.get(j).criticals;
                if (paramInt <= i) {
                    if (this.components.get(j).isLocked) {
                        return;
                    }
                    this.components.remove(j);
                }
            }
        }
        calculateCriticals();
        calculateHardpoints();
    }

    public void removeAll() {
        for (int i = this.components.size() - 1; i >= 0; i--) {
            if (!this.components.get(i).isLocked) {
                this.components.remove(i);
            }
        }
        
        calculateCriticals();
        calculateHardpoints();
    }

    public void calculateCriticals() {
        this.currentCriticals = 0;
        
        this.components.stream().forEach((crittable) -> {
            this.currentCriticals += crittable.criticals;
        });
    }

    public void calculateHardpoints() {
        for (HardpointType hardpointType : HardpointType.values()) {
            currentHardpoints.put(hardpointType, 0);
        }
        
        this.components.stream().forEach((crittable) -> {
            for (HardpointType hardpointType : HardpointType.values()) {
                if (hardpointType.equals(crittable.hardpointType)) {
                    currentHardpoints.put(hardpointType, currentHardpoints.get(hardpointType) + 1);
                }
            }
        });
    }

    public double calculateTonnage() {
        double d = 0.0D;
        return this.components.stream().map((crittable) -> crittable.tonnage).reduce(d, (accumulator, _item) -> accumulator + _item);
    }
}