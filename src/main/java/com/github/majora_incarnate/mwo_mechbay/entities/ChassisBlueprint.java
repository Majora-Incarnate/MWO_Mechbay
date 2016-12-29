package com.github.majora_incarnate.mwo_mechbay.entities;

public class ChassisBlueprint extends Blueprint {
    public String chassis;
    public boolean is_omnimech;
    public double tonnage;
    public MovementArchetype movement_archetype;
    public String description;

    @Override
    public String toString() {
        return this.chassis;
    }
}