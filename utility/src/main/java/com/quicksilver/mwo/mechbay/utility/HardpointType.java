package com.quicksilver.mwo.mechbay.utility;

/**
 * @author Trevin
 */
public enum HardpointType {
    NONE_HARDPOINT_TYPE("None", -1),
    BALLISTIC_HARDPOINT_TYPE("Ballistic", 0),
    ENERGY_HARDPOINT_TYPE("Energy", 1),
    MISSILE_HARDPOINT_TYPE("Missile", 2),
    AMS_HARDPOINT_TYPE("AMS", 3),
    ECM_HARDPOINT_TYPE("ECM", 4);

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
                return BALLISTIC_HARDPOINT_TYPE;
            case "Energy":
                return ENERGY_HARDPOINT_TYPE;
            case "Missile":
                return MISSILE_HARDPOINT_TYPE;
            case "AMS":
                return AMS_HARDPOINT_TYPE;
            case "ECM":
                return ECM_HARDPOINT_TYPE;
            default:
                return NONE_HARDPOINT_TYPE;
        }
    }
}
