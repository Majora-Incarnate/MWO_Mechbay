package com.github.majora_incarnate.mwo.mechbay.entities.blueprints;

import com.github.majora_incarnate.mwo.mechbay.entities.Constants;
import com.github.majora_incarnate.mwo.mechbay.entities.enums.HardpointType;
import com.github.majora_incarnate.mwo.mechbay.entities.Crittable;
import com.github.majora_incarnate.mwo.mechbay.entities.enums.CriticalType;

import java.util.Optional;

public class EngineBlueprint extends Blueprint {
    public double tonnageModifier;
    public int centerTorsoCriticals;
    public int sideTorsoCriticals;
    public double costModifier;
    public double heatSinkCostModifier;

    public int getCost(int engineRating) {
        double d = engineRating * this.costModifier;

        if (engineRating < 250) {
            d -= 0.0D * this.heatSinkCostModifier;
        }

        return (int) d;
    }

    public int getCriticals() {
        return this.sideTorsoCriticals * 2 + this.centerTorsoCriticals;
    }

    public int getHeatSinkCapacity(int engineRating) {
        return engineRating / 25;
    }

    public double getSpeed(double tonnage, int engineRating) {
        return engineRating * 16.2D / tonnage;
    }

    public boolean hasSideTorsoCriticals() {
        return this.sideTorsoCriticals > 0;
    }

    public double getTonnage(int engineRating) {
        return Math.ceil(
                Constants.ENGINE_TONNAGES[(engineRating / 5)] * this.tonnageModifier / 0.5D) * 0.5D;
    }

    @Override
    public Crittable getCrittable() {
        Crittable crittable = new Crittable();
        
        crittable.isLocked = true;
        crittable.name = this.name;
        crittable.itemType = CriticalType.ENGINE;
        crittable.hardpointType = HardpointType.UNKNOWN;
        crittable.criticals = this.centerTorsoCriticals;
        crittable.tonnage = 0.0D;
        crittable.position = -1;
        crittable.reference = this;
        
        return crittable;
    }

    public Crittable getCrittable(boolean isSideTorso) {
        if (!isSideTorso) {
            return null;
        }

        Crittable crittable = new Crittable();
        
        crittable.isLocked = true;
        crittable.name = this.name;
        crittable.itemType = CriticalType.ENGINE;
        crittable.hardpointType = HardpointType.UNKNOWN;
        crittable.criticals = this.sideTorsoCriticals;
        crittable.tonnage = 0.0D;
        crittable.position = -1;
        crittable.reference = this;
        
        return crittable;
    }
}
