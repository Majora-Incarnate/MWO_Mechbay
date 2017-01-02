package com.github.majora_incarnate.mwo_mechbay.entities;

public class ActuatorBlueprint extends Blueprint {
    public SectionClass section;
    public int index;

    @Override
    public Crittable Get_Crittable() {
        Crittable localCrittable = new Crittable();
        localCrittable.isLocked = true;
        localCrittable.name = this.name;
        localCrittable.itemType = "Actuator";
        localCrittable.hardpointType = HardpointType.UNKNOWN;
        localCrittable.criticals = 1;
        localCrittable.tonnage = 0.0D;
        localCrittable.position = -1;
        localCrittable.reference = this;
        return localCrittable;
    }
}
