package com.github.majora_incarnate.mwo.mechbay.entities.blueprints;

import com.github.majora_incarnate.mwo.mechbay.entities.Crittable;
import com.github.majora_incarnate.mwo.mechbay.entities.enums.HardpointType;

public class GyroBlueprint extends Blueprint {
    public double tonnageModifier;
    public int criticals;
    public int itemModifier;
    public int upgradeCost;

    public int Get_Item_Cost(int paramInt) {
        return this.itemModifier * ((paramInt + 95) / 100);
    }

    public int Get_Upgrade_Cost(int paramInt) {
        return this.upgradeCost;
    }

    public double Get_Tonnage(int paramInt) {
        return (paramInt + 95) / 100 * this.tonnageModifier;
    }

    @Override
    public Crittable Get_Crittable() {
        Crittable localCrittable = new Crittable();
        localCrittable.isLocked = true;
        localCrittable.name = this.name;
        localCrittable.itemType = "Gyro";
        localCrittable.hardpointType = HardpointType.UNKNOWN;
        localCrittable.criticals = this.criticals;
        localCrittable.tonnage = 0.0D;
        localCrittable.position = -1;
        localCrittable.reference = this;
        return localCrittable;
    }
}
