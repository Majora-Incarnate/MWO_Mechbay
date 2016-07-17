package com.quicksilver.mwo.mechbay.entities;

public class FireControlBlueprint extends Blueprint {
    public final double spread_modifier;
    public final int criticals_modifier;
    public final double tonnage_modifier;
    public final double cost_modifier;
    public final int upgrade_cost;

    public FireControlBlueprint(final Builder builder) {
        super(builder);
        spread_modifier = builder.spread_modifier;
        criticals_modifier = builder.criticals_modifier;
        tonnage_modifier = builder.tonnage_modifier;
        cost_modifier = builder.cost_modifier;
        upgrade_cost = builder.upgrade_cost;
    }
    
    public static class Builder extends Blueprint.Builder {
        public double spread_modifier;
        public int criticals_modifier;
        public double tonnage_modifier;
        public double cost_modifier;
        public int upgrade_cost;
        
        public FireControlBlueprint buildFromCSV(String line) {
            String[] arrayOfString = line.split(";");
            int i = 0;
            this.name = arrayOfString[(i++)];
            this.id = Integer.parseInt(arrayOfString[(i++)]);
            this.tech_base = TechBase.getEnum(arrayOfString[(i++)]);
            this.criticals_modifier = Integer.parseInt(arrayOfString[(i++)]);
            this.tonnage_modifier = Double.parseDouble(arrayOfString[(i++)]);
            this.spread_modifier = Double.parseDouble(arrayOfString[(i++)]);
            this.cost_modifier = Double.parseDouble(arrayOfString[(i++)]);
            this.upgrade_cost = Integer.parseInt(arrayOfString[(i++)]);
            
            return build();
        }
        
        public FireControlBlueprint build() {
            return new FireControlBlueprint(this);
        }
        
        public static Builder create() {
            return new Builder();
        }
        
        private Builder() {
            super();
            spread_modifier = tonnage_modifier = cost_modifier = 0.0;
            criticals_modifier = upgrade_cost = 0;
        }
    }
}