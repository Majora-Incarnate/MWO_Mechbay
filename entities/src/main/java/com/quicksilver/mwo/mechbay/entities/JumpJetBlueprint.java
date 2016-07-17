package com.quicksilver.mwo.mechbay.entities;

public class JumpJetBlueprint extends Blueprint {
    public final double tonnage_modifier;
    public final int criticals;
    public final double horizontal_distance;
    public final double vertical_distance;
    public final double cost_modifier;
    public final int upgrade_cost;

    public JumpJetBlueprint(final Builder builder) {
        super(builder);
        tonnage_modifier = builder.tonnage_modifier;
        criticals = builder.criticals;
        horizontal_distance = builder.horizontal_distance;
        vertical_distance = builder.vertical_distance;
        cost_modifier = builder.cost_modifier;
        upgrade_cost = builder.upgrade_cost;
    }

    public int Get_Item_Cost(double paramDouble) {
        return (int) (this.cost_modifier * 44000.0D);
    }

    public int Get_Upgrade_Cost(double paramDouble) {
        return this.upgrade_cost;
    }

    public String Get_JJ_Class(double paramDouble) {
        if (paramDouble > 85.0D) {
            return " Class I";
        }
        if (paramDouble > 75.0D) {
            return " Class II";
        }
        if (paramDouble > 55.0D) {
            return " Class III";
        }
        if (paramDouble > 35.0D) {
            return " Class IV";
        }
        return " Class V";
    }

    public double Get_Base_Tonnage(double paramDouble) {
        if (paramDouble > 85.0D) {
            return 2.0D;
        }
        if (paramDouble > 55.0D) {
            return 1.0D;
        }
        return 0.5D;
    }

    public Crittable Get_Crittable(double paramDouble) {
        Crittable localCrittable = new Crittable();
        localCrittable.is_locked = false;
        localCrittable.name = (this.name + Get_JJ_Class(paramDouble));
        localCrittable.item_type = "Jump Jet";
        localCrittable.hardpoint_type = HardpointType.UNKNOWN_HARDPOINT_TYPE;
        localCrittable.criticals = this.criticals;
        localCrittable.tonnage = (Get_Base_Tonnage(paramDouble) * this.tonnage_modifier);
        localCrittable.position = -1;
        localCrittable.reference = this;
        return localCrittable;
    }
    
    public static class Builder extends Blueprint.Builder {
        public double tonnage_modifier;
        public int criticals;
        public double horizontal_distance;
        public double vertical_distance;
        public double cost_modifier;
        public int upgrade_cost;
        
        public JumpJetBlueprint buildFromCSV(String line) {
            String[] arrayOfString = line.split(";");
            int i = 0;
            this.name = arrayOfString[(i++)];
            this.id = Integer.parseInt(arrayOfString[(i++)]);
            this.tech_base = TechBase.getEnum(arrayOfString[(i++)]);
            this.tonnage_modifier = Double.parseDouble(arrayOfString[(i++)]);
            this.criticals = Integer.parseInt(arrayOfString[(i++)]);
            this.horizontal_distance = Double.parseDouble(arrayOfString[(i++)]);
            this.vertical_distance = Double.parseDouble(arrayOfString[(i++)]);
            this.cost_modifier = Double.parseDouble(arrayOfString[(i++)]);
            this.upgrade_cost = Integer.parseInt(arrayOfString[(i++)]);
            
            return build();
        }
        
        public JumpJetBlueprint build() {
            return new JumpJetBlueprint(this);
        }
        
        public static Builder create() {
            return new Builder();
        }
        
        private Builder() {
            super();
            tonnage_modifier = horizontal_distance = vertical_distance = cost_modifier = 0.0;
            criticals = upgrade_cost = 0;
        }
    }
}