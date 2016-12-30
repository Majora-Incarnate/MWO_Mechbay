package com.github.majora_incarnate.mwo_mechbay.entities;

public class StructureBlueprint extends Blueprint {
    public double tonnageModifier;
    public double healthModifier;
    public int criticals;
    public double costModifier;
    public double upgradeModifier;

    public int getLocationHealth(double tonnage, int section_index, int quirk_modifier) {
        return (int) (this.healthModifier * Constants.INTERNALS_PER_SECTION[(int)(tonnage / 5.0)][section_index]) + quirk_modifier;
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
    public Crittable Get_Crittable() {
        Crittable crittable = new Crittable();
        crittable.isLocked = false;
        crittable.name = this.name;
        crittable.itemType = "Structure";
        crittable.hardpointType = HardpointType.UNKNOWN_HARDPOINT_TYPE;
        crittable.criticals = 1;
        crittable.tonnage = 0.0D;
        crittable.position = -1;
        crittable.reference = this;
        return crittable;
    }
}