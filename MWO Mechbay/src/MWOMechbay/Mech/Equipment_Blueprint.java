package Mech;

public class Equipment_Blueprint
  extends Blueprint
{
  public String tech_base;
  public String hardpoint_type;
  public double tonnage;
  public int criticals;
  
  public Equipment_Blueprint(String paramString)
  {
    String[] arrayOfString = paramString.split(";");
    int i = 0;
    this.name = arrayOfString[(i++)];
    this.id = Integer.parseInt(arrayOfString[(i++)]);
    this.tech_base = arrayOfString[(i++)];
    this.hardpoint_type = arrayOfString[(i++)];
    this.tonnage = Double.parseDouble(arrayOfString[(i++)]);
    this.criticals = Integer.parseInt(arrayOfString[(i++)]);
  }
  
  public Crittable Get_Crittable()
  {
    Crittable localCrittable = new Crittable();
    localCrittable.is_locked = false;
    localCrittable.name = this.name;
    localCrittable.item_type = "Equipment";
    localCrittable.hardpoint_type = this.hardpoint_type;
    localCrittable.criticals = this.criticals;
    localCrittable.tonnage = this.tonnage;
    localCrittable.position = -1;
    localCrittable.reference = this;
    return localCrittable;
  }
}


/* Location:              C:\Users\Trevin\Dropbox\Public\MWO Mechbay.zip!\MWO_Mechbay.jar!\Mech\Equipment_Blueprint.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */