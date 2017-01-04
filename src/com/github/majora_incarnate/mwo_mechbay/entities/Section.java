package com.github.majora_incarnate.mwo_mechbay.entities;

import com.github.majora_incarnate.mwo_mechbay.entities.blueprints.ActuatorBlueprint;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Section {
    public int maximumCriticals;
    public int currentCriticals;
    public final Map<HardpointType, Integer> maximumHardpoints = new HashMap<>();
    public final Map<HardpointType, Integer> currentHardpoints = new HashMap<>();
    public int health;
    public int minimumArmor;
    public int rearArmor;
    public int frontArmor;
    public int maximumArmor;
    public final ArrayList<Crittable> components = new ArrayList();

    public void Set_Section(final SectionBlueprint sectionBlueprint, final int sectionId, final double tonnage) {
        this.maximumCriticals = sectionBlueprint.criticals;
        this.currentCriticals = 0;
        this.health = Constants.INTERNALS_PER_SECTION[((int) ((tonnage - 20.0D) / 5.0D))][sectionId];
        this.rearArmor = 0;
        this.minimumArmor = (this.frontArmor = (0));
        if (sectionId == 5) {
            this.maximumArmor = (18 + (0));
        } else {
            this.maximumArmor = (this.health * 2 + (0));
        }
        this.health += (0);
        for (HardpointType hardpointType : HardpointType.values()) {
            maximumHardpoints.put(hardpointType, sectionBlueprint.hardpoints.get(hardpointType));
            currentHardpoints.put(hardpointType, 0);
        }
        for (int i = 0; i < sectionBlueprint.minimumActuatorCount; i++) {
            /*for (ActuatorBlueprint localActuator_Blueprint : Database.MASTER_ACTUATOR_BLUEPRINTS) {
                if ((localActuator_Blueprint.type.equals(paramSection_Blueprint.actuator_type)) && (localActuator_Blueprint.index == i)) {
                    Add_Component(localActuator_Blueprint.Get_Crittable());
                }
            }*/
        }
    }

    public void Remove_Omni_Restrictions() {
        this.components.stream().filter((localCrittable) -> ((localCrittable.isLocked) && ((localCrittable.itemType.equals("Armor")) || (localCrittable.itemType.equals("Structure")) || (localCrittable.itemType.equals("Heat Sink")) || (localCrittable.itemType.equals("Equipment")) || (localCrittable.itemType.equals("Jump Jet")) || (localCrittable.itemType.equals("Weapon"))))).forEach((localCrittable) -> {
            localCrittable.isLocked = false;
        });
    }

    public boolean Toggle_Arm_Actuator(int sectionId) {
        Iterator localIterator = this.components.iterator();
        Object localObject;
        while (localIterator.hasNext()) {
            localObject = localIterator.next();
            ActuatorBlueprint localActuator_Blueprint = null;
            if (((Crittable) localObject).itemType.equals("Actuator")) {
                localActuator_Blueprint = (ActuatorBlueprint) ((Crittable) localObject).reference;
            }
            if ((localActuator_Blueprint != null) && (localActuator_Blueprint.section.equals(SectionClass.ARM)) && (localActuator_Blueprint.index == sectionId)) {
                this.components.remove(localObject);
                Calculate_Criticals();
                return false;
            }
        }
        /*localIterator = Database.MASTER_ACTUATOR_BLUEPRINTS.iterator();
        while (localIterator.hasNext()) {
            localObject = (ActuatorBlueprint) localIterator.next();
            if ((((ActuatorBlueprint) localObject).type.equals("Arms")) && (((ActuatorBlueprint) localObject).index == paramInt)) {
                this.components.add(paramInt, ((ActuatorBlueprint) localObject).Get_Crittable());
            }
        }*/
        Calculate_Criticals();
        return true;
    }

    public void Update_Section(SectionBlueprint paramSection_Blueprint) {
        for (int i = this.components.size() - 1; i >= 0; i--) {
            /*if (!((Crittable) this.components.get(i)).is_locked) {
                Database.queued_items.add(this.components.get(i));
                this.components.remove(i);
            }*/
        }

        //System.arraycopy(paramSection_Blueprint.hardpoints, 0, this.maximum_hardpoints, 0, 5);
        Calculate_Criticals();
        Calculate_Hardpoints();
    }

    public boolean Add_Component(Crittable item) {
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
        Calculate_Criticals();
        Calculate_Hardpoints();
        return true;
    }

    public boolean Add_Component(Crittable item, int paramInt) {
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
        Calculate_Criticals();
        Calculate_Hardpoints();
        return true;
    }

    public void Remove_Component_Type(String paramString) {
        for (int i = this.components.size() - 1; i >= 0; i--) {
            Crittable localCrittable = this.components.get(i);
            if (localCrittable.itemType.equals(paramString)) {
                this.components.remove(i);
            }
        }
        Calculate_Criticals();
        Calculate_Hardpoints();
    }

    public Crittable Get_Component(int paramInt) {
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

    public void Remove_Component(Crittable item) {
        this.components.remove(item);
        Calculate_Criticals();
        Calculate_Hardpoints();
    }

    public void Remove_Component(int paramInt) {
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
        Calculate_Criticals();
        Calculate_Hardpoints();
    }

    public void Remove_All() {
        for (int i = this.components.size() - 1; i >= 0; i--) {
            if (!this.components.get(i).isLocked) {
                this.components.remove(i);
            }
        }
        Calculate_Criticals();
        Calculate_Hardpoints();
    }

    public void Calculate_Criticals() {
        this.currentCriticals = 0;
        this.components.stream().forEach((localCrittable) -> {
            this.currentCriticals += localCrittable.criticals;
        });
    }

    public void Calculate_Hardpoints() {
        for (HardpointType hardpointType : HardpointType.values()) {
            currentHardpoints.put(hardpointType, 0);
        }
        
        this.components.stream().forEach((localCrittable) -> {
            for (HardpointType hardpointType : HardpointType.values()) {
                if (hardpointType.equals(localCrittable.hardpointType)) {
                    currentHardpoints.put(hardpointType, currentHardpoints.get(hardpointType) + 1);
                }
            }
        });
    }

    public double Calculate_Tonnage() {
        double d = 0.0D;
        d = this.components.stream().map((localCrittable) -> localCrittable.tonnage).reduce(d, (accumulator, _item) -> accumulator + _item);
        return d;
    }
}