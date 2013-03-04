package MWOMechbay.GUI;

import MWOMechbay.Components.SpecialEquipment.Command_Console;
import MWOMechbay.Components.Ammo.*;
import MWOMechbay.Components.Components.*;
import MWOMechbay.Components.Item;
import MWOMechbay.Components.OtherEquipment.*;
import MWOMechbay.Components.SpecialEquipment.*;
import MWOMechbay.Components.Weapons.*;
import MWOMechbay.Mechs.*;
import MWOMechbay.Variant;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;
import java.util.Vector;
import javax.swing.*;
import javax.swing.JSpinner.NumberEditor;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeSelectionModel;



public class MechlabForm extends javax.swing.JFrame implements Serializable, SaveCommon, MainCommon {
    //Temporary Variables (used enough to just stay in memory)
    private String temp = "";
    private int total = 0;
    
    //User Variables
    private double userTonnage = 0;
    private double userAlpha = 0;
    private double userAlphaHeat = 0;
    private double userFirepower = 0;
    private double userHeat = 0;
    private int userRange = 0;
    private int userSection = CENTER_TORSO;
    private double SPEED_MODIFIER = STANDARD_SPEED_MODIFIER;
    private Variant userVariant = new Variant();
    private Mech userMech = new Mech();
    
    private DefaultListModel ballisticListModel = new DefaultListModel();
    private DefaultListModel energyListModel = new DefaultListModel();
    private DefaultListModel missileListModel = new DefaultListModel();
    private DefaultListModel ammoListModel = new DefaultListModel();
    private DefaultListModel specialEquipmentListModel = new DefaultListModel();
    private DefaultListModel itemBayListModel = new DefaultListModel();
    private DefaultListModel criticalListModel = new DefaultListModel();
    
    private SpinnerNumberModel headArmorSpinnerModel = new SpinnerNumberModel(0, 0, 18, 1);
    private SpinnerNumberModel rightTorsoArmorSpinnerModel = new SpinnerNumberModel(0, 0, 124, 1);
    private SpinnerNumberModel leftTorsoArmorSpinnerModel = new SpinnerNumberModel(0, 0, 124, 1);
    private SpinnerNumberModel centerTorsoArmorSpinnerModel = new SpinnerNumberModel(0, 0, 124, 1);
    private SpinnerNumberModel rightRearTorsoArmorSpinnerModel = new SpinnerNumberModel(0, 0, 124, 1);
    private SpinnerNumberModel leftRearTorsoArmorSpinnerModel = new SpinnerNumberModel(0, 0, 124, 1);
    private SpinnerNumberModel centerRearTorsoArmorSpinnerModel = new SpinnerNumberModel(0, 0, 124, 1);
    private SpinnerNumberModel rightArmArmorSpinnerModel = new SpinnerNumberModel(0, 0, 124, 1);
    private SpinnerNumberModel leftArmArmorSpinnerModel = new SpinnerNumberModel(0, 0, 124, 1);
    private SpinnerNumberModel rightLegArmorSpinnerModel = new SpinnerNumberModel(0, 0, 124, 1);
    private SpinnerNumberModel leftLegArmorSpinnerModel = new SpinnerNumberModel(0, 0, 124, 1);
    private SpinnerNumberModel engineRatingSpinnerModel = new SpinnerNumberModel(userVariant.engineRating, 0, 400, 5);
    private SpinnerNumberModel heatSinkSpinnerModel = new SpinnerNumberModel(10, 10, 75, 1);
    private SpinnerNumberModel jumpJetSpinnerModel = new SpinnerNumberModel(userVariant.jumpJets, 0, 75, 1);
    
    private DefaultListSelectionModel ballisticSelectionModel = new DefaultListSelectionModel();
    private DefaultListSelectionModel energySelectionModel = new DefaultListSelectionModel();
    private DefaultListSelectionModel missileSelectionModel = new DefaultListSelectionModel();
    
    
    private Vector<Item>[] Equipment = new Vector[6];
    private int[] equipmentQueue = new int[30];
    
    private HubForm parent;
    
    public MechlabForm(HubForm nParent) {
        parent = nParent;
        loadEquipment();
        initComponents();
        updateHardPointPanel();
        updateMechList();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        GridBagConstraints gridBagConstraints;

        MainTabbedPane = new JTabbedPane();
        StatLabPanel = new JPanel();
        KeyPanel = new JPanel();
        KeyArmorLabel = new JProgressBar();
        KeyInternalLabel = new JProgressBar();
        KeyBallisticLabel = new JLabel();
        KeyEnergyLabel = new JLabel();
        KeyMissileLabel = new JLabel();
        ChassisInfoPanel = new JPanel();
        ChassisLabel = new JLabel();
        VariantLabel = new JLabel();
        TonnageLabel = new JLabel();
        ClassLabel = new JLabel();
        ModuleLabel = new JLabel();
        CostLabel = new JLabel();
        JJLabel = new JLabel();
        mechTreeButton = new JButton();
        moduleButton = new JButton();
        CostLabel1 = new JLabel();
        TotalPanel = new JPanel();
        TotalArmorLabel = new JProgressBar();
        TotalInternalLabel = new JProgressBar();
        TotalBallisticLabel = new JLabel();
        TotalEnergyLabel = new JLabel();
        TotalMissileLabel = new JLabel();
        HardpointArmorPanel = new JPanel();
        HeadPanel = new JPanel();
        HeadInternalLabel = new JProgressBar();
        HeadArmorLabel = new JProgressBar();
        HeadBallisticLabel = new JLabel();
        HeadEnergyLabel = new JLabel();
        HeadMissileLabel = new JLabel();
        RightArmPanel = new JPanel();
        RightArmInternalLabel = new JProgressBar();
        RightArmArmorLabel = new JProgressBar();
        RightArmBallisticLabel = new JLabel();
        RightArmEnergyLabel = new JLabel();
        RightArmMissileLabel = new JLabel();
        LeftArmPanel = new JPanel();
        LeftArmInternalLabel = new JProgressBar();
        LeftArmArmorLabel = new JProgressBar();
        LeftArmBallisticLabel = new JLabel();
        LeftArmEnergyLabel = new JLabel();
        LeftArmMissileLabel = new JLabel();
        RightTorsoPanel = new JPanel();
        RightTorsoInternalLabel = new JProgressBar();
        RightTorsoArmorLabel = new JProgressBar();
        RightTorsoBallisticLabel = new JLabel();
        RightTorsoEnergyLabel = new JLabel();
        RightTorsoMissileLabel = new JLabel();
        CenterTorsoPanel = new JPanel();
        CenterTorsoInternalLabel = new JProgressBar();
        CenterTorsoArmorLabel = new JProgressBar();
        CenterTorsoBallisticLabel = new JLabel();
        CenterTorsoEnergyLabel = new JLabel();
        CenterTorsoMissileLabel = new JLabel();
        LeftTorsoPanel = new JPanel();
        LeftTorsoInternalLabel = new JProgressBar();
        LeftTorsoArmorLabel = new JProgressBar();
        LeftTorsoBallisticLabel = new JLabel();
        LeftTorsoEnergyLabel = new JLabel();
        LeftTorsoMissileLabel = new JLabel();
        LeftLegPanel = new JPanel();
        LeftLegInternalLabel = new JProgressBar();
        LeftLegArmorLabel = new JProgressBar();
        LeftLegBallisticLabel = new JLabel();
        LeftLegEnergyLabel = new JLabel();
        LeftLegMissileLabel = new JLabel();
        InternalTypeLabel = new JPanel();
        RightLegInternalLabel = new JProgressBar();
        RightLegArmorLabel = new JProgressBar();
        RightLegBallisticLabel = new JLabel();
        RightLegEnergyLabel = new JLabel();
        RightLegMissileLabel = new JLabel();
        LeftArmActuatorPanel = new JPanel();
        ShoulderActuatorLabel = new JLabel();
        UpperArmActuatorLabel = new JLabel();
        LowerArmActuatorLabel = new JLabel();
        HandActuatorLabel = new JLabel();
        RightArmActuatorPanel = new JPanel();
        ShoulderActuatorLabel1 = new JLabel();
        UpperArmActuatorLabel1 = new JLabel();
        LowerArmActuatorLabel1 = new JLabel();
        HandActuatorLabel1 = new JLabel();
        MechLabPanel = new JPanel();
        MainInfoPanel = new JPanel();
        variantTextField = new JTextField();
        currentTonnageLabel = new JLabel();
        tonnageProgressBar = new JProgressBar();
        currentSpeedLabel = new JLabel();
        speedProgressBar = new JProgressBar();
        alphaStrikeLabel = new JLabel();
        alphaStrikeProgressBar = new JProgressBar();
        firepowerLabel = new JLabel();
        firepowerProgressBar = new JProgressBar();
        heatEfficiencyLabel = new JLabel();
        heatEfficiencyProgressBar = new JProgressBar();
        currentArmorLabel = new JLabel();
        currentArmorProgressBar = new JProgressBar();
        alphaStrikeHeatLabel = new JLabel();
        alphaStrikeHeatProgressBar = new JProgressBar();
        rangeLabel = new JLabel();
        rangeProgressBar = new JProgressBar();
        criticalsUsedLabel = new JLabel();
        criticalsUsedProgressBar = new JProgressBar();
        componentPane = new JTabbedPane();
        MotivePanel = new JPanel();
        EnginePanel = new JPanel();
        EngineWeightLabel = new JLabel();
        EngineCostLabel = new JLabel();
        engineTypeToggleButton = new JToggleButton();
        engineRatingSpinner = new JSpinner();
        engineRatingLabel = new JLabel();
        JumpJetPanel = new JPanel();
        JumpJetWeightLabel = new JLabel();
        JumpJetCostLabel = new JLabel();
        jumpJetSpinner = new JSpinner();
        ProtectionPanel = new JPanel();
        ArmorPanel = new JPanel();
        ArmorWeightLabel = new JLabel();
        ArmorCostLabel = new JLabel();
        armorTypeToggleButton = new JToggleButton();
        InternalPanel = new JPanel();
        InternalWeightLabel = new JLabel();
        InternalCostLabel = new JLabel();
        internalTypeToggleButton = new JToggleButton();
        EnhancementPanel = new JPanel();
        HeatSinkPanel = new JPanel();
        HeatSinkCostLabel = new JLabel();
        HeatDissapationLabel = new JLabel();
        heatSinkTypeToggleButton = new JToggleButton();
        heatSinkSpinner = new JSpinner();
        heatSinkLabel = new JLabel();
        itemChooser = new JPanel();
        itemPane = new JTabbedPane();
        ballisticPanel = new JPanel();
        jScrollPane3 = new JScrollPane();
        ballisticList = new JList();
        energyPanel = new JPanel();
        jScrollPane6 = new JScrollPane();
        energyList = new JList();
        missilePanel = new JPanel();
        jScrollPane7 = new JScrollPane();
        missileList = new JList();
        ammoPanel = new JPanel();
        jScrollPane4 = new JScrollPane();
        ammoList = new JList();
        equipmentPanel = new JPanel();
        jScrollPane5 = new JScrollPane();
        specialEquipmentList = new JList();
        itemButtonPanel = new JPanel();
        aboutEquipmentButton = new JButton();
        clearEquipmentButton = new JButton();
        addEquipmentButton = new JButton();
        removeEquipmentButton = new JButton();
        ArtemisIVCheckBox = new JCheckBox();
        mechSnapPanel = new JPanel();
        headSnapPanel = new JPanel();
        headSnapButton = new JButton();
        centerTorsoSnapPanel = new JPanel();
        centerTorsoSnapButton = new JButton();
        leftArmSnapPanel = new JPanel();
        leftArmSnapButton = new JButton();
        rightArmSnapPanel = new JPanel();
        rightArmSnapButton = new JButton();
        leftTorsoSnapPanel = new JPanel();
        leftTorsoSnapButton = new JButton();
        rightTorsoSnapPanel = new JPanel();
        rightTorsoSnapButton = new JButton();
        leftLegSnapPanel = new JPanel();
        leftLegSnapButton = new JButton();
        rightLegSnapPanel = new JPanel();
        rightLegSnapButton = new JButton();
        mechPane = new JTabbedPane();
        criticalPanel = new JPanel();
        ballisticHardpointLabel = new JLabel();
        energyHardpointLabel = new JLabel();
        missileHardpointLabel = new JLabel();
        AMSHardpointLabel = new JLabel();
        jScrollPane1 = new JScrollPane();
        criticalList = new JList();
        sectionCritcalLabel = new JLabel();
        armorPanel = new JPanel();
        headArmorSpinner = new JSpinner();
        rightTorsoArmorSpinner = new JSpinner();
        centerTorsoArmorSpinner = new JSpinner();
        leftTorsoArmorSpinner = new JSpinner();
        rightArmArmorSpinner = new JSpinner();
        leftArmArmorSpinner = new JSpinner();
        rightLegArmorSpinner = new JSpinner();
        leftLegArmorSpinner = new JSpinner();
        rightRearTorsoArmorSpinner = new JSpinner();
        centerRearTorsoArmorSpinner = new JSpinner();
        leftRearTorsoArmorSpinner = new JSpinner();
        headArmorLabel = new JLabel();
        rightTorsoArmorLabel = new JLabel();
        leftTorsoArmorLabel = new JLabel();
        centerTorsoArmorLabel = new JLabel();
        rightArmArmorLabel = new JLabel();
        leftArmArmorLabel = new JLabel();
        rightLegArmorLabel = new JLabel();
        leftLegArmorLabel = new JLabel();
        itemBayPanel = new JPanel();
        caseCheckBox = new JCheckBox();
        jScrollPane2 = new JScrollPane();
        itemBayList = new JList();
        itemButtonPanel1 = new JPanel();
        selectiveEquipmentButton = new JButton();
        clearSectionEquipmentButton = new JButton();
        addEquipmentButton1 = new JButton();
        removeEquipmentButton1 = new JButton();
        MASCCheckBox = new JCheckBox();
        equipmentLabPanel = new JPanel();
        jTabbedPane1 = new JTabbedPane();
        jPanel1 = new JPanel();
        jScrollPane8 = new JScrollPane();
        Object[][] data = new Object[Equipment[AMMO].size()][3];
        for (int i = 0; i < Equipment[AMMO].size(); i++) {
            AmmoBin ammo = (AmmoBin) Equipment[AMMO].elementAt(i);
            data[i][0] = ammo.toString();
            data[i][1] = ammo.getShotsPerTon();
            temp = String.format("%,d C-Bills", ammo.getCost());
            data[i][2] = temp;
        }
        String[] colnames = {   "Ammunition Name",
            "Shots Per Ton",
            "Cost"};
        ammoTable1 = new JTable(data, colnames);
        jScrollPane9 = new JScrollPane();
        data = new Object[Equipment[MISSILE].size()][3];
        for (int i = 0; i < Equipment[MISSILE].size(); i++) {
            Weapon weapon = (Weapon) Equipment[MISSILE].elementAt(i);
            AmmoBin ammo;
            data[i][0] = weapon.toString();
            if (i < 4) {
                ammo = new LRM_Ammo();
            } else if (i < 7) {
                ammo = new SRM_Ammo();
            } else {
                ammo = new Streak_SRM_Ammo();
            }

            data[i][1] = ammo.toString();
            temp = String.format("%.2f", ammo.getShotsPerTon() / (double)weapon.getProjectileCount());
            data[i][2] = temp;
        }

        colnames = new String[3];
        colnames[0] = "Weapon Name";
        colnames[1] = "Ammunition Name";
        colnames[2] = "Salvos Per Ton";
        ammoTable2 = new JTable(data, colnames);
        jPanel2 = new JPanel();
        jScrollPane10 = new JScrollPane();
        data = new Object[Equipment[BALLISTIC].size()][8];
        for (int i = 0; i < Equipment[BALLISTIC].size(); i++) {
            Weapon weapon = (Weapon) Equipment[BALLISTIC].elementAt(i);
            data[i][0] = weapon.getMinimumRange() + "m";
            data[i][1] = weapon.getRange() + "m";
            data[i][2] = weapon.getMaximumRange() + "m";
            data[i][3] = weapon.getVelocity();
            temp = String.format("%.2f", weapon.getKnock());
            data[i][4] = temp;
            temp = String.format("%.2f", weapon.getSpread());
            data[i][5] = temp;
            temp = String.format("%.2f", weapon.getDamagePerSecond());
            data[i][6] = temp;
            temp = String.format("%.2f", weapon.getHeatPerSecond());
            data[i][7] = temp;
        }

        colnames = new String[8];
        colnames[0] = "Min Range";
        colnames[1] = "Range";
        colnames[2] = "Max Range";
        colnames[3] = "Velocity";
        colnames[4] = "'Knock'";
        colnames[5] = "Spread";
        colnames[6] = "DPS";
        colnames[7] = "HPS";
        ballisticTable2 = new JTable(data, colnames);
        jScrollPane11 = new JScrollPane();
        data = new Object[Equipment[BALLISTIC].size()][8];
        for (int i = 0; i < Equipment[BALLISTIC].size(); i++) {
            Weapon weapon = (Weapon) Equipment[BALLISTIC].elementAt(i);
            data[i][0] = weapon.toString();
            temp = String.format("%.2f", weapon.getTonnage());
            data[i][1] = temp;
            data[i][2] = weapon.getCriticals();
            temp = String.format("%.2f", weapon.getDamage());
            data[i][3] = temp;
            temp = String.format("%.2f", weapon.getHeat());
            data[i][4] = temp;
            temp = String.format("%.2f", weapon.getRecycle());
            data[i][5] = temp;
            data[i][6] = weapon.getProjectileCount();
            temp = String.format("%,d C-Bills", weapon.getCost());
            data[i][7] = temp;
        }

        colnames = new String[8];
        colnames[0] = "Weapon Name";
        colnames[1] = "Tonnage";
        colnames[2] = "Criticals";
        colnames[3] = "Damage";
        colnames[4] = "Heat";
        colnames[5] = "Recycle";
        colnames[6] = "Projectile Count";
        colnames[7] = "Cost";
        ballisticTable1 = new JTable(data, colnames);
        jPanel3 = new JPanel();
        jScrollPane12 = new JScrollPane();
        data = new Object[Equipment[ENERGY].size()][8];
        for (int i = 0; i < Equipment[ENERGY].size(); i++) {
            Weapon weapon = (Weapon) Equipment[ENERGY].elementAt(i);
            data[i][0] = weapon.getMinimumRange() + "m";
            data[i][1] = weapon.getRange() + "m";
            data[i][2] = weapon.getMaximumRange() + "m";
            data[i][3] = weapon.getVelocity();
            temp = String.format("%.2f", weapon.getKnock());
            data[i][4] = temp;
            temp = String.format("%.2f", weapon.getHeatToTarget());
            data[i][5] = temp;
            temp = String.format("%.2f", weapon.getDamagePerSecond());
            data[i][6] = temp;
            temp = String.format("%.2f", weapon.getHeatPerSecond());
            data[i][7] = temp;
        }

        colnames = new String[8];
        colnames[0] = "Min Range";
        colnames[1] = "Range";
        colnames[2] = "Max Range";
        colnames[3] = "Velocity";
        colnames[4] = "'Knock'";
        colnames[5] = "HTT";
        colnames[6] = "DPS";
        colnames[7] = "HPS";
        energyTable2 = new JTable(data, colnames);
        jScrollPane13 = new JScrollPane();
        data = new Object[Equipment[ENERGY].size()][8];
        for (int i = 0; i < Equipment[ENERGY].size(); i++) {
            Weapon weapon = (Weapon) Equipment[ENERGY].elementAt(i);
            data[i][0] = weapon.toString();
            temp = String.format("%.2f", weapon.getTonnage());
            data[i][1] = temp;
            data[i][2] = weapon.getCriticals();
            temp = String.format("%.2f", weapon.getDamage());
            data[i][3] = temp;
            temp = String.format("%.2f", weapon.getHeat());
            data[i][4] = temp;
            temp = String.format("%.2f", weapon.getRecycle());
            data[i][5] = temp;
            temp = String.format("%.2f sec", weapon.getDuration());
            data[i][6] = temp;
            temp = String.format("%,d C-Bills", weapon.getCost());
            data[i][7] = temp;
        }

        colnames = new String[8];
        colnames[0] = "Weapon Name";
        colnames[1] = "Tonnage";
        colnames[2] = "Criticals";
        colnames[3] = "Damage";
        colnames[4] = "Heat";
        colnames[5] = "Recycle";
        colnames[6] = "Duration";
        colnames[7] = "Cost";
        energyTable1 = new JTable(data, colnames);
        jPanel4 = new JPanel();
        jScrollPane14 = new JScrollPane();
        data = new Object[Equipment[MISSILE].size()][8];
        for (int i = 0; i < Equipment[MISSILE].size(); i++) {
            Weapon weapon = (Weapon) Equipment[MISSILE].elementAt(i);
            data[i][0] = weapon.toString();
            temp = String.format("%.2f", weapon.getTonnage());
            data[i][1] = temp;
            data[i][2] = weapon.getCriticals();
            temp = String.format("%.2f", weapon.getDamage());
            data[i][3] = temp;
            temp = String.format("%.2f", weapon.getHeat());
            data[i][4] = temp;
            temp = String.format("%.2f", weapon.getRecycle());
            data[i][5] = temp;
            data[i][6] = weapon.getProjectileCount();
            temp = String.format("%,d C-Bills", weapon.getCost());
            data[i][7] = temp;
        }

        colnames = new String[8];
        colnames[0] = "Weapon Name";
        colnames[1] = "Tonnage";
        colnames[2] = "Criticals";
        colnames[3] = "Damage";
        colnames[4] = "Heat";
        colnames[5] = "Recycle";
        colnames[6] = "Projectile Count";
        colnames[7] = "Cost";
        missileTable1 = new JTable(data, colnames);
        jScrollPane15 = new JScrollPane();
        data = new Object[Equipment[MISSILE].size()][8];
        for (int i = 0; i < Equipment[MISSILE].size(); i++) {
            Weapon weapon = (Weapon) Equipment[MISSILE].elementAt(i);
            data[i][0] = weapon.getMinimumRange() + "m";
            data[i][1] = weapon.getRange() + "m";
            data[i][2] = weapon.getMaximumRange() + "m";
            data[i][3] = weapon.getVelocity();
            temp = String.format("%.2f", weapon.getKnock());
            data[i][4] = temp;
            temp = String.format("%.2f sec", weapon.getDelay());
            data[i][5] = temp;
            temp = String.format("%.2f", weapon.getDamagePerSecond());
            data[i][6] = temp;
            temp = String.format("%.2f", weapon.getHeatPerSecond());
            data[i][7] = temp;
        }

        colnames = new String[8];
        colnames[0] = "Min Range";
        colnames[1] = "Range";
        colnames[2] = "Max Range";
        colnames[3] = "Velocity";
        colnames[4] = "'Knock'";
        colnames[5] = "Delay";
        colnames[6] = "DPS";
        colnames[7] = "HPS";
        missileTable2 = new JTable(data, colnames);
        jPanel5 = new JPanel();
        jScrollPane16 = new JScrollPane();
        armorTable = new JTable();
        jScrollPane17 = new JScrollPane();
        internalTable = new JTable();
        jScrollPane18 = new JScrollPane();
        engineTable = new JTable();
        jScrollPane19 = new JScrollPane();
        heatSinkTable = new JTable();
        jScrollPane20 = new JScrollPane();
        jumpJetTable = new JTable();
        jScrollPane21 = new JScrollPane();
        data = new Object[Equipment[OTHER].size()][5];
        for (int i = 0; i < Equipment[OTHER].size(); i++) {
            Special_Equipment other = (Special_Equipment) Equipment[OTHER].elementAt(i);
            data[i][0] = other.toString();
            temp = String.format("%.2f", other.getTonnage());
            data[i][1] = temp;
            data[i][2] = other.getCriticals();
            data[i][3] = other.getRange() + "m";
            temp = String.format("%,d C-Bills", other.getCost());
            data[i][4] = temp;
        }

        colnames = new String[5];
        colnames[0] = "Equipment Type";
        colnames[1] = "Tonnage";
        colnames[2] = "Criticals";
        colnames[3] = "Range";
        colnames[4] = "Cost";
        ammoTable3 = new JTable(data, colnames);
        MechListScrollPane = new JScrollPane();
        MechList = new JTree();
        mechbayMenuBar = new JMenuBar();
        fileMenu = new JMenu();
        loadMechMenuItem = new JMenuItem();
        saveMechMenuItem = new JMenuItem();
        exportMechMenuItem = new JMenuItem();
        MechsMenu = new JMenu();
        UnreleasedCheckBoxMenuItem = new JCheckBoxMenuItem();
        UnconfirmedCheckBoxMenuItem = new JCheckBoxMenuItem();
        helpMenu = new JMenu();
        aboutMenuItem = new JMenuItem();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MWO Mechlab");
        setLocationByPlatform(true);
        setMaximumSize(new Dimension(840, 750));
        setMinimumSize(new Dimension(840, 750));
        setName("MechbayFrame"); // NOI18N
        setPreferredSize(new Dimension(840, 750));
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new GridBagLayout());

        MainTabbedPane.setFont(new Font("Moire", 0, 10)); // NOI18N
        MainTabbedPane.setMaximumSize(new Dimension(800, 600));
        MainTabbedPane.setMinimumSize(new Dimension(800, 600));
        MainTabbedPane.setPreferredSize(new Dimension(800, 600));

        StatLabPanel.setMaximumSize(new Dimension(795, 572));
        StatLabPanel.setMinimumSize(new Dimension(795, 572));
        StatLabPanel.setLayout(new GridBagLayout());

        KeyPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Key", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 11))); // NOI18N
        KeyPanel.setMaximumSize(new Dimension(320, 120));
        KeyPanel.setMinimumSize(new Dimension(320, 120));
        KeyPanel.setPreferredSize(new Dimension(320, 120));
        KeyPanel.setLayout(new GridBagLayout());

        KeyArmorLabel.setFont(new Font("Moire", 0, 11)); // NOI18N
        KeyArmorLabel.setForeground(new Color(200, 150, 75));
        KeyArmorLabel.setToolTipText("Max Armor HP");
        KeyArmorLabel.setValue(100);
        KeyArmorLabel.setMaximumSize(new Dimension(300, 15));
        KeyArmorLabel.setMinimumSize(new Dimension(300, 15));
        KeyArmorLabel.setPreferredSize(new Dimension(300, 15));
        KeyArmorLabel.setString("Max Armor HP");
        KeyArmorLabel.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        KeyPanel.add(KeyArmorLabel, gridBagConstraints);

        KeyInternalLabel.setFont(new Font("Moire", 0, 11)); // NOI18N
        KeyInternalLabel.setForeground(new Color(200, 150, 75));
        KeyInternalLabel.setToolTipText("Internal Structure HP");
        KeyInternalLabel.setValue(100);
        KeyInternalLabel.setMaximumSize(new Dimension(300, 15));
        KeyInternalLabel.setMinimumSize(new Dimension(300, 15));
        KeyInternalLabel.setPreferredSize(new Dimension(300, 15));
        KeyInternalLabel.setString("Internal Structure HP");
        KeyInternalLabel.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        KeyPanel.add(KeyInternalLabel, gridBagConstraints);

        KeyBallisticLabel.setBackground(new Color(192, 192, 64));
        KeyBallisticLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        KeyBallisticLabel.setHorizontalAlignment(SwingConstants.CENTER);
        KeyBallisticLabel.setText("Ballistic");
        KeyBallisticLabel.setToolTipText("");
        KeyBallisticLabel.setAlignmentY(0.0F);
        KeyBallisticLabel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED), "Hardpoints", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, new Font("Moire", 0, 11))); // NOI18N
        KeyBallisticLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        KeyBallisticLabel.setMaximumSize(new Dimension(93, 45));
        KeyBallisticLabel.setMinimumSize(new Dimension(93, 45));
        KeyBallisticLabel.setPreferredSize(new Dimension(93, 45));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        KeyPanel.add(KeyBallisticLabel, gridBagConstraints);

        KeyEnergyLabel.setBackground(new Color(192, 64, 64));
        KeyEnergyLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        KeyEnergyLabel.setHorizontalAlignment(SwingConstants.CENTER);
        KeyEnergyLabel.setText("Energy");
        KeyEnergyLabel.setToolTipText("");
        KeyEnergyLabel.setAlignmentY(0.0F);
        KeyEnergyLabel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED), "Hardpoints", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, new Font("Moire", 0, 11))); // NOI18N
        KeyEnergyLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        KeyEnergyLabel.setMaximumSize(new Dimension(93, 45));
        KeyEnergyLabel.setMinimumSize(new Dimension(93, 45));
        KeyEnergyLabel.setPreferredSize(new Dimension(93, 45));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        KeyPanel.add(KeyEnergyLabel, gridBagConstraints);

        KeyMissileLabel.setBackground(new Color(64, 192, 64));
        KeyMissileLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        KeyMissileLabel.setHorizontalAlignment(SwingConstants.CENTER);
        KeyMissileLabel.setText("Missile");
        KeyMissileLabel.setToolTipText("");
        KeyMissileLabel.setAlignmentY(0.0F);
        KeyMissileLabel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED), "Hardpoints", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, new Font("Moire", 0, 11))); // NOI18N
        KeyMissileLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        KeyMissileLabel.setMaximumSize(new Dimension(93, 45));
        KeyMissileLabel.setMinimumSize(new Dimension(93, 45));
        KeyMissileLabel.setPreferredSize(new Dimension(93, 45));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        KeyPanel.add(KeyMissileLabel, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        StatLabPanel.add(KeyPanel, gridBagConstraints);

        ChassisInfoPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED), "Chassis Information", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, new Font("Moire", 0, 11))); // NOI18N
        ChassisInfoPanel.setMaximumSize(new Dimension(640, 135));
        ChassisInfoPanel.setMinimumSize(new Dimension(640, 135));
        ChassisInfoPanel.setPreferredSize(new Dimension(640, 135));
        ChassisInfoPanel.setLayout(new GridBagLayout());

        ChassisLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        ChassisLabel.setHorizontalAlignment(SwingConstants.CENTER);
        ChassisLabel.setText("Unknown");
        ChassisLabel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED), "Chassis Name", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, new Font("Moire", 0, 11))); // NOI18N
        ChassisLabel.setMaximumSize(new Dimension(125, 50));
        ChassisLabel.setMinimumSize(new Dimension(125, 50));
        ChassisLabel.setPreferredSize(new Dimension(125, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        ChassisInfoPanel.add(ChassisLabel, gridBagConstraints);

        VariantLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        VariantLabel.setHorizontalAlignment(SwingConstants.CENTER);
        VariantLabel.setText("Unknown");
        VariantLabel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED), "Model Name", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, new Font("Moire", 0, 11))); // NOI18N
        VariantLabel.setMaximumSize(new Dimension(125, 50));
        VariantLabel.setMinimumSize(new Dimension(125, 50));
        VariantLabel.setPreferredSize(new Dimension(125, 50));
        ChassisInfoPanel.add(VariantLabel, new GridBagConstraints());

        TonnageLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        TonnageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        TonnageLabel.setText("0.00 Tons");
        TonnageLabel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED), "Tonnage", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, new Font("Moire", 0, 11))); // NOI18N
        TonnageLabel.setMaximumSize(new Dimension(125, 50));
        TonnageLabel.setMinimumSize(new Dimension(125, 50));
        TonnageLabel.setPreferredSize(new Dimension(125, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        ChassisInfoPanel.add(TonnageLabel, gridBagConstraints);

        ClassLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        ClassLabel.setHorizontalAlignment(SwingConstants.CENTER);
        ClassLabel.setText("Unknown");
        ClassLabel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED), "Weight Class", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, new Font("Moire", 0, 11))); // NOI18N
        ClassLabel.setMaximumSize(new Dimension(125, 50));
        ClassLabel.setMinimumSize(new Dimension(125, 50));
        ClassLabel.setPreferredSize(new Dimension(125, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        ChassisInfoPanel.add(ClassLabel, gridBagConstraints);

        ModuleLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        ModuleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        ModuleLabel.setText("0");
        ModuleLabel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED), "Module Slots", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, new Font("Moire", 0, 11))); // NOI18N
        ModuleLabel.setMaximumSize(new Dimension(125, 50));
        ModuleLabel.setMinimumSize(new Dimension(125, 50));
        ModuleLabel.setPreferredSize(new Dimension(125, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        ChassisInfoPanel.add(ModuleLabel, gridBagConstraints);

        CostLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        CostLabel.setHorizontalAlignment(SwingConstants.CENTER);
        CostLabel.setText("0 C-Bills");
        CostLabel.setAlignmentY(0.0F);
        CostLabel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED), "Cost", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, new Font("Moire", 0, 11))); // NOI18N
        CostLabel.setMaximumSize(new Dimension(125, 50));
        CostLabel.setMinimumSize(new Dimension(125, 50));
        CostLabel.setPreferredSize(new Dimension(125, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        ChassisInfoPanel.add(CostLabel, gridBagConstraints);

        JJLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        JJLabel.setHorizontalAlignment(SwingConstants.CENTER);
        JJLabel.setText("Unknown");
        JJLabel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED), "Jump Capable", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, new Font("Moire", 0, 11))); // NOI18N
        JJLabel.setMaximumSize(new Dimension(125, 50));
        JJLabel.setMinimumSize(new Dimension(125, 50));
        JJLabel.setPreferredSize(new Dimension(125, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        ChassisInfoPanel.add(JJLabel, gridBagConstraints);

        mechTreeButton.setFont(new Font("Moire", 0, 11)); // NOI18N
        mechTreeButton.setText("Mech Trees");
        mechTreeButton.setMaximumSize(new Dimension(100, 40));
        mechTreeButton.setMinimumSize(new Dimension(100, 40));
        mechTreeButton.setPreferredSize(new Dimension(100, 40));
        mechTreeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                mechTreeButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        ChassisInfoPanel.add(mechTreeButton, gridBagConstraints);

        moduleButton.setFont(new Font("Moire", 0, 11)); // NOI18N
        moduleButton.setText("Pilot Trees");
        moduleButton.setMaximumSize(new Dimension(100, 40));
        moduleButton.setMinimumSize(new Dimension(100, 40));
        moduleButton.setPreferredSize(new Dimension(100, 40));
        moduleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                moduleButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        ChassisInfoPanel.add(moduleButton, gridBagConstraints);

        CostLabel1.setFont(new Font("Moire", 0, 12)); // NOI18N
        CostLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        CostLabel1.setText("0 MC");
        CostLabel1.setAlignmentY(0.0F);
        CostLabel1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED), "Cost", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, new Font("Moire", 0, 11))); // NOI18N
        CostLabel1.setMaximumSize(new Dimension(125, 50));
        CostLabel1.setMinimumSize(new Dimension(125, 50));
        CostLabel1.setPreferredSize(new Dimension(125, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        ChassisInfoPanel.add(CostLabel1, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        StatLabPanel.add(ChassisInfoPanel, gridBagConstraints);

        TotalPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Totals", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 11))); // NOI18N
        TotalPanel.setMaximumSize(new Dimension(320, 120));
        TotalPanel.setMinimumSize(new Dimension(320, 120));
        TotalPanel.setPreferredSize(new Dimension(320, 120));
        TotalPanel.setLayout(new GridBagLayout());

        TotalArmorLabel.setFont(new Font("Moire", 0, 11)); // NOI18N
        TotalArmorLabel.setForeground(new Color(200, 150, 75));
        TotalArmorLabel.setToolTipText("Total Max Armor HP");
        TotalArmorLabel.setValue(100);
        TotalArmorLabel.setMaximumSize(new Dimension(300, 15));
        TotalArmorLabel.setMinimumSize(new Dimension(300, 15));
        TotalArmorLabel.setPreferredSize(new Dimension(300, 15));
        TotalArmorLabel.setString("");
        TotalArmorLabel.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        TotalPanel.add(TotalArmorLabel, gridBagConstraints);

        TotalInternalLabel.setFont(new Font("Moire", 0, 11)); // NOI18N
        TotalInternalLabel.setForeground(new Color(200, 150, 75));
        TotalInternalLabel.setToolTipText("Total Internal Structure HP");
        TotalInternalLabel.setValue(100);
        TotalInternalLabel.setMaximumSize(new Dimension(300, 15));
        TotalInternalLabel.setMinimumSize(new Dimension(300, 15));
        TotalInternalLabel.setPreferredSize(new Dimension(300, 15));
        TotalInternalLabel.setString("");
        TotalInternalLabel.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        TotalPanel.add(TotalInternalLabel, gridBagConstraints);

        TotalBallisticLabel.setBackground(new Color(192, 192, 64));
        TotalBallisticLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        TotalBallisticLabel.setHorizontalAlignment(SwingConstants.CENTER);
        TotalBallisticLabel.setText("Ballistic");
        TotalBallisticLabel.setToolTipText("");
        TotalBallisticLabel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED), "Hardpoints", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, new Font("Moire", 0, 11), new Color(230, 230, 230))); // NOI18N
        TotalBallisticLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        TotalBallisticLabel.setMaximumSize(new Dimension(93, 45));
        TotalBallisticLabel.setMinimumSize(new Dimension(93, 45));
        TotalBallisticLabel.setPreferredSize(new Dimension(93, 45));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        TotalPanel.add(TotalBallisticLabel, gridBagConstraints);

        TotalEnergyLabel.setBackground(new Color(192, 64, 64));
        TotalEnergyLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        TotalEnergyLabel.setHorizontalAlignment(SwingConstants.CENTER);
        TotalEnergyLabel.setText("Energy");
        TotalEnergyLabel.setToolTipText("");
        TotalEnergyLabel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED), "Hardpoints", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, new Font("Moire", 0, 11), new Color(230, 230, 230))); // NOI18N
        TotalEnergyLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        TotalEnergyLabel.setMaximumSize(new Dimension(93, 45));
        TotalEnergyLabel.setMinimumSize(new Dimension(93, 45));
        TotalEnergyLabel.setPreferredSize(new Dimension(93, 45));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        TotalPanel.add(TotalEnergyLabel, gridBagConstraints);

        TotalMissileLabel.setBackground(new Color(64, 192, 64));
        TotalMissileLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        TotalMissileLabel.setHorizontalAlignment(SwingConstants.CENTER);
        TotalMissileLabel.setText("Missile");
        TotalMissileLabel.setToolTipText("");
        TotalMissileLabel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED), "Hardpoints", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, new Font("Moire", 0, 11), new Color(230, 230, 230))); // NOI18N
        TotalMissileLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        TotalMissileLabel.setMaximumSize(new Dimension(93, 45));
        TotalMissileLabel.setMinimumSize(new Dimension(93, 45));
        TotalMissileLabel.setPreferredSize(new Dimension(93, 45));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        TotalPanel.add(TotalMissileLabel, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        StatLabPanel.add(TotalPanel, gridBagConstraints);

        HardpointArmorPanel.setFont(HardpointArmorPanel.getFont());
        HardpointArmorPanel.setMaximumSize(new Dimension(640, 480));
        HardpointArmorPanel.setMinimumSize(new Dimension(640, 480));
        HardpointArmorPanel.setPreferredSize(new Dimension(640, 360));
        HardpointArmorPanel.setLayout(new GridBagLayout());

        HeadPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Head", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 11))); // NOI18N
        HeadPanel.setMaximumSize(new Dimension(120, 120));
        HeadPanel.setMinimumSize(new Dimension(120, 120));
        HeadPanel.setPreferredSize(new Dimension(120, 120));
        HeadPanel.setLayout(new GridBagLayout());

        HeadInternalLabel.setFont(new Font("Moire", 0, 11)); // NOI18N
        HeadInternalLabel.setForeground(new Color(200, 150, 75));
        HeadInternalLabel.setToolTipText("Max Armor HP");
        HeadInternalLabel.setValue(100);
        HeadInternalLabel.setMaximumSize(new Dimension(100, 15));
        HeadInternalLabel.setMinimumSize(new Dimension(100, 15));
        HeadInternalLabel.setPreferredSize(new Dimension(100, 15));
        HeadInternalLabel.setString("");
        HeadInternalLabel.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        HeadPanel.add(HeadInternalLabel, gridBagConstraints);

        HeadArmorLabel.setFont(new Font("Moire", 0, 11)); // NOI18N
        HeadArmorLabel.setForeground(new Color(200, 150, 75));
        HeadArmorLabel.setToolTipText("Internal Structure HP");
        HeadArmorLabel.setValue(100);
        HeadArmorLabel.setMaximumSize(new Dimension(100, 15));
        HeadArmorLabel.setMinimumSize(new Dimension(100, 15));
        HeadArmorLabel.setPreferredSize(new Dimension(100, 15));
        HeadArmorLabel.setString("");
        HeadArmorLabel.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        HeadPanel.add(HeadArmorLabel, gridBagConstraints);

        HeadBallisticLabel.setBackground(new Color(192, 192, 64));
        HeadBallisticLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        HeadBallisticLabel.setHorizontalAlignment(SwingConstants.CENTER);
        HeadBallisticLabel.setText("0");
        HeadBallisticLabel.setToolTipText("Ballistic Hardpoints");
        HeadBallisticLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, new Color(204, 204, 204), new Color(255, 255, 255), new Color(102, 102, 102), new Color(51, 51, 51)));
        HeadBallisticLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        HeadBallisticLabel.setPreferredSize(new Dimension(25, 38));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        HeadPanel.add(HeadBallisticLabel, gridBagConstraints);

        HeadEnergyLabel.setBackground(new Color(192, 64, 64));
        HeadEnergyLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        HeadEnergyLabel.setHorizontalAlignment(SwingConstants.CENTER);
        HeadEnergyLabel.setText("0");
        HeadEnergyLabel.setToolTipText("Energy Hardpoints");
        HeadEnergyLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, new Color(204, 204, 204), new Color(255, 255, 255), new Color(102, 102, 102), new Color(51, 51, 51)));
        HeadEnergyLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        HeadEnergyLabel.setPreferredSize(new Dimension(25, 38));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        HeadPanel.add(HeadEnergyLabel, gridBagConstraints);

        HeadMissileLabel.setBackground(new Color(64, 192, 64));
        HeadMissileLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        HeadMissileLabel.setHorizontalAlignment(SwingConstants.CENTER);
        HeadMissileLabel.setText("0");
        HeadMissileLabel.setToolTipText("Missile Hardpoints");
        HeadMissileLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, new Color(204, 204, 204), new Color(255, 255, 255), new Color(102, 102, 102), new Color(51, 51, 51)));
        HeadMissileLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        HeadMissileLabel.setPreferredSize(new Dimension(25, 38));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        HeadPanel.add(HeadMissileLabel, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        HardpointArmorPanel.add(HeadPanel, gridBagConstraints);

        RightArmPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Right Arm", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 11))); // NOI18N
        RightArmPanel.setMaximumSize(new Dimension(120, 120));
        RightArmPanel.setMinimumSize(new Dimension(120, 120));
        RightArmPanel.setPreferredSize(new Dimension(120, 120));
        RightArmPanel.setLayout(new GridBagLayout());

        RightArmInternalLabel.setFont(new Font("Moire", 0, 11)); // NOI18N
        RightArmInternalLabel.setForeground(new Color(200, 150, 75));
        RightArmInternalLabel.setToolTipText("Max Armor HP");
        RightArmInternalLabel.setValue(100);
        RightArmInternalLabel.setMaximumSize(new Dimension(100, 15));
        RightArmInternalLabel.setMinimumSize(new Dimension(100, 15));
        RightArmInternalLabel.setPreferredSize(new Dimension(100, 15));
        RightArmInternalLabel.setString("");
        RightArmInternalLabel.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        RightArmPanel.add(RightArmInternalLabel, gridBagConstraints);

        RightArmArmorLabel.setFont(new Font("Moire", 0, 11)); // NOI18N
        RightArmArmorLabel.setForeground(new Color(200, 150, 75));
        RightArmArmorLabel.setToolTipText("Internal Structure HP");
        RightArmArmorLabel.setValue(100);
        RightArmArmorLabel.setMaximumSize(new Dimension(100, 15));
        RightArmArmorLabel.setMinimumSize(new Dimension(100, 15));
        RightArmArmorLabel.setPreferredSize(new Dimension(100, 15));
        RightArmArmorLabel.setString("");
        RightArmArmorLabel.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        RightArmPanel.add(RightArmArmorLabel, gridBagConstraints);

        RightArmBallisticLabel.setBackground(new Color(192, 192, 64));
        RightArmBallisticLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        RightArmBallisticLabel.setHorizontalAlignment(SwingConstants.CENTER);
        RightArmBallisticLabel.setText("0");
        RightArmBallisticLabel.setToolTipText("Ballistic Hardpoints");
        RightArmBallisticLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, new Color(204, 204, 204), new Color(255, 255, 255), new Color(102, 102, 102), new Color(51, 51, 51)));
        RightArmBallisticLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        RightArmBallisticLabel.setPreferredSize(new Dimension(25, 38));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        RightArmPanel.add(RightArmBallisticLabel, gridBagConstraints);

        RightArmEnergyLabel.setBackground(new Color(192, 64, 64));
        RightArmEnergyLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        RightArmEnergyLabel.setHorizontalAlignment(SwingConstants.CENTER);
        RightArmEnergyLabel.setText("0");
        RightArmEnergyLabel.setToolTipText("Energy Hardpoints");
        RightArmEnergyLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, new Color(204, 204, 204), new Color(255, 255, 255), new Color(102, 102, 102), new Color(51, 51, 51)));
        RightArmEnergyLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        RightArmEnergyLabel.setPreferredSize(new Dimension(25, 38));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        RightArmPanel.add(RightArmEnergyLabel, gridBagConstraints);

        RightArmMissileLabel.setBackground(new Color(64, 192, 64));
        RightArmMissileLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        RightArmMissileLabel.setHorizontalAlignment(SwingConstants.CENTER);
        RightArmMissileLabel.setText("0");
        RightArmMissileLabel.setToolTipText("Missile Hardpoints");
        RightArmMissileLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, new Color(204, 204, 204), new Color(255, 255, 255), new Color(102, 102, 102), new Color(51, 51, 51)));
        RightArmMissileLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        RightArmMissileLabel.setPreferredSize(new Dimension(25, 38));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        RightArmPanel.add(RightArmMissileLabel, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        HardpointArmorPanel.add(RightArmPanel, gridBagConstraints);

        LeftArmPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Left Arm", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 11))); // NOI18N
        LeftArmPanel.setMaximumSize(new Dimension(120, 120));
        LeftArmPanel.setMinimumSize(new Dimension(120, 120));
        LeftArmPanel.setPreferredSize(new Dimension(120, 120));
        LeftArmPanel.setLayout(new GridBagLayout());

        LeftArmInternalLabel.setFont(new Font("Moire", 0, 11)); // NOI18N
        LeftArmInternalLabel.setForeground(new Color(200, 150, 75));
        LeftArmInternalLabel.setToolTipText("Max Armor HP");
        LeftArmInternalLabel.setValue(100);
        LeftArmInternalLabel.setMaximumSize(new Dimension(100, 15));
        LeftArmInternalLabel.setMinimumSize(new Dimension(100, 15));
        LeftArmInternalLabel.setPreferredSize(new Dimension(100, 15));
        LeftArmInternalLabel.setString("");
        LeftArmInternalLabel.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        LeftArmPanel.add(LeftArmInternalLabel, gridBagConstraints);

        LeftArmArmorLabel.setFont(new Font("Moire", 0, 11)); // NOI18N
        LeftArmArmorLabel.setForeground(new Color(200, 150, 75));
        LeftArmArmorLabel.setToolTipText("Internal Structure HP");
        LeftArmArmorLabel.setValue(100);
        LeftArmArmorLabel.setMaximumSize(new Dimension(100, 15));
        LeftArmArmorLabel.setMinimumSize(new Dimension(100, 15));
        LeftArmArmorLabel.setPreferredSize(new Dimension(100, 15));
        LeftArmArmorLabel.setString("");
        LeftArmArmorLabel.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        LeftArmPanel.add(LeftArmArmorLabel, gridBagConstraints);

        LeftArmBallisticLabel.setBackground(new Color(192, 192, 64));
        LeftArmBallisticLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        LeftArmBallisticLabel.setHorizontalAlignment(SwingConstants.CENTER);
        LeftArmBallisticLabel.setText("0");
        LeftArmBallisticLabel.setToolTipText("Ballistic Hardpoints");
        LeftArmBallisticLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, new Color(204, 204, 204), new Color(255, 255, 255), new Color(102, 102, 102), new Color(51, 51, 51)));
        LeftArmBallisticLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        LeftArmBallisticLabel.setPreferredSize(new Dimension(25, 38));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        LeftArmPanel.add(LeftArmBallisticLabel, gridBagConstraints);

        LeftArmEnergyLabel.setBackground(new Color(192, 64, 64));
        LeftArmEnergyLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        LeftArmEnergyLabel.setHorizontalAlignment(SwingConstants.CENTER);
        LeftArmEnergyLabel.setText("0");
        LeftArmEnergyLabel.setToolTipText("Energy Hardpoints");
        LeftArmEnergyLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, new Color(204, 204, 204), new Color(255, 255, 255), new Color(102, 102, 102), new Color(51, 51, 51)));
        LeftArmEnergyLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        LeftArmEnergyLabel.setPreferredSize(new Dimension(25, 38));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        LeftArmPanel.add(LeftArmEnergyLabel, gridBagConstraints);

        LeftArmMissileLabel.setBackground(new Color(64, 192, 64));
        LeftArmMissileLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        LeftArmMissileLabel.setHorizontalAlignment(SwingConstants.CENTER);
        LeftArmMissileLabel.setText("0");
        LeftArmMissileLabel.setToolTipText("Missile Hardpoints");
        LeftArmMissileLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, new Color(204, 204, 204), new Color(255, 255, 255), new Color(102, 102, 102), new Color(51, 51, 51)));
        LeftArmMissileLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        LeftArmMissileLabel.setPreferredSize(new Dimension(25, 38));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        LeftArmPanel.add(LeftArmMissileLabel, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        HardpointArmorPanel.add(LeftArmPanel, gridBagConstraints);

        RightTorsoPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Right Torso", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 11))); // NOI18N
        RightTorsoPanel.setMaximumSize(new Dimension(120, 120));
        RightTorsoPanel.setMinimumSize(new Dimension(120, 120));
        RightTorsoPanel.setPreferredSize(new Dimension(120, 120));
        RightTorsoPanel.setLayout(new GridBagLayout());

        RightTorsoInternalLabel.setFont(new Font("Moire", 0, 11)); // NOI18N
        RightTorsoInternalLabel.setForeground(new Color(200, 150, 75));
        RightTorsoInternalLabel.setToolTipText("Max Armor HP");
        RightTorsoInternalLabel.setValue(100);
        RightTorsoInternalLabel.setMaximumSize(new Dimension(100, 15));
        RightTorsoInternalLabel.setMinimumSize(new Dimension(100, 15));
        RightTorsoInternalLabel.setPreferredSize(new Dimension(100, 15));
        RightTorsoInternalLabel.setString("");
        RightTorsoInternalLabel.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        RightTorsoPanel.add(RightTorsoInternalLabel, gridBagConstraints);

        RightTorsoArmorLabel.setFont(new Font("Moire", 0, 11)); // NOI18N
        RightTorsoArmorLabel.setForeground(new Color(200, 150, 75));
        RightTorsoArmorLabel.setToolTipText("Internal Structure HP");
        RightTorsoArmorLabel.setValue(100);
        RightTorsoArmorLabel.setMaximumSize(new Dimension(100, 15));
        RightTorsoArmorLabel.setMinimumSize(new Dimension(100, 15));
        RightTorsoArmorLabel.setPreferredSize(new Dimension(100, 15));
        RightTorsoArmorLabel.setString("");
        RightTorsoArmorLabel.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        RightTorsoPanel.add(RightTorsoArmorLabel, gridBagConstraints);

        RightTorsoBallisticLabel.setBackground(new Color(192, 192, 64));
        RightTorsoBallisticLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        RightTorsoBallisticLabel.setHorizontalAlignment(SwingConstants.CENTER);
        RightTorsoBallisticLabel.setText("0");
        RightTorsoBallisticLabel.setToolTipText("Ballistic Hardpoints");
        RightTorsoBallisticLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, new Color(204, 204, 204), new Color(255, 255, 255), new Color(102, 102, 102), new Color(51, 51, 51)));
        RightTorsoBallisticLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        RightTorsoBallisticLabel.setPreferredSize(new Dimension(25, 38));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        RightTorsoPanel.add(RightTorsoBallisticLabel, gridBagConstraints);

        RightTorsoEnergyLabel.setBackground(new Color(192, 64, 64));
        RightTorsoEnergyLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        RightTorsoEnergyLabel.setHorizontalAlignment(SwingConstants.CENTER);
        RightTorsoEnergyLabel.setText("0");
        RightTorsoEnergyLabel.setToolTipText("Energy Hardpoints");
        RightTorsoEnergyLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, new Color(204, 204, 204), new Color(255, 255, 255), new Color(102, 102, 102), new Color(51, 51, 51)));
        RightTorsoEnergyLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        RightTorsoEnergyLabel.setPreferredSize(new Dimension(25, 38));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        RightTorsoPanel.add(RightTorsoEnergyLabel, gridBagConstraints);

        RightTorsoMissileLabel.setBackground(new Color(64, 192, 64));
        RightTorsoMissileLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        RightTorsoMissileLabel.setHorizontalAlignment(SwingConstants.CENTER);
        RightTorsoMissileLabel.setText("0");
        RightTorsoMissileLabel.setToolTipText("Missile Hardpoints");
        RightTorsoMissileLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, new Color(204, 204, 204), new Color(255, 255, 255), new Color(102, 102, 102), new Color(51, 51, 51)));
        RightTorsoMissileLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        RightTorsoMissileLabel.setPreferredSize(new Dimension(25, 38));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        RightTorsoPanel.add(RightTorsoMissileLabel, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        HardpointArmorPanel.add(RightTorsoPanel, gridBagConstraints);

        CenterTorsoPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Center Torso", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 11))); // NOI18N
        CenterTorsoPanel.setMaximumSize(new Dimension(120, 120));
        CenterTorsoPanel.setMinimumSize(new Dimension(120, 120));
        CenterTorsoPanel.setPreferredSize(new Dimension(120, 120));
        CenterTorsoPanel.setLayout(new GridBagLayout());

        CenterTorsoInternalLabel.setFont(new Font("Moire", 0, 11)); // NOI18N
        CenterTorsoInternalLabel.setForeground(new Color(200, 150, 75));
        CenterTorsoInternalLabel.setToolTipText("Max Armor HP");
        CenterTorsoInternalLabel.setValue(100);
        CenterTorsoInternalLabel.setMaximumSize(new Dimension(100, 15));
        CenterTorsoInternalLabel.setMinimumSize(new Dimension(100, 15));
        CenterTorsoInternalLabel.setPreferredSize(new Dimension(100, 15));
        CenterTorsoInternalLabel.setString("");
        CenterTorsoInternalLabel.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        CenterTorsoPanel.add(CenterTorsoInternalLabel, gridBagConstraints);

        CenterTorsoArmorLabel.setFont(new Font("Moire", 0, 11)); // NOI18N
        CenterTorsoArmorLabel.setForeground(new Color(200, 150, 75));
        CenterTorsoArmorLabel.setToolTipText("Internal Structure HP");
        CenterTorsoArmorLabel.setValue(100);
        CenterTorsoArmorLabel.setMaximumSize(new Dimension(100, 15));
        CenterTorsoArmorLabel.setMinimumSize(new Dimension(100, 15));
        CenterTorsoArmorLabel.setPreferredSize(new Dimension(100, 15));
        CenterTorsoArmorLabel.setString("");
        CenterTorsoArmorLabel.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        CenterTorsoPanel.add(CenterTorsoArmorLabel, gridBagConstraints);

        CenterTorsoBallisticLabel.setBackground(new Color(192, 192, 64));
        CenterTorsoBallisticLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        CenterTorsoBallisticLabel.setHorizontalAlignment(SwingConstants.CENTER);
        CenterTorsoBallisticLabel.setText("0");
        CenterTorsoBallisticLabel.setToolTipText("Ballistic Hardpoints");
        CenterTorsoBallisticLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, new Color(204, 204, 204), new Color(255, 255, 255), new Color(102, 102, 102), new Color(51, 51, 51)));
        CenterTorsoBallisticLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        CenterTorsoBallisticLabel.setPreferredSize(new Dimension(25, 38));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        CenterTorsoPanel.add(CenterTorsoBallisticLabel, gridBagConstraints);

        CenterTorsoEnergyLabel.setBackground(new Color(192, 64, 64));
        CenterTorsoEnergyLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        CenterTorsoEnergyLabel.setHorizontalAlignment(SwingConstants.CENTER);
        CenterTorsoEnergyLabel.setText("0");
        CenterTorsoEnergyLabel.setToolTipText("Energy Hardpoints");
        CenterTorsoEnergyLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, new Color(204, 204, 204), new Color(255, 255, 255), new Color(102, 102, 102), new Color(51, 51, 51)));
        CenterTorsoEnergyLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        CenterTorsoEnergyLabel.setPreferredSize(new Dimension(25, 38));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        CenterTorsoPanel.add(CenterTorsoEnergyLabel, gridBagConstraints);

        CenterTorsoMissileLabel.setBackground(new Color(64, 192, 64));
        CenterTorsoMissileLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        CenterTorsoMissileLabel.setHorizontalAlignment(SwingConstants.CENTER);
        CenterTorsoMissileLabel.setText("0");
        CenterTorsoMissileLabel.setToolTipText("Missile Hardpoints");
        CenterTorsoMissileLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, new Color(204, 204, 204), new Color(255, 255, 255), new Color(102, 102, 102), new Color(51, 51, 51)));
        CenterTorsoMissileLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        CenterTorsoMissileLabel.setPreferredSize(new Dimension(25, 38));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        CenterTorsoPanel.add(CenterTorsoMissileLabel, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        HardpointArmorPanel.add(CenterTorsoPanel, gridBagConstraints);

        LeftTorsoPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Left Torso", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 11))); // NOI18N
        LeftTorsoPanel.setMaximumSize(new Dimension(120, 120));
        LeftTorsoPanel.setMinimumSize(new Dimension(120, 120));
        LeftTorsoPanel.setPreferredSize(new Dimension(120, 120));
        LeftTorsoPanel.setLayout(new GridBagLayout());

        LeftTorsoInternalLabel.setFont(new Font("Moire", 0, 11)); // NOI18N
        LeftTorsoInternalLabel.setForeground(new Color(200, 150, 75));
        LeftTorsoInternalLabel.setToolTipText("Max Armor HP");
        LeftTorsoInternalLabel.setValue(100);
        LeftTorsoInternalLabel.setMaximumSize(new Dimension(100, 15));
        LeftTorsoInternalLabel.setMinimumSize(new Dimension(100, 15));
        LeftTorsoInternalLabel.setPreferredSize(new Dimension(100, 15));
        LeftTorsoInternalLabel.setString("");
        LeftTorsoInternalLabel.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        LeftTorsoPanel.add(LeftTorsoInternalLabel, gridBagConstraints);

        LeftTorsoArmorLabel.setFont(new Font("Moire", 0, 11)); // NOI18N
        LeftTorsoArmorLabel.setForeground(new Color(200, 150, 75));
        LeftTorsoArmorLabel.setToolTipText("Internal Structure HP");
        LeftTorsoArmorLabel.setValue(100);
        LeftTorsoArmorLabel.setMaximumSize(new Dimension(100, 15));
        LeftTorsoArmorLabel.setMinimumSize(new Dimension(100, 15));
        LeftTorsoArmorLabel.setPreferredSize(new Dimension(100, 15));
        LeftTorsoArmorLabel.setString("");
        LeftTorsoArmorLabel.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        LeftTorsoPanel.add(LeftTorsoArmorLabel, gridBagConstraints);

        LeftTorsoBallisticLabel.setBackground(new Color(192, 192, 64));
        LeftTorsoBallisticLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        LeftTorsoBallisticLabel.setHorizontalAlignment(SwingConstants.CENTER);
        LeftTorsoBallisticLabel.setText("0");
        LeftTorsoBallisticLabel.setToolTipText("Ballistic Hardpoints");
        LeftTorsoBallisticLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, new Color(204, 204, 204), new Color(255, 255, 255), new Color(102, 102, 102), new Color(51, 51, 51)));
        LeftTorsoBallisticLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        LeftTorsoBallisticLabel.setPreferredSize(new Dimension(25, 38));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        LeftTorsoPanel.add(LeftTorsoBallisticLabel, gridBagConstraints);

        LeftTorsoEnergyLabel.setBackground(new Color(192, 64, 64));
        LeftTorsoEnergyLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        LeftTorsoEnergyLabel.setHorizontalAlignment(SwingConstants.CENTER);
        LeftTorsoEnergyLabel.setText("0");
        LeftTorsoEnergyLabel.setToolTipText("Energy Hardpoints");
        LeftTorsoEnergyLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, new Color(204, 204, 204), new Color(255, 255, 255), new Color(102, 102, 102), new Color(51, 51, 51)));
        LeftTorsoEnergyLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        LeftTorsoEnergyLabel.setPreferredSize(new Dimension(25, 38));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        LeftTorsoPanel.add(LeftTorsoEnergyLabel, gridBagConstraints);

        LeftTorsoMissileLabel.setBackground(new Color(64, 192, 64));
        LeftTorsoMissileLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        LeftTorsoMissileLabel.setHorizontalAlignment(SwingConstants.CENTER);
        LeftTorsoMissileLabel.setText("0");
        LeftTorsoMissileLabel.setToolTipText("Missile Hardpoints");
        LeftTorsoMissileLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, new Color(204, 204, 204), new Color(255, 255, 255), new Color(102, 102, 102), new Color(51, 51, 51)));
        LeftTorsoMissileLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        LeftTorsoMissileLabel.setPreferredSize(new Dimension(25, 38));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        LeftTorsoPanel.add(LeftTorsoMissileLabel, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        HardpointArmorPanel.add(LeftTorsoPanel, gridBagConstraints);

        LeftLegPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Left Leg", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 11))); // NOI18N
        LeftLegPanel.setMaximumSize(new Dimension(120, 120));
        LeftLegPanel.setMinimumSize(new Dimension(120, 120));
        LeftLegPanel.setPreferredSize(new Dimension(120, 120));
        LeftLegPanel.setLayout(new GridBagLayout());

        LeftLegInternalLabel.setFont(new Font("Moire", 0, 11)); // NOI18N
        LeftLegInternalLabel.setForeground(new Color(200, 150, 75));
        LeftLegInternalLabel.setToolTipText("Max Armor HP");
        LeftLegInternalLabel.setValue(100);
        LeftLegInternalLabel.setMaximumSize(new Dimension(100, 15));
        LeftLegInternalLabel.setMinimumSize(new Dimension(100, 15));
        LeftLegInternalLabel.setPreferredSize(new Dimension(100, 15));
        LeftLegInternalLabel.setString("");
        LeftLegInternalLabel.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        LeftLegPanel.add(LeftLegInternalLabel, gridBagConstraints);

        LeftLegArmorLabel.setFont(new Font("Moire", 0, 11)); // NOI18N
        LeftLegArmorLabel.setForeground(new Color(200, 150, 75));
        LeftLegArmorLabel.setToolTipText("Internal Structure HP");
        LeftLegArmorLabel.setValue(100);
        LeftLegArmorLabel.setMaximumSize(new Dimension(100, 15));
        LeftLegArmorLabel.setMinimumSize(new Dimension(100, 15));
        LeftLegArmorLabel.setPreferredSize(new Dimension(100, 15));
        LeftLegArmorLabel.setString("");
        LeftLegArmorLabel.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        LeftLegPanel.add(LeftLegArmorLabel, gridBagConstraints);

        LeftLegBallisticLabel.setBackground(new Color(192, 192, 64));
        LeftLegBallisticLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        LeftLegBallisticLabel.setHorizontalAlignment(SwingConstants.CENTER);
        LeftLegBallisticLabel.setText("0");
        LeftLegBallisticLabel.setToolTipText("Ballistic Hardpoints");
        LeftLegBallisticLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, new Color(204, 204, 204), new Color(255, 255, 255), new Color(102, 102, 102), new Color(51, 51, 51)));
        LeftLegBallisticLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        LeftLegBallisticLabel.setPreferredSize(new Dimension(25, 38));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        LeftLegPanel.add(LeftLegBallisticLabel, gridBagConstraints);

        LeftLegEnergyLabel.setBackground(new Color(192, 64, 64));
        LeftLegEnergyLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        LeftLegEnergyLabel.setHorizontalAlignment(SwingConstants.CENTER);
        LeftLegEnergyLabel.setText("0");
        LeftLegEnergyLabel.setToolTipText("Energy Hardpoints");
        LeftLegEnergyLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, new Color(204, 204, 204), new Color(255, 255, 255), new Color(102, 102, 102), new Color(51, 51, 51)));
        LeftLegEnergyLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        LeftLegEnergyLabel.setPreferredSize(new Dimension(25, 38));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        LeftLegPanel.add(LeftLegEnergyLabel, gridBagConstraints);

        LeftLegMissileLabel.setBackground(new Color(64, 192, 64));
        LeftLegMissileLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        LeftLegMissileLabel.setHorizontalAlignment(SwingConstants.CENTER);
        LeftLegMissileLabel.setText("0");
        LeftLegMissileLabel.setToolTipText("Missile Hardpoints");
        LeftLegMissileLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, new Color(204, 204, 204), new Color(255, 255, 255), new Color(102, 102, 102), new Color(51, 51, 51)));
        LeftLegMissileLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        LeftLegMissileLabel.setPreferredSize(new Dimension(25, 38));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        LeftLegPanel.add(LeftLegMissileLabel, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        HardpointArmorPanel.add(LeftLegPanel, gridBagConstraints);

        InternalTypeLabel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Right Leg", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 11))); // NOI18N
        InternalTypeLabel.setMaximumSize(new Dimension(120, 120));
        InternalTypeLabel.setMinimumSize(new Dimension(120, 120));
        InternalTypeLabel.setPreferredSize(new Dimension(120, 120));
        InternalTypeLabel.setLayout(new GridBagLayout());

        RightLegInternalLabel.setFont(new Font("Moire", 0, 11)); // NOI18N
        RightLegInternalLabel.setForeground(new Color(200, 150, 75));
        RightLegInternalLabel.setToolTipText("Max Armor HP");
        RightLegInternalLabel.setValue(100);
        RightLegInternalLabel.setMaximumSize(new Dimension(100, 15));
        RightLegInternalLabel.setMinimumSize(new Dimension(100, 15));
        RightLegInternalLabel.setPreferredSize(new Dimension(100, 15));
        RightLegInternalLabel.setString("");
        RightLegInternalLabel.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        InternalTypeLabel.add(RightLegInternalLabel, gridBagConstraints);

        RightLegArmorLabel.setFont(new Font("Moire", 0, 11)); // NOI18N
        RightLegArmorLabel.setForeground(new Color(200, 150, 75));
        RightLegArmorLabel.setToolTipText("Internal Structure HP");
        RightLegArmorLabel.setValue(100);
        RightLegArmorLabel.setMaximumSize(new Dimension(100, 15));
        RightLegArmorLabel.setMinimumSize(new Dimension(100, 15));
        RightLegArmorLabel.setPreferredSize(new Dimension(100, 15));
        RightLegArmorLabel.setString("");
        RightLegArmorLabel.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        InternalTypeLabel.add(RightLegArmorLabel, gridBagConstraints);

        RightLegBallisticLabel.setBackground(new Color(192, 192, 64));
        RightLegBallisticLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        RightLegBallisticLabel.setHorizontalAlignment(SwingConstants.CENTER);
        RightLegBallisticLabel.setText("0");
        RightLegBallisticLabel.setToolTipText("Ballistic Hardpoints");
        RightLegBallisticLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, new Color(204, 204, 204), new Color(255, 255, 255), new Color(102, 102, 102), new Color(51, 51, 51)));
        RightLegBallisticLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        RightLegBallisticLabel.setPreferredSize(new Dimension(25, 38));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        InternalTypeLabel.add(RightLegBallisticLabel, gridBagConstraints);

        RightLegEnergyLabel.setBackground(new Color(192, 64, 64));
        RightLegEnergyLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        RightLegEnergyLabel.setHorizontalAlignment(SwingConstants.CENTER);
        RightLegEnergyLabel.setText("0");
        RightLegEnergyLabel.setToolTipText("Energy Hardpoints");
        RightLegEnergyLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, new Color(204, 204, 204), new Color(255, 255, 255), new Color(102, 102, 102), new Color(51, 51, 51)));
        RightLegEnergyLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        RightLegEnergyLabel.setPreferredSize(new Dimension(25, 38));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        InternalTypeLabel.add(RightLegEnergyLabel, gridBagConstraints);

        RightLegMissileLabel.setBackground(new Color(64, 192, 64));
        RightLegMissileLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        RightLegMissileLabel.setHorizontalAlignment(SwingConstants.CENTER);
        RightLegMissileLabel.setText("0");
        RightLegMissileLabel.setToolTipText("Missile Hardpoints");
        RightLegMissileLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, new Color(204, 204, 204), new Color(255, 255, 255), new Color(102, 102, 102), new Color(51, 51, 51)));
        RightLegMissileLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        RightLegMissileLabel.setPreferredSize(new Dimension(25, 38));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        InternalTypeLabel.add(RightLegMissileLabel, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        HardpointArmorPanel.add(InternalTypeLabel, gridBagConstraints);

        LeftArmActuatorPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "L Arm Actuators", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 11))); // NOI18N
        LeftArmActuatorPanel.setAlignmentX(0.0F);
        LeftArmActuatorPanel.setAlignmentY(0.0F);
        LeftArmActuatorPanel.setMaximumSize(new Dimension(120, 120));
        LeftArmActuatorPanel.setMinimumSize(new Dimension(120, 120));
        LeftArmActuatorPanel.setPreferredSize(new Dimension(120, 120));
        LeftArmActuatorPanel.setLayout(new GridBagLayout());

        ShoulderActuatorLabel.setFont(new Font("Moire", 0, 10)); // NOI18N
        ShoulderActuatorLabel.setHorizontalAlignment(SwingConstants.CENTER);
        ShoulderActuatorLabel.setText("Shoulder Actuator");
        ShoulderActuatorLabel.setAlignmentY(0.0F);
        ShoulderActuatorLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        ShoulderActuatorLabel.setMaximumSize(new Dimension(110, 19));
        ShoulderActuatorLabel.setMinimumSize(new Dimension(110, 19));
        ShoulderActuatorLabel.setPreferredSize(new Dimension(110, 19));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        LeftArmActuatorPanel.add(ShoulderActuatorLabel, gridBagConstraints);

        UpperArmActuatorLabel.setFont(new Font("Moire", 0, 10)); // NOI18N
        UpperArmActuatorLabel.setHorizontalAlignment(SwingConstants.CENTER);
        UpperArmActuatorLabel.setText("Upper Arm Actuator");
        UpperArmActuatorLabel.setAlignmentY(0.0F);
        UpperArmActuatorLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        UpperArmActuatorLabel.setMaximumSize(new Dimension(110, 19));
        UpperArmActuatorLabel.setMinimumSize(new Dimension(110, 19));
        UpperArmActuatorLabel.setPreferredSize(new Dimension(110, 19));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        LeftArmActuatorPanel.add(UpperArmActuatorLabel, gridBagConstraints);

        LowerArmActuatorLabel.setFont(new Font("Moire", 0, 10)); // NOI18N
        LowerArmActuatorLabel.setHorizontalAlignment(SwingConstants.CENTER);
        LowerArmActuatorLabel.setText("Lower Arm Actuator");
        LowerArmActuatorLabel.setAlignmentY(0.0F);
        LowerArmActuatorLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        LowerArmActuatorLabel.setMaximumSize(new Dimension(110, 19));
        LowerArmActuatorLabel.setMinimumSize(new Dimension(110, 19));
        LowerArmActuatorLabel.setPreferredSize(new Dimension(110, 19));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        LeftArmActuatorPanel.add(LowerArmActuatorLabel, gridBagConstraints);

        HandActuatorLabel.setFont(new Font("Moire", 0, 10)); // NOI18N
        HandActuatorLabel.setHorizontalAlignment(SwingConstants.CENTER);
        HandActuatorLabel.setText("Hand Actuator");
        HandActuatorLabel.setAlignmentY(0.0F);
        HandActuatorLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        HandActuatorLabel.setMaximumSize(new Dimension(110, 19));
        HandActuatorLabel.setMinimumSize(new Dimension(110, 19));
        HandActuatorLabel.setPreferredSize(new Dimension(110, 19));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        LeftArmActuatorPanel.add(HandActuatorLabel, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        HardpointArmorPanel.add(LeftArmActuatorPanel, gridBagConstraints);

        RightArmActuatorPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "R Arm Actuators", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 11))); // NOI18N
        RightArmActuatorPanel.setAlignmentX(0.0F);
        RightArmActuatorPanel.setAlignmentY(0.0F);
        RightArmActuatorPanel.setMaximumSize(new Dimension(120, 120));
        RightArmActuatorPanel.setMinimumSize(new Dimension(120, 120));
        RightArmActuatorPanel.setPreferredSize(new Dimension(120, 120));
        RightArmActuatorPanel.setLayout(new GridBagLayout());

        ShoulderActuatorLabel1.setFont(new Font("Moire", 0, 10)); // NOI18N
        ShoulderActuatorLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        ShoulderActuatorLabel1.setText("Shoulder Actuator");
        ShoulderActuatorLabel1.setAlignmentY(0.0F);
        ShoulderActuatorLabel1.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        ShoulderActuatorLabel1.setMaximumSize(new Dimension(110, 19));
        ShoulderActuatorLabel1.setMinimumSize(new Dimension(110, 19));
        ShoulderActuatorLabel1.setPreferredSize(new Dimension(110, 19));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        RightArmActuatorPanel.add(ShoulderActuatorLabel1, gridBagConstraints);

        UpperArmActuatorLabel1.setFont(new Font("Moire", 0, 10)); // NOI18N
        UpperArmActuatorLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        UpperArmActuatorLabel1.setText("Upper Arm Actuator");
        UpperArmActuatorLabel1.setAlignmentY(0.0F);
        UpperArmActuatorLabel1.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        UpperArmActuatorLabel1.setMaximumSize(new Dimension(110, 19));
        UpperArmActuatorLabel1.setMinimumSize(new Dimension(110, 19));
        UpperArmActuatorLabel1.setPreferredSize(new Dimension(110, 19));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        RightArmActuatorPanel.add(UpperArmActuatorLabel1, gridBagConstraints);

        LowerArmActuatorLabel1.setFont(new Font("Moire", 0, 10)); // NOI18N
        LowerArmActuatorLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        LowerArmActuatorLabel1.setText("Lower Arm Actuator");
        LowerArmActuatorLabel1.setAlignmentY(0.0F);
        LowerArmActuatorLabel1.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        LowerArmActuatorLabel1.setMaximumSize(new Dimension(110, 19));
        LowerArmActuatorLabel1.setMinimumSize(new Dimension(110, 19));
        LowerArmActuatorLabel1.setPreferredSize(new Dimension(110, 19));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        RightArmActuatorPanel.add(LowerArmActuatorLabel1, gridBagConstraints);

        HandActuatorLabel1.setFont(new Font("Moire", 0, 10)); // NOI18N
        HandActuatorLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        HandActuatorLabel1.setText("Hand Actuator");
        HandActuatorLabel1.setAlignmentY(0.0F);
        HandActuatorLabel1.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        HandActuatorLabel1.setMaximumSize(new Dimension(110, 19));
        HandActuatorLabel1.setMinimumSize(new Dimension(110, 19));
        HandActuatorLabel1.setPreferredSize(new Dimension(110, 19));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        RightArmActuatorPanel.add(HandActuatorLabel1, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        HardpointArmorPanel.add(RightArmActuatorPanel, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        StatLabPanel.add(HardpointArmorPanel, gridBagConstraints);

        MainTabbedPane.addTab("Stat Lab", StatLabPanel);

        MechLabPanel.setMaximumSize(new Dimension(795, 572));
        MechLabPanel.setMinimumSize(new Dimension(795, 572));
        MechLabPanel.setPreferredSize(new Dimension(795, 572));
        MechLabPanel.setLayout(new GridBagLayout());

        MainInfoPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.TOP));
        MainInfoPanel.setMaximumSize(new Dimension(265, 350));
        MainInfoPanel.setMinimumSize(new Dimension(265, 350));
        MainInfoPanel.setPreferredSize(new Dimension(265, 350));
        MainInfoPanel.setLayout(new GridBagLayout());

        variantTextField.setBackground(new Color(240, 240, 240));
        variantTextField.setFont(new Font("Moire", 0, 10)); // NOI18N
        variantTextField.setAlignmentX(0.0F);
        variantTextField.setAlignmentY(0.0F);
        variantTextField.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Variant Name:", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 10))); // NOI18N
        variantTextField.setMargin(new Insets(0, 0, 0, 0));
        variantTextField.setMaximumSize(new Dimension(160, 40));
        variantTextField.setMinimumSize(new Dimension(160, 40));
        variantTextField.setPreferredSize(new Dimension(160, 40));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        MainInfoPanel.add(variantTextField, gridBagConstraints);

        currentTonnageLabel.setFont(new Font("Moire", 0, 11)); // NOI18N
        currentTonnageLabel.setText("Tonnage");
        currentTonnageLabel.setMaximumSize(new Dimension(160, 16));
        currentTonnageLabel.setMinimumSize(new Dimension(160, 16));
        currentTonnageLabel.setPreferredSize(new Dimension(160, 16));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        MainInfoPanel.add(currentTonnageLabel, gridBagConstraints);

        tonnageProgressBar.setFont(new Font("Moire", 0, 11)); // NOI18N
        tonnageProgressBar.setAlignmentX(0.0F);
        tonnageProgressBar.setAlignmentY(0.0F);
        tonnageProgressBar.setMaximumSize(new Dimension(160, 16));
        tonnageProgressBar.setMinimumSize(new Dimension(160, 16));
        tonnageProgressBar.setPreferredSize(new Dimension(160, 16));
        tonnageProgressBar.setString("0.0");
        tonnageProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        MainInfoPanel.add(tonnageProgressBar, gridBagConstraints);

        currentSpeedLabel.setFont(new Font("Moire", 0, 11)); // NOI18N
        currentSpeedLabel.setText("Speed");
        currentSpeedLabel.setMaximumSize(new Dimension(160, 16));
        currentSpeedLabel.setMinimumSize(new Dimension(160, 16));
        currentSpeedLabel.setPreferredSize(new Dimension(160, 16));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        MainInfoPanel.add(currentSpeedLabel, gridBagConstraints);

        speedProgressBar.setFont(new Font("Moire", 0, 11)); // NOI18N
        speedProgressBar.setMaximum(140);
        speedProgressBar.setMinimum(32);
        speedProgressBar.setAlignmentX(0.0F);
        speedProgressBar.setAlignmentY(0.0F);
        speedProgressBar.setMaximumSize(new Dimension(160, 16));
        speedProgressBar.setMinimumSize(new Dimension(160, 16));
        speedProgressBar.setPreferredSize(new Dimension(160, 16));
        speedProgressBar.setString("0 kph");
        speedProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        MainInfoPanel.add(speedProgressBar, gridBagConstraints);

        alphaStrikeLabel.setFont(new Font("Moire", 0, 11)); // NOI18N
        alphaStrikeLabel.setText("Alpha Strike");
        alphaStrikeLabel.setMaximumSize(new Dimension(160, 16));
        alphaStrikeLabel.setMinimumSize(new Dimension(160, 16));
        alphaStrikeLabel.setPreferredSize(new Dimension(160, 16));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        MainInfoPanel.add(alphaStrikeLabel, gridBagConstraints);

        alphaStrikeProgressBar.setFont(new Font("Moire", 0, 11)); // NOI18N
        alphaStrikeProgressBar.setMaximum(128);
        alphaStrikeProgressBar.setAlignmentX(0.0F);
        alphaStrikeProgressBar.setAlignmentY(0.0F);
        alphaStrikeProgressBar.setMaximumSize(new Dimension(160, 16));
        alphaStrikeProgressBar.setMinimumSize(new Dimension(160, 16));
        alphaStrikeProgressBar.setPreferredSize(new Dimension(160, 16));
        alphaStrikeProgressBar.setString("0");
        alphaStrikeProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        MainInfoPanel.add(alphaStrikeProgressBar, gridBagConstraints);

        firepowerLabel.setFont(new Font("Moire", 0, 11)); // NOI18N
        firepowerLabel.setText("Firepower");
        firepowerLabel.setMaximumSize(new Dimension(160, 16));
        firepowerLabel.setMinimumSize(new Dimension(160, 16));
        firepowerLabel.setPreferredSize(new Dimension(160, 16));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        MainInfoPanel.add(firepowerLabel, gridBagConstraints);

        firepowerProgressBar.setFont(new Font("Moire", 0, 11)); // NOI18N
        firepowerProgressBar.setMaximum(40);
        firepowerProgressBar.setAlignmentX(0.0F);
        firepowerProgressBar.setAlignmentY(0.0F);
        firepowerProgressBar.setMaximumSize(new Dimension(160, 16));
        firepowerProgressBar.setMinimumSize(new Dimension(160, 16));
        firepowerProgressBar.setPreferredSize(new Dimension(160, 16));
        firepowerProgressBar.setString("0 dps");
        firepowerProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        MainInfoPanel.add(firepowerProgressBar, gridBagConstraints);

        heatEfficiencyLabel.setFont(new Font("Moire", 0, 11)); // NOI18N
        heatEfficiencyLabel.setText("Heat Efficiency");
        heatEfficiencyLabel.setMaximumSize(new Dimension(160, 16));
        heatEfficiencyLabel.setMinimumSize(new Dimension(160, 16));
        heatEfficiencyLabel.setPreferredSize(new Dimension(160, 16));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        MainInfoPanel.add(heatEfficiencyLabel, gridBagConstraints);

        heatEfficiencyProgressBar.setFont(new Font("Moire", 0, 11)); // NOI18N
        heatEfficiencyProgressBar.setValue(100);
        heatEfficiencyProgressBar.setAlignmentX(0.0F);
        heatEfficiencyProgressBar.setAlignmentY(0.0F);
        heatEfficiencyProgressBar.setMaximumSize(new Dimension(160, 16));
        heatEfficiencyProgressBar.setMinimumSize(new Dimension(160, 16));
        heatEfficiencyProgressBar.setPreferredSize(new Dimension(160, 16));
        heatEfficiencyProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        MainInfoPanel.add(heatEfficiencyProgressBar, gridBagConstraints);

        currentArmorLabel.setFont(new Font("Moire", 0, 11)); // NOI18N
        currentArmorLabel.setText("Armor");
        currentArmorLabel.setMaximumSize(new Dimension(160, 16));
        currentArmorLabel.setMinimumSize(new Dimension(160, 16));
        currentArmorLabel.setPreferredSize(new Dimension(160, 16));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        MainInfoPanel.add(currentArmorLabel, gridBagConstraints);

        currentArmorProgressBar.setFont(new Font("Moire", 0, 11)); // NOI18N
        currentArmorProgressBar.setAlignmentX(0.0F);
        currentArmorProgressBar.setAlignmentY(0.0F);
        currentArmorProgressBar.setMaximumSize(new Dimension(160, 16));
        currentArmorProgressBar.setMinimumSize(new Dimension(160, 16));
        currentArmorProgressBar.setPreferredSize(new Dimension(160, 16));
        currentArmorProgressBar.setString("0");
        currentArmorProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        MainInfoPanel.add(currentArmorProgressBar, gridBagConstraints);

        alphaStrikeHeatLabel.setFont(new Font("Moire", 0, 11)); // NOI18N
        alphaStrikeHeatLabel.setText("Alpha Strike Heat");
        alphaStrikeHeatLabel.setMaximumSize(new Dimension(160, 16));
        alphaStrikeHeatLabel.setMinimumSize(new Dimension(160, 16));
        alphaStrikeHeatLabel.setPreferredSize(new Dimension(160, 16));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        MainInfoPanel.add(alphaStrikeHeatLabel, gridBagConstraints);

        alphaStrikeHeatProgressBar.setFont(new Font("Moire", 0, 11)); // NOI18N
        alphaStrikeHeatProgressBar.setValue(100);
        alphaStrikeHeatProgressBar.setAlignmentX(0.0F);
        alphaStrikeHeatProgressBar.setAlignmentY(0.0F);
        alphaStrikeHeatProgressBar.setMaximumSize(new Dimension(160, 16));
        alphaStrikeHeatProgressBar.setMinimumSize(new Dimension(160, 16));
        alphaStrikeHeatProgressBar.setPreferredSize(new Dimension(160, 16));
        alphaStrikeHeatProgressBar.setString("100%");
        alphaStrikeHeatProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        MainInfoPanel.add(alphaStrikeHeatProgressBar, gridBagConstraints);

        rangeLabel.setFont(new Font("Moire", 0, 11)); // NOI18N
        rangeLabel.setText("Range");
        rangeLabel.setMaximumSize(new Dimension(160, 16));
        rangeLabel.setMinimumSize(new Dimension(160, 16));
        rangeLabel.setPreferredSize(new Dimension(160, 16));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 15;
        MainInfoPanel.add(rangeLabel, gridBagConstraints);

        rangeProgressBar.setFont(new Font("Moire", 0, 11)); // NOI18N
        rangeProgressBar.setMaximum(690);
        rangeProgressBar.setAlignmentX(0.0F);
        rangeProgressBar.setAlignmentY(0.0F);
        rangeProgressBar.setMaximumSize(new Dimension(160, 16));
        rangeProgressBar.setMinimumSize(new Dimension(160, 16));
        rangeProgressBar.setPreferredSize(new Dimension(160, 16));
        rangeProgressBar.setString("0 m");
        rangeProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        MainInfoPanel.add(rangeProgressBar, gridBagConstraints);

        criticalsUsedLabel.setFont(new Font("Moire", 0, 11)); // NOI18N
        criticalsUsedLabel.setText("Criticals");
        criticalsUsedLabel.setMaximumSize(new Dimension(160, 16));
        criticalsUsedLabel.setMinimumSize(new Dimension(160, 16));
        criticalsUsedLabel.setPreferredSize(new Dimension(160, 16));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 17;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        MainInfoPanel.add(criticalsUsedLabel, gridBagConstraints);

        criticalsUsedProgressBar.setFont(new Font("Moire", 0, 11)); // NOI18N
        criticalsUsedProgressBar.setMaximum(78);
        criticalsUsedProgressBar.setAlignmentX(0.0F);
        criticalsUsedProgressBar.setAlignmentY(0.0F);
        criticalsUsedProgressBar.setMaximumSize(new Dimension(160, 16));
        criticalsUsedProgressBar.setMinimumSize(new Dimension(160, 16));
        criticalsUsedProgressBar.setPreferredSize(new Dimension(160, 16));
        criticalsUsedProgressBar.setString("0/78");
        criticalsUsedProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        MainInfoPanel.add(criticalsUsedProgressBar, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        MechLabPanel.add(MainInfoPanel, gridBagConstraints);

        componentPane.setFont(new Font("Moire", 0, 10)); // NOI18N
        componentPane.setMaximumSize(new Dimension(265, 350));
        componentPane.setMinimumSize(new Dimension(265, 350));
        componentPane.setPreferredSize(new Dimension(265, 350));

        MotivePanel.setLayout(new GridBagLayout());

        EnginePanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED), "Engine Setup", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, new Font("Moire", 0, 12))); // NOI18N
        EnginePanel.setMaximumSize(new Dimension(200, 160));
        EnginePanel.setMinimumSize(new Dimension(200, 160));
        EnginePanel.setPreferredSize(new Dimension(200, 160));
        EnginePanel.setLayout(new GridBagLayout());

        EngineWeightLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        EngineWeightLabel.setHorizontalAlignment(SwingConstants.CENTER);
        EngineWeightLabel.setText("0.00 Tons");
        EngineWeightLabel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED), "Engine Weight", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, new Font("Moire", 0, 11))); // NOI18N
        EngineWeightLabel.setMaximumSize(new Dimension(90, 45));
        EngineWeightLabel.setMinimumSize(new Dimension(90, 45));
        EngineWeightLabel.setPreferredSize(new Dimension(90, 45));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        EnginePanel.add(EngineWeightLabel, gridBagConstraints);

        EngineCostLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        EngineCostLabel.setHorizontalAlignment(SwingConstants.CENTER);
        EngineCostLabel.setText("0 C-Bills");
        EngineCostLabel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED), "Engine Cost", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, new Font("Moire", 0, 11))); // NOI18N
        EngineCostLabel.setMaximumSize(new Dimension(180, 45));
        EngineCostLabel.setMinimumSize(new Dimension(180, 45));
        EngineCostLabel.setPreferredSize(new Dimension(180, 45));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        EnginePanel.add(EngineCostLabel, gridBagConstraints);

        engineTypeToggleButton.setFont(new Font("Moire", 0, 11)); // NOI18N
        engineTypeToggleButton.setBorder(BorderFactory.createTitledBorder(null, "Engine Type", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, new Font("Moire", 0, 11))); // NOI18N
        engineTypeToggleButton.setLabel("Reg Engine");
        engineTypeToggleButton.setMargin(new Insets(0, 0, 0, 0));
        engineTypeToggleButton.setMaximumSize(new Dimension(90, 45));
        engineTypeToggleButton.setMinimumSize(new Dimension(90, 45));
        engineTypeToggleButton.setPreferredSize(new Dimension(90, 45));
        engineTypeToggleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                engineTypeToggleButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        EnginePanel.add(engineTypeToggleButton, gridBagConstraints);

        engineRatingSpinner.setFont(new Font("Moire", 0, 11)); // NOI18N
        engineRatingSpinner.setModel(engineRatingSpinnerModel);
        engineRatingSpinner.setMaximumSize(new Dimension(90, 30));
        engineRatingSpinner.setMinimumSize(new Dimension(90, 30));
        engineRatingSpinner.setPreferredSize(new Dimension(90, 30));
        engineRatingSpinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                engineRatingSpinnerStateChanged(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new Insets(5, 0, 5, 0);
        EnginePanel.add(engineRatingSpinner, gridBagConstraints);

        engineRatingLabel.setFont(new Font("Moire", 0, 11)); // NOI18N
        engineRatingLabel.setHorizontalAlignment(SwingConstants.TRAILING);
        engineRatingLabel.setText("Engine Rating:");
        engineRatingLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        engineRatingLabel.setMaximumSize(new Dimension(90, 30));
        engineRatingLabel.setMinimumSize(new Dimension(90, 30));
        engineRatingLabel.setPreferredSize(new Dimension(90, 30));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.insets = new Insets(5, 0, 5, 0);
        EnginePanel.add(engineRatingLabel, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        MotivePanel.add(EnginePanel, gridBagConstraints);

        JumpJetPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED), "Jump Jet Setup", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, new Font("Moire", 0, 12))); // NOI18N
        JumpJetPanel.setMaximumSize(new Dimension(200, 120));
        JumpJetPanel.setMinimumSize(new Dimension(200, 120));
        JumpJetPanel.setPreferredSize(new Dimension(200, 120));
        JumpJetPanel.setLayout(new GridBagLayout());

        JumpJetWeightLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        JumpJetWeightLabel.setHorizontalAlignment(SwingConstants.CENTER);
        JumpJetWeightLabel.setText("0.00 Tons");
        JumpJetWeightLabel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED), "Jump Jet Weight", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, new Font("Moire", 0, 11))); // NOI18N
        JumpJetWeightLabel.setMaximumSize(new Dimension(90, 45));
        JumpJetWeightLabel.setMinimumSize(new Dimension(90, 45));
        JumpJetWeightLabel.setPreferredSize(new Dimension(90, 45));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        JumpJetPanel.add(JumpJetWeightLabel, gridBagConstraints);

        JumpJetCostLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        JumpJetCostLabel.setHorizontalAlignment(SwingConstants.CENTER);
        JumpJetCostLabel.setText("0 C-Bills");
        JumpJetCostLabel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED), "Jump Jet Cost", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, new Font("Moire", 0, 11))); // NOI18N
        JumpJetCostLabel.setMaximumSize(new Dimension(180, 45));
        JumpJetCostLabel.setMinimumSize(new Dimension(180, 45));
        JumpJetCostLabel.setPreferredSize(new Dimension(180, 45));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        JumpJetPanel.add(JumpJetCostLabel, gridBagConstraints);

        jumpJetSpinner.setFont(new Font("Moire", 0, 11)); // NOI18N
        jumpJetSpinner.setModel(jumpJetSpinnerModel);
        jumpJetSpinner.setMaximumSize(new Dimension(80, 30));
        jumpJetSpinner.setMinimumSize(new Dimension(80, 30));
        jumpJetSpinner.setPreferredSize(new Dimension(80, 30));
        jumpJetSpinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                jumpJetSpinnerStateChanged(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        JumpJetPanel.add(jumpJetSpinner, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        MotivePanel.add(JumpJetPanel, gridBagConstraints);

        componentPane.addTab("Motive", MotivePanel);

        ProtectionPanel.setLayout(new GridBagLayout());

        ArmorPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED), "Armor Setup", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, new Font("Moire", 0, 12))); // NOI18N
        ArmorPanel.setMaximumSize(new Dimension(200, 120));
        ArmorPanel.setMinimumSize(new Dimension(200, 120));
        ArmorPanel.setPreferredSize(new Dimension(200, 120));
        ArmorPanel.setLayout(new GridBagLayout());

        ArmorWeightLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        ArmorWeightLabel.setHorizontalAlignment(SwingConstants.CENTER);
        ArmorWeightLabel.setText("0.00 Tons");
        ArmorWeightLabel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED), "Armor Weight", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, new Font("Moire", 0, 11))); // NOI18N
        ArmorWeightLabel.setMaximumSize(new Dimension(90, 45));
        ArmorWeightLabel.setMinimumSize(new Dimension(90, 45));
        ArmorWeightLabel.setPreferredSize(new Dimension(90, 45));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        ArmorPanel.add(ArmorWeightLabel, gridBagConstraints);

        ArmorCostLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        ArmorCostLabel.setHorizontalAlignment(SwingConstants.CENTER);
        ArmorCostLabel.setText("0 C-Bills");
        ArmorCostLabel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED), "Armor Cost", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, new Font("Moire", 0, 11))); // NOI18N
        ArmorCostLabel.setMaximumSize(new Dimension(180, 45));
        ArmorCostLabel.setMinimumSize(new Dimension(180, 45));
        ArmorCostLabel.setPreferredSize(new Dimension(180, 45));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        ArmorPanel.add(ArmorCostLabel, gridBagConstraints);

        armorTypeToggleButton.setFont(new Font("Moire", 0, 11)); // NOI18N
        armorTypeToggleButton.setText("Std Armor");
        armorTypeToggleButton.setBorder(BorderFactory.createTitledBorder(null, "Armor Type", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, new Font("Moire", 0, 11))); // NOI18N
        armorTypeToggleButton.setMargin(new Insets(0, 0, 0, 0));
        armorTypeToggleButton.setMaximumSize(new Dimension(90, 45));
        armorTypeToggleButton.setMinimumSize(new Dimension(90, 45));
        armorTypeToggleButton.setPreferredSize(new Dimension(90, 45));
        armorTypeToggleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                armorTypeToggleButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        ArmorPanel.add(armorTypeToggleButton, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        ProtectionPanel.add(ArmorPanel, gridBagConstraints);

        InternalPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED), "Internal Setup", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, new Font("Moire", 0, 12))); // NOI18N
        InternalPanel.setMaximumSize(new Dimension(200, 120));
        InternalPanel.setMinimumSize(new Dimension(200, 120));
        InternalPanel.setPreferredSize(new Dimension(200, 120));
        InternalPanel.setLayout(new GridBagLayout());

        InternalWeightLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        InternalWeightLabel.setHorizontalAlignment(SwingConstants.CENTER);
        InternalWeightLabel.setText("0.00 Tons");
        InternalWeightLabel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED), "Internal Weight", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, new Font("Moire", 0, 11))); // NOI18N
        InternalWeightLabel.setMaximumSize(new Dimension(90, 45));
        InternalWeightLabel.setMinimumSize(new Dimension(90, 45));
        InternalWeightLabel.setPreferredSize(new Dimension(90, 45));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        InternalPanel.add(InternalWeightLabel, gridBagConstraints);

        InternalCostLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        InternalCostLabel.setHorizontalAlignment(SwingConstants.CENTER);
        InternalCostLabel.setText("0 C-Bills");
        InternalCostLabel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED), "Internal Cost", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, new Font("Moire", 0, 11))); // NOI18N
        InternalCostLabel.setMaximumSize(new Dimension(180, 45));
        InternalCostLabel.setMinimumSize(new Dimension(180, 45));
        InternalCostLabel.setPreferredSize(new Dimension(180, 45));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        InternalPanel.add(InternalCostLabel, gridBagConstraints);

        internalTypeToggleButton.setFont(new Font("Moire", 0, 11)); // NOI18N
        internalTypeToggleButton.setText("Std Internals");
        internalTypeToggleButton.setBorder(BorderFactory.createTitledBorder(null, "Internal Type", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, new Font("Moire", 0, 11))); // NOI18N
        internalTypeToggleButton.setMargin(new Insets(0, 0, 0, 0));
        internalTypeToggleButton.setMaximumSize(new Dimension(90, 45));
        internalTypeToggleButton.setMinimumSize(new Dimension(90, 45));
        internalTypeToggleButton.setPreferredSize(new Dimension(90, 45));
        internalTypeToggleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                internalTypeToggleButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        InternalPanel.add(internalTypeToggleButton, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        ProtectionPanel.add(InternalPanel, gridBagConstraints);

        componentPane.addTab("Protection", ProtectionPanel);

        EnhancementPanel.setLayout(new GridBagLayout());

        HeatSinkPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED), "Heat Sink Setup", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, new Font("Moire", 0, 12))); // NOI18N
        HeatSinkPanel.setMaximumSize(new Dimension(200, 120));
        HeatSinkPanel.setMinimumSize(new Dimension(200, 120));
        HeatSinkPanel.setPreferredSize(new Dimension(200, 160));
        HeatSinkPanel.setLayout(new GridBagLayout());

        HeatSinkCostLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        HeatSinkCostLabel.setHorizontalAlignment(SwingConstants.CENTER);
        HeatSinkCostLabel.setText("0 C-Bills");
        HeatSinkCostLabel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED), "Heat Sink Cost", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, new Font("Moire", 0, 11))); // NOI18N
        HeatSinkCostLabel.setMaximumSize(new Dimension(180, 45));
        HeatSinkCostLabel.setMinimumSize(new Dimension(180, 45));
        HeatSinkCostLabel.setPreferredSize(new Dimension(180, 45));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        HeatSinkPanel.add(HeatSinkCostLabel, gridBagConstraints);

        HeatDissapationLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        HeatDissapationLabel.setHorizontalAlignment(SwingConstants.CENTER);
        HeatDissapationLabel.setText("0");
        HeatDissapationLabel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED), "Heat Dissipation", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, new Font("Moire", 0, 11))); // NOI18N
        HeatDissapationLabel.setMaximumSize(new Dimension(90, 45));
        HeatDissapationLabel.setMinimumSize(new Dimension(90, 45));
        HeatDissapationLabel.setPreferredSize(new Dimension(90, 45));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        HeatSinkPanel.add(HeatDissapationLabel, gridBagConstraints);

        heatSinkTypeToggleButton.setFont(new Font("Moire", 0, 11)); // NOI18N
        heatSinkTypeToggleButton.setText("Std HS");
        heatSinkTypeToggleButton.setBorder(BorderFactory.createTitledBorder(null, "Heat Sink Type", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, new Font("Moire", 0, 11))); // NOI18N
        heatSinkTypeToggleButton.setMargin(new Insets(0, 0, 0, 0));
        heatSinkTypeToggleButton.setMaximumSize(new Dimension(90, 45));
        heatSinkTypeToggleButton.setMinimumSize(new Dimension(90, 45));
        heatSinkTypeToggleButton.setPreferredSize(new Dimension(90, 45));
        heatSinkTypeToggleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                heatSinkTypeToggleButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        HeatSinkPanel.add(heatSinkTypeToggleButton, gridBagConstraints);

        heatSinkSpinner.setFont(new Font("Moire", 0, 11)); // NOI18N
        heatSinkSpinner.setModel(heatSinkSpinnerModel);
        heatSinkSpinner.setMaximumSize(new Dimension(90, 30));
        heatSinkSpinner.setMinimumSize(new Dimension(90, 30));
        heatSinkSpinner.setPreferredSize(new Dimension(90, 30));
        heatSinkSpinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                heatSinkSpinnerStateChanged(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new Insets(5, 0, 5, 0);
        HeatSinkPanel.add(heatSinkSpinner, gridBagConstraints);

        heatSinkLabel.setFont(new Font("Moire", 0, 11)); // NOI18N
        heatSinkLabel.setHorizontalAlignment(SwingConstants.TRAILING);
        heatSinkLabel.setText("Number of HS:");
        heatSinkLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        heatSinkLabel.setMaximumSize(new Dimension(90, 30));
        heatSinkLabel.setMinimumSize(new Dimension(90, 30));
        heatSinkLabel.setPreferredSize(new Dimension(90, 30));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.insets = new Insets(5, 0, 5, 0);
        HeatSinkPanel.add(heatSinkLabel, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        EnhancementPanel.add(HeatSinkPanel, gridBagConstraints);

        componentPane.addTab("Heat Sinks", EnhancementPanel);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        MechLabPanel.add(componentPane, gridBagConstraints);

        itemChooser.setMaximumSize(new Dimension(265, 350));
        itemChooser.setMinimumSize(new Dimension(265, 350));
        itemChooser.setPreferredSize(new Dimension(265, 350));
        itemChooser.setLayout(new GridBagLayout());

        itemPane.setTabPlacement(JTabbedPane.RIGHT);
        itemPane.setFont(new Font("Moire", 0, 10)); // NOI18N
        itemPane.setMaximumSize(new Dimension(210, 250));
        itemPane.setMinimumSize(new Dimension(210, 250));
        itemPane.setPreferredSize(new Dimension(210, 250));

        ballisticPanel.setLayout(new GridBagLayout());

        ballisticList.setFont(new Font("Moire", 0, 11)); // NOI18N
        ballisticList.setModel(ballisticListModel);
        ballisticList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(ballisticList);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 182;
        gridBagConstraints.ipady = 185;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ballisticPanel.add(jScrollPane3, gridBagConstraints);

        itemPane.addTab("Ballistic", ballisticPanel);

        energyPanel.setLayout(new GridBagLayout());

        energyList.setFont(new Font("Moire", 0, 11)); // NOI18N
        energyList.setModel(energyListModel);
        energyList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jScrollPane6.setViewportView(energyList);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 182;
        gridBagConstraints.ipady = 185;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        energyPanel.add(jScrollPane6, gridBagConstraints);

        itemPane.addTab("Energy", energyPanel);

        missilePanel.setLayout(new GridBagLayout());

        missileList.setFont(new Font("Moire", 0, 11)); // NOI18N
        missileList.setModel(missileListModel);
        missileList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jScrollPane7.setViewportView(missileList);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 182;
        gridBagConstraints.ipady = 185;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        missilePanel.add(jScrollPane7, gridBagConstraints);

        itemPane.addTab("Missile", missilePanel);

        ammoPanel.setLayout(new GridBagLayout());

        ammoList.setFont(new Font("Moire", 0, 11)); // NOI18N
        ammoList.setModel(ammoListModel);
        ammoList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jScrollPane4.setViewportView(ammoList);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 182;
        gridBagConstraints.ipady = 185;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ammoPanel.add(jScrollPane4, gridBagConstraints);

        itemPane.addTab("Ammo", ammoPanel);

        equipmentPanel.setLayout(new GridBagLayout());

        specialEquipmentList.setFont(new Font("Moire", 0, 11)); // NOI18N
        specialEquipmentList.setModel(specialEquipmentListModel);
        jScrollPane5.setViewportView(specialEquipmentList);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 182;
        gridBagConstraints.ipady = 185;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        equipmentPanel.add(jScrollPane5, gridBagConstraints);

        itemPane.addTab("Equipment", equipmentPanel);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        itemChooser.add(itemPane, gridBagConstraints);

        itemButtonPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Controls", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 11))); // NOI18N
        itemButtonPanel.setMaximumSize(new Dimension(220, 80));
        itemButtonPanel.setMinimumSize(new Dimension(220, 80));
        itemButtonPanel.setPreferredSize(new Dimension(212, 62));
        itemButtonPanel.setLayout(new GridBagLayout());

        aboutEquipmentButton.setFont(new Font("Moire", 0, 10)); // NOI18N
        aboutEquipmentButton.setText("About");
        aboutEquipmentButton.setMaximumSize(new Dimension(100, 20));
        aboutEquipmentButton.setMinimumSize(new Dimension(100, 20));
        aboutEquipmentButton.setPreferredSize(new Dimension(100, 20));
        aboutEquipmentButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                aboutEquipmentButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        itemButtonPanel.add(aboutEquipmentButton, gridBagConstraints);

        clearEquipmentButton.setFont(new Font("Moire", 0, 10)); // NOI18N
        clearEquipmentButton.setText("Clear");
        clearEquipmentButton.setMaximumSize(new Dimension(100, 20));
        clearEquipmentButton.setMinimumSize(new Dimension(100, 20));
        clearEquipmentButton.setPreferredSize(new Dimension(100, 20));
        clearEquipmentButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                clearEquipmentButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        itemButtonPanel.add(clearEquipmentButton, gridBagConstraints);

        addEquipmentButton.setFont(new Font("Moire", 0, 10)); // NOI18N
        addEquipmentButton.setText("Add");
        addEquipmentButton.setMaximumSize(new Dimension(100, 20));
        addEquipmentButton.setMinimumSize(new Dimension(100, 20));
        addEquipmentButton.setPreferredSize(new Dimension(100, 20));
        addEquipmentButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                addEquipmentButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        itemButtonPanel.add(addEquipmentButton, gridBagConstraints);

        removeEquipmentButton.setFont(new Font("Moire", 0, 10)); // NOI18N
        removeEquipmentButton.setText("Remove");
        removeEquipmentButton.setMaximumSize(new Dimension(100, 20));
        removeEquipmentButton.setMinimumSize(new Dimension(100, 20));
        removeEquipmentButton.setPreferredSize(new Dimension(100, 20));
        removeEquipmentButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                removeEquipmentButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        itemButtonPanel.add(removeEquipmentButton, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        itemChooser.add(itemButtonPanel, gridBagConstraints);

        ArtemisIVCheckBox.setFont(new Font("Moire", 0, 11)); // NOI18N
        ArtemisIVCheckBox.setText("Artemis IV FCS");
        ArtemisIVCheckBox.setMargin(new Insets(0, 0, 0, 0));
        ArtemisIVCheckBox.setMaximumSize(new Dimension(110, 15));
        ArtemisIVCheckBox.setMinimumSize(new Dimension(110, 15));
        ArtemisIVCheckBox.setPreferredSize(new Dimension(110, 15));
        ArtemisIVCheckBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ArtemisIVCheckBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        itemChooser.add(ArtemisIVCheckBox, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        MechLabPanel.add(itemChooser, gridBagConstraints);

        mechSnapPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.TOP));
        mechSnapPanel.setMaximumSize(new Dimension(265, 350));
        mechSnapPanel.setMinimumSize(new Dimension(265, 350));
        mechSnapPanel.setPreferredSize(new Dimension(265, 350));
        mechSnapPanel.setLayout(new GridBagLayout());

        headSnapPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "HD", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 11))); // NOI18N
        headSnapPanel.setFont(new Font("Moire", 0, 11)); // NOI18N
        headSnapPanel.setMaximumSize(new Dimension(40, 100));
        headSnapPanel.setMinimumSize(new Dimension(40, 100));
        headSnapPanel.setPreferredSize(new Dimension(40, 100));
        headSnapPanel.setLayout(new GridBagLayout());

        headSnapButton.setFont(new Font("Moire", 0, 11)); // NOI18N
        headSnapButton.setAlignmentX(0.5F);
        headSnapButton.setBorder(new LineBorder(new Color(128, 128, 128), 1, true));
        headSnapButton.setMargin(new Insets(0, 0, 0, 0));
        headSnapButton.setMaximumSize(new Dimension(20, 20));
        headSnapButton.setMinimumSize(new Dimension(20, 20));
        headSnapButton.setPreferredSize(new Dimension(20, 20));
        headSnapButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                headSnapButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        headSnapPanel.add(headSnapButton, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        mechSnapPanel.add(headSnapPanel, gridBagConstraints);

        centerTorsoSnapPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "CT", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 11))); // NOI18N
        centerTorsoSnapPanel.setFont(new Font("Moire", 0, 11)); // NOI18N
        centerTorsoSnapPanel.setMaximumSize(new Dimension(40, 100));
        centerTorsoSnapPanel.setMinimumSize(new Dimension(40, 100));
        centerTorsoSnapPanel.setPreferredSize(new Dimension(40, 100));
        centerTorsoSnapPanel.setLayout(new GridBagLayout());

        centerTorsoSnapButton.setFont(new Font("Moire", 0, 11)); // NOI18N
        centerTorsoSnapButton.setAlignmentX(0.5F);
        centerTorsoSnapButton.setBorder(new LineBorder(new Color(128, 128, 128), 1, true));
        centerTorsoSnapButton.setMargin(new Insets(0, 0, 0, 0));
        centerTorsoSnapButton.setMaximumSize(new Dimension(20, 20));
        centerTorsoSnapButton.setMinimumSize(new Dimension(20, 20));
        centerTorsoSnapButton.setPreferredSize(new Dimension(20, 20));
        centerTorsoSnapButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                centerTorsoSnapButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        centerTorsoSnapPanel.add(centerTorsoSnapButton, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        mechSnapPanel.add(centerTorsoSnapPanel, gridBagConstraints);

        leftArmSnapPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "LA", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 11))); // NOI18N
        leftArmSnapPanel.setFont(new Font("Moire", 0, 11)); // NOI18N
        leftArmSnapPanel.setMaximumSize(new Dimension(40, 100));
        leftArmSnapPanel.setMinimumSize(new Dimension(40, 100));
        leftArmSnapPanel.setPreferredSize(new Dimension(40, 100));
        leftArmSnapPanel.setLayout(new GridBagLayout());

        leftArmSnapButton.setFont(new Font("Moire", 0, 11)); // NOI18N
        leftArmSnapButton.setAlignmentX(0.5F);
        leftArmSnapButton.setBorder(new LineBorder(new Color(128, 128, 128), 1, true));
        leftArmSnapButton.setMargin(new Insets(0, 0, 0, 0));
        leftArmSnapButton.setMaximumSize(new Dimension(20, 20));
        leftArmSnapButton.setMinimumSize(new Dimension(20, 20));
        leftArmSnapButton.setPreferredSize(new Dimension(20, 20));
        leftArmSnapButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                leftArmSnapButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftArmSnapPanel.add(leftArmSnapButton, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        mechSnapPanel.add(leftArmSnapPanel, gridBagConstraints);

        rightArmSnapPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "RA", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 11))); // NOI18N
        rightArmSnapPanel.setFont(new Font("Moire", 0, 11)); // NOI18N
        rightArmSnapPanel.setMaximumSize(new Dimension(40, 100));
        rightArmSnapPanel.setMinimumSize(new Dimension(40, 100));
        rightArmSnapPanel.setPreferredSize(new Dimension(40, 100));
        rightArmSnapPanel.setLayout(new GridBagLayout());

        rightArmSnapButton.setFont(new Font("Moire", 0, 11)); // NOI18N
        rightArmSnapButton.setAlignmentX(0.5F);
        rightArmSnapButton.setBorder(new LineBorder(new Color(128, 128, 128), 1, true));
        rightArmSnapButton.setMargin(new Insets(0, 0, 0, 0));
        rightArmSnapButton.setMaximumSize(new Dimension(20, 20));
        rightArmSnapButton.setMinimumSize(new Dimension(20, 20));
        rightArmSnapButton.setPreferredSize(new Dimension(20, 20));
        rightArmSnapButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                rightArmSnapButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightArmSnapPanel.add(rightArmSnapButton, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        mechSnapPanel.add(rightArmSnapPanel, gridBagConstraints);

        leftTorsoSnapPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "LT", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 11))); // NOI18N
        leftTorsoSnapPanel.setFont(new Font("Moire", 0, 11)); // NOI18N
        leftTorsoSnapPanel.setMaximumSize(new Dimension(40, 100));
        leftTorsoSnapPanel.setMinimumSize(new Dimension(40, 100));
        leftTorsoSnapPanel.setPreferredSize(new Dimension(40, 100));
        leftTorsoSnapPanel.setLayout(new GridBagLayout());

        leftTorsoSnapButton.setFont(new Font("Moire", 0, 11)); // NOI18N
        leftTorsoSnapButton.setAlignmentX(0.5F);
        leftTorsoSnapButton.setBorder(new LineBorder(new Color(128, 128, 128), 1, true));
        leftTorsoSnapButton.setMargin(new Insets(0, 0, 0, 0));
        leftTorsoSnapButton.setMaximumSize(new Dimension(20, 20));
        leftTorsoSnapButton.setMinimumSize(new Dimension(20, 20));
        leftTorsoSnapButton.setPreferredSize(new Dimension(20, 20));
        leftTorsoSnapButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                leftTorsoSnapButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftTorsoSnapPanel.add(leftTorsoSnapButton, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        mechSnapPanel.add(leftTorsoSnapPanel, gridBagConstraints);

        rightTorsoSnapPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "RT", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 11))); // NOI18N
        rightTorsoSnapPanel.setFont(new Font("Moire", 0, 11)); // NOI18N
        rightTorsoSnapPanel.setMaximumSize(new Dimension(40, 100));
        rightTorsoSnapPanel.setMinimumSize(new Dimension(40, 100));
        rightTorsoSnapPanel.setPreferredSize(new Dimension(40, 100));
        rightTorsoSnapPanel.setLayout(new GridBagLayout());

        rightTorsoSnapButton.setFont(new Font("Moire", 0, 11)); // NOI18N
        rightTorsoSnapButton.setAlignmentX(0.5F);
        rightTorsoSnapButton.setBorder(new LineBorder(new Color(128, 128, 128), 1, true));
        rightTorsoSnapButton.setMargin(new Insets(0, 0, 0, 0));
        rightTorsoSnapButton.setMaximumSize(new Dimension(20, 20));
        rightTorsoSnapButton.setMinimumSize(new Dimension(20, 20));
        rightTorsoSnapButton.setPreferredSize(new Dimension(20, 20));
        rightTorsoSnapButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                rightTorsoSnapButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightTorsoSnapPanel.add(rightTorsoSnapButton, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        mechSnapPanel.add(rightTorsoSnapPanel, gridBagConstraints);

        leftLegSnapPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "LL", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 11))); // NOI18N
        leftLegSnapPanel.setFont(new Font("Moire", 0, 11)); // NOI18N
        leftLegSnapPanel.setMaximumSize(new Dimension(40, 100));
        leftLegSnapPanel.setMinimumSize(new Dimension(40, 100));
        leftLegSnapPanel.setPreferredSize(new Dimension(40, 100));
        leftLegSnapPanel.setLayout(new GridBagLayout());

        leftLegSnapButton.setFont(new Font("Moire", 0, 11)); // NOI18N
        leftLegSnapButton.setAlignmentX(0.5F);
        leftLegSnapButton.setBorder(new LineBorder(new Color(128, 128, 128), 1, true));
        leftLegSnapButton.setMargin(new Insets(0, 0, 0, 0));
        leftLegSnapButton.setMaximumSize(new Dimension(20, 20));
        leftLegSnapButton.setMinimumSize(new Dimension(20, 20));
        leftLegSnapButton.setPreferredSize(new Dimension(20, 20));
        leftLegSnapButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                leftLegSnapButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftLegSnapPanel.add(leftLegSnapButton, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        mechSnapPanel.add(leftLegSnapPanel, gridBagConstraints);

        rightLegSnapPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "RL", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 11))); // NOI18N
        rightLegSnapPanel.setFont(new Font("Moire", 0, 11)); // NOI18N
        rightLegSnapPanel.setMaximumSize(new Dimension(40, 100));
        rightLegSnapPanel.setMinimumSize(new Dimension(40, 100));
        rightLegSnapPanel.setPreferredSize(new Dimension(40, 100));
        rightLegSnapPanel.setLayout(new GridBagLayout());

        rightLegSnapButton.setFont(new Font("Moire", 0, 11)); // NOI18N
        rightLegSnapButton.setAlignmentX(0.5F);
        rightLegSnapButton.setBorder(new LineBorder(new Color(128, 128, 128), 1, true));
        rightLegSnapButton.setMargin(new Insets(0, 0, 0, 0));
        rightLegSnapButton.setMaximumSize(new Dimension(20, 20));
        rightLegSnapButton.setMinimumSize(new Dimension(20, 20));
        rightLegSnapButton.setPreferredSize(new Dimension(20, 20));
        rightLegSnapButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                rightLegSnapButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightLegSnapPanel.add(rightLegSnapButton, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        mechSnapPanel.add(rightLegSnapPanel, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        MechLabPanel.add(mechSnapPanel, gridBagConstraints);

        mechPane.setFont(new Font("Moire", 0, 10)); // NOI18N
        mechPane.setMaximumSize(new Dimension(265, 350));
        mechPane.setMinimumSize(new Dimension(265, 350));
        mechPane.setPreferredSize(new Dimension(265, 350));

        criticalPanel.setLayout(new GridBagLayout());

        ballisticHardpointLabel.setBackground(new Color(255, 255, 128));
        ballisticHardpointLabel.setFont(new Font("Moire", 0, 11)); // NOI18N
        ballisticHardpointLabel.setText("0/0 Ballistic Hardpoints");
        ballisticHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        ballisticHardpointLabel.setMaximumSize(new Dimension(150, 15));
        ballisticHardpointLabel.setMinimumSize(new Dimension(150, 15));
        ballisticHardpointLabel.setPreferredSize(new Dimension(150, 15));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.VERTICAL;
        criticalPanel.add(ballisticHardpointLabel, gridBagConstraints);

        energyHardpointLabel.setBackground(new Color(255, 128, 128));
        energyHardpointLabel.setFont(new Font("Moire", 0, 11)); // NOI18N
        energyHardpointLabel.setText("0/0 Energy Hardpoints");
        energyHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        energyHardpointLabel.setMaximumSize(new Dimension(150, 15));
        energyHardpointLabel.setMinimumSize(new Dimension(150, 15));
        energyHardpointLabel.setPreferredSize(new Dimension(150, 15));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = GridBagConstraints.VERTICAL;
        criticalPanel.add(energyHardpointLabel, gridBagConstraints);

        missileHardpointLabel.setBackground(new Color(128, 255, 128));
        missileHardpointLabel.setFont(new Font("Moire", 0, 11)); // NOI18N
        missileHardpointLabel.setText("0/0 Missile Hardpoints");
        missileHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        missileHardpointLabel.setMaximumSize(new Dimension(150, 15));
        missileHardpointLabel.setMinimumSize(new Dimension(150, 15));
        missileHardpointLabel.setPreferredSize(new Dimension(150, 15));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = GridBagConstraints.VERTICAL;
        criticalPanel.add(missileHardpointLabel, gridBagConstraints);

        AMSHardpointLabel.setBackground(new Color(128, 128, 255));
        AMSHardpointLabel.setFont(new Font("Moire", 0, 11)); // NOI18N
        AMSHardpointLabel.setText("0/0 AMS Hardpoints");
        AMSHardpointLabel.setBorder(BorderFactory.createEtchedBorder());
        AMSHardpointLabel.setMaximumSize(new Dimension(150, 15));
        AMSHardpointLabel.setMinimumSize(new Dimension(150, 15));
        AMSHardpointLabel.setPreferredSize(new Dimension(150, 15));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = GridBagConstraints.VERTICAL;
        criticalPanel.add(AMSHardpointLabel, gridBagConstraints);

        jScrollPane1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setFont(new Font("Moire", 0, 11)); // NOI18N
        jScrollPane1.setHorizontalScrollBar(null);
        jScrollPane1.setMaximumSize(null);
        jScrollPane1.setMinimumSize(null);

        criticalList.setFont(new Font("Moire", 0, 11)); // NOI18N
        criticalList.setModel(criticalListModel);
        criticalList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        criticalList.setCellRenderer(new mechCriticalRenderer());
        criticalList.setDragEnabled(true);
        criticalList.setFixedCellHeight(18);
        criticalList.setMaximumSize(null);
        criticalList.setMinimumSize(null);
        criticalList.setPreferredSize(null);
        criticalList.setVisibleRowCount(12);
        jScrollPane1.setViewportView(criticalList);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridheight = 12;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        criticalPanel.add(jScrollPane1, gridBagConstraints);

        sectionCritcalLabel.setFont(new Font("Moire", 0, 18)); // NOI18N
        sectionCritcalLabel.setHorizontalAlignment(SwingConstants.CENTER);
        sectionCritcalLabel.setText("Center Torso");
        sectionCritcalLabel.setBorder(BorderFactory.createEtchedBorder());
        sectionCritcalLabel.setMaximumSize(new Dimension(150, 30));
        sectionCritcalLabel.setMinimumSize(new Dimension(150, 30));
        sectionCritcalLabel.setPreferredSize(new Dimension(150, 30));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        criticalPanel.add(sectionCritcalLabel, gridBagConstraints);

        mechPane.addTab("Criticals", criticalPanel);

        armorPanel.setLayout(new GridBagLayout());

        headArmorSpinner.setFont(new Font("Moire", 0, 11)); // NOI18N
        headArmorSpinner.setModel(headArmorSpinnerModel);
        headArmorSpinner.setEditor(new NumberEditor(headArmorSpinner, ""));
        headArmorSpinner.setMaximumSize(new Dimension(60, 20));
        headArmorSpinner.setMinimumSize(new Dimension(60, 20));
        headArmorSpinner.setPreferredSize(new Dimension(60, 20));
        headArmorSpinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                headArmorSpinnerStateChanged(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        armorPanel.add(headArmorSpinner, gridBagConstraints);

        rightTorsoArmorSpinner.setFont(new Font("Moire", 0, 11)); // NOI18N
        rightTorsoArmorSpinner.setModel(rightTorsoArmorSpinnerModel);
        rightTorsoArmorSpinner.setEditor(new NumberEditor(rightTorsoArmorSpinner, ""));
        rightTorsoArmorSpinner.setMaximumSize(new Dimension(60, 20));
        rightTorsoArmorSpinner.setMinimumSize(new Dimension(60, 20));
        rightTorsoArmorSpinner.setPreferredSize(new Dimension(60, 20));
        rightTorsoArmorSpinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                rightTorsoArmorSpinnerStateChanged(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        armorPanel.add(rightTorsoArmorSpinner, gridBagConstraints);

        centerTorsoArmorSpinner.setFont(new Font("Moire", 0, 11)); // NOI18N
        centerTorsoArmorSpinner.setModel(centerTorsoArmorSpinnerModel);
        centerTorsoArmorSpinner.setEditor(new NumberEditor(centerTorsoArmorSpinner, ""));
        centerTorsoArmorSpinner.setMaximumSize(new Dimension(60, 20));
        centerTorsoArmorSpinner.setMinimumSize(new Dimension(60, 20));
        centerTorsoArmorSpinner.setPreferredSize(new Dimension(60, 20));
        centerTorsoArmorSpinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                centerTorsoArmorSpinnerStateChanged(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        armorPanel.add(centerTorsoArmorSpinner, gridBagConstraints);

        leftTorsoArmorSpinner.setFont(new Font("Moire", 0, 11)); // NOI18N
        leftTorsoArmorSpinner.setModel(leftTorsoArmorSpinnerModel);
        leftTorsoArmorSpinner.setEditor(new NumberEditor(leftTorsoArmorSpinner, ""));
        leftTorsoArmorSpinner.setMaximumSize(new Dimension(60, 20));
        leftTorsoArmorSpinner.setMinimumSize(new Dimension(60, 20));
        leftTorsoArmorSpinner.setPreferredSize(new Dimension(60, 20));
        leftTorsoArmorSpinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                leftTorsoArmorSpinnerStateChanged(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        armorPanel.add(leftTorsoArmorSpinner, gridBagConstraints);

        rightArmArmorSpinner.setFont(new Font("Moire", 0, 11)); // NOI18N
        rightArmArmorSpinner.setModel(rightArmArmorSpinnerModel);
        rightArmArmorSpinner.setEditor(new NumberEditor(rightArmArmorSpinner, ""));
        rightArmArmorSpinner.setMaximumSize(new Dimension(60, 20));
        rightArmArmorSpinner.setMinimumSize(new Dimension(60, 20));
        rightArmArmorSpinner.setPreferredSize(new Dimension(60, 20));
        rightArmArmorSpinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                rightArmArmorSpinnerStateChanged(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        armorPanel.add(rightArmArmorSpinner, gridBagConstraints);

        leftArmArmorSpinner.setFont(new Font("Moire", 0, 11)); // NOI18N
        leftArmArmorSpinner.setModel(leftArmArmorSpinnerModel);
        leftArmArmorSpinner.setEditor(new NumberEditor(leftArmArmorSpinner, ""));
        leftArmArmorSpinner.setMaximumSize(new Dimension(60, 20));
        leftArmArmorSpinner.setMinimumSize(new Dimension(60, 20));
        leftArmArmorSpinner.setPreferredSize(new Dimension(60, 20));
        leftArmArmorSpinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                leftArmArmorSpinnerStateChanged(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        armorPanel.add(leftArmArmorSpinner, gridBagConstraints);

        rightLegArmorSpinner.setFont(new Font("Moire", 0, 11)); // NOI18N
        rightLegArmorSpinner.setModel(rightLegArmorSpinnerModel);
        rightLegArmorSpinner.setEditor(new NumberEditor(rightLegArmorSpinner, ""));
        rightLegArmorSpinner.setMaximumSize(new Dimension(60, 20));
        rightLegArmorSpinner.setMinimumSize(new Dimension(60, 20));
        rightLegArmorSpinner.setPreferredSize(new Dimension(60, 20));
        rightLegArmorSpinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                rightLegArmorSpinnerStateChanged(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        armorPanel.add(rightLegArmorSpinner, gridBagConstraints);

        leftLegArmorSpinner.setFont(new Font("Moire", 0, 11)); // NOI18N
        leftLegArmorSpinner.setModel(leftLegArmorSpinnerModel);
        leftLegArmorSpinner.setEditor(new NumberEditor(leftLegArmorSpinner, ""));
        leftLegArmorSpinner.setMaximumSize(new Dimension(60, 20));
        leftLegArmorSpinner.setMinimumSize(new Dimension(60, 20));
        leftLegArmorSpinner.setPreferredSize(new Dimension(60, 20));
        leftLegArmorSpinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                leftLegArmorSpinnerStateChanged(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        armorPanel.add(leftLegArmorSpinner, gridBagConstraints);

        rightRearTorsoArmorSpinner.setFont(new Font("Moire", 0, 11)); // NOI18N
        rightRearTorsoArmorSpinner.setModel(rightRearTorsoArmorSpinnerModel);
        rightRearTorsoArmorSpinner.setEditor(new NumberEditor(rightRearTorsoArmorSpinner, ""));
        rightRearTorsoArmorSpinner.setMaximumSize(new Dimension(60, 20));
        rightRearTorsoArmorSpinner.setMinimumSize(new Dimension(60, 20));
        rightRearTorsoArmorSpinner.setPreferredSize(new Dimension(60, 20));
        rightRearTorsoArmorSpinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                rightTorsoArmorSpinnerStateChanged(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        armorPanel.add(rightRearTorsoArmorSpinner, gridBagConstraints);

        centerRearTorsoArmorSpinner.setFont(new Font("Moire", 0, 11)); // NOI18N
        centerRearTorsoArmorSpinner.setModel(centerRearTorsoArmorSpinnerModel);
        centerRearTorsoArmorSpinner.setEditor(new NumberEditor(centerRearTorsoArmorSpinner, ""));
        centerRearTorsoArmorSpinner.setMaximumSize(new Dimension(60, 20));
        centerRearTorsoArmorSpinner.setMinimumSize(new Dimension(60, 20));
        centerRearTorsoArmorSpinner.setPreferredSize(new Dimension(60, 20));
        centerRearTorsoArmorSpinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                centerTorsoArmorSpinnerStateChanged(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        armorPanel.add(centerRearTorsoArmorSpinner, gridBagConstraints);

        leftRearTorsoArmorSpinner.setFont(new Font("Moire", 0, 11)); // NOI18N
        leftRearTorsoArmorSpinner.setModel(leftRearTorsoArmorSpinnerModel);
        leftRearTorsoArmorSpinner.setEditor(new NumberEditor(leftRearTorsoArmorSpinner, ""));
        leftRearTorsoArmorSpinner.setMaximumSize(new Dimension(60, 20));
        leftRearTorsoArmorSpinner.setMinimumSize(new Dimension(60, 20));
        leftRearTorsoArmorSpinner.setPreferredSize(new Dimension(60, 20));
        leftRearTorsoArmorSpinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                leftTorsoArmorSpinnerStateChanged(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        armorPanel.add(leftRearTorsoArmorSpinner, gridBagConstraints);
        frontLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        frontLabel.setHorizontalAlignment(SwingConstants.CENTER);
        frontLabel.setText("Front");
        frontLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        frontLabel.setMaximumSize(new Dimension(60, 20));
        frontLabel.setMinimumSize(new Dimension(60, 20));
        frontLabel.setPreferredSize(new Dimension(60, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        armorPanel.add(frontLabel, gridBagConstraints);
        rearLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        rearLabel.setHorizontalAlignment(SwingConstants.CENTER);
        rearLabel.setText("Rear");
        rearLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        rearLabel.setMaximumSize(new Dimension(60, 20));
        rearLabel.setMinimumSize(new Dimension(60, 20));
        rearLabel.setPreferredSize(new Dimension(60, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        armorPanel.add(rearLabel, gridBagConstraints);

        headArmorLabel.setFont(new Font("Moire", 0, 11)); // NOI18N
        headArmorLabel.setHorizontalAlignment(SwingConstants.CENTER);
        headArmorLabel.setText("0/18");
        headArmorLabel.setBorder(BorderFactory.createEtchedBorder());
        headArmorLabel.setMaximumSize(new Dimension(60, 20));
        headArmorLabel.setMinimumSize(new Dimension(60, 20));
        headArmorLabel.setPreferredSize(new Dimension(60, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        armorPanel.add(headArmorLabel, gridBagConstraints);

        rightTorsoArmorLabel.setFont(new Font("Moire", 0, 11)); // NOI18N
        rightTorsoArmorLabel.setHorizontalAlignment(SwingConstants.CENTER);
        rightTorsoArmorLabel.setText("0/124");
        rightTorsoArmorLabel.setBorder(BorderFactory.createEtchedBorder());
        rightTorsoArmorLabel.setMaximumSize(new Dimension(60, 20));
        rightTorsoArmorLabel.setMinimumSize(new Dimension(60, 20));
        rightTorsoArmorLabel.setPreferredSize(new Dimension(60, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        armorPanel.add(rightTorsoArmorLabel, gridBagConstraints);

        leftTorsoArmorLabel.setFont(new Font("Moire", 0, 11)); // NOI18N
        leftTorsoArmorLabel.setHorizontalAlignment(SwingConstants.CENTER);
        leftTorsoArmorLabel.setText("0/124");
        leftTorsoArmorLabel.setBorder(BorderFactory.createEtchedBorder());
        leftTorsoArmorLabel.setMaximumSize(new Dimension(60, 20));
        leftTorsoArmorLabel.setMinimumSize(new Dimension(60, 20));
        leftTorsoArmorLabel.setPreferredSize(new Dimension(60, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        armorPanel.add(leftTorsoArmorLabel, gridBagConstraints);

        centerTorsoArmorLabel.setFont(new Font("Moire", 0, 11)); // NOI18N
        centerTorsoArmorLabel.setHorizontalAlignment(SwingConstants.CENTER);
        centerTorsoArmorLabel.setText("0/124");
        centerTorsoArmorLabel.setBorder(BorderFactory.createEtchedBorder());
        centerTorsoArmorLabel.setMaximumSize(new Dimension(60, 20));
        centerTorsoArmorLabel.setMinimumSize(new Dimension(60, 20));
        centerTorsoArmorLabel.setPreferredSize(new Dimension(60, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        armorPanel.add(centerTorsoArmorLabel, gridBagConstraints);

        rightArmArmorLabel.setFont(new Font("Moire", 0, 11)); // NOI18N
        rightArmArmorLabel.setHorizontalAlignment(SwingConstants.CENTER);
        rightArmArmorLabel.setText("0/124");
        rightArmArmorLabel.setBorder(BorderFactory.createEtchedBorder());
        rightArmArmorLabel.setMaximumSize(new Dimension(60, 20));
        rightArmArmorLabel.setMinimumSize(new Dimension(60, 20));
        rightArmArmorLabel.setPreferredSize(new Dimension(60, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        armorPanel.add(rightArmArmorLabel, gridBagConstraints);

        leftArmArmorLabel.setFont(new Font("Moire", 0, 11)); // NOI18N
        leftArmArmorLabel.setHorizontalAlignment(SwingConstants.CENTER);
        leftArmArmorLabel.setText("0/124");
        leftArmArmorLabel.setBorder(BorderFactory.createEtchedBorder());
        leftArmArmorLabel.setMaximumSize(new Dimension(60, 20));
        leftArmArmorLabel.setMinimumSize(new Dimension(60, 20));
        leftArmArmorLabel.setPreferredSize(new Dimension(60, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        armorPanel.add(leftArmArmorLabel, gridBagConstraints);

        rightLegArmorLabel.setFont(new Font("Moire", 0, 11)); // NOI18N
        rightLegArmorLabel.setHorizontalAlignment(SwingConstants.CENTER);
        rightLegArmorLabel.setText("0/124");
        rightLegArmorLabel.setBorder(BorderFactory.createEtchedBorder());
        rightLegArmorLabel.setMaximumSize(new Dimension(60, 20));
        rightLegArmorLabel.setMinimumSize(new Dimension(60, 20));
        rightLegArmorLabel.setPreferredSize(new Dimension(60, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        armorPanel.add(rightLegArmorLabel, gridBagConstraints);

        leftLegArmorLabel.setFont(new Font("Moire", 0, 11)); // NOI18N
        leftLegArmorLabel.setHorizontalAlignment(SwingConstants.CENTER);
        leftLegArmorLabel.setText("0/124");
        leftLegArmorLabel.setBorder(BorderFactory.createEtchedBorder());
        leftLegArmorLabel.setMaximumSize(new Dimension(60, 20));
        leftLegArmorLabel.setMinimumSize(new Dimension(60, 20));
        leftLegArmorLabel.setPreferredSize(new Dimension(60, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        armorPanel.add(leftLegArmorLabel, gridBagConstraints);
        headLabel.setFont(new Font("Moire", 0, 11)); // NOI18N
        headLabel.setHorizontalAlignment(SwingConstants.CENTER);
        headLabel.setText("HD");
        headLabel.setBorder(BorderFactory.createEtchedBorder());
        headLabel.setMaximumSize(new Dimension(60, 20));
        headLabel.setMinimumSize(new Dimension(60, 20));
        headLabel.setPreferredSize(new Dimension(60, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        armorPanel.add(headLabel, gridBagConstraints);
        rightTorsoArmorLabel1.setFont(new Font("Moire", 0, 11)); // NOI18N
        rightTorsoArmorLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        rightTorsoArmorLabel1.setText("RT");
        rightTorsoArmorLabel1.setBorder(BorderFactory.createEtchedBorder());
        rightTorsoArmorLabel1.setMaximumSize(new Dimension(60, 20));
        rightTorsoArmorLabel1.setMinimumSize(new Dimension(60, 20));
        rightTorsoArmorLabel1.setPreferredSize(new Dimension(60, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        armorPanel.add(rightTorsoArmorLabel1, gridBagConstraints);
        leftTorsoLabel.setFont(new Font("Moire", 0, 11)); // NOI18N
        leftTorsoLabel.setHorizontalAlignment(SwingConstants.CENTER);
        leftTorsoLabel.setText("LT");
        leftTorsoLabel.setBorder(BorderFactory.createEtchedBorder());
        leftTorsoLabel.setMaximumSize(new Dimension(60, 20));
        leftTorsoLabel.setMinimumSize(new Dimension(60, 20));
        leftTorsoLabel.setPreferredSize(new Dimension(60, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        armorPanel.add(leftTorsoLabel, gridBagConstraints);
        centerTorsoLabel.setFont(new Font("Moire", 0, 11)); // NOI18N
        centerTorsoLabel.setHorizontalAlignment(SwingConstants.CENTER);
        centerTorsoLabel.setText("CT");
        centerTorsoLabel.setBorder(BorderFactory.createEtchedBorder());
        centerTorsoLabel.setMaximumSize(new Dimension(60, 20));
        centerTorsoLabel.setMinimumSize(new Dimension(60, 20));
        centerTorsoLabel.setPreferredSize(new Dimension(60, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        armorPanel.add(centerTorsoLabel, gridBagConstraints);
        rightArmLabel.setFont(new Font("Moire", 0, 11)); // NOI18N
        rightArmLabel.setHorizontalAlignment(SwingConstants.CENTER);
        rightArmLabel.setText("RA");
        rightArmLabel.setBorder(BorderFactory.createEtchedBorder());
        rightArmLabel.setMaximumSize(new Dimension(60, 20));
        rightArmLabel.setMinimumSize(new Dimension(60, 20));
        rightArmLabel.setPreferredSize(new Dimension(60, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        armorPanel.add(rightArmLabel, gridBagConstraints);
        leftArmLabel.setFont(new Font("Moire", 0, 11)); // NOI18N
        leftArmLabel.setHorizontalAlignment(SwingConstants.CENTER);
        leftArmLabel.setText("LA");
        leftArmLabel.setBorder(BorderFactory.createEtchedBorder());
        leftArmLabel.setMaximumSize(new Dimension(60, 20));
        leftArmLabel.setMinimumSize(new Dimension(60, 20));
        leftArmLabel.setPreferredSize(new Dimension(60, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        armorPanel.add(leftArmLabel, gridBagConstraints);
        rightLegLabel.setFont(new Font("Moire", 0, 11)); // NOI18N
        rightLegLabel.setHorizontalAlignment(SwingConstants.CENTER);
        rightLegLabel.setText("RL");
        rightLegLabel.setBorder(BorderFactory.createEtchedBorder());
        rightLegLabel.setMaximumSize(new Dimension(60, 20));
        rightLegLabel.setMinimumSize(new Dimension(60, 20));
        rightLegLabel.setPreferredSize(new Dimension(60, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        armorPanel.add(rightLegLabel, gridBagConstraints);
        leftLegLabel.setFont(new Font("Moire", 0, 11)); // NOI18N
        leftLegLabel.setHorizontalAlignment(SwingConstants.CENTER);
        leftLegLabel.setText("LL");
        leftLegLabel.setBorder(BorderFactory.createEtchedBorder());
        leftLegLabel.setMaximumSize(new Dimension(60, 20));
        leftLegLabel.setMinimumSize(new Dimension(60, 20));
        leftLegLabel.setPreferredSize(new Dimension(60, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        armorPanel.add(leftLegLabel, gridBagConstraints);
        sectionLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        sectionLabel.setHorizontalAlignment(SwingConstants.CENTER);
        sectionLabel.setText("Section");
        sectionLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        sectionLabel.setMaximumSize(new Dimension(60, 20));
        sectionLabel.setMinimumSize(new Dimension(60, 20));
        sectionLabel.setPreferredSize(new Dimension(60, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        armorPanel.add(sectionLabel, gridBagConstraints);
        limitLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        limitLabel.setHorizontalAlignment(SwingConstants.CENTER);
        limitLabel.setText("Limits");
        limitLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        limitLabel.setMaximumSize(new Dimension(60, 20));
        limitLabel.setMinimumSize(new Dimension(60, 20));
        limitLabel.setPreferredSize(new Dimension(60, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        armorPanel.add(limitLabel, gridBagConstraints);

        mechPane.addTab("Armor", armorPanel);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        MechLabPanel.add(mechPane, gridBagConstraints);

        itemBayPanel.setMaximumSize(new Dimension(265, 350));
        itemBayPanel.setMinimumSize(new Dimension(265, 350));
        itemBayPanel.setPreferredSize(new Dimension(265, 350));
        itemBayPanel.setLayout(new GridBagLayout());

        caseCheckBox.setFont(new Font("Moire", 0, 11)); // NOI18N
        caseCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
        caseCheckBox.setLabel("CASE");
        caseCheckBox.setMargin(new Insets(0, 0, 0, 0));
        caseCheckBox.setMaximumSize(new Dimension(110, 15));
        caseCheckBox.setMinimumSize(new Dimension(110, 15));
        caseCheckBox.setPreferredSize(new Dimension(110, 15));
        caseCheckBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                caseCheckBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        itemBayPanel.add(caseCheckBox, gridBagConstraints);

        jScrollPane2.setMaximumSize(new Dimension(210, 250));
        jScrollPane2.setMinimumSize(new Dimension(210, 250));
        jScrollPane2.setPreferredSize(new Dimension(210, 250));

        itemBayList.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Equipment To Be Placed", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, new Font("Moire", 0, 11))); // NOI18N
        itemBayList.setFont(new Font("Moire", 0, 11)); // NOI18N
        itemBayList.setModel(itemBayListModel);
        itemBayList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        itemBayList.setDragEnabled(true);
        itemBayList.setVisibleRowCount(20);
        jScrollPane2.setViewportView(itemBayList);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        itemBayPanel.add(jScrollPane2, gridBagConstraints);

        itemButtonPanel1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Controls", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 11))); // NOI18N
        itemButtonPanel1.setLayout(new GridBagLayout());

        selectiveEquipmentButton.setFont(new Font("Moire", 0, 10)); // NOI18N
        selectiveEquipmentButton.setText("Selective");
        selectiveEquipmentButton.setMaximumSize(new Dimension(100, 20));
        selectiveEquipmentButton.setMinimumSize(new Dimension(100, 20));
        selectiveEquipmentButton.setPreferredSize(new Dimension(100, 20));
        selectiveEquipmentButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                selectiveEquipmentButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        itemButtonPanel1.add(selectiveEquipmentButton, gridBagConstraints);

        clearSectionEquipmentButton.setFont(new Font("Moire", 0, 10)); // NOI18N
        clearSectionEquipmentButton.setText("Clear Section");
        clearSectionEquipmentButton.setMaximumSize(new Dimension(100, 20));
        clearSectionEquipmentButton.setMinimumSize(new Dimension(100, 20));
        clearSectionEquipmentButton.setPreferredSize(new Dimension(100, 20));
        clearSectionEquipmentButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                clearSectionEquipmentButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        itemButtonPanel1.add(clearSectionEquipmentButton, gridBagConstraints);

        addEquipmentButton1.setFont(new Font("Moire", 0, 10)); // NOI18N
        addEquipmentButton1.setText("Equip Item");
        addEquipmentButton1.setMaximumSize(new Dimension(100, 20));
        addEquipmentButton1.setMinimumSize(new Dimension(100, 20));
        addEquipmentButton1.setPreferredSize(new Dimension(100, 20));
        addEquipmentButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                addEquipmentButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        itemButtonPanel1.add(addEquipmentButton1, gridBagConstraints);

        removeEquipmentButton1.setFont(new Font("Moire", 0, 10)); // NOI18N
        removeEquipmentButton1.setText("Unequip Item");
        removeEquipmentButton1.setMaximumSize(new Dimension(100, 20));
        removeEquipmentButton1.setMinimumSize(new Dimension(100, 20));
        removeEquipmentButton1.setPreferredSize(new Dimension(100, 20));
        removeEquipmentButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                removeEquipmentButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        itemButtonPanel1.add(removeEquipmentButton1, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        itemBayPanel.add(itemButtonPanel1, gridBagConstraints);

        MASCCheckBox.setFont(new Font("Moire", 0, 11)); // NOI18N
        MASCCheckBox.setLabel("MASC");
        MASCCheckBox.setMargin(new Insets(0, 0, 0, 0));
        MASCCheckBox.setMaximumSize(new Dimension(110, 15));
        MASCCheckBox.setMinimumSize(new Dimension(110, 15));
        MASCCheckBox.setPreferredSize(new Dimension(110, 15));
        MASCCheckBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                MASCCheckBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        itemBayPanel.add(MASCCheckBox, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        MechLabPanel.add(itemBayPanel, gridBagConstraints);

        MainTabbedPane.addTab("Mech Lab", MechLabPanel);

        equipmentLabPanel.setLayout(new GridBagLayout());

        jTabbedPane1.setFont(new Font("Moire", 0, 11)); // NOI18N

        jPanel1.setLayout(new GridBagLayout());

        jScrollPane8.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane8.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane8.setFont(new Font("Moire", 0, 11)); // NOI18N
        jScrollPane8.setMaximumSize(new Dimension(0, 0));
        jScrollPane8.setMinimumSize(new Dimension(0, 0));
        jScrollPane8.setPreferredSize(new Dimension(0, 0));

        ammoTable1.setFont(new Font("Moire", 0, 11)); // NOI18N
        ammoTable1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        ammoTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jScrollPane8.setViewportView(ammoTable1);
        ammoTable1.getColumnModel().getColumn(0).setResizable(false);
        ammoTable1.getColumnModel().getColumn(1).setResizable(false);
        ammoTable1.getColumnModel().getColumn(2).setResizable(false);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jScrollPane8, gridBagConstraints);

        jScrollPane9.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane9.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane9.setFont(new Font("Moire", 0, 11)); // NOI18N
        jScrollPane9.setMaximumSize(new Dimension(0, 0));
        jScrollPane9.setMinimumSize(new Dimension(0, 0));
        jScrollPane9.setPreferredSize(new Dimension(0, 0));

        ammoTable2.setFont(new Font("Moire", 0, 11)); // NOI18N
        ammoTable2.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        ammoTable2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jScrollPane9.setViewportView(ammoTable2);
        ammoTable2.getColumnModel().getColumn(0).setResizable(false);
        ammoTable2.getColumnModel().getColumn(1).setResizable(false);
        ammoTable2.getColumnModel().getColumn(2).setResizable(false);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jScrollPane9, gridBagConstraints);

        jTabbedPane1.addTab("Ammo Stats", jPanel1);

        jPanel2.setLayout(new GridBagLayout());

        jScrollPane10.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane10.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane10.setFont(new Font("Moire", 0, 11)); // NOI18N
        jScrollPane10.setMaximumSize(new Dimension(0, 0));
        jScrollPane10.setMinimumSize(new Dimension(0, 0));
        jScrollPane10.setPreferredSize(new Dimension(0, 0));

        ballisticTable2.setFont(new Font("Moire", 0, 11)); // NOI18N
        ballisticTable2.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        ballisticTable2.setSelectionModel(ballisticSelectionModel);
        jScrollPane10.setViewportView(ballisticTable2);
        ballisticTable2.getColumnModel().getColumn(0).setResizable(false);
        ballisticTable2.getColumnModel().getColumn(1).setResizable(false);
        ballisticTable2.getColumnModel().getColumn(2).setResizable(false);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(jScrollPane10, gridBagConstraints);

        jScrollPane11.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane11.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane11.setFont(new Font("Moire", 0, 11)); // NOI18N
        jScrollPane11.setMaximumSize(new Dimension(0, 0));
        jScrollPane11.setMinimumSize(new Dimension(0, 0));
        jScrollPane11.setPreferredSize(new Dimension(0, 0));

        ballisticTable1.setFont(new Font("Moire", 0, 11)); // NOI18N
        ballisticTable1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        ballisticTable1.setSelectionModel(ballisticSelectionModel);
        jScrollPane11.setViewportView(ballisticTable1);
        ballisticTable1.getColumnModel().getColumn(0).setResizable(false);
        ballisticTable1.getColumnModel().getColumn(1).setResizable(false);
        ballisticTable1.getColumnModel().getColumn(2).setResizable(false);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(jScrollPane11, gridBagConstraints);

        jTabbedPane1.addTab("Ballistic Stats", jPanel2);

        jPanel3.setLayout(new GridBagLayout());

        jScrollPane12.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane12.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane12.setFont(new Font("Moire", 0, 11)); // NOI18N
        jScrollPane12.setMaximumSize(new Dimension(0, 0));
        jScrollPane12.setMinimumSize(new Dimension(0, 0));
        jScrollPane12.setPreferredSize(new Dimension(0, 0));

        energyTable2.setFont(new Font("Moire", 0, 11)); // NOI18N
        energyTable2.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        energyTable2.setSelectionModel(energySelectionModel);
        jScrollPane12.setViewportView(energyTable2);
        energyTable2.getColumnModel().getColumn(0).setResizable(false);
        energyTable2.getColumnModel().getColumn(1).setResizable(false);
        energyTable2.getColumnModel().getColumn(2).setResizable(false);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(jScrollPane12, gridBagConstraints);

        jScrollPane13.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane13.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane13.setFont(new Font("Moire", 0, 11)); // NOI18N
        jScrollPane13.setMaximumSize(new Dimension(0, 0));
        jScrollPane13.setMinimumSize(new Dimension(0, 0));
        jScrollPane13.setPreferredSize(new Dimension(0, 0));

        energyTable1.setFont(new Font("Moire", 0, 11)); // NOI18N
        energyTable1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        energyTable1.setSelectionModel(energySelectionModel);
        jScrollPane13.setViewportView(energyTable1);
        energyTable1.getColumnModel().getColumn(0).setResizable(false);
        energyTable1.getColumnModel().getColumn(1).setResizable(false);
        energyTable1.getColumnModel().getColumn(2).setResizable(false);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel3.add(jScrollPane13, gridBagConstraints);

        jTabbedPane1.addTab("Energy Stats", jPanel3);

        jPanel4.setLayout(new GridBagLayout());

        jScrollPane14.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane14.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane14.setFont(new Font("Moire", 0, 11)); // NOI18N
        jScrollPane14.setMaximumSize(new Dimension(0, 0));
        jScrollPane14.setMinimumSize(new Dimension(0, 0));
        jScrollPane14.setPreferredSize(new Dimension(0, 0));

        missileTable1.setFont(new Font("Moire", 0, 11)); // NOI18N
        missileTable1.setSelectionModel(missileSelectionModel);
        jScrollPane14.setViewportView(missileTable1);
        missileTable1.getColumnModel().getColumn(0).setResizable(false);
        missileTable1.getColumnModel().getColumn(1).setResizable(false);
        missileTable1.getColumnModel().getColumn(2).setResizable(false);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel4.add(jScrollPane14, gridBagConstraints);

        jScrollPane15.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane15.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane15.setFont(new Font("Moire", 0, 11)); // NOI18N
        jScrollPane15.setMaximumSize(new Dimension(0, 0));
        jScrollPane15.setMinimumSize(new Dimension(0, 0));
        jScrollPane15.setPreferredSize(new Dimension(0, 0));

        missileTable2.setFont(new Font("Moire", 0, 11)); // NOI18N
        missileTable2.setSelectionModel(missileSelectionModel);
        jScrollPane15.setViewportView(missileTable2);
        missileTable2.getColumnModel().getColumn(0).setResizable(false);
        missileTable2.getColumnModel().getColumn(1).setResizable(false);
        missileTable2.getColumnModel().getColumn(2).setResizable(false);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel4.add(jScrollPane15, gridBagConstraints);

        jTabbedPane1.addTab("Missile Stats", jPanel4);

        jPanel5.setLayout(new GridBagLayout());

        jScrollPane16.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane16.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane16.setFont(new Font("Moire", 0, 11)); // NOI18N
        jScrollPane16.setMaximumSize(new Dimension(0, 0));
        jScrollPane16.setMinimumSize(new Dimension(0, 0));
        jScrollPane16.setPreferredSize(new Dimension(0, 0));

        armorTable.setFont(new Font("Moire", 0, 11)); // NOI18N
        armorTable.setModel(new DefaultTableModel(
            new Object [][] {
                {"Standard Armor", "0", "32.00", "10,016 C-Bills"},
                {"Ferro Fibrous", "14", "35.84", "20,032 C-Bills"}
            },
            new String [] {
                "Armor Type", "Criticals", "Points Per Ton", "Cost Per Ton"
            }
        ) {
            Class[] types = new Class [] {
                String.class, String.class, String.class, String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        armorTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        armorTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jScrollPane16.setViewportView(armorTable);
        armorTable.getColumnModel().getColumn(0).setResizable(false);
        armorTable.getColumnModel().getColumn(1).setResizable(false);
        armorTable.getColumnModel().getColumn(2).setResizable(false);
        armorTable.getColumnModel().getColumn(3).setResizable(false);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel5.add(jScrollPane16, gridBagConstraints);

        jScrollPane17.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane17.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane17.setFont(new Font("Moire", 0, 11)); // NOI18N
        jScrollPane17.setMaximumSize(new Dimension(0, 0));
        jScrollPane17.setMinimumSize(new Dimension(0, 0));
        jScrollPane17.setPreferredSize(new Dimension(0, 0));

        internalTable.setFont(new Font("Moire", 0, 11)); // NOI18N
        internalTable.setModel(new DefaultTableModel(
            new Object [][] {
                {"Standard Internals", "0", "10% of Chassis Weight", "5,000 C-Bills"},
                {"Endo Steel", "14", "5% of Chassis Weight", "10,000 C-Bills"}
            },
            new String [] {
                "Internal Type", "Criticals", "Weight", "Cost Per Ton"
            }
        ) {
            Class[] types = new Class [] {
                String.class, String.class, String.class, String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        internalTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        internalTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jScrollPane17.setViewportView(internalTable);
        internalTable.getColumnModel().getColumn(0).setResizable(false);
        internalTable.getColumnModel().getColumn(1).setResizable(false);
        internalTable.getColumnModel().getColumn(2).setResizable(false);
        internalTable.getColumnModel().getColumn(3).setResizable(false);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel5.add(jScrollPane17, gridBagConstraints);

        jScrollPane18.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane18.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane18.setFont(new Font("Moire", 0, 11)); // NOI18N
        jScrollPane18.setMaximumSize(new Dimension(0, 0));
        jScrollPane18.setMinimumSize(new Dimension(0, 0));
        jScrollPane18.setPreferredSize(new Dimension(0, 0));

        engineTable.setFont(new Font("Moire", 0, 11)); // NOI18N
        engineTable.setModel(new DefaultTableModel(
            new Object [][] {
                {"Standard Engine", "6", "0", "4,000 C-Bills"},
                {"XL Engine", "6", "6", "16,000 C-Bills"}
            },
            new String [] {
                "Engine Type", "Center Criticals", "Side Criticals", "Cost Per Rating"
            }
        ) {
            Class[] types = new Class [] {
                String.class, String.class, String.class, String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        engineTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        engineTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jScrollPane18.setViewportView(engineTable);
        engineTable.getColumnModel().getColumn(0).setResizable(false);
        engineTable.getColumnModel().getColumn(1).setResizable(false);
        engineTable.getColumnModel().getColumn(2).setResizable(false);
        engineTable.getColumnModel().getColumn(3).setResizable(false);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel5.add(jScrollPane18, gridBagConstraints);

        jScrollPane19.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane19.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane19.setFont(new Font("Moire", 0, 11)); // NOI18N
        jScrollPane19.setMaximumSize(new Dimension(0, 0));
        jScrollPane19.setMinimumSize(new Dimension(0, 0));
        jScrollPane19.setPreferredSize(new Dimension(0, 0));

        heatSinkTable.setFont(new Font("Moire", 0, 11)); // NOI18N
        heatSinkTable.setModel(new DefaultTableModel(
            new Object [][] {
                {"Standard Heat Sink", "1.0", "1", "0.1", "2,000 C-Bills"},
                {"Double Heat Sink", "1.0", "3", "0.2", "6,000 C-Bills"}
            },
            new String [] {
                "Heat Sink Type", "Tonnage", "Criticals", "Heat Dissipation", "Cost"
            }
        ) {
            Class[] types = new Class [] {
                String.class, String.class, String.class, String.class, String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        heatSinkTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        heatSinkTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jScrollPane19.setViewportView(heatSinkTable);
        heatSinkTable.getColumnModel().getColumn(0).setResizable(false);
        heatSinkTable.getColumnModel().getColumn(1).setResizable(false);
        heatSinkTable.getColumnModel().getColumn(2).setResizable(false);
        heatSinkTable.getColumnModel().getColumn(3).setResizable(false);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel5.add(jScrollPane19, gridBagConstraints);

        jScrollPane20.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane20.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane20.setFont(new Font("Moire", 0, 11)); // NOI18N
        jScrollPane20.setMaximumSize(new Dimension(0, 0));
        jScrollPane20.setMinimumSize(new Dimension(0, 0));
        jScrollPane20.setPreferredSize(new Dimension(0, 0));

        jumpJetTable.setFont(new Font("Moire", 0, 11)); // NOI18N
        jumpJetTable.setModel(new DefaultTableModel(
            new Object [][] {
                {"Jump Jet Mark I", "2.0", "21,500 C-Bills"},
                {"Jump Jet Mark II", "1.0", "17,500 C-Bills"},
                {"Jump Jet Mark III", "1.0", "13,500 C-Bills"},
                {"Jump Jet Mark IV", "0.5", "9,500 C-Bills"},
                {"Jump Jet Mark V", "0.5", "5,500 C-Bills"}
            },
            new String [] {
                "Jump Jet Type", "Tonnage", "Cost"
            }
        ) {
            Class[] types = new Class [] {
                String.class, String.class, String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jumpJetTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        jumpJetTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jScrollPane20.setViewportView(jumpJetTable);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel5.add(jScrollPane20, gridBagConstraints);

        jScrollPane21.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane21.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane21.setFont(new Font("Moire", 0, 11)); // NOI18N
        jScrollPane21.setMaximumSize(new Dimension(0, 0));
        jScrollPane21.setMinimumSize(new Dimension(0, 0));
        jScrollPane21.setPreferredSize(new Dimension(0, 0));

        ammoTable3.setFont(new Font("Moire", 0, 11)); // NOI18N
        ammoTable3.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        ammoTable3.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jScrollPane21.setViewportView(ammoTable3);
        ammoTable3.getColumnModel().getColumn(0).setResizable(false);
        ammoTable3.getColumnModel().getColumn(1).setResizable(false);
        ammoTable3.getColumnModel().getColumn(2).setResizable(false);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel5.add(jScrollPane21, gridBagConstraints);

        jTabbedPane1.addTab("Other Stats", jPanel5);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        equipmentLabPanel.add(jTabbedPane1, gridBagConstraints);

        MainTabbedPane.addTab("Equipment Lab", equipmentLabPanel);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = -115;
        gridBagConstraints.ipady = 129;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(0, 6, 0, 0);
        getContentPane().add(MainTabbedPane, gridBagConstraints);

        MechList.setFont(new Font("Moire", 0, 11)); // NOI18N
        DefaultMutableTreeNode treeNode1 = new DefaultMutableTreeNode("root");
        MechList.setModel(new DefaultTreeModel(treeNode1));
        MechList.setMaximumSize(new Dimension(150, 633));
        MechList.getSelectionModel().setSelectionMode
        (TreeSelectionModel.SINGLE_TREE_SELECTION);
        MechList.addTreeSelectionListener(new TreeSelectionListener() {
            public void valueChanged(TreeSelectionEvent evt) {
                MechListValueChanged(evt);
            }
        });
        MechListScrollPane.setViewportView(MechList);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 126;
        gridBagConstraints.ipady = 706;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(MechListScrollPane, gridBagConstraints);

        fileMenu.setText("File");
        fileMenu.setFont(new Font("Moire", 0, 12)); // NOI18N

        loadMechMenuItem.setFont(new Font("Moire", 0, 12)); // NOI18N
        loadMechMenuItem.setText("Load Mech");
        loadMechMenuItem.setEnabled(false);
        loadMechMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                loadMechMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(loadMechMenuItem);

        saveMechMenuItem.setFont(new Font("Moire", 0, 12)); // NOI18N
        saveMechMenuItem.setText("Save Mech");
        saveMechMenuItem.setEnabled(false);
        saveMechMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                saveMechMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveMechMenuItem);

        exportMechMenuItem.setFont(new Font("Moire", 0, 12)); // NOI18N
        exportMechMenuItem.setText("Export Mech");
        exportMechMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                exportMechMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exportMechMenuItem);

        mechbayMenuBar.add(fileMenu);

        MechsMenu.setText("Mechs");
        MechsMenu.setFont(new Font("Moire", 0, 12)); // NOI18N

        UnreleasedCheckBoxMenuItem.setFont(new Font("Moire", 0, 12)); // NOI18N
        UnreleasedCheckBoxMenuItem.setSelected(true);
        UnreleasedCheckBoxMenuItem.setText("Unreleased Mechs");
        UnreleasedCheckBoxMenuItem.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent evt) {
                UnreleasedCheckBoxMenuItemItemStateChanged(evt);
            }
        });
        MechsMenu.add(UnreleasedCheckBoxMenuItem);

        UnconfirmedCheckBoxMenuItem.setFont(new Font("Moire", 0, 12)); // NOI18N
        UnconfirmedCheckBoxMenuItem.setSelected(true);
        UnconfirmedCheckBoxMenuItem.setText("Unconfirmed Variants");
        UnconfirmedCheckBoxMenuItem.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent evt) {
                UnconfirmedCheckBoxMenuItemItemStateChanged(evt);
            }
        });
        UnconfirmedCheckBoxMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                UnconfirmedCheckBoxMenuItemActionPerformed(evt);
            }
        });
        MechsMenu.add(UnconfirmedCheckBoxMenuItem);

        mechbayMenuBar.add(MechsMenu);

        helpMenu.setText("Help");
        helpMenu.setFont(new Font("Moire", 0, 12)); // NOI18N

        aboutMenuItem.setFont(new Font("Moire", 0, 12)); // NOI18N
        aboutMenuItem.setText("About MWO Mechbay");
        aboutMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(aboutMenuItem);

        mechbayMenuBar.add(helpMenu);

        setJMenuBar(mechbayMenuBar);

        getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MechListValueChanged(TreeSelectionEvent evt) {//GEN-FIRST:event_MechListValueChanged
        DefaultMutableTreeNode node = (DefaultMutableTreeNode) MechList.getLastSelectedPathComponent();

        if (node == null)     
            return;
        
        if (node.isLeaf())
        {
            if ("AS7-D".equals(node.toString())) {
                userMech = new AS7_D();
            }
            else if ("AS7-D-DC".equals(node.toString())) {
                userMech = new AS7_D_DC();
            }
            else if ("AS7-K".equals(node.toString())) {
                userMech = new AS7_K();
            }
            else if ("AS7-RS".equals(node.toString())) {
                userMech = new AS7_RS();
            }
            else if ("AWS-8Q".equals(node.toString())) {
                userMech = new AWS_8Q();
            }
            else if ("AWS-8R".equals(node.toString())) {
                userMech = new AWS_8R();
            }
            else if ("AWS-8T".equals(node.toString())) {
                userMech = new AWS_8T();
            }
            else if ("AWS-8V".equals(node.toString())) {
                userMech = new AWS_8V();
            }
            else if ("CTF-1X".equals(node.toString())) {
                userMech = new CTF_1X();
            }
            else if ("CTF-2X".equals(node.toString())) {
                userMech = new CTF_2X();
            }
            else if ("CTF-4X".equals(node.toString())) {
                userMech = new CTF_4X();
            }
            else if ("CPLT-A1".equals(node.toString())) {
                userMech = new CPLT_A1();
            }
            else if ("CPLT-C1".equals(node.toString())) {
                userMech = new CPLT_C1();
            }
            else if ("CPLT-C4".equals(node.toString())) {
                userMech = new CPLT_C4();
            }
            else if ("CPLT-K2".equals(node.toString())) {
                userMech = new CPLT_K2();
            }
            else if ("CN9-A".equals(node.toString())) {
                userMech = new CN9_A();
            }
            else if ("CN9-AH".equals(node.toString())) {
                userMech = new CN9_AH();
            }
            else if ("CN9-AL".equals(node.toString())) {
                userMech = new CN9_AL();
            }
            else if ("CN9-D".equals(node.toString())) {
                userMech = new CN9_D();
            }
            else if ("CDA-2A".equals(node.toString())) {
                userMech = new CDA_2A();
            }
            else if ("CDA-2B".equals(node.toString())) {
                userMech = new CDA_2B();
            }
            else if ("CDA-3C".equals(node.toString())) {
                userMech = new CDA_3C();
            }
            else if ("COM-1B".equals(node.toString())) {
                userMech = new COM_1B();
            }
            else if ("COM-1D".equals(node.toString())) {
                userMech = new COM_1D();
            }
            else if ("COM-2D".equals(node.toString())) {
                userMech = new COM_2D();
            }
            else if ("COM-3A".equals(node.toString())) {
                userMech = new COM_3A();
            }
            else if ("DGN-1C".equals(node.toString())) {
                userMech = new DGN_1C();
            }
            else if ("DGN-1N".equals(node.toString())) {
                userMech = new DGN_1N();
            }
            else if ("DGN-5N".equals(node.toString())) {
                userMech = new DGN_5N();
            }
            else if ("DRG-1G".equals(node.toString())) {
                userMech = new DRG_1G();
            }
            else if ("FLE-4".equals(node.toString())) {
                userMech = new FLE_4();
            }
            else if ("FLE-15".equals(node.toString())) {
                userMech = new FLE_15();
            }
            else if ("FLE-17".equals(node.toString())) {
                userMech = new FLE_17();
            }
            else if ("HBK-4G".equals(node.toString())) {
                userMech = new NMS_1X();
            }
            else if ("HBK-4H".equals(node.toString())) {
                userMech = new HBK_4H();
            }
            else if ("HBK-4J".equals(node.toString())) {
                userMech = new HBK_4J();
            }
            else if ("HBK-4P".equals(node.toString())) {
                userMech = new HBK_4P();
            }
            else if ("HBK-4SP".equals(node.toString())) {
                userMech = new HBK_4SP();
            }
            else if ("JM6-A".equals(node.toString())) {
                userMech = new JM6_A();
            }
            else if ("JM6-DD".equals(node.toString())) {
                userMech = new JM6_DD();
            }
            else if ("JM6-S".equals(node.toString())) {
                userMech = new JM6_S();
            }
            else if ("JR7-D".equals(node.toString())) {
                userMech = new JR7_D();
            }
            else if ("JR7-F".equals(node.toString())) {
                userMech = new JR7_F();
            }
            else if ("JR7-K".equals(node.toString())) {
                userMech = new JR7_K();
            }
            else if ("RVN-2X".equals(node.toString())) {
                userMech = new RVN_2X();
            }
            else if ("RVN-3L".equals(node.toString())) {
                userMech = new RVN_3L();
            }
            else if ("RVN-4X".equals(node.toString())) {
                userMech = new RVN_4X();
            }
            else if ("SDR-5D".equals(node.toString())) {
                userMech = new SDR_5D();
            }
            else if ("SDR-5K".equals(node.toString())) {
                userMech = new SDR_5K();
            }
            else if ("SDR-5V".equals(node.toString())) {
                userMech = new SDR_5V();
            }
            else if ("STK-3F".equals(node.toString())) {
                userMech = new STK_3F();
            }
            else if ("STK-3H".equals(node.toString())) {
                userMech = new STK_3H();
            }
            else if ("STK-4N".equals(node.toString())) {
                userMech = new STK_4N();
            }
            else if ("TBT-5J".equals(node.toString())) {
                userMech = new TBT_5J();
            }
            else if ("TBT-5K".equals(node.toString())) {
                userMech = new TBT_5K();
            }
            else if ("TBT-5N".equals(node.toString())) {
                userMech = new TBT_5N();
            }
            else if ("TBT-5S".equals(node.toString())) {
                userMech = new TBT_5S();
            }
            else if ("AWS-9M".equals(node.toString())) {
                userMech = new AWS_9M();
            }
            else if ("CDA-3M".equals(node.toString())) {
                userMech = new CDA_3M();
            }
            else if ("CTF-3D".equals(node.toString())) {
                userMech = new CTF_3D();
            }
            else if ("TBT-7M".equals(node.toString())) {
                userMech = new TBT_7M();
            }
            else if ("HBK-5M".equals(node.toString())) {
                userMech = new HBK_5M();
            }
            else if ("HGN-732".equals(node.toString())) {
                userMech = new HGN_732();
            }
            else if ("HGN-733".equals(node.toString())) {
                userMech = new HGN_733();
            }
            else if ("HGN-733C".equals(node.toString())) {
                userMech = new HGN_733C();
            }
            else if ("HGN-733P".equals(node.toString())) {
                userMech = new HGN_733P();
            }
            else if ("HBK-4N".equals(node.toString())) {
                userMech = new HBK_4N();
            }
            else if ("COM-1C".equals(node.toString())) {
                userMech = new COM_1C();
            }
            else if ("COM-5S".equals(node.toString())) {
                userMech = new COM_5S();
            }
            else if ("DRG-5K".equals(node.toString())) {
                userMech = new DRG_5K();
            }
            else if ("AS7-S".equals(node.toString())) {
                userMech = new AS7_S();
            }
            else if ("CPLT-K3".equals(node.toString())) {
                userMech = new CPLT_K3();
            }
            else if ("STK-4P".equals(node.toString())) {
                userMech = new STK_4P();
            }
            else if ("STK-5M".equals(node.toString())) {
                userMech = new STK_5M();
            }
            else if ("STK-5S".equals(node.toString())) {
                userMech = new STK_5S();
            }
            else if ("DRG-5K-DC".equals(node.toString())) {
                userMech = new DRG_5K_DC();
            }
            else if ("CTF-3L".equals(node.toString())) {
                userMech = new CTF_3L();
            }
            else if ("CN9-YLW".equals(node.toString())) {
                userMech = new CN9_YLW();
            }
            else if ("BJ-1".equals(node.toString())) {
                userMech = new BJ_1();
            }
            else if ("BJ-1DB".equals(node.toString())) {
                userMech = new BJ_1DB();
            }
            else if ("BJ-1DC".equals(node.toString())) {
                userMech = new BJ_1DC();
            }
            else if ("BJ-3".equals(node.toString())) {
                userMech = new BJ_3();
            }
            else if ("BJ-1X".equals(node.toString())) {
                userMech = new BJ_1X();
            }
            else if ("JR7-A".equals(node.toString())) {
                userMech = new JR7_A();
            }
            else if ("TBT-3C".equals(node.toString())) {
                userMech = new TBT_3C();
            }
            
            updateHardPointPanel();
            updateMechLab();
        }
    }//GEN-LAST:event_MechListValueChanged

    private void mechTreeButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_mechTreeButtonActionPerformed
        MechTreeDialogBox dlgBox = new MechTreeDialogBox(this, true);
        dlgBox.setLocationRelativeTo(this);
        dlgBox.setVisible(true);
    }//GEN-LAST:event_mechTreeButtonActionPerformed

    private void aboutMenuItemActionPerformed(ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        AboutDialogBox dlgBox = new AboutDialogBox(this, true, mechlabVersion, MWOstage);
        dlgBox.setLocationRelativeTo(this);
        dlgBox.setVisible(true);
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void saveMechMenuItemActionPerformed(ActionEvent evt) {//GEN-FIRST:event_saveMechMenuItemActionPerformed
        class customException extends Exception
        {
            public customException(String message)
            {
                super(message);
            }
        }
        
        try {
            if (Equipment[SELECTED].size() > 0)
                throw new customException("Not all items are placed, file save canceled.");
            if (userTonnage > userMech.getTonnage())
                throw new customException("Tonnage limit exceeded, file save canceled.");
            if (variantTextField.getText().isEmpty())
                throw new customException("No name entered, file save canceled");
            
            DefaultMutableTreeNode node = (DefaultMutableTreeNode) MechList.getLastSelectedPathComponent();
            temp = System.getProperty("user.dir") + "\\Variants\\" + userMech.getChassis() + " " + userMech.getModel() + " " + variantTextField.getText();
            FileOutputStream outFile = new FileOutputStream(temp + ".mbv");
            
            if (node == null)     
                return;

            temp = userMech.getModel();
            
            if (node.isLeaf())
            {
                if ("AS7-D".equals(temp)) {
                    userVariant.mechIndex = (AS7_D_SAVE_INDEX);
                }
                else if ("AS7-D-DC".equals(temp)) {
                    userVariant.mechIndex = (AS7_D_DC_SAVE_INDEX);
                }
                else if ("AS7-K".equals(temp)) {
                    userVariant.mechIndex = (AS7_K_SAVE_INDEX);
                }
                else if ("AS7-RS".equals(temp)) {
                    userVariant.mechIndex = (AS7_RS_SAVE_INDEX);
                }
                else if ("AWS-8Q".equals(temp)) {
                    userVariant.mechIndex = (AWS_8Q_SAVE_INDEX);
                }
                else if ("AWS-8R".equals(temp)) {
                    userVariant.mechIndex = (AWS_8R_SAVE_INDEX);
                }
                else if ("AWS-8T".equals(temp)) {
                    userVariant.mechIndex = (AWS_8T_SAVE_INDEX);
                }
                else if ("AWS-8V".equals(temp)) {
                    userVariant.mechIndex = (AWS_8V_SAVE_INDEX);
                }
                else if ("CTF-1X".equals(temp)) {
                    userVariant.mechIndex = (CTF_1X_SAVE_INDEX);
                }
                else if ("CTF-2X".equals(temp)) {
                    userVariant.mechIndex = (CTF_2X_SAVE_INDEX);
                }
                else if ("CTF-4X".equals(temp)) {
                    userVariant.mechIndex = (CTF_4X_SAVE_INDEX);
                }
                else if ("CPLT-A1".equals(temp)) {
                    userVariant.mechIndex = (CPLT_A1_SAVE_INDEX);
                }
                else if ("CPLT-C1".equals(temp)) {
                    userVariant.mechIndex = (CPLT_C1_SAVE_INDEX);
                }
                else if ("CPLT-C4".equals(temp)) {
                    userVariant.mechIndex = (CPLT_C4_SAVE_INDEX);
                }
                else if ("CPLT-K2".equals(temp)) {
                    userVariant.mechIndex = (CPLT_K2_SAVE_INDEX);
                }
                else if ("CN9-A".equals(temp)) {
                    userVariant.mechIndex = (CN9_A_SAVE_INDEX);
                }
                else if ("CN9-AH".equals(temp)) {
                    userVariant.mechIndex = (CN9_AH_SAVE_INDEX);
                }
                else if ("CN9-AL".equals(temp)) {
                    userVariant.mechIndex = (CN9_AL_SAVE_INDEX);
                }
                else if ("CN9-D".equals(temp)) {
                    userVariant.mechIndex = (CN9_D_SAVE_INDEX);
                }
                else if ("CDA-2A".equals(temp)) {
                    userVariant.mechIndex = (CDA_2A_SAVE_INDEX);
                }
                else if ("CDA-2B".equals(temp)) {
                    userVariant.mechIndex = (CDA_2B_SAVE_INDEX);
                }
                else if ("CDA-3C".equals(temp)) {
                    userVariant.mechIndex = (CDA_3C_SAVE_INDEX);
                }
                else if ("COM-1B".equals(temp)) {
                    userVariant.mechIndex = (COM_1B_SAVE_INDEX);
                }
                else if ("COM-1D".equals(temp)) {
                    userVariant.mechIndex = (COM_1D_SAVE_INDEX);
                }
                else if ("COM-2D".equals(temp)) {
                    userVariant.mechIndex = (COM_2D_SAVE_INDEX);
                }
                else if ("COM-3A".equals(temp)) {
                    userVariant.mechIndex = (COM_3A_SAVE_INDEX);
                }
                else if ("DGN-1C".equals(temp)) {
                    userVariant.mechIndex = (DGN_1C_SAVE_INDEX);
                }
                else if ("DGN-1N".equals(temp)) {
                    userVariant.mechIndex = (DGN_1N_SAVE_INDEX);
                }
                else if ("DGN-5N".equals(temp)) {
                    userVariant.mechIndex = (DGN_5N_SAVE_INDEX);
                }
                else if ("HBK-4G".equals(temp)) {
                    userVariant.mechIndex = (HBK_4G_SAVE_INDEX);
                }
                else if ("HBK-4H".equals(temp)) {
                    userVariant.mechIndex = (HBK_4H_SAVE_INDEX);
                }
                else if ("HBK-4J".equals(temp)) {
                    userVariant.mechIndex = (HBK_4J_SAVE_INDEX);
                }
                else if ("HBK-4P".equals(temp)) {
                    userVariant.mechIndex = (HBK_4P_SAVE_INDEX);
                }
                else if ("HBK-4SP".equals(temp)) {
                    userVariant.mechIndex = (HBK_4SP_SAVE_INDEX);
                }
                else if ("JM6-A".equals(temp)) {
                    userVariant.mechIndex = (JM6_A_SAVE_INDEX);
                }
                else if ("JM6-DD".equals(temp)) {
                    userVariant.mechIndex = (JM6_DD_SAVE_INDEX);
                }
                else if ("JM6-S".equals(temp)) {
                    userVariant.mechIndex = (JM6_S_SAVE_INDEX);
                }
                else if ("JR7-A".equals(temp)) {
                    userVariant.mechIndex = (JR7_A_SAVE_INDEX);
                }
                else if ("JR7-D".equals(temp)) {
                    userVariant.mechIndex = (JR7_D_SAVE_INDEX);
                }
                else if ("JR7-F".equals(temp)) {
                    userVariant.mechIndex = (JR7_F_SAVE_INDEX);
                }
                else if ("JR7-K".equals(temp)) {
                    userVariant.mechIndex = (JR7_K_SAVE_INDEX);
                }
                else if ("RVN-2X".equals(temp)) {
                    userVariant.mechIndex = (RVN_2X_SAVE_INDEX);
                }
                else if ("RVN-3L".equals(temp)) {
                    userVariant.mechIndex = (RVN_3L_SAVE_INDEX);
                }
                else if ("RVN-4X".equals(temp)) {
                    userVariant.mechIndex = (RVN_4X_SAVE_INDEX);
                }
                else if ("SDR-5D".equals(temp)) {
                    userVariant.mechIndex = (SDR_5D_SAVE_INDEX);
                }
                else if ("SDR-5K".equals(temp)) {
                    userVariant.mechIndex = (SDR_5K_SAVE_INDEX);
                }
                else if ("SDR-5V".equals(temp)) {
                    userVariant.mechIndex = (SDR_5V_SAVE_INDEX);
                }
                else if ("STK-3F".equals(temp)) {
                    userVariant.mechIndex = (STK_3F_SAVE_INDEX);
                }
                else if ("STK-3H".equals(temp)) {
                    userVariant.mechIndex = (STK_3H_SAVE_INDEX);
                }
                else if ("STK-4N".equals(temp)) {
                    userVariant.mechIndex = (STK_4N_SAVE_INDEX);
                }
                else if ("TBT-5J".equals(temp)) {
                    userVariant.mechIndex = (TBT_5J_SAVE_INDEX);
                }
                else if ("TBT-5K".equals(temp)) {
                    userVariant.mechIndex = (TBT_5K_SAVE_INDEX);
                }
                else if ("TBT-5N".equals(temp)) {
                    userVariant.mechIndex = (TBT_5N_SAVE_INDEX);
                }
                else if ("TBT-5S".equals(temp)) {
                    userVariant.mechIndex = (TBT_5S_SAVE_INDEX);
                }
                else if ("AWS-9M".equals(temp)) {
                    userVariant.mechIndex = (AWS_9M_SAVE_INDEX);
                }
                else if ("CDA-3M".equals(temp)) {
                    userVariant.mechIndex = (CDA_3M_SAVE_INDEX);
                }
                else if ("DRG-1G".equals(temp)) {
                    userVariant.mechIndex = (DRG_1G_SAVE_INDEX);
                }
                else if ("FLE-4".equals(temp)) {
                    userVariant.mechIndex = (FLE_4_SAVE_INDEX);
                }
                else if ("FLE-15".equals(temp)) {
                    userVariant.mechIndex = (FLE_15_SAVE_INDEX);
                }
                else if ("FLE-17".equals(temp)) {
                    userVariant.mechIndex = (FLE_17_SAVE_INDEX);
                }
                else if ("CTF-3D".equals(temp)) {
                    userVariant.mechIndex = (CTF_3D_SAVE_INDEX);
                }
                else if ("TBT-7M".equals(temp)) {
                    userVariant.mechIndex = (TBT_7M_SAVE_INDEX);
                }
                else if ("HBK-5M".equals(temp)) {
                    userVariant.mechIndex = HBK_5M_SAVE_INDEX;
                }
                else if ("HGN-732".equals(temp)) {
                    userVariant.mechIndex = HGN_732_SAVE_INDEX;
                }
                else if ("HGN-733".equals(temp)) {
                    userVariant.mechIndex = HGN_733_SAVE_INDEX;
                }
                else if ("HGN-733C".equals(temp)) {
                    userVariant.mechIndex = HGN_733C_SAVE_INDEX;
                }
                else if ("HGN-733P".equals(temp)) {
                    userVariant.mechIndex = HGN_733P_SAVE_INDEX;
                }
                else if ("HBK-4N".equals(temp)) {
                    userVariant.mechIndex = HBK_4N_SAVE_INDEX;
                }
                else if ("COM-1C".equals(temp)) {
                    userVariant.mechIndex = COM_1C_SAVE_INDEX;
                }
                else if ("COM-5S".equals(temp)) {
                    userVariant.mechIndex = COM_5S_SAVE_INDEX;
                }
                else if ("DRG-5K".equals(temp)) {
                    userVariant.mechIndex = DRG_5K_SAVE_INDEX;
                }
                else if ("AS7-S".equals(temp)) {
                    userVariant.mechIndex = AS7_S_SAVE_INDEX;
                }
                else if ("CPLT-K3".equals(temp)) {
                    userVariant.mechIndex = CPLT_K3_SAVE_INDEX;
                }
                else if ("STK-4P".equals(temp)) {
                    userVariant.mechIndex = STK_4P_SAVE_INDEX;
                }
                else if ("STK-5M".equals(temp)) {
                    userVariant.mechIndex = STK_5M_SAVE_INDEX;
                }
                else if ("STK-5S".equals(temp)) {
                    userVariant.mechIndex = STK_5S_SAVE_INDEX;
                }
                else if ("DRG-5K-DC".equals(temp)) {
                    userVariant.mechIndex = DRG_5K_DC_SAVE_INDEX;
                }
                else if ("CTF-3L".equals(temp)) {
                    userVariant.mechIndex = CTF_3L_SAVE_INDEX;
                }
                else if ("CN9-YLW".equals(temp)) {
                    userVariant.mechIndex = CN9_YLW_SAVE_INDEX;
                }
                else if ("TBT-3C".equals(temp)) {
                    userVariant.mechIndex = TBT_3C_SAVE_INDEX;
                }
                else if ("BJ-1".equals(temp)) {
                    userVariant.mechIndex = BJ_1_SAVE_INDEX;
                }
                else if ("BJ-1X".equals(temp)) {
                    userVariant.mechIndex = BJ_1X_SAVE_INDEX;
                }
                else if ("BJ-1DB".equals(temp)) {
                    userVariant.mechIndex = BJ_1DB_SAVE_INDEX;
                }
                else if ("BJ-1DC".equals(temp)) {
                    userVariant.mechIndex = BJ_1DC_SAVE_INDEX;
                }
                else if ("BJ-3".equals(temp)) {
                    userVariant.mechIndex = BJ_3_SAVE_INDEX;
                }
                else if ("JR7-A".equals(temp)) {
                    userVariant.mechIndex = JR7_A_SAVE_INDEX;
                }
            }
            
            userVariant.hasXLEngine = engineTypeToggleButton.isSelected();
            
            userVariant.hasFerroFibrous = armorTypeToggleButton.isSelected();
            
            userVariant.hasEndoSteel = internalTypeToggleButton.isSelected();
            
            userVariant.hasDoubleHS = heatSinkTypeToggleButton.isSelected();
            
            userVariant.variantName = variantTextField.getText();
            
            ObjectOutputStream out = new ObjectOutputStream(outFile);
            out.writeObject(userVariant);
            
            out.close();
            outFile.close();
            JOptionPane.showMessageDialog(this, "Variant Saved");
        }
        catch (FileNotFoundException e)
        {   JOptionPane.showMessageDialog(this, "File Not Found Error: " + e.getMessage());    }
        catch (SecurityException e)
        {   JOptionPane.showMessageDialog(this, "Permission Error: Program has insufficient priveleges to write to the file.");    }
        catch (IOException e)
        {   JOptionPane.showMessageDialog(this, "IO Error: " + e.getMessage());    }
        catch (NullPointerException e)
        {   JOptionPane.showMessageDialog(this, "Null Pointer Error: Variant Class was not instanced.");    }
        catch (customException e)
        {   JOptionPane.showMessageDialog(this, e.getMessage());    }
        catch (Exception e)
        {   JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());    }
        
    }//GEN-LAST:event_saveMechMenuItemActionPerformed
    
    private void exportMechMenuItemActionPerformed(ActionEvent evt) {//GEN-FIRST:event_exportMechMenuItemActionPerformed
        class customException extends Exception {
            public customException(String message) {
                super(message);
            }
        }
        
        try
        {
            if (Equipment[SELECTED].size() > 0)
                throw new customException("Not all items are placed, file export canceled.");
            if (userTonnage > userMech.getTonnage())
                throw new customException("Tonnage limit exceeded, file export canceled.");
            if (variantTextField.getText().isEmpty())
                throw new customException("No name entered, file export canceled");
            FileWriter fstream = new FileWriter(userMech.getChassis() + " " + userMech.getModel() + " " + variantTextField.getText() + ".txt");
            BufferedWriter out = new BufferedWriter(fstream);
            //<editor-fold desc="Base Info">
            out.write("Chassis Name: " + userMech.getChassis());
            out.newLine();
            out.write("Model Name: " + userMech.getModel());
            out.newLine();
            out.write("Variant Name: " + variantTextField.getText());
            out.newLine();
            //</editor-fold>
            //<editor-fold desc="Cost Readout">
            out.newLine();
            temp = String.format("Engine Cost: %,d C-Bills", new Engine(userMech.hasXLEngine(), userVariant.engineRating).getCost());
            out.write(temp);
            out.newLine();
            if (userVariant.engineHeatSinks < 10) {
                temp = String.format("Heat Sink Cost: %,d C-Bills", new Heat_Sink(userMech.hasDoubleHeatSinks()).getCost() * (userVariant.heatSinks - userVariant.engineHeatSinks));
                out.write(temp);
            }
            else {
                temp = String.format("Heat Sink Cost: %,d C-Bills", new Heat_Sink(userMech.hasDoubleHeatSinks()).getCost() * (userVariant.heatSinks - 10));
                out.write(temp);
            }
            out.newLine();
            temp = String.format("Armor Cost: %,d C-Bills", new Armor(userMech.hasFerroFibrous(), userVariant.getTotalArmor()).getCost());
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
            out.write("Engine: " + userVariant.engineRating + " " + engineTypeToggleButton.getText());
            out.newLine();
            out.write("Internal Type: " + internalTypeToggleButton.getText());
            out.newLine();
            out.write("Armor Type: " + armorTypeToggleButton.getText());
            out.newLine();
            if (heatSinkTypeToggleButton.isSelected())
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
            out.newLine();
            out.write("Alpha Strike Damage: " + alphaStrikeProgressBar.getString());
            out.newLine();
            out.write("Alpha Strike Heat: " + alphaStrikeHeatProgressBar.getString());
            out.newLine();
            out.write("Firepower: " + firepowerProgressBar.getString());
            out.newLine();
            out.write("Heat Efficiency: " + heatEfficiencyProgressBar.getString());
            out.newLine();
            out.write("Effective Range of Loadout: " + rangeProgressBar.getString());
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
            out.write("Right Arm: " + rightArmArmorLabel.getText());
            out.newLine();
            out.write("Left Arm: " + leftArmArmorLabel.getText());
            out.newLine();
            out.write("Right Leg: " + rightLegArmorLabel.getText());
            out.newLine();
            out.write("Left Leg: " + leftLegArmorLabel.getText());
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
        catch (Exception e)
        {   JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());    }
    }//GEN-LAST:event_exportMechMenuItemActionPerformed

    private void loadMechMenuItemActionPerformed(ActionEvent evt) {//GEN-FIRST:event_loadMechMenuItemActionPerformed
        class customException extends Exception
        {
            public customException(String message)
            {
                super(message);
            }
        }
        
        JFileChooser openFileDlg = new JFileChooser();
        openFileDlg.setFileFilter(new FileNameExtensionFilter("Mechbay Variants","mbv"));
        openFileDlg.setAcceptAllFileFilterUsed(false);
        openFileDlg.setCurrentDirectory(new File(System.getProperty("user.dir")));//"C:\\Users\\Nemesis\\Documents\\NetBeansProjects\\MWOMechLab\\Variants"
        openFileDlg.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int returnVal = openFileDlg.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION)
        {
            File file = openFileDlg.getSelectedFile();
            try {
                FileInputStream inFile = new FileInputStream(file.getPath());
                ObjectInputStream in = new ObjectInputStream(inFile);
                userVariant = (Variant)in.readObject();
                
                if (userVariant.mechIndex == AS7_D_SAVE_INDEX) {
                    userMech = new AS7_D();
                }
                else if (userVariant.mechIndex == AS7_D_DC_SAVE_INDEX) {
                    userMech = new AS7_D_DC();
                }
                else if (userVariant.mechIndex == AS7_K_SAVE_INDEX) {
                    userMech = new AS7_K();
                }
                else if (userVariant.mechIndex == AS7_RS_SAVE_INDEX) {
                    userMech = new AS7_RS();
                }
                else if (userVariant.mechIndex == AWS_8Q_SAVE_INDEX) {
                    userMech = new AWS_8Q();
                }
                else if (userVariant.mechIndex == AWS_8R_SAVE_INDEX) {
                    userMech = new AWS_8R();
                }
                else if (userVariant.mechIndex == AWS_8T_SAVE_INDEX) {
                    userMech = new AWS_8T();
                }
                else if (userVariant.mechIndex == AWS_8V_SAVE_INDEX) {
                    userMech = new AWS_8V();
                }
                else if (userVariant.mechIndex == CTF_1X_SAVE_INDEX) {
                    userMech = new CTF_1X();
                }
                else if (userVariant.mechIndex == CTF_2X_SAVE_INDEX) {
                    userMech = new CTF_2X();
                }
                else if (userVariant.mechIndex == CTF_4X_SAVE_INDEX) {
                    userMech = new CTF_4X();
                }
                else if (userVariant.mechIndex == CPLT_A1_SAVE_INDEX) {
                    userMech = new CPLT_A1();
                }
                else if (userVariant.mechIndex == CPLT_C1_SAVE_INDEX) {
                    userMech = new CPLT_C1();
                }
                else if (userVariant.mechIndex == CPLT_C4_SAVE_INDEX) {
                    userMech = new CPLT_C4();
                }
                else if (userVariant.mechIndex == CPLT_K2_SAVE_INDEX) {
                    userMech = new CPLT_K2();
                }
                else if (userVariant.mechIndex == CN9_A_SAVE_INDEX) {
                    userMech = new CN9_A();
                }
                else if (userVariant.mechIndex == CN9_AH_SAVE_INDEX) {
                    userMech = new CN9_AH();
                }
                else if (userVariant.mechIndex == CN9_AL_SAVE_INDEX) {
                    userMech = new CN9_AL();
                }
                else if (userVariant.mechIndex == CN9_D_SAVE_INDEX) {
                    userMech = new CN9_D();
                }
                else if (userVariant.mechIndex == CDA_2A_SAVE_INDEX) {
                    userMech = new CDA_2A();
                }
                else if (userVariant.mechIndex == CDA_2B_SAVE_INDEX) {
                    userMech = new CDA_2B();
                }
                else if (userVariant.mechIndex == CDA_3C_SAVE_INDEX) {
                    userMech = new CDA_3C();
                }
                else if (userVariant.mechIndex == COM_1B_SAVE_INDEX) {
                    userMech = new COM_1B();
                }
                else if (userVariant.mechIndex == COM_1D_SAVE_INDEX) {
                    userMech = new COM_1D();
                }
                else if (userVariant.mechIndex == COM_2D_SAVE_INDEX) {
                    userMech = new COM_2D();
                }
                else if (userVariant.mechIndex == COM_3A_SAVE_INDEX) {
                    userMech = new COM_3A();
                }
                else if (userVariant.mechIndex == DGN_1C_SAVE_INDEX) {
                    userMech = new DGN_1C();
                }
                else if (userVariant.mechIndex == DGN_1N_SAVE_INDEX) {
                    userMech = new DGN_1N();
                }
                else if (userVariant.mechIndex == DGN_5N_SAVE_INDEX) {
                    userMech = new DGN_5N();
                }
                else if (userVariant.mechIndex == HBK_4G_SAVE_INDEX) {
                    userMech = new NMS_1X();
                }
                else if (userVariant.mechIndex == HBK_4H_SAVE_INDEX) {
                    userMech = new HBK_4H();
                }
                else if (userVariant.mechIndex == HBK_4J_SAVE_INDEX) {
                    userMech = new HBK_4J();
                }
                else if (userVariant.mechIndex == HBK_4P_SAVE_INDEX) {
                    userMech = new HBK_4P();
                }
                else if (userVariant.mechIndex == HBK_4SP_SAVE_INDEX) {
                    userMech = new HBK_4SP();
                }
                else if (userVariant.mechIndex == JM6_A_SAVE_INDEX) {
                    userMech = new JM6_A();
                }
                else if (userVariant.mechIndex == JM6_DD_SAVE_INDEX) {
                    userMech = new JM6_DD();
                }
                else if (userVariant.mechIndex == JM6_S_SAVE_INDEX) {
                    userMech = new JM6_S();
                }
                else if (userVariant.mechIndex == JR7_D_SAVE_INDEX) {
                    userMech = new JR7_D();
                }
                else if (userVariant.mechIndex == JR7_F_SAVE_INDEX) {
                    userMech = new JR7_F();
                }
                else if (userVariant.mechIndex == JR7_K_SAVE_INDEX) {
                    userMech = new JR7_K();
                }
                else if (userVariant.mechIndex == RVN_2X_SAVE_INDEX) {
                    userMech = new RVN_2X();
                }
                else if (userVariant.mechIndex == RVN_3L_SAVE_INDEX) {
                    userMech = new RVN_3L();
                }
                else if (userVariant.mechIndex == RVN_4X_SAVE_INDEX) {
                    userMech = new RVN_4X();
                }
                else if (userVariant.mechIndex == SDR_5D_SAVE_INDEX) {
                    userMech = new SDR_5D();
                }
                else if (userVariant.mechIndex == SDR_5K_SAVE_INDEX) {
                    userMech = new SDR_5K();
                }
                else if (userVariant.mechIndex == SDR_5V_SAVE_INDEX) {
                    userMech = new SDR_5V();
                }
                else if (userVariant.mechIndex == STK_3F_SAVE_INDEX) {
                    userMech = new STK_3F();
                }
                else if (userVariant.mechIndex == STK_3H_SAVE_INDEX) {
                    userMech = new STK_3H();
                }
                else if (userVariant.mechIndex == STK_4N_SAVE_INDEX) {
                    userMech = new STK_4N();
                }
                else if (userVariant.mechIndex == TBT_5J_SAVE_INDEX) {
                    userMech = new TBT_5J();
                }
                else if (userVariant.mechIndex == TBT_5K_SAVE_INDEX) {
                    userMech = new TBT_5J();
                }
                else if (userVariant.mechIndex == TBT_5N_SAVE_INDEX) {
                    userMech = new TBT_5N();
                }
                else if (userVariant.mechIndex == TBT_5S_SAVE_INDEX) {
                    userMech = new TBT_5S();
                }
                else if (userVariant.mechIndex == AWS_9M_SAVE_INDEX) {
                    userMech = new AWS_9M();
                }
                else if (userVariant.mechIndex == CDA_3M_SAVE_INDEX) {
                    userMech = new CDA_3M();
                }
                else if (userVariant.mechIndex == DRG_1G_SAVE_INDEX) {
                    userMech = new DRG_1G();
                }
                else if (userVariant.mechIndex == FLE_4_SAVE_INDEX) {
                    userMech = new FLE_4();
                }
                else if (userVariant.mechIndex == FLE_15_SAVE_INDEX) {
                    userMech = new FLE_15();
                }
                else if (userVariant.mechIndex == FLE_17_SAVE_INDEX) {
                    userMech = new FLE_17();
                }
                else if (userVariant.mechIndex == CTF_3D_SAVE_INDEX) {
                    userMech = new CTF_3D();
                }
                else if (userVariant.mechIndex == TBT_7M_SAVE_INDEX) {
                    userMech = new TBT_7M();
                }
                else if (userVariant.mechIndex == HBK_5M_SAVE_INDEX) {
                    userMech = new HBK_5M();
                }
                else if (userVariant.mechIndex == HGN_732_SAVE_INDEX) {
                    userMech = new HGN_732();
                }
                else if (userVariant.mechIndex == HGN_733_SAVE_INDEX) {
                    userMech = new HGN_733();
                }
                else if (userVariant.mechIndex == HGN_733C_SAVE_INDEX) {
                    userMech = new HGN_733C();
                }
                else if (userVariant.mechIndex == HGN_733P_SAVE_INDEX) {
                    userMech = new HGN_733P();
                }
                else if (userVariant.mechIndex == HBK_4N_SAVE_INDEX) {
                    userMech = new HBK_4N();
                }
                else if (userVariant.mechIndex == COM_1C_SAVE_INDEX) {
                    userMech = new COM_1C();
                }
                else if (userVariant.mechIndex == COM_5S_SAVE_INDEX) {
                    userMech = new COM_5S();
                }
                else if (userVariant.mechIndex == DRG_5K_SAVE_INDEX) {
                    userMech = new DRG_5K();
                }
                else if (userVariant.mechIndex == AS7_S_SAVE_INDEX) {
                    userMech = new AS7_S();
                }
                else if (userVariant.mechIndex == CPLT_K3_SAVE_INDEX) {
                    userMech = new CPLT_K3();
                }
                else if (userVariant.mechIndex == STK_4P_SAVE_INDEX) {
                    userMech = new STK_4P();
                }
                else if (userVariant.mechIndex == STK_5M_SAVE_INDEX) {
                    userMech = new STK_5M();
                }
                else if (userVariant.mechIndex == STK_5S_SAVE_INDEX) {
                    userMech = new STK_5S();
                }
                else if (userVariant.mechIndex == DRG_5K_DC_SAVE_INDEX) {
                    userMech = new DRG_5K_DC();
                }
                else if (userVariant.mechIndex == CTF_3L_SAVE_INDEX) {
                    userMech = new CTF_3L();
                }
                else if (userVariant.mechIndex == CN9_YLW_SAVE_INDEX) {
                    userMech = new CN9_YLW();
                }
                else if (userVariant.mechIndex == JR7_A_SAVE_INDEX) {
                    userMech = new JR7_A();
                }
                else if (userVariant.mechIndex == TBT_3C_SAVE_INDEX) {
                    userMech = new TBT_3C();
                }
                else if (userVariant.mechIndex == BJ_1_SAVE_INDEX) {
                    userMech = new BJ_1();
                }
                else if (userVariant.mechIndex == BJ_1DB_SAVE_INDEX) {
                    userMech = new BJ_1DB();
                }
                else if (userVariant.mechIndex == BJ_1DC_SAVE_INDEX) {
                    userMech = new BJ_1DC();
                }
                else if (userVariant.mechIndex == BJ_1X_SAVE_INDEX) {
                    userMech = new BJ_1X();
                }
                else if (userVariant.mechIndex == BJ_3_SAVE_INDEX) {
                    userMech = new BJ_3();
                }
                
                initMainInfoPanel();
                updateHardPointPanel();
                
                Equipment[SELECTED].removeAllElements();
                updateItemList();
                
                userTonnage = 0;
                userHeat = 0;
                userFirepower = 0;
                userAlpha = 0;
                userAlphaHeat = 0;
                userRange = 0;
                
                engineTypeToggleButton.setSelected(userVariant.hasXLEngine);
                armorTypeToggleButton.setSelected(userVariant.hasFerroFibrous);
                internalTypeToggleButton.setSelected(userVariant.hasEndoSteel);
                heatSinkTypeToggleButton.setSelected(userVariant.hasDoubleHS);
                ArtemisIVCheckBox.setSelected(userVariant.hasArtemisIV);
                
                engineRatingSpinnerModel.setValue(userVariant.engineRating);
        
                for (int i = Equipment[MISSILE].size() - 1; i >= 0; i--) {
                    Weapon weapon = (Weapon)Equipment[MISSILE].elementAt(i);
                    if (weapon.isArtemisIVCapable())
                        Equipment[MISSILE].removeElementAt(i);
                }

                Equipment[MISSILE].insertElementAt(new SRM6(userVariant.hasArtemisIV), 1);
                Equipment[MISSILE].insertElementAt(new SRM4(userVariant.hasArtemisIV), 1);
                Equipment[MISSILE].insertElementAt(new SRM2(userVariant.hasArtemisIV), 1);
                Equipment[MISSILE].insertElementAt(new LRM20(userVariant.hasArtemisIV), 0);
                Equipment[MISSILE].insertElementAt(new LRM15(userVariant.hasArtemisIV), 0);
                Equipment[MISSILE].insertElementAt(new LRM10(userVariant.hasArtemisIV), 0);
                Equipment[MISSILE].insertElementAt(new LRM5(userVariant.hasArtemisIV), 0);

                missileListModel.removeAllElements();
                for (int i = 0; i < Equipment[MISSILE].size(); i++)
                    missileListModel.addElement(Equipment[MISSILE].elementAt(i).toString());
                
                if (engineTypeToggleButton.isSelected())
                {
                    userTonnage += XLEngineTable[(userVariant.engineRating - 100) / 5][1];
                    engineTypeToggleButton.setText("XL Engine");
                    temp = String.format("%,d C-Bills", (userVariant.engineRating * 16000));
                    EngineCostLabel.setText(temp);
                    temp = String.format("%.1f Tons", (XLEngineTable[(userVariant.engineRating - 100) / 5][1]));
                    EngineWeightLabel.setText(temp);
                }
                else
                {
                    userTonnage += RegEngineTable[(userVariant.engineRating - 100) / 5][1];
                    engineTypeToggleButton.setText("Reg Engine");
                    temp = String.format("%,d C-Bills", (userVariant.engineRating * 4000));
                    EngineCostLabel.setText(temp);
                    temp = String.format("%.1f Tons", (RegEngineTable[(userVariant.engineRating - 100) / 5][1]));
                    EngineWeightLabel.setText(temp);
                }
                
                if (internalTypeToggleButton.isSelected())
                {
                    userTonnage += (userMech.getTonnage() / 20) + (userMech.getTonnage() / 20 % 0.5);
                    internalTypeToggleButton.setText("Endo Steel");
                    temp = String.format("%.2f Tons", (userMech.getTonnage() / 20) + (userMech.getTonnage() / 20 % 0.5));
                    InternalWeightLabel.setText(temp);
                    temp = String.format("%,d C-Bills", ((int)userMech.getTonnage() * 1600));
                    InternalCostLabel.setText(temp);
                }
                else
                {
                    userTonnage += userMech.getTonnage() / 10;
                    internalTypeToggleButton.setText("Std Internals");
                    temp = String.format("%.2f Tons", (userMech.getTonnage() / 10));
                    InternalWeightLabel.setText(temp);
                    temp = String.format("%,d C-Bills", ((int)userMech.getTonnage() * 400));
                    InternalCostLabel.setText(temp);
                }
                
                if (armorTypeToggleButton.isSelected())
                {
                    armorTypeToggleButton.setText("Ferro Fibrous");
                    userVariant.armorPointsPerTon = 35.84;
                    userVariant.armorCostPerTon = 20032;
                }
                else
                {
                    armorTypeToggleButton.setText("Std Armor");
                    userVariant.armorPointsPerTon = 32.0;
                    userVariant.armorCostPerTon = 10016;
                }
                temp = String.format("%.2f", (userMech.getStockTotalArmor() / userVariant.armorPointsPerTon));
                ArmorWeightLabel.setText(temp);
                temp = String.format("%,d C-Bills", ((int)Math.ceil((userMech.getStockTotalArmor() / userVariant.armorPointsPerTon)) * userVariant.armorCostPerTon));
                ArmorCostLabel.setText(temp);
        
                double engineMod;

                if (userMech.getTonnage() > 55)
                    engineMod = 1.2;
                else if (userMech.getTonnage() > 35)
                    engineMod = 1.3;
                else
                    engineMod = 1.4;

                if (userMech.getStockEngineRating() * engineMod >= 400 && userMech.getTonnage() * 8.6 >= 400)
                    total = 400;
                else if (userMech.getTonnage() * 8.6 < userMech.getStockEngineRating() * engineMod)
                    total = (int) ((userMech.getTonnage() * 8.6) - (userMech.getTonnage() * 8.6) % 5);
                else
                    total = (int) (Math.ceil((userMech.getStockEngineRating() * engineMod) / 5) * 5);
                
                engineRatingSpinnerModel.setMaximum(total);
                
                if ((int)(userMech.getTonnage() * 2) < 100)
                    engineRatingSpinnerModel.setMinimum(100);
                else
                    engineRatingSpinnerModel.setMinimum((int)(userMech.getTonnage() * 2));
        
                if (heatSinkTypeToggleButton.isSelected())
                {
                    HeatDissapationLabel.setText("" + (userVariant.heatSinks * DOUBLE_HEAT_SINK_DISSIPATION));
                    temp = String.format("%,d C-Bills", (userVariant.heatSinks * 6000));
                    HeatSinkCostLabel.setText(temp);
                    heatSinkTypeToggleButton.setText("Dbl HS");
                }
                else
                {
                    HeatDissapationLabel.setText("" + userVariant.heatSinks);
                    temp = String.format("%,d C-Bills", (userVariant.heatSinks * 2000));
                    HeatSinkCostLabel.setText(temp);
                    heatSinkTypeToggleButton.setText("Sd HS");
                }
                
                jumpJetSpinnerModel.setValue(userVariant.jumpJets);
                updateJumpJets();
                JumpJetPanel.setEnabled(userMech.hasJumpJets());
                JumpJetPanel.setVisible(userMech.hasJumpJets());
                
                if (userMech.getTonnage() > 85)
                    userTonnage += 2.0 * userVariant.jumpJets;
                else if (userMech.getTonnage() > 55)
                    userTonnage += 1.0 * userVariant.jumpJets;
                else
                    userTonnage += 0.5 * userVariant.jumpJets;
                
                heatSinkSpinnerModel.setValue(userVariant.heatSinks);
                
                if (userVariant.engineHeatSinks > 10)
                    userTonnage += (userVariant.heatSinks - 10);
                else
                    userTonnage += (userVariant.heatSinks - userVariant.engineHeatSinks);
                
                int temp1;
                headArmorSpinnerModel.setValue(userVariant.armor[HEAD]);
                temp1 = userVariant.armor[RIGHT_REAR_TORSO];
                rightTorsoArmorSpinnerModel.setValue(userVariant.armor[RIGHT_TORSO]);
                rightRearTorsoArmorSpinnerModel.setValue(temp1);
                temp1 = userVariant.armor[LEFT_REAR_TORSO];
                leftTorsoArmorSpinnerModel.setValue(userVariant.armor[LEFT_TORSO]);
                leftRearTorsoArmorSpinnerModel.setValue(temp1);
                temp1 = userVariant.armor[CENTER_REAR_TORSO];
                centerTorsoArmorSpinnerModel.setValue(userVariant.armor[CENTER_TORSO]);
                centerRearTorsoArmorSpinnerModel.setValue(temp1);
                rightArmArmorSpinnerModel.setValue(userVariant.armor[RIGHT_ARM]);
                leftArmArmorSpinnerModel.setValue(userVariant.armor[LEFT_ARM]);
                rightLegArmorSpinnerModel.setValue(userVariant.armor[RIGHT_LEG]);
                leftLegArmorSpinnerModel.setValue(userVariant.armor[LEFT_LEG]);
                
                total = 0;
                for (int i = 0; i < NUMBER_OF_SECTIONS; i++)
                    total += userVariant.armor[i];
                
                userTonnage += (total / userVariant.armorPointsPerTon);
                
                variantTextField.setText(userVariant.variantName);
                
                for (int i = 0; i < NUMBER_OF_CRITICAL_SECTIONS; i++)
                    for (int j = 0; j < userVariant.items[i].size(); j++)
                    {
                        if (userVariant.items[i].elementAt(j).getItemType() == WEAPON_ITEM_TYPE)
                        {
                            Weapon weapon = (Weapon)userVariant.items[i].elementAt(j);
                            userHeat += weapon.getHeatPerSecond();
                            userFirepower += weapon.getDamagePerSecond();
                            userAlpha += weapon.getDamage();
                            userAlphaHeat += weapon.getHeat();
                            userTonnage += weapon.getTonnage();
                        }
                        else if (userVariant.items[i].elementAt(j).getItemType() == AMMO_ITEM_TYPE)
                        {
                            AmmoBin ammo = (AmmoBin) userVariant.items[i].elementAt(j);
                            userTonnage += ammo.getTonnage();
                        }
                        else if (userVariant.items[i].elementAt(j).getItemType() == CASE_ITEM_TYPE)
                        {
                            Component other = (Component) userVariant.items[i].elementAt(j);
                            userTonnage += other.getTonnage();
                        }
                        else if (userVariant.items[i].elementAt(j).getItemType() == EQUIPMENT_ITEM_TYPE)
                        {
                            Special_Equipment other = (Special_Equipment) userVariant.items[i].elementAt(j);
                            userTonnage += other.getTonnage();
                            
                            if (other.toString() == "MASC")
                                MASCCheckBox.setSelected(true);
                        }
                        else if (userVariant.items[i].elementAt(j).getItemType() == COMPONENT_ITEM_TYPE)
                        {
                            Component other = (Component) userVariant.items[i].elementAt(j);
                            if (other.getEquipmentName() == "Command Console")
                                userTonnage += 3;
                        }
                    }
                
                updateArmorLabels();
                updateCurrentArmor();
                updateTonnageProgressBar();
                updateFirepowerProgressBar();
                updateAlphaProgressBar();
                updateAlphaHeatProgressBar();
                updateRangeProgressBar();
                updateHeatProgressBar();
                updateSpeedProgressBar();
                userSection = CENTER_TORSO;
                updateCriticalhardpoints(userSection);
                loadCriticals();
                
                in.close();
                inFile.close();
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
    }//GEN-LAST:event_loadMechMenuItemActionPerformed
    private void headArmorSpinnerStateChanged(ChangeEvent evt) {//GEN-FIRST:event_headArmorSpinnerStateChanged
        int temp1 = userVariant.armor[HEAD];
        userVariant.armor[HEAD] = Integer.parseInt(headArmorSpinner.getValue().toString());
        userTonnage += ((double)(userVariant.armor[HEAD] - temp1) / userVariant.armorPointsPerTon);
        updateArmorLabels();
    }//GEN-LAST:event_headArmorSpinnerStateChanged
    private void leftLegArmorSpinnerStateChanged(ChangeEvent evt) {//GEN-FIRST:event_leftLegArmorSpinnerStateChanged
        int temp1 = userVariant.armor[LEFT_LEG];
        userVariant.armor[LEFT_LEG] = Integer.parseInt(leftLegArmorSpinner.getValue().toString());
        userTonnage += ((double)(userVariant.armor[LEFT_LEG] - temp1) / userVariant.armorPointsPerTon);
        updateArmorLabels();
    }//GEN-LAST:event_leftLegArmorSpinnerStateChanged
    private void rightLegArmorSpinnerStateChanged(ChangeEvent evt) {//GEN-FIRST:event_rightLegArmorSpinnerStateChanged
        int temp1 = userVariant.armor[RIGHT_LEG];
        userVariant.armor[RIGHT_LEG] = Integer.parseInt(rightLegArmorSpinner.getValue().toString());
        userTonnage += ((double)(userVariant.armor[RIGHT_LEG] - temp1) / userVariant.armorPointsPerTon);
        updateArmorLabels();
    }//GEN-LAST:event_rightLegArmorSpinnerStateChanged
    private void leftArmArmorSpinnerStateChanged(ChangeEvent evt) {//GEN-FIRST:event_leftArmArmorSpinnerStateChanged
        int temp1 = userVariant.armor[LEFT_ARM];
        userVariant.armor[LEFT_ARM] = Integer.parseInt(leftArmArmorSpinner.getValue().toString());
        userTonnage += ((double)(userVariant.armor[LEFT_ARM] - temp1) / userVariant.armorPointsPerTon);
        updateArmorLabels();
    }//GEN-LAST:event_leftArmArmorSpinnerStateChanged
    private void rightArmArmorSpinnerStateChanged(ChangeEvent evt) {//GEN-FIRST:event_rightArmArmorSpinnerStateChanged
        int temp1 = userVariant.armor[RIGHT_ARM];
        userVariant.armor[RIGHT_ARM] = Integer.parseInt(rightArmArmorSpinner.getValue().toString());
        userTonnage += ((double)(userVariant.armor[RIGHT_ARM] - temp1) / userVariant.armorPointsPerTon);
        updateArmorLabels();
    }//GEN-LAST:event_rightArmArmorSpinnerStateChanged
    private void leftTorsoArmorSpinnerStateChanged(ChangeEvent evt) {//GEN-FIRST:event_leftTorsoArmorSpinnerStateChanged
        int temp1 = userVariant.armor[LEFT_TORSO];
        int temp2 = userVariant.armor[LEFT_REAR_TORSO];
        userVariant.armor[LEFT_TORSO] = Integer.parseInt(leftTorsoArmorSpinner.getValue().toString());
        userVariant.armor[LEFT_REAR_TORSO] = Integer.parseInt(leftRearTorsoArmorSpinner.getValue().toString());
        leftTorsoArmorSpinnerModel.setMaximum(userMech.getMaxArmor(LEFT_TORSO) - userVariant.armor[LEFT_REAR_TORSO]);
        leftRearTorsoArmorSpinnerModel.setMaximum(userMech.getMaxArmor(LEFT_TORSO) - userVariant.armor[LEFT_TORSO]);
        userTonnage += ((double)(userVariant.armor[LEFT_TORSO] - temp1) / userVariant.armorPointsPerTon);
        userTonnage += ((double)(userVariant.armor[LEFT_REAR_TORSO] - temp2) / userVariant.armorPointsPerTon);
        updateArmorLabels();
    }//GEN-LAST:event_leftTorsoArmorSpinnerStateChanged
    private void centerTorsoArmorSpinnerStateChanged(ChangeEvent evt) {//GEN-FIRST:event_centerTorsoArmorSpinnerStateChanged
        int temp1 = userVariant.armor[CENTER_TORSO];
        int temp2 = userVariant.armor[CENTER_REAR_TORSO];
        userVariant.armor[CENTER_TORSO] = Integer.parseInt(centerTorsoArmorSpinner.getValue().toString());
        userVariant.armor[CENTER_REAR_TORSO] = Integer.parseInt(centerRearTorsoArmorSpinner.getValue().toString());
        centerTorsoArmorSpinnerModel.setMaximum(userMech.getMaxArmor(CENTER_TORSO) - userVariant.armor[CENTER_REAR_TORSO]);
        centerRearTorsoArmorSpinnerModel.setMaximum(userMech.getMaxArmor(CENTER_TORSO) - userVariant.armor[CENTER_TORSO]);
        userTonnage += ((double)(userVariant.armor[CENTER_TORSO] - temp1) / userVariant.armorPointsPerTon);
        userTonnage += ((double)(userVariant.armor[CENTER_REAR_TORSO] - temp2) / userVariant.armorPointsPerTon);
        updateArmorLabels();
    }//GEN-LAST:event_centerTorsoArmorSpinnerStateChanged
    private void rightTorsoArmorSpinnerStateChanged(ChangeEvent evt) {//GEN-FIRST:event_rightTorsoArmorSpinnerStateChanged
        int temp1 = userVariant.armor[RIGHT_TORSO];
        int temp2 = userVariant.armor[RIGHT_REAR_TORSO];
        userVariant.armor[RIGHT_TORSO] = Integer.parseInt(rightTorsoArmorSpinner.getValue().toString());
        userVariant.armor[RIGHT_REAR_TORSO] = Integer.parseInt(rightRearTorsoArmorSpinner.getValue().toString());
        rightTorsoArmorSpinnerModel.setMaximum(userMech.getMaxArmor(RIGHT_TORSO) - userVariant.armor[RIGHT_REAR_TORSO]);
        rightRearTorsoArmorSpinnerModel.setMaximum(userMech.getMaxArmor(RIGHT_TORSO) - userVariant.armor[RIGHT_TORSO]);
        userTonnage += ((double)(userVariant.armor[RIGHT_TORSO] - temp1) / userVariant.armorPointsPerTon);
        userTonnage += ((double)(userVariant.armor[RIGHT_REAR_TORSO] - temp2) / userVariant.armorPointsPerTon);
        updateArmorLabels();
    }//GEN-LAST:event_rightTorsoArmorSpinnerStateChanged

    private void moduleButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_moduleButtonActionPerformed
        PilotTreeDialogBox dlgBox = new PilotTreeDialogBox(this, true);
        dlgBox.setLocationRelativeTo(this);
        dlgBox.setVisible(true);
    }//GEN-LAST:event_moduleButtonActionPerformed

    private void headSnapButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_headSnapButtonActionPerformed
        sectionCritcalLabel.setText("Head");
        userSection = HEAD;
        caseCheckBox.setVisible(false);
        caseCheckBox.setEnabled(false);
        loadCriticals();
        updateCriticalhardpoints(HEAD);
        criticalList.setVisibleRowCount(NUMBER_OF_LESSER_SECTION_CRITICALS);
    }//GEN-LAST:event_headSnapButtonActionPerformed
    private void rightTorsoSnapButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_rightTorsoSnapButtonActionPerformed
        sectionCritcalLabel.setText("Right Torso");
        userSection = RIGHT_TORSO;
        caseCheckBox.setVisible(true);
        caseCheckBox.setEnabled(true);
        for (int i = 0; i < userVariant.items[userSection].size(); i++)
        {
            if (userVariant.items[userSection].elementAt(i).getEquipmentName() == "CASE")
                caseCheckBox.setSelected(true);
            else
                caseCheckBox.setSelected(false);
        }
        loadCriticals();
        updateCriticalhardpoints(RIGHT_TORSO);
        criticalList.setVisibleRowCount(NUMBER_OF_MAIN_SECTION_CRITICALS);
    }//GEN-LAST:event_rightTorsoSnapButtonActionPerformed
    private void leftTorsoSnapButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_leftTorsoSnapButtonActionPerformed
        sectionCritcalLabel.setText("Left Torso");
        userSection = LEFT_TORSO;
        caseCheckBox.setVisible(true);
        caseCheckBox.setEnabled(true);
        for (int i = 0; i < userVariant.items[userSection].size(); i++)
        {
            if (userVariant.items[userSection].elementAt(i).getEquipmentName() == "CASE")
                caseCheckBox.setSelected(true);
            else
                caseCheckBox.setSelected(false);
        }
        loadCriticals();
        updateCriticalhardpoints(LEFT_TORSO);
        criticalList.setVisibleRowCount(NUMBER_OF_MAIN_SECTION_CRITICALS);
    }//GEN-LAST:event_leftTorsoSnapButtonActionPerformed
    private void centerTorsoSnapButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_centerTorsoSnapButtonActionPerformed
        sectionCritcalLabel.setText("Center Torso");
        userSection = CENTER_TORSO;
        caseCheckBox.setVisible(false);
        caseCheckBox.setEnabled(false);
        loadCriticals();
        updateCriticalhardpoints(CENTER_TORSO);
        criticalList.setVisibleRowCount(NUMBER_OF_MAIN_SECTION_CRITICALS);
    }//GEN-LAST:event_centerTorsoSnapButtonActionPerformed
    private void rightArmSnapButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_rightArmSnapButtonActionPerformed
        sectionCritcalLabel.setText("Right Arm");
        userSection = RIGHT_ARM;
        caseCheckBox.setVisible(false);
        caseCheckBox.setEnabled(false);
        loadCriticals();
        updateCriticalhardpoints(RIGHT_ARM);
        criticalList.setVisibleRowCount(NUMBER_OF_MAIN_SECTION_CRITICALS);
    }//GEN-LAST:event_rightArmSnapButtonActionPerformed
    private void leftArmSnapButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_leftArmSnapButtonActionPerformed
        sectionCritcalLabel.setText("Left Arm");
        userSection = LEFT_ARM;
        caseCheckBox.setVisible(false);
        caseCheckBox.setEnabled(false);
        loadCriticals();
        updateCriticalhardpoints(LEFT_ARM);
        criticalList.setVisibleRowCount(NUMBER_OF_MAIN_SECTION_CRITICALS);
    }//GEN-LAST:event_leftArmSnapButtonActionPerformed
    private void rightLegSnapButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_rightLegSnapButtonActionPerformed
        sectionCritcalLabel.setText("Right Leg");
        userSection = RIGHT_LEG;
        caseCheckBox.setVisible(false);
        caseCheckBox.setEnabled(false);
        loadCriticals();
        updateLesserCriticalhardpoints();
        criticalList.setVisibleRowCount(NUMBER_OF_LESSER_SECTION_CRITICALS);
    }//GEN-LAST:event_rightLegSnapButtonActionPerformed
    private void leftLegSnapButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_leftLegSnapButtonActionPerformed
        sectionCritcalLabel.setText("Left Leg");
        userSection = LEFT_LEG;
        caseCheckBox.setVisible(false);
        caseCheckBox.setEnabled(false);
        loadCriticals();
        updateLesserCriticalhardpoints();
        criticalList.setVisibleRowCount(NUMBER_OF_LESSER_SECTION_CRITICALS);
    }//GEN-LAST:event_leftLegSnapButtonActionPerformed

    private void addEquipmentButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_addEquipmentButtonActionPerformed
        Weapon weapon;
        AmmoBin ammo;
        Special_Equipment other;
        switch (itemPane.getSelectedIndex())
        {
            case 0:
                if (ballisticList.getSelectedIndex() < 0) { break; }
                addItem(Equipment[BALLISTIC].elementAt(ballisticList.getSelectedIndex()));
                weapon = (Weapon)Equipment[BALLISTIC].get(ballisticList.getSelectedIndex());
                userHeat += weapon.getHeatPerSecond();
                userFirepower += weapon.getDamagePerSecond();
                userAlpha += weapon.getDamage();
                userAlphaHeat += weapon.getHeat();
                userTonnage += weapon.getTonnage();
                break;
            case 1:
                if (energyList.getSelectedIndex() < 0) { break; }
                addItem(Equipment[ENERGY].elementAt(energyList.getSelectedIndex()));
                weapon = (Weapon)Equipment[ENERGY].get(energyList.getSelectedIndex());
                userHeat += weapon.getHeatPerSecond();
                userFirepower += weapon.getDamagePerSecond();
                userAlpha += weapon.getDamage();
                userAlphaHeat += weapon.getHeat();
                userTonnage += weapon.getTonnage();
                break;
            case 2:
                if (missileList.getSelectedIndex() < 0) { break; }
                addItem(Equipment[MISSILE].elementAt(missileList.getSelectedIndex()));
                weapon = (Weapon)Equipment[MISSILE].get(missileList.getSelectedIndex());
                userHeat += weapon.getHeatPerSecond();
                userFirepower += weapon.getDamagePerSecond();
                userAlpha += weapon.getDamage();
                userAlphaHeat += weapon.getHeat();
                userTonnage += weapon.getTonnage();
                break;
            case 3:
                addItem(Equipment[AMMO].elementAt(ammoList.getSelectedIndex()));
                ammo = (AmmoBin)Equipment[AMMO].elementAt(ammoList.getSelectedIndex());
                userTonnage += ammo.getTonnage();
                break;
            case 4:
                addItem(Equipment[OTHER].elementAt(specialEquipmentList.getSelectedIndex()));
                other = (Special_Equipment)Equipment[OTHER].elementAt(specialEquipmentList.getSelectedIndex());
                userTonnage += other.getTonnage();
                break;
        } 
        updateItemList();
        updateFirepowerProgressBar();
        updateRangeProgressBar();
        updateAlphaProgressBar();
        updateAlphaHeatProgressBar();
        updateHeatProgressBar();
        updateTonnageProgressBar();
    }//GEN-LAST:event_addEquipmentButtonActionPerformed

    private void removeEquipmentButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_removeEquipmentButtonActionPerformed
        Weapon weapon;
        AmmoBin ammo;
        Special_Equipment other;
        Item item;
        int index = itemBayList.getSelectedIndex();
        
        if (index < 0)
        {}
        else
        {
            item = (Item)Equipment[SELECTED].elementAt(index);

            switch(item.getItemType())
            {
                case 0:
                    break;
                case 1:
                    break;
                case 2:
                    weapon = (Weapon)Equipment[SELECTED].elementAt(index);
                    userHeat -= weapon.getHeatPerSecond();
                    userFirepower -= weapon.getDamagePerSecond();
                    userAlpha -= weapon.getDamage();
                    userAlphaHeat -= weapon.getHeat();
                    userTonnage -= weapon.getTonnage();
                    removeItem(index);
                    break;
                case 3:
                    ammo = (AmmoBin)Equipment[SELECTED].elementAt(index);
                    userTonnage -= ammo.getTonnage();
                    removeItem(index);
                    break;
                case 4:
                    other = (Special_Equipment)Equipment[SELECTED].elementAt(index);
                    userTonnage -= other.getTonnage();
                    removeItem(index);
                    break;
            }
            updateItemList();
            updateFirepowerProgressBar();
            updateRangeProgressBar();
            updateAlphaProgressBar();
            updateAlphaHeatProgressBar();
            updateHeatProgressBar();
            updateTonnageProgressBar();
        }
    }//GEN-LAST:event_removeEquipmentButtonActionPerformed

    private void clearEquipmentButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_clearEquipmentButtonActionPerformed
        itemBayList.clearSelection();
        for (int i = Equipment[SELECTED].size() - 1; i > -1; i--)
        {
            Weapon weapon;
            AmmoBin ammo;
            Special_Equipment other;
            Item item = (Item)Equipment[SELECTED].elementAt(i);
            switch(item.getItemType())
            {
                case 0:
                    break;
                case 1:
                    break;
                case 2:
                    weapon = (Weapon)Equipment[SELECTED].elementAt(i);
                    userHeat -= weapon.getHeatPerSecond() * equipmentQueue[i];
                    userFirepower -= weapon.getDamagePerSecond() * equipmentQueue[i];
                    userAlpha -= weapon.getDamage() * equipmentQueue[i];
                    userAlphaHeat -= weapon.getHeat() * equipmentQueue[i];
                    userTonnage -= weapon.getTonnage() * equipmentQueue[i];
                    equipmentQueue[i] = 1;
                    removeItem(i);
                    break;
                case 3:
                    ammo = (AmmoBin)Equipment[SELECTED].elementAt(i);
                    userTonnage -= ammo.getTonnage() * equipmentQueue[i];
                    equipmentQueue[i] = 1;
                    removeItem(i);
                    break;
                case 4:
                    other = (Special_Equipment)Equipment[SELECTED].elementAt(i);
                    userTonnage -= other.getTonnage() * equipmentQueue[i];
                    equipmentQueue[i] = 1;
                    removeItem(i);
                    break;
            }
        }
        updateItemList();
        updateFirepowerProgressBar();
        updateRangeProgressBar();
        updateAlphaProgressBar();
        updateAlphaHeatProgressBar();
        updateHeatProgressBar();
        updateTonnageProgressBar();
    }//GEN-LAST:event_clearEquipmentButtonActionPerformed

    private void aboutEquipmentButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_aboutEquipmentButtonActionPerformed
        JDialog dlgBox;
        switch (itemPane.getSelectedIndex())
        {
            case 0:
                if (ballisticList.getSelectedIndex() < 0) { break; }
                dlgBox = new WeaponInfoDialogBox(this, false, (Weapon)Equipment[BALLISTIC].get(ballisticList.getSelectedIndex()));
                dlgBox.setLocationRelativeTo(this);
                dlgBox.setVisible(true);
                break;
            case 1:
                if (energyList.getSelectedIndex() < 0) { break; }
                dlgBox = new WeaponInfoDialogBox(this, false, (Weapon)Equipment[ENERGY].get(energyList.getSelectedIndex()));
                dlgBox.setLocationRelativeTo(this);
                dlgBox.setVisible(true);
                break;
            case 2:
                if (missileList.getSelectedIndex() < 0) { break; }
                dlgBox = new WeaponInfoDialogBox(this, false, (Weapon)Equipment[MISSILE].get(missileList.getSelectedIndex()));
                dlgBox.setLocationRelativeTo(this);
                dlgBox.setVisible(true);
                break;
            case 3:
                if (ammoList.getSelectedIndex() < 0) { break; }
                dlgBox = new AmmoInfoDialogBox(this, false, (AmmoBin)Equipment[AMMO].get(ammoList.getSelectedIndex()));
                dlgBox.setLocationRelativeTo(this);
                dlgBox.setVisible(true);
                break;
            case 4:
                if (specialEquipmentList.getSelectedIndex() < 0) { break; }
                dlgBox = new SpecialEquipmentInfoDialogBox(this, false, (Special_Equipment)Equipment[OTHER].get(specialEquipmentList.getSelectedIndex()));
                dlgBox.setLocationRelativeTo(this);
                dlgBox.setVisible(true);
                break;
        }
    }//GEN-LAST:event_aboutEquipmentButtonActionPerformed

    private void internalTypeToggleButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_internalTypeToggleButtonActionPerformed
        if (internalTypeToggleButton.isSelected())
        {
            for (int i = 0; i < 14; i++)
                addItem(new Internals(true, userMech.getTonnage()));
        }
        else
        {
            for (int i = 0; i < NUMBER_OF_CRITICAL_SECTIONS; i++)
            {
                for (int j = userVariant.items[i].size() - 1; j > -1; j--)
                {
                    if (userVariant.items[i].elementAt(j).getEquipmentName() == "Endo Steel")
                    {
                        userVariant.items[i].removeElementAt(j);
                        userVariant.criticals[i]++;
                    }
                }
            }
            for (int i = Equipment[SELECTED].size() - 1; i > -1; i--)
            {
                if (Equipment[SELECTED].elementAt(i).getEquipmentName() == "Endo Steel")
                {
                    equipmentQueue[i] = 1;
                    removeItem(i);
                }
            }
        }
        loadCriticals();
        updateItemList();
        updateInternals();
        updateTonnageProgressBar();
    }//GEN-LAST:event_internalTypeToggleButtonActionPerformed

    private void armorTypeToggleButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_armorTypeToggleButtonActionPerformed
        if (armorTypeToggleButton.isSelected())
        {
            for (int i = 0; i < 14; i++)
                addItem(new Armor(true, userVariant.getTotalArmor()));
        }
        else
        {
            for (int i = 0; i < NUMBER_OF_CRITICAL_SECTIONS; i++)
            {
                for (int j = userVariant.items[i].size() - 1; j > -1; j--)
                {
                    if (userVariant.items[i].elementAt(j).getEquipmentName() == "Ferro Fibrous")
                    {
                        userVariant.items[i].removeElementAt(j);
                        userVariant.criticals[i]++;
                    }
                }
            }
            for (int i = Equipment[SELECTED].size() - 1; i > -1; i--)
            {
                if (Equipment[SELECTED].elementAt(i).getEquipmentName() == "Ferro Fibrous")
                {
                    equipmentQueue[i] = 1;
                    removeItem(i);
                }
            }
        }
        loadCriticals();
        updateItemList();
        updateArmor();
        updateTonnageProgressBar();
    }//GEN-LAST:event_armorTypeToggleButtonActionPerformed

    private void engineTypeToggleButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_engineTypeToggleButtonActionPerformed
        if (engineTypeToggleButton.isSelected() && (userVariant.criticals[RIGHT_TORSO] >= 3 && userVariant.criticals[LEFT_TORSO] >= 3))
        {
            userVariant.items[CENTER_TORSO].removeElementAt(2);
            userVariant.items[CENTER_TORSO].removeElementAt(0);
            userVariant.items[CENTER_TORSO].insertElementAt(new Engine(true, userVariant.engineRating), 0);
            userVariant.items[CENTER_TORSO].insertElementAt(new Engine(true, userVariant.engineRating), 2);
            userVariant.items[RIGHT_TORSO].insertElementAt(new Engine(true, userVariant.engineRating), 0);
            userVariant.items[LEFT_TORSO].insertElementAt(new Engine(true, userVariant.engineRating), 0);
            userVariant.criticals[RIGHT_TORSO] -= 3;
            userVariant.criticals[LEFT_TORSO] -= 3;
            engineTypeToggleButton.setText("XL Engine");
            userTonnage -= (RegEngineTable[(userVariant.engineRating - 100) / 5][1] - XLEngineTable[(userVariant.engineRating - 100) / 5][1]);
        }
        else if (engineTypeToggleButton.isSelected())
        {
            engineTypeToggleButton.setSelected(false);
        }
        else
        {
            userVariant.items[RIGHT_TORSO].removeElementAt(0);
            userVariant.items[LEFT_TORSO].removeElementAt(0);
            userVariant.items[CENTER_TORSO].removeElementAt(2);
            userVariant.items[CENTER_TORSO].removeElementAt(0);
            userVariant.items[CENTER_TORSO].insertElementAt(new Engine(false, userVariant.engineRating), 0);
            userVariant.items[CENTER_TORSO].insertElementAt(new Engine(false, userVariant.engineRating), 2);
            userVariant.criticals[RIGHT_TORSO] += 3;
            userVariant.criticals[LEFT_TORSO] += 3;
            engineTypeToggleButton.setText("Reg Engine");
            userTonnage += (RegEngineTable[(userVariant.engineRating - 100) / 5][1] - XLEngineTable[(userVariant.engineRating - 100) / 5][1]);
        }
        
        updateEngine();
        loadCriticals();
        updateTonnageProgressBar();
    }//GEN-LAST:event_engineTypeToggleButtonActionPerformed

    private void heatSinkTypeToggleButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_heatSinkTypeToggleButtonActionPerformed
        if (heatSinkTypeToggleButton.isSelected())
        {
            heatSinkTypeToggleButton.setText("Dbl HS");
            for (int i = 0; i < NUMBER_OF_CRITICAL_SECTIONS; i++)
            {
                for (int j = userVariant.items[i].size() - 1; j > -1; j--)
                {
                    if (userVariant.items[i].elementAt(j).getEquipmentName() == "Heat Sink")
                    {
                        userVariant.items[i].removeElementAt(j);
                        userVariant.criticals[i]++;
                    }
                }
            }
            for (int i = Equipment[SELECTED].size() - 1; i > -1; i--)
            {
                if (Equipment[SELECTED].elementAt(i).getEquipmentName() == "Heat Sink")
                {
                    equipmentQueue[i] = 1;
                    removeItem(i);
                }
            }
            for (int i = 0; i < (userVariant.heatSinks - userVariant.engineHeatSinks); i++)
                addItem(new Heat_Sink(true));
        }
        else
        {
            heatSinkTypeToggleButton.setText("Std HS");
            for (int i = 0; i < NUMBER_OF_CRITICAL_SECTIONS; i++)
            {
                for (int j = userVariant.items[i].size() - 1; j > -1; j--)
                {
                    if (userVariant.items[i].elementAt(j).getEquipmentName() == "Double Heat Sink")
                    {
                        userVariant.items[i].removeElementAt(j);
                        userVariant.criticals[i] += 3;
                    }
                }
            }
            for (int i = Equipment[SELECTED].size() - 1; i > -1; i--)
            {
                if (Equipment[SELECTED].elementAt(i).getEquipmentName() == "Double Heat Sink")
                {
                    equipmentQueue[i] = 1;
                    removeItem(i);
                }
            }
            for (int i = 0; i < (userVariant.heatSinks - userVariant.engineHeatSinks); i++)
                addItem(new Heat_Sink(false));
        }
        loadCriticals();
        updateItemList();
        updateHeatSinks();
        updateHeatProgressBar();
    }//GEN-LAST:event_heatSinkTypeToggleButtonActionPerformed

    private void heatSinkSpinnerStateChanged(ChangeEvent evt) {//GEN-FIRST:event_heatSinkSpinnerStateChanged
        int temp1 = userVariant.heatSinks;
        int temp2;
        userVariant.heatSinks = Integer.parseInt(heatSinkSpinnerModel.getValue().toString());
        temp1 = userVariant.heatSinks - temp1;
        userTonnage += temp1;
        
        loadCriticals();
        updateHeatProgressBar();
        updateTonnageProgressBar();
        
        if (temp1 > 0)
        {
        
            if (userVariant.heatSinks <= userVariant.engineHeatSinks)
            {
                updateHeatSinks();
                return;
            }
        
            for (int i = 0; i < temp1; i++)
                addItem(new Heat_Sink(heatSinkTypeToggleButton.isSelected()));
            
        }
        else if (temp1 < 0 && userVariant.heatSinks >= userVariant.engineHeatSinks)
        {
            temp1 = -temp1;
            
            if (heatSinkTypeToggleButton.isSelected())
            {
                temp2 = 3;
                temp = "Double Heat Sink";
            }
            else
            {
                temp2 = 1;
                temp = "Heat Sink";
            }
            
            for (int i = Equipment[SELECTED].size() - 1; i > -1; i--)
            {
                if (Equipment[SELECTED].elementAt(i).getEquipmentName() == temp)
                {
                    for (int j = 0; j < equipmentQueue[i]; j++)
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
                    for (int j = userVariant.items[i].size() - 1; j > -1; j--)
                    {
                        if (userVariant.items[i].elementAt(j).getEquipmentName() == temp)
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
        updateItemList();
        updateHeatSinks();
    }//GEN-LAST:event_heatSinkSpinnerStateChanged

    private void engineRatingSpinnerStateChanged(ChangeEvent evt) {//GEN-FIRST:event_engineRatingSpinnerStateChanged
        int temp1 = userVariant.engineRating;
        userVariant.engineRating = Integer.parseInt(engineRatingSpinnerModel.getValue().toString());
        int temp2 = userVariant.engineHeatSinks;
        userVariant.engineHeatSinks = (userVariant.engineRating / 25);
        
        int temp3;
        
        if (engineTypeToggleButton.isSelected())
            userTonnage += (XLEngineTable[(userVariant.engineRating - 100) / 5][1] - XLEngineTable[(temp1 - 100) / 5][1]);
        else
            userTonnage += (RegEngineTable[(userVariant.engineRating - 100) / 5][1] - RegEngineTable[(temp1 - 100) / 5][1]);
        
        temp2 -= userVariant.engineHeatSinks;
        
        if (temp2 > 0 && userVariant.heatSinks > userVariant.engineHeatSinks)
        {
            for (int i = 0; i < temp2; i++)
            {
                if (userVariant.engineHeatSinks < 10)
                    userTonnage++;
                
                addItem(new Heat_Sink(heatSinkTypeToggleButton.isSelected()));
            }
        }
        else if (temp2 < 0 && userVariant.heatSinks >= userVariant.engineHeatSinks)
        {
            temp2 = -temp2;
            if (userVariant.engineHeatSinks <= 10)
                userTonnage -= temp2;
            if (heatSinkTypeToggleButton.isSelected())
            {
                temp3 = 3;
                temp = "Double Heat Sink";
            }
            else
            {
                temp3 = 1;
                temp = "Heat Sink";
            }

            for (int i = Equipment[SELECTED].size() - 1; i > -1; i--)
            {
                if (Equipment[SELECTED].elementAt(i).getEquipmentName() == temp)
                {
                    for (int j = 0; j < equipmentQueue[i]; j++)
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
                        if (userVariant.items[i].elementAt(j).getEquipmentName() == temp)
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
        
        loadCriticals();
        updateHeatSinks();
        updateItemList();
        updateEngine();
        updateSpeedProgressBar();
        updateTonnageProgressBar();
    }//GEN-LAST:event_engineRatingSpinnerStateChanged

    private void jumpJetSpinnerStateChanged(ChangeEvent evt) {//GEN-FIRST:event_jumpJetSpinnerStateChanged
        int temp1 = userVariant.jumpJets;
        userVariant.jumpJets = Integer.parseInt(jumpJetSpinner.getValue().toString());
        if (userMech.getTonnage() > 75)
            userTonnage += (2.0 * (userVariant.jumpJets - temp1));
        else if (userMech.getTonnage() > 55)
            userTonnage += (1.0 * (userVariant.jumpJets - temp1));
        else
            userTonnage += (0.5 * (userVariant.jumpJets - temp1));
        if (temp1 < userVariant.jumpJets)
            addItem(new Jump_Jet(userMech.getTonnage()));
        else if (temp1 > userVariant.jumpJets)
        {
            temp1 -= userVariant.jumpJets;
            for (int i = Equipment[SELECTED].size() - 1; i > -1; i--)
            {
                if (Equipment[SELECTED].elementAt(i).getEquipmentName() == "Jump Jet")
                {
                        removeItem(i);
                        temp1--;
                        if (temp1 == 0)
                        {
                            break;
                        }
                    }
                if (temp1 == 0)
                {
                    break;
                }
            }
            for (int i = 0; i < NUMBER_OF_CRITICAL_SECTIONS; i++)
            {
                for (int j = userVariant.items[i].size() - 1; j > -1; j--)
                {
                    if (userVariant.items[i].elementAt(j).getEquipmentName() == "Jump Jet")
                    {
                        userVariant.items[i].removeElementAt(j);
                        userVariant.criticals[i] ++;
                        temp1--;
                    }
                    if (temp1 == 0)
                    {
                        break;
                    }
                }
                if (temp1 == 0)
                {
                    break;
                }
            }
        }
        loadCriticals();
        updateItemList();
        updateJumpJets();
        updateTonnageProgressBar();
    }//GEN-LAST:event_jumpJetSpinnerStateChanged

    private void selectiveEquipmentButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_selectiveEquipmentButtonActionPerformed
        JDialog dlgBox;
        int index = itemBayList.getSelectedIndex();
        if (index > -1 && Equipment[SELECTED].elementAt(index).getHardpointType() == OMNI)
        {
            dlgBox = new SelectiveAllocationDialogBox(this, true, userVariant.items, userVariant.criticals, Equipment[SELECTED].elementAt(index), equipmentQueue[index], index);
            dlgBox.setLocationRelativeTo(this);
            dlgBox.setVisible(true);
        }
        updateCriticalProgressBar();
    }//GEN-LAST:event_selectiveEquipmentButtonActionPerformed

    private void clearSectionEquipmentButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_clearSectionEquipmentButtonActionPerformed
        for (int i = userVariant.items[userSection].size() - 1; i > -1; i--)
            if (userVariant.items[userSection].elementAt(i).isRemovable())
            {
                addItem(userVariant.items[userSection].elementAt(i));
                userVariant.criticals[userSection] += userVariant.items[userSection].elementAt(i).getCriticals();
                userVariant.items[userSection].remove(i);
            }
        if (userSection < 6)
        {
            userVariant.hardpoints[userSection][ENERGY] = 0;
            userVariant.hardpoints[userSection][BALLISTIC] = 0;
            userVariant.hardpoints[userSection][MISSILE] = 0;
            userVariant.hardpoints[userSection][AMS] = 0;
            updateCriticalhardpoints(userSection);
        }
        loadCriticals();
        updateCriticalProgressBar();
        updateItemList();
    }//GEN-LAST:event_clearSectionEquipmentButtonActionPerformed

    private void addEquipmentButton1ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_addEquipmentButton1ActionPerformed
        Item item;
        if (itemBayList.getSelectedIndex() > -1)
        {
            item = Equipment[SELECTED].elementAt(itemBayList.getSelectedIndex());
            if (item.getCriticals() <= userVariant.criticals[userSection] && item.getHardpointType() == OMNI)
            {
                if (item.getEquipmentName() == "Jump Jet")
                    if (userSection == RIGHT_ARM || userSection == LEFT_ARM || userSection == HEAD)
                        return;
                if (item.getEquipmentName() == "Command Console")
                    if (userSection != HEAD)
                        return;
                removeItem(itemBayList.getSelectedIndex());
                userVariant.items[userSection].add(item);
                userVariant.criticals[userSection] -= item.getCriticals();
            }
            else if (item.getCriticals() <= userVariant.criticals[userSection] && userSection < 6 && item.getHardpointType() == AMS)
            {
                Special_Equipment other = (Special_Equipment) item;
                if (userVariant.hardpoints[userSection][other.getHardpointType()] < userMech.getHardpoints(userSection, other.getHardpointType()))
                {
                    removeItem(itemBayList.getSelectedIndex());
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
                    removeItem(itemBayList.getSelectedIndex());
                    userVariant.items[userSection].add(other);
                    userVariant.criticals[userSection] -= other.getCriticals();
                    userVariant.hardpoints[userSection][other.getHardpointType()]++;
                }
            }
            else if (item.getCriticals() <= userVariant.criticals[userSection] && userSection < 6)
            {
                Weapon weapon = (Weapon) item;
                if (userVariant.hardpoints[userSection][weapon.getHardpointType()] < userMech.getHardpoints(userSection, weapon.getHardpointType()))
                {
                    removeItem(itemBayList.getSelectedIndex());
                    userVariant.items[userSection].add(weapon);
                    userVariant.criticals[userSection] -= weapon.getCriticals();
                    userVariant.hardpoints[userSection][weapon.getHardpointType()]++;
                }
            }
        }
        if (userSection < 6)
            updateCriticalhardpoints(userSection);
        loadCriticals();
        updateCriticalProgressBar();
        updateItemList();
    }//GEN-LAST:event_addEquipmentButton1ActionPerformed

    private void removeEquipmentButton1ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_removeEquipmentButton1ActionPerformed
        int temp2;
        int total2 = 0;
        total = -1;
        for (int i = 0; i < userVariant.items[userSection].size(); i++)
        {
            for (int j = 0; j < userVariant.items[userSection].elementAt(i).getCriticals(); j++)
            {
                total++;
                total2++;
                if (total == criticalList.getSelectedIndex())
                    break;
            }
            
            if (total == criticalList.getSelectedIndex())
            {
                total = i;
                break;
            }
        }
        
        if (total2 <= criticalList.getSelectedIndex())
            return;
        
        if (userSection < 6)
            temp2 = 12;
        else
            temp2 = 6;
        
        if ((total != -1 && total <= temp2) && userVariant.items[userSection].elementAt(total).isRemovable())
        {
            addItem(userVariant.items[userSection].elementAt(total));
            userVariant.items[userSection].remove(total);
            userVariant.criticals[userSection] += Equipment[SELECTED].lastElement().getCriticals();
            if (Equipment[SELECTED].lastElement().getHardpointType() < NUMBER_OF_HARDPOINT_TYPES)
                userVariant.hardpoints[userSection][Equipment[SELECTED].lastElement().getHardpointType()]--;
        }
        if (userSection < 6)
            updateCriticalhardpoints(userSection);
        loadCriticals();
        updateCriticalProgressBar();
        updateItemList();
    }//GEN-LAST:event_removeEquipmentButton1ActionPerformed

    private void caseCheckBoxActionPerformed(ActionEvent evt) {//GEN-FIRST:event_caseCheckBoxActionPerformed
        if (caseCheckBox.isSelected() && userVariant.criticals[userSection] > 0)
        {
            userVariant.items[userSection].add(new CASE());
            userVariant.criticals[userSection]--;
            userTonnage += 0.5;
        }
        else if (caseCheckBox.isSelected())
            caseCheckBox.setSelected(false);
        else
        {
            for (int i = userVariant.items[userSection].size() - 1; i > -1; i--)
                if ( userVariant.items[userSection].elementAt(i).toString() == "CASE")
                {
                    userVariant.items[userSection].removeElementAt(i);
                    userVariant.criticals[userSection]++;
                    userTonnage -= 0.5;
                }
        }
        loadCriticals();
        updateTonnageProgressBar();
    }//GEN-LAST:event_caseCheckBoxActionPerformed

    private void MASCCheckBoxActionPerformed(ActionEvent evt) {//GEN-FIRST:event_MASCCheckBoxActionPerformed
        if (MASCCheckBox.isSelected())
        {
            addItem(new MASC(userMech.getTonnage()));
            userTonnage += Equipment[SELECTED].lastElement().getCriticals();
            SPEED_MODIFIER = MASC_SPEED_MODIFIER;
        }
        else
        {
            SPEED_MODIFIER = STANDARD_SPEED_MODIFIER;
            for (int i = Equipment[SELECTED].size() - 1; i > -1; i--) {
                if ( Equipment[SELECTED].elementAt(i).toString() == "MASC")
                {
                    userTonnage -= Equipment[SELECTED].lastElement().getCriticals();
                    removeItem(i);
                }
            }
            for (int i = userVariant.items[userSection].size() - 1; i > -1; i--) {
                if ( userVariant.items[userSection].elementAt(i).toString() == "MASC")
                {
                    userVariant.criticals[userSection] += userVariant.items[userSection].lastElement().getCriticals();
                    userTonnage -= userVariant.items[userSection].lastElement().getCriticals();
                    userVariant.items[userSection].removeElementAt(i);
                    loadCriticals();
                }
            }
        }
        updateSpeedProgressBar();
        updateTonnageProgressBar();
        updateItemList();
    }//GEN-LAST:event_MASCCheckBoxActionPerformed

    private void UnreleasedCheckBoxMenuItemItemStateChanged(ItemEvent evt) {//GEN-FIRST:event_UnreleasedCheckBoxMenuItemItemStateChanged
        updateMechList();
    }//GEN-LAST:event_UnreleasedCheckBoxMenuItemItemStateChanged
    private void UnconfirmedCheckBoxMenuItemItemStateChanged(ItemEvent evt) {//GEN-FIRST:event_UnconfirmedCheckBoxMenuItemItemStateChanged
        updateMechList();
    }//GEN-LAST:event_UnconfirmedCheckBoxMenuItemItemStateChanged

    private void ArtemisIVCheckBoxActionPerformed(ActionEvent evt) {//GEN-FIRST:event_ArtemisIVCheckBoxActionPerformed
        userVariant.hasArtemisIV = ArtemisIVCheckBox.isSelected();
        
        for (int i = Equipment[SELECTED].size() - 1; i >= 0; i--) {
            if (Equipment[SELECTED].elementAt(i).getItemType() == WEAPON_ITEM_TYPE) {
                Weapon weapon = (Weapon)Equipment[SELECTED].elementAt(i);
                if (weapon.isArtemisIVCapable()) {
                    userTonnage -= (weapon.getTonnage() * equipmentQueue[i]);
                    userHeat -= (weapon.getHeatPerSecond() * equipmentQueue[i]);
                    userAlphaHeat -= (weapon.getHeat() * equipmentQueue[i]);
                    userFirepower -= (weapon.getDamagePerSecond() * equipmentQueue[i]);
                    userAlpha -= (weapon.getDamage() * equipmentQueue[i]);
                    equipmentQueue[i] = 1;
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
        
        for (int i = Equipment[MISSILE].size() - 1; i >= 0; i--) {
            Weapon weapon = (Weapon)Equipment[MISSILE].elementAt(i);
            if (weapon.isArtemisIVCapable())
                Equipment[MISSILE].removeElementAt(i);
        }
            
        Equipment[MISSILE].insertElementAt(new SRM6(userVariant.hasArtemisIV), 1);
        Equipment[MISSILE].insertElementAt(new SRM4(userVariant.hasArtemisIV), 1);
        Equipment[MISSILE].insertElementAt(new SRM2(userVariant.hasArtemisIV), 1);
        Equipment[MISSILE].insertElementAt(new LRM20(userVariant.hasArtemisIV), 0);
        Equipment[MISSILE].insertElementAt(new LRM15(userVariant.hasArtemisIV), 0);
        Equipment[MISSILE].insertElementAt(new LRM10(userVariant.hasArtemisIV), 0);
        Equipment[MISSILE].insertElementAt(new LRM5(userVariant.hasArtemisIV), 0);
        
        missileListModel.removeAllElements();
        for (int i = 0; i < Equipment[MISSILE].size(); i++)
            missileListModel.addElement(Equipment[MISSILE].elementAt(i).toString());
        
        loadCriticals();
        if (userSection < 6)
            updateCriticalhardpoints(userSection);
        updateFirepowerProgressBar();
        updateRangeProgressBar();
        updateAlphaProgressBar();
        updateAlphaHeatProgressBar();
        updateHeatProgressBar();
        updateTonnageProgressBar();
        updateCriticalProgressBar();
        updateItemList();
    }//GEN-LAST:event_ArtemisIVCheckBoxActionPerformed

    private void formWindowClosing(WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (parent != null)
            parent.setVisible(true);
        else
            setDefaultCloseOperation(EXIT_ON_CLOSE);
    }//GEN-LAST:event_formWindowClosing

    private void UnconfirmedCheckBoxMenuItemActionPerformed(ActionEvent evt) {//GEN-FIRST:event_UnconfirmedCheckBoxMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UnconfirmedCheckBoxMenuItemActionPerformed
    
    private void updateMechList() {
        if (UnreleasedCheckBoxMenuItem.isSelected() && UnconfirmedCheckBoxMenuItem.isSelected())
        {
            DefaultMutableTreeNode treeNode1 = new DefaultMutableTreeNode("Mechs");
            DefaultMutableTreeNode treeNode2 = new DefaultMutableTreeNode("Atlas");
            DefaultMutableTreeNode treeNode3 = new DefaultMutableTreeNode("AS7-D");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("AS7-D-DC");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("AS7-K");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("AS7-RS");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("AS7-S");
            treeNode2.add(treeNode3);
            treeNode1.add(treeNode2);
            treeNode2 = new DefaultMutableTreeNode("Awesome");
            treeNode3 = new DefaultMutableTreeNode("AWS-8Q");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("AWS-8R");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("AWS-8T");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("AWS-8V");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("AWS-9M");
            treeNode2.add(treeNode3);
            treeNode1.add(treeNode2);
            treeNode2 = new DefaultMutableTreeNode("Blackjack");
            treeNode3 = new DefaultMutableTreeNode("BJ-1");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("BJ-1DB");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("BJ-1DC");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("BJ-1X");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("BJ-3");
            treeNode2.add(treeNode3);
            treeNode1.add(treeNode2);
            treeNode2 = new DefaultMutableTreeNode("Cataphract");
            treeNode3 = new DefaultMutableTreeNode("CTF-1X");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("CTF-2X");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("CTF-3D");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("CTF-3L");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("CTF-4X");
            treeNode2.add(treeNode3);
            treeNode1.add(treeNode2);
            treeNode2 = new DefaultMutableTreeNode("Catapult");
            treeNode3 = new DefaultMutableTreeNode("CPLT-A1");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("CPLT-C1");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("CPLT-C4");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("CPLT-K2");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("CPLT-K3");
            treeNode2.add(treeNode3);
            treeNode1.add(treeNode2);
            treeNode2 = new DefaultMutableTreeNode("Centurion");
            treeNode3 = new DefaultMutableTreeNode("CN9-A");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("CN9-AH");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("CN9-AL");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("CN9-D");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("CN9-YLW");
            treeNode2.add(treeNode3);
            treeNode1.add(treeNode2);
            treeNode2 = new DefaultMutableTreeNode("Cicada");
            treeNode3 = new DefaultMutableTreeNode("CDA-2A");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("CDA-2B");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("CDA-3C");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("CDA-3M");
            treeNode2.add(treeNode3);
            treeNode1.add(treeNode2);
            treeNode2 = new DefaultMutableTreeNode("Commando");
            treeNode3 = new DefaultMutableTreeNode("COM-1B");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("COM-1C");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("COM-1D");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("COM-2D");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("COM-3A");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("COM-5S");
            treeNode2.add(treeNode3);
            treeNode1.add(treeNode2);
            treeNode2 = new DefaultMutableTreeNode("Dragon");
            treeNode3 = new DefaultMutableTreeNode("DGN-1C");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("DGN-1N");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("DGN-5N");
            treeNode2.add(treeNode3);
            treeNode1.add(treeNode2);
            treeNode2 = new DefaultMutableTreeNode("Flea");
            treeNode3 = new DefaultMutableTreeNode("FLE-4");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("FLE-15");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("FLE-17");
            treeNode2.add(treeNode3);
            treeNode1.add(treeNode2);
            treeNode2 = new DefaultMutableTreeNode("Grand Dragon");
            treeNode3 = new DefaultMutableTreeNode("DRG-1G");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("DRG-5K");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("DRG-5K-DC");
            treeNode2.add(treeNode3);
            treeNode1.add(treeNode2);
            treeNode2 = new DefaultMutableTreeNode("Highlander");
            treeNode3 = new DefaultMutableTreeNode("HGN-732");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("HGN-733");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("HGN-733C");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("HGN-733P");
            treeNode2.add(treeNode3);
            treeNode1.add(treeNode2);
            treeNode2 = new DefaultMutableTreeNode("Hunchback");
            treeNode3 = new DefaultMutableTreeNode("HBK-4G");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("HBK-4H");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("HBK-4J");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("HBK-4N");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("HBK-4P");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("HBK-4SP");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("HBK-5M");
            treeNode2.add(treeNode3);
            treeNode1.add(treeNode2);
            treeNode2 = new DefaultMutableTreeNode("JagerMech");
            treeNode3 = new DefaultMutableTreeNode("JM6-A");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("JM6-DD");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("JM6-S");
            treeNode2.add(treeNode3);
            treeNode1.add(treeNode2);
            treeNode2 = new DefaultMutableTreeNode("Jenner");
            treeNode3 = new DefaultMutableTreeNode("JR7-A");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("JR7-D");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("JR7-F");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("JR7-K");
            treeNode2.add(treeNode3);
            treeNode1.add(treeNode2);
            treeNode2 = new DefaultMutableTreeNode("Raven");
            treeNode3 = new DefaultMutableTreeNode("RVN-2X");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("RVN-3L");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("RVN-4X");
            treeNode2.add(treeNode3);
            treeNode1.add(treeNode2);
            treeNode2 = new DefaultMutableTreeNode("Spider");
            treeNode3 = new DefaultMutableTreeNode("SDR-5D");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("SDR-5K");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("SDR-5V");
            treeNode2.add(treeNode3);
            treeNode1.add(treeNode2);
            treeNode2 = new DefaultMutableTreeNode("Stalker");
            treeNode3 = new DefaultMutableTreeNode("STK-3F");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("STK-3H");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("STK-4N");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("STK-4P");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("STK-5M");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("STK-5S");
            treeNode2.add(treeNode3);
            treeNode1.add(treeNode2);
            treeNode2 = new DefaultMutableTreeNode("Trebuchet");
            treeNode3 = new DefaultMutableTreeNode("TBT-3C");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("TBT-5J");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("TBT-5K");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("TBT-5N");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("TBT-5S");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("TBT-7M");
            treeNode2.add(treeNode3);
            treeNode1.add(treeNode2);
            MechList.setModel(new DefaultTreeModel(treeNode1));
        }
        else if (!UnreleasedCheckBoxMenuItem.isSelected() && UnconfirmedCheckBoxMenuItem.isSelected()) {
            DefaultMutableTreeNode treeNode1 = new DefaultMutableTreeNode("Mechs");
            DefaultMutableTreeNode treeNode2 = new DefaultMutableTreeNode("Atlas");
            DefaultMutableTreeNode treeNode3 = new DefaultMutableTreeNode("AS7-D");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("AS7-D-DC");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("AS7-K");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("AS7-RS");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("AS7-S");
            treeNode2.add(treeNode3);
            treeNode1.add(treeNode2);
            treeNode2 = new DefaultMutableTreeNode("Awesome");
            treeNode3 = new DefaultMutableTreeNode("AWS-8Q");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("AWS-8R");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("AWS-8T");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("AWS-8V");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("AWS-9M");
            treeNode2.add(treeNode3);
            treeNode1.add(treeNode2);
            treeNode2 = new DefaultMutableTreeNode("Catapult");
            treeNode3 = new DefaultMutableTreeNode("CPLT-A1");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("CPLT-C1");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("CPLT-C4");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("CPLT-K2");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("CPLT-K3");
            treeNode2.add(treeNode3);
            treeNode1.add(treeNode2);
            treeNode2 = new DefaultMutableTreeNode("Centurion");
            treeNode3 = new DefaultMutableTreeNode("CN9-A");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("CN9-AH");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("CN9-AL");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("CN9-D");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("CN9-YLW");
            treeNode2.add(treeNode3);
            treeNode1.add(treeNode2);
            treeNode2 = new DefaultMutableTreeNode("Cicada");
            treeNode3 = new DefaultMutableTreeNode("CDA-2A");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("CDA-2B");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("CDA-3C");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("CDA-3M");
            treeNode2.add(treeNode3);
            treeNode1.add(treeNode2);
            treeNode2 = new DefaultMutableTreeNode("Commando");
            treeNode3 = new DefaultMutableTreeNode("COM-1B");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("COM-1C");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("COM-1D");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("COM-2D");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("COM-3A");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("COM-5S");
            treeNode2.add(treeNode3);
            treeNode1.add(treeNode2);
            treeNode2 = new DefaultMutableTreeNode("Dragon");
            treeNode3 = new DefaultMutableTreeNode("DGN-1C");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("DGN-1N");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("DGN-5N");
            treeNode2.add(treeNode3);
            treeNode1.add(treeNode2);
            treeNode2 = new DefaultMutableTreeNode("Hunchback");
            treeNode3 = new DefaultMutableTreeNode("HBK-4G");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("HBK-4H");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("HBK-4J");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("HBK-4N");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("HBK-4P");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("HBK-4SP");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("HBK-5M");
            treeNode2.add(treeNode3);
            treeNode1.add(treeNode2);
            treeNode2 = new DefaultMutableTreeNode("Jenner");
            treeNode3 = new DefaultMutableTreeNode("JR7-A");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("JR7-D");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("JR7-F");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("JR7-K");
            treeNode2.add(treeNode3);
            treeNode1.add(treeNode2);
            treeNode2 = new DefaultMutableTreeNode("Raven");
            treeNode3 = new DefaultMutableTreeNode("RVN-2X");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("RVN-3L");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("RVN-4X");
            treeNode2.add(treeNode3);
            treeNode1.add(treeNode2);
            MechList.setModel(new DefaultTreeModel(treeNode1));
        }
        else if (UnreleasedCheckBoxMenuItem.isSelected() && !UnconfirmedCheckBoxMenuItem.isSelected()) {
            DefaultMutableTreeNode treeNode1 = new DefaultMutableTreeNode("Mechs");
            DefaultMutableTreeNode treeNode2 = new DefaultMutableTreeNode("Atlas");
            DefaultMutableTreeNode treeNode3 = new DefaultMutableTreeNode("AS7-D");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("AS7-D-DC");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("AS7-K");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("AS7-RS");
            treeNode2.add(treeNode3);
            treeNode1.add(treeNode2);
            treeNode2 = new DefaultMutableTreeNode("Awesome");
            treeNode3 = new DefaultMutableTreeNode("AWS-8Q");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("AWS-8R");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("AWS-8T");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("AWS-8V");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("AWS-9M");
            treeNode2.add(treeNode3);
            treeNode1.add(treeNode2);
            treeNode2 = new DefaultMutableTreeNode("Blackjack");
            treeNode3 = new DefaultMutableTreeNode("BJ-1");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("BJ-1DB");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("BJ-1DC");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("BJ-1X");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("BJ-3");
            treeNode2.add(treeNode3);
            treeNode1.add(treeNode2);
            treeNode2 = new DefaultMutableTreeNode("Cataphract");
            treeNode3 = new DefaultMutableTreeNode("CTF-1X");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("CTF-2X");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("CTF-3D");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("CTF-3L");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("CTF-4X");
            treeNode2.add(treeNode3);
            treeNode1.add(treeNode2);
            treeNode2 = new DefaultMutableTreeNode("Catapult");
            treeNode3 = new DefaultMutableTreeNode("CPLT-A1");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("CPLT-C1");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("CPLT-C4");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("CPLT-K2");
            treeNode2.add(treeNode3);
            treeNode1.add(treeNode2);
            treeNode2 = new DefaultMutableTreeNode("Centurion");
            treeNode3 = new DefaultMutableTreeNode("CN9-A");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("CN9-AH");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("CN9-AL");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("CN9-D");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("CN9-YLW");
            treeNode2.add(treeNode3);
            treeNode1.add(treeNode2);
            treeNode2 = new DefaultMutableTreeNode("Cicada");
            treeNode3 = new DefaultMutableTreeNode("CDA-2A");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("CDA-2B");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("CDA-3C");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("CDA-3M");
            treeNode2.add(treeNode3);
            treeNode1.add(treeNode2);
            treeNode2 = new DefaultMutableTreeNode("Commando");
            treeNode3 = new DefaultMutableTreeNode("COM-1B");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("COM-1D");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("COM-2D");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("COM-3A");
            treeNode2.add(treeNode3);
            treeNode1.add(treeNode2);
            treeNode2 = new DefaultMutableTreeNode("Dragon");
            treeNode3 = new DefaultMutableTreeNode("DGN-1C");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("DGN-1N");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("DGN-5N");
            treeNode2.add(treeNode3);
            treeNode1.add(treeNode2);
            treeNode2 = new DefaultMutableTreeNode("Flea");
            treeNode3 = new DefaultMutableTreeNode("FLE-4");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("FLE-15");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("FLE-17");
            treeNode2.add(treeNode3);
            treeNode1.add(treeNode2);
            treeNode2 = new DefaultMutableTreeNode("Highlander");
            treeNode3 = new DefaultMutableTreeNode("HGN-732");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("HGN-733");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("HGN-733C");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("HGN-733P");
            treeNode2.add(treeNode3);
            treeNode1.add(treeNode2);
            treeNode2 = new DefaultMutableTreeNode("Hunchback");
            treeNode3 = new DefaultMutableTreeNode("HBK-4G");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("HBK-4H");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("HBK-4J");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("HBK-4P");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("HBK-4SP");
            treeNode2.add(treeNode3);
            treeNode1.add(treeNode2);
            treeNode2 = new DefaultMutableTreeNode("JagerMech");
            treeNode3 = new DefaultMutableTreeNode("JM6-A");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("JM6-DD");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("JM6-S");
            treeNode2.add(treeNode3);
            treeNode1.add(treeNode2);
            treeNode2 = new DefaultMutableTreeNode("Jenner");
            treeNode3 = new DefaultMutableTreeNode("JR7-D");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("JR7-F");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("JR7-K");
            treeNode2.add(treeNode3);
            treeNode1.add(treeNode2);
            treeNode2 = new DefaultMutableTreeNode("Raven");
            treeNode3 = new DefaultMutableTreeNode("RVN-2X");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("RVN-3L");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("RVN-4X");
            treeNode2.add(treeNode3);
            treeNode1.add(treeNode2);
            treeNode2 = new DefaultMutableTreeNode("Spider");
            treeNode3 = new DefaultMutableTreeNode("SDR-5D");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("SDR-5K");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("SDR-5V");
            treeNode2.add(treeNode3);
            treeNode1.add(treeNode2);
            treeNode2 = new DefaultMutableTreeNode("Stalker");
            treeNode3 = new DefaultMutableTreeNode("STK-3F");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("STK-3H");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("STK-4N");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("STK-4P");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("STK-5M");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("STK-5S");
            treeNode2.add(treeNode3);
            treeNode1.add(treeNode2);
            treeNode2 = new DefaultMutableTreeNode("Trebuchet");
            treeNode3 = new DefaultMutableTreeNode("TBT-3C");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("TBT-5J");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("TBT-5K");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("TBT-5N");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("TBT-5S");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("TBT-7M");
            treeNode2.add(treeNode3);
            treeNode1.add(treeNode2);
            MechList.setModel(new DefaultTreeModel(treeNode1));
        }
        else
        {
            DefaultMutableTreeNode treeNode1 = new DefaultMutableTreeNode("Mechs");
            DefaultMutableTreeNode treeNode2 = new DefaultMutableTreeNode("Atlas");
            DefaultMutableTreeNode treeNode3 = new DefaultMutableTreeNode("AS7-D");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("AS7-D-DC");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("AS7-K");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("AS7-RS");
            treeNode2.add(treeNode3);
            treeNode1.add(treeNode2);
            treeNode2 = new DefaultMutableTreeNode("Awesome");
            treeNode3 = new DefaultMutableTreeNode("AWS-8Q");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("AWS-8R");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("AWS-8T");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("AWS-8V");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("AWS-9M");
            treeNode2.add(treeNode3);
            treeNode1.add(treeNode2);
            treeNode2 = new DefaultMutableTreeNode("Cataphract");
            treeNode3 = new DefaultMutableTreeNode("CTF-1X");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("CTF-2X");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("CTF-3D");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("CTF-4X");
            treeNode2.add(treeNode3);
            treeNode1.add(treeNode2);
            treeNode2 = new DefaultMutableTreeNode("Catapult");
            treeNode3 = new DefaultMutableTreeNode("CPLT-A1");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("CPLT-C1");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("CPLT-C4");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("CPLT-K2");
            treeNode2.add(treeNode3);
            treeNode1.add(treeNode2);
            treeNode2 = new DefaultMutableTreeNode("Centurion");
            treeNode3 = new DefaultMutableTreeNode("CN9-A");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("CN9-AH");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("CN9-AL");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("CN9-D");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("CN9-YLW");
            treeNode2.add(treeNode3);
            treeNode1.add(treeNode2);
            treeNode2 = new DefaultMutableTreeNode("Cicada");
            treeNode3 = new DefaultMutableTreeNode("CDA-2A");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("CDA-2B");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("CDA-3C");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("CDA-3M");
            treeNode2.add(treeNode3);
            treeNode1.add(treeNode2);
            treeNode2 = new DefaultMutableTreeNode("Commando");
            treeNode3 = new DefaultMutableTreeNode("COM-1B");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("COM-1D");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("COM-2D");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("COM-3A");
            treeNode2.add(treeNode3);
            treeNode1.add(treeNode2);
            treeNode2 = new DefaultMutableTreeNode("Dragon");
            treeNode3 = new DefaultMutableTreeNode("DGN-1C");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("DGN-1N");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("DGN-5N");
            treeNode2.add(treeNode3);
            treeNode1.add(treeNode2);
            treeNode2 = new DefaultMutableTreeNode("Hunchback");
            treeNode3 = new DefaultMutableTreeNode("HBK-4G");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("HBK-4H");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("HBK-4J");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("HBK-4P");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("HBK-4SP");
            treeNode2.add(treeNode3);
            treeNode1.add(treeNode2);
            treeNode2 = new DefaultMutableTreeNode("Jenner");
            treeNode3 = new DefaultMutableTreeNode("JR7-D");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("JR7-F");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("JR7-K");
            treeNode2.add(treeNode3);
            treeNode1.add(treeNode2);
            treeNode2 = new DefaultMutableTreeNode("Raven");
            treeNode3 = new DefaultMutableTreeNode("RVN-2X");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("RVN-3L");
            treeNode2.add(treeNode3);
            treeNode3 = new DefaultMutableTreeNode("RVN-4X");
            treeNode2.add(treeNode3);
            treeNode1.add(treeNode2);
            MechList.setModel(new DefaultTreeModel(treeNode1));
        }
        int row = 0;
        while (row < MechList.getRowCount())
        {
            MechList.expandRow(row);
            row++;
        }

        javax.swing.tree.TreePath path = this.MechList.getPathForRow(2);
        this.MechList.setSelectionPath(path);
    }

    public void updateArmor() {
        total = 0;
        for (int i = 0; i < NUMBER_OF_SECTIONS; i++)
            total += userVariant.armor[i];
            
        if (armorTypeToggleButton.isSelected())
        {
            userTonnage -= ((total / 32.0) - (total / 35.84));
            armorTypeToggleButton.setText("Ferro Fibrous");
            userVariant.armorPointsPerTon = 35.84;
            userVariant.armorCostPerTon = 20032;
        }
        else
        {
            userTonnage += ((total / 32.0) - (total / 35.84));
            armorTypeToggleButton.setText("Std Armor");
            userVariant.armorPointsPerTon = 32.0;
            userVariant.armorCostPerTon = 10016;
        }
        
        temp = String.format("%.2f Tons", (total / userVariant.armorPointsPerTon));
        ArmorWeightLabel.setText(temp);
        temp = String.format("%,d C-Bills", ((int)Math.ceil((total / userVariant.armorPointsPerTon)) * userVariant.armorCostPerTon));
        ArmorCostLabel.setText(temp);
    }
    public void updateInternals() {
        if (internalTypeToggleButton.isSelected())
        {
            userTonnage -= ((userMech.getTonnage() / 20) - (userMech.getTonnage() / 20 % 0.5));
            temp = String.format("%.2f Tons", (userMech.getTonnage() / 20) + (userMech.getTonnage() / 20 % 0.5));
            InternalWeightLabel.setText(temp);
            internalTypeToggleButton.setText("Endo Steel");
            internalTypeToggleButton.setSelected(true);
            temp = String.format("%,d C-Bills", ((int)userMech.getTonnage() * 10000));
            InternalCostLabel.setText(temp);
        }
        else
        {
            userTonnage += ((userMech.getTonnage() / 20) - (userMech.getTonnage() / 20 % 0.5));
            internalTypeToggleButton.setText("Std Internals");
            internalTypeToggleButton.setSelected(false);
            temp = String.format("%.2f Tons", (userMech.getTonnage() / 10));
            InternalWeightLabel.setText(temp);
            temp = String.format("%,d C-Bills", ((int)userMech.getTonnage() * 5000));
            InternalCostLabel.setText(temp);
        }
    }
    public void updateEngine() {
        if (engineTypeToggleButton.isSelected())
        {
            temp = String.format("%,d C-Bills", (userVariant.engineRating * 16000));
            EngineCostLabel.setText(temp);
            temp = String.format("%.1f Tons", (XLEngineTable[(userVariant.engineRating - 100) / 5][1]));
            EngineWeightLabel.setText(temp);
        }
        else
        {
            temp = String.format("%,d C-Bills", (userVariant.engineRating * 4000));
            EngineCostLabel.setText(temp);
            temp = String.format("%.1f Tons", (RegEngineTable[(userVariant.engineRating - 100) / 5][1]));
            EngineWeightLabel.setText(temp);
        }
    }
    public void updateJumpJets() {
        if (userMech.getTonnage() > 75)
        {
            temp = String.format("%.2f Tons", (2.0 * userVariant.jumpJets));
            JumpJetWeightLabel.setText(temp);
            temp = String.format("%,d C-Bills", (userVariant.jumpJets * 22000));
            JumpJetCostLabel.setText(temp);
        }
        else if (userMech.getTonnage() > 55)
        {
            temp = String.format("%.2f Tons", (1.0 * userVariant.jumpJets));
            JumpJetWeightLabel.setText(temp);
            temp = String.format("%,d C-Bills", (userVariant.jumpJets * 11000));
            JumpJetCostLabel.setText(temp);
        }
        else
        {
            temp = String.format("%.2f Tons", (0.5 * userVariant.jumpJets));
            JumpJetWeightLabel.setText(temp);
            temp = String.format("%,d C-Bills", (userVariant.jumpJets * 5500));
            JumpJetCostLabel.setText(temp);
        }
    }
    public void updateHeatSinks() {
        if (heatSinkTypeToggleButton.isSelected())
        {
            HeatDissapationLabel.setText("" + (userVariant.heatSinks * DOUBLE_HEAT_SINK_DISSIPATION));
            temp = String.format("%,d C-Bills", (userVariant.heatSinks * 6000));
            HeatSinkCostLabel.setText(temp);
        }
        else
        {
            HeatDissapationLabel.setText("" + userVariant.heatSinks);
            temp = String.format("%,d C-Bills", (userVariant.heatSinks * 2000));
            HeatSinkCostLabel.setText(temp);
        }
    }
    
    public void updateCurrentArmor() {
        total = 0;
        for (int i = 0; i < NUMBER_OF_SECTIONS; i++)
            total += userVariant.armor[i];
        if (total > userMech.getStockTotalArmor())
            currentArmorProgressBar.setForeground(new Color(60,180,60));
        else if (total >= (userMech.getStockTotalArmor() / 2.0))
            currentArmorProgressBar.setForeground(new Color(180 - (int)(((total - (userMech.getStockTotalArmor() / 2.0)) / (userMech.getStockTotalArmor() / 2.0)) * 120),180,60));
        else
            currentArmorProgressBar.setForeground(new Color(180,60 + (int)((total / (userMech.getStockTotalArmor() / 2.0)) * 120),60));
        currentArmorProgressBar.setValue(total);
        currentArmorProgressBar.setString("" + total);
        temp = String.format("%.2f Tons", (total / (double)userVariant.armorPointsPerTon));
        ArmorWeightLabel.setText(temp);
        temp = String.format("%,d C-Bills", (int)Math.ceil(total / userVariant.armorPointsPerTon) * userVariant.armorCostPerTon);
        ArmorCostLabel.setText(temp);
    }
    public void updateTonnageProgressBar() {
        tonnageProgressBar.setValue((int)userTonnage);
        if (userTonnage <= userMech.getTonnage())
            tonnageProgressBar.setForeground(new Color((int)(((userMech.getTonnage() - userTonnage) / userMech.getTonnage()) * 120) + 60, 180, 60));
        else
            tonnageProgressBar.setForeground(new Color(180,60,60));
        temp = String.format("%.2f tons", userTonnage);
        tonnageProgressBar.setString(temp);
    }
    public void updateCriticalProgressBar() {
        criticalsUsedProgressBar.setValue(userVariant.getTotalCriticals());
        if (userVariant.getTotalCriticals() <= 78)
            criticalsUsedProgressBar.setForeground(new Color((int)(((78 - userVariant.getTotalCriticals()) / 78) * 120) + 60, 180, 60));
        else
            criticalsUsedProgressBar.setForeground(new Color(180,60,60));
        temp = String.format("%d/78", userVariant.getTotalCriticals());
        criticalsUsedProgressBar.setString(temp);
    }
    public void updateFirepowerProgressBar() {
        if (userFirepower > 40)
            firepowerProgressBar.setForeground(new Color(60,180,60));
        else if (userFirepower >= 20)
            firepowerProgressBar.setForeground(new Color(180 - (int)(((userFirepower - 20) / 20) * 120),180,60));
        else
            firepowerProgressBar.setForeground(new Color(180,60 + (int)((userFirepower / 20) * 120),60));
        firepowerProgressBar.setValue((int)userFirepower);
        temp = String.format("%.2f dps", userFirepower);
        firepowerProgressBar.setString(temp);
    }
    public void updateAlphaProgressBar() {
        if (userAlpha > 128)
            alphaStrikeProgressBar.setForeground(new Color(60,180,60));
        else if (userAlpha >= 64)
            alphaStrikeProgressBar.setForeground(new Color(180 - (int)(((userAlpha - 64) / 64) * 120),180,60));
        else
            alphaStrikeProgressBar.setForeground(new Color(180,60 + (int)((userAlpha / 64) * 120),60));
        alphaStrikeProgressBar.setValue((int)userAlpha);
        temp = String.format("%.2f", userAlpha);
        alphaStrikeProgressBar.setString(temp);
    }
    public void updateAlphaHeatProgressBar() {
        Heat_Sink tempH = new Heat_Sink(heatSinkTypeToggleButton.isSelected());

        double temp2 = (userVariant.heatSinks * tempH.getHeatDissipation() * 10);
        
        if (heatSinkTypeToggleButton.isSelected()) {
            if (userVariant.heatSinks > 10)
                temp2 += 6;
            else
                temp2 += (userVariant.heatSinks * 0.6);
        }
        
        temp2 = userAlphaHeat / (temp2 + 30);
        
        if ((temp2 > 1) || userAlphaHeat == 0)
        {
            alphaStrikeHeatProgressBar.setValue(100);
            alphaStrikeHeatProgressBar.setForeground(new Color(60,180,60));
            temp = String.format("%.2f", (temp2 * 100));
            alphaStrikeHeatProgressBar.setString(temp + "%");
        }
        else
        {
            if (temp2 >= 0.5)
                alphaStrikeHeatProgressBar.setForeground(new Color(180 - (int)((temp2 / 0.5) * 60),180,60));
            else if (temp2 >= 0)
                alphaStrikeHeatProgressBar.setForeground(new Color(180,60 + (int)(temp2 * 240),60));
            alphaStrikeHeatProgressBar.setValue((int)(temp2 * 100));
            temp = String.format("%.2f", (temp2 * 100));
            alphaStrikeHeatProgressBar.setString(temp + "%");
        }
    }
    public void updateRangeProgressBar() {
        int closest = 1200;
        int range;
        int effectiveRange = 0;
        userRange = 0;
        for (int i = 0; i < Equipment[SELECTED].size(); i++)
        {
            if (Equipment[SELECTED].elementAt(i).getItemType() == WEAPON_ITEM_TYPE)
            {
                Weapon weapon = (Weapon)Equipment[SELECTED].elementAt(i);
                userRange += (weapon.getRange() * (weapon.getDamagePerSecond() / userFirepower) * equipmentQueue[i]);
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
        for (int i = 0; i < Equipment[SELECTED].size(); i++)
        {
            if (Equipment[SELECTED].elementAt(i).getItemType() == WEAPON_ITEM_TYPE)
            {
                Weapon weapon = (Weapon)Equipment[SELECTED].elementAt(i);
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
        if (effectiveRange > 690)
            rangeProgressBar.setForeground(new Color(60,180,60));
        else if (effectiveRange >= 345)
            rangeProgressBar.setForeground(new Color(180 - (int)(((effectiveRange - 345) / 345) * 120),180,60));
        else
            rangeProgressBar.setForeground(new Color(180,60 + (int)((effectiveRange / 345) * 120),60));
        rangeProgressBar.setValue(effectiveRange);
        rangeProgressBar.setString("" + effectiveRange + "m");
    }    
    public void updateHeatProgressBar() {
        Heat_Sink tempH = new Heat_Sink(heatSinkTypeToggleButton.isSelected());

        double temp2 = (userVariant.heatSinks * tempH.getHeatDissipation() / userHeat);
        
        if (heatSinkTypeToggleButton.isSelected()) {
            if (userVariant.heatSinks > 10)
                temp2 += (0.6 / userHeat);
            else
                temp2 += (userVariant.heatSinks * 0.06 / userHeat);
        }
            
        if ((temp2 > 1) || userHeat == 0)
        {
            heatEfficiencyProgressBar.setValue(100);
            heatEfficiencyProgressBar.setForeground(new Color(60,180,60));
            heatEfficiencyProgressBar.setString("100%");
        }
        else
        {
            if (temp2 >= 0.5)
                heatEfficiencyProgressBar.setForeground(new Color(180 - (int)((temp2 / 0.5) * 60),180,60));
            else if (temp2 >= 0)
                heatEfficiencyProgressBar.setForeground(new Color(180,60 + (int)(temp2 * 240),60));
            heatEfficiencyProgressBar.setValue((int)(temp2 * 100));
            temp = String.format("%.2f", (temp2 * 100));
            heatEfficiencyProgressBar.setString(temp + "%");
        }
    }
    public void updateSpeedProgressBar() {
        double temp2 = (userVariant.engineRating / userMech.getTonnage() * SPEED_MODIFIER);
        double temp3 = (speedProgressBar.getMaximum() - speedProgressBar.getMinimum()) / 2.0 + speedProgressBar.getMinimum();
        if (temp2 > speedProgressBar.getMaximum())
            speedProgressBar.setForeground(new Color(60,180,60));
        else if (temp2 >= temp3)
            speedProgressBar.setForeground(new Color(180 - (int)(((temp2 - temp3) / temp3) * 120),180,60));
        else if (temp2 > speedProgressBar.getMinimum())
            speedProgressBar.setForeground(new Color(180,60 + (int)((temp2 / temp3) * 120),60));
        else
            speedProgressBar.setForeground(new Color(180,60,60));
        
        temp = String.format("%.1f kph", temp2);
        speedProgressBar.setString(temp);
        speedProgressBar.setValue((int)Math.round(temp2));
    }
    
    public void updateArmorLabels() {
        headArmorLabel.setText("" + userVariant.armor[HEAD] + "/" + userMech.getMaxArmor(HEAD));
        rightTorsoArmorLabel.setText("" + (userVariant.armor[RIGHT_TORSO] + userVariant.armor[RIGHT_REAR_TORSO]) + "/" + userMech.getMaxArmor(RIGHT_TORSO));
        leftTorsoArmorLabel.setText("" + (userVariant.armor[LEFT_TORSO] + userVariant.armor[LEFT_REAR_TORSO]) + "/" + userMech.getMaxArmor(LEFT_TORSO));
        centerTorsoArmorLabel.setText("" + (userVariant.armor[CENTER_TORSO] + userVariant.armor[CENTER_REAR_TORSO]) + "/" + userMech.getMaxArmor(CENTER_TORSO));
        rightArmArmorLabel.setText("" + userVariant.armor[RIGHT_ARM] + "/" + userMech.getMaxArmor(RIGHT_ARM));
        leftArmArmorLabel.setText("" + userVariant.armor[LEFT_ARM] + "/" + userMech.getMaxArmor(LEFT_ARM));
        rightLegArmorLabel.setText("" + userVariant.armor[RIGHT_LEG] + "/" + userMech.getMaxArmor(RIGHT_LEG));
        leftLegArmorLabel.setText("" + userVariant.armor[LEFT_LEG] + "/" + userMech.getMaxArmor(LEFT_LEG));
        updateCurrentArmor();
        updateTonnageProgressBar();
    }
    public void updateArmorSpinners() {
        headArmorSpinnerModel.setValue(userMech.getStockArmor(HEAD));
        rightTorsoArmorSpinnerModel.setValue(userMech.getStockArmor(RIGHT_TORSO));
        leftTorsoArmorSpinnerModel.setValue(userMech.getStockArmor(LEFT_TORSO));
        centerTorsoArmorSpinnerModel.setValue(userMech.getStockArmor(CENTER_TORSO));
        rightRearTorsoArmorSpinnerModel.setValue(userMech.getStockArmor(RIGHT_REAR_TORSO));
        leftRearTorsoArmorSpinnerModel.setValue(userMech.getStockArmor(LEFT_REAR_TORSO));
        centerRearTorsoArmorSpinnerModel.setValue(userMech.getStockArmor(CENTER_REAR_TORSO));
        rightArmArmorSpinnerModel.setValue(userMech.getStockArmor(RIGHT_ARM));
        leftArmArmorSpinnerModel.setValue(userMech.getStockArmor(LEFT_ARM));
        rightLegArmorSpinnerModel.setValue(userMech.getStockArmor(RIGHT_LEG));
        leftLegArmorSpinnerModel.setValue(userMech.getStockArmor(LEFT_LEG));
        headArmorSpinnerModel.setMaximum(userMech.getMaxArmor(HEAD));
        rightTorsoArmorSpinnerModel.setMaximum((userMech.getMaxArmor(RIGHT_TORSO) - userMech.getStockArmor(RIGHT_TORSO)));
        rightRearTorsoArmorSpinnerModel.setMaximum((userMech.getMaxArmor(RIGHT_TORSO) - userMech.getStockArmor(RIGHT_REAR_TORSO)));
        leftTorsoArmorSpinnerModel.setMaximum((userMech.getMaxArmor(LEFT_TORSO) - userMech.getStockArmor(LEFT_TORSO)));
        leftRearTorsoArmorSpinnerModel.setMaximum((userMech.getMaxArmor(LEFT_TORSO) - userMech.getStockArmor(LEFT_REAR_TORSO)));
        centerTorsoArmorSpinnerModel.setMaximum((userMech.getMaxArmor(CENTER_TORSO) - userMech.getStockArmor(CENTER_TORSO)));
        centerRearTorsoArmorSpinnerModel.setMaximum((userMech.getMaxArmor(CENTER_TORSO) - userMech.getStockArmor(CENTER_REAR_TORSO)));
        rightArmArmorSpinnerModel.setMaximum(userMech.getMaxArmor(RIGHT_ARM));
        leftArmArmorSpinnerModel.setMaximum(userMech.getMaxArmor(LEFT_ARM));
        rightLegArmorSpinnerModel.setMaximum(userMech.getMaxArmor(RIGHT_LEG));
        leftLegArmorSpinnerModel.setMaximum(userMech.getMaxArmor(LEFT_LEG));
    }
    
    public void updateLesserCriticalhardpoints() {
        ballisticHardpointLabel.setText("0/0 Ballistic hardpoints");
        energyHardpointLabel.setText("0/0 Energy hardpoints");
        missileHardpointLabel.setText("0/0 Missile hardpoints");
        AMSHardpointLabel.setText("0/0 AMS hardpoints");
        ballisticHardpointLabel.setVisible(false);
        energyHardpointLabel.setVisible(false);
        missileHardpointLabel.setVisible(false);
        AMSHardpointLabel.setVisible(false);
    }
    public void updateCriticalhardpoints(int sectionID) {
        if (userMech.getHardpoints(sectionID, BALLISTIC) > 0)
        {
            ballisticHardpointLabel.setVisible(true);
            ballisticHardpointLabel.setText(userVariant.hardpoints[sectionID][BALLISTIC] + "/" + userMech.getHardpoints(sectionID, BALLISTIC) + " Ballistic hardpoints");
        }
        else
        {
            ballisticHardpointLabel.setVisible(false);
            ballisticHardpointLabel.setText("0/0 Ballistic hardpoints");
        }
        
        if (userMech.getHardpoints(sectionID, ENERGY) > 0)
        {
            energyHardpointLabel.setVisible(true);
            energyHardpointLabel.setText(userVariant.hardpoints[sectionID][ENERGY] + "/" + userMech.getHardpoints(sectionID, ENERGY) + " Energy hardpoints");
        }
        else
        {
            energyHardpointLabel.setVisible(false);
            energyHardpointLabel.setText("0/0 Energy hardpoints");
        }
        
        if (userMech.getHardpoints(sectionID, MISSILE) > 0)
        {
            missileHardpointLabel.setVisible(true);
            missileHardpointLabel.setText(userVariant.hardpoints[sectionID][MISSILE] + "/" + userMech.getHardpoints(sectionID, MISSILE) + " Missile hardpoints");
        }
        else
        {
            missileHardpointLabel.setVisible(false);
            missileHardpointLabel.setText("0/0 Missile hardpoints");
        }
        
        if (userMech.getHardpoints(sectionID, AMS) > 0)
        {
            AMSHardpointLabel.setVisible(true);
            AMSHardpointLabel.setText(userVariant.hardpoints[sectionID][AMS] + "/" + userMech.getHardpoints(sectionID, AMS) + " AMS hardpoints");
        }
        else
        {
            AMSHardpointLabel.setVisible(false);
            AMSHardpointLabel.setText("0/0 AMS hardpoints");
        }
    }
    
    public void initMainInfoPanel() {
        userAlpha = 0;
        userAlphaHeat = 0;
        userFirepower = 0;
        userHeat = 0;
        tonnageProgressBar.setMaximum((int)userMech.getTonnage());
        updateTonnageProgressBar();
        
        double engineMod;

        if (userMech.getTonnage() > 55)
            engineMod = 1.2;
        else if (userMech.getTonnage() > 35)
            engineMod = 1.3;
        else
            engineMod = 1.4;

        if (userMech.getStockEngineRating() * engineMod >= 400 && userMech.getTonnage() * 8.6 >= 400)
            total = 400;
        else if (userMech.getTonnage() * 8.6 < userMech.getStockEngineRating() * engineMod)
            total = (int) ((userMech.getTonnage() * 8.6) - (userMech.getTonnage() * 8.6) % 5);
        else
            total = (int) (Math.ceil((userMech.getStockEngineRating() * engineMod) / 5) * 5);
        
        speedProgressBar.setMaximum((int)Math.ceil(total * SPEED_MODIFIER / userMech.getTonnage()));
        
        if ((userMech.getTonnage() * 2) < 100)
            speedProgressBar.setMinimum((int)Math.floor((100 / userMech.getTonnage()) * SPEED_MODIFIER));
        else
            speedProgressBar.setMinimum((int)Math.floor(SPEED_MODIFIER * 2));
        
        updateSpeedProgressBar();
        updateAlphaProgressBar();
        updateAlphaHeatProgressBar();
        updateFirepowerProgressBar();
        updateRangeProgressBar();
        updateHeatProgressBar();
        updateCriticalProgressBar();
        
        currentArmorProgressBar.setMaximum(userMech.getMaxTotalArmor());
        currentArmorProgressBar.setValue(userMech.getStockTotalArmor());
        currentArmorProgressBar.setString("" + userMech.getStockTotalArmor());
    }
    public void initComponentInfoPanel() {
        resetCriticals();
        total = 0;
        userTonnage = 0;
        userVariant.jumpJets = 0;
        Equipment[SELECTED].removeAllElements();
        itemBayListModel.removeAllElements();
        
        ArtemisIVCheckBox.setSelected(userMech.hasArtemisIV());

        for (int i = Equipment[MISSILE].size() - 1; i >= 0; i--) {
            Weapon weapon = (Weapon)Equipment[MISSILE].elementAt(i);
            if (weapon.isArtemisIVCapable())
                Equipment[MISSILE].removeElementAt(i);
        }

        Equipment[MISSILE].insertElementAt(new SRM6(userMech.hasArtemisIV()), 1);
        Equipment[MISSILE].insertElementAt(new SRM4(userMech.hasArtemisIV()), 1);
        Equipment[MISSILE].insertElementAt(new SRM2(userMech.hasArtemisIV()), 1);
        Equipment[MISSILE].insertElementAt(new LRM20(userMech.hasArtemisIV()), 0);
        Equipment[MISSILE].insertElementAt(new LRM15(userMech.hasArtemisIV()), 0);
        Equipment[MISSILE].insertElementAt(new LRM10(userMech.hasArtemisIV()), 0);
        Equipment[MISSILE].insertElementAt(new LRM5(userMech.hasArtemisIV()), 0);

        missileListModel.removeAllElements();
        for (int i = 0; i < Equipment[MISSILE].size(); i++)
            missileListModel.addElement(Equipment[MISSILE].elementAt(i).toString());
        
        internalTypeToggleButton.setSelected(userMech.hasEndoSteel());
        
        if (userMech.hasEndoSteel())
        {
            for (int i = 0; i < 14; i++)
                addItem(new Internals(true, userMech.getTonnage()));
            userTonnage += (userMech.getTonnage() / 20) + (userMech.getTonnage() / 20 % 0.5);
            internalTypeToggleButton.setText("Endo Steel");
            temp = String.format("%.2f Tons", (userMech.getTonnage() / 20) + (userMech.getTonnage() / 20 % 0.5));
            InternalWeightLabel.setText(temp);
            temp = String.format("%,d C-Bills", ((int)userMech.getTonnage() * 1600));
            InternalCostLabel.setText(temp);
        }
        else
        {
            userTonnage += (userMech.getTonnage() / 10);
            internalTypeToggleButton.setText("Std Internals");
            temp = String.format("%.2f Tons", (userMech.getTonnage() / 10));
            InternalWeightLabel.setText(temp);
            temp = String.format("%,d C-Bills", ((int)userMech.getTonnage() * 400));
            InternalCostLabel.setText(temp);
        }
        
        armorTypeToggleButton.setSelected(userMech.hasFerroFibrous());
        
        if (userMech.hasFerroFibrous())
        {
            for (int i = 0; i < 14; i++)
                addItem(new Armor(true, userVariant.getTotalArmor()));
            
            armorTypeToggleButton.setText("Ferro Fibrous");
            userVariant.armorPointsPerTon = 35.84;
            userVariant.armorCostPerTon = 20032;
        }
        else
        {
            armorTypeToggleButton.setText("Std Armor");
            userVariant.armorPointsPerTon = 32.0;
            userVariant.armorCostPerTon = 20032;
        }
        temp = String.format("%.2f", (userMech.getStockTotalArmor() / userVariant.armorPointsPerTon));
        ArmorWeightLabel.setText(temp);
        temp = String.format("%,d C-Bills", ((int)Math.ceil((userMech.getStockTotalArmor() / userVariant.armorPointsPerTon)) * userVariant.armorCostPerTon));
        ArmorCostLabel.setText(temp);
        
        for (int i = 0; i < NUMBER_OF_SECTIONS; i++)
        {
            total += userMech.getStockArmor(i);
            userVariant.armor[i] = userMech.getStockArmor(i);
        }
        
        userTonnage += (total / userVariant.armorPointsPerTon);
        
        userVariant.engineRating = userMech.getStockEngineRating();
        
        engineTypeToggleButton.setSelected(userMech.hasXLEngine());
        
        if (userMech.hasXLEngine())
        {
            userTonnage += XLEngineTable[(userVariant.engineRating - 100) / 5][1];
            engineTypeToggleButton.setText("XL Engine");
            temp = String.format("%,d C-Bills", (userVariant.engineRating * 16000));
            EngineCostLabel.setText(temp);
            temp = String.format("%.1f Tons", (XLEngineTable[(userVariant.engineRating - 100) / 5][1]));
            EngineWeightLabel.setText(temp);
        }
        else
        {
            userTonnage += RegEngineTable[(userVariant.engineRating - 100) / 5][1];
            engineTypeToggleButton.setText("Reg Engine");
            temp = String.format("%,d C-Bills", (userVariant.engineRating * 4000));
            EngineCostLabel.setText(temp);
            temp = String.format("%.1f Tons", (RegEngineTable[(userVariant.engineRating - 100) / 5][1]));
            EngineWeightLabel.setText(temp);
        }
        
        userVariant.heatSinks = 10;
        userVariant.engineHeatSinks = userMech.getStockEngineRating() / 25;
        for (int i = 0; i < 10 - userVariant.engineHeatSinks; i++)
            addItem(new Heat_Sink(false));
        
        if (userVariant.heatSinks > userVariant.engineHeatSinks)
            userTonnage += userVariant.heatSinks - userVariant.engineHeatSinks;
        
        engineRatingSpinnerModel.setValue(userVariant.engineRating);
        
        double engineMod;

        if (userMech.getTonnage() > 55)
            engineMod = 1.2;
        else if (userMech.getTonnage() > 35)
            engineMod = 1.3;
        else
            engineMod = 1.4;

                if (userMech.getStockEngineRating() * engineMod >= 400 && userMech.getTonnage() * 8.6 >= 400)
                    total = 400;
                else if (userMech.getTonnage() * 8.6 < userMech.getStockEngineRating() * engineMod)
                    total = (int) ((userMech.getTonnage() * 8.6) - (userMech.getTonnage() * 8.6) % 5);
                else
                    total = (int) (Math.ceil((userMech.getStockEngineRating() * engineMod) / 5) * 5);
                
                engineRatingSpinnerModel.setMaximum(total);
                
        if ((int)(userMech.getTonnage() * 2) < 100)
            engineRatingSpinnerModel.setMinimum(100);
        else
            engineRatingSpinnerModel.setMinimum((int)(userMech.getTonnage() * 2));
        
        heatSinkTypeToggleButton.setSelected(userMech.hasDoubleHeatSinks());
        
        if (userMech.hasDoubleHeatSinks())
        {
            HeatDissapationLabel.setText("" + (userVariant.heatSinks * DOUBLE_HEAT_SINK_DISSIPATION));
            temp = String.format("%,d C-Bills", (userVariant.heatSinks * 6000));
            HeatSinkCostLabel.setText(temp);
            heatSinkTypeToggleButton.setText("Dbl HS");
        }
        else
        {
            HeatDissapationLabel.setText("" + (userVariant.heatSinks));
            temp = String.format("%,d C-Bills", (userVariant.heatSinks * 2000));
            HeatSinkCostLabel.setText(temp);
            heatSinkTypeToggleButton.setText("Sd HS");
        }
        
        heatSinkSpinnerModel.setValue(userVariant.heatSinks);
        heatSinkSpinnerModel.setMinimum(10);
        
        jumpJetSpinnerModel.setValue(userVariant.jumpJets);
        updateJumpJets();
        JumpJetPanel.setEnabled(userMech.hasJumpJets());
        JumpJetPanel.setVisible(userMech.hasJumpJets());
        
        sectionCritcalLabel.setText("Center Torso");
        userSection = CENTER_TORSO;
        caseCheckBox.setVisible(false);
        caseCheckBox.setEnabled(false);
        updateItemList();
        loadCriticals();
        updateCriticalhardpoints(CENTER_TORSO);
        criticalList.setVisibleRowCount(NUMBER_OF_MAIN_SECTION_CRITICALS);
    }
    public void updateMechLab() {
        initComponentInfoPanel();
        updateArmorSpinners();
        updateArmorLabels();
        initMainInfoPanel();
    }
    private void updateHardPointPanel() {
        ChassisLabel.setText(userMech.getChassis());
        VariantLabel.setText(userMech.getModel());
        TonnageLabel.setText("" + userMech.getTonnage());
        criticalList.setVisibleRowCount(NUMBER_OF_MAIN_SECTION_CRITICALS);
        
        if (userMech.getTonnage() > 75)
            ClassLabel.setText("Assault");
        else if (userMech.getTonnage() > 55)
            ClassLabel.setText("Heavy");
        else if (userMech.getTonnage() > 35)
            ClassLabel.setText("Medium");
        else
            ClassLabel.setText("Light");
        
        if (userMech.hasJumpJets())
            JJLabel.setText("Jump Capable");
        else
            JJLabel.setText("Not Capable");
        
        ModuleLabel.setText("" + userMech.getModules());
        
        temp = String.format("%,d C-Bills", userMech.getCost());
        CostLabel.setText(temp);
        temp = String.format("%,d MC", userMech.getMCCost());
        CostLabel1.setText(temp);
        
        RightArmBallisticLabel.setText("" + userMech.getHardpoints(RIGHT_ARM, BALLISTIC));
        RightArmEnergyLabel.setText("" + userMech.getHardpoints(RIGHT_ARM, ENERGY));
        RightArmMissileLabel.setText("" + userMech.getHardpoints(RIGHT_ARM, MISSILE));
        LeftArmBallisticLabel.setText("" + userMech.getHardpoints(LEFT_ARM, BALLISTIC));
        LeftArmEnergyLabel.setText("" + userMech.getHardpoints(LEFT_ARM, ENERGY));
        LeftArmMissileLabel.setText("" + userMech.getHardpoints(LEFT_ARM, MISSILE));
        RightTorsoBallisticLabel.setText("" + userMech.getHardpoints(RIGHT_TORSO, BALLISTIC));
        RightTorsoEnergyLabel.setText("" + userMech.getHardpoints(RIGHT_TORSO, ENERGY));
        RightTorsoMissileLabel.setText("" + userMech.getHardpoints(RIGHT_TORSO, MISSILE));
        LeftTorsoBallisticLabel.setText("" + userMech.getHardpoints(LEFT_TORSO, BALLISTIC));
        LeftTorsoEnergyLabel.setText("" + userMech.getHardpoints(LEFT_TORSO, ENERGY));
        LeftTorsoMissileLabel.setText("" + userMech.getHardpoints(LEFT_TORSO, MISSILE));
        CenterTorsoBallisticLabel.setText("" + userMech.getHardpoints(CENTER_TORSO, BALLISTIC));
        CenterTorsoEnergyLabel.setText("" + userMech.getHardpoints(CENTER_TORSO, ENERGY));
        CenterTorsoMissileLabel.setText("" + userMech.getHardpoints(CENTER_TORSO, MISSILE));
        HeadBallisticLabel.setText("" + userMech.getHardpoints(HEAD, BALLISTIC));
        HeadEnergyLabel.setText("" + userMech.getHardpoints(HEAD, ENERGY));
        HeadMissileLabel.setText("" + userMech.getHardpoints(HEAD, MISSILE));
        
        RightArmInternalLabel.setString("" + userMech.getMaxArmor(RIGHT_ARM));
        LeftArmInternalLabel.setString("" + userMech.getMaxArmor(LEFT_ARM));
        RightTorsoInternalLabel.setString("" + userMech.getMaxArmor(RIGHT_TORSO));
        LeftTorsoInternalLabel.setString("" + userMech.getMaxArmor(LEFT_TORSO));
        CenterTorsoInternalLabel.setString("" + userMech.getMaxArmor(CENTER_TORSO));
        HeadInternalLabel.setString("" + userMech.getMaxArmor(HEAD));
        RightLegInternalLabel.setString("" + userMech.getMaxArmor(RIGHT_LEG));
        LeftLegInternalLabel.setString("" + userMech.getMaxArmor(LEFT_LEG));
        
        RightArmArmorLabel.setString("" + userMech.getMaxInternals(RIGHT_ARM));
        LeftArmArmorLabel.setString("" + userMech.getMaxInternals(LEFT_ARM));
        RightTorsoArmorLabel.setString("" + userMech.getMaxInternals(RIGHT_TORSO));
        LeftTorsoArmorLabel.setString("" + userMech.getMaxInternals(LEFT_TORSO));
        CenterTorsoArmorLabel.setString("" + userMech.getMaxInternals(CENTER_TORSO));
        HeadArmorLabel.setString("" + userMech.getMaxInternals(HEAD));
        RightLegArmorLabel.setString("" + userMech.getMaxInternals(RIGHT_LEG));
        LeftLegArmorLabel.setString("" + userMech.getMaxInternals(LEFT_LEG));
        
        TotalInternalLabel.setString("" + userMech.getMaxTotalInternals());
        
        TotalArmorLabel.setString("" + userMech.getMaxTotalArmor());
        
        {
            total = 0;
            total =
                    userMech.getHardpoints(RIGHT_ARM, BALLISTIC) +
                    userMech.getHardpoints(LEFT_ARM, BALLISTIC) +
                    userMech.getHardpoints(RIGHT_TORSO, BALLISTIC) +
                    userMech.getHardpoints(LEFT_TORSO, BALLISTIC) +
                    userMech.getHardpoints(CENTER_TORSO, BALLISTIC) +
                    userMech.getHardpoints(HEAD, BALLISTIC);
            
            if (total > 0)
                TotalBallisticLabel.setOpaque(true);
            else
                TotalBallisticLabel.setOpaque(false);
            
            TotalBallisticLabel.setText("" + total);
        }
        
        {
            total = 0;
            total =
                    userMech.getHardpoints(RIGHT_ARM, ENERGY) +
                    userMech.getHardpoints(LEFT_ARM, ENERGY) +
                    userMech.getHardpoints(RIGHT_TORSO, ENERGY) +
                    userMech.getHardpoints(LEFT_TORSO, ENERGY) +
                    userMech.getHardpoints(CENTER_TORSO, ENERGY) +
                    userMech.getHardpoints(HEAD, ENERGY);
            
            if (total > 0)
                TotalEnergyLabel.setOpaque(true);
            else
                TotalEnergyLabel.setOpaque(false);
            
            TotalEnergyLabel.setText("" + total);
        }
        
        {
            total = 0;
            total =
                    userMech.getHardpoints(RIGHT_ARM, MISSILE) +
                    userMech.getHardpoints(LEFT_ARM, MISSILE) +
                    userMech.getHardpoints(RIGHT_TORSO, MISSILE) +
                    userMech.getHardpoints(LEFT_TORSO, MISSILE) +
                    userMech.getHardpoints(CENTER_TORSO, MISSILE) +
                    userMech.getHardpoints(HEAD, MISSILE);
            
            if (total > 0)
                TotalMissileLabel.setOpaque(true);
            else
                TotalMissileLabel.setOpaque(false);
            
            TotalMissileLabel.setText("" + total);
        }
        
        LowerArmActuatorLabel1.setVisible(userMech.getActuator(LOWER_ARM_ACTUATOR, RIGHT_ARM));
        HandActuatorLabel1.setVisible(userMech.getActuator(HAND_ACTUATOR, RIGHT_ARM));
        LowerArmActuatorLabel.setVisible(userMech.getActuator(LOWER_ARM_ACTUATOR, LEFT_ARM));
        HandActuatorLabel.setVisible(userMech.getActuator(HAND_ACTUATOR, LEFT_ARM));
        
        if (userMech.getHardpoints(RIGHT_ARM, BALLISTIC) > 0)
            RightArmBallisticLabel.setOpaque(true);
        else
            RightArmBallisticLabel.setOpaque(false);
        
        if (userMech.getHardpoints(RIGHT_ARM, ENERGY) > 0)
            RightArmEnergyLabel.setOpaque(true);
        else
            RightArmEnergyLabel.setOpaque(false);
        
        if (userMech.getHardpoints(RIGHT_ARM, MISSILE) > 0)
            RightArmMissileLabel.setOpaque(true);
        else
            RightArmMissileLabel.setOpaque(false);
        
        if (userMech.getHardpoints(LEFT_ARM, BALLISTIC) > 0)
            LeftArmBallisticLabel.setOpaque(true);
        else
            LeftArmBallisticLabel.setOpaque(false);
        
        if (userMech.getHardpoints(LEFT_ARM, ENERGY) > 0)
            LeftArmEnergyLabel.setOpaque(true);
        else
            LeftArmEnergyLabel.setOpaque(false);
        
        if (userMech.getHardpoints(LEFT_ARM, MISSILE) > 0)
            LeftArmMissileLabel.setOpaque(true);
        else
            LeftArmMissileLabel.setOpaque(false);
        
        if (userMech.getHardpoints(RIGHT_TORSO, BALLISTIC) > 0)
            RightTorsoBallisticLabel.setOpaque(true);
        else
            RightTorsoBallisticLabel.setOpaque(false);
        
        if (userMech.getHardpoints(RIGHT_TORSO, ENERGY) > 0)
            RightTorsoEnergyLabel.setOpaque(true);
        else
            RightTorsoEnergyLabel.setOpaque(false);
        
        if (userMech.getHardpoints(RIGHT_TORSO, MISSILE) > 0)
            RightTorsoMissileLabel.setOpaque(true);
        else
            RightTorsoMissileLabel.setOpaque(false);
        
        if (userMech.getHardpoints(LEFT_TORSO, BALLISTIC) > 0)
            LeftTorsoBallisticLabel.setOpaque(true);
        else
            LeftTorsoBallisticLabel.setOpaque(false);
        
        if (userMech.getHardpoints(LEFT_TORSO, ENERGY) > 0)
            LeftTorsoEnergyLabel.setOpaque(true);
        else
            LeftTorsoEnergyLabel.setOpaque(false);
        
        if (userMech.getHardpoints(LEFT_TORSO, MISSILE) > 0)
            LeftTorsoMissileLabel.setOpaque(true);
        else
            LeftTorsoMissileLabel.setOpaque(false);
        
        if (userMech.getHardpoints(CENTER_TORSO, BALLISTIC) > 0)
            CenterTorsoBallisticLabel.setOpaque(true);
        else
            CenterTorsoBallisticLabel.setOpaque(false);
        
        if (userMech.getHardpoints(CENTER_TORSO, ENERGY) > 0)
            CenterTorsoEnergyLabel.setOpaque(true);
        else
            CenterTorsoEnergyLabel.setOpaque(false);
        
        if (userMech.getHardpoints(CENTER_TORSO, MISSILE) > 0)
            CenterTorsoMissileLabel.setOpaque(true);
        else
            CenterTorsoMissileLabel.setOpaque(false);
        
        if (userMech.getHardpoints(HEAD, BALLISTIC) > 0)
            HeadBallisticLabel.setOpaque(true);
        else
            HeadBallisticLabel.setOpaque(false);
        
        if (userMech.getHardpoints(HEAD, ENERGY) > 0)
            HeadEnergyLabel.setOpaque(true);
        else
            HeadEnergyLabel.setOpaque(false);
        
        if (userMech.getHardpoints(HEAD, MISSILE) > 0)
            HeadMissileLabel.setOpaque(true);
        else
            HeadMissileLabel.setOpaque(false);
    }
    
    private void loadEquipment() {
        for (int i = 0; i < 6; i ++)
            Equipment[i] = new Vector();
        
        for (int i = 0; i < equipmentQueue.length; i++)
            equipmentQueue[i] = 0;
        
        Equipment[BALLISTIC].add(new AC2());
        Equipment[BALLISTIC].add(new AC5());
        Equipment[BALLISTIC].add(new AC10());
        Equipment[BALLISTIC].add(new AC20());
        Equipment[BALLISTIC].add(new Gauss_Rifle());
        Equipment[BALLISTIC].add(new LBX_AC10());
        Equipment[BALLISTIC].add(new MG());
        Equipment[BALLISTIC].add(new Ultra_AC5());
        
        Equipment[ENERGY].add(new Small_Laser());
        Equipment[ENERGY].add(new Medium_Laser());
        Equipment[ENERGY].add(new Large_Laser());
        Equipment[ENERGY].add(new ER_Large_Laser());
        Equipment[ENERGY].add(new Small_Pulse_Laser());
        Equipment[ENERGY].add(new Medium_Pulse_Laser());
        Equipment[ENERGY].add(new Large_Pulse_Laser());
        Equipment[ENERGY].add(new PPC());
        Equipment[ENERGY].add(new ER_PPC());
        Equipment[ENERGY].add(new Flamer());
        
        Equipment[MISSILE].add(new LRM5(false));
        Equipment[MISSILE].add(new LRM10(false));
        Equipment[MISSILE].add(new LRM15(false));
        Equipment[MISSILE].add(new LRM20(false));
        Equipment[MISSILE].add(new NARC());
        Equipment[MISSILE].add(new SRM2(false));
        Equipment[MISSILE].add(new SRM4(false));
        Equipment[MISSILE].add(new SRM6(false));
        Equipment[MISSILE].add(new Streak_SRM2());
        
        Equipment[AMMO].add(new AC2_Ammo());
        Equipment[AMMO].add(new AC5_Ammo());
        Equipment[AMMO].add(new AC10_Ammo());
        Equipment[AMMO].add(new AC20_Ammo());
        Equipment[AMMO].add(new AMS_Ammo());
        Equipment[AMMO].add(new Gauss_Ammo());
        Equipment[AMMO].add(new Homing_Pod_Ammo());
        Equipment[AMMO].add(new LBX_AC10_Ammo());
        Equipment[AMMO].add(new LRM_Ammo());
        Equipment[AMMO].add(new MG_Ammo());
        Equipment[AMMO].add(new SRM_Ammo());
        Equipment[AMMO].add(new Streak_SRM_Ammo());
        Equipment[AMMO].add(new Ultra_AC5_Ammo());
        
        Equipment[OTHER].add(new Anti_Missile_System());
        Equipment[OTHER].add(new Beagle_Active_Probe());
        Equipment[OTHER].add(new Guardian_ECM_Suite());
        Equipment[OTHER].add(new Target_Acquisition_Gear());
        Equipment[OTHER].add(new Command_Console());
        
        for (int i = 0; i < Equipment[BALLISTIC].size(); i++)
            ballisticListModel.addElement(Equipment[BALLISTIC].elementAt(i).toString());
        
        for (int i = 0; i < Equipment[ENERGY].size(); i++)
            energyListModel.addElement(Equipment[ENERGY].elementAt(i).toString());
        
        for (int i = 0; i < Equipment[MISSILE].size(); i++)
            missileListModel.addElement(Equipment[MISSILE].elementAt(i).toString());
        
        for (int i = 0; i < Equipment[AMMO].size(); i++)
            ammoListModel.addElement(Equipment[AMMO].elementAt(i).toString());
        
        for (int i = 0; i < Equipment[OTHER].size(); i++)
            specialEquipmentListModel.addElement(Equipment[OTHER].elementAt(i).toString());
            
        for (int i = 0; i < NUMBER_OF_CRITICAL_SECTIONS; i++)
            userVariant.items[i] = new Vector();
        
        ballisticSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        energySelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        missileSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        loadCriticals();
    }
    public void resetCriticals() {
        for (int i = 0; i < NUMBER_OF_CRITICAL_SECTIONS; i++)
            userVariant.items[i].removeAllElements();
        for (int i = 0; i < 5; i++)
            userVariant.criticals[i] = NUMBER_OF_MAIN_SECTION_CRITICALS;
        for (int i = 5; i < NUMBER_OF_CRITICAL_SECTIONS; i++)
            userVariant.criticals[i] = NUMBER_OF_LESSER_SECTION_CRITICALS;
        for (int i = 0; i < NUMBER_OF_MAIN_SECTION; i++)
            for (int j = 0; j < 4; j++)
                userVariant.hardpoints[i][j] = 0;
        
        userVariant.items[HEAD].add(new Life_Support());
        userVariant.items[HEAD].add(new Sensors());
        userVariant.items[HEAD].add(new Cockpit(false));
        userVariant.criticals[HEAD] -= 5;
        
        if (!userMech.hasXLEngine())
        {
            userVariant.items[CENTER_TORSO].add(new Engine(false, userMech.getStockEngineRating()));
            userVariant.items[CENTER_TORSO].add(new Gyro());
            userVariant.items[CENTER_TORSO].add(new Engine(false, userMech.getStockEngineRating()));
        }
        else
        {
            userVariant.items[CENTER_TORSO].add(new Engine(true, userMech.getStockEngineRating()));
            userVariant.items[CENTER_TORSO].add(new Gyro());
            userVariant.items[CENTER_TORSO].add(new Engine(true, userMech.getStockEngineRating()));
            userVariant.items[RIGHT_TORSO].add(new Engine(true, userMech.getStockEngineRating()));
            userVariant.items[LEFT_TORSO].add(new Engine(true, userMech.getStockEngineRating()));
            userVariant.criticals[RIGHT_TORSO] -= 3;
            userVariant.criticals[LEFT_TORSO] -= 3;
        }
        
        userVariant.criticals[CENTER_TORSO] -= 10;
        
        total = 2;
        userVariant.items[LEFT_ARM].add(new Shoulder_Actuator());
        userVariant.items[LEFT_ARM].add(new Upper_Arm_Actuator());
        if (userMech.getActuator(LOWER_ARM_ACTUATOR, LEFT_ARM))
        {
            userVariant.items[LEFT_ARM].add(new Lower_Arm_Actuator());
            total++;
        }
        if (userMech.getActuator(HAND_ACTUATOR, LEFT_ARM))
        {
            userVariant.items[LEFT_ARM].add(new Hand_Actuator());
            total++;
        }
        userVariant.criticals[LEFT_ARM] -= total;
        
        total = 2;
        userVariant.items[RIGHT_ARM].add(new Shoulder_Actuator());
        userVariant.items[RIGHT_ARM].add(new Upper_Arm_Actuator());
        if (userMech.getActuator(LOWER_ARM_ACTUATOR, RIGHT_ARM))
        {
            userVariant.items[RIGHT_ARM].add(new Lower_Arm_Actuator());
            total++;
        }
        if (userMech.getActuator(HAND_ACTUATOR, RIGHT_ARM))
        {
            userVariant.items[RIGHT_ARM].add(new Hand_Actuator());
            total++;
        }
        userVariant.criticals[RIGHT_ARM] -= total;
        
        userVariant.items[RIGHT_LEG].add(new Hip_Actuator());
        userVariant.items[RIGHT_LEG].add(new Upper_Leg_Actuator());
        userVariant.items[RIGHT_LEG].add(new Lower_Leg_Actuator());
        userVariant.items[RIGHT_LEG].add(new Foot_Actuator());
        userVariant.criticals[RIGHT_LEG] -= 4;
        
        userVariant.items[LEFT_LEG].add(new Hip_Actuator());
        userVariant.items[LEFT_LEG].add(new Upper_Leg_Actuator());
        userVariant.items[LEFT_LEG].add(new Lower_Leg_Actuator());
        userVariant.items[LEFT_LEG].add(new Foot_Actuator());
        userVariant.criticals[LEFT_LEG] -= 4;
    }
    public void loadCriticals() {
        criticalListModel.removeAllElements();
        for (int i = 0; i < userVariant.items[userSection].size(); i++)
        {
           for (int j = 0; j < userVariant.items[userSection].elementAt(i).getCriticals(); j++)
           {
               if (j == 0)
                   criticalListModel.addElement(userVariant.items[userSection].elementAt(i).toString());
               else
                   criticalListModel.addElement("-------");
           }
        }
        for (int i = 0; i < userVariant.criticals[userSection]; i++)
            criticalListModel.addElement("-Empty-");
    }
    
    public void updateItemList() {
        total = itemBayList.getSelectedIndex();
        itemBayListModel.removeAllElements();
        
        for (int i = 0; i < Equipment[SELECTED].size(); i++)
        {
            if (equipmentQueue[i] < 2)
                itemBayListModel.addElement(Equipment[SELECTED].elementAt(i).toString());
            else
                itemBayListModel.addElement("(" + equipmentQueue[i] + ") " + Equipment[SELECTED].elementAt(i).toString());
        }
        
        if (total > Equipment[SELECTED].size() - 1)
            total = Equipment[SELECTED].size() - 1;
        
        itemBayList.setSelectedIndex(total);   
    }
    public void addItem(Item item) {
        boolean found = false;
        for (int i = 0; i < Equipment[SELECTED].size(); i++)
        {
            if (item.toString() == Equipment[SELECTED].elementAt(i).toString())
            {
                equipmentQueue[i]++;
                found = true;
                break;
            }
        }
        
        if (!found)
        {
            Equipment[SELECTED].addElement(item);
            equipmentQueue[Equipment[SELECTED].size() - 1] = 1;
        }
    }
    public void removeItem(int index) {
        if (equipmentQueue[index] > 1)
            equipmentQueue[index]--;
        else
        {
            Equipment[SELECTED].removeElementAt(index);
            for (int i = index; i <equipmentQueue.length - 1; i++)
                equipmentQueue[i] = equipmentQueue[i + 1];
            equipmentQueue[equipmentQueue.length - 1] = 0;
        }
    }
    private class mechCriticalRenderer extends DefaultListCellRenderer {
        private Color EmptyFG,
                    EmptyBG,
                    NormalFG,
                    NormalBG,
                    LockedFG,
                    LockedBG;

        public mechCriticalRenderer() {
            EmptyFG = new Color(0,0,0);
            EmptyBG = new Color(180,180,180);
            NormalFG = new Color(0,0,0);
            NormalBG = new Color(120,120,120);
            LockedFG = new Color(180,180,180);
            LockedBG = new Color(60,60,60);
        }

        @Override
        public JLabel getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean hasFocus) {
            JLabel label = (JLabel)super.getListCellRendererComponent(list, value, index, isSelected, hasFocus);
            int criticalIndex = -1;
            int baseIndex = -1;

            label.setBackground( EmptyBG );
            label.setForeground( EmptyFG );
            label.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));


            for (int i = 0; i < userVariant.items[userSection].size(); i++)
            {
                
                for (int j = 0; j < userVariant.items[userSection].elementAt(i).getCriticals(); j++)
                {
                    criticalIndex++;
                    if (index == criticalIndex)
                        break;
                }
                
                baseIndex += userVariant.items[userSection].elementAt(i).getCriticals();
                
                if (index == criticalIndex) {
                    criticalIndex = i;
                    break;
                }
            }
            
            if (baseIndex < index)
                criticalIndex = -1;

            if (criticalIndex < userVariant.items[userSection].size() && criticalIndex > -1) {
                if (!userVariant.items[userSection].elementAt(criticalIndex).isRemovable()) {
                    if (isSelected && list.hasFocus()) {
                        label.setBackground( LockedFG );
                        label.setForeground( LockedBG );
                    }
                    else {
                        label.setBackground( LockedBG );
                        label.setForeground( LockedFG );
                    }
                    if (userVariant.items[userSection].elementAt(criticalIndex).getCriticals() > 1 && baseIndex != index) {
                        label.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, Color.BLACK));
                    }
                    else if (userVariant.items[userSection].elementAt(criticalIndex).getCriticals() > 1 && baseIndex == index) {
                        label.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
                    }
                    else {
                        label.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
                    }
                }
                else /*if (userVariant.items[sectionFlag].elementAt(criticalIndex).isRemovable())*/ {
                    if (userVariant.items[userSection].elementAt(criticalIndex).getHardpointType() == BALLISTIC)
                        NormalBG = new Color(120,120,60);
                    else if (userVariant.items[userSection].elementAt(criticalIndex).getHardpointType() == ENERGY)
                        NormalBG = new Color(120,60,60);
                    else if (userVariant.items[userSection].elementAt(criticalIndex).getHardpointType() == MISSILE)
                        NormalBG = new Color(60,120,60);
                    else if (userVariant.items[userSection].elementAt(criticalIndex).getHardpointType() == AMS)
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
                    
                    if (userVariant.items[userSection].elementAt(criticalIndex).getCriticals() > 1 && baseIndex != index) {
                        label.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, Color.BLACK));
                    }
                    else if (userVariant.items[userSection].elementAt(criticalIndex).getCriticals() > 1 && baseIndex == index) {
                        label.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
                    }
                    else
                        label.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
                }
            }
            return label;
        }
    }
    //<editor-fold desc="Variable Decleration">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JLabel AMSHardpointLabel;
    JLabel ArmorCostLabel;
    JPanel ArmorPanel;
    JLabel ArmorWeightLabel;
    private JCheckBox ArtemisIVCheckBox;
    JProgressBar CenterTorsoArmorLabel;
    JLabel CenterTorsoBallisticLabel;
    JLabel CenterTorsoEnergyLabel;
    JProgressBar CenterTorsoInternalLabel;
    JLabel CenterTorsoMissileLabel;
    JPanel CenterTorsoPanel;
    private JPanel ChassisInfoPanel;
    JLabel ChassisLabel;
    JLabel ClassLabel;
    JLabel CostLabel;
    JLabel CostLabel1;
    JLabel EngineCostLabel;
    JPanel EnginePanel;
    JLabel EngineWeightLabel;
    private JPanel EnhancementPanel;
    JLabel HandActuatorLabel;
    JLabel HandActuatorLabel1;
    JPanel HardpointArmorPanel;
    JProgressBar HeadArmorLabel;
    JLabel HeadBallisticLabel;
    JLabel HeadEnergyLabel;
    JProgressBar HeadInternalLabel;
    JLabel HeadMissileLabel;
    JPanel HeadPanel;
    JLabel HeatDissapationLabel;
    JLabel HeatSinkCostLabel;
    JPanel HeatSinkPanel;
    JLabel InternalCostLabel;
    JPanel InternalPanel;
    JPanel InternalTypeLabel;
    JLabel InternalWeightLabel;
    JLabel JJLabel;
    JLabel JumpJetCostLabel;
    JPanel JumpJetPanel;
    JLabel JumpJetWeightLabel;
    JProgressBar KeyArmorLabel;
    JLabel KeyBallisticLabel;
    JLabel KeyEnergyLabel;
    JProgressBar KeyInternalLabel;
    JLabel KeyMissileLabel;
    JPanel KeyPanel;
    JPanel LeftArmActuatorPanel;
    JProgressBar LeftArmArmorLabel;
    JLabel LeftArmBallisticLabel;
    JLabel LeftArmEnergyLabel;
    JProgressBar LeftArmInternalLabel;
    JLabel LeftArmMissileLabel;
    JPanel LeftArmPanel;
    JProgressBar LeftLegArmorLabel;
    JLabel LeftLegBallisticLabel;
    JLabel LeftLegEnergyLabel;
    JProgressBar LeftLegInternalLabel;
    JLabel LeftLegMissileLabel;
    JPanel LeftLegPanel;
    JProgressBar LeftTorsoArmorLabel;
    JLabel LeftTorsoBallisticLabel;
    JLabel LeftTorsoEnergyLabel;
    JProgressBar LeftTorsoInternalLabel;
    JLabel LeftTorsoMissileLabel;
    JPanel LeftTorsoPanel;
    JLabel LowerArmActuatorLabel;
    JLabel LowerArmActuatorLabel1;
    private JCheckBox MASCCheckBox;
    private JPanel MainInfoPanel;
    JTabbedPane MainTabbedPane;
    JPanel MechLabPanel;
    JTree MechList;
    JScrollPane MechListScrollPane;
    private JMenu MechsMenu;
    JLabel ModuleLabel;
    private JPanel MotivePanel;
    private JPanel ProtectionPanel;
    JPanel RightArmActuatorPanel;
    JProgressBar RightArmArmorLabel;
    JLabel RightArmBallisticLabel;
    JLabel RightArmEnergyLabel;
    JProgressBar RightArmInternalLabel;
    JLabel RightArmMissileLabel;
    JPanel RightArmPanel;
    JProgressBar RightLegArmorLabel;
    JLabel RightLegBallisticLabel;
    JLabel RightLegEnergyLabel;
    JProgressBar RightLegInternalLabel;
    JLabel RightLegMissileLabel;
    JProgressBar RightTorsoArmorLabel;
    JLabel RightTorsoBallisticLabel;
    JLabel RightTorsoEnergyLabel;
    JProgressBar RightTorsoInternalLabel;
    JLabel RightTorsoMissileLabel;
    JPanel RightTorsoPanel;
    JLabel ShoulderActuatorLabel;
    JLabel ShoulderActuatorLabel1;
    JPanel StatLabPanel;
    JLabel TonnageLabel;
    JProgressBar TotalArmorLabel;
    JLabel TotalBallisticLabel;
    JLabel TotalEnergyLabel;
    JProgressBar TotalInternalLabel;
    JLabel TotalMissileLabel;
    JPanel TotalPanel;
    private JCheckBoxMenuItem UnconfirmedCheckBoxMenuItem;
    private JCheckBoxMenuItem UnreleasedCheckBoxMenuItem;
    JLabel UpperArmActuatorLabel;
    JLabel UpperArmActuatorLabel1;
    JLabel VariantLabel;
    private JButton aboutEquipmentButton;
    private JMenuItem aboutMenuItem;
    private JButton addEquipmentButton;
    private JButton addEquipmentButton1;
    private JLabel alphaStrikeHeatLabel;
    private JProgressBar alphaStrikeHeatProgressBar;
    private JLabel alphaStrikeLabel;
    private JProgressBar alphaStrikeProgressBar;
    private JList ammoList;
    private JPanel ammoPanel;
    private JTable ammoTable1;
    private JTable ammoTable2;
    private JTable ammoTable3;
    private JPanel armorPanel;
    private JTable armorTable;
    private JToggleButton armorTypeToggleButton;
    private JLabel ballisticHardpointLabel;
    private JList ballisticList;
    private JPanel ballisticPanel;
    private JTable ballisticTable1;
    private JTable ballisticTable2;
    private JCheckBox caseCheckBox;
    private JSpinner centerRearTorsoArmorSpinner;
    private JLabel centerTorsoArmorLabel;
    private JSpinner centerTorsoArmorSpinner;
    private static final JLabel centerTorsoLabel = new JLabel();
    private JButton centerTorsoSnapButton;
    private JPanel centerTorsoSnapPanel;
    private JButton clearEquipmentButton;
    private JButton clearSectionEquipmentButton;
    private JTabbedPane componentPane;
    private JList criticalList;
    private JPanel criticalPanel;
    private JLabel criticalsUsedLabel;
    private JProgressBar criticalsUsedProgressBar;
    private JLabel currentArmorLabel;
    private JProgressBar currentArmorProgressBar;
    private JLabel currentSpeedLabel;
    private JLabel currentTonnageLabel;
    private JLabel energyHardpointLabel;
    private JList energyList;
    private JPanel energyPanel;
    private JTable energyTable1;
    private JTable energyTable2;
    private JLabel engineRatingLabel;
    private JSpinner engineRatingSpinner;
    private JTable engineTable;
    private JToggleButton engineTypeToggleButton;
    private JPanel equipmentLabPanel;
    private JPanel equipmentPanel;
    private JMenuItem exportMechMenuItem;
    private JMenu fileMenu;
    private JLabel firepowerLabel;
    private JProgressBar firepowerProgressBar;
    private static final JLabel frontLabel = new JLabel();
    private JLabel headArmorLabel;
    private JSpinner headArmorSpinner;
    private static final JLabel headLabel = new JLabel();
    private JButton headSnapButton;
    private JPanel headSnapPanel;
    private JLabel heatEfficiencyLabel;
    private JProgressBar heatEfficiencyProgressBar;
    private JLabel heatSinkLabel;
    private JSpinner heatSinkSpinner;
    private JTable heatSinkTable;
    private JToggleButton heatSinkTypeToggleButton;
    private JMenu helpMenu;
    private JTable internalTable;
    private JToggleButton internalTypeToggleButton;
    private JList itemBayList;
    private JPanel itemBayPanel;
    private JPanel itemButtonPanel;
    private JPanel itemButtonPanel1;
    private JPanel itemChooser;
    private JTabbedPane itemPane;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JPanel jPanel5;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane10;
    private JScrollPane jScrollPane11;
    private JScrollPane jScrollPane12;
    private JScrollPane jScrollPane13;
    private JScrollPane jScrollPane14;
    private JScrollPane jScrollPane15;
    private JScrollPane jScrollPane16;
    private JScrollPane jScrollPane17;
    private JScrollPane jScrollPane18;
    private JScrollPane jScrollPane19;
    private JScrollPane jScrollPane2;
    private JScrollPane jScrollPane20;
    private JScrollPane jScrollPane21;
    private JScrollPane jScrollPane3;
    private JScrollPane jScrollPane4;
    private JScrollPane jScrollPane5;
    private JScrollPane jScrollPane6;
    private JScrollPane jScrollPane7;
    private JScrollPane jScrollPane8;
    private JScrollPane jScrollPane9;
    private JTabbedPane jTabbedPane1;
    private JSpinner jumpJetSpinner;
    private JTable jumpJetTable;
    private JLabel leftArmArmorLabel;
    private JSpinner leftArmArmorSpinner;
    private static final JLabel leftArmLabel = new JLabel();
    private JButton leftArmSnapButton;
    private JPanel leftArmSnapPanel;
    private JLabel leftLegArmorLabel;
    private JSpinner leftLegArmorSpinner;
    private static final JLabel leftLegLabel = new JLabel();
    private JButton leftLegSnapButton;
    private JPanel leftLegSnapPanel;
    private JSpinner leftRearTorsoArmorSpinner;
    private JLabel leftTorsoArmorLabel;
    private JSpinner leftTorsoArmorSpinner;
    private static final JLabel leftTorsoLabel = new JLabel();
    private JButton leftTorsoSnapButton;
    private JPanel leftTorsoSnapPanel;
    private static final JLabel limitLabel = new JLabel();
    private JMenuItem loadMechMenuItem;
    private JTabbedPane mechPane;
    private JPanel mechSnapPanel;
    private JButton mechTreeButton;
    private JMenuBar mechbayMenuBar;
    private JLabel missileHardpointLabel;
    private JList missileList;
    private JPanel missilePanel;
    private JTable missileTable1;
    private JTable missileTable2;
    private JButton moduleButton;
    private JLabel rangeLabel;
    private JProgressBar rangeProgressBar;
    private static final JLabel rearLabel = new JLabel();
    private JButton removeEquipmentButton;
    private JButton removeEquipmentButton1;
    private JLabel rightArmArmorLabel;
    private JSpinner rightArmArmorSpinner;
    private static final JLabel rightArmLabel = new JLabel();
    private JButton rightArmSnapButton;
    private JPanel rightArmSnapPanel;
    private JLabel rightLegArmorLabel;
    private JSpinner rightLegArmorSpinner;
    private static final JLabel rightLegLabel = new JLabel();
    private JButton rightLegSnapButton;
    private JPanel rightLegSnapPanel;
    private JSpinner rightRearTorsoArmorSpinner;
    private JLabel rightTorsoArmorLabel;
    private static final JLabel rightTorsoArmorLabel1 = new JLabel();
    private JSpinner rightTorsoArmorSpinner;
    private JButton rightTorsoSnapButton;
    private JPanel rightTorsoSnapPanel;
    private JMenuItem saveMechMenuItem;
    private JLabel sectionCritcalLabel;
    private static final JLabel sectionLabel = new JLabel();
    private JButton selectiveEquipmentButton;
    private JList specialEquipmentList;
    private JProgressBar speedProgressBar;
    private JProgressBar tonnageProgressBar;
    private JTextField variantTextField;
    // End of variables declaration//GEN-END:variables
//</editor-fold>    
}
