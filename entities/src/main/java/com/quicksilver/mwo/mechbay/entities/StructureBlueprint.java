package com.quicksilver.mwo.mechbay.entities;

public class StructureBlueprint extends Blueprint {
    public final double tonnage_modifier;
    public final double health_modifier;
    public final int criticals;
    public final double cost_modifier;
    public final double upgrade_modifier;

    public StructureBlueprint(final Builder builder) {
        super(builder);
        criticals = builder.criticals;
        tonnage_modifier = builder.tonnage_modifier;
        health_modifier = builder.health_modifier;
        cost_modifier = builder.cost_modifier;
        upgrade_modifier = builder.upgrade_modifier;
    }

    public int getLocationHealth(double tonnage, int section_index, int quirk_modifier) {
        return (int) (this.health_modifier * Constants.INTERNALS_PER_SECTION[(int)(tonnage / 5.0)][section_index]) + quirk_modifier;
    }

    public int getItemCost(double tonnage) {
        return (int) (this.cost_modifier * tonnage);
    }

    public int getUpgradeCost(double tonnage) {
        return (int) (this.upgrade_modifier * tonnage);
    }

    public double getTonnage(double tonnage) {
        return Math.ceil(tonnage * this.tonnage_modifier * 2.0D) * 0.5D;
    }

    @Override
    public Crittable Get_Crittable() {
        Crittable crittable = new Crittable();
        crittable.is_locked = false;
        crittable.name = this.name;
        crittable.item_type = "Structure";
        crittable.hardpoint_type = HardpointType.UNKNOWN_HARDPOINT_TYPE;
        crittable.criticals = 1;
        crittable.tonnage = 0.0D;
        crittable.position = -1;
        crittable.reference = this;
        return crittable;
    }
    
    public static class Builder extends Blueprint.Builder {
        public double tonnage_modifier;
        public double health_modifier;
        public int criticals;
        public double cost_modifier;
        public double upgrade_modifier;
        
        public StructureBlueprint buildFromCSV(String line) {
            String[] arrayOfString = line.split(";");
            int i = 0;
            this.name = arrayOfString[(i++)];
            this.id = Integer.parseInt(arrayOfString[(i++)]);
            this.tech_base = TechBase.getEnum(arrayOfString[(i++)]);
            this.criticals = Integer.parseInt(arrayOfString[(i++)]);
            this.tonnage_modifier = Double.parseDouble(arrayOfString[(i++)]);
            this.health_modifier = Double.parseDouble(arrayOfString[(i++)]);
            this.cost_modifier = Double.parseDouble(arrayOfString[(i++)]);
            this.upgrade_modifier = Double.parseDouble(arrayOfString[(i++)]);
            
            return build();
        }
        
        public StructureBlueprint build() {
            return new StructureBlueprint(this);
        }
        
        public static Builder create() {
            return new Builder();
        }
        
        protected Builder() {
            super();
            tonnage_modifier = health_modifier = cost_modifier = upgrade_modifier = 0.0;
            criticals = 0;
        }
    }
}