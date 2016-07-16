package com.quicksilver.mwo.mechbay.utility;

public class Crittable {
    public boolean is_locked;
    public int position;
    public String name;
    public String item_type;
    public HardpointType hardpoint_type;
    public int id;
    public int criticals;
    public double tonnage;
    public Object reference;

    @Override
    public String toString() {
        return this.name;
    }
}