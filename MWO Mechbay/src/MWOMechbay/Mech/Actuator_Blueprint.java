package Mech;

public class Actuator_Blueprint
  extends Blueprint
{
  public String type;
  public int index;
  
  public Actuator_Blueprint(String paramString)
  {
    String[] arrayOfString = paramString.split(";");
    int i = 0;
    this.name = arrayOfString[(i++)];
    this.id = Integer.parseInt(arrayOfString[(i++)]);
    this.type = arrayOfString[(i++)];
    this.index = Integer.parseInt(arrayOfString[(i++)]);
  }
  
  public Crittable Get_Crittable()
  {
    Crittable localCrittable = new Crittable();
    localCrittable.is_locked = true;
    localCrittable.name = this.name;
    localCrittable.item_type = "Actuator";
    localCrittable.hardpoint_type = "None";
    localCrittable.criticals = 1;
    localCrittable.tonnage = 0.0D;
    localCrittable.position = -1;
    localCrittable.reference = this;
    return localCrittable;
  }
}


/* Location:              C:\Users\Trevin\Dropbox\Public\MWO Mechbay.zip!\MWO_Mechbay.jar!\Mech\Actuator_Blueprint.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */