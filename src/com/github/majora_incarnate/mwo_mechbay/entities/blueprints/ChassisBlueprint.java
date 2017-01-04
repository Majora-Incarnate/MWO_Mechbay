package com.github.majora_incarnate.mwo_mechbay.entities.blueprints;

import com.github.majora_incarnate.mwo_mechbay.entities.MechType;
import com.github.majora_incarnate.mwo_mechbay.entities.MotiveType;
import com.github.majora_incarnate.mwo_mechbay.entities.MovementArchetype;

public class ChassisBlueprint extends Blueprint {
    public MechType mechType;
    public MotiveType motiveType;
    public double tonnage;
    public MovementArchetype movementArchetype;
    public String description;
}