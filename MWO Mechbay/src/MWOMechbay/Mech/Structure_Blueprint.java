package Mech;

public class Structure_Blueprint
  extends Blueprint
{
  public String tech_base;
  public double tonnage_modifier;
  public int criticals;
  public double cost_modifier;
  public double upgrade_modifier;
  
  public Structure_Blueprint(String paramString)
  {
    String[] arrayOfString = paramString.split(";");
    int i = 0;
    this.name = arrayOfString[(i++)];
    this.id = Integer.parseInt(arrayOfString[(i++)]);
    this.tech_base = arrayOfString[(i++)];
    this.criticals = Integer.parseInt(arrayOfString[(i++)]);
    this.tonnage_modifier = Double.parseDouble(arrayOfString[(i++)]);
    this.cost_modifier = Double.parseDouble(arrayOfString[(i++)]);
    this.upgrade_modifier = Double.parseDouble(arrayOfString[(i++)]);
  }
  
  public int Get_Item_Cost(double paramDouble)
  {
    return (int)(this.cost_modifier * paramDouble);
  }
  
  public int Get_Upgrade_Cost(double paramDouble)
  {
    return (int)(this.upgrade_modifier * paramDouble);
  }
  
  public double Get_Tonnage(double paramDouble)
  {
    return Math.ceil(paramDouble * this.tonnage_modifier * 2.0D) * 0.5D;
  }
  
  public void Print() {}
  
  public Crittable Get_Crittable()
  {
    Crittable localCrittable = new Crittable();
    localCrittable.is_locked = false;
    localCrittable.name = this.name;
    localCrittable.item_type = "Structure";
    localCrittable.hardpoint_type = "None";
    localCrittable.criticals = 1;
    localCrittable.tonnage = 0.0D;
    localCrittable.position = -1;
    localCrittable.reference = this;
    return localCrittable;
  }
}


/* Location:              C:\Users\Trevin\Dropbox\Public\MWO Mechbay.zip!\MWO_Mechbay.jar!\Mech\Structure_Blueprint.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */