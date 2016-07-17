package com.quicksilver.mwo.mechbay.entities;

public class MyomerBlueprint extends Blueprint {
    public MyomerBlueprint(final Builder builder) {
        super(builder);
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
        public MyomerBlueprint buildFromCSV(String line) {
            this.tech_base = TechBase.UNIVERSAL;

            return build();
        }

        public MyomerBlueprint build() {
            return new MyomerBlueprint(this);
        }

        public static Builder create() {
            return new Builder();
        }

        protected Builder() {
            full_name = name = critical_name = "";
            id = -1;
            tech_base = TechBase.UNIVERSAL;
        }
    }
}