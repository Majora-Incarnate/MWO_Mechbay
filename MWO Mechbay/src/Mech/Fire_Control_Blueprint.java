package Mech;

public class Fire_Control_Blueprint
  extends Blueprint
{
  public String tech_base;
  public double spread_modifier;
  public int criticals_modifier;
  public double tonnage_modifier;
  public double cost_modifier;
  public int upgrade_cost;
  
  public Fire_Control_Blueprint(String paramString)
  {
    String[] arrayOfString = paramString.split(";");
    int i = 0;
    this.name = arrayOfString[(i++)];
    this.id = Integer.parseInt(arrayOfString[(i++)]);
    this.tech_base = arrayOfString[(i++)];
    this.criticals_modifier = Integer.parseInt(arrayOfString[(i++)]);
    this.tonnage_modifier = Double.parseDouble(arrayOfString[(i++)]);
    this.spread_modifier = Double.parseDouble(arrayOfString[(i++)]);
    this.cost_modifier = Double.parseDouble(arrayOfString[(i++)]);
    this.upgrade_cost = Integer.parseInt(arrayOfString[(i++)]);
  }
}


/* Location:              C:\Users\Trevin\Dropbox\Public\MWO Mechbay.zip!\MWO_Mechbay.jar!\Mech\Fire_Control_Blueprint.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */