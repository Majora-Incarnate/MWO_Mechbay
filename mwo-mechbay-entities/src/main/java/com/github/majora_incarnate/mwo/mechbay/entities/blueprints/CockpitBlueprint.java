package com.github.majora_incarnate.mwo.mechbay.entities.blueprints;

import com.github.majora_incarnate.mwo.mechbay.entities.Crittable;
import com.github.majora_incarnate.mwo.mechbay.entities.enums.CriticalType;
import com.github.majora_incarnate.mwo.mechbay.entities.enums.HardpointType;

public class CockpitBlueprint extends Blueprint {
    public double tonnage;
    public int criticals;
    public int itemCost;
    public int upgradeCost;

    public int getItemCost() {
        return this.itemCost;
    }

    public int getUpgradeCost() {
        return this.upgradeCost;
    }

    @Override
    public Crittable getCrittable() {
        Crittable crittable = new Crittable();
        crittable.isLocked = true;
        crittable.name = this.name;
        crittable.itemType = CriticalType.COCKPIT;
        crittable.hardpointType = HardpointType.UNKNOWN;
        crittable.criticals = this.criticals;
        crittable.tonnage = 0.0D;
        crittable.position = -1;
        crittable.reference = this;
        return crittable;
    }
}
