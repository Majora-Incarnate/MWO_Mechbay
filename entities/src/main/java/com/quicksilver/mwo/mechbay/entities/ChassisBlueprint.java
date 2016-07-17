package com.quicksilver.mwo.mechbay.entities;

public class ChassisBlueprint extends Blueprint {
    public final String chassis_name;
    public final boolean is_omnimech;
    public final double tonnage;
    public final MovementArchetype movement_archetype;
    public final String description;

    public ChassisBlueprint(final Builder builder) {
        super(builder);
        chassis_name = builder.chassis_name;
        is_omnimech = builder.is_omnimech;
        tonnage = builder.tonnage;
        movement_archetype = builder.movement_archetype;
        description = builder.description;
    }

    @Override
    public String toString() {
        return this.chassis_name;
    }
    
    public static class Builder extends Blueprint.Builder {
        public String chassis_name;
        public boolean is_omnimech;
        public double tonnage;
        public MovementArchetype movement_archetype;
        public String description;
        
        public ChassisBlueprint buildFromCSV(String line) {
            String[] arrayOfString = line.split(";");
            int i = 0;
            this.chassis_name = arrayOfString[(i++)];
            this.tech_base = TechBase.getEnum(arrayOfString[(i++)]);
            this.is_omnimech = Boolean.parseBoolean(arrayOfString[(i++)]);
            this.tonnage = Double.parseDouble(arrayOfString[(i++)]);
            this.movement_archetype = MovementArchetype.getEnum(arrayOfString[(i++)]);
            this.description = arrayOfString[(i++)];
            
            return build();
        }
        
        public ChassisBlueprint build() {
            return new ChassisBlueprint(this);
        }
        
        public static Builder create() {
            return new Builder();
        }
        
        private Builder() {
            super();
            chassis_name = description = "";
            is_omnimech = false;
            tonnage = 0.0;
            movement_archetype = MovementArchetype.UNKNOWN_MOVEMENT_ARCHETYPE;
        }
    }
}