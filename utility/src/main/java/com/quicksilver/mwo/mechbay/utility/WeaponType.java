package com.quicksilver.mwo.mechbay.utility;

/**
 * @author Trevin
 */
public enum WeaponType {
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
