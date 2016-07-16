package com.quicksilver.mwo.mechbay.utility;

public class SectionBlueprint extends Blueprint {
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

    public SectionBlueprint(String paramString) {
        String[] arrayOfString = paramString.split(";");
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
    }

    @Override
    public String toString() {
        return this.model;
    }
}