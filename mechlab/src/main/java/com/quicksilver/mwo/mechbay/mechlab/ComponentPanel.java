package com.quicksilver.mwo.mechbay.mechlab;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import com.quicksilver.mwo.mechbay.utility.ArmorBlueprint;
import com.quicksilver.mwo.mechbay.utility.ChassisBlueprint;
import com.quicksilver.mwo.mechbay.utility.CockpitBlueprint;
import com.quicksilver.mwo.mechbay.utility.EngineBlueprint;
import com.quicksilver.mwo.mechbay.utility.GyroBlueprint;
import com.quicksilver.mwo.mechbay.utility.HeatSinkBlueprint;
import com.quicksilver.mwo.mechbay.utility.JumpJetBlueprint;
import com.quicksilver.mwo.mechbay.utility.ModelBlueprint;
import com.quicksilver.mwo.mechbay.utility.MovementArchetype;
import com.quicksilver.mwo.mechbay.utility.MyomerBlueprint;
import com.quicksilver.mwo.mechbay.utility.StructureBlueprint;
import com.quicksilver.mwo.mechbay.utility.User;
import com.quicksilver.mwo.mechbay.utility.Variant;
import com.quicksilver.mwo.mechbay.utility.WeightClass;

public class ComponentPanel extends JPanel {

    private static final long serialVersionUID = 7577995873909787972L;
    
    public JLabel Label1;
    public JLabel Label2;
    public JLabel Label3;
    public JLabel Label4;
    public JLabel Label5;
    public JLabel Label6;

    public ComponentPanel() {
        initComponents();
    }

