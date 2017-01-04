package com.github.majora_incarnate.mwo.mechbay.entities.blueprints;

import com.github.majora_incarnate.mwo.mechbay.entities.Crittable;
import com.github.majora_incarnate.mwo.mechbay.entities.enums.TechBase;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Blueprint {
    public String name;
    public TechBase techBase;
    public int id;

    public Blueprint() {
        name = "";
        techBase = TechBase.UNIVERSAL;
        id = 0;
    }

    public Crittable Get_Crittable() {
        return null;
    }
    
    public String debugString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public String toString() {
        return name;
    }
}
