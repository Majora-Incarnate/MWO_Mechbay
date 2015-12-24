package Utility;

import java.io.Serializable;

public class Variant implements Serializable {
    private static final long serialVersionUID = 6391710359719258815L;

    public ChassisBlueprint chassis_type = null;
    public ModelBlueprint model_type = null;
    public SectionBlueprint[] section_types;
    public String variant_name;
    public double current_tonnage;
    public int current_criticals;
    public EngineBlueprint engine;
    public ArmorBlueprint armor;
    public StructureBlueprint structure;
    public HeatSinkBlueprint heatsinks;
    public FireControlBlueprint fire_control;
    public MyomerBlueprint myomer;
    public GyroBlueprint gyro;
    public CockpitBlueprint cockpit;
    public JumpJetBlueprint jumpjets;
    public int minimum_jump_jets;
    public int current_jump_jets;
    public int maximum_jump_jets;
    public int current_heat_sink_count;
    public int current_engine_rating;
    public Section[] sections;

    public Variant() {
        this.section_types = new SectionBlueprint[8];
        this.sections = new Section[8];
        for (int i = 0; i < 8; ++i) {
            this.sections[i] = new Section();
        }
        this.variant_name = "";
        this.engine = null;
        this.armor = null;
        this.structure = null;
        this.heatsinks = null;
        this.fire_control = null;
        this.myomer = null;
        this.gyro = null;
        this.cockpit = null;
        this.jumpjets = null;
        this.current_tonnage = 0.0;
        this.minimum_jump_jets = 0;
        this.current_jump_jets = 0;
        this.maximum_jump_jets = 0;
        this.current_heat_sink_count = 10;
        this.current_engine_rating = 100;
    }

    public void CalculateCriticals() {
        this.current_criticals = 0;
        for (Section section : this.sections) {
            this.current_criticals += section.current_criticals;
        }
    }

    public void CalculateTonnage() {
        this.current_tonnage = 0.0;
        int n = 0;
        for (Section section2 : this.sections) {
            n += section2.front_armor + section2.rear_armor - section2.minimum_armor;
        }
        this.current_tonnage += this.engine.Get_Tonnage(this.current_engine_rating);
        this.current_tonnage += this.gyro.Get_Tonnage(this.current_engine_rating);
        this.current_tonnage += this.cockpit.tonnage;
        this.current_tonnage += this.armor.Get_Tonnage(n);
        this.current_tonnage += this.structure.Get_Tonnage(this.chassis_type.tonnage);
        this.current_tonnage += this.heatsinks.Get_Tonnage(this.current_heat_sink_count, this.current_engine_rating);
        for (Section section2 : this.sections) {
            section2.components.stream().forEach((crittable) -> {
                this.current_tonnage += crittable.tonnage;
            });
        }
    }

    public int GetMaximumArmorTotal() {
        int n = 0;
        for (Section section : this.sections) {
            n += section.maximum_armor;
        }
        return n;
    }

    public int GetCurrentArmorTotal() {
        int n = 0;
        for (Section section : this.sections) {
            n += section.front_armor + section.rear_armor;
        }
        return n;
    }

