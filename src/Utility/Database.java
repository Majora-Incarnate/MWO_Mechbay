package Utility;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class Database {
    public final ArrayList<ChassisBlueprint> CHASSIS_BLUEPRINTS = new ArrayList(0);
    public final ArrayList<ModelBlueprint> MODEL_BLUEPRINTS = new ArrayList(0);
    public final ArrayList<SectionBlueprint> SECTION_BLUEPRINTS = new ArrayList(0);
    public final ArrayList<CockpitBlueprint> COCKPIT_BLUEPRINTS = new ArrayList(0);
    public final ArrayList<EngineBlueprint> ENGINE_BLUEPRINTS = new ArrayList(0);
    public final ArrayList<GyroBlueprint> GYRO_BLUEPRINTS = new ArrayList(0);
    public final ArrayList<ArmorBlueprint> ARMOR_BLUEPRINTS = new ArrayList(0);
    public final ArrayList<StructureBlueprint> STRUCTURE_BLUEPRINTS = new ArrayList(0);
    public final ArrayList<HeatSinkBlueprint> HEAT_SINK_BLUEPRINTS = new ArrayList(0);
    public final ArrayList<JumpJetBlueprint> JUMP_JET_BLUEPRINTS = new ArrayList(0);
    public final ArrayList<FireControlBlueprint> FIRE_CONTROL_BLUEPRINTS = new ArrayList(0);
    public final ArrayList<WeaponBlueprint> WEAPON_BLUEPRINTS = new ArrayList(0);
    public final ArrayList<AmmoBlueprint> AMMO_BLUEPRINTS = new ArrayList(0);
    public final ArrayList<EquipmentBlueprint> EQUIPMENT_BLUEPRINTS = new ArrayList(0);
    public final ArrayList<ActuatorBlueprint> ACTUATOR_BLUEPRINTS = new ArrayList(0);
    public final ArrayList<ModuleBlueprint> MODULE_BLUEPRINTS = new ArrayList(0);

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
        for (String modelName : MODEL_NAMES) {
            readFile(modelName, false);
            //readFile(modelName, true);
        }
    }

    public Database(final Database database, final TechBase techBase,
            final boolean mixtech_enabled, final boolean futuretech_enabled) {
        database.CHASSIS_BLUEPRINTS.stream().forEach((blueprint) -> {
            this.CHASSIS_BLUEPRINTS.add(blueprint);
        });
        database.MODEL_BLUEPRINTS.stream().forEach((blueprint) -> {
            this.MODEL_BLUEPRINTS.add(blueprint);
        });
        database.SECTION_BLUEPRINTS.stream().forEach((blueprint) -> {
            this.SECTION_BLUEPRINTS.add(blueprint);
        });
        database.COCKPIT_BLUEPRINTS.stream().forEach((blueprint) -> {
            if (mixtech_enabled)
                this.COCKPIT_BLUEPRINTS.add(blueprint);
            else if (techBase.equals(blueprint.tech_base) || techBase.equals(TechBase.UNIVERSAL_TECH_BASE))
                this.COCKPIT_BLUEPRINTS.add(blueprint);
        });
        database.ENGINE_BLUEPRINTS.stream().forEach((blueprint) -> {
            if (mixtech_enabled)
                this.ENGINE_BLUEPRINTS.add(blueprint);
            else if (techBase.equals(blueprint.tech_base) || techBase.equals(TechBase.UNIVERSAL_TECH_BASE))
                this.ENGINE_BLUEPRINTS.add(blueprint);
        });
        database.GYRO_BLUEPRINTS.stream().forEach((blueprint) -> {
            if (mixtech_enabled)
                this.GYRO_BLUEPRINTS.add(blueprint);
            else if (techBase.equals(blueprint.tech_base) || techBase.equals(TechBase.UNIVERSAL_TECH_BASE))
                this.GYRO_BLUEPRINTS.add(blueprint);
        });
        database.ARMOR_BLUEPRINTS.stream().forEach((blueprint) -> {
            if (mixtech_enabled)
                this.ARMOR_BLUEPRINTS.add(blueprint);
            else if (techBase.equals(blueprint.tech_base) || techBase.equals(TechBase.UNIVERSAL_TECH_BASE))
                this.ARMOR_BLUEPRINTS.add(blueprint);
        });
        database.STRUCTURE_BLUEPRINTS.stream().forEach((blueprint) -> {
            if (mixtech_enabled)
                this.STRUCTURE_BLUEPRINTS.add(blueprint);
            else if (techBase.equals(blueprint.tech_base) || techBase.equals(TechBase.UNIVERSAL_TECH_BASE))
                this.STRUCTURE_BLUEPRINTS.add(blueprint);
        });
        database.HEAT_SINK_BLUEPRINTS.stream().forEach((blueprint) -> {
            if (mixtech_enabled)
                this.HEAT_SINK_BLUEPRINTS.add(blueprint);
            else if (techBase.equals(blueprint.tech_base) || techBase.equals(TechBase.UNIVERSAL_TECH_BASE))
                this.HEAT_SINK_BLUEPRINTS.add(blueprint);
        });
        database.JUMP_JET_BLUEPRINTS.stream().forEach((blueprint) -> {
            if (mixtech_enabled)
                this.JUMP_JET_BLUEPRINTS.add(blueprint);
            else if (techBase.equals(blueprint.tech_base) || techBase.equals(TechBase.UNIVERSAL_TECH_BASE))
                this.JUMP_JET_BLUEPRINTS.add(blueprint);
        });
        database.FIRE_CONTROL_BLUEPRINTS.stream().forEach((blueprint) -> {
            if (mixtech_enabled)
                this.FIRE_CONTROL_BLUEPRINTS.add(blueprint);
            else if (techBase.equals(blueprint.tech_base) || techBase.equals(TechBase.UNIVERSAL_TECH_BASE))
                this.FIRE_CONTROL_BLUEPRINTS.add(blueprint);
        });
        database.WEAPON_BLUEPRINTS.stream().forEach((blueprint) -> {
            if (mixtech_enabled)
                this.WEAPON_BLUEPRINTS.add(blueprint);
            else if (techBase.equals(blueprint.tech_base) || techBase.equals(TechBase.UNIVERSAL_TECH_BASE))
                this.WEAPON_BLUEPRINTS.add(blueprint);
        });
        database.AMMO_BLUEPRINTS.stream().forEach((blueprint) -> {
            if (mixtech_enabled)
                this.AMMO_BLUEPRINTS.add(blueprint);
            else if (techBase.equals(blueprint.tech_base) || techBase.equals(TechBase.UNIVERSAL_TECH_BASE))
                this.AMMO_BLUEPRINTS.add(blueprint);
        });
        database.EQUIPMENT_BLUEPRINTS.stream().forEach((blueprint) -> {
            if (mixtech_enabled)
                this.EQUIPMENT_BLUEPRINTS.add(blueprint);
            else if (techBase.equals(blueprint.tech_base) || techBase.equals(TechBase.UNIVERSAL_TECH_BASE))
                this.EQUIPMENT_BLUEPRINTS.add(blueprint);
        });
        database.ACTUATOR_BLUEPRINTS.stream().forEach((blueprint) -> {
            this.ACTUATOR_BLUEPRINTS.add(blueprint);
        });
        database.MODULE_BLUEPRINTS.stream().forEach((blueprint) -> {
            this.MODULE_BLUEPRINTS.add(blueprint);
        });
    }
    
    private void readFile(final String model, final boolean isCustom) {
        final String path = String.format("%s%s%s%s%s", USER_DIRECTORY, DATABASE_DIRECTORY, isCustom ? CUSTOM_PREFIX : "", model, FILETYPE_POSTFIX);
        try (final BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(path)))) {
            reader.readLine();
            while (reader.ready()) {
                addValue(model, reader.readLine());
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
            throw new RuntimeException();
        }
    }

    private void addValue(final String model, final String line) {
        switch(model) {
            case "Actuator":
                ACTUATOR_BLUEPRINTS.add(new ActuatorBlueprint(line));
                break;
            case "Ammo":
                AMMO_BLUEPRINTS.add(new AmmoBlueprint(line));
                break;
            case "Armor":
                ARMOR_BLUEPRINTS.add(new ArmorBlueprint(line));
                break;
            case "Chassis":
                CHASSIS_BLUEPRINTS.add(new ChassisBlueprint(line));
                break;
            case "Cockpit":
                COCKPIT_BLUEPRINTS.add(new CockpitBlueprint(line));
                break;
            case "Engine":
                ENGINE_BLUEPRINTS.add(new EngineBlueprint(line));
                break;
            case "Equipment":
                EQUIPMENT_BLUEPRINTS.add(new EquipmentBlueprint(line));
                break;
            case "Fire_Control":
                FIRE_CONTROL_BLUEPRINTS.add(new FireControlBlueprint(line));
                break;
            case "Gyro":
                GYRO_BLUEPRINTS.add(new GyroBlueprint(line));
                break;
            case "Heat_Sink":
                HEAT_SINK_BLUEPRINTS.add(new HeatSinkBlueprint(line));
                break;
            case "Jump_Jet":
                JUMP_JET_BLUEPRINTS.add(new JumpJetBlueprint(line));
                break;
            case "Model":
                MODEL_BLUEPRINTS.add(new ModelBlueprint(line));
                break;
            case "Module":
                MODULE_BLUEPRINTS.add(new ModuleBlueprint(line));
                break;
            case "Section":
                SECTION_BLUEPRINTS.add(new SectionBlueprint(line));
                break;
            case "Structure":
                STRUCTURE_BLUEPRINTS.add(new StructureBlueprint(line));
                break;
            case "Weapon":
                WEAPON_BLUEPRINTS.add(new WeaponBlueprint(line));
                break;
            case "Misc":
            default:
                break;
        }
    }
}