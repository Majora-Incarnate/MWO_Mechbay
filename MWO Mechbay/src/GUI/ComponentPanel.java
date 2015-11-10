package GUI;

import Mech.Armor_Blueprint;
import Mech.Chassis_Blueprint;
import Mech.Cockpit_Blueprint;
import Mech.Engine_Blueprint;
import Mech.Gyro_Blueprint;
import Mech.Heatsink_Blueprint;
import Mech.Jumpjet_Blueprint;
import Mech.Model_Blueprint;
import Mech.Myomer_Blueprint;
import Mech.Structure_Blueprint;
import Mech.Variant;
import Utility.Constants;
import Utility.Preferences;
import Utility.User;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class ComponentPanel extends JPanel {
  public JLabel Label1;
  public JLabel Label2;
  public JLabel Label3;
  public JLabel Label4;
  public JLabel Label5;
  public JLabel Label6;
  
  public ComponentPanel()
  {
    initComponents();
  }
  
  private void initComponents()
  {
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
  
  public void Set_Bottom_Row_Usage(boolean paramBoolean)
  {
    this.Label5.setEnabled(paramBoolean);
    this.Label6.setEnabled(paramBoolean);
    this.Label5.setVisible(paramBoolean);
    this.Label6.setVisible(paramBoolean);
  }
  
  public void Set_Label(JLabel paramJLabel, String paramString1, String paramString2)
  {
    paramJLabel.setText(paramString2);
    ((TitledBorder)paramJLabel.getBorder()).setTitle(paramString1);
  }
  
  public void Set_Armor(Armor_Blueprint paramArmor_Blueprint, int paramInt)
  {
    ((TitledBorder)getBorder()).setTitle("Armor");
    Set_Label(this.Label1, "Type", paramArmor_Blueprint.name);
    Set_Label(this.Label2, "Cost", String.format("%,d C-Bills", new Object[] { paramArmor_Blueprint.Get_Item_Cost(paramInt) }));
    Set_Label(this.Label3, "Tonnage", String.format("%.2f tons", new Object[] { paramArmor_Blueprint.Get_Tonnage(paramInt) }));
    Set_Label(this.Label4, "Criticals", "" + paramArmor_Blueprint.criticals);
    Set_Bottom_Row_Usage(false);
  }
  
  public void Set_Heatsinks(Heatsink_Blueprint paramHeatsink_Blueprint, int paramInt1, int paramInt2)
  {
    ((TitledBorder)getBorder()).setTitle("Heat Sinks");
    Set_Label(this.Label1, "Type", paramHeatsink_Blueprint.name);
    Set_Label(this.Label2, "Cost", String.format("%,d C-Bills", new Object[] { paramHeatsink_Blueprint.Get_Item_Cost(paramInt2, paramInt1) }));
    Set_Label(this.Label3, "Tonnage", String.format("%.2f tons", new Object[] { paramHeatsink_Blueprint.Get_Tonnage(paramInt2, paramInt1) }));
    Set_Label(this.Label4, "Count", "" + paramInt2);
    Set_Bottom_Row_Usage(true);
    Set_Label(this.Label5, "Dissipation", String.format("%.2f hps", new Object[] { 0.0D - paramHeatsink_Blueprint.Get_Dissipation(paramInt2, paramInt1)}));
    Set_Label(this.Label6, "Threshold", String.format("%.2f heat", new Object[] { paramHeatsink_Blueprint.Get_Threshold(paramInt2) }));
  }
  
  public void Set_Structure(Structure_Blueprint paramStructure_Blueprint, double paramDouble)
  {
    ((TitledBorder)getBorder()).setTitle("Structure");
    Set_Label(this.Label1, "Type", paramStructure_Blueprint.name);
    Set_Label(this.Label2, "Cost", String.format("%,d C-Bills", new Object[] { paramStructure_Blueprint.Get_Item_Cost(paramDouble) }));
    Set_Label(this.Label3, "Tonnage", String.format("%.2f tons", new Object[] { paramStructure_Blueprint.Get_Tonnage(paramDouble) }));
    Set_Label(this.Label4, "Criticals", "" + paramStructure_Blueprint.criticals);
    Set_Bottom_Row_Usage(false);
  }
  
  public void Set_Jumpjets(Jumpjet_Blueprint paramJumpjet_Blueprint, int paramInt, double paramDouble)
  {
    ((TitledBorder)getBorder()).setTitle("Jump Jets");
    Set_Label(this.Label1, "Type", paramJumpjet_Blueprint.name);
    Set_Label(this.Label2, "Cost", String.format("%,d C-Bills", new Object[] { paramInt * paramJumpjet_Blueprint.Get_Item_Cost(paramDouble)}));
    Set_Label(this.Label3, "Tonnage", String.format("%.2f tons", new Object[] { paramInt * paramJumpjet_Blueprint.Get_Base_Tonnage(paramDouble)}));
    Set_Label(this.Label4, "Criticals", "" + paramJumpjet_Blueprint.criticals);
    Set_Bottom_Row_Usage(false);
  }
  
  public void Set_Myomer(Myomer_Blueprint paramMyomer_Blueprint)
  {
    ((TitledBorder)getBorder()).setTitle("Myomer");
    Set_Bottom_Row_Usage(false);
  }
  
  public void Set_Engine(Engine_Blueprint paramEngine_Blueprint, int paramInt)
  {
    ((TitledBorder)getBorder()).setTitle("Engine");
    Set_Label(this.Label1, "Type", paramEngine_Blueprint.name);
    Set_Label(this.Label2, "Cost", String.format("%,d C-Bills", new Object[] { paramEngine_Blueprint.Get_Cost(paramInt) }));
    Set_Label(this.Label3, "Tonnage", String.format("%.2f tons", new Object[] { paramEngine_Blueprint.Get_Tonnage(paramInt) }));
    Set_Label(this.Label4, "Criticals", "" + (paramEngine_Blueprint.center_torso_criticals + paramEngine_Blueprint.side_torso_criticals));
    Set_Bottom_Row_Usage(true);
    Set_Label(this.Label5, "Engine Rating", "" + paramInt);
    Set_Label(this.Label6, "Internal Heat Sink", "" + paramInt / 25);
  }
  
  public void Set_Cockpit(Cockpit_Blueprint paramCockpit_Blueprint)
  {
    ((TitledBorder)getBorder()).setTitle("Cockpit");
    Set_Label(this.Label1, "Type", paramCockpit_Blueprint.name);
    Set_Label(this.Label2, "Cost", String.format("%,d C-Bills", new Object[] { paramCockpit_Blueprint.item_cost}));
    Set_Label(this.Label3, "Tonnage", String.format("%.2f tons", new Object[] { paramCockpit_Blueprint.tonnage}));
    Set_Label(this.Label4, "Criticals", "" + paramCockpit_Blueprint.criticals);
    Set_Bottom_Row_Usage(false);
  }
  
  public void Set_Gyro(Gyro_Blueprint paramGyro_Blueprint, int paramInt)
  {
    ((TitledBorder)getBorder()).setTitle("Gyro");
    Set_Label(this.Label1, "Type", paramGyro_Blueprint.name);
    Set_Label(this.Label2, "Cost", String.format("%,d C-Bills", new Object[] { paramGyro_Blueprint.Get_Item_Cost(paramInt) }));
    Set_Label(this.Label3, "Tonnage", String.format("%.2f tons", new Object[] { paramGyro_Blueprint.Get_Tonnage(paramInt) }));
    Set_Label(this.Label4, "Criticals", "" + paramGyro_Blueprint.criticals);
    Set_Bottom_Row_Usage(false);
  }
  
  public void Set_Speed_Limits(Chassis_Blueprint paramChassis_Blueprint, Model_Blueprint paramModel_Blueprint, double paramDouble1, double paramDouble2, double paramDouble3, boolean paramBoolean)
  {
    ((TitledBorder)getBorder()).setTitle("Speed Limits");
    Set_Label(this.Label1, "Min Rating", "" + Variant.GetMinEngineRating(paramChassis_Blueprint, paramModel_Blueprint, paramBoolean));
    Set_Label(this.Label2, "Max Rating", "" + Variant.GetMaxEngineRating(paramChassis_Blueprint, paramModel_Blueprint, paramBoolean));
    Set_Label(this.Label3, "Min Speed", String.format("%.2f kph", new Object[] { Variant.GetMinEngineRating(paramChassis_Blueprint, paramModel_Blueprint, paramBoolean) * paramDouble1 * paramDouble2 / paramDouble3}));
    Set_Label(this.Label4, "Max Speed", String.format("%.2f kph", new Object[] { Variant.GetMaxEngineRating(paramChassis_Blueprint, paramModel_Blueprint, paramBoolean) * paramDouble1 * paramDouble2 / paramDouble3}));
    Set_Bottom_Row_Usage(false);
  }
  
  public void Set_Overview(Chassis_Blueprint paramChassis_Blueprint, Model_Blueprint paramModel_Blueprint)
  {
    ((TitledBorder)getBorder()).setTitle("Overview");
    Set_Label(this.Label1, "Weight", String.format("%.2f kph", new Object[] { paramChassis_Blueprint.tonnage}));
    Set_Label(this.Label2, "Cost (C-Bills)", String.format("%,d C-Bills", new Object[] { paramModel_Blueprint.cbill_cost}));
    if (User.variant.chassis_type.tonnage > 75.0D) {
      Set_Label(this.Label3, "Class", Constants.weigthClasses[3]);
    } else if (User.variant.chassis_type.tonnage > 55.0D) {
      Set_Label(this.Label3, "Class", Constants.weigthClasses[2]);
    } else if (User.variant.chassis_type.tonnage > 35.0D) {
      Set_Label(this.Label3, "Class", Constants.weigthClasses[1]);
    } else {
      Set_Label(this.Label3, "Class", Constants.weigthClasses[0]);
    }
    if (User.variant.model_type.cbill_cost != 0L) {
      User.variant.model_type.mc_cost = ((int)(User.variant.model_type.cbill_cost / 2500L));
    } else if (User.variant.model_type.champion_model) {
      User.variant.model_type.mc_cost = ((int)(User.variant.chassis_type.tonnage * 40.0D));
    } else if (User.variant.model_type.hero_model) {
      User.variant.model_type.mc_cost = ((int)(User.variant.chassis_type.tonnage * 75.0D));
    } else {
      User.variant.model_type.mc_cost = 0;
    }
    Set_Label(this.Label4, "Cost (MC)", String.format("%,d MC", new Object[] { paramModel_Blueprint.mc_cost}));
    Set_Bottom_Row_Usage(false);
  }
  
  public void Set_Modules(Chassis_Blueprint paramChassis_Blueprint, Model_Blueprint paramModel_Blueprint, boolean paramBoolean)
  {
    ((TitledBorder)getBorder()).setTitle("Modules");
    Set_Label(this.Label1, "Hybrid", "" + (paramBoolean ? 1 : 0));
    Set_Label(this.Label2, "Mech", "" + (paramModel_Blueprint.mech_modules_override != -1 ? paramModel_Blueprint.mech_modules_override : paramChassis_Blueprint.mech_modules));
    Set_Label(this.Label3, "Consumable", "" + (paramModel_Blueprint.consumable_modules_override != -1 ? paramModel_Blueprint.consumable_modules_override : paramChassis_Blueprint.consumable_modules));
    Set_Label(this.Label4, "Weapon", "" + (paramModel_Blueprint.weapon_modules_override != -1 ? paramModel_Blueprint.weapon_modules_override : paramChassis_Blueprint.weapon_modules));
    Set_Bottom_Row_Usage(false);
  }
  
  public void Set_Movement_Archetype(String paramString)
  {
    ((TitledBorder)getBorder()).setTitle("Movement Archetype");
    Set_Label(this.Label1, "Type", paramString);
    Set_Label(this.Label2, "", "");
    Set_Label(this.Label3, "Max Climb", String.format("%.1f", new Object[] { 45.0D}));
    for (int i = 0; i < 5; i++) {
      if (paramString.equals(Constants.MOVEMENT_ARCHETYPES[i])) {
        Set_Label(this.Label4, "Min Climb", String.format("%.1f", new Object[] { Constants.MIN_CLIMB_ANGLE[i]}));
      }
    }
    Set_Bottom_Row_Usage(false);
  }
  
  public void Set_Manueverability(Chassis_Blueprint paramChassis_Blueprint, Model_Blueprint paramModel_Blueprint, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3)
  {
    ((TitledBorder)getBorder()).setTitle("Manueverability");
    Set_Label(this.Label1, "Acceleration", String.format("%.1f", new Object[] { (paramModel_Blueprint.acceleration_override > 0.0D ? paramChassis_Blueprint.acceleration : paramModel_Blueprint.acceleration_override) * paramDouble2}));
    Set_Label(this.Label2, "Deceleration", String.format("%.1f", new Object[] { (paramModel_Blueprint.deceleration_override > 0.0D ? paramChassis_Blueprint.deceleration : paramModel_Blueprint.deceleration_override) * paramDouble3}));
    Set_Label(this.Label3, "Turn Rate", String.format("%.1f", new Object[] { (paramModel_Blueprint.turn_rate_override > 0.0D ? paramChassis_Blueprint.turn_rate : paramModel_Blueprint.turn_rate_override) * paramDouble1}));
    Set_Label(this.Label4, "Jump Jet Max", "" + paramInt);
    Set_Bottom_Row_Usage(false);
  }
  
  public void Set_Movement_Range(Chassis_Blueprint paramChassis_Blueprint, Model_Blueprint paramModel_Blueprint, double paramDouble)
  {
    ((TitledBorder)getBorder()).setTitle("Movement Range");
    Set_Label(this.Label1, "Torso Yaw", String.format("%.1f", new Object[] { (paramModel_Blueprint.movement_range_overrides[0][0] > 0.0D ? paramModel_Blueprint.movement_range_overrides[0][0] : paramChassis_Blueprint.movement_ranges[0][0]) * paramDouble}));
    Set_Label(this.Label2, "Torso Pitch", String.format("%.1f", new Object[] { paramModel_Blueprint.movement_range_overrides[0][1] > 0.0D ? paramModel_Blueprint.movement_range_overrides[0][1] : paramChassis_Blueprint.movement_ranges[0][1]}));
    Set_Label(this.Label3, "Arm Yaw", String.format("%.1f", new Object[] { paramModel_Blueprint.movement_range_overrides[1][0] > 0.0D ? paramModel_Blueprint.movement_range_overrides[1][0] : paramChassis_Blueprint.movement_ranges[1][0]}));
    Set_Label(this.Label4, "Arm Pitch", String.format("%.1f", new Object[] { paramModel_Blueprint.movement_range_overrides[1][1] > 0.0D ? paramModel_Blueprint.movement_range_overrides[1][1] : paramChassis_Blueprint.movement_ranges[1][1]}));
    Set_Bottom_Row_Usage(false);
  }
  
  public void Set_Movement_Speed(Chassis_Blueprint paramChassis_Blueprint, Model_Blueprint paramModel_Blueprint, double paramDouble1, double paramDouble2)
  {
    ((TitledBorder)getBorder()).setTitle("Movement Speed");
    Set_Label(this.Label1, "Torso Yaw", String.format("%.1f", new Object[] { (paramModel_Blueprint.movement_speed_overrides[0][0] > 0.0D ? paramModel_Blueprint.movement_speed_overrides[0][0] : paramChassis_Blueprint.movement_speeds[0][0]) * paramDouble1}));
    Set_Label(this.Label2, "Torso Pitch", String.format("%.1f", new Object[] { (paramModel_Blueprint.movement_speed_overrides[0][1] > 0.0D ? paramModel_Blueprint.movement_speed_overrides[0][1] : paramChassis_Blueprint.movement_speeds[0][1]) * paramDouble1}));
    Set_Label(this.Label3, "Arm Yaw", String.format("%.1f", new Object[] { (paramModel_Blueprint.movement_speed_overrides[1][0] > 0.0D ? paramModel_Blueprint.movement_speed_overrides[1][0] : paramChassis_Blueprint.movement_speeds[1][0]) * paramDouble2}));
    Set_Label(this.Label4, "Arm Pitch", String.format("%.1f", new Object[] { (paramModel_Blueprint.movement_speed_overrides[1][1] > 0.0D ? paramModel_Blueprint.movement_speed_overrides[1][1] : paramChassis_Blueprint.movement_speeds[1][1]) * paramDouble2}));
    Set_Bottom_Row_Usage(false);
  }
  
  public void Set_Speed_Modifiers()
  {
    ((TitledBorder)getBorder()).setTitle("Speed Modifiers");
    Set_Label(this.Label1, "Legged Speed", "0.00 kph");
    Set_Label(this.Label2, "Reverse Speed", "0.00 kph");
    Set_Label(this.Label3, "Fall Damage", "");
    Set_Label(this.Label4, "Fall Threshold", "30 km/h");
    Set_Bottom_Row_Usage(false);
  }
  
  public void Set_Total_Hardpoints(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    ((TitledBorder)getBorder()).setTitle("Total Hardpoints");
    Set_Label(this.Label1, "Ballistic", "" + paramInt1);
    Set_Label(this.Label2, "Energy", "" + paramInt2);
    Set_Label(this.Label3, "Missile", "" + paramInt3);
    Set_Label(this.Label4, "AMS", "" + paramInt4);
    Set_Bottom_Row_Usage(false);
  }
}