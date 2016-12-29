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

    public int getNumberOfSectionClasses() {
        return WeightClass.values().length;
    }

    @Override
    public String toString() {
        return name;
    }

    public static SectionClass getEnum(String value) {
        switch(value) {
            case "Head":
                return HEAD;
            case "Arm":
                return ARM;
            case "Torso":
                return TORSO;
            case "Leg":
                return LEG;
            case "Special":
                return SPECIAL;
            default:
                return UNKNOWN;
        }
    }
}