    private void initComponents() {
        this.Label1 = new JLabel();
        this.Label2 = new JLabel();
        this.Label3 = new JLabel();
        this.Label4 = new JLabel();
        this.Label5 = new JLabel();
        this.Label6 = new JLabel();
        setBorder(BorderFactory.createTitledBorder(null, "", 4, 2, User.preferences.DEFAULT_FONT_SIZE_12));
        setFont(User.preferences.DEFAULT_FONT_SIZE_16);
        setMinimumSize(new Dimension(295, 100));
        setName("Form");
        setOpaque(false);
        setPreferredSize(new Dimension(295, 100));
        setLayout(new GridBagLayout());
        
        this.Label1.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.Label1.setHorizontalAlignment(0);
        this.Label1.setAlignmentY(0.0F);
        this.Label1.setBorder(BorderFactory.createTitledBorder(null, "Something", 4, 2, User.preferences.DEFAULT_FONT_SIZE_10));
        this.Label1.setMaximumSize(new Dimension(125, 50));
        this.Label1.setMinimumSize(new Dimension(125, 50));
        this.Label1.setName("Label1");
        this.Label1.setPreferredSize(new Dimension(125, 50));
        GridBagConstraints localGridBagConstraints = new GridBagConstraints();
        localGridBagConstraints.gridx = 0;
        localGridBagConstraints.gridy = 0;
        localGridBagConstraints.weightx = 1.0D;
        localGridBagConstraints.weighty = 1.0D;
        add(this.Label1, localGridBagConstraints);
        this.Label2.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.Label2.setHorizontalAlignment(0);
        this.Label2.setAlignmentY(0.0F);
        this.Label2.setBorder(BorderFactory.createTitledBorder(null, "Something", 4, 2, User.preferences.DEFAULT_FONT_SIZE_10));
        this.Label2.setMaximumSize(new Dimension(125, 50));
        this.Label2.setMinimumSize(new Dimension(125, 50));
        this.Label2.setName("Label2");
        this.Label2.setPreferredSize(new Dimension(125, 50));
        localGridBagConstraints = new GridBagConstraints();
        localGridBagConstraints.gridx = 1;
        localGridBagConstraints.gridy = 0;
        localGridBagConstraints.weightx = 1.0D;
        localGridBagConstraints.weighty = 1.0D;
        add(this.Label2, localGridBagConstraints);
        this.Label3.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.Label3.setHorizontalAlignment(0);
        this.Label3.setAlignmentY(0.0F);
        this.Label3.setBorder(BorderFactory.createTitledBorder(null, "Something", 4, 2, User.preferences.DEFAULT_FONT_SIZE_10));
        this.Label3.setMaximumSize(new Dimension(125, 50));
        this.Label3.setMinimumSize(new Dimension(125, 50));
        this.Label3.setName("Label3");
        this.Label3.setPreferredSize(new Dimension(125, 50));
        localGridBagConstraints = new GridBagConstraints();
        localGridBagConstraints.gridx = 0;
        localGridBagConstraints.gridy = 1;
        localGridBagConstraints.weightx = 1.0D;
        localGridBagConstraints.weighty = 1.0D;
        add(this.Label3, localGridBagConstraints);
        
        this.Label4.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.Label4.setHorizontalAlignment(0);
        this.Label4.setAlignmentY(0.0F);
        this.Label4.setBorder(BorderFactory.createTitledBorder(null, "Something", 4, 2, User.preferences.DEFAULT_FONT_SIZE_10));
        this.Label4.setMaximumSize(new Dimension(125, 50));
        this.Label4.setMinimumSize(new Dimension(125, 50));
        this.Label4.setName("Label4");
        this.Label4.setPreferredSize(new Dimension(125, 50));
        localGridBagConstraints = new GridBagConstraints();
        localGridBagConstraints.gridx = 1;
        localGridBagConstraints.gridy = 1;
        localGridBagConstraints.weightx = 1.0D;
        localGridBagConstraints.weighty = 1.0D;
        add(this.Label4, localGridBagConstraints);
        
        this.Label5.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.Label5.setHorizontalAlignment(0);
        this.Label5.setAlignmentY(0.0F);
        this.Label5.setBorder(BorderFactory.createTitledBorder(null, "Something", 4, 2, User.preferences.DEFAULT_FONT_SIZE_10));
        this.Label5.setMaximumSize(new Dimension(125, 50));
        this.Label5.setMinimumSize(new Dimension(125, 50));
        this.Label5.setName("Label5");
        this.Label5.setPreferredSize(new Dimension(125, 50));
        localGridBagConstraints = new GridBagConstraints();
        localGridBagConstraints.gridx = 0;
        localGridBagConstraints.gridy = 2;
        localGridBagConstraints.weightx = 1.0D;
        localGridBagConstraints.weighty = 1.0D;
        add(this.Label5, localGridBagConstraints);
        this.Label6.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.Label6.setHorizontalAlignment(0);
        this.Label6.setAlignmentY(0.0F);
        this.Label6.setBorder(BorderFactory.createTitledBorder(null, "Something", 4, 2, User.preferences.DEFAULT_FONT_SIZE_10));
        this.Label6.setMaximumSize(new Dimension(125, 50));
        this.Label6.setMinimumSize(new Dimension(125, 50));
        this.Label6.setName("Label6");
        this.Label6.setPreferredSize(new Dimension(125, 50));
        localGridBagConstraints = new GridBagConstraints();
        localGridBagConstraints.gridx = 1;
        localGridBagConstraints.gridy = 2;
        localGridBagConstraints.weightx = 1.0D;
        localGridBagConstraints.weighty = 1.0D;
        add(this.Label6, localGridBagConstraints);
    }

    public void Set_Bottom_Row_Usage(boolean paramBoolean) {
        this.Label5.setEnabled(paramBoolean);
        this.Label6.setEnabled(paramBoolean);
        this.Label5.setVisible(paramBoolean);
        this.Label6.setVisible(paramBoolean);
    }

    public void Set_Label(JLabel label, String title, String text) {
        label.setText(text);
        ((TitledBorder) label.getBorder()).setTitle(title);
    }

    public void Set_Armor(ArmorBlueprint blueprint, int paramInt) {
        ((TitledBorder) getBorder()).setTitle("Armor");
        Set_Label(this.Label1, "Type", blueprint.name);
        Set_Label(this.Label2, "Cost", String.format("%,d C-Bills", blueprint.Get_Item_Cost(paramInt)));
        Set_Label(this.Label3, "Tonnage", String.format("%.2f tons", blueprint.Get_Tonnage(paramInt)));
        Set_Label(this.Label4, "Criticals", "" + blueprint.criticals);
        Set_Bottom_Row_Usage(false);
    }

