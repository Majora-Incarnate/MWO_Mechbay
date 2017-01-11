package com.github.majora_incarnate.mwo.mechbay.entities.enums;

/**
 * @author Trevin
 */
public enum MovementArchetype {
    UNKNOWN_MOVEMENT_ARCHETYPE("Unknown", 0, 0.0d),
    TINY_MOVEMENT_ARCHETYPE("Tiny", 0, 40.0d),
    SMALL_MOVEMENT_ARCHETYPE("Small", 1, 35.0d),
    MEDIUM_MOVEMENT_ARCHETYPE("Medium", 2, 30.0d),
    LARGE_MOVEMENT_ARCHETYPE("Large", 3, 25.0d),
    HUGE_MOVEMENT_ARCHETYPE("Huge", 4, 20.0d);

    public final String name;
    public final int value;
    public final double minClimbAngle;
    public final double maxClimbAngle;

    MovementArchetype(final String name, final int value, final double climbAngle) {
        this.name = name;
        this.value = value;
        this.minClimbAngle = climbAngle;
        this.maxClimbAngle = 40.0d;
    }

    @Override
    public String toString() {
        return name;
    }

    public static MovementArchetype getEnum(String value) {
        switch(value) {
            case "Tiny":
                return TINY_MOVEMENT_ARCHETYPE;
            case "Small":
                return SMALL_MOVEMENT_ARCHETYPE;
            case "Medium":
                return MEDIUM_MOVEMENT_ARCHETYPE;
            case "Large":
                return LARGE_MOVEMENT_ARCHETYPE;
            case "Huge":
                return HUGE_MOVEMENT_ARCHETYPE;
            default:
                return UNKNOWN_MOVEMENT_ARCHETYPE;
        }
    }
}
