package Mechlab;

import Utility.*;

import javax.swing.*;
import javax.swing.border.SoftBevelBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.Component;
import java.awt.event.*;
import java.util.ArrayList;

public class MechlabForm extends JFrame {
    //private final DecimalFormat formatter = new DecimalFormat("#.#");
    private final SpinnerNumberModel EngineRatingSpinnerModel;
    private final SpinnerNumberModel HeatSinkSpinnerModel;
    private final SpinnerNumberModel JumpJetSpinnerModel;
    private final SpinnerNumberModel RightArmSpinnerModel;
    private final SpinnerNumberModel LeftArmSpinnerModel;
    private final SpinnerNumberModel RightTorsoSpinnerModel;
    private final SpinnerNumberModel LeftTorsoSpinnerModel;
    private final SpinnerNumberModel RightRearTorsoSpinnerModel;
    private final SpinnerNumberModel LeftRearTorsoSpinnerModel;
    private final SpinnerNumberModel CenterTorsoSpinnerModel;
    private final SpinnerNumberModel CenterRearTorsoSpinnerModel;
    private final SpinnerNumberModel HeadSpinnerModel;
    private final SpinnerNumberModel RightLegSpinnerModel;
    private final SpinnerNumberModel LeftLegSpinnerModel;
    private final JLabel AmountLabel = new JLabel();
    private final JLabel CenterTorsoLabel = new JLabel();
    private final JLabel CurrentArmorLabel = new JLabel();
    private final JLabel FrontLabel = new JLabel();
    private final JLabel HeadLabel = new JLabel();
    private final JLabel JumpDistanceLabel = new JLabel();
    private final JLabel JumpHeightLabel = new JLabel();
    private final JLabel LeftArmLabel = new JLabel();
    private final JLabel LeftLegLabel = new JLabel();
    private final JLabel LeftTorsoLabel = new JLabel();
    private final JLabel ModelSpeedLabel = new JLabel();
    private final JLabel PointsPerTonLabel = new JLabel();
    private final JLabel RearLabel = new JLabel();
    private final JLabel RightArmLabel = new JLabel();
    private final JLabel RightLegLabel = new JLabel();
    private final JLabel RightTorsoLabel = new JLabel();
    private final JLabel SectionLabel = new JLabel();
    private final JLabel TotalLabel = new JLabel();
    private final JLabel alphaStrikeHeatLabel = new JLabel();
    private final JLabel alphaStrikeLabel = new JLabel();
    private final JLabel criticalsUsedLabel = new JLabel();
    private final JLabel currentTonnageLabel = new JLabel();
    private final JLabel firepowerLabel = new JLabel();
    private final JLabel heatEfficiencyLabel = new JLabel();
    private final JLabel rangeLabel = new JLabel();
    JProgressBar CenterTorsoStructureProgressBar;
    JProgressBar HeadStructureProgressBar;
    JProgressBar LeftArmStructureProgressBar;
    JProgressBar LeftLegStructureProgressBar;
    JProgressBar LeftTorsoStructureProgressBar;
    JProgressBar RightArmStructureProgressBar;
    JProgressBar RightLegStructureProgressBar;
    JProgressBar RightTorsoStructureProgressBar;
    private String temp_string;
    private double temp_double;
    private int temp_int;
    private boolean event_trigger = false;
    private JButton AboutButton;
    private JButton AddButton;
    private JPanel AdjustmentsPanel;
    private JList AmmoList;
    private JScrollPane AmmoScrollPane;
    private JToggleButton AnchorTurnToggleButton;
    private JToggleButton ApolloToggleButton;
    private JToggleButton ArmReflexToggleButton;
    private JPanel ArmorAdjustmentPanel;
    private JComboBox ArmorComboBox;
    private ComponentPanel ArmorPanel;
    private JToggleButton ArtemisIVToggleButton;
    private JToggleButton ArtemisVToggleButton;
    private JList BallisticList;
    private JScrollPane BallisticScrollPane;
    private JPanel BottomPanel;
    private JPanel ButtonPanel;
    private JPanel CapabilityPanel;
    private JLabel CaptureRateLabel;
    private JSpinner CenterRearTorsoSpinner;
    private JLabel CenterTorsoAMSHardpointLabel;
    private JLabel CenterTorsoAmountLabel;
    private JLabel CenterTorsoBallisticHardpointLabel;
    private JList CenterTorsoCriticalList;
    private JPanel CenterTorsoCriticalPanel;
    private JLabel CenterTorsoECMHardpointLabel;
    private JLabel CenterTorsoEnergyHardpointLabel;
    private JPanel CenterTorsoFrontArmorPanel;
    private JProgressBar CenterTorsoFrontArmorProgressBar;
    private JLabel CenterTorsoMissileHardpointLabel;
    private JComboBox CenterTorsoPodComboBox;
    private JPanel CenterTorsoRearArmorPanel;
    private JProgressBar CenterTorsoRearArmorProgressBar;
    private JSpinner CenterTorsoSpinner;
    private JLabel ChampionLabel;
    private JComboBox ChassisComboBox;
    private ComponentPanel ChassisInfoPanel;
    private JPanel ChassisOverviewPanel;
    private JPanel ChassisPanel;
    private JPanel ChassisSpecsPanel;
    private JButton ClearArmorButton;
    private JButton ClearQueueButton;
    private JComboBox CockpitComboBox;
    private ComponentPanel CockpitPanel;
    private JPanel ComponentPanel;
    private JScrollPane ComponentScrollPane;
    private JToggleButton CoolRunToggleButton;
    private JProgressBar CurrentArmorProgressBar;
    private JLabel DefensiveLockLabel;
    private JLabel ECMLabel;
    private JPanel EfficienciesPanel;
    private JToggleButton EliteModToggleButton;
    private JList EnergyList;
    private JScrollPane EnergyScrollPane;
    private JComboBox EngineComboBox;
    private ComponentPanel EnginePanel;
    private JSpinner EngineRatingSpinner;
    private JButton EquipButton;
    private JList EquipmentList;
    private JList EquipmentQueueList;
    private JPanel EquipmentQueuePanel;
    private JScrollPane EquipmentScrollPane;
    private JPanel EquipmentSpecsPanel;
    private JTabbedPane EquipmentTabbedPane;
    private JButton ExportButton;
    private JToggleButton FastFireToggleButton;
    private JPanel FeatureButtonPanel;
    private JToggleButton FrankenmechToggleButton;
    private JToggleButton FutureTechToggleButton;
    private JComboBox GyroComboBox;
    private ComponentPanel GyroPanel;
    private JToggleButton HardBrakeToggleButton;
    private JLabel HeadAMSHardpointLabel;
    private JLabel HeadAmountLabel;
    private JProgressBar HeadArmorProgressBar;
    private JLabel HeadBallisticHardpointLabel;
    private JList HeadCriticalList;
    private JPanel HeadCriticalPanel;
    private JLabel HeadECMHardpointLabel;
    private JLabel HeadEnergyHardpointLabel;
    private JLabel HeadMissileHardpointLabel;
    private JComboBox HeadPodComboBox;
    private JSpinner HeadSpinner;
    private JToggleButton HeatContainmentToggleButton;
    private JSpinner HeatSinkSpinner;
    private JComboBox HeatsinkComboBox;
    private ComponentPanel HeatsinkPanel;
    private JLabel HeroLabel;
    private JButton ImportButton;
    private JButton InfoButton;
    private JPanel InfoButtonPanel;
    private JLabel InfoGatherLabel;
    private JPanel InfoPanel;
    private JProgressBar JumpDistanceBar;
    private JProgressBar JumpHeightBar;
    private JSpinner JumpJetSpinner;
    private JLabel JumpLabel;
    private JComboBox JumpjetComboBox;
    private ComponentPanel JumpjetPanel;
    private JToggleButton KineticBurstToggleButton;
    private JPanel LRMSRMFCSPanel;
    private JLabel LeftArmAMSHardpointLabel;
    private JLabel LeftArmAmountLabel;
    private JProgressBar LeftArmArmorProgressBar;
    private JLabel LeftArmBallisticHardpointLabel;
    private JList LeftArmCriticalList;
    private JPanel LeftArmCriticalPanel;
    private JLabel LeftArmECMHardpointLabel;
    private JLabel LeftArmEnergyHardpointLabel;
    private JLabel LeftArmMissileHardpointLabel;
    private JComboBox LeftArmPodComboBox;
    private JSpinner LeftArmSpinner;
    private JToggleButton LeftHandToggleButton;
    private JLabel LeftLegAMSHardpointLabel;
    private JLabel LeftLegAmountLabel;
    private JProgressBar LeftLegArmorProgressBar;
    private JLabel LeftLegBallisticHardpointLabel;
    private JList LeftLegCriticalList;
    private JPanel LeftLegCriticalPanel;
    private JLabel LeftLegECMHardpointLabel;
    private JLabel LeftLegEnergyHardpointLabel;
    private JLabel LeftLegMissileHardpointLabel;
    private JComboBox LeftLegPodComboBox;
    private JSpinner LeftLegSpinner;
    private JToggleButton LeftLowerArmToggleButton;
    private JSpinner LeftRearTorsoSpinner;
    private JLabel LeftTorsoAMSHardpointLabel;
    private JLabel LeftTorsoAmountLabel;
    private JLabel LeftTorsoBallisticHardpointLabel;
    private JToggleButton LeftTorsoCASEToggleButton;
    private JList LeftTorsoCriticalList;
    private JPanel LeftTorsoCriticalPanel;
    private JLabel LeftTorsoECMHardpointLabel;
    private JLabel LeftTorsoEnergyHardpointLabel;
    private JPanel LeftTorsoFrontArmorPanel;
    private JProgressBar LeftTorsoFrontArmorProgressBar;
    private JLabel LeftTorsoMissileHardpointLabel;
    private JComboBox LeftTorsoPodComboBox;
    private JPanel LeftTorsoRearArmorPanel;
    private JProgressBar LeftTorsoRearArmorProgressBar;
    private JSpinner LeftTorsoSpinner;
    private JButton LoadButton;
    private JPanel MRMFCSPanel;
    private ComponentPanel ManueverabilityPanel;
    private JToggleButton MasterModToggleButton;
    private JButton MaxArmorButton;
    private JButton MaxArmorButton1;
    private JButton MaxArmorButton2;
    private JLabel MaxZoomLabel;
    private JScrollPane MechDescriptionScrollPane;
    private JTextPane MechDescriptionTextPane;
    private JPanel MechDisplayPanel;
    private JLabel MechImage;
    private JTabbedPane MechTabPane;
    private JButton MechTreesButton;
    private JLabel MechTypeLabel;
    private JList MissileList;
    private JScrollPane MissileScrollPane;
    private JToggleButton MixtechToggleButton;
    private JComboBox ModelComboBox;
    private JProgressBar ModelSpeedProgressBar;
    private ComponentPanel ModuleOverviewPanel;
    private JPanel ModulePanel;
    private JToggleButton ModuleSlotToggleButton;
    private ComponentPanel MovementRangePanel;
    private ComponentPanel MovementSpeedPanel;
    private JComboBox MyomerComboBox;
    private ComponentPanel MyomerPanel;
    private JLabel OffensiveLockLabel;
    private JToggleButton OmniRestrictToggleButton;
    private JPanel OverviewPanel;
    private JButton PilotTreesButton;
    private JLabel PointsPerTonAmount;
    private JPanel QuirksPanel;
    private JPanel RadarSpecsPanel;
    private JButton RemoveFromQueueButton;
    private JLabel RightArmAMSHardpointLabel;
    private JLabel RightArmAmountLabel;
    private JProgressBar RightArmArmorProgressBar;
    private JLabel RightArmBallisticHardpointLabel;
    private JList RightArmCriticalList;
    private JPanel RightArmCriticalPanel;
    private JLabel RightArmECMHardpointLabel;
    private JLabel RightArmEnergyHardpointLabel;
    private JLabel RightArmMissileHardpointLabel;
    private JComboBox RightArmPodComboBox;
    private JSpinner RightArmSpinner;
    private JToggleButton RightHandToggleButton;
    private JLabel RightLegAMSHardpointLabel;
    private JLabel RightLegAmountLabel;
    private JProgressBar RightLegArmorProgressBar;
    private JLabel RightLegBallisticHardpointLabel;
    private JList RightLegCriticalList;
    private JPanel RightLegCriticalPanel;
    private JLabel RightLegECMHardpointLabel;
    private JLabel RightLegEnergyHardpointLabel;
    private JLabel RightLegMissileHardpointLabel;
    private JComboBox RightLegPodComboBox;
    private JSpinner RightLegSpinner;
    private JToggleButton RightLowerArmToggleButton;
    private JSpinner RightRearTorsoSpinner;
    private JLabel RightTorsoAMSHardpointLabel;
    private JLabel RightTorsoAmountLabel;
    private JLabel RightTorsoBallisticHardpointLabel;
    private JToggleButton RightTorsoCASEToggleButton;
    private JList RightTorsoCriticalList;
    private JPanel RightTorsoCriticalPanel;
    private JLabel RightTorsoECMHardpointLabel;
    private JLabel RightTorsoEnergyHardpointLabel;
    private JPanel RightTorsoFrontArmorPanel;
    private JProgressBar RightTorsoFrontArmorProgressBar;
    private JLabel RightTorsoMissileHardpointLabel;
    private JComboBox RightTorsoPodComboBox;
    private JPanel RightTorsoRearArmorPanel;
    private JProgressBar RightTorsoRearArmorProgressBar;
    private JSpinner RightTorsoSpinner;
    private JButton SaveButton;
    private JButton SelectiveAllocationButton;
    private JLabel SensorRangeLabel;
    private JToggleButton SensorRangeToggleButton;
    private JToggleButton SensorRangeToggleButton1;
    private JToggleButton SensorRangeToggleButton2;
    private JToggleButton SensorRangeToggleButton3;
    private JLabel ShutdownDetectionLabel;
    private JTabbedPane SideTabbedPane;
    private ComponentPanel SpeedLimitPanel;
    private JToggleButton SpeedTweakToggleButton;
    private JButton StatsButton;
    private JButton StripMechButton;
    private JButton StripSectionButton;
    private JComboBox StructureComboBox;
    private ComponentPanel StructurePanel;
    private JLabel TargetDecayLabel;
    private JLabel TechBaseLabel;
    private JTabbedPane ToolTipPanel;
    private JLabel TotalAmountLabel;
    private ComponentPanel TotalHardpointPanel;
    private JToggleButton TwistSpeedToggleButton;
    private JToggleButton TwistXToggleButton;
    private JLabel UnconfirmedLabel;
    private JLabel UnreleasedLabel;
    private JPanel UpgradePanel;
    private JPanel UpgradesPanel;
    private JScrollPane UpgradesScrollPane;
    private JTextField VariantTextField;
    private JPanel WeaponButtonPanel;
    private JPanel WeaponPanel;
    private JProgressBar alphaStrikeHeatProgressBar;
    private JProgressBar alphaStrikeProgressBar;
    private JLabel coolDownTimeBar;
    private JLabel costBar;
    private JProgressBar criticalsUsedProgressBar;
    private JProgressBar firepowerProgressBar;
    private JProgressBar heatEfficiencyProgressBar;
    private JPanel jPanel1;
    private JProgressBar rangeProgressBar;
    private JLabel shutDownTimeBar;
    private JProgressBar tonnageProgressBar;

    public MechlabForm() {
        Load_Blueprints();
        this.EngineRatingSpinnerModel = new SpinnerNumberModel(0, 0, 0, 5);
        this.HeatSinkSpinnerModel = new SpinnerNumberModel(10, 10, 10, 1);
        this.JumpJetSpinnerModel = new SpinnerNumberModel(0, 0, 0, 1);
        this.RightArmSpinnerModel = new SpinnerNumberModel(0, 0, 0, 1);
        this.LeftArmSpinnerModel = new SpinnerNumberModel(0, 0, 0, 1);
        this.RightTorsoSpinnerModel = new SpinnerNumberModel(0, 0, 0, 1);
        this.LeftTorsoSpinnerModel = new SpinnerNumberModel(0, 0, 0, 1);
        this.RightRearTorsoSpinnerModel = new SpinnerNumberModel(0, 0, 0, 1);
        this.LeftRearTorsoSpinnerModel = new SpinnerNumberModel(0, 0, 0, 1);
        this.CenterTorsoSpinnerModel = new SpinnerNumberModel(0, 0, 0, 1);
        this.CenterRearTorsoSpinnerModel = new SpinnerNumberModel(0, 0, 0, 1);
        this.HeadSpinnerModel = new SpinnerNumberModel(0, 0, 0, 1);
        this.RightLegSpinnerModel = new SpinnerNumberModel(0, 0, 0, 1);
        this.LeftLegSpinnerModel = new SpinnerNumberModel(0, 0, 0, 1);
        this.initComponents();
        this.RightArmCriticalList.setCellRenderer(new MechCriticalRenderer(0));
        this.LeftArmCriticalList.setCellRenderer(new MechCriticalRenderer(1));
        this.RightLegCriticalList.setCellRenderer(new MechCriticalRenderer(6));
        this.LeftLegCriticalList.setCellRenderer(new MechCriticalRenderer(7));
        this.RightTorsoCriticalList.setCellRenderer(new MechCriticalRenderer(2));
        this.LeftTorsoCriticalList.setCellRenderer(new MechCriticalRenderer(3));
        this.CenterTorsoCriticalList.setCellRenderer(new MechCriticalRenderer(4));
        this.HeadCriticalList.setCellRenderer(new MechCriticalRenderer(5));
        for (ChassisBlueprint chassis_Blueprint : MASTER_CHASSIS_BLUEPRINTS) {
            this.ChassisComboBox.addItem(chassis_Blueprint);
        }
        this.UpdateCriticalPanelVisibility();
    }

