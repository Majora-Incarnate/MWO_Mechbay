package Mech;

public class Cockpit_Blueprint
  extends Blueprint
{
  public String tech_base;
  public double tonnage;
  public int criticals;
  public int item_cost;
  public int upgrade_cost;
  
  public Cockpit_Blueprint(String paramString)
  {
    String[] arrayOfString = paramString.split(";");
    int i = 0;
    this.name = arrayOfString[(i++)];
    this.id = Integer.parseInt(arrayOfString[(i++)]);
    this.tech_base = arrayOfString[(i++)];
    this.tonnage = Double.parseDouble(arrayOfString[(i++)]);
    this.criticals = Integer.parseInt(arrayOfString[(i++)]);
    this.item_cost = Integer.parseInt(arrayOfString[(i++)]);
    this.upgrade_cost = Integer.parseInt(arrayOfString[(i++)]);
  }
  
  public int Get_Item_Cost()
  {
    return this.item_cost;
  }
  
  public int Get_Upgrade_Cost()
  {
    return this.upgrade_cost;
  }
  
  public void Print() {}
  
  public Crittable Get_Crittable()
  {
    Crittable localCrittable = new Crittable();
    localCrittable.is_locked = true;
    localCrittable.name = this.name;
    localCrittable.item_type = "Cockpit";
    localCrittable.hardpoint_type = "None";
    localCrittable.criticals = this.criticals;
    localCrittable.tonnage = 0.0D;
    localCrittable.position = -1;
    localCrittable.reference = this;
    return localCrittable;
  }
}


/* Location:              C:\Users\Trevin\Dropbox\Public\MWO Mechbay.zip!\MWO_Mechbay.jar!\Mech\Cockpit_Blueprint.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */