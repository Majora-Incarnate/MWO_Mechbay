package com.quicksilver.mwo.mechbay.utility;

public class FireControlBlueprint extends Blueprint {
    public TechBase tech_base;
    public double spread_modifier;
    public int criticals_modifier;
    public double tonnage_modifier;
    public double cost_modifier;
    public int upgrade_cost;

    public FireControlBlueprint(String paramString) {
        String[] arrayOfString = paramString.split(";");
        int i = 0;
        this.name = arrayOfString[(i++)];
        this.id = Integer.parseInt(arrayOfString[(i++)]);
        this.tech_base = TechBase.getEnum(arrayOfString[(i++)]);
        this.criticals_modifier = Integer.parseInt(arrayOfString[(i++)]);
        this.tonnage_modifier = Double.parseDouble(arrayOfString[(i++)]);
        this.spread_modifier = Double.parseDouble(arrayOfString[(i++)]);
        this.cost_modifier = Double.parseDouble(arrayOfString[(i++)]);
        this.upgrade_cost = Integer.parseInt(arrayOfString[(i++)]);
    }
}