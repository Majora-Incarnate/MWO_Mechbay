package com.github.majora_incarnate.mwo_mechbay.entities;

public class HeatSinkBlueprint extends Blueprint {
    public double tonnage;
    public int criticals;
    public double engine_dissipation;
    public double normal_dissipation;
    public double threshold_boost;
    public int space_modifier;
    public int item_cost;
    public int upgrade_cost;

    public int Get_Item_Cost(int heatSinkCount, int engineRating) {
        if (engineRating < 250) {
            return this.item_cost * (heatSinkCount - (10 - engineRating / 250));
        }
        return this.item_cost * (heatSinkCount - 10);
    }

    public int Get_Upgrade_Cost() {
        return this.upgrade_cost;
    }

    public double Get_Tonnage(int heatSinkCount, int engineRating) {
        if (engineRating < 250) {
            return this.tonnage * (heatSinkCount - (10 - engineRating / 250));
        }
        return this.tonnage * (heatSinkCount - 10);
    }

    public double Get_Dissipation(int heatSinkCount, int engineRating) {
        int engineHeatSinks = engineRating > 250 ? 10 : engineRating / 25;
        int externalHeatSinkCount = heatSinkCount - engineHeatSinks;
        
        return this.engine_dissipation * engineHeatSinks + externalHeatSinkCount * this.normal_dissipation;
    }

    public double Get_Threshold(int heatSinkCount) {
        return 30.0D + heatSinkCount * this.threshold_boost;
    }

    public void Print() {
    }

    @Override
    public Crittable Get_Crittable() {
        Crittable localCrittable = new Crittable();
        localCrittable.is_locked = false;
        localCrittable.name = this.name;
        localCrittable.item_type = "Heat Sink";
        localCrittable.hardpoint_type = HardpointType.UNKNOWN_HARDPOINT_TYPE;
        localCrittable.criticals = this.criticals;
        localCrittable.tonnage = 0.0D;
        localCrittable.position = -1;
        localCrittable.reference = this;
        return localCrittable;
    }
}