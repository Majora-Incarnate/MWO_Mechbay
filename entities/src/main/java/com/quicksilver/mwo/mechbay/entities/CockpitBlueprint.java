package com.quicksilver.mwo.mechbay.entities;

public class CockpitBlueprint extends Blueprint {
    public final double tonnage;
    public final int criticals;
    public final int item_cost;
    public final int upgrade_cost;

    public CockpitBlueprint(final Builder builder) {
        super(builder);
        tonnage = builder.tonnage;
        criticals = builder.criticals;
        item_cost = builder.item_cost;
        upgrade_cost = builder.upgrade_cost;
    }

    public int Get_Item_Cost() {
        return this.item_cost;
    }

    public int Get_Upgrade_Cost() {
        return this.upgrade_cost;
    }

    public void Print() {
    }

    @Override
    public Crittable Get_Crittable() {
        Crittable localCrittable = new Crittable();
        localCrittable.is_locked = true;
        localCrittable.name = this.name;
        localCrittable.item_type = "Cockpit";
        localCrittable.hardpoint_type = HardpointType.UNKNOWN_HARDPOINT_TYPE;
        localCrittable.criticals = this.criticals;
        localCrittable.tonnage = 0.0D;
        localCrittable.position = -1;
        localCrittable.reference = this;
        return localCrittable;
    }
    
    public static class Builder extends Blueprint.Builder {
        public double tonnage;
        public int criticals;
        public int item_cost;
        public int upgrade_cost;
        
        public CockpitBlueprint buildFromCSV(String line) {
            String[] arrayOfString = line.split(";");
            int i = 0;
            this.name = arrayOfString[(i++)];
            this.id = Integer.parseInt(arrayOfString[(i++)]);
            this.tech_base = TechBase.getEnum(arrayOfString[(i++)]);
            this.tonnage = Double.parseDouble(arrayOfString[(i++)]);
            this.criticals = Integer.parseInt(arrayOfString[(i++)]);
            this.item_cost = Integer.parseInt(arrayOfString[(i++)]);
            this.upgrade_cost = Integer.parseInt(arrayOfString[(i++)]);
            
            return build();
        }
        
        public CockpitBlueprint build() {
            return new CockpitBlueprint(this);
        }
        
        public static Builder create() {
            return new Builder();
        }
        
        private Builder() {
            super();
            tonnage = 0.0;
            criticals = item_cost = upgrade_cost = 0;
        }
    }
}