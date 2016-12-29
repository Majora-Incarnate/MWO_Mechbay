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

    private final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private final String DATABASE_DIRECTORY = "\\database\\";
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
        switch(blueprint_type) {
            case "actuator":
                ACTUATOR_BLUEPRINTS.addAll(Arrays.asList(GSON.fromJson(br, ActuatorBlueprint[].class)));
                break;
            case "ammo":
                AMMO_BLUEPRINTS.addAll(Arrays.asList(GSON.fromJson(br, AmmoBlueprint[].class)));
                break;
            case "armor":
                ARMOR_BLUEPRINTS.addAll(Arrays.asList(GSON.fromJson(br, ArmorBlueprint[].class)));
                break;
            case "chassis":
                CHASSIS_BLUEPRINTS.addAll(Arrays.asList(GSON.fromJson(br, ChassisBlueprint[].class)));
                break;
            case "cockpit":
                COCKPIT_BLUEPRINTS.addAll(Arrays.asList(GSON.fromJson(br, CockpitBlueprint[].class)));
                break;
            case "engine":
                ENGINE_BLUEPRINTS.addAll(Arrays.asList(GSON.fromJson(br, EngineBlueprint[].class)));
                break;
            case "equipment":
                EQUIPMENT_BLUEPRINTS.addAll(Arrays.asList(GSON.fromJson(br, EquipmentBlueprint[].class)));
                break;
            case "myomer":
                MYOMER_BLUEPRINTS.addAll(Arrays.asList(GSON.fromJson(br, MyomerBlueprint[].class)));
                break;
            case "firecontrol":
                FIRE_CONTROL_BLUEPRINTS.addAll(Arrays.asList(GSON.fromJson(br, FireControlBlueprint[].class)));
                break;
            case "gyro":
                GYRO_BLUEPRINTS.addAll(Arrays.asList(GSON.fromJson(br, GyroBlueprint[].class)));
                break;
            case "heatsink":
                HEAT_SINK_BLUEPRINTS.addAll(Arrays.asList(GSON.fromJson(br, HeatSinkBlueprint[].class)));
                break;
            case "jumpjet":
                JUMP_JET_BLUEPRINTS.addAll(Arrays.asList(GSON.fromJson(br, JumpJetBlueprint[].class)));
                break;
            case "model":
                MODEL_BLUEPRINTS.addAll(Arrays.asList(GSON.fromJson(br, ModelBlueprint[].class)));
                break;
            case "section":
                SECTION_BLUEPRINTS.addAll(Arrays.asList(GSON.fromJson(br, SectionBlueprint[].class)));
                break;
            case "structure":
                STRUCTURE_BLUEPRINTS.addAll(Arrays.asList(GSON.fromJson(br, StructureBlueprint[].class)));
                break;
            case "weapon":
                WEAPON_BLUEPRINTS.addAll(Arrays.asList(GSON.fromJson(br, WeaponBlueprint[].class)));
                break;
            case "misc":
            default:
                break;
        }
    }
}