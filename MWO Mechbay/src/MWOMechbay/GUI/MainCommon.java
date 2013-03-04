package MWOMechbay.GUI;

/**
 *
 * @author Quicksilver
 */
public interface MainCommon {
    //<editor-fold defaultstate="collapsed" desc="Mech Combo Box Constants">
    final static int ATLAS_INDEX = 1;
    final static int AWESOME_INDEX = ATLAS_INDEX + 1;
    final static int BLACKJACK_INDEX = AWESOME_INDEX + 1;
    final static int CATAPHRACT_INDEX = BLACKJACK_INDEX + 1;
    final static int CATAPULT_INDEX = CATAPHRACT_INDEX + 1;
    final static int CENTURION_INDEX = CATAPULT_INDEX + 1;
    final static int CICADA_INDEX = CENTURION_INDEX + 1;
    final static int COMMANDO_INDEX = CICADA_INDEX + 1;
    final static int DRAGON_INDEX = COMMANDO_INDEX + 1;
    final static int FLEA_INDEX = DRAGON_INDEX + 1;
    final static int GRAND_DRAGON_INDEX = FLEA_INDEX + 1;
    final static int HIGHLANDER_INDEX = GRAND_DRAGON_INDEX + 1;
    final static int HUNCHBACK_INDEX = HIGHLANDER_INDEX + 1;
    final static int JAGERMECH_INDEX = HUNCHBACK_INDEX + 1;
    final static int JENNER_INDEX = JAGERMECH_INDEX + 1;
    //final static int NEMESIS_INDEX = JENNER_INDEX + 1;
    final static int ORION_INDEX = JENNER_INDEX + 1;
    final static int RAVEN_INDEX = ORION_INDEX + 1;
    final static int SPIDER_INDEX = RAVEN_INDEX + 1;
    final static int STALKER_INDEX = SPIDER_INDEX + 1;
    final static int TREBUCHET_INDEX = STALKER_INDEX + 1;
    
    final static int DEFAULT_INDEX = 0;
    final static int LIGHT_INDEX = 1;
    final static int MEDIUM_INDEX = 2;
    final static int HEAVY_INDEX = 3;
    final static int ASSAULT_INDEX = 4;
    
    final static int COM_1B_INDEX = 1;
    final static int COM_1C_INDEX = 2;
    final static int COM_1D_INDEX = 3;
    final static int COM_2D_INDEX = 4;
    final static int COM_3A_INDEX = 5;
    final static int COM_5S_INDEX = 6;
    final static int COM_DK_INDEX = 7;
    
    final static int SDR_5D_INDEX = 1;
    final static int SDR_5K_INDEX = 2;
    final static int SDR_5V_INDEX = 3;
    
    final static int JR7_A_INDEX = 1;
    final static int JR7_D_INDEX = 2;
    final static int JR7_F_INDEX = 3;
    final static int JR7_K_INDEX = 4;
    
    final static int RVN_2X_INDEX = 1;
    final static int RVN_3L_INDEX = 2;
    final static int RVN_4X_INDEX = 3;
    
    final static int CDA_2A_INDEX = 1;
    final static int CDA_2B_INDEX = 2;
    final static int CDA_3C_INDEX = 3;
    final static int CDA_3M_INDEX = 4;
    final static int CDA_X_5_INDEX = 5;
    
    final static int BJ_1_INDEX = 1;
    final static int BJ_1DB_INDEX = 2;
    final static int BJ_1DC_INDEX = 3;
    final static int BJ_1X_INDEX = 4;
    final static int BJ_3_INDEX = 5;
    
    final static int CN9_A_INDEX = 1;
    final static int CN9_AH_INDEX = 2;
    final static int CN9_AL_INDEX = 3;
    final static int CN9_D_INDEX = 4;
    final static int CN9_YLW_INDEX = 5;
    
    final static int HBK_4G_INDEX = 1;
    final static int HBK_4H_INDEX = 2;
    final static int HBK_4J_INDEX = 3;
    final static int HBK_4N_INDEX = 4;
    final static int HBK_4P_INDEX = 5;
    final static int HBK_4SP_INDEX = 6;
    final static int HBK_5M_INDEX = 7;
    
