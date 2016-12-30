package com.github.majora_incarnate.mwo_mechbay.entities;

public class MyomerBlueprint extends Blueprint {
    @Override
    public Crittable Get_Crittable() {
        Crittable localCrittable = new Crittable();
        localCrittable.isLocked = true;
        localCrittable.name = this.name;
        localCrittable.itemType = "Myomer";
        localCrittable.hardpointType = HardpointType.UNKNOWN_HARDPOINT_TYPE;
        localCrittable.criticals = 1;
        localCrittable.tonnage = 0.0D;
        localCrittable.position = -1;
        localCrittable.reference = this;
        return localCrittable;
    }
}