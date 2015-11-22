package Utility;

/**
 * @author Trevin
 */
public enum WeightClass {
  LIGHT("Light", 0), MEDIUM("Medium", 1), HEAVY("Heavy", 2), ASSAULT("Assault", 3);
  
  private final String title;
  private final int index;
  
  private WeightClass(String repr, int i) {
      title = repr;
      index = i;
  }
  
  public int getNumberOfWeightClasses() {
      return WeightClass.values().length;
  }
  
  @Override
  public String toString() {
      return title;
  }
  
  public int toIndex() {
      return index;
  }
}
