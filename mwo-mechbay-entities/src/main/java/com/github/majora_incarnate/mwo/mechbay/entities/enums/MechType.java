package com.github.majora_incarnate.mwo.mechbay.entities.enums;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author Trevin
 */
public enum MechType {
    @SerializedName("Battlemech")
    BATTLEMECH("Battlemech", 0),
    
    @SerializedName("Omnimech")
    OMNIMECH("Omnimech", 1);
    
    public final String name;
    public final int index;
    
    MechType(final String name, final int index) {
        this.name = name;
        this.index = index;
    }

    @Override
    public String toString() {
        return name;
    }
}
