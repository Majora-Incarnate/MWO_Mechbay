package com.github.majora_incarnate.mwo_mechbay.entities;

public class ChassisBlueprint extends Blueprint {
    public String chassis;
    public boolean isOmnimech;
    public double tonnage;
    public MovementArchetype movementArchetype;
    public String description;

    @Override
    public String toString() {
        return this.chassis;
    }
}
