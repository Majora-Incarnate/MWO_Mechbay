package com.github.majora_incarnate.mwo_mechbay.entities;

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang.builder.ToStringBuilder;

public class ModelBlueprint extends Blueprint {
    public String modelName;
    public String chassisName;
    public boolean isUnconfirmed;
    public boolean isUnreleased;
    public boolean isChampionModel;
    public boolean isHeroModel;
    public long cbillCost;
    public int mcCost;
    public double acceleration;
    public double deceleration;
    public double turnRate;
    public Map<String, Map<String, Double>> movementRanges;
    public Map<String, Map<String, Double>> movementSpeeds;
    public int minEngineRating;
    public int maxEngineRating;
    public int mechModules;
    public int weaponModules;
    public int consumableModules;
    public Map<SectionType, String> sectionModels;
    public String engineType;
    public int engineRating;
    public String armorType;
    public String structureType;
    public String gyroType;
    public String heatsinkType;
    public int heatsinkCount;
    public String cockpitType;
    public String jumpjetType;
    public String myomerType;
    
    public ModelBlueprint() {
        movementRanges = new HashMap<>();
        movementSpeeds = new HashMap<>();
        sectionModels = new HashMap<>();
    }
}