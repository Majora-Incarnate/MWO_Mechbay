package com.github.majora_incarnate.mwo_mechbay.entities;

import com.google.gson.annotations.SerializedName;

/**
 * @author Trevin
 */
public enum SectionClass {
    UNKNOWN("NA", -1),
    
    @SerializedName("Head")
    HEAD("Head", 0),
    
    @SerializedName("Arm")
    ARM("Arm", 1),
    
    @SerializedName("Torso")
    TORSO("Torso", 2),
    
    @SerializedName("Leg")
    LEG("Leg", 3),
    
    @SerializedName("Special")
    SPECIAL("Special", 4);

    public final String name;
    public final int index;

    SectionClass(String name, int index) {
        this.name = name;
        this.index = index;
    }

    @Override
    public String toString() {
        return name;
    }
}
