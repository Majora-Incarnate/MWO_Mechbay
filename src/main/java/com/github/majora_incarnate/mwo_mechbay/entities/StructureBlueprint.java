package com.github.majora_incarnate.mwo_mechbay.entities;

public class StructureBlueprint extends Blueprint {
    public double tonnage_modifier;
    public double health_modifier;
    public int criticals;
    public double cost_modifier;
    public double upgrade_modifier;

    public int getLocationHealth(double tonnage, int section_index, int quirk_modifier) {
        return (int) (this.health_modifier * Constants.INTERNALS_PER_SECTION[(int)(tonnage / 5.0)][section_index]) + quirk_modifier;
    }

    public int getItemCost(double tonnage) {
        return (int) (this.cost_modifier * tonnage);
    }

    public int getUpgradeCost(double tonnage) {
        return (int) (this.upgrade_modifier * tonnage);
    }

    public double getTonnage(double tonnage) {
        return Math.ceil(tonnage * this.tonnage_modifier * 2.0D) * 0.5D;
    }

    @Override
    public Crittable Get_Crittable() {
        Crittable crittable = new Crittable();
        crittable.is_locked = false;
        crittable.name = this.name;
        crittable.item_type = "Structure";
        crittable.hardpoint_type = HardpointType.UNKNOWN_HARDPOINT_TYPE;
        crittable.criticals = 1;
        crittable.tonnage = 0.0D;
        crittable.position = -1;
        crittable.reference = this;
        return crittable;
    }
}