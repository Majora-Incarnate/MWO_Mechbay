package com.github.majora_incarnate.mwo_mechbay.entities;

public class CockpitBlueprint extends Blueprint {
    public double tonnage;
    public int criticals;
    public int itemCost;
    public int upgradeCost;

    public int Get_Item_Cost() {
        return this.itemCost;
    }

    public int Get_Upgrade_Cost() {
        return this.upgradeCost;
    }

    public void Print() {
    }

    @Override
    public Crittable Get_Crittable() {
        Crittable localCrittable = new Crittable();
        localCrittable.isLocked = true;
        localCrittable.name = this.name;
        localCrittable.itemType = "Cockpit";
        localCrittable.hardpointType = HardpointType.UNKNOWN;
        localCrittable.criticals = this.criticals;
        localCrittable.tonnage = 0.0D;
        localCrittable.position = -1;
        localCrittable.reference = this;
        return localCrittable;
    }
}
