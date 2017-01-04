package com.github.majora_incarnate.mwo.mechbay.entities.blueprints;

import com.github.majora_incarnate.mwo.mechbay.entities.Crittable;
import com.github.majora_incarnate.mwo.mechbay.entities.enums.HardpointType;

public class HeatSinkBlueprint extends Blueprint {
    public double tonnage;
    public int criticals;
    public double internalDissipation;
    public double externalDissipation;
    public double thresholdBoost;
    public int spaceModifier;
    public int itemCost;
    public int upgradeCost;

    public int Get_Item_Cost(int heatSinkCount, int engineRating) {
        if (engineRating < 250) {
            return this.itemCost * (heatSinkCount - (10 - engineRating / 250));
        }
        return this.itemCost * (heatSinkCount - 10);
    }

    public int Get_Upgrade_Cost() {
        return this.upgradeCost;
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
        
        return this.internalDissipation * engineHeatSinks + externalHeatSinkCount * this.externalDissipation;
    }

    public double Get_Threshold(int heatSinkCount) {
        return 30.0D + heatSinkCount * this.thresholdBoost;
    }

    public void Print() {
    }

    @Override
    public Crittable Get_Crittable() {
        Crittable localCrittable = new Crittable();
        localCrittable.isLocked = false;
        localCrittable.name = this.name;
        localCrittable.itemType = "Heat Sink";
        localCrittable.hardpointType = HardpointType.UNKNOWN;
        localCrittable.criticals = this.criticals;
        localCrittable.tonnage = 0.0D;
        localCrittable.position = -1;
        localCrittable.reference = this;
        return localCrittable;
    }
}