    public void Set_Heatsinks(final HeatSinkBlueprint blueprint, final int heatSinkCount, final int engineRating) {
        ((TitledBorder) getBorder()).setTitle("Heat Sinks");
        Set_Label(this.Label1, "Type", blueprint.name);
        Set_Label(this.Label2, "Cost", String.format("%,d C-Bills", blueprint.Get_Item_Cost(heatSinkCount, engineRating)));
        Set_Label(this.Label3, "Tonnage", String.format("%.2f tons", blueprint.Get_Tonnage(heatSinkCount, engineRating)));
        Set_Label(this.Label4, "Count", "" + heatSinkCount);
        Set_Bottom_Row_Usage(true);
        Set_Label(this.Label5, "Dissipation", String.format("%.2f hps", 0.0D - blueprint.Get_Dissipation(heatSinkCount, engineRating)));
        Set_Label(this.Label6, "Threshold", String.format("%.2f heat", blueprint.Get_Threshold(heatSinkCount)));
    }

    public void Set_Structure(StructureBlueprint blueprint, double tonnage) {
        ((TitledBorder) getBorder()).setTitle("Structure");
        Set_Label(this.Label1, "Type", blueprint.name);
        Set_Label(this.Label2, "Cost", String.format("%,d C-Bills", blueprint.getItemCost(tonnage)));
        Set_Label(this.Label3, "Tonnage", String.format("%.2f tons", blueprint.getTonnage(tonnage)));
        Set_Label(this.Label4, "Criticals", "" + blueprint.criticals);
        Set_Bottom_Row_Usage(false);
    }

    public void Set_Jumpjets(JumpJetBlueprint blueprint, int jump_jet_count, double tonnage) {
        ((TitledBorder) getBorder()).setTitle("Jump Jets");
        Set_Label(this.Label1, "Type", blueprint.name);
        Set_Label(this.Label2, "Cost", String.format("%,d C-Bills", jump_jet_count * blueprint.Get_Item_Cost(tonnage)));
        Set_Label(this.Label3, "Tonnage", String.format("%.2f tons", jump_jet_count * blueprint.Get_Base_Tonnage(tonnage)));
        Set_Label(this.Label4, "Criticals", "" + blueprint.criticals);
        Set_Bottom_Row_Usage(false);
    }

    public void Set_Myomer(MyomerBlueprint blueprint) {
        ((TitledBorder) getBorder()).setTitle("Myomer");
        Set_Bottom_Row_Usage(false);
    }

    public void Set_Engine(EngineBlueprint blueprint, int engine_rating) {
        ((TitledBorder) getBorder()).setTitle("Engine");
        Set_Label(this.Label1, "Type", blueprint.name);
        Set_Label(this.Label2, "Cost", String.format("%,d C-Bills", blueprint.Get_Cost(engine_rating)));
        Set_Label(this.Label3, "Tonnage", String.format("%.2f tons", blueprint.Get_Tonnage(engine_rating)));
        Set_Label(this.Label4, "Criticals", "" + (blueprint.center_torso_criticals + blueprint.side_torso_criticals));
        Set_Bottom_Row_Usage(true);
        Set_Label(this.Label5, "Engine Rating", "" + engine_rating);
        Set_Label(this.Label6, "Internal Heat Sink", "" + engine_rating / 25);
    }

    public void Set_Cockpit(CockpitBlueprint blueprint) {
        ((TitledBorder) getBorder()).setTitle("Cockpit");
        Set_Label(this.Label1, "Type", blueprint.name);
        Set_Label(this.Label2, "Cost", String.format("%,d C-Bills", blueprint.item_cost));
        Set_Label(this.Label3, "Tonnage", String.format("%.2f tons", blueprint.tonnage));
        Set_Label(this.Label4, "Criticals", "" + blueprint.criticals);
        Set_Bottom_Row_Usage(false);
    }

