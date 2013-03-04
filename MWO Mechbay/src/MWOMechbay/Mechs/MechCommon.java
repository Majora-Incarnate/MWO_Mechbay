package MWOMechbay.Mechs;

/*
 @author Nemesis
 */
public interface MechCommon
{
    final static int NUMBER_OF_EQUIPABLE_SECTIONS = 6;
    final static int NUMBER_OF_CRITICAL_SECTIONS = 8;
    final static int NUMBER_OF_SECTIONS = 11;
    final static int UNKNOWN_LOCATION = -1;
    final static int RIGHT_ARM = 0;
    final static int LEFT_ARM = 1;
    final static int RIGHT_TORSO = 2;
    final static int LEFT_TORSO = 3;
    final static int CENTER_TORSO = 4;
    final static int HEAD = 5;
    final static int RIGHT_LEG = 6;
    final static int LEFT_LEG = 7;
    final static int RIGHT_REAR_TORSO = 8;
    final static int LEFT_REAR_TORSO = 9;
    final static int CENTER_REAR_TORSO = 10;
    final static int BOTH_SIDE_TORSOS = 11;
    final static int BOTH_ARMS = 12;
    
    final static int NUMBER_OF_HARDPOINT_TYPES = 4;
    final static int BALLISTIC = 0;
    final static int ENERGY = 1;
    final static int MISSILE = 2;
    final static int AMS = 3;
    final static int OMNI = 4;
    
    final static int AMMO = 3;
    final static int OTHER = 4;
    final static int SELECTED = 5;
    
    final static double SRM_DAMAGE = 2.5;
    final static double LRM_DAMAGE = 1.8;
    final static double SRM_RECYCLE = 3.5;
    final static double LRM_RECYCLE = 3.25;
    final static double SRM_DELAY = 0.25;
    final static double LRM_DELAY = 0.5;
    final static double LRM_IMPULSE = 0.8;
    final static int SRM_RANGE = 270;
    final static int MRM_RANGE = 450;
    final static int LRM_MIN_RANGE = 180;
    final static int ENHANCED_LRM_MIN_RANGE = 90;
    final static int LRM_RANGE = 630;
    final static int LRM_MAX_RANGE = 1000;
    final static int EXTENDED_LRM_MIN_RANGE = 300;
    final static int EXTENDED_LRM_RANGE = 1140;
    final static int EXTENDED_LRM_MAX_RANGE = 1140;
    final static int SRM_SPEED = 300;
    final static int STREAK_SRM_SPEED = 200;
    final static int LRM_SPEED = 100;
    
    final static int ARTEMIS_IV_CRITICALS = 1;
    final static int ARTEMIS_IV_COST = 1;
    final static double ARTEMIS_IV_TONNAGE = 1.0;
    
    final static int LASER_RANGE_MODIFIER = 2;
    final static int PROJECTILE_RANGE_MODIFIER = 3;
    
    final static int INTERNALS = 0;
    final static int ARMOR = 1;
    final static int INTERNALS_TOTAL = 8;
    final static int ARMOR_TOTAL = 8;
    
    final static int NUMBER_OF_MAIN_SECTION = 6;
    final static int NUMBER_OF_LESSER_SECTION = 3;
    final static int NUMBER_OF_MAIN_SECTION_CRITICALS = 12;
    final static int NUMBER_OF_LESSER_SECTION_CRITICALS = 6;
    
    final static int BALLISTIC_MAX_RANGE_MODIFIER = 3;
    final static int ENERGY_MAX_RANGE_MODIFIER = 2;
    
    final static int LOWER_ARM_ACTUATOR = 0;
    final static int HAND_ACTUATOR = 1;
    
    final static int UNKNOWN_ITEM_TYPE = 0;
    final static int COMPONENT_ITEM_TYPE = 1;
    final static int WEAPON_ITEM_TYPE = 2;
    final static int AMMO_ITEM_TYPE = 3;
    final static int EQUIPMENT_ITEM_TYPE = 4;
    final static int HEAT_SINK_ITEM_TYPE = 5;
    final static int JUMP_JET_ITEM_TYPE = 6;
    final static int ARMOR_ITEM_TYPE = 7;
    final static int INTERNAL_ITEM_TYPE = 8;
    final static int CASE_ITEM_TYPE = 9;
    final static int ENGINE_ITEM_TYPE = 10;
    final static int OTHER_ITEM_TYPE = 11;
    
    final static int TORSO = 0;
    final static int ARM = 1;
    final static int NUMBER_OF_MOVING_SECTIONS = 2;
    final static int YAW = 0;
    final static int PITCH = 1;
    final static int AXIS_OF_MOVEMENT = 2;
    
    final static double DOUBLE_HEAT_SINK_DISSIPATION = 1.4;
}
