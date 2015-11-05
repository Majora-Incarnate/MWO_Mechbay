package Mech;

public class Weapon_Blueprint
  extends Blueprint
{
  public String tech_base;
  public double health;
  public int criticals;
  public String hardpoint_type;
  public String ammo_type;
  public double damage;
  public double thermal_damage;
  public double cooldown;
  public double heat;
  public double impulse;
  public int salvo_count;
  public int burst_count;
  public double spread;
  public int ammo_per_shot;
  public int minimum_range;
  public int effective_range;
  public int maximum_range;
  public double tonnage;
  public double duration;
  public int velocity;
  public double volley_delay;
  public double rate_of_fire;
  public boolean artemis_capable;
  public boolean apollo_capable;
  public boolean lock_capable;
  public int ghost_heat_threshold;
  public double ghost_heat_penalty;
  public int ghost_heat_group;
  public double jamming_chance;
  public double jammed_time;
  public double tag_duration;
  public double emp_duration;
  public double crit_modifier;
  public int shots_during_recycle;
  public boolean actuator_compatible;
  
  public Weapon_Blueprint(String paramString)
  {
    String[] arrayOfString = paramString.split(";");
    int i = 0;
    this.name = arrayOfString[(i++)];
    this.id = Integer.parseInt(arrayOfString[(i++)]);
    this.tech_base = arrayOfString[(i++)];
    this.health = Integer.parseInt(arrayOfString[(i++)]);
    this.criticals = Integer.parseInt(arrayOfString[(i++)]);
    this.hardpoint_type = arrayOfString[(i++)];
    this.actuator_compatible = Boolean.parseBoolean(arrayOfString[(i++)]);
    this.artemis_capable = Boolean.parseBoolean(arrayOfString[(i++)]);
    this.apollo_capable = Boolean.parseBoolean(arrayOfString[(i++)]);
    this.lock_capable = Boolean.parseBoolean(arrayOfString[(i++)]);
    this.salvo_count = Integer.parseInt(arrayOfString[(i++)]);
    this.burst_count = Integer.parseInt(arrayOfString[(i++)]);
    this.damage = Double.parseDouble(arrayOfString[(i++)]);
    this.thermal_damage = Double.parseDouble(arrayOfString[(i++)]);
    this.ghost_heat_group = Integer.parseInt(arrayOfString[(i++)]);
    this.ghost_heat_penalty = Double.parseDouble(arrayOfString[(i++)]);
    this.ghost_heat_threshold = Integer.parseInt(arrayOfString[(i++)]);
    this.impulse = Double.parseDouble(arrayOfString[(i++)]);
    this.heat = Double.parseDouble(arrayOfString[(i++)]);
    this.cooldown = Double.parseDouble(arrayOfString[(i++)]);
    this.ammo_type = arrayOfString[(i++)];
    this.ammo_per_shot = Integer.parseInt(arrayOfString[(i++)]);
    this.rate_of_fire = Double.parseDouble(arrayOfString[(i++)]);
    this.spread = Double.parseDouble(arrayOfString[(i++)]);
    this.minimum_range = Integer.parseInt(arrayOfString[(i++)]);
    this.effective_range = Integer.parseInt(arrayOfString[(i++)]);
    this.maximum_range = Integer.parseInt(arrayOfString[(i++)]);
    this.tonnage = Double.parseDouble(arrayOfString[(i++)]);
    this.duration = Double.parseDouble(arrayOfString[(i++)]);
    this.velocity = Integer.parseInt(arrayOfString[(i++)]);
    this.volley_delay = Double.parseDouble(arrayOfString[(i++)]);
    this.crit_modifier = Double.parseDouble(arrayOfString[(i++)]);
    i++;
    this.shots_during_recycle = Integer.parseInt(arrayOfString[(i++)]);
    this.jamming_chance = Double.parseDouble(arrayOfString[(i++)]);
    this.jammed_time = Double.parseDouble(arrayOfString[(i++)]);
    this.tag_duration = Double.parseDouble(arrayOfString[(i++)]);
    this.emp_duration = Double.parseDouble(arrayOfString[(i++)]);
  }
  
  public double Get_Effective_Damage()
  {
    return this.damage;
  }
  
  public double Get_DPS(double paramDouble)
  {
    return Get_Effective_Damage() / (this.cooldown * paramDouble + this.duration);
  }
  
  public double Get_HPS(double paramDouble)
  {
    return this.heat / (this.cooldown * paramDouble + this.duration);
  }
  
  public Crittable Get_Crittable()
  {
    Crittable localCrittable = new Crittable();
    localCrittable.is_locked = false;
    localCrittable.name = this.name;
    localCrittable.item_type = "Weapon";
    localCrittable.hardpoint_type = this.hardpoint_type;
    localCrittable.criticals = this.criticals;
    localCrittable.tonnage = this.tonnage;
    localCrittable.position = -1;
    localCrittable.reference = this;
    return localCrittable;
  }
}


/* Location:              C:\Users\Trevin\Dropbox\Public\MWO Mechbay.zip!\MWO_Mechbay.jar!\Mech\Weapon_Blueprint.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */