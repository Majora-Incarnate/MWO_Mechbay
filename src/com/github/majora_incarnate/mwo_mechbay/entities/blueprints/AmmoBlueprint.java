package com.github.majora_incarnate.mwo_mechbay.entities.blueprints;

import com.github.majora_incarnate.mwo_mechbay.entities.Crittable;
import com.github.majora_incarnate.mwo_mechbay.entities.HardpointType;

public class AmmoBlueprint extends Blueprint {
    public int health;
    public int criticals;
    public String type;
    public double damage;
    public double tonnage;
    public int ammoCount;
    public boolean artemisCapable;
    public boolean apolloCapable;

    @Override
    public Crittable Get_Crittable() {
        Crittable localCrittable = new Crittable();
        localCrittable.isLocked = false;
        localCrittable.name = this.name;
        localCrittable.itemType = "Ammo";
        localCrittable.hardpointType = HardpointType.UNKNOWN;
        localCrittable.criticals = this.criticals;
        localCrittable.tonnage = this.tonnage;
        localCrittable.position = -1;
        localCrittable.reference = this;
        return localCrittable;
    }
}
