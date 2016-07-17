package com.quicksilver.mwo.mechbay.entities;

public class SectionBlueprint extends Blueprint {
    public final String chassis;
    public final String model;
    public final SectionType section;
    public final int criticals;
    public final int[] hardpoints;
    public final int minimum_actuator_count;
    public final int maximum_actuator_count;
    public final String actuator_type;
    public final int minimum_jump_jet_modifier;
    public final int maximum_jump_jet_modifier;
    public final int hardwired_heatsinks;
    public final int hardwired_armor;
    public final int hardwired_structure;
    public final String[] quirks;

    public SectionBlueprint(final Builder builder) {
        super(builder);
        chassis = builder.chassis;
        model = builder.model;
        section = builder.section;
        criticals = builder.criticals;
        hardpoints = builder.hardpoints;
        minimum_actuator_count = builder.minimum_actuator_count;
        maximum_actuator_count = builder.maximum_actuator_count;
        actuator_type = builder.actuator_type;
        minimum_jump_jet_modifier = builder.minimum_jump_jet_modifier;
        maximum_jump_jet_modifier = builder.maximum_jump_jet_modifier;
        hardwired_heatsinks = builder.hardwired_heatsinks;
        hardwired_armor = builder.hardwired_armor;
        hardwired_structure = builder.hardwired_structure;
        quirks = builder.quirks;
    }

    @Override
    public String toString() {
        return this.model;
    }
    
    public static class Builder extends Blueprint.Builder {
        public String chassis;
        public String model;
        public SectionType section;
        public int criticals;
        public int[] hardpoints;
        public int minimum_actuator_count;
        public int maximum_actuator_count;
        public String actuator_type;
        public int minimum_jump_jet_modifier;
        public int maximum_jump_jet_modifier;
        public int hardwired_heatsinks;
        public int hardwired_armor;
        public int hardwired_structure;
        public String[] quirks;
        
        public SectionBlueprint buildFromCSV(String line) {
            String[] arrayOfString = line.split(";");
            int i = 0;
            this.chassis = arrayOfString[(i++)];
            this.model = arrayOfString[(i++)];
            this.section = SectionType.getEnum(arrayOfString[(i++)]);
            this.criticals = Integer.parseInt(arrayOfString[(i++)]);
            this.hardpoints = new int[5];
            for (int j = 0; j < 5; j++) {
                this.hardpoints[j] = Integer.parseInt(arrayOfString[(i++)]);
            }
            this.minimum_actuator_count = Integer.parseInt(arrayOfString[(i++)]);
            this.maximum_actuator_count = Integer.parseInt(arrayOfString[(i++)]);
            this.actuator_type = arrayOfString[(i++)];
            this.minimum_jump_jet_modifier = Integer.parseInt(arrayOfString[(i++)]);
            this.maximum_jump_jet_modifier = Integer.parseInt(arrayOfString[(i++)]);
            this.hardwired_heatsinks = Integer.parseInt(arrayOfString[(i++)]);
            this.hardwired_armor = Integer.parseInt(arrayOfString[(i++)]);
            this.hardwired_structure = Integer.parseInt(arrayOfString[(i++)]);
            this.quirks = arrayOfString[(i++)].split(",");
            
            return build();
        }
        
        public SectionBlueprint build() {
            return new SectionBlueprint(this);
        }
        
        public static Builder create() {
            return new Builder();
        }
        
        private Builder() {
            super();
            chassis = model = "";
            section = SectionType.UNKNOWN;
            criticals = minimum_actuator_count = maximum_actuator_count = minimum_jump_jet_modifier = maximum_jump_jet_modifier = hardwired_heatsinks = hardwired_armor = hardwired_structure = 0;
            hardpoints = new int[0];
            quirks = new String[0];
        }
    }
}