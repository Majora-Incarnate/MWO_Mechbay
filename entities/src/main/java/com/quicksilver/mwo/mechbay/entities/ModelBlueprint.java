package com.quicksilver.mwo.mechbay.entities;

public class ModelBlueprint extends Blueprint {
    public final String chassis_name;
    public final String model_name;
    public final boolean unconfirmed;
    public final boolean unreleased;
    public final boolean champion_model;
    public final boolean hero_model;
    public final long cbill_cost;
    public final int mc_cost;
    public final double acceleration;
    public final double deceleration;
    public final double turn_rate;
    public final double[][] movement_ranges;
    public final double[][] movement_speeds;
    public final int max_engine_rating;
    public final int min_engine_rating;
    public final int mech_modules;
    public final int weapon_modules;
    public final int consumable_modules;
    public final String[] section_models;
    public final String engine_type;
    public final int engine_rating;
    public final String armor_type;
    public final String structure_type;
    public final String gyro_type;
    public final String heatsink_type;
    public final int heatsink_count;
    public final String cockpit_type;
    public final String jumpjet_type;
    public final String myomer_type;

    public ModelBlueprint(final Builder builder) {
        super(builder);
        chassis_name = builder.chassis_name;
        model_name = builder.model_name;
        unconfirmed = builder.unconfirmed;
        unreleased = builder.unreleased;
        champion_model = builder.champion_model;
        hero_model = builder.hero_model;
        cbill_cost = builder.cbill_cost;
        mc_cost = builder.mc_cost;
        acceleration = builder.acceleration;
        deceleration = builder.deceleration;
        turn_rate = builder.turn_rate;
        movement_ranges = builder.movement_ranges;
        movement_speeds = builder.movement_speeds;
        max_engine_rating = builder.max_engine_rating;
        min_engine_rating = builder.min_engine_rating;
        mech_modules = builder.mech_modules;
        weapon_modules = builder.weapon_modules;
        consumable_modules = builder.consumable_modules;
        section_models = builder.section_models;
        engine_type = builder.engine_type;
        engine_rating = builder.engine_rating;
        armor_type = builder.armor_type;
        structure_type = builder.structure_type;
        gyro_type = builder.gyro_type;
        heatsink_type = builder.heatsink_type;
        heatsink_count = builder.heatsink_count;
        cockpit_type = builder.cockpit_type;
        jumpjet_type = builder.jumpjet_type;
        myomer_type = builder.myomer_type;
    }

    @Override
    public String toString() {
        return this.model_name;
    }
    
    public static class Builder extends Blueprint.Builder {
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
        
        public ModelBlueprint buildFromCSV(String line) {
            String[] arrayOfString = line.split(";");
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
            
            return build();
        }
        
        public ModelBlueprint build() {
            return new ModelBlueprint(this);
        }
        
        public static Builder create() {
            return new Builder();
        }
        
        private Builder() {
            super();
            chassis_name = model_name = engine_type = armor_type = structure_type = heatsink_type = gyro_type = cockpit_type = jumpjet_type = myomer_type = "";
            unconfirmed = unreleased = champion_model = hero_model = false;
            cbill_cost = 0L;
            mc_cost = max_engine_rating = min_engine_rating = mech_modules = weapon_modules = consumable_modules = engine_rating = heatsink_count = 0;
            acceleration = deceleration = turn_rate = 0.0;
            movement_ranges = new double[0][0];
            movement_speeds = new double[0][0];
            section_models = new String[0];
        }
    }
}