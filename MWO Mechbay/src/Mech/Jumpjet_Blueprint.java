package Mech;

public class Jumpjet_Blueprint
  extends Blueprint
{
  public String tech_base;
  public double tonnage_modifier;
  public int criticals;
  public double horizontal_distance;
  public double vertical_distance;
  public double cost_modifier;
  public int upgrade_cost;
  
  public Jumpjet_Blueprint(String paramString)
  {
    String[] arrayOfString = paramString.split(";");
    int i = 0;
    this.name = arrayOfString[(i++)];
    this.id = Integer.parseInt(arrayOfString[(i++)]);
    this.tech_base = arrayOfString[(i++)];
    this.tonnage_modifier = Double.parseDouble(arrayOfString[(i++)]);
    this.criticals = Integer.parseInt(arrayOfString[(i++)]);
    this.horizontal_distance = Double.parseDouble(arrayOfString[(i++)]);
    this.vertical_distance = Double.parseDouble(arrayOfString[(i++)]);
    this.cost_modifier = Double.parseDouble(arrayOfString[(i++)]);
    this.upgrade_cost = Integer.parseInt(arrayOfString[(i++)]);
  }
  
  public int Get_Item_Cost(double paramDouble)
  {
    return (int)(this.cost_modifier * 44000.0D);
  }
  
  public int Get_Upgrade_Cost(double paramDouble)
  {
    return this.upgrade_cost;
  }
  
  public String Get_JJ_Class(double paramDouble)
  {
    if (paramDouble > 85.0D) {
      return " Class I";
    }
    if (paramDouble > 75.0D) {
      return " Class II";
    }
    if (paramDouble > 55.0D) {
      return " Class III";
    }
    if (paramDouble > 35.0D) {
      return " Class IV";
    }
    return " Class V";
  }
  
  public double Get_Base_Tonnage(double paramDouble)
  {
    if (paramDouble > 85.0D) {
      return 2.0D;
    }
    if (paramDouble > 55.0D) {
      return 1.0D;
    }
    return 0.5D;
  }
  
  public Crittable Get_Crittable(double paramDouble)
  {
    Crittable localCrittable = new Crittable();
    localCrittable.is_locked = false;
    localCrittable.name = (this.name + Get_JJ_Class(paramDouble));
    localCrittable.item_type = "Jump Jet";
    localCrittable.hardpoint_type = "None";
    localCrittable.criticals = this.criticals;
    localCrittable.tonnage = (Get_Base_Tonnage(paramDouble) * this.tonnage_modifier);
    localCrittable.position = -1;
    localCrittable.reference = this;
    return localCrittable;
  }
}


/* Location:              C:\Users\Trevin\Dropbox\Public\MWO Mechbay.zip!\MWO_Mechbay.jar!\Mech\Jumpjet_Blueprint.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */