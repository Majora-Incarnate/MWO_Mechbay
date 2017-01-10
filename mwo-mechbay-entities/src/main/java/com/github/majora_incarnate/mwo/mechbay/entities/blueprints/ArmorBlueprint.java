package com.github.majora_incarnate.mwo.mechbay.entities.blueprints;

import com.github.majora_incarnate.mwo.mechbay.entities.enums.HardpointType;
import com.github.majora_incarnate.mwo.mechbay.entities.Crittable;
import com.github.majora_incarnate.mwo.mechbay.entities.enums.CriticalType;

public class ArmorBlueprint extends Blueprint {
    public int criticals;
    public double pointsPerTon;
    public double costPerTon;
    public double upgradeModifier;

    public int getItemCost(int totalArmorPoints) {
        return (int) (this.costPerTon * Math.ceil(
                totalArmorPoints / this.pointsPerTon));
    }

    public int getUpgradeCost(double chassisTonnage) {
        return (int) (this.upgradeModifier * chassisTonnage);
    }

    public double getTonnage(int totalArmorPoints) {
        return totalArmorPoints / this.pointsPerTon;
    }

    @Override
    public Crittable getCrittable() {
        Crittable crittable = new Crittable();
        crittable.isLocked = false;
        crittable.name = this.name;
        crittable.itemType = CriticalType.ARMOR;
        crittable.hardpointType = HardpointType.UNKNOWN;
        crittable.criticals = 1;
        crittable.tonnage = 0.0D;
        crittable.position = -1;
        crittable.reference = this;
        return crittable;
    }
}
