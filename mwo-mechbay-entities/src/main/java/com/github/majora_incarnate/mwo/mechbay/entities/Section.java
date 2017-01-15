package com.github.majora_incarnate.mwo.mechbay.entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.github.majora_incarnate.mwo.mechbay.entities.blueprints.ActuatorBlueprint;
import com.github.majora_incarnate.mwo.mechbay.entities.blueprints.SectionBlueprint;
import com.github.majora_incarnate.mwo.mechbay.entities.enums.CriticalType;
import com.github.majora_incarnate.mwo.mechbay.entities.enums.HardpointType;
import com.github.majora_incarnate.mwo.mechbay.entities.enums.SectionClass;
import com.github.majora_incarnate.mwo.mechbay.entities.enums.SectionType;
import com.google.common.collect.Lists;

public final class Section {
    public final SectionBlueprint sectionBlueprint;
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

    public Section(final Database database, final SectionBlueprint sectionBlueprint, final double tonnage) {
        this.sectionBlueprint = sectionBlueprint;
        this.hasRearArmor = sectionBlueprint.section.hasRear;
        this.maximumCriticals = sectionBlueprint.section.criticalCount;
        this.currentCriticals = 0;
        this.health = Constants.INTERNALS_PER_SECTION.get(tonnage).get(sectionBlueprint.section);
        this.rearArmor = 0;
        this.minimumArmor = this.frontArmor = 0;

        if (sectionBlueprint.section.equals(SectionType.HEAD)) {
            this.maximumArmor = 18;
        } else {
            this.maximumArmor = this.health * 2;
        }

        for (HardpointType hardpointType : HardpointType.values()) {
            final Optional<Integer> sectionHardpointCount = Optional.ofNullable(sectionBlueprint.hardpoints.get(hardpointType));
           
            maximumHardpoints.put(hardpointType, sectionHardpointCount.orElse(0));
            currentHardpoints.put(hardpointType, 0);
        }

        for (int i = 0; i < sectionBlueprint.minimumActuatorCount; i++) {
            final int actuatorIndex = i;

            database.ACTUATOR_BLUEPRINTS.stream().filter((actuatorBlueprint) -> ((actuatorBlueprint.section.equals(sectionBlueprint.section.sectionClass)) && (actuatorBlueprint.index == actuatorIndex))).forEachOrdered((actuatorBlueprint) -> {
                addComponent(actuatorBlueprint.getCrittable());
            });
        }
    }

    public void removeOmniRestrictions() {
        this.components.stream().filter((localCrittable) -> ((localCrittable.isLocked) && ((localCrittable.itemType.equals("Armor")) || (localCrittable.itemType.equals("Structure")) || (localCrittable.itemType.equals("Heat Sink")) || (localCrittable.itemType.equals("Equipment")) || (localCrittable.itemType.equals("Jump Jet")) || (localCrittable.itemType.equals("Weapon"))))).forEach((localCrittable) -> {
            localCrittable.isLocked = false;
        });
    }

    public boolean toggleArmActuator(final ActuatorBlueprint actuatorToToggle) {
        boolean flag = true;

        for (Crittable crittable : components) {
            if ((CriticalType.ACTUATOR.equals(crittable.itemType))) {
                final ActuatorBlueprint actuatorBlueprint = (ActuatorBlueprint) crittable.reference;
                if ((actuatorBlueprint != null) && (actuatorBlueprint.section.equals(SectionClass.ARM)) && (actuatorBlueprint.index == actuatorToToggle.index)) {
                    this.components.remove(crittable);
                    flag = false;
                    break;
                }
            }
        }

        if (flag) {
            components.add(actuatorToToggle.index, actuatorToToggle.getCrittable());
        }

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
                if (hardpointType.equals(item.hardpointType) && this.currentHardpoints.get(hardpointType) + 1 > this.maximumHardpoints.get(hardpointType)) {
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

    public Optional<Crittable> getComponent(int criticalIndex) {
        if ((criticalIndex < 0) || (criticalIndex > this.maximumCriticals)) {
            return null;
        }
        
        int i = 0;
        for (Crittable crittable : this.components) {
            if (criticalIndex > i) {
                i += crittable.criticals;
                if (criticalIndex <= i) {
                    if (crittable.isLocked) {
                        return Optional.empty();
                    }
                    
                    return Optional.of(crittable);
                }
            }
        }
        
        return Optional.empty();
    }

    public void removeComponent(Crittable item) {
        this.components.remove(item);
        
        calculateCriticals();
        calculateHardpoints();
    }

    public boolean removeComponent(int paramInt) {
        if ((paramInt < 0) || (paramInt > this.maximumCriticals)) {
            return false;
        }
        int i = 0;
        for (int j = this.components.size() - 1; j >= 0; j--) {
            if (paramInt > i) {
                i += this.components.get(j).criticals;
                if (paramInt <= i) {
                    if (this.components.get(j).isLocked) {
                        return false;
                    }
                    
                    this.components.remove(j);
                }
            }
        }
        
        calculateCriticals();
        calculateHardpoints();
        return true;
    }

    public void removeAll() {
        final List<Crittable> filterComponents = components.stream().filter((crittable) -> crittable.isLocked).collect(Collectors.toList());
        
        components.clear();
        
        filterComponents.forEach((crittable) -> components.add(crittable));

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
