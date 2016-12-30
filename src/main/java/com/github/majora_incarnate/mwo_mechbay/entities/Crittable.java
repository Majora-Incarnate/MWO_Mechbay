package com.github.majora_incarnate.mwo_mechbay.entities;

public class Crittable {
    public boolean isLocked;
    public int position;
    public String name;
    public String itemType;
    public HardpointType hardpointType;
    public int id;
    public int criticals;
    public double tonnage;
    public Object reference;

    @Override
    public String toString() {
        return this.name;
    }
}
