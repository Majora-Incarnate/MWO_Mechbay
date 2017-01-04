package com.github.majora_incarnate.mwo.mechbay.entities.enums;

/**
 * @author Trevin
 */
public enum WeightClass {
    UNKNOWN("Unknown", -1),
    LIGHT("Light", 0),
    MEDIUM("Medium", 1),
    HEAVY("Heavy", 2),
    ASSAULT("Assault", 3);

    public final String title;
    public final int index;

    WeightClass(String repr, int i) {
        title = repr;
        index = i;
    }

    public int getNumberOfWeightClasses() {
        return WeightClass.values().length;
    }

    @Override
    public String toString() {
        return title;
    }
    
    public static WeightClass enumOf(double tonnage) {
        if (tonnage > 100.0)
            throw new IllegalArgumentException();
        else if (tonnage > 75.0)
            return ASSAULT;
        else if (tonnage > 55.0)
            return HEAVY;
        else if (tonnage > 35.0)
            return MEDIUM;
        else if (tonnage > 0.0)
            return LIGHT;
        else
            return UNKNOWN;
    }
}
