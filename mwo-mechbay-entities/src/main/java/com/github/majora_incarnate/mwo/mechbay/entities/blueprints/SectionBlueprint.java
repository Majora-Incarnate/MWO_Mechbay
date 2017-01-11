package com.github.majora_incarnate.mwo.mechbay.entities.blueprints;

import java.util.HashMap;
import java.util.Map;

import com.github.majora_incarnate.mwo.mechbay.entities.enums.HardpointType;
import com.github.majora_incarnate.mwo.mechbay.entities.enums.SectionType;

public class SectionBlueprint extends Blueprint {
    public SectionType section;
    public Map<HardpointType, Integer> hardpoints;
    public int minimumActuatorCount;
    public int maximumActuatorCount;
    public int minimumJumpJetModifier;
    public int maximumJumpJetModifier;
    public int hardwiredHeatsinks;
    public int hardwiredArmor;
    public int hardwiredStructure;
    public Map<String, Double> quirks;
    
    public SectionBlueprint() {
        hardpoints = new HashMap<>();
        quirks = new HashMap<>();
    }
}