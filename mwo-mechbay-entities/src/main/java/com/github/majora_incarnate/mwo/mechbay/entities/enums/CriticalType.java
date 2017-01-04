package com.github.majora_incarnate.mwo.mechbay.entities.enums;

/**
 * @author Trevin
 */
public enum CriticalType {
    UNKNOWN_CRITICAL_TYPE("Unknown", 0),
    ACTUATOR_CRITICAL_TYPE("Actuator", 1),
    WEAPON_CRITICAL_TYPE("Weapon", 2),
    AMMO_CRITICAL_TYPE("Ammo", 3),
    EQUIPMENT_CRITICAL_TYPE("Equipment", 4),
    HEAT_SINK_CRITICAL_TYPE("Heat Sink", 5),
    JUMP_JET_CRITICAL_TYPE("Jump Jet", 6),
    ARMOR_CRITICAL_TYPE("Armor", 7),
    INTERNAL_CRITICAL_TYPE("Internal", 8),
    CASE_CRITICAL_TYPE("CASE", 9),
    ENGINE_CRITICAL_TYPE("Engine", 10),
    GYRO_CRITICAL_TYPE("Gyro", 11),
    MYOMER_CRITICAL_TYPE("Myomer", 12),
    COCKPIT_CRITICAL_TYPE("Cockpit", 13);

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
