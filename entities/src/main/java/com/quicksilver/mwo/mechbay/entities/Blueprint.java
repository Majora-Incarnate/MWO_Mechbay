package com.quicksilver.mwo.mechbay.entities;

public class Blueprint {
    public final String full_name;
    public final String name;
    public final String critical_name;
    public final TechBase tech_base;
    public final int id;
    
    protected Blueprint(final Builder builder) {
        full_name = builder.full_name;
        name = builder.name;
        critical_name = builder.critical_name;
        tech_base = builder.tech_base;
        id = builder.id;
    }

    public Crittable Get_Crittable() {
        return null;
    }

    @Override
    public String toString() {
        return this.name;
    }
    
    public static class Builder {
        public String full_name;
        public String name;
        public String critical_name;
        public TechBase tech_base;
        public int id;
        
        public static Builder create() {
            return new Builder();
        }
        
        protected Builder() {
            full_name = name = critical_name = "";
            id = -1;
            tech_base = TechBase.UNKNOWN;
        }
    }
}