package com.quicksilver.mwo.mechbay.entities;

public class EquipmentBlueprint extends Blueprint {
    public final HardpointType hardpoint_type;
    public final double tonnage;
    public final int criticals;

    public EquipmentBlueprint(final Builder builder) {
        super(builder);
        hardpoint_type = builder.hardpoint_type;
        tonnage = builder.tonnage;
        criticals = builder.criticals;
    }

    @Override
    public Crittable Get_Crittable() {
        Crittable localCrittable = new Crittable();
        localCrittable.is_locked = false;
        localCrittable.name = this.name;
        localCrittable.item_type = "Equipment";
        localCrittable.hardpoint_type = HardpointType.UNKNOWN_HARDPOINT_TYPE;
        localCrittable.criticals = this.criticals;
        localCrittable.tonnage = this.tonnage;
        localCrittable.position = -1;
        localCrittable.reference = this;
        return localCrittable;
    }
    
    public static class Builder extends Blueprint.Builder {
        public HardpointType hardpoint_type;
        public double tonnage;
        public int criticals;
        
        public EquipmentBlueprint buildFromCSV(String line) {
            String[] arrayOfString = line.split(";");
            int i = 0;
            this.name = arrayOfString[(i++)];
            this.id = Integer.parseInt(arrayOfString[(i++)]);
            this.tech_base = TechBase.getEnum(arrayOfString[(i++)]);
            this.hardpoint_type = HardpointType.getEnum(arrayOfString[(i++)]);
            this.tonnage = Double.parseDouble(arrayOfString[(i++)]);
            this.criticals = Integer.parseInt(arrayOfString[(i++)]);
            
            return build();
        }
        
        public EquipmentBlueprint build() {
            return new EquipmentBlueprint(this);
        }
        
        public static Builder create() {
            return new Builder();
        }
        
        private Builder() {
            super();
            tonnage = 0.0;
            criticals = 0;
            hardpoint_type = HardpointType.UNKNOWN_HARDPOINT_TYPE;
        }
    }
}