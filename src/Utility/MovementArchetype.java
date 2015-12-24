package Utility;

/**
 * @author Trevin
 */
public enum MovementArchetype {
    TINY_MOVEMENT_ARCHETYPE("Tiny", 0, 40.0d),
    SMALL_MOVEMENT_ARCHETYPE("Small", 1, 35.0d),
    MEDIUM_MOVEMENT_ARCHETYPE("Medium", 2, 30.0d),
    LARGE_MOVEMENT_ARCHETYPE("Large", 3, 25.0d),
    HUGE_MOVEMENT_ARCHETYPE("Huge", 4, 20.0d);

    public final String name;
    public final int value;
    public final double min_climb_angle;
    public final double max_climb_angle;

    MovementArchetype(final String name, final int value, final double climb_angle) {
        this.name = name;
        this.value = value;
        this.min_climb_angle = climb_angle;
        this.max_climb_angle = 40.0d;
    }

    @Override
    public String toString() {
        return name;
    }
}
