package com.github.majora_incarnate.mwo_mechbay.entities.blueprints;

import com.github.majora_incarnate.mwo_mechbay.entities.Crittable;
import com.github.majora_incarnate.mwo_mechbay.entities.HardpointType;

public class EquipmentBlueprint extends Blueprint {
    public HardpointType hardpoint_type;
    public double tonnage;
    public int criticals;

    @Override
    public Crittable Get_Crittable() {
        Crittable localCrittable = new Crittable();
        localCrittable.isLocked = false;
        localCrittable.name = this.name;
        localCrittable.itemType = "Equipment";
        localCrittable.hardpointType = HardpointType.UNKNOWN;
        localCrittable.criticals = this.criticals;
        localCrittable.tonnage = this.tonnage;
        localCrittable.position = -1;
        localCrittable.reference = this;
        return localCrittable;
    }
}
