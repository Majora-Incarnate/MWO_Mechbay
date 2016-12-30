package com.github.majora_incarnate.mwo_mechbay.entities;

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

    public int Get_Item_Cost(double paramDouble) {
        return (int) (this.costModifier * BASE_COST);
    }

    public int Get_Upgrade_Cost(double paramDouble) {
        return this.upgradeCost;
    }

    public String Get_JJ_Class(double paramDouble) {
        if (paramDouble > CLASS_II_MAX_TONNAGE) {
            return " Class I";
        }
        if (paramDouble > CLASS_III_MAX_TONNAGE) {
            return " Class II";
        }
        if (paramDouble > CLASS_IV_MAX_TONNAGE) {
            return " Class III";
        }
        if (paramDouble > CLASS_V_MAX_TONNAGE) {
            return " Class IV";
        }
        return " Class V";
    }

    public double Get_Base_Tonnage(double paramDouble) {
        if (paramDouble > CLASS_II_MAX_TONNAGE) {
            return 2.0D;
        }
        if (paramDouble > CLASS_IV_MAX_TONNAGE) {
            return 1.0D;
        }
        return 0.5D;
    }

    public Crittable Get_Crittable(double paramDouble) {
        Crittable localCrittable = new Crittable();
        localCrittable.isLocked = false;
        localCrittable.name = (this.name + Get_JJ_Class(paramDouble));
        localCrittable.itemType = "Jump Jet";
        localCrittable.hardpointType = HardpointType.UNKNOWN_HARDPOINT_TYPE;
        localCrittable.criticals = this.criticals;
        localCrittable.tonnage = (Get_Base_Tonnage(paramDouble) * this.tonnageModifier);
        localCrittable.position = -1;
        localCrittable.reference = this;
        return localCrittable;
    }
}