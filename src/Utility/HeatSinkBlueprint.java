package Utility;

public class HeatSinkBlueprint extends Blueprint {
    public String tech_base;
    public double tonnage;
    public int criticals;
    public double engine_dissipation;
    public double normal_dissipation;
    public double threshold_boost;
    public int space_modifier;
    public int item_cost;
    public int upgrade_cost;

    public HeatSinkBlueprint(String paramString) {
        String[] arrayOfString = paramString.split(";");
        int i = 0;
        this.name = arrayOfString[(i++)];
        this.id = Integer.parseInt(arrayOfString[(i++)]);
        this.tech_base = arrayOfString[(i++)];
        this.tonnage = Double.parseDouble(arrayOfString[(i++)]);
        this.criticals = Integer.parseInt(arrayOfString[(i++)]);
        this.engine_dissipation = Double.parseDouble(arrayOfString[(i++)]);
        this.normal_dissipation = Double.parseDouble(arrayOfString[(i++)]);
        this.threshold_boost = Double.parseDouble(arrayOfString[(i++)]);
        this.space_modifier = Integer.parseInt(arrayOfString[(i++)]);
        this.item_cost = Integer.parseInt(arrayOfString[(i++)]);
        this.upgrade_cost = Integer.parseInt(arrayOfString[(i++)]);
    }

    public int Get_Item_Cost(int paramInt1, int paramInt2) {
        if (paramInt2 < 250) {
            return this.item_cost * (paramInt1 - (10 - paramInt2 / 250));
        }
        return this.item_cost * (paramInt1 - 10);
    }

    public int Get_Upgrade_Cost() {
        return this.upgrade_cost;
    }

    public double Get_Tonnage(int paramInt1, int paramInt2) {
        if (paramInt2 < 250) {
            return this.tonnage * (paramInt1 - (10 - paramInt2 / 250));
        }
        return this.tonnage * (paramInt1 - 10);
    }

    public double Get_Dissipation(int paramInt1, int paramInt2) {
        paramInt2 = paramInt2 > 250 ? 10 : paramInt2 / 25;
        paramInt1 -= paramInt2;
        return this.engine_dissipation * paramInt2 + paramInt1 * this.normal_dissipation;
    }

    public double Get_Threshold(int paramInt) {
        return 30.0D + paramInt * this.threshold_boost;
    }

    public void Print() {
    }

    @Override
    public Crittable Get_Crittable() {
        Crittable localCrittable = new Crittable();
        localCrittable.is_locked = false;
        localCrittable.name = this.name;
        localCrittable.item_type = "Heat Sink";
        localCrittable.hardpoint_type = HardpointType.NONE_HARDPOINT_TYPE;
        localCrittable.criticals = this.criticals;
        localCrittable.tonnage = 0.0D;
        localCrittable.position = -1;
        localCrittable.reference = this;
        return localCrittable;
    }
}