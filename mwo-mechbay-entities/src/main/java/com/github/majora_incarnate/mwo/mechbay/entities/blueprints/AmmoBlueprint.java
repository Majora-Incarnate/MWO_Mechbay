package com.github.majora_incarnate.mwo.mechbay.entities.blueprints;

import com.github.majora_incarnate.mwo.mechbay.entities.Crittable;
import com.github.majora_incarnate.mwo.mechbay.entities.enums.CriticalType;
import com.github.majora_incarnate.mwo.mechbay.entities.enums.HardpointType;

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
    public Crittable getCrittable() {
        Crittable crittable = new Crittable();
        crittable.isLocked = false;
        crittable.name = this.name;
        crittable.itemType = CriticalType.AMMO;
        crittable.hardpointType = HardpointType.UNKNOWN;
        crittable.criticals = this.criticals;
        crittable.tonnage = this.tonnage;
        crittable.position = -1;
        crittable.reference = this;
        return crittable;
    }
}
