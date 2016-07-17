package com.quicksilver.mwo.mechbay.entities;

public class ArmorBlueprint extends Blueprint {
    public final int criticals;
    public final double points_per_ton;
    public final double armor_per_point;
    public final double cost_per_ton;
    public final double upgrade_modifier;

    public ArmorBlueprint(final Builder builder) {
        super(builder);
        criticals = builder.criticals;
        points_per_ton = builder.points_per_ton;
        armor_per_point = builder.armor_per_point;
        cost_per_ton = builder.cost_per_ton;
        upgrade_modifier = builder.upgrade_modifier;
    }

    public int Get_Item_Cost(int paramInt) {
        return (int) (this.cost_per_ton * Math.ceil(paramInt / this.points_per_ton));
    }

    public int Get_Upgrade_Cost(double paramDouble) {
        return (int) (this.upgrade_modifier * paramDouble);
    }

    public double Get_Tonnage(int paramInt) {
        return paramInt / this.points_per_ton;
    }

    @Override
    public Crittable Get_Crittable() {
        Crittable localCrittable = new Crittable();
        localCrittable.is_locked = false;
        localCrittable.name = this.name;
        localCrittable.item_type = "Armor";
        localCrittable.hardpoint_type = HardpointType.UNKNOWN_HARDPOINT_TYPE;
        localCrittable.criticals = 1;
        localCrittable.tonnage = 0.0D;
        localCrittable.position = -1;
        localCrittable.reference = this;
        return localCrittable;
    }
    
    public static class Builder extends Blueprint.Builder {
        public int criticals;
        public double points_per_ton;
        public double armor_per_point;
        public double cost_per_ton;
        public double upgrade_modifier;
        
        public ArmorBlueprint buildFromCSV(String line) {
            String[] arrayOfString = line.split(";");
            int i = 0;
            this.name = arrayOfString[(i++)];
            this.id = Integer.parseInt(arrayOfString[(i++)]);
            this.tech_base = TechBase.getEnum(arrayOfString[(i++)]);
            this.criticals = Integer.parseInt(arrayOfString[(i++)]);
            this.points_per_ton = Double.parseDouble(arrayOfString[(i++)]);
            this.armor_per_point = Double.parseDouble(arrayOfString[(i++)]);
            this.cost_per_ton = Double.parseDouble(arrayOfString[(i++)]);
            this.upgrade_modifier = Double.parseDouble(arrayOfString[(i++)]);
            
            return build();
        }
        
        public ArmorBlueprint build() {
            return new ArmorBlueprint(this);
        }
        
        public static Builder create() {
            return new Builder();
        }
        
        private Builder() {
            super();
            points_per_ton = armor_per_point = cost_per_ton = upgrade_modifier = 0.0;
            criticals = 0;
        }
    }
}