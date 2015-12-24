package Utility;

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
    LEFT_REAR_TORSO("RLT", "Rear Left Torso", 0),
    RIGHT_REAR_TORSO("RRT", "Rear Right Torso", 1),
    CENTER_REAR_TORSO("RCT", "Rear Center Torso", 2);

    public final String short_name;
    public final String long_name;
    public final int index;

    SectionType(String short_repr, String long_repr, int i) {
        short_name = short_repr;
        long_name = long_repr;
        index = i;
    }

    public int getNumberOfWeightClasses() {
        return WeightClass.values().length;
    }

    @Override
    public String toString() {
        return long_name;
    }
}
