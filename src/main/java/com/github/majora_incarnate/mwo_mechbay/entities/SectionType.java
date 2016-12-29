package com.github.majora_incarnate.mwo_mechbay.entities;

/**
 * @author Trevin
 */
public enum SectionType {
    UNKNOWN("NA", "Unknown", -1),
    HEAD("HD", "Head", 0),
    LEFT_ARM("LA", "Left Arm", 1),
    RIGHT_ARM("RA", "Right Arm", 2),
    LEFT_TORSO("LT", "Left Torso", 3),
    RIGHT_TORSO("RT", "Right Torso", 4),
    CENTER_TORSO("CT", "Center Torso", 5),
    LEFT_LEG("LL", "Left Leg", 6),
    RIGHT_LEG("RL", "Right Leg", 7),
    SPECIAL_ONE("S1", "Special 1", 8),
    SPECIAL_TWO("S2", "Special 2", 9),
    LEFT_REAR_TORSO("RLT", "Rear Left Torso", 0),
    RIGHT_REAR_TORSO("RRT", "Rear Right Torso", 1),
    CENTER_REAR_TORSO("RCT", "Rear Center Torso", 2),
    FRONT_LEFT_LEG("FLL", "Front Left Leg", 1),
    FRONT_RIGHT_LEG("FRL", "Front Right Leg", 2),
    REAR_LEFT_LEG("RLL", "Rear Left Leg", 6),
    REAR_RIGHT_LEG("RRL", "Rear Right Leg", 7);

    public final String short_name;
    public final String long_name;
    public final int index;

    SectionType(String short_name, String long_name, int index) {
        this.short_name = short_name;
        this.long_name = long_name;
        this.index = index;
    }

    public int count() {
        return SectionType.values().length;
    }

    @Override
    public String toString() {
        return long_name;
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
            case "LRT":
                return LEFT_REAR_TORSO;
            case "RRT":
                return RIGHT_REAR_TORSO;
            case "CRT":
                return CENTER_REAR_TORSO;
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
