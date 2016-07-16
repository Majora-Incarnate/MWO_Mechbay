package com.quicksilver.mwo.mechbay.utility;

public class GyroBlueprint extends Blueprint {
    public final TechBase tech_base;
    public final double tonnage_modifier;
    public final int criticals;
    public final int item_modifier;
    public final int upgrade_cost;

    public GyroBlueprint(String paramString) {
        String[] arrayOfString = paramString.split(";");
        int i = 0;
        this.name = arrayOfString[(i++)];
        this.id = Integer.parseInt(arrayOfString[(i++)]);
        this.tech_base = TechBase.getEnum(arrayOfString[(i++)]);
        this.criticals = Integer.parseInt(arrayOfString[(i++)]);
        this.tonnage_modifier = Double.parseDouble(arrayOfString[(i++)]);
        this.item_modifier = Integer.parseInt(arrayOfString[(i++)]);
        this.upgrade_cost = Integer.parseInt(arrayOfString[(i++)]);
    }

    public int Get_Item_Cost(int paramInt) {
        return this.item_modifier * ((paramInt + 95) / 100);
    }

    public int Get_Upgrade_Cost(int paramInt) {
        return this.upgrade_cost;
    }

    public double Get_Tonnage(int paramInt) {
        return (paramInt + 95) / 100 * this.tonnage_modifier;
    }

    @Override
    public Crittable Get_Crittable() {
        Crittable localCrittable = new Crittable();
        localCrittable.is_locked = true;
        localCrittable.name = this.name;
        localCrittable.item_type = "Gyro";
        localCrittable.hardpoint_type = HardpointType.NONE_HARDPOINT_TYPE;
        localCrittable.criticals = this.criticals;
        localCrittable.tonnage = 0.0D;
        localCrittable.position = -1;
        localCrittable.reference = this;
        return localCrittable;
    }
}