package Mech;

public class Gyro_Blueprint
  extends Blueprint
{
  public String tech_base;
  public double tonnage_modifier;
  public int criticals;
  public int item_modifier;
  public int upgrade_cost;
  
  public Gyro_Blueprint(String paramString)
  {
    String[] arrayOfString = paramString.split(";");
    int i = 0;
    this.name = arrayOfString[(i++)];
    this.id = Integer.parseInt(arrayOfString[(i++)]);
    this.tech_base = arrayOfString[(i++)];
    this.criticals = Integer.parseInt(arrayOfString[(i++)]);
    this.tonnage_modifier = Double.parseDouble(arrayOfString[(i++)]);
    this.item_modifier = Integer.parseInt(arrayOfString[(i++)]);
    this.upgrade_cost = Integer.parseInt(arrayOfString[(i++)]);
  }
  
  public int Get_Item_Cost(int paramInt)
  {
    return this.item_modifier * ((paramInt + 95) / 100);
  }
  
  public int Get_Upgrade_Cost(int paramInt)
  {
    return this.upgrade_cost;
  }
  
  public double Get_Tonnage(int paramInt)
  {
    return (paramInt + 95) / 100 * this.tonnage_modifier;
  }
  
  public void Print() {}
  
  public Crittable Get_Crittable()
  {
    Crittable localCrittable = new Crittable();
    localCrittable.is_locked = true;
    localCrittable.name = this.name;
    localCrittable.item_type = "Gyro";
    localCrittable.hardpoint_type = "None";
    localCrittable.criticals = this.criticals;
    localCrittable.tonnage = 0.0D;
    localCrittable.position = -1;
    localCrittable.reference = this;
    return localCrittable;
  }
}


/* Location:              C:\Users\Trevin\Dropbox\Public\MWO Mechbay.zip!\MWO_Mechbay.jar!\Mech\Gyro_Blueprint.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */