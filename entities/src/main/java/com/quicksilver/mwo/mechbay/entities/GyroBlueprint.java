package com.quicksilver.mwo.mechbay.entities;

public class GyroBlueprint extends Blueprint {
    public final double tonnage_modifier;
    public final int criticals;
    public final int item_modifier;
    public final int upgrade_cost;

    public GyroBlueprint(final Builder builder) {
        super(builder);
        tonnage_modifier = builder.tonnage_modifier;
        criticals = builder.criticals;
        item_modifier = builder.item_modifier;
        upgrade_cost = builder.upgrade_cost;
    }

    public int Get_Item_Cost(int paramInt) {
        return this.item_modifier * ((paramInt + 95) / 100);
    }

    public int Get_Upgrade_Cost(int paramInt) {
        return this.upgrade_cost;
    }

    public double Get_Tonnage(int paramInt) {
        return (paramInt + 95) / 100 * this.tonnage_modifier;
    }

    @Override
    public Crittable Get_Crittable() {
        Crittable localCrittable = new Crittable();
        localCrittable.is_locked = true;
        localCrittable.name = this.name;
        localCrittable.item_type = "Gyro";
        localCrittable.hardpoint_type = HardpointType.UNKNOWN_HARDPOINT_TYPE;
        localCrittable.criticals = this.criticals;
        localCrittable.tonnage = 0.0D;
        localCrittable.position = -1;
        localCrittable.reference = this;
        return localCrittable;
    }
    
    public static class Builder extends Blueprint.Builder {
        public double tonnage_modifier;
        public int criticals;
        public int item_modifier;
        public int upgrade_cost;
        
        public GyroBlueprint buildFromCSV(String line) {
            String[] arrayOfString = line.split(";");
            int i = 0;
            this.name = arrayOfString[(i++)];
            this.id = Integer.parseInt(arrayOfString[(i++)]);
            this.tech_base = TechBase.getEnum(arrayOfString[(i++)]);
            this.criticals = Integer.parseInt(arrayOfString[(i++)]);
            this.tonnage_modifier = Double.parseDouble(arrayOfString[(i++)]);
            this.item_modifier = Integer.parseInt(arrayOfString[(i++)]);
            this.upgrade_cost = Integer.parseInt(arrayOfString[(i++)]);
            
            return build();
        }
        
        public GyroBlueprint build() {
            return new GyroBlueprint(this);
        }
        
        public static Builder create() {
            return new Builder();
        }
        
        private Builder() {
            super();
            tonnage_modifier = 0.0;
            criticals = item_modifier = upgrade_cost = 0;
        }
    }
}