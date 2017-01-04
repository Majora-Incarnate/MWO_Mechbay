package com.github.majora_incarnate.mwo.mechbay.entities;

import com.github.majora_incarnate.mwo.mechbay.entities.blueprints.CockpitBlueprint;
import com.github.majora_incarnate.mwo.mechbay.entities.blueprints.GyroBlueprint;
import com.github.majora_incarnate.mwo.mechbay.entities.blueprints.HeatSinkBlueprint;
import com.github.majora_incarnate.mwo.mechbay.entities.blueprints.StructureBlueprint;
import com.github.majora_incarnate.mwo.mechbay.entities.blueprints.JumpJetBlueprint;
import com.github.majora_incarnate.mwo.mechbay.entities.blueprints.MyomerBlueprint;
import com.github.majora_incarnate.mwo.mechbay.entities.blueprints.FireControlBlueprint;
import com.github.majora_incarnate.mwo.mechbay.entities.blueprints.EngineBlueprint;
import com.github.majora_incarnate.mwo.mechbay.entities.blueprints.ChassisBlueprint;
import com.github.majora_incarnate.mwo.mechbay.entities.blueprints.ArmorBlueprint;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Variant implements Serializable {
    private static final long serialVersionUID = 6391710359719258815L;

    public ChassisBlueprint chassisType = null;
    public ModelBlueprint modelType = null;
    public Map<SectionType, SectionBlueprint> sectionTypes;
    public String variantName;
    public double currentTonnage;
    public int currentCriticals;
    public EngineBlueprint engine;
    public ArmorBlueprint armor;
    public StructureBlueprint structure;
    public HeatSinkBlueprint heatsinks;
    public FireControlBlueprint fireControl;
    public MyomerBlueprint myomer;
    public GyroBlueprint gyro;
    public CockpitBlueprint cockpit;
    public JumpJetBlueprint jumpjets;
    public int minimumJumpJets;
    public int currentJumpJets;
    public int maximumJumpJets;
    public int currentHeatSinkCount;
    public int currentEngineRating;
    public Section[] sections;

    public Variant() {
        sectionTypes = new HashMap<>();
        this.sections = new Section[8];
        this.variantName = "";
        this.engine = null;
        this.armor = null;
        this.structure = null;
        this.heatsinks = null;
        this.fireControl = null;
        this.myomer = null;
        this.gyro = null;
        this.cockpit = null;
        this.jumpjets = null;
        this.currentTonnage = 0.0;
        this.minimumJumpJets = 0;
        this.currentJumpJets = 0;
        this.maximumJumpJets = 0;
        this.currentHeatSinkCount = 10;
        this.currentEngineRating = 100;
        
        for (int i = 0; i < SectionType.numberOfSectionTypes(); ++i)
            this.sections[i] = new Section();
    }

    public void CalculateCriticals() {
        this.currentCriticals = 0;
        
        for (Section section : this.sections)
            this.currentCriticals += section.currentCriticals;
    }

    public void CalculateTonnage() {
        this.currentTonnage = 0.0;
        int n = 0;
        
        for (Section section : this.sections)
            n += section.frontArmor + section.rearArmor - section.minimumArmor;
            
        this.currentTonnage += this.engine.Get_Tonnage(this.currentEngineRating);
        this.currentTonnage += this.gyro.Get_Tonnage(this.currentEngineRating);
        this.currentTonnage += this.cockpit.tonnage;
        this.currentTonnage += this.armor.Get_Tonnage(n);
        this.currentTonnage += this.structure.getTonnage(this.chassisType.tonnage);
        this.currentTonnage += this.heatsinks.Get_Tonnage(this.currentHeatSinkCount, this.currentEngineRating);
        
        for (Section section : this.sections)
            section.components.stream().forEach((crittable) -> {
                this.currentTonnage += crittable.tonnage;
            });
    }

    public int GetMaximumArmorTotal() {
        int maxArmor = 0;
        
        for (Section section : this.sections)
            maxArmor += section.maximumArmor;
            
        return maxArmor;
    }

    public int GetCurrentArmorTotal() {
        int currentArmor = 0;
        
        for (Section section : this.sections)
            currentArmor += section.frontArmor + section.rearArmor;
            
        return currentArmor;
    }

    public void SetMech(final Database database, final ChassisBlueprint chassisBlueprint, final ModelBlueprint modelBlueprint) {
        this.chassisType = chassisBlueprint;
        this.modelType = modelBlueprint;
        
        for (Map.Entry<SectionType, String> modelSection : modelBlueprint.sectionModels.entrySet()) {
            for (SectionBlueprint section : database.SECTION_BLUEPRINTS) {
                if (section.section.equals(modelSection.getKey()) && section.name.equals(modelSection.getValue())) {
                    sectionTypes.put(modelSection.getKey(), section);
            
                    this.minimumJumpJets += section.minimumJumpJetModifier;
                    this.maximumJumpJets += section.maximumJumpJetModifier;
                    break;
                }
            }
        }
        
        database.ENGINE_BLUEPRINTS.stream().filter((engine_blueprint) -> (engine_blueprint.name.equals(modelBlueprint.engineType))).forEach((engine_blueprint) -> {
            this.engine = engine_blueprint;
        });
        database.ARMOR_BLUEPRINTS.stream().filter((armor_blueprint) -> (armor_blueprint.name.equals(modelBlueprint.armorType))).forEach((armor_blueprint) -> {
            this.armor = armor_blueprint;
        });
        database.HEAT_SINK_BLUEPRINTS.stream().filter((heatsink_blueprint) -> (heatsink_blueprint.name.equals(modelBlueprint.heatsinkType))).forEach((heatsink_blueprint) -> {
            this.heatsinks = heatsink_blueprint;
        });
        database.GYRO_BLUEPRINTS.stream().filter((gyro_blueprint) -> (gyro_blueprint.name.equals(modelBlueprint.gyroType))).forEach((gyro_blueprint) -> {
            this.gyro = gyro_blueprint;
        });
        database.STRUCTURE_BLUEPRINTS.stream().filter((structure_blueprint) -> (structure_blueprint.name.equals(modelBlueprint.structureType))).forEach((structure_blueprint) -> {
            this.structure = structure_blueprint;
        });
        database.COCKPIT_BLUEPRINTS.stream().filter((cockpit_blueprint) -> (cockpit_blueprint.name.equals(modelBlueprint.cockpitType))).forEach((cockpit_blueprint) -> {
            this.cockpit = cockpit_blueprint;
        });
        database.JUMP_JET_BLUEPRINTS.stream().filter((jumpjet_blueprint) -> (jumpjet_blueprint.name.equals(modelBlueprint.jumpjetType))).forEach((jumpjet_blueprint) -> {
            this.jumpjets = jumpjet_blueprint;
        });
        
        this.currentHeatSinkCount = modelBlueprint.heatsinkCount;
        this.currentEngineRating = modelBlueprint.engineRating;
        this.currentJumpJets = this.minimumJumpJets;
        /*this.sections[SectionType.HEAD.index].Add_Component(this.cockpit.Get_Crittable());
        this.sections[SectionType.LEFT_TORSO.index].Add_Component(this.engine.Get_Crittable(this.engine.Has_Side_Torso_Criticals()));
        this.sections[SectionType.RIGHT_TORSO.index].Add_Component(this.engine.Get_Crittable(this.engine.Has_Side_Torso_Criticals()));
        this.sections[SectionType.CENTER_TORSO.index].Add_Component(this.engine.Get_Crittable());
        this.sections[SectionType.CENTER_TORSO.index].Add_Component(this.gyro.Get_Crittable());
        
        if (this.minimum_jump_jets > 0)
            for (int n = 0; n < SectionType.numberOfSectionTypes(); ++n)
                for (int i = 0; i < this.sectionTypes[n].minimumJumpJetModifier; ++i)
                    this.sections[n].Add_Component(this.jumpjets.Get_Crittable(this.chassisType.tonnage));
                    
        for (int n = 0; n < SectionType.numberOfSectionTypes(); ++n) {
            int n2;
            
            for (n2 = 0; n2 < this.sectionTypes[n].hardwired_heatsinks; ++n2)
                this.sections[n].Add_Component(this.heatsinks.Get_Crittable());
            
            for (n2 = 0; n2 < this.sectionTypes[n].hardwired_armor; ++n2)
                this.sections[n].Add_Component(this.armor.Get_Crittable());
            
            for (n2 = 0; n2 < this.sectionTypes[n].hardwired_structure; ++n2)
                this.sections[n].Add_Component(this.structure.Get_Crittable());
            
            for (Crittable crittable : this.sections[n].components)
                crittable.is_locked = true;
        }*/
    }

    public void UpdateMech() {
        this.minimumJumpJets = 0;
        this.maximumJumpJets = 0;
        
//        for (int i = 0; i < 8; ++i) {
//            this.minimumJumpJets += this.sectionTypes[i].minimumJumpJetModifier;
//            this.maximumJumpJets += this.sectionTypes[i].maximumJumpJetModifier;
//            
//            for (int j = 0; j < this.sectionTypes[i].minimumJumpJetModifier; ++j)
//                this.sections[i].Add_Component(this.jumpjets.Get_Crittable(this.chassisType.tonnage));
//        }
        
        this.currentJumpJets = this.minimumJumpJets;
    }

    public static int GetMinEngineRating(ChassisBlueprint chassisBlueprint, ModelBlueprint modelBlueprint) {
        if (!User.omni_restrictions_enabled && chassisBlueprint.mechType.equals(MechType.OMNIMECH)) {
            return User.variant.chassisType.tonnage * 2.0 < 100.0 ? 100 : (int) User.variant.chassisType.tonnage * 2;
        }
        return modelBlueprint.minEngineRating;
    }

    public static int GetMaxEngineRating(ChassisBlueprint chassisBlueprint, ModelBlueprint modelBlueprint) {
        if (!User.omni_restrictions_enabled && chassisBlueprint.mechType.equals(MechType.OMNIMECH)) {
            double max_engine_multiplier = 1.4;
            double max_speed_multiplier = 8.5;
            
            if (chassisBlueprint.tonnage > 35.0) {
                max_engine_multiplier -= 0.1;
            }
            if (chassisBlueprint.tonnage > 55.0) {
                max_engine_multiplier -= 0.1;
            }
            
            int n = (int) (Math.ceil(modelBlueprint.maxEngineRating * max_engine_multiplier / 5.0) * 5.0);
            int n2 = (int) Math.round(chassisBlueprint.tonnage * max_speed_multiplier / 5.0) * 5;
            
            return n > n2  ? n2 : n;
        }
        return modelBlueprint.maxEngineRating;
    }
}

