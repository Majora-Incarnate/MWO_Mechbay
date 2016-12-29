package com.github.majora_incarnate.mwo_mechbay.entities;

public class GyroBlueprint extends Blueprint {
    public double tonnage_modifier;
    public int criticals;
    public int item_modifier;
    public int upgrade_cost;

    public int Get_Item_Cost(int paramInt) {
        return this.item_modifier * ((paramInt + 95) / 100);
    }

    public int Get_Upgrade_Cost(int paramInt) {
        return this.upgrade_cost;
    }

    public double Get_Tonnage(int paramInt) {
        return (paramInt + 95) / 100 * this.tonnage_modifier;
    }

    @Override
    public Crittable Get_Crittable() {
        Crittable localCrittable = new Crittable();
        localCrittable.is_locked = true;
        localCrittable.name = this.name;
        localCrittable.item_type = "Gyro";
        localCrittable.hardpoint_type = HardpointType.UNKNOWN_HARDPOINT_TYPE;
        localCrittable.criticals = this.criticals;
        localCrittable.tonnage = 0.0D;
        localCrittable.position = -1;
        localCrittable.reference = this;
        return localCrittable;
    }
}