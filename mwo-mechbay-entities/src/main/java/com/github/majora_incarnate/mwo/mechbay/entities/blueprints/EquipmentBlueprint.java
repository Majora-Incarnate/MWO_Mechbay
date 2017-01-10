package com.github.majora_incarnate.mwo.mechbay.entities.blueprints;

import com.github.majora_incarnate.mwo.mechbay.entities.Crittable;
import com.github.majora_incarnate.mwo.mechbay.entities.enums.CriticalType;
import com.github.majora_incarnate.mwo.mechbay.entities.enums.HardpointType;

public class EquipmentBlueprint extends Blueprint {
    public HardpointType hardpoint_type;
    public double tonnage;
    public int criticals;

    @Override
    public Crittable getCrittable() {
        Crittable crittable = new Crittable();
        crittable.isLocked = false;
        crittable.name = this.name;
        crittable.itemType = CriticalType.EQUIPMENT;
        crittable.hardpointType = HardpointType.UNKNOWN;
        crittable.criticals = this.criticals;
        crittable.tonnage = this.tonnage;
        crittable.position = -1;
        crittable.reference = this;
        return crittable;
    }
}
