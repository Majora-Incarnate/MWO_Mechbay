package com.github.majora_incarnate.mwo_mechbay.entities;

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
    public Map<String, Map<String, double>> movementRanges;
    public Map<String, Map<String, double>> movementSpeeds;
    public int minEngineRating;
    public int maxEngineRating;
    public int mechModules;
    public int weapoModules;
    public int consumablModules;
    public Map<String, String> sectionModels;
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
}