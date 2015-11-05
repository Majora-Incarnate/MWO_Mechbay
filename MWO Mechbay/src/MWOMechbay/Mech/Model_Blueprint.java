package Mech;

public class Model_Blueprint
{
  public String chassis_name;
  public String model_name;
  public int id;
  public boolean unconfirmed;
  public boolean unreleased;
  public boolean champion_model;
  public boolean hero_model;
  public long cbill_cost;
  public int mc_cost;
  public double acceleration_override;
  public double deceleration_override;
  public double turn_rate_override;
  public double[][] movement_range_overrides;
  public double[][] movement_speed_overrides;
  public int max_engine_rating_override;
  public double heat_transfer_modifier;
  public int mech_modules_override;
  public int weapon_modules_override;
  public int consumable_modules_override;
  public String[] section_models;
  public String engine_type;
  public int engine_rating;
  public String armor_type;
  public String structure_type;
  public String gyro_type;
  public String heatsink_type;
  public int heatsink_count;
  public String cockpit_type;
  public String jumpjet_type;
  public String myomer_type;
  
  public Model_Blueprint(String paramString)
  {
    String[] arrayOfString = paramString.split(";");
    int i = 0;
    this.chassis_name = arrayOfString[(i++)];
    this.id = Integer.parseInt(arrayOfString[(i++)]);
    this.model_name = arrayOfString[(i++)];
    this.unconfirmed = Boolean.parseBoolean(arrayOfString[(i++)]);
    this.unreleased = Boolean.parseBoolean(arrayOfString[(i++)]);
    this.champion_model = Boolean.parseBoolean(arrayOfString[(i++)]);
    this.hero_model = Boolean.parseBoolean(arrayOfString[(i++)]);
    this.cbill_cost = Long.parseLong(arrayOfString[(i++)]);
    this.acceleration_override = Double.parseDouble(arrayOfString[(i++)]);
    this.deceleration_override = Double.parseDouble(arrayOfString[(i++)]);
    this.turn_rate_override = Double.parseDouble(arrayOfString[(i++)]);
    this.movement_range_overrides = new double[2][2];
    this.movement_speed_overrides = new double[2][2];
    this.section_models = new String[8];
    for (int j = 0; j < 2; j++) {
      for (int k = 0; k < 2; k++) {
        this.movement_range_overrides[j][k] = Double.parseDouble(arrayOfString[(i++)]);
      }
    }
    this.max_engine_rating_override = Integer.parseInt(arrayOfString[(i++)]);
    this.heat_transfer_modifier = Double.parseDouble(arrayOfString[(i++)]);
    this.mech_modules_override = Integer.parseInt(arrayOfString[(i++)]);
    this.weapon_modules_override = Integer.parseInt(arrayOfString[(i++)]);
    this.consumable_modules_override = Integer.parseInt(arrayOfString[(i++)]);
    for (j = 0; j < 8; j++) {
      this.section_models[j] = arrayOfString[(i++)];
    }
    this.engine_type = arrayOfString[(i++)];
    this.engine_rating = Integer.parseInt(arrayOfString[(i++)]);
    this.armor_type = arrayOfString[(i++)];
    this.structure_type = arrayOfString[(i++)];
    this.heatsink_type = arrayOfString[(i++)];
    this.heatsink_count = Integer.parseInt(arrayOfString[(i++)]);
    this.gyro_type = arrayOfString[(i++)];
    this.cockpit_type = arrayOfString[(i++)];
    this.jumpjet_type = arrayOfString[(i++)];
    this.myomer_type = arrayOfString[(i++)];
  }
  
  public void Print() {}
  
  public String toString()
  {
    return this.model_name;
  }
}


/* Location:              C:\Users\Trevin\Dropbox\Public\MWO Mechbay.zip!\MWO_Mechbay.jar!\Mech\Model_Blueprint.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */