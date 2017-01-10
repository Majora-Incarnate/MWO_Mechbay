package com.github.majora_incarnate.mwo.mechbay.entities.enums;

/**
 * @author Trevin
 */
public enum CriticalType {
    UNKNOWN("Unknown", 0),
    ACTUATOR("Actuator", 1),
    WEAPON("Weapon", 2),
    AMMO("Ammo", 3),
    EQUIPMENT("Equipment", 4),
    HEAT_SINK("Heat Sink", 5),
    JUMP_JET("Jump Jet", 6),
    ARMOR("Armor", 7),
    STRUCTURE("Structure", 8),
    CASE("CASE", 9),
    ENGINE("Engine", 10),
    GYRO("Gyro", 11),
    MYOMER("Myomer", 12),
    COCKPIT("Cockpit", 13);

    public final String name;
    public final int value;

    CriticalType(final String name, final int value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return name;
    }
}
