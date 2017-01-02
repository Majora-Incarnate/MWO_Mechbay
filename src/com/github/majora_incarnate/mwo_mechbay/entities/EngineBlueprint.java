package com.github.majora_incarnate.mwo_mechbay.entities;

import java.util.Optional;

public class EngineBlueprint extends Blueprint {
    public double tonnageModifier;
    public int centerTorsoCriticals;
    public int sideTorsoCriticals;
    public double costModifier;
    public double heatSinkCostModifier;

    public int Get_Cost(int engineRating) {
        double d = engineRating * this.costModifier;

        if (engineRating < 250) {
            d -= 0.0D * this.heatSinkCostModifier;
        }

        return (int) d;
    }

    public int Get_Criticals() {
        return this.sideTorsoCriticals * 2 + this.centerTorsoCriticals;
    }

    public int Get_Heat_Sink_Capacity(int engineRating) {
        return engineRating / 25;
    }

    public double Get_Speed(double tonnage, int engineRating) {
        return engineRating * 16.2D / tonnage;
    }

    public boolean Has_Side_Torso_Criticals() {
        return this.sideTorsoCriticals > 0;
    }

    public double Get_Tonnage(int engineRating) {
        return Math.ceil(
                Constants.ENGINE_TONNAGES[(engineRating / 5)] * this.tonnageModifier / 0.5D) * 0.5D;
    }

    @Override
    public Crittable Get_Crittable() {
        Crittable localCrittable = new Crittable();
        localCrittable.isLocked = true;
        localCrittable.name = this.name;
        localCrittable.itemType = "Engine";
        localCrittable.hardpointType = HardpointType.UNKNOWN;
        localCrittable.criticals = this.centerTorsoCriticals;
        localCrittable.tonnage = 0.0D;
        localCrittable.position = -1;
        localCrittable.reference = this;
        return localCrittable;
    }

    public Optional<Crittable> Get_Crittable(boolean isSideTorso) {
        if (!isSideTorso) {
            return Optional.empty();
        }

        Crittable localCrittable = new Crittable();
        localCrittable.isLocked = true;
        localCrittable.name = this.name;
        localCrittable.itemType = "Engine";
        localCrittable.hardpointType = HardpointType.UNKNOWN;
        localCrittable.criticals = this.sideTorsoCriticals;
        localCrittable.tonnage = 0.0D;
        localCrittable.position = -1;
        localCrittable.reference = this;
        return Optional.of(localCrittable);
    }
}
