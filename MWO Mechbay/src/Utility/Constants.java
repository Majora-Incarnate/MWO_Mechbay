package Utility;

public class Constants
{
  public static final int DEFAULT_CRITICAL_HEIGHT = 12;
  public static final boolean DEFAULT_FRANKENMECHS = false;
  public static final boolean DEFAULT_MIXTECH = false;
  public static final boolean DEFAULT_FUTURETECH = false;
  public static final boolean DEFAULT_OMNI_RESTRICTIONS = true;
  public static final int MAX_CRITICALS = 78;
  public static final int LIGHT_INDEX = 0;
  public static final int MEDIUM_INDEX = 1;
  public static final int HEAVY_INDEX = 2;
  public static final int ASSAULT_INDEX = 3;
  public static final int NUMBER_OF_WEIGHT_CLASSES = 4;
  public static final int BALLISTIC_INDEX = 0;
  public static final int ENERGY_INDEX = 1;
  public static final int MISSILE_INDEX = 2;
  public static final int ALL_WEAPONS_INDEX = 3;
  public static final int NUMBER_OF_WEAPON_TYPES = 3;
  public static final int ALL_EQUIPMENT_INDEX = 0;
  public static final int AMMO_INDEX = 1;
  public static final int EQUIPMENT_INDEX = 2;
  public static final int EQUIPMENT_VECTOR_SIZE = 2;
  public static final String[] weaponCategories = { "Ballistic", "Energy", "Missile" };
  public static final String[] equipmentCategories = { "All Equipment", "Ammo", "Equipment", "Jump Jets" };
  public static final String[] weigthClasses = { "Light", "Medium", "Heavy", "Assault" };
  public static final String[] sectionNames = { "RA", "LA", "RT", "LT", "CT", "HD", "RL", "LL" };
  public static final double STANDARD_SPEED_MODIFIER = 16.2D;
  public static final double SPEED_TWEAK_MODIFIER = 1.075D;
  public static final int SENSOR_RANGE = 800;
  public static final int UNKNOWN_LOCATION = -1;
  public static final int RIGHT_ARM = 0;
  public static final int LEFT_ARM = 1;
  public static final int RIGHT_TORSO = 2;
  public static final int LEFT_TORSO = 3;
  public static final int CENTER_TORSO = 4;
  public static final int HEAD = 5;
  public static final int RIGHT_LEG = 6;
  public static final int LEFT_LEG = 7;
  public static final int NUMBER_OF_CRITICAL_SECTIONS = 8;
  public static final int RIGHT_REAR_TORSO = 0;
  public static final int LEFT_REAR_TORSO = 1;
  public static final int CENTER_REAR_TORSO = 2;
  public static final int NUMBER_OF_REAR_SECTIONS = 3;
  public static final int BALLISTIC_HARDPOINT_INDEX = 0;
  public static final int ENERGY_HARDPOINT_INDEX = 1;
  public static final int MISSILE_HARDPOINT_INDEX = 2;
  public static final int AMS_HARDPOINT_INDEX = 3;
  public static final int ECM_HARDPOINT_INDEX = 4;
  public static final int NUMBER_OF_HARDPOINT_TYPES = 5;
  public static final String[] HARDPOINT_TYPES = { "Ballistic", "Energy", "Missile", "AMS", "ECM" };
  public static final int BALLISTIC_TAB_INDEX = 0;
  public static final int ENERGY_TAB_INDEX = 1;
  public static final int MISSILE_TAB_INDEX = 2;
  public static final int AMMO_TAB_INDEX = 3;
  public static final int EQUIPMENT_TAB_INDEX = 4;
  public static final int QUEUED_TAB_INDEX = 5;
  public static final int NUMBER_OF_EQUIPMENT_TABS = 6;
  public static final int CHASSIS_PANEL_INDEX = 0;
  public static final int UPGRADES_PANEL_INDEX = 1;
  public static final int WEAPONS_PANEL_INDEX = 2;
  public static final int ARMOR_PANEL_INDEX = 3;
  public static final int QUIRKS_PANEL_INDEX = 0;
  public static final int COMPONENTS_PANEL_INDEX = 1;
  public static final int EQUIPMENT_PANEL_INDEX = 2;
  public static final int OTHER_PANEL_INDEX = 3;
  public static final int INTERNALS = 0;
  public static final int ARMOR = 1;
  public static final int INTERNALS_TOTAL = 8;
  public static final int ARMOR_TOTAL = 8;
  public static final int NUMBER_OF_MAIN_SECTION = 6;
  public static final int NUMBER_OF_LESSER_SECTION = 3;
  public static final int NUMBER_OF_MAIN_SECTION_CRITICALS = 12;
  public static final int NUMBER_OF_LESSER_SECTION_CRITICALS = 6;
  public static final int SHOULDER = 0;
  public static final int UPPER_ARM = 1;
  public static final int LOWER_ARM = 2;
  public static final int HAND = 3;
  public static final int UNKNOWN_CRITICAL_TYPE = 0;
  public static final int ACTUATOR_CRITICAL_TYPE = 1;
  public static final int WEAPON_CRITICAL_TYPE = 2;
  public static final int AMMO_CRITICAL_TYPE = 3;
  public static final int EQUIPMENT_CRITICAL_TYPE = 4;
  public static final int HEAT_SINK_CRITICAL_TYPE = 5;
  public static final int JUMP_JET_CRITICAL_TYPE = 6;
  public static final int ARMOR_CRITICAL_TYPE = 7;
  public static final int INTERNAL_CRITICAL_TYPE = 8;
  public static final int CASE_CRITICAL_TYPE = 9;
  public static final int ENGINE_CRITICAL_TYPE = 10;
  public static final int GYRO_CRITICAL_TYPE = 11;
  public static final int MYOMER_CRITICAL_TYPE = 12;
  public static final int COCKPIT_CRITICAL_TYPE = 13;
  public static final int TORSO_MANUEVERABILITY_INDEX = 0;
  public static final int ARM_MANUEVERABILITY_INDEX = 1;
  public static final int NUMBER_OF_MOVING_SECTIONS = 2;
  public static final int YAW_MANUEVERABILITY_INDEX = 0;
  public static final int PITCH_MANUEVERABILITY_INDEX = 1;
  public static final int AXIS_OF_MOVEMENT = 2;
  public static final int TINY_MOVEMENT_ARCHETYPE = 0;
  public static final int SMALL_MOVEMENT_ARCHETYPE = 1;
  public static final int MEDIUM_MOVEMENT_ARCHETYPE = 2;
  public static final int LARGE_MOVEMENT_ARCHETYPE = 3;
  public static final int HUGE_MOVEMENT_ARCHETYPE = 4;
  public static final int NUMBER_OF_MOVEMENT_ARCHETYPES = 5;
  public static final String[] MOVEMENT_ARCHETYPES = { "Tiny", "Small", "Medium", "Large", "Huge" };
  public static final double[] MIN_CLIMB_ANGLE = { 40.0D, 35.0D, 30.0D, 25.0D, 20.0D };
  public static final double MAX_CLIMB_ANGLE = 45.0D;
  public static final int CBILL_TO_MC_CONVERSION = 2500;
  public static final int CHAMPION_MC_CONVERSION = 40;
  public static final int HERO_MC_CONVERSION = 75;
  public static final int[][] INTERNALS_PER_SECTION = { { 6, 6, 10, 10, 12, 15, 8, 8 }, { 8, 8, 12, 12, 16, 15, 12, 12 }, { 10, 10, 14, 14, 20, 15, 14, 14 }, { 12, 12, 16, 16, 22, 15, 16, 16 }, { 12, 12, 20, 20, 24, 15, 20, 20 }, { 14, 14, 22, 22, 28, 15, 22, 22 }, { 16, 16, 24, 24, 32, 15, 24, 24 }, { 18, 18, 26, 26, 36, 15, 26, 26 }, { 20, 20, 28, 28, 40, 15, 28, 28 }, { 20, 20, 30, 30, 42, 15, 30, 30 }, { 22, 22, 30, 30, 44, 15, 30, 30 }, { 24, 24, 32, 32, 46, 15, 32, 32 }, { 26, 26, 34, 34, 50, 15, 34, 34 }, { 28, 28, 36, 36, 54, 15, 36, 36 }, { 30, 30, 38, 38, 58, 15, 38, 38 }, { 32, 32, 40, 40, 60, 15, 40, 40 }, { 34, 34, 42, 42, 62, 15, 42, 42 } };
  public static final double[] ENGINE_TONNAGES = { 0.0D, 0.5D, 0.5D, 0.5D, 0.5D, 0.5D, 1.0D, 1.0D, 1.0D, 1.0D, 1.5D, 1.5D, 1.5D, 2.0D, 2.0D, 2.0D, 2.5D, 2.5D, 3.0D, 3.0D, 3.0D, 3.5D, 3.5D, 4.0D, 4.0D, 4.0D, 4.5D, 4.5D, 5.0D, 5.0D, 5.5D, 5.5D, 6.0D, 6.0D, 6.0D, 7.0D, 7.0D, 7.5D, 7.5D, 8.0D, 8.5D, 8.5D, 9.0D, 9.5D, 10.0D, 10.0D, 10.5D, 11.0D, 11.5D, 12.0D, 12.5D, 13.0D, 13.5D, 14.0D, 14.5D, 15.5D, 16.0D, 16.5D, 17.5D, 18.0D, 19.0D, 19.5D, 20.5D, 21.5D, 22.5D, 23.5D, 24.5D, 25.5D, 27.0D, 28.5D, 29.5D, 31.5D, 33.0D, 34.5D, 36.5D, 38.5D, 41.0D, 43.5D, 46.0D, 49.0D, 52.5D };
  public static final int INTERNALS_TO_ARMOR_MODIFIER = 2;
  public static final int IS_TECH_BASE = 0;
  public static final int CLAN_TECH_BASE = 1;
  public static final int NUMBER_OF_TECH_BASES = 2;
  public static final String[] TECH_BASE_NAMES = { "IS", "CLAN" };
  public static final String mechbayVersion = "3.0.00";
  public static final String CBILL_FORMAT = "#,### C-Bills";
  public static final String MC_FORMAT = "#,### MC";
  public static final String SPEED_FORMAT = "#.## kph";
  
  private Constants() throws Exception {
      throw new Exception();
  }
}


/* Location:              C:\Users\Trevin\Dropbox\Public\MWO Mechbay.zip!\MWO_Mechbay.jar!\Utility\Constants.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */