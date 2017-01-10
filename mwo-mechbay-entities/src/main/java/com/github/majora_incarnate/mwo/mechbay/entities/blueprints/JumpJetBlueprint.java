package com.github.majora_incarnate.mwo.mechbay.entities.blueprints;

import com.github.majora_incarnate.mwo.mechbay.entities.Crittable;
import com.github.majora_incarnate.mwo.mechbay.entities.enums.CriticalType;
import com.github.majora_incarnate.mwo.mechbay.entities.enums.HardpointType;

public class JumpJetBlueprint extends Blueprint {
    private static final double BASE_COST = 44000.0D;
    private static final double CLASS_II_MAX_TONNAGE = 85.0D;
    private static final double CLASS_III_MAX_TONNAGE = 75.0D;
    private static final double CLASS_IV_MAX_TONNAGE = 55.0D;
    private static final double CLASS_V_MAX_TONNAGE = 35.0D;
    
    public double tonnageModifier;
    public int criticals;
    public double horizontalDistance;
    public double verticalDistance;
    public double costModifier;
    public int upgradeCost;

    public int getItemCost(double tonnage) {
        return (int) (this.costModifier * BASE_COST);
    }

    public int getUpgradeCost(double tonnage) {
        return this.upgradeCost;
    }

    public String getJJClass(double tonnage) {
        if (tonnage > CLASS_II_MAX_TONNAGE) {
            return " Class I";
        }
        if (tonnage > CLASS_III_MAX_TONNAGE) {
            return " Class II";
        }
        if (tonnage > CLASS_IV_MAX_TONNAGE) {
            return " Class III";
        }
        if (tonnage > CLASS_V_MAX_TONNAGE) {
            return " Class IV";
        }
        return " Class V";
    }

    public double getBaseTonnage(double tonnage) {
        if (tonnage > CLASS_II_MAX_TONNAGE) {
            return 2.0D;
        }
        if (tonnage > CLASS_IV_MAX_TONNAGE) {
            return 1.0D;
        }
        return 0.5D;
    }

    public Crittable getCrittable(double tonnage) {
        Crittable localCrittable = new Crittable();
        localCrittable.isLocked = false;
        localCrittable.name = (this.name + getJJClass(tonnage));
        localCrittable.itemType = CriticalType.JUMP_JET;
        localCrittable.hardpointType = HardpointType.UNKNOWN;
        localCrittable.criticals = this.criticals;
        localCrittable.tonnage = (getBaseTonnage(tonnage) * this.tonnageModifier);
        localCrittable.position = -1;
        localCrittable.reference = this;
        return localCrittable;
    }
}