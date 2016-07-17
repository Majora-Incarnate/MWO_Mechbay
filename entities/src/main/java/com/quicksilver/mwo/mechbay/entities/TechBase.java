package com.quicksilver.mwo.mechbay.entities;

/**
 * @author Trevin
 */
public enum TechBase {
    UNKNOWN("?", "Unknown", -1),
    UNIVERSAL("U", "Universal", 0),
    INNER_SPHERE("IS", "InnerSphere", 1),
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
