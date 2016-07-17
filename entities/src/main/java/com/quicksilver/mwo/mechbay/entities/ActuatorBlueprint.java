package com.quicksilver.mwo.mechbay.entities;

public class ActuatorBlueprint extends Blueprint {
    public final String type;
    public final int index;

    public ActuatorBlueprint(final Builder builder) {
        super(builder);
        type = builder.type;
        index = builder.index;
    }

    @Override
    public Crittable Get_Crittable() {
        Crittable localCrittable = new Crittable();
        localCrittable.is_locked = true;
        localCrittable.name = this.name;
        localCrittable.item_type = "Actuator";
        localCrittable.hardpoint_type = HardpointType.UNKNOWN_HARDPOINT_TYPE;
        localCrittable.criticals = 1;
        localCrittable.tonnage = 0.0D;
        localCrittable.position = -1;
        localCrittable.reference = this;
        return localCrittable;
    }
    
    public static class Builder extends Blueprint.Builder {
        public String type;
        public int index;
        
        public ActuatorBlueprint buildFromCSV(String line) {
            String[] arrayOfString = line.split(";");
            int i = 0;
            this.name = this.full_name = this.critical_name = arrayOfString[i++];
            this.id = Integer.parseInt(arrayOfString[i++]);
            this.type = arrayOfString[i++];
            this.index = Integer.parseInt(arrayOfString[i]);
            this.tech_base = TechBase.UNIVERSAL;
            
            return build();
        }
        
        public ActuatorBlueprint build() {
            return new ActuatorBlueprint(this);
        }
        
        public static Builder create() {
            return new Builder();
        }
        
        protected Builder() {
            super();
            type = "";
            index = -1;
        }
    }
}