package com.github.majora_incarnate.mwo_mechbay.entities;

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

    public String short_name;
    public String long_name;
    public int value;

    TechBase(final String short_name, final String long_name, final int value) {
        this.short_name = short_name;
        this.long_name = long_name;
        this.value = value;
    }

    @Override
    public String toString() {
        return long_name;
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
