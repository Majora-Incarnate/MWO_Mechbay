package com.github.majora_incarnate.mwo_mechbay.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class Database {
    public final List<ChassisBlueprint> CHASSIS_BLUEPRINTS;
    public final List<ModelBlueprint> MODEL_BLUEPRINTS;
    public final List<SectionBlueprint> SECTION_BLUEPRINTS;
    public final List<CockpitBlueprint> COCKPIT_BLUEPRINTS;
    public final List<EngineBlueprint> ENGINE_BLUEPRINTS;
    public final List<GyroBlueprint> GYRO_BLUEPRINTS;
    public final List<ArmorBlueprint> ARMOR_BLUEPRINTS;
    public final List<StructureBlueprint> STRUCTURE_BLUEPRINTS;
    public final List<HeatSinkBlueprint> HEAT_SINK_BLUEPRINTS;
    public final List<JumpJetBlueprint> JUMP_JET_BLUEPRINTS;
    public final List<FireControlBlueprint> FIRE_CONTROL_BLUEPRINTS;
    public final List<WeaponBlueprint> WEAPON_BLUEPRINTS;
    public final List<AmmoBlueprint> AMMO_BLUEPRINTS;
    public final List<EquipmentBlueprint> EQUIPMENT_BLUEPRINTS;
    public final List<ActuatorBlueprint> ACTUATOR_BLUEPRINTS;
    public final List<MyomerBlueprint> MYOMER_BLUEPRINTS;

    private final Gson GSON = new GsonBuilder().enableComplexMapKeySerialization().setPrettyPrinting().create();
    private final String DATABASE_DIRECTORY = "//database//";
    private final String CUSTOM_PREFIX = "Custom_";
    private final String FILETYPE_POSTFIX = ".json";
    private final String USER_DIRECTORY = System.getProperty("user.dir");
    private final String[] MODEL_NAMES = {
            "actuator",
            "ammo",
            "armor",
            "chassis",
            "cockpit",
            "engine",
            //"Equipment",
            //"Myomer",
            "firecontrol",
            "gyro",
            "heatsink",
            "jumpjet",
            "misc",
            "model",
            "section",
            "structure",
            "weapon"
    };

    public Database() {
        CHASSIS_BLUEPRINTS = new ArrayList<>();
        MODEL_BLUEPRINTS = new ArrayList<>();
        SECTION_BLUEPRINTS = new ArrayList<>();
        COCKPIT_BLUEPRINTS = new ArrayList<>();
        ENGINE_BLUEPRINTS = new ArrayList<>();
        GYRO_BLUEPRINTS = new ArrayList<>();
        ARMOR_BLUEPRINTS = new ArrayList<>();
        STRUCTURE_BLUEPRINTS = new ArrayList<>();
        HEAT_SINK_BLUEPRINTS = new ArrayList<>();
        JUMP_JET_BLUEPRINTS = new ArrayList<>();
        FIRE_CONTROL_BLUEPRINTS = new ArrayList<>();
        WEAPON_BLUEPRINTS = new ArrayList<>();
        AMMO_BLUEPRINTS = new ArrayList<>();
        EQUIPMENT_BLUEPRINTS = new ArrayList<>();
        ACTUATOR_BLUEPRINTS = new ArrayList<>();
        MYOMER_BLUEPRINTS = new ArrayList<>();
        
        for (String modelName : MODEL_NAMES) {
            readFile(modelName, false);
            //readFile(modelName, true);
        }
    }

    public Database(final Database database, final Predicate<Blueprint> predicate) {
        this.CHASSIS_BLUEPRINTS = database.CHASSIS_BLUEPRINTS.stream().filter(predicate).collect(Collectors.toList());
        this.MODEL_BLUEPRINTS = database.MODEL_BLUEPRINTS.stream().filter(predicate).collect(Collectors.toList());
        this.SECTION_BLUEPRINTS = database.SECTION_BLUEPRINTS.stream().filter(predicate).collect(Collectors.toList());
        this.COCKPIT_BLUEPRINTS = database.COCKPIT_BLUEPRINTS.stream().filter(predicate).collect(Collectors.toList());
        this.ENGINE_BLUEPRINTS = database.ENGINE_BLUEPRINTS.stream().filter(predicate).collect(Collectors.toList());
        this.GYRO_BLUEPRINTS = database.GYRO_BLUEPRINTS.stream().filter(predicate).collect(Collectors.toList());
        this.ARMOR_BLUEPRINTS = database.ARMOR_BLUEPRINTS.stream().filter(predicate).collect(Collectors.toList());
        this.STRUCTURE_BLUEPRINTS = database.STRUCTURE_BLUEPRINTS.stream().filter(predicate).collect(Collectors.toList());
        this.HEAT_SINK_BLUEPRINTS = database.HEAT_SINK_BLUEPRINTS.stream().filter(predicate).collect(Collectors.toList());
        this.JUMP_JET_BLUEPRINTS = database.JUMP_JET_BLUEPRINTS.stream().filter(predicate).collect(Collectors.toList());
        this.FIRE_CONTROL_BLUEPRINTS = database.FIRE_CONTROL_BLUEPRINTS.stream().filter(predicate).collect(Collectors.toList());
        this.WEAPON_BLUEPRINTS = database.WEAPON_BLUEPRINTS.stream().filter(predicate).collect(Collectors.toList());
        this.AMMO_BLUEPRINTS = database.AMMO_BLUEPRINTS.stream().filter(predicate).collect(Collectors.toList());
        this.EQUIPMENT_BLUEPRINTS = database.EQUIPMENT_BLUEPRINTS.stream().filter(predicate).collect(Collectors.toList());
        this.MYOMER_BLUEPRINTS = database.MYOMER_BLUEPRINTS.stream().filter(predicate).collect(Collectors.toList());
        this.ACTUATOR_BLUEPRINTS = database.ACTUATOR_BLUEPRINTS.stream().filter(predicate).collect(Collectors.toList());
    }
    
    private void readFile(final String blueprint_type, final boolean isCustom) {
        final String path = String.format("%s%s%s%s%s", USER_DIRECTORY, DATABASE_DIRECTORY, isCustom ? CUSTOM_PREFIX : "", blueprint_type, FILETYPE_POSTFIX);
        try (final BufferedReader br = new BufferedReader(new FileReader(path))) {
            addValue(blueprint_type, br);
        } catch (IOException e) {
            System.err.println(e.getMessage());
            throw new RuntimeException();
        }
    }

    private void addValue(final String blueprint_type, final BufferedReader br) {
        Type type;
        
        switch(blueprint_type) {
            case "actuator":
                type = new TypeToken<ActuatorBlueprint[]>(){}.getType();
                ACTUATOR_BLUEPRINTS.addAll(Arrays.asList(GSON.fromJson(br, type)));
                break;
            case "ammo":
                type = new TypeToken<AmmoBlueprint[]>(){}.getType();
                AMMO_BLUEPRINTS.addAll(Arrays.asList(GSON.fromJson(br, type)));
                break;
            case "armor":
                type = new TypeToken<ArmorBlueprint[]>(){}.getType();
                ARMOR_BLUEPRINTS.addAll(Arrays.asList(GSON.fromJson(br, type)));
                break;
            case "chassis":
                type = new TypeToken<ChassisBlueprint[]>(){}.getType();
                CHASSIS_BLUEPRINTS.addAll(Arrays.asList(GSON.fromJson(br, type)));
                break;
            case "cockpit":
                type = new TypeToken<CockpitBlueprint[]>(){}.getType();
                COCKPIT_BLUEPRINTS.addAll(Arrays.asList(GSON.fromJson(br, type)));
                break;
            case "engine":
                type = new TypeToken<EngineBlueprint[]>(){}.getType();
                ENGINE_BLUEPRINTS.addAll(Arrays.asList(GSON.fromJson(br, type)));
                break;
            case "equipment":
                type = new TypeToken<EquipmentBlueprint[]>(){}.getType();
                EQUIPMENT_BLUEPRINTS.addAll(Arrays.asList(GSON.fromJson(br, type)));
                break;
            case "myomer":
                type = new TypeToken<MyomerBlueprint[]>(){}.getType();
                MYOMER_BLUEPRINTS.addAll(Arrays.asList(GSON.fromJson(br, type)));
                break;
            case "firecontrol":
                type = new TypeToken<FireControlBlueprint[]>(){}.getType();
                FIRE_CONTROL_BLUEPRINTS.addAll(Arrays.asList(GSON.fromJson(br, type)));
                break;
            case "gyro":
                type = new TypeToken<GyroBlueprint[]>(){}.getType();
                GYRO_BLUEPRINTS.addAll(Arrays.asList(GSON.fromJson(br, type)));
                break;
            case "heatsink":
                type = new TypeToken<HeatSinkBlueprint[]>(){}.getType();
                HEAT_SINK_BLUEPRINTS.addAll(Arrays.asList(GSON.fromJson(br, type)));
                break;
            case "jumpjet":
                type = new TypeToken<JumpJetBlueprint[]>(){}.getType();
                JUMP_JET_BLUEPRINTS.addAll(Arrays.asList(GSON.fromJson(br, type)));
                break;
            case "model":
                type = new TypeToken<ModelBlueprint[]>(){}.getType();
                MODEL_BLUEPRINTS.addAll(Arrays.asList(GSON.fromJson(br, type)));
                break;
            case "section":
                type = new TypeToken<SectionBlueprint[]>(){}.getType();
                SECTION_BLUEPRINTS.addAll(Arrays.asList(GSON.fromJson(br, type)));
                break;
            case "structure":
                type = new TypeToken<StructureBlueprint[]>(){}.getType();
                STRUCTURE_BLUEPRINTS.addAll(Arrays.asList(GSON.fromJson(br, type)));
                break;
            case "weapon":
                type = new TypeToken<WeaponBlueprint[]>(){}.getType();
                WEAPON_BLUEPRINTS.addAll(Arrays.asList(GSON.fromJson(br, type)));
                break;
            case "misc":
            default:
                break;
        }
    }
}