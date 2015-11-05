package Mech;

public class Engine_Blueprint
  extends Blueprint
{
  public String tech_base;
  public double tonnage_modifier;
  public int center_torso_criticals;
  public int side_torso_criticals;
  public double cost_modifier;
  public double heat_sink_cost_modifier;
  
  public Engine_Blueprint(String paramString)
  {
    String[] arrayOfString = paramString.split(";");
    int i = 0;
    this.name = arrayOfString[(i++)];
    this.id = Integer.parseInt(arrayOfString[(i++)]);
    this.tech_base = arrayOfString[(i++)];
    this.center_torso_criticals = Integer.parseInt(arrayOfString[(i++)]);
    this.side_torso_criticals = Integer.parseInt(arrayOfString[(i++)]);
    this.tonnage_modifier = Double.parseDouble(arrayOfString[(i++)]);
    this.cost_modifier = Double.parseDouble(arrayOfString[(i++)]);
    this.heat_sink_cost_modifier = Double.parseDouble(arrayOfString[(i++)]);
  }
  
  public int Get_Cost(int paramInt)
  {
    double d = paramInt * this.cost_modifier;
    if (paramInt < 250) {
      d -= 0.0D * this.heat_sink_cost_modifier;
    }
    return (int)d;
  }
  
  public int Get_Criticals()
  {
    return this.side_torso_criticals * 2 + this.center_torso_criticals;
  }
  
  public int Get_Heat_Sink_Capacity(int paramInt)
  {
    return paramInt / 25;
  }
  
  public double Get_Speed(double paramDouble, int paramInt)
  {
    return paramInt * 16.2D / paramDouble;
  }
  
  public boolean Has_Side_Torso_Criticals()
  {
    return this.side_torso_criticals > 0;
  }
  
  public double Get_Tonnage(int paramInt)
  {
    double d = Math.ceil(Utility.Constants.ENGINE_TONNAGES[(paramInt / 5)] * this.tonnage_modifier / 0.5D) * 0.5D;
    return d;
  }
  
  public void Print() {}
  
  public Crittable Get_Crittable()
  {
    Crittable localCrittable = new Crittable();
    localCrittable.is_locked = true;
    localCrittable.name = this.name;
    localCrittable.item_type = "Engine";
    localCrittable.hardpoint_type = "None";
    localCrittable.criticals = this.center_torso_criticals;
    localCrittable.tonnage = 0.0D;
    localCrittable.position = -1;
    localCrittable.reference = this;
    return localCrittable;
  }
  
  public Crittable Get_Crittable(boolean paramBoolean)
  {
    if (!paramBoolean) {
      return null;
    }
    Crittable localCrittable = new Crittable();
    localCrittable.is_locked = true;
    localCrittable.name = this.name;
    localCrittable.item_type = "Engine";
    localCrittable.hardpoint_type = "None";
    localCrittable.criticals = this.side_torso_criticals;
    localCrittable.tonnage = 0.0D;
    localCrittable.position = -1;
    localCrittable.reference = this;
    return localCrittable;
  }
}


/* Location:              C:\Users\Trevin\Dropbox\Public\MWO Mechbay.zip!\MWO_Mechbay.jar!\Mech\Engine_Blueprint.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */