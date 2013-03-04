package MWOMechbay.GUI;

import MWOMechbay.Components.Ammo.*;
import MWOMechbay.Components.Components.*;
import MWOMechbay.Components.Item;
import MWOMechbay.Components.OtherEquipment.*;
import MWOMechbay.Components.SpecialEquipment.*;
import MWOMechbay.Components.Weapons.*;
import MWOMechbay.Mechs.*;
import MWOMechbay.UserPreferences;
import MWOMechbay.Variant;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;
import java.util.Vector;
import javax.swing.*;
import javax.swing.JSpinner.NumberEditor;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Quicksilver
 */
public class CompactMechlabForm extends JFrame implements MainCommon, SaveCommon {
    //<editor-fold defaultstate="collapsed" desc="User Variables">
    private Mech userMech = new Mech();
    private Variant userVariant = new Variant();
    private int userSection = HEAD;
    private double userTonnage = 0;
    private double userAlpha = 0;
    private double userAlphaHeat = 0;
    private double userFirepower = 0;
    private double userHeat = 0;
    private double userRecycle = 0.00;
    private int userRange = 0;
    private double SPEED_MODIFIER = STANDARD_SPEED_MODIFIER;
    private Vector<Weapon>[] Weapons = new Vector[WEAPON_VECTOR_SIZE];
    private Vector<Item>[] Equipment = new Vector[EQUIPMENT_INDEX];
    private Vector<Item> EquipmentQueue = new Vector();
    private int[] EquipmentQueueCount = new int[30];
    private UserPreferences u;
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Default Models">
    private DefaultComboBoxModel ChassisTypeComboBoxModel = new DefaultComboBoxModel();
    private DefaultComboBoxModel ChassisModelComboBoxModel = new DefaultComboBoxModel();
    private DefaultComboBoxModel WeaponCategoryComboBoxModel = new DefaultComboBoxModel();
    private DefaultComboBoxModel EquipmentCategoryComboBoxModel = new DefaultComboBoxModel();
    
    private SpinnerNumberModel HeadArmorSpinnerModel = new SpinnerNumberModel(0, 0, 18, 1);
    private SpinnerNumberModel RightTorsoArmorSpinnerModel = new SpinnerNumberModel(0, 0, 124, 1);
    private SpinnerNumberModel LeftTorsoArmorSpinnerModel = new SpinnerNumberModel(0, 0, 124, 1);
    private SpinnerNumberModel CenterTorsoArmorSpinnerModel = new SpinnerNumberModel(0, 0, 124, 1);
    private SpinnerNumberModel RightRearTorsoArmorSpinnerModel = new SpinnerNumberModel(0, 0, 124, 1);
    private SpinnerNumberModel LeftRearTorsoArmorSpinnerModel = new SpinnerNumberModel(0, 0, 124, 1);
    private SpinnerNumberModel CenterRearTorsoArmorSpinnerModel = new SpinnerNumberModel(0, 0, 124, 1);
    private SpinnerNumberModel RightArmArmorSpinnerModel = new SpinnerNumberModel(0, 0, 124, 1);
    private SpinnerNumberModel LeftArmArmorSpinnerModel = new SpinnerNumberModel(0, 0, 124, 1);
    private SpinnerNumberModel RightLegArmorSpinnerModel = new SpinnerNumberModel(0, 0, 124, 1);
    private SpinnerNumberModel LeftLegArmorSpinnerModel = new SpinnerNumberModel(0, 0, 124, 1);
    private SpinnerNumberModel engineRatingSpinnerModel = new SpinnerNumberModel(userVariant.engineRating, 5, 400, 5);
    private SpinnerNumberModel heatSinkSpinnerModel = new SpinnerNumberModel(10, 10, 75, 1);
    
    private DefaultListModel HeadCriticalListModel = new DefaultListModel();
    private DefaultListModel RightTorsoCriticalListModel = new DefaultListModel();
    private DefaultListModel CenterTorsoCriticalListModel = new DefaultListModel();
    private DefaultListModel LeftTorsoCriticalListModel = new DefaultListModel();
    private DefaultListModel RightArmCriticalListModel = new DefaultListModel();
    private DefaultListModel LeftArmCriticalListModel = new DefaultListModel();
    private DefaultListModel RightLegCriticalListModel = new DefaultListModel();
    private DefaultListModel LeftLegCriticalListModel = new DefaultListModel();
    
    private DefaultListModel BallisticListModel = new DefaultListModel();
    private DefaultListModel EnergyListModel = new DefaultListModel();
    private DefaultListModel MissileListModel = new DefaultListModel();
    private DefaultListModel AmmoListModel = new DefaultListModel();
    private DefaultListModel EquipmentListModel = new DefaultListModel();
    private DefaultListModel EquipmentQueueListModel = new DefaultListModel();
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Efficiencies">
    private double coolRunModifier = 1.075;
    private double heatContainmentModifier = 1.0;
    private double fastFireModifier = 1.075;
    private double speedTweakModifier = 0.0;
    //</editor-fold>
    //Loading Flag
    private boolean isLoading = false;
    private boolean isSavedMech = false;
    //Temp Variables
    private String temp;
    //Parent Form Pointer
    private HubForm parent;
    //Constructor
    public CompactMechlabForm(HubForm nParent) {
        parent = nParent;
        u = new UserPreferences();
        initComponents();
        loadEquipment();
        setMechlabComboBoxes();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        GridBagConstraints gridBagConstraints;

        buttonGroup1 = new ButtonGroup();
        MechLabPanel = new JPanel();
        MechTabPane = new JTabbedPane();
        ChassisPanel = new JPanel();
        ChassisComboBox = new JComboBox();
        ModelComboBox = new JComboBox();
        VariantTextField = new JTextField();
        CapabilityPanel = new JPanel();
        UnconfirmedLabel = new JLabel();
        UnreleasedLabel = new JLabel();
        JumpLabel = new JLabel();
        ECMLabel = new JLabel();
        ItemCostBar = new JLabel();
        UpgradeCostBar = new JLabel();
        TotalCostBar = new JLabel();
        UpgradesPanel = new JPanel();
        UpgradePanel = new JPanel();
        EngineToggleButton = new JToggleButton();
        ArmorToggleButton = new JToggleButton();
        InternalsToggleButton = new JToggleButton();
        HeatSinkToggleButton = new JToggleButton();
        CockpitToggleButton = new JToggleButton();
        ArtemisToggleButton = new JToggleButton();
        MASCToggleButton = new JToggleButton();
        EfficienciesPanel = new JPanel();
        EliteModToggleButton = new JToggleButton();
        MasterModToggleButton = new JToggleButton();
        CoolRunToggleButton = new JToggleButton();
        HeatContainmentToggleButton = new JToggleButton();
        SpeedTweakToggleButton = new JToggleButton();
        FastFireToggleButton = new JToggleButton();
        HeatSinkSpinner = new JSpinner();
        EngineRatingSpinner = new JSpinner();
        WeaponPanel = new JPanel();
        WeaponButtonPanel = new JPanel();
        AddButton = new JButton();
        InfoButton = new JButton();
        EquipmentTabbedPane = new JTabbedPane();
        BallisticList = new JList();
        EnergyList = new JList();
        MissileList = new JList();
        AmmoList = new JList();
        EquipmentList = new JList();
        EquipmentQueuePanel = new JPanel();
        jPanel1 = new JPanel();
        ClearQueueButton = new JButton();
        EquipButton = new JButton();
        SelectiveAllocationButton = new JButton();
        RemoveFromQueueButton = new JButton();
        StripMechButton = new JButton();
        StripSectionButton = new JButton();
        EquipmentQueueList = new JList();
        ArmorAdjustmentPanel = new JPanel();
        PointsPerTonAmount = new JLabel();
        MaxArmorButton = new JButton();
        HeadAmountLabel = new JLabel();
        RightTorsoAmountLabel = new JLabel();
        CenterTorsoAmountLabel = new JLabel();
        LeftTorsoAmountLabel = new JLabel();
        RightArmAmountLabel = new JLabel();
        LeftArmAmountLabel = new JLabel();
        RightLegAmountLabel = new JLabel();
        LeftLegAmountLabel = new JLabel();
        TotalAmountLabel = new JLabel();
        MaxArmorButton1 = new JButton();
        HeadSpinner = new JSpinner();
        RightTorsoSpinner = new JSpinner();
        RightRearTorsoSpinner = new JSpinner();
        CenterRearTorsoSpinner = new JSpinner();
        CenterTorsoSpinner = new JSpinner();
        LeftRearTorsoSpinner = new JSpinner();
        LeftTorsoSpinner = new JSpinner();
        RightArmSpinner = new JSpinner();
        LeftArmSpinner = new JSpinner();
        RightLegSpinner = new JSpinner();
        LeftLegSpinner = new JSpinner();
        MaxArmorButton2 = new JButton();
        MaxArmorButton3 = new JButton();
        MechDisplayPanel = new JPanel();
        SectionCriticalsPanel = new JPanel();
        HeadCriticalPanel = new JPanel();
        HeadBallisticHardpointLabel = new JLabel();
        HeadEnergyHardpointLabel = new JLabel();
        HeadMissileHardpointLabel = new JLabel();
        HeadAMSHardpointLabel = new JLabel();
        HeadList = new JList();
        CenterTorsoCriticalPanel = new JPanel();
        CenterTorsoBallisticHardpointLabel = new JLabel();
        CenterTorsoEnergyHardpointLabel = new JLabel();
        CenterTorsoMissileHardpointLabel = new JLabel();
        CenterTorsoAMSHardpointLabel = new JLabel();
        CenterTorsoList = new JList();
        RightTorsoCriticalPanel = new JPanel();
        RightTorsoBallisticHardpointLabel = new JLabel();
        RightTorsoEnergyHardpointLabel = new JLabel();
        RightTorsoMissileHardpointLabel = new JLabel();
        RightTorsoAMSHardpointLabel = new JLabel();
        RightTorsoCASECheckBox = new JCheckBox();
        RightTorsoList = new JList();
        LeftTorsoCriticalPanel = new JPanel();
        LeftTorsoBallisticHardpointLabel = new JLabel();
        LeftTorsoEnergyHardpointLabel = new JLabel();
        LeftTorsoMissileHardpointLabel = new JLabel();
        LeftTorsoAMSHardpointLabel = new JLabel();
        LeftTorsoCASECheckBox = new JCheckBox();
        LeftTorsoList = new JList();
        RightArmCriticalPanel = new JPanel();
        RightArmBallisticHardpointLabel = new JLabel();
        RightArmEnergyHardpointLabel = new JLabel();
        RightArmMissileHardpointLabel = new JLabel();
        RightArmAMSHardpointLabel = new JLabel();
        RightArmList = new JList();
        LeftArmCriticalPanel = new JPanel();
        LeftArmMissileHardpointLabel = new JLabel();
        LeftArmEnergyHardpointLabel = new JLabel();
        LeftArmAMSHardpointLabel = new JLabel();
        LeftArmBallisticHardpointLabel = new JLabel();
        LeftArmList = new JList();
        RightLegCriticalPanel = new JPanel();
        RightLegBallisticHardpointLabel = new JLabel();
        RightLegEnergyHardpointLabel = new JLabel();
        RightLegMissileHardpointLabel = new JLabel();
        RightLegAMSHardpointLabel = new JLabel();
        RightLegList = new JList();
        LeftLegCriticalPanel = new JPanel();
        LeftLegBallisticHardpointLabel = new JLabel();
        LeftLegEnergyHardpointLabel = new JLabel();
        LeftLegMissileHardpointLabel = new JLabel();
        LeftLegAMSHardpointLabel = new JLabel();
        LeftLegList = new JList();
        SectionArmorPanel = new JPanel();
        HeadArmorPanel = new JPanel();
        HeadArmorProgressBar = new JProgressBar();
        HeadInternalLabel = new JProgressBar();
        CenterTorsoArmorPanel = new JPanel();
        CenterTorsoFrontPanel = new JPanel();
        CenterTorsoArmorProgressBar = new JProgressBar();
        CenterTorsoRearPanel = new JPanel();
        RearCenterTorsoArmorProgressBar = new JProgressBar();
        CenterTorsoInternalLabel = new JProgressBar();
        RightTorsoArmorPanel = new JPanel();
        RightTorsoRearPanel = new JPanel();
        RearRightTorsoArmorProgressBar = new JProgressBar();
        RightTorsoFrontPanel = new JPanel();
        RightTorsoArmorProgressBar = new JProgressBar();
        RightTorsoInternalLabel = new JProgressBar();
        LeftTorsoArmorPanel = new JPanel();
        LeftTorsoFrontPanel = new JPanel();
        LeftTorsoArmorProgressBar = new JProgressBar();
        LeftTorsoRearPanel = new JPanel();
        RearLeftTorsoArmorProgressBar = new JProgressBar();
        LeftTorsoInternalLabel = new JProgressBar();
        RightArmArmorPanel = new JPanel();
        RightArmArmorProgressBar = new JProgressBar();
        RightArmInternalLabel = new JProgressBar();
        LeftArmArmorPanel = new JPanel();
        LeftArmArmorProgressBar = new JProgressBar();
        LeftArmInternalLabel = new JProgressBar();
        RightLegArmorPanel = new JPanel();
        RightLegArmorProgressBar = new JProgressBar();
        RightLegInternalLabel = new JProgressBar();
        LeftLegArmorPanel = new JPanel();
        LeftLegArmorProgressBar = new JProgressBar();
        LeftLegInternalLabel = new JProgressBar();
        StatsPanel = new JPanel();
        HeadStatsPanel = new JPanel();
        HeadBallisticLabel = new JLabel();
        HeadEnergyLabel = new JLabel();
        HeadMissileLabel = new JLabel();
        HeadAMSLabel = new JLabel();
        CenterTorsoStatsPanel = new JPanel();
        CenterTorsoBallisticLabel = new JLabel();
        CenterTorsoEnergyLabel = new JLabel();
        CenterTorsoMissileLabel = new JLabel();
        CenterTorsoAMSLabel = new JLabel();
        RightTorsoStatsPanel = new JPanel();
        RightTorsoBallisticLabel = new JLabel();
        RightTorsoEnergyLabel = new JLabel();
        RightTorsoMissileLabel = new JLabel();
        RightTorsoAMSLabel = new JLabel();
        LeftTorsoStatsPanel = new JPanel();
        LeftTorsoBallisticLabel = new JLabel();
        LeftTorsoEnergyLabel = new JLabel();
        LeftTorsoMissileLabel = new JLabel();
        LeftTorsoAMSLabel = new JLabel();
        RightArmStatsPanel = new JPanel();
        RightArmBallisticLabel = new JLabel();
        RightArmEnergyLabel = new JLabel();
        RightArmMissileLabel = new JLabel();
        RightArmAMSLabel = new JLabel();
        LeftArmStatsPanel = new JPanel();
        LeftArmBallisticLabel = new JLabel();
        LeftArmEnergyLabel = new JLabel();
        LeftArmMissileLabel = new JLabel();
        LeftArmAMSLabel = new JLabel();
        RightLegStatsPanel = new JPanel();
        RightLegBallisticLabel = new JLabel();
        RightLegEnergyLabel = new JLabel();
        RightLegMissileLabel = new JLabel();
        RightLegAMSLabel = new JLabel();
        LeftLegStatsPanel = new JPanel();
        LeftLegBallisticLabel = new JLabel();
        LeftLegEnergyLabel = new JLabel();
        LeftLegMissileLabel = new JLabel();
        LeftLegAMSLabel = new JLabel();
        MechImage = new JLabel();
        InfoPanel = new JPanel();
        currentTonnageLabel = new JLabel();
        tonnageProgressBar = new JProgressBar();
        currentArmorLabel = new JLabel();
        currentArmorProgressBar = new JProgressBar();
        currentSpeedLabel = new JLabel();
        speedProgressBar = new JProgressBar();
        jumpDistanceLabel = new JLabel();
        jumpDistanceBar = new JProgressBar();
        firepowerLabel = new JLabel();
        firepowerProgressBar = new JProgressBar();
        heatEfficiencyLabel = new JLabel();
        heatEfficiencyProgressBar = new JProgressBar();
        RangeLabel = new JLabel();
        RangeProgressBar = new JProgressBar();
        SpecialLabel = new JLabel();
        SpecialProgressBar = new JProgressBar();
        MenuBar = new JMenuBar();
        FileMenu = new JMenu();
        SaveButton = new JMenuItem();
        LoadButton = new JMenuItem();
        ExportButton = new JMenuItem();
        PreferencesButton = new JMenuItem();
        StatsMenu = new JMenu();
        MechTreeButton = new JMenuItem();
        PilotTreeButton = new JMenuItem();
        WeaponStatsButton = new JMenuItem();
        MetricsMenu = new JMenu();
        AlphaRadioButton = new JRadioButtonMenuItem();
        BurstRadioButton = new JRadioButtonMenuItem();
        RapidRadioButton = new JRadioButtonMenuItem();
        HelpMenu = new JMenu();
        AboutButton = new JMenuItem();

        buttonGroup1.add(AlphaRadioButton);
        buttonGroup1.add(BurstRadioButton);
        buttonGroup1.add(RapidRadioButton);
        AlphaRadioButton.setSelected(true);

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Compact Mechlab");
        setLocationByPlatform(true);
        setMinimumSize(new Dimension(832, 636));
        setName("MainFrame"); // NOI18N
        setPreferredSize(new Dimension(832, 636));
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new GridBagLayout());

        MechLabPanel.setAlignmentX(0.0F);
        MechLabPanel.setAlignmentY(0.0F);
        MechLabPanel.setFont(u.titleFont);
        MechLabPanel.setMaximumSize(new Dimension(800, 600));
        MechLabPanel.setLayout(new GridBagLayout());

        MechTabPane.setAlignmentX(0.0F);
        MechTabPane.setAlignmentY(0.0F);
        MechTabPane.setFont(u.labelFont);
        MechTabPane.setMaximumSize(new Dimension(2147483647, 2147483647));
        MechTabPane.setMinimumSize(new Dimension(320, 512));
        MechTabPane.setOpaque(true);
        MechTabPane.setPreferredSize(new Dimension(320, 512));
        MechTabPane.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                MechTabPaneStateChanged(evt);
            }
        });

        ChassisPanel.setFont(u.titleFont);
        ChassisPanel.setLayout(new GridBagLayout());

        ChassisComboBox.setFont(u.labelFont);
        ChassisComboBox.setModel(ChassisTypeComboBoxModel);
        ChassisComboBox.setBorder(BorderFactory.createTitledBorder(null, "Chassis Type", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 11))); // NOI18N
        ChassisComboBox.setMaximumSize(new Dimension(300, 50));
        ChassisComboBox.setMinimumSize(new Dimension(300, 50));
        ChassisComboBox.setPreferredSize(new Dimension(300, 50));
        ChassisComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ChassisComboBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ChassisPanel.add(ChassisComboBox, gridBagConstraints);

        ModelComboBox.setFont(u.labelFont);
        ModelComboBox.setModel(ChassisModelComboBoxModel);
        ModelComboBox.setBorder(BorderFactory.createTitledBorder(null, "Chassis Model", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 11))); // NOI18N
        ModelComboBox.setMaximumSize(new Dimension(300, 50));
        ModelComboBox.setMinimumSize(new Dimension(300, 50));
        ModelComboBox.setPreferredSize(new Dimension(300, 50));
        ModelComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ModelComboBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ChassisPanel.add(ModelComboBox, gridBagConstraints);

        VariantTextField.setBackground(new Color(240, 240, 240));
        VariantTextField.setFont(u.labelFont);
        VariantTextField.setAlignmentX(0.0F);
        VariantTextField.setAlignmentY(0.0F);
        VariantTextField.setBorder(BorderFactory.createTitledBorder(new SoftBevelBorder(BevelBorder.RAISED), "Variant Name", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 11))); // NOI18N
        VariantTextField.setMaximumSize(new Dimension(300, 50));
        VariantTextField.setMinimumSize(new Dimension(300, 50));
        VariantTextField.setPreferredSize(new Dimension(300, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ChassisPanel.add(VariantTextField, gridBagConstraints);

        CapabilityPanel.setFont(u.titleFont);
        CapabilityPanel.setMinimumSize(new Dimension(300, 80));
        CapabilityPanel.setPreferredSize(new Dimension(300, 80));
        CapabilityPanel.setLayout(new GridBagLayout());

        UnconfirmedLabel.setBackground(new Color(255, 64, 64));
        UnconfirmedLabel.setFont(u.labelFont);
        UnconfirmedLabel.setForeground(new Color(240, 240, 240));
        UnconfirmedLabel.setHorizontalAlignment(SwingConstants.CENTER);
        UnconfirmedLabel.setText("UNCONFIRMED");
        UnconfirmedLabel.setAlignmentY(0.0F);
        UnconfirmedLabel.setBorder(BorderFactory.createEtchedBorder());
        UnconfirmedLabel.setMaximumSize(new Dimension(125, 25));
        UnconfirmedLabel.setMinimumSize(new Dimension(125, 25));
        UnconfirmedLabel.setOpaque(true);
        UnconfirmedLabel.setPreferredSize(new Dimension(125, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        CapabilityPanel.add(UnconfirmedLabel, gridBagConstraints);

        UnreleasedLabel.setBackground(new Color(255, 64, 64));
        UnreleasedLabel.setFont(u.labelFont);
        UnreleasedLabel.setForeground(new Color(240, 240, 240));
        UnreleasedLabel.setHorizontalAlignment(SwingConstants.CENTER);
        UnreleasedLabel.setText("UNRELEASED");
        UnreleasedLabel.setAlignmentY(0.0F);
        UnreleasedLabel.setBorder(BorderFactory.createEtchedBorder());
        UnreleasedLabel.setMaximumSize(new Dimension(125, 25));
        UnreleasedLabel.setMinimumSize(new Dimension(125, 25));
        UnreleasedLabel.setOpaque(true);
        UnreleasedLabel.setPreferredSize(new Dimension(125, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        CapabilityPanel.add(UnreleasedLabel, gridBagConstraints);

        JumpLabel.setBackground(new Color(64, 255, 64));
        JumpLabel.setFont(u.labelFont);
        JumpLabel.setForeground(new Color(240, 240, 240));
        JumpLabel.setHorizontalAlignment(SwingConstants.CENTER);
        JumpLabel.setText("JUMP CAPABLE");
        JumpLabel.setAlignmentY(0.0F);
        JumpLabel.setBorder(BorderFactory.createEtchedBorder());
        JumpLabel.setMaximumSize(new Dimension(125, 25));
        JumpLabel.setMinimumSize(new Dimension(125, 25));
        JumpLabel.setOpaque(true);
        JumpLabel.setPreferredSize(new Dimension(125, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        CapabilityPanel.add(JumpLabel, gridBagConstraints);

        ECMLabel.setBackground(new Color(64, 255, 64));
        ECMLabel.setFont(u.labelFont);
        ECMLabel.setForeground(new Color(240, 240, 240));
        ECMLabel.setHorizontalAlignment(SwingConstants.CENTER);
        ECMLabel.setText("ECM CAPABLE");
        ECMLabel.setAlignmentY(0.0F);
        ECMLabel.setBorder(BorderFactory.createEtchedBorder());
        ECMLabel.setMaximumSize(new Dimension(125, 25));
        ECMLabel.setMinimumSize(new Dimension(125, 25));
        ECMLabel.setOpaque(true);
        ECMLabel.setPreferredSize(new Dimension(125, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        CapabilityPanel.add(ECMLabel, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ChassisPanel.add(CapabilityPanel, gridBagConstraints);

        ItemCostBar.setFont(u.labelFont);
        ItemCostBar.setHorizontalAlignment(SwingConstants.CENTER);
        ItemCostBar.setAlignmentY(0.0F);
        ItemCostBar.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Item Cost", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 11), new Color(0, 0, 0))); // NOI18N
        ItemCostBar.setMaximumSize(new Dimension(300, 50));
        ItemCostBar.setMinimumSize(new Dimension(300, 50));
        ItemCostBar.setPreferredSize(new Dimension(300, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        ChassisPanel.add(ItemCostBar, gridBagConstraints);

        UpgradeCostBar.setFont(u.labelFont);
        UpgradeCostBar.setHorizontalAlignment(SwingConstants.CENTER);
        UpgradeCostBar.setAlignmentY(0.0F);
        UpgradeCostBar.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Upgrade Cost", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 11), new Color(0, 0, 0))); // NOI18N
        UpgradeCostBar.setMaximumSize(new Dimension(300, 50));
        UpgradeCostBar.setMinimumSize(new Dimension(300, 50));
        UpgradeCostBar.setPreferredSize(new Dimension(300, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        ChassisPanel.add(UpgradeCostBar, gridBagConstraints);

        TotalCostBar.setFont(u.labelFont);
        TotalCostBar.setHorizontalAlignment(SwingConstants.CENTER);
        TotalCostBar.setAlignmentY(0.0F);
        TotalCostBar.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Total Cost", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 11), new Color(0, 0, 0))); // NOI18N
        TotalCostBar.setMaximumSize(new Dimension(300, 50));
        TotalCostBar.setMinimumSize(new Dimension(300, 50));
        TotalCostBar.setPreferredSize(new Dimension(300, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        ChassisPanel.add(TotalCostBar, gridBagConstraints);

        MechTabPane.addTab("Chassis", ChassisPanel);

        UpgradesPanel.setAlignmentX(0.0F);
        UpgradesPanel.setAlignmentY(0.0F);
        UpgradesPanel.setFont(u.titleFont);
        UpgradesPanel.setLayout(new GridBagLayout());

        UpgradePanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Upgrades", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 12), Color.black)); // NOI18N
        UpgradePanel.setAlignmentX(0.0F);
        UpgradePanel.setAlignmentY(0.0F);
        UpgradePanel.setFont(u.titleFont);
        UpgradePanel.setMinimumSize(new Dimension(312, 125));
        UpgradePanel.setPreferredSize(new Dimension(312, 125));
        UpgradePanel.setLayout(new GridBagLayout());

        EngineToggleButton.setFont(u.titleFont);
        EngineToggleButton.setText("Standard Engine");
        EngineToggleButton.setAlignmentY(0.0F);
        EngineToggleButton.setMargin(new Insets(0, 0, 0, 0));
        EngineToggleButton.setMaximumSize(new Dimension(150, 25));
        EngineToggleButton.setMinimumSize(new Dimension(150, 25));
        EngineToggleButton.setPreferredSize(new Dimension(150, 25));
        EngineToggleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                EngineToggleButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        UpgradePanel.add(EngineToggleButton, gridBagConstraints);

        ArmorToggleButton.setFont(u.titleFont);
        ArmorToggleButton.setText("Standard Armor");
        ArmorToggleButton.setAlignmentY(0.0F);
        ArmorToggleButton.setMargin(new Insets(0, 0, 0, 0));
        ArmorToggleButton.setMaximumSize(new Dimension(150, 25));
        ArmorToggleButton.setMinimumSize(new Dimension(150, 25));
        ArmorToggleButton.setPreferredSize(new Dimension(150, 25));
        ArmorToggleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ArmorToggleButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        UpgradePanel.add(ArmorToggleButton, gridBagConstraints);

        InternalsToggleButton.setFont(u.titleFont);
        InternalsToggleButton.setText("Standard Internals");
        InternalsToggleButton.setAlignmentY(0.0F);
        InternalsToggleButton.setMargin(new Insets(0, 0, 0, 0));
        InternalsToggleButton.setMaximumSize(new Dimension(150, 25));
        InternalsToggleButton.setMinimumSize(new Dimension(150, 25));
        InternalsToggleButton.setPreferredSize(new Dimension(150, 25));
        InternalsToggleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                InternalsToggleButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        UpgradePanel.add(InternalsToggleButton, gridBagConstraints);

        HeatSinkToggleButton.setFont(u.titleFont);
        HeatSinkToggleButton.setText("Standard Heat Sinks");
        HeatSinkToggleButton.setAlignmentY(0.0F);
        HeatSinkToggleButton.setMargin(new Insets(0, 0, 0, 0));
        HeatSinkToggleButton.setMaximumSize(new Dimension(150, 25));
        HeatSinkToggleButton.setMinimumSize(new Dimension(150, 25));
        HeatSinkToggleButton.setPreferredSize(new Dimension(150, 25));
        HeatSinkToggleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                HeatSinkToggleButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        UpgradePanel.add(HeatSinkToggleButton, gridBagConstraints);

        CockpitToggleButton.setFont(u.titleFont);
        CockpitToggleButton.setText("Standard Cockpit");
        CockpitToggleButton.setAlignmentY(0.0F);
        CockpitToggleButton.setMargin(new Insets(0, 0, 0, 0));
        CockpitToggleButton.setMaximumSize(new Dimension(150, 25));
        CockpitToggleButton.setMinimumSize(new Dimension(150, 25));
        CockpitToggleButton.setPreferredSize(new Dimension(150, 25));
        CockpitToggleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                CockpitToggleButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        UpgradePanel.add(CockpitToggleButton, gridBagConstraints);

        ArtemisToggleButton.setFont(u.titleFont);
        ArtemisToggleButton.setText("Standard FCS");
        ArtemisToggleButton.setAlignmentY(0.0F);
        ArtemisToggleButton.setMargin(new Insets(0, 0, 0, 0));
        ArtemisToggleButton.setMaximumSize(new Dimension(150, 25));
        ArtemisToggleButton.setMinimumSize(new Dimension(150, 25));
        ArtemisToggleButton.setPreferredSize(new Dimension(150, 25));
        ArtemisToggleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ArtemisToggleButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        UpgradePanel.add(ArtemisToggleButton, gridBagConstraints);

        MASCToggleButton.setFont(u.titleFont);
        MASCToggleButton.setText("Standard Myomer");
        MASCToggleButton.setAlignmentY(0.0F);
        MASCToggleButton.setMargin(new Insets(0, 0, 0, 0));
        MASCToggleButton.setMaximumSize(new Dimension(150, 25));
        MASCToggleButton.setMinimumSize(new Dimension(150, 25));
        MASCToggleButton.setPreferredSize(new Dimension(150, 25));
        MASCToggleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                MASCToggleButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        UpgradePanel.add(MASCToggleButton, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        UpgradesPanel.add(UpgradePanel, gridBagConstraints);

        EfficienciesPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Efficiencies", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 12), Color.black)); // NOI18N
        EfficienciesPanel.setAlignmentX(0.0F);
        EfficienciesPanel.setAlignmentY(0.0F);
        EfficienciesPanel.setFont(u.titleFont);
        EfficienciesPanel.setMinimumSize(new Dimension(312, 100));
        EfficienciesPanel.setPreferredSize(new Dimension(312, 100));
        EfficienciesPanel.setLayout(new GridBagLayout());

        EliteModToggleButton.setFont(u.titleFont);
        EliteModToggleButton.setText("Elite Modifier");
        EliteModToggleButton.setAlignmentY(0.0F);
        EliteModToggleButton.setMargin(new Insets(0, 0, 0, 0));
        EliteModToggleButton.setMaximumSize(new Dimension(150, 25));
        EliteModToggleButton.setMinimumSize(new Dimension(150, 25));
        EliteModToggleButton.setPreferredSize(new Dimension(150, 25));
        EliteModToggleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                EliteModToggleButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        EfficienciesPanel.add(EliteModToggleButton, gridBagConstraints);

        MasterModToggleButton.setFont(u.titleFont);
        MasterModToggleButton.setText("Master Modifier");
        MasterModToggleButton.setAlignmentY(0.0F);
        MasterModToggleButton.setEnabled(false);
        MasterModToggleButton.setMargin(new Insets(0, 0, 0, 0));
        MasterModToggleButton.setMaximumSize(new Dimension(150, 25));
        MasterModToggleButton.setMinimumSize(new Dimension(150, 25));
        MasterModToggleButton.setPreferredSize(new Dimension(150, 25));
        MasterModToggleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                MasterModToggleButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        EfficienciesPanel.add(MasterModToggleButton, gridBagConstraints);

        CoolRunToggleButton.setFont(u.titleFont);
        CoolRunToggleButton.setText("Cool Run");
        CoolRunToggleButton.setAlignmentY(0.0F);
        CoolRunToggleButton.setMargin(new Insets(0, 0, 0, 0));
        CoolRunToggleButton.setMaximumSize(new Dimension(150, 25));
        CoolRunToggleButton.setMinimumSize(new Dimension(150, 25));
        CoolRunToggleButton.setPreferredSize(new Dimension(150, 25));
        CoolRunToggleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                CoolRunToggleButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        EfficienciesPanel.add(CoolRunToggleButton, gridBagConstraints);

        HeatContainmentToggleButton.setFont(u.titleFont);
        HeatContainmentToggleButton.setText("Heat Containment");
        HeatContainmentToggleButton.setAlignmentY(0.0F);
        HeatContainmentToggleButton.setMargin(new Insets(0, 0, 0, 0));
        HeatContainmentToggleButton.setMaximumSize(new Dimension(150, 25));
        HeatContainmentToggleButton.setMinimumSize(new Dimension(150, 25));
        HeatContainmentToggleButton.setPreferredSize(new Dimension(150, 25));
        HeatContainmentToggleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                HeatContainmentToggleButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        EfficienciesPanel.add(HeatContainmentToggleButton, gridBagConstraints);

        SpeedTweakToggleButton.setFont(u.titleFont);
        SpeedTweakToggleButton.setText("Speed Tweak");
        SpeedTweakToggleButton.setAlignmentY(0.0F);
        SpeedTweakToggleButton.setMargin(new Insets(0, 0, 0, 0));
        SpeedTweakToggleButton.setMaximumSize(new Dimension(150, 25));
        SpeedTweakToggleButton.setMinimumSize(new Dimension(150, 25));
        SpeedTweakToggleButton.setPreferredSize(new Dimension(150, 25));
        SpeedTweakToggleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SpeedTweakToggleButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        EfficienciesPanel.add(SpeedTweakToggleButton, gridBagConstraints);

        FastFireToggleButton.setFont(u.titleFont);
        FastFireToggleButton.setText("Fast Fire");
        FastFireToggleButton.setAlignmentY(0.0F);
        FastFireToggleButton.setMargin(new Insets(0, 0, 0, 0));
        FastFireToggleButton.setMaximumSize(new Dimension(150, 25));
        FastFireToggleButton.setMinimumSize(new Dimension(150, 25));
        FastFireToggleButton.setPreferredSize(new Dimension(150, 25));
        FastFireToggleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                FastFireToggleButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        EfficienciesPanel.add(FastFireToggleButton, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        UpgradesPanel.add(EfficienciesPanel, gridBagConstraints);

        HeatSinkSpinner.setFont(u.titleFont);
        HeatSinkSpinner.setModel(heatSinkSpinnerModel);
        HeatSinkSpinner.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Heat Sinks", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 12))); // NOI18N
        HeatSinkSpinner.setEditor(new NumberEditor(HeatSinkSpinner, ""));
        HeatSinkSpinner.setMinimumSize(new Dimension(120, 40));
        HeatSinkSpinner.setPreferredSize(new Dimension(120, 40));
        HeatSinkSpinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                HeatSinkSpinnerStateChanged(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        UpgradesPanel.add(HeatSinkSpinner, gridBagConstraints);

        EngineRatingSpinner.setFont(u.titleFont);
        EngineRatingSpinner.setModel(engineRatingSpinnerModel);
        EngineRatingSpinner.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Engine Rating", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 12))); // NOI18N
        EngineRatingSpinner.setEditor(new NumberEditor(EngineRatingSpinner, ""));
        EngineRatingSpinner.setMinimumSize(new Dimension(120, 40));
        EngineRatingSpinner.setPreferredSize(new Dimension(120, 40));
        EngineRatingSpinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                EngineRatingSpinnerStateChanged(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        UpgradesPanel.add(EngineRatingSpinner, gridBagConstraints);

        MechTabPane.addTab("Upgrades", UpgradesPanel);

        WeaponPanel.setFont(u.titleFont);
        WeaponPanel.setLayout(new GridBagLayout());

        WeaponButtonPanel.setFont(u.titleFont);
        WeaponButtonPanel.setMaximumSize(new Dimension(300, 100));
        WeaponButtonPanel.setMinimumSize(new Dimension(300, 100));
        WeaponButtonPanel.setPreferredSize(new Dimension(300, 100));
        WeaponButtonPanel.setLayout(new GridBagLayout());

        AddButton.setFont(u.titleFont);
        AddButton.setText("Add");
        AddButton.setMargin(new Insets(0, 0, 0, 0));
        AddButton.setMaximumSize(new Dimension(120, 30));
        AddButton.setMinimumSize(new Dimension(120, 30));
        AddButton.setPreferredSize(new Dimension(120, 30));
        AddButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        WeaponButtonPanel.add(AddButton, gridBagConstraints);

        InfoButton.setFont(u.titleFont);
        InfoButton.setText("Info");
        InfoButton.setMargin(new Insets(0, 0, 0, 0));
        InfoButton.setMaximumSize(new Dimension(120, 30));
        InfoButton.setMinimumSize(new Dimension(120, 30));
        InfoButton.setPreferredSize(new Dimension(120, 30));
        InfoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                InfoButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        WeaponButtonPanel.add(InfoButton, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        WeaponPanel.add(WeaponButtonPanel, gridBagConstraints);

        EquipmentTabbedPane.setFont(u.labelFont);
        EquipmentTabbedPane.setMinimumSize(new Dimension(300, 360));
        EquipmentTabbedPane.setPreferredSize(new Dimension(300, 360));

        BallisticList.setFont(u.titleFont);
        BallisticList.setModel(BallisticListModel);
        BallisticList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        BallisticList.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                BallisticListMouseClicked(evt);
            }
        });
        EquipmentTabbedPane.addTab("Ballistic", BallisticList);

        EnergyList.setFont(u.titleFont);
        EnergyList.setModel(EnergyListModel);
        EnergyList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        EnergyList.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                BallisticListMouseClicked(evt);
            }
        });
        EquipmentTabbedPane.addTab("Energy", EnergyList);

        MissileList.setFont(u.titleFont);
        MissileList.setModel(MissileListModel);
        MissileList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        MissileList.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                BallisticListMouseClicked(evt);
            }
        });
        EquipmentTabbedPane.addTab("Missile", MissileList);

        AmmoList.setFont(u.titleFont);
        AmmoList.setModel(AmmoListModel);
        AmmoList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        AmmoList.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                BallisticListMouseClicked(evt);
            }
        });
        EquipmentTabbedPane.addTab("Ammo", AmmoList);

        EquipmentList.setFont(u.titleFont);
        EquipmentList.setModel(EquipmentListModel);
        EquipmentList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        EquipmentList.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                BallisticListMouseClicked(evt);
            }
        });
        EquipmentTabbedPane.addTab("Other", EquipmentList);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        WeaponPanel.add(EquipmentTabbedPane, gridBagConstraints);

        MechTabPane.addTab("Equipment", WeaponPanel);

        EquipmentQueuePanel.setAlignmentX(0.0F);
        EquipmentQueuePanel.setAlignmentY(0.0F);
        EquipmentQueuePanel.setFont(u.titleFont);
        EquipmentQueuePanel.setMinimumSize(new Dimension(256, 512));
        EquipmentQueuePanel.setPreferredSize(new Dimension(256, 512));
        EquipmentQueuePanel.setLayout(new GridBagLayout());

        jPanel1.setFont(u.titleFont);
        jPanel1.setMinimumSize(new Dimension(300, 150));
        jPanel1.setPreferredSize(new Dimension(300, 150));
        jPanel1.setLayout(new GridBagLayout());

        ClearQueueButton.setFont(u.titleFont);
        ClearQueueButton.setText("Clear Queue");
        ClearQueueButton.setMargin(new Insets(0, 0, 0, 0));
        ClearQueueButton.setMaximumSize(new Dimension(120, 30));
        ClearQueueButton.setMinimumSize(new Dimension(120, 30));
        ClearQueueButton.setPreferredSize(new Dimension(120, 30));
        ClearQueueButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ClearQueueButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(ClearQueueButton, gridBagConstraints);

        EquipButton.setFont(u.titleFont);
        EquipButton.setText("Equip to Mech");
        EquipButton.setMargin(new Insets(0, 0, 0, 0));
        EquipButton.setMaximumSize(new Dimension(120, 30));
        EquipButton.setMinimumSize(new Dimension(120, 30));
        EquipButton.setPreferredSize(new Dimension(120, 30));
        EquipButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                EquipButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(EquipButton, gridBagConstraints);

        SelectiveAllocationButton.setFont(u.titleFont);
        SelectiveAllocationButton.setText("Selective Allocate");
        SelectiveAllocationButton.setMargin(new Insets(0, 0, 0, 0));
        SelectiveAllocationButton.setMaximumSize(new Dimension(120, 30));
        SelectiveAllocationButton.setMinimumSize(new Dimension(120, 30));
        SelectiveAllocationButton.setPreferredSize(new Dimension(120, 30));
        SelectiveAllocationButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SelectiveAllocationButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(SelectiveAllocationButton, gridBagConstraints);

        RemoveFromQueueButton.setFont(u.titleFont);
        RemoveFromQueueButton.setText("Remove From Queue");
        RemoveFromQueueButton.setMargin(new Insets(0, 0, 0, 0));
        RemoveFromQueueButton.setMaximumSize(new Dimension(120, 30));
        RemoveFromQueueButton.setMinimumSize(new Dimension(120, 30));
        RemoveFromQueueButton.setPreferredSize(new Dimension(120, 30));
        RemoveFromQueueButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                RemoveFromQueueButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(RemoveFromQueueButton, gridBagConstraints);

        StripMechButton.setFont(u.titleFont);
        StripMechButton.setText("Strip Mech");
        StripMechButton.setMargin(new Insets(0, 0, 0, 0));
        StripMechButton.setMaximumSize(new Dimension(120, 30));
        StripMechButton.setMinimumSize(new Dimension(120, 30));
        StripMechButton.setPreferredSize(new Dimension(120, 30));
        StripMechButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                EquipmentQueueButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(StripMechButton, gridBagConstraints);

        StripSectionButton.setFont(u.titleFont);
        StripSectionButton.setText("Strip Section");
        StripSectionButton.setMargin(new Insets(0, 0, 0, 0));
        StripSectionButton.setMaximumSize(new Dimension(120, 30));
        StripSectionButton.setMinimumSize(new Dimension(120, 30));
        StripSectionButton.setPreferredSize(new Dimension(120, 30));
        StripSectionButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                StripSectionButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(StripSectionButton, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        EquipmentQueuePanel.add(jPanel1, gridBagConstraints);

        EquipmentQueueList.setFont(u.titleFont);
        EquipmentQueueList.setModel(EquipmentQueueListModel);
        EquipmentQueueList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        EquipmentQueueList.setToolTipText("");
        EquipmentQueueList.setAlignmentX(0.0F);
        EquipmentQueueList.setAlignmentY(0.0F);
        EquipmentQueueList.setFixedCellHeight(15);
        EquipmentQueueList.setMinimumSize(new Dimension(300, 350));
        EquipmentQueueList.setPreferredSize(new Dimension(300, 350));
        EquipmentQueueList.setVisibleRowCount(20);
        EquipmentQueueList.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                EquipmentQueueListMouseClicked(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        EquipmentQueuePanel.add(EquipmentQueueList, gridBagConstraints);

        MechTabPane.addTab("Queue", EquipmentQueuePanel);

        ArmorAdjustmentPanel.setFont(u.titleFont);
        ArmorAdjustmentPanel.setLayout(new GridBagLayout());

        PointsPerTonLabel.setFont(u.titleFont);
        PointsPerTonLabel.setText("Points/Ton:");
        PointsPerTonLabel.setAlignmentY(0.0F);
        PointsPerTonLabel.setMaximumSize(new Dimension(150, 25));
        PointsPerTonLabel.setMinimumSize(new Dimension(150, 252));
        PointsPerTonLabel.setPreferredSize(new Dimension(150, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ArmorAdjustmentPanel.add(PointsPerTonLabel, gridBagConstraints);

        PointsPerTonAmount.setFont(u.titleFont);
        PointsPerTonAmount.setText("32.0");
        PointsPerTonAmount.setAlignmentY(0.0F);
        PointsPerTonAmount.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        PointsPerTonAmount.setHorizontalTextPosition(SwingConstants.LEFT);
        PointsPerTonAmount.setMaximumSize(new Dimension(150, 25));
        PointsPerTonAmount.setMinimumSize(new Dimension(150, 252));
        PointsPerTonAmount.setPreferredSize(new Dimension(150, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ArmorAdjustmentPanel.add(PointsPerTonAmount, gridBagConstraints);
        SectionLabel.setFont(u.titleFont);
        SectionLabel.setHorizontalAlignment(SwingConstants.CENTER);
        SectionLabel.setText("Section");
        SectionLabel.setAlignmentY(0.0F);
        SectionLabel.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        SectionLabel.setHorizontalTextPosition(SwingConstants.LEFT);
        SectionLabel.setMaximumSize(new Dimension(75, 25));
        SectionLabel.setMinimumSize(new Dimension(75, 25));
        SectionLabel.setPreferredSize(new Dimension(75, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ArmorAdjustmentPanel.add(SectionLabel, gridBagConstraints);
        FrontLabel.setFont(u.titleFont);
        FrontLabel.setHorizontalAlignment(SwingConstants.CENTER);
        FrontLabel.setText("Front");
        FrontLabel.setAlignmentY(0.0F);
        FrontLabel.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        FrontLabel.setHorizontalTextPosition(SwingConstants.LEFT);
        FrontLabel.setMaximumSize(new Dimension(75, 25));
        FrontLabel.setMinimumSize(new Dimension(75, 25));
        FrontLabel.setPreferredSize(new Dimension(75, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ArmorAdjustmentPanel.add(FrontLabel, gridBagConstraints);
        RearLabel.setFont(u.titleFont);
        RearLabel.setHorizontalAlignment(SwingConstants.CENTER);
        RearLabel.setText("Rear");
        RearLabel.setAlignmentY(0.0F);
        RearLabel.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        RearLabel.setHorizontalTextPosition(SwingConstants.LEFT);
        RearLabel.setMaximumSize(new Dimension(75, 25));
        RearLabel.setMinimumSize(new Dimension(75, 25));
        RearLabel.setPreferredSize(new Dimension(75, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ArmorAdjustmentPanel.add(RearLabel, gridBagConstraints);
        AmountLabel.setFont(u.titleFont);
        AmountLabel.setHorizontalAlignment(SwingConstants.CENTER);
        AmountLabel.setText("Amount");
        AmountLabel.setAlignmentY(0.0F);
        AmountLabel.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        AmountLabel.setHorizontalTextPosition(SwingConstants.LEFT);
        AmountLabel.setMaximumSize(new Dimension(75, 25));
        AmountLabel.setMinimumSize(new Dimension(75, 25));
        AmountLabel.setPreferredSize(new Dimension(75, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ArmorAdjustmentPanel.add(AmountLabel, gridBagConstraints);
        HeadLabel.setFont(u.titleFont);
        HeadLabel.setHorizontalAlignment(SwingConstants.CENTER);
        HeadLabel.setText("HD");
        HeadLabel.setAlignmentY(0.0F);
        HeadLabel.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        HeadLabel.setHorizontalTextPosition(SwingConstants.LEFT);
        HeadLabel.setMaximumSize(new Dimension(75, 25));
        HeadLabel.setMinimumSize(new Dimension(75, 25));
        HeadLabel.setPreferredSize(new Dimension(75, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ArmorAdjustmentPanel.add(HeadLabel, gridBagConstraints);
        RightTorsoLabel.setFont(u.titleFont);
        RightTorsoLabel.setHorizontalAlignment(SwingConstants.CENTER);
        RightTorsoLabel.setText("RT");
        RightTorsoLabel.setAlignmentY(0.0F);
        RightTorsoLabel.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        RightTorsoLabel.setHorizontalTextPosition(SwingConstants.LEFT);
        RightTorsoLabel.setMaximumSize(new Dimension(75, 25));
        RightTorsoLabel.setMinimumSize(new Dimension(75, 25));
        RightTorsoLabel.setPreferredSize(new Dimension(75, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ArmorAdjustmentPanel.add(RightTorsoLabel, gridBagConstraints);
        CenterTorsoLabel.setFont(u.titleFont);
        CenterTorsoLabel.setHorizontalAlignment(SwingConstants.CENTER);
        CenterTorsoLabel.setText("CT");
        CenterTorsoLabel.setAlignmentY(0.0F);
        CenterTorsoLabel.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        CenterTorsoLabel.setHorizontalTextPosition(SwingConstants.LEFT);
        CenterTorsoLabel.setMaximumSize(new Dimension(75, 25));
        CenterTorsoLabel.setMinimumSize(new Dimension(75, 25));
        CenterTorsoLabel.setPreferredSize(new Dimension(75, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ArmorAdjustmentPanel.add(CenterTorsoLabel, gridBagConstraints);
        LeftTorsoLabel.setFont(u.titleFont);
        LeftTorsoLabel.setHorizontalAlignment(SwingConstants.CENTER);
        LeftTorsoLabel.setText("LT");
        LeftTorsoLabel.setAlignmentY(0.0F);
        LeftTorsoLabel.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        LeftTorsoLabel.setHorizontalTextPosition(SwingConstants.LEFT);
        LeftTorsoLabel.setMaximumSize(new Dimension(75, 25));
        LeftTorsoLabel.setMinimumSize(new Dimension(75, 25));
        LeftTorsoLabel.setPreferredSize(new Dimension(75, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ArmorAdjustmentPanel.add(LeftTorsoLabel, gridBagConstraints);
        RightLegLabel.setFont(u.titleFont);
        RightLegLabel.setHorizontalAlignment(SwingConstants.CENTER);
        RightLegLabel.setText("RL");
        RightLegLabel.setAlignmentY(0.0F);
        RightLegLabel.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        RightLegLabel.setHorizontalTextPosition(SwingConstants.LEFT);
        RightLegLabel.setMaximumSize(new Dimension(75, 25));
        RightLegLabel.setMinimumSize(new Dimension(75, 25));
        RightLegLabel.setPreferredSize(new Dimension(75, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ArmorAdjustmentPanel.add(RightLegLabel, gridBagConstraints);
        LeftLegLabel.setFont(u.titleFont);
        LeftLegLabel.setHorizontalAlignment(SwingConstants.CENTER);
        LeftLegLabel.setText("LL");
        LeftLegLabel.setAlignmentY(0.0F);
        LeftLegLabel.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        LeftLegLabel.setHorizontalTextPosition(SwingConstants.LEFT);
        LeftLegLabel.setMaximumSize(new Dimension(75, 25));
        LeftLegLabel.setMinimumSize(new Dimension(75, 25));
        LeftLegLabel.setPreferredSize(new Dimension(75, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ArmorAdjustmentPanel.add(LeftLegLabel, gridBagConstraints);
        LeftArmLabel.setFont(u.titleFont);
        LeftArmLabel.setHorizontalAlignment(SwingConstants.CENTER);
        LeftArmLabel.setText("LA");
        LeftArmLabel.setAlignmentY(0.0F);
        LeftArmLabel.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        LeftArmLabel.setHorizontalTextPosition(SwingConstants.LEFT);
        LeftArmLabel.setMaximumSize(new Dimension(75, 25));
        LeftArmLabel.setMinimumSize(new Dimension(75, 25));
        LeftArmLabel.setPreferredSize(new Dimension(75, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ArmorAdjustmentPanel.add(LeftArmLabel, gridBagConstraints);
        RightArmLabel.setFont(u.titleFont);
        RightArmLabel.setHorizontalAlignment(SwingConstants.CENTER);
        RightArmLabel.setText("RA");
        RightArmLabel.setAlignmentY(0.0F);
        RightArmLabel.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        RightArmLabel.setHorizontalTextPosition(SwingConstants.LEFT);
        RightArmLabel.setMaximumSize(new Dimension(75, 25));
        RightArmLabel.setMinimumSize(new Dimension(75, 25));
        RightArmLabel.setPreferredSize(new Dimension(75, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ArmorAdjustmentPanel.add(RightArmLabel, gridBagConstraints);
        TotalLabel.setFont(u.titleFont);
        TotalLabel.setHorizontalAlignment(SwingConstants.CENTER);
        TotalLabel.setText("Total");
        TotalLabel.setAlignmentY(0.0F);
        TotalLabel.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        TotalLabel.setHorizontalTextPosition(SwingConstants.LEFT);
        TotalLabel.setMaximumSize(new Dimension(75, 25));
        TotalLabel.setMinimumSize(new Dimension(75, 25));
        TotalLabel.setPreferredSize(new Dimension(75, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ArmorAdjustmentPanel.add(TotalLabel, gridBagConstraints);

        MaxArmorButton.setFont(u.titleFont);
        MaxArmorButton.setText("Max Armor");
        MaxArmorButton.setAlignmentY(0.0F);
        MaxArmorButton.setPreferredSize(new Dimension(150, 25));
        MaxArmorButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                MaxArmorButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 2;
        ArmorAdjustmentPanel.add(MaxArmorButton, gridBagConstraints);

        HeadAmountLabel.setFont(u.titleFont);
        HeadAmountLabel.setHorizontalAlignment(SwingConstants.CENTER);
        HeadAmountLabel.setText("0/0");
        HeadAmountLabel.setAlignmentY(0.0F);
        HeadAmountLabel.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        HeadAmountLabel.setHorizontalTextPosition(SwingConstants.LEFT);
        HeadAmountLabel.setMaximumSize(new Dimension(75, 25));
        HeadAmountLabel.setMinimumSize(new Dimension(75, 25));
        HeadAmountLabel.setPreferredSize(new Dimension(75, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ArmorAdjustmentPanel.add(HeadAmountLabel, gridBagConstraints);

        RightTorsoAmountLabel.setFont(u.titleFont);
        RightTorsoAmountLabel.setHorizontalAlignment(SwingConstants.CENTER);
        RightTorsoAmountLabel.setText("0/0");
        RightTorsoAmountLabel.setAlignmentY(0.0F);
        RightTorsoAmountLabel.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        RightTorsoAmountLabel.setHorizontalTextPosition(SwingConstants.LEFT);
        RightTorsoAmountLabel.setMaximumSize(new Dimension(75, 25));
        RightTorsoAmountLabel.setMinimumSize(new Dimension(75, 25));
        RightTorsoAmountLabel.setPreferredSize(new Dimension(75, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ArmorAdjustmentPanel.add(RightTorsoAmountLabel, gridBagConstraints);

        CenterTorsoAmountLabel.setFont(u.titleFont);
        CenterTorsoAmountLabel.setHorizontalAlignment(SwingConstants.CENTER);
        CenterTorsoAmountLabel.setText("0/0");
        CenterTorsoAmountLabel.setAlignmentY(0.0F);
        CenterTorsoAmountLabel.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        CenterTorsoAmountLabel.setHorizontalTextPosition(SwingConstants.LEFT);
        CenterTorsoAmountLabel.setMaximumSize(new Dimension(75, 25));
        CenterTorsoAmountLabel.setMinimumSize(new Dimension(75, 25));
        CenterTorsoAmountLabel.setPreferredSize(new Dimension(75, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ArmorAdjustmentPanel.add(CenterTorsoAmountLabel, gridBagConstraints);

        LeftTorsoAmountLabel.setFont(u.titleFont);
        LeftTorsoAmountLabel.setHorizontalAlignment(SwingConstants.CENTER);
        LeftTorsoAmountLabel.setText("0/0");
        LeftTorsoAmountLabel.setAlignmentY(0.0F);
        LeftTorsoAmountLabel.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        LeftTorsoAmountLabel.setHorizontalTextPosition(SwingConstants.LEFT);
        LeftTorsoAmountLabel.setMaximumSize(new Dimension(75, 25));
        LeftTorsoAmountLabel.setMinimumSize(new Dimension(75, 25));
        LeftTorsoAmountLabel.setPreferredSize(new Dimension(75, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ArmorAdjustmentPanel.add(LeftTorsoAmountLabel, gridBagConstraints);

        RightArmAmountLabel.setFont(u.titleFont);
        RightArmAmountLabel.setHorizontalAlignment(SwingConstants.CENTER);
        RightArmAmountLabel.setText("0/0");
        RightArmAmountLabel.setAlignmentY(0.0F);
        RightArmAmountLabel.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        RightArmAmountLabel.setHorizontalTextPosition(SwingConstants.LEFT);
        RightArmAmountLabel.setMaximumSize(new Dimension(75, 25));
        RightArmAmountLabel.setMinimumSize(new Dimension(75, 25));
        RightArmAmountLabel.setPreferredSize(new Dimension(75, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ArmorAdjustmentPanel.add(RightArmAmountLabel, gridBagConstraints);

        LeftArmAmountLabel.setFont(u.titleFont);
        LeftArmAmountLabel.setHorizontalAlignment(SwingConstants.CENTER);
        LeftArmAmountLabel.setText("0/0");
        LeftArmAmountLabel.setAlignmentY(0.0F);
        LeftArmAmountLabel.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        LeftArmAmountLabel.setHorizontalTextPosition(SwingConstants.LEFT);
        LeftArmAmountLabel.setMaximumSize(new Dimension(75, 25));
        LeftArmAmountLabel.setMinimumSize(new Dimension(75, 25));
        LeftArmAmountLabel.setPreferredSize(new Dimension(75, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ArmorAdjustmentPanel.add(LeftArmAmountLabel, gridBagConstraints);

        RightLegAmountLabel.setFont(u.titleFont);
        RightLegAmountLabel.setHorizontalAlignment(SwingConstants.CENTER);
        RightLegAmountLabel.setText("0/0");
        RightLegAmountLabel.setAlignmentY(0.0F);
        RightLegAmountLabel.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        RightLegAmountLabel.setHorizontalTextPosition(SwingConstants.LEFT);
        RightLegAmountLabel.setMaximumSize(new Dimension(75, 25));
        RightLegAmountLabel.setMinimumSize(new Dimension(75, 25));
        RightLegAmountLabel.setPreferredSize(new Dimension(75, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ArmorAdjustmentPanel.add(RightLegAmountLabel, gridBagConstraints);

        LeftLegAmountLabel.setFont(u.titleFont);
        LeftLegAmountLabel.setHorizontalAlignment(SwingConstants.CENTER);
        LeftLegAmountLabel.setText("0/0");
        LeftLegAmountLabel.setAlignmentY(0.0F);
        LeftLegAmountLabel.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        LeftLegAmountLabel.setHorizontalTextPosition(SwingConstants.LEFT);
        LeftLegAmountLabel.setMaximumSize(new Dimension(75, 25));
        LeftLegAmountLabel.setMinimumSize(new Dimension(75, 25));
        LeftLegAmountLabel.setPreferredSize(new Dimension(75, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ArmorAdjustmentPanel.add(LeftLegAmountLabel, gridBagConstraints);

        TotalAmountLabel.setFont(u.titleFont);
        TotalAmountLabel.setHorizontalAlignment(SwingConstants.CENTER);
        TotalAmountLabel.setText("0/0");
        TotalAmountLabel.setAlignmentY(0.0F);
        TotalAmountLabel.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        TotalAmountLabel.setHorizontalTextPosition(SwingConstants.LEFT);
        TotalAmountLabel.setMaximumSize(new Dimension(75, 25));
        TotalAmountLabel.setMinimumSize(new Dimension(75, 25));
        TotalAmountLabel.setPreferredSize(new Dimension(75, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ArmorAdjustmentPanel.add(TotalAmountLabel, gridBagConstraints);

        MaxArmorButton1.setFont(u.titleFont);
        MaxArmorButton1.setText("Efficient Maximum");
        MaxArmorButton1.setAlignmentY(0.0F);
        MaxArmorButton1.setEnabled(false);
        MaxArmorButton1.setPreferredSize(new Dimension(150, 25));
        MaxArmorButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                MaxArmorButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 2;
        ArmorAdjustmentPanel.add(MaxArmorButton1, gridBagConstraints);

        HeadSpinner.setFont(u.titleFont);
        HeadSpinner.setModel(HeadArmorSpinnerModel);
        HeadSpinner.setMaximumSize(new Dimension(75, 25));
        HeadSpinner.setMinimumSize(new Dimension(75, 25));
        HeadSpinner.setPreferredSize(new Dimension(75, 25));
        HeadSpinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                HeadSpinnerStateChanged(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        ArmorAdjustmentPanel.add(HeadSpinner, gridBagConstraints);

        RightTorsoSpinner.setFont(u.titleFont);
        RightTorsoSpinner.setModel(RightTorsoArmorSpinnerModel);
        RightTorsoSpinner.setMaximumSize(new Dimension(75, 25));
        RightTorsoSpinner.setMinimumSize(new Dimension(75, 25));
        RightTorsoSpinner.setPreferredSize(new Dimension(75, 25));
        RightTorsoSpinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                RightTorsoSpinnerStateChanged(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        ArmorAdjustmentPanel.add(RightTorsoSpinner, gridBagConstraints);

        RightRearTorsoSpinner.setFont(u.titleFont);
        RightRearTorsoSpinner.setModel(RightRearTorsoArmorSpinnerModel);
        RightRearTorsoSpinner.setMaximumSize(new Dimension(75, 25));
        RightRearTorsoSpinner.setMinimumSize(new Dimension(75, 25));
        RightRearTorsoSpinner.setPreferredSize(new Dimension(75, 25));
        RightRearTorsoSpinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                RightRearTorsoSpinnerStateChanged(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        ArmorAdjustmentPanel.add(RightRearTorsoSpinner, gridBagConstraints);

        CenterRearTorsoSpinner.setFont(u.titleFont);
        CenterRearTorsoSpinner.setModel(CenterRearTorsoArmorSpinnerModel);
        CenterRearTorsoSpinner.setMaximumSize(new Dimension(75, 25));
        CenterRearTorsoSpinner.setMinimumSize(new Dimension(75, 25));
        CenterRearTorsoSpinner.setPreferredSize(new Dimension(75, 25));
        CenterRearTorsoSpinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                CenterRearTorsoSpinnerStateChanged(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        ArmorAdjustmentPanel.add(CenterRearTorsoSpinner, gridBagConstraints);

        CenterTorsoSpinner.setFont(u.titleFont);
        CenterTorsoSpinner.setModel(CenterTorsoArmorSpinnerModel);
        CenterTorsoSpinner.setMaximumSize(new Dimension(75, 25));
        CenterTorsoSpinner.setMinimumSize(new Dimension(75, 25));
        CenterTorsoSpinner.setPreferredSize(new Dimension(75, 25));
        CenterTorsoSpinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                CenterTorsoSpinnerStateChanged(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        ArmorAdjustmentPanel.add(CenterTorsoSpinner, gridBagConstraints);

        LeftRearTorsoSpinner.setFont(u.titleFont);
        LeftRearTorsoSpinner.setModel(LeftRearTorsoArmorSpinnerModel);
        LeftRearTorsoSpinner.setMaximumSize(new Dimension(75, 25));
        LeftRearTorsoSpinner.setMinimumSize(new Dimension(75, 25));
        LeftRearTorsoSpinner.setPreferredSize(new Dimension(75, 25));
        LeftRearTorsoSpinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                LeftRearTorsoSpinnerStateChanged(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        ArmorAdjustmentPanel.add(LeftRearTorsoSpinner, gridBagConstraints);

        LeftTorsoSpinner.setFont(u.titleFont);
        LeftTorsoSpinner.setModel(LeftTorsoArmorSpinnerModel);
        LeftTorsoSpinner.setMaximumSize(new Dimension(75, 25));
        LeftTorsoSpinner.setMinimumSize(new Dimension(75, 25));
        LeftTorsoSpinner.setPreferredSize(new Dimension(75, 25));
        LeftTorsoSpinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                LeftTorsoSpinnerStateChanged(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        ArmorAdjustmentPanel.add(LeftTorsoSpinner, gridBagConstraints);

        RightArmSpinner.setFont(u.titleFont);
        RightArmSpinner.setModel(RightArmArmorSpinnerModel);
        RightArmSpinner.setMaximumSize(new Dimension(75, 25));
        RightArmSpinner.setMinimumSize(new Dimension(75, 25));
        RightArmSpinner.setPreferredSize(new Dimension(75, 25));
        RightArmSpinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                RightArmSpinnerStateChanged(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        ArmorAdjustmentPanel.add(RightArmSpinner, gridBagConstraints);

        LeftArmSpinner.setFont(u.titleFont);
        LeftArmSpinner.setModel(LeftArmArmorSpinnerModel);
        LeftArmSpinner.setMaximumSize(new Dimension(75, 25));
        LeftArmSpinner.setMinimumSize(new Dimension(75, 25));
        LeftArmSpinner.setPreferredSize(new Dimension(75, 25));
        LeftArmSpinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                LeftArmSpinnerStateChanged(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        ArmorAdjustmentPanel.add(LeftArmSpinner, gridBagConstraints);

        RightLegSpinner.setFont(u.titleFont);
        RightLegSpinner.setModel(RightLegArmorSpinnerModel);
        RightLegSpinner.setMaximumSize(new Dimension(75, 25));
        RightLegSpinner.setMinimumSize(new Dimension(75, 25));
        RightLegSpinner.setPreferredSize(new Dimension(75, 25));
        RightLegSpinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                RightLegSpinnerStateChanged(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        ArmorAdjustmentPanel.add(RightLegSpinner, gridBagConstraints);

        LeftLegSpinner.setFont(u.titleFont);
        LeftLegSpinner.setModel(LeftLegArmorSpinnerModel);
        LeftLegSpinner.setMaximumSize(new Dimension(75, 25));
        LeftLegSpinner.setMinimumSize(new Dimension(75, 25));
        LeftLegSpinner.setPreferredSize(new Dimension(75, 25));
        LeftLegSpinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                LeftLegSpinnerStateChanged(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        ArmorAdjustmentPanel.add(LeftLegSpinner, gridBagConstraints);

        MaxArmorButton2.setFont(u.titleFont);
        MaxArmorButton2.setAlignmentY(0.0F);
        MaxArmorButton2.setEnabled(false);
        MaxArmorButton2.setPreferredSize(new Dimension(150, 25));
        MaxArmorButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                MaxArmorButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 2;
        ArmorAdjustmentPanel.add(MaxArmorButton2, gridBagConstraints);

        MaxArmorButton3.setFont(u.titleFont);
        MaxArmorButton3.setAlignmentY(0.0F);
        MaxArmorButton3.setEnabled(false);
        MaxArmorButton3.setPreferredSize(new Dimension(150, 25));
        MaxArmorButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                MaxArmorButton3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 2;
        ArmorAdjustmentPanel.add(MaxArmorButton3, gridBagConstraints);

        MechTabPane.addTab("Armor", ArmorAdjustmentPanel);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        MechLabPanel.add(MechTabPane, gridBagConstraints);

        MechDisplayPanel.setAlignmentX(0.0F);
        MechDisplayPanel.setAlignmentY(0.0F);
        MechDisplayPanel.setFont(u.titleFont);
        MechDisplayPanel.setMaximumSize(new Dimension(2147483647, 2147483647));
        MechDisplayPanel.setMinimumSize(new Dimension(512, 512));
        MechDisplayPanel.setPreferredSize(new Dimension(512, 512));
        MechDisplayPanel.setLayout(new GridBagLayout());

        SectionCriticalsPanel.setAlignmentX(0.0F);
        SectionCriticalsPanel.setAlignmentY(0.0F);
        SectionCriticalsPanel.setFont(u.titleFont);
        SectionCriticalsPanel.setMaximumSize(new Dimension(2147483647, 2147483647));
        SectionCriticalsPanel.setMinimumSize(new Dimension(512, 512));
        SectionCriticalsPanel.setOpaque(false);
        SectionCriticalsPanel.setPreferredSize(new Dimension(512, 512));
        SectionCriticalsPanel.setLayout(new GridBagLayout());

        HeadCriticalPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Head", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 10))); // NOI18N
        HeadCriticalPanel.setAlignmentX(0.0F);
        HeadCriticalPanel.setAlignmentY(0.0F);
        HeadCriticalPanel.setFont(u.titleFont);
        HeadCriticalPanel.setMaximumSize(new Dimension(1024, 1024));
        HeadCriticalPanel.setMinimumSize(new Dimension(101, 153));
        HeadCriticalPanel.setOpaque(false);
        HeadCriticalPanel.setPreferredSize(new Dimension(101, 153));
        HeadCriticalPanel.setLayout(new GridBagLayout());

        HeadBallisticHardpointLabel.setBackground(u.BALLISTIC_COLOR);
        HeadBallisticHardpointLabel.setFont(u.listFont);
        HeadBallisticHardpointLabel.setAlignmentY(0.0F);
        HeadBallisticHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        HeadBallisticHardpointLabel.setMaximumSize(new Dimension(96, 12));
        HeadBallisticHardpointLabel.setMinimumSize(new Dimension(96, 12));
        HeadBallisticHardpointLabel.setOpaque(true);
        HeadBallisticHardpointLabel.setPreferredSize(new Dimension(96, 12));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        HeadCriticalPanel.add(HeadBallisticHardpointLabel, gridBagConstraints);

        HeadEnergyHardpointLabel.setBackground(u.ENERGY_COLOR);
        HeadEnergyHardpointLabel.setFont(u.listFont);
        HeadEnergyHardpointLabel.setAlignmentY(0.0F);
        HeadEnergyHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        HeadEnergyHardpointLabel.setMaximumSize(new Dimension(96, 12));
        HeadEnergyHardpointLabel.setMinimumSize(new Dimension(96, 12));
        HeadEnergyHardpointLabel.setOpaque(true);
        HeadEnergyHardpointLabel.setPreferredSize(new Dimension(96, 12));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        HeadCriticalPanel.add(HeadEnergyHardpointLabel, gridBagConstraints);

        HeadMissileHardpointLabel.setBackground(u.MISSILE_COLOR);
        HeadMissileHardpointLabel.setFont(u.listFont);
        HeadMissileHardpointLabel.setAlignmentY(0.0F);
        HeadMissileHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        HeadMissileHardpointLabel.setMaximumSize(new Dimension(96, 12));
        HeadMissileHardpointLabel.setMinimumSize(new Dimension(96, 12));
        HeadMissileHardpointLabel.setOpaque(true);
        HeadMissileHardpointLabel.setPreferredSize(new Dimension(96, 12));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        HeadCriticalPanel.add(HeadMissileHardpointLabel, gridBagConstraints);

        HeadAMSHardpointLabel.setBackground(u.AMS_COLOR);
        HeadAMSHardpointLabel.setFont(u.listFont);
        HeadAMSHardpointLabel.setAlignmentY(0.0F);
        HeadAMSHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        HeadAMSHardpointLabel.setMaximumSize(new Dimension(96, 12));
        HeadAMSHardpointLabel.setMinimumSize(new Dimension(96, 12));
        HeadAMSHardpointLabel.setOpaque(true);
        HeadAMSHardpointLabel.setPreferredSize(new Dimension(96, 12));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        HeadCriticalPanel.add(HeadAMSHardpointLabel, gridBagConstraints);

        HeadList.setFont(u.listFont);
        HeadList.setModel(HeadCriticalListModel);
        HeadList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        HeadList.setAlignmentX(0.0F);
        HeadList.setAlignmentY(0.0F);
        HeadList.setCellRenderer(new mechCriticalRenderer(HEAD));
        HeadList.setFixedCellHeight(12);
        HeadList.setMaximumSize(new Dimension(96, 72));
        HeadList.setMinimumSize(new Dimension(96, 72));
        HeadList.setOpaque(false);
        HeadList.setPreferredSize(new Dimension(96, 72));
        HeadList.setVisibleRowCount(6);
        HeadList.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                HeadListMouseClicked(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        HeadCriticalPanel.add(HeadList, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        SectionCriticalsPanel.add(HeadCriticalPanel, gridBagConstraints);

        CenterTorsoCriticalPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Center Torso", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 10))); // NOI18N
        CenterTorsoCriticalPanel.setAlignmentX(0.0F);
        CenterTorsoCriticalPanel.setAlignmentY(0.0F);
        CenterTorsoCriticalPanel.setFont(u.titleFont);
        CenterTorsoCriticalPanel.setMaximumSize(new Dimension(1024, 1024));
        CenterTorsoCriticalPanel.setMinimumSize(new Dimension(101, 204));
        CenterTorsoCriticalPanel.setOpaque(false);
        CenterTorsoCriticalPanel.setPreferredSize(new Dimension(101, 204));
        CenterTorsoCriticalPanel.setLayout(new GridBagLayout());

        CenterTorsoBallisticHardpointLabel.setBackground(u.BALLISTIC_COLOR);
        CenterTorsoBallisticHardpointLabel.setFont(u.listFont);
        CenterTorsoBallisticHardpointLabel.setAlignmentY(0.0F);
        CenterTorsoBallisticHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        CenterTorsoBallisticHardpointLabel.setMaximumSize(new Dimension(96, 12));
        CenterTorsoBallisticHardpointLabel.setMinimumSize(new Dimension(96, 12));
        CenterTorsoBallisticHardpointLabel.setOpaque(true);
        CenterTorsoBallisticHardpointLabel.setPreferredSize(new Dimension(96, 12));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        CenterTorsoCriticalPanel.add(CenterTorsoBallisticHardpointLabel, gridBagConstraints);

        CenterTorsoEnergyHardpointLabel.setBackground(u.ENERGY_COLOR);
        CenterTorsoEnergyHardpointLabel.setFont(u.listFont);
        CenterTorsoEnergyHardpointLabel.setAlignmentY(0.0F);
        CenterTorsoEnergyHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        CenterTorsoEnergyHardpointLabel.setMaximumSize(new Dimension(96, 12));
        CenterTorsoEnergyHardpointLabel.setMinimumSize(new Dimension(96, 12));
        CenterTorsoEnergyHardpointLabel.setOpaque(true);
        CenterTorsoEnergyHardpointLabel.setPreferredSize(new Dimension(96, 12));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        CenterTorsoCriticalPanel.add(CenterTorsoEnergyHardpointLabel, gridBagConstraints);

        CenterTorsoMissileHardpointLabel.setBackground(u.MISSILE_COLOR);
        CenterTorsoMissileHardpointLabel.setFont(u.listFont);
        CenterTorsoMissileHardpointLabel.setAlignmentY(0.0F);
        CenterTorsoMissileHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        CenterTorsoMissileHardpointLabel.setMaximumSize(new Dimension(96, 12));
        CenterTorsoMissileHardpointLabel.setMinimumSize(new Dimension(96, 12));
        CenterTorsoMissileHardpointLabel.setOpaque(true);
        CenterTorsoMissileHardpointLabel.setPreferredSize(new Dimension(96, 12));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        CenterTorsoCriticalPanel.add(CenterTorsoMissileHardpointLabel, gridBagConstraints);

        CenterTorsoAMSHardpointLabel.setBackground(u.AMS_COLOR);
        CenterTorsoAMSHardpointLabel.setFont(u.listFont);
        CenterTorsoAMSHardpointLabel.setAlignmentY(0.0F);
        CenterTorsoAMSHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        CenterTorsoAMSHardpointLabel.setMaximumSize(new Dimension(96, 12));
        CenterTorsoAMSHardpointLabel.setMinimumSize(new Dimension(96, 12));
        CenterTorsoAMSHardpointLabel.setOpaque(true);
        CenterTorsoAMSHardpointLabel.setPreferredSize(new Dimension(96, 12));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        CenterTorsoCriticalPanel.add(CenterTorsoAMSHardpointLabel, gridBagConstraints);

        CenterTorsoList.setFont(u.listFont);
        CenterTorsoList.setModel(CenterTorsoCriticalListModel);
        CenterTorsoList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        CenterTorsoList.setAlignmentX(0.0F);
        CenterTorsoList.setAlignmentY(0.0F);
        CenterTorsoList.setCellRenderer(new mechCriticalRenderer(CENTER_TORSO));
        CenterTorsoList.setFixedCellHeight(12);
        CenterTorsoList.setMaximumSize(new Dimension(96, 144));
        CenterTorsoList.setMinimumSize(new Dimension(96, 144));
        CenterTorsoList.setOpaque(false);
        CenterTorsoList.setPreferredSize(new Dimension(96, 144));
        CenterTorsoList.setVisibleRowCount(12);
        CenterTorsoList.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                CenterTorsoListMouseClicked(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        CenterTorsoCriticalPanel.add(CenterTorsoList, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        SectionCriticalsPanel.add(CenterTorsoCriticalPanel, gridBagConstraints);

        RightTorsoCriticalPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Right Torso", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 10))); // NOI18N
        RightTorsoCriticalPanel.setAlignmentX(0.0F);
        RightTorsoCriticalPanel.setAlignmentY(0.0F);
        RightTorsoCriticalPanel.setFont(u.titleFont);
        RightTorsoCriticalPanel.setMaximumSize(new Dimension(1024, 1024));
        RightTorsoCriticalPanel.setMinimumSize(new Dimension(101, 216));
        RightTorsoCriticalPanel.setOpaque(false);
        RightTorsoCriticalPanel.setPreferredSize(new Dimension(101, 216));
        RightTorsoCriticalPanel.setLayout(new GridBagLayout());

        RightTorsoBallisticHardpointLabel.setBackground(u.BALLISTIC_COLOR);
        RightTorsoBallisticHardpointLabel.setFont(u.listFont);
        RightTorsoBallisticHardpointLabel.setAlignmentY(0.0F);
        RightTorsoBallisticHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        RightTorsoBallisticHardpointLabel.setMaximumSize(new Dimension(96, 12));
        RightTorsoBallisticHardpointLabel.setMinimumSize(new Dimension(96, 12));
        RightTorsoBallisticHardpointLabel.setOpaque(true);
        RightTorsoBallisticHardpointLabel.setPreferredSize(new Dimension(96, 12));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        RightTorsoCriticalPanel.add(RightTorsoBallisticHardpointLabel, gridBagConstraints);

        RightTorsoEnergyHardpointLabel.setBackground(u.ENERGY_COLOR);
        RightTorsoEnergyHardpointLabel.setFont(u.listFont);
        RightTorsoEnergyHardpointLabel.setAlignmentY(0.0F);
        RightTorsoEnergyHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        RightTorsoEnergyHardpointLabel.setMaximumSize(new Dimension(96, 12));
        RightTorsoEnergyHardpointLabel.setMinimumSize(new Dimension(96, 12));
        RightTorsoEnergyHardpointLabel.setOpaque(true);
        RightTorsoEnergyHardpointLabel.setPreferredSize(new Dimension(96, 12));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        RightTorsoCriticalPanel.add(RightTorsoEnergyHardpointLabel, gridBagConstraints);

        RightTorsoMissileHardpointLabel.setBackground(u.MISSILE_COLOR);
        RightTorsoMissileHardpointLabel.setFont(u.listFont);
        RightTorsoMissileHardpointLabel.setAlignmentY(0.0F);
        RightTorsoMissileHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        RightTorsoMissileHardpointLabel.setMaximumSize(new Dimension(96, 12));
        RightTorsoMissileHardpointLabel.setMinimumSize(new Dimension(96, 12));
        RightTorsoMissileHardpointLabel.setOpaque(true);
        RightTorsoMissileHardpointLabel.setPreferredSize(new Dimension(96, 12));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        RightTorsoCriticalPanel.add(RightTorsoMissileHardpointLabel, gridBagConstraints);

        RightTorsoAMSHardpointLabel.setBackground(u.AMS_COLOR);
        RightTorsoAMSHardpointLabel.setFont(u.listFont);
        RightTorsoAMSHardpointLabel.setAlignmentY(0.0F);
        RightTorsoAMSHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        RightTorsoAMSHardpointLabel.setMaximumSize(new Dimension(96, 12));
        RightTorsoAMSHardpointLabel.setMinimumSize(new Dimension(96, 12));
        RightTorsoAMSHardpointLabel.setOpaque(true);
        RightTorsoAMSHardpointLabel.setPreferredSize(new Dimension(96, 12));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        RightTorsoCriticalPanel.add(RightTorsoAMSHardpointLabel, gridBagConstraints);

        RightTorsoCASECheckBox.setFont(u.listFont);
        RightTorsoCASECheckBox.setAlignmentY(0.0F);
        RightTorsoCASECheckBox.setBorder(null);
        RightTorsoCASECheckBox.setContentAreaFilled(false);
        RightTorsoCASECheckBox.setHorizontalAlignment(SwingConstants.CENTER);
        RightTorsoCASECheckBox.setLabel("CASE");
        RightTorsoCASECheckBox.setMargin(new Insets(0, 0, 0, 0));
        RightTorsoCASECheckBox.setMaximumSize(new Dimension(96, 12));
        RightTorsoCASECheckBox.setMinimumSize(new Dimension(96, 12));
        RightTorsoCASECheckBox.setPreferredSize(new Dimension(96, 12));
        RightTorsoCASECheckBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                RightTorsoCASECheckBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        RightTorsoCriticalPanel.add(RightTorsoCASECheckBox, gridBagConstraints);

        RightTorsoList.setFont(u.listFont);
        RightTorsoList.setModel(RightTorsoCriticalListModel);
        RightTorsoList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        RightTorsoList.setAlignmentX(0.0F);
        RightTorsoList.setAlignmentY(0.0F);
        RightTorsoList.setCellRenderer(new mechCriticalRenderer(RIGHT_TORSO));
        RightTorsoList.setFixedCellHeight(12);
        RightTorsoList.setMaximumSize(new Dimension(96, 144));
        RightTorsoList.setMinimumSize(new Dimension(96, 144));
        RightTorsoList.setOpaque(false);
        RightTorsoList.setPreferredSize(new Dimension(96, 144));
        RightTorsoList.setVisibleRowCount(12);
        RightTorsoList.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                RightTorsoListMouseClicked(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        RightTorsoCriticalPanel.add(RightTorsoList, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        SectionCriticalsPanel.add(RightTorsoCriticalPanel, gridBagConstraints);

        LeftTorsoCriticalPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Left Torso", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 10))); // NOI18N
        LeftTorsoCriticalPanel.setAlignmentX(0.0F);
        LeftTorsoCriticalPanel.setAlignmentY(0.0F);
        LeftTorsoCriticalPanel.setFont(u.titleFont);
        LeftTorsoCriticalPanel.setMaximumSize(new Dimension(1024, 1024));
        LeftTorsoCriticalPanel.setMinimumSize(new Dimension(101, 216));
        LeftTorsoCriticalPanel.setOpaque(false);
        LeftTorsoCriticalPanel.setPreferredSize(new Dimension(101, 216));
        LeftTorsoCriticalPanel.setLayout(new GridBagLayout());

        LeftTorsoBallisticHardpointLabel.setBackground(u.BALLISTIC_COLOR);
        LeftTorsoBallisticHardpointLabel.setFont(u.listFont);
        LeftTorsoBallisticHardpointLabel.setAlignmentY(0.0F);
        LeftTorsoBallisticHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        LeftTorsoBallisticHardpointLabel.setMaximumSize(new Dimension(96, 12));
        LeftTorsoBallisticHardpointLabel.setMinimumSize(new Dimension(96, 12));
        LeftTorsoBallisticHardpointLabel.setOpaque(true);
        LeftTorsoBallisticHardpointLabel.setPreferredSize(new Dimension(96, 12));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        LeftTorsoCriticalPanel.add(LeftTorsoBallisticHardpointLabel, gridBagConstraints);

        LeftTorsoEnergyHardpointLabel.setBackground(u.ENERGY_COLOR);
        LeftTorsoEnergyHardpointLabel.setFont(u.listFont);
        LeftTorsoEnergyHardpointLabel.setAlignmentY(0.0F);
        LeftTorsoEnergyHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        LeftTorsoEnergyHardpointLabel.setMaximumSize(new Dimension(96, 12));
        LeftTorsoEnergyHardpointLabel.setMinimumSize(new Dimension(96, 12));
        LeftTorsoEnergyHardpointLabel.setOpaque(true);
        LeftTorsoEnergyHardpointLabel.setPreferredSize(new Dimension(96, 12));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        LeftTorsoCriticalPanel.add(LeftTorsoEnergyHardpointLabel, gridBagConstraints);

        LeftTorsoMissileHardpointLabel.setBackground(u.MISSILE_COLOR);
        LeftTorsoMissileHardpointLabel.setFont(u.listFont);
        LeftTorsoMissileHardpointLabel.setAlignmentY(0.0F);
        LeftTorsoMissileHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        LeftTorsoMissileHardpointLabel.setMaximumSize(new Dimension(96, 12));
        LeftTorsoMissileHardpointLabel.setMinimumSize(new Dimension(96, 12));
        LeftTorsoMissileHardpointLabel.setOpaque(true);
        LeftTorsoMissileHardpointLabel.setPreferredSize(new Dimension(96, 12));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        LeftTorsoCriticalPanel.add(LeftTorsoMissileHardpointLabel, gridBagConstraints);

        LeftTorsoAMSHardpointLabel.setBackground(u.AMS_COLOR);
        LeftTorsoAMSHardpointLabel.setFont(u.listFont);
        LeftTorsoAMSHardpointLabel.setAlignmentY(0.0F);
        LeftTorsoAMSHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        LeftTorsoAMSHardpointLabel.setMaximumSize(new Dimension(96, 12));
        LeftTorsoAMSHardpointLabel.setMinimumSize(new Dimension(96, 12));
        LeftTorsoAMSHardpointLabel.setOpaque(true);
        LeftTorsoAMSHardpointLabel.setPreferredSize(new Dimension(96, 12));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        LeftTorsoCriticalPanel.add(LeftTorsoAMSHardpointLabel, gridBagConstraints);

        LeftTorsoCASECheckBox.setFont(u.listFont);
        LeftTorsoCASECheckBox.setAlignmentY(0.0F);
        LeftTorsoCASECheckBox.setBorder(null);
        LeftTorsoCASECheckBox.setContentAreaFilled(false);
        LeftTorsoCASECheckBox.setHorizontalAlignment(SwingConstants.CENTER);
        LeftTorsoCASECheckBox.setLabel("CASE");
        LeftTorsoCASECheckBox.setMargin(new Insets(0, 0, 0, 0));
        LeftTorsoCASECheckBox.setMaximumSize(new Dimension(96, 12));
        LeftTorsoCASECheckBox.setMinimumSize(new Dimension(96, 12));
        LeftTorsoCASECheckBox.setPreferredSize(new Dimension(96, 12));
        LeftTorsoCASECheckBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                LeftTorsoCASECheckBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        LeftTorsoCriticalPanel.add(LeftTorsoCASECheckBox, gridBagConstraints);

        LeftTorsoList.setFont(u.listFont);
        LeftTorsoList.setModel(LeftTorsoCriticalListModel);
        LeftTorsoList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        LeftTorsoList.setAlignmentX(0.0F);
        LeftTorsoList.setAlignmentY(0.0F);
        LeftTorsoList.setCellRenderer(new mechCriticalRenderer(LEFT_TORSO));
        LeftTorsoList.setFixedCellHeight(12);
        LeftTorsoList.setMaximumSize(new Dimension(96, 144));
        LeftTorsoList.setMinimumSize(new Dimension(96, 144));
        LeftTorsoList.setOpaque(false);
        LeftTorsoList.setPreferredSize(new Dimension(96, 144));
        LeftTorsoList.setVisibleRowCount(12);
        LeftTorsoList.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                LeftTorsoListMouseClicked(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        LeftTorsoCriticalPanel.add(LeftTorsoList, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        SectionCriticalsPanel.add(LeftTorsoCriticalPanel, gridBagConstraints);

        RightArmCriticalPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Right Arm", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 10))); // NOI18N
        RightArmCriticalPanel.setAlignmentX(0.0F);
        RightArmCriticalPanel.setAlignmentY(0.0F);
        RightArmCriticalPanel.setFont(u.titleFont);
        RightArmCriticalPanel.setMaximumSize(new Dimension(1024, 1024));
        RightArmCriticalPanel.setMinimumSize(new Dimension(101, 204));
        RightArmCriticalPanel.setOpaque(false);
        RightArmCriticalPanel.setPreferredSize(new Dimension(101, 204));
        RightArmCriticalPanel.setLayout(new GridBagLayout());

        RightArmBallisticHardpointLabel.setBackground(u.BALLISTIC_COLOR);
        RightArmBallisticHardpointLabel.setFont(u.listFont);
        RightArmBallisticHardpointLabel.setAlignmentY(0.0F);
        RightArmBallisticHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        RightArmBallisticHardpointLabel.setMaximumSize(new Dimension(96, 12));
        RightArmBallisticHardpointLabel.setMinimumSize(new Dimension(96, 12));
        RightArmBallisticHardpointLabel.setOpaque(true);
        RightArmBallisticHardpointLabel.setPreferredSize(new Dimension(96, 12));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        RightArmCriticalPanel.add(RightArmBallisticHardpointLabel, gridBagConstraints);

        RightArmEnergyHardpointLabel.setBackground(u.ENERGY_COLOR);
        RightArmEnergyHardpointLabel.setFont(u.listFont);
        RightArmEnergyHardpointLabel.setAlignmentY(0.0F);
        RightArmEnergyHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        RightArmEnergyHardpointLabel.setMaximumSize(new Dimension(96, 12));
        RightArmEnergyHardpointLabel.setMinimumSize(new Dimension(96, 12));
        RightArmEnergyHardpointLabel.setOpaque(true);
        RightArmEnergyHardpointLabel.setPreferredSize(new Dimension(96, 12));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        RightArmCriticalPanel.add(RightArmEnergyHardpointLabel, gridBagConstraints);

        RightArmMissileHardpointLabel.setBackground(u.MISSILE_COLOR);
        RightArmMissileHardpointLabel.setFont(u.listFont);
        RightArmMissileHardpointLabel.setAlignmentY(0.0F);
        RightArmMissileHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        RightArmMissileHardpointLabel.setMaximumSize(new Dimension(96, 12));
        RightArmMissileHardpointLabel.setMinimumSize(new Dimension(96, 12));
        RightArmMissileHardpointLabel.setOpaque(true);
        RightArmMissileHardpointLabel.setPreferredSize(new Dimension(96, 12));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        RightArmCriticalPanel.add(RightArmMissileHardpointLabel, gridBagConstraints);

        RightArmAMSHardpointLabel.setBackground(u.AMS_COLOR);
        RightArmAMSHardpointLabel.setFont(u.listFont);
        RightArmAMSHardpointLabel.setAlignmentY(0.0F);
        RightArmAMSHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        RightArmAMSHardpointLabel.setMaximumSize(new Dimension(96, 12));
        RightArmAMSHardpointLabel.setMinimumSize(new Dimension(96, 12));
        RightArmAMSHardpointLabel.setOpaque(true);
        RightArmAMSHardpointLabel.setPreferredSize(new Dimension(96, 12));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        RightArmCriticalPanel.add(RightArmAMSHardpointLabel, gridBagConstraints);

        RightArmList.setFont(u.listFont);
        RightArmList.setModel(RightArmCriticalListModel);
        RightArmList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        RightArmList.setAlignmentX(0.0F);
        RightArmList.setAlignmentY(0.0F);
        RightArmList.setCellRenderer(new mechCriticalRenderer(RIGHT_ARM));
        RightArmList.setFixedCellHeight(12);
        RightArmList.setMaximumSize(new Dimension(96, 144));
        RightArmList.setMinimumSize(new Dimension(96, 144));
        RightArmList.setOpaque(false);
        RightArmList.setPreferredSize(new Dimension(96, 144));
        RightArmList.setVisibleRowCount(12);
        RightArmList.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                RightArmListMouseClicked(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        RightArmCriticalPanel.add(RightArmList, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        SectionCriticalsPanel.add(RightArmCriticalPanel, gridBagConstraints);

        LeftArmCriticalPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Left Arm", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 10))); // NOI18N
        LeftArmCriticalPanel.setAlignmentX(0.0F);
        LeftArmCriticalPanel.setAlignmentY(0.0F);
        LeftArmCriticalPanel.setFont(u.titleFont);
        LeftArmCriticalPanel.setMaximumSize(new Dimension(1024, 1024));
        LeftArmCriticalPanel.setMinimumSize(new Dimension(101, 204));
        LeftArmCriticalPanel.setOpaque(false);
        LeftArmCriticalPanel.setPreferredSize(new Dimension(101, 204));
        LeftArmCriticalPanel.setLayout(new GridBagLayout());

        LeftArmMissileHardpointLabel.setBackground(u.MISSILE_COLOR);
        LeftArmMissileHardpointLabel.setFont(u.listFont);
        LeftArmMissileHardpointLabel.setAlignmentY(0.0F);
        LeftArmMissileHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        LeftArmMissileHardpointLabel.setMaximumSize(new Dimension(96, 12));
        LeftArmMissileHardpointLabel.setMinimumSize(new Dimension(96, 12));
        LeftArmMissileHardpointLabel.setOpaque(true);
        LeftArmMissileHardpointLabel.setPreferredSize(new Dimension(96, 12));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        LeftArmCriticalPanel.add(LeftArmMissileHardpointLabel, gridBagConstraints);

        LeftArmEnergyHardpointLabel.setBackground(u.ENERGY_COLOR);
        LeftArmEnergyHardpointLabel.setFont(u.listFont);
        LeftArmEnergyHardpointLabel.setAlignmentY(0.0F);
        LeftArmEnergyHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        LeftArmEnergyHardpointLabel.setMaximumSize(new Dimension(96, 12));
        LeftArmEnergyHardpointLabel.setMinimumSize(new Dimension(96, 12));
        LeftArmEnergyHardpointLabel.setOpaque(true);
        LeftArmEnergyHardpointLabel.setPreferredSize(new Dimension(96, 12));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        LeftArmCriticalPanel.add(LeftArmEnergyHardpointLabel, gridBagConstraints);

        LeftArmAMSHardpointLabel.setBackground(u.AMS_COLOR);
        LeftArmAMSHardpointLabel.setFont(u.listFont);
        LeftArmAMSHardpointLabel.setAlignmentY(0.0F);
        LeftArmAMSHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        LeftArmAMSHardpointLabel.setMaximumSize(new Dimension(96, 12));
        LeftArmAMSHardpointLabel.setMinimumSize(new Dimension(96, 12));
        LeftArmAMSHardpointLabel.setOpaque(true);
        LeftArmAMSHardpointLabel.setPreferredSize(new Dimension(96, 12));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        LeftArmCriticalPanel.add(LeftArmAMSHardpointLabel, gridBagConstraints);

        LeftArmBallisticHardpointLabel.setBackground(u.BALLISTIC_COLOR);
        LeftArmBallisticHardpointLabel.setFont(u.listFont);
        LeftArmBallisticHardpointLabel.setAlignmentY(0.0F);
        LeftArmBallisticHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        LeftArmBallisticHardpointLabel.setMaximumSize(new Dimension(96, 12));
        LeftArmBallisticHardpointLabel.setMinimumSize(new Dimension(96, 12));
        LeftArmBallisticHardpointLabel.setOpaque(true);
        LeftArmBallisticHardpointLabel.setPreferredSize(new Dimension(96, 12));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        LeftArmCriticalPanel.add(LeftArmBallisticHardpointLabel, gridBagConstraints);

        LeftArmList.setFont(u.listFont);
        LeftArmList.setModel(LeftArmCriticalListModel);
        LeftArmList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        LeftArmList.setAlignmentX(0.0F);
        LeftArmList.setAlignmentY(0.0F);
        LeftArmList.setCellRenderer(new mechCriticalRenderer(LEFT_ARM));
        LeftArmList.setFixedCellHeight(12);
        LeftArmList.setMaximumSize(new Dimension(96, 144));
        LeftArmList.setMinimumSize(new Dimension(96, 144));
        LeftArmList.setOpaque(false);
        LeftArmList.setPreferredSize(new Dimension(96, 144));
        LeftArmList.setVisibleRowCount(12);
        LeftArmList.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                LeftArmListMouseClicked(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        LeftArmCriticalPanel.add(LeftArmList, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        SectionCriticalsPanel.add(LeftArmCriticalPanel, gridBagConstraints);

        RightLegCriticalPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Right Leg", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 10))); // NOI18N
        RightLegCriticalPanel.setAlignmentX(0.0F);
        RightLegCriticalPanel.setAlignmentY(0.0F);
        RightLegCriticalPanel.setFont(u.titleFont);
        RightLegCriticalPanel.setMaximumSize(new Dimension(1024, 1024));
        RightLegCriticalPanel.setMinimumSize(new Dimension(101, 153));
        RightLegCriticalPanel.setOpaque(false);
        RightLegCriticalPanel.setPreferredSize(new Dimension(101, 153));
        RightLegCriticalPanel.setLayout(new GridBagLayout());

        RightLegBallisticHardpointLabel.setBackground(u.BALLISTIC_COLOR);
        RightLegBallisticHardpointLabel.setFont(u.listFont);
        RightLegBallisticHardpointLabel.setAlignmentY(0.0F);
        RightLegBallisticHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        RightLegBallisticHardpointLabel.setMaximumSize(new Dimension(96, 12));
        RightLegBallisticHardpointLabel.setMinimumSize(new Dimension(96, 12));
        RightLegBallisticHardpointLabel.setOpaque(true);
        RightLegBallisticHardpointLabel.setPreferredSize(new Dimension(96, 12));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        RightLegCriticalPanel.add(RightLegBallisticHardpointLabel, gridBagConstraints);

        RightLegEnergyHardpointLabel.setBackground(u.ENERGY_COLOR);
        RightLegEnergyHardpointLabel.setFont(u.listFont);
        RightLegEnergyHardpointLabel.setAlignmentY(0.0F);
        RightLegEnergyHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        RightLegEnergyHardpointLabel.setMaximumSize(new Dimension(96, 12));
        RightLegEnergyHardpointLabel.setMinimumSize(new Dimension(96, 12));
        RightLegEnergyHardpointLabel.setOpaque(true);
        RightLegEnergyHardpointLabel.setPreferredSize(new Dimension(96, 12));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        RightLegCriticalPanel.add(RightLegEnergyHardpointLabel, gridBagConstraints);

        RightLegMissileHardpointLabel.setBackground(u.MISSILE_COLOR);
        RightLegMissileHardpointLabel.setFont(u.listFont);
        RightLegMissileHardpointLabel.setAlignmentY(0.0F);
        RightLegMissileHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        RightLegMissileHardpointLabel.setMaximumSize(new Dimension(96, 12));
        RightLegMissileHardpointLabel.setMinimumSize(new Dimension(96, 12));
        RightLegMissileHardpointLabel.setOpaque(true);
        RightLegMissileHardpointLabel.setPreferredSize(new Dimension(96, 12));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        RightLegCriticalPanel.add(RightLegMissileHardpointLabel, gridBagConstraints);

        RightLegAMSHardpointLabel.setBackground(u.AMS_COLOR);
        RightLegAMSHardpointLabel.setFont(u.listFont);
        RightLegAMSHardpointLabel.setAlignmentY(0.0F);
        RightLegAMSHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        RightLegAMSHardpointLabel.setMaximumSize(new Dimension(96, 12));
        RightLegAMSHardpointLabel.setMinimumSize(new Dimension(96, 12));
        RightLegAMSHardpointLabel.setOpaque(true);
        RightLegAMSHardpointLabel.setPreferredSize(new Dimension(96, 12));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        RightLegCriticalPanel.add(RightLegAMSHardpointLabel, gridBagConstraints);

        RightLegList.setFont(u.listFont);
        RightLegList.setModel(RightLegCriticalListModel);
        RightLegList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        RightLegList.setAlignmentX(0.0F);
        RightLegList.setAlignmentY(0.0F);
        RightLegList.setCellRenderer(new mechCriticalRenderer(RIGHT_LEG));
        RightLegList.setFixedCellHeight(12);
        RightLegList.setMaximumSize(new Dimension(96, 72));
        RightLegList.setMinimumSize(new Dimension(96, 72));
        RightLegList.setOpaque(false);
        RightLegList.setPreferredSize(new Dimension(96, 72));
        RightLegList.setVisibleRowCount(6);
        RightLegList.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                RightLegListMouseClicked(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        RightLegCriticalPanel.add(RightLegList, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        SectionCriticalsPanel.add(RightLegCriticalPanel, gridBagConstraints);

        LeftLegCriticalPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Left Leg", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 10))); // NOI18N
        LeftLegCriticalPanel.setAlignmentX(0.0F);
        LeftLegCriticalPanel.setAlignmentY(0.0F);
        LeftLegCriticalPanel.setFont(u.titleFont);
        LeftLegCriticalPanel.setMaximumSize(new Dimension(1024, 1024));
        LeftLegCriticalPanel.setMinimumSize(new Dimension(101, 153));
        LeftLegCriticalPanel.setOpaque(false);
        LeftLegCriticalPanel.setPreferredSize(new Dimension(101, 153));
        LeftLegCriticalPanel.setLayout(new GridBagLayout());

        LeftLegBallisticHardpointLabel.setBackground(u.BALLISTIC_COLOR);
        LeftLegBallisticHardpointLabel.setFont(u.listFont);
        LeftLegBallisticHardpointLabel.setAlignmentY(0.0F);
        LeftLegBallisticHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        LeftLegBallisticHardpointLabel.setMaximumSize(new Dimension(96, 12));
        LeftLegBallisticHardpointLabel.setMinimumSize(new Dimension(96, 12));
        LeftLegBallisticHardpointLabel.setOpaque(true);
        LeftLegBallisticHardpointLabel.setPreferredSize(new Dimension(96, 12));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        LeftLegCriticalPanel.add(LeftLegBallisticHardpointLabel, gridBagConstraints);

        LeftLegEnergyHardpointLabel.setBackground(u.ENERGY_COLOR);
        LeftLegEnergyHardpointLabel.setFont(u.listFont);
        LeftLegEnergyHardpointLabel.setAlignmentY(0.0F);
        LeftLegEnergyHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        LeftLegEnergyHardpointLabel.setMaximumSize(new Dimension(96, 12));
        LeftLegEnergyHardpointLabel.setMinimumSize(new Dimension(96, 12));
        LeftLegEnergyHardpointLabel.setOpaque(true);
        LeftLegEnergyHardpointLabel.setPreferredSize(new Dimension(96, 12));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        LeftLegCriticalPanel.add(LeftLegEnergyHardpointLabel, gridBagConstraints);

        LeftLegMissileHardpointLabel.setBackground(u.MISSILE_COLOR);
        LeftLegMissileHardpointLabel.setFont(u.listFont);
        LeftLegMissileHardpointLabel.setAlignmentY(0.0F);
        LeftLegMissileHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        LeftLegMissileHardpointLabel.setMaximumSize(new Dimension(96, 12));
        LeftLegMissileHardpointLabel.setMinimumSize(new Dimension(96, 12));
        LeftLegMissileHardpointLabel.setOpaque(true);
        LeftLegMissileHardpointLabel.setPreferredSize(new Dimension(96, 12));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        LeftLegCriticalPanel.add(LeftLegMissileHardpointLabel, gridBagConstraints);

        LeftLegAMSHardpointLabel.setBackground(u.AMS_COLOR);
        LeftLegAMSHardpointLabel.setFont(u.listFont);
        LeftLegAMSHardpointLabel.setAlignmentY(0.0F);
        LeftLegAMSHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        LeftLegAMSHardpointLabel.setMaximumSize(new Dimension(96, 12));
        LeftLegAMSHardpointLabel.setMinimumSize(new Dimension(96, 12));
        LeftLegAMSHardpointLabel.setOpaque(true);
        LeftLegAMSHardpointLabel.setPreferredSize(new Dimension(96, 12));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        LeftLegCriticalPanel.add(LeftLegAMSHardpointLabel, gridBagConstraints);

        LeftLegList.setFont(u.listFont);
        LeftLegList.setModel(LeftLegCriticalListModel);
        LeftLegList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        LeftLegList.setAlignmentX(0.0F);
        LeftLegList.setAlignmentY(0.0F);
        LeftLegList.setCellRenderer(new mechCriticalRenderer(LEFT_LEG));
        LeftLegList.setFixedCellHeight(12);
        LeftLegList.setMaximumSize(new Dimension(96, 72));
        LeftLegList.setMinimumSize(new Dimension(96, 72));
        LeftLegList.setOpaque(false);
        LeftLegList.setPreferredSize(new Dimension(96, 72));
        LeftLegList.setVisibleRowCount(6);
        LeftLegList.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                LeftLegListMouseClicked(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        LeftLegCriticalPanel.add(LeftLegList, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        SectionCriticalsPanel.add(LeftLegCriticalPanel, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        MechDisplayPanel.add(SectionCriticalsPanel, gridBagConstraints);

        SectionArmorPanel.setAlignmentX(0.0F);
        SectionArmorPanel.setAlignmentY(0.0F);
        SectionArmorPanel.setFont(u.titleFont);
        SectionArmorPanel.setMaximumSize(new Dimension(2147483647, 2147483647));
        SectionArmorPanel.setMinimumSize(new Dimension(512, 512));
        SectionArmorPanel.setOpaque(false);
        SectionArmorPanel.setPreferredSize(new Dimension(512, 512));
        SectionArmorPanel.setLayout(new GridBagLayout());

        HeadArmorPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Head", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 10))); // NOI18N
        HeadArmorPanel.setAlignmentX(0.0F);
        HeadArmorPanel.setAlignmentY(0.0F);
        HeadArmorPanel.setFont(u.titleFont);
        HeadArmorPanel.setMaximumSize(new Dimension(96, 160));
        HeadArmorPanel.setMinimumSize(new Dimension(96, 160));
        HeadArmorPanel.setOpaque(false);
        HeadArmorPanel.setPreferredSize(new Dimension(96, 160));
        HeadArmorPanel.setLayout(new GridBagLayout());

        HeadArmorProgressBar.setFont(u.listFont);
        HeadArmorProgressBar.setForeground(u.ARMOR_COLOR);
        HeadArmorProgressBar.setAlignmentX(0.0F);
        HeadArmorProgressBar.setAlignmentY(0.0F);
        HeadArmorProgressBar.setMaximumSize(new Dimension(80, 20));
        HeadArmorProgressBar.setMinimumSize(new Dimension(80, 20));
        HeadArmorProgressBar.setPreferredSize(new Dimension(80, 20));
        HeadArmorProgressBar.setString("0");
        HeadArmorProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        HeadArmorPanel.add(HeadArmorProgressBar, gridBagConstraints);

        HeadInternalLabel.setFont(u.listFont);
        HeadInternalLabel.setForeground(u.INTERNAL_COLOR);
        HeadInternalLabel.setToolTipText("");
        HeadInternalLabel.setValue(100);
        HeadInternalLabel.setMaximumSize(new Dimension(80, 20));
        HeadInternalLabel.setMinimumSize(new Dimension(80, 20));
        HeadInternalLabel.setPreferredSize(new Dimension(80, 20));
        HeadInternalLabel.setString("0");
        HeadInternalLabel.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        HeadArmorPanel.add(HeadInternalLabel, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        SectionArmorPanel.add(HeadArmorPanel, gridBagConstraints);

        CenterTorsoArmorPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Center Torso", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 10))); // NOI18N
        CenterTorsoArmorPanel.setAlignmentX(0.0F);
        CenterTorsoArmorPanel.setAlignmentY(0.0F);
        CenterTorsoArmorPanel.setFont(u.titleFont);
        CenterTorsoArmorPanel.setMaximumSize(new Dimension(96, 160));
        CenterTorsoArmorPanel.setMinimumSize(new Dimension(96, 160));
        CenterTorsoArmorPanel.setOpaque(false);
        CenterTorsoArmorPanel.setPreferredSize(new Dimension(96, 160));
        CenterTorsoArmorPanel.setLayout(new GridBagLayout());

        CenterTorsoFrontPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Front", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 10))); // NOI18N
        CenterTorsoFrontPanel.setFont(u.titleFont);
        CenterTorsoFrontPanel.setLayout(new GridBagLayout());

        CenterTorsoArmorProgressBar.setFont(u.listFont);
        CenterTorsoArmorProgressBar.setForeground(u.ARMOR_COLOR);
        CenterTorsoArmorProgressBar.setAlignmentX(0.0F);
        CenterTorsoArmorProgressBar.setAlignmentY(0.0F);
        CenterTorsoArmorProgressBar.setMaximumSize(new Dimension(80, 20));
        CenterTorsoArmorProgressBar.setMinimumSize(new Dimension(80, 20));
        CenterTorsoArmorProgressBar.setPreferredSize(new Dimension(80, 20));
        CenterTorsoArmorProgressBar.setString("0");
        CenterTorsoArmorProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        CenterTorsoFrontPanel.add(CenterTorsoArmorProgressBar, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        CenterTorsoArmorPanel.add(CenterTorsoFrontPanel, gridBagConstraints);

        CenterTorsoRearPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Rear", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 10))); // NOI18N
        CenterTorsoRearPanel.setFont(u.titleFont);
        CenterTorsoRearPanel.setLayout(new GridBagLayout());

        RearCenterTorsoArmorProgressBar.setFont(u.listFont);
        RearCenterTorsoArmorProgressBar.setForeground(u.ARMOR_COLOR);
        RearCenterTorsoArmorProgressBar.setAlignmentX(0.0F);
        RearCenterTorsoArmorProgressBar.setAlignmentY(0.0F);
        RearCenterTorsoArmorProgressBar.setMaximumSize(new Dimension(80, 20));
        RearCenterTorsoArmorProgressBar.setMinimumSize(new Dimension(80, 20));
        RearCenterTorsoArmorProgressBar.setPreferredSize(new Dimension(80, 20));
        RearCenterTorsoArmorProgressBar.setString("0");
        RearCenterTorsoArmorProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        CenterTorsoRearPanel.add(RearCenterTorsoArmorProgressBar, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        CenterTorsoArmorPanel.add(CenterTorsoRearPanel, gridBagConstraints);

        CenterTorsoInternalLabel.setFont(u.listFont);
        CenterTorsoInternalLabel.setForeground(u.INTERNAL_COLOR);
        CenterTorsoInternalLabel.setToolTipText("");
        CenterTorsoInternalLabel.setValue(100);
        CenterTorsoInternalLabel.setMaximumSize(new Dimension(80, 20));
        CenterTorsoInternalLabel.setMinimumSize(new Dimension(80, 20));
        CenterTorsoInternalLabel.setPreferredSize(new Dimension(80, 20));
        CenterTorsoInternalLabel.setString("0");
        CenterTorsoInternalLabel.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        CenterTorsoArmorPanel.add(CenterTorsoInternalLabel, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        SectionArmorPanel.add(CenterTorsoArmorPanel, gridBagConstraints);

        RightTorsoArmorPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Right Torso", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 10))); // NOI18N
        RightTorsoArmorPanel.setAlignmentX(0.0F);
        RightTorsoArmorPanel.setAlignmentY(0.0F);
        RightTorsoArmorPanel.setFont(u.titleFont);
        RightTorsoArmorPanel.setMaximumSize(new Dimension(96, 160));
        RightTorsoArmorPanel.setMinimumSize(new Dimension(96, 160));
        RightTorsoArmorPanel.setOpaque(false);
        RightTorsoArmorPanel.setPreferredSize(new Dimension(96, 160));
        RightTorsoArmorPanel.setLayout(new GridBagLayout());

        RightTorsoRearPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Rear", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 10))); // NOI18N
        RightTorsoRearPanel.setFont(u.titleFont);
        RightTorsoRearPanel.setLayout(new GridBagLayout());

        RearRightTorsoArmorProgressBar.setFont(u.listFont);
        RearRightTorsoArmorProgressBar.setForeground(u.ARMOR_COLOR);
        RearRightTorsoArmorProgressBar.setAlignmentX(0.0F);
        RearRightTorsoArmorProgressBar.setAlignmentY(0.0F);
        RearRightTorsoArmorProgressBar.setMaximumSize(new Dimension(80, 20));
        RearRightTorsoArmorProgressBar.setMinimumSize(new Dimension(80, 20));
        RearRightTorsoArmorProgressBar.setPreferredSize(new Dimension(80, 20));
        RearRightTorsoArmorProgressBar.setString("0");
        RearRightTorsoArmorProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        RightTorsoRearPanel.add(RearRightTorsoArmorProgressBar, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        RightTorsoArmorPanel.add(RightTorsoRearPanel, gridBagConstraints);

        RightTorsoFrontPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Front", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 10))); // NOI18N
        RightTorsoFrontPanel.setFont(u.titleFont);
        RightTorsoFrontPanel.setLayout(new GridBagLayout());

        RightTorsoArmorProgressBar.setFont(u.listFont);
        RightTorsoArmorProgressBar.setForeground(u.ARMOR_COLOR);
        RightTorsoArmorProgressBar.setAlignmentX(0.0F);
        RightTorsoArmorProgressBar.setAlignmentY(0.0F);
        RightTorsoArmorProgressBar.setMaximumSize(new Dimension(80, 20));
        RightTorsoArmorProgressBar.setMinimumSize(new Dimension(80, 20));
        RightTorsoArmorProgressBar.setPreferredSize(new Dimension(80, 20));
        RightTorsoArmorProgressBar.setString("0");
        RightTorsoArmorProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        RightTorsoFrontPanel.add(RightTorsoArmorProgressBar, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        RightTorsoArmorPanel.add(RightTorsoFrontPanel, gridBagConstraints);

        RightTorsoInternalLabel.setFont(u.listFont);
        RightTorsoInternalLabel.setForeground(u.INTERNAL_COLOR);
        RightTorsoInternalLabel.setToolTipText("");
        RightTorsoInternalLabel.setValue(100);
        RightTorsoInternalLabel.setMaximumSize(new Dimension(80, 20));
        RightTorsoInternalLabel.setMinimumSize(new Dimension(80, 20));
        RightTorsoInternalLabel.setPreferredSize(new Dimension(80, 20));
        RightTorsoInternalLabel.setString("0");
        RightTorsoInternalLabel.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        RightTorsoArmorPanel.add(RightTorsoInternalLabel, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        SectionArmorPanel.add(RightTorsoArmorPanel, gridBagConstraints);

        LeftTorsoArmorPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Left Torso", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 10))); // NOI18N
        LeftTorsoArmorPanel.setAlignmentX(0.0F);
        LeftTorsoArmorPanel.setAlignmentY(0.0F);
        LeftTorsoArmorPanel.setFont(u.titleFont);
        LeftTorsoArmorPanel.setMaximumSize(new Dimension(96, 160));
        LeftTorsoArmorPanel.setMinimumSize(new Dimension(96, 160));
        LeftTorsoArmorPanel.setOpaque(false);
        LeftTorsoArmorPanel.setPreferredSize(new Dimension(96, 160));
        LeftTorsoArmorPanel.setLayout(new GridBagLayout());

        LeftTorsoFrontPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Front", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 10))); // NOI18N
        LeftTorsoFrontPanel.setFont(u.titleFont);
        LeftTorsoFrontPanel.setLayout(new GridBagLayout());

        LeftTorsoArmorProgressBar.setFont(u.listFont);
        LeftTorsoArmorProgressBar.setForeground(u.ARMOR_COLOR);
        LeftTorsoArmorProgressBar.setAlignmentX(0.0F);
        LeftTorsoArmorProgressBar.setAlignmentY(0.0F);
        LeftTorsoArmorProgressBar.setMaximumSize(new Dimension(80, 20));
        LeftTorsoArmorProgressBar.setMinimumSize(new Dimension(80, 20));
        LeftTorsoArmorProgressBar.setPreferredSize(new Dimension(80, 20));
        LeftTorsoArmorProgressBar.setString("0");
        LeftTorsoArmorProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        LeftTorsoFrontPanel.add(LeftTorsoArmorProgressBar, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        LeftTorsoArmorPanel.add(LeftTorsoFrontPanel, gridBagConstraints);

        LeftTorsoRearPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Rear", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 10))); // NOI18N
        LeftTorsoRearPanel.setFont(u.titleFont);
        LeftTorsoRearPanel.setLayout(new GridBagLayout());

        RearLeftTorsoArmorProgressBar.setFont(u.listFont);
        RearLeftTorsoArmorProgressBar.setForeground(u.ARMOR_COLOR);
        RearLeftTorsoArmorProgressBar.setAlignmentX(0.0F);
        RearLeftTorsoArmorProgressBar.setAlignmentY(0.0F);
        RearLeftTorsoArmorProgressBar.setMaximumSize(new Dimension(80, 20));
        RearLeftTorsoArmorProgressBar.setMinimumSize(new Dimension(80, 20));
        RearLeftTorsoArmorProgressBar.setPreferredSize(new Dimension(80, 20));
        RearLeftTorsoArmorProgressBar.setString("0");
        RearLeftTorsoArmorProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        LeftTorsoRearPanel.add(RearLeftTorsoArmorProgressBar, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        LeftTorsoArmorPanel.add(LeftTorsoRearPanel, gridBagConstraints);

        LeftTorsoInternalLabel.setFont(u.listFont);
        LeftTorsoInternalLabel.setForeground(u.INTERNAL_COLOR);
        LeftTorsoInternalLabel.setToolTipText("");
        LeftTorsoInternalLabel.setValue(100);
        LeftTorsoInternalLabel.setMaximumSize(new Dimension(80, 20));
        LeftTorsoInternalLabel.setMinimumSize(new Dimension(80, 20));
        LeftTorsoInternalLabel.setPreferredSize(new Dimension(80, 20));
        LeftTorsoInternalLabel.setString("0");
        LeftTorsoInternalLabel.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        LeftTorsoArmorPanel.add(LeftTorsoInternalLabel, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        SectionArmorPanel.add(LeftTorsoArmorPanel, gridBagConstraints);

        RightArmArmorPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Right Arm", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 10))); // NOI18N
        RightArmArmorPanel.setAlignmentX(0.0F);
        RightArmArmorPanel.setAlignmentY(0.0F);
        RightArmArmorPanel.setFont(u.titleFont);
        RightArmArmorPanel.setMaximumSize(new Dimension(96, 160));
        RightArmArmorPanel.setMinimumSize(new Dimension(96, 160));
        RightArmArmorPanel.setOpaque(false);
        RightArmArmorPanel.setPreferredSize(new Dimension(96, 160));
        RightArmArmorPanel.setLayout(new GridBagLayout());

        RightArmArmorProgressBar.setFont(u.listFont);
        RightArmArmorProgressBar.setForeground(u.ARMOR_COLOR);
        RightArmArmorProgressBar.setAlignmentX(0.0F);
        RightArmArmorProgressBar.setAlignmentY(0.0F);
        RightArmArmorProgressBar.setMaximumSize(new Dimension(80, 20));
        RightArmArmorProgressBar.setMinimumSize(new Dimension(80, 20));
        RightArmArmorProgressBar.setPreferredSize(new Dimension(80, 20));
        RightArmArmorProgressBar.setString("0");
        RightArmArmorProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        RightArmArmorPanel.add(RightArmArmorProgressBar, gridBagConstraints);

        RightArmInternalLabel.setFont(u.listFont);
        RightArmInternalLabel.setForeground(u.INTERNAL_COLOR);
        RightArmInternalLabel.setToolTipText("");
        RightArmInternalLabel.setValue(100);
        RightArmInternalLabel.setMaximumSize(new Dimension(80, 20));
        RightArmInternalLabel.setMinimumSize(new Dimension(80, 20));
        RightArmInternalLabel.setPreferredSize(new Dimension(80, 20));
        RightArmInternalLabel.setString("0");
        RightArmInternalLabel.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        RightArmArmorPanel.add(RightArmInternalLabel, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        SectionArmorPanel.add(RightArmArmorPanel, gridBagConstraints);

        LeftArmArmorPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Left Arm", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 10))); // NOI18N
        LeftArmArmorPanel.setAlignmentX(0.0F);
        LeftArmArmorPanel.setAlignmentY(0.0F);
        LeftArmArmorPanel.setFont(u.titleFont);
        LeftArmArmorPanel.setMaximumSize(new Dimension(96, 160));
        LeftArmArmorPanel.setMinimumSize(new Dimension(96, 160));
        LeftArmArmorPanel.setOpaque(false);
        LeftArmArmorPanel.setPreferredSize(new Dimension(96, 160));
        LeftArmArmorPanel.setLayout(new GridBagLayout());

        LeftArmArmorProgressBar.setFont(u.listFont);
        LeftArmArmorProgressBar.setForeground(u.ARMOR_COLOR);
        LeftArmArmorProgressBar.setAlignmentX(0.0F);
        LeftArmArmorProgressBar.setAlignmentY(0.0F);
        LeftArmArmorProgressBar.setMaximumSize(new Dimension(80, 20));
        LeftArmArmorProgressBar.setMinimumSize(new Dimension(80, 20));
        LeftArmArmorProgressBar.setPreferredSize(new Dimension(80, 20));
        LeftArmArmorProgressBar.setString("0");
        LeftArmArmorProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        LeftArmArmorPanel.add(LeftArmArmorProgressBar, gridBagConstraints);

        LeftArmInternalLabel.setFont(u.listFont);
        LeftArmInternalLabel.setForeground(u.INTERNAL_COLOR);
        LeftArmInternalLabel.setToolTipText("");
        LeftArmInternalLabel.setValue(100);
        LeftArmInternalLabel.setMaximumSize(new Dimension(80, 20));
        LeftArmInternalLabel.setMinimumSize(new Dimension(80, 20));
        LeftArmInternalLabel.setPreferredSize(new Dimension(80, 20));
        LeftArmInternalLabel.setString("0");
        LeftArmInternalLabel.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        LeftArmArmorPanel.add(LeftArmInternalLabel, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        SectionArmorPanel.add(LeftArmArmorPanel, gridBagConstraints);

        RightLegArmorPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Right Leg", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 10))); // NOI18N
        RightLegArmorPanel.setAlignmentX(0.0F);
        RightLegArmorPanel.setAlignmentY(0.0F);
        RightLegArmorPanel.setFont(u.titleFont);
        RightLegArmorPanel.setMaximumSize(new Dimension(96, 160));
        RightLegArmorPanel.setMinimumSize(new Dimension(96, 160));
        RightLegArmorPanel.setOpaque(false);
        RightLegArmorPanel.setPreferredSize(new Dimension(96, 160));
        RightLegArmorPanel.setLayout(new GridBagLayout());

        RightLegArmorProgressBar.setFont(u.listFont);
        RightLegArmorProgressBar.setForeground(u.ARMOR_COLOR);
        RightLegArmorProgressBar.setAlignmentX(0.0F);
        RightLegArmorProgressBar.setAlignmentY(0.0F);
        RightLegArmorProgressBar.setMaximumSize(new Dimension(80, 20));
        RightLegArmorProgressBar.setMinimumSize(new Dimension(80, 20));
        RightLegArmorProgressBar.setPreferredSize(new Dimension(80, 20));
        RightLegArmorProgressBar.setString("0");
        RightLegArmorProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        RightLegArmorPanel.add(RightLegArmorProgressBar, gridBagConstraints);

        RightLegInternalLabel.setFont(u.listFont);
        RightLegInternalLabel.setForeground(u.INTERNAL_COLOR);
        RightLegInternalLabel.setToolTipText("");
        RightLegInternalLabel.setValue(100);
        RightLegInternalLabel.setMaximumSize(new Dimension(80, 20));
        RightLegInternalLabel.setMinimumSize(new Dimension(80, 20));
        RightLegInternalLabel.setPreferredSize(new Dimension(80, 20));
        RightLegInternalLabel.setString("0");
        RightLegInternalLabel.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        RightLegArmorPanel.add(RightLegInternalLabel, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        SectionArmorPanel.add(RightLegArmorPanel, gridBagConstraints);

        LeftLegArmorPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Left Leg", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 10))); // NOI18N
        LeftLegArmorPanel.setAlignmentX(0.0F);
        LeftLegArmorPanel.setAlignmentY(0.0F);
        LeftLegArmorPanel.setFont(u.titleFont);
        LeftLegArmorPanel.setMaximumSize(new Dimension(96, 160));
        LeftLegArmorPanel.setMinimumSize(new Dimension(96, 160));
        LeftLegArmorPanel.setOpaque(false);
        LeftLegArmorPanel.setPreferredSize(new Dimension(96, 160));
        LeftLegArmorPanel.setLayout(new GridBagLayout());

        LeftLegArmorProgressBar.setFont(u.listFont);
        LeftLegArmorProgressBar.setForeground(u.ARMOR_COLOR);
        LeftLegArmorProgressBar.setAlignmentX(0.0F);
        LeftLegArmorProgressBar.setAlignmentY(0.0F);
        LeftLegArmorProgressBar.setMaximumSize(new Dimension(80, 20));
        LeftLegArmorProgressBar.setMinimumSize(new Dimension(80, 20));
        LeftLegArmorProgressBar.setPreferredSize(new Dimension(80, 20));
        LeftLegArmorProgressBar.setString("0");
        LeftLegArmorProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        LeftLegArmorPanel.add(LeftLegArmorProgressBar, gridBagConstraints);

        LeftLegInternalLabel.setFont(u.listFont);
        LeftLegInternalLabel.setForeground(u.INTERNAL_COLOR);
        LeftLegInternalLabel.setToolTipText("");
        LeftLegInternalLabel.setValue(100);
        LeftLegInternalLabel.setMaximumSize(new Dimension(80, 20));
        LeftLegInternalLabel.setMinimumSize(new Dimension(80, 20));
        LeftLegInternalLabel.setPreferredSize(new Dimension(80, 20));
        LeftLegInternalLabel.setString("0");
        LeftLegInternalLabel.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        LeftLegArmorPanel.add(LeftLegInternalLabel, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        SectionArmorPanel.add(LeftLegArmorPanel, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        MechDisplayPanel.add(SectionArmorPanel, gridBagConstraints);

        StatsPanel.setAlignmentX(0.0F);
        StatsPanel.setAlignmentY(0.0F);
        StatsPanel.setFont(u.titleFont);
        StatsPanel.setMaximumSize(new Dimension(2147483647, 2147483647));
        StatsPanel.setMinimumSize(new Dimension(512, 512));
        StatsPanel.setOpaque(false);
        StatsPanel.setPreferredSize(new Dimension(512, 512));
        StatsPanel.setLayout(new GridBagLayout());

        HeadStatsPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Head", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 10))); // NOI18N
        HeadStatsPanel.setAlignmentX(0.0F);
        HeadStatsPanel.setAlignmentY(0.0F);
        HeadStatsPanel.setFont(u.titleFont);
        HeadStatsPanel.setMaximumSize(new Dimension(96, 160));
        HeadStatsPanel.setMinimumSize(new Dimension(96, 160));
        HeadStatsPanel.setOpaque(false);
        HeadStatsPanel.setPreferredSize(new Dimension(96, 160));
        HeadStatsPanel.setLayout(new GridBagLayout());

        HeadBallisticLabel.setFont(u.titleFont);
        HeadBallisticLabel.setHorizontalAlignment(SwingConstants.CENTER);
        HeadBallisticLabel.setText("0");
        HeadBallisticLabel.setToolTipText("Ballistic Hardpoints");
        HeadBallisticLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, new Color(204, 204, 204), new Color(255, 255, 255), new Color(102, 102, 102), new Color(51, 51, 51)));
        HeadBallisticLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        HeadBallisticLabel.setMaximumSize(new Dimension(30, 30));
        HeadBallisticLabel.setMinimumSize(new Dimension(30, 30));
        HeadBallisticLabel.setOpaque(true);
        HeadBallisticLabel.setPreferredSize(new Dimension(30, 30));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        HeadStatsPanel.add(HeadBallisticLabel, gridBagConstraints);

        HeadEnergyLabel.setFont(u.titleFont);
        HeadEnergyLabel.setHorizontalAlignment(SwingConstants.CENTER);
        HeadEnergyLabel.setText("0");
        HeadEnergyLabel.setToolTipText("Energy Hardpoints");
        HeadEnergyLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, new Color(204, 204, 204), new Color(255, 255, 255), new Color(102, 102, 102), new Color(51, 51, 51)));
        HeadEnergyLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        HeadEnergyLabel.setMaximumSize(new Dimension(30, 30));
        HeadEnergyLabel.setMinimumSize(new Dimension(30, 30));
        HeadEnergyLabel.setOpaque(true);
        HeadEnergyLabel.setPreferredSize(new Dimension(30, 30));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        HeadStatsPanel.add(HeadEnergyLabel, gridBagConstraints);

        HeadMissileLabel.setFont(u.titleFont);
        HeadMissileLabel.setHorizontalAlignment(SwingConstants.CENTER);
        HeadMissileLabel.setText("0");
        HeadMissileLabel.setToolTipText("Missile Hardpoints");
        HeadMissileLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, new Color(204, 204, 204), new Color(255, 255, 255), new Color(102, 102, 102), new Color(51, 51, 51)));
        HeadMissileLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        HeadMissileLabel.setMaximumSize(new Dimension(30, 30));
        HeadMissileLabel.setMinimumSize(new Dimension(30, 30));
        HeadMissileLabel.setOpaque(true);
        HeadMissileLabel.setPreferredSize(new Dimension(30, 30));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        HeadStatsPanel.add(HeadMissileLabel, gridBagConstraints);

        HeadAMSLabel.setFont(u.titleFont);
        HeadAMSLabel.setHorizontalAlignment(SwingConstants.CENTER);
        HeadAMSLabel.setText("0");
        HeadAMSLabel.setToolTipText("Missile Hardpoints");
        HeadAMSLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, new Color(204, 204, 204), new Color(255, 255, 255), new Color(102, 102, 102), new Color(51, 51, 51)));
        HeadAMSLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        HeadAMSLabel.setMaximumSize(new Dimension(30, 30));
        HeadAMSLabel.setMinimumSize(new Dimension(30, 30));
        HeadAMSLabel.setOpaque(true);
        HeadAMSLabel.setPreferredSize(new Dimension(30, 30));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        HeadStatsPanel.add(HeadAMSLabel, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        StatsPanel.add(HeadStatsPanel, gridBagConstraints);

        CenterTorsoStatsPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Center Torso", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 10))); // NOI18N
        CenterTorsoStatsPanel.setAlignmentX(0.0F);
        CenterTorsoStatsPanel.setAlignmentY(0.0F);
        CenterTorsoStatsPanel.setFont(u.titleFont);
        CenterTorsoStatsPanel.setMaximumSize(new Dimension(96, 160));
        CenterTorsoStatsPanel.setMinimumSize(new Dimension(96, 160));
        CenterTorsoStatsPanel.setOpaque(false);
        CenterTorsoStatsPanel.setPreferredSize(new Dimension(96, 160));
        CenterTorsoStatsPanel.setLayout(new GridBagLayout());

        CenterTorsoBallisticLabel.setFont(u.titleFont);
        CenterTorsoBallisticLabel.setHorizontalAlignment(SwingConstants.CENTER);
        CenterTorsoBallisticLabel.setText("0");
        CenterTorsoBallisticLabel.setToolTipText("Ballistic Hardpoints");
        CenterTorsoBallisticLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, new Color(204, 204, 204), new Color(255, 255, 255), new Color(102, 102, 102), new Color(51, 51, 51)));
        CenterTorsoBallisticLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        CenterTorsoBallisticLabel.setMaximumSize(new Dimension(30, 30));
        CenterTorsoBallisticLabel.setMinimumSize(new Dimension(30, 30));
        CenterTorsoBallisticLabel.setOpaque(true);
        CenterTorsoBallisticLabel.setPreferredSize(new Dimension(30, 30));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        CenterTorsoStatsPanel.add(CenterTorsoBallisticLabel, gridBagConstraints);

        CenterTorsoEnergyLabel.setFont(u.titleFont);
        CenterTorsoEnergyLabel.setHorizontalAlignment(SwingConstants.CENTER);
        CenterTorsoEnergyLabel.setText("0");
        CenterTorsoEnergyLabel.setToolTipText("Energy Hardpoints");
        CenterTorsoEnergyLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, new Color(204, 204, 204), new Color(255, 255, 255), new Color(102, 102, 102), new Color(51, 51, 51)));
        CenterTorsoEnergyLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        CenterTorsoEnergyLabel.setMaximumSize(new Dimension(30, 30));
        CenterTorsoEnergyLabel.setMinimumSize(new Dimension(30, 30));
        CenterTorsoEnergyLabel.setOpaque(true);
        CenterTorsoEnergyLabel.setPreferredSize(new Dimension(30, 30));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        CenterTorsoStatsPanel.add(CenterTorsoEnergyLabel, gridBagConstraints);

        CenterTorsoMissileLabel.setFont(u.titleFont);
        CenterTorsoMissileLabel.setHorizontalAlignment(SwingConstants.CENTER);
        CenterTorsoMissileLabel.setText("0");
        CenterTorsoMissileLabel.setToolTipText("Missile Hardpoints");
        CenterTorsoMissileLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, new Color(204, 204, 204), new Color(255, 255, 255), new Color(102, 102, 102), new Color(51, 51, 51)));
        CenterTorsoMissileLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        CenterTorsoMissileLabel.setMaximumSize(new Dimension(30, 30));
        CenterTorsoMissileLabel.setMinimumSize(new Dimension(30, 30));
        CenterTorsoMissileLabel.setOpaque(true);
        CenterTorsoMissileLabel.setPreferredSize(new Dimension(30, 30));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        CenterTorsoStatsPanel.add(CenterTorsoMissileLabel, gridBagConstraints);

        CenterTorsoAMSLabel.setFont(u.titleFont);
        CenterTorsoAMSLabel.setHorizontalAlignment(SwingConstants.CENTER);
        CenterTorsoAMSLabel.setText("0");
        CenterTorsoAMSLabel.setToolTipText("Missile Hardpoints");
        CenterTorsoAMSLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, new Color(204, 204, 204), new Color(255, 255, 255), new Color(102, 102, 102), new Color(51, 51, 51)));
        CenterTorsoAMSLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        CenterTorsoAMSLabel.setMaximumSize(new Dimension(30, 30));
        CenterTorsoAMSLabel.setMinimumSize(new Dimension(30, 30));
        CenterTorsoAMSLabel.setOpaque(true);
        CenterTorsoAMSLabel.setPreferredSize(new Dimension(30, 30));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        CenterTorsoStatsPanel.add(CenterTorsoAMSLabel, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        StatsPanel.add(CenterTorsoStatsPanel, gridBagConstraints);

        RightTorsoStatsPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Right Torso", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 10))); // NOI18N
        RightTorsoStatsPanel.setAlignmentX(0.0F);
        RightTorsoStatsPanel.setAlignmentY(0.0F);
        RightTorsoStatsPanel.setFont(u.titleFont);
        RightTorsoStatsPanel.setMaximumSize(new Dimension(96, 160));
        RightTorsoStatsPanel.setMinimumSize(new Dimension(96, 160));
        RightTorsoStatsPanel.setOpaque(false);
        RightTorsoStatsPanel.setPreferredSize(new Dimension(96, 160));
        RightTorsoStatsPanel.setLayout(new GridBagLayout());

        RightTorsoBallisticLabel.setFont(u.titleFont);
        RightTorsoBallisticLabel.setHorizontalAlignment(SwingConstants.CENTER);
        RightTorsoBallisticLabel.setText("0");
        RightTorsoBallisticLabel.setToolTipText("Ballistic Hardpoints");
        RightTorsoBallisticLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, new Color(204, 204, 204), new Color(255, 255, 255), new Color(102, 102, 102), new Color(51, 51, 51)));
        RightTorsoBallisticLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        RightTorsoBallisticLabel.setMaximumSize(new Dimension(30, 30));
        RightTorsoBallisticLabel.setMinimumSize(new Dimension(30, 30));
        RightTorsoBallisticLabel.setOpaque(true);
        RightTorsoBallisticLabel.setPreferredSize(new Dimension(30, 30));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        RightTorsoStatsPanel.add(RightTorsoBallisticLabel, gridBagConstraints);

        RightTorsoEnergyLabel.setFont(u.titleFont);
        RightTorsoEnergyLabel.setHorizontalAlignment(SwingConstants.CENTER);
        RightTorsoEnergyLabel.setText("0");
        RightTorsoEnergyLabel.setToolTipText("Energy Hardpoints");
        RightTorsoEnergyLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, new Color(204, 204, 204), new Color(255, 255, 255), new Color(102, 102, 102), new Color(51, 51, 51)));
        RightTorsoEnergyLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        RightTorsoEnergyLabel.setMaximumSize(new Dimension(30, 30));
        RightTorsoEnergyLabel.setMinimumSize(new Dimension(30, 30));
        RightTorsoEnergyLabel.setOpaque(true);
        RightTorsoEnergyLabel.setPreferredSize(new Dimension(30, 30));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        RightTorsoStatsPanel.add(RightTorsoEnergyLabel, gridBagConstraints);

        RightTorsoMissileLabel.setFont(u.titleFont);
        RightTorsoMissileLabel.setHorizontalAlignment(SwingConstants.CENTER);
        RightTorsoMissileLabel.setText("0");
        RightTorsoMissileLabel.setToolTipText("Missile Hardpoints");
        RightTorsoMissileLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, new Color(204, 204, 204), new Color(255, 255, 255), new Color(102, 102, 102), new Color(51, 51, 51)));
        RightTorsoMissileLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        RightTorsoMissileLabel.setMaximumSize(new Dimension(30, 30));
        RightTorsoMissileLabel.setMinimumSize(new Dimension(30, 30));
        RightTorsoMissileLabel.setOpaque(true);
        RightTorsoMissileLabel.setPreferredSize(new Dimension(30, 30));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        RightTorsoStatsPanel.add(RightTorsoMissileLabel, gridBagConstraints);

        RightTorsoAMSLabel.setFont(u.titleFont);
        RightTorsoAMSLabel.setHorizontalAlignment(SwingConstants.CENTER);
        RightTorsoAMSLabel.setText("0");
        RightTorsoAMSLabel.setToolTipText("Missile Hardpoints");
        RightTorsoAMSLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, new Color(204, 204, 204), new Color(255, 255, 255), new Color(102, 102, 102), new Color(51, 51, 51)));
        RightTorsoAMSLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        RightTorsoAMSLabel.setMaximumSize(new Dimension(30, 30));
        RightTorsoAMSLabel.setMinimumSize(new Dimension(30, 30));
        RightTorsoAMSLabel.setOpaque(true);
        RightTorsoAMSLabel.setPreferredSize(new Dimension(30, 30));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        RightTorsoStatsPanel.add(RightTorsoAMSLabel, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        StatsPanel.add(RightTorsoStatsPanel, gridBagConstraints);

        LeftTorsoStatsPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Left Torso", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 10))); // NOI18N
        LeftTorsoStatsPanel.setAlignmentX(0.0F);
        LeftTorsoStatsPanel.setAlignmentY(0.0F);
        LeftTorsoStatsPanel.setFont(u.titleFont);
        LeftTorsoStatsPanel.setMaximumSize(new Dimension(96, 160));
        LeftTorsoStatsPanel.setMinimumSize(new Dimension(96, 160));
        LeftTorsoStatsPanel.setOpaque(false);
        LeftTorsoStatsPanel.setPreferredSize(new Dimension(96, 160));
        LeftTorsoStatsPanel.setLayout(new GridBagLayout());

        LeftTorsoBallisticLabel.setFont(u.titleFont);
        LeftTorsoBallisticLabel.setHorizontalAlignment(SwingConstants.CENTER);
        LeftTorsoBallisticLabel.setText("0");
        LeftTorsoBallisticLabel.setToolTipText("Ballistic Hardpoints");
        LeftTorsoBallisticLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, new Color(204, 204, 204), new Color(255, 255, 255), new Color(102, 102, 102), new Color(51, 51, 51)));
        LeftTorsoBallisticLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        LeftTorsoBallisticLabel.setMaximumSize(new Dimension(30, 30));
        LeftTorsoBallisticLabel.setMinimumSize(new Dimension(30, 30));
        LeftTorsoBallisticLabel.setOpaque(true);
        LeftTorsoBallisticLabel.setPreferredSize(new Dimension(30, 30));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        LeftTorsoStatsPanel.add(LeftTorsoBallisticLabel, gridBagConstraints);

        LeftTorsoEnergyLabel.setFont(u.titleFont);
        LeftTorsoEnergyLabel.setHorizontalAlignment(SwingConstants.CENTER);
        LeftTorsoEnergyLabel.setText("0");
        LeftTorsoEnergyLabel.setToolTipText("Energy Hardpoints");
        LeftTorsoEnergyLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, new Color(204, 204, 204), new Color(255, 255, 255), new Color(102, 102, 102), new Color(51, 51, 51)));
        LeftTorsoEnergyLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        LeftTorsoEnergyLabel.setMaximumSize(new Dimension(30, 30));
        LeftTorsoEnergyLabel.setMinimumSize(new Dimension(30, 30));
        LeftTorsoEnergyLabel.setOpaque(true);
        LeftTorsoEnergyLabel.setPreferredSize(new Dimension(30, 30));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        LeftTorsoStatsPanel.add(LeftTorsoEnergyLabel, gridBagConstraints);

        LeftTorsoMissileLabel.setFont(u.titleFont);
        LeftTorsoMissileLabel.setHorizontalAlignment(SwingConstants.CENTER);
        LeftTorsoMissileLabel.setText("0");
        LeftTorsoMissileLabel.setToolTipText("Missile Hardpoints");
        LeftTorsoMissileLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, new Color(204, 204, 204), new Color(255, 255, 255), new Color(102, 102, 102), new Color(51, 51, 51)));
        LeftTorsoMissileLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        LeftTorsoMissileLabel.setMaximumSize(new Dimension(30, 30));
        LeftTorsoMissileLabel.setMinimumSize(new Dimension(30, 30));
        LeftTorsoMissileLabel.setOpaque(true);
        LeftTorsoMissileLabel.setPreferredSize(new Dimension(30, 30));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        LeftTorsoStatsPanel.add(LeftTorsoMissileLabel, gridBagConstraints);

        LeftTorsoAMSLabel.setFont(u.titleFont);
        LeftTorsoAMSLabel.setHorizontalAlignment(SwingConstants.CENTER);
        LeftTorsoAMSLabel.setText("0");
        LeftTorsoAMSLabel.setToolTipText("Missile Hardpoints");
        LeftTorsoAMSLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, new Color(204, 204, 204), new Color(255, 255, 255), new Color(102, 102, 102), new Color(51, 51, 51)));
        LeftTorsoAMSLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        LeftTorsoAMSLabel.setMaximumSize(new Dimension(30, 30));
        LeftTorsoAMSLabel.setMinimumSize(new Dimension(30, 30));
        LeftTorsoAMSLabel.setOpaque(true);
        LeftTorsoAMSLabel.setPreferredSize(new Dimension(30, 30));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        LeftTorsoStatsPanel.add(LeftTorsoAMSLabel, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        StatsPanel.add(LeftTorsoStatsPanel, gridBagConstraints);

        RightArmStatsPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Right Arm", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 10))); // NOI18N
        RightArmStatsPanel.setAlignmentX(0.0F);
        RightArmStatsPanel.setAlignmentY(0.0F);
        RightArmStatsPanel.setFont(u.titleFont);
        RightArmStatsPanel.setMaximumSize(new Dimension(96, 160));
        RightArmStatsPanel.setMinimumSize(new Dimension(96, 160));
        RightArmStatsPanel.setOpaque(false);
        RightArmStatsPanel.setPreferredSize(new Dimension(96, 160));
        RightArmStatsPanel.setLayout(new GridBagLayout());

        RightArmBallisticLabel.setFont(u.titleFont);
        RightArmBallisticLabel.setHorizontalAlignment(SwingConstants.CENTER);
        RightArmBallisticLabel.setText("0");
        RightArmBallisticLabel.setToolTipText("Ballistic Hardpoints");
        RightArmBallisticLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, new Color(204, 204, 204), new Color(255, 255, 255), new Color(102, 102, 102), new Color(51, 51, 51)));
        RightArmBallisticLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        RightArmBallisticLabel.setMaximumSize(new Dimension(30, 30));
        RightArmBallisticLabel.setMinimumSize(new Dimension(30, 30));
        RightArmBallisticLabel.setOpaque(true);
        RightArmBallisticLabel.setPreferredSize(new Dimension(30, 30));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        RightArmStatsPanel.add(RightArmBallisticLabel, gridBagConstraints);

        RightArmEnergyLabel.setFont(u.titleFont);
        RightArmEnergyLabel.setHorizontalAlignment(SwingConstants.CENTER);
        RightArmEnergyLabel.setText("0");
        RightArmEnergyLabel.setToolTipText("Energy Hardpoints");
        RightArmEnergyLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, new Color(204, 204, 204), new Color(255, 255, 255), new Color(102, 102, 102), new Color(51, 51, 51)));
        RightArmEnergyLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        RightArmEnergyLabel.setMaximumSize(new Dimension(30, 30));
        RightArmEnergyLabel.setMinimumSize(new Dimension(30, 30));
        RightArmEnergyLabel.setOpaque(true);
        RightArmEnergyLabel.setPreferredSize(new Dimension(30, 30));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        RightArmStatsPanel.add(RightArmEnergyLabel, gridBagConstraints);

        RightArmMissileLabel.setFont(u.titleFont);
        RightArmMissileLabel.setHorizontalAlignment(SwingConstants.CENTER);
        RightArmMissileLabel.setText("0");
        RightArmMissileLabel.setToolTipText("Missile Hardpoints");
        RightArmMissileLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, new Color(204, 204, 204), new Color(255, 255, 255), new Color(102, 102, 102), new Color(51, 51, 51)));
        RightArmMissileLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        RightArmMissileLabel.setMaximumSize(new Dimension(30, 30));
        RightArmMissileLabel.setMinimumSize(new Dimension(30, 30));
        RightArmMissileLabel.setOpaque(true);
        RightArmMissileLabel.setPreferredSize(new Dimension(30, 30));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        RightArmStatsPanel.add(RightArmMissileLabel, gridBagConstraints);

        RightArmAMSLabel.setFont(u.titleFont);
        RightArmAMSLabel.setHorizontalAlignment(SwingConstants.CENTER);
        RightArmAMSLabel.setText("0");
        RightArmAMSLabel.setToolTipText("Missile Hardpoints");
        RightArmAMSLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, new Color(204, 204, 204), new Color(255, 255, 255), new Color(102, 102, 102), new Color(51, 51, 51)));
        RightArmAMSLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        RightArmAMSLabel.setMaximumSize(new Dimension(30, 30));
        RightArmAMSLabel.setMinimumSize(new Dimension(30, 30));
        RightArmAMSLabel.setOpaque(true);
        RightArmAMSLabel.setPreferredSize(new Dimension(30, 30));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        RightArmStatsPanel.add(RightArmAMSLabel, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        StatsPanel.add(RightArmStatsPanel, gridBagConstraints);

        LeftArmStatsPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Left Arm", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 10))); // NOI18N
        LeftArmStatsPanel.setAlignmentX(0.0F);
        LeftArmStatsPanel.setAlignmentY(0.0F);
        LeftArmStatsPanel.setFont(u.titleFont);
        LeftArmStatsPanel.setMaximumSize(new Dimension(96, 160));
        LeftArmStatsPanel.setMinimumSize(new Dimension(96, 160));
        LeftArmStatsPanel.setOpaque(false);
        LeftArmStatsPanel.setPreferredSize(new Dimension(96, 160));
        LeftArmStatsPanel.setLayout(new GridBagLayout());

        LeftArmBallisticLabel.setFont(u.titleFont);
        LeftArmBallisticLabel.setHorizontalAlignment(SwingConstants.CENTER);
        LeftArmBallisticLabel.setText("0");
        LeftArmBallisticLabel.setToolTipText("Ballistic Hardpoints");
        LeftArmBallisticLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, new Color(204, 204, 204), new Color(255, 255, 255), new Color(102, 102, 102), new Color(51, 51, 51)));
        LeftArmBallisticLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        LeftArmBallisticLabel.setMaximumSize(new Dimension(30, 30));
        LeftArmBallisticLabel.setMinimumSize(new Dimension(30, 30));
        LeftArmBallisticLabel.setOpaque(true);
        LeftArmBallisticLabel.setPreferredSize(new Dimension(30, 30));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        LeftArmStatsPanel.add(LeftArmBallisticLabel, gridBagConstraints);

        LeftArmEnergyLabel.setFont(u.titleFont);
        LeftArmEnergyLabel.setHorizontalAlignment(SwingConstants.CENTER);
        LeftArmEnergyLabel.setText("0");
        LeftArmEnergyLabel.setToolTipText("Energy Hardpoints");
        LeftArmEnergyLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, new Color(204, 204, 204), new Color(255, 255, 255), new Color(102, 102, 102), new Color(51, 51, 51)));
        LeftArmEnergyLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        LeftArmEnergyLabel.setMaximumSize(new Dimension(30, 30));
        LeftArmEnergyLabel.setMinimumSize(new Dimension(30, 30));
        LeftArmEnergyLabel.setOpaque(true);
        LeftArmEnergyLabel.setPreferredSize(new Dimension(30, 30));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        LeftArmStatsPanel.add(LeftArmEnergyLabel, gridBagConstraints);

        LeftArmMissileLabel.setFont(u.titleFont);
        LeftArmMissileLabel.setHorizontalAlignment(SwingConstants.CENTER);
        LeftArmMissileLabel.setText("0");
        LeftArmMissileLabel.setToolTipText("Missile Hardpoints");
        LeftArmMissileLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, new Color(204, 204, 204), new Color(255, 255, 255), new Color(102, 102, 102), new Color(51, 51, 51)));
        LeftArmMissileLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        LeftArmMissileLabel.setMaximumSize(new Dimension(30, 30));
        LeftArmMissileLabel.setMinimumSize(new Dimension(30, 30));
        LeftArmMissileLabel.setOpaque(true);
        LeftArmMissileLabel.setPreferredSize(new Dimension(30, 30));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        LeftArmStatsPanel.add(LeftArmMissileLabel, gridBagConstraints);

        LeftArmAMSLabel.setFont(u.titleFont);
        LeftArmAMSLabel.setHorizontalAlignment(SwingConstants.CENTER);
        LeftArmAMSLabel.setText("0");
        LeftArmAMSLabel.setToolTipText("Missile Hardpoints");
        LeftArmAMSLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, new Color(204, 204, 204), new Color(255, 255, 255), new Color(102, 102, 102), new Color(51, 51, 51)));
        LeftArmAMSLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        LeftArmAMSLabel.setMaximumSize(new Dimension(30, 30));
        LeftArmAMSLabel.setMinimumSize(new Dimension(30, 30));
        LeftArmAMSLabel.setOpaque(true);
        LeftArmAMSLabel.setPreferredSize(new Dimension(30, 30));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        LeftArmStatsPanel.add(LeftArmAMSLabel, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        StatsPanel.add(LeftArmStatsPanel, gridBagConstraints);

        RightLegStatsPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Right Leg", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 10))); // NOI18N
        RightLegStatsPanel.setAlignmentX(0.0F);
        RightLegStatsPanel.setAlignmentY(0.0F);
        RightLegStatsPanel.setFont(u.titleFont);
        RightLegStatsPanel.setMaximumSize(new Dimension(96, 160));
        RightLegStatsPanel.setMinimumSize(new Dimension(96, 160));
        RightLegStatsPanel.setOpaque(false);
        RightLegStatsPanel.setPreferredSize(new Dimension(96, 160));
        RightLegStatsPanel.setLayout(new GridBagLayout());

        RightLegBallisticLabel.setFont(u.titleFont);
        RightLegBallisticLabel.setHorizontalAlignment(SwingConstants.CENTER);
        RightLegBallisticLabel.setText("0");
        RightLegBallisticLabel.setToolTipText("Ballistic Hardpoints");
        RightLegBallisticLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, new Color(204, 204, 204), new Color(255, 255, 255), new Color(102, 102, 102), new Color(51, 51, 51)));
        RightLegBallisticLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        RightLegBallisticLabel.setMaximumSize(new Dimension(30, 30));
        RightLegBallisticLabel.setMinimumSize(new Dimension(30, 30));
        RightLegBallisticLabel.setOpaque(true);
        RightLegBallisticLabel.setPreferredSize(new Dimension(30, 30));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        RightLegStatsPanel.add(RightLegBallisticLabel, gridBagConstraints);

        RightLegEnergyLabel.setFont(u.titleFont);
        RightLegEnergyLabel.setHorizontalAlignment(SwingConstants.CENTER);
        RightLegEnergyLabel.setText("0");
        RightLegEnergyLabel.setToolTipText("Energy Hardpoints");
        RightLegEnergyLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, new Color(204, 204, 204), new Color(255, 255, 255), new Color(102, 102, 102), new Color(51, 51, 51)));
        RightLegEnergyLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        RightLegEnergyLabel.setMaximumSize(new Dimension(30, 30));
        RightLegEnergyLabel.setMinimumSize(new Dimension(30, 30));
        RightLegEnergyLabel.setOpaque(true);
        RightLegEnergyLabel.setPreferredSize(new Dimension(30, 30));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        RightLegStatsPanel.add(RightLegEnergyLabel, gridBagConstraints);

        RightLegMissileLabel.setFont(u.titleFont);
        RightLegMissileLabel.setHorizontalAlignment(SwingConstants.CENTER);
        RightLegMissileLabel.setText("0");
        RightLegMissileLabel.setToolTipText("Missile Hardpoints");
        RightLegMissileLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, new Color(204, 204, 204), new Color(255, 255, 255), new Color(102, 102, 102), new Color(51, 51, 51)));
        RightLegMissileLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        RightLegMissileLabel.setMaximumSize(new Dimension(30, 30));
        RightLegMissileLabel.setMinimumSize(new Dimension(30, 30));
        RightLegMissileLabel.setOpaque(true);
        RightLegMissileLabel.setPreferredSize(new Dimension(30, 30));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        RightLegStatsPanel.add(RightLegMissileLabel, gridBagConstraints);

        RightLegAMSLabel.setFont(u.titleFont);
        RightLegAMSLabel.setHorizontalAlignment(SwingConstants.CENTER);
        RightLegAMSLabel.setText("0");
        RightLegAMSLabel.setToolTipText("Missile Hardpoints");
        RightLegAMSLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, new Color(204, 204, 204), new Color(255, 255, 255), new Color(102, 102, 102), new Color(51, 51, 51)));
        RightLegAMSLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        RightLegAMSLabel.setMaximumSize(new Dimension(30, 30));
        RightLegAMSLabel.setMinimumSize(new Dimension(30, 30));
        RightLegAMSLabel.setOpaque(true);
        RightLegAMSLabel.setPreferredSize(new Dimension(30, 30));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        RightLegStatsPanel.add(RightLegAMSLabel, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        StatsPanel.add(RightLegStatsPanel, gridBagConstraints);

        LeftLegStatsPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Left Leg", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 10))); // NOI18N
        LeftLegStatsPanel.setAlignmentX(0.0F);
        LeftLegStatsPanel.setAlignmentY(0.0F);
        LeftLegStatsPanel.setFont(u.titleFont);
        LeftLegStatsPanel.setMaximumSize(new Dimension(96, 160));
        LeftLegStatsPanel.setMinimumSize(new Dimension(96, 160));
        LeftLegStatsPanel.setOpaque(false);
        LeftLegStatsPanel.setPreferredSize(new Dimension(96, 160));
        LeftLegStatsPanel.setLayout(new GridBagLayout());

        LeftLegBallisticLabel.setFont(u.titleFont);
        LeftLegBallisticLabel.setHorizontalAlignment(SwingConstants.CENTER);
        LeftLegBallisticLabel.setText("0");
        LeftLegBallisticLabel.setToolTipText("Ballistic Hardpoints");
        LeftLegBallisticLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, new Color(204, 204, 204), new Color(255, 255, 255), new Color(102, 102, 102), new Color(51, 51, 51)));
        LeftLegBallisticLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        LeftLegBallisticLabel.setMaximumSize(new Dimension(30, 30));
        LeftLegBallisticLabel.setMinimumSize(new Dimension(30, 30));
        LeftLegBallisticLabel.setOpaque(true);
        LeftLegBallisticLabel.setPreferredSize(new Dimension(30, 30));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        LeftLegStatsPanel.add(LeftLegBallisticLabel, gridBagConstraints);

        LeftLegEnergyLabel.setFont(u.titleFont);
        LeftLegEnergyLabel.setHorizontalAlignment(SwingConstants.CENTER);
        LeftLegEnergyLabel.setText("0");
        LeftLegEnergyLabel.setToolTipText("Energy Hardpoints");
        LeftLegEnergyLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, new Color(204, 204, 204), new Color(255, 255, 255), new Color(102, 102, 102), new Color(51, 51, 51)));
        LeftLegEnergyLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        LeftLegEnergyLabel.setMaximumSize(new Dimension(30, 30));
        LeftLegEnergyLabel.setMinimumSize(new Dimension(30, 30));
        LeftLegEnergyLabel.setOpaque(true);
        LeftLegEnergyLabel.setPreferredSize(new Dimension(30, 30));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        LeftLegStatsPanel.add(LeftLegEnergyLabel, gridBagConstraints);

        LeftLegMissileLabel.setFont(u.titleFont);
        LeftLegMissileLabel.setHorizontalAlignment(SwingConstants.CENTER);
        LeftLegMissileLabel.setText("0");
        LeftLegMissileLabel.setToolTipText("Missile Hardpoints");
        LeftLegMissileLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, new Color(204, 204, 204), new Color(255, 255, 255), new Color(102, 102, 102), new Color(51, 51, 51)));
        LeftLegMissileLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        LeftLegMissileLabel.setMaximumSize(new Dimension(30, 30));
        LeftLegMissileLabel.setMinimumSize(new Dimension(30, 30));
        LeftLegMissileLabel.setOpaque(true);
        LeftLegMissileLabel.setPreferredSize(new Dimension(30, 30));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        LeftLegStatsPanel.add(LeftLegMissileLabel, gridBagConstraints);

        LeftLegAMSLabel.setFont(u.titleFont);
        LeftLegAMSLabel.setHorizontalAlignment(SwingConstants.CENTER);
        LeftLegAMSLabel.setText("0");
        LeftLegAMSLabel.setToolTipText("Missile Hardpoints");
        LeftLegAMSLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, new Color(204, 204, 204), new Color(255, 255, 255), new Color(102, 102, 102), new Color(51, 51, 51)));
        LeftLegAMSLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        LeftLegAMSLabel.setMaximumSize(new Dimension(30, 30));
        LeftLegAMSLabel.setMinimumSize(new Dimension(30, 30));
        LeftLegAMSLabel.setOpaque(true);
        LeftLegAMSLabel.setPreferredSize(new Dimension(30, 30));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        LeftLegStatsPanel.add(LeftLegAMSLabel, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        StatsPanel.add(LeftLegStatsPanel, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        MechDisplayPanel.add(StatsPanel, gridBagConstraints);

        MechImage.setFont(u.titleFont);
        MechImage.setAlignmentY(0.0F);
        MechImage.setMaximumSize(new Dimension(512, 512));
        MechImage.setMinimumSize(new Dimension(512, 512));
        MechImage.setPreferredSize(new Dimension(512, 512));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        MechDisplayPanel.add(MechImage, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        MechLabPanel.add(MechDisplayPanel, gridBagConstraints);

        InfoPanel.setAlignmentX(0.0F);
        InfoPanel.setAlignmentY(0.0F);
        InfoPanel.setFont(u.titleFont);
        InfoPanel.setMaximumSize(new Dimension(2147483647, 2147483647));
        InfoPanel.setMinimumSize(new Dimension(824, 100));
        InfoPanel.setPreferredSize(new Dimension(824, 100));
        InfoPanel.setLayout(new GridBagLayout());

        currentTonnageLabel.setFont(u.labelFont);
        currentTonnageLabel.setText("Tonnage");
        currentTonnageLabel.setAlignmentY(0.0F);
        currentTonnageLabel.setMaximumSize(new Dimension(200, 20));
        currentTonnageLabel.setMinimumSize(new Dimension(200, 20));
        currentTonnageLabel.setPreferredSize(new Dimension(200, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        InfoPanel.add(currentTonnageLabel, gridBagConstraints);

        tonnageProgressBar.setFont(u.labelFont);
        tonnageProgressBar.setForeground(new Color(60, 60, 180));
        tonnageProgressBar.setAlignmentX(0.0F);
        tonnageProgressBar.setAlignmentY(0.0F);
        tonnageProgressBar.setMaximumSize(new Dimension(200, 20));
        tonnageProgressBar.setMinimumSize(new Dimension(200, 20));
        tonnageProgressBar.setPreferredSize(new Dimension(200, 20));
        tonnageProgressBar.setString("0.0");
        tonnageProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        InfoPanel.add(tonnageProgressBar, gridBagConstraints);

        currentArmorLabel.setFont(u.labelFont);
        currentArmorLabel.setText("Armor");
        currentArmorLabel.setAlignmentY(0.0F);
        currentArmorLabel.setMaximumSize(new Dimension(200, 20));
        currentArmorLabel.setMinimumSize(new Dimension(200, 20));
        currentArmorLabel.setPreferredSize(new Dimension(200, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        InfoPanel.add(currentArmorLabel, gridBagConstraints);

        currentArmorProgressBar.setFont(u.labelFont);
        currentArmorProgressBar.setForeground(new Color(60, 60, 180));
        currentArmorProgressBar.setAlignmentX(0.0F);
        currentArmorProgressBar.setAlignmentY(0.0F);
        currentArmorProgressBar.setMaximumSize(new Dimension(200, 20));
        currentArmorProgressBar.setMinimumSize(new Dimension(200, 20));
        currentArmorProgressBar.setPreferredSize(new Dimension(200, 20));
        currentArmorProgressBar.setString("0");
        currentArmorProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        InfoPanel.add(currentArmorProgressBar, gridBagConstraints);

        currentSpeedLabel.setFont(u.labelFont);
        currentSpeedLabel.setText("Speed");
        currentSpeedLabel.setAlignmentY(0.0F);
        currentSpeedLabel.setMaximumSize(new Dimension(200, 20));
        currentSpeedLabel.setMinimumSize(new Dimension(200, 20));
        currentSpeedLabel.setPreferredSize(new Dimension(200, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        InfoPanel.add(currentSpeedLabel, gridBagConstraints);

        speedProgressBar.setFont(u.labelFont);
        speedProgressBar.setForeground(new Color(60, 180, 60));
        speedProgressBar.setMaximum(140);
        speedProgressBar.setMinimum(32);
        speedProgressBar.setAlignmentX(0.0F);
        speedProgressBar.setAlignmentY(0.0F);
        speedProgressBar.setMaximumSize(new Dimension(200, 20));
        speedProgressBar.setMinimumSize(new Dimension(200, 20));
        speedProgressBar.setPreferredSize(new Dimension(200, 20));
        speedProgressBar.setString("0 kph");
        speedProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        InfoPanel.add(speedProgressBar, gridBagConstraints);

        jumpDistanceLabel.setFont(u.labelFont);
        jumpDistanceLabel.setText("Jump Distance");
        jumpDistanceLabel.setAlignmentY(0.0F);
        jumpDistanceLabel.setMaximumSize(new Dimension(200, 20));
        jumpDistanceLabel.setMinimumSize(new Dimension(200, 20));
        jumpDistanceLabel.setPreferredSize(new Dimension(200, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        InfoPanel.add(jumpDistanceLabel, gridBagConstraints);

        jumpDistanceBar.setFont(u.labelFont);
        jumpDistanceBar.setForeground(new Color(60, 180, 60));
        jumpDistanceBar.setMaximum(10);
        jumpDistanceBar.setAlignmentX(0.0F);
        jumpDistanceBar.setAlignmentY(0.0F);
        jumpDistanceBar.setMaximumSize(new Dimension(200, 20));
        jumpDistanceBar.setMinimumSize(new Dimension(200, 20));
        jumpDistanceBar.setPreferredSize(new Dimension(200, 20));
        jumpDistanceBar.setString("0 m");
        jumpDistanceBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        InfoPanel.add(jumpDistanceBar, gridBagConstraints);

        firepowerLabel.setFont(u.labelFont);
        firepowerLabel.setText("Firepower");
        firepowerLabel.setAlignmentY(0.0F);
        firepowerLabel.setMaximumSize(new Dimension(200, 20));
        firepowerLabel.setMinimumSize(new Dimension(200, 20));
        firepowerLabel.setPreferredSize(new Dimension(200, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        InfoPanel.add(firepowerLabel, gridBagConstraints);

        firepowerProgressBar.setFont(u.labelFont);
        firepowerProgressBar.setForeground(new Color(180, 180, 60));
        firepowerProgressBar.setMaximum(128);
        firepowerProgressBar.setAlignmentX(0.0F);
        firepowerProgressBar.setAlignmentY(0.0F);
        firepowerProgressBar.setMaximumSize(new Dimension(200, 20));
        firepowerProgressBar.setMinimumSize(new Dimension(200, 20));
        firepowerProgressBar.setPreferredSize(new Dimension(200, 20));
        firepowerProgressBar.setString("0 dps");
        firepowerProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        InfoPanel.add(firepowerProgressBar, gridBagConstraints);

        heatEfficiencyLabel.setFont(u.labelFont);
        heatEfficiencyLabel.setText("Heat");
        heatEfficiencyLabel.setAlignmentY(0.0F);
        heatEfficiencyLabel.setMaximumSize(new Dimension(200, 20));
        heatEfficiencyLabel.setMinimumSize(new Dimension(200, 20));
        heatEfficiencyLabel.setPreferredSize(new Dimension(200, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        InfoPanel.add(heatEfficiencyLabel, gridBagConstraints);

        heatEfficiencyProgressBar.setFont(u.labelFont);
        heatEfficiencyProgressBar.setForeground(new Color(180, 60, 60));
        heatEfficiencyProgressBar.setValue(100);
        heatEfficiencyProgressBar.setAlignmentX(0.0F);
        heatEfficiencyProgressBar.setAlignmentY(0.0F);
        heatEfficiencyProgressBar.setMaximumSize(new Dimension(200, 20));
        heatEfficiencyProgressBar.setMinimumSize(new Dimension(200, 20));
        heatEfficiencyProgressBar.setPreferredSize(new Dimension(200, 20));
        heatEfficiencyProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        InfoPanel.add(heatEfficiencyProgressBar, gridBagConstraints);

        RangeLabel.setFont(u.labelFont);
        RangeLabel.setText("Range");
        RangeLabel.setAlignmentY(0.0F);
        RangeLabel.setMaximumSize(new Dimension(200, 20));
        RangeLabel.setMinimumSize(new Dimension(200, 20));
        RangeLabel.setPreferredSize(new Dimension(200, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        InfoPanel.add(RangeLabel, gridBagConstraints);

        RangeProgressBar.setFont(u.labelFont);
        RangeProgressBar.setForeground(new Color(180, 180, 60));
        RangeProgressBar.setMaximum(690);
        RangeProgressBar.setAlignmentX(0.0F);
        RangeProgressBar.setAlignmentY(0.0F);
        RangeProgressBar.setMaximumSize(new Dimension(200, 20));
        RangeProgressBar.setMinimumSize(new Dimension(200, 20));
        RangeProgressBar.setPreferredSize(new Dimension(200, 20));
        RangeProgressBar.setString("");
        RangeProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        InfoPanel.add(RangeProgressBar, gridBagConstraints);

        SpecialLabel.setFont(u.labelFont);
        SpecialLabel.setText("Special");
        SpecialLabel.setAlignmentY(0.0F);
        SpecialLabel.setMaximumSize(new Dimension(200, 20));
        SpecialLabel.setMinimumSize(new Dimension(200, 20));
        SpecialLabel.setPreferredSize(new Dimension(200, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        InfoPanel.add(SpecialLabel, gridBagConstraints);

        SpecialProgressBar.setFont(u.labelFont);
        SpecialProgressBar.setForeground(new Color(180, 60, 60));
        SpecialProgressBar.setAlignmentX(0.0F);
        SpecialProgressBar.setAlignmentY(0.0F);
        SpecialProgressBar.setMaximumSize(new Dimension(200, 20));
        SpecialProgressBar.setMinimumSize(new Dimension(200, 20));
        SpecialProgressBar.setPreferredSize(new Dimension(200, 20));
        SpecialProgressBar.setString("0 m");
        SpecialProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        InfoPanel.add(SpecialProgressBar, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        MechLabPanel.add(InfoPanel, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(MechLabPanel, gridBagConstraints);

        MenuBar.setFont(u.labelFont);
        MenuBar.setMaximumSize(new Dimension(832, 32769));
        MenuBar.setMinimumSize(new Dimension(832, 24));
        MenuBar.setPreferredSize(new Dimension(832, 24));

        FileMenu.setText("File");
        FileMenu.setFont(u.labelFont);

        SaveButton.setFont(u.labelFont);
        SaveButton.setText("Save");
        SaveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });
        FileMenu.add(SaveButton);

        LoadButton.setFont(u.labelFont);
        LoadButton.setText("Load");
        LoadButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                LoadButtonActionPerformed(evt);
            }
        });
        FileMenu.add(LoadButton);

        ExportButton.setFont(u.labelFont);
        ExportButton.setText("Export");
        ExportButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ExportButtonActionPerformed(evt);
            }
        });
        FileMenu.add(ExportButton);

        PreferencesButton.setFont(u.labelFont);
        PreferencesButton.setText("Preferences");
        PreferencesButton.setEnabled(false);
        PreferencesButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                PreferencesButtonActionPerformed(evt);
            }
        });
        FileMenu.add(PreferencesButton);

        MenuBar.add(FileMenu);

        StatsMenu.setText("Stats");
        StatsMenu.setFont(u.labelFont);

        MechTreeButton.setFont(u.labelFont);
        MechTreeButton.setText("Mech Tree");
        MechTreeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                MechTreeButtonActionPerformed(evt);
            }
        });
        StatsMenu.add(MechTreeButton);

        PilotTreeButton.setFont(u.labelFont);
        PilotTreeButton.setText("Pilot Tree");
        PilotTreeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                PilotTreeButtonActionPerformed(evt);
            }
        });
        StatsMenu.add(PilotTreeButton);

        WeaponStatsButton.setFont(u.labelFont);
        WeaponStatsButton.setText("Weapon Stats");
        WeaponStatsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                WeaponStatsButtonActionPerformed(evt);
            }
        });
        StatsMenu.add(WeaponStatsButton);

        MenuBar.add(StatsMenu);

        MetricsMenu.setText("Metrics");
        MetricsMenu.setFont(u.labelFont);

        AlphaRadioButton.setFont(u.labelFont);
        AlphaRadioButton.setText("Alpha Strike");
        AlphaRadioButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                AlphaRadioButtonActionPerformed(evt);
            }
        });
        MetricsMenu.add(AlphaRadioButton);

        BurstRadioButton.setFont(u.labelFont);
        BurstRadioButton.setText("Burst Fire");
        BurstRadioButton.setEnabled(false);
        BurstRadioButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                AlphaRadioButtonActionPerformed(evt);
            }
        });
        MetricsMenu.add(BurstRadioButton);

        RapidRadioButton.setFont(u.labelFont);
        RapidRadioButton.setText("Rapid Fire");
        RapidRadioButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                AlphaRadioButtonActionPerformed(evt);
            }
        });
        MetricsMenu.add(RapidRadioButton);

        MenuBar.add(MetricsMenu);

        HelpMenu.setText("Help");
        HelpMenu.setFont(u.labelFont);

        AboutButton.setFont(u.labelFont);
        AboutButton.setText("About");
        AboutButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                AboutButtonActionPerformed(evt);
            }
        });
        HelpMenu.add(AboutButton);

        MenuBar.add(HelpMenu);

        setJMenuBar(MenuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //<editor-fold defaultstate="collapsed" desc="Mechlab ComboBox Methods">
    private void ChassisComboBoxActionPerformed(ActionEvent evt) {//GEN-FIRST:event_ChassisComboBoxActionPerformed
        switch (ChassisComboBox.getSelectedIndex()) {
            case ATLAS_INDEX:
                resetModelComboBox(atlasModels);
                break;
            case AWESOME_INDEX:
                resetModelComboBox(awesomeModels);
                break;
            case BLACKJACK_INDEX:
                resetModelComboBox(blackjackModels);
                break;
            case CATAPHRACT_INDEX:
                resetModelComboBox(cataphractModels);
                break;
            case CATAPULT_INDEX:
                resetModelComboBox(catapultModels);
                break;
            case CENTURION_INDEX:
                resetModelComboBox(centurionModels);
                break;
            case CICADA_INDEX:
                resetModelComboBox(cicadaModels);
                break;
            case COMMANDO_INDEX:
                resetModelComboBox(commandoModels);
                break;
            case DRAGON_INDEX:
                resetModelComboBox(dragonModels);
                break;
            case FLEA_INDEX:
                resetModelComboBox(fleaModels);
                break;
            case GRAND_DRAGON_INDEX:
                resetModelComboBox(grandDragonModels);
                break;
            case HIGHLANDER_INDEX:
                resetModelComboBox(highlanderModels);
                break;
            case HUNCHBACK_INDEX:
                resetModelComboBox(hunchbackModels);
                break;
            case JAGERMECH_INDEX:
                resetModelComboBox(jagermechModels);
                break;
            case JENNER_INDEX:
                resetModelComboBox(jennerModels);
                break;
            //case NEMESIS_INDEX:
                //resetModelComboBox(nemesisModels);
                //break;
            case ORION_INDEX:
                resetModelComboBox(orionModels);
                break;
            case RAVEN_INDEX:
                resetModelComboBox(ravenModels);
                break;
            case SPIDER_INDEX:
                resetModelComboBox(spiderModels);
                break;
            case STALKER_INDEX:
                resetModelComboBox(stalkerModels);
                break;
            case TREBUCHET_INDEX:
                resetModelComboBox(trebuchetModels);
                break;
            default:
                userMech = new Mech();
                resetModelComboBox("");
                break;
        }
    }//GEN-LAST:event_ChassisComboBoxActionPerformed
    private void ModelComboBoxActionPerformed(ActionEvent evt) {//GEN-FIRST:event_ModelComboBoxActionPerformed
        isLoading = !isLoading;                                     
        switch (ChassisComboBox.getSelectedIndex()) {
            case ATLAS_INDEX:
            switch (ModelComboBox.getSelectedIndex()) {
                default:
                setDefaultVariant(ASSAULT_INDEX);
                break;
                case AS7_D_INDEX:
                setMech(new AS7_D());
                break;
                case AS7_D_DC_INDEX:
                setMech(new AS7_D_DC());
                break;
                case AS7_K_INDEX:
                setMech(new AS7_K());
                break;
                case AS7_RS_INDEX:
                setMech(new AS7_RS());
                break;
                case AS7_S_INDEX:
                setMech(new AS7_S());
                break;
            }
            break;
            case AWESOME_INDEX:
            switch (ModelComboBox.getSelectedIndex()) {
                default:
                setDefaultVariant(ASSAULT_INDEX);
                break;
                case AWS_8Q_INDEX:
                setMech(new AWS_8Q());
                break;
                case AWS_8R_INDEX:
                setMech(new AWS_8R());
                break;
                case AWS_8T_INDEX:
                setMech(new AWS_8T());
                break;
                case AWS_8V_INDEX:
                setMech(new AWS_8V());
                break;
                case AWS_9M_INDEX:
                setMech(new AWS_9M());
                break;
                case AWS_PB_INDEX:
                setMech(new AWS_PB());
                break;
            }
            break;
            case BLACKJACK_INDEX:
            switch (ModelComboBox.getSelectedIndex()) {
                default:
                setDefaultVariant(MEDIUM_INDEX);
                break;
                case BJ_1_INDEX:
                setMech(new BJ_1());
                break;
                case BJ_1DB_INDEX:
                setMech(new BJ_1DB());
                break;
                case BJ_1DC_INDEX:
                setMech(new BJ_1DC());
                break;
                case BJ_1X_INDEX:
                setMech(new BJ_1X());
                break;
                case BJ_3_INDEX:
                setMech(new BJ_3());
                break;
            }
            break;
            case CATAPHRACT_INDEX:
            switch (ModelComboBox.getSelectedIndex()) {
                default:
                setDefaultVariant(HEAVY_INDEX);
                break;
                case CTF_1X_INDEX:
                setMech(new CTF_1X());
                break;
                case CTF_2X_INDEX:
                setMech(new CTF_2X());
                break;
                case CTF_3D_INDEX:
                setMech(new CTF_3D());
                break;
                case CTF_3L_INDEX:
                setMech(new CTF_3L());
                break;
                case CTF_4X_INDEX:
                setMech(new CTF_4X());
                break;
                case CTF_IM_INDEX:
                setMech(new CTF_IM());
                break;
            }
            break;
            case CATAPULT_INDEX:
            switch (ModelComboBox.getSelectedIndex()) {
                default:
                setDefaultVariant(HEAVY_INDEX);
                break;
                case CPLT_A1_INDEX:
                setMech(new CPLT_A1());
                break;
                case CPLT_C1_INDEX:
                setMech(new CPLT_C1());
                break;
                case CPLT_C4_INDEX:
                setMech(new CPLT_C4());
                break;
                case CPLT_K2_INDEX:
                setMech(new CPLT_K2());
                break;
                case CPLT_K3_INDEX:
                setMech(new CPLT_K3());
                break;
            }
            break;
            case CENTURION_INDEX:
            switch (ModelComboBox.getSelectedIndex()) {
                default:
                setDefaultVariant(MEDIUM_INDEX);
                break;
                case CN9_A_INDEX:
                setMech(new CN9_A());
                break;
                case CN9_AH_INDEX:
                setMech(new CN9_AH());
                break;
                case CN9_AL_INDEX:
                setMech(new CN9_AL());
                break;
                case CN9_D_INDEX:
                setMech(new CN9_D());
                break;
                case CN9_YLW_INDEX:
                setMech(new CN9_YLW());
                break;
            }
            break;
            case CICADA_INDEX:
            switch (ModelComboBox.getSelectedIndex()) {
                default:
                setDefaultVariant(MEDIUM_INDEX);
                break;
                case CDA_2A_INDEX:
                setMech(new CDA_2A());
                break;
                case CDA_2B_INDEX:
                setMech(new CDA_2B());
                break;
                case CDA_3C_INDEX:
                setMech(new CDA_3C());
                break;
                case CDA_3M_INDEX:
                setMech(new CDA_3M());
                break;
                case CDA_X_5_INDEX:
                setMech(new CDA_X_5());
                break;
            }
            break;
            case COMMANDO_INDEX:
            switch (ModelComboBox.getSelectedIndex()) {
                default:
                setDefaultVariant(LIGHT_INDEX);
                break;
                case COM_1B_INDEX:
                setMech(new COM_1B());
                break;
                case COM_1C_INDEX:
                setMech(new COM_1C());
                break;
                case COM_1D_INDEX:
                setMech(new COM_1D());
                break;
                case COM_2D_INDEX:
                setMech(new COM_2D());
                break;
                case COM_3A_INDEX:
                setMech(new COM_3A());
                break;
                case COM_5S_INDEX:
                setMech(new COM_5S());
                break;
            }
            break;
            case DRAGON_INDEX:
            switch (ModelComboBox.getSelectedIndex()) {
                default:
                setDefaultVariant(HEAVY_INDEX);
                break;
                case DGN_1C_INDEX:
                setMech(new DGN_1C());
                break;
                case DGN_1N_INDEX:
                setMech(new DGN_1N());
                break;
                case DGN_5N_INDEX:
                setMech(new DGN_5N());
                break;
                case DGN_FANG_INDEX:
                setMech(new DGN_FANG());
                break;
                case DGN_FLAME_INDEX:
                setMech(new DGN_FLAME());
                break;
            }
            break;
            case FLEA_INDEX:
            switch (ModelComboBox.getSelectedIndex()) {
                default:
                setDefaultVariant(LIGHT_INDEX);
                break;
                case FLE_4_INDEX:
                setMech(new FLE_4());
                break;
                case FLE_15_INDEX:
                setMech(new FLE_15());
                break;
                case FLE_17_INDEX:
                setMech(new FLE_17());
                break;
            }
            break;
            case GRAND_DRAGON_INDEX:
            switch (ModelComboBox.getSelectedIndex()) {
                default:
                setDefaultVariant(HEAVY_INDEX);
                break;
                case DRG_1G_INDEX:
                setMech(new DRG_1G());
                break;
                case DRG_5K_INDEX:
                setMech(new DRG_5K());
                break;
                case DRG_5K_DC_INDEX:
                setMech(new DRG_5K_DC());
                break;
            }
            break;
            case HIGHLANDER_INDEX:
            switch (ModelComboBox.getSelectedIndex()) {
                default:
                setDefaultVariant(ASSAULT_INDEX);
                break;
                case HGN_732_INDEX:
                setMech(new HGN_732());
                break;
                case HGN_733_INDEX:
                setMech(new HGN_733());
                break;
                case HGN_733C_INDEX:
                setMech(new HGN_733C());
                break;
                case HGN_733P_INDEX:
                setMech(new HGN_733P());
                break;
            }
            break;
            case HUNCHBACK_INDEX:
            switch (ModelComboBox.getSelectedIndex()) {
                default:
                setDefaultVariant(MEDIUM_INDEX);
                break;
                case HBK_4G_INDEX:
                setMech(new HBK_4G());
                break;
                case HBK_4H_INDEX:
                setMech(new HBK_4H());
                break;
                case HBK_4J_INDEX:
                setMech(new HBK_4J());
                break;
                case HBK_4N_INDEX:
                setMech(new HBK_4N());
                break;
                case HBK_4P_INDEX:
                setMech(new HBK_4P());
                break;
                case HBK_4SP_INDEX:
                setMech(new HBK_4SP());
                break;
                case HBK_5M_INDEX:
                setMech(new HBK_5M());
                break;
            }
            break;
            case JAGERMECH_INDEX:
            switch (ModelComboBox.getSelectedIndex()) {
                default:
                setDefaultVariant(HEAVY_INDEX);
                break;
                case JM6_A_INDEX:
                setMech(new JM6_A());
                break;
                case JM6_DD_INDEX:
                setMech(new JM6_DD());
                break;
                case JM6_S_INDEX:
                setMech(new JM6_S());
                break;
            }
            break;
            case JENNER_INDEX:
            switch (ModelComboBox.getSelectedIndex()) {
                default:
                setDefaultVariant(LIGHT_INDEX);
                break;
                case JR7_A_INDEX:
                setMech(new JR7_A());
                break;
                case JR7_D_INDEX:
                setMech(new JR7_D());
                break;
                case JR7_F_INDEX:
                setMech(new JR7_F());
                break;
                case JR7_K_INDEX:
                setMech(new JR7_K());
                break;
            }
            break;
            /*case NEMESIS_INDEX:
            switch (ModelComboBox.getSelectedIndex()) {
                default:
                setDefaultVariant(MEDIUM_INDEX);
                break;
                case NMS_1X_INDEX:
                setMech(new NMS_1X());
                break;
                case NMS_3X_INDEX:
                setMech(new NMS_3X());
                break;
                case NMS_5X_INDEX:
                setMech(new NMS_5X());
                break;
                case NMS_10X_INDEX:
                setMech(new NMS_10X());
                break;
            }
            break;*/
            case ORION_INDEX:
            switch (ModelComboBox.getSelectedIndex()) {
                default:
                setDefaultVariant(HEAVY_INDEX);
                break;
                case ON1_K_INDEX:
                setMech(new ON1_K());
                break;
                case ON1_M_INDEX:
                setMech(new ON1_M());
                break;
                case ON1_V_INDEX:
                setMech(new ON1_V());
                break;
                case ON1_VA_INDEX:
                setMech(new ON1_VA());
                break;
                case ON1_V_DC_INDEX:
                setMech(new ON1_V_DC());
                break;
            }
            break;
            case RAVEN_INDEX:
            switch (ModelComboBox.getSelectedIndex()) {
                default:
                setDefaultVariant(LIGHT_INDEX);
                break;
                case RVN_2X_INDEX:
                setMech(new RVN_2X());
                break;
                case RVN_3L_INDEX:
                setMech(new RVN_3L());
                break;
                case RVN_4X_INDEX:
                setMech(new RVN_4X());
                break;
            }
            break;
            case SPIDER_INDEX:
            switch (ModelComboBox.getSelectedIndex()) {
                default:
                setDefaultVariant(LIGHT_INDEX);
                break;
                case SDR_5D_INDEX:
                setMech(new SDR_5D());
                break;
                case SDR_5K_INDEX:
                setMech(new SDR_5K());
                break;
                case SDR_5V_INDEX:
                setMech(new SDR_5V());
                break;
            }
            break;
            case STALKER_INDEX:
            switch (ModelComboBox.getSelectedIndex()) {
                default:
                setDefaultVariant(ASSAULT_INDEX);
                break;
                case STK_3F_INDEX:
                setMech(new STK_3F());
                break;
                case STK_3H_INDEX:
                setMech(new STK_3H());
                break;
                case STK_4N_INDEX:
                setMech(new STK_4N());
                break;
                case STK_4P_INDEX:
                setMech(new STK_4P());
                break;
                case STK_5M_INDEX:
                setMech(new STK_5M());
                break;
                case STK_5S_INDEX:
                setMech(new STK_5S());
                break;
            }
            break;
            case TREBUCHET_INDEX:
            switch (ModelComboBox.getSelectedIndex()) {
                default:
                setDefaultVariant(MEDIUM_INDEX);
                break;
                case TBT_3C_INDEX:
                setMech(new TBT_3C());
                break;
                case TBT_5J_INDEX:
                setMech(new TBT_5J());
                break;
                case TBT_5K_INDEX:
                setMech(new TBT_7K());
                break;
                case TBT_5N_INDEX:
                setMech(new TBT_5N());
                break;
                case TBT_5S_INDEX:
                setMech(new TBT_5S());
                break;
                case TBT_7M_INDEX:
                setMech(new TBT_7M());
                break;
            }
            break;
            default:
            setDefaultVariant(DEFAULT_INDEX);
            break;
        }
        
        isLoading = !isLoading;
        
        updateItemList();
        resetEfficiencyButtons();
        resetArmorComponents();
        initArmorComponents();
        initStatPanel();
        initAllCriticalHardpoints();
        initAllProgressBars();
    }//GEN-LAST:event_ModelComboBoxActionPerformed
    private void setMech(Mech nFlag) {
        userMech = nFlag;
        userVariant = new Variant();
        EquipmentQueue.removeAllElements();
        
        userTonnage = 0;
        userAlpha = 0;
        userAlphaHeat = 0;
        userFirepower = 0;
        userHeat = 0;
        userRange = 0;
        
        MechImage.setIcon(new ImageIcon(getClass().getResource(userMech.getIconPath())));
        
        UnconfirmedLabel.setVisible(userMech.isUnconfirmed());
        UnreleasedLabel.setVisible(userMech.isUnreleased());
        ECMLabel.setVisible(userMech.isECMCapable());
        JumpLabel.setVisible(userMech.isJumpCapable());
        
        for (int i = 0; i < Equipment[EQUIPMENT_INDEX - 1].size(); i++)
            if (Equipment[EQUIPMENT_INDEX - 1].elementAt(i).getItemType() == JUMP_JET_ITEM_TYPE)
                Equipment[EQUIPMENT_INDEX - 1].removeElementAt(i);
        
        if (userMech.hasJumpJets())
            Equipment[EQUIPMENT_INDEX - 1].addElement(new Jump_Jet(userMech.getTonnage()));
        
        for (int i = 0; i < Equipment[EQUIPMENT_INDEX - 1].size(); i++)
            if (Equipment[EQUIPMENT_INDEX - 1].elementAt(i).getEquipmentName() == "ECM")
                Equipment[EQUIPMENT_INDEX - 1].removeElementAt(i);
            
        if (userMech.isECMCapable())
            Equipment[EQUIPMENT_INDEX - 1].insertElementAt(new Guardian_ECM_Suite(), 2);
        
        LeftTorsoCASECheckBox.setSelected(false);
        RightTorsoCASECheckBox.setSelected(false);
        
        SPEED_MODIFIER = 16.2;
        
        if(isSavedMech)
            setCustomVariant();
        else
            setStockVariant();
    }
    private void setStockVariant() {
        userVariant.hasDoubleHS = userMech.hasDoubleHeatSinks();
        userVariant.hasEndoSteel = userMech.hasEndoSteel();
        userVariant.hasFerroFibrous = userMech.hasFerroFibrous();
        userVariant.hasXLEngine = userMech.hasXLEngine();
        userVariant.hasArtemisIV = userMech.hasArtemisIV();
        
        Weapons[MISSILE_INDEX - 1].remove(7);
        Weapons[MISSILE_INDEX - 1].remove(6);
        Weapons[MISSILE_INDEX - 1].remove(5);
        Weapons[MISSILE_INDEX - 1].remove(3);
        Weapons[MISSILE_INDEX - 1].remove(2);
        Weapons[MISSILE_INDEX - 1].remove(1);
        Weapons[MISSILE_INDEX - 1].remove(0);
        
        Weapons[MISSILE_INDEX - 1].insertElementAt(new SRM6(userVariant.hasArtemisIV), 1);
        Weapons[MISSILE_INDEX - 1].insertElementAt(new SRM4(userVariant.hasArtemisIV), 1);
        Weapons[MISSILE_INDEX - 1].insertElementAt(new SRM2(userVariant.hasArtemisIV), 1);
        Weapons[MISSILE_INDEX - 1].insertElementAt(new LRM20(userVariant.hasArtemisIV), 0);
        Weapons[MISSILE_INDEX - 1].insertElementAt(new LRM15(userVariant.hasArtemisIV), 0);
        Weapons[MISSILE_INDEX - 1].insertElementAt(new LRM10(userVariant.hasArtemisIV), 0);
        Weapons[MISSILE_INDEX - 1].insertElementAt(new LRM5(userVariant.hasArtemisIV), 0);
        
        userVariant.engineRating = userMech.getStockEngineRating();
        userVariant.engineHeatSinks = (int)(userVariant.engineRating / 25);
        userVariant.heatSinks = 10 + userMech.getStockExtraHeatSinks();
        userTonnage += userMech.getStockExtraHeatSinks();
        if (userVariant.engineHeatSinks < 10)
            userTonnage += (10 - userVariant.engineHeatSinks);
        
        EngineToggleButton.setSelected(userVariant.hasXLEngine);
        InternalsToggleButton.setSelected(userVariant.hasEndoSteel);
        ArmorToggleButton.setSelected(userVariant.hasFerroFibrous);
        HeatSinkToggleButton.setSelected(userVariant.hasDoubleHS);
        ArtemisToggleButton.setSelected(userVariant.hasArtemisIV);
        
        engineRatingSpinnerModel.setValue(userVariant.engineRating);
        heatSinkSpinnerModel.setValue(userVariant.heatSinks);
        
        double engineMod;
        
        if (userMech.getTonnage() > 55)
            engineMod = 1.2;
        else if (userMech.getTonnage() > 35)
            engineMod = 1.3;
        else
            engineMod = 1.4;

        int maxRating;
        int minRating;

        if (userMech.getStockEngineRating() * engineMod >= 400 && userMech.getTonnage() * 8.6 >= 400)
            maxRating = 400;
        else if (userMech.getTonnage() * 8.6 < userMech.getStockEngineRating() * engineMod)
            maxRating = (int) ((userMech.getTonnage() * 8.6) - (userMech.getTonnage() * 8.6) % 5);
        else
            maxRating = (int) (Math.ceil((userMech.getStockEngineRating() * engineMod) / 5) * 5);

        if ((int)(userMech.getTonnage() * 2) < 100)
            minRating = 100;
        else
            minRating = (int)(userMech.getTonnage() * 2);
        
        engineRatingSpinnerModel.setMaximum(maxRating);
        engineRatingSpinnerModel.setMinimum(minRating);
        
        {
            Engine tempE = new Engine(userVariant.hasXLEngine, userVariant.engineRating);
            Internals tempI = new Internals(userVariant.hasEndoSteel, userMech.getTonnage());
            
            userTonnage += tempE.getTonnage();
            userTonnage += tempI.getTonnage();
            
            Armor tempA = new Armor(userVariant.hasFerroFibrous, 0);
                    
            temp = String.format("%.2f", tempA.getPointsPerTon());
            PointsPerTonAmount.setText(temp);
        }
        
        userVariant.items = userMech.getStockArmament();
            
        for (int i = 0; i < NUMBER_OF_CRITICAL_SECTIONS; i++) {
            for (int j = 0; j < userVariant.items[i].size(); j++) {
                if (userVariant.items[i].elementAt(j).getItemType() == WEAPON_ITEM_TYPE) {
                    Weapon weapon = (Weapon)userVariant.items[i].elementAt(j);
                    userHeat += weapon.getHeatPerSecond();
                    userFirepower += weapon.getDamagePerSecond();
                    userAlpha += weapon.getDamage();
                    userAlphaHeat += weapon.getHeat();
                    userTonnage += weapon.getTonnage();
                    if (weapon.getRecycle() > userRecycle)
                        userRecycle = weapon.getRecycle();
                    switch(weapon.getHardpointType())
                    {
                        case BALLISTIC:
                            userVariant.hardpoints[i][BALLISTIC]++;
                            break;
                        case ENERGY:
                            userVariant.hardpoints[i][ENERGY]++;
                            break;
                        case MISSILE:
                            userVariant.hardpoints[i][MISSILE]++;
                            break;
                    }
                }
                else if (userVariant.items[i].elementAt(j).getItemType() == AMMO_ITEM_TYPE) {
                    AmmoBin ammo = (AmmoBin) userVariant.items[i].elementAt(j);
                    userTonnage += ammo.getTonnage();
                }
                else if (userVariant.items[i].elementAt(j).getItemType() == EQUIPMENT_ITEM_TYPE) {
                    Special_Equipment other = (Special_Equipment) userVariant.items[i].elementAt(j);
                    userTonnage += other.getTonnage();
                    
                    if (other.getHardpointType() == ENERGY)
                            userVariant.hardpoints[i][ENERGY]++;
                    if (other.getHardpointType() == AMS)
                            userVariant.hardpoints[i][AMS]++;
                }
                else if (userVariant.items[i].elementAt(j).getItemType() == JUMP_JET_ITEM_TYPE) {
                    Special_Equipment other = (Special_Equipment) userVariant.items[i].elementAt(j);
                    userVariant.jumpJets++;
                    userTonnage += other.getTonnage();
                }
                else if (userVariant.items[i].elementAt(j).getItemType() == MYOMER_ITEM_TYPE) {
                    Special_Equipment other = (Special_Equipment) userVariant.items[i].elementAt(j);
                    userVariant.hasMASC = true;
                    userTonnage += other.getTonnage();
                    SPEED_MODIFIER = 21.6;
                }
                else if (userVariant.items[i].elementAt(j).getItemType() == CASE_ITEM_TYPE) {
                    switch(i) {
                        case RIGHT_TORSO:
                            RightTorsoCASECheckBox.setSelected(true);
                            break;
                        case LEFT_TORSO:
                            LeftTorsoCASECheckBox.setSelected(true);
                            break;
                    }
                    userTonnage += 0.5;
                }
            }
        }
        MASCToggleButton.setSelected(userVariant.hasMASC);
        
        userTonnage += userVariant.items[HEAD].elementAt(2).getTonnage();
        if (userVariant.items[HEAD].elementAt(2).toString() == "Command Console")
            userVariant.hasCommandConsole = true;
        else
            userVariant.hasCommandConsole = false;
        CockpitToggleButton.setSelected(userVariant.hasCommandConsole);
        
        SPEED_MODIFIER = 16.2;
        
        resetEquipmentLists();
        checkCriticals();
        loadCriticals();
        setAllToggleButtonText();
    }
    private void setCustomVariant() {
        resetEquipmentLists();
        checkCriticals();
        loadCriticals();
        setAllToggleButtonText();
    }
    private void setDefaultVariant(int chassisType) {
        userMech = new Mech();
        userVariant = new Variant();
        
        userTonnage = 0;
        userAlpha = 0;
        userAlphaHeat = 0;
        userFirepower = 0;
        userHeat = 0;
        userRange = 0;
        
        for (int i = 0; i < Equipment[EQUIPMENT_INDEX - 1].size(); i++)
            if (Equipment[EQUIPMENT_INDEX - 1].elementAt(i).getEquipmentName() == "ECM")
                Equipment[EQUIPMENT_INDEX - 1].removeElementAt(i);
        
        engineRatingSpinnerModel.setValue(100);
        UnconfirmedLabel.setVisible(userMech.isUnconfirmed());
        UnreleasedLabel.setVisible(userMech.isUnreleased());
        ECMLabel.setVisible(userMech.isECMCapable());
        JumpLabel.setVisible(userMech.isJumpCapable());
        
        switch(chassisType) {
            case DEFAULT_INDEX:
                MechImage.setIcon(new ImageIcon(getClass().getResource(DEFAULT_ASSAULT_ICON)));
                break;
            case LIGHT_INDEX:
                MechImage.setIcon(new ImageIcon(getClass().getResource(DEFAULT_LIGHT_ICON)));
                break;
            case MEDIUM_INDEX:
                MechImage.setIcon(new ImageIcon(getClass().getResource(DEFAULT_MEDIUM_ICON)));
                break;
            case HEAVY_INDEX:
                MechImage.setIcon(new ImageIcon(getClass().getResource(DEFAULT_HEAVY_ICON)));
                break;
            case ASSAULT_INDEX:
                MechImage.setIcon(new ImageIcon(getClass().getResource(DEFAULT_ASSAULT_ICON)));
                break;
        }
        loadCriticals();
    }
    private void setMechlabComboBoxes() {
        resetWeaponComboBox(weaponCategories);
        resetEquipmentComboBox(equipmentCategories);
        resetTypeComboBox(chassisTypes);
        resetModelComboBox("");
    }
    public void resetWeaponComboBox(String[] modelNames) {
        WeaponCategoryComboBoxModel.removeAllElements();
        for (int i = 0; i < modelNames.length; i++)
            WeaponCategoryComboBoxModel.addElement(modelNames[i]);
    }
    public void resetWeaponComboBox(String modelNames) {
        WeaponCategoryComboBoxModel.removeAllElements();
        WeaponCategoryComboBoxModel.addElement(modelNames);
    }
    public void resetEquipmentComboBox(String[] modelNames) {
        EquipmentCategoryComboBoxModel.removeAllElements();
        for (int i = 0; i < modelNames.length; i++)
            EquipmentCategoryComboBoxModel.addElement(modelNames[i]);
    }
    public void resetEquipmentComboBox(String modelNames) {
        EquipmentCategoryComboBoxModel.removeAllElements();
        EquipmentCategoryComboBoxModel.addElement(modelNames);
    }
    public void resetTypeComboBox(String[] modelNames) {
        ChassisTypeComboBoxModel.removeAllElements();
        for (int i = 0; i < modelNames.length; i++)
            ChassisTypeComboBoxModel.addElement(modelNames[i]);
    }
    public void resetTypeComboBox(String modelName) {
        ChassisTypeComboBoxModel.removeAllElements();
        ChassisTypeComboBoxModel.addElement(modelName);
    }
    public void resetModelComboBox(String[] modelNames) {
        ChassisModelComboBoxModel.removeAllElements();
        for (int i = 0; i < modelNames.length; i++)
            ChassisModelComboBoxModel.addElement(modelNames[i]);
    }
    public void resetModelComboBox(String modelName) {
        ChassisModelComboBoxModel.removeAllElements();
        ChassisModelComboBoxModel.addElement(modelName);
    }
    //</editor-fold>
    private void MechTabPaneStateChanged(ChangeEvent evt) {//GEN-FIRST:event_MechTabPaneStateChanged
        switch (MechTabPane.getSelectedIndex()) {
            case 0://Chassis Panel
                StatsPanel.setVisible(false);
                SectionArmorPanel.setVisible(false);
                SectionCriticalsPanel.setVisible(false);
                break;
            case 1://Upgrades Panel
                StatsPanel.setVisible(true);
                SectionArmorPanel.setVisible(false);
                SectionCriticalsPanel.setVisible(false);
                break;
            case 2://Weapons Panel
            case 3://Queue Panel
                StatsPanel.setVisible(false);
                SectionArmorPanel.setVisible(false);
                SectionCriticalsPanel.setVisible(true);
                break;
            case 4://Armor Panel
                StatsPanel.setVisible(false);
                SectionArmorPanel.setVisible(true);
                SectionCriticalsPanel.setVisible(false);
                break;
        }
    }//GEN-LAST:event_MechTabPaneStateChanged
    private void loadEquipment() {
        for (int i = 0; i < WEAPON_VECTOR_SIZE; i ++)
            Weapons[i] = new Vector();
        for (int i = 0; i < EQUIPMENT_VECTOR_SIZE; i ++)
            Equipment[i] = new Vector();
        
        for (int i = 0; i < EquipmentQueueCount.length; i++)
            EquipmentQueueCount[i] = 0;
        
        Weapons[BALLISTIC_INDEX - 1].add(new AC2());
        Weapons[BALLISTIC_INDEX - 1].add(new AC5());
        Weapons[BALLISTIC_INDEX - 1].add(new AC10());
        Weapons[BALLISTIC_INDEX - 1].add(new AC20());
        Weapons[BALLISTIC_INDEX - 1].add(new Gauss_Rifle());
        Weapons[BALLISTIC_INDEX - 1].add(new LBX_AC10());
        Weapons[BALLISTIC_INDEX - 1].add(new MG());
        Weapons[BALLISTIC_INDEX - 1].add(new Ultra_AC5());
        
        Weapons[ENERGY_INDEX - 1].add(new Small_Laser());
        Weapons[ENERGY_INDEX - 1].add(new Medium_Laser());
        Weapons[ENERGY_INDEX - 1].add(new Large_Laser());
        Weapons[ENERGY_INDEX - 1].add(new ER_Large_Laser());
        Weapons[ENERGY_INDEX - 1].add(new Small_Pulse_Laser());
        Weapons[ENERGY_INDEX - 1].add(new Medium_Pulse_Laser());
        Weapons[ENERGY_INDEX - 1].add(new Large_Pulse_Laser());
        Weapons[ENERGY_INDEX - 1].add(new PPC());
        Weapons[ENERGY_INDEX - 1].add(new ER_PPC());
        Weapons[ENERGY_INDEX - 1].add(new Flamer());
        
        Weapons[MISSILE_INDEX - 1].add(new LRM5(false));
        Weapons[MISSILE_INDEX - 1].add(new LRM10(false));
        Weapons[MISSILE_INDEX - 1].add(new LRM15(false));
        Weapons[MISSILE_INDEX - 1].add(new LRM20(false));
        Weapons[MISSILE_INDEX - 1].add(new NARC());
        Weapons[MISSILE_INDEX - 1].add(new SRM2(false));
        Weapons[MISSILE_INDEX - 1].add(new SRM4(false));
        Weapons[MISSILE_INDEX - 1].add(new SRM6(false));
        Weapons[MISSILE_INDEX - 1].add(new Streak_SRM2());
        
        Equipment[AMMO_INDEX - 1].add(new AC2_Ammo());
        Equipment[AMMO_INDEX - 1].add(new AC5_Ammo());
        Equipment[AMMO_INDEX - 1].add(new AC10_Ammo());
        Equipment[AMMO_INDEX - 1].add(new AC20_Ammo());
        Equipment[AMMO_INDEX - 1].add(new AMS_Ammo());
        Equipment[AMMO_INDEX - 1].add(new Gauss_Ammo());
        Equipment[AMMO_INDEX - 1].add(new Homing_Pod_Ammo());
        Equipment[AMMO_INDEX - 1].add(new LBX_AC10_Ammo());
        Equipment[AMMO_INDEX - 1].add(new LRM_Ammo(userVariant.hasArtemisIV));
        Equipment[AMMO_INDEX - 1].add(new MG_Ammo());
        Equipment[AMMO_INDEX - 1].add(new SRM_Ammo(userVariant.hasArtemisIV));
        Equipment[AMMO_INDEX - 1].add(new Streak_SRM_Ammo());
        Equipment[AMMO_INDEX - 1].add(new Ultra_AC5_Ammo());
        
        Equipment[EQUIPMENT_INDEX - 1].add(new Anti_Missile_System());
        Equipment[EQUIPMENT_INDEX - 1].add(new Beagle_Active_Probe());
        Equipment[EQUIPMENT_INDEX - 1].add(new Target_Acquisition_Gear());
        
        resetEquipmentLists();
    }
    private void resetEquipmentLists() {
        BallisticListModel.removeAllElements();
        EnergyListModel.removeAllElements();
        MissileListModel.removeAllElements();
        AmmoListModel.removeAllElements();
        EquipmentListModel.removeAllElements();
        
        for (int i = 0; i < Weapons[BALLISTIC_INDEX - 1].size(); i++)
            BallisticListModel.addElement(Weapons[BALLISTIC_INDEX - 1].elementAt(i).toString());
        for (int i = 0; i < Weapons[ENERGY_INDEX - 1].size(); i++)
            EnergyListModel.addElement(Weapons[ENERGY_INDEX - 1].elementAt(i).toString());
        for (int i = 0; i < Weapons[MISSILE_INDEX - 1].size(); i++)
            MissileListModel.addElement(Weapons[MISSILE_INDEX - 1].elementAt(i).toString());
        for (int i = 0; i < Equipment[AMMO_INDEX - 1].size(); i++)
            AmmoListModel.addElement(Equipment[AMMO_INDEX - 1].elementAt(i).toString());
        for (int i = 0; i < Equipment[EQUIPMENT_INDEX - 1].size(); i++)
            EquipmentListModel.addElement(Equipment[EQUIPMENT_INDEX - 1].elementAt(i).toString());
    }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Armor Component Methods">
    private void HeadSpinnerStateChanged(ChangeEvent evt) {//GEN-FIRST:event_HeadSpinnerStateChanged
        updateArmorSpinner(HEAD, HeadArmorSpinnerModel, HeadAmountLabel, HeadArmorProgressBar);
    }//GEN-LAST:event_HeadSpinnerStateChanged
    private void RightTorsoSpinnerStateChanged(ChangeEvent evt) {//GEN-FIRST:event_RightTorsoSpinnerStateChanged
        updateArmorSpinner(RIGHT_TORSO, RightTorsoArmorSpinnerModel, RightTorsoAmountLabel, RightTorsoArmorProgressBar);
        updateArmorSpinner(RIGHT_REAR_TORSO, RightRearTorsoArmorSpinnerModel, RightTorsoAmountLabel, RearRightTorsoArmorProgressBar);
    }//GEN-LAST:event_RightTorsoSpinnerStateChanged
    private void RightRearTorsoSpinnerStateChanged(ChangeEvent evt) {//GEN-FIRST:event_RightRearTorsoSpinnerStateChanged
        updateArmorSpinner(RIGHT_REAR_TORSO, RightRearTorsoArmorSpinnerModel, RightTorsoAmountLabel, RearRightTorsoArmorProgressBar);
        updateArmorSpinner(RIGHT_TORSO, RightTorsoArmorSpinnerModel, RightTorsoAmountLabel, RightTorsoArmorProgressBar);
    }//GEN-LAST:event_RightRearTorsoSpinnerStateChanged
    private void CenterTorsoSpinnerStateChanged(ChangeEvent evt) {//GEN-FIRST:event_CenterTorsoSpinnerStateChanged
        updateArmorSpinner(CENTER_TORSO, CenterTorsoArmorSpinnerModel, CenterTorsoAmountLabel, CenterTorsoArmorProgressBar);
        updateArmorSpinner(CENTER_REAR_TORSO, CenterRearTorsoArmorSpinnerModel, CenterTorsoAmountLabel, RearCenterTorsoArmorProgressBar);
    }//GEN-LAST:event_CenterTorsoSpinnerStateChanged
    private void CenterRearTorsoSpinnerStateChanged(ChangeEvent evt) {//GEN-FIRST:event_CenterRearTorsoSpinnerStateChanged
        updateArmorSpinner(CENTER_REAR_TORSO, CenterRearTorsoArmorSpinnerModel, CenterTorsoAmountLabel, RearCenterTorsoArmorProgressBar);
        updateArmorSpinner(CENTER_TORSO, CenterTorsoArmorSpinnerModel, CenterTorsoAmountLabel, CenterTorsoArmorProgressBar);
    }//GEN-LAST:event_CenterRearTorsoSpinnerStateChanged
    private void LeftTorsoSpinnerStateChanged(ChangeEvent evt) {//GEN-FIRST:event_LeftTorsoSpinnerStateChanged
        updateArmorSpinner(LEFT_TORSO, LeftTorsoArmorSpinnerModel, LeftTorsoAmountLabel, LeftTorsoArmorProgressBar);
        updateArmorSpinner(LEFT_REAR_TORSO, LeftRearTorsoArmorSpinnerModel, LeftTorsoAmountLabel, RearLeftTorsoArmorProgressBar);
    }//GEN-LAST:event_LeftTorsoSpinnerStateChanged
    private void LeftRearTorsoSpinnerStateChanged(ChangeEvent evt) {//GEN-FIRST:event_LeftRearTorsoSpinnerStateChanged
        updateArmorSpinner(LEFT_REAR_TORSO, LeftRearTorsoArmorSpinnerModel, LeftTorsoAmountLabel, RearLeftTorsoArmorProgressBar);
        updateArmorSpinner(LEFT_TORSO, LeftTorsoArmorSpinnerModel, LeftTorsoAmountLabel, LeftTorsoArmorProgressBar);
    }//GEN-LAST:event_LeftRearTorsoSpinnerStateChanged
    private void RightArmSpinnerStateChanged(ChangeEvent evt) {//GEN-FIRST:event_RightArmSpinnerStateChanged
        updateArmorSpinner(RIGHT_ARM, RightArmArmorSpinnerModel, RightArmAmountLabel, RightArmArmorProgressBar);
    }//GEN-LAST:event_RightArmSpinnerStateChanged
    private void LeftArmSpinnerStateChanged(ChangeEvent evt) {//GEN-FIRST:event_LeftArmSpinnerStateChanged
        updateArmorSpinner(LEFT_ARM, LeftArmArmorSpinnerModel, LeftArmAmountLabel, LeftArmArmorProgressBar);
    }//GEN-LAST:event_LeftArmSpinnerStateChanged
    private void RightLegSpinnerStateChanged(ChangeEvent evt) {//GEN-FIRST:event_RightLegSpinnerStateChanged
        updateArmorSpinner(RIGHT_LEG, RightLegArmorSpinnerModel, RightLegAmountLabel, RightLegArmorProgressBar);
    }//GEN-LAST:event_RightLegSpinnerStateChanged
    private void LeftLegSpinnerStateChanged(ChangeEvent evt) {//GEN-FIRST:event_LeftLegSpinnerStateChanged
        updateArmorSpinner(LEFT_LEG, LeftLegArmorSpinnerModel, LeftLegAmountLabel, LeftLegArmorProgressBar);
    }//GEN-LAST:event_LeftLegSpinnerStateChanged
    private void MaxArmorButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_MaxArmorButtonActionPerformed
        HeadArmorSpinnerModel.setValue(userMech.getMaxArmor(HEAD));
        RightTorsoArmorSpinnerModel.setValue((int)(userMech.getMaxArmor(RIGHT_TORSO) * (1 - u.REAR_ARMOR_PERCENTAGE)));
        LeftTorsoArmorSpinnerModel.setValue((int)(userMech.getMaxArmor(LEFT_TORSO) * (1 - u.REAR_ARMOR_PERCENTAGE)));
        CenterTorsoArmorSpinnerModel.setValue((int)(userMech.getMaxArmor(CENTER_TORSO) * (1 - u.REAR_ARMOR_PERCENTAGE)));
        RightRearTorsoArmorSpinnerModel.setValue((int)(userMech.getMaxArmor(RIGHT_TORSO) * u.REAR_ARMOR_PERCENTAGE));
        LeftRearTorsoArmorSpinnerModel.setValue((int)(userMech.getMaxArmor(LEFT_TORSO) * u.REAR_ARMOR_PERCENTAGE));
        CenterRearTorsoArmorSpinnerModel.setValue((int)(userMech.getMaxArmor(CENTER_TORSO) * u.REAR_ARMOR_PERCENTAGE));
        RightArmArmorSpinnerModel.setValue(userMech.getMaxArmor(RIGHT_ARM));
        LeftArmArmorSpinnerModel.setValue(userMech.getMaxArmor(LEFT_ARM));
        RightLegArmorSpinnerModel.setValue(userMech.getMaxArmor(RIGHT_LEG));
        LeftLegArmorSpinnerModel.setValue(userMech.getMaxArmor(LEFT_LEG));
    }//GEN-LAST:event_MaxArmorButtonActionPerformed
    private void MaxArmorButton1ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_MaxArmorButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaxArmorButton1ActionPerformed
    private void updateArmorSpinner(int Section, SpinnerNumberModel ArmorSpinnerModel, JLabel ArmorLabel, JProgressBar ArmorProgressBar) {
        if (isLoading)
            return;
        
        int temp1 = userVariant.armor[Section];
        userVariant.armor[Section] = Integer.parseInt(ArmorSpinnerModel.getValue().toString());
        Armor tempA = new Armor(userVariant.hasFerroFibrous, userVariant.getTotalArmor());
        userTonnage += ((double)(userVariant.armor[Section] - temp1) / tempA.getPointsPerTon());
        switch(Section)
        {
            case RIGHT_ARM:
            case LEFT_ARM:
                ArmorSpinnerModel.setMaximum(userMech.getMaxArmor(Section));
                ArmorLabel.setText("" + userVariant.armor[Section] + "/" + userMech.getMaxArmor(Section));
                break;
            case RIGHT_TORSO:
            case LEFT_TORSO:
            case CENTER_TORSO:
                ArmorSpinnerModel.setMaximum(userMech.getMaxArmor(Section) - userVariant.armor[Section + 6]);
                ArmorLabel.setText("" + (userVariant.armor[Section] + userVariant.armor[Section + 6]) + "/" + userMech.getMaxArmor(Section));
                break;
            case HEAD:
            case RIGHT_LEG:
            case LEFT_LEG:
                ArmorSpinnerModel.setMaximum(userMech.getMaxArmor(Section));
                ArmorLabel.setText("" + userVariant.armor[Section] + "/" + userMech.getMaxArmor(Section));
                break;
            case RIGHT_REAR_TORSO:
            case LEFT_REAR_TORSO:
            case CENTER_REAR_TORSO:
                ArmorSpinnerModel.setMaximum(userMech.getMaxArmor(Section - 6) - userVariant.armor[Section - 6]);
                ArmorLabel.setText("" + (userVariant.armor[Section] + userVariant.armor[Section - 6]) + "/" + userMech.getMaxArmor(Section - 6));
                break;
        }
        
        ArmorProgressBar.setValue(userVariant.armor[Section]);
        ArmorProgressBar.setString("" + userVariant.armor[Section]);
        TotalAmountLabel.setText("" + userVariant.getTotalArmor() + "/" + userMech.getMaxTotalArmor());
        updateTonnageProgressBar();
        updateArmorProgressBar();
    }
    private void initArmorComponents() {
        HeadAmountLabel.setText("" + userVariant.armor[HEAD] + "/" + userMech.getMaxArmor(HEAD));
        RightTorsoAmountLabel.setText("" + (userVariant.armor[RIGHT_TORSO] + userVariant.armor[RIGHT_REAR_TORSO]) + "/" + userMech.getMaxArmor(RIGHT_TORSO));
        CenterTorsoAmountLabel.setText("" + (userVariant.armor[CENTER_TORSO] + userVariant.armor[CENTER_REAR_TORSO]) + "/" + userMech.getMaxArmor(CENTER_TORSO));
        LeftTorsoAmountLabel.setText("" + (userVariant.armor[LEFT_TORSO] + userVariant.armor[LEFT_REAR_TORSO]) + "/" + userMech.getMaxArmor(LEFT_TORSO));
        RightArmAmountLabel.setText("" + userVariant.armor[RIGHT_ARM] + "/" + userMech.getMaxArmor(RIGHT_ARM));
        LeftArmAmountLabel.setText("" + userVariant.armor[LEFT_ARM] + "/" + userMech.getMaxArmor(LEFT_ARM));
        RightLegAmountLabel.setText("" + userVariant.armor[RIGHT_LEG] + "/" + userMech.getMaxArmor(RIGHT_LEG));
        LeftLegAmountLabel.setText("" + userVariant.armor[LEFT_LEG] + "/" + userMech.getMaxArmor(LEFT_LEG));
    
        HeadArmorSpinnerModel.setMaximum(userMech.getMaxArmor(HEAD));
        RightTorsoArmorSpinnerModel.setMaximum(userMech.getMaxArmor(RIGHT_TORSO) - userVariant.armor[RIGHT_REAR_TORSO]);
        LeftTorsoArmorSpinnerModel.setMaximum(userMech.getMaxArmor(CENTER_TORSO) - userVariant.armor[CENTER_REAR_TORSO]);
        CenterTorsoArmorSpinnerModel.setMaximum(userMech.getMaxArmor(LEFT_TORSO) - userVariant.armor[LEFT_REAR_TORSO]);
        RightRearTorsoArmorSpinnerModel.setMaximum(userMech.getMaxArmor(RIGHT_TORSO) - userVariant.armor[RIGHT_TORSO]);
        CenterRearTorsoArmorSpinnerModel.setMaximum(userMech.getMaxArmor(CENTER_TORSO) - userVariant.armor[CENTER_TORSO]);
        LeftRearTorsoArmorSpinnerModel.setMaximum(userMech.getMaxArmor(LEFT_TORSO) - userVariant.armor[LEFT_TORSO]);
        RightArmArmorSpinnerModel.setMaximum(userMech.getMaxArmor(RIGHT_ARM));
        LeftArmArmorSpinnerModel.setMaximum(userMech.getMaxArmor(LEFT_ARM));
        RightLegArmorSpinnerModel.setMaximum(userMech.getMaxArmor(RIGHT_LEG));
        LeftLegArmorSpinnerModel.setMaximum(userMech.getMaxArmor(LEFT_LEG));
    
        HeadArmorSpinnerModel.setValue(userMech.getStockArmor(HEAD));
        RightTorsoArmorSpinnerModel.setValue(userMech.getStockArmor(RIGHT_TORSO));
        LeftTorsoArmorSpinnerModel.setValue(userMech.getStockArmor(LEFT_TORSO));
        CenterTorsoArmorSpinnerModel.setValue(userMech.getStockArmor(CENTER_TORSO));
        RightRearTorsoArmorSpinnerModel.setValue(userMech.getStockArmor(RIGHT_REAR_TORSO));
        CenterRearTorsoArmorSpinnerModel.setValue(userMech.getStockArmor(CENTER_REAR_TORSO));
        LeftRearTorsoArmorSpinnerModel.setValue(userMech.getStockArmor(LEFT_REAR_TORSO));
        RightArmArmorSpinnerModel.setValue(userMech.getStockArmor(RIGHT_ARM));
        LeftArmArmorSpinnerModel.setValue(userMech.getStockArmor(LEFT_ARM));
        RightLegArmorSpinnerModel.setValue(userMech.getStockArmor(RIGHT_LEG));
        LeftLegArmorSpinnerModel.setValue(userMech.getStockArmor(LEFT_LEG));
        
        HeadArmorProgressBar.setMaximum(userMech.getMaxArmor(HEAD));
        RightTorsoArmorProgressBar.setMaximum(userMech.getMaxArmor(RIGHT_TORSO));
        CenterTorsoArmorProgressBar.setMaximum(userMech.getMaxArmor(CENTER_TORSO));
        LeftTorsoArmorProgressBar.setMaximum(userMech.getMaxArmor(LEFT_TORSO));
        RearRightTorsoArmorProgressBar.setMaximum(userMech.getMaxArmor(RIGHT_TORSO));
        RearCenterTorsoArmorProgressBar.setMaximum(userMech.getMaxArmor(CENTER_TORSO));
        RearLeftTorsoArmorProgressBar.setMaximum(userMech.getMaxArmor(LEFT_TORSO));
        RightArmArmorProgressBar.setMaximum(userMech.getMaxArmor(RIGHT_ARM));
        LeftArmArmorProgressBar.setMaximum(userMech.getMaxArmor(LEFT_ARM));
        RightLegArmorProgressBar.setMaximum(userMech.getMaxArmor(RIGHT_LEG));
        LeftLegArmorProgressBar.setMaximum(userMech.getMaxArmor(LEFT_LEG));

        HeadArmorProgressBar.setValue(userMech.getStockArmor(HEAD));
        RightTorsoArmorProgressBar.setValue(userMech.getStockArmor(RIGHT_TORSO));
        CenterTorsoArmorProgressBar.setValue(userMech.getStockArmor(CENTER_TORSO));
        LeftTorsoArmorProgressBar.setValue(userMech.getStockArmor(LEFT_TORSO));
        RearRightTorsoArmorProgressBar.setValue(userMech.getStockArmor(RIGHT_REAR_TORSO));
        RearCenterTorsoArmorProgressBar.setValue(userMech.getStockArmor(CENTER_REAR_TORSO));
        RearLeftTorsoArmorProgressBar.setValue(userMech.getStockArmor(LEFT_REAR_TORSO));
        RightArmArmorProgressBar.setValue(userMech.getStockArmor(RIGHT_ARM));
        LeftArmArmorProgressBar.setValue(userMech.getStockArmor(LEFT_ARM));
        RightLegArmorProgressBar.setValue(userMech.getStockArmor(RIGHT_LEG));
        LeftLegArmorProgressBar.setValue(userMech.getStockArmor(LEFT_LEG));
    }
    private void resetArmorComponents() {
        HeadArmorSpinnerModel.setMaximum(0);
        RightTorsoArmorSpinnerModel.setMaximum(0);
        LeftTorsoArmorSpinnerModel.setMaximum(0);
        CenterTorsoArmorSpinnerModel.setMaximum(0);
        RightRearTorsoArmorSpinnerModel.setMaximum(0);
        CenterRearTorsoArmorSpinnerModel.setMaximum(0);
        LeftRearTorsoArmorSpinnerModel.setMaximum(0);
        RightArmArmorSpinnerModel.setMaximum(0);
        LeftArmArmorSpinnerModel.setMaximum(0);
        RightLegArmorSpinnerModel.setMaximum(0);
        LeftLegArmorSpinnerModel.setMaximum(0);
    
        HeadArmorSpinnerModel.setValue(0);
        RightTorsoArmorSpinnerModel.setValue(0);
        LeftTorsoArmorSpinnerModel.setValue(0);
        CenterTorsoArmorSpinnerModel.setValue(0);
        RightRearTorsoArmorSpinnerModel.setValue(0);
        CenterRearTorsoArmorSpinnerModel.setValue(0);
        LeftRearTorsoArmorSpinnerModel.setValue(0);
        RightArmArmorSpinnerModel.setValue(0);
        LeftArmArmorSpinnerModel.setValue(0);
        RightLegArmorSpinnerModel.setValue(0);
        LeftLegArmorSpinnerModel.setValue(0);
    }
    private int getItemIndex(Item item) {
        switch (item.getItemType()) {
            case INTERNAL_ITEM_TYPE:
                return INTERNAL_INDEX;
            case ARMOR_ITEM_TYPE:
                return ARMOR_INDEX;
            case HEAT_SINK_ITEM_TYPE:
                return HEAT_SINK_INDEX;
            case ENGINE_ITEM_TYPE:
                return ENGINE_INDEX;
            case JUMP_JET_ITEM_TYPE:
                return JUMP_JET_INDEX;
            case MYOMER_ITEM_TYPE:
                return MASC_INDEX;
            case CASE_ITEM_TYPE:
                return CASE_INDEX;
            case COCKPIT_ITEM_TYPE:
                return COCKPIT_INDEX;
            case COMPONENT_ITEM_TYPE:
                if (item.getEquipmentName() == "Hand")
                    return HAND_INDEX;
                else if (item.getEquipmentName() == "Lower Arm")
                    return LOWER_ARM_INDEX;
                else if (item.getEquipmentName() == "Upper Arm")
                    return UPPER_ARM_INDEX;
                else if (item.getEquipmentName() == "Shoulder")
                    return SHOULDER_INDEX;
                else if (item.getEquipmentName() == "Hip")
                    return HIP_INDEX;
                else if (item.getEquipmentName() == "Lower Leg")
                    return LOWER_LEG_INDEX;
                else if (item.getEquipmentName() == "Upper Leg")
                    return UPPER_LEG_INDEX;
                else if (item.getEquipmentName() == "Foot")
                    return FOOT_INDEX;
                else if (item.getEquipmentName() == "Gyro")
                    return GYRO_INDEX;
                else if (item.getEquipmentName() == "Sensors")
                    return SENSORS_INDEX;
                else if (item.getEquipmentName() == "Life Support")
                    return LIFE_SUPPORT_INDEX;
                return -1;
            case EQUIPMENT_ITEM_TYPE:
                if (item.getEquipmentName() == "AMS")
                    return AMS_INDEX;
                else if (item.getEquipmentName() == "BAP")
                    return BAP_INDEX;
                else if (item.getEquipmentName() == "ECM")
                    return GECM_INDEX;
                else if (item.getEquipmentName() == "TAG")
                    return TAG_INDEX;
                return -1;
            case AMMO_ITEM_TYPE:
                if (item.getEquipmentName() == "AC2 Ammo")
                    return AC2_AMMO_INDEX;
                else if (item.getEquipmentName() == "AC5 Ammo")
                    return AC5_AMMO_INDEX;
                else if (item.getEquipmentName() == "AC10 Ammo")
                    return AC10_AMMO_INDEX;
                else if (item.getEquipmentName() == "AC20 Ammo")
                    return AC20_AMMO_INDEX;
                else if (item.getEquipmentName() == "AMS Ammo")
                    return AMS_AMMO_INDEX;
                else if (item.getEquipmentName() == "Gauss Ammo")
                    return GAUSS_AMMO_INDEX;
                else if (item.getEquipmentName() == "Homing Pod Ammo")
                    return HOMING_POD_AMMO_INDEX;
                else if (item.getEquipmentName() == "LBX AC10 Ammo")
                    return LBX_AC10_AMMO_INDEX;
                else if (item.getEquipmentName() == "LRM Ammo" || item.getEquipmentName() == "ALRM Ammo")
                    return LRM_AMMO_INDEX;
                else if (item.getEquipmentName() == "MG Ammo")
                    return MG_AMMO_INDEX;
                else if (item.getEquipmentName() == "SRM Ammo" || item.getEquipmentName() == "ASRM Ammo")
                    return SRM_AMMO_INDEX;
                else if (item.getEquipmentName() == "Streak SRM Ammo")
                    return STREAK_SRM_AMMO_INDEX;
                else if (item.getEquipmentName() == "Ultra AC5 Ammo")
                    return ULTRA_AC5_AMMO_INDEX;
                return -1;
            case WEAPON_ITEM_TYPE:
                if (item.getEquipmentName() == "AC2")
                    return AC2_INDEX;
                else if (item.getEquipmentName() == "AC5")
                    return AC5_INDEX;
                else if (item.getEquipmentName() == "AC10")
                    return AC10_INDEX;
                else if (item.getEquipmentName() == "AC20")
                    return AC20_INDEX;
                else if (item.getEquipmentName() == "Gauss Rifle")
                    return GAUSS_RIFLE_INDEX;
                else if (item.getEquipmentName() == "Ultra AC5")
                    return ULTRA_AC5_INDEX;
                else if (item.getEquipmentName() == "LBX10")
                    return LBX_AC10_INDEX;
                else if (item.getEquipmentName() == "Machine Gun")
                    return MG_INDEX;
                else if (item.getEquipmentName() == "LRM5" || item.getEquipmentName() == "ALRM5")
                    return LRM5_INDEX;
                else if (item.getEquipmentName() == "LRM10" || item.getEquipmentName() == "ALRM10")
                    return LRM10_INDEX;
                else if (item.getEquipmentName() == "LRM15" || item.getEquipmentName() == "ALRM15")
                    return LRM15_INDEX;
                else if (item.getEquipmentName() == "LRM20" || item.getEquipmentName() == "ALRM20")
                    return LRM20_INDEX;
                else if (item.getEquipmentName() == "SRM2" || item.getEquipmentName() == "ASRM2")
                    return SRM2_INDEX;
                else if (item.getEquipmentName() == "SRM4" || item.getEquipmentName() == "ASRM4")
                    return SRM4_INDEX;
                else if (item.getEquipmentName() == "SRM6" || item.getEquipmentName() == "ASRM6")
                    return SRM6_INDEX;
                else if (item.getEquipmentName() == "Streak SRM2")
                    return STREAK_SRM2_INDEX;
                else if (item.getEquipmentName() == "NARC")
                    return NARC_INDEX;
                else if (item.getEquipmentName() == "Small Laser")
                    return SMALL_LASER_INDEX;
                else if (item.getEquipmentName() == "Medium Laser")
                    return MEDIUM_LASER_INDEX;
                else if (item.getEquipmentName() == "Large Laser")
                    return LARGE_LASER_INDEX;
                else if (item.getEquipmentName() == "ER Large Laser")
                    return ER_LARGE_LASER_INDEX;
                else if (item.getEquipmentName() == "Small Pulse Laser")
                    return SMALL_PULSE_LASER_INDEX;
                else if (item.getEquipmentName() == "Medium Pulse Laser")
                    return MEDIUM_PULSE_LASER_INDEX;
                else if (item.getEquipmentName() == "Large Pulse Laser")
                    return LARGE_PULSE_LASER_INDEX;
                else if (item.getEquipmentName() == "PPC")
                    return PPC_INDEX;
                else if (item.getEquipmentName() == "ERPPC")
                    return ER_PPC_INDEX;
                else if (item.getEquipmentName() == "Flamer")
                    return FLAMER_INDEX;
                return -1;
            default:
                return -1;
        }
    }
    private Item loadItem(int index) {
        switch (index) {
            case INTERNAL_INDEX:
                return new Internals(userVariant.hasEndoSteel, userMech.getTonnage());
            case ARMOR_INDEX:
                return new Armor(userVariant.hasFerroFibrous, userVariant.getTotalArmor());
            case HEAT_SINK_INDEX:
                return new Heat_Sink(userVariant.hasDoubleHS);
            case ENGINE_INDEX:
                return new Engine(userVariant.hasXLEngine, userVariant.engineRating);
            case JUMP_JET_INDEX:
                return new Jump_Jet(userMech.getTonnage());
            case AC2_AMMO_INDEX:
                return new AC2_Ammo();
            case AC5_AMMO_INDEX:
                return new AC5_Ammo();
            case AC10_AMMO_INDEX:
                return new AC10_Ammo();
            case AC20_AMMO_INDEX:
                return new AC20_Ammo();
            case AMS_AMMO_INDEX:
                return new AMS_Ammo();
            case GAUSS_AMMO_INDEX:
                return new Gauss_Ammo();
            case HOMING_POD_AMMO_INDEX:
                return new Homing_Pod_Ammo();
            case LBX_AC10_AMMO_INDEX:
                return new LBX_AC10_Ammo();
            case LRM_AMMO_INDEX:
                return new LRM_Ammo(userVariant.hasArtemisIV);
            case MG_AMMO_INDEX:
                return new MG_Ammo();
            case SRM_AMMO_INDEX:
                return new SRM_Ammo(userVariant.hasArtemisIV);
            case STREAK_SRM_AMMO_INDEX:
                return new Streak_SRM_Ammo();
            case ULTRA_AC5_AMMO_INDEX:
                return new Ultra_AC5_Ammo();
            case AC2_INDEX:
                return new AC2();
            case AC5_INDEX:
                return new AC5();
            case AC10_INDEX:
                return new AC10();
            case AC20_INDEX:
                return new AC20();
            case GAUSS_RIFLE_INDEX:
                return new Gauss_Rifle();
            case ULTRA_AC5_INDEX:
                return new Ultra_AC5();
            case LBX_AC10_INDEX:
                return new LBX_AC10();
            case MG_INDEX:
                return new MG();
            case LRM5_INDEX:
                return new LRM5(userVariant.hasArtemisIV);
            case LRM10_INDEX:
                return new LRM10(userVariant.hasArtemisIV);
            case LRM15_INDEX:
                return new LRM15(userVariant.hasArtemisIV);
            case LRM20_INDEX:
                return new LRM20(userVariant.hasArtemisIV);
            case SRM2_INDEX:
                return new SRM2(userVariant.hasArtemisIV);
            case SRM4_INDEX:
                return new SRM4(userVariant.hasArtemisIV);
            case SRM6_INDEX:
                return new SRM6(userVariant.hasArtemisIV);
            case STREAK_SRM2_INDEX:
                return new Streak_SRM2();
            case NARC_INDEX:
                return new NARC();
            case SMALL_LASER_INDEX:
                return new Small_Laser();
            case MEDIUM_LASER_INDEX:
                return new Medium_Laser();
            case LARGE_LASER_INDEX:
                return new Large_Laser();
            case ER_LARGE_LASER_INDEX:
                return new ER_Large_Laser();
            case SMALL_PULSE_LASER_INDEX:
                return new Small_Pulse_Laser();
            case MEDIUM_PULSE_LASER_INDEX:
                return new Medium_Pulse_Laser();
            case LARGE_PULSE_LASER_INDEX:
                return new Large_Pulse_Laser();
            case PPC_INDEX:
                return new PPC();
            case ER_PPC_INDEX:
                return new ER_PPC();
            case FLAMER_INDEX:
                return new Flamer();
            case AMS_INDEX:
                return new Anti_Missile_System();
            case BAP_INDEX:
                return new Beagle_Active_Probe();
            case GECM_INDEX:
                return new Guardian_ECM_Suite();
            case TAG_INDEX:
                return new Target_Acquisition_Gear();
            case MASC_INDEX:
                return new MASC(userMech.getTonnage());
            case CASE_INDEX:
                return new CASE();
            case HAND_INDEX:
                return new Hand_Actuator();
            case LOWER_ARM_INDEX:
                return new Lower_Arm_Actuator();
            case UPPER_ARM_INDEX:
                return new Upper_Arm_Actuator();
            case SHOULDER_INDEX:
                return new Shoulder_Actuator();
            case HIP_INDEX:
                return new Hip_Actuator();
            case LOWER_LEG_INDEX:
                return new Lower_Leg_Actuator();
            case UPPER_LEG_INDEX:
                return new Upper_Leg_Actuator();
            case FOOT_INDEX:
                return new Foot_Actuator();
            case GYRO_INDEX:
                return new Gyro();
            case SENSORS_INDEX:
                return new Sensors();
            case LIFE_SUPPORT_INDEX:
                return new Life_Support();
            case COCKPIT_INDEX:
                return new Cockpit(userVariant.hasCommandConsole);
            default:
                return null;
        }
    }
    private void RightTorsoCASECheckBoxActionPerformed(ActionEvent evt) {//GEN-FIRST:event_RightTorsoCASECheckBoxActionPerformed
        if (ModelComboBox.getSelectedIndex() == 0)
            return;
        
        if (RightTorsoCASECheckBox.isSelected() && userVariant.criticals[RIGHT_TORSO] > 0) {
            userVariant.items[RIGHT_TORSO].add(new CASE());
            userVariant.criticals[RIGHT_TORSO]--;
            userTonnage += 0.5;
        }
        else if (RightTorsoCASECheckBox.isSelected()) {
            RightTorsoCASECheckBox.setSelected(false);
        }
        else {
            for (int i = userVariant.items[RIGHT_TORSO].size() - 1; i > -1; i--) {
                if (userVariant.items[RIGHT_TORSO].elementAt(i).getItemType() == CASE_ITEM_TYPE) {
                    userVariant.criticals[RIGHT_TORSO]++;
                    userTonnage -= 0.5;
                    userVariant.items[RIGHT_TORSO].removeElementAt(i);
                }
            }
        }
        loadCriticals(RIGHT_TORSO);
        updateTonnageProgressBar();
    }//GEN-LAST:event_RightTorsoCASECheckBoxActionPerformed
    private void InfoButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_InfoButtonActionPerformed
        JDialog dlgBox = null;

        switch(EquipmentTabbedPane.getSelectedIndex()) {
            case 0:
                if (BallisticList.getSelectedIndex() < 0)
                    return;
                dlgBox = new WeaponInfoDialogBox(this, true, Weapons[BALLISTIC_INDEX - 1].elementAt(BallisticList.getSelectedIndex()));
                break;
            case 1:
                if (EnergyList.getSelectedIndex() < 0)
                    return;
                dlgBox = new WeaponInfoDialogBox(this, true, Weapons[ENERGY_INDEX - 1].elementAt(EnergyList.getSelectedIndex()));
                break;
            case 2:
                if (MissileList.getSelectedIndex() < 0)
                    return;
                dlgBox = new WeaponInfoDialogBox(this, true, Weapons[MISSILE_INDEX - 1].elementAt(MissileList.getSelectedIndex()));
                break;
            case 3:
                if (AmmoList.getSelectedIndex() < 0)
                    return;
                dlgBox = new AmmoInfoDialogBox(this, true, (AmmoBin)Equipment[AMMO_INDEX - 1].elementAt(AmmoList.getSelectedIndex()));
                break;
            default:
                break;
        }

        if (dlgBox != null) {
            dlgBox.setLocationRelativeTo(this);
            dlgBox.setVisible(true);
        }
    }//GEN-LAST:event_InfoButtonActionPerformed
    private void AddButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        if (ModelComboBox.getSelectedIndex() == 0)
            return;
        
        Weapon weapon = null;
        AmmoBin ammo = null;
        Special_Equipment other = null;
        
        switch(EquipmentTabbedPane.getSelectedIndex()) {
            case 0:
                if (BallisticList.getSelectedIndex() < 0)
                    return;
                
                weapon = Weapons[BALLISTIC].elementAt(BallisticList.getSelectedIndex());
                break;
            case 1:
                if (EnergyList.getSelectedIndex() < 0)
                    return;
                
                weapon = Weapons[ENERGY].elementAt(EnergyList.getSelectedIndex());
                break;
            case 2:
                if (MissileList.getSelectedIndex() < 0)
                    return;
                
                weapon = Weapons[MISSILE].elementAt(MissileList.getSelectedIndex());
                break;
            case 3:
                if (AmmoList.getSelectedIndex() < 0)
                    return;
                
                ammo = (AmmoBin)Equipment[0].elementAt(AmmoList.getSelectedIndex());
                break;
            case 4:
                if (EquipmentList.getSelectedIndex() < 0)
                    return;
                
                other = (Special_Equipment)Equipment[1].elementAt(EquipmentList.getSelectedIndex());
                break;
        }
        
        if (weapon != null) {
            addItem(weapon);
            userHeat += weapon.getHeatPerSecond();
            userFirepower += weapon.getDamagePerSecond();
            userAlpha += weapon.getDamage();
            userAlphaHeat += weapon.getHeat();
            userTonnage += weapon.getTonnage();
            if (weapon.getRecycle() > userRecycle)
                userRecycle = weapon.getRecycle();
        }
        else if (ammo != null) {
            addItem(ammo);
            userTonnage += ammo.getTonnage();
        }
        else if (other != null) {
            addItem(other);
            userTonnage += other.getTonnage();
        }
        else
            return;
        
        updateFirepowerProgressBar();
        updateRangeProgressBar();
        updateHeatProgressBar(); updateSpecialProgressBar();
        updateTonnageProgressBar();
        updateItemList();
    }//GEN-LAST:event_AddButtonActionPerformed
    private void EquipmentQueueButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_EquipmentQueueButtonActionPerformed
        if (ModelComboBox.getSelectedIndex() == 0)
            return;
            
        for (int i = 0; i < NUMBER_OF_CRITICAL_SECTIONS; i++)
            for (int j = userVariant.items[i].size() - 1; j >= 0; j--)
                if (userVariant.items[i].elementAt(j).isRemovable()) {
                    addItem(userVariant.items[i].elementAt(j));
                    userVariant.criticals[i] += userVariant.items[i].elementAt(j).getCriticals();
                    switch(userVariant.items[i].elementAt(j).getHardpointType())
                    {
                        case ENERGY:
                            userVariant.hardpoints[i][ENERGY]--;
                            break;
                        case BALLISTIC:
                            userVariant.hardpoints[i][BALLISTIC]--;
                            break;
                        case MISSILE:
                            userVariant.hardpoints[i][MISSILE]--;
                            break;
                        case AMS:
                            userVariant.hardpoints[i][AMS]--;
                            break;
                        default:
                            break;
                    }
                    userVariant.items[i].removeElementAt(j);
                }
        
        initAllCriticalHardpoints();
        loadCriticals();
        updateItemList();
    }//GEN-LAST:event_EquipmentQueueButtonActionPerformed
    private void HeadListMouseClicked(MouseEvent evt) {//GEN-FIRST:event_HeadListMouseClicked
        selectCriticalList(HEAD);
        removeSelectedItem(evt, HeadList);
    }//GEN-LAST:event_HeadListMouseClicked
    private void CenterTorsoListMouseClicked(MouseEvent evt) {//GEN-FIRST:event_CenterTorsoListMouseClicked
        selectCriticalList(CENTER_TORSO);
        removeSelectedItem(evt, CenterTorsoList);
    }//GEN-LAST:event_CenterTorsoListMouseClicked
    private void RightTorsoListMouseClicked(MouseEvent evt) {//GEN-FIRST:event_RightTorsoListMouseClicked
        selectCriticalList(RIGHT_TORSO);
        removeSelectedItem(evt, RightTorsoList);
    }//GEN-LAST:event_RightTorsoListMouseClicked
    private void LeftTorsoListMouseClicked(MouseEvent evt) {//GEN-FIRST:event_LeftTorsoListMouseClicked
        selectCriticalList(LEFT_TORSO);
        removeSelectedItem(evt, LeftTorsoList);
    }//GEN-LAST:event_LeftTorsoListMouseClicked
    private void RightArmListMouseClicked(MouseEvent evt) {//GEN-FIRST:event_RightArmListMouseClicked
        selectCriticalList(RIGHT_ARM);
        removeSelectedItem(evt, RightArmList);
    }//GEN-LAST:event_RightArmListMouseClicked
    private void LeftArmListMouseClicked(MouseEvent evt) {//GEN-FIRST:event_LeftArmListMouseClicked
        selectCriticalList(LEFT_ARM);
        removeSelectedItem(evt, LeftArmList);
    }//GEN-LAST:event_LeftArmListMouseClicked
    private void RightLegListMouseClicked(MouseEvent evt) {//GEN-FIRST:event_RightLegListMouseClicked
        selectCriticalList(RIGHT_LEG);
        removeSelectedItem(evt, RightLegList);
    }//GEN-LAST:event_RightLegListMouseClicked
    private void LeftLegListMouseClicked(MouseEvent evt) {//GEN-FIRST:event_LeftLegListMouseClicked
        selectCriticalList(LEFT_LEG);
        removeSelectedItem(evt, LeftLegList);
    }//GEN-LAST:event_LeftLegListMouseClicked
    private void selectCriticalList(int newSection) {
        //Set All Critical Panels as unselected first
        HeadCriticalPanel.setOpaque(false);
        HeadCriticalPanel.setBackground(u.DEFAULT_CRITICAL_PANEL_COLOR);
        CenterTorsoCriticalPanel.setOpaque(false);
        CenterTorsoCriticalPanel.setBackground(u.DEFAULT_CRITICAL_PANEL_COLOR);
        RightTorsoCriticalPanel.setOpaque(false);
        RightTorsoCriticalPanel.setBackground(u.DEFAULT_CRITICAL_PANEL_COLOR);
        LeftTorsoCriticalPanel.setOpaque(false);
        LeftTorsoCriticalPanel.setBackground(u.DEFAULT_CRITICAL_PANEL_COLOR);
        RightArmCriticalPanel.setOpaque(false);
        RightArmCriticalPanel.setBackground(u.DEFAULT_CRITICAL_PANEL_COLOR);
        LeftArmCriticalPanel.setOpaque(false);
        LeftArmCriticalPanel.setBackground(u.DEFAULT_CRITICAL_PANEL_COLOR);
        RightLegCriticalPanel.setOpaque(false);
        RightLegCriticalPanel.setBackground(u.DEFAULT_CRITICAL_PANEL_COLOR);
        LeftLegCriticalPanel.setOpaque(false);
        LeftLegCriticalPanel.setBackground(u.DEFAULT_CRITICAL_PANEL_COLOR);
        
        switch (newSection)
        {
            case HEAD:
                userSection = newSection;
                HeadCriticalPanel.setOpaque(true);
                HeadCriticalPanel.setBackground(u.SELECTED_CRITICAL_PANEL_COLOR);
                break;
            case CENTER_TORSO:
                userSection = newSection;
                CenterTorsoCriticalPanel.setOpaque(true);
                CenterTorsoCriticalPanel.setBackground(u.SELECTED_CRITICAL_PANEL_COLOR);
                break;
            case RIGHT_TORSO:
                userSection = newSection;
                RightTorsoCriticalPanel.setOpaque(true);
                RightTorsoCriticalPanel.setBackground(u.SELECTED_CRITICAL_PANEL_COLOR);
                break;
            case LEFT_TORSO:
                userSection = newSection;
                LeftTorsoCriticalPanel.setOpaque(true);
                LeftTorsoCriticalPanel.setBackground(u.SELECTED_CRITICAL_PANEL_COLOR);
                break;
            case RIGHT_ARM:
                userSection = newSection;
                RightArmCriticalPanel.setOpaque(true);
                RightArmCriticalPanel.setBackground(u.SELECTED_CRITICAL_PANEL_COLOR);
                break;
            case LEFT_ARM:
                userSection = newSection;
                LeftArmCriticalPanel.setOpaque(true);
                LeftArmCriticalPanel.setBackground(u.SELECTED_CRITICAL_PANEL_COLOR);
                break;
            case RIGHT_LEG:
                userSection = newSection;
                RightLegCriticalPanel.setOpaque(true);
                RightLegCriticalPanel.setBackground(u.SELECTED_CRITICAL_PANEL_COLOR);
                break;
            case LEFT_LEG:
                userSection = newSection;
                LeftLegCriticalPanel.setOpaque(true);
                LeftLegCriticalPanel.setBackground(u.SELECTED_CRITICAL_PANEL_COLOR);
                break;
        }
    }
    private void removeSelectedItem(MouseEvent e, JList sectionList) {
        if (e.getClickCount() == 2)
        {
            int index = -1;
            for (int i = 0; i < userVariant.items[userSection].size(); i++)
            {
                for (int c = 0; c < userVariant.items[userSection].elementAt(i).getCriticals(); c++)
                {
                    index++;
                    if (sectionList.getSelectedIndex() == index)
                        break;
                }
                
                if (sectionList.getSelectedIndex() == index)
                {
                    index = i;
                    break;
                }
            }
            
            if (index == -1 || index >= userVariant.items[userSection].size())
                return;
            if (!userVariant.items[userSection].elementAt(index).isRemovable())
                return;
            
            addItem(userVariant.items[userSection].elementAt(index));
            userVariant.criticals[userSection] += userVariant.items[userSection].elementAt(index).getCriticals();
            
            switch(userVariant.items[userSection].elementAt(index).getHardpointType())
            {
                case ENERGY:
                    userVariant.hardpoints[userSection][ENERGY]--;
                    break;
                case BALLISTIC:
                    userVariant.hardpoints[userSection][BALLISTIC]--;
                    break;
                case MISSILE:
                    userVariant.hardpoints[userSection][MISSILE]--;
                    break;
                case AMS:
                    userVariant.hardpoints[userSection][AMS]--;
                    break;
                default:
                    break;
            }
            userVariant.items[userSection].removeElementAt(index);
            initAllCriticalHardpoints();
            loadCriticals(userSection);
            updateItemList();
        }
    }
    private void SelectiveAllocationButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_SelectiveAllocationButtonActionPerformed
        JDialog dlgBox;
        int index = EquipmentQueueList.getSelectedIndex();
        if (index > -1 && EquipmentQueue.elementAt(index).getHardpointType() == OMNI)
        {
            dlgBox = new SelectiveAllocationDialogBox(this, true, userVariant.items, userVariant.criticals, EquipmentQueue.elementAt(index), EquipmentQueueCount[index], index);
            dlgBox.setLocationRelativeTo(this);
            dlgBox.setVisible(true);
        }
    }//GEN-LAST:event_SelectiveAllocationButtonActionPerformed
    private void ClearQueueButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_ClearQueueButtonActionPerformed
        EquipmentQueueList.clearSelection();
        for (int i = EquipmentQueue.size() - 1; i > -1; i--)
        {
            Weapon weapon;
            AmmoBin ammo;
            Special_Equipment special;
            Item item = (Item)EquipmentQueue.elementAt(i);
            switch(item.getItemType())
            {
                case WEAPON_ITEM_TYPE:
                    weapon = (Weapon)item;
                    userHeat -= weapon.getHeatPerSecond() * EquipmentQueueCount[i];
                    userFirepower -= weapon.getDamagePerSecond() * EquipmentQueueCount[i];
                    userAlpha -= weapon.getDamage() * EquipmentQueueCount[i];
                    userAlphaHeat -= weapon.getHeat() * EquipmentQueueCount[i];
                    userTonnage -= weapon.getTonnage() * EquipmentQueueCount[i];
                    EquipmentQueueCount[i] = 1;
                    removeItem(i);
                    break;
                case AMMO_ITEM_TYPE:
                    ammo = (AmmoBin)item;
                    userTonnage -= ammo.getTonnage() * EquipmentQueueCount[i];
                    EquipmentQueueCount[i] = 1;
                    removeItem(i);
                    break;
                case EQUIPMENT_ITEM_TYPE:
                    special = (Special_Equipment)item;
                    userTonnage -= special.getTonnage() * EquipmentQueueCount[i];
                    EquipmentQueueCount[i] = 1;
                    removeItem(i);
                    break;
                case JUMP_JET_ITEM_TYPE:
                    special = (Special_Equipment)item;
                    userTonnage -= special.getTonnage() * EquipmentQueueCount[i];
                    userVariant.jumpJets -= EquipmentQueueCount[i];
                    EquipmentQueueCount[i] = 1;
                    removeItem(i);
                    updateJumpProgressBar();
                    break;
            }
        }
        updateItemList();
        updateFirepowerProgressBar();
        updateRangeProgressBar();
        updateHeatProgressBar(); updateSpecialProgressBar();
        updateTonnageProgressBar();
    }//GEN-LAST:event_ClearQueueButtonActionPerformed
    private void RemoveFromQueueButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_RemoveFromQueueButtonActionPerformed
        if (EquipmentQueueList.getSelectedIndex() < 0)
            return;
        
        Weapon weapon;
        AmmoBin ammo;
        Special_Equipment special;
        Item item = (Item)EquipmentQueue.elementAt(EquipmentQueueList.getSelectedIndex());
        
        switch(item.getItemType())
        {
        case WEAPON_ITEM_TYPE:
            weapon = (Weapon)item;
            userHeat -= weapon.getHeatPerSecond();
            userFirepower -= weapon.getDamagePerSecond();
            userAlpha -= weapon.getDamage();
            userAlphaHeat -= weapon.getHeat();
            userTonnage -= weapon.getTonnage();
            removeItem(EquipmentQueueList.getSelectedIndex());
            break;
        case AMMO_ITEM_TYPE:
            ammo = (AmmoBin)item;
            userTonnage -= ammo.getTonnage();
            removeItem(EquipmentQueueList.getSelectedIndex());
            break;
        case EQUIPMENT_ITEM_TYPE:
            special = (Special_Equipment)item;
            userTonnage -= special.getTonnage();
            removeItem(EquipmentQueueList.getSelectedIndex());
            break;
        case JUMP_JET_ITEM_TYPE:
            special = (Special_Equipment)item;
            userTonnage -= special.getTonnage();
            userVariant.jumpJets--;
            removeItem(EquipmentQueueList.getSelectedIndex());
            updateJumpProgressBar();
            break;
        }
        
        updateItemList();
        updateFirepowerProgressBar();
        updateRangeProgressBar();
        updateHeatProgressBar(); updateSpecialProgressBar();
        updateTonnageProgressBar();
    }//GEN-LAST:event_RemoveFromQueueButtonActionPerformed
    private void EquipButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_EquipButtonActionPerformed
        Item item;
        if (EquipmentQueueList.getSelectedIndex() > -1)
        {
            item = EquipmentQueue.elementAt(EquipmentQueueList.getSelectedIndex());
            
            if (item.getCriticals() <= userVariant.criticals[userSection] && item.getHardpointType() == OMNI)
            {
                removeItem(EquipmentQueueList.getSelectedIndex());
                userVariant.items[userSection].add(item);
                userVariant.criticals[userSection] -= item.getCriticals();
            }
            
            else if (item.getCriticals() <= userVariant.criticals[userSection] && userSection < 6 && item.getHardpointType() == AMS)
            {
                Special_Equipment other = (Special_Equipment) item;
                if (userVariant.hardpoints[userSection][other.getHardpointType()] < userMech.getHardpoints(userSection, other.getHardpointType()))
                {
                    removeItem(EquipmentQueueList.getSelectedIndex());
                    userVariant.items[userSection].add(other);
                    userVariant.criticals[userSection] -= other.getCriticals();
                    userVariant.hardpoints[userSection][other.getHardpointType()]++;
                }
            }
            
            else if (item.getCriticals() <= userVariant.criticals[userSection] && userSection < 6 && item.getEquipmentName() == "TAG")
            {
                Special_Equipment other = (Special_Equipment) item;
                if (userVariant.hardpoints[userSection][other.getHardpointType()] < userMech.getHardpoints(userSection, other.getHardpointType()))
                {
                    removeItem(EquipmentQueueList.getSelectedIndex());
                    userVariant.items[userSection].add(other);
                    userVariant.criticals[userSection] -= other.getCriticals();
                    userVariant.hardpoints[userSection][other.getHardpointType()]++;
                }
            }
            
            else if (item.getCriticals() <= userVariant.criticals[userSection])
            {
                Weapon weapon = (Weapon) item;
                if (userVariant.hardpoints[userSection][weapon.getHardpointType()] < userMech.getHardpoints(userSection, weapon.getHardpointType()))
                {
                    removeItem(EquipmentQueueList.getSelectedIndex());
                    userVariant.items[userSection].add(weapon);
                    userVariant.criticals[userSection] -= weapon.getCriticals();
                    userVariant.hardpoints[userSection][weapon.getHardpointType()]++;
                }
            }
            else
                return;
        }
        else
            return;
        
        initAllCriticalHardpoints();
        loadCriticals(userSection);
        updateItemList();
    }//GEN-LAST:event_EquipButtonActionPerformed
    private void StripSectionButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_StripSectionButtonActionPerformed
        if (ModelComboBox.getSelectedIndex() == 0)
            return;
        
        for (int i = userVariant.items[userSection].size() - 1; i >= 0; i--)
            if (userVariant.items[userSection].elementAt(i).isRemovable()) {
                addItem(userVariant.items[userSection].elementAt(i));
                userVariant.criticals[userSection] += userVariant.items[userSection].elementAt(i).getCriticals();
                
                switch(userVariant.items[userSection].elementAt(i).getHardpointType())
                {
                    case ENERGY:
                        userVariant.hardpoints[userSection][ENERGY]--;
                        break;
                    case BALLISTIC:
                        userVariant.hardpoints[userSection][BALLISTIC]--;
                        break;
                    case MISSILE:
                        userVariant.hardpoints[userSection][MISSILE]--;
                        break;
                    case AMS:
                        userVariant.hardpoints[userSection][AMS]--;
                        break;
                    default:
                        break;
                }
                userVariant.items[userSection].removeElementAt(i);
            }
        
        initAllCriticalHardpoints();
        loadCriticals();
        updateItemList();
    }//GEN-LAST:event_StripSectionButtonActionPerformed
    private void MaxArmorButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaxArmorButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaxArmorButton2ActionPerformed
    private void MaxArmorButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaxArmorButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaxArmorButton3ActionPerformed
    private void LeftTorsoCASECheckBoxActionPerformed(ActionEvent evt) {//GEN-FIRST:event_LeftTorsoCASECheckBoxActionPerformed
        if (ModelComboBox.getSelectedIndex() == 0)
            return;
                
        if (LeftTorsoCASECheckBox.isSelected() && userVariant.criticals[LEFT_TORSO] > 0) {
            userVariant.items[LEFT_TORSO].add(new CASE());
            userVariant.criticals[LEFT_TORSO]--;
            userTonnage += 0.5;
        } else if (LeftTorsoCASECheckBox.isSelected()) {
            LeftTorsoCASECheckBox.setSelected(false);
        } else {
            for (int i = userVariant.items[LEFT_TORSO].size() - 1; i > -1; i--) {
                if (userVariant.items[LEFT_TORSO].elementAt(i).getItemType() == CASE_ITEM_TYPE) {
                    userVariant.items[LEFT_TORSO].removeElementAt(i);
                    userVariant.criticals[LEFT_TORSO]++;
                    userTonnage -= 0.5;
                }
            }
        }
        loadCriticals(LEFT_TORSO);
        updateTonnageProgressBar();            
    }//GEN-LAST:event_LeftTorsoCASECheckBoxActionPerformed
    private void EngineToggleButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_EngineToggleButtonActionPerformed
        if (ModelComboBox.getSelectedIndex() == 0)
            return;
        if (isSavedMech)
            return;
        
        if (EngineToggleButton.isSelected())
            if (userVariant.criticals[RIGHT_TORSO] < 3 || userVariant.criticals[LEFT_TORSO] < 3) {
                EngineToggleButton.setSelected(false);
                return;
            }
        
        Engine tempE = new Engine(userVariant.hasXLEngine, userVariant.engineRating);
        userTonnage -= tempE.getTonnage();
        
        userVariant.hasXLEngine = EngineToggleButton.isSelected();
        tempE = new Engine(userVariant.hasXLEngine, userVariant.engineRating);
        userTonnage += tempE.getTonnage();
        
        userVariant.items[CENTER_TORSO].remove(2);
        userVariant.items[CENTER_TORSO].remove(0);
        userVariant.items[CENTER_TORSO].insertElementAt(tempE, 0);
        userVariant.items[CENTER_TORSO].insertElementAt(tempE, 2);
        
        if (userVariant.hasXLEngine) {
            userVariant.items[RIGHT_TORSO].insertElementAt(tempE, 0);
            userVariant.items[LEFT_TORSO].insertElementAt(tempE, 0);
            userVariant.criticals[RIGHT_TORSO] -= tempE.getCriticals();
            userVariant.criticals[LEFT_TORSO] -= tempE.getCriticals();
        }
        else {
            userVariant.items[RIGHT_TORSO].remove(0);
            userVariant.items[LEFT_TORSO].remove(0);
            userVariant.criticals[RIGHT_TORSO] += tempE.getCriticals();
            userVariant.criticals[LEFT_TORSO] += tempE.getCriticals();
        }
        
        if (userVariant.hasXLEngine)
            EngineToggleButton.setText(engineTypes[1]);
        else
            EngineToggleButton.setText(engineTypes[0]);
        
        updateTonnageProgressBar();
        loadCriticals();
    }//GEN-LAST:event_EngineToggleButtonActionPerformed
    private void ArmorToggleButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_ArmorToggleButtonActionPerformed
        if (ModelComboBox.getSelectedIndex() == 0)
            return;
        if (isSavedMech)
            return;
        
        Armor tempA = new Armor(userVariant.hasFerroFibrous, userVariant.getTotalArmor());
        
        userTonnage -= tempA.getTonnage();
        
        userVariant.hasFerroFibrous = ArmorToggleButton.isSelected();
        
        tempA = new Armor(userVariant.hasFerroFibrous, userVariant.getTotalArmor());
        
        userTonnage += tempA.getTonnage();
        
        if (userVariant.hasFerroFibrous)
            for (int i = 0; i < 14; i++)
                addItem(tempA);
        else {
            CleanItemTypeFromQueue(ARMOR_ITEM_TYPE);
            CleanItemTypeFromMech(ARMOR_ITEM_TYPE);
        }
        
        if (userVariant.hasFerroFibrous)
            ArmorToggleButton.setText(armorTypes[1]);
        else
            ArmorToggleButton.setText(armorTypes[0]);
        
        PointsPerTonAmount.setText("" + tempA.getPointsPerTon());
        
        updateTonnageProgressBar();
        updateItemList();
        loadCriticals();
    }//GEN-LAST:event_ArmorToggleButtonActionPerformed
    private void InternalsToggleButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_InternalsToggleButtonActionPerformed
        if (ModelComboBox.getSelectedIndex() == 0)
            return;
        if (isSavedMech)
            return;
        
        Internals tempI = new Internals(userVariant.hasEndoSteel, userMech.getTonnage());
        
        userTonnage -= tempI.getTonnage();
        
        userVariant.hasEndoSteel = InternalsToggleButton.isSelected();
        
        tempI = new Internals(userVariant.hasEndoSteel, userMech.getTonnage());
        
        userTonnage += tempI.getTonnage();
        
        if (userVariant.hasEndoSteel)
            for (int i = 0; i < 14; i++)
                addItem(tempI);
        else {
            CleanItemTypeFromQueue(INTERNAL_ITEM_TYPE);
            CleanItemTypeFromMech(INTERNAL_ITEM_TYPE);
        }
        
        if (userVariant.hasEndoSteel)
            InternalsToggleButton.setText(internalTypes[1]);
        else
            InternalsToggleButton.setText(internalTypes[0]);
        
        updateTonnageProgressBar();
        updateItemList();
        loadCriticals();
    }//GEN-LAST:event_InternalsToggleButtonActionPerformed
    private void HeatSinkToggleButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_HeatSinkToggleButtonActionPerformed
        if (ModelComboBox.getSelectedIndex() == 0)
            return;
        if (isSavedMech)
            return;
        
        userVariant.hasDoubleHS = HeatSinkToggleButton.isSelected();
        
        CleanItemTypeFromQueue(HEAT_SINK_ITEM_TYPE);
        CleanItemTypeFromMech(HEAT_SINK_ITEM_TYPE);
        
        if (userVariant.hasDoubleHS)
            HeatSinkToggleButton.setText(heatSinkTypes[1]);
        else
            HeatSinkToggleButton.setText(heatSinkTypes[0]);
        
        for (int i = 0; i < (userVariant.heatSinks - userVariant.engineHeatSinks); i++)
            addItem(new Heat_Sink(userVariant.hasDoubleHS));
        
        updateHeatProgressBar(); updateSpecialProgressBar();
        updateTonnageProgressBar();
        updateItemList();
        loadCriticals();
    }//GEN-LAST:event_HeatSinkToggleButtonActionPerformed
    private void CockpitToggleButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_CockpitToggleButtonActionPerformed
        if (ModelComboBox.getSelectedIndex() == 0)
            return;
        if (isSavedMech)
            return;
        if (CockpitToggleButton.isSelected())
            if (userVariant.criticals[HEAD] < 1) {
                CockpitToggleButton.setSelected(false);
                return;
            }
        
        userVariant.criticals[HEAD] += userVariant.items[HEAD].elementAt(2).getCriticals();
        userTonnage -= userVariant.items[HEAD].elementAt(2).getTonnage();
        
        userVariant.hasCommandConsole = CockpitToggleButton.isSelected();
        
        if (userVariant.hasCommandConsole)
            CockpitToggleButton.setText(cockpitTypes[1]);
        else
            CockpitToggleButton.setText(cockpitTypes[0]);
        
        userVariant.items[HEAD].remove(2);
        userVariant.items[HEAD].add(new Cockpit(userVariant.hasCommandConsole));
        userVariant.criticals[HEAD] -= userVariant.items[HEAD].elementAt(2).getCriticals();
        userTonnage += userVariant.items[HEAD].elementAt(2).getTonnage();
        
        updateTonnageProgressBar();
        loadCriticals();
    }//GEN-LAST:event_CockpitToggleButtonActionPerformed
    private void ArtemisToggleButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_ArtemisToggleButtonActionPerformed
        if (ModelComboBox.getSelectedIndex() == 0)
            return;
        if (isSavedMech)
            return;
        
        userVariant.hasArtemisIV = ArtemisToggleButton.isSelected();
        
        if (userVariant.hasArtemisIV)
            ArtemisToggleButton.setText(artemisTypes[1]);
        else
            ArtemisToggleButton.setText(artemisTypes[0]);
        
        Weapons[MISSILE_INDEX - 1].remove(7);
        Weapons[MISSILE_INDEX - 1].remove(6);
        Weapons[MISSILE_INDEX - 1].remove(5);
        Weapons[MISSILE_INDEX - 1].remove(3);
        Weapons[MISSILE_INDEX - 1].remove(2);
        Weapons[MISSILE_INDEX - 1].remove(1);
        Weapons[MISSILE_INDEX - 1].remove(0);
        
        Weapons[MISSILE_INDEX - 1].insertElementAt(new SRM6(userVariant.hasArtemisIV), 1);
        Weapons[MISSILE_INDEX - 1].insertElementAt(new SRM4(userVariant.hasArtemisIV), 1);
        Weapons[MISSILE_INDEX - 1].insertElementAt(new SRM2(userVariant.hasArtemisIV), 1);
        Weapons[MISSILE_INDEX - 1].insertElementAt(new LRM20(userVariant.hasArtemisIV), 0);
        Weapons[MISSILE_INDEX - 1].insertElementAt(new LRM15(userVariant.hasArtemisIV), 0);
        Weapons[MISSILE_INDEX - 1].insertElementAt(new LRM10(userVariant.hasArtemisIV), 0);
        Weapons[MISSILE_INDEX - 1].insertElementAt(new LRM5(userVariant.hasArtemisIV), 0);
        
        Equipment[AMMO_INDEX -1 ].remove(10);
        Equipment[AMMO_INDEX -1 ].remove(8);
        
        Equipment[AMMO_INDEX - 1].insertElementAt(new LRM_Ammo(userVariant.hasArtemisIV), 8);
        Equipment[AMMO_INDEX - 1].insertElementAt(new SRM_Ammo(userVariant.hasArtemisIV), 10);
        
        for (int i = EquipmentQueue.size() - 1; i >= 0; i--) {
            if (EquipmentQueue.elementAt(i).getItemType() == WEAPON_ITEM_TYPE) {
                Weapon weapon = (Weapon)EquipmentQueue.elementAt(i);
                if (weapon.isArtemisIVCapable()) {
                    userTonnage -= (weapon.getTonnage() * EquipmentQueueCount[i]);
                    userHeat -= (weapon.getHeatPerSecond() * EquipmentQueueCount[i]);
                    userAlphaHeat -= (weapon.getHeat() * EquipmentQueueCount[i]);
                    userFirepower -= (weapon.getDamagePerSecond() * EquipmentQueueCount[i]);
                    userAlpha -= (weapon.getDamage() * EquipmentQueueCount[i]);
                    EquipmentQueueCount[i] = 1;
                    removeItem(i);
                }
            }
        }
        
        for (int i = 0; i < NUMBER_OF_CRITICAL_SECTIONS; i++) {
            for (int j = userVariant.items[i].size() - 1; j >= 0; j--) {
                if (userVariant.items[i].elementAt(j).getItemType() == WEAPON_ITEM_TYPE) {
                    Weapon weapon = (Weapon)userVariant.items[i].elementAt(j);
                    if (weapon.isArtemisIVCapable()) {
                        userTonnage -= weapon.getTonnage();
                        userHeat -= weapon.getHeatPerSecond();
                        userAlphaHeat -= weapon.getHeat();
                        userFirepower -= weapon.getDamagePerSecond();
                        userAlpha -= weapon.getDamage();
                        userVariant.criticals[i] += weapon.getCriticals();
                        userVariant.hardpoints[i][MISSILE]--;
                        userVariant.items[i].removeElementAt(j);
                    }
                }
            }
        }
        
        updateFirepowerProgressBar();
        updateRangeProgressBar();
        updateHeatProgressBar(); updateSpecialProgressBar();
        updateTonnageProgressBar();
        initAllCriticalHardpoints();
        loadCriticals();
    }//GEN-LAST:event_ArtemisToggleButtonActionPerformed
    private void MASCToggleButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_MASCToggleButtonActionPerformed
        if (ModelComboBox.getSelectedIndex() == 0)
            return;
        if (isSavedMech)
            return;
        
        userVariant.hasMASC = MASCToggleButton.isSelected();
        
        if (userVariant.hasMASC) {
            SPEED_MODIFIER = MASC_SPEED_MODIFIER * speedTweakModifier;
            addItem(new MASC(userMech.getTonnage()));
        }
        else {
            SPEED_MODIFIER = STANDARD_SPEED_MODIFIER * speedTweakModifier;
            CleanItemTypeFromQueue(MYOMER_ITEM_TYPE);
            CleanItemTypeFromMech(MYOMER_ITEM_TYPE);
        }
        
        if (userVariant.hasMASC)
            MASCToggleButton.setText(myomerTypes[1]);
        else
            MASCToggleButton.setText(myomerTypes[0]);
        
        updateTonnageProgressBar();
        updateSpeedProgressBar();
        updateItemList();
        loadCriticals();
    }//GEN-LAST:event_MASCToggleButtonActionPerformed
    private void resetEfficiencyButtons() {
        SpeedTweakToggleButton.setSelected(false);
        CoolRunToggleButton.setSelected(false);
        FastFireToggleButton.setSelected(false);
        EliteModToggleButton.setSelected(false);
        MasterModToggleButton.setSelected(false);
        HeatContainmentToggleButton.setSelected(false);
        coolRunModifier = 1.000;
        heatContainmentModifier = 1.0;
        fastFireModifier = 1.075;
        speedTweakModifier = 1.0;
    }
    private void setAllToggleButtonText() {
        if (userVariant.hasXLEngine)
            EngineToggleButton.setText(engineTypes[1]);
        else
            EngineToggleButton.setText(engineTypes[0]);
        
        if (userVariant.hasFerroFibrous)
            ArmorToggleButton.setText(armorTypes[1]);
        else
            ArmorToggleButton.setText(armorTypes[0]);
        
        if (userVariant.hasEndoSteel)
            InternalsToggleButton.setText(internalTypes[1]);
        else
            InternalsToggleButton.setText(internalTypes[0]);
        
        if (userVariant.hasDoubleHS)
            HeatSinkToggleButton.setText(heatSinkTypes[1]);
        else
            HeatSinkToggleButton.setText(heatSinkTypes[0]);
        
        if (userVariant.hasCommandConsole)
            CockpitToggleButton.setText(cockpitTypes[1]);
        else
            CockpitToggleButton.setText(cockpitTypes[0]);
        
        if (userVariant.hasArtemisIV)
            ArtemisToggleButton.setText(artemisTypes[1]);
        else
            ArtemisToggleButton.setText(artemisTypes[0]);
        
        if (userVariant.hasMASC)
            MASCToggleButton.setText(myomerTypes[1]);
        else
            MASCToggleButton.setText(myomerTypes[0]);
    }
    private void SpeedTweakToggleButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_SpeedTweakToggleButtonActionPerformed
        if (ModelComboBox.getSelectedIndex() == 0)
            return;
        
        if (SpeedTweakToggleButton.isSelected())
            speedTweakModifier = 1.1;
        else
            speedTweakModifier = 1.0;
        
        if (MASCToggleButton.isSelected())
            SPEED_MODIFIER = MASC_SPEED_MODIFIER * (speedTweakModifier);
        else
            SPEED_MODIFIER = STANDARD_SPEED_MODIFIER * (speedTweakModifier);
        
        updateSpeedProgressBar();
    }//GEN-LAST:event_SpeedTweakToggleButtonActionPerformed
    private void CoolRunToggleButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_CoolRunToggleButtonActionPerformed
        if (ModelComboBox.getSelectedIndex() == 0)
            return;
        
        if (CoolRunToggleButton.isSelected())
            coolRunModifier = 1 + (0.075 * setEliteMod());
        else
            coolRunModifier = 1.000;
        
        updateHeatProgressBar(); updateSpecialProgressBar();
        updateSpecialProgressBar();
    }//GEN-LAST:event_CoolRunToggleButtonActionPerformed
    private void FastFireToggleButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_FastFireToggleButtonActionPerformed
        if (ModelComboBox.getSelectedIndex() == 0)
            return;
        
        if (FastFireToggleButton.isSelected()) {
            userHeat /= (1 / (fastFireModifier));
            userRecycle /= fastFireModifier;
            userFirepower /= (1 / (fastFireModifier));
        }
        else {
            userHeat *= (1 / (fastFireModifier));
            userRecycle *= fastFireModifier;
            userFirepower *= (1 / (fastFireModifier));
        }
        
        updateFirepowerProgressBar();
        updateHeatProgressBar(); updateSpecialProgressBar();
    }//GEN-LAST:event_FastFireToggleButtonActionPerformed
    private void EliteModToggleButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_EliteModToggleButtonActionPerformed
        if (ModelComboBox.getSelectedIndex() == 0)
            return;
        
        if (HeatContainmentToggleButton.isSelected())
            heatContainmentModifier = 1 + (0.1 * setEliteMod());
        
        if (CoolRunToggleButton.isSelected())
            coolRunModifier = 1 + (0.075 * setEliteMod());
        
        updateHeatProgressBar(); updateSpecialProgressBar();
        updateSpecialProgressBar();
    }//GEN-LAST:event_EliteModToggleButtonActionPerformed
    private void MasterModToggleButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_MasterModToggleButtonActionPerformed
        if (ModelComboBox.getSelectedIndex() == 0)
            return;
    }//GEN-LAST:event_MasterModToggleButtonActionPerformed
    private void HeatContainmentToggleButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_HeatContainmentToggleButtonActionPerformed
        if (ModelComboBox.getSelectedIndex() == 0)
            return;
        
        if (HeatContainmentToggleButton.isSelected())
            heatContainmentModifier = 1 + (0.1 * setEliteMod());
        else
            heatContainmentModifier = 1.0;
        
        updateHeatProgressBar(); updateSpecialProgressBar();
        updateSpecialProgressBar();
    }//GEN-LAST:event_HeatContainmentToggleButtonActionPerformed

    private void HeatSinkSpinnerStateChanged(ChangeEvent evt) {//GEN-FIRST:event_HeatSinkSpinnerStateChanged
        int temp1 = userVariant.heatSinks;
        userVariant.heatSinks = Integer.parseInt(heatSinkSpinnerModel.getValue().toString());
        temp1 = userVariant.heatSinks - temp1;
        userTonnage += temp1;
        
        if (temp1 > 0)
        {
            if (userVariant.heatSinks > userVariant.engineHeatSinks)
                for (int i = 0; i < temp1; i++)
                    addItem(new Heat_Sink(userVariant.hasDoubleHS));
        }
        else if (temp1 < 0 && userVariant.heatSinks >= userVariant.engineHeatSinks)
        {
            temp1 = -temp1;
            
            for (int i = EquipmentQueue.size() - 1; i >= 0; i--)
            {
                if (EquipmentQueue.elementAt(i).getItemType() == HEAT_SINK_ITEM_TYPE)
                {
                    for (int j = 0; j < EquipmentQueueCount[i]; j++)
                    {
                        removeItem(i);
                        temp1--;
                        if (temp1 == 0)
                            break;
                    }
                }
                if (temp1 == 0)
                    break;
            }
            
            if (temp1 > 0)
            {
                for (int i = 0; i < NUMBER_OF_CRITICAL_SECTIONS; i++)
                {
                    for (int j = userVariant.items[i].size() - 1; j >= 0; j--)
                    {
                        if (userVariant.items[i].elementAt(j).getItemType() == HEAT_SINK_ITEM_TYPE)
                        {
                            userVariant.criticals[i] += userVariant.items[i].elementAt(j).getCriticals();
                            userVariant.items[i].removeElementAt(j);
                            temp1--;
                        }
                        if (temp1 == 0)
                            break;
                    }
                    if (temp1 == 0)
                        break;
                }
            }
        }
        
        loadCriticals();
        updateHeatProgressBar(); updateSpecialProgressBar();
        updateTonnageProgressBar();
        updateItemList();
    }//GEN-LAST:event_HeatSinkSpinnerStateChanged

    private void EngineRatingSpinnerStateChanged(ChangeEvent evt) {//GEN-FIRST:event_EngineRatingSpinnerStateChanged
        int temp1 = userVariant.engineRating;
        userVariant.engineRating = Integer.parseInt(engineRatingSpinnerModel.getValue().toString());
        int temp2 = userVariant.engineHeatSinks;
        userVariant.engineHeatSinks = (userVariant.engineRating / 25);
        
        Engine tempE = new Engine(userVariant.hasXLEngine, temp1);
        userTonnage -= tempE.getTonnage();
        tempE = new Engine(userVariant.hasXLEngine, userVariant.engineRating);
        userTonnage += tempE.getTonnage();
        
        int temp3;
        
        temp2 -= userVariant.engineHeatSinks;
        
        if (temp2 > 0 && userVariant.heatSinks > userVariant.engineHeatSinks)
        {
            for (int i = 0; i < temp2; i++)
            {
                if (userVariant.engineHeatSinks < 10)
                    userTonnage++;
                
                addItem(new Heat_Sink(userVariant.hasDoubleHS));
            }
        }
        else if (temp2 < 0 && userVariant.heatSinks >= userVariant.engineHeatSinks)
        {
            temp2 = -temp2;
            if (userVariant.engineHeatSinks <= 10)
                userTonnage -= temp2;
            
            if (userVariant.hasDoubleHS)
                temp3 = 3;
            else
                temp3 = 1;

            for (int i = EquipmentQueue.size() - 1; i > -1; i--)
            {
                if (EquipmentQueue.elementAt(i).getItemType() == HEAT_SINK_ITEM_TYPE)
                {
                    for (int j = 0; j < EquipmentQueueCount[i]; j++)
                    {
                        removeItem(i);
                        temp2--;
                        if (temp2 == 0)
                            break;
                    }
                }
                if (temp2 == 0)
                    break;
            }
            if (temp2 > 0)
            {
                for (int i = 0; i < NUMBER_OF_CRITICAL_SECTIONS; i++)
                {
                    for (int j = userVariant.items[i].size() - 1; j > -1; j--)
                    {
                        if (userVariant.items[i].elementAt(j).getItemType() == HEAT_SINK_ITEM_TYPE)
                        {
                            userVariant.items[i].removeElementAt(j);
                            userVariant.criticals[i] += temp3;
                            temp2--;
                        }
                        if (temp2 == 0)
                            break;
                    }
                    if (temp2 == 0)
                        break;
                }
            }
        }
        
        updateSpeedProgressBar();
        updateTonnageProgressBar();
        updateHeatProgressBar(); updateSpecialProgressBar();
        loadCriticals();
        updateItemList();
    }//GEN-LAST:event_EngineRatingSpinnerStateChanged
    private void CleanItemTypeFromMech(int itemType) {
        for (int i = 0; i < NUMBER_OF_CRITICAL_SECTIONS; i++)
            for (int j = userVariant.items[i].size() - 1; j >= 0; j--)
                if (userVariant.items[i].elementAt(j).getItemType() == itemType) {
                    switch (itemType) {
                        default:
                            userVariant.criticals[i] += userVariant.items[i].elementAt(j).getCriticals();
                            userVariant.items[i].remove(j);
                            break;
                    }
                }
    }
    private void CleanItemTypeFromQueue(int itemType) {
        for (int i = EquipmentQueue.size() - 1; i >= 0; i--)
            if (EquipmentQueue.elementAt(i).getItemType() == itemType) {
                switch (itemType) {
                    default:
                        break;
                }
                EquipmentQueueCount[i] = 1;
                removeItem(i);
            }
    }
    private int setEliteMod() {
        if (EliteModToggleButton.isSelected())
            return 2;
        else
            return 1;
    }
    private void EquipmentQueueListMouseClicked(MouseEvent evt) {//GEN-FIRST:event_EquipmentQueueListMouseClicked
        if (evt.getClickCount() >= 2)
            RemoveFromQueueButton.doClick();
    }//GEN-LAST:event_EquipmentQueueListMouseClicked
    private void formWindowClosing(WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (parent != null)
            parent.setVisible(true);
        else
            setDefaultCloseOperation(EXIT_ON_CLOSE);
    }//GEN-LAST:event_formWindowClosing
    private void AboutButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_AboutButtonActionPerformed
        AboutDialogBox dlgBox = new AboutDialogBox(this, true, compactMechlabVersion, MWOstage);
        dlgBox.setLocationRelativeTo(this);
        dlgBox.setVisible(true);
    }//GEN-LAST:event_AboutButtonActionPerformed
    private void MechTreeButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_MechTreeButtonActionPerformed
        MechTreeDialogBox dlgBox = new MechTreeDialogBox(this, true);
        dlgBox.setLocationRelativeTo(this);
        dlgBox.setVisible(true);
    }//GEN-LAST:event_MechTreeButtonActionPerformed
    private void PilotTreeButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_PilotTreeButtonActionPerformed
        PilotTreeDialogBox dlgBox = new PilotTreeDialogBox(this, true);
        dlgBox.setLocationRelativeTo(this);
        dlgBox.setVisible(true);
    }//GEN-LAST:event_PilotTreeButtonActionPerformed
    private void WeaponStatsButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_WeaponStatsButtonActionPerformed
        EquipmentStatsDialogBox dlgBox = new EquipmentStatsDialogBox(this, Weapons, Equipment);
        dlgBox.setLocationRelativeTo(this);
        dlgBox.setVisible(true);
    }//GEN-LAST:event_WeaponStatsButtonActionPerformed
    private void PreferencesButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_PreferencesButtonActionPerformed
        PreferenceDialogBox dlgBox = new PreferenceDialogBox(this, u);
        dlgBox.setLocationRelativeTo(this);
        dlgBox.setVisible(true);
    }//GEN-LAST:event_PreferencesButtonActionPerformed
    private void ExportButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_ExportButtonActionPerformed
        if (ModelComboBox.getSelectedIndex() == 0)
            return;
        
        try
        {
            if (EquipmentQueue.size() > 0)
                throw new customException("Not all items are placed, file export canceled.");
            if (userTonnage > userMech.getTonnage())
                throw new customException("Tonnage limit exceeded, file export canceled.");
            if (VariantTextField.getText().isEmpty())
                throw new customException("No name entered, file export canceled");

            FileWriter fstream = new FileWriter(userMech.getChassis() + " " + userMech.getModel() + " " + VariantTextField.getText() + ".txt");
            BufferedWriter out = new BufferedWriter(fstream);
            //<editor-fold desc="Base Info">
            out.write("Chassis Name: " + userMech.getChassis());
            out.newLine();
            out.write("Model Name: " + userMech.getModel());
            out.newLine();
            out.write("Variant Name: " + VariantTextField.getText());
            out.newLine();
            //</editor-fold>
            //<editor-fold desc="Cost Readout">
            out.newLine();
            temp = String.format("Engine Cost: %,d C-Bills", new Engine(userVariant.hasXLEngine, userVariant.engineRating).getCost());
            out.write(temp);
            out.newLine();
            if (userVariant.engineHeatSinks < 10) {
                temp = String.format("Heat Sink Cost: %,d C-Bills", new Heat_Sink(userVariant.hasDoubleHS).getCost() * (userVariant.heatSinks - userVariant.engineHeatSinks));
                out.write(temp);
            }
            else {
                temp = String.format("Heat Sink Cost: %,d C-Bills", new Heat_Sink(userVariant.hasDoubleHS).getCost() * (userVariant.heatSinks - 10));
                out.write(temp);
            }
            out.newLine();
            temp = String.format("Armor Cost: %,d C-Bills", new Armor(userVariant.hasFerroFibrous, userVariant.getTotalArmor()).getCost());
            out.write(temp);
            out.newLine();
            long tempCost = 0;
            for (int i = 0; i < NUMBER_OF_CRITICAL_SECTIONS; i++)
                for (int j = 0; j < userVariant.items[i].size(); j++)
                    if (userVariant.items[i].elementAt(j).getItemType() == WEAPON_ITEM_TYPE)
                        tempCost += userVariant.items[i].elementAt(j).getCost();
            temp = String.format("Weapons Cost: %,d C-Bills", tempCost);
            out.write(temp);
            out.newLine();
            tempCost = 0;
            for (int i = 0; i < NUMBER_OF_CRITICAL_SECTIONS; i++)
                for (int j = 0; j < userVariant.items[i].size(); j++)
                    if (userVariant.items[i].elementAt(j).getItemType() == EQUIPMENT_ITEM_TYPE ||
                        userVariant.items[i].elementAt(j).getItemType() == CASE_ITEM_TYPE)
                        tempCost += userVariant.items[i].elementAt(j).getCost();
            temp = String.format("Equipment Cost: %,d C-Bills", tempCost);
            out.write(temp);
            out.newLine();
            tempCost = 0;
            for (int i = 0; i < NUMBER_OF_CRITICAL_SECTIONS; i++)
                for (int j = 0; j < userVariant.items[i].size(); j++)
                    if (userVariant.items[i].elementAt(j).getItemType() == AMMO_ITEM_TYPE)
                        tempCost += userVariant.items[i].elementAt(j).getCost();
            temp = String.format("Ammo Cost: %,d C-Bills", tempCost);
            out.write(temp);
            out.newLine();
            //</editor-fold>
            //<editor-fold desc="Component Readout">
            out.newLine();
            out.write("Engine: " + userVariant.engineRating + " " + EngineToggleButton.getText());
            out.newLine();
            out.write("Internal Type: " + InternalsToggleButton.getText());
            out.newLine();
            out.write("Armor Type: " + ArmorToggleButton.getText());
            out.newLine();
            if (HeatSinkToggleButton.isSelected())
                out.write("Heat Sinks: " + userVariant.heatSinks + " (" + userVariant.engineHeatSinks + ") Double Heat Sinks");
            else
                out.write("Heat Sinks: " + userVariant.heatSinks + " (" + userVariant.engineHeatSinks + ") Standard Heat Sinks");
            out.newLine();
            //</editor-fold>
            //<editor-fold desc="Stats Readout">
            out.newLine();
            temp = String.format("Tonnage: %.2f", userTonnage);
            out.write(temp);
            out.newLine();
            out.write("Speed: " + speedProgressBar.getString());
            out.newLine();
            out.write("Armor Total: " + currentArmorProgressBar.getString());
            out.write("Firepower: " + firepowerProgressBar.getString());
            out.newLine();
            out.write("Heat Efficiency: " + heatEfficiencyProgressBar.getString());
            out.newLine();
            out.write("Effective Range of Loadout: " + RangeProgressBar.getString());
            out.newLine();
            //</editor-fold>
            //<editor-fold desc="Armor Readout">
            out.newLine();
            out.write("Head: " + userVariant.armor[HEAD] + "/" + userMech.getMaxArmor(HEAD));
            out.newLine();
            out.write("Right Torso: " + userVariant.armor[RIGHT_TORSO] + "/" + userMech.getMaxArmor(RIGHT_TORSO));
            out.newLine();
            out.write("Right Rear Torso: " + userVariant.armor[RIGHT_REAR_TORSO] + "/" + userMech.getMaxArmor(LEFT_TORSO));
            out.newLine();
            out.write("Center Torso: " + userVariant.armor[CENTER_TORSO] + "/" + userMech.getMaxArmor(CENTER_TORSO));
            out.newLine();
            out.write("Center Rear Torso: " + userVariant.armor[CENTER_REAR_TORSO] + "/" + userMech.getMaxArmor(CENTER_TORSO));
            out.newLine();
            out.write("Left Torso: " + userVariant.armor[LEFT_TORSO] + "/" + userMech.getMaxArmor(LEFT_TORSO));
            out.newLine();
            out.write("Left Rear Torso: " + userVariant.armor[LEFT_REAR_TORSO] + "/" + userMech.getMaxArmor(LEFT_TORSO));
            out.newLine();
            out.write("Right Arm: " + userVariant.armor[RIGHT_ARM] + "/" + userMech.getMaxArmor(RIGHT_ARM));
            out.newLine();
            out.write("Left Arm: " + userVariant.armor[LEFT_ARM] + "/" + userMech.getMaxArmor(LEFT_ARM));
            out.newLine();
            out.write("Right Leg: " + userVariant.armor[RIGHT_LEG] + "/" + userMech.getMaxArmor(RIGHT_LEG));
            out.newLine();
            out.write("Left Leg: " + userVariant.armor[LEFT_LEG] + "/" + userMech.getMaxArmor(LEFT_LEG));
            out.newLine();
            //</editor-fold>
            //<editor-fold desc="Weapons Readout">
            out.newLine();
            out.write("Weapons Locations");
            for (int i = 0; i < NUMBER_OF_CRITICAL_SECTIONS; i++)
            {
                Vector<Item> temp = new Vector();
                int[] eCount = new int[30];

                for (int j = 0; j < userVariant.items[i].size(); j++)
                    if (userVariant.items[i].elementAt(j).getItemType() == WEAPON_ITEM_TYPE) {
                        boolean found = false;
                        for (int x = 0; x < temp.size(); x++) {
                            if (userVariant.items[i].elementAt(j).toString() == temp.elementAt(x).toString()) {
                                eCount[x]++;
                                found = true;
                                break;
                            }
                        }

                        if (!found) {
                            temp.addElement(userVariant.items[i].elementAt(j));
                            eCount[temp.size() - 1] = 1;
                        }
                    }

                if (temp.size() > 0) {
                    out.newLine();
                    switch (i) {
                        case HEAD:
                            out.write("Head:");
                            break;
                        case RIGHT_TORSO:
                            out.write("Right Torso:");
                            break;
                        case LEFT_TORSO:
                            out.write("Left Torso:");
                            break;
                        case CENTER_TORSO:
                            out.write("Center Torso:");
                            break;
                        case RIGHT_ARM:
                            out.write("Right Arm:");
                            break;
                        case LEFT_ARM:
                            out.write("Left Arm:");
                            break;
                        case RIGHT_LEG:
                            out.write("Right Leg:");
                            break;
                        case LEFT_LEG:
                            out.write("Left Leg:");
                            break;
                    }
                    for (int x = 0; x < temp.size(); x++) {
                        out.newLine();
                        if (eCount[x] < 2)
                            out.write('\t' + temp.elementAt(x).toString());
                        else
                            out.write('\t' + "(" + eCount[x] + ") " + temp.elementAt(x).toString());
                    }
                }
            }
            out.newLine();
            //</editor-fold>
            //<editor-fold desc="Heat Sink Readout">
            out.newLine();
            out.write("Heat Sink Locations");
            for (int i = 0; i < NUMBER_OF_CRITICAL_SECTIONS; i++)
            {
                int count = 0;

                for (int j = 0; j < userVariant.items[i].size(); j++)
                    if (userVariant.items[i].elementAt(j).getItemType() == HEAT_SINK_ITEM_TYPE)
                        count++;

                if (count > 0) {
                    out.newLine();
                    switch (i) {
                        case HEAD:
                            out.write("Head: " + count);
                            break;
                        case RIGHT_TORSO:
                            out.write("Right Torso: " + count);
                            break;
                        case LEFT_TORSO:
                            out.write("Left Torso: " + count);
                            break;
                        case CENTER_TORSO:
                            out.write("Center Torso: " + count);
                            break;
                        case RIGHT_ARM:
                            out.write("Right Arm: " + count);
                            break;
                        case LEFT_ARM:
                            out.write("Left Arm: " + count);
                            break;
                        case RIGHT_LEG:
                            out.write("Right Leg: " + count);
                            break;
                        case LEFT_LEG:
                            out.write("Left Leg: " + count);
                            break;
                    }
                    out.newLine();
                }
            }
            out.newLine();
            //</editor-fold>
            //<editor-fold desc="Jump Jet Readout">
            if (userMech.isJumpCapable()) {
                out.newLine();
                out.write("Jump Jet Locations");
                for (int i = 0; i < NUMBER_OF_CRITICAL_SECTIONS; i++)
                {
                    int count = 0;

                    for (int j = 0; j < userVariant.items[i].size(); j++)
                        if (userVariant.items[i].elementAt(j).getItemType() == JUMP_JET_ITEM_TYPE)
                            count++;

                    if (count > 0) {
                        out.newLine();
                        switch (i) {
                            case HEAD:
                                out.write("Head: " + count);
                                break;
                            case RIGHT_TORSO:
                                out.write("Right Torso: " + count);
                                break;
                            case LEFT_TORSO:
                                out.write("Left Torso: " + count);
                                break;
                            case CENTER_TORSO:
                                out.write("Center Torso: " + count);
                                break;
                            case RIGHT_ARM:
                                out.write("Right Arm: " + count);
                                break;
                            case LEFT_ARM:
                                out.write("Left Arm: " + count);
                                break;
                            case RIGHT_LEG:
                                out.write("Right Leg: " + count);
                                break;
                            case LEFT_LEG:
                                out.write("Left Leg: " + count);
                                break;
                        }
                    }
                }
                out.newLine();
            }
            //</editor-fold>
            //<editor-fold desc="Equipment Readout">
            out.newLine();
            out.write("Equipment Locations");
            for (int i = 0; i < NUMBER_OF_CRITICAL_SECTIONS; i++)
            {
                int count = 0;

                for (int j = 0; j < userVariant.items[i].size(); j++)
                    if (userVariant.items[i].elementAt(j).getItemType() == EQUIPMENT_ITEM_TYPE ||
                        userVariant.items[i].elementAt(j).getItemType() == CASE_ITEM_TYPE)
                        count++;

                if (count > 0) {
                    out.newLine();
                    switch (i) {
                        case HEAD:
                            out.write("Head:");
                            break;
                        case RIGHT_TORSO:
                            out.write("Right Torso:");
                            break;
                        case LEFT_TORSO:
                            out.write("Left Torso:");
                            break;
                        case CENTER_TORSO:
                            out.write("Center Torso:");
                            break;
                        case RIGHT_ARM:
                            out.write("Right Arm:");
                            break;
                        case LEFT_ARM:
                            out.write("Left Arm:");
                            break;
                        case RIGHT_LEG:
                            out.write("Right Leg:");
                            break;
                        case LEFT_LEG:
                            out.write("Left Leg:");
                            break;
                    }
                    for (int j = 0; j < userVariant.items[i].size(); j++)
                        if (userVariant.items[i].elementAt(j).getItemType() == EQUIPMENT_ITEM_TYPE ||
                            userVariant.items[i].elementAt(j).getItemType() == CASE_ITEM_TYPE) {
                            out.newLine();
                            out.write('\t' + userVariant.items[i].elementAt(j).getEquipmentName());
                        }
                    out.newLine();
                }
            }
            out.newLine();
            //</editor-fold>
            //<editor-fold desc="Ammo Readout">
            out.newLine();
            out.write("Ammo Locations");
            for (int i = 0; i < NUMBER_OF_CRITICAL_SECTIONS; i++)
            {
                Vector<Item> temp = new Vector();
                int[] eCount = new int[30];

                for (int j = 0; j < userVariant.items[i].size(); j++)
                    if (userVariant.items[i].elementAt(j).getItemType() == AMMO_ITEM_TYPE) {
                        boolean found = false;
                        for (int x = 0; x < temp.size(); x++) {
                            if (userVariant.items[i].elementAt(j).toString() == temp.elementAt(x).toString()) {
                                eCount[x]++;
                                found = true;
                                break;
                            }
                        }

                        if (!found) {
                            temp.addElement(userVariant.items[i].elementAt(j));
                            eCount[temp.size() - 1] = 1;
                        }
                    }

                if (temp.size() > 0) {
                    out.newLine();
                    switch (i) {
                        case HEAD:
                            out.write("Head:");
                            break;
                        case RIGHT_TORSO:
                            out.write("Right Torso:");
                            break;
                        case LEFT_TORSO:
                            out.write("Left Torso:");
                            break;
                        case CENTER_TORSO:
                            out.write("Center Torso:");
                            break;
                        case RIGHT_ARM:
                            out.write("Right Arm:");
                            break;
                        case LEFT_ARM:
                            out.write("Left Arm:");
                            break;
                        case RIGHT_LEG:
                            out.write("Right Leg:");
                            break;
                        case LEFT_LEG:
                            out.write("Left Leg:");
                            break;
                    }
                    for (int x = 0; x < temp.size(); x++) {
                        out.newLine();
                        if (eCount[x] < 2)
                            out.write('\t' + temp.elementAt(x).toString());
                        else
                            out.write('\t' + "(" + eCount[x] + ") " + temp.elementAt(x).toString());
                    }
                }
            }
            out.newLine();
            //</editor-fold>
            out.newLine();
            out.write("File created using MWO Mechbay");
            out.close();
            fstream.close();
            JOptionPane.showMessageDialog(this, "Variant Exported");
        }
        catch (SecurityException e)
        {   JOptionPane.showMessageDialog(this, "Permission Error: Program has insufficient priveleges to write to the file.");    }
        catch (NullPointerException e)
        {   JOptionPane.showMessageDialog(this, "Null Pointer Error: Variant Class was not instanced.");    }
        catch (FileNotFoundException e)
        {   JOptionPane.showMessageDialog(this, "File Not Found Error: " + e.getMessage());    }
        catch (IOException e)
        {   JOptionPane.showMessageDialog(this, "IO Error: " + e.getMessage());    }
        catch (customException e)
        {   JOptionPane.showMessageDialog(this, "Custom Error: " + e.getMessage());    }
        catch (Exception e)
        {   JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());    }
    }//GEN-LAST:event_ExportButtonActionPerformed
    private void SaveButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        if (ModelComboBox.getSelectedIndex() == 0)
            return;
        
        try {
            if (EquipmentQueue.size() > 0)
                throw new customException("Not all items are placed, file save canceled.");
            if (userTonnage > userMech.getTonnage())
                throw new customException("Tonnage limit exceeded, file save canceled.");
            if (VariantTextField.getText().isEmpty())
                throw new customException("No name entered");
            
            userVariant.variantName = VariantTextField.getText();
            
            temp = (System.getProperty("user.dir") + "\\Variants\\" + userMech.getChassis() + " " + userMech.getModel() + " " + userVariant.variantName);
            FileOutputStream outFile = new FileOutputStream(temp + ".mbv");
            DataOutputStream out = new DataOutputStream(outFile);
            
            out.writeInt(SERIAL_INDEX);
            out.writeInt(ChassisComboBox.getSelectedIndex());
            out.writeInt(ModelComboBox.getSelectedIndex());
            out.writeUTF(userVariant.variantName);
            out.writeInt(userVariant.engineRating);
            out.writeInt(userVariant.heatSinks);
            out.writeInt(userVariant.engineHeatSinks);
            out.writeInt(userVariant.jumpJets);
            out.writeBoolean(userVariant.hasXLEngine);
            out.writeBoolean(userVariant.hasFerroFibrous);
            out.writeBoolean(userVariant.hasEndoSteel);
            out.writeBoolean(userVariant.hasDoubleHS);
            out.writeBoolean(userVariant.hasArtemisIV);
            out.writeBoolean(userVariant.hasCommandConsole);
            out.writeBoolean(userVariant.hasMASC);
            for (int i = 0; i < NUMBER_OF_SECTIONS; i++)
                out.writeInt(userVariant.armor[i]);
            for (int i = 0; i < NUMBER_OF_CRITICAL_SECTIONS; i++)
                out.writeInt(userVariant.criticals[i]);
            for (int i = 0; i < NUMBER_OF_CRITICAL_SECTIONS; i++)
                for (int j = 0; j < 4; j++)
                    out.writeInt(userVariant.hardpoints[i][j]);
            for (int i = 0; i < NUMBER_OF_CRITICAL_SECTIONS; i++) {
                int size = userVariant.items[i].size();
                out.writeInt(size);
                
                for (int j = 0; j < size; j++)
                    out.writeInt(getItemIndex(userVariant.items[i].elementAt(j)));
            }
            
            out.close();
            outFile.close();
            JOptionPane.showMessageDialog(this, "Variant Saved");
        }
        catch (customException e)
        {   JOptionPane.showMessageDialog(this, e.getMessage());    }
        catch (InvalidClassException e)
        {   JOptionPane.showMessageDialog(this, "Invalid Class Error: " + e.getMessage());    }
        catch (NotSerializableException e)
        {   JOptionPane.showMessageDialog(this, "Serialization Error: " + e.getMessage());    }
        catch (SecurityException e)
        {   JOptionPane.showMessageDialog(this, "Permission Error: Program has insufficient priveleges to write to the file.");    }
        catch (NullPointerException e)
        {   JOptionPane.showMessageDialog(this, "Null Pointer Error: Variant Class was not instanced.");    }
        catch (FileNotFoundException e)
        {   JOptionPane.showMessageDialog(this, "File Not Found Error: " + e.getMessage());    }
        catch (IOException e)
        {   JOptionPane.showMessageDialog(this, "IO Error: " + e.getMessage());    }
        catch (Exception e)
        {   JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());    }
    }//GEN-LAST:event_SaveButtonActionPerformed
    private void LoadButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_LoadButtonActionPerformed
        JFileChooser openFileDlg = new JFileChooser();
        openFileDlg.setFileFilter(new FileNameExtensionFilter("Mechbay Variants","mbv"));
        openFileDlg.setAcceptAllFileFilterUsed(false);
        openFileDlg.setCurrentDirectory(new File(System.getProperty("user.dir") + "\\Variants\\"));
        openFileDlg.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int returnVal = openFileDlg.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION)
        {
            File file = openFileDlg.getSelectedFile();
            try {
                FileInputStream inFile = new FileInputStream(file.getPath());
                DataInputStream in = new DataInputStream(inFile);
                
                int temp2 = in.readInt();
                
                if (temp2 != SERIAL_INDEX)
                    throw new customException("Not a mechbay file.");
                
                isSavedMech = true;
                ChassisComboBox.setSelectedIndex(in.readInt());
                ModelComboBox.setSelectedIndex(in.readInt());
                
                {
                    Armor tempA = new Armor(userVariant.hasFerroFibrous, userVariant.getTotalArmor());
                    userTonnage -= tempA.getTonnage();
                }
                
                userVariant.variantName = in.readUTF();
                VariantTextField.setText(userVariant.variantName);
                userVariant.engineRating = in.readInt();
                userVariant.heatSinks = in.readInt();
                userVariant.engineHeatSinks = in.readInt();
                userVariant.jumpJets = in.readInt();
                userVariant.hasXLEngine = in.readBoolean();
                userVariant.hasFerroFibrous = in.readBoolean();
                userVariant.hasEndoSteel = in.readBoolean();
                userVariant.hasDoubleHS = in.readBoolean();
                userVariant.hasArtemisIV = in.readBoolean();
                userVariant.hasCommandConsole = in.readBoolean();
                userVariant.hasMASC = in.readBoolean();
                for (int i = 0; i < NUMBER_OF_SECTIONS; i++)
                    userVariant.armor[i] = in.readInt();
                
                isLoading = true;
                HeadArmorSpinnerModel.setValue(userVariant.armor[HEAD]);
                RightTorsoArmorSpinnerModel.setValue(userVariant.armor[RIGHT_TORSO]);
                LeftTorsoArmorSpinnerModel.setValue(userVariant.armor[LEFT_TORSO]);
                CenterTorsoArmorSpinnerModel.setValue(userVariant.armor[CENTER_TORSO]);
                RightRearTorsoArmorSpinnerModel.setValue(userVariant.armor[RIGHT_REAR_TORSO]);
                CenterRearTorsoArmorSpinnerModel.setValue(userVariant.armor[CENTER_REAR_TORSO]);
                LeftRearTorsoArmorSpinnerModel.setValue(userVariant.armor[LEFT_REAR_TORSO]);
                RightArmArmorSpinnerModel.setValue(userVariant.armor[RIGHT_ARM]);
                LeftArmArmorSpinnerModel.setValue(userVariant.armor[LEFT_ARM]);
                RightLegArmorSpinnerModel.setValue(userVariant.armor[RIGHT_LEG]);
                LeftLegArmorSpinnerModel.setValue(userVariant.armor[LEFT_LEG]);
                initArmorComponents();
                isLoading = false;
                
                for (int i = 0; i < NUMBER_OF_CRITICAL_SECTIONS; i++)
                    userVariant.criticals[i] = in.readInt();
                for (int i = 0; i < NUMBER_OF_CRITICAL_SECTIONS; i++)
                    for (int j = 0; j < 4; j++)
                        userVariant.hardpoints[i][j] = in.readInt();
                for (int i = 0; i < NUMBER_OF_CRITICAL_SECTIONS; i++) {
                    int size = in.readInt();
                    
                    for (int j = 0; j < size; j++) {
                        int temp3 = in.readInt();
                        userVariant.items[i].add(loadItem(temp3));
                    }
                }
                
                in.close();
                inFile.close();
                
                Weapons[MISSILE_INDEX - 1].remove(7);
                Weapons[MISSILE_INDEX - 1].remove(6);
                Weapons[MISSILE_INDEX - 1].remove(5);
                Weapons[MISSILE_INDEX - 1].remove(3);
                Weapons[MISSILE_INDEX - 1].remove(2);
                Weapons[MISSILE_INDEX - 1].remove(1);
                Weapons[MISSILE_INDEX - 1].remove(0);

                Weapons[MISSILE_INDEX - 1].insertElementAt(new SRM6(userVariant.hasArtemisIV), 1);
                Weapons[MISSILE_INDEX - 1].insertElementAt(new SRM4(userVariant.hasArtemisIV), 1);
                Weapons[MISSILE_INDEX - 1].insertElementAt(new SRM2(userVariant.hasArtemisIV), 1);
                Weapons[MISSILE_INDEX - 1].insertElementAt(new LRM20(userVariant.hasArtemisIV), 0);
                Weapons[MISSILE_INDEX - 1].insertElementAt(new LRM15(userVariant.hasArtemisIV), 0);
                Weapons[MISSILE_INDEX - 1].insertElementAt(new LRM10(userVariant.hasArtemisIV), 0);
                Weapons[MISSILE_INDEX - 1].insertElementAt(new LRM5(userVariant.hasArtemisIV), 0);
        
                Equipment[AMMO_INDEX -1 ].remove(10);
                Equipment[AMMO_INDEX -1 ].remove(8);

                Equipment[AMMO_INDEX - 1].insertElementAt(new LRM_Ammo(userVariant.hasArtemisIV), 8);
                Equipment[AMMO_INDEX - 1].insertElementAt(new SRM_Ammo(userVariant.hasArtemisIV), 10);
                
                userTonnage += (userVariant.heatSinks - 10);
                if (userVariant.engineHeatSinks < 10)
                    userTonnage += (10 - userVariant.engineHeatSinks);

                EngineToggleButton.setSelected(userVariant.hasXLEngine);
                InternalsToggleButton.setSelected(userVariant.hasEndoSteel);
                ArmorToggleButton.setSelected(userVariant.hasFerroFibrous);
                HeatSinkToggleButton.setSelected(userVariant.hasDoubleHS);
                ArtemisToggleButton.setSelected(userVariant.hasArtemisIV);
                MASCToggleButton.setSelected(userVariant.hasMASC);
                CockpitToggleButton.setSelected(userVariant.hasCommandConsole);

                {
                    Engine tempE = new Engine(userVariant.hasXLEngine, userVariant.engineRating);
                    Internals tempI = new Internals(userVariant.hasEndoSteel, userMech.getTonnage());
                    Armor tempA = new Armor(userVariant.hasFerroFibrous, userVariant.getTotalArmor());

                    userTonnage += tempE.getTonnage();
                    userTonnage += tempI.getTonnage();
                    userTonnage += tempA.getTonnage();

                    temp = String.format("%.2f", tempA.getPointsPerTon());
                    PointsPerTonAmount.setText(temp);
                }
            
                for (int i = 0; i < NUMBER_OF_CRITICAL_SECTIONS; i++) {
                    for (int j = 0; j < userVariant.items[i].size(); j++) {
                        if (userVariant.items[i].elementAt(j).getItemType() == WEAPON_ITEM_TYPE) {
                            Weapon weapon = (Weapon)userVariant.items[i].elementAt(j);
                            userHeat += weapon.getHeatPerSecond();
                            userFirepower += weapon.getDamagePerSecond();
                            userAlpha += weapon.getDamage();
                            userAlphaHeat += weapon.getHeat();
                            userTonnage += weapon.getTonnage();
                            if (weapon.getRecycle() > userRecycle)
                                userRecycle = weapon.getRecycle();
                        }
                        else if (userVariant.items[i].elementAt(j).getItemType() == AMMO_ITEM_TYPE) {
                            AmmoBin ammo = (AmmoBin) userVariant.items[i].elementAt(j);
                            userTonnage += ammo.getTonnage();
                        }
                        else if (userVariant.items[i].elementAt(j).getItemType() == EQUIPMENT_ITEM_TYPE) {
                            Special_Equipment other = (Special_Equipment) userVariant.items[i].elementAt(j);
                            userTonnage += other.getTonnage();
                        }
                        else if (userVariant.items[i].elementAt(j).getItemType() == JUMP_JET_ITEM_TYPE) {
                            Special_Equipment other = (Special_Equipment) userVariant.items[i].elementAt(j);
                            userVariant.jumpJets++;
                            userTonnage += other.getTonnage();
                        }
                        else if (userVariant.items[i].elementAt(j).getItemType() == MYOMER_ITEM_TYPE) {
                            Special_Equipment other = (Special_Equipment) userVariant.items[i].elementAt(j);
                            userTonnage += other.getTonnage();
                            SPEED_MODIFIER = 21.6;
                        }
                        else if (userVariant.items[i].elementAt(j).getItemType() == CASE_ITEM_TYPE) {
                            switch(i) {
                                case RIGHT_TORSO:
                                    RightTorsoCASECheckBox.setSelected(true);
                                    break;
                                case LEFT_TORSO:
                                    LeftTorsoCASECheckBox.setSelected(true);
                                    break;
                            }
                            userTonnage += 0.5;
                        }
                    }
                }

                engineRatingSpinnerModel.setValue(userVariant.engineRating);
                heatSinkSpinnerModel.setValue(userVariant.heatSinks);

                engineRatingSpinnerModel.setMaximum(userMech.getMaxEngineRating());
                engineRatingSpinnerModel.setMinimum(userMech.getMinEngineRating());
                
                isSavedMech = false;
                
                loadCriticals();
                setAllToggleButtonText();
                initAllCriticalHardpoints();
                initAllProgressBars();
            }
            catch (FileNotFoundException e)
            {   JOptionPane.showMessageDialog(this, "File Not Found Error: " + e.getMessage());    }
            catch (SecurityException e)
            {   JOptionPane.showMessageDialog(this, "Permission Error: Program has insufficient priveleges to write to the file.");    }
            catch (IOException e)
            {   JOptionPane.showMessageDialog(this, "IO Error: " + e.getMessage());    }
            catch (NullPointerException e)
            {   JOptionPane.showMessageDialog(this, "Null Pointer Error: Variant Class was not instanced.");    }
            catch (Exception e)
            {   JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());    }
        }
    }//GEN-LAST:event_LoadButtonActionPerformed
    private void AlphaRadioButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_AlphaRadioButtonActionPerformed
        if (AlphaRadioButton.isSelected()) {
            firepowerProgressBar.setMaximum(128);
            SpecialProgressBar.setMaximum(100);
        }
        else if (BurstRadioButton.isSelected()) {
            firepowerProgressBar.setMaximum(128);
        }
        else {
            firepowerProgressBar.setMaximum(32);
        }
        updateHeatProgressBar(); updateSpecialProgressBar();
        updateFirepowerProgressBar();
        updateSpecialProgressBar();
    }//GEN-LAST:event_AlphaRadioButtonActionPerformed
    private void BallisticListMouseClicked(MouseEvent evt) {//GEN-FIRST:event_BallisticListMouseClicked
        if (evt.getClickCount() >= 2)
            AddButton.doClick();
    }//GEN-LAST:event_BallisticListMouseClicked
    //<editor-fold defaultstate="collapsed" desc="Equipment Queue Methods/Handlers">
    public void updateItemList() {
        int total = EquipmentQueueList.getSelectedIndex();
        EquipmentQueueListModel.removeAllElements();
        
        for (int i = 0; i < EquipmentQueue.size(); i++)
        {
            if (EquipmentQueueCount[i] < 2)
                EquipmentQueueListModel.addElement(EquipmentQueue.elementAt(i).toString());
            else
                EquipmentQueueListModel.addElement("(" + EquipmentQueueCount[i] + ") " + EquipmentQueue.elementAt(i).toString());
        }
        
        if (total > EquipmentQueue.size() - 1)
            total = EquipmentQueue.size() - 1;
        
        EquipmentQueueList.setSelectedIndex(total);   
    }
    public void addItem(Item item) {
        boolean found = false;
        for (int i = 0; i < EquipmentQueue.size(); i++)
        {
            if (item.toString() == EquipmentQueue.elementAt(i).toString())
            {
                EquipmentQueueCount[i]++;
                found = true;
                break;
            }
        }
        
        if (!found)
        {
            EquipmentQueue.addElement(item);
            EquipmentQueueCount[EquipmentQueue.size() - 1] = 1;
        }
    }
    public void removeItem(int index) {
        if (EquipmentQueueCount[index] > 1)
            EquipmentQueueCount[index]--;
        else
        {
            EquipmentQueue.removeElementAt(index);
            for (int i = index; i <EquipmentQueueCount.length - 1; i++)
                EquipmentQueueCount[i] = EquipmentQueueCount[i + 1];
            EquipmentQueueCount[EquipmentQueueCount.length - 1] = 0;
        }
    }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Critical Methods">
    public void loadCriticals() {
        HeadCriticalListModel.removeAllElements();
        RightTorsoCriticalListModel.removeAllElements();
        CenterTorsoCriticalListModel.removeAllElements();
        LeftTorsoCriticalListModel.removeAllElements();
        RightArmCriticalListModel.removeAllElements();
        LeftArmCriticalListModel.removeAllElements();
        RightLegCriticalListModel.removeAllElements();
        LeftLegCriticalListModel.removeAllElements();
        
        CriticalTextRenderer(HeadCriticalListModel, HEAD);
        CriticalTextRenderer(RightTorsoCriticalListModel, RIGHT_TORSO);
        CriticalTextRenderer(CenterTorsoCriticalListModel, CENTER_TORSO);
        CriticalTextRenderer(LeftTorsoCriticalListModel, LEFT_TORSO);
        CriticalTextRenderer(RightArmCriticalListModel, RIGHT_ARM);
        CriticalTextRenderer(LeftArmCriticalListModel, LEFT_ARM);
        CriticalTextRenderer(RightLegCriticalListModel, RIGHT_LEG);
        CriticalTextRenderer(LeftLegCriticalListModel, LEFT_LEG);
    }
    private void loadCriticals(int section) {
        switch(section) {
            case HEAD:
                CriticalTextRenderer(HeadCriticalListModel, HEAD);
                break;
            case RIGHT_TORSO:
                CriticalTextRenderer(RightTorsoCriticalListModel, RIGHT_TORSO);
                break;
            case CENTER_TORSO:
                CriticalTextRenderer(CenterTorsoCriticalListModel, CENTER_TORSO);
                break;
            case LEFT_TORSO:
                CriticalTextRenderer(LeftTorsoCriticalListModel, LEFT_TORSO);
                break;
            case RIGHT_ARM:
                CriticalTextRenderer(RightArmCriticalListModel, RIGHT_ARM);
                break;
            case LEFT_ARM:
                CriticalTextRenderer(LeftArmCriticalListModel, LEFT_ARM);
                break;
            case RIGHT_LEG:
                CriticalTextRenderer(RightLegCriticalListModel, RIGHT_LEG);
                break;
            case LEFT_LEG:
                CriticalTextRenderer(LeftLegCriticalListModel, LEFT_LEG);
                break;
        }
    }
    private void checkCriticals() {
        for (int i = 0; i < NUMBER_OF_CRITICAL_SECTIONS; i++)
            for (int j = 0; j < userVariant.items[i].size(); j++)
                userVariant.criticals[i] -= userVariant.items[i].elementAt(j).getCriticals();
    }
    private void CriticalTextRenderer(DefaultListModel sectionCriticalModel, int sectionIndex) {
        sectionCriticalModel.removeAllElements();
        for (int i = 0; i < userVariant.items[sectionIndex].size(); i++)
        {
           for (int j = 0; j < userVariant.items[sectionIndex].elementAt(i).getCriticals(); j++)
           {
               if (j == 0)
                   sectionCriticalModel.addElement(userVariant.items[sectionIndex].elementAt(i).toString());
               else
                   sectionCriticalModel.addElement("-------");
           }
        }
        for (int i = 0; i < userVariant.criticals[sectionIndex]; i++)
            sectionCriticalModel.addElement("-Empty-");
    }
    //</editor-fold>
    /*public void recalculateMetrics() {
        userHeat = 0;
        userFirepower = 0;
        userAlpha = 0;
        userAlphaHeat = 0;
        userRecycle = 0;
        
        for (int i = 0; i < EquipmentQueue.size(); i++)
            if (EquipmentQueue.elementAt(i).getItemType() == WEAPON_ITEM_TYPE) {
                Weapon weapon = (Weapon)EquipmentQueue.elementAt(i);
                userHeat += weapon.getHeatPerSecond();
                userFirepower += weapon.getDamagePerSecond();
                userAlpha += weapon.getDamage();
                userAlphaHeat += weapon.getHeat();

                if (weapon.getRecycle() > userRecycle) {
                    userRecycle = weapon.getRecycle();
                    if (FastFireToggleButton.isSelected())
                        userRecycle /= fastFireModifier;
                }
            }
        
        for (int i = 0; i < NUMBER_OF_CRITICAL_SECTIONS; i++)
            for (int j = 0; j < userVariant.items[i].size(); j++)
                if (userVariant.items[i].elementAt(j).getItemType() == WEAPON_ITEM_TYPE) {
                    Weapon weapon = (Weapon)userVariant.items[i].elementAt(j);
                    userHeat += weapon.getHeatPerSecond();
                    userFirepower += weapon.getDamagePerSecond();
                    userAlpha += weapon.getDamage();
                    userAlphaHeat += weapon.getHeat();
                    
                    if (weapon.getRecycle() > userRecycle)
                        userRecycle = weapon.getRecycle();
                }
    }*/
    //<editor-fold defaultstate="collapsed" desc="Progress Bar Methods">
    public void initAllProgressBars() {
        tonnageProgressBar.setMaximum((int)userMech.getTonnage());
        tonnageProgressBar.setValue((int)userTonnage);
        currentArmorProgressBar.setMaximum(userMech.getMaxTotalArmor());
        currentArmorProgressBar.setValue(userMech.getStockTotalArmor());
        
        if ((userMech.getTonnage() * 8.6) > 400)
            speedProgressBar.setMaximum((int)Math.ceil((400 / userMech.getTonnage()) * SPEED_MODIFIER));
        else
            speedProgressBar.setMaximum((int)Math.ceil(8.6 * SPEED_MODIFIER));
        
        if ((userMech.getTonnage() * 2) < 100)
            speedProgressBar.setMinimum((int)Math.floor((100 / userMech.getTonnage()) * SPEED_MODIFIER));
        else
            speedProgressBar.setMinimum((int)Math.floor(SPEED_MODIFIER * 2));
        
        updateJumpProgressBar();
        updateSpeedProgressBar();
        updateFirepowerProgressBar();
        updateRangeProgressBar();
        updateHeatProgressBar(); updateSpecialProgressBar();
        updateSpecialProgressBar();
    }
    public void updateJumpProgressBar() {
        jumpDistanceBar.setValue(userVariant.jumpJets);
        temp = String.format("%d m", (userVariant.jumpJets * 30));
        jumpDistanceBar.setString(temp);
    }
    public void updateArmorProgressBar() {
        int total = 0;
        for (int i = 0; i < NUMBER_OF_SECTIONS; i++)
            total += userVariant.armor[i];
        currentArmorProgressBar.setValue(total);
        currentArmorProgressBar.setString("" + total);
    }
    public void updateTonnageProgressBar() {
        if (userMech.getTonnage() < userTonnage)
            tonnageProgressBar.setForeground(new Color(180, 60, 60));
        else
            tonnageProgressBar.setForeground(new Color(60, 60, 180));
        
        tonnageProgressBar.setValue((int)Math.round(userTonnage));
        temp = String.format("%.2f tons", userTonnage);
        tonnageProgressBar.setString(temp);
        
        long cost = 0;
        
        for (int i = 0; i < NUMBER_OF_CRITICAL_SECTIONS; i++)
            for (int j = 0; j < userVariant.items[i].size(); j++)
                if (userVariant.items[i].elementAt(j).isRemovable()) {
                    if (userVariant.items[i].elementAt(j).getItemType() == INTERNAL_ITEM_TYPE)
                        continue;
                    if (userVariant.items[i].elementAt(j).getItemType() == ARMOR_ITEM_TYPE)
                        continue;
                    
                    cost += userVariant.items[i].elementAt(j).getCost();
                }
        
        {
            Armor tempA = new Armor(userVariant.hasFerroFibrous, userVariant.getTotalArmor());
            Internals tempI = new Internals(userVariant.hasEndoSteel, userMech.getTonnage());
            Engine tempE = new Engine(userVariant.hasXLEngine, userVariant.engineRating);
            Heat_Sink tempHS = new Heat_Sink(userVariant.hasDoubleHS);
            
            cost += tempA.getCost();
            cost += tempE.getCost();
            
            if (RightTorsoCASECheckBox.isSelected())
                cost += 100000;
            if (LeftTorsoCASECheckBox.isSelected())
                cost += 100000;
                    
            temp = String.format("%,d C-Bills", cost);
            ItemCostBar.setText(temp);
            
            cost = 0;
            
            cost += (tempA.getUpgradeCost() * userMech.getTonnage());
            cost += tempI.getCost();
            cost += tempHS.getUpgradeCost();
            
            if (ArtemisToggleButton.isSelected())
                cost += 350000;
            else
                cost += 175000;
                    
            temp = String.format("%,d C-Bills", cost);
            UpgradeCostBar.setText(temp);
        }
    }
    public void updateFirepowerProgressBar() {
        if (AlphaRadioButton.isSelected()) {
            firepowerProgressBar.setValue((int)Math.round(userAlpha));
            temp = String.format("%.2f", userAlpha);
            firepowerProgressBar.setString(temp);
        }
        else if (BurstRadioButton.isSelected()) {
            firepowerProgressBar.setValue((int)userAlpha);
            temp = String.format("%.2f", userAlpha);
            firepowerProgressBar.setString(temp);
        }
        else if (RapidRadioButton.isSelected()) {
            firepowerProgressBar.setValue((int)Math.round(userFirepower));
            temp = String.format("%.2f", userFirepower);
            firepowerProgressBar.setString(temp);
        }
        else {
            AlphaRadioButton.setSelected(true);
            updateFirepowerProgressBar();
        }
    }
    public void updateRangeProgressBar() {
        int closest = 1200;
        int range;
        int effectiveRange = 0;
        userRange = 0;
        for (int i = 0; i < EquipmentQueue.size(); i++)
        {
            if (EquipmentQueue.elementAt(i).getItemType() == WEAPON_ITEM_TYPE)
            {
                Weapon weapon = (Weapon)EquipmentQueue.elementAt(i);
                userRange += (weapon.getRange() * (weapon.getDamagePerSecond() / userFirepower) * EquipmentQueueCount[i]);
            }
        }
        for (int i = 0; i < NUMBER_OF_CRITICAL_SECTIONS; i++)
        {
            for (int j = 0; j < userVariant.items[i].size(); j++)
            {
                if (userVariant.items[i].elementAt(j).getItemType() == WEAPON_ITEM_TYPE)
                {
                    Weapon weapon = (Weapon)userVariant.items[i].elementAt(j);
                    userRange += (weapon.getRange() * (weapon.getDamagePerSecond() / userFirepower));
                }
            }
        }
        for (int i = 0; i < EquipmentQueue.size(); i++)
        {
            if (EquipmentQueue.elementAt(i).getItemType() == WEAPON_ITEM_TYPE)
            {
                Weapon weapon = (Weapon)EquipmentQueue.elementAt(i);
                range = (int)(weapon.getRange() - userRange);
                if (range < 0)
                    range *= -1;
                if (range < closest)
                {
                    closest = range;
                    effectiveRange = weapon.getRange();
                }
            }
        }
        for (int i = 0; i < NUMBER_OF_CRITICAL_SECTIONS; i++)
        {
            for (int j = 0; j < userVariant.items[i].size(); j++)
            {
                if (userVariant.items[i].elementAt(j).getItemType() == WEAPON_ITEM_TYPE)
                {
                    Weapon weapon = (Weapon)userVariant.items[i].elementAt(j);
                    range = (int)(weapon.getRange() - userRange);
                    if (range < 0)
                        range *= -1;
                    if (range < closest)
                    {
                        closest = range;
                        effectiveRange = weapon.getRange();
                    }
                }
            }
        }
        RangeProgressBar.setValue(effectiveRange);
        RangeProgressBar.setString("" + effectiveRange + "m");
    }
    public void updateHeatProgressBar() {
        Heat_Sink tempH = new Heat_Sink(userVariant.hasDoubleHS);

        double temp2 = (userVariant.heatSinks * tempH.getHeatDissipation());
        
        if (userVariant.hasDoubleHS) {
            if (userVariant.engineHeatSinks > 10)
                temp2 += 0.6;
            else
                temp2 += (userVariant.engineHeatSinks * 0.06);
        }
        
        double maxHeat = (temp2 * 10 + 30) * heatContainmentModifier;
        temp2 = userHeat - (temp2 * coolRunModifier);
        
        if (userHeat == 0) {
            heatEfficiencyProgressBar.setValue(0);
            heatEfficiencyProgressBar.setString("0%");
        }
        
        if (AlphaRadioButton.isSelected()) {
            temp2 = (userAlphaHeat * 100 / maxHeat);
            heatEfficiencyProgressBar.setValue((int)Math.round(temp2));
            temp = String.format("%.2f", temp2);
            heatEfficiencyProgressBar.setString(temp + '%');
        }
        else if (BurstRadioButton.isSelected()) {
            heatEfficiencyProgressBar.setValue(0);
            temp = String.format("%.2f", 0.00);
            heatEfficiencyProgressBar.setString(temp + '%');
        }
        else if (RapidRadioButton.isSelected()) {
            temp2 *= (100 / maxHeat);
            heatEfficiencyProgressBar.setValue((int)Math.round(temp2));
            temp = String.format("%.2f", (temp2));
            heatEfficiencyProgressBar.setString(temp + '%');
        }
        else {
            AlphaRadioButton.setSelected(true);
            updateHeatProgressBar(); updateSpecialProgressBar();
        }
    }
    public void updateSpecialProgressBar() {
        if (AlphaRadioButton.isSelected()) {
            Heat_Sink tempH = new Heat_Sink(userVariant.hasDoubleHS);

            double temp2 = (userVariant.heatSinks * tempH.getHeatDissipation());

            if (userVariant.hasDoubleHS) {
                if (userVariant.engineHeatSinks > 10)
                    temp2 += 0.6;
                else
                    temp2 += (userVariant.engineHeatSinks * 0.06);
            }
            
            double maxHeat = (temp2 * 10 + 30) * heatContainmentModifier;
            temp2 = ((temp2 * coolRunModifier * userRecycle) / maxHeat) * 100;
            
            SpecialLabel.setText("Heat Dissipation");
            SpecialProgressBar.setValue((int)Math.round(temp2));
            temp = String.format("%.2f", temp2);
            SpecialProgressBar.setString(temp + "%");
        }
        else if (BurstRadioButton.isSelected()) {
            SpecialLabel.setText("Unknown");
            SpecialProgressBar.setValue(0);
            temp = String.format("%.2f", 0.00);
            SpecialProgressBar.setString(temp + "");
        }
        else if (RapidRadioButton.isSelected()) {
            SpecialLabel.setText("Unknown");
            SpecialProgressBar.setValue(0);
            temp = String.format("%.2f", 0.00);
            SpecialProgressBar.setString(temp + "");
        }
        else {
            AlphaRadioButton.setSelected(true);
            updateSpecialProgressBar();
        }
    }
    public void updateSpeedProgressBar() {
        double temp2 = (userVariant.engineRating / userMech.getTonnage() * SPEED_MODIFIER);
        temp = String.format("%.1f kph", temp2);
        speedProgressBar.setString(temp);
        speedProgressBar.setValue((int)Math.round(temp2));
    }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Hardpoint Methods">
    public void initStatPanel() {
        RightArmBallisticLabel.setText("" + userMech.getHardpoints(RIGHT_ARM, BALLISTIC));
        RightArmEnergyLabel.setText("" + userMech.getHardpoints(RIGHT_ARM, ENERGY));
        RightArmMissileLabel.setText("" + userMech.getHardpoints(RIGHT_ARM, MISSILE));
        RightArmAMSLabel.setText("" + userMech.getHardpoints(RIGHT_ARM, AMS));
        LeftArmBallisticLabel.setText("" + userMech.getHardpoints(LEFT_ARM, BALLISTIC));
        LeftArmEnergyLabel.setText("" + userMech.getHardpoints(LEFT_ARM, ENERGY));
        LeftArmMissileLabel.setText("" + userMech.getHardpoints(LEFT_ARM, MISSILE));
        LeftArmAMSLabel.setText("" + userMech.getHardpoints(LEFT_ARM, AMS));
        RightTorsoBallisticLabel.setText("" + userMech.getHardpoints(RIGHT_TORSO, BALLISTIC));
        RightTorsoEnergyLabel.setText("" + userMech.getHardpoints(RIGHT_TORSO, ENERGY));
        RightTorsoMissileLabel.setText("" + userMech.getHardpoints(RIGHT_TORSO, MISSILE));
        RightTorsoAMSLabel.setText("" + userMech.getHardpoints(RIGHT_TORSO, AMS));
        LeftTorsoBallisticLabel.setText("" + userMech.getHardpoints(LEFT_TORSO, BALLISTIC));
        LeftTorsoEnergyLabel.setText("" + userMech.getHardpoints(LEFT_TORSO, ENERGY));
        LeftTorsoMissileLabel.setText("" + userMech.getHardpoints(LEFT_TORSO, MISSILE));
        LeftTorsoAMSLabel.setText("" + userMech.getHardpoints(LEFT_TORSO, AMS));
        CenterTorsoBallisticLabel.setText("" + userMech.getHardpoints(CENTER_TORSO, BALLISTIC));
        CenterTorsoEnergyLabel.setText("" + userMech.getHardpoints(CENTER_TORSO, ENERGY));
        CenterTorsoMissileLabel.setText("" + userMech.getHardpoints(CENTER_TORSO, MISSILE));
        CenterTorsoAMSLabel.setText("" + userMech.getHardpoints(CENTER_TORSO, AMS));
        HeadBallisticLabel.setText("" + userMech.getHardpoints(HEAD, BALLISTIC));
        HeadEnergyLabel.setText("" + userMech.getHardpoints(HEAD, ENERGY));
        HeadMissileLabel.setText("" + userMech.getHardpoints(HEAD, MISSILE));
        HeadAMSLabel.setText("" + userMech.getHardpoints(HEAD, AMS));
        
        RightArmInternalLabel.setString("" + userMech.getMaxInternals(RIGHT_ARM));
        LeftArmInternalLabel.setString("" + userMech.getMaxInternals(LEFT_ARM));
        RightTorsoInternalLabel.setString("" + userMech.getMaxInternals(RIGHT_TORSO));
        LeftTorsoInternalLabel.setString("" + userMech.getMaxInternals(LEFT_TORSO));
        CenterTorsoInternalLabel.setString("" + userMech.getMaxInternals(CENTER_TORSO));
        HeadInternalLabel.setString("" + userMech.getMaxInternals(HEAD));
        RightLegInternalLabel.setString("" + userMech.getMaxInternals(RIGHT_LEG));
        LeftLegInternalLabel.setString("" + userMech.getMaxInternals(LEFT_LEG));
        
        if (userMech.getHardpoints(RIGHT_ARM, BALLISTIC) > 0)
            RightArmBallisticLabel.setBackground(u.BALLISTIC_COLOR);
        else
            RightArmBallisticLabel.setBackground(u.BLANK_COLOR);
        
        if (userMech.getHardpoints(RIGHT_ARM, ENERGY) > 0)
            RightArmEnergyLabel.setBackground(u.ENERGY_COLOR);
        else
            RightArmEnergyLabel.setBackground(u.BLANK_COLOR);
        
        if (userMech.getHardpoints(RIGHT_ARM, MISSILE) > 0)
            RightArmMissileLabel.setBackground(u.MISSILE_COLOR);
        else
            RightArmMissileLabel.setBackground(u.BLANK_COLOR);
        
        if (userMech.getHardpoints(RIGHT_ARM, AMS) > 0)
            RightArmAMSLabel.setBackground(u.AMS_COLOR);
        else
            RightArmAMSLabel.setBackground(u.BLANK_COLOR);
        
        if (userMech.getHardpoints(LEFT_ARM, BALLISTIC) > 0)
            LeftArmBallisticLabel.setBackground(u.BALLISTIC_COLOR);
        else
            LeftArmBallisticLabel.setBackground(u.BLANK_COLOR);
        
        if (userMech.getHardpoints(LEFT_ARM, ENERGY) > 0)
            LeftArmEnergyLabel.setBackground(u.ENERGY_COLOR);
        else
            LeftArmEnergyLabel.setBackground(u.BLANK_COLOR);
        
        if (userMech.getHardpoints(LEFT_ARM, MISSILE) > 0)
            LeftArmMissileLabel.setBackground(u.MISSILE_COLOR);
        else
            LeftArmMissileLabel.setBackground(u.BLANK_COLOR);
        
        if (userMech.getHardpoints(LEFT_ARM, AMS) > 0)
            LeftArmAMSLabel.setBackground(u.AMS_COLOR);
        else
            LeftArmAMSLabel.setBackground(u.BLANK_COLOR);
        
        if (userMech.getHardpoints(RIGHT_TORSO, BALLISTIC) > 0)
            RightTorsoBallisticLabel.setBackground(u.BALLISTIC_COLOR);
        else
            RightTorsoBallisticLabel.setBackground(u.BLANK_COLOR);
        
        if (userMech.getHardpoints(RIGHT_TORSO, ENERGY) > 0)
            RightTorsoEnergyLabel.setBackground(u.ENERGY_COLOR);
        else
            RightTorsoEnergyLabel.setBackground(u.BLANK_COLOR);
        
        if (userMech.getHardpoints(RIGHT_TORSO, MISSILE) > 0)
            RightTorsoMissileLabel.setBackground(u.MISSILE_COLOR);
        else
            RightTorsoMissileLabel.setBackground(u.BLANK_COLOR);
        
        if (userMech.getHardpoints(RIGHT_TORSO, AMS) > 0)
            RightTorsoAMSLabel.setBackground(u.AMS_COLOR);
        else
            RightTorsoAMSLabel.setBackground(u.BLANK_COLOR);
        
        if (userMech.getHardpoints(LEFT_TORSO, BALLISTIC) > 0)
            LeftTorsoBallisticLabel.setBackground(u.BALLISTIC_COLOR);
        else
            LeftTorsoBallisticLabel.setBackground(u.BLANK_COLOR);
        
        if (userMech.getHardpoints(LEFT_TORSO, ENERGY) > 0)
            LeftTorsoEnergyLabel.setBackground(u.ENERGY_COLOR);
        else
            LeftTorsoEnergyLabel.setBackground(u.BLANK_COLOR);
        
        if (userMech.getHardpoints(LEFT_TORSO, MISSILE) > 0)
            LeftTorsoMissileLabel.setBackground(u.MISSILE_COLOR);
        else
            LeftTorsoMissileLabel.setBackground(u.BLANK_COLOR);
        
        if (userMech.getHardpoints(LEFT_TORSO, AMS) > 0)
            LeftTorsoAMSLabel.setBackground(u.AMS_COLOR);
        else
            LeftTorsoAMSLabel.setBackground(u.BLANK_COLOR);
        
        if (userMech.getHardpoints(CENTER_TORSO, BALLISTIC) > 0)
            CenterTorsoBallisticLabel.setBackground(u.BALLISTIC_COLOR);
        else
            CenterTorsoBallisticLabel.setBackground(u.BLANK_COLOR);
        
        if (userMech.getHardpoints(CENTER_TORSO, ENERGY) > 0)
            CenterTorsoEnergyLabel.setBackground(u.ENERGY_COLOR);
        else
            CenterTorsoEnergyLabel.setBackground(u.BLANK_COLOR);
        
        if (userMech.getHardpoints(CENTER_TORSO, MISSILE) > 0)
            CenterTorsoMissileLabel.setBackground(u.MISSILE_COLOR);
        else
            CenterTorsoMissileLabel.setBackground(u.BLANK_COLOR);
        
        if (userMech.getHardpoints(CENTER_TORSO, AMS) > 0)
            CenterTorsoAMSLabel.setBackground(u.AMS_COLOR);
        else
            CenterTorsoAMSLabel.setBackground(u.BLANK_COLOR);
        
        if (userMech.getHardpoints(HEAD, BALLISTIC) > 0)
            HeadBallisticLabel.setBackground(u.BALLISTIC_COLOR);
        else
            HeadBallisticLabel.setBackground(u.BLANK_COLOR);
        
        if (userMech.getHardpoints(HEAD, ENERGY) > 0)
            HeadEnergyLabel.setBackground(u.ENERGY_COLOR);
        else
            HeadEnergyLabel.setBackground(u.BLANK_COLOR);
        
        if (userMech.getHardpoints(HEAD, MISSILE) > 0)
            HeadMissileLabel.setBackground(u.MISSILE_COLOR);
        else
            HeadMissileLabel.setBackground(u.BLANK_COLOR);
        
        if (userMech.getHardpoints(HEAD, AMS) > 0)
            HeadAMSLabel.setBackground(u.AMS_COLOR);
        else
            HeadAMSLabel.setBackground(u.BLANK_COLOR);
    }
    public void initAllCriticalHardpoints() {
        updateCriticalHardpoints(HEAD, HeadBallisticHardpointLabel, HeadEnergyHardpointLabel, HeadMissileHardpointLabel, HeadAMSHardpointLabel);
        updateCriticalHardpoints(RIGHT_TORSO, RightTorsoBallisticHardpointLabel, RightTorsoEnergyHardpointLabel, RightTorsoMissileHardpointLabel, RightTorsoAMSHardpointLabel);
        updateCriticalHardpoints(CENTER_TORSO, CenterTorsoBallisticHardpointLabel, CenterTorsoEnergyHardpointLabel, CenterTorsoMissileHardpointLabel, CenterTorsoAMSHardpointLabel);
        updateCriticalHardpoints(LEFT_TORSO, LeftTorsoBallisticHardpointLabel, LeftTorsoEnergyHardpointLabel, LeftTorsoMissileHardpointLabel, LeftTorsoAMSHardpointLabel);
        updateCriticalHardpoints(RIGHT_ARM, RightArmBallisticHardpointLabel, RightArmEnergyHardpointLabel, RightArmMissileHardpointLabel, RightArmAMSHardpointLabel);
        updateCriticalHardpoints(LEFT_ARM, LeftArmBallisticHardpointLabel, LeftArmEnergyHardpointLabel, LeftArmMissileHardpointLabel, LeftArmAMSHardpointLabel);
        updateCriticalHardpoints(RIGHT_LEG, RightLegBallisticHardpointLabel, RightLegEnergyHardpointLabel, RightLegMissileHardpointLabel, RightLegAMSHardpointLabel);
        updateCriticalHardpoints(LEFT_LEG, LeftLegBallisticHardpointLabel, LeftLegEnergyHardpointLabel, LeftLegMissileHardpointLabel, LeftLegAMSHardpointLabel);
    }
    public void updateCriticalHardpoints(int sectionID, JLabel BallisticHPLabel, JLabel EnergyHPLabel, JLabel MissileHPLabel, JLabel AMSHPLabel) {
        if (userMech.getHardpoints(sectionID, BALLISTIC) > 0)
        {
            BallisticHPLabel.setVisible(true);
            BallisticHPLabel.setText(userVariant.hardpoints[sectionID][BALLISTIC] + "/" + userMech.getHardpoints(sectionID, BALLISTIC) + " Ballistic");
        }
        else
            BallisticHPLabel.setVisible(false);

        if (userMech.getHardpoints(sectionID, ENERGY) > 0)
        {
            EnergyHPLabel.setVisible(true);
            EnergyHPLabel.setText(userVariant.hardpoints[sectionID][ENERGY] + "/" + userMech.getHardpoints(sectionID, ENERGY) + " Energy");
        }
        else
            EnergyHPLabel.setVisible(false);

        if (userMech.getHardpoints(sectionID, MISSILE) > 0)
        {
            MissileHPLabel.setVisible(true);
            MissileHPLabel.setText(userVariant.hardpoints[sectionID][MISSILE] + "/" + userMech.getHardpoints(sectionID, MISSILE) + " Missile");
        }
        else
            MissileHPLabel.setVisible(false);

        if (userMech.getHardpoints(sectionID, AMS) > 0)
        {
            AMSHPLabel.setVisible(true);
            AMSHPLabel.setText(userVariant.hardpoints[sectionID][AMS] + "/" + userMech.getHardpoints(sectionID, AMS) + " AMS");
        }
        else
            AMSHPLabel.setVisible(false);
    
    }
    //</editor-fold>
    private class mechCriticalRenderer extends DefaultListCellRenderer {
        private Color EmptyFG = new Color(0,0,0),
                    EmptyBG = new Color(180,180,180),
                    NormalFG = new Color(0,0,0),
                    NormalBG = new Color(120,120,120),
                    LockedFG = new Color(180,180,180),
                    LockedBG = new Color(60,60,60);
        
        private int sectionFlag;

        public mechCriticalRenderer(int section) {
            sectionFlag = section;
        }

        @Override
        public JLabel getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean hasFocus) {
            JLabel label = (JLabel)super.getListCellRendererComponent(list, value, index, isSelected, hasFocus);
            int criticalIndex = -1;
            int baseIndex = -1;

            label.setBackground( EmptyBG );
            label.setForeground( EmptyFG );
            label.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));


            for (int i = 0; i < userVariant.items[sectionFlag].size(); i++)
            {
                
                for (int j = 0; j < userVariant.items[sectionFlag].elementAt(i).getCriticals(); j++)
                {
                    criticalIndex++;
                    if (index == criticalIndex)
                        break;
                }
                
                baseIndex += userVariant.items[sectionFlag].elementAt(i).getCriticals();
                
                if (index == criticalIndex) {
                    criticalIndex = i;
                    break;
                }
            }
            
            if (baseIndex < index)
                criticalIndex = -1;

            if (criticalIndex < userVariant.items[sectionFlag].size() && criticalIndex > -1) {
                if (!userVariant.items[sectionFlag].elementAt(criticalIndex).isRemovable()) {
                    if (isSelected && list.hasFocus()) {
                        label.setBackground( LockedFG );
                        label.setForeground( LockedBG );
                    }
                    else {
                        label.setBackground( LockedBG );
                        label.setForeground( LockedFG );
                    }
                    if (userVariant.items[sectionFlag].elementAt(criticalIndex).getCriticals() > 1 && baseIndex != index) {
                        label.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, Color.BLACK));
                    }
                    else if (userVariant.items[sectionFlag].elementAt(criticalIndex).getCriticals() > 1 && baseIndex == index) {
                        label.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
                    }
                    else {
                        label.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
                    }
                }
                else /*if (userVariant.items[sectionFlag].elementAt(criticalIndex).isRemovable())*/ {
                    if (userVariant.items[sectionFlag].elementAt(criticalIndex).getHardpointType() == BALLISTIC)
                        NormalBG = new Color(120,120,60);
                    else if (userVariant.items[sectionFlag].elementAt(criticalIndex).getHardpointType() == ENERGY)
                        NormalBG = new Color(120,60,60);
                    else if (userVariant.items[sectionFlag].elementAt(criticalIndex).getHardpointType() == MISSILE)
                        NormalBG = new Color(60,120,60);
                    else if (userVariant.items[sectionFlag].elementAt(criticalIndex).getHardpointType() == AMS)
                        NormalBG = new Color(60,60,120);
                    else
                        NormalBG = new Color(120,120,120);
                    
                    if (isSelected && list.hasFocus()) {
                        label.setBackground( NormalFG );
                        label.setForeground( NormalBG );
                    }
                    else {
                        label.setBackground( NormalBG );
                        label.setForeground( NormalFG );
                    }
                    
                    if (userVariant.items[sectionFlag].elementAt(criticalIndex).getCriticals() > 1 && baseIndex != index) {
                        label.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, Color.BLACK));
                    }
                    else if (userVariant.items[sectionFlag].elementAt(criticalIndex).getCriticals() > 1 && baseIndex == index) {
                        label.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
                    }
                    else
                        label.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
                }
            }
            return label;
        }
    }
    private class customException extends Exception {
            public customException(String message)
            {
                super(message);
            }
        }
    //<editor-fold defaultstate="collapsed" desc="JComponent Variable Declerations">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JMenuItem AboutButton;
    private JButton AddButton;
    private JRadioButtonMenuItem AlphaRadioButton;
    private JList AmmoList;
    private static final JLabel AmountLabel = new JLabel();
    private JPanel ArmorAdjustmentPanel;
    private JToggleButton ArmorToggleButton;
    private JToggleButton ArtemisToggleButton;
    private JList BallisticList;
    private JRadioButtonMenuItem BurstRadioButton;
    private JPanel CapabilityPanel;
    private JSpinner CenterRearTorsoSpinner;
    private JLabel CenterTorsoAMSHardpointLabel;
    JLabel CenterTorsoAMSLabel;
    private JLabel CenterTorsoAmountLabel;
    private JPanel CenterTorsoArmorPanel;
    private JProgressBar CenterTorsoArmorProgressBar;
    private JLabel CenterTorsoBallisticHardpointLabel;
    JLabel CenterTorsoBallisticLabel;
    private JPanel CenterTorsoCriticalPanel;
    private JLabel CenterTorsoEnergyHardpointLabel;
    JLabel CenterTorsoEnergyLabel;
    private JPanel CenterTorsoFrontPanel;
    JProgressBar CenterTorsoInternalLabel;
    private static final JLabel CenterTorsoLabel = new JLabel();
    private JList CenterTorsoList;
    private JLabel CenterTorsoMissileHardpointLabel;
    JLabel CenterTorsoMissileLabel;
    private JPanel CenterTorsoRearPanel;
    private JSpinner CenterTorsoSpinner;
    private JPanel CenterTorsoStatsPanel;
    private JComboBox ChassisComboBox;
    private JPanel ChassisPanel;
    private JButton ClearQueueButton;
    private JToggleButton CockpitToggleButton;
    private JToggleButton CoolRunToggleButton;
    private JLabel ECMLabel;
    private JPanel EfficienciesPanel;
    private JToggleButton EliteModToggleButton;
    private JList EnergyList;
    private JSpinner EngineRatingSpinner;
    private JToggleButton EngineToggleButton;
    private JButton EquipButton;
    private JList EquipmentList;
    private JList EquipmentQueueList;
    private JPanel EquipmentQueuePanel;
    private JTabbedPane EquipmentTabbedPane;
    private JMenuItem ExportButton;
    private JToggleButton FastFireToggleButton;
    private JMenu FileMenu;
    private static final JLabel FrontLabel = new JLabel();
    private JLabel HeadAMSHardpointLabel;
    JLabel HeadAMSLabel;
    private JLabel HeadAmountLabel;
    private JPanel HeadArmorPanel;
    private JProgressBar HeadArmorProgressBar;
    private JLabel HeadBallisticHardpointLabel;
    JLabel HeadBallisticLabel;
    private JPanel HeadCriticalPanel;
    private JLabel HeadEnergyHardpointLabel;
    JLabel HeadEnergyLabel;
    JProgressBar HeadInternalLabel;
    private static final JLabel HeadLabel = new JLabel();
    private JList HeadList;
    private JLabel HeadMissileHardpointLabel;
    JLabel HeadMissileLabel;
    private JSpinner HeadSpinner;
    private JPanel HeadStatsPanel;
    private JToggleButton HeatContainmentToggleButton;
    private JSpinner HeatSinkSpinner;
    private JToggleButton HeatSinkToggleButton;
    private JMenu HelpMenu;
    private JButton InfoButton;
    private JPanel InfoPanel;
    private JToggleButton InternalsToggleButton;
    private JLabel ItemCostBar;
    private JLabel JumpLabel;
    private JLabel LeftArmAMSHardpointLabel;
    JLabel LeftArmAMSLabel;
    private JLabel LeftArmAmountLabel;
    private JPanel LeftArmArmorPanel;
    private JProgressBar LeftArmArmorProgressBar;
    private JLabel LeftArmBallisticHardpointLabel;
    JLabel LeftArmBallisticLabel;
    private JPanel LeftArmCriticalPanel;
    private JLabel LeftArmEnergyHardpointLabel;
    JLabel LeftArmEnergyLabel;
    JProgressBar LeftArmInternalLabel;
    private static final JLabel LeftArmLabel = new JLabel();
    private JList LeftArmList;
    private JLabel LeftArmMissileHardpointLabel;
    JLabel LeftArmMissileLabel;
    private JSpinner LeftArmSpinner;
    private JPanel LeftArmStatsPanel;
    private JLabel LeftLegAMSHardpointLabel;
    JLabel LeftLegAMSLabel;
    private JLabel LeftLegAmountLabel;
    private JPanel LeftLegArmorPanel;
    private JProgressBar LeftLegArmorProgressBar;
    private JLabel LeftLegBallisticHardpointLabel;
    JLabel LeftLegBallisticLabel;
    private JPanel LeftLegCriticalPanel;
    private JLabel LeftLegEnergyHardpointLabel;
    JLabel LeftLegEnergyLabel;
    JProgressBar LeftLegInternalLabel;
    private static final JLabel LeftLegLabel = new JLabel();
    private JList LeftLegList;
    private JLabel LeftLegMissileHardpointLabel;
    JLabel LeftLegMissileLabel;
    private JSpinner LeftLegSpinner;
    private JPanel LeftLegStatsPanel;
    private JSpinner LeftRearTorsoSpinner;
    private JLabel LeftTorsoAMSHardpointLabel;
    JLabel LeftTorsoAMSLabel;
    private JLabel LeftTorsoAmountLabel;
    private JPanel LeftTorsoArmorPanel;
    private JProgressBar LeftTorsoArmorProgressBar;
    private JLabel LeftTorsoBallisticHardpointLabel;
    JLabel LeftTorsoBallisticLabel;
    private JCheckBox LeftTorsoCASECheckBox;
    private JPanel LeftTorsoCriticalPanel;
    private JLabel LeftTorsoEnergyHardpointLabel;
    JLabel LeftTorsoEnergyLabel;
    private JPanel LeftTorsoFrontPanel;
    JProgressBar LeftTorsoInternalLabel;
    private static final JLabel LeftTorsoLabel = new JLabel();
    private JList LeftTorsoList;
    private JLabel LeftTorsoMissileHardpointLabel;
    JLabel LeftTorsoMissileLabel;
    private JPanel LeftTorsoRearPanel;
    private JSpinner LeftTorsoSpinner;
    private JPanel LeftTorsoStatsPanel;
    private JMenuItem LoadButton;
    private JToggleButton MASCToggleButton;
    private JToggleButton MasterModToggleButton;
    private JButton MaxArmorButton;
    private JButton MaxArmorButton1;
    private JButton MaxArmorButton2;
    private JButton MaxArmorButton3;
    private JPanel MechDisplayPanel;
    private JLabel MechImage;
    JPanel MechLabPanel;
    private JTabbedPane MechTabPane;
    private JMenuItem MechTreeButton;
    private JMenuBar MenuBar;
    private JMenu MetricsMenu;
    private JList MissileList;
    private JComboBox ModelComboBox;
    private JMenuItem PilotTreeButton;
    private JLabel PointsPerTonAmount;
    private static final JLabel PointsPerTonLabel = new JLabel();
    private JMenuItem PreferencesButton;
    private JLabel RangeLabel;
    private JProgressBar RangeProgressBar;
    private JRadioButtonMenuItem RapidRadioButton;
    private JProgressBar RearCenterTorsoArmorProgressBar;
    private static final JLabel RearLabel = new JLabel();
    private JProgressBar RearLeftTorsoArmorProgressBar;
    private JProgressBar RearRightTorsoArmorProgressBar;
    private JButton RemoveFromQueueButton;
    private JLabel RightArmAMSHardpointLabel;
    JLabel RightArmAMSLabel;
    private JLabel RightArmAmountLabel;
    private JPanel RightArmArmorPanel;
    private JProgressBar RightArmArmorProgressBar;
    private JLabel RightArmBallisticHardpointLabel;
    JLabel RightArmBallisticLabel;
    private JPanel RightArmCriticalPanel;
    private JLabel RightArmEnergyHardpointLabel;
    JLabel RightArmEnergyLabel;
    JProgressBar RightArmInternalLabel;
    private static final JLabel RightArmLabel = new JLabel();
    private JList RightArmList;
    private JLabel RightArmMissileHardpointLabel;
    JLabel RightArmMissileLabel;
    private JSpinner RightArmSpinner;
    private JPanel RightArmStatsPanel;
    private JLabel RightLegAMSHardpointLabel;
    JLabel RightLegAMSLabel;
    private JLabel RightLegAmountLabel;
    private JPanel RightLegArmorPanel;
    private JProgressBar RightLegArmorProgressBar;
    private JLabel RightLegBallisticHardpointLabel;
    JLabel RightLegBallisticLabel;
    private JPanel RightLegCriticalPanel;
    private JLabel RightLegEnergyHardpointLabel;
    JLabel RightLegEnergyLabel;
    JProgressBar RightLegInternalLabel;
    private static final JLabel RightLegLabel = new JLabel();
    private JList RightLegList;
    private JLabel RightLegMissileHardpointLabel;
    JLabel RightLegMissileLabel;
    private JSpinner RightLegSpinner;
    private JPanel RightLegStatsPanel;
    private JSpinner RightRearTorsoSpinner;
    private JLabel RightTorsoAMSHardpointLabel;
    JLabel RightTorsoAMSLabel;
    private JLabel RightTorsoAmountLabel;
    private JPanel RightTorsoArmorPanel;
    private JProgressBar RightTorsoArmorProgressBar;
    private JLabel RightTorsoBallisticHardpointLabel;
    JLabel RightTorsoBallisticLabel;
    private JCheckBox RightTorsoCASECheckBox;
    private JPanel RightTorsoCriticalPanel;
    private JLabel RightTorsoEnergyHardpointLabel;
    JLabel RightTorsoEnergyLabel;
    private JPanel RightTorsoFrontPanel;
    JProgressBar RightTorsoInternalLabel;
    private static final JLabel RightTorsoLabel = new JLabel();
    private JList RightTorsoList;
    private JLabel RightTorsoMissileHardpointLabel;
    JLabel RightTorsoMissileLabel;
    private JPanel RightTorsoRearPanel;
    private JSpinner RightTorsoSpinner;
    private JPanel RightTorsoStatsPanel;
    private JMenuItem SaveButton;
    private JPanel SectionArmorPanel;
    private JPanel SectionCriticalsPanel;
    private static final JLabel SectionLabel = new JLabel();
    private JButton SelectiveAllocationButton;
    private JLabel SpecialLabel;
    private JProgressBar SpecialProgressBar;
    private JToggleButton SpeedTweakToggleButton;
    private JMenu StatsMenu;
    private JPanel StatsPanel;
    private JButton StripMechButton;
    private JButton StripSectionButton;
    private JLabel TotalAmountLabel;
    private JLabel TotalCostBar;
    private static final JLabel TotalLabel = new JLabel();
    private JLabel UnconfirmedLabel;
    private JLabel UnreleasedLabel;
    private JLabel UpgradeCostBar;
    private JPanel UpgradePanel;
    private JPanel UpgradesPanel;
    private JTextField VariantTextField;
    private JPanel WeaponButtonPanel;
    private JPanel WeaponPanel;
    private JMenuItem WeaponStatsButton;
    private ButtonGroup buttonGroup1;
    private JLabel currentArmorLabel;
    private JProgressBar currentArmorProgressBar;
    private JLabel currentSpeedLabel;
    private JLabel currentTonnageLabel;
    private JLabel firepowerLabel;
    private JProgressBar firepowerProgressBar;
    private JLabel heatEfficiencyLabel;
    private JProgressBar heatEfficiencyProgressBar;
    private JPanel jPanel1;
    private JProgressBar jumpDistanceBar;
    private JLabel jumpDistanceLabel;
    private JProgressBar speedProgressBar;
    private JProgressBar tonnageProgressBar;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
}