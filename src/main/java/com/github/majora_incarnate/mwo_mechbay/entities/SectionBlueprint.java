package com.github.majora_incarnate.mwo_mechbay.entities;

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

    @Override
    public String toString() {
        return this.model;
    }
}