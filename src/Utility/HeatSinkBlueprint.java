package Utility;

public class HeatSinkBlueprint extends Blueprint {
    public final TechBase tech_base;
    public final double tonnage;
    public final int criticals;
    public final double engine_dissipation;
    public final double normal_dissipation;
    public final double threshold_boost;
    public final int space_modifier;
    public final int item_cost;
    public final int upgrade_cost;

    public HeatSinkBlueprint(String paramString) {
        String[] arrayOfString = paramString.split(";");
        int i = 0;
        this.name = arrayOfString[(i++)];
        this.id = Integer.parseInt(arrayOfString[(i++)]);
        this.tech_base = TechBase.getEnum(arrayOfString[(i++)]);
        this.tonnage = Double.parseDouble(arrayOfString[(i++)]);
        this.criticals = Integer.parseInt(arrayOfString[(i++)]);
        this.engine_dissipation = Double.parseDouble(arrayOfString[(i++)]);
        this.normal_dissipation = Double.parseDouble(arrayOfString[(i++)]);
        this.threshold_boost = Double.parseDouble(arrayOfString[(i++)]);
        this.space_modifier = Integer.parseInt(arrayOfString[(i++)]);
        this.item_cost = Integer.parseInt(arrayOfString[(i++)]);
        this.upgrade_cost = Integer.parseInt(arrayOfString[(i++)]);
    }

    public int Get_Item_Cost(int heatSinkCount, int engineRating) {
        if (engineRating < 250) {
            return this.item_cost * (heatSinkCount - (10 - engineRating / 250));
        }
        return this.item_cost * (heatSinkCount - 10);
    }

    public int Get_Upgrade_Cost() {
        return this.upgrade_cost;
    }

    public double Get_Tonnage(int heatSinkCount, int engineRating) {
        if (engineRating < 250) {
            return this.tonnage * (heatSinkCount - (10 - engineRating / 250));
        }
        return this.tonnage * (heatSinkCount - 10);
    }

    public double Get_Dissipation(final int heatSinkCount, final int engineRating) {
        final int engineHeatSinks = engineRating > 250 ? 10 : engineRating / 25;
        final int externalHeatSinkCount = heatSinkCount - engineHeatSinks;
        
        return this.engine_dissipation * engineHeatSinks + externalHeatSinkCount * this.normal_dissipation;
    }

    public double Get_Threshold(int heatSinkCount) {
        return 30.0D + heatSinkCount * this.threshold_boost;
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