package com.github.majora_incarnate.mwo_mechbay.entities;

import org.apache.commons.lang.builder.ToStringBuilder;

public class ChassisBlueprint extends Blueprint {
    public MechType mechType;
    public MotiveType motiveType;
    public double tonnage;
    public MovementArchetype movementArchetype;
    public String description;
}