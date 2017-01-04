package com.github.majora_incarnate.mwo.mechbay.entities.enums;

import com.google.gson.annotations.SerializedName;

/**
 * @author Trevin
 */
public enum TechBase {
    UNKNOWN("?", "Unknown", -1),
    
    @SerializedName("Universal")
    UNIVERSAL("U", "Universal", 0),
    
    @SerializedName("Inner Sphere")
    INNER_SPHERE("IS", "Inner Sphere", 1),
    
    @SerializedName("Clan")
    CLAN("CL", "Clan", 2);

    public final String shortName;
    public final String longName;
    public int value;

    TechBase(final String shortName, final String longName, final int value) {
        this.shortName = shortName;
        this.longName = longName;
        this.value = value;
    }

    @Override
    public String toString() {
        return longName;
    }

    public static TechBase getEnum(String value) {
        switch(value) {
            case "IS":
            case "InnerSphere":
            case "INNERSPHERE":
                return INNER_SPHERE;
            case "CL":
            case "Clan":
            case "CLAN":
                return CLAN;
            case "ALL":
                return UNIVERSAL;
            default:
                return UNKNOWN;
        }
    }
}
