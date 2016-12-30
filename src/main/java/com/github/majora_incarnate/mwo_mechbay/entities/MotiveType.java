package com.github.majora_incarnate.mwo_mechbay.entities;

import com.google.gson.annotations.SerializedName;

/**
 * @author Trevin
 */
public enum MotiveType {
    @SerializedName("Biped")
    BIPED("Biped", {
        SectionType.HEAD, SectionType.CENTER_TORSO, SectionType.RIGHT_TORSO, SectionType.LEFT_TORSO,
        SectionType.RIGHT_ARM, SectionType.LEFT_ARM, SectionType.RIGHT_LEG, SectionType.LEFT_LEG
    }, 0),
    
    @SerializedName("Quad")
    QUAD("Quad", {
        SectionType.HEAD, SectionType.CENTER_TORSO, SectionType.RIGHT_TORSO, SectionType.LEFT_TORSO,
        SectionType.FRONT_RIGHT_LEG, SectionType.FRONT_LEFT_LEG, SectionType.REAR_RIGHT_LEG, SectionType.REAR_LEFT_LEG
    }, 1),

    public final String name;
    public final SectionType[] sections;
    public final int index;

    SectionType(String name, Section[] sections, int index) {
        this.name = name;
        this.sections = sections;
        this.index = index;
    }

    @Override
    public String toString() {
        return long_name;
    }
}
