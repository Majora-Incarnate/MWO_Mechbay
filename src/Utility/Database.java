package Utility;

import java.io.*;
import java.util.ArrayList;

public class Database {
    public final ArrayList<ChassisBlueprint> MASTER_CHASSIS_BLUEPRINTS = new ArrayList(0);
    public final ArrayList<ModelBlueprint> MASTER_MODEL_BLUEPRINTS = new ArrayList(0);
    public final ArrayList<SectionBlueprint> MASTER_SECTION_BLUEPRINTS = new ArrayList(0);
    public final ArrayList<CockpitBlueprint> MASTER_COCKPIT_BLUEPRINTS = new ArrayList(0);
    public final ArrayList<EngineBlueprint> MASTER_ENGINE_BLUEPRINTS = new ArrayList(0);
    public final ArrayList<GyroBlueprint> MASTER_GYRO_BLUEPRINTS = new ArrayList(0);
    public final ArrayList<ArmorBlueprint> MASTER_ARMOR_BLUEPRINTS = new ArrayList(0);
    public final ArrayList<StructureBlueprint> MASTER_STRUCTURE_BLUEPRINTS = new ArrayList(0);
    public final ArrayList<HeatSinkBlueprint> MASTER_HEAT_SINK_BLUEPRINTS = new ArrayList(0);
    public final ArrayList<JumpJetBlueprint> MASTER_JUMP_JET_BLUEPRINTS = new ArrayList(0);
    public final ArrayList<FireControlBlueprint> MASTER_FIRE_CONTROL_BLUEPRINTS = new ArrayList(0);
    public final ArrayList<WeaponBlueprint> MASTER_WEAPON_BLUEPRINTS = new ArrayList(0);
    public final ArrayList<AmmoBlueprint> MASTER_AMMO_BLUEPRINTS = new ArrayList(0);
    public final ArrayList<EquipmentBlueprint> MASTER_EQUIPMENT_BLUEPRINTS = new ArrayList(0);
    public final ArrayList<ActuatorBlueprint> MASTER_ACTUATOR_BLUEPRINTS = new ArrayList(0);
    public final ArrayList<ModuleBlueprint> MASTER_MODULE_BLUEPRINTS = new ArrayList(0);

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
            "Equipment",
            "Fire_Control",
            "Gyro",
            "Heat_Sink",
            "Jump_Jet",
            "Misc",
            "Model",
            "Module",
            "Section",
            "Structure",
            "Weapon"
    };

    public void Database() {
        for (int i = 0; i < MODEL_NAMES.length; i++) {
            try(BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(USER_DIRECTORY + DATABASE_DIRECTORY + MODEL_NAMES[i] + FILETYPE_POSTFIX)))) {
                while(reader.ready()) {
                    addValue(MODEL_NAMES[i], reader.readLine());
                }
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
            try(BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(USER_DIRECTORY + DATABASE_DIRECTORY + MODEL_NAMES[i] + CUSTOM_PREFIX + FILETYPE_POSTFIX)))) {
                while(reader.ready()) {
                    addValue(MODEL_NAMES[i], reader.readLine());
                }
            } catch (IOException e) {
                //System.err.println(e.getMessage());
            }
        }
    }

    private void addValue(final String model, final String line) {
        switch(model) {
            case "Actuator":
                MASTER_ACTUATOR_BLUEPRINTS.add(new ActuatorBlueprint(line));
                break;
            case "Ammo":
                MASTER_AMMO_BLUEPRINTS.add(new AmmoBlueprint(line));
                break;
            case "Armor":
                MASTER_ARMOR_BLUEPRINTS.add(new ArmorBlueprint(line));
                break;
            case "Chassis":
                MASTER_CHASSIS_BLUEPRINTS.add(new ChassisBlueprint(line));
                break;
            case "Cockpit":
                MASTER_COCKPIT_BLUEPRINTS.add(new CockpitBlueprint(line));
                break;
            case "Engine":
                MASTER_ENGINE_BLUEPRINTS.add(new EngineBlueprint(line));
                break;
            case "Equipment":
                MASTER_EQUIPMENT_BLUEPRINTS.add(new EquipmentBlueprint(line));
                break;
            case "Fire_Control":
                MASTER_FIRE_CONTROL_BLUEPRINTS.add(new FireControlBlueprint(line));
                break;
            case "Gyro":
                MASTER_GYRO_BLUEPRINTS.add(new GyroBlueprint(line));
                break;
            case "Heat_Sink":
                MASTER_HEAT_SINK_BLUEPRINTS.add(new HeatSinkBlueprint(line));
                break;
            case "Jump_Jet":
                MASTER_JUMP_JET_BLUEPRINTS.add(new JumpJetBlueprint(line));
                break;
            case "Model":
                MASTER_MODEL_BLUEPRINTS.add(new ModelBlueprint(line));
                break;
            case "Module":
                MASTER_MODULE_BLUEPRINTS.add(new ModuleBlueprint(line));
                break;
            case "Section":
                MASTER_SECTION_BLUEPRINTS.add(new SectionBlueprint(line));
                break;
            case "Structure":
                MASTER_STRUCTURE_BLUEPRINTS.add(new StructureBlueprint(line));
                break;
            case "Weapon":
                MASTER_WEAPON_BLUEPRINTS.add(new WeaponBlueprint(line));
                break;
            case "Misc":
            default:
                //MASTER_COCKPIT_BLUEPRINTS.add(new AmmoBlueprint(line));
                break;
        }
    }
}