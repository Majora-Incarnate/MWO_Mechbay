package com.quicksilver.mwo.mechbay.entities;

import java.util.ArrayList;
import java.util.Iterator;

public class Section {
    public int maximum_criticals;
    public int current_criticals;
    public final int[] maximum_hardpoints = new int[5];
    public final int[] current_hardpoints = new int[5];
    public int health;
    public int minimum_armor;
    public int rear_armor;
    public int front_armor;
    public int maximum_armor;
    public final ArrayList<Crittable> components = new ArrayList();

    public void Set_Section(final SectionBlueprint paramSection_Blueprint, final int sectionId, final double tonnage) {
        this.maximum_criticals = paramSection_Blueprint.criticals;
        this.current_criticals = 0;
        this.health = Constants.INTERNALS_PER_SECTION[((int) ((tonnage - 20.0D) / 5.0D))][sectionId];
        this.rear_armor = 0;
        this.minimum_armor = (this.front_armor = (0));
        if (sectionId == 5) {
            this.maximum_armor = (18 + (0));
        } else {
            this.maximum_armor = (this.health * 2 + (0));
        }
        this.health += (0);
        for (int i = 0; i < 5; i++) {
            this.maximum_hardpoints[i] = paramSection_Blueprint.hardpoints[i];
            this.current_hardpoints[i] = 0;
        }
        for (int i = 0; i < paramSection_Blueprint.minimum_actuator_count; i++) {
            /*for (ActuatorBlueprint localActuator_Blueprint : Database.MASTER_ACTUATOR_BLUEPRINTS) {
                if ((localActuator_Blueprint.type.equals(paramSection_Blueprint.actuator_type)) && (localActuator_Blueprint.index == i)) {
                    Add_Component(localActuator_Blueprint.Get_Crittable());
                }
            }*/
        }
    }

    public void Remove_Omni_Restrictions() {
        this.components.stream().filter((localCrittable) -> ((localCrittable.is_locked) && ((localCrittable.item_type.equals("Armor")) || (localCrittable.item_type.equals("Structure")) || (localCrittable.item_type.equals("Heat Sink")) || (localCrittable.item_type.equals("Equipment")) || (localCrittable.item_type.equals("Jump Jet")) || (localCrittable.item_type.equals("Weapon"))))).forEach((localCrittable) -> {
            localCrittable.is_locked = false;
        });
    }

    public boolean Toggle_Arm_Actuator(int sectionId) {
        Iterator localIterator = this.components.iterator();
        Object localObject;
        while (localIterator.hasNext()) {
            localObject = localIterator.next();
            ActuatorBlueprint localActuator_Blueprint = null;
            if (((Crittable) localObject).item_type.equals("Actuator")) {
                localActuator_Blueprint = (ActuatorBlueprint) ((Crittable) localObject).reference;
            }
            if ((localActuator_Blueprint != null) && (localActuator_Blueprint.type.equals("Arms")) && (localActuator_Blueprint.index == sectionId)) {
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

        System.arraycopy(paramSection_Blueprint.hardpoints, 0, this.maximum_hardpoints, 0, 5);
        Calculate_Criticals();
        Calculate_Hardpoints();
    }

    public boolean Add_Component(Crittable item) {
        if (item == null) {
            return false;
        }
        if (!item.hardpoint_type.toString().equals("None")) {
            for (int i = 0; (i < 5); i++) {
                if (HardpointType.values()[i].equals(item.hardpoint_type) &&
                        this.current_hardpoints[i] + 1 > this.maximum_hardpoints[i]) {
                    return false;
                }
            }
        }
        if (this.current_criticals + item.criticals > this.maximum_criticals) {
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
        if (!item.hardpoint_type.toString().equals("None")) {
            return false;
        }
        if (this.current_criticals + item.criticals > this.maximum_criticals) {
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
            if (localCrittable.item_type.equals(paramString)) {
                this.components.remove(i);
            }
        }
        Calculate_Criticals();
        Calculate_Hardpoints();
    }

    public Crittable Get_Component(int paramInt) {
        if ((paramInt < 0) || (paramInt > this.maximum_criticals)) {
            return null;
        }
        int i = 0;
        for (Crittable localCrittable : this.components) {
            if (paramInt > i) {
                i += localCrittable.criticals;
                if (paramInt <= i) {
                    if (localCrittable.is_locked) {
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
        if ((paramInt < 0) || (paramInt > this.maximum_criticals)) {
            return;
        }
        int i = 0;
        for (int j = this.components.size() - 1; j >= 0; j--) {
            if (paramInt > i) {
                i += this.components.get(j).criticals;
                if (paramInt <= i) {
                    if (this.components.get(j).is_locked) {
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
            if (!this.components.get(i).is_locked) {
                this.components.remove(i);
            }
        }
        Calculate_Criticals();
        Calculate_Hardpoints();
    }

    public void Calculate_Criticals() {
        this.current_criticals = 0;
        this.components.stream().forEach((localCrittable) -> {
            this.current_criticals += localCrittable.criticals;
        });
    }

    public void Calculate_Hardpoints() {
        for (int i = 0; i < 5; i++) {
            this.current_hardpoints[i] = 0;
        }
        this.components.stream().forEach((localCrittable) -> {
            for (int j = 0; j < 5; j++) {
                if (HardpointType.values()[j].equals(localCrittable.hardpoint_type)) {
                    this.current_hardpoints[j] += 1;
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