    public void Set_Gyro(GyroBlueprint blueprint, int engine_rating) {
        ((TitledBorder) getBorder()).setTitle("Gyro");
        Set_Label(this.Label1, "Type", blueprint.name);
        Set_Label(this.Label2, "Cost", String.format("%,d C-Bills", blueprint.Get_Item_Cost(engine_rating)));
        Set_Label(this.Label3, "Tonnage", String.format("%.2f tons", blueprint.Get_Tonnage(engine_rating)));
        Set_Label(this.Label4, "Criticals", "" + blueprint.criticals);
        Set_Bottom_Row_Usage(false);
    }

    public void Set_Speed_Limits(ChassisBlueprint chassis_blueprint, ModelBlueprint model_blueprint, double speedModifier, double mascModifier) {
        ((TitledBorder) getBorder()).setTitle("Speed Limits");
        Set_Label(this.Label1, "Min Rating", "" + Variant.GetMinEngineRating(chassis_blueprint, model_blueprint));
        Set_Label(this.Label2, "Max Rating", "" + Variant.GetMaxEngineRating(chassis_blueprint, model_blueprint));
        Set_Label(this.Label3, "Min Speed", String.format("%.2f kph", Variant.GetMinEngineRating(chassis_blueprint, model_blueprint) * speedModifier * mascModifier / chassis_blueprint.tonnage));
        Set_Label(this.Label4, "Max Speed", String.format("%.2f kph", Variant.GetMaxEngineRating(chassis_blueprint, model_blueprint) * speedModifier * mascModifier / chassis_blueprint.tonnage));
        Set_Bottom_Row_Usage(false);
    }

    public void Set_Overview(ChassisBlueprint chassis_blueprint, ModelBlueprint model_blueprint) {
        ((TitledBorder) getBorder()).setTitle("Overview");
        Set_Label(this.Label1, "Weight", String.format("%.2f kph", chassis_blueprint.tonnage));
        Set_Label(this.Label2, "Cost (C-Bills)", String.format("%,d C-Bills", model_blueprint.cbill_cost));
        if (User.variant.chassis_type.tonnage > 75.0D) {
            Set_Label(this.Label3, "Class", WeightClass.ASSAULT.toString());
        } else if (User.variant.chassis_type.tonnage > 55.0D) {
            Set_Label(this.Label3, "Class", WeightClass.HEAVY.toString());
        } else if (User.variant.chassis_type.tonnage > 35.0D) {
            Set_Label(this.Label3, "Class", WeightClass.MEDIUM.toString());
        } else {
            Set_Label(this.Label3, "Class", WeightClass.LIGHT.toString());
        }
        if (User.variant.model_type.cbill_cost != 0L) {
            User.variant.model_type.mc_cost = ((int) (User.variant.model_type.cbill_cost / 2500L));
        } else if (User.variant.model_type.champion_model) {
            User.variant.model_type.mc_cost = ((int) (User.variant.chassis_type.tonnage * 40.0D));
        } else if (User.variant.model_type.hero_model) {
            User.variant.model_type.mc_cost = ((int) (User.variant.chassis_type.tonnage * 75.0D));
        } else {
            User.variant.model_type.mc_cost = 0;
        }
        Set_Label(this.Label4, "Cost (MC)", String.format("%,d MC", model_blueprint.mc_cost));
        Set_Bottom_Row_Usage(false);
    }

    public void Set_Modules(ChassisBlueprint chassis_blueprint, ModelBlueprint model_blueprint, boolean isMastered) {
        ((TitledBorder) getBorder()).setTitle("Modules");
        Set_Label(this.Label1, "Hybrid", "" + (isMastered ? 1 : 0));
        Set_Label(this.Label2, "Mech", "" + model_blueprint.mech_modules);
        Set_Label(this.Label3, "Consumable", "" + model_blueprint.consumable_modules);
        Set_Label(this.Label4, "Weapon", "" + model_blueprint.weapon_modules);
        Set_Bottom_Row_Usage(false);
    }

