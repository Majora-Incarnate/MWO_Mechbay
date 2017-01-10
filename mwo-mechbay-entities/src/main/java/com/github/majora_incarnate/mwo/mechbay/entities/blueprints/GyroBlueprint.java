package com.github.majora_incarnate.mwo.mechbay.entities.blueprints;

import com.github.majora_incarnate.mwo.mechbay.entities.Crittable;
import com.github.majora_incarnate.mwo.mechbay.entities.enums.CriticalType;
import com.github.majora_incarnate.mwo.mechbay.entities.enums.HardpointType;

public class GyroBlueprint extends Blueprint {
    public double tonnageModifier;
    public int criticals;
    public int itemModifier;
    public int upgradeCost;

    public int getItemCost(int engineRating) {
        return this.itemModifier * ((engineRating + 95) / 100);
    }

    public int getUpgradeCost(int engineRating) {
        return this.upgradeCost;
    }

    public double getTonnage(int engineRating) {
        return (engineRating + 95) / 100 * this.tonnageModifier;
    }

    @Override
    public Crittable getCrittable() {
        Crittable crittable = new Crittable();
        crittable.isLocked = true;
        crittable.name = this.name;
        crittable.itemType = CriticalType.GYRO;
        crittable.hardpointType = HardpointType.UNKNOWN;
        crittable.criticals = this.criticals;
        crittable.tonnage = 0.0D;
        crittable.position = -1;
        crittable.reference = this;
        return crittable;
    }
}
