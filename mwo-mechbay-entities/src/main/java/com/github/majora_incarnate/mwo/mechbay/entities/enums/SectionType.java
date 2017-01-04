package com.github.majora_incarnate.mwo.mechbay.entities.enums;

import com.google.gson.annotations.SerializedName;

/**
 * @author Trevin
 */
public enum SectionType {
    UNKNOWN("NA", "Unknown", false, SectionClass.UNKNOWN, -1),
    
    @SerializedName("Head")
    HEAD("HD", "Head", false, SectionClass.HEAD, 0),
    
    @SerializedName("Left Arm")
    LEFT_ARM("LA", "Left Arm", false, SectionClass.ARM, 1),
    
    @SerializedName("Right Arm")
    RIGHT_ARM("RA", "Right Arm", false, SectionClass.ARM, 2),
    
    @SerializedName("Left Torso")
    LEFT_TORSO("LT", "Left Torso", true, SectionClass.TORSO, 3),
    
    @SerializedName("Right Torso")
    RIGHT_TORSO("RT", "Right Torso", true, SectionClass.TORSO, 4),
    
    @SerializedName("Center Torso")
    CENTER_TORSO("CT", "Center Torso", true, SectionClass.TORSO, 5),
    
    @SerializedName("Left Leg")
    LEFT_LEG("LL", "Left Leg", false, SectionClass.LEG, 6),
    
    @SerializedName("Right Leg")
    RIGHT_LEG("RL", "Right Leg", false, SectionClass.LEG, 7),
    
    @SerializedName("Special 1")
    SPECIAL_ONE("S1", "Special 1", false, SectionClass.SPECIAL, 8),
    
    @SerializedName("Special 2")
    SPECIAL_TWO("S2", "Special 2", false, SectionClass.SPECIAL, 9),
    
    @SerializedName("Front Left Leg")
    FRONT_LEFT_LEG("FLL", "Front Left Leg", false, SectionClass.LEG, 2),
    
    @SerializedName("Front Right Leg")
    FRONT_RIGHT_LEG("FRL", "Front Right Leg", false, SectionClass.LEG, 3),
    
    @SerializedName("Rear Left Leg")
    REAR_LEFT_LEG("RLL", "Rear Left Leg", false, SectionClass.LEG, 6),
    
    @SerializedName("Rear Right Leg")
    REAR_RIGHT_LEG("RRL", "Rear Right Leg", false, SectionClass.LEG, 7);

    public final String shortName;
    public final String longName;
    public final boolean hasRear;
    public final SectionClass sectionClass;
    public final int index;

    SectionType(String shortName, String longName, boolean hasRear, SectionClass sectionClass, int index) {
        this.shortName = shortName;
        this.longName = longName;
        this.hasRear = hasRear;
        this.sectionClass = sectionClass;
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
