package Mech;

public class Chassis_Blueprint
{
  public String chassis_name;
  public String tech_base;
  public boolean is_omnimech;
  public double tonnage;
  public String movement_archetype;
  public double acceleration;
  public double deceleration;
  public double turn_rate;
  public double[][] movement_ranges;
  public double[][] movement_speeds;
  public int max_engine_rating;
  public int min_engine_rating;
  public double heat_generation_modifier;
  public double heat_dissipation_modifier;
  public int mech_modules;
  public int weapon_modules;
  public int consumable_modules;
  public String description;
  
  public Chassis_Blueprint(String paramString)
  {
    String[] arrayOfString = paramString.split(";");
    int i = 0;
    this.chassis_name = arrayOfString[(i++)];
    this.tech_base = arrayOfString[(i++)];
    this.is_omnimech = Boolean.parseBoolean(arrayOfString[(i++)]);
    this.tonnage = Double.parseDouble(arrayOfString[(i++)]);
    this.movement_archetype = arrayOfString[(i++)];
    this.acceleration = Double.parseDouble(arrayOfString[(i++)]);
    this.deceleration = Double.parseDouble(arrayOfString[(i++)]);
    this.turn_rate = Double.parseDouble(arrayOfString[(i++)]);
    this.movement_ranges = new double[2][2];
    this.movement_speeds = new double[2][2];
    for (int j = 0; j < 2; j++) {
      for (int k = 0; k < 2; k++) {
        this.movement_ranges[j][k] = Double.parseDouble(arrayOfString[(i++)]);
      }
    }
    this.max_engine_rating = Integer.parseInt(arrayOfString[(i++)]);
    this.min_engine_rating = Integer.parseInt(arrayOfString[(i++)]);
    this.heat_generation_modifier = Double.parseDouble(arrayOfString[(i++)]);
    this.heat_dissipation_modifier = Double.parseDouble(arrayOfString[(i++)]);
    this.mech_modules = Integer.parseInt(arrayOfString[(i++)]);
    this.weapon_modules = Integer.parseInt(arrayOfString[(i++)]);
    this.consumable_modules = Integer.parseInt(arrayOfString[(i++)]);
    this.description = arrayOfString[(i++)];
  }
  
  public void Print() {}
  
  public String toString()
  {
    return this.chassis_name;
  }
}