    final static int TBT_3C_INDEX = 1;
    final static int TBT_5J_INDEX = 2;
    final static int TBT_5N_INDEX = 3;
    final static int TBT_5S_INDEX = 4;
    final static int TBT_5K_INDEX = 5;
    final static int TBT_7M_INDEX = 6;
    
    final static int DGN_1C_INDEX = 1;
    final static int DGN_1N_INDEX = 2;
    final static int DGN_5N_INDEX = 3;
    final static int DGN_FANG_INDEX = 4;
    final static int DGN_FLAME_INDEX = 5;
    
    final static int DRG_1G_INDEX = 1;
    final static int DRG_5K_INDEX = 2;
    final static int DRG_5K_DC_INDEX = 3;
    
    final static int CPLT_A1_INDEX = 1;
    final static int CPLT_C1_INDEX = 2;
    final static int CPLT_C4_INDEX = 3;
    final static int CPLT_K2_INDEX = 4;
    final static int CPLT_K3_INDEX = 5;
    
    final static int JM6_A_INDEX = 1;
    final static int JM6_DD_INDEX = 2;
    final static int JM6_S_INDEX = 3;
    
    final static int CTF_1X_INDEX = 1;
    final static int CTF_2X_INDEX = 2;
    final static int CTF_3D_INDEX = 3;
    final static int CTF_3L_INDEX = 4;
    final static int CTF_4X_INDEX = 5;
    final static int CTF_IM_INDEX = 6;
    
    final static int AWS_8Q_INDEX = 1;
    final static int AWS_8R_INDEX = 2;
    final static int AWS_8T_INDEX = 3;
    final static int AWS_8V_INDEX = 4;
    final static int AWS_9M_INDEX = 5;
    final static int AWS_PB_INDEX = 6;
    
    final static int STK_3F_INDEX = 1;
    final static int STK_3H_INDEX = 2;
    final static int STK_4N_INDEX = 3;
    final static int STK_4P_INDEX = 4;
    final static int STK_5M_INDEX = 5;
    final static int STK_5S_INDEX = 6;
    
    final static int AS7_D_INDEX = 1;
    final static int AS7_D_DC_INDEX = 2;
    final static int AS7_K_INDEX = 3;
    final static int AS7_RS_INDEX = 4;
    final static int AS7_S_INDEX = 5;
    
    final static int FLE_4_INDEX = 1;
    final static int FLE_15_INDEX = 2;
    final static int FLE_17_INDEX = 3;
    
    final static int HGN_732_INDEX = 1;
    final static int HGN_733_INDEX = 2;
    final static int HGN_733C_INDEX = 3;
    final static int HGN_733P_INDEX = 4;
    
    /*final static int NMS_1X_INDEX = 1;
    final static int NMS_3X_INDEX = 2;
    final static int NMS_5X_INDEX = 3;
    final static int NMS_10X_INDEX = 4;
    
    final static String[] nemesisModels = 
    {   "",
        "NMS-1X",
        "NMS-3X",
        "NMS-5X",
        "NMS-10X"  };*/
    
    final static int ON1_K_INDEX = 1;
    final static int ON1_M_INDEX = 2;
    final static int ON1_V_INDEX = 3;
    final static int ON1_VA_INDEX = 4;
    final static int ON1_V_DC_INDEX = 5;
    
    final static String[] chassisTypes = 
    {   "",
        "Atlas",
        "Awesome",
        "Blackjack",
        "Cataphract",
        "Catapult",
        "Centurion",
        "Cicada",
        "Commando",
        "Dragon",
        "Flea",
        "Grand Dragon",
        "Highlander",
        "Hunchback",
        "JagerMech",
        "Jenner",
        //"Nemesis",
        "Orion",
        "Raven",
        "Spider",
        "Stalker",
        "Trebuchet"  };
    
    final static String[] atlasModels = 
    {   "",
        "AS7-D",
        "AS7-D-DC",
        "AS7-K",
        "AS7-RS",
        "AS7-S"  };
    
    final static String[] awesomeModels = 
    {   "",
        "AWS-8Q",
        "AWS-8R",
        "AWS-8T",
        "AWS-8V",
        "AWS-9M",
        "AWS-PB"  };
    
    final static String[] blackjackModels = 
    {   "",
        "BJ-1",
        "BJ-1DB",
        "BJ-1DC",
        "BJ-1X",
        "BJ-3"  };
    
