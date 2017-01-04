package com.github.majora_incarnate.mwo.mechbay.entities.blueprints;

import com.github.majora_incarnate.mwo.mechbay.entities.enums.HardpointType;
import com.github.majora_incarnate.mwo.mechbay.entities.Crittable;

public class ArmorBlueprint extends Blueprint {
    public int criticals;
    public double pointsPerTon;
    public double costPerTon;
    public double upgradeModifier;

    public int Get_Item_Cost(int paramInt) {
        return (int) (this.costPerTon * Math.ceil(
                paramInt / this.pointsPerTon));
    }

    public int Get_Upgrade_Cost(double paramDouble) {
        return (int) (this.upgradeModifier * paramDouble);
    }

    public double Get_Tonnage(int paramInt) {
        return paramInt / this.pointsPerTon;
    }

    @Override
    public Crittable Get_Crittable() {
        Crittable localCrittable = new Crittable();
        localCrittable.isLocked = false;
        localCrittable.name = this.name;
        localCrittable.itemType = "Armor";
        localCrittable.hardpointType = HardpointType.UNKNOWN;
        localCrittable.criticals = 1;
        localCrittable.tonnage = 0.0D;
        localCrittable.position = -1;
        localCrittable.reference = this;
        return localCrittable;
    }
}
