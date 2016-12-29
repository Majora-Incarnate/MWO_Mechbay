package com.github.majora_incarnate.mwo_mechbay.entities;

public class CockpitBlueprint extends Blueprint {
    public double tonnage;
    public int criticals;
    public int item_cost;
    public int upgrade_cost;

    public int Get_Item_Cost() {
        return this.item_cost;
    }

    public int Get_Upgrade_Cost() {
        return this.upgrade_cost;
    }

    public void Print() {
    }

    @Override
    public Crittable Get_Crittable() {
        Crittable localCrittable = new Crittable();
        localCrittable.is_locked = true;
        localCrittable.name = this.name;
        localCrittable.item_type = "Cockpit";
        localCrittable.hardpoint_type = HardpointType.UNKNOWN_HARDPOINT_TYPE;
        localCrittable.criticals = this.criticals;
        localCrittable.tonnage = 0.0D;
        localCrittable.position = -1;
        localCrittable.reference = this;
        return localCrittable;
    }
}