    private void initComponents() {
        this.shutDownTimeBar = new JLabel();
        this.coolDownTimeBar = new JLabel();
        this.MechTabPane = new JTabbedPane();
        this.ChassisPanel = new JPanel();
        this.SaveButton = new JButton();
        this.ChassisComboBox = new JComboBox();
        this.ModelComboBox = new JComboBox();
        this.LoadButton = new JButton();
        this.ImportButton = new JButton();
        this.VariantTextField = new JTextField();
        this.CapabilityPanel = new JPanel();
        this.UnconfirmedLabel = new JLabel();
        this.UnreleasedLabel = new JLabel();
        this.ECMLabel = new JLabel();
        this.JumpLabel = new JLabel();
        this.TechBaseLabel = new JLabel();
        this.MechTypeLabel = new JLabel();
        this.HeroLabel = new JLabel();
        this.ChampionLabel = new JLabel();
        this.ExportButton = new JButton();
        this.costBar = new JLabel();
        this.UpgradesScrollPane = new JScrollPane();
        this.UpgradesPanel = new JPanel();
        this.AdjustmentsPanel = new JPanel();
        this.HeatSinkSpinner = new JSpinner();
        this.EngineRatingSpinner = new JSpinner();
        this.JumpJetSpinner = new JSpinner();
        this.UpgradePanel = new JPanel();
        this.EngineComboBox = new JComboBox();
        this.ArmorComboBox = new JComboBox();
        this.HeatsinkComboBox = new JComboBox();
        this.JumpjetComboBox = new JComboBox();
        this.GyroComboBox = new JComboBox();
        this.StructureComboBox = new JComboBox();
        this.CockpitComboBox = new JComboBox();
        this.MyomerComboBox = new JComboBox();
        this.MRMFCSPanel = new JPanel();
        this.ApolloToggleButton = new JToggleButton();
        this.LRMSRMFCSPanel = new JPanel();
        this.ArtemisIVToggleButton = new JToggleButton();
        this.ArtemisVToggleButton = new JToggleButton();
        this.ModulePanel = new JPanel();
        this.SensorRangeToggleButton = new JToggleButton();
        this.SensorRangeToggleButton1 = new JToggleButton();
        this.SensorRangeToggleButton2 = new JToggleButton();
        this.SensorRangeToggleButton3 = new JToggleButton();
        this.EfficienciesPanel = new JPanel();
        this.EliteModToggleButton = new JToggleButton();
        this.MasterModToggleButton = new JToggleButton();
        this.CoolRunToggleButton = new JToggleButton();
        this.HeatContainmentToggleButton = new JToggleButton();
        this.TwistXToggleButton = new JToggleButton();
        this.TwistSpeedToggleButton = new JToggleButton();
        this.ArmReflexToggleButton = new JToggleButton();
        this.AnchorTurnToggleButton = new JToggleButton();
        this.KineticBurstToggleButton = new JToggleButton();
        this.HardBrakeToggleButton = new JToggleButton();
        this.SpeedTweakToggleButton = new JToggleButton();
        this.FastFireToggleButton = new JToggleButton();
        this.ModuleSlotToggleButton = new JToggleButton();
        this.WeaponPanel = new JPanel();
        this.WeaponButtonPanel = new JPanel();
        this.AddButton = new JButton();
        this.InfoButton = new JButton();
        this.EquipmentTabbedPane = new JTabbedPane();
        this.BallisticScrollPane = new JScrollPane();
        this.BallisticList = new JList();
        this.EnergyScrollPane = new JScrollPane();
        this.EnergyList = new JList();
        this.MissileScrollPane = new JScrollPane();
        this.MissileList = new JList();
        this.AmmoScrollPane = new JScrollPane();
        this.AmmoList = new JList();
        this.EquipmentScrollPane = new JScrollPane();
        this.EquipmentList = new JList();
        this.ArmorAdjustmentPanel = new JPanel();
        this.PointsPerTonAmount = new JLabel();
        this.MaxArmorButton = new JButton();
        this.HeadAmountLabel = new JLabel();
        this.RightTorsoAmountLabel = new JLabel();
        this.CenterTorsoAmountLabel = new JLabel();
        this.LeftTorsoAmountLabel = new JLabel();
        this.RightArmAmountLabel = new JLabel();
        this.LeftArmAmountLabel = new JLabel();
        this.RightLegAmountLabel = new JLabel();
        this.LeftLegAmountLabel = new JLabel();
        this.TotalAmountLabel = new JLabel();
        this.MaxArmorButton1 = new JButton();
        this.HeadSpinner = new JSpinner();
        this.RightTorsoSpinner = new JSpinner();
        this.RightRearTorsoSpinner = new JSpinner();
        this.CenterRearTorsoSpinner = new JSpinner();
        this.CenterTorsoSpinner = new JSpinner();
        this.LeftRearTorsoSpinner = new JSpinner();
        this.LeftTorsoSpinner = new JSpinner();
        this.RightArmSpinner = new JSpinner();
        this.LeftArmSpinner = new JSpinner();
        this.RightLegSpinner = new JSpinner();
        this.LeftLegSpinner = new JSpinner();
        this.MaxArmorButton2 = new JButton();
        this.ClearArmorButton = new JButton();
        this.MechDisplayPanel = new JPanel();
        this.OverviewPanel = new JPanel();
        this.RightArmCriticalPanel = new JPanel();
        this.RightArmPodComboBox = new JComboBox();
        this.RightArmBallisticHardpointLabel = new JLabel();
        this.RightArmEnergyHardpointLabel = new JLabel();
        this.RightArmMissileHardpointLabel = new JLabel();
        this.RightArmAMSHardpointLabel = new JLabel();
        this.RightArmECMHardpointLabel = new JLabel();
        this.RightHandToggleButton = new JToggleButton();
        this.RightLowerArmToggleButton = new JToggleButton();
        this.RightArmCriticalList = new JList();
        this.RightArmArmorProgressBar = new JProgressBar();
        this.RightArmStructureProgressBar = new JProgressBar();
        this.LeftArmCriticalPanel = new JPanel();
        this.LeftArmPodComboBox = new JComboBox();
        this.LeftArmBallisticHardpointLabel = new JLabel();
        this.LeftArmEnergyHardpointLabel = new JLabel();
        this.LeftArmMissileHardpointLabel = new JLabel();
        this.LeftArmAMSHardpointLabel = new JLabel();
        this.LeftArmECMHardpointLabel = new JLabel();
        this.LeftLowerArmToggleButton = new JToggleButton();
        this.LeftHandToggleButton = new JToggleButton();
        this.LeftArmCriticalList = new JList();
        this.LeftArmArmorProgressBar = new JProgressBar();
        this.LeftArmStructureProgressBar = new JProgressBar();
        this.RightLegCriticalPanel = new JPanel();
        this.RightLegPodComboBox = new JComboBox();
        this.RightLegBallisticHardpointLabel = new JLabel();
        this.RightLegEnergyHardpointLabel = new JLabel();
        this.RightLegMissileHardpointLabel = new JLabel();
        this.RightLegAMSHardpointLabel = new JLabel();
        this.RightLegECMHardpointLabel = new JLabel();
        this.RightLegCriticalList = new JList();
        this.RightLegArmorProgressBar = new JProgressBar();
        this.RightLegStructureProgressBar = new JProgressBar();
        this.LeftLegCriticalPanel = new JPanel();
        this.LeftLegPodComboBox = new JComboBox();
        this.LeftLegBallisticHardpointLabel = new JLabel();
        this.LeftLegEnergyHardpointLabel = new JLabel();
        this.LeftLegMissileHardpointLabel = new JLabel();
        this.LeftLegAMSHardpointLabel = new JLabel();
        this.LeftLegECMHardpointLabel = new JLabel();
        this.LeftLegCriticalList = new JList();
        this.LeftLegArmorProgressBar = new JProgressBar();
        this.LeftLegStructureProgressBar = new JProgressBar();
        this.HeadCriticalPanel = new JPanel();
        this.HeadPodComboBox = new JComboBox();
        this.HeadBallisticHardpointLabel = new JLabel();
        this.HeadEnergyHardpointLabel = new JLabel();
        this.HeadMissileHardpointLabel = new JLabel();
        this.HeadAMSHardpointLabel = new JLabel();
        this.HeadECMHardpointLabel = new JLabel();
        this.HeadCriticalList = new JList();
        this.HeadArmorProgressBar = new JProgressBar();
        this.HeadStructureProgressBar = new JProgressBar();
        this.RightTorsoCriticalPanel = new JPanel();
        this.RightTorsoPodComboBox = new JComboBox();
        this.RightTorsoBallisticHardpointLabel = new JLabel();
        this.RightTorsoEnergyHardpointLabel = new JLabel();
        this.RightTorsoMissileHardpointLabel = new JLabel();
        this.RightTorsoAMSHardpointLabel = new JLabel();
        this.RightTorsoECMHardpointLabel = new JLabel();
        this.RightTorsoCriticalList = new JList();
        this.RightTorsoCASEToggleButton = new JToggleButton();
        this.RightTorsoFrontArmorPanel = new JPanel();
        this.RightTorsoFrontArmorProgressBar = new JProgressBar();
        this.RightTorsoStructureProgressBar = new JProgressBar();
        this.RightTorsoRearArmorPanel = new JPanel();
        this.RightTorsoRearArmorProgressBar = new JProgressBar();
        this.LeftTorsoCriticalPanel = new JPanel();
        this.LeftTorsoPodComboBox = new JComboBox();
        this.LeftTorsoBallisticHardpointLabel = new JLabel();
        this.LeftTorsoEnergyHardpointLabel = new JLabel();
        this.LeftTorsoMissileHardpointLabel = new JLabel();
        this.LeftTorsoAMSHardpointLabel = new JLabel();
        this.LeftTorsoECMHardpointLabel = new JLabel();
        this.LeftTorsoCriticalList = new JList();
        this.LeftTorsoCASEToggleButton = new JToggleButton();
        this.LeftTorsoFrontArmorPanel = new JPanel();
        this.LeftTorsoFrontArmorProgressBar = new JProgressBar();
        this.LeftTorsoStructureProgressBar = new JProgressBar();
        this.LeftTorsoRearArmorPanel = new JPanel();
        this.LeftTorsoRearArmorProgressBar = new JProgressBar();
        this.CenterTorsoCriticalPanel = new JPanel();
        this.CenterTorsoPodComboBox = new JComboBox();
        this.CenterTorsoBallisticHardpointLabel = new JLabel();
        this.CenterTorsoEnergyHardpointLabel = new JLabel();
        this.CenterTorsoMissileHardpointLabel = new JLabel();
        this.CenterTorsoAMSHardpointLabel = new JLabel();
        this.CenterTorsoECMHardpointLabel = new JLabel();
        this.CenterTorsoCriticalList = new JList();
        this.CenterTorsoFrontArmorPanel = new JPanel();
        this.CenterTorsoFrontArmorProgressBar = new JProgressBar();
        this.CenterTorsoStructureProgressBar = new JProgressBar();
        this.CenterTorsoRearArmorPanel = new JPanel();
        this.CenterTorsoRearArmorProgressBar = new JProgressBar();
        this.InfoPanel = new JPanel();
        this.tonnageProgressBar = new JProgressBar();
        this.ModelSpeedProgressBar = new JProgressBar();
        this.JumpHeightBar = new JProgressBar();
        this.JumpDistanceBar = new JProgressBar();
        this.CurrentArmorProgressBar = new JProgressBar();
        this.alphaStrikeProgressBar = new JProgressBar();
        this.alphaStrikeHeatProgressBar = new JProgressBar();
        this.firepowerProgressBar = new JProgressBar();
        this.heatEfficiencyProgressBar = new JProgressBar();
        this.rangeProgressBar = new JProgressBar();
        this.criticalsUsedProgressBar = new JProgressBar();
        this.MechImage = new JLabel();
        this.BottomPanel = new JPanel();
        this.ToolTipPanel = new JTabbedPane();
        this.ChassisOverviewPanel = new JPanel();
        this.ChassisInfoPanel = new ComponentPanel();
        this.ModuleOverviewPanel = new ComponentPanel();
        this.TotalHardpointPanel = new ComponentPanel();
        this.MechDescriptionScrollPane = new JScrollPane();
        this.MechDescriptionTextPane = new JTextPane();
        this.ChassisSpecsPanel = new JPanel();
        this.SpeedLimitPanel = new ComponentPanel();
        this.ManueverabilityPanel = new ComponentPanel();
        this.MovementRangePanel = new ComponentPanel();
        this.MovementSpeedPanel = new ComponentPanel();
        this.RadarSpecsPanel = new JPanel();
        this.SensorRangeLabel = new JLabel();
        this.MaxZoomLabel = new JLabel();
        this.TargetDecayLabel = new JLabel();
        this.InfoGatherLabel = new JLabel();
        this.CaptureRateLabel = new JLabel();
        this.ShutdownDetectionLabel = new JLabel();
        this.OffensiveLockLabel = new JLabel();
        this.DefensiveLockLabel = new JLabel();
        this.EquipmentSpecsPanel = new JPanel();
        this.ButtonPanel = new JPanel();
        this.InfoButtonPanel = new JPanel();
        this.AboutButton = new JButton();
        this.MechTreesButton = new JButton();
        this.PilotTreesButton = new JButton();
        this.StatsButton = new JButton();
        this.FeatureButtonPanel = new JPanel();
        this.FrankenmechToggleButton = new JToggleButton();
        this.MixtechToggleButton = new JToggleButton();
        this.FutureTechToggleButton = new JToggleButton();
        this.OmniRestrictToggleButton = new JToggleButton();
        this.SideTabbedPane = new JTabbedPane();
        this.QuirksPanel = new JPanel();
        this.ComponentScrollPane = new JScrollPane();
        this.ComponentPanel = new JPanel();
        this.EnginePanel = new ComponentPanel();
        this.GyroPanel = new ComponentPanel();
        this.ArmorPanel = new ComponentPanel();
        this.StructurePanel = new ComponentPanel();
        this.HeatsinkPanel = new ComponentPanel();
        this.JumpjetPanel = new ComponentPanel();
        this.CockpitPanel = new ComponentPanel();
        this.MyomerPanel = new ComponentPanel();
        this.EquipmentQueuePanel = new JPanel();
        this.ClearQueueButton = new JButton();
        this.EquipButton = new JButton();
        this.SelectiveAllocationButton = new JButton();
        this.RemoveFromQueueButton = new JButton();
        this.EquipmentQueueList = new JList();
        this.StripMechButton = new JButton();
        this.StripSectionButton = new JButton();
        this.jPanel1 = new JPanel();
        this.shutDownTimeBar.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.shutDownTimeBar.setHorizontalAlignment(0);
        this.shutDownTimeBar.setAlignmentY(0.0f);
        this.shutDownTimeBar.setMaximumSize(new Dimension(150, 20));
        this.shutDownTimeBar.setMinimumSize(new Dimension(150, 20));
        this.shutDownTimeBar.setPreferredSize(new Dimension(150, 20));
        this.coolDownTimeBar.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.coolDownTimeBar.setHorizontalAlignment(0);
        this.coolDownTimeBar.setAlignmentY(0.0f);
        this.coolDownTimeBar.setMaximumSize(new Dimension(150, 20));
        this.coolDownTimeBar.setMinimumSize(new Dimension(150, 20));
        this.coolDownTimeBar.setPreferredSize(new Dimension(150, 20));
        this.setDefaultCloseOperation(3);
        this.setTitle("MWO Mechlab");
        this.setLocationByPlatform(true);
        this.setMinimumSize(new Dimension(1290, 750));
        this.setName("MainFrame");
        this.getContentPane().setLayout(new GridBagLayout());
        this.MechTabPane.setAlignmentX(0.0f);
        this.MechTabPane.setAlignmentY(0.0f);
        this.MechTabPane.setFont(User.preferences.DEFAULT_FONT_SIZE_12);
        this.MechTabPane.setMaximumSize(new Dimension(295, 540));
        this.MechTabPane.setMinimumSize(new Dimension(295, 540));
        this.MechTabPane.setOpaque(true);
        this.MechTabPane.setPreferredSize(new Dimension(295, 540));
        this.MechTabPane.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent changeEvent) {
                MechlabForm.this.MechTabPaneStateChanged(changeEvent);
            }
        });
        this.ChassisPanel.setFont(User.preferences.DEFAULT_FONT_SIZE_16);
        this.ChassisPanel.setLayout(new GridBagLayout());
        this.SaveButton.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.SaveButton.setToolTipText("");
        this.SaveButton.setAlignmentY(0.0f);
        this.SaveButton.setEnabled(false);
        this.SaveButton.setMargin(new Insets(0, 0, 0, 0));
        this.SaveButton.setMaximumSize(new Dimension(125, 25));
        this.SaveButton.setMinimumSize(new Dimension(125, 25));
        this.SaveButton.setPreferredSize(new Dimension(125, 25));
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.ChassisPanel.add(this.SaveButton, gridBagConstraints);
        this.ChassisComboBox.setFont(User.preferences.DEFAULT_FONT_SIZE_12);
        this.ChassisComboBox.setBorder(BorderFactory.createTitledBorder(null, "Chassis Type", 4, 2, User.preferences.DEFAULT_FONT_SIZE_12));
        this.ChassisComboBox.setMaximumSize(new Dimension(300, 50));
        this.ChassisComboBox.setMinimumSize(new Dimension(300, 50));
        this.ChassisComboBox.setPreferredSize(new Dimension(300, 50));
        this.ChassisComboBox.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MechlabForm.this.ChassisComboBoxActionPerformed(actionEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.ChassisPanel.add(this.ChassisComboBox, gridBagConstraints);
        this.ModelComboBox.setFont(User.preferences.DEFAULT_FONT_SIZE_12);
        this.ModelComboBox.setBorder(BorderFactory.createTitledBorder(null, "Chassis Model", 4, 2, User.preferences.DEFAULT_FONT_SIZE_12));
        this.ModelComboBox.setMaximumSize(new Dimension(300, 50));
        this.ModelComboBox.setMinimumSize(new Dimension(300, 50));
        this.ModelComboBox.setPreferredSize(new Dimension(300, 50));
        this.ModelComboBox.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MechlabForm.this.ModelComboBoxActionPerformed(actionEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.ChassisPanel.add(this.ModelComboBox, gridBagConstraints);
        this.LoadButton.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.LoadButton.setText("Load");
        this.LoadButton.setAlignmentY(0.0f);
        this.LoadButton.setEnabled(false);
        this.LoadButton.setMargin(new Insets(0, 0, 0, 0));
        this.LoadButton.setMaximumSize(new Dimension(125, 25));
        this.LoadButton.setMinimumSize(new Dimension(125, 25));
        this.LoadButton.setPreferredSize(new Dimension(125, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.ChassisPanel.add(this.LoadButton, gridBagConstraints);
        this.ImportButton.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.ImportButton.setText("Import");
        this.ImportButton.setAlignmentY(0.0f);
        this.ImportButton.setEnabled(false);
        this.ImportButton.setMargin(new Insets(0, 0, 0, 0));
        this.ImportButton.setMaximumSize(new Dimension(125, 25));
        this.ImportButton.setMinimumSize(new Dimension(125, 25));
        this.ImportButton.setPreferredSize(new Dimension(125, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.ChassisPanel.add(this.ImportButton, gridBagConstraints);
        this.VariantTextField.setBackground(new Color(240, 240, 240));
        this.VariantTextField.setFont(User.preferences.DEFAULT_FONT_SIZE_12);
        this.VariantTextField.setAlignmentX(0.0f);
        this.VariantTextField.setAlignmentY(0.0f);
        this.VariantTextField.setBorder(BorderFactory.createTitledBorder(new SoftBevelBorder(0), "Variant Name", 4, 2, User.preferences.DEFAULT_FONT_SIZE_12));
        this.VariantTextField.setEnabled(false);
        this.VariantTextField.setMaximumSize(new Dimension(300, 50));
        this.VariantTextField.setMinimumSize(new Dimension(300, 50));
        this.VariantTextField.setOpaque(false);
        this.VariantTextField.setPreferredSize(new Dimension(300, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.ChassisPanel.add(this.VariantTextField, gridBagConstraints);
        this.CapabilityPanel.setFont(User.preferences.DEFAULT_FONT_SIZE_16);
        this.CapabilityPanel.setMinimumSize(new Dimension(300, 135));
        this.CapabilityPanel.setPreferredSize(new Dimension(300, 135));
        this.CapabilityPanel.setLayout(new GridBagLayout());
        this.UnconfirmedLabel.setBackground(new Color(255, 64, 64));
        this.UnconfirmedLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.UnconfirmedLabel.setForeground(new Color(240, 240, 240));
        this.UnconfirmedLabel.setHorizontalAlignment(0);
        this.UnconfirmedLabel.setText("UNCONFIRMED");
        this.UnconfirmedLabel.setAlignmentY(0.0f);
        this.UnconfirmedLabel.setBorder(BorderFactory.createEtchedBorder());
        this.UnconfirmedLabel.setMaximumSize(new Dimension(125, 25));
        this.UnconfirmedLabel.setMinimumSize(new Dimension(125, 25));
        this.UnconfirmedLabel.setOpaque(true);
        this.UnconfirmedLabel.setPreferredSize(new Dimension(125, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.CapabilityPanel.add(this.UnconfirmedLabel, gridBagConstraints);
        this.UnreleasedLabel.setBackground(new Color(255, 64, 64));
        this.UnreleasedLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.UnreleasedLabel.setForeground(new Color(240, 240, 240));
        this.UnreleasedLabel.setHorizontalAlignment(0);
        this.UnreleasedLabel.setText("UNRELEASED");
        this.UnreleasedLabel.setAlignmentY(0.0f);
        this.UnreleasedLabel.setBorder(BorderFactory.createEtchedBorder());
        this.UnreleasedLabel.setMaximumSize(new Dimension(125, 25));
        this.UnreleasedLabel.setMinimumSize(new Dimension(125, 25));
        this.UnreleasedLabel.setOpaque(true);
        this.UnreleasedLabel.setPreferredSize(new Dimension(125, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.CapabilityPanel.add(this.UnreleasedLabel, gridBagConstraints);
        this.ECMLabel.setBackground(new Color(64, 255, 64));
        this.ECMLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.ECMLabel.setForeground(new Color(240, 240, 240));
        this.ECMLabel.setHorizontalAlignment(0);
        this.ECMLabel.setText("ECM CAPABLE");
        this.ECMLabel.setAlignmentY(0.0f);
        this.ECMLabel.setBorder(BorderFactory.createEtchedBorder());
        this.ECMLabel.setMaximumSize(new Dimension(125, 25));
        this.ECMLabel.setMinimumSize(new Dimension(125, 25));
        this.ECMLabel.setOpaque(true);
        this.ECMLabel.setPreferredSize(new Dimension(125, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.CapabilityPanel.add(this.ECMLabel, gridBagConstraints);
        this.JumpLabel.setBackground(new Color(64, 255, 64));
        this.JumpLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.JumpLabel.setForeground(new Color(240, 240, 240));
        this.JumpLabel.setHorizontalAlignment(0);
        this.JumpLabel.setText("JUMP CAPABLE");
        this.JumpLabel.setAlignmentY(0.0f);
        this.JumpLabel.setBorder(BorderFactory.createEtchedBorder());
        this.JumpLabel.setMaximumSize(new Dimension(125, 25));
        this.JumpLabel.setMinimumSize(new Dimension(125, 25));
        this.JumpLabel.setOpaque(true);
        this.JumpLabel.setPreferredSize(new Dimension(125, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.CapabilityPanel.add(this.JumpLabel, gridBagConstraints);
        this.TechBaseLabel.setBackground(new Color(128, 128, 128));
        this.TechBaseLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.TechBaseLabel.setForeground(new Color(240, 240, 240));
        this.TechBaseLabel.setHorizontalAlignment(0);
        this.TechBaseLabel.setText("IS TECH");
        this.TechBaseLabel.setAlignmentY(0.0f);
        this.TechBaseLabel.setBorder(BorderFactory.createEtchedBorder());
        this.TechBaseLabel.setMaximumSize(new Dimension(125, 25));
        this.TechBaseLabel.setMinimumSize(new Dimension(125, 25));
        this.TechBaseLabel.setOpaque(true);
        this.TechBaseLabel.setPreferredSize(new Dimension(125, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.CapabilityPanel.add(this.TechBaseLabel, gridBagConstraints);
        this.MechTypeLabel.setBackground(new Color(128, 128, 128));
        this.MechTypeLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.MechTypeLabel.setForeground(new Color(240, 240, 240));
        this.MechTypeLabel.setHorizontalAlignment(0);
        this.MechTypeLabel.setText("OMNIMECH");
        this.MechTypeLabel.setAlignmentY(0.0f);
        this.MechTypeLabel.setBorder(BorderFactory.createEtchedBorder());
        this.MechTypeLabel.setMaximumSize(new Dimension(125, 25));
        this.MechTypeLabel.setMinimumSize(new Dimension(125, 25));
        this.MechTypeLabel.setOpaque(true);
        this.MechTypeLabel.setPreferredSize(new Dimension(125, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.CapabilityPanel.add(this.MechTypeLabel, gridBagConstraints);
        this.HeroLabel.setBackground(new Color(128, 128, 128));
        this.HeroLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.HeroLabel.setForeground(new Color(240, 240, 240));
        this.HeroLabel.setHorizontalAlignment(0);
        this.HeroLabel.setText("HERO MECH");
        this.HeroLabel.setAlignmentY(0.0f);
        this.HeroLabel.setBorder(BorderFactory.createEtchedBorder());
        this.HeroLabel.setMaximumSize(new Dimension(125, 25));
        this.HeroLabel.setMinimumSize(new Dimension(125, 25));
        this.HeroLabel.setOpaque(true);
        this.HeroLabel.setPreferredSize(new Dimension(125, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.CapabilityPanel.add(this.HeroLabel, gridBagConstraints);
        this.ChampionLabel.setBackground(new Color(128, 128, 128));
        this.ChampionLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.ChampionLabel.setForeground(new Color(240, 240, 240));
        this.ChampionLabel.setHorizontalAlignment(0);
        this.ChampionLabel.setText("CHAMPION MECH");
        this.ChampionLabel.setAlignmentY(0.0f);
        this.ChampionLabel.setBorder(BorderFactory.createEtchedBorder());
        this.ChampionLabel.setMaximumSize(new Dimension(125, 25));
        this.ChampionLabel.setMinimumSize(new Dimension(125, 25));
        this.ChampionLabel.setOpaque(true);
        this.ChampionLabel.setPreferredSize(new Dimension(125, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.CapabilityPanel.add(this.ChampionLabel, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.ChassisPanel.add(this.CapabilityPanel, gridBagConstraints);
        this.ExportButton.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.ExportButton.setText("Export");
        this.ExportButton.setEnabled(false);
        this.ExportButton.setMargin(new Insets(0, 0, 0, 0));
        this.ExportButton.setMaximumSize(new Dimension(125, 25));
        this.ExportButton.setMinimumSize(new Dimension(125, 25));
        this.ExportButton.setPreferredSize(new Dimension(125, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.ChassisPanel.add(this.ExportButton, gridBagConstraints);
        this.costBar.setFont(User.preferences.DEFAULT_FONT_SIZE_12);
        this.costBar.setHorizontalAlignment(0);
        this.costBar.setAlignmentY(0.0f);
        this.costBar.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Total Cost", 4, 2, User.preferences.DEFAULT_FONT_SIZE_12, new Color(0, 0, 0)));
        this.costBar.setEnabled(false);
        this.costBar.setMaximumSize(new Dimension(300, 50));
        this.costBar.setMinimumSize(new Dimension(300, 50));
        this.costBar.setPreferredSize(new Dimension(300, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        this.ChassisPanel.add(this.costBar, gridBagConstraints);
        this.MechTabPane.addTab("Chassis", this.ChassisPanel);
        this.UpgradesScrollPane.setHorizontalScrollBarPolicy(31);
        this.UpgradesScrollPane.setMaximumSize(new Dimension(295, 540));
        this.UpgradesScrollPane.setMinimumSize(new Dimension(295, 540));
        this.UpgradesScrollPane.setPreferredSize(new Dimension(295, 540));
        this.UpgradesPanel.setAlignmentX(0.0f);
        this.UpgradesPanel.setAlignmentY(0.0f);
        this.UpgradesPanel.setFont(User.preferences.DEFAULT_FONT_SIZE_16);
        this.UpgradesPanel.setMaximumSize(new Dimension(265, 800));
        this.UpgradesPanel.setMinimumSize(new Dimension(265, 800));
        this.UpgradesPanel.setPreferredSize(new Dimension(265, 800));
        this.UpgradesPanel.setLayout(new GridBagLayout());
        this.AdjustmentsPanel.setBorder(BorderFactory.createTitledBorder(null, "Adjustments", 4, 2, User.preferences.DEFAULT_FONT_SIZE_12));
        this.AdjustmentsPanel.setMaximumSize(new Dimension(275, 120));
        this.AdjustmentsPanel.setMinimumSize(new Dimension(275, 120));
        this.AdjustmentsPanel.setPreferredSize(new Dimension(275, 120));
        this.AdjustmentsPanel.setLayout(new GridBagLayout());
        this.HeatSinkSpinner.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.HeatSinkSpinner.setModel(this.HeatSinkSpinnerModel);
        this.HeatSinkSpinner.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Heat Sinks", 4, 2, User.preferences.DEFAULT_FONT_SIZE_10));
        this.HeatSinkSpinner.setEditor(new JSpinner.NumberEditor(this.HeatSinkSpinner, ""));
        this.HeatSinkSpinner.setMinimumSize(new Dimension(100, 40));
        this.HeatSinkSpinner.setPreferredSize(new Dimension(100, 40));
        this.HeatSinkSpinner.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent changeEvent) {
                MechlabForm.this.HeatSinkSpinnerStateChanged(changeEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.AdjustmentsPanel.add(this.HeatSinkSpinner, gridBagConstraints);
        this.EngineRatingSpinner.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.EngineRatingSpinner.setModel(this.EngineRatingSpinnerModel);
        this.EngineRatingSpinner.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Engine Rating", 4, 2, User.preferences.DEFAULT_FONT_SIZE_10));
        this.EngineRatingSpinner.setEditor(new JSpinner.NumberEditor(this.EngineRatingSpinner, ""));
        this.EngineRatingSpinner.setMinimumSize(new Dimension(100, 40));
        this.EngineRatingSpinner.setPreferredSize(new Dimension(100, 40));
        this.EngineRatingSpinner.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent changeEvent) {
                MechlabForm.this.EngineRatingSpinnerStateChanged(changeEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.AdjustmentsPanel.add(this.EngineRatingSpinner, gridBagConstraints);
        this.JumpJetSpinner.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.JumpJetSpinner.setModel(this.JumpJetSpinnerModel);
        this.JumpJetSpinner.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Jump Jets", 4, 2, User.preferences.DEFAULT_FONT_SIZE_10));
        this.JumpJetSpinner.setEditor(new JSpinner.NumberEditor(this.JumpJetSpinner, ""));
        this.JumpJetSpinner.setMinimumSize(new Dimension(100, 40));
        this.JumpJetSpinner.setPreferredSize(new Dimension(100, 40));
        this.JumpJetSpinner.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent changeEvent) {
                MechlabForm.this.JumpJetSpinnerStateChanged(changeEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.AdjustmentsPanel.add(this.JumpJetSpinner, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.UpgradesPanel.add(this.AdjustmentsPanel, gridBagConstraints);
        this.UpgradePanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Upgrades", 4, 2, User.preferences.DEFAULT_FONT_SIZE_12, Color.black));
        this.UpgradePanel.setAlignmentX(0.0f);
        this.UpgradePanel.setAlignmentY(0.0f);
        this.UpgradePanel.setFont(User.preferences.DEFAULT_FONT_SIZE_16);
        this.UpgradePanel.setMaximumSize(new Dimension(275, 300));
        this.UpgradePanel.setMinimumSize(new Dimension(275, 300));
        this.UpgradePanel.setName("");
        this.UpgradePanel.setPreferredSize(new Dimension(275, 300));
        this.UpgradePanel.setLayout(new GridBagLayout());
        this.EngineComboBox.setFont(User.preferences.DEFAULT_FONT_SIZE_12);
        this.EngineComboBox.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Engine", 2, 2, User.preferences.DEFAULT_FONT_SIZE_10));
        this.EngineComboBox.setMaximumSize(new Dimension(150, 45));
        this.EngineComboBox.setMinimumSize(new Dimension(150, 45));
        this.EngineComboBox.setPreferredSize(new Dimension(150, 45));
        this.EngineComboBox.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MechlabForm.this.EngineComboBoxActionPerformed(actionEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.UpgradePanel.add(this.EngineComboBox, gridBagConstraints);
        this.ArmorComboBox.setFont(User.preferences.DEFAULT_FONT_SIZE_12);
        this.ArmorComboBox.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Armor", 2, 2, User.preferences.DEFAULT_FONT_SIZE_10));
        this.ArmorComboBox.setMaximumSize(new Dimension(150, 45));
        this.ArmorComboBox.setMinimumSize(new Dimension(150, 45));
        this.ArmorComboBox.setPreferredSize(new Dimension(150, 45));
        this.ArmorComboBox.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MechlabForm.this.ArmorComboBoxActionPerformed(actionEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.UpgradePanel.add(this.ArmorComboBox, gridBagConstraints);
        this.HeatsinkComboBox.setFont(User.preferences.DEFAULT_FONT_SIZE_12);
        this.HeatsinkComboBox.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Heat Sinks", 2, 2, User.preferences.DEFAULT_FONT_SIZE_10));
        this.HeatsinkComboBox.setMaximumSize(new Dimension(150, 45));
        this.HeatsinkComboBox.setMinimumSize(new Dimension(150, 45));
        this.HeatsinkComboBox.setPreferredSize(new Dimension(150, 45));
        this.HeatsinkComboBox.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MechlabForm.this.HeatsinkComboBoxActionPerformed(actionEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.UpgradePanel.add(this.HeatsinkComboBox, gridBagConstraints);
        this.JumpjetComboBox.setFont(User.preferences.DEFAULT_FONT_SIZE_12);
        this.JumpjetComboBox.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Jump Jets", 2, 2, User.preferences.DEFAULT_FONT_SIZE_10));
        this.JumpjetComboBox.setMaximumSize(new Dimension(150, 45));
        this.JumpjetComboBox.setMinimumSize(new Dimension(150, 45));
        this.JumpjetComboBox.setPreferredSize(new Dimension(150, 45));
        this.JumpjetComboBox.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MechlabForm.this.JumpjetComboBoxActionPerformed(actionEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.UpgradePanel.add(this.JumpjetComboBox, gridBagConstraints);
        this.GyroComboBox.setFont(User.preferences.DEFAULT_FONT_SIZE_12);
        this.GyroComboBox.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Gyro", 2, 2, User.preferences.DEFAULT_FONT_SIZE_10));
        this.GyroComboBox.setMaximumSize(new Dimension(150, 45));
        this.GyroComboBox.setMinimumSize(new Dimension(150, 45));
        this.GyroComboBox.setPreferredSize(new Dimension(150, 45));
        this.GyroComboBox.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MechlabForm.this.GyroComboBoxActionPerformed(actionEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.UpgradePanel.add(this.GyroComboBox, gridBagConstraints);
        this.StructureComboBox.setFont(User.preferences.DEFAULT_FONT_SIZE_12);
        this.StructureComboBox.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Structure", 2, 2, User.preferences.DEFAULT_FONT_SIZE_10));
        this.StructureComboBox.setMaximumSize(new Dimension(150, 45));
        this.StructureComboBox.setMinimumSize(new Dimension(150, 45));
        this.StructureComboBox.setPreferredSize(new Dimension(150, 45));
        this.StructureComboBox.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MechlabForm.this.StructureComboBoxActionPerformed(actionEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.UpgradePanel.add(this.StructureComboBox, gridBagConstraints);
        this.CockpitComboBox.setFont(User.preferences.DEFAULT_FONT_SIZE_12);
        this.CockpitComboBox.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Cockpit", 2, 2, User.preferences.DEFAULT_FONT_SIZE_10));
        this.CockpitComboBox.setMaximumSize(new Dimension(150, 45));
        this.CockpitComboBox.setMinimumSize(new Dimension(150, 45));
        this.CockpitComboBox.setPreferredSize(new Dimension(150, 45));
        this.CockpitComboBox.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MechlabForm.this.CockpitComboBoxActionPerformed(actionEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.UpgradePanel.add(this.CockpitComboBox, gridBagConstraints);
        this.MyomerComboBox.setFont(User.preferences.DEFAULT_FONT_SIZE_12);
        this.MyomerComboBox.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Myomer", 2, 2, User.preferences.DEFAULT_FONT_SIZE_10));
        this.MyomerComboBox.setMaximumSize(new Dimension(150, 45));
        this.MyomerComboBox.setMinimumSize(new Dimension(150, 45));
        this.MyomerComboBox.setPreferredSize(new Dimension(150, 45));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.UpgradePanel.add(this.MyomerComboBox, gridBagConstraints);
        this.MRMFCSPanel.setBorder(BorderFactory.createTitledBorder(null, "MRM Fire Control", 2, 2, User.preferences.DEFAULT_FONT_SIZE_10));
        this.MRMFCSPanel.setFont(User.preferences.DEFAULT_FONT_SIZE_16);
        this.MRMFCSPanel.setMinimumSize(new Dimension(150, 90));
        this.MRMFCSPanel.setPreferredSize(new Dimension(150, 90));
        this.MRMFCSPanel.setLayout(new GridBagLayout());
        this.ApolloToggleButton.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.ApolloToggleButton.setText("Apollo");
        this.ApolloToggleButton.setEnabled(false);
        this.ApolloToggleButton.setMargin(new Insets(0, 0, 0, 0));
        this.ApolloToggleButton.setMaximumSize(new Dimension(125, 25));
        this.ApolloToggleButton.setMinimumSize(new Dimension(125, 25));
        this.ApolloToggleButton.setPreferredSize(new Dimension(125, 25));
        this.ApolloToggleButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MechlabForm.this.ApolloToggleButtonActionPerformed(actionEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(2, 2, 2, 2);
        this.MRMFCSPanel.add(this.ApolloToggleButton, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.UpgradePanel.add(this.MRMFCSPanel, gridBagConstraints);
        this.LRMSRMFCSPanel.setBorder(BorderFactory.createTitledBorder(null, "LRM/SRM Fire Control", 2, 2, User.preferences.DEFAULT_FONT_SIZE_10));
        this.LRMSRMFCSPanel.setFont(User.preferences.DEFAULT_FONT_SIZE_16);
        this.LRMSRMFCSPanel.setMinimumSize(new Dimension(150, 90));
        this.LRMSRMFCSPanel.setPreferredSize(new Dimension(150, 90));
        this.LRMSRMFCSPanel.setLayout(new GridBagLayout());
        this.ArtemisIVToggleButton.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.ArtemisIVToggleButton.setText("Artemis IV");
        this.ArtemisIVToggleButton.setEnabled(false);
        this.ArtemisIVToggleButton.setMargin(new Insets(0, 0, 0, 0));
        this.ArtemisIVToggleButton.setMaximumSize(new Dimension(125, 25));
        this.ArtemisIVToggleButton.setMinimumSize(new Dimension(125, 25));
        this.ArtemisIVToggleButton.setPreferredSize(new Dimension(125, 25));
        this.ArtemisIVToggleButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MechlabForm.this.ArtemisIVToggleButtonActionPerformed(actionEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(2, 2, 2, 2);
        this.LRMSRMFCSPanel.add(this.ArtemisIVToggleButton, gridBagConstraints);
        this.ArtemisVToggleButton.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.ArtemisVToggleButton.setText("Artemis V");
        this.ArtemisVToggleButton.setEnabled(false);
        this.ArtemisVToggleButton.setMargin(new Insets(0, 0, 0, 0));
        this.ArtemisVToggleButton.setMaximumSize(new Dimension(125, 25));
        this.ArtemisVToggleButton.setMinimumSize(new Dimension(125, 25));
        this.ArtemisVToggleButton.setPreferredSize(new Dimension(125, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(2, 2, 2, 2);
        this.LRMSRMFCSPanel.add(this.ArtemisVToggleButton, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.UpgradePanel.add(this.LRMSRMFCSPanel, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.UpgradesPanel.add(this.UpgradePanel, gridBagConstraints);
        this.ModulePanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Modules", 4, 2, User.preferences.DEFAULT_FONT_SIZE_12, Color.black));
        this.ModulePanel.setAlignmentX(0.0f);
        this.ModulePanel.setAlignmentY(0.0f);
        this.ModulePanel.setFont(User.preferences.DEFAULT_FONT_SIZE_16);
        this.ModulePanel.setMaximumSize(new Dimension(275, 80));
        this.ModulePanel.setMinimumSize(new Dimension(275, 80));
        this.ModulePanel.setPreferredSize(new Dimension(275, 80));
        this.ModulePanel.setLayout(new GridBagLayout());
        this.SensorRangeToggleButton.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.SensorRangeToggleButton.setText("Advanced Sensor Range");
        this.SensorRangeToggleButton.setAlignmentY(0.0f);
        this.SensorRangeToggleButton.setEnabled(false);
        this.SensorRangeToggleButton.setMargin(new Insets(0, 0, 0, 0));
        this.SensorRangeToggleButton.setMaximumSize(new Dimension(150, 25));
        this.SensorRangeToggleButton.setMinimumSize(new Dimension(150, 25));
        this.SensorRangeToggleButton.setPreferredSize(new Dimension(150, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(2, 2, 2, 2);
        this.ModulePanel.add(this.SensorRangeToggleButton, gridBagConstraints);
        this.SensorRangeToggleButton1.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.SensorRangeToggleButton1.setText("Target Info Gather");
        this.SensorRangeToggleButton1.setAlignmentY(0.0f);
        this.SensorRangeToggleButton1.setEnabled(false);
        this.SensorRangeToggleButton1.setMargin(new Insets(0, 0, 0, 0));
        this.SensorRangeToggleButton1.setMaximumSize(new Dimension(150, 25));
        this.SensorRangeToggleButton1.setMinimumSize(new Dimension(150, 25));
        this.SensorRangeToggleButton1.setPreferredSize(new Dimension(150, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(2, 2, 2, 2);
        this.ModulePanel.add(this.SensorRangeToggleButton1, gridBagConstraints);
        this.SensorRangeToggleButton2.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.SensorRangeToggleButton2.setText("Target Decay");
        this.SensorRangeToggleButton2.setAlignmentY(0.0f);
        this.SensorRangeToggleButton2.setEnabled(false);
        this.SensorRangeToggleButton2.setMargin(new Insets(0, 0, 0, 0));
        this.SensorRangeToggleButton2.setMaximumSize(new Dimension(150, 25));
        this.SensorRangeToggleButton2.setMinimumSize(new Dimension(150, 25));
        this.SensorRangeToggleButton2.setPreferredSize(new Dimension(150, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(2, 2, 2, 2);
        this.ModulePanel.add(this.SensorRangeToggleButton2, gridBagConstraints);
        this.SensorRangeToggleButton3.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.SensorRangeToggleButton3.setText("Radar Deprivation");
        this.SensorRangeToggleButton3.setAlignmentY(0.0f);
        this.SensorRangeToggleButton3.setEnabled(false);
        this.SensorRangeToggleButton3.setMargin(new Insets(0, 0, 0, 0));
        this.SensorRangeToggleButton3.setMaximumSize(new Dimension(150, 25));
        this.SensorRangeToggleButton3.setMinimumSize(new Dimension(150, 25));
        this.SensorRangeToggleButton3.setPreferredSize(new Dimension(150, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(2, 2, 2, 2);
        this.ModulePanel.add(this.SensorRangeToggleButton3, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.UpgradesPanel.add(this.ModulePanel, gridBagConstraints);
        this.EfficienciesPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Efficiencies", 4, 2, User.preferences.DEFAULT_FONT_SIZE_12, Color.black));
        this.EfficienciesPanel.setAlignmentX(0.0f);
        this.EfficienciesPanel.setAlignmentY(0.0f);
        this.EfficienciesPanel.setFont(User.preferences.DEFAULT_FONT_SIZE_16);
        this.EfficienciesPanel.setMaximumSize(new Dimension(275, 200));
        this.EfficienciesPanel.setMinimumSize(new Dimension(275, 200));
        this.EfficienciesPanel.setPreferredSize(new Dimension(275, 200));
        this.EfficienciesPanel.setLayout(new GridBagLayout());
        this.EliteModToggleButton.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.EliteModToggleButton.setText("Elite Modifier");
        this.EliteModToggleButton.setAlignmentY(0.0f);
        this.EliteModToggleButton.setMargin(new Insets(0, 0, 0, 0));
        this.EliteModToggleButton.setMaximumSize(new Dimension(150, 25));
        this.EliteModToggleButton.setMinimumSize(new Dimension(150, 25));
        this.EliteModToggleButton.setPreferredSize(new Dimension(150, 25));
        this.EliteModToggleButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MechlabForm.this.EliteModToggleButtonActionPerformed(actionEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(2, 2, 2, 2);
        this.EfficienciesPanel.add(this.EliteModToggleButton, gridBagConstraints);
        this.MasterModToggleButton.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.MasterModToggleButton.setText("Master Modifier");
        this.MasterModToggleButton.setAlignmentY(0.0f);
        this.MasterModToggleButton.setEnabled(false);
        this.MasterModToggleButton.setMargin(new Insets(0, 0, 0, 0));
        this.MasterModToggleButton.setMaximumSize(new Dimension(150, 25));
        this.MasterModToggleButton.setMinimumSize(new Dimension(150, 25));
        this.MasterModToggleButton.setPreferredSize(new Dimension(150, 25));
        this.MasterModToggleButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MechlabForm.this.MasterModToggleButtonActionPerformed(actionEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(2, 2, 2, 2);
        this.EfficienciesPanel.add(this.MasterModToggleButton, gridBagConstraints);
        this.CoolRunToggleButton.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.CoolRunToggleButton.setText("Cool Run");
        this.CoolRunToggleButton.setAlignmentY(0.0f);
        this.CoolRunToggleButton.setMargin(new Insets(0, 0, 0, 0));
        this.CoolRunToggleButton.setMaximumSize(new Dimension(150, 25));
        this.CoolRunToggleButton.setMinimumSize(new Dimension(150, 25));
        this.CoolRunToggleButton.setPreferredSize(new Dimension(150, 25));
        this.CoolRunToggleButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MechlabForm.this.CoolRunToggleButtonActionPerformed(actionEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(2, 2, 2, 2);
        this.EfficienciesPanel.add(this.CoolRunToggleButton, gridBagConstraints);
        this.HeatContainmentToggleButton.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.HeatContainmentToggleButton.setText("Heat Containment");
        this.HeatContainmentToggleButton.setAlignmentY(0.0f);
        this.HeatContainmentToggleButton.setMargin(new Insets(0, 0, 0, 0));
        this.HeatContainmentToggleButton.setMaximumSize(new Dimension(150, 25));
        this.HeatContainmentToggleButton.setMinimumSize(new Dimension(150, 25));
        this.HeatContainmentToggleButton.setPreferredSize(new Dimension(150, 25));
        this.HeatContainmentToggleButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MechlabForm.this.HeatContainmentToggleButtonActionPerformed(actionEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(2, 2, 2, 2);
        this.EfficienciesPanel.add(this.HeatContainmentToggleButton, gridBagConstraints);
        this.TwistXToggleButton.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.TwistXToggleButton.setText("Twist X");
        this.TwistXToggleButton.setAlignmentY(0.0f);
        this.TwistXToggleButton.setMargin(new Insets(0, 0, 0, 0));
        this.TwistXToggleButton.setMaximumSize(new Dimension(150, 25));
        this.TwistXToggleButton.setMinimumSize(new Dimension(150, 25));
        this.TwistXToggleButton.setPreferredSize(new Dimension(150, 25));
        this.TwistXToggleButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MechlabForm.this.TwistXToggleButtonActionPerformed(actionEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(2, 2, 2, 2);
        this.EfficienciesPanel.add(this.TwistXToggleButton, gridBagConstraints);
        this.TwistSpeedToggleButton.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.TwistSpeedToggleButton.setText("Twist Speed");
        this.TwistSpeedToggleButton.setAlignmentY(0.0f);
        this.TwistSpeedToggleButton.setMargin(new Insets(0, 0, 0, 0));
        this.TwistSpeedToggleButton.setMaximumSize(new Dimension(150, 25));
        this.TwistSpeedToggleButton.setMinimumSize(new Dimension(150, 25));
        this.TwistSpeedToggleButton.setPreferredSize(new Dimension(150, 25));
        this.TwistSpeedToggleButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MechlabForm.this.TwistSpeedToggleButtonActionPerformed(actionEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(2, 2, 2, 2);
        this.EfficienciesPanel.add(this.TwistSpeedToggleButton, gridBagConstraints);
        this.ArmReflexToggleButton.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.ArmReflexToggleButton.setText("Arm Reflex");
        this.ArmReflexToggleButton.setAlignmentY(0.0f);
        this.ArmReflexToggleButton.setMargin(new Insets(0, 0, 0, 0));
        this.ArmReflexToggleButton.setMaximumSize(new Dimension(150, 25));
        this.ArmReflexToggleButton.setMinimumSize(new Dimension(150, 25));
        this.ArmReflexToggleButton.setPreferredSize(new Dimension(150, 25));
        this.ArmReflexToggleButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MechlabForm.this.ArmReflexToggleButtonActionPerformed(actionEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(2, 2, 2, 2);
        this.EfficienciesPanel.add(this.ArmReflexToggleButton, gridBagConstraints);
        this.AnchorTurnToggleButton.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.AnchorTurnToggleButton.setText("Anchor Turn");
        this.AnchorTurnToggleButton.setAlignmentY(0.0f);
        this.AnchorTurnToggleButton.setMargin(new Insets(0, 0, 0, 0));
        this.AnchorTurnToggleButton.setMaximumSize(new Dimension(150, 25));
        this.AnchorTurnToggleButton.setMinimumSize(new Dimension(150, 25));
        this.AnchorTurnToggleButton.setPreferredSize(new Dimension(150, 25));
        this.AnchorTurnToggleButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MechlabForm.this.AnchorTurnToggleButtonActionPerformed(actionEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(2, 2, 2, 2);
        this.EfficienciesPanel.add(this.AnchorTurnToggleButton, gridBagConstraints);
        this.KineticBurstToggleButton.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.KineticBurstToggleButton.setText("Kinetic Burst");
        this.KineticBurstToggleButton.setAlignmentY(0.0f);
        this.KineticBurstToggleButton.setMargin(new Insets(0, 0, 0, 0));
        this.KineticBurstToggleButton.setMaximumSize(new Dimension(150, 25));
        this.KineticBurstToggleButton.setMinimumSize(new Dimension(150, 25));
        this.KineticBurstToggleButton.setPreferredSize(new Dimension(150, 25));
        this.KineticBurstToggleButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MechlabForm.this.KineticBurstToggleButtonActionPerformed(actionEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(2, 2, 2, 2);
        this.EfficienciesPanel.add(this.KineticBurstToggleButton, gridBagConstraints);
        this.HardBrakeToggleButton.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.HardBrakeToggleButton.setText("Hard Brake");
        this.HardBrakeToggleButton.setAlignmentY(0.0f);
        this.HardBrakeToggleButton.setMargin(new Insets(0, 0, 0, 0));
        this.HardBrakeToggleButton.setMaximumSize(new Dimension(150, 25));
        this.HardBrakeToggleButton.setMinimumSize(new Dimension(150, 25));
        this.HardBrakeToggleButton.setPreferredSize(new Dimension(150, 25));
        this.HardBrakeToggleButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MechlabForm.this.HardBrakeToggleButtonActionPerformed(actionEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(2, 2, 2, 2);
        this.EfficienciesPanel.add(this.HardBrakeToggleButton, gridBagConstraints);
        this.SpeedTweakToggleButton.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.SpeedTweakToggleButton.setText("Speed Tweak");
        this.SpeedTweakToggleButton.setAlignmentY(0.0f);
        this.SpeedTweakToggleButton.setMargin(new Insets(0, 0, 0, 0));
        this.SpeedTweakToggleButton.setMaximumSize(new Dimension(150, 25));
        this.SpeedTweakToggleButton.setMinimumSize(new Dimension(150, 25));
        this.SpeedTweakToggleButton.setPreferredSize(new Dimension(150, 25));
        this.SpeedTweakToggleButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MechlabForm.this.SpeedTweakToggleButtonActionPerformed(actionEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(2, 2, 2, 2);
        this.EfficienciesPanel.add(this.SpeedTweakToggleButton, gridBagConstraints);
        this.FastFireToggleButton.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.FastFireToggleButton.setText("Fast Fire");
        this.FastFireToggleButton.setAlignmentY(0.0f);
        this.FastFireToggleButton.setMargin(new Insets(0, 0, 0, 0));
        this.FastFireToggleButton.setMaximumSize(new Dimension(150, 25));
        this.FastFireToggleButton.setMinimumSize(new Dimension(150, 25));
        this.FastFireToggleButton.setPreferredSize(new Dimension(150, 25));
        this.FastFireToggleButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MechlabForm.this.FastFireToggleButtonActionPerformed(actionEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(2, 2, 2, 2);
        this.EfficienciesPanel.add(this.FastFireToggleButton, gridBagConstraints);
        this.ModuleSlotToggleButton.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.ModuleSlotToggleButton.setText("Module Slot");
        this.ModuleSlotToggleButton.setAlignmentY(0.0f);
        this.ModuleSlotToggleButton.setMargin(new Insets(0, 0, 0, 0));
        this.ModuleSlotToggleButton.setMaximumSize(new Dimension(150, 25));
        this.ModuleSlotToggleButton.setMinimumSize(new Dimension(150, 25));
        this.ModuleSlotToggleButton.setPreferredSize(new Dimension(150, 25));
        this.ModuleSlotToggleButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MechlabForm.this.ModuleSlotToggleButtonActionPerformed(actionEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(2, 2, 2, 2);
        this.EfficienciesPanel.add(this.ModuleSlotToggleButton, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.UpgradesPanel.add(this.EfficienciesPanel, gridBagConstraints);
        this.UpgradesScrollPane.setViewportView(this.UpgradesPanel);
        this.MechTabPane.addTab("Upgrades", this.UpgradesScrollPane);
        this.WeaponPanel.setEnabled(false);
        this.WeaponPanel.setFont(User.preferences.DEFAULT_FONT_SIZE_16);
        this.WeaponPanel.setLayout(new GridBagLayout());
        this.WeaponButtonPanel.setFont(User.preferences.DEFAULT_FONT_SIZE_16);
        this.WeaponButtonPanel.setMaximumSize(new Dimension(300, 100));
        this.WeaponButtonPanel.setMinimumSize(new Dimension(300, 100));
        this.WeaponButtonPanel.setPreferredSize(new Dimension(300, 100));
        this.WeaponButtonPanel.setLayout(new GridBagLayout());
        this.AddButton.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.AddButton.setText("Add");
        this.AddButton.setMargin(new Insets(0, 0, 0, 0));
        this.AddButton.setMaximumSize(new Dimension(120, 30));
        this.AddButton.setMinimumSize(new Dimension(120, 30));
        this.AddButton.setPreferredSize(new Dimension(120, 30));
        this.AddButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MechlabForm.this.AddButtonActionPerformed(actionEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.WeaponButtonPanel.add(this.AddButton, gridBagConstraints);
        this.InfoButton.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.InfoButton.setText("Info");
        this.InfoButton.setEnabled(false);
        this.InfoButton.setMargin(new Insets(0, 0, 0, 0));
        this.InfoButton.setMaximumSize(new Dimension(120, 30));
        this.InfoButton.setMinimumSize(new Dimension(120, 30));
        this.InfoButton.setPreferredSize(new Dimension(120, 30));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.WeaponButtonPanel.add(this.InfoButton, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.WeaponPanel.add(this.WeaponButtonPanel, gridBagConstraints);
        this.EquipmentTabbedPane.setFont(User.preferences.DEFAULT_FONT_SIZE_12);
        this.EquipmentTabbedPane.setMinimumSize(new Dimension(320, 360));
        this.EquipmentTabbedPane.setPreferredSize(new Dimension(320, 360));
        this.BallisticScrollPane.setHorizontalScrollBarPolicy(31);
        this.BallisticList.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.BallisticList.setSelectionMode(0);
        this.BallisticList.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                MechlabForm.this.BallisticListMouseClicked(mouseEvent);
            }
        });
        this.BallisticScrollPane.setViewportView(this.BallisticList);
        this.EquipmentTabbedPane.addTab("Ballistic", this.BallisticScrollPane);
        this.EnergyScrollPane.setHorizontalScrollBarPolicy(31);
        this.EnergyList.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.EnergyList.setSelectionMode(0);
        this.EnergyList.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                MechlabForm.this.EnergyListMouseClicked(mouseEvent);
            }
        });
        this.EnergyScrollPane.setViewportView(this.EnergyList);
        this.EquipmentTabbedPane.addTab("Energy", this.EnergyScrollPane);
        this.MissileScrollPane.setHorizontalScrollBarPolicy(31);
        this.MissileList.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.MissileList.setSelectionMode(0);
        this.MissileList.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                MechlabForm.this.MissileListMouseClicked(mouseEvent);
            }
        });
        this.MissileScrollPane.setViewportView(this.MissileList);
        this.EquipmentTabbedPane.addTab("Missile", this.MissileScrollPane);
        this.AmmoScrollPane.setHorizontalScrollBarPolicy(31);
        this.AmmoList.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.AmmoList.setSelectionMode(0);
        this.AmmoList.addFocusListener(new FocusAdapter() {

            @Override
            public void focusGained(FocusEvent focusEvent) {
                MechlabForm.this.AmmoListFocusGained(focusEvent);
            }
        });
        this.AmmoList.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                MechlabForm.this.AmmoListMouseClicked(mouseEvent);
            }
        });
        this.AmmoScrollPane.setViewportView(this.AmmoList);
        this.EquipmentTabbedPane.addTab("Ammo", this.AmmoScrollPane);
        this.EquipmentScrollPane.setHorizontalScrollBarPolicy(31);
        this.EquipmentList.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.EquipmentList.setSelectionMode(0);
        this.EquipmentList.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                MechlabForm.this.EquipmentListMouseClicked(mouseEvent);
            }
        });
        this.EquipmentScrollPane.setViewportView(this.EquipmentList);
        this.EquipmentTabbedPane.addTab("Equipment", this.EquipmentScrollPane);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.WeaponPanel.add(this.EquipmentTabbedPane, gridBagConstraints);
        this.MechTabPane.addTab("Equipment", this.WeaponPanel);
        this.ArmorAdjustmentPanel.setFont(User.preferences.DEFAULT_FONT_SIZE_16);
        this.ArmorAdjustmentPanel.setLayout(new GridBagLayout());
        this.PointsPerTonLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.PointsPerTonLabel.setText("Points/Ton:");
        this.PointsPerTonLabel.setAlignmentY(0.0f);
        this.PointsPerTonLabel.setMaximumSize(new Dimension(125, 25));
        this.PointsPerTonLabel.setMinimumSize(new Dimension(125, 25));
        this.PointsPerTonLabel.setPreferredSize(new Dimension(125, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.ArmorAdjustmentPanel.add(this.PointsPerTonLabel, gridBagConstraints);
        this.PointsPerTonAmount.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.PointsPerTonAmount.setText("32.0");
        this.PointsPerTonAmount.setAlignmentY(0.0f);
        this.PointsPerTonAmount.setBorder(new SoftBevelBorder(0));
        this.PointsPerTonAmount.setHorizontalTextPosition(2);
        this.PointsPerTonAmount.setMaximumSize(new Dimension(125, 25));
        this.PointsPerTonAmount.setMinimumSize(new Dimension(125, 25));
        this.PointsPerTonAmount.setPreferredSize(new Dimension(125, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.ArmorAdjustmentPanel.add(this.PointsPerTonAmount, gridBagConstraints);
        this.SectionLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.SectionLabel.setHorizontalAlignment(0);
        this.SectionLabel.setText("Section");
        this.SectionLabel.setAlignmentY(0.0f);
        this.SectionLabel.setBorder(new SoftBevelBorder(0));
        this.SectionLabel.setHorizontalTextPosition(2);
        this.SectionLabel.setMaximumSize(new Dimension(70, 25));
        this.SectionLabel.setMinimumSize(new Dimension(70, 25));
        this.SectionLabel.setPreferredSize(new Dimension(70, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.ArmorAdjustmentPanel.add(this.SectionLabel, gridBagConstraints);
        this.FrontLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.FrontLabel.setHorizontalAlignment(0);
        this.FrontLabel.setText("Front");
        this.FrontLabel.setAlignmentY(0.0f);
        this.FrontLabel.setBorder(new SoftBevelBorder(0));
        this.FrontLabel.setHorizontalTextPosition(2);
        this.FrontLabel.setMaximumSize(new Dimension(70, 25));
        this.FrontLabel.setMinimumSize(new Dimension(70, 25));
        this.FrontLabel.setPreferredSize(new Dimension(70, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.ArmorAdjustmentPanel.add(this.FrontLabel, gridBagConstraints);
        this.RearLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.RearLabel.setHorizontalAlignment(0);
        this.RearLabel.setText("Rear");
        this.RearLabel.setAlignmentY(0.0f);
        this.RearLabel.setBorder(new SoftBevelBorder(0));
        this.RearLabel.setHorizontalTextPosition(2);
        this.RearLabel.setMaximumSize(new Dimension(70, 25));
        this.RearLabel.setMinimumSize(new Dimension(70, 25));
        this.RearLabel.setPreferredSize(new Dimension(70, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.ArmorAdjustmentPanel.add(this.RearLabel, gridBagConstraints);
        this.AmountLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.AmountLabel.setHorizontalAlignment(0);
        this.AmountLabel.setText("Amount");
        this.AmountLabel.setAlignmentY(0.0f);
        this.AmountLabel.setBorder(new SoftBevelBorder(0));
        this.AmountLabel.setHorizontalTextPosition(2);
        this.AmountLabel.setMaximumSize(new Dimension(70, 25));
        this.AmountLabel.setMinimumSize(new Dimension(70, 25));
        this.AmountLabel.setPreferredSize(new Dimension(70, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.ArmorAdjustmentPanel.add(this.AmountLabel, gridBagConstraints);
        this.HeadLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.HeadLabel.setHorizontalAlignment(0);
        this.HeadLabel.setText("HD");
        this.HeadLabel.setAlignmentY(0.0f);
        this.HeadLabel.setBorder(new SoftBevelBorder(0));
        this.HeadLabel.setHorizontalTextPosition(2);
        this.HeadLabel.setMaximumSize(new Dimension(70, 25));
        this.HeadLabel.setMinimumSize(new Dimension(70, 25));
        this.HeadLabel.setPreferredSize(new Dimension(70, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.ArmorAdjustmentPanel.add(this.HeadLabel, gridBagConstraints);
        this.RightTorsoLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.RightTorsoLabel.setHorizontalAlignment(0);
        this.RightTorsoLabel.setText("RT");
        this.RightTorsoLabel.setAlignmentY(0.0f);
        this.RightTorsoLabel.setBorder(new SoftBevelBorder(0));
        this.RightTorsoLabel.setHorizontalTextPosition(2);
        this.RightTorsoLabel.setMaximumSize(new Dimension(70, 25));
        this.RightTorsoLabel.setMinimumSize(new Dimension(70, 25));
        this.RightTorsoLabel.setPreferredSize(new Dimension(70, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.ArmorAdjustmentPanel.add(this.RightTorsoLabel, gridBagConstraints);
        this.CenterTorsoLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.CenterTorsoLabel.setHorizontalAlignment(0);
        this.CenterTorsoLabel.setText("CT");
        this.CenterTorsoLabel.setAlignmentY(0.0f);
        this.CenterTorsoLabel.setBorder(new SoftBevelBorder(0));
        this.CenterTorsoLabel.setHorizontalTextPosition(2);
        this.CenterTorsoLabel.setMaximumSize(new Dimension(70, 25));
        this.CenterTorsoLabel.setMinimumSize(new Dimension(70, 25));
        this.CenterTorsoLabel.setPreferredSize(new Dimension(70, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.ArmorAdjustmentPanel.add(this.CenterTorsoLabel, gridBagConstraints);
        this.LeftTorsoLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.LeftTorsoLabel.setHorizontalAlignment(0);
        this.LeftTorsoLabel.setText("LT");
        this.LeftTorsoLabel.setAlignmentY(0.0f);
        this.LeftTorsoLabel.setBorder(new SoftBevelBorder(0));
        this.LeftTorsoLabel.setHorizontalTextPosition(2);
        this.LeftTorsoLabel.setMaximumSize(new Dimension(70, 25));
        this.LeftTorsoLabel.setMinimumSize(new Dimension(70, 25));
        this.LeftTorsoLabel.setPreferredSize(new Dimension(70, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.ArmorAdjustmentPanel.add(this.LeftTorsoLabel, gridBagConstraints);
        this.RightLegLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.RightLegLabel.setHorizontalAlignment(0);
        this.RightLegLabel.setText("RL");
        this.RightLegLabel.setAlignmentY(0.0f);
        this.RightLegLabel.setBorder(new SoftBevelBorder(0));
        this.RightLegLabel.setHorizontalTextPosition(2);
        this.RightLegLabel.setMaximumSize(new Dimension(70, 25));
        this.RightLegLabel.setMinimumSize(new Dimension(70, 25));
        this.RightLegLabel.setPreferredSize(new Dimension(70, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.ArmorAdjustmentPanel.add(this.RightLegLabel, gridBagConstraints);
        this.LeftLegLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.LeftLegLabel.setHorizontalAlignment(0);
        this.LeftLegLabel.setText("LL");
        this.LeftLegLabel.setAlignmentY(0.0f);
        this.LeftLegLabel.setBorder(new SoftBevelBorder(0));
        this.LeftLegLabel.setHorizontalTextPosition(2);
        this.LeftLegLabel.setMaximumSize(new Dimension(70, 25));
        this.LeftLegLabel.setMinimumSize(new Dimension(70, 25));
        this.LeftLegLabel.setPreferredSize(new Dimension(70, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.ArmorAdjustmentPanel.add(this.LeftLegLabel, gridBagConstraints);
        this.LeftArmLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.LeftArmLabel.setHorizontalAlignment(0);
        this.LeftArmLabel.setText("LA");
        this.LeftArmLabel.setAlignmentY(0.0f);
        this.LeftArmLabel.setBorder(new SoftBevelBorder(0));
        this.LeftArmLabel.setHorizontalTextPosition(2);
        this.LeftArmLabel.setMaximumSize(new Dimension(70, 25));
        this.LeftArmLabel.setMinimumSize(new Dimension(70, 25));
        this.LeftArmLabel.setPreferredSize(new Dimension(70, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.ArmorAdjustmentPanel.add(this.LeftArmLabel, gridBagConstraints);
        this.RightArmLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.RightArmLabel.setHorizontalAlignment(0);
        this.RightArmLabel.setText("RA");
        this.RightArmLabel.setAlignmentY(0.0f);
        this.RightArmLabel.setBorder(new SoftBevelBorder(0));
        this.RightArmLabel.setHorizontalTextPosition(2);
        this.RightArmLabel.setMaximumSize(new Dimension(70, 25));
        this.RightArmLabel.setMinimumSize(new Dimension(70, 25));
        this.RightArmLabel.setPreferredSize(new Dimension(70, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.ArmorAdjustmentPanel.add(this.RightArmLabel, gridBagConstraints);
        this.TotalLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.TotalLabel.setHorizontalAlignment(0);
        this.TotalLabel.setText("Total");
        this.TotalLabel.setAlignmentY(0.0f);
        this.TotalLabel.setBorder(new SoftBevelBorder(0));
        this.TotalLabel.setHorizontalTextPosition(2);
        this.TotalLabel.setMaximumSize(new Dimension(125, 25));
        this.TotalLabel.setMinimumSize(new Dimension(125, 25));
        this.TotalLabel.setPreferredSize(new Dimension(125, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.ArmorAdjustmentPanel.add(this.TotalLabel, gridBagConstraints);
        this.MaxArmorButton.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.MaxArmorButton.setText("Max Armor");
        this.MaxArmorButton.setAlignmentY(0.0f);
        this.MaxArmorButton.setMargin(new Insets(0, 0, 0, 0));
        this.MaxArmorButton.setMaximumSize(new Dimension(125, 25));
        this.MaxArmorButton.setMinimumSize(new Dimension(125, 25));
        this.MaxArmorButton.setPreferredSize(new Dimension(125, 25));
        this.MaxArmorButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MechlabForm.this.MaxArmorButtonActionPerformed(actionEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.ArmorAdjustmentPanel.add(this.MaxArmorButton, gridBagConstraints);
        this.HeadAmountLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.HeadAmountLabel.setHorizontalAlignment(0);
        this.HeadAmountLabel.setText("0/0");
        this.HeadAmountLabel.setAlignmentY(0.0f);
        this.HeadAmountLabel.setBorder(new SoftBevelBorder(0));
        this.HeadAmountLabel.setHorizontalTextPosition(2);
        this.HeadAmountLabel.setMaximumSize(new Dimension(70, 25));
        this.HeadAmountLabel.setMinimumSize(new Dimension(70, 25));
        this.HeadAmountLabel.setPreferredSize(new Dimension(70, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.ArmorAdjustmentPanel.add(this.HeadAmountLabel, gridBagConstraints);
        this.RightTorsoAmountLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.RightTorsoAmountLabel.setHorizontalAlignment(0);
        this.RightTorsoAmountLabel.setText("0/0");
        this.RightTorsoAmountLabel.setAlignmentY(0.0f);
        this.RightTorsoAmountLabel.setBorder(new SoftBevelBorder(0));
        this.RightTorsoAmountLabel.setHorizontalTextPosition(2);
        this.RightTorsoAmountLabel.setMaximumSize(new Dimension(70, 25));
        this.RightTorsoAmountLabel.setMinimumSize(new Dimension(70, 25));
        this.RightTorsoAmountLabel.setPreferredSize(new Dimension(70, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.ArmorAdjustmentPanel.add(this.RightTorsoAmountLabel, gridBagConstraints);
        this.CenterTorsoAmountLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.CenterTorsoAmountLabel.setHorizontalAlignment(0);
        this.CenterTorsoAmountLabel.setText("0/0");
        this.CenterTorsoAmountLabel.setAlignmentY(0.0f);
        this.CenterTorsoAmountLabel.setBorder(new SoftBevelBorder(0));
        this.CenterTorsoAmountLabel.setHorizontalTextPosition(2);
        this.CenterTorsoAmountLabel.setMaximumSize(new Dimension(70, 25));
        this.CenterTorsoAmountLabel.setMinimumSize(new Dimension(70, 25));
        this.CenterTorsoAmountLabel.setPreferredSize(new Dimension(70, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.ArmorAdjustmentPanel.add(this.CenterTorsoAmountLabel, gridBagConstraints);
        this.LeftTorsoAmountLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.LeftTorsoAmountLabel.setHorizontalAlignment(0);
        this.LeftTorsoAmountLabel.setText("0/0");
        this.LeftTorsoAmountLabel.setAlignmentY(0.0f);
        this.LeftTorsoAmountLabel.setBorder(new SoftBevelBorder(0));
        this.LeftTorsoAmountLabel.setHorizontalTextPosition(2);
        this.LeftTorsoAmountLabel.setMaximumSize(new Dimension(70, 25));
        this.LeftTorsoAmountLabel.setMinimumSize(new Dimension(70, 25));
        this.LeftTorsoAmountLabel.setPreferredSize(new Dimension(70, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.ArmorAdjustmentPanel.add(this.LeftTorsoAmountLabel, gridBagConstraints);
        this.RightArmAmountLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.RightArmAmountLabel.setHorizontalAlignment(0);
        this.RightArmAmountLabel.setText("0/0");
        this.RightArmAmountLabel.setAlignmentY(0.0f);
        this.RightArmAmountLabel.setBorder(new SoftBevelBorder(0));
        this.RightArmAmountLabel.setHorizontalTextPosition(2);
        this.RightArmAmountLabel.setMaximumSize(new Dimension(70, 25));
        this.RightArmAmountLabel.setMinimumSize(new Dimension(70, 25));
        this.RightArmAmountLabel.setPreferredSize(new Dimension(70, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.ArmorAdjustmentPanel.add(this.RightArmAmountLabel, gridBagConstraints);
        this.LeftArmAmountLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.LeftArmAmountLabel.setHorizontalAlignment(0);
        this.LeftArmAmountLabel.setText("0/0");
        this.LeftArmAmountLabel.setAlignmentY(0.0f);
        this.LeftArmAmountLabel.setBorder(new SoftBevelBorder(0));
        this.LeftArmAmountLabel.setHorizontalTextPosition(2);
        this.LeftArmAmountLabel.setMaximumSize(new Dimension(70, 25));
        this.LeftArmAmountLabel.setMinimumSize(new Dimension(70, 25));
        this.LeftArmAmountLabel.setPreferredSize(new Dimension(70, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.ArmorAdjustmentPanel.add(this.LeftArmAmountLabel, gridBagConstraints);
        this.RightLegAmountLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.RightLegAmountLabel.setHorizontalAlignment(0);
        this.RightLegAmountLabel.setText("0/0");
        this.RightLegAmountLabel.setAlignmentY(0.0f);
        this.RightLegAmountLabel.setBorder(new SoftBevelBorder(0));
        this.RightLegAmountLabel.setHorizontalTextPosition(2);
        this.RightLegAmountLabel.setMaximumSize(new Dimension(70, 25));
        this.RightLegAmountLabel.setMinimumSize(new Dimension(70, 25));
        this.RightLegAmountLabel.setPreferredSize(new Dimension(70, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.ArmorAdjustmentPanel.add(this.RightLegAmountLabel, gridBagConstraints);
        this.LeftLegAmountLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.LeftLegAmountLabel.setHorizontalAlignment(0);
        this.LeftLegAmountLabel.setText("0/0");
        this.LeftLegAmountLabel.setAlignmentY(0.0f);
        this.LeftLegAmountLabel.setBorder(new SoftBevelBorder(0));
        this.LeftLegAmountLabel.setHorizontalTextPosition(2);
        this.LeftLegAmountLabel.setMaximumSize(new Dimension(70, 25));
        this.LeftLegAmountLabel.setMinimumSize(new Dimension(70, 25));
        this.LeftLegAmountLabel.setPreferredSize(new Dimension(70, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.ArmorAdjustmentPanel.add(this.LeftLegAmountLabel, gridBagConstraints);
        this.TotalAmountLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.TotalAmountLabel.setHorizontalAlignment(0);
        this.TotalAmountLabel.setText("0/0");
        this.TotalAmountLabel.setAlignmentY(0.0f);
        this.TotalAmountLabel.setBorder(new SoftBevelBorder(0));
        this.TotalAmountLabel.setHorizontalTextPosition(2);
        this.TotalAmountLabel.setMaximumSize(new Dimension(125, 25));
        this.TotalAmountLabel.setMinimumSize(new Dimension(125, 25));
        this.TotalAmountLabel.setPreferredSize(new Dimension(125, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.ArmorAdjustmentPanel.add(this.TotalAmountLabel, gridBagConstraints);
        this.MaxArmorButton1.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.MaxArmorButton1.setText("Efficient Maximum");
        this.MaxArmorButton1.setAlignmentY(0.0f);
        this.MaxArmorButton1.setEnabled(false);
        this.MaxArmorButton1.setMargin(new Insets(0, 0, 0, 0));
        this.MaxArmorButton1.setMaximumSize(new Dimension(125, 25));
        this.MaxArmorButton1.setMinimumSize(new Dimension(125, 25));
        this.MaxArmorButton1.setPreferredSize(new Dimension(125, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.ArmorAdjustmentPanel.add(this.MaxArmorButton1, gridBagConstraints);
        this.HeadSpinner.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.HeadSpinner.setModel(this.HeadSpinnerModel);
        this.HeadSpinner.setMaximumSize(new Dimension(70, 25));
        this.HeadSpinner.setMinimumSize(new Dimension(70, 25));
        this.HeadSpinner.setPreferredSize(new Dimension(70, 25));
        this.HeadSpinner.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent changeEvent) {
                MechlabForm.this.HeadSpinnerStateChanged(changeEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.ArmorAdjustmentPanel.add(this.HeadSpinner, gridBagConstraints);
        this.RightTorsoSpinner.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.RightTorsoSpinner.setModel(this.RightTorsoSpinnerModel);
        this.RightTorsoSpinner.setMaximumSize(new Dimension(70, 25));
        this.RightTorsoSpinner.setMinimumSize(new Dimension(70, 25));
        this.RightTorsoSpinner.setPreferredSize(new Dimension(70, 25));
        this.RightTorsoSpinner.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent changeEvent) {
                MechlabForm.this.RightTorsoSpinnerStateChanged(changeEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.ArmorAdjustmentPanel.add(this.RightTorsoSpinner, gridBagConstraints);
        this.RightRearTorsoSpinner.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.RightRearTorsoSpinner.setModel(this.RightRearTorsoSpinnerModel);
        this.RightRearTorsoSpinner.setMaximumSize(new Dimension(70, 25));
        this.RightRearTorsoSpinner.setMinimumSize(new Dimension(70, 25));
        this.RightRearTorsoSpinner.setPreferredSize(new Dimension(70, 25));
        this.RightRearTorsoSpinner.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent changeEvent) {
                MechlabForm.this.RightRearTorsoSpinnerStateChanged(changeEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.ArmorAdjustmentPanel.add(this.RightRearTorsoSpinner, gridBagConstraints);
        this.CenterRearTorsoSpinner.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.CenterRearTorsoSpinner.setModel(this.CenterRearTorsoSpinnerModel);
        this.CenterRearTorsoSpinner.setMaximumSize(new Dimension(70, 25));
        this.CenterRearTorsoSpinner.setMinimumSize(new Dimension(70, 25));
        this.CenterRearTorsoSpinner.setPreferredSize(new Dimension(70, 25));
        this.CenterRearTorsoSpinner.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent changeEvent) {
                MechlabForm.this.CenterRearTorsoSpinnerStateChanged(changeEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.ArmorAdjustmentPanel.add(this.CenterRearTorsoSpinner, gridBagConstraints);
        this.CenterTorsoSpinner.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.CenterTorsoSpinner.setModel(this.CenterTorsoSpinnerModel);
        this.CenterTorsoSpinner.setMaximumSize(new Dimension(70, 25));
        this.CenterTorsoSpinner.setMinimumSize(new Dimension(70, 25));
        this.CenterTorsoSpinner.setPreferredSize(new Dimension(70, 25));
        this.CenterTorsoSpinner.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent changeEvent) {
                MechlabForm.this.CenterTorsoSpinnerStateChanged(changeEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.ArmorAdjustmentPanel.add(this.CenterTorsoSpinner, gridBagConstraints);
        this.LeftRearTorsoSpinner.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.LeftRearTorsoSpinner.setModel(this.LeftRearTorsoSpinnerModel);
        this.LeftRearTorsoSpinner.setMaximumSize(new Dimension(70, 25));
        this.LeftRearTorsoSpinner.setMinimumSize(new Dimension(70, 25));
        this.LeftRearTorsoSpinner.setPreferredSize(new Dimension(70, 25));
        this.LeftRearTorsoSpinner.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent changeEvent) {
                MechlabForm.this.LeftRearTorsoSpinnerStateChanged(changeEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.ArmorAdjustmentPanel.add(this.LeftRearTorsoSpinner, gridBagConstraints);
        this.LeftTorsoSpinner.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.LeftTorsoSpinner.setModel(this.LeftTorsoSpinnerModel);
        this.LeftTorsoSpinner.setMaximumSize(new Dimension(70, 25));
        this.LeftTorsoSpinner.setMinimumSize(new Dimension(70, 25));
        this.LeftTorsoSpinner.setPreferredSize(new Dimension(70, 25));
        this.LeftTorsoSpinner.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent changeEvent) {
                MechlabForm.this.LeftTorsoSpinnerStateChanged(changeEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.ArmorAdjustmentPanel.add(this.LeftTorsoSpinner, gridBagConstraints);
        this.RightArmSpinner.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.RightArmSpinner.setModel(this.RightArmSpinnerModel);
        this.RightArmSpinner.setMaximumSize(new Dimension(70, 25));
        this.RightArmSpinner.setMinimumSize(new Dimension(70, 25));
        this.RightArmSpinner.setPreferredSize(new Dimension(70, 25));
        this.RightArmSpinner.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent changeEvent) {
                MechlabForm.this.RightArmSpinnerStateChanged(changeEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.ArmorAdjustmentPanel.add(this.RightArmSpinner, gridBagConstraints);
        this.LeftArmSpinner.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.LeftArmSpinner.setModel(this.LeftArmSpinnerModel);
        this.LeftArmSpinner.setMaximumSize(new Dimension(70, 25));
        this.LeftArmSpinner.setMinimumSize(new Dimension(70, 25));
        this.LeftArmSpinner.setPreferredSize(new Dimension(70, 25));
        this.LeftArmSpinner.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent changeEvent) {
                MechlabForm.this.LeftArmSpinnerStateChanged(changeEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.ArmorAdjustmentPanel.add(this.LeftArmSpinner, gridBagConstraints);
        this.RightLegSpinner.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.RightLegSpinner.setModel(this.RightLegSpinnerModel);
        this.RightLegSpinner.setMaximumSize(new Dimension(70, 25));
        this.RightLegSpinner.setMinimumSize(new Dimension(70, 25));
        this.RightLegSpinner.setPreferredSize(new Dimension(70, 25));
        this.RightLegSpinner.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent changeEvent) {
                MechlabForm.this.RightLegSpinnerStateChanged(changeEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.ArmorAdjustmentPanel.add(this.RightLegSpinner, gridBagConstraints);
        this.LeftLegSpinner.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.LeftLegSpinner.setModel(this.LeftLegSpinnerModel);
        this.LeftLegSpinner.setMaximumSize(new Dimension(70, 25));
        this.LeftLegSpinner.setMinimumSize(new Dimension(70, 25));
        this.LeftLegSpinner.setPreferredSize(new Dimension(70, 25));
        this.LeftLegSpinner.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent changeEvent) {
                MechlabForm.this.LeftLegSpinnerStateChanged(changeEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.ArmorAdjustmentPanel.add(this.LeftLegSpinner, gridBagConstraints);
        this.MaxArmorButton2.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.MaxArmorButton2.setAlignmentY(0.0f);
        this.MaxArmorButton2.setEnabled(false);
        this.MaxArmorButton2.setMargin(new Insets(0, 0, 0, 0));
        this.MaxArmorButton2.setMaximumSize(new Dimension(125, 25));
        this.MaxArmorButton2.setMinimumSize(new Dimension(125, 25));
        this.MaxArmorButton2.setPreferredSize(new Dimension(125, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.ArmorAdjustmentPanel.add(this.MaxArmorButton2, gridBagConstraints);
        this.ClearArmorButton.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.ClearArmorButton.setText("Clear Armor");
        this.ClearArmorButton.setAlignmentY(0.0f);
        this.ClearArmorButton.setMargin(new Insets(0, 0, 0, 0));
        this.ClearArmorButton.setMaximumSize(new Dimension(125, 25));
        this.ClearArmorButton.setMinimumSize(new Dimension(125, 25));
        this.ClearArmorButton.setPreferredSize(new Dimension(125, 25));
        this.ClearArmorButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MechlabForm.this.ClearArmorButtonActionPerformed(actionEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.ArmorAdjustmentPanel.add(this.ClearArmorButton, gridBagConstraints);
        this.MechTabPane.addTab("Armor", this.ArmorAdjustmentPanel);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = 1;
        this.getContentPane().add(this.MechTabPane, gridBagConstraints);
        this.MechDisplayPanel.setAlignmentX(0.0f);
        this.MechDisplayPanel.setAlignmentY(0.0f);
        this.MechDisplayPanel.setFont(User.preferences.DEFAULT_FONT_SIZE_16);
        this.MechDisplayPanel.setMaximumSize(new Dimension(690, 540));
        this.MechDisplayPanel.setMinimumSize(new Dimension(690, 540));
        this.MechDisplayPanel.setPreferredSize(new Dimension(690, 540));
        this.MechDisplayPanel.setLayout(new GridBagLayout());
        this.OverviewPanel.setAlignmentX(0.0f);
        this.OverviewPanel.setAlignmentY(0.0f);
        this.OverviewPanel.setFont(User.preferences.DEFAULT_FONT_SIZE_16);
        this.OverviewPanel.setMaximumSize(new Dimension(540, 540));
        this.OverviewPanel.setMinimumSize(new Dimension(540, 540));
        this.OverviewPanel.setOpaque(false);
        this.OverviewPanel.setPreferredSize(new Dimension(540, 540));
        this.OverviewPanel.setLayout(new GridBagLayout());
        this.RightArmCriticalPanel.setBorder(BorderFactory.createTitledBorder(null, "Right Arm", 2, 2, User.preferences.DEFAULT_FONT_SIZE_12));
        this.RightArmCriticalPanel.setMaximumSize(new Dimension(100, 360));
        this.RightArmCriticalPanel.setMinimumSize(new Dimension(100, 240));
        this.RightArmCriticalPanel.setOpaque(false);
        this.RightArmCriticalPanel.setPreferredSize(new Dimension(100, 240));
        this.RightArmCriticalPanel.setLayout(new GridBagLayout());
        this.RightArmPodComboBox.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.RightArmPodComboBox.setMaximumSize(new Dimension(80, 20));
        this.RightArmPodComboBox.setMinimumSize(new Dimension(80, 20));
        this.RightArmPodComboBox.setPreferredSize(new Dimension(80, 20));
        this.RightArmPodComboBox.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MechlabForm.this.RightArmPodComboBoxActionPerformed(actionEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.RightArmCriticalPanel.add(this.RightArmPodComboBox, gridBagConstraints);
        this.RightArmBallisticHardpointLabel.setBackground(User.preferences.BALLISTIC_COLOR);
        this.RightArmBallisticHardpointLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.RightArmBallisticHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        this.RightArmBallisticHardpointLabel.setMaximumSize(new Dimension(90, 16));
        this.RightArmBallisticHardpointLabel.setMinimumSize(new Dimension(90, 16));
        this.RightArmBallisticHardpointLabel.setOpaque(true);
        this.RightArmBallisticHardpointLabel.setPreferredSize(new Dimension(90, 16));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.RightArmCriticalPanel.add(this.RightArmBallisticHardpointLabel, gridBagConstraints);
        this.RightArmEnergyHardpointLabel.setBackground(User.preferences.ENERGY_COLOR);
        this.RightArmEnergyHardpointLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.RightArmEnergyHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        this.RightArmEnergyHardpointLabel.setMaximumSize(new Dimension(90, 16));
        this.RightArmEnergyHardpointLabel.setMinimumSize(new Dimension(90, 16));
        this.RightArmEnergyHardpointLabel.setOpaque(true);
        this.RightArmEnergyHardpointLabel.setPreferredSize(new Dimension(90, 16));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.RightArmCriticalPanel.add(this.RightArmEnergyHardpointLabel, gridBagConstraints);
        this.RightArmMissileHardpointLabel.setBackground(User.preferences.MISSILE_COLOR);
        this.RightArmMissileHardpointLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.RightArmMissileHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        this.RightArmMissileHardpointLabel.setMaximumSize(new Dimension(90, 16));
        this.RightArmMissileHardpointLabel.setMinimumSize(new Dimension(90, 16));
        this.RightArmMissileHardpointLabel.setOpaque(true);
        this.RightArmMissileHardpointLabel.setPreferredSize(new Dimension(90, 16));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.RightArmCriticalPanel.add(this.RightArmMissileHardpointLabel, gridBagConstraints);
        this.RightArmAMSHardpointLabel.setBackground(User.preferences.AMS_COLOR);
        this.RightArmAMSHardpointLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.RightArmAMSHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        this.RightArmAMSHardpointLabel.setMaximumSize(new Dimension(96, 12));
        this.RightArmAMSHardpointLabel.setMinimumSize(new Dimension(96, 12));
        this.RightArmAMSHardpointLabel.setOpaque(true);
        this.RightArmAMSHardpointLabel.setPreferredSize(new Dimension(96, 12));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.RightArmCriticalPanel.add(this.RightArmAMSHardpointLabel, gridBagConstraints);
        this.RightArmECMHardpointLabel.setBackground(User.preferences.ECM_COLOR);
        this.RightArmECMHardpointLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.RightArmECMHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        this.RightArmECMHardpointLabel.setMaximumSize(new Dimension(96, 12));
        this.RightArmECMHardpointLabel.setMinimumSize(new Dimension(96, 12));
        this.RightArmECMHardpointLabel.setOpaque(true);
        this.RightArmECMHardpointLabel.setPreferredSize(new Dimension(96, 12));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.RightArmCriticalPanel.add(this.RightArmECMHardpointLabel, gridBagConstraints);
        this.RightHandToggleButton.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.RightHandToggleButton.setText("Hand");
        this.RightHandToggleButton.setMargin(new Insets(0, 0, 0, 0));
        this.RightHandToggleButton.setMaximumSize(new Dimension(90, 16));
        this.RightHandToggleButton.setMinimumSize(new Dimension(90, 16));
        this.RightHandToggleButton.setPreferredSize(new Dimension(90, 16));
        this.RightHandToggleButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MechlabForm.this.RightHandToggleButtonActionPerformed(actionEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.RightArmCriticalPanel.add(this.RightHandToggleButton, gridBagConstraints);
        this.RightLowerArmToggleButton.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.RightLowerArmToggleButton.setText("Lower Arm");
        this.RightLowerArmToggleButton.setMargin(new Insets(0, 0, 0, 0));
        this.RightLowerArmToggleButton.setMaximumSize(new Dimension(90, 16));
        this.RightLowerArmToggleButton.setMinimumSize(new Dimension(90, 16));
        this.RightLowerArmToggleButton.setPreferredSize(new Dimension(90, 16));
        this.RightLowerArmToggleButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MechlabForm.this.RightLowerArmToggleButtonActionPerformed(actionEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.RightArmCriticalPanel.add(this.RightLowerArmToggleButton, gridBagConstraints);
        this.RightArmCriticalList.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.RightArmCriticalList.setModel(new AbstractListModel() {
            String[] strings;

            @Override
            public int getSize() {
                return this.strings.length;
            }

            @Override
            public Object getElementAt(int n) {
                return this.strings[n];
            }
        });
        this.RightArmCriticalList.setSelectionMode(0);
        this.RightArmCriticalList.setDragEnabled(true);
        this.RightArmCriticalList.setDropMode(DropMode.ON);
        this.RightArmCriticalList.setMaximumSize(new Dimension(90, 144));
        this.RightArmCriticalList.setMinimumSize(new Dimension(90, 144));
        this.RightArmCriticalList.setOpaque(false);
        this.RightArmCriticalList.setPreferredSize(new Dimension(90, 144));
        this.RightArmCriticalList.setVisibleRowCount(12);
        this.RightArmCriticalList.addFocusListener(new FocusAdapter() {

            @Override
            public void focusGained(FocusEvent focusEvent) {
                MechlabForm.this.RightArmCriticalListFocusGained(focusEvent);
            }
        });
        this.RightArmCriticalList.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                MechlabForm.this.RightArmCriticalListMouseClicked(mouseEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.RightArmCriticalPanel.add(this.RightArmCriticalList, gridBagConstraints);
        this.RightArmArmorProgressBar.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.RightArmArmorProgressBar.setForeground(User.preferences.ARMOR_COLOR);
        this.RightArmArmorProgressBar.setMaximumSize(new Dimension(80, 20));
        this.RightArmArmorProgressBar.setMinimumSize(new Dimension(80, 20));
        this.RightArmArmorProgressBar.setPreferredSize(new Dimension(80, 20));
        this.RightArmArmorProgressBar.setString("0");
        this.RightArmArmorProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.RightArmCriticalPanel.add(this.RightArmArmorProgressBar, gridBagConstraints);
        this.RightArmStructureProgressBar.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.RightArmStructureProgressBar.setForeground(User.preferences.STRUCTURE_COLOR);
        this.RightArmStructureProgressBar.setValue(100);
        this.RightArmStructureProgressBar.setMaximumSize(new Dimension(80, 20));
        this.RightArmStructureProgressBar.setMinimumSize(new Dimension(80, 20));
        this.RightArmStructureProgressBar.setPreferredSize(new Dimension(80, 20));
        this.RightArmStructureProgressBar.setString("0");
        this.RightArmStructureProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.RightArmCriticalPanel.add(this.RightArmStructureProgressBar, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.OverviewPanel.add(this.RightArmCriticalPanel, gridBagConstraints);
        this.LeftArmCriticalPanel.setBorder(BorderFactory.createTitledBorder(null, "Left Arm", 2, 2, User.preferences.DEFAULT_FONT_SIZE_12));
        this.LeftArmCriticalPanel.setMaximumSize(new Dimension(100, 360));
        this.LeftArmCriticalPanel.setMinimumSize(new Dimension(100, 240));
        this.LeftArmCriticalPanel.setOpaque(false);
        this.LeftArmCriticalPanel.setPreferredSize(new Dimension(100, 240));
        this.LeftArmCriticalPanel.setLayout(new GridBagLayout());
        this.LeftArmPodComboBox.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.LeftArmPodComboBox.setMaximumSize(new Dimension(80, 20));
        this.LeftArmPodComboBox.setMinimumSize(new Dimension(80, 20));
        this.LeftArmPodComboBox.setPreferredSize(new Dimension(80, 20));
        this.LeftArmPodComboBox.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MechlabForm.this.LeftArmPodComboBoxActionPerformed(actionEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.LeftArmCriticalPanel.add(this.LeftArmPodComboBox, gridBagConstraints);
        this.LeftArmBallisticHardpointLabel.setBackground(User.preferences.BALLISTIC_COLOR);
        this.LeftArmBallisticHardpointLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.LeftArmBallisticHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        this.LeftArmBallisticHardpointLabel.setMaximumSize(new Dimension(90, 16));
        this.LeftArmBallisticHardpointLabel.setMinimumSize(new Dimension(90, 16));
        this.LeftArmBallisticHardpointLabel.setOpaque(true);
        this.LeftArmBallisticHardpointLabel.setPreferredSize(new Dimension(90, 16));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.LeftArmCriticalPanel.add(this.LeftArmBallisticHardpointLabel, gridBagConstraints);
        this.LeftArmEnergyHardpointLabel.setBackground(User.preferences.ENERGY_COLOR);
        this.LeftArmEnergyHardpointLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.LeftArmEnergyHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        this.LeftArmEnergyHardpointLabel.setMaximumSize(new Dimension(90, 16));
        this.LeftArmEnergyHardpointLabel.setMinimumSize(new Dimension(90, 16));
        this.LeftArmEnergyHardpointLabel.setOpaque(true);
        this.LeftArmEnergyHardpointLabel.setPreferredSize(new Dimension(90, 16));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.LeftArmCriticalPanel.add(this.LeftArmEnergyHardpointLabel, gridBagConstraints);
        this.LeftArmMissileHardpointLabel.setBackground(User.preferences.MISSILE_COLOR);
        this.LeftArmMissileHardpointLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.LeftArmMissileHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        this.LeftArmMissileHardpointLabel.setMaximumSize(new Dimension(90, 16));
        this.LeftArmMissileHardpointLabel.setMinimumSize(new Dimension(90, 16));
        this.LeftArmMissileHardpointLabel.setOpaque(true);
        this.LeftArmMissileHardpointLabel.setPreferredSize(new Dimension(90, 16));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.LeftArmCriticalPanel.add(this.LeftArmMissileHardpointLabel, gridBagConstraints);
        this.LeftArmAMSHardpointLabel.setBackground(User.preferences.AMS_COLOR);
        this.LeftArmAMSHardpointLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.LeftArmAMSHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        this.LeftArmAMSHardpointLabel.setMaximumSize(new Dimension(96, 12));
        this.LeftArmAMSHardpointLabel.setMinimumSize(new Dimension(96, 12));
        this.LeftArmAMSHardpointLabel.setOpaque(true);
        this.LeftArmAMSHardpointLabel.setPreferredSize(new Dimension(96, 12));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.LeftArmCriticalPanel.add(this.LeftArmAMSHardpointLabel, gridBagConstraints);
        this.LeftArmECMHardpointLabel.setBackground(User.preferences.ECM_COLOR);
        this.LeftArmECMHardpointLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.LeftArmECMHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        this.LeftArmECMHardpointLabel.setMaximumSize(new Dimension(96, 12));
        this.LeftArmECMHardpointLabel.setMinimumSize(new Dimension(96, 12));
        this.LeftArmECMHardpointLabel.setOpaque(true);
        this.LeftArmECMHardpointLabel.setPreferredSize(new Dimension(96, 12));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.LeftArmCriticalPanel.add(this.LeftArmECMHardpointLabel, gridBagConstraints);
        this.LeftLowerArmToggleButton.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.LeftLowerArmToggleButton.setText("Lower Arm");
        this.LeftLowerArmToggleButton.setMargin(new Insets(0, 0, 0, 0));
        this.LeftLowerArmToggleButton.setMaximumSize(new Dimension(90, 16));
        this.LeftLowerArmToggleButton.setMinimumSize(new Dimension(90, 16));
        this.LeftLowerArmToggleButton.setPreferredSize(new Dimension(90, 16));
        this.LeftLowerArmToggleButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MechlabForm.this.LeftLowerArmToggleButtonActionPerformed(actionEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.LeftArmCriticalPanel.add(this.LeftLowerArmToggleButton, gridBagConstraints);
        this.LeftHandToggleButton.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.LeftHandToggleButton.setText("Hand");
        this.LeftHandToggleButton.setMargin(new Insets(0, 0, 0, 0));
        this.LeftHandToggleButton.setMaximumSize(new Dimension(90, 16));
        this.LeftHandToggleButton.setMinimumSize(new Dimension(90, 16));
        this.LeftHandToggleButton.setPreferredSize(new Dimension(90, 16));
        this.LeftHandToggleButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MechlabForm.this.LeftHandToggleButtonActionPerformed(actionEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.LeftArmCriticalPanel.add(this.LeftHandToggleButton, gridBagConstraints);
        this.LeftArmCriticalList.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.LeftArmCriticalList.setModel(new AbstractListModel() {
            String[] strings;

            @Override
            public int getSize() {
                return this.strings.length;
            }

            @Override
            public Object getElementAt(int n) {
                return this.strings[n];
            }
        });
        this.LeftArmCriticalList.setSelectionMode(0);
        this.LeftArmCriticalList.setDragEnabled(true);
        this.LeftArmCriticalList.setDropMode(DropMode.ON);
        this.LeftArmCriticalList.setMaximumSize(new Dimension(90, 144));
        this.LeftArmCriticalList.setMinimumSize(new Dimension(90, 144));
        this.LeftArmCriticalList.setOpaque(false);
        this.LeftArmCriticalList.setPreferredSize(new Dimension(90, 144));
        this.LeftArmCriticalList.setVisibleRowCount(12);
        this.LeftArmCriticalList.addFocusListener(new FocusAdapter() {

            @Override
            public void focusGained(FocusEvent focusEvent) {
                MechlabForm.this.LeftArmCriticalListFocusGained(focusEvent);
            }
        });
        this.LeftArmCriticalList.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                MechlabForm.this.LeftArmCriticalListMouseClicked(mouseEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.LeftArmCriticalPanel.add(this.LeftArmCriticalList, gridBagConstraints);
        this.LeftArmArmorProgressBar.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.LeftArmArmorProgressBar.setForeground(User.preferences.ARMOR_COLOR);
        this.LeftArmArmorProgressBar.setMaximumSize(new Dimension(80, 20));
        this.LeftArmArmorProgressBar.setMinimumSize(new Dimension(80, 20));
        this.LeftArmArmorProgressBar.setPreferredSize(new Dimension(80, 20));
        this.LeftArmArmorProgressBar.setString("0");
        this.LeftArmArmorProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.LeftArmCriticalPanel.add(this.LeftArmArmorProgressBar, gridBagConstraints);
        this.LeftArmStructureProgressBar.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.LeftArmStructureProgressBar.setForeground(User.preferences.STRUCTURE_COLOR);
        this.LeftArmStructureProgressBar.setValue(100);
        this.LeftArmStructureProgressBar.setMaximumSize(new Dimension(80, 20));
        this.LeftArmStructureProgressBar.setMinimumSize(new Dimension(80, 20));
        this.LeftArmStructureProgressBar.setPreferredSize(new Dimension(80, 20));
        this.LeftArmStructureProgressBar.setString("0");
        this.LeftArmStructureProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.LeftArmCriticalPanel.add(this.LeftArmStructureProgressBar, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.OverviewPanel.add(this.LeftArmCriticalPanel, gridBagConstraints);
        this.RightLegCriticalPanel.setBorder(BorderFactory.createTitledBorder(null, "Right Leg", 2, 2, User.preferences.DEFAULT_FONT_SIZE_12));
        this.RightLegCriticalPanel.setMaximumSize(new Dimension(100, 180));
        this.RightLegCriticalPanel.setMinimumSize(new Dimension(100, 120));
        this.RightLegCriticalPanel.setOpaque(false);
        this.RightLegCriticalPanel.setPreferredSize(new Dimension(100, 120));
        this.RightLegCriticalPanel.setLayout(new GridBagLayout());
        this.RightLegPodComboBox.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.RightLegPodComboBox.setMaximumSize(new Dimension(80, 20));
        this.RightLegPodComboBox.setMinimumSize(new Dimension(80, 20));
        this.RightLegPodComboBox.setPreferredSize(new Dimension(80, 20));
        this.RightLegPodComboBox.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MechlabForm.this.RightLegPodComboBoxActionPerformed(actionEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.RightLegCriticalPanel.add(this.RightLegPodComboBox, gridBagConstraints);
        this.RightLegBallisticHardpointLabel.setBackground(User.preferences.BALLISTIC_COLOR);
        this.RightLegBallisticHardpointLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.RightLegBallisticHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        this.RightLegBallisticHardpointLabel.setMaximumSize(new Dimension(90, 16));
        this.RightLegBallisticHardpointLabel.setMinimumSize(new Dimension(90, 16));
        this.RightLegBallisticHardpointLabel.setOpaque(true);
        this.RightLegBallisticHardpointLabel.setPreferredSize(new Dimension(90, 16));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.RightLegCriticalPanel.add(this.RightLegBallisticHardpointLabel, gridBagConstraints);
        this.RightLegEnergyHardpointLabel.setBackground(User.preferences.ENERGY_COLOR);
        this.RightLegEnergyHardpointLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.RightLegEnergyHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        this.RightLegEnergyHardpointLabel.setMaximumSize(new Dimension(90, 16));
        this.RightLegEnergyHardpointLabel.setMinimumSize(new Dimension(90, 16));
        this.RightLegEnergyHardpointLabel.setOpaque(true);
        this.RightLegEnergyHardpointLabel.setPreferredSize(new Dimension(90, 16));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.RightLegCriticalPanel.add(this.RightLegEnergyHardpointLabel, gridBagConstraints);
        this.RightLegMissileHardpointLabel.setBackground(User.preferences.MISSILE_COLOR);
        this.RightLegMissileHardpointLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.RightLegMissileHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        this.RightLegMissileHardpointLabel.setMaximumSize(new Dimension(90, 16));
        this.RightLegMissileHardpointLabel.setMinimumSize(new Dimension(90, 16));
        this.RightLegMissileHardpointLabel.setOpaque(true);
        this.RightLegMissileHardpointLabel.setPreferredSize(new Dimension(90, 16));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.RightLegCriticalPanel.add(this.RightLegMissileHardpointLabel, gridBagConstraints);
        this.RightLegAMSHardpointLabel.setBackground(User.preferences.AMS_COLOR);
        this.RightLegAMSHardpointLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.RightLegAMSHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        this.RightLegAMSHardpointLabel.setMaximumSize(new Dimension(96, 12));
        this.RightLegAMSHardpointLabel.setMinimumSize(new Dimension(96, 12));
        this.RightLegAMSHardpointLabel.setOpaque(true);
        this.RightLegAMSHardpointLabel.setPreferredSize(new Dimension(96, 12));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.RightLegCriticalPanel.add(this.RightLegAMSHardpointLabel, gridBagConstraints);
        this.RightLegECMHardpointLabel.setBackground(User.preferences.ECM_COLOR);
        this.RightLegECMHardpointLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.RightLegECMHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        this.RightLegECMHardpointLabel.setMaximumSize(new Dimension(96, 12));
        this.RightLegECMHardpointLabel.setMinimumSize(new Dimension(96, 12));
        this.RightLegECMHardpointLabel.setOpaque(true);
        this.RightLegECMHardpointLabel.setPreferredSize(new Dimension(96, 12));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.RightLegCriticalPanel.add(this.RightLegECMHardpointLabel, gridBagConstraints);
        this.RightLegCriticalList.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.RightLegCriticalList.setModel(new AbstractListModel() {
            String[] strings;

            @Override
            public int getSize() {
                return this.strings.length;
            }

            @Override
            public Object getElementAt(int n) {
                return this.strings[n];
            }
        });
        this.RightLegCriticalList.setSelectionMode(0);
        this.RightLegCriticalList.setDragEnabled(true);
        this.RightLegCriticalList.setDropMode(DropMode.ON);
        this.RightLegCriticalList.setMaximumSize(new Dimension(90, 144));
        this.RightLegCriticalList.setMinimumSize(new Dimension(90, 144));
        this.RightLegCriticalList.setOpaque(false);
        this.RightLegCriticalList.setPreferredSize(new Dimension(90, 144));
        this.RightLegCriticalList.setVisibleRowCount(12);
        this.RightLegCriticalList.addFocusListener(new FocusAdapter() {

            @Override
            public void focusGained(FocusEvent focusEvent) {
                MechlabForm.this.RightLegCriticalListFocusGained(focusEvent);
            }
        });
        this.RightLegCriticalList.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                MechlabForm.this.RightLegCriticalListMouseClicked(mouseEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.RightLegCriticalPanel.add(this.RightLegCriticalList, gridBagConstraints);
        this.RightLegArmorProgressBar.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.RightLegArmorProgressBar.setForeground(User.preferences.ARMOR_COLOR);
        this.RightLegArmorProgressBar.setMaximumSize(new Dimension(80, 20));
        this.RightLegArmorProgressBar.setMinimumSize(new Dimension(80, 20));
        this.RightLegArmorProgressBar.setPreferredSize(new Dimension(80, 20));
        this.RightLegArmorProgressBar.setString("0");
        this.RightLegArmorProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.RightLegCriticalPanel.add(this.RightLegArmorProgressBar, gridBagConstraints);
        this.RightLegStructureProgressBar.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.RightLegStructureProgressBar.setForeground(User.preferences.STRUCTURE_COLOR);
        this.RightLegStructureProgressBar.setValue(100);
        this.RightLegStructureProgressBar.setMaximumSize(new Dimension(80, 20));
        this.RightLegStructureProgressBar.setMinimumSize(new Dimension(80, 20));
        this.RightLegStructureProgressBar.setPreferredSize(new Dimension(80, 20));
        this.RightLegStructureProgressBar.setString("0");
        this.RightLegStructureProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.RightLegCriticalPanel.add(this.RightLegStructureProgressBar, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.OverviewPanel.add(this.RightLegCriticalPanel, gridBagConstraints);
        this.LeftLegCriticalPanel.setBorder(BorderFactory.createTitledBorder(null, "Left Leg", 2, 2, User.preferences.DEFAULT_FONT_SIZE_12));
        this.LeftLegCriticalPanel.setMaximumSize(new Dimension(100, 180));
        this.LeftLegCriticalPanel.setMinimumSize(new Dimension(100, 120));
        this.LeftLegCriticalPanel.setOpaque(false);
        this.LeftLegCriticalPanel.setPreferredSize(new Dimension(100, 120));
        this.LeftLegCriticalPanel.setLayout(new GridBagLayout());
        this.LeftLegPodComboBox.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.LeftLegPodComboBox.setMaximumSize(new Dimension(80, 20));
        this.LeftLegPodComboBox.setMinimumSize(new Dimension(80, 20));
        this.LeftLegPodComboBox.setPreferredSize(new Dimension(80, 20));
        this.LeftLegPodComboBox.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MechlabForm.this.LeftLegPodComboBoxActionPerformed(actionEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.LeftLegCriticalPanel.add(this.LeftLegPodComboBox, gridBagConstraints);
        this.LeftLegBallisticHardpointLabel.setBackground(User.preferences.BALLISTIC_COLOR);
        this.LeftLegBallisticHardpointLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.LeftLegBallisticHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        this.LeftLegBallisticHardpointLabel.setMaximumSize(new Dimension(90, 16));
        this.LeftLegBallisticHardpointLabel.setMinimumSize(new Dimension(90, 16));
        this.LeftLegBallisticHardpointLabel.setOpaque(true);
        this.LeftLegBallisticHardpointLabel.setPreferredSize(new Dimension(90, 16));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.LeftLegCriticalPanel.add(this.LeftLegBallisticHardpointLabel, gridBagConstraints);
        this.LeftLegEnergyHardpointLabel.setBackground(User.preferences.ENERGY_COLOR);
        this.LeftLegEnergyHardpointLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.LeftLegEnergyHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        this.LeftLegEnergyHardpointLabel.setMaximumSize(new Dimension(90, 16));
        this.LeftLegEnergyHardpointLabel.setMinimumSize(new Dimension(90, 16));
        this.LeftLegEnergyHardpointLabel.setOpaque(true);
        this.LeftLegEnergyHardpointLabel.setPreferredSize(new Dimension(90, 16));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.LeftLegCriticalPanel.add(this.LeftLegEnergyHardpointLabel, gridBagConstraints);
        this.LeftLegMissileHardpointLabel.setBackground(User.preferences.MISSILE_COLOR);
        this.LeftLegMissileHardpointLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.LeftLegMissileHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        this.LeftLegMissileHardpointLabel.setMaximumSize(new Dimension(90, 16));
        this.LeftLegMissileHardpointLabel.setMinimumSize(new Dimension(90, 16));
        this.LeftLegMissileHardpointLabel.setOpaque(true);
        this.LeftLegMissileHardpointLabel.setPreferredSize(new Dimension(90, 16));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.LeftLegCriticalPanel.add(this.LeftLegMissileHardpointLabel, gridBagConstraints);
        this.LeftLegAMSHardpointLabel.setBackground(User.preferences.AMS_COLOR);
        this.LeftLegAMSHardpointLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.LeftLegAMSHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        this.LeftLegAMSHardpointLabel.setMaximumSize(new Dimension(96, 12));
        this.LeftLegAMSHardpointLabel.setMinimumSize(new Dimension(96, 12));
        this.LeftLegAMSHardpointLabel.setOpaque(true);
        this.LeftLegAMSHardpointLabel.setPreferredSize(new Dimension(96, 12));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.LeftLegCriticalPanel.add(this.LeftLegAMSHardpointLabel, gridBagConstraints);
        this.LeftLegECMHardpointLabel.setBackground(User.preferences.ECM_COLOR);
        this.LeftLegECMHardpointLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.LeftLegECMHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        this.LeftLegECMHardpointLabel.setMaximumSize(new Dimension(96, 12));
        this.LeftLegECMHardpointLabel.setMinimumSize(new Dimension(96, 12));
        this.LeftLegECMHardpointLabel.setOpaque(true);
        this.LeftLegECMHardpointLabel.setPreferredSize(new Dimension(96, 12));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.LeftLegCriticalPanel.add(this.LeftLegECMHardpointLabel, gridBagConstraints);
        this.LeftLegCriticalList.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.LeftLegCriticalList.setModel(new AbstractListModel() {
            String[] strings;

            @Override
            public int getSize() {
                return this.strings.length;
            }

            @Override
            public Object getElementAt(int n) {
                return this.strings[n];
            }
        });
        this.LeftLegCriticalList.setSelectionMode(0);
        this.LeftLegCriticalList.setDragEnabled(true);
        this.LeftLegCriticalList.setDropMode(DropMode.ON);
        this.LeftLegCriticalList.setMaximumSize(new Dimension(90, 144));
        this.LeftLegCriticalList.setMinimumSize(new Dimension(90, 144));
        this.LeftLegCriticalList.setOpaque(false);
        this.LeftLegCriticalList.setPreferredSize(new Dimension(90, 144));
        this.LeftLegCriticalList.setVisibleRowCount(12);
        this.LeftLegCriticalList.addFocusListener(new FocusAdapter() {

            @Override
            public void focusGained(FocusEvent focusEvent) {
                MechlabForm.this.LeftLegCriticalListFocusGained(focusEvent);
            }
        });
        this.LeftLegCriticalList.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                MechlabForm.this.LeftLegCriticalListMouseClicked(mouseEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.LeftLegCriticalPanel.add(this.LeftLegCriticalList, gridBagConstraints);
        this.LeftLegArmorProgressBar.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.LeftLegArmorProgressBar.setForeground(User.preferences.ARMOR_COLOR);
        this.LeftLegArmorProgressBar.setMaximumSize(new Dimension(80, 20));
        this.LeftLegArmorProgressBar.setMinimumSize(new Dimension(80, 20));
        this.LeftLegArmorProgressBar.setPreferredSize(new Dimension(80, 20));
        this.LeftLegArmorProgressBar.setString("0");
        this.LeftLegArmorProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.LeftLegCriticalPanel.add(this.LeftLegArmorProgressBar, gridBagConstraints);
        this.LeftLegStructureProgressBar.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.LeftLegStructureProgressBar.setForeground(User.preferences.STRUCTURE_COLOR);
        this.LeftLegStructureProgressBar.setValue(100);
        this.LeftLegStructureProgressBar.setMaximumSize(new Dimension(80, 20));
        this.LeftLegStructureProgressBar.setMinimumSize(new Dimension(80, 20));
        this.LeftLegStructureProgressBar.setPreferredSize(new Dimension(80, 20));
        this.LeftLegStructureProgressBar.setString("0");
        this.LeftLegStructureProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.LeftLegCriticalPanel.add(this.LeftLegStructureProgressBar, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.OverviewPanel.add(this.LeftLegCriticalPanel, gridBagConstraints);
        this.HeadCriticalPanel.setBorder(BorderFactory.createTitledBorder(null, "Head", 2, 2, User.preferences.DEFAULT_FONT_SIZE_12));
        this.HeadCriticalPanel.setMaximumSize(new Dimension(100, 180));
        this.HeadCriticalPanel.setMinimumSize(new Dimension(100, 120));
        this.HeadCriticalPanel.setOpaque(false);
        this.HeadCriticalPanel.setPreferredSize(new Dimension(100, 120));
        this.HeadCriticalPanel.setLayout(new GridBagLayout());
        this.HeadPodComboBox.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.HeadPodComboBox.setMaximumSize(new Dimension(80, 20));
        this.HeadPodComboBox.setMinimumSize(new Dimension(80, 20));
        this.HeadPodComboBox.setPreferredSize(new Dimension(80, 20));
        this.HeadPodComboBox.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MechlabForm.this.HeadPodComboBoxActionPerformed(actionEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.HeadCriticalPanel.add(this.HeadPodComboBox, gridBagConstraints);
        this.HeadBallisticHardpointLabel.setBackground(User.preferences.BALLISTIC_COLOR);
        this.HeadBallisticHardpointLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.HeadBallisticHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        this.HeadBallisticHardpointLabel.setMaximumSize(new Dimension(90, 16));
        this.HeadBallisticHardpointLabel.setMinimumSize(new Dimension(90, 16));
        this.HeadBallisticHardpointLabel.setOpaque(true);
        this.HeadBallisticHardpointLabel.setPreferredSize(new Dimension(90, 16));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.HeadCriticalPanel.add(this.HeadBallisticHardpointLabel, gridBagConstraints);
        this.HeadEnergyHardpointLabel.setBackground(User.preferences.ENERGY_COLOR);
        this.HeadEnergyHardpointLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.HeadEnergyHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        this.HeadEnergyHardpointLabel.setMaximumSize(new Dimension(90, 16));
        this.HeadEnergyHardpointLabel.setMinimumSize(new Dimension(90, 16));
        this.HeadEnergyHardpointLabel.setOpaque(true);
        this.HeadEnergyHardpointLabel.setPreferredSize(new Dimension(90, 16));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.HeadCriticalPanel.add(this.HeadEnergyHardpointLabel, gridBagConstraints);
        this.HeadMissileHardpointLabel.setBackground(User.preferences.MISSILE_COLOR);
        this.HeadMissileHardpointLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.HeadMissileHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        this.HeadMissileHardpointLabel.setMaximumSize(new Dimension(90, 16));
        this.HeadMissileHardpointLabel.setMinimumSize(new Dimension(90, 16));
        this.HeadMissileHardpointLabel.setOpaque(true);
        this.HeadMissileHardpointLabel.setPreferredSize(new Dimension(90, 16));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.HeadCriticalPanel.add(this.HeadMissileHardpointLabel, gridBagConstraints);
        this.HeadAMSHardpointLabel.setBackground(User.preferences.AMS_COLOR);
        this.HeadAMSHardpointLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.HeadAMSHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        this.HeadAMSHardpointLabel.setMaximumSize(new Dimension(96, 12));
        this.HeadAMSHardpointLabel.setMinimumSize(new Dimension(96, 12));
        this.HeadAMSHardpointLabel.setOpaque(true);
        this.HeadAMSHardpointLabel.setPreferredSize(new Dimension(96, 12));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.HeadCriticalPanel.add(this.HeadAMSHardpointLabel, gridBagConstraints);
        this.HeadECMHardpointLabel.setBackground(User.preferences.ECM_COLOR);
        this.HeadECMHardpointLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.HeadECMHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        this.HeadECMHardpointLabel.setMaximumSize(new Dimension(96, 12));
        this.HeadECMHardpointLabel.setMinimumSize(new Dimension(96, 12));
        this.HeadECMHardpointLabel.setOpaque(true);
        this.HeadECMHardpointLabel.setPreferredSize(new Dimension(96, 12));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.HeadCriticalPanel.add(this.HeadECMHardpointLabel, gridBagConstraints);
        this.HeadCriticalList.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.HeadCriticalList.setModel(new AbstractListModel() {
            String[] strings;

            @Override
            public int getSize() {
                return this.strings.length;
            }

            @Override
            public Object getElementAt(int n) {
                return this.strings[n];
            }
        });
        this.HeadCriticalList.setSelectionMode(0);
        this.HeadCriticalList.setDragEnabled(true);
        this.HeadCriticalList.setDropMode(DropMode.ON);
        this.HeadCriticalList.setMaximumSize(new Dimension(90, 144));
        this.HeadCriticalList.setMinimumSize(new Dimension(90, 144));
        this.HeadCriticalList.setOpaque(false);
        this.HeadCriticalList.setPreferredSize(new Dimension(90, 144));
        this.HeadCriticalList.setVisibleRowCount(12);
        this.HeadCriticalList.addFocusListener(new FocusAdapter() {

            @Override
            public void focusGained(FocusEvent focusEvent) {
                MechlabForm.this.HeadCriticalListFocusGained(focusEvent);
            }
        });
        this.HeadCriticalList.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                MechlabForm.this.HeadCriticalListMouseClicked(mouseEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.HeadCriticalPanel.add(this.HeadCriticalList, gridBagConstraints);
        this.HeadArmorProgressBar.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.HeadArmorProgressBar.setForeground(User.preferences.ARMOR_COLOR);
        this.HeadArmorProgressBar.setMaximumSize(new Dimension(80, 20));
        this.HeadArmorProgressBar.setMinimumSize(new Dimension(80, 20));
        this.HeadArmorProgressBar.setPreferredSize(new Dimension(80, 20));
        this.HeadArmorProgressBar.setString("0");
        this.HeadArmorProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.HeadCriticalPanel.add(this.HeadArmorProgressBar, gridBagConstraints);
        this.HeadStructureProgressBar.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.HeadStructureProgressBar.setForeground(User.preferences.STRUCTURE_COLOR);
        this.HeadStructureProgressBar.setValue(100);
        this.HeadStructureProgressBar.setMaximumSize(new Dimension(80, 20));
        this.HeadStructureProgressBar.setMinimumSize(new Dimension(80, 20));
        this.HeadStructureProgressBar.setPreferredSize(new Dimension(80, 20));
        this.HeadStructureProgressBar.setString("0");
        this.HeadStructureProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.HeadCriticalPanel.add(this.HeadStructureProgressBar, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.OverviewPanel.add(this.HeadCriticalPanel, gridBagConstraints);
        this.RightTorsoCriticalPanel.setBorder(BorderFactory.createTitledBorder(null, "Right Torso", 2, 2, User.preferences.DEFAULT_FONT_SIZE_12));
        this.RightTorsoCriticalPanel.setMaximumSize(new Dimension(100, 360));
        this.RightTorsoCriticalPanel.setMinimumSize(new Dimension(100, 240));
        this.RightTorsoCriticalPanel.setOpaque(false);
        this.RightTorsoCriticalPanel.setPreferredSize(new Dimension(100, 240));
        this.RightTorsoCriticalPanel.setLayout(new GridBagLayout());
        this.RightTorsoPodComboBox.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.RightTorsoPodComboBox.setMaximumSize(new Dimension(80, 20));
        this.RightTorsoPodComboBox.setMinimumSize(new Dimension(80, 20));
        this.RightTorsoPodComboBox.setPreferredSize(new Dimension(80, 20));
        this.RightTorsoPodComboBox.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MechlabForm.this.RightTorsoPodComboBoxActionPerformed(actionEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.RightTorsoCriticalPanel.add(this.RightTorsoPodComboBox, gridBagConstraints);
        this.RightTorsoBallisticHardpointLabel.setBackground(User.preferences.BALLISTIC_COLOR);
        this.RightTorsoBallisticHardpointLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.RightTorsoBallisticHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        this.RightTorsoBallisticHardpointLabel.setMaximumSize(new Dimension(90, 16));
        this.RightTorsoBallisticHardpointLabel.setMinimumSize(new Dimension(90, 16));
        this.RightTorsoBallisticHardpointLabel.setOpaque(true);
        this.RightTorsoBallisticHardpointLabel.setPreferredSize(new Dimension(90, 16));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.RightTorsoCriticalPanel.add(this.RightTorsoBallisticHardpointLabel, gridBagConstraints);
        this.RightTorsoEnergyHardpointLabel.setBackground(User.preferences.ENERGY_COLOR);
        this.RightTorsoEnergyHardpointLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.RightTorsoEnergyHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        this.RightTorsoEnergyHardpointLabel.setMaximumSize(new Dimension(90, 16));
        this.RightTorsoEnergyHardpointLabel.setMinimumSize(new Dimension(90, 16));
        this.RightTorsoEnergyHardpointLabel.setOpaque(true);
        this.RightTorsoEnergyHardpointLabel.setPreferredSize(new Dimension(90, 16));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.RightTorsoCriticalPanel.add(this.RightTorsoEnergyHardpointLabel, gridBagConstraints);
        this.RightTorsoMissileHardpointLabel.setBackground(User.preferences.MISSILE_COLOR);
        this.RightTorsoMissileHardpointLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.RightTorsoMissileHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        this.RightTorsoMissileHardpointLabel.setMaximumSize(new Dimension(90, 16));
        this.RightTorsoMissileHardpointLabel.setMinimumSize(new Dimension(90, 16));
        this.RightTorsoMissileHardpointLabel.setOpaque(true);
        this.RightTorsoMissileHardpointLabel.setPreferredSize(new Dimension(90, 16));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.RightTorsoCriticalPanel.add(this.RightTorsoMissileHardpointLabel, gridBagConstraints);
        this.RightTorsoAMSHardpointLabel.setBackground(User.preferences.AMS_COLOR);
        this.RightTorsoAMSHardpointLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.RightTorsoAMSHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        this.RightTorsoAMSHardpointLabel.setMaximumSize(new Dimension(96, 12));
        this.RightTorsoAMSHardpointLabel.setMinimumSize(new Dimension(96, 12));
        this.RightTorsoAMSHardpointLabel.setOpaque(true);
        this.RightTorsoAMSHardpointLabel.setPreferredSize(new Dimension(96, 12));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.RightTorsoCriticalPanel.add(this.RightTorsoAMSHardpointLabel, gridBagConstraints);
        this.RightTorsoECMHardpointLabel.setBackground(User.preferences.ECM_COLOR);
        this.RightTorsoECMHardpointLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.RightTorsoECMHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        this.RightTorsoECMHardpointLabel.setMaximumSize(new Dimension(96, 12));
        this.RightTorsoECMHardpointLabel.setMinimumSize(new Dimension(96, 12));
        this.RightTorsoECMHardpointLabel.setOpaque(true);
        this.RightTorsoECMHardpointLabel.setPreferredSize(new Dimension(96, 12));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.RightTorsoCriticalPanel.add(this.RightTorsoECMHardpointLabel, gridBagConstraints);
        this.RightTorsoCriticalList.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.RightTorsoCriticalList.setModel(new AbstractListModel() {
            String[] strings;

            @Override
            public int getSize() {
                return this.strings.length;
            }

            @Override
            public Object getElementAt(int n) {
                return this.strings[n];
            }
        });
        this.RightTorsoCriticalList.setSelectionMode(0);
        this.RightTorsoCriticalList.setDragEnabled(true);
        this.RightTorsoCriticalList.setDropMode(DropMode.ON);
        this.RightTorsoCriticalList.setMaximumSize(new Dimension(90, 144));
        this.RightTorsoCriticalList.setMinimumSize(new Dimension(90, 144));
        this.RightTorsoCriticalList.setOpaque(false);
        this.RightTorsoCriticalList.setPreferredSize(new Dimension(90, 144));
        this.RightTorsoCriticalList.setVisibleRowCount(12);
        this.RightTorsoCriticalList.addFocusListener(new FocusAdapter() {

            @Override
            public void focusGained(FocusEvent focusEvent) {
                MechlabForm.this.RightTorsoCriticalListFocusGained(focusEvent);
            }
        });
        this.RightTorsoCriticalList.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                MechlabForm.this.RightTorsoCriticalListMouseClicked(mouseEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.RightTorsoCriticalPanel.add(this.RightTorsoCriticalList, gridBagConstraints);
        this.RightTorsoCASEToggleButton.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.RightTorsoCASEToggleButton.setText("CASE");
        this.RightTorsoCASEToggleButton.setMargin(new Insets(0, 0, 0, 0));
        this.RightTorsoCASEToggleButton.setMaximumSize(new Dimension(96, 16));
        this.RightTorsoCASEToggleButton.setMinimumSize(new Dimension(96, 16));
        this.RightTorsoCASEToggleButton.setPreferredSize(new Dimension(96, 16));
        this.RightTorsoCASEToggleButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MechlabForm.this.RightTorsoCASEToggleButtonActionPerformed(actionEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.RightTorsoCriticalPanel.add(this.RightTorsoCASEToggleButton, gridBagConstraints);
        this.RightTorsoFrontArmorPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Front", 2, 2, new Font("Moire", 0, 10)));
        this.RightTorsoFrontArmorPanel.setFont(User.preferences.DEFAULT_FONT_SIZE_16);
        this.RightTorsoFrontArmorPanel.setLayout(new GridBagLayout());
        this.RightTorsoFrontArmorProgressBar.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.RightTorsoFrontArmorProgressBar.setForeground(User.preferences.ARMOR_COLOR);
        this.RightTorsoFrontArmorProgressBar.setAlignmentX(0.0f);
        this.RightTorsoFrontArmorProgressBar.setAlignmentY(0.0f);
        this.RightTorsoFrontArmorProgressBar.setMaximumSize(new Dimension(80, 20));
        this.RightTorsoFrontArmorProgressBar.setMinimumSize(new Dimension(80, 20));
        this.RightTorsoFrontArmorProgressBar.setPreferredSize(new Dimension(80, 20));
        this.RightTorsoFrontArmorProgressBar.setString("0");
        this.RightTorsoFrontArmorProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.RightTorsoFrontArmorPanel.add(this.RightTorsoFrontArmorProgressBar, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.RightTorsoCriticalPanel.add(this.RightTorsoFrontArmorPanel, gridBagConstraints);
        this.RightTorsoStructureProgressBar.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.RightTorsoStructureProgressBar.setForeground(User.preferences.STRUCTURE_COLOR);
        this.RightTorsoStructureProgressBar.setValue(100);
        this.RightTorsoStructureProgressBar.setMaximumSize(new Dimension(80, 20));
        this.RightTorsoStructureProgressBar.setMinimumSize(new Dimension(80, 20));
        this.RightTorsoStructureProgressBar.setPreferredSize(new Dimension(80, 20));
        this.RightTorsoStructureProgressBar.setString("0");
        this.RightTorsoStructureProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.RightTorsoCriticalPanel.add(this.RightTorsoStructureProgressBar, gridBagConstraints);
        this.RightTorsoRearArmorPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Rear", 2, 2, new Font("Moire", 0, 10)));
        this.RightTorsoRearArmorPanel.setFont(User.preferences.DEFAULT_FONT_SIZE_16);
        this.RightTorsoRearArmorPanel.setLayout(new GridBagLayout());
        this.RightTorsoRearArmorProgressBar.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.RightTorsoRearArmorProgressBar.setForeground(User.preferences.ARMOR_COLOR);
        this.RightTorsoRearArmorProgressBar.setAlignmentX(0.0f);
        this.RightTorsoRearArmorProgressBar.setAlignmentY(0.0f);
        this.RightTorsoRearArmorProgressBar.setMaximumSize(new Dimension(80, 20));
        this.RightTorsoRearArmorProgressBar.setMinimumSize(new Dimension(80, 20));
        this.RightTorsoRearArmorProgressBar.setPreferredSize(new Dimension(80, 20));
        this.RightTorsoRearArmorProgressBar.setString("0");
        this.RightTorsoRearArmorProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.RightTorsoRearArmorPanel.add(this.RightTorsoRearArmorProgressBar, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.RightTorsoCriticalPanel.add(this.RightTorsoRearArmorPanel, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.OverviewPanel.add(this.RightTorsoCriticalPanel, gridBagConstraints);
        this.LeftTorsoCriticalPanel.setBorder(BorderFactory.createTitledBorder(null, "Left Torso", 2, 2, User.preferences.DEFAULT_FONT_SIZE_12));
        this.LeftTorsoCriticalPanel.setMaximumSize(new Dimension(100, 360));
        this.LeftTorsoCriticalPanel.setMinimumSize(new Dimension(100, 240));
        this.LeftTorsoCriticalPanel.setOpaque(false);
        this.LeftTorsoCriticalPanel.setPreferredSize(new Dimension(100, 240));
        this.LeftTorsoCriticalPanel.setLayout(new GridBagLayout());
        this.LeftTorsoPodComboBox.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.LeftTorsoPodComboBox.setMaximumSize(new Dimension(80, 20));
        this.LeftTorsoPodComboBox.setMinimumSize(new Dimension(80, 20));
        this.LeftTorsoPodComboBox.setPreferredSize(new Dimension(80, 20));
        this.LeftTorsoPodComboBox.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MechlabForm.this.LeftTorsoPodComboBoxActionPerformed(actionEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.LeftTorsoCriticalPanel.add(this.LeftTorsoPodComboBox, gridBagConstraints);
        this.LeftTorsoBallisticHardpointLabel.setBackground(User.preferences.BALLISTIC_COLOR);
        this.LeftTorsoBallisticHardpointLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.LeftTorsoBallisticHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        this.LeftTorsoBallisticHardpointLabel.setMaximumSize(new Dimension(90, 16));
        this.LeftTorsoBallisticHardpointLabel.setMinimumSize(new Dimension(90, 16));
        this.LeftTorsoBallisticHardpointLabel.setOpaque(true);
        this.LeftTorsoBallisticHardpointLabel.setPreferredSize(new Dimension(90, 16));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.LeftTorsoCriticalPanel.add(this.LeftTorsoBallisticHardpointLabel, gridBagConstraints);
        this.LeftTorsoEnergyHardpointLabel.setBackground(User.preferences.ENERGY_COLOR);
        this.LeftTorsoEnergyHardpointLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.LeftTorsoEnergyHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        this.LeftTorsoEnergyHardpointLabel.setMaximumSize(new Dimension(90, 16));
        this.LeftTorsoEnergyHardpointLabel.setMinimumSize(new Dimension(90, 16));
        this.LeftTorsoEnergyHardpointLabel.setOpaque(true);
        this.LeftTorsoEnergyHardpointLabel.setPreferredSize(new Dimension(90, 16));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.LeftTorsoCriticalPanel.add(this.LeftTorsoEnergyHardpointLabel, gridBagConstraints);
        this.LeftTorsoMissileHardpointLabel.setBackground(User.preferences.MISSILE_COLOR);
        this.LeftTorsoMissileHardpointLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.LeftTorsoMissileHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        this.LeftTorsoMissileHardpointLabel.setMaximumSize(new Dimension(90, 16));
        this.LeftTorsoMissileHardpointLabel.setMinimumSize(new Dimension(90, 16));
        this.LeftTorsoMissileHardpointLabel.setOpaque(true);
        this.LeftTorsoMissileHardpointLabel.setPreferredSize(new Dimension(90, 16));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.LeftTorsoCriticalPanel.add(this.LeftTorsoMissileHardpointLabel, gridBagConstraints);
        this.LeftTorsoAMSHardpointLabel.setBackground(User.preferences.AMS_COLOR);
        this.LeftTorsoAMSHardpointLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.LeftTorsoAMSHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        this.LeftTorsoAMSHardpointLabel.setMaximumSize(new Dimension(96, 12));
        this.LeftTorsoAMSHardpointLabel.setMinimumSize(new Dimension(96, 12));
        this.LeftTorsoAMSHardpointLabel.setOpaque(true);
        this.LeftTorsoAMSHardpointLabel.setPreferredSize(new Dimension(96, 12));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.LeftTorsoCriticalPanel.add(this.LeftTorsoAMSHardpointLabel, gridBagConstraints);
        this.LeftTorsoECMHardpointLabel.setBackground(User.preferences.ECM_COLOR);
        this.LeftTorsoECMHardpointLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.LeftTorsoECMHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        this.LeftTorsoECMHardpointLabel.setMaximumSize(new Dimension(96, 12));
        this.LeftTorsoECMHardpointLabel.setMinimumSize(new Dimension(96, 12));
        this.LeftTorsoECMHardpointLabel.setOpaque(true);
        this.LeftTorsoECMHardpointLabel.setPreferredSize(new Dimension(96, 12));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.LeftTorsoCriticalPanel.add(this.LeftTorsoECMHardpointLabel, gridBagConstraints);
        this.LeftTorsoCriticalList.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.LeftTorsoCriticalList.setModel(new AbstractListModel() {
            String[] strings;

            @Override
            public int getSize() {
                return this.strings.length;
            }

            @Override
            public Object getElementAt(int n) {
                return this.strings[n];
            }
        });
        this.LeftTorsoCriticalList.setSelectionMode(0);
        this.LeftTorsoCriticalList.setDragEnabled(true);
        this.LeftTorsoCriticalList.setDropMode(DropMode.ON);
        this.LeftTorsoCriticalList.setMaximumSize(new Dimension(90, 144));
        this.LeftTorsoCriticalList.setMinimumSize(new Dimension(90, 144));
        this.LeftTorsoCriticalList.setOpaque(false);
        this.LeftTorsoCriticalList.setPreferredSize(new Dimension(90, 144));
        this.LeftTorsoCriticalList.setVisibleRowCount(12);
        this.LeftTorsoCriticalList.addFocusListener(new FocusAdapter() {

            @Override
            public void focusGained(FocusEvent focusEvent) {
                MechlabForm.this.LeftTorsoCriticalListFocusGained(focusEvent);
            }
        });
        this.LeftTorsoCriticalList.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                MechlabForm.this.LeftTorsoCriticalListMouseClicked(mouseEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.LeftTorsoCriticalPanel.add(this.LeftTorsoCriticalList, gridBagConstraints);
        this.LeftTorsoCASEToggleButton.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.LeftTorsoCASEToggleButton.setText("CASE");
        this.LeftTorsoCASEToggleButton.setMargin(new Insets(0, 0, 0, 0));
        this.LeftTorsoCASEToggleButton.setMaximumSize(new Dimension(96, 16));
        this.LeftTorsoCASEToggleButton.setMinimumSize(new Dimension(96, 16));
        this.LeftTorsoCASEToggleButton.setPreferredSize(new Dimension(96, 16));
        this.LeftTorsoCASEToggleButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MechlabForm.this.LeftTorsoCASEToggleButtonActionPerformed(actionEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.LeftTorsoCriticalPanel.add(this.LeftTorsoCASEToggleButton, gridBagConstraints);
        this.LeftTorsoFrontArmorPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Front", 2, 2, new Font("Moire", 0, 10)));
        this.LeftTorsoFrontArmorPanel.setFont(User.preferences.DEFAULT_FONT_SIZE_16);
        this.LeftTorsoFrontArmorPanel.setLayout(new GridBagLayout());
        this.LeftTorsoFrontArmorProgressBar.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.LeftTorsoFrontArmorProgressBar.setForeground(User.preferences.ARMOR_COLOR);
        this.LeftTorsoFrontArmorProgressBar.setAlignmentX(0.0f);
        this.LeftTorsoFrontArmorProgressBar.setAlignmentY(0.0f);
        this.LeftTorsoFrontArmorProgressBar.setMaximumSize(new Dimension(80, 20));
        this.LeftTorsoFrontArmorProgressBar.setMinimumSize(new Dimension(80, 20));
        this.LeftTorsoFrontArmorProgressBar.setPreferredSize(new Dimension(80, 20));
        this.LeftTorsoFrontArmorProgressBar.setString("0");
        this.LeftTorsoFrontArmorProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.LeftTorsoFrontArmorPanel.add(this.LeftTorsoFrontArmorProgressBar, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.LeftTorsoCriticalPanel.add(this.LeftTorsoFrontArmorPanel, gridBagConstraints);
        this.LeftTorsoStructureProgressBar.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.LeftTorsoStructureProgressBar.setForeground(User.preferences.STRUCTURE_COLOR);
        this.LeftTorsoStructureProgressBar.setValue(100);
        this.LeftTorsoStructureProgressBar.setMaximumSize(new Dimension(80, 20));
        this.LeftTorsoStructureProgressBar.setMinimumSize(new Dimension(80, 20));
        this.LeftTorsoStructureProgressBar.setPreferredSize(new Dimension(80, 20));
        this.LeftTorsoStructureProgressBar.setString("0");
        this.LeftTorsoStructureProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.LeftTorsoCriticalPanel.add(this.LeftTorsoStructureProgressBar, gridBagConstraints);
        this.LeftTorsoRearArmorPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Rear", 2, 2, new Font("Moire", 0, 10)));
        this.LeftTorsoRearArmorPanel.setFont(User.preferences.DEFAULT_FONT_SIZE_16);
        this.LeftTorsoRearArmorPanel.setLayout(new GridBagLayout());
        this.LeftTorsoRearArmorProgressBar.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.LeftTorsoRearArmorProgressBar.setForeground(User.preferences.ARMOR_COLOR);
        this.LeftTorsoRearArmorProgressBar.setAlignmentX(0.0f);
        this.LeftTorsoRearArmorProgressBar.setAlignmentY(0.0f);
        this.LeftTorsoRearArmorProgressBar.setMaximumSize(new Dimension(80, 20));
        this.LeftTorsoRearArmorProgressBar.setMinimumSize(new Dimension(80, 20));
        this.LeftTorsoRearArmorProgressBar.setPreferredSize(new Dimension(80, 20));
        this.LeftTorsoRearArmorProgressBar.setString("0");
        this.LeftTorsoRearArmorProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.LeftTorsoRearArmorPanel.add(this.LeftTorsoRearArmorProgressBar, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.LeftTorsoCriticalPanel.add(this.LeftTorsoRearArmorPanel, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.OverviewPanel.add(this.LeftTorsoCriticalPanel, gridBagConstraints);
        this.CenterTorsoCriticalPanel.setBorder(BorderFactory.createTitledBorder(null, "Center Torso", 2, 2, User.preferences.DEFAULT_FONT_SIZE_12));
        this.CenterTorsoCriticalPanel.setMaximumSize(new Dimension(100, 360));
        this.CenterTorsoCriticalPanel.setMinimumSize(new Dimension(100, 240));
        this.CenterTorsoCriticalPanel.setOpaque(false);
        this.CenterTorsoCriticalPanel.setPreferredSize(new Dimension(100, 240));
        this.CenterTorsoCriticalPanel.setLayout(new GridBagLayout());
        this.CenterTorsoPodComboBox.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.CenterTorsoPodComboBox.setMaximumSize(new Dimension(80, 20));
        this.CenterTorsoPodComboBox.setMinimumSize(new Dimension(80, 20));
        this.CenterTorsoPodComboBox.setPreferredSize(new Dimension(80, 20));
        this.CenterTorsoPodComboBox.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MechlabForm.this.CenterTorsoPodComboBoxActionPerformed(actionEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.CenterTorsoCriticalPanel.add(this.CenterTorsoPodComboBox, gridBagConstraints);
        this.CenterTorsoBallisticHardpointLabel.setBackground(User.preferences.BALLISTIC_COLOR);
        this.CenterTorsoBallisticHardpointLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.CenterTorsoBallisticHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        this.CenterTorsoBallisticHardpointLabel.setMaximumSize(new Dimension(90, 16));
        this.CenterTorsoBallisticHardpointLabel.setMinimumSize(new Dimension(90, 16));
        this.CenterTorsoBallisticHardpointLabel.setOpaque(true);
        this.CenterTorsoBallisticHardpointLabel.setPreferredSize(new Dimension(90, 16));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.CenterTorsoCriticalPanel.add(this.CenterTorsoBallisticHardpointLabel, gridBagConstraints);
        this.CenterTorsoEnergyHardpointLabel.setBackground(User.preferences.ENERGY_COLOR);
        this.CenterTorsoEnergyHardpointLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.CenterTorsoEnergyHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        this.CenterTorsoEnergyHardpointLabel.setMaximumSize(new Dimension(90, 16));
        this.CenterTorsoEnergyHardpointLabel.setMinimumSize(new Dimension(90, 16));
        this.CenterTorsoEnergyHardpointLabel.setOpaque(true);
        this.CenterTorsoEnergyHardpointLabel.setPreferredSize(new Dimension(90, 16));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.CenterTorsoCriticalPanel.add(this.CenterTorsoEnergyHardpointLabel, gridBagConstraints);
        this.CenterTorsoMissileHardpointLabel.setBackground(User.preferences.MISSILE_COLOR);
        this.CenterTorsoMissileHardpointLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.CenterTorsoMissileHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        this.CenterTorsoMissileHardpointLabel.setMaximumSize(new Dimension(90, 16));
        this.CenterTorsoMissileHardpointLabel.setMinimumSize(new Dimension(90, 16));
        this.CenterTorsoMissileHardpointLabel.setOpaque(true);
        this.CenterTorsoMissileHardpointLabel.setPreferredSize(new Dimension(90, 16));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.CenterTorsoCriticalPanel.add(this.CenterTorsoMissileHardpointLabel, gridBagConstraints);
        this.CenterTorsoAMSHardpointLabel.setBackground(User.preferences.AMS_COLOR);
        this.CenterTorsoAMSHardpointLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.CenterTorsoAMSHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        this.CenterTorsoAMSHardpointLabel.setMaximumSize(new Dimension(96, 12));
        this.CenterTorsoAMSHardpointLabel.setMinimumSize(new Dimension(96, 12));
        this.CenterTorsoAMSHardpointLabel.setOpaque(true);
        this.CenterTorsoAMSHardpointLabel.setPreferredSize(new Dimension(96, 12));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.CenterTorsoCriticalPanel.add(this.CenterTorsoAMSHardpointLabel, gridBagConstraints);
        this.CenterTorsoECMHardpointLabel.setBackground(User.preferences.ECM_COLOR);
        this.CenterTorsoECMHardpointLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.CenterTorsoECMHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        this.CenterTorsoECMHardpointLabel.setMaximumSize(new Dimension(96, 12));
        this.CenterTorsoECMHardpointLabel.setMinimumSize(new Dimension(96, 12));
        this.CenterTorsoECMHardpointLabel.setOpaque(true);
        this.CenterTorsoECMHardpointLabel.setPreferredSize(new Dimension(96, 12));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.CenterTorsoCriticalPanel.add(this.CenterTorsoECMHardpointLabel, gridBagConstraints);
        this.CenterTorsoCriticalList.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.CenterTorsoCriticalList.setModel(new AbstractListModel() {
            String[] strings;

            @Override
            public int getSize() {
                return this.strings.length;
            }

            @Override
            public Object getElementAt(int n) {
                return this.strings[n];
            }
        });
        this.CenterTorsoCriticalList.setSelectionMode(0);
        this.CenterTorsoCriticalList.setDragEnabled(true);
        this.CenterTorsoCriticalList.setDropMode(DropMode.ON);
        this.CenterTorsoCriticalList.setMaximumSize(new Dimension(90, 144));
        this.CenterTorsoCriticalList.setMinimumSize(new Dimension(90, 144));
        this.CenterTorsoCriticalList.setOpaque(false);
        this.CenterTorsoCriticalList.setPreferredSize(new Dimension(90, 144));
        this.CenterTorsoCriticalList.setVisibleRowCount(12);
        this.CenterTorsoCriticalList.addFocusListener(new FocusAdapter() {

            @Override
            public void focusGained(FocusEvent focusEvent) {
                MechlabForm.this.CenterTorsoCriticalListFocusGained(focusEvent);
            }
        });
        this.CenterTorsoCriticalList.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                MechlabForm.this.CenterTorsoCriticalListMouseClicked(mouseEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.CenterTorsoCriticalPanel.add(this.CenterTorsoCriticalList, gridBagConstraints);
        this.CenterTorsoFrontArmorPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Front", 2, 2, new Font("Moire", 0, 10)));
        this.CenterTorsoFrontArmorPanel.setFont(User.preferences.DEFAULT_FONT_SIZE_16);
        this.CenterTorsoFrontArmorPanel.setLayout(new GridBagLayout());
        this.CenterTorsoFrontArmorProgressBar.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.CenterTorsoFrontArmorProgressBar.setForeground(User.preferences.ARMOR_COLOR);
        this.CenterTorsoFrontArmorProgressBar.setAlignmentX(0.0f);
        this.CenterTorsoFrontArmorProgressBar.setAlignmentY(0.0f);
        this.CenterTorsoFrontArmorProgressBar.setMaximumSize(new Dimension(80, 20));
        this.CenterTorsoFrontArmorProgressBar.setMinimumSize(new Dimension(80, 20));
        this.CenterTorsoFrontArmorProgressBar.setPreferredSize(new Dimension(80, 20));
        this.CenterTorsoFrontArmorProgressBar.setString("0");
        this.CenterTorsoFrontArmorProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.CenterTorsoFrontArmorPanel.add(this.CenterTorsoFrontArmorProgressBar, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.CenterTorsoCriticalPanel.add(this.CenterTorsoFrontArmorPanel, gridBagConstraints);
        this.CenterTorsoStructureProgressBar.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.CenterTorsoStructureProgressBar.setForeground(User.preferences.STRUCTURE_COLOR);
        this.CenterTorsoStructureProgressBar.setValue(100);
        this.CenterTorsoStructureProgressBar.setMaximumSize(new Dimension(80, 20));
        this.CenterTorsoStructureProgressBar.setMinimumSize(new Dimension(80, 20));
        this.CenterTorsoStructureProgressBar.setPreferredSize(new Dimension(80, 20));
        this.CenterTorsoStructureProgressBar.setString("0");
        this.CenterTorsoStructureProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.CenterTorsoCriticalPanel.add(this.CenterTorsoStructureProgressBar, gridBagConstraints);
        this.CenterTorsoRearArmorPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Rear", 2, 2, new Font("Moire", 0, 10)));
        this.CenterTorsoRearArmorPanel.setFont(User.preferences.DEFAULT_FONT_SIZE_16);
        this.CenterTorsoRearArmorPanel.setLayout(new GridBagLayout());
        this.CenterTorsoRearArmorProgressBar.setFont(User.preferences.DEFAULT_FONT_SIZE_8);
        this.CenterTorsoRearArmorProgressBar.setForeground(User.preferences.ARMOR_COLOR);
        this.CenterTorsoRearArmorProgressBar.setAlignmentX(0.0f);
        this.CenterTorsoRearArmorProgressBar.setAlignmentY(0.0f);
        this.CenterTorsoRearArmorProgressBar.setMaximumSize(new Dimension(80, 20));
        this.CenterTorsoRearArmorProgressBar.setMinimumSize(new Dimension(80, 20));
        this.CenterTorsoRearArmorProgressBar.setPreferredSize(new Dimension(80, 20));
        this.CenterTorsoRearArmorProgressBar.setString("0");
        this.CenterTorsoRearArmorProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.CenterTorsoRearArmorPanel.add(this.CenterTorsoRearArmorProgressBar, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.CenterTorsoCriticalPanel.add(this.CenterTorsoRearArmorPanel, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.OverviewPanel.add(this.CenterTorsoCriticalPanel, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = 1;
        this.MechDisplayPanel.add(this.OverviewPanel, gridBagConstraints);
        this.InfoPanel.setAlignmentX(0.0f);
        this.InfoPanel.setAlignmentY(0.0f);
        this.InfoPanel.setFont(User.preferences.DEFAULT_FONT_SIZE_16);
        this.InfoPanel.setMaximumSize(new Dimension(150, 540));
        this.InfoPanel.setMinimumSize(new Dimension(150, 540));
        this.InfoPanel.setPreferredSize(new Dimension(150, 540));
        this.InfoPanel.setLayout(new GridBagLayout());
        this.currentTonnageLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.currentTonnageLabel.setText("Tonnage");
        this.currentTonnageLabel.setAlignmentY(0.0f);
        this.currentTonnageLabel.setMaximumSize(new Dimension(120, 20));
        this.currentTonnageLabel.setMinimumSize(new Dimension(120, 20));
        this.currentTonnageLabel.setPreferredSize(new Dimension(120, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.InfoPanel.add(this.currentTonnageLabel, gridBagConstraints);
        this.tonnageProgressBar.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.tonnageProgressBar.setForeground(User.preferences.DEFAULT_INFO_BAR_COLOR);
        this.tonnageProgressBar.setAlignmentX(0.0f);
        this.tonnageProgressBar.setAlignmentY(0.0f);
        this.tonnageProgressBar.setMaximumSize(new Dimension(120, 20));
        this.tonnageProgressBar.setMinimumSize(new Dimension(120, 20));
        this.tonnageProgressBar.setPreferredSize(new Dimension(120, 20));
        this.tonnageProgressBar.setString("0.0");
        this.tonnageProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.InfoPanel.add(this.tonnageProgressBar, gridBagConstraints);
        this.ModelSpeedLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.ModelSpeedLabel.setText("Speed");
        this.ModelSpeedLabel.setAlignmentY(0.0f);
        this.ModelSpeedLabel.setMaximumSize(new Dimension(120, 20));
        this.ModelSpeedLabel.setMinimumSize(new Dimension(120, 20));
        this.ModelSpeedLabel.setPreferredSize(new Dimension(120, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.InfoPanel.add(this.ModelSpeedLabel, gridBagConstraints);
        this.ModelSpeedProgressBar.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.ModelSpeedProgressBar.setForeground(User.preferences.DEFAULT_INFO_BAR_COLOR);
        this.ModelSpeedProgressBar.setMaximum(140);
        this.ModelSpeedProgressBar.setMinimum(32);
        this.ModelSpeedProgressBar.setAlignmentX(0.0f);
        this.ModelSpeedProgressBar.setAlignmentY(0.0f);
        this.ModelSpeedProgressBar.setMaximumSize(new Dimension(120, 20));
        this.ModelSpeedProgressBar.setMinimumSize(new Dimension(120, 20));
        this.ModelSpeedProgressBar.setPreferredSize(new Dimension(120, 20));
        this.ModelSpeedProgressBar.setString("0 kph");
        this.ModelSpeedProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.InfoPanel.add(this.ModelSpeedProgressBar, gridBagConstraints);
        this.JumpHeightLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.JumpHeightLabel.setText("Jump Height");
        this.JumpHeightLabel.setAlignmentY(0.0f);
        this.JumpHeightLabel.setMaximumSize(new Dimension(120, 20));
        this.JumpHeightLabel.setMinimumSize(new Dimension(120, 20));
        this.JumpHeightLabel.setPreferredSize(new Dimension(120, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.InfoPanel.add(this.JumpHeightLabel, gridBagConstraints);
        this.JumpHeightBar.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.JumpHeightBar.setForeground(User.preferences.DEFAULT_INFO_BAR_COLOR);
        this.JumpHeightBar.setMaximum(8);
        this.JumpHeightBar.setAlignmentX(0.0f);
        this.JumpHeightBar.setAlignmentY(0.0f);
        this.JumpHeightBar.setMaximumSize(new Dimension(120, 20));
        this.JumpHeightBar.setMinimumSize(new Dimension(120, 20));
        this.JumpHeightBar.setPreferredSize(new Dimension(120, 20));
        this.JumpHeightBar.setString("0 m");
        this.JumpHeightBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.InfoPanel.add(this.JumpHeightBar, gridBagConstraints);
        this.JumpDistanceLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.JumpDistanceLabel.setText("Jump Distance");
        this.JumpDistanceLabel.setAlignmentY(0.0f);
        this.JumpDistanceLabel.setMaximumSize(new Dimension(120, 20));
        this.JumpDistanceLabel.setMinimumSize(new Dimension(120, 20));
        this.JumpDistanceLabel.setPreferredSize(new Dimension(120, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.InfoPanel.add(this.JumpDistanceLabel, gridBagConstraints);
        this.JumpDistanceBar.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.JumpDistanceBar.setForeground(User.preferences.DEFAULT_INFO_BAR_COLOR);
        this.JumpDistanceBar.setMaximum(8);
        this.JumpDistanceBar.setAlignmentX(0.0f);
        this.JumpDistanceBar.setAlignmentY(0.0f);
        this.JumpDistanceBar.setMaximumSize(new Dimension(120, 20));
        this.JumpDistanceBar.setMinimumSize(new Dimension(120, 20));
        this.JumpDistanceBar.setPreferredSize(new Dimension(120, 20));
        this.JumpDistanceBar.setString("0 m");
        this.JumpDistanceBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.InfoPanel.add(this.JumpDistanceBar, gridBagConstraints);
        this.CurrentArmorLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.CurrentArmorLabel.setText("Armor");
        this.CurrentArmorLabel.setAlignmentY(0.0f);
        this.CurrentArmorLabel.setMaximumSize(new Dimension(120, 20));
        this.CurrentArmorLabel.setMinimumSize(new Dimension(120, 20));
        this.CurrentArmorLabel.setPreferredSize(new Dimension(120, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.InfoPanel.add(this.CurrentArmorLabel, gridBagConstraints);
        this.CurrentArmorProgressBar.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.CurrentArmorProgressBar.setForeground(User.preferences.DEFAULT_INFO_BAR_COLOR);
        this.CurrentArmorProgressBar.setAlignmentX(0.0f);
        this.CurrentArmorProgressBar.setAlignmentY(0.0f);
        this.CurrentArmorProgressBar.setMaximumSize(new Dimension(120, 20));
        this.CurrentArmorProgressBar.setMinimumSize(new Dimension(120, 20));
        this.CurrentArmorProgressBar.setPreferredSize(new Dimension(120, 20));
        this.CurrentArmorProgressBar.setString("0");
        this.CurrentArmorProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.InfoPanel.add(this.CurrentArmorProgressBar, gridBagConstraints);
        this.alphaStrikeLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.alphaStrikeLabel.setText("Alpha Strike");
        this.alphaStrikeLabel.setAlignmentY(0.0f);
        this.alphaStrikeLabel.setMaximumSize(new Dimension(120, 20));
        this.alphaStrikeLabel.setMinimumSize(new Dimension(120, 20));
        this.alphaStrikeLabel.setPreferredSize(new Dimension(120, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.InfoPanel.add(this.alphaStrikeLabel, gridBagConstraints);
        this.alphaStrikeProgressBar.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.alphaStrikeProgressBar.setForeground(User.preferences.DEFAULT_INFO_BAR_COLOR);
        this.alphaStrikeProgressBar.setMaximum(128);
        this.alphaStrikeProgressBar.setAlignmentX(0.0f);
        this.alphaStrikeProgressBar.setAlignmentY(0.0f);
        this.alphaStrikeProgressBar.setMaximumSize(new Dimension(120, 20));
        this.alphaStrikeProgressBar.setMinimumSize(new Dimension(120, 20));
        this.alphaStrikeProgressBar.setPreferredSize(new Dimension(120, 20));
        this.alphaStrikeProgressBar.setString("0");
        this.alphaStrikeProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.InfoPanel.add(this.alphaStrikeProgressBar, gridBagConstraints);
        this.alphaStrikeHeatLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.alphaStrikeHeatLabel.setText("Alpha Strike Heat");
        this.alphaStrikeHeatLabel.setAlignmentY(0.0f);
        this.alphaStrikeHeatLabel.setMaximumSize(new Dimension(120, 20));
        this.alphaStrikeHeatLabel.setMinimumSize(new Dimension(120, 20));
        this.alphaStrikeHeatLabel.setPreferredSize(new Dimension(120, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.InfoPanel.add(this.alphaStrikeHeatLabel, gridBagConstraints);
        this.alphaStrikeHeatProgressBar.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.alphaStrikeHeatProgressBar.setForeground(User.preferences.DEFAULT_INFO_BAR_COLOR);
        this.alphaStrikeHeatProgressBar.setAlignmentX(0.0f);
        this.alphaStrikeHeatProgressBar.setAlignmentY(0.0f);
        this.alphaStrikeHeatProgressBar.setMaximumSize(new Dimension(120, 20));
        this.alphaStrikeHeatProgressBar.setMinimumSize(new Dimension(120, 20));
        this.alphaStrikeHeatProgressBar.setPreferredSize(new Dimension(120, 20));
        this.alphaStrikeHeatProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.InfoPanel.add(this.alphaStrikeHeatProgressBar, gridBagConstraints);
        this.firepowerLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.firepowerLabel.setText("Firepower");
        this.firepowerLabel.setAlignmentY(0.0f);
        this.firepowerLabel.setMaximumSize(new Dimension(120, 20));
        this.firepowerLabel.setMinimumSize(new Dimension(120, 20));
        this.firepowerLabel.setPreferredSize(new Dimension(120, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.InfoPanel.add(this.firepowerLabel, gridBagConstraints);
        this.firepowerProgressBar.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.firepowerProgressBar.setForeground(User.preferences.DEFAULT_INFO_BAR_COLOR);
        this.firepowerProgressBar.setMaximum(40);
        this.firepowerProgressBar.setAlignmentX(0.0f);
        this.firepowerProgressBar.setAlignmentY(0.0f);
        this.firepowerProgressBar.setMaximumSize(new Dimension(120, 20));
        this.firepowerProgressBar.setMinimumSize(new Dimension(120, 20));
        this.firepowerProgressBar.setPreferredSize(new Dimension(120, 20));
        this.firepowerProgressBar.setString("0 dps");
        this.firepowerProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.InfoPanel.add(this.firepowerProgressBar, gridBagConstraints);
        this.heatEfficiencyLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.heatEfficiencyLabel.setText("Heat Efficiency");
        this.heatEfficiencyLabel.setAlignmentY(0.0f);
        this.heatEfficiencyLabel.setMaximumSize(new Dimension(120, 20));
        this.heatEfficiencyLabel.setMinimumSize(new Dimension(120, 20));
        this.heatEfficiencyLabel.setPreferredSize(new Dimension(120, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.InfoPanel.add(this.heatEfficiencyLabel, gridBagConstraints);
        this.heatEfficiencyProgressBar.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.heatEfficiencyProgressBar.setForeground(User.preferences.DEFAULT_INFO_BAR_COLOR);
        this.heatEfficiencyProgressBar.setValue(100);
        this.heatEfficiencyProgressBar.setAlignmentX(0.0f);
        this.heatEfficiencyProgressBar.setAlignmentY(0.0f);
        this.heatEfficiencyProgressBar.setMaximumSize(new Dimension(120, 20));
        this.heatEfficiencyProgressBar.setMinimumSize(new Dimension(120, 20));
        this.heatEfficiencyProgressBar.setPreferredSize(new Dimension(120, 20));
        this.heatEfficiencyProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.InfoPanel.add(this.heatEfficiencyProgressBar, gridBagConstraints);
        this.rangeLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.rangeLabel.setText("Range");
        this.rangeLabel.setAlignmentY(0.0f);
        this.rangeLabel.setMaximumSize(new Dimension(120, 20));
        this.rangeLabel.setMinimumSize(new Dimension(120, 20));
        this.rangeLabel.setPreferredSize(new Dimension(120, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.InfoPanel.add(this.rangeLabel, gridBagConstraints);
        this.rangeProgressBar.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.rangeProgressBar.setForeground(User.preferences.DEFAULT_INFO_BAR_COLOR);
        this.rangeProgressBar.setMaximum(1000);
        this.rangeProgressBar.setAlignmentX(0.0f);
        this.rangeProgressBar.setAlignmentY(0.0f);
        this.rangeProgressBar.setMaximumSize(new Dimension(120, 20));
        this.rangeProgressBar.setMinimumSize(new Dimension(120, 20));
        this.rangeProgressBar.setPreferredSize(new Dimension(120, 20));
        this.rangeProgressBar.setString("0 m");
        this.rangeProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.InfoPanel.add(this.rangeProgressBar, gridBagConstraints);
        this.criticalsUsedLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.criticalsUsedLabel.setText("Criticals");
        this.criticalsUsedLabel.setAlignmentY(0.0f);
        this.criticalsUsedLabel.setMaximumSize(new Dimension(120, 20));
        this.criticalsUsedLabel.setMinimumSize(new Dimension(120, 20));
        this.criticalsUsedLabel.setPreferredSize(new Dimension(120, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.InfoPanel.add(this.criticalsUsedLabel, gridBagConstraints);
        this.criticalsUsedProgressBar.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.criticalsUsedProgressBar.setForeground(User.preferences.DEFAULT_INFO_BAR_COLOR);
        this.criticalsUsedProgressBar.setMaximum(78);
        this.criticalsUsedProgressBar.setAlignmentX(0.0f);
        this.criticalsUsedProgressBar.setAlignmentY(0.0f);
        this.criticalsUsedProgressBar.setMaximumSize(new Dimension(120, 20));
        this.criticalsUsedProgressBar.setMinimumSize(new Dimension(120, 20));
        this.criticalsUsedProgressBar.setPreferredSize(new Dimension(120, 20));
        this.criticalsUsedProgressBar.setString("0/78");
        this.criticalsUsedProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.InfoPanel.add(this.criticalsUsedProgressBar, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = 1;
        this.MechDisplayPanel.add(this.InfoPanel, gridBagConstraints);
        this.MechImage.setFont(User.preferences.DEFAULT_FONT_SIZE_12);
        this.MechImage.setHorizontalAlignment(0);
        this.MechImage.setAlignmentY(0.0f);
        this.MechImage.setMaximumSize(new Dimension(540, 540));
        this.MechImage.setMinimumSize(new Dimension(540, 540));
        this.MechImage.setPreferredSize(new Dimension(540, 540));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = 1;
        this.MechDisplayPanel.add(this.MechImage, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = 1;
        this.getContentPane().add(this.MechDisplayPanel, gridBagConstraints);
        this.BottomPanel.setAlignmentX(0.0f);
        this.BottomPanel.setAlignmentY(0.0f);
        this.BottomPanel.setFont(User.preferences.DEFAULT_FONT_SIZE_16);
        this.BottomPanel.setMaximumSize(new Dimension(1280, 180));
        this.BottomPanel.setMinimumSize(new Dimension(1280, 180));
        this.BottomPanel.setPreferredSize(new Dimension(1280, 180));
        this.BottomPanel.setLayout(new GridBagLayout());
        this.ToolTipPanel.setAlignmentX(0.0f);
        this.ToolTipPanel.setAlignmentY(0.0f);
        this.ToolTipPanel.setFont(User.preferences.DEFAULT_FONT_SIZE_12);
        this.ToolTipPanel.setMaximumSize(new Dimension(1024, 180));
        this.ToolTipPanel.setMinimumSize(new Dimension(1024, 180));
        this.ToolTipPanel.setOpaque(true);
        this.ToolTipPanel.setPreferredSize(new Dimension(1024, 180));
        this.ChassisOverviewPanel.setFont(User.preferences.DEFAULT_FONT_SIZE_16);
        this.ChassisOverviewPanel.setMaximumSize(new Dimension(880, 80));
        this.ChassisOverviewPanel.setMinimumSize(new Dimension(880, 80));
        this.ChassisOverviewPanel.setPreferredSize(new Dimension(880, 80));
        this.ChassisOverviewPanel.setLayout(new GridBagLayout());
        this.ChassisInfoPanel.setMinimumSize(new Dimension(250, 150));
        this.ChassisInfoPanel.setPreferredSize(new Dimension(250, 150));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.ChassisOverviewPanel.add(this.ChassisInfoPanel, gridBagConstraints);
        this.ModuleOverviewPanel.setMinimumSize(new Dimension(250, 150));
        this.ModuleOverviewPanel.setPreferredSize(new Dimension(250, 150));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.ChassisOverviewPanel.add(this.ModuleOverviewPanel, gridBagConstraints);
        this.TotalHardpointPanel.setMinimumSize(new Dimension(250, 150));
        this.TotalHardpointPanel.setPreferredSize(new Dimension(250, 150));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.ChassisOverviewPanel.add(this.TotalHardpointPanel, gridBagConstraints);
        this.MechDescriptionScrollPane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Description", 4, 2, User.preferences.DEFAULT_FONT_SIZE_12));
        this.MechDescriptionScrollPane.setHorizontalScrollBarPolicy(31);
        this.MechDescriptionScrollPane.setFont(User.preferences.DEFAULT_FONT_SIZE_16);
        this.MechDescriptionScrollPane.setMaximumSize(new Dimension(250, 150));
        this.MechDescriptionScrollPane.setMinimumSize(new Dimension(250, 150));
        this.MechDescriptionScrollPane.setPreferredSize(new Dimension(250, 150));
        this.MechDescriptionTextPane.setEditable(false);
        this.MechDescriptionTextPane.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.MechDescriptionTextPane.setText("This is a test description");
        this.MechDescriptionTextPane.setMinimumSize(new Dimension(123, 21));
        this.MechDescriptionScrollPane.setViewportView(this.MechDescriptionTextPane);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.ChassisOverviewPanel.add(this.MechDescriptionScrollPane, gridBagConstraints);
        this.ToolTipPanel.addTab("Model Overview", this.ChassisOverviewPanel);
        this.ChassisSpecsPanel.setFont(User.preferences.DEFAULT_FONT_SIZE_16);
        this.ChassisSpecsPanel.setLayout(new GridBagLayout());
        this.SpeedLimitPanel.setMinimumSize(new Dimension(250, 150));
        this.SpeedLimitPanel.setPreferredSize(new Dimension(250, 150));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.ChassisSpecsPanel.add(this.SpeedLimitPanel, gridBagConstraints);
        this.ManueverabilityPanel.setMinimumSize(new Dimension(250, 150));
        this.ManueverabilityPanel.setPreferredSize(new Dimension(250, 150));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.ChassisSpecsPanel.add(this.ManueverabilityPanel, gridBagConstraints);
        this.MovementRangePanel.setMinimumSize(new Dimension(250, 150));
        this.MovementRangePanel.setPreferredSize(new Dimension(250, 150));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.ChassisSpecsPanel.add(this.MovementRangePanel, gridBagConstraints);
        this.MovementSpeedPanel.setMinimumSize(new Dimension(250, 150));
        this.MovementSpeedPanel.setPreferredSize(new Dimension(250, 150));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.ChassisSpecsPanel.add(this.MovementSpeedPanel, gridBagConstraints);
        this.ToolTipPanel.addTab("Model Specifications", this.ChassisSpecsPanel);
        this.RadarSpecsPanel.setFont(User.preferences.DEFAULT_FONT_SIZE_16);
        this.RadarSpecsPanel.setLayout(new GridBagLayout());
        this.SensorRangeLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.SensorRangeLabel.setHorizontalAlignment(0);
        this.SensorRangeLabel.setText("N/A");
        this.SensorRangeLabel.setAlignmentY(0.0f);
        this.SensorRangeLabel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Sensor Range", 4, 2, User.preferences.DEFAULT_FONT_SIZE_10));
        this.SensorRangeLabel.setMaximumSize(new Dimension(125, 50));
        this.SensorRangeLabel.setMinimumSize(new Dimension(125, 50));
        this.SensorRangeLabel.setPreferredSize(new Dimension(125, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.RadarSpecsPanel.add(this.SensorRangeLabel, gridBagConstraints);
        this.MaxZoomLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.MaxZoomLabel.setHorizontalAlignment(0);
        this.MaxZoomLabel.setText("N/A");
        this.MaxZoomLabel.setAlignmentY(0.0f);
        this.MaxZoomLabel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Max Zoom Distance", 4, 2, User.preferences.DEFAULT_FONT_SIZE_10));
        this.MaxZoomLabel.setMaximumSize(new Dimension(125, 50));
        this.MaxZoomLabel.setMinimumSize(new Dimension(125, 50));
        this.MaxZoomLabel.setPreferredSize(new Dimension(125, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.RadarSpecsPanel.add(this.MaxZoomLabel, gridBagConstraints);
        this.TargetDecayLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.TargetDecayLabel.setHorizontalAlignment(0);
        this.TargetDecayLabel.setText("N/A");
        this.TargetDecayLabel.setAlignmentY(0.0f);
        this.TargetDecayLabel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Info Decay Rate", 4, 2, User.preferences.DEFAULT_FONT_SIZE_10));
        this.TargetDecayLabel.setMaximumSize(new Dimension(125, 50));
        this.TargetDecayLabel.setMinimumSize(new Dimension(125, 50));
        this.TargetDecayLabel.setPreferredSize(new Dimension(125, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.RadarSpecsPanel.add(this.TargetDecayLabel, gridBagConstraints);
        this.InfoGatherLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.InfoGatherLabel.setHorizontalAlignment(0);
        this.InfoGatherLabel.setText("N/A");
        this.InfoGatherLabel.setAlignmentY(0.0f);
        this.InfoGatherLabel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Info Gather Rate", 4, 2, User.preferences.DEFAULT_FONT_SIZE_10));
        this.InfoGatherLabel.setMaximumSize(new Dimension(125, 50));
        this.InfoGatherLabel.setMinimumSize(new Dimension(125, 50));
        this.InfoGatherLabel.setPreferredSize(new Dimension(125, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.RadarSpecsPanel.add(this.InfoGatherLabel, gridBagConstraints);
        this.CaptureRateLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.CaptureRateLabel.setHorizontalAlignment(0);
        this.CaptureRateLabel.setText("N/A");
        this.CaptureRateLabel.setAlignmentY(0.0f);
        this.CaptureRateLabel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Capture Rate", 4, 2, User.preferences.DEFAULT_FONT_SIZE_10));
        this.CaptureRateLabel.setMaximumSize(new Dimension(125, 50));
        this.CaptureRateLabel.setMinimumSize(new Dimension(125, 50));
        this.CaptureRateLabel.setPreferredSize(new Dimension(125, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.RadarSpecsPanel.add(this.CaptureRateLabel, gridBagConstraints);
        this.ShutdownDetectionLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.ShutdownDetectionLabel.setHorizontalAlignment(0);
        this.ShutdownDetectionLabel.setText("N/A");
        this.ShutdownDetectionLabel.setAlignmentY(0.0f);
        this.ShutdownDetectionLabel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Shutdown Detection", 4, 2, User.preferences.DEFAULT_FONT_SIZE_10));
        this.ShutdownDetectionLabel.setMaximumSize(new Dimension(125, 50));
        this.ShutdownDetectionLabel.setMinimumSize(new Dimension(125, 50));
        this.ShutdownDetectionLabel.setPreferredSize(new Dimension(125, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.RadarSpecsPanel.add(this.ShutdownDetectionLabel, gridBagConstraints);
        this.OffensiveLockLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.OffensiveLockLabel.setHorizontalAlignment(0);
        this.OffensiveLockLabel.setText("N/A");
        this.OffensiveLockLabel.setAlignmentY(0.0f);
        this.OffensiveLockLabel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Offensive Lock Time", 4, 2, User.preferences.DEFAULT_FONT_SIZE_10));
        this.OffensiveLockLabel.setMaximumSize(new Dimension(125, 50));
        this.OffensiveLockLabel.setMinimumSize(new Dimension(125, 50));
        this.OffensiveLockLabel.setPreferredSize(new Dimension(125, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.RadarSpecsPanel.add(this.OffensiveLockLabel, gridBagConstraints);
        this.DefensiveLockLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.DefensiveLockLabel.setHorizontalAlignment(0);
        this.DefensiveLockLabel.setText("N/A");
        this.DefensiveLockLabel.setAlignmentY(0.0f);
        this.DefensiveLockLabel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Defensive Lock Time", 4, 2, User.preferences.DEFAULT_FONT_SIZE_10));
        this.DefensiveLockLabel.setMaximumSize(new Dimension(125, 50));
        this.DefensiveLockLabel.setMinimumSize(new Dimension(125, 50));
        this.DefensiveLockLabel.setPreferredSize(new Dimension(125, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.RadarSpecsPanel.add(this.DefensiveLockLabel, gridBagConstraints);
        this.ToolTipPanel.addTab("Sensor/Targetting Specifications", this.RadarSpecsPanel);
        this.EquipmentSpecsPanel.setFont(User.preferences.DEFAULT_FONT_SIZE_16);
        this.EquipmentSpecsPanel.setLayout(new GridBagLayout());
        this.ToolTipPanel.addTab("Equipment Specifications", this.EquipmentSpecsPanel);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.BottomPanel.add(this.ToolTipPanel, gridBagConstraints);
        this.ButtonPanel.setFont(User.preferences.DEFAULT_FONT_SIZE_16);
        this.ButtonPanel.setMaximumSize(new Dimension(256, 180));
        this.ButtonPanel.setMinimumSize(new Dimension(256, 180));
        this.ButtonPanel.setPreferredSize(new Dimension(256, 180));
        this.ButtonPanel.setLayout(new GridBagLayout());
        this.InfoButtonPanel.setBorder(BorderFactory.createTitledBorder(null, "Info", 2, 2, User.preferences.DEFAULT_FONT_SIZE_12));
        this.InfoButtonPanel.setMaximumSize(new Dimension(128, 180));
        this.InfoButtonPanel.setMinimumSize(new Dimension(128, 180));
        this.InfoButtonPanel.setPreferredSize(new Dimension(128, 180));
        this.InfoButtonPanel.setLayout(new GridBagLayout());
        this.AboutButton.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.AboutButton.setText("About");
        this.AboutButton.setAlignmentY(0.0f);
        this.AboutButton.setHorizontalTextPosition(0);
        this.AboutButton.setMargin(new Insets(0, 0, 0, 0));
        this.AboutButton.setMaximumSize(new Dimension(100, 25));
        this.AboutButton.setMinimumSize(new Dimension(100, 25));
        this.AboutButton.setPreferredSize(new Dimension(100, 25));
        this.AboutButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MechlabForm.this.AboutButtonActionPerformed(actionEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.InfoButtonPanel.add(this.AboutButton, gridBagConstraints);
        this.MechTreesButton.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.MechTreesButton.setText("Mech Trees");
        this.MechTreesButton.setAlignmentY(0.0f);
        this.MechTreesButton.setHorizontalTextPosition(0);
        this.MechTreesButton.setMargin(new Insets(0, 0, 0, 0));
        this.MechTreesButton.setMaximumSize(new Dimension(100, 25));
        this.MechTreesButton.setMinimumSize(new Dimension(100, 25));
        this.MechTreesButton.setPreferredSize(new Dimension(100, 25));
        this.MechTreesButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MechlabForm.this.MechTreesButtonActionPerformed(actionEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.InfoButtonPanel.add(this.MechTreesButton, gridBagConstraints);
        this.PilotTreesButton.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.PilotTreesButton.setText("Pilot Trees");
        this.PilotTreesButton.setAlignmentY(0.0f);
        this.PilotTreesButton.setEnabled(false);
        this.PilotTreesButton.setHorizontalTextPosition(0);
        this.PilotTreesButton.setMargin(new Insets(0, 0, 0, 0));
        this.PilotTreesButton.setMaximumSize(new Dimension(100, 25));
        this.PilotTreesButton.setMinimumSize(new Dimension(100, 25));
        this.PilotTreesButton.setPreferredSize(new Dimension(100, 25));
        this.PilotTreesButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MechlabForm.this.PilotTreesButtonActionPerformed(actionEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.InfoButtonPanel.add(this.PilotTreesButton, gridBagConstraints);
        this.StatsButton.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.StatsButton.setText("Weapon Stats");
        this.StatsButton.setAlignmentY(0.0f);
        this.StatsButton.setEnabled(false);
        this.StatsButton.setHorizontalTextPosition(0);
        this.StatsButton.setMargin(new Insets(0, 0, 0, 0));
        this.StatsButton.setMaximumSize(new Dimension(100, 25));
        this.StatsButton.setMinimumSize(new Dimension(100, 25));
        this.StatsButton.setPreferredSize(new Dimension(100, 25));
        this.StatsButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MechlabForm.this.StatsButtonActionPerformed(actionEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.InfoButtonPanel.add(this.StatsButton, gridBagConstraints);
        this.ButtonPanel.add(this.InfoButtonPanel, new GridBagConstraints());
        this.FeatureButtonPanel.setBorder(BorderFactory.createTitledBorder(null, "Features", 2, 2, User.preferences.DEFAULT_FONT_SIZE_12));
        this.FeatureButtonPanel.setMaximumSize(new Dimension(128, 180));
        this.FeatureButtonPanel.setMinimumSize(new Dimension(128, 180));
        this.FeatureButtonPanel.setPreferredSize(new Dimension(128, 180));
        this.FeatureButtonPanel.setLayout(new GridBagLayout());
        this.FrankenmechToggleButton.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.FrankenmechToggleButton.setSelected(false);
        this.FrankenmechToggleButton.setText("Frankenmechs");
        this.FrankenmechToggleButton.setToolTipText("");
        this.FrankenmechToggleButton.setAlignmentY(0.0f);
        this.FrankenmechToggleButton.setHorizontalTextPosition(0);
        this.FrankenmechToggleButton.setMargin(new Insets(0, 0, 0, 0));
        this.FrankenmechToggleButton.setMaximumSize(new Dimension(100, 25));
        this.FrankenmechToggleButton.setMinimumSize(new Dimension(100, 25));
        this.FrankenmechToggleButton.setPreferredSize(new Dimension(100, 25));
        this.FrankenmechToggleButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MechlabForm.this.FrankenmechToggleButtonActionPerformed(actionEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.FeatureButtonPanel.add(this.FrankenmechToggleButton, gridBagConstraints);
        this.MixtechToggleButton.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.MixtechToggleButton.setSelected(false);
        this.MixtechToggleButton.setText("Mixtech");
        this.MixtechToggleButton.setAlignmentY(0.0f);
        this.MixtechToggleButton.setEnabled(false);
        this.MixtechToggleButton.setHorizontalTextPosition(0);
        this.MixtechToggleButton.setMargin(new Insets(0, 0, 0, 0));
        this.MixtechToggleButton.setMaximumSize(new Dimension(100, 25));
        this.MixtechToggleButton.setMinimumSize(new Dimension(100, 25));
        this.MixtechToggleButton.setPreferredSize(new Dimension(100, 25));
        this.MixtechToggleButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MechlabForm.this.MixtechToggleButtonActionPerformed(actionEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.FeatureButtonPanel.add(this.MixtechToggleButton, gridBagConstraints);
        this.FutureTechToggleButton.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.FutureTechToggleButton.setSelected(false);
        this.FutureTechToggleButton.setText("Futuretech");
        this.FutureTechToggleButton.setAlignmentY(0.0f);
        this.FutureTechToggleButton.setEnabled(false);
        this.FutureTechToggleButton.setHorizontalTextPosition(0);
        this.FutureTechToggleButton.setMargin(new Insets(0, 0, 0, 0));
        this.FutureTechToggleButton.setMaximumSize(new Dimension(100, 25));
        this.FutureTechToggleButton.setMinimumSize(new Dimension(100, 25));
        this.FutureTechToggleButton.setPreferredSize(new Dimension(100, 25));
        this.FutureTechToggleButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MechlabForm.this.FutureTechToggleButtonActionPerformed(actionEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.FeatureButtonPanel.add(this.FutureTechToggleButton, gridBagConstraints);
        this.OmniRestrictToggleButton.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.OmniRestrictToggleButton.setSelected(true);
        this.OmniRestrictToggleButton.setText("Omni Restrictions");
        this.OmniRestrictToggleButton.setAlignmentY(0.0f);
        this.OmniRestrictToggleButton.setHorizontalTextPosition(0);
        this.OmniRestrictToggleButton.setMargin(new Insets(0, 0, 0, 0));
        this.OmniRestrictToggleButton.setMaximumSize(new Dimension(100, 25));
        this.OmniRestrictToggleButton.setMinimumSize(new Dimension(100, 25));
        this.OmniRestrictToggleButton.setPreferredSize(new Dimension(100, 25));
        this.OmniRestrictToggleButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MechlabForm.this.OmniRestrictToggleButtonActionPerformed(actionEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.FeatureButtonPanel.add(this.OmniRestrictToggleButton, gridBagConstraints);
        this.ButtonPanel.add(this.FeatureButtonPanel, new GridBagConstraints());
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        this.BottomPanel.add(this.ButtonPanel, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = 1;
        this.getContentPane().add(this.BottomPanel, gridBagConstraints);
        this.SideTabbedPane.setFont(User.preferences.DEFAULT_FONT_SIZE_12);
        this.SideTabbedPane.setMaximumSize(new Dimension(295, 540));
        this.SideTabbedPane.setMinimumSize(new Dimension(295, 540));
        this.SideTabbedPane.setPreferredSize(new Dimension(295, 540));
        this.SideTabbedPane.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent changeEvent) {
                MechlabForm.this.SideTabbedPaneStateChanged(changeEvent);
            }
        });
        this.QuirksPanel.setLayout(new GridBagLayout());
        this.SideTabbedPane.addTab("Quirks", this.QuirksPanel);
        this.ComponentScrollPane.setHorizontalScrollBarPolicy(31);
        this.ComponentScrollPane.setFont(User.preferences.DEFAULT_FONT_SIZE_16);
        this.ComponentPanel.setEnabled(false);
        this.ComponentPanel.setFont(User.preferences.DEFAULT_FONT_SIZE_16);
        this.ComponentPanel.setMinimumSize(new Dimension(270, 1060));
        this.ComponentPanel.setPreferredSize(new Dimension(270, 1060));
        this.ComponentPanel.setLayout(new GridBagLayout());
        this.EnginePanel.setMinimumSize(new Dimension(295, 170));
        this.EnginePanel.setPreferredSize(new Dimension(295, 170));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.ComponentPanel.add(this.EnginePanel, gridBagConstraints);
        this.GyroPanel.setMinimumSize(new Dimension(295, 120));
        this.GyroPanel.setPreferredSize(new Dimension(295, 120));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.ComponentPanel.add(this.GyroPanel, gridBagConstraints);
        this.ArmorPanel.setMinimumSize(new Dimension(295, 120));
        this.ArmorPanel.setPreferredSize(new Dimension(295, 120));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.ComponentPanel.add(this.ArmorPanel, gridBagConstraints);
        this.StructurePanel.setMinimumSize(new Dimension(295, 120));
        this.StructurePanel.setPreferredSize(new Dimension(295, 120));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.ComponentPanel.add(this.StructurePanel, gridBagConstraints);
        this.HeatsinkPanel.setMinimumSize(new Dimension(295, 170));
        this.HeatsinkPanel.setPreferredSize(new Dimension(295, 170));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.ComponentPanel.add(this.HeatsinkPanel, gridBagConstraints);
        this.JumpjetPanel.setMinimumSize(new Dimension(295, 120));
        this.JumpjetPanel.setPreferredSize(new Dimension(295, 120));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.ComponentPanel.add(this.JumpjetPanel, gridBagConstraints);
        this.CockpitPanel.setMinimumSize(new Dimension(295, 120));
        this.CockpitPanel.setPreferredSize(new Dimension(295, 120));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.ComponentPanel.add(this.CockpitPanel, gridBagConstraints);
        this.MyomerPanel.setMinimumSize(new Dimension(295, 120));
        this.MyomerPanel.setPreferredSize(new Dimension(295, 120));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.ComponentPanel.add(this.MyomerPanel, gridBagConstraints);
        this.ComponentScrollPane.setViewportView(this.ComponentPanel);
        this.SideTabbedPane.addTab("Components", this.ComponentScrollPane);
        this.EquipmentQueuePanel.setAlignmentX(0.0f);
        this.EquipmentQueuePanel.setAlignmentY(0.0f);
        this.EquipmentQueuePanel.setEnabled(false);
        this.EquipmentQueuePanel.setFont(User.preferences.DEFAULT_FONT_SIZE_16);
        this.EquipmentQueuePanel.setMaximumSize(new Dimension(240, 540));
        this.EquipmentQueuePanel.setMinimumSize(new Dimension(240, 540));
        this.EquipmentQueuePanel.setPreferredSize(new Dimension(240, 540));
        this.EquipmentQueuePanel.setLayout(new GridBagLayout());
        this.ClearQueueButton.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.ClearQueueButton.setText("Clear Queue");
        this.ClearQueueButton.setMargin(new Insets(0, 0, 0, 0));
        this.ClearQueueButton.setMaximumSize(new Dimension(110, 25));
        this.ClearQueueButton.setMinimumSize(new Dimension(110, 25));
        this.ClearQueueButton.setPreferredSize(new Dimension(110, 25));
        this.ClearQueueButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MechlabForm.this.ClearQueueButtonActionPerformed(actionEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.EquipmentQueuePanel.add(this.ClearQueueButton, gridBagConstraints);
        this.EquipButton.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.EquipButton.setText("Equip to Mech");
        this.EquipButton.setMargin(new Insets(0, 0, 0, 0));
        this.EquipButton.setMaximumSize(new Dimension(110, 25));
        this.EquipButton.setMinimumSize(new Dimension(110, 25));
        this.EquipButton.setPreferredSize(new Dimension(110, 25));
        this.EquipButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MechlabForm.this.EquipButtonActionPerformed(actionEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.EquipmentQueuePanel.add(this.EquipButton, gridBagConstraints);
        this.SelectiveAllocationButton.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.SelectiveAllocationButton.setText("Selective Allocate");
        this.SelectiveAllocationButton.setEnabled(false);
        this.SelectiveAllocationButton.setMargin(new Insets(0, 0, 0, 0));
        this.SelectiveAllocationButton.setMaximumSize(new Dimension(110, 25));
        this.SelectiveAllocationButton.setMinimumSize(new Dimension(110, 25));
        this.SelectiveAllocationButton.setPreferredSize(new Dimension(110, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.EquipmentQueuePanel.add(this.SelectiveAllocationButton, gridBagConstraints);
        this.RemoveFromQueueButton.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.RemoveFromQueueButton.setText("Remove From Queue");
        this.RemoveFromQueueButton.setMargin(new Insets(0, 0, 0, 0));
        this.RemoveFromQueueButton.setMaximumSize(new Dimension(110, 25));
        this.RemoveFromQueueButton.setMinimumSize(new Dimension(110, 25));
        this.RemoveFromQueueButton.setPreferredSize(new Dimension(110, 25));
        this.RemoveFromQueueButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MechlabForm.this.RemoveFromQueueButtonActionPerformed(actionEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.EquipmentQueuePanel.add(this.RemoveFromQueueButton, gridBagConstraints);
        this.EquipmentQueueList.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.EquipmentQueueList.setSelectionMode(0);
        this.EquipmentQueueList.setToolTipText("");
        this.EquipmentQueueList.setAlignmentX(0.0f);
        this.EquipmentQueueList.setAlignmentY(0.0f);
        this.EquipmentQueueList.setDragEnabled(true);
        this.EquipmentQueueList.setFixedCellHeight(15);
        this.EquipmentQueueList.setMinimumSize(new Dimension(250, 360));
        this.EquipmentQueueList.setPreferredSize(new Dimension(250, 360));
        this.EquipmentQueueList.setVisibleRowCount(20);
        this.EquipmentQueueList.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                MechlabForm.this.EquipmentQueueListMouseClicked(mouseEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.EquipmentQueuePanel.add(this.EquipmentQueueList, gridBagConstraints);
        this.StripMechButton.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.StripMechButton.setText("Strip Mech");
        this.StripMechButton.setMargin(new Insets(0, 0, 0, 0));
        this.StripMechButton.setMaximumSize(new Dimension(110, 25));
        this.StripMechButton.setMinimumSize(new Dimension(110, 25));
        this.StripMechButton.setPreferredSize(new Dimension(110, 25));
        this.StripMechButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MechlabForm.this.StripMechButtonActionPerformed(actionEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.EquipmentQueuePanel.add(this.StripMechButton, gridBagConstraints);
        this.StripSectionButton.setFont(User.preferences.DEFAULT_FONT_SIZE_10);
        this.StripSectionButton.setText("Strip Section");
        this.StripSectionButton.setMargin(new Insets(0, 0, 0, 0));
        this.StripSectionButton.setMaximumSize(new Dimension(110, 25));
        this.StripSectionButton.setMinimumSize(new Dimension(110, 25));
        this.StripSectionButton.setPreferredSize(new Dimension(110, 25));
        this.StripSectionButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                MechlabForm.this.StripSectionButtonActionPerformed(actionEvent);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.EquipmentQueuePanel.add(this.StripSectionButton, gridBagConstraints);
        this.SideTabbedPane.addTab("Queue", this.EquipmentQueuePanel);
        this.jPanel1.setEnabled(false);
        this.SideTabbedPane.addTab("Unknown", this.jPanel1);
        this.getContentPane().add(this.SideTabbedPane, new GridBagConstraints());
        this.pack();
    }

    private void AboutButtonActionPerformed(ActionEvent actionEvent) {
        AboutDialogBox aboutDialogBox = new AboutDialogBox(this, true, "3.0.00");
        aboutDialogBox.setLocationRelativeTo(this);
        aboutDialogBox.setVisible(true);
    }

    private void EquipmentQueueListMouseClicked(MouseEvent mouseEvent) {
        if (mouseEvent.getClickCount() >= 2) {
            this.RemoveFromQueueButton.doClick();
        }
    }

    private void MechTreesButtonActionPerformed(ActionEvent actionEvent) {
        MechTreeDialogBox mechTreeDialogBox = new MechTreeDialogBox(this, true);
        mechTreeDialogBox.setLocationRelativeTo(this);
        mechTreeDialogBox.setVisible(true);
    }

    private void PilotTreesButtonActionPerformed(ActionEvent actionEvent) {
        PilotTreeDialogBox pilotTreeDialogBox = new PilotTreeDialogBox(this, true);
        pilotTreeDialogBox.setLocationRelativeTo(this);
        pilotTreeDialogBox.setVisible(true);
    }

    private void StatsButtonActionPerformed(ActionEvent actionEvent) {
    }

    private void MechTabPaneStateChanged(ChangeEvent changeEvent) {
        if (this.MechTabPane.getTabCount() < 1) {
            return;
        }
        if (this.SideTabbedPane.getTabCount() < 1) {
            return;
        }
        if (this.MechTabPane.getSelectedIndex() == this.SideTabbedPane.getSelectedIndex()) {
            return;
        }
        this.SideTabbedPane.setSelectedIndex(this.MechTabPane.getSelectedIndex());
        this.UpdateCriticalPanelVisibility();
    }

    private void BallisticListMouseClicked(MouseEvent mouseEvent) {
        if (mouseEvent.getClickCount() == 2) {
            this.AddButton.doClick();
        }
    }

    private void EnergyListMouseClicked(MouseEvent mouseEvent) {
        if (mouseEvent.getClickCount() == 2) {
            this.AddButton.doClick();
        }
    }

    private void MissileListMouseClicked(MouseEvent mouseEvent) {
        if (mouseEvent.getClickCount() == 2) {
            this.AddButton.doClick();
        }
    }

    private void AmmoListMouseClicked(MouseEvent mouseEvent) {
        if (mouseEvent.getClickCount() == 2) {
            this.AddButton.doClick();
        }
    }

    private void EquipmentListMouseClicked(MouseEvent mouseEvent) {
        if (mouseEvent.getClickCount() == 2) {
            this.AddButton.doClick();
        }
    }

    private void ChassisComboBoxActionPerformed(ActionEvent actionEvent) {
        if (this.ChassisComboBox.getSelectedIndex() < 0) {
            return;
        }
        Set_Selected_Blueprints((Chassis_Blueprint) this.ChassisComboBox.getSelectedItem(), User.futuretech_enabled, User.mixtech_enabled);
        if (this.ModelComboBox.getItemCount() > 0) {
            this.ModelComboBox.removeAllItems();
        }
        for (Model_Blueprint model_Blueprint : selected_model_blueprints) {
            this.ModelComboBox.addItem(model_Blueprint);
        }
    }

    private void ModelComboBoxActionPerformed(ActionEvent actionEvent) {
        if (this.ModelComboBox.getSelectedIndex() < 0) {
            return;
        }
        User.variant = new Variant();
        User.variant.SetMech((ChassisBlueprint) this.ChassisComboBox.getSelectedItem(), (ModelBlueprint) this.ModelComboBox.getSelectedItem(), User.futuretech_enabled, User.mixtech_enabled);
        this.event_trigger = true;
        this.UnreleasedLabel.setVisible(User.variant.model_type.unreleased);
        this.UnconfirmedLabel.setVisible(User.variant.model_type.unconfirmed);
        this.ChampionLabel.setVisible(User.variant.model_type.champion_model);
        this.HeroLabel.setVisible(User.variant.model_type.hero_model);
        this.ECMLabel.setVisible(false);
        this.JumpLabel.setVisible(User.variant.maximum_jump_jets > 0);
        this.TechBaseLabel.setText(User.variant.chassis_type.tech_base + " TECH");
        this.MechTypeLabel.setText(User.variant.chassis_type.is_omnimech ? "OMNIMECH" : "BATTLEMECH");
        this.EngineComboBox.removeAllItems();
        this.ArmorComboBox.removeAllItems();
        this.HeatsinkComboBox.removeAllItems();
        this.JumpjetComboBox.removeAllItems();
        this.GyroComboBox.removeAllItems();
        this.StructureComboBox.removeAllItems();
        this.CockpitComboBox.removeAllItems();
        this.MyomerComboBox.removeAllItems();

        for (EngineBlueprint engine_blueprint : selected_engine_blueprints) {
            this.EngineComboBox.addItem(engine_blueprint);
            if (engine_blueprint == User.variant.engine)
                this.EngineComboBox.setSelectedItem(engine_blueprint);
        }
        for (ArmorBlueprint armor_blueprint : selected_armor_blueprints) {
            this.ArmorComboBox.addItem(armor_blueprint);
            if (armor_blueprint == User.variant.armor)
                this.ArmorComboBox.setSelectedItem(armor_blueprint);
        }
        for (HeatSinkBlueprint heatsink_blueprint : selected_heatsink_blueprints) {
            this.HeatsinkComboBox.addItem(heatsink_blueprint);
            if (heatsink_blueprint == User.variant.heatsinks)
                this.HeatsinkComboBox.setSelectedItem(heatsink_blueprint);
        }
        for (GyroBlueprint gyro_blueprint : selected_gyro_blueprints) {
            this.GyroComboBox.addItem(gyro_blueprint);
            if (gyro_blueprint == User.variant.gyro)
                this.GyroComboBox.setSelectedItem(gyro_blueprint);
        }
        for (StructureBlueprint structure_blueprint : selected_structure_blueprints) {
            this.StructureComboBox.addItem(structure_blueprint);
            if (structure_blueprint == User.variant.structure)
                this.StructureComboBox.setSelectedItem(structure_blueprint);
        }
        for (CockpitBlueprint cockpit_blueprint : selected_cockpit_blueprints) {
            this.CockpitComboBox.addItem(cockpit_blueprint);
            if (cockpit_blueprint == User.variant.cockpit)
                this.CockpitComboBox.setSelectedItem(cockpit_blueprint);
        }
        for (JumpJetBlueprint jumpjet_blueprint : selected_jumpjet_blueprints) {
            this.JumpjetComboBox.addItem(jumpjet_blueprint);
            if (jumpjet_blueprint == User.variant.jumpjets)
                this.JumpjetComboBox.setSelectedItem(jumpjet_blueprint);
        }
        if (User.variant.chassis_type.is_omnimech && this.OmniRestrictToggleButton.isSelected()) {
            this.EngineComboBox.setEnabled(false);
            this.ArmorComboBox.setEnabled(false);
            this.HeatsinkComboBox.setEnabled(false);
            this.GyroComboBox.setEnabled(false);
            this.StructureComboBox.setEnabled(false);
            this.CockpitComboBox.setEnabled(false);
            if (User.variant.minimum_jump_jets > 0) {
                this.JumpjetComboBox.setEnabled(false);
            } else {
                this.JumpjetComboBox.setEnabled(this.JumpjetComboBox.getItemCount() > 1 && User.variant.maximum_jump_jets > 0);
            }
        } else {
            this.EngineComboBox.setEnabled(this.EngineComboBox.getItemCount() > 1);
            this.ArmorComboBox.setEnabled(this.ArmorComboBox.getItemCount() > 1);
            this.HeatsinkComboBox.setEnabled(this.HeatsinkComboBox.getItemCount() > 1);
            this.GyroComboBox.setEnabled(this.GyroComboBox.getItemCount() > 1);
            this.StructureComboBox.setEnabled(this.StructureComboBox.getItemCount() > 1);
            this.CockpitComboBox.setEnabled(this.CockpitComboBox.getItemCount() > 1);
            this.JumpjetComboBox.setEnabled(this.JumpjetComboBox.getItemCount() > 1 && User.variant.maximum_jump_jets > 0);
        }
        this.MyomerComboBox.setEnabled(false);
        this.BallisticList.setListData(selected_weapon_blueprints[0].toArray());
        this.EnergyList.setListData(selected_weapon_blueprints[1].toArray());
        this.MissileList.setListData(selected_weapon_blueprints[2].toArray());
        this.EquipmentList.setListData(selected_equipment_blueprints.toArray());
        this.AmmoList.setListData(selected_ammo_blueprints.toArray());
        this.HeatSinkSpinnerModel.setMinimum(10);
        this.HeatSinkSpinnerModel.setValue(User.variant.current_heat_sink_count);
        this.HeatSinkSpinnerModel.setMaximum((int) User.variant.chassis_type.tonnage);
        this.JumpJetSpinner.setEnabled(User.variant.minimum_jump_jets != User.variant.maximum_jump_jets);
        this.JumpJetSpinnerModel.setValue(User.variant.minimum_jump_jets);
        this.JumpJetSpinnerModel.setMaximum(User.variant.maximum_jump_jets);
        this.EngineRatingSpinnerModel.setValue(User.variant.current_engine_rating);
        this.EngineRatingSpinnerModel.setMinimum(Variant.GetMinEngineRating(User.variant.chassis_type, User.variant.model_type, User.omni_restrictions_enabled));
        this.EngineRatingSpinnerModel.setMaximum(Variant.GetMaxEngineRating(User.variant.chassis_type, User.variant.model_type, User.omni_restrictions_enabled));
        this.RightArmSpinnerModel.setMinimum(User.variant.sections[0].minimum_armor);
        this.LeftArmSpinnerModel.setMinimum(User.variant.sections[1].minimum_armor);
        this.RightTorsoSpinnerModel.setMinimum(User.variant.sections[2].minimum_armor);
        this.LeftTorsoSpinnerModel.setMinimum(User.variant.sections[3].minimum_armor);
        this.CenterTorsoSpinnerModel.setMinimum(User.variant.sections[4].minimum_armor);
        this.HeadSpinnerModel.setMinimum(User.variant.sections[5].minimum_armor);
        this.RightLegSpinnerModel.setMinimum(User.variant.sections[6].minimum_armor);
        this.LeftLegSpinnerModel.setMinimum(User.variant.sections[7].minimum_armor);
        this.RightRearTorsoSpinnerModel.setMinimum(0);
        this.LeftRearTorsoSpinnerModel.setMinimum(0);
        this.CenterRearTorsoSpinnerModel.setMinimum(0);
        this.RightArmSpinnerModel.setValue(User.variant.sections[0].front_armor);
        this.LeftArmSpinnerModel.setValue(User.variant.sections[1].front_armor);
        this.RightTorsoSpinnerModel.setValue(User.variant.sections[2].front_armor);
        this.LeftTorsoSpinnerModel.setValue(User.variant.sections[3].front_armor);
        this.CenterTorsoSpinnerModel.setValue(User.variant.sections[4].front_armor);
        this.HeadSpinnerModel.setValue(User.variant.sections[5].front_armor);
        this.RightLegSpinnerModel.setValue(User.variant.sections[6].front_armor);
        this.LeftLegSpinnerModel.setValue(User.variant.sections[7].front_armor);
        this.RightRearTorsoSpinnerModel.setValue(User.variant.sections[2].rear_armor);
        this.LeftRearTorsoSpinnerModel.setValue(User.variant.sections[3].front_armor);
        this.CenterRearTorsoSpinnerModel.setValue(User.variant.sections[4].front_armor);
        this.RightArmSpinnerModel.setMaximum(User.variant.sections[0].maximum_armor);
        this.LeftArmSpinnerModel.setMaximum(User.variant.sections[1].maximum_armor);
        this.RightTorsoSpinnerModel.setMaximum(User.variant.sections[2].maximum_armor);
        this.LeftTorsoSpinnerModel.setMaximum(User.variant.sections[3].maximum_armor);
        this.CenterTorsoSpinnerModel.setMaximum(User.variant.sections[4].maximum_armor);
        this.HeadSpinnerModel.setMaximum(User.variant.sections[5].maximum_armor);
        this.RightLegSpinnerModel.setMaximum(User.variant.sections[6].maximum_armor);
        this.LeftLegSpinnerModel.setMaximum(User.variant.sections[7].maximum_armor);
        this.RightRearTorsoSpinnerModel.setMaximum(User.variant.sections[2].maximum_armor);
        this.LeftRearTorsoSpinnerModel.setMaximum(User.variant.sections[3].maximum_armor);
        this.CenterRearTorsoSpinnerModel.setMaximum(User.variant.sections[4].maximum_armor);
        this.EnginePanel.Set_Engine(User.variant.engine, User.variant.current_engine_rating);
        this.GyroPanel.Set_Gyro(User.variant.gyro, User.variant.current_engine_rating);
        this.ArmorPanel.Set_Armor(User.variant.armor, User.variant.GetCurrentArmorTotal());
        this.StructurePanel.Set_Structure(User.variant.structure, User.variant.chassis_type.tonnage);
        this.HeatsinkPanel.Set_Heatsinks(User.variant.heatsinks, User.variant.current_engine_rating, User.variant.current_heat_sink_count);
        this.JumpjetPanel.Set_Jumpjets(User.variant.jumpjets, User.variant.current_jump_jets, User.variant.chassis_type.tonnage);
        this.CockpitPanel.Set_Cockpit(User.variant.cockpit);
        this.MyomerPanel.Set_Myomer(User.variant.myomer);
        this.tonnageProgressBar.setMinimum(0);
        this.tonnageProgressBar.setMaximum((int) User.variant.chassis_type.tonnage);
        this.CurrentArmorProgressBar.setMinimum(0);
        this.CurrentArmorProgressBar.setMaximum(User.variant.GetMaximumArmorTotal());
        this.ModelSpeedProgressBar.setMinimum((Integer) this.EngineRatingSpinnerModel.getMinimum());
        this.ModelSpeedProgressBar.setMaximum((Integer) this.EngineRatingSpinnerModel.getMaximum());
        this.ModelSpeedProgressBar.setValue((Integer) this.EngineRatingSpinnerModel.getValue());
        this.ModelSpeedProgressBar.setString(String.format("%.1f kph", User.variant.engine.Get_Speed(User.variant.chassis_type.tonnage, (Integer) this.EngineRatingSpinnerModel.getValue())));
        this.ChassisInfoPanel.Set_Overview(User.variant.chassis_type, User.variant.model_type);
        this.MechDescriptionTextPane.setText(User.variant.chassis_type.description);
        this.SpeedLimitPanel.Set_Speed_Limits(User.variant.chassis_type, User.variant.model_type, 16.2, User.speed_tweak_modifier, User.variant.chassis_type.tonnage, User.omni_restrictions_enabled);
        this.ManueverabilityPanel.Set_Manueverability(User.variant.chassis_type, User.variant.model_type, User.variant.maximum_jump_jets, User.anchor_turn_modifier, User.kinetic_burst_modifier, User.hard_brake_modifier);
        this.MovementRangePanel.Set_Movement_Range(User.variant.chassis_type, User.variant.model_type, User.twist_x_modifier);
        this.MovementSpeedPanel.Set_Movement_Speed(User.variant.chassis_type, User.variant.model_type, User.twist_speed_modifier, User.arm_reflex_modifier);
        this.ModuleOverviewPanel.Set_Modules(User.variant.chassis_type, User.variant.model_type, this.ModuleSlotToggleButton.isSelected());
        this.SetCriticalItems(this.RightArmCriticalList, this.RightLowerArmToggleButton, this.RightHandToggleButton, null, 0);
        this.SetCriticalItems(this.LeftArmCriticalList, this.LeftLowerArmToggleButton, this.LeftHandToggleButton, null, 1);
        this.SetCriticalItems(this.RightLegCriticalList, null, null, null, 6);
        this.SetCriticalItems(this.LeftLegCriticalList, null, null, null, 7);
        this.SetCriticalItems(this.RightTorsoCriticalList, null, null, this.RightTorsoCASEToggleButton, 2);
        this.SetCriticalItems(this.LeftTorsoCriticalList, null, null, this.LeftTorsoCASEToggleButton, 3);
        this.SetCriticalItems(this.CenterTorsoCriticalList, null, null, null, 4);
        this.SetCriticalItems(this.HeadCriticalList, null, null, null, 5);
        this.SetSectionOmnipods(this.RightArmPodComboBox, 0);
        this.SetSectionOmnipods(this.LeftArmPodComboBox, 1);
        this.SetSectionOmnipods(this.RightTorsoPodComboBox, 2);
        this.SetSectionOmnipods(this.LeftTorsoPodComboBox, 3);
        this.SetSectionOmnipods(this.CenterTorsoPodComboBox, 4);
        this.SetSectionOmnipods(this.HeadPodComboBox, 5);
        this.SetSectionOmnipods(this.RightLegPodComboBox, 6);
        this.SetSectionOmnipods(this.LeftLegPodComboBox, 7);
        this.UpdateArmorLabels(this.RightArmArmorProgressBar, null, this.RightArmStructureProgressBar, 0);
        this.UpdateArmorLabels(this.LeftArmArmorProgressBar, null, this.LeftArmStructureProgressBar, 1);
        this.UpdateArmorLabels(this.RightLegArmorProgressBar, null, this.RightLegStructureProgressBar, 6);
        this.UpdateArmorLabels(this.LeftLegArmorProgressBar, null, this.LeftLegStructureProgressBar, 7);
        this.UpdateArmorLabels(this.RightTorsoFrontArmorProgressBar, this.RightTorsoRearArmorProgressBar, this.RightTorsoStructureProgressBar, 2);
        this.UpdateArmorLabels(this.LeftTorsoFrontArmorProgressBar, this.LeftTorsoRearArmorProgressBar, this.LeftTorsoStructureProgressBar, 3);
        this.UpdateArmorLabels(this.CenterTorsoFrontArmorProgressBar, this.CenterTorsoRearArmorProgressBar, this.CenterTorsoStructureProgressBar, 4);
        this.UpdateArmorLabels(this.HeadArmorProgressBar, null, this.HeadStructureProgressBar, 5);
        try {
            this.MechImage.setIcon(new ImageIcon(System.getProperty("user.dir") + "\\Resource\\" + User.variant.model_type.model_name.toLowerCase() + ".png"));
        } catch (Exception var2_2) {
            this.MechImage.setIcon(null);
        }
        this.event_trigger = false;
        this.UpdateArmor();
        this.UpdateJumpjets();
        this.UpdateHardpoints();
        this.UpdateTonnage();
        this.UpdateCriticals();
        this.UpdateQueue();
    }

    private void HeadSpinnerStateChanged(ChangeEvent changeEvent) {
        this.UpdateArmorSpinners(5);
    }

    private void RightTorsoSpinnerStateChanged(ChangeEvent changeEvent) {
        this.UpdateArmorSpinners(2);
    }

    private void RightRearTorsoSpinnerStateChanged(ChangeEvent changeEvent) {
        this.UpdateArmorSpinners(2);
    }

    private void CenterTorsoSpinnerStateChanged(ChangeEvent changeEvent) {
        this.UpdateArmorSpinners(4);
    }

    private void CenterRearTorsoSpinnerStateChanged(ChangeEvent changeEvent) {
        this.UpdateArmorSpinners(4);
    }

    private void LeftTorsoSpinnerStateChanged(ChangeEvent changeEvent) {
        this.UpdateArmorSpinners(3);
    }

    private void LeftRearTorsoSpinnerStateChanged(ChangeEvent changeEvent) {
        this.UpdateArmorSpinners(3);
    }

    private void RightArmSpinnerStateChanged(ChangeEvent changeEvent) {
        this.UpdateArmorSpinners(0);
    }

    private void LeftArmSpinnerStateChanged(ChangeEvent changeEvent) {
        this.UpdateArmorSpinners(1);
    }

    private void RightLegSpinnerStateChanged(ChangeEvent changeEvent) {
        this.UpdateArmorSpinners(6);
    }

    private void LeftLegSpinnerStateChanged(ChangeEvent changeEvent) {
        this.UpdateArmorSpinners(7);
    }

    private void EngineRatingSpinnerStateChanged(ChangeEvent changeEvent) {
        this.UpdateEngine();
        this.GyroPanel.Set_Gyro(User.variant.gyro, User.variant.current_engine_rating);
        this.UpdateHeatsinks();
        this.UpdateTonnage();
        this.UpdateCriticals();
        this.UpdateQueue();
    }

    private void HeatSinkSpinnerStateChanged(ChangeEvent changeEvent) {
        this.UpdateHeatsinks();
        this.UpdateWeapons();
        this.UpdateTonnage();
        this.UpdateCriticals();
        this.UpdateQueue();
    }

    private void ModuleSlotToggleButtonActionPerformed(ActionEvent actionEvent) {
        this.ModuleOverviewPanel.Set_Modules(User.variant.chassis_type, User.variant.model_type, this.ModuleSlotToggleButton.isSelected());
    }

    private void MaxArmorButtonActionPerformed(ActionEvent actionEvent) {
        this.HeadSpinnerModel.setValue(User.variant.sections[5].maximum_armor);
        this.RightArmSpinnerModel.setValue(User.variant.sections[0].maximum_armor);
        this.LeftArmSpinnerModel.setValue(User.variant.sections[1].maximum_armor);
        this.RightLegSpinnerModel.setValue(User.variant.sections[6].maximum_armor);
        this.LeftLegSpinnerModel.setValue(User.variant.sections[7].maximum_armor);
        this.RightTorsoSpinnerModel.setValue((int) Math.round((double) User.variant.sections[2].maximum_armor * (1.0 - User.preferences.REAR_ARMOR_PERCENTAGE)));
        this.RightRearTorsoSpinnerModel.setValue((int) Math.round((double) User.variant.sections[2].maximum_armor * User.preferences.REAR_ARMOR_PERCENTAGE));
        this.LeftTorsoSpinnerModel.setValue((int) Math.round((double) User.variant.sections[3].maximum_armor * (1.0 - User.preferences.REAR_ARMOR_PERCENTAGE)));
        this.LeftRearTorsoSpinnerModel.setValue((int) Math.round((double) User.variant.sections[3].maximum_armor * User.preferences.REAR_ARMOR_PERCENTAGE));
        this.CenterTorsoSpinnerModel.setValue((int) Math.round((double) User.variant.sections[4].maximum_armor * (1.0 - User.preferences.REAR_ARMOR_PERCENTAGE)));
        this.CenterRearTorsoSpinnerModel.setValue((int) Math.round((double) User.variant.sections[4].maximum_armor * User.preferences.REAR_ARMOR_PERCENTAGE));
        this.UpdateArmor();
        this.UpdateTonnage();
    }

    private void FrankenmechToggleButtonActionPerformed(ActionEvent actionEvent) {
        User.frankenmechs_enabled = this.FrankenmechToggleButton.isSelected();
        if (User.variant.chassis_type.is_omnimech) {
            return;
        }
        if (!User.frankenmechs_enabled) {
            this.ModelComboBox.setSelectedItem(User.variant.model_type);
        } else {
            this.RightArmPodComboBox.setEnabled(true);
            this.LeftArmPodComboBox.setEnabled(true);
            this.RightTorsoPodComboBox.setEnabled(true);
            this.LeftTorsoPodComboBox.setEnabled(true);
            this.HeadPodComboBox.setEnabled(true);
            this.RightLegPodComboBox.setEnabled(true);
            this.LeftLegPodComboBox.setEnabled(true);
        }
    }

    private void EngineComboBoxActionPerformed(ActionEvent actionEvent) {
        if (this.event_trigger) {
            return;
        }
        User.variant.engine = (EngineBlueprint) this.EngineComboBox.getSelectedItem();
        if (User.variant.engine == null) {
            return;
        }
        for (Section section : User.variant.sections) {
            section.Remove_Component_Type("Engine");
        }
        User.variant.sections[2].Add_Component(User.variant.engine.Get_Crittable(User.variant.engine.Has_Side_Torso_Criticals()), 0);
        User.variant.sections[3].Add_Component(User.variant.engine.Get_Crittable(User.variant.engine.Has_Side_Torso_Criticals()), 0);
        User.variant.sections[4].Add_Component(User.variant.engine.Get_Crittable(), 0);
        this.UpdateEngine();
        this.UpdateTonnage();
        this.UpdateCriticals();
    }

    private void GyroComboBoxActionPerformed(ActionEvent actionEvent) {
        if (this.event_trigger) {
            return;
        }
        User.variant.gyro = (GyroBlueprint) this.GyroComboBox.getSelectedItem();
        if (User.variant.gyro == null) {
            return;
        }
        for (Section section : User.variant.sections) {
            section.Remove_Component_Type("Gyro");
        }
        User.variant.sections[4].Add_Component(User.variant.gyro.Get_Crittable(), 1);
        this.GyroPanel.Set_Gyro(User.variant.gyro, User.variant.current_engine_rating);
        this.UpdateTonnage();
        this.UpdateCriticals();
    }

    private void ArmorComboBoxActionPerformed(ActionEvent actionEvent) {
        if (this.event_trigger) {
            return;
        }
        User.variant.armor = (ArmorBlueprint) this.ArmorComboBox.getSelectedItem();
        if (User.variant.armor == null) {
            return;
        }
        this.RemoveFromQueue("Armor");
        for (Section section : User.variant.sections) {
            section.Remove_Component_Type("Armor");
        }
        for (int i = 0; i < User.variant.armor.criticals; ++i) {
            queued_items.add(User.variant.armor.Get_Crittable());
        }
        this.UpdateArmor();
        this.UpdateTonnage();
        this.UpdateCriticals();
        this.UpdateQueue();
    }

    private void StructureComboBoxActionPerformed(ActionEvent actionEvent) {
        if (this.event_trigger) {
            return;
        }
        User.variant.structure = (StructureBlueprint) this.StructureComboBox.getSelectedItem();
        if (User.variant.structure == null) {
            return;
        }
        this.RemoveFromQueue("Structure");
        for (Section section : User.variant.sections) {
            section.Remove_Component_Type("Structure");
        }
        for (int i = 0; i < User.variant.structure.criticals; ++i) {
            queued_items.add(User.variant.structure.Get_Crittable());
        }
        this.StructurePanel.Set_Structure(User.variant.structure, User.variant.chassis_type.tonnage);
        this.UpdateTonnage();
        this.UpdateCriticals();
        this.UpdateQueue();
    }

    private void HeatsinkComboBoxActionPerformed(ActionEvent actionEvent) {
        if (this.event_trigger) {
            return;
        }
        User.variant.heatsinks = (HeatSinkBlueprint) this.HeatsinkComboBox.getSelectedItem();
        if (User.variant.heatsinks == null) {
            return;
        }
        this.RemoveFromQueue("Heat Sink");
        for (Section section : User.variant.sections) {
            section.Remove_Component_Type("Heat Sink");
        }
        this.UpdateHeatsinks();
        this.UpdateWeapons();
        this.UpdateTonnage();
        this.UpdateCriticals();
        this.UpdateQueue();
    }

    private void CockpitComboBoxActionPerformed(ActionEvent actionEvent) {
        if (this.event_trigger) {
            return;
        }
        User.variant.cockpit = (CockpitBlueprint) this.CockpitComboBox.getSelectedItem();
        if (User.variant.cockpit == null) {
            return;
        }
        for (Section section : User.variant.sections) {
            section.Remove_Component_Type("Cockpit");
        }
        User.variant.sections[5].Add_Component(User.variant.cockpit.Get_Crittable());
        this.CockpitPanel.Set_Cockpit(User.variant.cockpit);
        this.UpdateTonnage();
        this.UpdateCriticals();
    }

    private void TwistXToggleButtonActionPerformed(ActionEvent actionEvent) {
        User.twist_x_modifier = this.TwistXToggleButton.isSelected() ? 1.0 + 0.1 * User.mastery_modifier : 1.0;
        this.MovementRangePanel.Set_Movement_Range(User.variant.chassis_type, User.variant.model_type, User.twist_x_modifier);
    }

    private void TwistSpeedToggleButtonActionPerformed(ActionEvent actionEvent) {
        User.twist_speed_modifier = this.TwistSpeedToggleButton.isSelected() ? 1.0 + 0.15 * User.mastery_modifier : 1.0;
        this.MovementSpeedPanel.Set_Movement_Speed(User.variant.chassis_type, User.variant.model_type, User.twist_speed_modifier, User.arm_reflex_modifier);
    }

    private void ArmReflexToggleButtonActionPerformed(ActionEvent actionEvent) {
        User.arm_reflex_modifier = this.ArmReflexToggleButton.isSelected() ? 1.0 + 0.2 * User.mastery_modifier : 1.0;
        this.MovementSpeedPanel.Set_Movement_Speed(User.variant.chassis_type, User.variant.model_type, User.twist_speed_modifier, User.arm_reflex_modifier);
    }

    private void AnchorTurnToggleButtonActionPerformed(ActionEvent actionEvent) {
        User.anchor_turn_modifier = this.AnchorTurnToggleButton.isSelected() ? 1.0 + 0.1 * User.mastery_modifier : 1.0;
        this.ManueverabilityPanel.Set_Manueverability(User.variant.chassis_type, User.variant.model_type, User.variant.maximum_jump_jets, User.anchor_turn_modifier, User.kinetic_burst_modifier, User.hard_brake_modifier);
    }

    private void KineticBurstToggleButtonActionPerformed(ActionEvent actionEvent) {
        User.kinetic_burst_modifier = this.KineticBurstToggleButton.isSelected() ? 1.0 + 0.225 * User.mastery_modifier : 1.0;
        this.ManueverabilityPanel.Set_Manueverability(User.variant.chassis_type, User.variant.model_type, User.variant.maximum_jump_jets, User.anchor_turn_modifier, User.kinetic_burst_modifier, User.hard_brake_modifier);
    }

    private void HardBrakeToggleButtonActionPerformed(ActionEvent actionEvent) {
        User.hard_brake_modifier = this.HardBrakeToggleButton.isSelected() ? 1.0 + 0.25 * User.mastery_modifier : 1.0;
        this.ManueverabilityPanel.Set_Manueverability(User.variant.chassis_type, User.variant.model_type, User.variant.maximum_jump_jets, User.anchor_turn_modifier, User.kinetic_burst_modifier, User.hard_brake_modifier);
    }

    private void SpeedTweakToggleButtonActionPerformed(ActionEvent actionEvent) {
        User.speed_tweak_modifier = this.SpeedTweakToggleButton.isSelected() ? 1.1 : 1.0;
        this.UpdateSpeed();
    }

    private void FastFireToggleButtonActionPerformed(ActionEvent actionEvent) {
        User.fast_fire_modifier = this.FastFireToggleButton.isSelected() ? 0.95 : 1.0;
        this.UpdateWeapons();
    }

    private void CoolRunToggleButtonActionPerformed(ActionEvent actionEvent) {
        User.coolrun_modifier = this.CoolRunToggleButton.isSelected() ? 1.0 + 0.075 * User.mastery_modifier : 1.0;
        this.UpdateHeatsinks();
        this.UpdateWeapons();
    }

    private void HeatContainmentToggleButtonActionPerformed(ActionEvent actionEvent) {
        User.heat_containment_modifier = this.HeatContainmentToggleButton.isSelected() ? 1.0 + 0.1 * User.mastery_modifier : 1.0;
        this.UpdateHeatsinks();
        this.UpdateWeapons();
    }

    private void EliteModToggleButtonActionPerformed(ActionEvent actionEvent) {
        User.mastery_modifier = this.EliteModToggleButton.isSelected() ? 2.0 : 1.0;
        User.heat_containment_modifier = this.HeatContainmentToggleButton.isSelected() ? 1.0 + 0.1 * User.mastery_modifier : 1.0;
        User.coolrun_modifier = this.CoolRunToggleButton.isSelected() ? 1.0 + 0.075 * User.mastery_modifier : 1.0;
        User.hard_brake_modifier = this.HardBrakeToggleButton.isSelected() ? 1.0 + 0.25 * User.mastery_modifier : 1.0;
        User.kinetic_burst_modifier = this.KineticBurstToggleButton.isSelected() ? 1.0 + 0.225 * User.mastery_modifier : 1.0;
        User.twist_x_modifier = this.TwistXToggleButton.isSelected() ? 1.0 + 0.1 * User.mastery_modifier : 1.0;
        User.twist_speed_modifier = this.TwistSpeedToggleButton.isSelected() ? 1.0 + 0.15 * User.mastery_modifier : 1.0;
        User.arm_reflex_modifier = this.ArmReflexToggleButton.isSelected() ? 1.0 + 0.2 * User.mastery_modifier : 1.0;
        User.anchor_turn_modifier = this.AnchorTurnToggleButton.isSelected() ? 1.0 + 0.1 * User.mastery_modifier : 1.0;
        this.ManueverabilityPanel.Set_Manueverability(User.variant.chassis_type, User.variant.model_type, User.variant.maximum_jump_jets, User.anchor_turn_modifier, User.kinetic_burst_modifier, User.hard_brake_modifier);
        this.MovementSpeedPanel.Set_Movement_Speed(User.variant.chassis_type, User.variant.model_type, User.twist_speed_modifier, User.arm_reflex_modifier);
        this.MovementRangePanel.Set_Movement_Range(User.variant.chassis_type, User.variant.model_type, User.twist_x_modifier);
        this.UpdateHeatsinks();
        this.UpdateWeapons();
    }

    private void MasterModToggleButtonActionPerformed(ActionEvent actionEvent) {
    }

    private void AmmoListFocusGained(FocusEvent focusEvent) {
        if (this.AmmoList.getSelectedIndex() < 0) {
            return;
        }
    }

    private void AddButtonActionPerformed(ActionEvent actionEvent) {
        switch (this.EquipmentTabbedPane.getSelectedIndex()) {
            case 0: {
                if (this.BallisticList.getSelectedIndex() < 0) {
                    return;
                }
                queued_items.add(((Weapon_Blueprint) this.BallisticList.getSelectedValue()).Get_Crittable());
                this.UpdateWeapons();
                break;
            }
            case 1: {
                if (this.EnergyList.getSelectedIndex() < 0) {
                    return;
                }
                queued_items.add(((Weapon_Blueprint) this.EnergyList.getSelectedValue()).Get_Crittable());
                this.UpdateWeapons();
                break;
            }
            case 2: {
                if (this.MissileList.getSelectedIndex() < 0) {
                    return;
                }
                queued_items.add(((Weapon_Blueprint) this.MissileList.getSelectedValue()).Get_Crittable());
                this.UpdateWeapons();
                break;
            }
            case 3: {
                if (this.AmmoList.getSelectedIndex() < 0) {
                    return;
                }
                queued_items.add(((Ammo_Blueprint) this.AmmoList.getSelectedValue()).Get_Crittable());
                break;
            }
            case 4: {
                if (this.EquipmentList.getSelectedIndex() < 0) {
                    return;
                }
                queued_items.add(((Equipment_Blueprint) this.EquipmentList.getSelectedValue()).Get_Crittable());
                break;
            }
            default: {
                return;
            }
        }
        this.UpdateQueue();
        this.UpdateCriticals();
        this.UpdateTonnage();
    }

    private void RemoveFromQueueButtonActionPerformed(ActionEvent actionEvent) {
        this.temp_int = this.EquipmentQueueList.getSelectedIndex();
        if (this.temp_int < 0) {
            return;
        }
        this.temp_string = (String) this.EquipmentQueueList.getSelectedValue();
        this.temp_string = this.temp_string.replaceFirst("\\p{Punct}(.*)\\p{Punct} ", "");
        for (int i = queued_items.size() - 1; i >= 0; --i) {
            if (!this.temp_string.equals(((Crittable) queued_items.get((int) i)).name) || !((Crittable) queued_items.get((int) i)).item_type.equals("Ammo") && !((Crittable) queued_items.get((int) i)).item_type.equals("Weapon") && !((Crittable) queued_items.get((int) i)).item_type.equals("Equipment"))
                continue;
            queued_items.remove(i);
            break;
        }
        this.EquipmentQueueList.setSelectedIndex(this.temp_int);
        this.UpdateWeapons();
        this.UpdateQueue();
        this.UpdateCriticals();
        this.UpdateTonnage();
    }

    private void ClearQueueButtonActionPerformed(ActionEvent actionEvent) {
        for (int i = queued_items.size() - 1; i >= 0; --i) {
            if (!((Crittable) queued_items.get((int) i)).item_type.equals("Ammo") && !((Crittable) queued_items.get((int) i)).item_type.equals("Weapon") && !((Crittable) queued_items.get((int) i)).item_type.equals("Equipment"))
                continue;
            queued_items.remove(i);
        }
        this.UpdateQueue();
        this.UpdateTonnage();
        this.UpdateCriticals();
    }

    private void OmniRestrictToggleButtonActionPerformed(ActionEvent actionEvent) {
        User.omni_restrictions_enabled = this.OmniRestrictToggleButton.isSelected();
        if (!User.variant.chassis_type.is_omnimech) {
            return;
        }
        if (User.omni_restrictions_enabled) {
            this.ModelComboBox.setSelectedItem(User.variant.model_type);
        } else {
            this.EngineComboBox.setEnabled(this.EngineComboBox.getItemCount() > 1);
            this.ArmorComboBox.setEnabled(this.ArmorComboBox.getItemCount() > 1);
            this.HeatsinkComboBox.setEnabled(this.HeatsinkComboBox.getItemCount() > 1);
            this.GyroComboBox.setEnabled(this.GyroComboBox.getItemCount() > 1);
            this.StructureComboBox.setEnabled(this.StructureComboBox.getItemCount() > 1);
            this.CockpitComboBox.setEnabled(this.CockpitComboBox.getItemCount() > 1);
            this.JumpjetComboBox.setEnabled(this.JumpjetComboBox.getItemCount() > 1 && User.variant.maximum_jump_jets > 0);
            this.MyomerComboBox.setEnabled(this.MyomerComboBox.getItemCount() > 1);
            for (Section section : User.variant.sections) {
                section.Remove_Omni_Restrictions();
            }
            this.EngineRatingSpinnerModel.setValue(User.variant.current_engine_rating);
            this.EngineRatingSpinnerModel.setMinimum(Integer.valueOf(Variant.GetMinEngineRating(User.variant.chassis_type, User.variant.model_type, User.omni_restrictions_enabled)));
            this.EngineRatingSpinnerModel.setMaximum(Integer.valueOf(Variant.GetMaxEngineRating(User.variant.chassis_type, User.variant.model_type, User.omni_restrictions_enabled)));
            this.ModelSpeedProgressBar.setMinimum((Integer) this.EngineRatingSpinnerModel.getMinimum());
            this.ModelSpeedProgressBar.setMaximum((Integer) this.EngineRatingSpinnerModel.getMaximum());
            this.ModelSpeedProgressBar.setValue((Integer) this.EngineRatingSpinnerModel.getValue());
            this.ModelSpeedProgressBar.setString(String.format("%.1f kph", User.variant.engine.Get_Speed(User.variant.chassis_type.tonnage, (Integer) this.EngineRatingSpinnerModel.getValue())));
            this.SpeedLimitPanel.Set_Speed_Limits(User.variant.chassis_type, User.variant.model_type, 16.2, User.speed_tweak_modifier, User.variant.chassis_type.tonnage, User.omni_restrictions_enabled);
            this.UpdateCriticals();
        }
    }

    private void FutureTechToggleButtonActionPerformed(ActionEvent actionEvent) {
        User.futuretech_enabled = this.FutureTechToggleButton.isSelected();
        if (!User.futuretech_enabled) {
            this.ModelComboBox.setSelectedItem(User.variant.model_type);
        } else {
            Set_Selected_Equipment(User.variant.chassis_type.tech_base, User.futuretech_enabled, User.mixtech_enabled);
            this.BallisticList.setListData(selected_weapon_blueprints[0].toArray());
            this.EnergyList.setListData(selected_weapon_blueprints[1].toArray());
            this.MissileList.setListData(selected_weapon_blueprints[2].toArray());
            this.EquipmentList.setListData(selected_equipment_blueprints.toArray());
            this.AmmoList.setListData(selected_ammo_blueprints.toArray());
            if (User.variant.chassis_type.is_omnimech && User.omni_restrictions_enabled) {
                return;
            }
            Set_Selected_Components(User.variant.chassis_type.tech_base, User.futuretech_enabled, User.mixtech_enabled);
            this.EngineComboBox.removeAllItems();
            this.ArmorComboBox.removeAllItems();
            this.HeatsinkComboBox.removeAllItems();
            this.JumpjetComboBox.removeAllItems();
            this.GyroComboBox.removeAllItems();
            this.StructureComboBox.removeAllItems();
            this.CockpitComboBox.removeAllItems();
            this.MyomerComboBox.removeAllItems();

            for (EngineBlueprint engine_blueprint : selected_engine_blueprints) {
                this.EngineComboBox.addItem(engine_blueprint);
            }
            for (ArmorBlueprint armor_blueprint : selected_armor_blueprints) {
                this.ArmorComboBox.addItem(armor_blueprint);
            }
            for (HeatSinkBlueprint heatsink_blueprint : selected_heatsink_blueprints) {
                this.HeatsinkComboBox.addItem(heatsink_blueprint);
            }
            for (GyroBlueprint gyro_blueprint : selected_gyro_blueprints) {
                this.GyroComboBox.addItem(gyro_blueprint);
            }
            for (StructureBlueprint structure_blueprint : selected_structure_blueprints) {
                this.StructureComboBox.addItem(structure_blueprint);
            }
            for (CockpitBlueprint cockpit_blueprint : selected_cockpit_blueprints) {
                this.CockpitComboBox.addItem(cockpit_blueprint);
            }
        }
    }

    private void MixtechToggleButtonActionPerformed(ActionEvent actionEvent) {
        User.mixtech_enabled = this.MixtechToggleButton.isSelected();
        if (!User.mixtech_enabled) {
            this.ModelComboBox.setSelectedItem(User.variant.model_type);
        } else {
            Set_Selected_Equipment(User.variant.chassis_type.tech_base, User.futuretech_enabled, User.mixtech_enabled);
            this.BallisticList.setListData(selected_weapon_blueprints[0].toArray());
            this.EnergyList.setListData(selected_weapon_blueprints[1].toArray());
            this.MissileList.setListData(selected_weapon_blueprints[2].toArray());
            this.EquipmentList.setListData(selected_equipment_blueprints.toArray());
            this.AmmoList.setListData(selected_ammo_blueprints.toArray());
            if (User.variant.chassis_type.is_omnimech && User.omni_restrictions_enabled) {
                return;
            }
            Set_Selected_Components(User.variant.chassis_type.tech_base, User.futuretech_enabled, User.mixtech_enabled);
            this.EngineComboBox.removeAllItems();
            this.ArmorComboBox.removeAllItems();
            this.HeatsinkComboBox.removeAllItems();
            this.JumpjetComboBox.removeAllItems();
            this.GyroComboBox.removeAllItems();
            this.StructureComboBox.removeAllItems();
            this.CockpitComboBox.removeAllItems();
            this.MyomerComboBox.removeAllItems();

            for (EngineBlueprint engine_blueprint : selected_engine_blueprints) {
                this.EngineComboBox.addItem(engine_blueprint);
            }
            for (ArmorBlueprint armor_blueprint : selected_armor_blueprints) {
                this.ArmorComboBox.addItem(armor_blueprint);
            }
            for (HeatSinkBlueprint heatsink_blueprint : selected_heatsink_blueprints) {
                this.HeatsinkComboBox.addItem(heatsink_blueprint);
            }
            for (GyroBlueprint gyro_blueprint : selected_gyro_blueprints) {
                this.GyroComboBox.addItem(gyro_blueprint);
            }
            for (StructureBlueprint structure_blueprint : selected_structure_blueprints) {
                this.StructureComboBox.addItem(structure_blueprint);
            }
            for (CockpitBlueprint cockpit_blueprint : selected_cockpit_blueprints) {
                this.CockpitComboBox.addItem(cockpit_blueprint);
            }
        }
    }

    private void JumpJetSpinnerStateChanged(ChangeEvent changeEvent) {
        this.UpdateJumpjets();
        this.UpdateTonnage();
        this.UpdateCriticals();
        this.UpdateQueue();
    }

    private void JumpjetComboBoxActionPerformed(ActionEvent actionEvent) {
        if (this.event_trigger) {
            return;
        }
        User.variant.jumpjets = (Jumpjet_Blueprint) this.JumpjetComboBox.getSelectedItem();
        if (User.variant.jumpjets == null) {
            return;
        }
        this.UpdateJumpjets();
        this.UpdateTonnage();
        this.UpdateCriticals();
        this.UpdateQueue();
    }

    private void ArtemisIVToggleButtonActionPerformed(ActionEvent actionEvent) {
        selected_weapon_blueprints[2].clear();
        for (Weapon_Blueprint weapon_Blueprint : MASTER_WEAPON_BLUEPRINTS) {
            if (!weapon_Blueprint.tech_base.equals(User.variant.chassis_type.tech_base) && !weapon_Blueprint.tech_base.equals("ALL") || !HARDPOINT_TYPES[2].equals(weapon_Blueprint.hardpoint_type))
                continue;
            if (weapon_Blueprint.artemis_capable) {
                if (this.ArtemisIVToggleButton.isSelected() != weapon_Blueprint.name.contains((CharSequence) "Artemis"))
                    continue;
                selected_weapon_blueprints[2].add(weapon_Blueprint);
                continue;
            }
            if (weapon_Blueprint.apollo_capable) {
                if (this.ApolloToggleButton.isSelected() != weapon_Blueprint.name.contains((CharSequence) "Apollo"))
                    continue;
                selected_weapon_blueprints[2].add(weapon_Blueprint);
                continue;
            }
            selected_weapon_blueprints[2].add(weapon_Blueprint);
        }
        this.MissileList.setListData(selected_weapon_blueprints[2].toArray());
    }

    private void ApolloToggleButtonActionPerformed(ActionEvent actionEvent) {
        selected_weapon_blueprints[2].clear();
        for (Weapon_Blueprint weapon_Blueprint : MASTER_WEAPON_BLUEPRINTS) {
            if (!weapon_Blueprint.tech_base.equals(User.variant.chassis_type.tech_base) && !weapon_Blueprint.tech_base.equals("ALL") || !HARDPOINT_TYPES[2].equals(weapon_Blueprint.hardpoint_type))
                continue;
            if (weapon_Blueprint.artemis_capable) {
                if (this.ArtemisIVToggleButton.isSelected() != weapon_Blueprint.name.contains((CharSequence) "Artemis"))
                    continue;
                selected_weapon_blueprints[2].add(weapon_Blueprint);
                continue;
            }
            if (weapon_Blueprint.apollo_capable) {
                if (this.ApolloToggleButton.isSelected() != weapon_Blueprint.name.contains((CharSequence) "Apollo"))
                    continue;
                selected_weapon_blueprints[2].add(weapon_Blueprint);
                continue;
            }
            selected_weapon_blueprints[2].add(weapon_Blueprint);
        }
        this.MissileList.setListData(selected_weapon_blueprints[2].toArray());
    }

    private void SideTabbedPaneStateChanged(ChangeEvent changeEvent) {
        if (this.MechTabPane.getTabCount() < 1) {
            return;
        }
        if (this.SideTabbedPane.getTabCount() < 1) {
            return;
        }
        if (this.MechTabPane.getSelectedIndex() == this.SideTabbedPane.getSelectedIndex()) {
            return;
        }
        this.MechTabPane.setSelectedIndex(this.SideTabbedPane.getSelectedIndex());
        this.UpdateCriticalPanelVisibility();
    }

    private void ClearArmorButtonActionPerformed(ActionEvent actionEvent) {
        this.HeadSpinnerModel.setValue(User.variant.sections[5].minimum_armor);
        this.RightArmSpinnerModel.setValue(User.variant.sections[0].minimum_armor);
        this.LeftArmSpinnerModel.setValue(User.variant.sections[1].minimum_armor);
        this.RightLegSpinnerModel.setValue(User.variant.sections[6].minimum_armor);
        this.LeftLegSpinnerModel.setValue(User.variant.sections[7].minimum_armor);
        this.RightTorsoSpinnerModel.setValue(User.variant.sections[2].minimum_armor);
        this.RightRearTorsoSpinnerModel.setValue(0);
        this.LeftTorsoSpinnerModel.setValue(User.variant.sections[3].minimum_armor);
        this.LeftRearTorsoSpinnerModel.setValue(0);
        this.CenterTorsoSpinnerModel.setValue(User.variant.sections[4].minimum_armor);
        this.CenterRearTorsoSpinnerModel.setValue(0);
        this.UpdateArmor();
        this.UpdateTonnage();
    }

    private void StripMechButtonActionPerformed(ActionEvent actionEvent) {
        for (Section section : User.variant.sections) {
            for (Crittable crittable : section.components) {
                if (crittable.is_locked) continue;
                queued_items.add(crittable);
            }
            section.Remove_All();
        }
        this.UpdateQueue();
        this.UpdateCriticals();
    }

    private void RightArmPodComboBoxActionPerformed(ActionEvent actionEvent) {
        if (this.event_trigger) {
            return;
        }
        User.variant.section_types[0] = (Section_Blueprint) this.RightArmPodComboBox.getSelectedItem();
        User.variant.sections[0].Update_Section(User.variant.section_types[0]);
        this.UpdateHardpoints();
        this.UpdateCriticals();
        this.UpdateJumpjets();
        this.UpdateQueue();
    }

    private void RightHandToggleButtonActionPerformed(ActionEvent actionEvent) {
        if (this.RightHandToggleButton.isSelected()) {
            if (!(User.variant.sections[0].current_criticals < User.variant.sections[0].maximum_criticals && this.RightLowerArmToggleButton.isSelected())) {
                this.RightHandToggleButton.setSelected(false);
                return;
            }
            User.variant.sections[0].Toggle_Arm_Actuator(3);
        } else {
            User.variant.sections[0].Toggle_Arm_Actuator(3);
        }
        this.UpdateCriticals();
    }

    private void RightLowerArmToggleButtonActionPerformed(ActionEvent actionEvent) {
        if (this.RightLowerArmToggleButton.isSelected()) {
            if (User.variant.sections[0].current_criticals >= User.variant.sections[0].maximum_criticals) {
                this.RightLowerArmToggleButton.setSelected(false);
                return;
            }
            User.variant.sections[0].Toggle_Arm_Actuator(2);
        } else {
            if (this.RightHandToggleButton.isSelected()) {
                this.RightLowerArmToggleButton.setSelected(true);
                return;
            }
            User.variant.sections[0].Toggle_Arm_Actuator(2);
        }
        this.UpdateCriticals();
    }

    private void LeftArmPodComboBoxActionPerformed(ActionEvent actionEvent) {
        if (this.event_trigger) {
            return;
        }
        User.variant.section_types[1] = (Section_Blueprint) this.LeftArmPodComboBox.getSelectedItem();
        User.variant.sections[1].Update_Section(User.variant.section_types[1]);
        this.UpdateHardpoints();
        this.UpdateCriticals();
        this.UpdateJumpjets();
        this.UpdateQueue();
    }

    private void LeftHandToggleButtonActionPerformed(ActionEvent actionEvent) {
        if (this.LeftHandToggleButton.isSelected()) {
            if (!(User.variant.sections[1].current_criticals < User.variant.sections[1].maximum_criticals && this.LeftLowerArmToggleButton.isSelected())) {
                this.LeftHandToggleButton.setSelected(false);
                return;
            }
            User.variant.sections[1].Toggle_Arm_Actuator(3);
        } else {
            User.variant.sections[1].Toggle_Arm_Actuator(3);
        }
        this.UpdateCriticals();
    }

    private void LeftLowerArmToggleButtonActionPerformed(ActionEvent actionEvent) {
        if (this.LeftLowerArmToggleButton.isSelected()) {
            if (User.variant.sections[1].current_criticals >= User.variant.sections[1].maximum_criticals) {
                this.LeftLowerArmToggleButton.setSelected(false);
                return;
            }
            User.variant.sections[1].Toggle_Arm_Actuator(2);
        } else {
            if (this.LeftHandToggleButton.isSelected()) {
                this.LeftLowerArmToggleButton.setSelected(true);
                return;
            }
            User.variant.sections[1].Toggle_Arm_Actuator(2);
        }
        this.UpdateCriticals();
    }

    private void RightLegPodComboBoxActionPerformed(ActionEvent actionEvent) {
        if (this.event_trigger) {
            return;
        }
        User.variant.section_types[6] = (Section_Blueprint) this.RightLegPodComboBox.getSelectedItem();
        User.variant.sections[6].Update_Section(User.variant.section_types[6]);
        this.UpdateHardpoints();
        this.UpdateCriticals();
        this.UpdateJumpjets();
        this.UpdateQueue();
    }

    private void LeftLegPodComboBoxActionPerformed(ActionEvent actionEvent) {
        if (this.event_trigger) {
            return;
        }
        User.variant.section_types[7] = (Section_Blueprint) this.LeftLegPodComboBox.getSelectedItem();
        User.variant.sections[7].Update_Section(User.variant.section_types[7]);
        this.UpdateHardpoints();
        this.UpdateCriticals();
        this.UpdateJumpjets();
        this.UpdateQueue();
    }

    private void HeadPodComboBoxActionPerformed(ActionEvent actionEvent) {
        if (this.event_trigger) {
            return;
        }
        User.variant.section_types[5] = (Section_Blueprint) this.HeadPodComboBox.getSelectedItem();
        User.variant.sections[5].Update_Section(User.variant.section_types[5]);
        this.UpdateHardpoints();
        this.UpdateCriticals();
        this.UpdateJumpjets();
        this.UpdateQueue();
    }

    private void RightTorsoPodComboBoxActionPerformed(ActionEvent actionEvent) {
        if (this.event_trigger) {
            return;
        }
        User.variant.section_types[2] = (Section_Blueprint) this.RightTorsoPodComboBox.getSelectedItem();
        User.variant.sections[2].Update_Section(User.variant.section_types[2]);
        this.UpdateHardpoints();
        this.UpdateCriticals();
        this.UpdateJumpjets();
        this.UpdateQueue();
    }

    private void RightTorsoCASEToggleButtonActionPerformed(ActionEvent actionEvent) {
    }

    private void LeftTorsoPodComboBoxActionPerformed(ActionEvent actionEvent) {
        if (this.event_trigger) {
            return;
        }
        User.variant.section_types[3] = (Section_Blueprint) this.LeftTorsoPodComboBox.getSelectedItem();
        User.variant.sections[3].Update_Section(User.variant.section_types[3]);
        this.UpdateHardpoints();
        this.UpdateCriticals();
        this.UpdateJumpjets();
        this.UpdateQueue();
    }

    private void LeftTorsoCASEToggleButtonActionPerformed(ActionEvent actionEvent) {
    }

    private void CenterTorsoPodComboBoxActionPerformed(ActionEvent actionEvent) {
        if (this.event_trigger) {
            return;
        }
        User.variant.section_types[4] = (Section_Blueprint) this.CenterTorsoPodComboBox.getSelectedItem();
        User.variant.sections[4].Update_Section(User.variant.section_types[4]);
        this.UpdateHardpoints();
        this.UpdateCriticals();
        this.UpdateJumpjets();
        this.UpdateQueue();
    }

    private void RightArmCriticalListFocusGained(FocusEvent focusEvent) {
        this.SetSelectedSection(0);
    }

    private void LeftArmCriticalListFocusGained(FocusEvent focusEvent) {
        this.SetSelectedSection(1);
    }

    private void LeftTorsoCriticalListFocusGained(FocusEvent focusEvent) {
        this.SetSelectedSection(3);
    }

    private void RightTorsoCriticalListFocusGained(FocusEvent focusEvent) {
        this.SetSelectedSection(2);
    }

    private void RightLegCriticalListFocusGained(FocusEvent focusEvent) {
        this.SetSelectedSection(6);
    }

    private void LeftLegCriticalListFocusGained(FocusEvent focusEvent) {
        this.SetSelectedSection(7);
    }

    private void CenterTorsoCriticalListFocusGained(FocusEvent focusEvent) {
        this.SetSelectedSection(4);
    }

    private void HeadCriticalListFocusGained(FocusEvent focusEvent) {
        this.SetSelectedSection(5);
    }

    private void StripSectionButtonActionPerformed(ActionEvent actionEvent) {
        if (User.selected_section < 0) {
            return;
        }
        for (Crittable crittable : User.variant.sections[User.selected_section].components) {
            if (crittable.is_locked) continue;
            queued_items.add(crittable);
        }
        User.variant.sections[User.selected_section].Remove_All();
        this.UpdateQueue();
        this.UpdateCriticals();
        this.UpdateHardpoints();
    }

    private void EquipButtonActionPerformed(ActionEvent actionEvent) {
        this.temp_int = this.EquipmentQueueList.getSelectedIndex();
        if (User.selected_section < 0) {
            return;
        }
        if (this.temp_int < 0) {
            return;
        }
        this.temp_string = (String) this.EquipmentQueueList.getSelectedValue();
        this.temp_string = this.temp_string.replaceFirst("\\p{Punct}(.*)\\p{Punct} ", "");
        Crittable crittable = null;
        for (int i = queued_items.size() - 1; i >= 0; --i) {
            if (!this.temp_string.equals(((Crittable) queued_items.get((int) i)).name)) continue;
            crittable = (Crittable) queued_items.get(i);
            break;
        }
        if (User.variant.sections[User.selected_section].Add_Component(crittable)) {
            queued_items.remove(crittable);
        }
        this.EquipmentQueueList.setSelectedIndex(this.temp_int);
        this.UpdateCriticals();
        this.UpdateQueue();
        this.UpdateHardpoints();
    }

    private void RightArmCriticalListMouseClicked(MouseEvent mouseEvent) {
        if (mouseEvent.getClickCount() < 2) {
            return;
        }
        Crittable crittable = User.variant.sections[0].Get_Component(this.RightArmCriticalList.getSelectedIndex());
        if (crittable != null) {
            queued_items.add(crittable);
            User.variant.sections[0].Remove_Component(crittable);
        }
        this.UpdateCriticals();
        this.UpdateHardpoints();
        this.UpdateQueue();
    }

    private void RightTorsoCriticalListMouseClicked(MouseEvent mouseEvent) {
        if (mouseEvent.getClickCount() < 2) {
            return;
        }
        Crittable crittable = User.variant.sections[2].Get_Component(this.RightTorsoCriticalList.getSelectedIndex());
        if (crittable != null) {
            queued_items.add(crittable);
            User.variant.sections[2].Remove_Component(crittable);
        }
        this.UpdateCriticals();
        this.UpdateHardpoints();
        this.UpdateQueue();
    }

    private void CenterTorsoCriticalListMouseClicked(MouseEvent mouseEvent) {
        if (mouseEvent.getClickCount() < 2) {
            return;
        }
        Crittable crittable = User.variant.sections[4].Get_Component(this.CenterTorsoCriticalList.getSelectedIndex());
        if (crittable != null) {
            queued_items.add(crittable);
            User.variant.sections[4].Remove_Component(crittable);
        }
        this.UpdateCriticals();
        this.UpdateHardpoints();
        this.UpdateQueue();
    }

    private void LeftTorsoCriticalListMouseClicked(MouseEvent mouseEvent) {
        if (mouseEvent.getClickCount() < 2) {
            return;
        }
        Crittable crittable = User.variant.sections[3].Get_Component(this.LeftTorsoCriticalList.getSelectedIndex());
        if (crittable != null) {
            queued_items.add(crittable);
            User.variant.sections[3].Remove_Component(crittable);
        }
        this.UpdateCriticals();
        this.UpdateHardpoints();
        this.UpdateQueue();
    }

    private void LeftArmCriticalListMouseClicked(MouseEvent mouseEvent) {
        if (mouseEvent.getClickCount() < 2) {
            return;
        }
        Crittable crittable = User.variant.sections[1].Get_Component(this.LeftArmCriticalList.getSelectedIndex());
        if (crittable != null) {
            queued_items.add(crittable);
            User.variant.sections[1].Remove_Component(crittable);
        }
        this.UpdateCriticals();
        this.UpdateHardpoints();
        this.UpdateQueue();
    }

    private void RightLegCriticalListMouseClicked(MouseEvent mouseEvent) {
        if (mouseEvent.getClickCount() < 2) {
            return;
        }
        Crittable crittable = User.variant.sections[6].Get_Component(this.RightLegCriticalList.getSelectedIndex());
        if (crittable != null) {
            queued_items.add(crittable);
            User.variant.sections[6].Remove_Component(crittable);
        }
        this.UpdateCriticals();
        this.UpdateHardpoints();
        this.UpdateQueue();
    }

    private void LeftLegCriticalListMouseClicked(MouseEvent mouseEvent) {
        if (mouseEvent.getClickCount() < 2) {
            return;
        }
        Crittable crittable = User.variant.sections[7].Get_Component(this.LeftLegCriticalList.getSelectedIndex());
        if (crittable != null) {
            queued_items.add(crittable);
            User.variant.sections[7].Remove_Component(crittable);
        }
        this.UpdateCriticals();
        this.UpdateHardpoints();
        this.UpdateQueue();
    }

    private void HeadCriticalListMouseClicked(MouseEvent mouseEvent) {
        if (mouseEvent.getClickCount() < 2) {
            return;
        }
        Crittable crittable = User.variant.sections[5].Get_Component(this.HeadCriticalList.getSelectedIndex());
        if (crittable != null) {
            queued_items.add(crittable);
            User.variant.sections[5].Remove_Component(crittable);
        }
        this.UpdateCriticals();
        this.UpdateHardpoints();
        this.UpdateQueue();
    }

    private void UpdateCriticalPanelVisibility() {
        this.UpdateHardpointLabels(this.RightArmAMSHardpointLabel, this.RightArmECMHardpointLabel, this.RightArmBallisticHardpointLabel, this.RightArmEnergyHardpointLabel, this.RightArmMissileHardpointLabel, 0);
        this.UpdateHardpointLabels(this.LeftArmAMSHardpointLabel, this.LeftArmECMHardpointLabel, this.LeftArmBallisticHardpointLabel, this.LeftArmEnergyHardpointLabel, this.LeftArmMissileHardpointLabel, 1);
        this.UpdateHardpointLabels(this.RightLegAMSHardpointLabel, this.RightLegECMHardpointLabel, this.RightLegBallisticHardpointLabel, this.RightLegEnergyHardpointLabel, this.RightLegMissileHardpointLabel, 6);
        this.UpdateHardpointLabels(this.LeftLegAMSHardpointLabel, this.LeftLegECMHardpointLabel, this.LeftLegBallisticHardpointLabel, this.LeftLegEnergyHardpointLabel, this.LeftLegMissileHardpointLabel, 7);
        this.UpdateHardpointLabels(this.RightTorsoAMSHardpointLabel, this.RightTorsoECMHardpointLabel, this.RightTorsoBallisticHardpointLabel, this.RightTorsoEnergyHardpointLabel, this.RightTorsoMissileHardpointLabel, 2);
        this.UpdateHardpointLabels(this.LeftTorsoAMSHardpointLabel, this.LeftTorsoECMHardpointLabel, this.LeftTorsoBallisticHardpointLabel, this.LeftTorsoEnergyHardpointLabel, this.LeftTorsoMissileHardpointLabel, 3);
        this.UpdateHardpointLabels(this.CenterTorsoAMSHardpointLabel, this.CenterTorsoECMHardpointLabel, this.CenterTorsoBallisticHardpointLabel, this.CenterTorsoEnergyHardpointLabel, this.CenterTorsoMissileHardpointLabel, 4);
        this.UpdateHardpointLabels(this.HeadAMSHardpointLabel, this.HeadECMHardpointLabel, this.HeadBallisticHardpointLabel, this.HeadEnergyHardpointLabel, this.HeadMissileHardpointLabel, 5);
        this.UpdateArmorLabelVisibility(this.RightArmArmorProgressBar, null, this.RightArmStructureProgressBar);
        this.UpdateArmorLabelVisibility(this.LeftArmArmorProgressBar, null, this.LeftArmStructureProgressBar);
        this.UpdateArmorLabelVisibility(this.RightLegArmorProgressBar, null, this.RightLegStructureProgressBar);
        this.UpdateArmorLabelVisibility(this.LeftLegArmorProgressBar, null, this.LeftLegStructureProgressBar);
        this.UpdateArmorLabelVisibility(this.RightTorsoFrontArmorProgressBar, this.RightTorsoRearArmorProgressBar, this.RightTorsoStructureProgressBar);
        this.UpdateArmorLabelVisibility(this.LeftTorsoFrontArmorProgressBar, this.LeftTorsoRearArmorProgressBar, this.LeftTorsoStructureProgressBar);
        this.UpdateArmorLabelVisibility(this.CenterTorsoFrontArmorProgressBar, this.CenterTorsoRearArmorProgressBar, this.CenterTorsoStructureProgressBar);
        this.UpdateArmorLabelVisibility(this.HeadArmorProgressBar, null, this.HeadStructureProgressBar);
        this.UpdateCriticalItemVisibility(this.RightArmCriticalList, this.RightLowerArmToggleButton, this.RightHandToggleButton, null, 0);
        this.UpdateCriticalItemVisibility(this.LeftArmCriticalList, this.LeftLowerArmToggleButton, this.LeftHandToggleButton, null, 1);
        this.UpdateCriticalItemVisibility(this.RightLegCriticalList, null, null, null, 6);
        this.UpdateCriticalItemVisibility(this.LeftLegCriticalList, null, null, null, 7);
        this.UpdateCriticalItemVisibility(this.RightTorsoCriticalList, null, null, this.RightTorsoCASEToggleButton, 2);
        this.UpdateCriticalItemVisibility(this.LeftTorsoCriticalList, null, null, this.LeftTorsoCASEToggleButton, 3);
        this.UpdateCriticalItemVisibility(this.CenterTorsoCriticalList, null, null, null, 4);
        this.UpdateCriticalItemVisibility(this.HeadCriticalList, null, null, null, 5);
        this.UpdateSectionOmnipodVisibility();
    }

    private Crittable GetQueuedItem(int n) {
        if (n < 0) {
            return null;
        }
        int n2 = 0;
        int n3 = 0;
        for (int i = 0; i < queued_items.size(); ++i) {
            for (int j = 0; j < ((Crittable) queued_items.get((int) i)).criticals; ++j) {
                if (n == ++n2) break;
            }
            n3 += ((Crittable) queued_items.get((int) i)).criticals;
            if (n != n2) continue;
            n2 = i;
            break;
        }
        if (n3 < n) {
            n2 = -1;
        }
        return null;
    }

    private void SetSectionOmnipods(JComboBox jComboBox, int n) {
        jComboBox.removeAllItems();
        for (Section_Blueprint section_Blueprint : selected_section_blueprints[n]) {
            jComboBox.addItem(section_Blueprint);
            if (!section_Blueprint.model.equals(User.variant.model_type.section_models[n])) continue;
            jComboBox.setSelectedItem(section_Blueprint);
        }
        if (n == 4) {
            jComboBox.setEnabled(false);
        } else {
            jComboBox.setEnabled(User.variant.chassis_type.is_omnimech || User.frankenmechs_enabled);
        }
    }

    private void UpdateSectionOmnipodVisibility() {
        boolean bl;
        switch (this.MechTabPane.getSelectedIndex()) {
            case 0: {
                bl = true;
                break;
            }
            default: {
                bl = false;
            }
        }
        this.RightArmPodComboBox.setVisible(bl);
        this.LeftArmPodComboBox.setVisible(bl);
        this.RightTorsoPodComboBox.setVisible(bl);
        this.LeftTorsoPodComboBox.setVisible(bl);
        this.CenterTorsoPodComboBox.setVisible(bl);
        this.HeadPodComboBox.setVisible(bl);
        this.RightLegPodComboBox.setVisible(bl);
        this.LeftLegPodComboBox.setVisible(bl);
    }

    private void SetCriticalItems(JList jList, JToggleButton jToggleButton, JToggleButton jToggleButton2, JToggleButton jToggleButton3, int n) {
        jList.setVisibleRowCount(User.variant.sections[n].maximum_criticals);
        jList.setMinimumSize(new Dimension(90, User.variant.sections[n].maximum_criticals * 12));
        if (jToggleButton != null) {
            jToggleButton.setEnabled(User.variant.chassis_type.is_omnimech && User.variant.section_types[n].maximum_actuator_count > 2);
            jToggleButton.setSelected(false);
        }
        if (jToggleButton2 != null) {
            jToggleButton2.setEnabled(User.variant.chassis_type.is_omnimech && User.variant.section_types[n].maximum_actuator_count > 3);
            jToggleButton2.setSelected(false);
        }
        if (jToggleButton3 != null) {
            jToggleButton3.setEnabled(User.variant.chassis_type.tech_base.equals("IS"));
            jToggleButton3.setSelected(false);
        }
    }

    private void UpdateCriticalItemVisibility(JList jList, JToggleButton jToggleButton, JToggleButton jToggleButton2, JToggleButton jToggleButton3, int n) {
        boolean bl;
        switch (this.MechTabPane.getSelectedIndex()) {
            case 1:
            case 2: {
                bl = true;
                break;
            }
            default: {
                bl = false;
            }
        }
        jList.setVisible(bl);
        if (jToggleButton != null) {
            jToggleButton.setVisible(bl);
        }
        if (jToggleButton2 != null) {
            jToggleButton2.setVisible(bl);
        }
        if (jToggleButton3 != null) {
            jToggleButton3.setVisible(bl);
        }
    }

    private void SetSelectedSection(int n) {
        User.selected_section = n;
        this.RightArmCriticalPanel.setBackground(User.preferences.DEFAULT_CRITICAL_PANEL_COLOR);
        this.LeftArmCriticalPanel.setBackground(User.preferences.DEFAULT_CRITICAL_PANEL_COLOR);
        this.RightLegCriticalPanel.setBackground(User.preferences.DEFAULT_CRITICAL_PANEL_COLOR);
        this.LeftLegCriticalPanel.setBackground(User.preferences.DEFAULT_CRITICAL_PANEL_COLOR);
        this.RightTorsoCriticalPanel.setBackground(User.preferences.DEFAULT_CRITICAL_PANEL_COLOR);
        this.LeftTorsoCriticalPanel.setBackground(User.preferences.DEFAULT_CRITICAL_PANEL_COLOR);
        this.CenterTorsoCriticalPanel.setBackground(User.preferences.DEFAULT_CRITICAL_PANEL_COLOR);
        this.HeadCriticalPanel.setBackground(User.preferences.DEFAULT_CRITICAL_PANEL_COLOR);
        this.RightArmCriticalPanel.setOpaque(false);
        this.LeftArmCriticalPanel.setOpaque(false);
        this.RightLegCriticalPanel.setOpaque(false);
        this.LeftLegCriticalPanel.setOpaque(false);
        this.RightTorsoCriticalPanel.setOpaque(false);
        this.LeftTorsoCriticalPanel.setOpaque(false);
        this.CenterTorsoCriticalPanel.setOpaque(false);
        this.HeadCriticalPanel.setOpaque(false);
        switch (n) {
            case 0: {
                this.RightArmCriticalPanel.setBackground(User.preferences.SELECTED_CRITICAL_PANEL_COLOR);
                this.RightArmCriticalPanel.setOpaque(true);
                break;
            }
            case 1: {
                this.LeftArmCriticalPanel.setBackground(User.preferences.SELECTED_CRITICAL_PANEL_COLOR);
                this.LeftArmCriticalPanel.setOpaque(true);
                break;
            }
            case 6: {
                this.RightLegCriticalPanel.setBackground(User.preferences.SELECTED_CRITICAL_PANEL_COLOR);
                this.RightLegCriticalPanel.setOpaque(true);
                break;
            }
            case 7: {
                this.LeftLegCriticalPanel.setBackground(User.preferences.SELECTED_CRITICAL_PANEL_COLOR);
                this.LeftLegCriticalPanel.setOpaque(true);
                break;
            }
            case 2: {
                this.RightTorsoCriticalPanel.setBackground(User.preferences.SELECTED_CRITICAL_PANEL_COLOR);
                this.RightTorsoCriticalPanel.setOpaque(true);
                break;
            }
            case 3: {
                this.LeftTorsoCriticalPanel.setBackground(User.preferences.SELECTED_CRITICAL_PANEL_COLOR);
                this.LeftTorsoCriticalPanel.setOpaque(true);
                break;
            }
            case 4: {
                this.CenterTorsoCriticalPanel.setBackground(User.preferences.SELECTED_CRITICAL_PANEL_COLOR);
                this.CenterTorsoCriticalPanel.setOpaque(true);
                break;
            }
            case 5: {
                this.HeadCriticalPanel.setBackground(User.preferences.SELECTED_CRITICAL_PANEL_COLOR);
                this.HeadCriticalPanel.setOpaque(true);
            }
        }
    }

    private void UpdateArmorLabelVisibility(JProgressBar jProgressBar, JProgressBar jProgressBar2, JProgressBar jProgressBar3) {
        boolean bl;
        switch (this.MechTabPane.getSelectedIndex()) {
            case 3: {
                bl = true;
                break;
            }
            default: {
                bl = false;
            }
        }
        if (jProgressBar2 != null) {
            jProgressBar.getParent().setVisible(bl);
            jProgressBar2.getParent().setVisible(bl);
        } else {
            jProgressBar.setVisible(bl);
        }
        jProgressBar3.setVisible(bl);
    }

    private void UpdateArmorLabels(JProgressBar jProgressBar, JProgressBar jProgressBar2, JProgressBar jProgressBar3, int n) {
        jProgressBar.setMaximum(User.variant.sections[n].maximum_armor);
        jProgressBar.setValue(User.variant.sections[n].front_armor);
        jProgressBar.setString("" + User.variant.sections[n].front_armor);
        jProgressBar3.setMaximum(User.variant.sections[n].health);
        jProgressBar3.setValue(User.variant.sections[n].health);
        jProgressBar3.setString("" + User.variant.sections[n].health);
        if (jProgressBar2 != null) {
            jProgressBar2.setMaximum(User.variant.sections[n].maximum_armor);
            jProgressBar2.setValue(User.variant.sections[n].rear_armor);
            jProgressBar2.setString("" + User.variant.sections[n].rear_armor);
        }
    }

    private void UpdateHardpointLabels(JLabel jLabel, JLabel jLabel2, JLabel jLabel3, JLabel jLabel4, JLabel jLabel5, int n) {
        boolean bl;
        switch (this.MechTabPane.getSelectedIndex()) {
            case 0: {
                bl = true;
                jLabel.setText(String.format("%d %s", User.variant.sections[n].maximum_hardpoints[3], HARDPOINT_TYPES[3]));
                jLabel2.setText(String.format("%d %s", User.variant.sections[n].maximum_hardpoints[4], HARDPOINT_TYPES[4]));
                jLabel3.setText(String.format("%d %s", User.variant.sections[n].maximum_hardpoints[0], HARDPOINT_TYPES[0]));
                jLabel4.setText(String.format("%d %s", User.variant.sections[n].maximum_hardpoints[1], HARDPOINT_TYPES[1]));
                jLabel5.setText(String.format("%d %s", User.variant.sections[n].maximum_hardpoints[2], HARDPOINT_TYPES[2]));
                break;
            }
            case 1:
            case 2: {
                bl = true;
                jLabel.setText(String.format("%d/%d %s", User.variant.sections[n].current_hardpoints[3], User.variant.sections[n].maximum_hardpoints[3], HARDPOINT_TYPES[3]));
                jLabel2.setText(String.format("%d/%d %s", User.variant.sections[n].current_hardpoints[4], User.variant.sections[n].maximum_hardpoints[4], HARDPOINT_TYPES[4]));
                jLabel3.setText(String.format("%d/%d %s", User.variant.sections[n].current_hardpoints[0], User.variant.sections[n].maximum_hardpoints[0], HARDPOINT_TYPES[0]));
                jLabel4.setText(String.format("%d/%d %s", User.variant.sections[n].current_hardpoints[1], User.variant.sections[n].maximum_hardpoints[1], HARDPOINT_TYPES[1]));
                jLabel5.setText(String.format("%d/%d %s", User.variant.sections[n].current_hardpoints[2], User.variant.sections[n].maximum_hardpoints[2], HARDPOINT_TYPES[2]));
                break;
            }
            default: {
                bl = false;
            }
        }
        jLabel3.setVisible(bl && User.variant.sections[n].maximum_hardpoints[0] > 0);
        jLabel4.setVisible(bl && User.variant.sections[n].maximum_hardpoints[1] > 0);
        jLabel5.setVisible(bl && User.variant.sections[n].maximum_hardpoints[2] > 0);
        jLabel.setVisible(bl && User.variant.sections[n].maximum_hardpoints[3] > 0);
        jLabel2.setVisible(bl && User.variant.sections[n].maximum_hardpoints[4] > 0);
    }

    private void UpdateHardpoints() {
        this.UpdateHardpointLabels(this.RightArmAMSHardpointLabel, this.RightArmECMHardpointLabel, this.RightArmBallisticHardpointLabel, this.RightArmEnergyHardpointLabel, this.RightArmMissileHardpointLabel, 0);
        this.UpdateHardpointLabels(this.LeftArmAMSHardpointLabel, this.LeftArmECMHardpointLabel, this.LeftArmBallisticHardpointLabel, this.LeftArmEnergyHardpointLabel, this.LeftArmMissileHardpointLabel, 1);
        this.UpdateHardpointLabels(this.RightLegAMSHardpointLabel, this.RightLegECMHardpointLabel, this.RightLegBallisticHardpointLabel, this.RightLegEnergyHardpointLabel, this.RightLegMissileHardpointLabel, 6);
        this.UpdateHardpointLabels(this.LeftLegAMSHardpointLabel, this.LeftLegECMHardpointLabel, this.LeftLegBallisticHardpointLabel, this.LeftLegEnergyHardpointLabel, this.LeftLegMissileHardpointLabel, 7);
        this.UpdateHardpointLabels(this.RightTorsoAMSHardpointLabel, this.RightTorsoECMHardpointLabel, this.RightTorsoBallisticHardpointLabel, this.RightTorsoEnergyHardpointLabel, this.RightTorsoMissileHardpointLabel, 2);
        this.UpdateHardpointLabels(this.LeftTorsoAMSHardpointLabel, this.LeftTorsoECMHardpointLabel, this.LeftTorsoBallisticHardpointLabel, this.LeftTorsoEnergyHardpointLabel, this.LeftTorsoMissileHardpointLabel, 3);
        this.UpdateHardpointLabels(this.CenterTorsoAMSHardpointLabel, this.CenterTorsoECMHardpointLabel, this.CenterTorsoBallisticHardpointLabel, this.CenterTorsoEnergyHardpointLabel, this.CenterTorsoMissileHardpointLabel, 4);
        this.UpdateHardpointLabels(this.HeadAMSHardpointLabel, this.HeadECMHardpointLabel, this.HeadBallisticHardpointLabel, this.HeadEnergyHardpointLabel, this.HeadMissileHardpointLabel, 5);
        this.UpdateTotalHardpoints();
    }

    private void UpdateTotalHardpoints() {
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        User.variant.UpdateMech();
        for (Section_Blueprint section_Blueprint : User.variant.section_types) {
            if (section_Blueprint == null) continue;
            n += section_Blueprint.hardpoints[0];
            n2 += section_Blueprint.hardpoints[1];
            n3 += section_Blueprint.hardpoints[2];
            n4 += section_Blueprint.hardpoints[3];
            n5 += section_Blueprint.hardpoints[4];
        }
        this.TotalHardpointPanel.Set_Total_Hardpoints(n, n2, n3, n4);
        this.ECMLabel.setVisible(n5 > 0);
        this.JumpLabel.setVisible(User.variant.maximum_jump_jets > 0);
        this.JumpDistanceBar.setMaximum(User.variant.maximum_jump_jets);
        this.JumpHeightBar.setMaximum(User.variant.maximum_jump_jets);
    }

    private void UpdateEngine() {
        if (User.variant.engine == null) {
            return;
        }
        User.variant.current_engine_rating = (Integer) this.EngineRatingSpinner.getValue();
        this.ModelSpeedProgressBar.setValue(User.variant.current_engine_rating);
        this.ModelSpeedProgressBar.setString(String.format("%.1f kph", User.variant.engine.Get_Speed(User.variant.chassis_type.tonnage, User.variant.current_engine_rating)));
        this.EnginePanel.Set_Engine(User.variant.engine, User.variant.current_engine_rating);
    }

    private void UpdateHeatsinks() {
        User.variant.current_heat_sink_count = (Integer) this.HeatSinkSpinner.getValue();
        int n = User.variant.engine.Get_Heat_Sink_Capacity(User.variant.current_engine_rating);
        for (int i = queued_items.size() - 1; i >= 0; --i) {
            if (!((Crittable) queued_items.get((int) i)).item_type.equals("Heat Sink")) continue;
            if (n >= User.variant.current_heat_sink_count) {
                queued_items.remove(i);
                continue;
            }
            ++n;
        }
        for (Section section : User.variant.sections) {
            for (int j = section.components.size() - 1; j >= 0; --j) {
                if (!section.components.get(j).item_type.equals("Heat Sink")) continue;
                if (n >= User.variant.current_heat_sink_count) {
                    section.components.remove(j);
                    continue;
                }
                ++n;
            }
        }
        n = User.variant.current_heat_sink_count - n;
        for (int j = 0; j < n; ++j) {
            queued_items.add(User.variant.heatsinks.Get_Crittable());
        }
        this.HeatsinkPanel.Set_Heatsinks(User.variant.heatsinks, User.variant.current_engine_rating, User.variant.current_heat_sink_count);
    }

    private void UpdateJumpjets() {
        this.JumpJetSpinner.setEnabled(User.variant.maximum_jump_jets > 0);
        User.variant.current_jump_jets = (Integer) this.JumpJetSpinner.getValue();
        if (User.variant.current_jump_jets > User.variant.maximum_jump_jets) {
            User.variant.current_jump_jets = User.variant.maximum_jump_jets;
            this.JumpJetSpinnerModel.setValue(User.variant.current_jump_jets);
        }
        this.JumpJetSpinnerModel.setMaximum(Integer.valueOf(User.variant.maximum_jump_jets));
        int n = 0;
        for (int i = queued_items.size() - 1; i >= 0; --i) {
            if (!((Crittable) queued_items.get((int) i)).item_type.equals("Jump Jet")) continue;
            if (n >= User.variant.current_jump_jets) {
                queued_items.remove(i);
                continue;
            }
            ++n;
        }
        for (Section section : User.variant.sections) {
            for (int j = section.components.size() - 1; j >= 0; --j) {
                if (!section.components.get(j).item_type.equals("Jump Jet")) continue;
                if (n >= User.variant.current_jump_jets) {
                    section.components.remove(j);
                    continue;
                }
                ++n;
            }
        }
        n = User.variant.current_jump_jets - n;
        for (int j = 0; j < n; ++j) {
            queued_items.add(User.variant.jumpjets.Get_Crittable(User.variant.chassis_type.tonnage));
        }
        this.JumpDistanceBar.setValue(User.variant.current_jump_jets);
        this.JumpHeightBar.setValue(User.variant.current_jump_jets);
        this.JumpjetPanel.Set_Jumpjets(User.variant.jumpjets, User.variant.current_jump_jets, User.variant.chassis_type.tonnage);
        this.ManueverabilityPanel.Set_Manueverability(User.variant.chassis_type, User.variant.model_type, User.variant.maximum_jump_jets, User.anchor_turn_modifier, User.kinetic_burst_modifier, User.hard_brake_modifier);
    }

    private void UpdateArmor() {
        if (User.variant.armor == null) {
            return;
        }
        this.ArmorPanel.Set_Armor(User.variant.armor, User.variant.GetCurrentArmorTotal());
        this.PointsPerTonAmount.setText(String.format("%.2f", User.variant.armor.points_per_ton));
        this.CurrentArmorProgressBar.setString("" + User.variant.GetCurrentArmorTotal());
        this.CurrentArmorProgressBar.setValue(User.variant.GetCurrentArmorTotal());
        this.UpdateArmorLabels(this.RightArmArmorProgressBar, null, this.RightArmStructureProgressBar, 0);
        this.UpdateArmorLabels(this.LeftArmArmorProgressBar, null, this.LeftArmStructureProgressBar, 1);
        this.UpdateArmorLabels(this.RightLegArmorProgressBar, null, this.RightLegStructureProgressBar, 6);
        this.UpdateArmorLabels(this.LeftLegArmorProgressBar, null, this.LeftLegStructureProgressBar, 7);
        this.UpdateArmorLabels(this.RightTorsoFrontArmorProgressBar, this.RightTorsoRearArmorProgressBar, this.RightTorsoStructureProgressBar, 2);
        this.UpdateArmorLabels(this.LeftTorsoFrontArmorProgressBar, this.LeftTorsoRearArmorProgressBar, this.LeftTorsoStructureProgressBar, 3);
        this.UpdateArmorLabels(this.CenterTorsoFrontArmorProgressBar, this.CenterTorsoRearArmorProgressBar, this.CenterTorsoStructureProgressBar, 4);
        this.UpdateArmorLabels(this.HeadArmorProgressBar, null, this.HeadStructureProgressBar, 5);
        this.RightArmAmountLabel.setText(String.format("%d/%d", User.variant.sections[0].front_armor, User.variant.sections[0].maximum_armor));
        this.LeftArmAmountLabel.setText(String.format("%d/%d", User.variant.sections[1].front_armor, User.variant.sections[1].maximum_armor));
        this.RightTorsoAmountLabel.setText(String.format("%d/%d", User.variant.sections[2].front_armor + User.variant.sections[2].rear_armor, User.variant.sections[2].maximum_armor));
        this.LeftTorsoAmountLabel.setText(String.format("%d/%d", User.variant.sections[3].front_armor + User.variant.sections[3].rear_armor, User.variant.sections[3].maximum_armor));
        this.CenterTorsoAmountLabel.setText(String.format("%d/%d", User.variant.sections[4].front_armor + User.variant.sections[4].rear_armor, User.variant.sections[4].maximum_armor));
        this.HeadAmountLabel.setText(String.format("%d/%d", User.variant.sections[5].front_armor, User.variant.sections[5].maximum_armor));
        this.RightLegAmountLabel.setText(String.format("%d/%d", User.variant.sections[6].front_armor, User.variant.sections[6].maximum_armor));
        this.LeftLegAmountLabel.setText(String.format("%d/%d", User.variant.sections[7].front_armor, User.variant.sections[7].maximum_armor));
        this.TotalAmountLabel.setText(String.format("%d/%d", User.variant.GetCurrentArmorTotal(), User.variant.GetMaximumArmorTotal()));
    }

    private void UpdateSpeed() {
        this.ModelSpeedProgressBar.setString(String.format("%.1f kph", User.variant.engine.Get_Speed(User.variant.chassis_type.tonnage, User.variant.current_engine_rating) * User.speed_tweak_modifier));
        this.SpeedLimitPanel.Set_Speed_Limits(User.variant.chassis_type, User.variant.model_type, 16.2, User.speed_tweak_modifier, User.variant.chassis_type.tonnage, User.omni_restrictions_enabled);
    }

    private void UpdateWeapons() {
        Weapon_Blueprint weapon_Blueprint;
        Weapon_Blueprint weapon_Blueprint2;
        double d = 0.0;
        double d2 = 0.0;
        double d3 = 0.0;
        double d4 = 0.0;
        double d5 = User.variant.heatsinks.Get_Dissipation(User.variant.current_heat_sink_count, User.variant.current_engine_rating) * User.coolrun_modifier;
        double d6 = User.variant.heatsinks.Get_Threshold(User.variant.current_heat_sink_count) * User.heat_containment_modifier;
        int n = 1000;
        int n2 = 0;
        int n3 = 0;
        for (Crittable crittable2 : queued_items) {
            if (!crittable2.item_type.equals("Weapon")) continue;
            weapon_Blueprint2 = (Weapon_Blueprint) crittable2.reference;
            d += weapon_Blueprint2.Get_Effective_Damage();
            d2 += weapon_Blueprint2.heat;
            d3 += weapon_Blueprint2.Get_DPS(User.fast_fire_modifier);
            d4 += weapon_Blueprint2.Get_HPS(User.fast_fire_modifier);
        }
        for (Section section2 : User.variant.sections) {
            for (Crittable crittable3 : section2.components) {
                if (!crittable3.item_type.equals("Weapon")) continue;
                weapon_Blueprint = (Weapon_Blueprint) crittable3.reference;
                d += weapon_Blueprint.Get_Effective_Damage();
                d2 += weapon_Blueprint.heat;
                d3 += weapon_Blueprint.Get_DPS(User.fast_fire_modifier);
                d4 += weapon_Blueprint.Get_HPS(User.fast_fire_modifier);
            }
        }
        for (Crittable crittable4 : queued_items) {
            if (!crittable4.item_type.equals("Weapon")) continue;
            Weapon_Blueprint weapon_Blueprint3 = (Weapon_Blueprint) crittable4.reference;
            n3 = (int) ((double) n3 + (double) weapon_Blueprint3.effective_range * (weapon_Blueprint3.Get_DPS(User.fast_fire_modifier) / d3));
        }
        Section[] arrsection = User.variant.sections;
        int crittable5 = arrsection.length;
        for (int i = 0; i < crittable5; ++i) {
            Section section2 = arrsection[i];
            for (Crittable crittable3 : section2.components) {
                if (!crittable3.item_type.equals("Weapon")) continue;
                weapon_Blueprint = (Weapon_Blueprint) crittable3.reference;
                n3 = (int) ((double) n3 + (double) weapon_Blueprint.effective_range * (weapon_Blueprint.Get_DPS(User.fast_fire_modifier) / d3));
            }
        }
        for (Crittable crittable : queued_items) {
            if (!crittable.item_type.equals("Weapon")) continue;
            Weapon_Blueprint weapon_Blueprint4 = (Weapon_Blueprint) crittable.reference;
            this.temp_int = Math.abs(weapon_Blueprint4.effective_range - n3);
            if (this.temp_int >= n) continue;
            n = this.temp_int;
            n2 = weapon_Blueprint4.effective_range;
        }
        arrsection = User.variant.sections;
        int n4 = arrsection.length;
        for (int i = 0; i < crittable5; ++i) {
            Section section2 = arrsection[i];
            for (Crittable crittable3 : section2.components) {
                if (!crittable3.item_type.equals("Weapon")) continue;
                weapon_Blueprint = (Weapon_Blueprint) crittable3.reference;
                this.temp_int = Math.abs(weapon_Blueprint.effective_range - n3);
                if (this.temp_int >= n) continue;
                n = this.temp_int;
                n2 = weapon_Blueprint.effective_range;
            }
        }
        this.alphaStrikeProgressBar.setValue((int) Math.round(d));
        this.alphaStrikeProgressBar.setString(String.format("%.2f", d));
        this.firepowerProgressBar.setValue((int) Math.round(d3));
        this.firepowerProgressBar.setString(String.format("%.2f dps", d3));
        this.heatEfficiencyProgressBar.setValue((int) Math.round(d5 * 10.0 / d4));
        this.heatEfficiencyProgressBar.setString(String.format("%.2f", d5 * 10.0 / d4) + '%');
        this.alphaStrikeHeatProgressBar.setValue((int) Math.round(d2 * 100.0 / d6));
        this.alphaStrikeHeatProgressBar.setString(String.format("%.2f", d2 * 100.0 / d6) + '%');
        this.rangeProgressBar.setValue(n2);
        this.rangeProgressBar.setString("" + n2 + "m");
    }

    private void RemoveFromQueue(String string) {
        for (int i = queued_items.size() - 1; i >= 0; --i) {
            if (!((Crittable) queued_items.get((int) i)).item_type.equals(string)) continue;
            queued_items.remove(i);
        }
        this.UpdateQueue();
    }

    private void RemoveFromQueue(String string, int n) {
        for (int i = queued_items.size() - 1; i >= 0; --i) {
            if (!((Crittable) queued_items.get((int) i)).item_type.equals(string)) continue;
            if (n < 1) break;
            queued_items.remove(i);
            --n;
        }
        this.UpdateQueue();
    }

    private void UpdateQueue() {
        int n;
        DefaultListModel<String> defaultListModel = new DefaultListModel<String>();
        ArrayList<Crittable> arrayList = new ArrayList<Crittable>(0);
        for (Crittable crittable3 : queued_items) {
            n = 1;
            for (Crittable crittable2 : arrayList) {
                if (!crittable3.name.equals(crittable2.name)) continue;
                n = 0;
            }
            if (n == 0) continue;
            arrayList.add(crittable3);
        }
        for (Crittable crittable3 : arrayList) {
            n = 0;
            for (Crittable crittable2 : queued_items) {
                if (!crittable3.name.equals(crittable2.name)) continue;
                ++n;
            }
            if (n > 1) {
                defaultListModel.addElement(String.format("(%d) %s", n, crittable3.toString()));
                continue;
            }
            defaultListModel.addElement(crittable3.toString());
        }
        this.EquipmentQueueList.setModel(defaultListModel);
    }

    private void UpdateCriticals() {
        this.UpdateCriticals(this.RightArmCriticalList, 0);
        this.UpdateCriticals(this.LeftArmCriticalList, 1);
        this.UpdateCriticals(this.RightLegCriticalList, 6);
        this.UpdateCriticals(this.LeftLegCriticalList, 7);
        this.UpdateCriticals(this.RightTorsoCriticalList, 2);
        this.UpdateCriticals(this.LeftTorsoCriticalList, 3);
        this.UpdateCriticals(this.CenterTorsoCriticalList, 4);
        this.UpdateCriticals(this.HeadCriticalList, 5);
        User.variant.CalculateCriticals();
        this.temp_int = 0;
        for (Crittable crittable : queued_items) {
            this.temp_int += crittable.criticals;
        }
        this.criticalsUsedProgressBar.setValue(User.variant.current_criticals + this.temp_int);
        this.criticalsUsedProgressBar.setString(String.format("%d/%d", User.variant.current_criticals + this.temp_int, 78));
    }

    public void UpdateCriticals(JList jList, int n) {
        if (User.variant == null || User.variant.sections[n] == null) {
            return;
        }
        DefaultListModel<String> defaultListModel = new DefaultListModel<String>();
        for (Crittable crittable : User.variant.sections[n].components) {
            for (int i = 0; i < crittable.criticals; ++i) {
                if (i == 0) {
                    defaultListModel.addElement(crittable.toString());
                    continue;
                }
                defaultListModel.addElement("----------");
            }
        }
        int n2 = User.variant.sections[n].maximum_criticals - User.variant.sections[n].current_criticals;
        for (int i = 0; i < n2; ++i) {
            defaultListModel.addElement("-Empty-");
        }
        jList.setModel(defaultListModel);
    }

    private void UpdateTonnage() {
        User.variant.CalculateTonnage();
        this.temp_double = 0.0;
        for (Crittable crittable : queued_items) {
            this.temp_double += crittable.tonnage;
        }
        this.tonnageProgressBar.setValue((int) Math.ceil(User.variant.current_tonnage + this.temp_double));
        this.tonnageProgressBar.setString(String.format("%.2f Tons", User.variant.current_tonnage + this.temp_double));
    }

    private void UpdateArmorSpinners(int n) {
        switch (n) {
            case 5: {
                User.variant.sections[5].front_armor = (Integer) this.HeadSpinner.getValue();
                break;
            }
            case 2: {
                User.variant.sections[2].front_armor = (Integer) this.RightTorsoSpinner.getValue();
                User.variant.sections[2].rear_armor = (Integer) this.RightRearTorsoSpinner.getValue();
                this.temp_int = User.variant.sections[2].maximum_armor - User.variant.sections[2].rear_armor - User.variant.sections[2].front_armor;
                this.RightTorsoSpinnerModel.setMaximum(Integer.valueOf(User.variant.sections[2].front_armor + this.temp_int));
                this.RightRearTorsoSpinnerModel.setMaximum(Integer.valueOf(User.variant.sections[2].rear_armor + this.temp_int));
                break;
            }
            case 3: {
                User.variant.sections[3].front_armor = (Integer) this.LeftTorsoSpinner.getValue();
                User.variant.sections[3].rear_armor = (Integer) this.LeftRearTorsoSpinner.getValue();
                this.temp_int = User.variant.sections[3].maximum_armor - User.variant.sections[3].rear_armor - User.variant.sections[3].front_armor;
                this.LeftTorsoSpinnerModel.setMaximum(Integer.valueOf(User.variant.sections[3].front_armor + this.temp_int));
                this.LeftRearTorsoSpinnerModel.setMaximum(Integer.valueOf(User.variant.sections[3].rear_armor + this.temp_int));
                break;
            }
            case 4: {
                User.variant.sections[4].front_armor = (Integer) this.CenterTorsoSpinner.getValue();
                User.variant.sections[4].rear_armor = (Integer) this.CenterRearTorsoSpinner.getValue();
                this.temp_int = User.variant.sections[4].maximum_armor - User.variant.sections[4].rear_armor - User.variant.sections[4].front_armor;
                this.CenterTorsoSpinnerModel.setMaximum(Integer.valueOf(User.variant.sections[4].front_armor + this.temp_int));
                this.CenterRearTorsoSpinnerModel.setMaximum(Integer.valueOf(User.variant.sections[4].rear_armor + this.temp_int));
                break;
            }
            case 0: {
                User.variant.sections[0].front_armor = (Integer) this.RightArmSpinner.getValue();
                break;
            }
            case 1: {
                User.variant.sections[1].front_armor = (Integer) this.LeftArmSpinner.getValue();
                break;
            }
            case 6: {
                User.variant.sections[6].front_armor = (Integer) this.RightLegSpinner.getValue();
                break;
            }
            case 7: {
                User.variant.sections[7].front_armor = (Integer) this.LeftLegSpinner.getValue();
                break;
            }
        }
        this.UpdateArmor();
        this.UpdateTonnage();
    }

    private class MechCriticalRenderer
            extends DefaultListCellRenderer {
        private final int section_id;

        MechCriticalRenderer(int n) {
            this.section_id = n;
        }

        public JLabel getListCellRendererComponent(JList jList, Object object, int n, boolean bl, boolean bl2) {
            JLabel jLabel = (JLabel) super.getListCellRendererComponent(jList, object, n, bl, bl2);
            int n2 = -1;
            int n3 = -1;
            jLabel.setBackground(User.preferences.EMPTY_CRITICAL_BG);
            jLabel.setForeground(User.preferences.EMPTY_CRITICAL_FG);
            jLabel.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
            for (int i = 0; i < User.variant.sections[this.section_id].components.size(); ++i) {
                for (int j = 0; j < User.variant.sections[this.section_id].components.get(i).criticals; ++j) {
                    if (n == ++n2) break;
                }
                n3 += User.variant.sections[this.section_id].components.get(i).criticals;
                if (n != n2) continue;
                n2 = i;
                break;
            }
            if (n3 < n) {
                n2 = -1;
            }
            if (n2 < User.variant.sections[this.section_id].components.size() && n2 > -1) {
                if (User.variant.sections[this.section_id].components.get(n2).is_locked) {
                    if (bl && jList.hasFocus()) {
                        jLabel.setBackground(User.preferences.LOCKED_CRITICAL_FG);
                        jLabel.setForeground(User.preferences.LOCKED_CRITICAL_BG);
                    } else {
                        jLabel.setBackground(User.preferences.LOCKED_CRITICAL_BG);
                        jLabel.setForeground(User.preferences.LOCKED_CRITICAL_FG);
                    }
                } else {
                    Color color = User.variant.sections[this.section_id].components.get(n2).hardpoint_type.equals(HARDPOINT_TYPES[0]) ? User.preferences.BALLISTIC_COLOR : (User.variant.sections[this.section_id].components.get(n2).hardpoint_type.equals(HARDPOINT_TYPES[1]) ? User.preferences.ENERGY_COLOR : (User.variant.sections[this.section_id].components.get(n2).hardpoint_type.equals(HARDPOINT_TYPES[2]) ? User.preferences.MISSILE_COLOR : (User.variant.sections[this.section_id].components.get(n2).hardpoint_type.equals(HARDPOINT_TYPES[3]) ? User.preferences.AMS_COLOR : (User.variant.sections[this.section_id].components.get(n2).hardpoint_type.equals(HARDPOINT_TYPES[4]) ? User.preferences.ECM_COLOR : User.preferences.NORMAL_CRITICAL_BG))));
                    if (bl && jList.hasFocus()) {
                        jLabel.setBackground(User.preferences.NORMAL_CRITICAL_FG);
                        jLabel.setForeground(color);
                    } else {
                        jLabel.setBackground(color);
                        jLabel.setForeground(User.preferences.NORMAL_CRITICAL_FG);
                    }
                    if (User.variant.sections[this.section_id].components.get(n2).criticals > 1 && n3 != n) {
                        jLabel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.BLACK));
                    } else if (User.variant.sections[this.section_id].components.get(n2).criticals > 1 && n3 == n) {
                        jLabel.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
                    } else {
                        jLabel.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
                    }
                }
            }
            return jLabel;
        }
    }

}

*/