    final static String[] cataphractModels = 
    {   "",
        "CTF-1X",
        "CTF-2X",
        "CTF-3D",
        "CTF-3L",
        "CTF-4X",
        "CTF-IM"  };
    
    final static String[] catapultModels = 
    {   "",
        "CPLT-A1",
        "CPLT-C1",
        "CPLT-C4",
        "CPLT-K2",
        "CPLT-K3"  };
    
    final static String[] centurionModels = 
    {   "",
        "CN9-A",
        "CN9-AH",
        "CN9-AL",
        "CN9-D",
        "CN9-YLW"  };
    
    final static String[] cicadaModels = 
    {   "",
        "CDA-2A",
        "CDA-2B",
        "CDA-3C",
        "CDA-3M",
        "CDA-X-5"  };
    
    final static String[] commandoModels = 
    {   "",
        "COM-1B",
        "COM-1C",
        "COM-1D",
        "COM-2D",
        "COM-3A",
        "COM-5S",
        "COM-DK"  };
    
    final static String[] dragonModels = 
    {   "",
        "DGN-1C",
        "DGN-1N",
        "DGN-5N",
        "DGN-FANG",
        "DGN-FLAME"  };
    
    final static String[] fleaModels = 
    {   "",
        "FLE-4",
        "FLE-15",
        "FLE-17"  };
    
    final static String[] grandDragonModels = 
    {   "",
        "DRG-1G",
        "DRG-5K",
        "DRG-5K-DC"  };
    
    final static String[] highlanderModels = 
    {   "",
        "HGN-732",
        "HGN-733",
        "HGN-733C",
        "HGN-733P"  };
    
    final static String[] hunchbackModels = 
    {   "",
        "HBK-4G",
        "HBK-4H",
        "HBK-4J",
        "HBK-4N",
        "HBK-4P",
        "HBK-4SP",
        "HBK-5M"  };
    
    final static String[] jagermechModels = 
    {   "",
        "JM6-A",
        "JM6-DD",
        "JM6-S"  };
    
    final static String[] jennerModels = 
    {   "",
        "JR7-A",
        "JR7-D",
        "JR7-F",
        "JR7-K"  };
    
    final static String[] orionModels = 
    {   "",
        "ON1-K",
        "ON1-M",
        "ON1-V",
        "ON1-VA",
        "ON1-V-DC"  };
    
    final static String[] ravenModels = 
    {   "",
        "RVN-2X",
        "RVN-3L",
        "RVN-4X"  };
    
    final static String[] spiderModels = 
    {   "",
        "SPD-5D",
        "SPD-5K",
        "SPD-5V"  };
    
    final static String[] stalkerModels = 
    {   "",
        "STK-3F",
        "STK-3H",
        "STK-4N",
        "STK-4P",
        "STK-5M",
        "STK-5S"  };
    
    final static String[] trebuchetModels = 
    {   "",
        "TBT-3C",
        "TBT-5J",
        "TBT-5N",
        "TBT-5S",
        "TBT-7K",
        "TBT-7M" };
    
    final static String chassisVariants = "Stock";
    
    final static String DEFAULT_LIGHT_ICON = "/MWOMechbay/Resources/Default_Light.gif";
    final static String DEFAULT_MEDIUM_ICON = "/MWOMechbay/Resources/Default_Medium.gif";
    final static String DEFAULT_HEAVY_ICON = "/MWOMechbay/Resources/Default_Heavy.gif";
    final static String DEFAULT_ASSAULT_ICON = "/MWOMechbay/Resources/Default_Assault.gif";
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Other Mechlab Constants">
    final static int STANDARD_ARMOR_INDEX = 0;
    final static int FERRO_FIBROUS_ARMOR_INDEX = 1;
    
    final static int STANDARD_ENGINE_INDEX = 0;
    final static int XL_ENGINE_INDEX = 1;
    
    final static int STANDARD_HEAT_SINK_INDEX = 0;
    final static int DOUBLE_HEAT_SINK_INDEX = 1;
    
    final static int STANDARD_INTERNALS_INDEX = 0;
    final static int ENDO_STEEL_INTERNALS_INDEX = 1;
    
    final static int STANDARD_GYRO_INDEX = 0;
    
    final static int STANDARD_COCKPIT_INDEX = 0;
    final static int COMMAND_CONSOLE_INDEX = 1;
    
