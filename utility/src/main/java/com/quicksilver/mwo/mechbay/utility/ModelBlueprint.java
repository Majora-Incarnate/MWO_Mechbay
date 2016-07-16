package com.quicksilver.mwo.mechbay.utility;

public class ModelBlueprint {
    public String chassis_name;
    public String model_name;
    public int id;
    public boolean unconfirmed;
    public boolean unreleased;
    public boolean champion_model;
    public boolean hero_model;
    public long cbill_cost;
    public int mc_cost;
    public double acceleration;
    public double deceleration;
    public double turn_rate;
    public double[][] movement_ranges;
    public double[][] movement_speeds;
    public int max_engine_rating;
    public int min_engine_rating;
    public int mech_modules;
    public int weapon_modules;
    public int consumable_modules;
    public String[] section_models;
    public String engine_type;
    public int engine_rating;
    public String armor_type;
    public String structure_type;
    public String gyro_type;
    public String heatsink_type;
    public int heatsink_count;
    public String cockpit_type;
    public String jumpjet_type;
    public String myomer_type;

    public ModelBlueprint(String paramString) {
        final String[] arrayOfString = paramString.split(";");
        int i = 0;
        
        this.chassis_name = arrayOfString[(i++)];
        this.id = Integer.parseInt(arrayOfString[(i++)]);
        this.model_name = arrayOfString[(i++)];
        this.unconfirmed = Boolean.parseBoolean(arrayOfString[(i++)]);
        this.unreleased = Boolean.parseBoolean(arrayOfString[(i++)]);
        this.champion_model = Boolean.parseBoolean(arrayOfString[(i++)]);
        this.hero_model = Boolean.parseBoolean(arrayOfString[(i++)]);
        this.cbill_cost = Long.parseLong(arrayOfString[(i++)]);
        this.acceleration = Double.parseDouble(arrayOfString[(i++)]);
        this.deceleration = Double.parseDouble(arrayOfString[(i++)]);
        this.turn_rate = Double.parseDouble(arrayOfString[(i++)]);
        this.movement_ranges = new double[2][2];
        this.movement_speeds = new double[2][2];
        
        for (int j = 0; j < 2; j++)
            for (int k = 0; k < 2; k++)
                this.movement_ranges[j][k] = Double.parseDouble(arrayOfString[(i++)]);
                
        this.max_engine_rating = Integer.parseInt(arrayOfString[(i++)]);
        this.min_engine_rating = Integer.parseInt(arrayOfString[(i++)]);
        this.mech_modules = Integer.parseInt(arrayOfString[(i++)]);
        this.weapon_modules = Integer.parseInt(arrayOfString[(i++)]);
        this.consumable_modules = Integer.parseInt(arrayOfString[(i++)]);
        this.section_models = new String[8];
        
        for (int j = 0; j < 8; j++)
            this.section_models[j] = arrayOfString[(i++)];
            
        this.engine_type = arrayOfString[(i++)];
        this.engine_rating = Integer.parseInt(arrayOfString[(i++)]);
        this.armor_type = arrayOfString[(i++)];
        this.structure_type = arrayOfString[(i++)];
        this.heatsink_type = arrayOfString[(i++)];
        this.heatsink_count = Integer.parseInt(arrayOfString[(i++)]);
        this.gyro_type = arrayOfString[(i++)];
        this.cockpit_type = arrayOfString[(i++)];
        this.jumpjet_type = arrayOfString[(i++)];
        this.myomer_type = arrayOfString[(i++)];
    }

    @Override
    public String toString() {
        return this.model_name;
    }
}