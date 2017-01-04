package com.github.majora_incarnate.mwo.mechbay.entities.enums;

import com.google.gson.annotations.SerializedName;

/**
 * @author Trevin
 */
public enum HardpointType {
    UNKNOWN("Unknown", -1),
    
    @SerializedName("Ballistic")
    BALLISTIC("Ballistic", 0),
    
    @SerializedName("Energy")
    ENERGY("Energy", 1),
    
    @SerializedName("Missile")
    MISSILE("Missile", 2),
    
    @SerializedName("AMS")
    AMS("AMS", 3),
    
    @SerializedName("ECM")
    ECM("ECM", 4),
    
    @SerializedName("MASC")
    MASC("MASC", 5);

    public final String name;
    public final int value;

    HardpointType(final String name, final int value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return name;
    }

    public static HardpointType getEnum(String value) {
        switch(value) {
            case "Ballistic":
                return BALLISTIC;
            case "Energy":
                return ENERGY;
            case "Missile":
                return MISSILE;
            case "AMS":
                return AMS;
            case "ECM":
                return ECM;
            case "MASC":
                return MASC;
            default:
                return UNKNOWN;
        }
    }
}