    public void SetMech(final Database database, final ChassisBlueprint chassis_Blueprint, final ModelBlueprint model_Blueprint, final boolean bl, final boolean bl2) {
        int n;
        this.chassis_type = chassis_Blueprint;
        this.model_type = model_Blueprint;
        //database.Set_Selected_Components(this.chassis_type.tech_base, bl, bl2);
        //database.Set_Selected_Equipment(this.chassis_type.tech_base, bl, bl2);
        database.MASTER_ENGINE_BLUEPRINTS.stream().filter((engine_blueprint) -> (engine_blueprint.name.equals(model_Blueprint.engine_type))).forEach((engine_blueprint) -> {
            this.engine = engine_blueprint;
        });
        database.MASTER_ARMOR_BLUEPRINTS.stream().filter((armor_blueprint) -> (armor_blueprint.name.equals(model_Blueprint.armor_type))).forEach((armor_blueprint) -> {
            this.armor = armor_blueprint;
        });
        database.MASTER_HEAT_SINK_BLUEPRINTS.stream().filter((heatsink_blueprint) -> (heatsink_blueprint.name.equals(model_Blueprint.heatsink_type))).forEach((heatsink_blueprint) -> {
            this.heatsinks = heatsink_blueprint;
        });
        database.MASTER_GYRO_BLUEPRINTS.stream().filter((gyro_blueprint) -> (gyro_blueprint.name.equals(model_Blueprint.gyro_type))).forEach((gyro_blueprint) -> {
            this.gyro = gyro_blueprint;
        });
        database.MASTER_STRUCTURE_BLUEPRINTS.stream().filter((structure_blueprint) -> (structure_blueprint.name.equals(model_Blueprint.structure_type))).forEach((structure_blueprint) -> {
            this.structure = structure_blueprint;
        });
        database.MASTER_COCKPIT_BLUEPRINTS.stream().filter((cockpit_blueprint) -> (cockpit_blueprint.name.equals(model_Blueprint.cockpit_type))).forEach((cockpit_blueprint) -> {
            this.cockpit = cockpit_blueprint;
        });
        database.MASTER_JUMP_JET_BLUEPRINTS.stream().filter((jumpjet_blueprint) -> (jumpjet_blueprint.name.equals(model_Blueprint.jumpjet_type))).forEach((jumpjet_blueprint) -> {
            this.jumpjets = jumpjet_blueprint;
        });
        //database.Set_Selected_Sections(chassis_Blueprint.chassis_name);
        for (n = 0; n < 8; ++n) {
            /*for (SectionBlueprint object : database.MASTER_SECTION_BLUEPRINTS[n]) {
                if (!object.model.equals(model_Blueprint.section_models[n])) continue;
                this.section_types[n] = object;
            }*/
            if (this.section_types[n] == null) {
                throw new RuntimeException();
            }
            if (this.sections[n] == null) {
                throw new RuntimeException();
            }
            this.minimum_jump_jets += this.section_types[n].minimum_jump_jet_modifier;
            this.maximum_jump_jets += this.section_types[n].maximum_jump_jet_modifier;
            this.sections[n].Set_Section(this.section_types[n], n, chassis_Blueprint.tonnage);
        }
        this.current_heat_sink_count = model_Blueprint.heatsink_count;
        this.current_engine_rating = model_Blueprint.engine_rating;
        this.current_jump_jets = this.minimum_jump_jets;
        this.sections[5].Add_Component(this.cockpit.Get_Crittable());
        this.sections[2].Add_Component(this.engine.Get_Crittable(this.engine.Has_Side_Torso_Criticals()));
        this.sections[3].Add_Component(this.engine.Get_Crittable(this.engine.Has_Side_Torso_Criticals()));
        this.sections[4].Add_Component(this.engine.Get_Crittable());
        this.sections[4].Add_Component(this.gyro.Get_Crittable());
        /*if (!(this.chassis_type.is_omnimech && User.omni_restrictions_enabled)) {
            for (n = 0; n < this.structure.criticals; ++n) {
                Database.queued_items.add(this.structure.Get_Crittable());
            }
            for (n = 0; n < this.armor.criticals; ++n) {
                Database.queued_items.add(this.armor.Get_Crittable());
            }
        }*/
        if (this.minimum_jump_jets > 0) {
            for (n = 0; n < 8; ++n) {
                for (int i = 0; i < this.section_types[n].minimum_jump_jet_modifier; ++i) {
                    this.sections[n].Add_Component(this.jumpjets.Get_Crittable(this.chassis_type.tonnage));
                }
            }
        }
        for (n = 0; n < 8; ++n) {
            int n2;
            for (n2 = 0; n2 < this.section_types[n].hardwired_heatsinks; ++n2) {
                this.sections[n].Add_Component(this.heatsinks.Get_Crittable());
            }
            for (n2 = 0; n2 < this.section_types[n].hardwired_armor; ++n2) {
                this.sections[n].Add_Component(this.armor.Get_Crittable());
            }
            for (n2 = 0; n2 < this.section_types[n].hardwired_structure; ++n2) {
                this.sections[n].Add_Component(this.structure.Get_Crittable());
            }
            for (Crittable crittable : this.sections[n].components) {
                crittable.is_locked = true;
            }
        }
    }

    public void UpdateMech() {
        this.minimum_jump_jets = 0;
        this.maximum_jump_jets = 0;
        for (int i = 0; i < 8; ++i) {
            if (this.section_types[i] == null) continue;
            this.minimum_jump_jets += this.section_types[i].minimum_jump_jet_modifier;
            this.maximum_jump_jets += this.section_types[i].maximum_jump_jet_modifier;
            for (int j = 0; j < this.section_types[i].minimum_jump_jet_modifier; ++j) {
                this.sections[i].Add_Component(this.jumpjets.Get_Crittable(this.chassis_type.tonnage));
            }
        }
        this.current_jump_jets = this.minimum_jump_jets;
    }

    public static int GetMinEngineRating(ChassisBlueprint chassis_Blueprint, ModelBlueprint model_Blueprint, boolean bl) {
        if (!bl && chassis_Blueprint.is_omnimech) {
            return User.variant.chassis_type.tonnage * 2.0 < 100.0 ? 100 : (int) User.variant.chassis_type.tonnage * 2;
        }
        return chassis_Blueprint.min_engine_rating;
    }

    public static int GetMaxEngineRating(ChassisBlueprint chassis_Blueprint, ModelBlueprint model_Blueprint, boolean bl) {
        if (!User.omni_restrictions_enabled && chassis_Blueprint.is_omnimech) {
            int n;
            int n2;
            double d = 1.4;
            if (chassis_Blueprint.tonnage > 35.0) {
                d -= 0.1;
            }
            if (chassis_Blueprint.tonnage > 55.0) {
                d -= 0.1;
            }
            return (n = (int) (Math.ceil((double) chassis_Blueprint.max_engine_rating * d / 5.0) * 5.0)) > (n2 = (int) Math.round(chassis_Blueprint.tonnage * 8.5 / 5.0) * 5) ? n2 : n;
        }
        return model_Blueprint.max_engine_rating_override < 0 ? chassis_Blueprint.max_engine_rating : model_Blueprint.max_engine_rating_override;
    }
}

