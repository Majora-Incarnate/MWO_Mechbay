package com.quicksilver.mwo.mechbay.entities;

public class AmmoBlueprint extends Blueprint {
    public final int health;
    public final int criticals;
    public final String type;
    public final double damage;
    public final double tonnage;
    public final int ammo_count;
    public final boolean artemis_capable;
    public final boolean apollo_capable;

    public AmmoBlueprint(final Builder builder) {
        super(builder);
        health = builder.health;
        criticals = builder.criticals;
        type = builder.type;
        damage = builder.damage;
        tonnage = builder.tonnage;
        ammo_count = builder.ammo_count;
        artemis_capable = builder.artemis_capable;
        apollo_capable = builder.apollo_capable;
    }

    @Override
    public Crittable Get_Crittable() {
        Crittable localCrittable = new Crittable();
        localCrittable.is_locked = false;
        localCrittable.name = this.name;
        localCrittable.item_type = "Ammo";
        localCrittable.hardpoint_type = HardpointType.UNKNOWN_HARDPOINT_TYPE;
        localCrittable.criticals = this.criticals;
        localCrittable.tonnage = this.tonnage;
        localCrittable.position = -1;
        localCrittable.reference = this;
        return localCrittable;
    }
    
    public static class Builder extends Blueprint.Builder {
        public int health;
        public int criticals;
        public String type;
        public double damage;
        public double tonnage;
        public int ammo_count;
        public boolean artemis_capable;
        public boolean apollo_capable;
        
        public AmmoBlueprint buildFromCSV(String line) {
            String[] arrayOfString = line.split(";");
            int i = 0;
            this.name = arrayOfString[(i++)];
            this.id = Integer.parseInt(arrayOfString[(i++)]);
            this.tech_base = TechBase.getEnum(arrayOfString[(i++)]);
            this.artemis_capable = Boolean.parseBoolean(arrayOfString[(i++)]);
            this.apollo_capable = Boolean.parseBoolean(arrayOfString[(i++)]);
            this.health = Integer.parseInt(arrayOfString[(i++)]);
            this.criticals = Integer.parseInt(arrayOfString[(i++)]);
            this.tonnage = Double.parseDouble(arrayOfString[(i++)]);
            this.type = arrayOfString[(i++)];
            this.ammo_count = Integer.parseInt(arrayOfString[(i++)]);
            this.damage = Double.parseDouble(arrayOfString[i]);
            
            return build();
        }
        
        public AmmoBlueprint build() {
            return new AmmoBlueprint(this);
        }
        
        public static Builder create() {
            return new Builder();
        }
        
        private Builder() {
            super();
            type = "";
            damage = tonnage = 0.0;
            ammo_count = criticals = health = 0;
            artemis_capable = apollo_capable = false;
        }
    }
}