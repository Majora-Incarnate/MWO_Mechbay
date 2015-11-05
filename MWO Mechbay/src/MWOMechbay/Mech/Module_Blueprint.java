package Mech;

public class Module_Blueprint
  extends Blueprint
{
  public String type;
  public int[] unlock_xp;
  public long cost;
  public String description;
  
  public Module_Blueprint(String paramString)
  {
    String[] arrayOfString = paramString.split(";");
    int i = 0;
    this.name = arrayOfString[(i++)];
    this.id = Integer.parseInt(arrayOfString[(i++)]);
    this.type = arrayOfString[(i++)];
    this.unlock_xp = new int[5];
    for (int j = 0; j < 5; j++) {
      this.unlock_xp[j] = Integer.parseInt(arrayOfString[(i++)]);
    }
    this.cost = Long.parseLong(arrayOfString[(i++)]);
    this.description = arrayOfString[(i++)];
  }
}


/* Location:              C:\Users\Trevin\Dropbox\Public\MWO Mechbay.zip!\MWO_Mechbay.jar!\Mech\Module_Blueprint.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */