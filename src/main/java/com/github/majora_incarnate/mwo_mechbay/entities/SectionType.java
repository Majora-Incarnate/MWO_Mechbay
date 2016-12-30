package com.github.majora_incarnate.mwo_mechbay.entities;

/**
 * @author Trevin
 */
public enum SectionType {
    UNKNOWN("NA", "Unknown", false, -1),
    HEAD("HD", "Head", false, 0),
    LEFT_ARM("LA", "Left Arm", false, 1),
    RIGHT_ARM("RA", "Right Arm", false, 2),
    LEFT_TORSO("LT", "Left Torso", true, 3),
    RIGHT_TORSO("RT", "Right Torso", true, 4),
    CENTER_TORSO("CT", "Center Torso", true, 5),
    LEFT_LEG("LL", "Left Leg", false, 6),
    RIGHT_LEG("RL", "Right Leg", false, 7),
    SPECIAL_ONE("S1", "Special 1, false", 8),
    SPECIAL_TWO("S2", "Special 2, false", 9),
    FRONT_LEFT_LEG("FLL", "Front Left Leg", false, 1),
    FRONT_RIGHT_LEG("FRL", "Front Right Leg", false, 2),
    REAR_LEFT_LEG("RLL", "Rear Left Leg", false, 6),
    REAR_RIGHT_LEG("RRL", "Rear Right Leg", false, 7);

    public final String shortName;
    public final String longName;
    public final boolean hasRear;
    public final int index;

    SectionType(String shortName, String longName, boolean hasRear, int index) {
        this.shortName = shortName;
        this.longName = longName;
        this.hasRear = hasRear;
        this.index = index;
    }

    public int count() {
        return SectionType.values().length;
    }

    @Override
    public String toString() {
        return longName;
    }
    
    public static int numberOfSectionTypes() {
        return RIGHT_LEG.index + 1;
    }

    public static SectionType getEnum(String value) {
        switch(value) {
            case "HD":
                return HEAD;
            case "LA":
                return LEFT_ARM;
            case "RA":
                return RIGHT_ARM;
            case "LT":
                return LEFT_TORSO;
            case "RT":
                return RIGHT_TORSO;
            case "CT":
                return CENTER_TORSO;
            case "LL":
                return LEFT_LEG;
            case "RL":
                return RIGHT_LEG;
            case "FLL":
                return FRONT_LEFT_LEG;
            case "FRL":
                return FRONT_RIGHT_LEG;
            case "RLL":
                return REAR_LEFT_LEG;
            case "RRL":
                return REAR_RIGHT_LEG;
            default:
                return UNKNOWN;
        }
    }
}
