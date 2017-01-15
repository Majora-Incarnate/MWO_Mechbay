package com.github.majora_incarnate.mwo.mechbay.entities;

import com.github.majora_incarnate.mwo.mechbay.entities.enums.SectionClass;
import com.github.majora_incarnate.mwo.mechbay.entities.enums.SectionType;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class Constants {
    public static final int DEFAULT_CRITICAL_HEIGHT = 12;

    public static final boolean DEFAULT_FRANKENMECHS = false;
    public static final boolean DEFAULT_MIXTECH = false;
    public static final boolean DEFAULT_FUTURETECH = false;
    public static final boolean DEFAULT_OMNI_RESTRICTIONS = true;

    public static final int CBILL_TO_MC_CONVERSION = 2500;
    public static final int CHAMPION_MC_CONVERSION = 40;
    public static final int HERO_MC_CONVERSION = 75;

    public static final double STANDARD_SPEED_MODIFIER = 16.2D;
    public static final double SPEED_TWEAK_MODIFIER = 1.075D;
    public static final int SENSOR_RANGE = 800;

    public static final int ALL_EQUIPMENT_INDEX = 0;
    public static final int AMMO_INDEX = 1;
    public static final int EQUIPMENT_INDEX = 2;
    public static final int EQUIPMENT_VECTOR_SIZE = 2;
    public static final String[] EQUIPMENT_CATEGORIES = {"All Equipment", "Ammo",
        "Equipment", "Jump Jets"};

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

    public static final int SHOULDER = 0;
    public static final int UPPER_ARM = 1;
    public static final int LOWER_ARM = 2;
    public static final int HAND = 3;

    public static final int TORSO_MANUEVERABILITY_INDEX = 0;
    public static final int ARM_MANUEVERABILITY_INDEX = 1;
    public static final int NUMBER_OF_MOVING_SECTIONS = 2;
    public static final int YAW_MANUEVERABILITY_INDEX = 0;
    public static final int PITCH_MANUEVERABILITY_INDEX = 1;
    public static final int AXIS_OF_MOVEMENT = 2;

    public static final Map<Double, Map<SectionType, Integer>> INTERNALS_PER_SECTION = ImmutableMap.<Double, Map<SectionType, Integer>>builder()
            .put(20.0D, ImmutableMap.<SectionType, Integer>builder().put(SectionType.HEAD, 15).put(SectionType.CENTER_TORSO, 12).put(SectionType.RIGHT_TORSO, 10).put(SectionType.LEFT_TORSO, 10)
                    .put(SectionType.LEFT_ARM, 6).put(SectionType.RIGHT_ARM, 6).put(SectionType.RIGHT_LEG, 8).put(SectionType.LEFT_LEG, 8).build())
            .put(25.0D, ImmutableMap.<SectionType, Integer>builder().put(SectionType.HEAD, 15).put(SectionType.CENTER_TORSO, 16).put(SectionType.RIGHT_TORSO, 12).put(SectionType.LEFT_TORSO, 12)
                    .put(SectionType.LEFT_ARM, 8).put(SectionType.RIGHT_ARM, 8).put(SectionType.RIGHT_LEG, 12).put(SectionType.LEFT_LEG, 12).build())
            .put(30.0D, ImmutableMap.<SectionType, Integer>builder().put(SectionType.HEAD, 15).put(SectionType.CENTER_TORSO, 20).put(SectionType.RIGHT_TORSO, 14).put(SectionType.LEFT_TORSO, 14)
                    .put(SectionType.LEFT_ARM, 10).put(SectionType.RIGHT_ARM, 10).put(SectionType.RIGHT_LEG, 14).put(SectionType.LEFT_LEG, 14).build())
            .put(35.0D, ImmutableMap.<SectionType, Integer>builder().put(SectionType.HEAD, 15).put(SectionType.CENTER_TORSO, 22).put(SectionType.RIGHT_TORSO, 16).put(SectionType.LEFT_TORSO, 16)
                    .put(SectionType.LEFT_ARM, 12).put(SectionType.RIGHT_ARM, 12).put(SectionType.RIGHT_LEG, 16).put(SectionType.LEFT_LEG, 16).build())
            .put(40.0D, ImmutableMap.<SectionType, Integer>builder().put(SectionType.HEAD, 15).put(SectionType.CENTER_TORSO, 24).put(SectionType.RIGHT_TORSO, 20).put(SectionType.LEFT_TORSO, 20)
                    .put(SectionType.LEFT_ARM, 12).put(SectionType.RIGHT_ARM, 12).put(SectionType.RIGHT_LEG, 20).put(SectionType.LEFT_LEG, 20).build())
            .put(45.0D, ImmutableMap.<SectionType, Integer>builder().put(SectionType.HEAD, 15).put(SectionType.CENTER_TORSO, 28).put(SectionType.RIGHT_TORSO, 22).put(SectionType.LEFT_TORSO, 22)
                    .put(SectionType.LEFT_ARM, 14).put(SectionType.RIGHT_ARM, 14).put(SectionType.RIGHT_LEG, 22).put(SectionType.LEFT_LEG, 22).build())
            .put(50.0D, ImmutableMap.<SectionType, Integer>builder().put(SectionType.HEAD, 15).put(SectionType.CENTER_TORSO, 32).put(SectionType.RIGHT_TORSO, 24).put(SectionType.LEFT_TORSO, 24)
                    .put(SectionType.LEFT_ARM, 16).put(SectionType.RIGHT_ARM, 16).put(SectionType.RIGHT_LEG, 24).put(SectionType.LEFT_LEG, 24).build())
            .put(55.0D, ImmutableMap.<SectionType, Integer>builder().put(SectionType.HEAD, 15).put(SectionType.CENTER_TORSO, 36).put(SectionType.RIGHT_TORSO, 26).put(SectionType.LEFT_TORSO, 26)
                    .put(SectionType.LEFT_ARM, 18).put(SectionType.RIGHT_ARM, 18).put(SectionType.RIGHT_LEG, 26).put(SectionType.LEFT_LEG, 26).build())
            .put(60.0D, ImmutableMap.<SectionType, Integer>builder().put(SectionType.HEAD, 15).put(SectionType.CENTER_TORSO, 40).put(SectionType.RIGHT_TORSO, 28).put(SectionType.LEFT_TORSO, 28)
                    .put(SectionType.LEFT_ARM, 20).put(SectionType.RIGHT_ARM, 20).put(SectionType.RIGHT_LEG, 28).put(SectionType.LEFT_LEG, 28).build())
            .put(65.0D, ImmutableMap.<SectionType, Integer>builder().put(SectionType.HEAD, 15).put(SectionType.CENTER_TORSO, 42).put(SectionType.RIGHT_TORSO, 30).put(SectionType.LEFT_TORSO, 30)
                    .put(SectionType.LEFT_ARM, 20).put(SectionType.RIGHT_ARM, 20).put(SectionType.RIGHT_LEG, 30).put(SectionType.LEFT_LEG, 30).build())
            .put(70.0D, ImmutableMap.<SectionType, Integer>builder().put(SectionType.HEAD, 15).put(SectionType.CENTER_TORSO, 44).put(SectionType.RIGHT_TORSO, 30).put(SectionType.LEFT_TORSO, 30)
                    .put(SectionType.LEFT_ARM, 22).put(SectionType.RIGHT_ARM, 22).put(SectionType.RIGHT_LEG, 30).put(SectionType.LEFT_LEG, 30).build())
            .put(75.0D, ImmutableMap.<SectionType, Integer>builder().put(SectionType.HEAD, 15).put(SectionType.CENTER_TORSO, 46).put(SectionType.RIGHT_TORSO, 32).put(SectionType.LEFT_TORSO, 32)
                    .put(SectionType.LEFT_ARM, 24).put(SectionType.RIGHT_ARM, 24).put(SectionType.RIGHT_LEG, 32).put(SectionType.LEFT_LEG, 32).build())
            .put(80.0D, ImmutableMap.<SectionType, Integer>builder().put(SectionType.HEAD, 15).put(SectionType.CENTER_TORSO, 50).put(SectionType.RIGHT_TORSO, 34).put(SectionType.LEFT_TORSO, 34)
                    .put(SectionType.LEFT_ARM, 26).put(SectionType.RIGHT_ARM, 26).put(SectionType.RIGHT_LEG, 34).put(SectionType.LEFT_LEG, 34).build())
            .put(85.0D, ImmutableMap.<SectionType, Integer>builder().put(SectionType.HEAD, 15).put(SectionType.CENTER_TORSO, 54).put(SectionType.RIGHT_TORSO, 36).put(SectionType.LEFT_TORSO, 36)
                    .put(SectionType.LEFT_ARM, 28).put(SectionType.RIGHT_ARM, 28).put(SectionType.RIGHT_LEG, 36).put(SectionType.LEFT_LEG, 36).build())
            .put(90.0D, ImmutableMap.<SectionType, Integer>builder().put(SectionType.HEAD, 15).put(SectionType.CENTER_TORSO, 58).put(SectionType.RIGHT_TORSO, 38).put(SectionType.LEFT_TORSO, 30)
                    .put(SectionType.LEFT_ARM, 30).put(SectionType.RIGHT_ARM, 30).put(SectionType.RIGHT_LEG, 38).put(SectionType.LEFT_LEG, 38).build())
            .put(95.0D, ImmutableMap.<SectionType, Integer>builder().put(SectionType.HEAD, 15).put(SectionType.CENTER_TORSO, 60).put(SectionType.RIGHT_TORSO, 40).put(SectionType.LEFT_TORSO, 40)
                    .put(SectionType.LEFT_ARM, 32).put(SectionType.RIGHT_ARM, 32).put(SectionType.RIGHT_LEG, 40).put(SectionType.LEFT_LEG, 40).build())
            .put(100.0D, ImmutableMap.<SectionType, Integer>builder().put(SectionType.HEAD, 15).put(SectionType.CENTER_TORSO, 62).put(SectionType.RIGHT_TORSO, 42).put(SectionType.LEFT_TORSO, 42)
                    .put(SectionType.LEFT_ARM, 34).put(SectionType.RIGHT_ARM, 34).put(SectionType.RIGHT_LEG, 42).put(SectionType.LEFT_LEG, 42).build()).build();
    public static final double[] ENGINE_TONNAGES = {0.0D, 0.5D, 0.5D, 0.5D, 0.5D,
        0.5D, 1.0D, 1.0D, 1.0D, 1.0D, 1.5D, 1.5D, 1.5D, 2.0D, 2.0D, 2.0D, 2.5D,
        2.5D, 3.0D, 3.0D, 3.0D, 3.5D, 3.5D, 4.0D, 4.0D, 4.0D, 4.5D, 4.5D, 5.0D,
        5.0D, 5.5D, 5.5D, 6.0D, 6.0D, 6.0D, 7.0D, 7.0D, 7.5D, 7.5D, 8.0D, 8.5D,
        8.5D, 9.0D, 9.5D, 10.0D, 10.0D, 10.5D, 11.0D, 11.5D, 12.0D, 12.5D, 13.0D,
        13.5D, 14.0D, 14.5D, 15.5D, 16.0D, 16.5D, 17.5D, 18.0D, 19.0D, 19.5D,
        20.5D, 21.5D, 22.5D, 23.5D, 24.5D, 25.5D, 27.0D, 28.5D, 29.5D, 31.5D,
        33.0D, 34.5D, 36.5D, 38.5D, 41.0D, 43.5D, 46.0D, 49.0D, 52.5D};
    public static final int INTERNALS_TO_ARMOR_MODIFIER = 2;

    public static final String MECHBAY_VERSION = "3.0.00";
    public static final String CBILL_FORMAT = "#,### C-Bills";
    public static final String MC_FORMAT = "#,### MC";
    public static final String SPEED_FORMAT = "#.## kph";

    private Constants() throws Exception {
        throw new Exception("Constants should not be initialized.");
    }
}
