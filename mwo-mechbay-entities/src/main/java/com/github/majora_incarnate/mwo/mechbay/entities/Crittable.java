package com.github.majora_incarnate.mwo.mechbay.entities;

import com.github.majora_incarnate.mwo.mechbay.entities.blueprints.Blueprint;
import com.github.majora_incarnate.mwo.mechbay.entities.enums.CriticalType;
import com.github.majora_incarnate.mwo.mechbay.entities.enums.HardpointType;

public class Crittable {
    public boolean isLocked;
    public int position;
    public String name;
    public CriticalType itemType;
    public HardpointType hardpointType;
    public int id;
    public int criticals;
    public double tonnage;
    public Blueprint reference;

    @Override
    public String toString() {
        return this.name;
    }
}
