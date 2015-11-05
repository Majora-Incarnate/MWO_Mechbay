package Mech;

public class Section_Blueprint
{
  public String chassis;
  public String model;
  public String section;
  public int criticals;
  public int[] hardpoints;
  public double structure_quirk;
  public double armor_quirk;
  public double damage_reduction;
  public int minimum_actuator_count;
  public int maximum_actuator_count;
  public String actuator_type;
  public int minimum_jump_jet_modifier;
  public int maximum_jump_jet_modifier;
  public int hardwired_heatsinks;
  public int hardwired_armor;
  public int hardwired_structure;
  
  public Section_Blueprint(String paramString)
  {
    String[] arrayOfString = paramString.split(";");
    int i = 0;
    this.chassis = arrayOfString[(i++)];
    this.model = arrayOfString[(i++)];
    this.section = arrayOfString[(i++)];
    this.criticals = Integer.parseInt(arrayOfString[(i++)]);
    this.hardpoints = new int[5];
    for (int j = 0; j < 5; j++) {
      this.hardpoints[j] = Integer.parseInt(arrayOfString[(i++)]);
    }
    this.structure_quirk = Double.parseDouble(arrayOfString[(i++)]);
    this.armor_quirk = Double.parseDouble(arrayOfString[(i++)]);
    this.damage_reduction = Double.parseDouble(arrayOfString[(i++)]);
    this.minimum_actuator_count = Integer.parseInt(arrayOfString[(i++)]);
    this.maximum_actuator_count = Integer.parseInt(arrayOfString[(i++)]);
    this.actuator_type = arrayOfString[(i++)];
    this.minimum_jump_jet_modifier = Integer.parseInt(arrayOfString[(i++)]);
    this.maximum_jump_jet_modifier = Integer.parseInt(arrayOfString[(i++)]);
    this.hardwired_heatsinks = Integer.parseInt(arrayOfString[(i++)]);
    this.hardwired_armor = Integer.parseInt(arrayOfString[(i++)]);
    this.hardwired_structure = Integer.parseInt(arrayOfString[(i++)]);
  }
  
  public void Print() {}
  
  public String toString()
  {
    return this.model;
  }
}


/* Location:              C:\Users\Trevin\Dropbox\Public\MWO Mechbay.zip!\MWO_Mechbay.jar!\Mech\Section_Blueprint.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */