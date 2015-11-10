package Mech;

public class Ammo_Blueprint
  extends Blueprint
{
  public String tech_base;
  public int health;
  public int criticals;
  public String type;
  public double damage;
  public double tonnage;
  public int ammo_count;
  public boolean artemis_capable;
  public boolean apollo_capable;
  
  public Ammo_Blueprint(String paramString)
  {
    String[] arrayOfString = paramString.split(";");
    int i = 0;
    this.name = arrayOfString[(i++)];
    this.id = Integer.parseInt(arrayOfString[(i++)]);
    this.tech_base = arrayOfString[(i++)];
    this.artemis_capable = Boolean.parseBoolean(arrayOfString[(i++)]);
    this.apollo_capable = Boolean.parseBoolean(arrayOfString[(i++)]);
    this.health = Integer.parseInt(arrayOfString[(i++)]);
    this.criticals = Integer.parseInt(arrayOfString[(i++)]);
    this.tonnage = Double.parseDouble(arrayOfString[(i++)]);
    this.type = arrayOfString[(i++)];
    this.ammo_count = Integer.parseInt(arrayOfString[(i++)]);
    this.damage = Double.parseDouble(arrayOfString[(i++)]);
  }
  
  public Crittable Get_Crittable()
  {
    Crittable localCrittable = new Crittable();
    localCrittable.is_locked = false;
    localCrittable.name = this.name;
    localCrittable.item_type = "Ammo";
    localCrittable.hardpoint_type = "None";
    localCrittable.criticals = this.criticals;
    localCrittable.tonnage = this.tonnage;
    localCrittable.position = -1;
    localCrittable.reference = this;
    return localCrittable;
  }
}


/* Location:              C:\Users\Trevin\Dropbox\Public\MWO Mechbay.zip!\MWO_Mechbay.jar!\Mech\Ammo_Blueprint.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */