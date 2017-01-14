package com.github.majora_incarnate.mwo.mechbay.entities;

import com.github.majora_incarnate.mwo.mechbay.entities.blueprints.*;
import com.github.majora_incarnate.mwo.mechbay.entities.enums.MechType;
import com.github.majora_incarnate.mwo.mechbay.entities.enums.SectionType;

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
    public Map<SectionType, Section> sections;

    public Variant(final Database database, final ChassisBlueprint chassisBlueprint, final ModelBlueprint modelBlueprint) {
        sectionTypes = new HashMap<>();
        this.sections = new HashMap<>();
        this.variantName = "";
        
        this.chassisType = chassisBlueprint;
        this.modelType = modelBlueprint;
        
        for (final Map.Entry<SectionType, String> modelSection : modelBlueprint.sectionModels.entrySet()) {
            for (SectionBlueprint section : database.SECTION_BLUEPRINTS) {
                if (section.section.equals(modelSection.getKey()) && section.name.equals(modelSection.getValue())) {
                    sectionTypes.put(modelSection.getKey(), section);
            
                    this.minimumJumpJets += section.minimumJumpJetModifier;
                    this.maximumJumpJets += section.maximumJumpJetModifier;
                    break;
                }
            }
        }
        
        sectionTypes.entrySet().forEach((sectionType) -> {
            sections.put(sectionType.getKey(), new Section(database, sectionType.getValue(), this.chassisType.tonnage));
        });
        
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
        
        this.sections.get(SectionType.HEAD).addComponent(this.cockpit.getCrittable());
        this.sections.get(SectionType.LEFT_TORSO).addComponent(this.engine.getCrittable(this.engine.hasSideTorsoCriticals()));
        this.sections.get(SectionType.RIGHT_TORSO).addComponent(this.engine.getCrittable(this.engine.hasSideTorsoCriticals()));
        this.sections.get(SectionType.CENTER_TORSO).addComponent(this.engine.getCrittable());
        this.sections.get(SectionType.CENTER_TORSO).addComponent(this.gyro.getCrittable());
                    
        this.sectionTypes.entrySet().stream().map((sectionEntry) -> {
            if (this.minimumJumpJets > 0) {
                for (int i = 0; i < sectionEntry.getValue().minimumJumpJetModifier; ++i) {
                    sections.get(sectionEntry.getKey()).addComponent(this.jumpjets.getCrittable(this.chassisType.tonnage));
                }
            }
            return sectionEntry;            
        }).map((sectionEntry) -> {
            for (int i = 0; i < sectionEntry.getValue().hardwiredHeatsinks; i++) {
                this.sections.get(sectionEntry.getKey()).addComponent(this.heatsinks.getCrittable());
            }
            return sectionEntry;            
        }).map((sectionEntry) -> {
            for (int i = 0; i < sectionEntry.getValue().hardwiredArmor; i++) {
                this.sections.get(sectionEntry.getKey()).addComponent(this.armor.getCrittable());
            }
            return sectionEntry;            
        }).forEachOrdered((sectionEntry) -> {
            for (int i = 0; i < sectionEntry.getValue().hardwiredStructure; i++) {
                this.sections.get(sectionEntry.getKey()).addComponent(this.structure.getCrittable());
            }
        });
            
        this.sections.values().forEach((section) -> {
            section.components.forEach((crittable) -> {
                crittable.isLocked = true;
            });
        });
    }

    public void calculateCriticals() {
        this.currentCriticals = 0;
        
        this.sections.values().forEach((section) -> {
            this.currentCriticals += section.currentCriticals;
        });
    }

    public void calculateTonnage() {
        this.currentTonnage = 0.0;
        int n = 0;
        
        n = this.sections.values().stream().map((section) -> section.frontArmor + section.rearArmor - section.minimumArmor).reduce(n, Integer::sum);
            
        this.currentTonnage += this.engine.getTonnage(this.currentEngineRating);
        this.currentTonnage += this.gyro.getTonnage(this.currentEngineRating);
        this.currentTonnage += this.cockpit.tonnage;
        this.currentTonnage += this.armor.getTonnage(n);
        this.currentTonnage += this.structure.getTonnage(this.chassisType.tonnage);
        this.currentTonnage += this.heatsinks.getTonnage(this.currentHeatSinkCount, this.currentEngineRating);
        
        this.sections.values().forEach((section) -> {
            section.components.stream().forEach((crittable) -> {
                this.currentTonnage += crittable.tonnage;
            });
        });
    }

    public int getMaximumArmorTotal() {
        int maxArmor = 0;
        
        maxArmor = this.sections.values().stream().map((section) -> section.maximumArmor).reduce(maxArmor, Integer::sum);
            
        return maxArmor;
    }

    public int getCurrentArmorTotal() {
        int currentArmor = 0;
        
        currentArmor = this.sections.values().stream().map((section) -> section.frontArmor + section.rearArmor).reduce(currentArmor, Integer::sum);
            
        return currentArmor;
    }

    public void updateMech() {
        this.minimumJumpJets = 0;
        this.maximumJumpJets = 0;
        
        this.sectionTypes.entrySet().stream().forEachOrdered((sectionEntry) -> {
            this.minimumJumpJets += sectionEntry.getValue().minimumJumpJetModifier;
            this.maximumJumpJets += sectionEntry.getValue().maximumJumpJetModifier;
            
            for (int i = 0; i < sectionEntry.getValue().minimumJumpJetModifier; ++i) {
                sections.get(sectionEntry.getKey()).addComponent(this.jumpjets.getCrittable(this.chassisType.tonnage));
            }          
        });
        
        this.currentJumpJets = this.minimumJumpJets;
    }

    public static int getMinEngineRating(final User user, final ChassisBlueprint chassisBlueprint, final ModelBlueprint modelBlueprint) {
        if (!user.omniRestrictionsEnabled && chassisBlueprint.mechType.equals(MechType.OMNIMECH)) {
            return user.variant.chassisType.tonnage * 2.0 < 100.0 ? 100 : (int) user.variant.chassisType.tonnage * 2;
        }
        return modelBlueprint.minEngineRating;
    }

    public static int getMaxEngineRating(final User user, final ChassisBlueprint chassisBlueprint, final ModelBlueprint modelBlueprint) {
        if (!user.omniRestrictionsEnabled && chassisBlueprint.mechType.equals(MechType.OMNIMECH)) {
            double maxEngineMultiplier = 1.4;
            double maxSpeedMultiplier = 8.5;
            
            if (chassisBlueprint.tonnage > 35.0) {
                maxEngineMultiplier -= 0.1;
            }
            if (chassisBlueprint.tonnage > 55.0) {
                maxEngineMultiplier -= 0.1;
            }
            
            int n = (int) (Math.ceil(modelBlueprint.maxEngineRating * maxEngineMultiplier / 5.0) * 5.0);
            int n2 = (int) Math.round(chassisBlueprint.tonnage * maxSpeedMultiplier / 5.0) * 5;
            
            return n > n2  ? n2 : n;
        }
        return modelBlueprint.maxEngineRating;
    }
}

