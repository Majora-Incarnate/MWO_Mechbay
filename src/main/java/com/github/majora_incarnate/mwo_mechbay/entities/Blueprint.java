package com.github.majora_incarnate.mwo_mechbay.entities;

public class Blueprint {
    public String name;
    public TechBase techBase;
    public int id;

    public Crittable Get_Crittable() {
        return null;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
