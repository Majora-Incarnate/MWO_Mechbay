package com.quicksilver.mwo.mechbay.entities;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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
    public final List<ModuleBlueprint> MODULE_BLUEPRINTS;

    private final String DATABASE_DIRECTORY = "\\Database\\";
    private final String CUSTOM_PREFIX = "Custom_";
    private final String FILETYPE_POSTFIX = ".csv";
    private final String USER_DIRECTORY = System.getProperty("user.dir");
    private final String[] MODEL_NAMES = {
            "Actuator",
            "Ammo",
            "Armor",
            "Chassis",
            "Cockpit",
            "Engine",
            //"Equipment",
            //"Myomer",
            "FireControl",
            "Gyro",
            "HeatSink",
            "JumpJet",
            "Misc",
            "Model",
            "Module",
            "Section",
            "Structure",
            "Weapon"
    };

    public Database() {
        CHASSIS_BLUEPRINTS = Collections.emptyList();
        MODEL_BLUEPRINTS = Collections.emptyList();
        SECTION_BLUEPRINTS = Collections.emptyList();
        COCKPIT_BLUEPRINTS = Collections.emptyList();
        ENGINE_BLUEPRINTS = Collections.emptyList();
        GYRO_BLUEPRINTS = Collections.emptyList();
        ARMOR_BLUEPRINTS = Collections.emptyList();
        STRUCTURE_BLUEPRINTS = Collections.emptyList();
        HEAT_SINK_BLUEPRINTS = Collections.emptyList();
        JUMP_JET_BLUEPRINTS = Collections.emptyList();
        FIRE_CONTROL_BLUEPRINTS = Collections.emptyList();
        WEAPON_BLUEPRINTS = Collections.emptyList();
        AMMO_BLUEPRINTS = Collections.emptyList();
        EQUIPMENT_BLUEPRINTS = Collections.emptyList();
        ACTUATOR_BLUEPRINTS = Collections.emptyList();
        MYOMER_BLUEPRINTS = Collections.emptyList();
        MODULE_BLUEPRINTS = Collections.emptyList();
        
        for (String modelName : MODEL_NAMES) {
            readFile(modelName, false);
            //readFile(modelName, true);
        }
    }

    public Database(final Database database, final TechBase techBase,
            final boolean mixtech_enabled, final boolean futuretech_enabled) {
        Predicate<Blueprint> predicate = blueprint -> mixtech_enabled || blueprint.tech_base.equals(TechBase.UNIVERSAL) || techBase.equals(blueprint.tech_base) || techBase.equals(TechBase.UNIVERSAL);
        
        this.CHASSIS_BLUEPRINTS = database.CHASSIS_BLUEPRINTS.stream().collect(Collectors.toList());
        this.MODEL_BLUEPRINTS = database.MODEL_BLUEPRINTS.stream().collect(Collectors.toList());
        this.SECTION_BLUEPRINTS = database.SECTION_BLUEPRINTS.stream().collect(Collectors.toList());
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
        this.ACTUATOR_BLUEPRINTS = database.ACTUATOR_BLUEPRINTS.stream().collect(Collectors.toList());
        this.MODULE_BLUEPRINTS = database.MODULE_BLUEPRINTS.stream().collect(Collectors.toList());
    }
    
    private void readFile(final String blueprint_type, final boolean isCustom) {
        final String path = String.format("%s%s%s%s%s", USER_DIRECTORY, DATABASE_DIRECTORY, isCustom ? CUSTOM_PREFIX : "", blueprint_type, FILETYPE_POSTFIX);
        try (final BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(path)))) {
            reader.readLine();
            while (reader.ready()) {
                addValue(blueprint_type, reader.readLine());
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
            throw new RuntimeException();
        }
    }

    private void addValue(final String blueprint_type, final String line) {
        switch(blueprint_type) {
            case "Actuator":
                ACTUATOR_BLUEPRINTS.add(ActuatorBlueprint.Builder.create().buildFromCSV(line));
                break;
            case "Ammo":
                AMMO_BLUEPRINTS.add(AmmoBlueprint.Builder.create().buildFromCSV(line));
                break;
            case "Armor":
                ARMOR_BLUEPRINTS.add(ArmorBlueprint.Builder.create().buildFromCSV(line));
                break;
            case "Chassis":
                CHASSIS_BLUEPRINTS.add(ChassisBlueprint.Builder.create().buildFromCSV(line));
                break;
            case "Cockpit":
                COCKPIT_BLUEPRINTS.add(CockpitBlueprint.Builder.create().buildFromCSV(line));
                break;
            case "Engine":
                ENGINE_BLUEPRINTS.add(EngineBlueprint.Builder.create().buildFromCSV(line));
                break;
            case "Equipment":
                EQUIPMENT_BLUEPRINTS.add(EquipmentBlueprint.Builder.create().buildFromCSV(line));
                break;
            case "Myomer":
                MYOMER_BLUEPRINTS.add(MyomerBlueprint.Builder.create().buildFromCSV(line));
                break;
            case "Fire_Control":
                FIRE_CONTROL_BLUEPRINTS.add(FireControlBlueprint.Builder.create().buildFromCSV(line));
                break;
            case "Gyro":
                GYRO_BLUEPRINTS.add(GyroBlueprint.Builder.create().buildFromCSV(line));
                break;
            case "Heat_Sink":
                HEAT_SINK_BLUEPRINTS.add(HeatSinkBlueprint.Builder.create().buildFromCSV(line));
                break;
            case "Jump_Jet":
                JUMP_JET_BLUEPRINTS.add(JumpJetBlueprint.Builder.create().buildFromCSV(line));
                break;
            case "Model":
                MODEL_BLUEPRINTS.add(ModelBlueprint.Builder.create().buildFromCSV(line));
                break;
            case "Module":
                MODULE_BLUEPRINTS.add(ModuleBlueprint.Builder.create().buildFromCSV(line));
                break;
            case "Section":
                SECTION_BLUEPRINTS.add(SectionBlueprint.Builder.create().buildFromCSV(line));
                break;
            case "Structure":
                STRUCTURE_BLUEPRINTS.add(StructureBlueprint.Builder.create().buildFromCSV(line));
                break;
            case "Weapon":
                WEAPON_BLUEPRINTS.add(WeaponBlueprint.Builder.create().buildFromCSV(line));
                break;
            case "Misc":
            default:
                break;
        }
    }
}