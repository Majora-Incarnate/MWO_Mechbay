package com.quicksilver.mwo.mechbay.entities;

/**
 * @author Trevin
 */
public enum WeaponType {
    UNKNOWN("Unknown", -1),
    BALLISTIC("Ballistic", 0),
    ENERGY("Energy", 1),
    MISSILE("Missile", 2);

    private final String title;
    private final int index;

    WeaponType(String repr, int i) {
        title = repr;
        index = i;
    }

    public int getNumberOfWeaponTypes() {
        return WeaponType.values().length;
    }

    @Override
    public String toString() {
        return title;
    }

    public int toIndex() {
        return index;
    }
}
