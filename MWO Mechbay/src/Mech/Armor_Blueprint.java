package Mech;

public class Armor_Blueprint
  extends Blueprint
{
  public String tech_base;
  public int criticals;
  public double points_per_ton;
  public double cost_per_ton;
  public double upgrade_modifier;
  
  public Armor_Blueprint(String paramString)
  {
    String[] arrayOfString = paramString.split(";");
    int i = 0;
    this.name = arrayOfString[(i++)];
    this.id = Integer.parseInt(arrayOfString[(i++)]);
    this.tech_base = arrayOfString[(i++)];
    this.criticals = Integer.parseInt(arrayOfString[(i++)]);
    this.points_per_ton = Double.parseDouble(arrayOfString[(i++)]);
    this.cost_per_ton = Double.parseDouble(arrayOfString[(i++)]);
    this.upgrade_modifier = Double.parseDouble(arrayOfString[(i++)]);
  }
  
  public int Get_Item_Cost(int paramInt)
  {
    return (int)(this.cost_per_ton * Math.ceil(paramInt / this.points_per_ton));
  }
  
  public int Get_Upgrade_Cost(double paramDouble)
  {
    return (int)(this.upgrade_modifier * paramDouble);
  }
  
  public double Get_Tonnage(int paramInt)
  {
    return paramInt / this.points_per_ton;
  }
  
  public void Print() {}
  
  public Crittable Get_Crittable()
  {
    Crittable localCrittable = new Crittable();
    localCrittable.is_locked = false;
    localCrittable.name = this.name;
    localCrittable.item_type = "Armor";
    localCrittable.hardpoint_type = "None";
    localCrittable.criticals = 1;
    localCrittable.tonnage = 0.0D;
    localCrittable.position = -1;
    localCrittable.reference = this;
    return localCrittable;
  }
}


/* Location:              C:\Users\Trevin\Dropbox\Public\MWO Mechbay.zip!\MWO_Mechbay.jar!\Mech\Armor_Blueprint.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */