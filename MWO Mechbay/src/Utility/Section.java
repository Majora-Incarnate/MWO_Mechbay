package Utility;

/**
 * @author Trevin
 */
public enum Section {
  HEAD("HD", "Head", 0),
  LEFT_ARM("LA", "Left Arm", 1);
  
  private final String short_name;
  private final String long_name;
  private final int index;
  
  private Section(String short_repr, String long_repr, int i) {
      short_name = short_repr;
      long_name = long_repr;
      index = i;
  }
  
  public int getNumberOfWeightClasses() {
      return WeightClass.values().length;
  }
  
  @Override
  public String toString() {
      return long_name;
  }
  
  public String getShortName() {
      return short_name;
  }
  
  public String getLongName() {
      return long_name;
  }
  
  public int toIndex() {
      return index;
  }
}
//  public static final int UNKNOWN_LOCATION = -1;
//  public static final int RIGHT_ARM = 0;
//  public static final int LEFT_ARM = 1;
//  public static final int RIGHT_TORSO = 2;
//  public static final int LEFT_TORSO = 3;
//  public static final int CENTER_TORSO = 4;
//  public static final int HEAD = 5;
//  public static final int RIGHT_LEG = 6;
//  public static final int LEFT_LEG = 7;
//  public static final int NUMBER_OF_CRITICAL_SECTIONS = 8;
//  public static final int RIGHT_REAR_TORSO = 0;
//  public static final int LEFT_REAR_TORSO = 1;
//  public static final int CENTER_REAR_TORSO = 2;
//  public static final int NUMBER_OF_REAR_SECTIONS = 3;
//  public static final String[] sectionNames = { "RA", "LA", "RT", "LT", "CT", "HD", "RL", "LL" };
