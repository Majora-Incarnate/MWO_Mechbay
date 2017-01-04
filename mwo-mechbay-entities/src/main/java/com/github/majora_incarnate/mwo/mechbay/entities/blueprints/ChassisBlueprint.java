package com.github.majora_incarnate.mwo.mechbay.entities.blueprints;

import com.github.majora_incarnate.mwo.mechbay.entities.enums.MotiveType;
import com.github.majora_incarnate.mwo.mechbay.entities.enums.MechType;
import com.github.majora_incarnate.mwo.mechbay.entities.enums.MovementArchetype;

public class ChassisBlueprint extends Blueprint {
    public MechType mechType;
    public MotiveType motiveType;
    public double tonnage;
    public MovementArchetype movementArchetype;
    public String description;
}