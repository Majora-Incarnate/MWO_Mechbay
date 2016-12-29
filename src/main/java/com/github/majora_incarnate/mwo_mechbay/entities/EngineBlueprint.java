package com.github.majora_incarnate.mwo_mechbay.entities;

public class EngineBlueprint extends Blueprint {
    public double tonnage_modifier;
    public int center_torso_criticals;
    public int side_torso_criticals;
    public double cost_modifier;
    public double heat_sink_cost_modifier;

    public int Get_Cost(int engineRating) {
        double d = engineRating * this.cost_modifier;
        
        if (engineRating < 250)
            d -= 0.0D * this.heat_sink_cost_modifier;
            
        return (int) d;
    }

    public int Get_Criticals() {
        return this.side_torso_criticals * 2 + this.center_torso_criticals;
    }

    public int Get_Heat_Sink_Capacity(int engineRating) {
        return engineRating / 25;
    }

    public double Get_Speed(double tonnage, int engineRating) {
        return engineRating * 16.2D / tonnage;
    }

    public boolean Has_Side_Torso_Criticals() {
        return this.side_torso_criticals > 0;
    }

    public double Get_Tonnage(int engineRating) {
        return Math.ceil(Constants.ENGINE_TONNAGES[(engineRating / 5)] * this.tonnage_modifier / 0.5D) * 0.5D;
    }

    @Override
    public Crittable Get_Crittable() {
        Crittable localCrittable = new Crittable();
        localCrittable.is_locked = true;
        localCrittable.name = this.name;
        localCrittable.item_type = "Engine";
        localCrittable.hardpoint_type = HardpointType.UNKNOWN_HARDPOINT_TYPE;
        localCrittable.criticals = this.center_torso_criticals;
        localCrittable.tonnage = 0.0D;
        localCrittable.position = -1;
        localCrittable.reference = this;
        return localCrittable;
    }

    public Crittable Get_Crittable(boolean isSideTorso) {
        if (!isSideTorso) {
            return null;
        }
        Crittable localCrittable = new Crittable();
        localCrittable.is_locked = true;
        localCrittable.name = this.name;
        localCrittable.item_type = "Engine";
        localCrittable.hardpoint_type = HardpointType.UNKNOWN_HARDPOINT_TYPE;
        localCrittable.criticals = this.side_torso_criticals;
        localCrittable.tonnage = 0.0D;
        localCrittable.position = -1;
        localCrittable.reference = this;
        return localCrittable;
    }
}