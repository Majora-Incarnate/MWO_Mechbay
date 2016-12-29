package com.github.majora_incarnate.mwo_mechbay.entities;

public class ArmorBlueprint extends Blueprint {
    public int criticals;
    public double points_per_ton;
    public double cost_per_ton;
    public double upgrade_modifier;

    public int Get_Item_Cost(int paramInt) {
        return (int) (this.cost_per_ton * Math.ceil(paramInt / this.points_per_ton));
    }

    public int Get_Upgrade_Cost(double paramDouble) {
        return (int) (this.upgrade_modifier * paramDouble);
    }

    public double Get_Tonnage(int paramInt) {
        return paramInt / this.points_per_ton;
    }

    @Override
    public Crittable Get_Crittable() {
        Crittable localCrittable = new Crittable();
        localCrittable.is_locked = false;
        localCrittable.name = this.name;
        localCrittable.item_type = "Armor";
        localCrittable.hardpoint_type = HardpointType.UNKNOWN_HARDPOINT_TYPE;
        localCrittable.criticals = 1;
        localCrittable.tonnage = 0.0D;
        localCrittable.position = -1;
        localCrittable.reference = this;
        return localCrittable;
    }
}