    public void Set_Movement_Archetype(MovementArchetype archetype) {
        ((TitledBorder) getBorder()).setTitle("Movement Archetype");
        Set_Label(this.Label1, "Type", archetype.name);
        Set_Label(this.Label2, "", "");
        Set_Label(this.Label3, "Max Climb", String.format("%.1f", archetype.max_climb_angle));
        Set_Label(this.Label4, "Min Climb", String.format("%.1f", archetype.min_climb_angle));
        Set_Bottom_Row_Usage(false);
    }

    public void Set_Manueverability(ChassisBlueprint chassis_blueprint, ModelBlueprint model_blueprint, int numberOfJumpJets) {
        ((TitledBorder) getBorder()).setTitle("Manueverability");
        Set_Label(this.Label1, "Acceleration", String.format("%.1f", model_blueprint.acceleration * User.kinetic_burst_modifier));
        Set_Label(this.Label2, "Deceleration", String.format("%.1f", model_blueprint.deceleration * User.hard_brake_modifier));
        Set_Label(this.Label3, "Turn Rate", String.format("%.1f", model_blueprint.turn_rate * User.anchor_turn_modifier));
        Set_Label(this.Label4, "Jump Jet Max", "" + numberOfJumpJets);
        Set_Bottom_Row_Usage(false);
    }

    public void Set_Movement_Range(ChassisBlueprint chassis_blueprint, ModelBlueprint model_blueprint) {
        ((TitledBorder) getBorder()).setTitle("Movement Range");
        Set_Label(this.Label1, "Torso Yaw", String.format("%.1f", model_blueprint.movement_ranges[0][0] * User.twist_x_modifier));
        Set_Label(this.Label2, "Torso Pitch", String.format("%.1f", model_blueprint.movement_ranges[0][1]));
        Set_Label(this.Label3, "Arm Yaw", String.format("%.1f", model_blueprint.movement_ranges[1][0]));
        Set_Label(this.Label4, "Arm Pitch", String.format("%.1f", model_blueprint.movement_ranges[1][1]));
        Set_Bottom_Row_Usage(false);
    }

    public void Set_Movement_Speed(ChassisBlueprint chassis_blueprint, ModelBlueprint model_blueprint) {
        ((TitledBorder) getBorder()).setTitle("Movement Speed");
        Set_Label(this.Label1, "Torso Yaw", String.format("%.1f", model_blueprint.movement_speeds[0][0] * User.twist_speed_modifier));
        Set_Label(this.Label2, "Torso Pitch", String.format("%.1f", model_blueprint.movement_speeds[0][1] * User.twist_speed_modifier));
        Set_Label(this.Label3, "Arm Yaw", String.format("%.1f", model_blueprint.movement_speeds[1][0] * User.arm_reflex_modifier));
        Set_Label(this.Label4, "Arm Pitch", String.format("%.1f", model_blueprint.movement_speeds[1][1] * User.arm_reflex_modifier));
        Set_Bottom_Row_Usage(false);
    }

    public void Set_Speed_Modifiers() {
        ((TitledBorder) getBorder()).setTitle("Speed Modifiers");
        Set_Label(this.Label1, "Legged Speed", "0.00 kph");
        Set_Label(this.Label2, "Reverse Speed", "0.00 kph");
        Set_Label(this.Label3, "Fall Damage", "");
        Set_Label(this.Label4, "Fall Threshold", "30 km/h");
        Set_Bottom_Row_Usage(false);
    }

    public void Set_Total_Hardpoints(int ballistic_count, int energy_count, int missile_count, int ams_count) {
        ((TitledBorder) getBorder()).setTitle("Total Hardpoints");
        Set_Label(this.Label1, "Ballistic", "" + ballistic_count);
        Set_Label(this.Label2, "Energy", "" + energy_count);
        Set_Label(this.Label3, "Missile", "" + missile_count);
        Set_Label(this.Label4, "AMS", "" + ams_count);
        Set_Bottom_Row_Usage(false);
    }
}