    final static int ALL_WEAPONS_INDEX = 0;
    final static int BALLISTIC_INDEX = 1;
    final static int ENERGY_INDEX = 2;
    final static int MISSILE_INDEX = 3;
    final static int SELECTED_INDEX = 4;
    final static int WEAPON_VECTOR_SIZE = SELECTED_INDEX;
    
    final static int ALL_EQUIPMENT_INDEX = 0;
    final static int AMMO_INDEX = 1;
    final static int EQUIPMENT_INDEX = 2;
    final static int EQUIPMENT_VECTOR_SIZE = EQUIPMENT_INDEX;
    
    final static String[] armorTypes = 
    {   "Standard Armor",
        "Ferro Fibrous Armor"  };
    
    final static String[] engineTypes = 
    {   "Standard Engine",
        "XL Engine"  };
    
    final static String[] heatSinkTypes = 
    {   "Standard Heat Sink",
        "Double Heat Sink"  };
    
    final static String[] gyroTypes = 
    {   "Standard Gyro" };
    
    final static String[] internalTypes = 
    {   "Standard Internals",
        "Endo Steel Internals"  };
    
    final static String[] cockpitTypes = 
    {   "Standard Cockpit",
        "Command Console"  };
    
    final static String[] artemisTypes = 
    {   "Standard FCS",
        "Artemis IV FCS"    };
    
    final static String[] myomerTypes = 
    {   "Standard Myomer",
        "MASC"    };
    
    final static String[] weaponCategories = 
    {   "All Weapons",
        "Ballistic",
        "Energy",
        "Missile"  };
    
    final static String[] equipmentCategories = 
    {   "All Equipment",
        "Ammo",
        "Equipment",
        "Jump Jets"  };
    //</editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Other Constants">
    final static double STANDARD_SPEED_MODIFIER = 16.2;
    final static double MASC_SPEED_MODIFIER = 21.6;
    final static double SPEED_TWEAK_MODIFIER = 1.075;
    final static int SENSOR_RANGE = 800;
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
    
    final static int ARTEMIS_IV_CRITICALS = 1;
    final static int ARTEMIS_IV_COST = 1;
    final static double ARTEMIS_IV_TONNAGE = 1.0;
    
    final static int NUMBER_OF_MAIN_SECTION = 6;
    final static int NUMBER_OF_LESSER_SECTION = 3;
    final static int NUMBER_OF_MAIN_SECTION_CRITICALS = 12;
    final static int NUMBER_OF_LESSER_SECTION_CRITICALS = 6;
    
    final static int LOWER_ARM_ACTUATOR = 0;
    final static int HAND_ACTUATOR = 1;
    
    final static int NUMBER_OF_HARDPOINT_TYPES = 4;
    final static int BALLISTIC = 0;
    final static int ENERGY = 1;
    final static int MISSILE = 2;
    final static int AMS = 3;
    final static int OMNI = 4;
    
    final static int AMMO = 3;
    final static int OTHER = 4;
    final static int SELECTED = 5;
    
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
    final static int MYOMER_ITEM_TYPE = 11;
    final static int COCKPIT_ITEM_TYPE = 12;
    final static int OTHER_ITEM_TYPE = COCKPIT_ITEM_TYPE + 1;
    
    final static int TORSO = 0;
    final static int ARM = 1;
    final static int NUMBER_OF_MOVING_SECTIONS = 2;
    final static int YAW = 0;
    final static int PITCH = 1;
    final static int AXIS_OF_MOVEMENT = 2;
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="DropCalc Constants">
    final static int MAX_TEAM_SIZE = 8;
    
    final static String PILOTS_PATH = System.getProperty("user.dir") + "/Pilots.txt";
    final static String GROUPS_PATH = System.getProperty("user.dir") + "/Groups.txt";
    final static String VARIANTS_PATH = System.getProperty("user.dir") + "/Variants.txt";
    // </editor-fold>
    //static final String statlabVersion = "1.1.06";
    //static final String mechlabVersion = "5.3.21";
    static final String newMechlabVersion = "2.4.08";
    static final String compactMechlabVersion = "1.2.04";
    static final String dropCalcVersion = "1.1.03";
    static final String mechbayVersion = "1.0.02";
    static final String MWOstage = "1.2.190";
}