package com.github.majora_incarnate.mwo_mechbay.entities;

public class ModelBlueprint extends Blueprint {
    public String chassis_name;
    public String model_name;
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

    @Override
    public String toString() {
        return this.model_name;
    }
}