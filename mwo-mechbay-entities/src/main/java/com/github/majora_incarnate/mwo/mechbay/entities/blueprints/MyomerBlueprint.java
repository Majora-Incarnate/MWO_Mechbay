package com.github.majora_incarnate.mwo.mechbay.entities.blueprints;

import com.github.majora_incarnate.mwo.mechbay.entities.enums.HardpointType;
import com.github.majora_incarnate.mwo.mechbay.entities.Crittable;
import com.github.majora_incarnate.mwo.mechbay.entities.enums.CriticalType;

public class MyomerBlueprint extends Blueprint {
    @Override
    public Crittable getCrittable() {
        Crittable crittable = new Crittable();
        crittable.isLocked = true;
        crittable.name = this.name;
        crittable.itemType = CriticalType.MYOMER;
        crittable.hardpointType = HardpointType.UNKNOWN;
        crittable.criticals = 1;
        crittable.tonnage = 0.0D;
        crittable.position = -1;
        crittable.reference = this;
        return crittable;
    }
}