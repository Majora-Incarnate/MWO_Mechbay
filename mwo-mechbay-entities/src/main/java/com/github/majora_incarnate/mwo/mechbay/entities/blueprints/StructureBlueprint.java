package com.github.majora_incarnate.mwo.mechbay.entities.blueprints;

import com.github.majora_incarnate.mwo.mechbay.entities.Constants;
import com.github.majora_incarnate.mwo.mechbay.entities.Crittable;
import com.github.majora_incarnate.mwo.mechbay.entities.enums.CriticalType;
import com.github.majora_incarnate.mwo.mechbay.entities.enums.HardpointType;

public class StructureBlueprint extends Blueprint {
    public double tonnageModifier;
    public double healthModifier;
    public int criticals;
    public double costModifier;
    public double upgradeModifier;

    public int getLocationHealth(double tonnage, int sectionIndex, int quirkModifier) {
        return (int) (this.healthModifier * Constants.INTERNALS_PER_SECTION[(int)(tonnage / 5.0)][sectionIndex]) + quirkModifier;
    }

    public int getItemCost(double tonnage) {
        return (int) (this.costModifier * tonnage);
    }

    public int getUpgradeCost(double tonnage) {
        return (int) (this.upgradeModifier * tonnage);
    }

    public double getTonnage(double tonnage) {
        return Math.ceil(tonnage * this.tonnageModifier * 2.0D) * 0.5D;
    }

    @Override
    public Crittable getCrittable() {
        Crittable crittable = new Crittable();
        crittable.isLocked = false;
        crittable.name = this.name;
        crittable.itemType = CriticalType.STRUCTURE;
        crittable.hardpointType = HardpointType.UNKNOWN;
        crittable.criticals = 1;
        crittable.tonnage = 0.0D;
        crittable.position = -1;
        crittable.reference = this;
        return crittable;
    }
}