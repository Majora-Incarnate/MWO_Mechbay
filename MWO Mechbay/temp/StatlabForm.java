package MWOMechbay.GUI;

import MWOMechbay.Components.*;
import MWOMechbay.Components.Ammo.*;
import MWOMechbay.Components.Components.*;
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
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Vector;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Quicksilver
 */
public class StatlabForm extends JFrame implements MainCommon {
    //<editor-fold defaultstate="collapsed" desc="User Variables">
    private Mech userMech = new Mech();
    private Variant userVariant = new Variant();
    private double userTonnage = 0;
    private double userAlpha = 0;
    private double userAlphaHeat = 0;
    private double userFirepower = 0;
    private double userHeat = 0;
    private double userSpeedMod = STANDARD_SPEED_MODIFIER;
    private int userCriticals = 0;
    private int userRange = 0;
    private boolean cockpitTypeFlag = false;
    private Vector<Item>[] Equipment = new Vector[5];
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Default Models">
    private DefaultComboBoxModel ChassisTypeComboBoxModel = new DefaultComboBoxModel();
    private DefaultComboBoxModel ChassisModelComboBoxModel = new DefaultComboBoxModel();
    
    private DefaultListModel HeadCriticalListModel = new DefaultListModel();
    private DefaultListModel RightTorsoCriticalListModel = new DefaultListModel();
    private DefaultListModel CenterTorsoCriticalListModel = new DefaultListModel();
    private DefaultListModel LeftTorsoCriticalListModel = new DefaultListModel();
    private DefaultListModel RightArmCriticalListModel = new DefaultListModel();
    private DefaultListModel LeftArmCriticalListModel = new DefaultListModel();
    private DefaultListModel RightLegCriticalListModel = new DefaultListModel();
    private DefaultListModel LeftLegCriticalListModel = new DefaultListModel();
    
    private DefaultListSelectionModel ballisticSelectionModel = new DefaultListSelectionModel();
    private DefaultListSelectionModel energySelectionModel = new DefaultListSelectionModel();
    private DefaultListSelectionModel missileSelectionModel = new DefaultListSelectionModel();
    //</editor-fold>
    private String temp;
    
    private HubForm parent;

    public StatlabForm(HubForm nParent) {
        parent = nParent;
        initVariables();
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        GridBagConstraints gridBagConstraints;

        MechLabPanel = new JPanel();
        DiagramPanel = new JPanel();
        StatsPanel = new JPanel();
        HeadStatsPanel = new JPanel();
        HeadBallisticLabel = new JLabel();
        HeadEnergyLabel = new JLabel();
        HeadMissileLabel = new JLabel();
        HeadAMSLabel = new JLabel();
        HeadInternalLabel = new JProgressBar();
        HeadArmorLabel = new JProgressBar();
        CenterTorsoStatsPanel = new JPanel();
        CenterTorsoBallisticLabel = new JLabel();
        CenterTorsoEnergyLabel = new JLabel();
        CenterTorsoMissileLabel = new JLabel();
        CenterTorsoAMSLabel = new JLabel();
        CenterTorsoInternalLabel = new JProgressBar();
        CenterTorsoArmorLabel = new JProgressBar();
        RightTorsoStatsPanel = new JPanel();
        RightTorsoBallisticLabel = new JLabel();
        RightTorsoEnergyLabel = new JLabel();
        RightTorsoMissileLabel = new JLabel();
        RightTorsoAMSLabel = new JLabel();
        RightTorsoInternalLabel = new JProgressBar();
        RightTorsoArmorLabel = new JProgressBar();
        LeftTorsoStatsPanel = new JPanel();
        LeftTorsoBallisticLabel = new JLabel();
        LeftTorsoEnergyLabel = new JLabel();
        LeftTorsoMissileLabel = new JLabel();
        LeftTorsoAMSLabel = new JLabel();
        LeftTorsoInternalLabel = new JProgressBar();
        LeftTorsoArmorLabel = new JProgressBar();
        RightArmStatsPanel = new JPanel();
        RightArmBallisticLabel = new JLabel();
        RightArmEnergyLabel = new JLabel();
        RightArmMissileLabel = new JLabel();
        RightArmAMSLabel = new JLabel();
        RightArmInternalLabel = new JProgressBar();
        RightArmArmorLabel = new JProgressBar();
        LeftArmStatsPanel = new JPanel();
        LeftArmBallisticLabel = new JLabel();
        LeftArmEnergyLabel = new JLabel();
        LeftArmMissileLabel = new JLabel();
        LeftArmAMSLabel = new JLabel();
        LeftArmInternalLabel = new JProgressBar();
        LeftArmArmorLabel = new JProgressBar();
        RightLegStatsPanel = new JPanel();
        RightLegBallisticLabel = new JLabel();
        RightLegEnergyLabel = new JLabel();
        RightLegMissileLabel = new JLabel();
        RightLegAMSLabel = new JLabel();
        RightLegInternalLabel = new JProgressBar();
        RightLegArmorLabel = new JProgressBar();
        LeftLegStatsPanel = new JPanel();
        LeftLegBallisticLabel = new JLabel();
        LeftLegEnergyLabel = new JLabel();
        LeftLegMissileLabel = new JLabel();
        LeftLegAMSLabel = new JLabel();
        LeftLegInternalLabel = new JProgressBar();
        LeftLegArmorLabel = new JProgressBar();
        CriticalsPanel = new JPanel();
        HeadCriticalPanel = new JPanel();
        HeadList = new JList();
        CenterTorsoCriticalPanel = new JPanel();
        CenterTorsoList = new JList();
        RightTorsoCriticalPanel = new JPanel();
        RightTorsoList = new JList();
        LeftTorsoCriticalPanel = new JPanel();
        LeftTorsoList = new JList();
        RightArmCriticalPanel = new JPanel();
        RightArmList = new JList();
        LeftArmCriticalPanel = new JPanel();
        LeftArmList = new JList();
        RightLegCriticalPanel = new JPanel();
        RightLegList = new JList();
        LeftLegCriticalPanel = new JPanel();
        LeftLegList = new JList();
        StockArmorPanel = new JPanel();
        HeadStockPanel = new JPanel();
        HeadArmorProgressBar = new JProgressBar();
        RightArmStockPanel = new JPanel();
        RightArmArmorProgressBar = new JProgressBar();
        LeftArmStockPanel = new JPanel();
        LeftArmArmorProgressBar = new JProgressBar();
        RightLegStockPanel = new JPanel();
        RightLegArmorProgressBar = new JProgressBar();
        LeftLegStockPanel = new JPanel();
        LeftLegArmorProgressBar = new JProgressBar();
        RightTorsoSplitPane = new JSplitPane();
        RightTorsoFrontPanel = new JPanel();
        RightTorsoArmorProgressBar = new JProgressBar();
        RightTorsoRearPanel = new JPanel();
        RearRightTorsoArmorProgressBar = new JProgressBar();
        LeftTorsoSplitPane = new JSplitPane();
        LeftTorsoFrontPanel = new JPanel();
        LeftTorsoArmorProgressBar = new JProgressBar();
        LeftTorsoRearPanel = new JPanel();
        RearLeftTorsoArmorProgressBar = new JProgressBar();
        CenterTorsoSplitPane = new JSplitPane();
        CenterTorsoFrontPanel = new JPanel();
        CenterTorsoArmorProgressBar = new JProgressBar();
        CenterTorsoRearPanel = new JPanel();
        RearCenterTorsoArmorProgressBar = new JProgressBar();
        EquipmentTabbedPane = new JTabbedPane();
        AmmoPanel = new JPanel();
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
        BallisticPanel = new JPanel();
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
        EnergyPanel = new JPanel();
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
        MissilePanel = new JPanel();
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
        OtherEquipmentPanel = new JPanel();
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
        MechImage = new JLabel();
        MechTabPane = new JTabbedPane();
        ChassisScrollPane = new JScrollPane();
        ChassisPanel = new JPanel();
        ChassisComboBox = new JComboBox();
        ModelComboBox = new JComboBox();
        SpeculationPanel = new JPanel();
        UnconfirmedLabel = new JLabel();
        UnreleasedLabel = new JLabel();
        OverviewPanel = new JPanel();
        TonnageLabel = new JLabel();
        ClassLabel = new JLabel();
        ModuleLabel = new JLabel();
        JumpCapabilityLabel = new JLabel();
        ModuleLabel1 = new JLabel();
        JumpCapabilityLabel1 = new JLabel();
        KeyPanel = new JPanel();
        KeyArmorLabel = new JProgressBar();
        KeyInternalLabel = new JProgressBar();
        KeyBallisticLabel = new JLabel();
        KeyEnergyLabel = new JLabel();
        KeyMissileLabel = new JLabel();
        KeyAMSLabel = new JLabel();
        TotalPanel = new JPanel();
        TotalArmorLabel = new JProgressBar();
        TotalInternalLabel = new JProgressBar();
        TotalBallisticLabel = new JLabel();
        TotalEnergyLabel = new JLabel();
        TotalMissileLabel = new JLabel();
        TotalAMSLabel = new JLabel();
        SpeedLimitsPanel = new JPanel();
        MinimumSpeedLabel = new JLabel();
        MaximumSpeedLabel = new JLabel();
        MinimumRatingLabel = new JLabel();
        MaximumRatingLabel = new JLabel();
        AttributesPanel = new JPanel();
        TorsoYawLabel = new JLabel();
        TorsoPitchLabel = new JLabel();
        ArmYawLabel = new JLabel();
        ArmPitchLabel = new JLabel();
        InfoPanel = new JPanel();
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
        rangeLabel = new JLabel();
        rangeProgressBar = new JProgressBar();
        alphaStrikeHeatLabel = new JLabel();
        alphaStrikeHeatProgressBar = new JProgressBar();
        criticalsUsedLabel = new JLabel();
        criticalsUsedProgressBar = new JProgressBar();
        ComponentScrollPane = new JScrollPane();
        ComponentPanel = new JPanel();
        EnginePanel = new JPanel();
        EngineTonnageLabel = new JLabel();
        EngineCostLabel = new JLabel();
        EngineRatingLabel = new JLabel();
        EngineTypeLabel = new JLabel();
        EngineCriticalsLabel = new JLabel();
        EngineHeatSinkLabel = new JLabel();
        HeatSinkPanel = new JPanel();
        HeatSinkTypeLabel = new JLabel();
        HeatSinkCountLabel = new JLabel();
        HeatSinkCostLabel = new JLabel();
        HeatSinkDissipationLabel = new JLabel();
        ArmorPanel = new JPanel();
        ArmorTonnageLabel = new JLabel();
        ArmorCostLabel = new JLabel();
        ArmorTypeLabel = new JLabel();
        ArmorCriticalsLabel = new JLabel();
        InternalsPanel = new JPanel();
        InternalsTonnageLabel = new JLabel();
        InternalsCostLabel = new JLabel();
        InternalsTypeLabel = new JLabel();
        InternalsCriticalsLabel = new JLabel();
        GyroPanel = new JPanel();
        GyroTypeLabel = new JLabel();
        GyroCostLabel = new JLabel();
        GyroTonnageLabel = new JLabel();
        GyroCriticalsLabel = new JLabel();
        CockpitPanel = new JPanel();
        CockpitTypeLabel = new JLabel();
        CockpitCostLabel = new JLabel();
        CockpitTonnageLabel = new JLabel();
        CockpitCriticalsLabel = new JLabel();
        OtherPanel = new JPanel();
        MechTreesButton = new JButton();
        PilotTreesButton = new JButton();
        AboutButton = new JButton();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MWO Statlab");
        setLocationByPlatform(true);
        setMinimumSize(new Dimension(832, 512));
        setName("MainFrame"); // NOI18N
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new GridBagLayout());

        MechLabPanel.setAlignmentX(0.0F);
        MechLabPanel.setAlignmentY(0.0F);
        MechLabPanel.setFont(new Font("Moire", 0, 10)); // NOI18N
        MechLabPanel.setMaximumSize(new Dimension(800, 600));
        MechLabPanel.setLayout(new GridBagLayout());

        DiagramPanel.setAlignmentX(0.0F);
        DiagramPanel.setAlignmentY(0.0F);
        DiagramPanel.setFont(new Font("Moire", 0, 10)); // NOI18N
        DiagramPanel.setMaximumSize(new Dimension(512, 512));
        DiagramPanel.setMinimumSize(new Dimension(512, 512));
        DiagramPanel.setPreferredSize(new Dimension(512, 512));
        DiagramPanel.setLayout(new GridBagLayout());

        StatsPanel.setAlignmentX(0.0F);
        StatsPanel.setAlignmentY(0.0F);
        StatsPanel.setFont(new Font("Moire", 0, 10)); // NOI18N
        StatsPanel.setMaximumSize(new Dimension(512, 512));
        StatsPanel.setMinimumSize(new Dimension(512, 512));
        StatsPanel.setOpaque(false);
        StatsPanel.setPreferredSize(new Dimension(512, 512));
        StatsPanel.setLayout(new GridBagLayout());

        HeadStatsPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Head", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 10))); // NOI18N
        HeadStatsPanel.setAlignmentX(0.0F);
        HeadStatsPanel.setAlignmentY(0.0F);
        HeadStatsPanel.setFont(new Font("Moire", 0, 10)); // NOI18N
        HeadStatsPanel.setMaximumSize(new Dimension(100, 150));
        HeadStatsPanel.setMinimumSize(new Dimension(100, 150));
        HeadStatsPanel.setOpaque(false);
        HeadStatsPanel.setPreferredSize(new Dimension(100, 150));
        HeadStatsPanel.setLayout(new GridBagLayout());

        HeadBallisticLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
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

        HeadEnergyLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
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

        HeadMissileLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
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

        HeadAMSLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
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
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        HeadStatsPanel.add(HeadInternalLabel, gridBagConstraints);

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
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        HeadStatsPanel.add(HeadArmorLabel, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        StatsPanel.add(HeadStatsPanel, gridBagConstraints);

        CenterTorsoStatsPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Center Torso", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 10))); // NOI18N
        CenterTorsoStatsPanel.setAlignmentX(0.0F);
        CenterTorsoStatsPanel.setAlignmentY(0.0F);
        CenterTorsoStatsPanel.setFont(new Font("Moire", 0, 10)); // NOI18N
        CenterTorsoStatsPanel.setMaximumSize(new Dimension(100, 150));
        CenterTorsoStatsPanel.setMinimumSize(new Dimension(100, 150));
        CenterTorsoStatsPanel.setOpaque(false);
        CenterTorsoStatsPanel.setPreferredSize(new Dimension(100, 150));
        CenterTorsoStatsPanel.setLayout(new GridBagLayout());

        CenterTorsoBallisticLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
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

        CenterTorsoEnergyLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
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

        CenterTorsoMissileLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
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

        CenterTorsoAMSLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
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
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        CenterTorsoStatsPanel.add(CenterTorsoInternalLabel, gridBagConstraints);

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
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        CenterTorsoStatsPanel.add(CenterTorsoArmorLabel, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        StatsPanel.add(CenterTorsoStatsPanel, gridBagConstraints);

        RightTorsoStatsPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Right Torso", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 10))); // NOI18N
        RightTorsoStatsPanel.setAlignmentX(0.0F);
        RightTorsoStatsPanel.setAlignmentY(0.0F);
        RightTorsoStatsPanel.setFont(new Font("Moire", 0, 10)); // NOI18N
        RightTorsoStatsPanel.setMaximumSize(new Dimension(100, 150));
        RightTorsoStatsPanel.setMinimumSize(new Dimension(100, 150));
        RightTorsoStatsPanel.setOpaque(false);
        RightTorsoStatsPanel.setPreferredSize(new Dimension(100, 150));
        RightTorsoStatsPanel.setLayout(new GridBagLayout());

        RightTorsoBallisticLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
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

        RightTorsoEnergyLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
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

        RightTorsoMissileLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
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

        RightTorsoAMSLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
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
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        RightTorsoStatsPanel.add(RightTorsoInternalLabel, gridBagConstraints);

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
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        RightTorsoStatsPanel.add(RightTorsoArmorLabel, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        StatsPanel.add(RightTorsoStatsPanel, gridBagConstraints);

        LeftTorsoStatsPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Left Torso", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 10))); // NOI18N
        LeftTorsoStatsPanel.setAlignmentX(0.0F);
        LeftTorsoStatsPanel.setAlignmentY(0.0F);
        LeftTorsoStatsPanel.setFont(new Font("Moire", 0, 10)); // NOI18N
        LeftTorsoStatsPanel.setMaximumSize(new Dimension(100, 150));
        LeftTorsoStatsPanel.setMinimumSize(new Dimension(100, 150));
        LeftTorsoStatsPanel.setOpaque(false);
        LeftTorsoStatsPanel.setPreferredSize(new Dimension(100, 150));
        LeftTorsoStatsPanel.setLayout(new GridBagLayout());

        LeftTorsoBallisticLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
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

        LeftTorsoEnergyLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
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

        LeftTorsoMissileLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
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

        LeftTorsoAMSLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
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
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        LeftTorsoStatsPanel.add(LeftTorsoInternalLabel, gridBagConstraints);

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
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        LeftTorsoStatsPanel.add(LeftTorsoArmorLabel, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        StatsPanel.add(LeftTorsoStatsPanel, gridBagConstraints);

        RightArmStatsPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Right Arm", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 10))); // NOI18N
        RightArmStatsPanel.setAlignmentX(0.0F);
        RightArmStatsPanel.setAlignmentY(0.0F);
        RightArmStatsPanel.setFont(new Font("Moire", 0, 10)); // NOI18N
        RightArmStatsPanel.setMaximumSize(new Dimension(100, 150));
        RightArmStatsPanel.setMinimumSize(new Dimension(100, 150));
        RightArmStatsPanel.setOpaque(false);
        RightArmStatsPanel.setPreferredSize(new Dimension(100, 150));
        RightArmStatsPanel.setLayout(new GridBagLayout());

        RightArmBallisticLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
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

        RightArmEnergyLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
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

        RightArmMissileLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
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

        RightArmAMSLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
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
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        RightArmStatsPanel.add(RightArmInternalLabel, gridBagConstraints);

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
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        RightArmStatsPanel.add(RightArmArmorLabel, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        StatsPanel.add(RightArmStatsPanel, gridBagConstraints);

        LeftArmStatsPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Left Arm", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 10))); // NOI18N
        LeftArmStatsPanel.setAlignmentX(0.0F);
        LeftArmStatsPanel.setAlignmentY(0.0F);
        LeftArmStatsPanel.setFont(new Font("Moire", 0, 10)); // NOI18N
        LeftArmStatsPanel.setMaximumSize(new Dimension(100, 150));
        LeftArmStatsPanel.setMinimumSize(new Dimension(100, 150));
        LeftArmStatsPanel.setOpaque(false);
        LeftArmStatsPanel.setPreferredSize(new Dimension(100, 150));
        LeftArmStatsPanel.setLayout(new GridBagLayout());

        LeftArmBallisticLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
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

        LeftArmEnergyLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
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

        LeftArmMissileLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
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

        LeftArmAMSLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
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
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        LeftArmStatsPanel.add(LeftArmInternalLabel, gridBagConstraints);

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
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        LeftArmStatsPanel.add(LeftArmArmorLabel, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        StatsPanel.add(LeftArmStatsPanel, gridBagConstraints);

        RightLegStatsPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Right Leg", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 10))); // NOI18N
        RightLegStatsPanel.setAlignmentX(0.0F);
        RightLegStatsPanel.setAlignmentY(0.0F);
        RightLegStatsPanel.setFont(new Font("Moire", 0, 10)); // NOI18N
        RightLegStatsPanel.setMaximumSize(new Dimension(100, 150));
        RightLegStatsPanel.setMinimumSize(new Dimension(100, 150));
        RightLegStatsPanel.setOpaque(false);
        RightLegStatsPanel.setPreferredSize(new Dimension(100, 150));
        RightLegStatsPanel.setLayout(new GridBagLayout());

        RightLegBallisticLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
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

        RightLegEnergyLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
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

        RightLegMissileLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
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

        RightLegAMSLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
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
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        RightLegStatsPanel.add(RightLegInternalLabel, gridBagConstraints);

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
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        RightLegStatsPanel.add(RightLegArmorLabel, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        StatsPanel.add(RightLegStatsPanel, gridBagConstraints);

        LeftLegStatsPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Left Leg", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 10))); // NOI18N
        LeftLegStatsPanel.setAlignmentX(0.0F);
        LeftLegStatsPanel.setAlignmentY(0.0F);
        LeftLegStatsPanel.setFont(new Font("Moire", 0, 10)); // NOI18N
        LeftLegStatsPanel.setMaximumSize(new Dimension(100, 150));
        LeftLegStatsPanel.setMinimumSize(new Dimension(100, 150));
        LeftLegStatsPanel.setOpaque(false);
        LeftLegStatsPanel.setPreferredSize(new Dimension(100, 150));
        LeftLegStatsPanel.setLayout(new GridBagLayout());

        LeftLegBallisticLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
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

        LeftLegEnergyLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
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

        LeftLegMissileLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
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

        LeftLegAMSLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
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
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        LeftLegStatsPanel.add(LeftLegInternalLabel, gridBagConstraints);

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
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        LeftLegStatsPanel.add(LeftLegArmorLabel, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        StatsPanel.add(LeftLegStatsPanel, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        DiagramPanel.add(StatsPanel, gridBagConstraints);

        CriticalsPanel.setAlignmentX(0.0F);
        CriticalsPanel.setAlignmentY(0.0F);
        CriticalsPanel.setFont(new Font("Moire", 0, 10)); // NOI18N
        CriticalsPanel.setMaximumSize(new Dimension(512, 512));
        CriticalsPanel.setMinimumSize(new Dimension(512, 512));
        CriticalsPanel.setOpaque(false);
        CriticalsPanel.setPreferredSize(new Dimension(512, 512));
        CriticalsPanel.setLayout(new GridBagLayout());

        HeadCriticalPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Head", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 10))); // NOI18N
        HeadCriticalPanel.setAlignmentX(0.0F);
        HeadCriticalPanel.setAlignmentY(0.0F);
        HeadCriticalPanel.setFont(new Font("Moire", 0, 10)); // NOI18N
        HeadCriticalPanel.setMaximumSize(new Dimension(100, 120));
        HeadCriticalPanel.setMinimumSize(new Dimension(100, 120));
        HeadCriticalPanel.setOpaque(false);
        HeadCriticalPanel.setPreferredSize(new Dimension(100, 120));
        HeadCriticalPanel.setLayout(new GridBagLayout());

        HeadList.setFont(HeadList.getFont().deriveFont((float)10));
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
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        HeadCriticalPanel.add(HeadList, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        CriticalsPanel.add(HeadCriticalPanel, gridBagConstraints);

        CenterTorsoCriticalPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Center Torso", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 10))); // NOI18N
        CenterTorsoCriticalPanel.setAlignmentX(0.0F);
        CenterTorsoCriticalPanel.setAlignmentY(0.0F);
        CenterTorsoCriticalPanel.setFont(new Font("Moire", 0, 10)); // NOI18N
        CenterTorsoCriticalPanel.setMaximumSize(new Dimension(100, 200));
        CenterTorsoCriticalPanel.setMinimumSize(new Dimension(100, 200));
        CenterTorsoCriticalPanel.setOpaque(false);
        CenterTorsoCriticalPanel.setPreferredSize(new Dimension(100, 200));
        CenterTorsoCriticalPanel.setLayout(new GridBagLayout());

        CenterTorsoList.setFont(CenterTorsoList.getFont().deriveFont((float)10));
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
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        CenterTorsoCriticalPanel.add(CenterTorsoList, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        CriticalsPanel.add(CenterTorsoCriticalPanel, gridBagConstraints);

        RightTorsoCriticalPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Right Torso", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 10))); // NOI18N
        RightTorsoCriticalPanel.setAlignmentX(0.0F);
        RightTorsoCriticalPanel.setAlignmentY(0.0F);
        RightTorsoCriticalPanel.setFont(new Font("Moire", 0, 10)); // NOI18N
        RightTorsoCriticalPanel.setMaximumSize(new Dimension(100, 200));
        RightTorsoCriticalPanel.setMinimumSize(new Dimension(100, 200));
        RightTorsoCriticalPanel.setOpaque(false);
        RightTorsoCriticalPanel.setPreferredSize(new Dimension(100, 200));
        RightTorsoCriticalPanel.setLayout(new GridBagLayout());

        RightTorsoList.setFont(RightTorsoList.getFont().deriveFont((float)10));
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
        CriticalsPanel.add(RightTorsoCriticalPanel, gridBagConstraints);

        LeftTorsoCriticalPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Left Torso", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 10))); // NOI18N
        LeftTorsoCriticalPanel.setAlignmentX(0.0F);
        LeftTorsoCriticalPanel.setAlignmentY(0.0F);
        LeftTorsoCriticalPanel.setFont(new Font("Moire", 0, 10)); // NOI18N
        LeftTorsoCriticalPanel.setMaximumSize(new Dimension(100, 200));
        LeftTorsoCriticalPanel.setMinimumSize(new Dimension(100, 200));
        LeftTorsoCriticalPanel.setOpaque(false);
        LeftTorsoCriticalPanel.setPreferredSize(new Dimension(100, 200));
        LeftTorsoCriticalPanel.setLayout(new GridBagLayout());

        LeftTorsoList.setFont(LeftTorsoList.getFont().deriveFont((float)10));
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
        CriticalsPanel.add(LeftTorsoCriticalPanel, gridBagConstraints);

        RightArmCriticalPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Right Arm", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 10))); // NOI18N
        RightArmCriticalPanel.setAlignmentX(0.0F);
        RightArmCriticalPanel.setAlignmentY(0.0F);
        RightArmCriticalPanel.setFont(new Font("Moire", 0, 10)); // NOI18N
        RightArmCriticalPanel.setMaximumSize(new Dimension(100, 200));
        RightArmCriticalPanel.setMinimumSize(new Dimension(100, 200));
        RightArmCriticalPanel.setOpaque(false);
        RightArmCriticalPanel.setPreferredSize(new Dimension(100, 200));
        RightArmCriticalPanel.setLayout(new GridBagLayout());

        RightArmList.setFont(RightArmList.getFont().deriveFont((float)10));
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
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        RightArmCriticalPanel.add(RightArmList, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        CriticalsPanel.add(RightArmCriticalPanel, gridBagConstraints);

        LeftArmCriticalPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Left Arm", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 10))); // NOI18N
        LeftArmCriticalPanel.setAlignmentX(0.0F);
        LeftArmCriticalPanel.setAlignmentY(0.0F);
        LeftArmCriticalPanel.setFont(new Font("Moire", 0, 10)); // NOI18N
        LeftArmCriticalPanel.setMaximumSize(new Dimension(100, 200));
        LeftArmCriticalPanel.setMinimumSize(new Dimension(100, 200));
        LeftArmCriticalPanel.setOpaque(false);
        LeftArmCriticalPanel.setPreferredSize(new Dimension(100, 200));
        LeftArmCriticalPanel.setLayout(new GridBagLayout());

        LeftArmList.setFont(LeftArmList.getFont().deriveFont((float)10));
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
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        LeftArmCriticalPanel.add(LeftArmList, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        CriticalsPanel.add(LeftArmCriticalPanel, gridBagConstraints);

        RightLegCriticalPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Right Leg", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 10))); // NOI18N
        RightLegCriticalPanel.setAlignmentX(0.0F);
        RightLegCriticalPanel.setAlignmentY(0.0F);
        RightLegCriticalPanel.setFont(new Font("Moire", 0, 10)); // NOI18N
        RightLegCriticalPanel.setMaximumSize(new Dimension(100, 120));
        RightLegCriticalPanel.setMinimumSize(new Dimension(100, 120));
        RightLegCriticalPanel.setOpaque(false);
        RightLegCriticalPanel.setPreferredSize(new Dimension(100, 120));
        RightLegCriticalPanel.setLayout(new GridBagLayout());

        RightLegList.setFont(RightLegList.getFont().deriveFont((float)10));
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
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        RightLegCriticalPanel.add(RightLegList, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        CriticalsPanel.add(RightLegCriticalPanel, gridBagConstraints);

        LeftLegCriticalPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Left Leg", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 10))); // NOI18N
        LeftLegCriticalPanel.setAlignmentX(0.0F);
        LeftLegCriticalPanel.setAlignmentY(0.0F);
        LeftLegCriticalPanel.setFont(new Font("Moire", 0, 10)); // NOI18N
        LeftLegCriticalPanel.setMaximumSize(new Dimension(100, 120));
        LeftLegCriticalPanel.setMinimumSize(new Dimension(100, 120));
        LeftLegCriticalPanel.setOpaque(false);
        LeftLegCriticalPanel.setPreferredSize(new Dimension(100, 120));
        LeftLegCriticalPanel.setLayout(new GridBagLayout());

        LeftLegList.setFont(LeftLegList.getFont().deriveFont((float)10));
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
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        LeftLegCriticalPanel.add(LeftLegList, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        CriticalsPanel.add(LeftLegCriticalPanel, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        DiagramPanel.add(CriticalsPanel, gridBagConstraints);

        StockArmorPanel.setAlignmentX(0.0F);
        StockArmorPanel.setAlignmentY(0.0F);
        StockArmorPanel.setFont(new Font("Moire", 0, 10)); // NOI18N
        StockArmorPanel.setMaximumSize(new Dimension(512, 512));
        StockArmorPanel.setMinimumSize(new Dimension(512, 512));
        StockArmorPanel.setOpaque(false);
        StockArmorPanel.setPreferredSize(new Dimension(512, 512));
        StockArmorPanel.setLayout(new GridBagLayout());

        HeadStockPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Head", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 10))); // NOI18N
        HeadStockPanel.setAlignmentX(0.0F);
        HeadStockPanel.setAlignmentY(0.0F);
        HeadStockPanel.setFont(new Font("Moire", 0, 10)); // NOI18N
        HeadStockPanel.setMaximumSize(new Dimension(100, 150));
        HeadStockPanel.setMinimumSize(new Dimension(100, 150));
        HeadStockPanel.setOpaque(false);
        HeadStockPanel.setPreferredSize(new Dimension(100, 150));
        HeadStockPanel.setLayout(new GridBagLayout());

        HeadArmorProgressBar.setFont(HeadArmorProgressBar.getFont().deriveFont((float)10));
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
        HeadStockPanel.add(HeadArmorProgressBar, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        StockArmorPanel.add(HeadStockPanel, gridBagConstraints);

        RightArmStockPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Right Arm", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 10))); // NOI18N
        RightArmStockPanel.setAlignmentX(0.0F);
        RightArmStockPanel.setAlignmentY(0.0F);
        RightArmStockPanel.setFont(new Font("Moire", 0, 10)); // NOI18N
        RightArmStockPanel.setMaximumSize(new Dimension(100, 150));
        RightArmStockPanel.setMinimumSize(new Dimension(100, 150));
        RightArmStockPanel.setOpaque(false);
        RightArmStockPanel.setPreferredSize(new Dimension(100, 150));
        RightArmStockPanel.setLayout(new GridBagLayout());

        RightArmArmorProgressBar.setFont(RightArmArmorProgressBar.getFont().deriveFont((float)10));
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
        RightArmStockPanel.add(RightArmArmorProgressBar, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        StockArmorPanel.add(RightArmStockPanel, gridBagConstraints);

        LeftArmStockPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Left Arm", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 10))); // NOI18N
        LeftArmStockPanel.setAlignmentX(0.0F);
        LeftArmStockPanel.setAlignmentY(0.0F);
        LeftArmStockPanel.setFont(new Font("Moire", 0, 10)); // NOI18N
        LeftArmStockPanel.setMaximumSize(new Dimension(100, 150));
        LeftArmStockPanel.setMinimumSize(new Dimension(100, 150));
        LeftArmStockPanel.setOpaque(false);
        LeftArmStockPanel.setPreferredSize(new Dimension(100, 150));
        LeftArmStockPanel.setLayout(new GridBagLayout());

        LeftArmArmorProgressBar.setFont(LeftArmArmorProgressBar.getFont().deriveFont((float)10));
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
        LeftArmStockPanel.add(LeftArmArmorProgressBar, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        StockArmorPanel.add(LeftArmStockPanel, gridBagConstraints);

        RightLegStockPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Right Leg", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 10))); // NOI18N
        RightLegStockPanel.setAlignmentX(0.0F);
        RightLegStockPanel.setAlignmentY(0.0F);
        RightLegStockPanel.setFont(new Font("Moire", 0, 10)); // NOI18N
        RightLegStockPanel.setMaximumSize(new Dimension(100, 150));
        RightLegStockPanel.setMinimumSize(new Dimension(100, 150));
        RightLegStockPanel.setOpaque(false);
        RightLegStockPanel.setPreferredSize(new Dimension(100, 150));
        RightLegStockPanel.setLayout(new GridBagLayout());

        RightLegArmorProgressBar.setFont(RightLegArmorProgressBar.getFont().deriveFont((float)10));
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
        RightLegStockPanel.add(RightLegArmorProgressBar, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        StockArmorPanel.add(RightLegStockPanel, gridBagConstraints);

        LeftLegStockPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Left Leg", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 10))); // NOI18N
        LeftLegStockPanel.setAlignmentX(0.0F);
        LeftLegStockPanel.setAlignmentY(0.0F);
        LeftLegStockPanel.setFont(new Font("Moire", 0, 10)); // NOI18N
        LeftLegStockPanel.setMaximumSize(new Dimension(100, 150));
        LeftLegStockPanel.setMinimumSize(new Dimension(100, 150));
        LeftLegStockPanel.setOpaque(false);
        LeftLegStockPanel.setPreferredSize(new Dimension(100, 150));
        LeftLegStockPanel.setLayout(new GridBagLayout());

        LeftLegArmorProgressBar.setFont(LeftLegArmorProgressBar.getFont().deriveFont((float)10));
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
        LeftLegStockPanel.add(LeftLegArmorProgressBar, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        StockArmorPanel.add(LeftLegStockPanel, gridBagConstraints);

        RightTorsoSplitPane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Right Torso", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 10))); // NOI18N
        RightTorsoSplitPane.setDividerLocation(75);
        RightTorsoSplitPane.setDividerSize(10);
        RightTorsoSplitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
        RightTorsoSplitPane.setFont(new Font("Moire", 0, 10)); // NOI18N
        RightTorsoSplitPane.setMaximumSize(new Dimension(100, 150));
        RightTorsoSplitPane.setMinimumSize(new Dimension(100, 150));
        RightTorsoSplitPane.setOpaque(false);
        RightTorsoSplitPane.setPreferredSize(new Dimension(100, 150));

        RightTorsoFrontPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Front", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 10))); // NOI18N
        RightTorsoFrontPanel.setLayout(new GridBagLayout());

        RightTorsoArmorProgressBar.setFont(RightTorsoArmorProgressBar.getFont().deriveFont((float)10));
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
        RightTorsoFrontPanel.add(RightTorsoArmorProgressBar, gridBagConstraints);

        RightTorsoSplitPane.setTopComponent(RightTorsoFrontPanel);

        RightTorsoRearPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Rear", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 10))); // NOI18N
        RightTorsoRearPanel.setLayout(new GridBagLayout());

        RearRightTorsoArmorProgressBar.setFont(RearRightTorsoArmorProgressBar.getFont().deriveFont((float)10));
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
        RightTorsoRearPanel.add(RearRightTorsoArmorProgressBar, gridBagConstraints);

        RightTorsoSplitPane.setBottomComponent(RightTorsoRearPanel);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        StockArmorPanel.add(RightTorsoSplitPane, gridBagConstraints);

        LeftTorsoSplitPane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Left Torso", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 10))); // NOI18N
        LeftTorsoSplitPane.setDividerLocation(75);
        LeftTorsoSplitPane.setDividerSize(10);
        LeftTorsoSplitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
        LeftTorsoSplitPane.setFont(new Font("Moire", 0, 10)); // NOI18N
        LeftTorsoSplitPane.setMaximumSize(new Dimension(100, 150));
        LeftTorsoSplitPane.setMinimumSize(new Dimension(100, 150));
        LeftTorsoSplitPane.setOpaque(false);
        LeftTorsoSplitPane.setPreferredSize(new Dimension(100, 150));

        LeftTorsoFrontPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Front", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 10))); // NOI18N
        LeftTorsoFrontPanel.setLayout(new GridBagLayout());

        LeftTorsoArmorProgressBar.setFont(LeftTorsoArmorProgressBar.getFont().deriveFont((float)10));
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
        LeftTorsoFrontPanel.add(LeftTorsoArmorProgressBar, gridBagConstraints);

        LeftTorsoSplitPane.setTopComponent(LeftTorsoFrontPanel);

        LeftTorsoRearPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Rear", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 10))); // NOI18N
        LeftTorsoRearPanel.setLayout(new GridBagLayout());

        RearLeftTorsoArmorProgressBar.setFont(RearLeftTorsoArmorProgressBar.getFont().deriveFont((float)10));
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
        LeftTorsoRearPanel.add(RearLeftTorsoArmorProgressBar, gridBagConstraints);

        LeftTorsoSplitPane.setBottomComponent(LeftTorsoRearPanel);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        StockArmorPanel.add(LeftTorsoSplitPane, gridBagConstraints);

        CenterTorsoSplitPane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Center Torso", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 10))); // NOI18N
        CenterTorsoSplitPane.setDividerLocation(75);
        CenterTorsoSplitPane.setDividerSize(10);
        CenterTorsoSplitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
        CenterTorsoSplitPane.setFont(new Font("Moire", 0, 10)); // NOI18N
        CenterTorsoSplitPane.setMaximumSize(new Dimension(100, 150));
        CenterTorsoSplitPane.setMinimumSize(new Dimension(100, 150));
        CenterTorsoSplitPane.setOpaque(false);
        CenterTorsoSplitPane.setPreferredSize(new Dimension(100, 150));

        CenterTorsoFrontPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Front", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 10))); // NOI18N
        CenterTorsoFrontPanel.setLayout(new GridBagLayout());

        CenterTorsoArmorProgressBar.setFont(CenterTorsoArmorProgressBar.getFont().deriveFont((float)10));
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
        CenterTorsoFrontPanel.add(CenterTorsoArmorProgressBar, gridBagConstraints);

        CenterTorsoSplitPane.setTopComponent(CenterTorsoFrontPanel);

        CenterTorsoRearPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Rear", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 10))); // NOI18N
        CenterTorsoRearPanel.setLayout(new GridBagLayout());

        RearCenterTorsoArmorProgressBar.setFont(RearCenterTorsoArmorProgressBar.getFont().deriveFont((float)10));
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
        CenterTorsoRearPanel.add(RearCenterTorsoArmorProgressBar, gridBagConstraints);

        CenterTorsoSplitPane.setBottomComponent(CenterTorsoRearPanel);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        StockArmorPanel.add(CenterTorsoSplitPane, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        DiagramPanel.add(StockArmorPanel, gridBagConstraints);

        EquipmentTabbedPane.setAlignmentX(0.0F);
        EquipmentTabbedPane.setAlignmentY(0.0F);
        EquipmentTabbedPane.setFont(new Font("Moire", 0, 10)); // NOI18N
        EquipmentTabbedPane.setMaximumSize(new Dimension(512, 512));
        EquipmentTabbedPane.setMinimumSize(new Dimension(512, 512));
        EquipmentTabbedPane.setPreferredSize(new Dimension(512, 512));

        AmmoPanel.setAlignmentX(0.0F);
        AmmoPanel.setAlignmentY(0.0F);
        AmmoPanel.setFont(new Font("Moire", 0, 10)); // NOI18N
        AmmoPanel.setOpaque(false);
        AmmoPanel.setLayout(new GridBagLayout());

        jScrollPane8.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane8.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane8.setAlignmentX(0.0F);
        jScrollPane8.setAlignmentY(0.0F);
        jScrollPane8.setFont(new Font("Moire", 0, 11)); // NOI18N
        jScrollPane8.setMaximumSize(new Dimension(0, 0));
        jScrollPane8.setMinimumSize(new Dimension(0, 0));
        jScrollPane8.setPreferredSize(new Dimension(0, 0));

        ammoTable1.setFont(new Font("Moire", 0, 11)); // NOI18N
        ammoTable1.setAlignmentX(0.0F);
        ammoTable1.setAlignmentY(0.0F);
        ammoTable1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        ammoTable1.setOpaque(false);
        ammoTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jScrollPane8.setViewportView(ammoTable1);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        AmmoPanel.add(jScrollPane8, gridBagConstraints);

        jScrollPane9.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane9.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane9.setAlignmentX(0.0F);
        jScrollPane9.setAlignmentY(0.0F);
        jScrollPane9.setFont(new Font("Moire", 0, 11)); // NOI18N
        jScrollPane9.setMaximumSize(new Dimension(0, 0));
        jScrollPane9.setMinimumSize(new Dimension(0, 0));
        jScrollPane9.setPreferredSize(new Dimension(0, 0));

        ammoTable2.setFont(new Font("Moire", 0, 11)); // NOI18N
        ammoTable2.setAlignmentX(0.0F);
        ammoTable2.setAlignmentY(0.0F);
        ammoTable2.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        ammoTable2.setOpaque(false);
        ammoTable2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jScrollPane9.setViewportView(ammoTable2);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        AmmoPanel.add(jScrollPane9, gridBagConstraints);

        EquipmentTabbedPane.addTab("Ammo Stats", AmmoPanel);

        BallisticPanel.setAlignmentX(0.0F);
        BallisticPanel.setAlignmentY(0.0F);
        BallisticPanel.setFont(new Font("Moire", 0, 10)); // NOI18N
        BallisticPanel.setOpaque(false);
        BallisticPanel.setLayout(new GridBagLayout());

        jScrollPane10.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane10.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane10.setAlignmentX(0.0F);
        jScrollPane10.setAlignmentY(0.0F);
        jScrollPane10.setFont(new Font("Moire", 0, 11)); // NOI18N
        jScrollPane10.setMaximumSize(new Dimension(0, 0));
        jScrollPane10.setMinimumSize(new Dimension(0, 0));
        jScrollPane10.setPreferredSize(new Dimension(0, 0));

        ballisticTable2.setFont(new Font("Moire", 0, 11)); // NOI18N
        ballisticTable2.setAlignmentX(0.0F);
        ballisticTable2.setAlignmentY(0.0F);
        ballisticTable2.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        ballisticTable2.setOpaque(false);
        ballisticTable2.setSelectionModel(ballisticSelectionModel);
        jScrollPane10.setViewportView(ballisticTable2);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        BallisticPanel.add(jScrollPane10, gridBagConstraints);

        jScrollPane11.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane11.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane11.setAlignmentX(0.0F);
        jScrollPane11.setAlignmentY(0.0F);
        jScrollPane11.setFont(new Font("Moire", 0, 11)); // NOI18N
        jScrollPane11.setMaximumSize(new Dimension(0, 0));
        jScrollPane11.setMinimumSize(new Dimension(0, 0));
        jScrollPane11.setPreferredSize(new Dimension(0, 0));

        ballisticTable1.setFont(new Font("Moire", 0, 11)); // NOI18N
        ballisticTable1.setAlignmentX(0.0F);
        ballisticTable1.setAlignmentY(0.0F);
        ballisticTable1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        ballisticTable1.setOpaque(false);
        ballisticTable1.setSelectionModel(ballisticSelectionModel);
        jScrollPane11.setViewportView(ballisticTable1);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        BallisticPanel.add(jScrollPane11, gridBagConstraints);

        EquipmentTabbedPane.addTab("Ballistic Stats", BallisticPanel);

        EnergyPanel.setAlignmentX(0.0F);
        EnergyPanel.setAlignmentY(0.0F);
        EnergyPanel.setFont(new Font("Moire", 0, 10)); // NOI18N
        EnergyPanel.setOpaque(false);
        EnergyPanel.setLayout(new GridBagLayout());

        jScrollPane12.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane12.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane12.setAlignmentX(0.0F);
        jScrollPane12.setAlignmentY(0.0F);
        jScrollPane12.setFont(new Font("Moire", 0, 11)); // NOI18N
        jScrollPane12.setMaximumSize(new Dimension(0, 0));
        jScrollPane12.setMinimumSize(new Dimension(0, 0));
        jScrollPane12.setPreferredSize(new Dimension(0, 0));

        energyTable2.setFont(new Font("Moire", 0, 11)); // NOI18N
        energyTable2.setAlignmentX(0.0F);
        energyTable2.setAlignmentY(0.0F);
        energyTable2.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        energyTable2.setOpaque(false);
        energyTable2.setSelectionModel(energySelectionModel);
        jScrollPane12.setViewportView(energyTable2);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        EnergyPanel.add(jScrollPane12, gridBagConstraints);

        jScrollPane13.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane13.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane13.setAlignmentX(0.0F);
        jScrollPane13.setAlignmentY(0.0F);
        jScrollPane13.setFont(new Font("Moire", 0, 11)); // NOI18N
        jScrollPane13.setMaximumSize(new Dimension(0, 0));
        jScrollPane13.setMinimumSize(new Dimension(0, 0));
        jScrollPane13.setPreferredSize(new Dimension(0, 0));

        energyTable1.setFont(new Font("Moire", 0, 11)); // NOI18N
        energyTable1.setAlignmentX(0.0F);
        energyTable1.setAlignmentY(0.0F);
        energyTable1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        energyTable1.setOpaque(false);
        energyTable1.setSelectionModel(energySelectionModel);
        jScrollPane13.setViewportView(energyTable1);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        EnergyPanel.add(jScrollPane13, gridBagConstraints);

        EquipmentTabbedPane.addTab("Energy Stats", EnergyPanel);

        MissilePanel.setAlignmentX(0.0F);
        MissilePanel.setAlignmentY(0.0F);
        MissilePanel.setFont(new Font("Moire", 0, 10)); // NOI18N
        MissilePanel.setOpaque(false);
        MissilePanel.setLayout(new GridBagLayout());

        jScrollPane14.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane14.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane14.setAlignmentX(0.0F);
        jScrollPane14.setAlignmentY(0.0F);
        jScrollPane14.setFont(new Font("Moire", 0, 11)); // NOI18N
        jScrollPane14.setMaximumSize(new Dimension(0, 0));
        jScrollPane14.setMinimumSize(new Dimension(0, 0));
        jScrollPane14.setPreferredSize(new Dimension(0, 0));

        missileTable1.setFont(new Font("Moire", 0, 11)); // NOI18N
        missileTable1.setAlignmentX(0.0F);
        missileTable1.setAlignmentY(0.0F);
        missileTable1.setOpaque(false);
        missileTable1.setSelectionModel(missileSelectionModel);
        jScrollPane14.setViewportView(missileTable1);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        MissilePanel.add(jScrollPane14, gridBagConstraints);

        jScrollPane15.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane15.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane15.setAlignmentX(0.0F);
        jScrollPane15.setAlignmentY(0.0F);
        jScrollPane15.setFont(new Font("Moire", 0, 11)); // NOI18N
        jScrollPane15.setMaximumSize(new Dimension(0, 0));
        jScrollPane15.setMinimumSize(new Dimension(0, 0));
        jScrollPane15.setPreferredSize(new Dimension(0, 0));

        missileTable2.setFont(new Font("Moire", 0, 11)); // NOI18N
        missileTable2.setAlignmentX(0.0F);
        missileTable2.setAlignmentY(0.0F);
        missileTable2.setOpaque(false);
        missileTable2.setSelectionModel(missileSelectionModel);
        jScrollPane15.setViewportView(missileTable2);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        MissilePanel.add(jScrollPane15, gridBagConstraints);

        EquipmentTabbedPane.addTab("Missile Stats", MissilePanel);

        OtherEquipmentPanel.setAlignmentX(0.0F);
        OtherEquipmentPanel.setAlignmentY(0.0F);
        OtherEquipmentPanel.setFont(new Font("Moire", 0, 10)); // NOI18N
        OtherEquipmentPanel.setOpaque(false);
        OtherEquipmentPanel.setLayout(new GridBagLayout());

        jScrollPane16.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane16.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane16.setAlignmentX(0.0F);
        jScrollPane16.setAlignmentY(0.0F);
        jScrollPane16.setFont(new Font("Moire", 0, 11)); // NOI18N
        jScrollPane16.setMaximumSize(new Dimension(0, 0));
        jScrollPane16.setMinimumSize(new Dimension(0, 60));
        jScrollPane16.setPreferredSize(new Dimension(0, 60));

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
        armorTable.setAlignmentX(0.0F);
        armorTable.setAlignmentY(0.0F);
        armorTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        armorTable.setOpaque(false);
        armorTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jScrollPane16.setViewportView(armorTable);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        OtherEquipmentPanel.add(jScrollPane16, gridBagConstraints);

        jScrollPane17.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane17.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane17.setAlignmentX(0.0F);
        jScrollPane17.setAlignmentY(0.0F);
        jScrollPane17.setFont(new Font("Moire", 0, 11)); // NOI18N
        jScrollPane17.setMaximumSize(new Dimension(0, 0));
        jScrollPane17.setMinimumSize(new Dimension(0, 60));
        jScrollPane17.setPreferredSize(new Dimension(0, 60));

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
        internalTable.setAlignmentX(0.0F);
        internalTable.setAlignmentY(0.0F);
        internalTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        internalTable.setOpaque(false);
        internalTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jScrollPane17.setViewportView(internalTable);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        OtherEquipmentPanel.add(jScrollPane17, gridBagConstraints);

        jScrollPane18.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane18.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane18.setAlignmentX(0.0F);
        jScrollPane18.setAlignmentY(0.0F);
        jScrollPane18.setFont(new Font("Moire", 0, 11)); // NOI18N
        jScrollPane18.setMaximumSize(new Dimension(0, 0));
        jScrollPane18.setMinimumSize(new Dimension(0, 60));
        jScrollPane18.setPreferredSize(new Dimension(0, 60));

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
        engineTable.setAlignmentX(0.0F);
        engineTable.setAlignmentY(0.0F);
        engineTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        engineTable.setOpaque(false);
        engineTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jScrollPane18.setViewportView(engineTable);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        OtherEquipmentPanel.add(jScrollPane18, gridBagConstraints);

        jScrollPane19.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane19.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane19.setAlignmentX(0.0F);
        jScrollPane19.setAlignmentY(0.0F);
        jScrollPane19.setFont(new Font("Moire", 0, 11)); // NOI18N
        jScrollPane19.setMaximumSize(new Dimension(0, 0));
        jScrollPane19.setMinimumSize(new Dimension(0, 60));
        jScrollPane19.setPreferredSize(new Dimension(0, 60));

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
        heatSinkTable.setAlignmentX(0.0F);
        heatSinkTable.setAlignmentY(0.0F);
        heatSinkTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        heatSinkTable.setOpaque(false);
        heatSinkTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jScrollPane19.setViewportView(heatSinkTable);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        OtherEquipmentPanel.add(jScrollPane19, gridBagConstraints);

        jScrollPane20.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane20.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane20.setAlignmentX(0.0F);
        jScrollPane20.setAlignmentY(0.0F);
        jScrollPane20.setFont(new Font("Moire", 0, 11)); // NOI18N
        jScrollPane20.setMaximumSize(new Dimension(0, 0));
        jScrollPane20.setMinimumSize(new Dimension(0, 105));
        jScrollPane20.setPreferredSize(new Dimension(0, 105));

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
        jumpJetTable.setAlignmentX(0.0F);
        jumpJetTable.setAlignmentY(0.0F);
        jumpJetTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        jumpJetTable.setOpaque(false);
        jumpJetTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jScrollPane20.setViewportView(jumpJetTable);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        OtherEquipmentPanel.add(jScrollPane20, gridBagConstraints);

        jScrollPane21.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane21.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane21.setAlignmentX(0.0F);
        jScrollPane21.setAlignmentY(0.0F);
        jScrollPane21.setFont(new Font("Moire", 0, 11)); // NOI18N
        jScrollPane21.setMaximumSize(new Dimension(0, 0));
        jScrollPane21.setMinimumSize(new Dimension(0, 0));
        jScrollPane21.setPreferredSize(new Dimension(0, 90));

        ammoTable3.setFont(new Font("Moire", 0, 11)); // NOI18N
        ammoTable3.setAlignmentX(0.0F);
        ammoTable3.setAlignmentY(0.0F);
        ammoTable3.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        ammoTable3.setOpaque(false);
        ammoTable3.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jScrollPane21.setViewportView(ammoTable3);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        OtherEquipmentPanel.add(jScrollPane21, gridBagConstraints);

        EquipmentTabbedPane.addTab("Other Stats", OtherEquipmentPanel);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        DiagramPanel.add(EquipmentTabbedPane, gridBagConstraints);

        MechImage.setFont(MechImage.getFont().deriveFont((float)10));
        MechImage.setAlignmentY(0.0F);
        MechImage.setMaximumSize(new Dimension(512, 512));
        MechImage.setMinimumSize(new Dimension(512, 512));
        MechImage.setPreferredSize(new Dimension(512, 512));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        DiagramPanel.add(MechImage, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        MechLabPanel.add(DiagramPanel, gridBagConstraints);

        MechTabPane.setAlignmentX(0.0F);
        MechTabPane.setAlignmentY(0.0F);
        MechTabPane.setDoubleBuffered(true);
        MechTabPane.setFont(new Font("Moire", 0, 10)); // NOI18N
        MechTabPane.setMinimumSize(new Dimension(320, 512));
        MechTabPane.setOpaque(true);
        MechTabPane.setPreferredSize(new Dimension(320, 512));
        MechTabPane.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                MechTabPaneStateChanged(evt);
            }
        });

        ChassisScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        ChassisScrollPane.setFont(new Font("Moire", 0, 12)); // NOI18N

        ChassisPanel.setAlignmentX(0.0F);
        ChassisPanel.setAlignmentY(0.0F);
        ChassisPanel.setFont(new Font("Moire", 0, 12)); // NOI18N
        ChassisPanel.setMinimumSize(new Dimension(300, 900));
        ChassisPanel.setPreferredSize(new Dimension(300, 900));
        ChassisPanel.setLayout(new GridBagLayout());

        ChassisComboBox.setFont(ChassisComboBox.getFont().deriveFont((float)10));
        ChassisComboBox.setModel(ChassisTypeComboBoxModel);
        ChassisComboBox.setBorder(BorderFactory.createTitledBorder(null, "Chassis", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 11))); // NOI18N
        ChassisComboBox.setMaximumSize(new Dimension(275, 50));
        ChassisComboBox.setMinimumSize(new Dimension(275, 50));
        ChassisComboBox.setPreferredSize(new Dimension(300, 50));
        ChassisComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ChassisComboBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ChassisPanel.add(ChassisComboBox, gridBagConstraints);

        ModelComboBox.setFont(ModelComboBox.getFont().deriveFont((float)10));
        ModelComboBox.setModel(ChassisModelComboBoxModel);
        ModelComboBox.setBorder(BorderFactory.createTitledBorder(null, "Model", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 11))); // NOI18N
        ModelComboBox.setMaximumSize(new Dimension(275, 50));
        ModelComboBox.setMinimumSize(new Dimension(275, 50));
        ModelComboBox.setPreferredSize(new Dimension(300, 50));
        ModelComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ModelComboBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ChassisPanel.add(ModelComboBox, gridBagConstraints);

        SpeculationPanel.setFont(new Font("Moire", 0, 12)); // NOI18N
        SpeculationPanel.setPreferredSize(new Dimension(275, 25));
        SpeculationPanel.setLayout(new GridBagLayout());

        UnconfirmedLabel.setBackground(new Color(255, 32, 32));
        UnconfirmedLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
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
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        SpeculationPanel.add(UnconfirmedLabel, gridBagConstraints);

        UnreleasedLabel.setBackground(new Color(255, 32, 32));
        UnreleasedLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
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
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        SpeculationPanel.add(UnreleasedLabel, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ChassisPanel.add(SpeculationPanel, gridBagConstraints);

        OverviewPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Overview", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 11))); // NOI18N
        OverviewPanel.setFont(new Font("Moire", 0, 12)); // NOI18N
        OverviewPanel.setMinimumSize(new Dimension(275, 175));
        OverviewPanel.setPreferredSize(new Dimension(275, 175));
        OverviewPanel.setLayout(new GridBagLayout());

        TonnageLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        TonnageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        TonnageLabel.setText("000.00 Tons");
        TonnageLabel.setAlignmentY(0.0F);
        TonnageLabel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Chassis Weight", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 12))); // NOI18N
        TonnageLabel.setMaximumSize(new Dimension(125, 50));
        TonnageLabel.setMinimumSize(new Dimension(125, 50));
        TonnageLabel.setPreferredSize(new Dimension(125, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        OverviewPanel.add(TonnageLabel, gridBagConstraints);

        ClassLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        ClassLabel.setHorizontalAlignment(SwingConstants.CENTER);
        ClassLabel.setText("Unknown");
        ClassLabel.setAlignmentY(0.0F);
        ClassLabel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Weight Class", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 12))); // NOI18N
        ClassLabel.setMaximumSize(new Dimension(125, 50));
        ClassLabel.setMinimumSize(new Dimension(125, 50));
        ClassLabel.setPreferredSize(new Dimension(125, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        OverviewPanel.add(ClassLabel, gridBagConstraints);

        ModuleLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        ModuleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        ModuleLabel.setText("0");
        ModuleLabel.setAlignmentY(0.0F);
        ModuleLabel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Module Slots", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 12))); // NOI18N
        ModuleLabel.setMaximumSize(new Dimension(125, 50));
        ModuleLabel.setMinimumSize(new Dimension(125, 50));
        ModuleLabel.setPreferredSize(new Dimension(125, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        OverviewPanel.add(ModuleLabel, gridBagConstraints);

        JumpCapabilityLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        JumpCapabilityLabel.setHorizontalAlignment(SwingConstants.CENTER);
        JumpCapabilityLabel.setText("Unknown");
        JumpCapabilityLabel.setAlignmentY(0.0F);
        JumpCapabilityLabel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Jump Capable", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 12))); // NOI18N
        JumpCapabilityLabel.setMaximumSize(new Dimension(125, 50));
        JumpCapabilityLabel.setMinimumSize(new Dimension(125, 50));
        JumpCapabilityLabel.setPreferredSize(new Dimension(125, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        OverviewPanel.add(JumpCapabilityLabel, gridBagConstraints);

        ModuleLabel1.setFont(new Font("Moire", 0, 12)); // NOI18N
        ModuleLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        ModuleLabel1.setText("0 C-Bills");
        ModuleLabel1.setAlignmentY(0.0F);
        ModuleLabel1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Cost", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 12))); // NOI18N
        ModuleLabel1.setMaximumSize(new Dimension(125, 50));
        ModuleLabel1.setMinimumSize(new Dimension(125, 50));
        ModuleLabel1.setPreferredSize(new Dimension(125, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        OverviewPanel.add(ModuleLabel1, gridBagConstraints);

        JumpCapabilityLabel1.setFont(new Font("Moire", 0, 12)); // NOI18N
        JumpCapabilityLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        JumpCapabilityLabel1.setText("0 MC");
        JumpCapabilityLabel1.setAlignmentY(0.0F);
        JumpCapabilityLabel1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Cost", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 12))); // NOI18N
        JumpCapabilityLabel1.setMaximumSize(new Dimension(125, 50));
        JumpCapabilityLabel1.setMinimumSize(new Dimension(125, 50));
        JumpCapabilityLabel1.setPreferredSize(new Dimension(125, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        OverviewPanel.add(JumpCapabilityLabel1, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ChassisPanel.add(OverviewPanel, gridBagConstraints);

        KeyPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Key", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 11))); // NOI18N
        KeyPanel.setFont(new Font("Moire", 0, 12)); // NOI18N
        KeyPanel.setMaximumSize(new Dimension(320, 120));
        KeyPanel.setMinimumSize(new Dimension(250, 150));
        KeyPanel.setPreferredSize(new Dimension(275, 150));
        KeyPanel.setLayout(new GridBagLayout());

        KeyArmorLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        KeyArmorLabel.setForeground(new Color(200, 150, 75));
        KeyArmorLabel.setToolTipText("");
        KeyArmorLabel.setValue(100);
        KeyArmorLabel.setMaximumSize(new Dimension(250, 20));
        KeyArmorLabel.setMinimumSize(new Dimension(250, 20));
        KeyArmorLabel.setPreferredSize(new Dimension(250, 20));
        KeyArmorLabel.setString("Max Armor HP");
        KeyArmorLabel.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        KeyPanel.add(KeyArmorLabel, gridBagConstraints);

        KeyInternalLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        KeyInternalLabel.setForeground(new Color(200, 150, 75));
        KeyInternalLabel.setToolTipText("");
        KeyInternalLabel.setValue(100);
        KeyInternalLabel.setMaximumSize(new Dimension(250, 20));
        KeyInternalLabel.setMinimumSize(new Dimension(250, 20));
        KeyInternalLabel.setPreferredSize(new Dimension(250, 20));
        KeyInternalLabel.setString("Internal Structure HP");
        KeyInternalLabel.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        KeyPanel.add(KeyInternalLabel, gridBagConstraints);

        KeyBallisticLabel.setBackground(new Color(192, 192, 64));
        KeyBallisticLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        KeyBallisticLabel.setHorizontalAlignment(SwingConstants.CENTER);
        KeyBallisticLabel.setText("Ballistic");
        KeyBallisticLabel.setToolTipText("");
        KeyBallisticLabel.setAlignmentY(0.0F);
        KeyBallisticLabel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED), "Hardpoints", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 11), new Color(0, 0, 0))); // NOI18N
        KeyBallisticLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        KeyBallisticLabel.setMaximumSize(new Dimension(125, 40));
        KeyBallisticLabel.setMinimumSize(new Dimension(125, 40));
        KeyBallisticLabel.setPreferredSize(new Dimension(125, 40));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        KeyPanel.add(KeyBallisticLabel, gridBagConstraints);

        KeyEnergyLabel.setBackground(new Color(192, 64, 64));
        KeyEnergyLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        KeyEnergyLabel.setHorizontalAlignment(SwingConstants.CENTER);
        KeyEnergyLabel.setText("Energy");
        KeyEnergyLabel.setToolTipText("");
        KeyEnergyLabel.setAlignmentY(0.0F);
        KeyEnergyLabel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED), "Hardpoints", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 11), new Color(0, 0, 0))); // NOI18N
        KeyEnergyLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        KeyEnergyLabel.setMaximumSize(new Dimension(125, 40));
        KeyEnergyLabel.setMinimumSize(new Dimension(125, 40));
        KeyEnergyLabel.setPreferredSize(new Dimension(125, 40));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        KeyPanel.add(KeyEnergyLabel, gridBagConstraints);

        KeyMissileLabel.setBackground(new Color(64, 192, 64));
        KeyMissileLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        KeyMissileLabel.setHorizontalAlignment(SwingConstants.CENTER);
        KeyMissileLabel.setText("Missile");
        KeyMissileLabel.setToolTipText("");
        KeyMissileLabel.setAlignmentY(0.0F);
        KeyMissileLabel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED), "Hardpoints", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 11), new Color(0, 0, 0))); // NOI18N
        KeyMissileLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        KeyMissileLabel.setMaximumSize(new Dimension(125, 40));
        KeyMissileLabel.setMinimumSize(new Dimension(125, 40));
        KeyMissileLabel.setPreferredSize(new Dimension(125, 40));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        KeyPanel.add(KeyMissileLabel, gridBagConstraints);

        KeyAMSLabel.setBackground(new Color(64, 64, 192));
        KeyAMSLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        KeyAMSLabel.setHorizontalAlignment(SwingConstants.CENTER);
        KeyAMSLabel.setText("AMS");
        KeyAMSLabel.setToolTipText("");
        KeyAMSLabel.setAlignmentY(0.0F);
        KeyAMSLabel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED), "Hardpoints", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 11), new Color(0, 0, 0))); // NOI18N
        KeyAMSLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        KeyAMSLabel.setMaximumSize(new Dimension(125, 40));
        KeyAMSLabel.setMinimumSize(new Dimension(125, 40));
        KeyAMSLabel.setPreferredSize(new Dimension(125, 40));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        KeyPanel.add(KeyAMSLabel, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ChassisPanel.add(KeyPanel, gridBagConstraints);

        TotalPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Totals", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 11))); // NOI18N
        TotalPanel.setFont(new Font("Moire", 0, 12)); // NOI18N
        TotalPanel.setMaximumSize(new Dimension(320, 120));
        TotalPanel.setMinimumSize(new Dimension(250, 150));
        TotalPanel.setPreferredSize(new Dimension(275, 150));
        TotalPanel.setLayout(new GridBagLayout());

        TotalArmorLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        TotalArmorLabel.setForeground(new Color(200, 150, 75));
        TotalArmorLabel.setToolTipText("");
        TotalArmorLabel.setValue(100);
        TotalArmorLabel.setMaximumSize(new Dimension(250, 20));
        TotalArmorLabel.setMinimumSize(new Dimension(250, 20));
        TotalArmorLabel.setPreferredSize(new Dimension(250, 20));
        TotalArmorLabel.setString("");
        TotalArmorLabel.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        TotalPanel.add(TotalArmorLabel, gridBagConstraints);

        TotalInternalLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        TotalInternalLabel.setForeground(new Color(200, 150, 75));
        TotalInternalLabel.setToolTipText("");
        TotalInternalLabel.setValue(100);
        TotalInternalLabel.setMaximumSize(new Dimension(250, 20));
        TotalInternalLabel.setMinimumSize(new Dimension(250, 20));
        TotalInternalLabel.setPreferredSize(new Dimension(250, 20));
        TotalInternalLabel.setString("");
        TotalInternalLabel.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        TotalPanel.add(TotalInternalLabel, gridBagConstraints);

        TotalBallisticLabel.setBackground(new Color(192, 192, 64));
        TotalBallisticLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        TotalBallisticLabel.setHorizontalAlignment(SwingConstants.CENTER);
        TotalBallisticLabel.setText("0");
        TotalBallisticLabel.setToolTipText("");
        TotalBallisticLabel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED), "Hardpoints", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 11), new Color(230, 230, 230))); // NOI18N
        TotalBallisticLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        TotalBallisticLabel.setMaximumSize(new Dimension(125, 40));
        TotalBallisticLabel.setMinimumSize(new Dimension(125, 40));
        TotalBallisticLabel.setPreferredSize(new Dimension(125, 40));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        TotalPanel.add(TotalBallisticLabel, gridBagConstraints);

        TotalEnergyLabel.setBackground(new Color(192, 64, 64));
        TotalEnergyLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        TotalEnergyLabel.setHorizontalAlignment(SwingConstants.CENTER);
        TotalEnergyLabel.setText("0");
        TotalEnergyLabel.setToolTipText("");
        TotalEnergyLabel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED), "Hardpoints", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 11), new Color(230, 230, 230))); // NOI18N
        TotalEnergyLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        TotalEnergyLabel.setMaximumSize(new Dimension(125, 40));
        TotalEnergyLabel.setMinimumSize(new Dimension(125, 40));
        TotalEnergyLabel.setPreferredSize(new Dimension(125, 40));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        TotalPanel.add(TotalEnergyLabel, gridBagConstraints);

        TotalMissileLabel.setBackground(new Color(64, 192, 64));
        TotalMissileLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        TotalMissileLabel.setHorizontalAlignment(SwingConstants.CENTER);
        TotalMissileLabel.setText("0");
        TotalMissileLabel.setToolTipText("");
        TotalMissileLabel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED), "Hardpoints", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 11), new Color(230, 230, 230))); // NOI18N
        TotalMissileLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        TotalMissileLabel.setMaximumSize(new Dimension(125, 40));
        TotalMissileLabel.setMinimumSize(new Dimension(125, 40));
        TotalMissileLabel.setPreferredSize(new Dimension(125, 40));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        TotalPanel.add(TotalMissileLabel, gridBagConstraints);

        TotalAMSLabel.setBackground(new Color(64, 64, 192));
        TotalAMSLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        TotalAMSLabel.setHorizontalAlignment(SwingConstants.CENTER);
        TotalAMSLabel.setText("0");
        TotalAMSLabel.setToolTipText("");
        TotalAMSLabel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED), "Hardpoints", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 11), new Color(230, 230, 230))); // NOI18N
        TotalAMSLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        TotalAMSLabel.setMaximumSize(new Dimension(125, 40));
        TotalAMSLabel.setMinimumSize(new Dimension(125, 40));
        TotalAMSLabel.setPreferredSize(new Dimension(125, 40));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        TotalPanel.add(TotalAMSLabel, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ChassisPanel.add(TotalPanel, gridBagConstraints);

        SpeedLimitsPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Speed Limits", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 11))); // NOI18N
        SpeedLimitsPanel.setFont(new Font("Moire", 0, 12)); // NOI18N
        SpeedLimitsPanel.setPreferredSize(new Dimension(275, 122));
        SpeedLimitsPanel.setLayout(new GridBagLayout());

        MinimumSpeedLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        MinimumSpeedLabel.setHorizontalAlignment(SwingConstants.CENTER);
        MinimumSpeedLabel.setText("0 kph");
        MinimumSpeedLabel.setAlignmentY(0.0F);
        MinimumSpeedLabel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Minimum Speed", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 12))); // NOI18N
        MinimumSpeedLabel.setMaximumSize(new Dimension(125, 50));
        MinimumSpeedLabel.setMinimumSize(new Dimension(125, 50));
        MinimumSpeedLabel.setPreferredSize(new Dimension(125, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        SpeedLimitsPanel.add(MinimumSpeedLabel, gridBagConstraints);

        MaximumSpeedLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        MaximumSpeedLabel.setHorizontalAlignment(SwingConstants.CENTER);
        MaximumSpeedLabel.setText("0 kph");
        MaximumSpeedLabel.setAlignmentY(0.0F);
        MaximumSpeedLabel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Maximum Speed", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 12))); // NOI18N
        MaximumSpeedLabel.setMaximumSize(new Dimension(125, 50));
        MaximumSpeedLabel.setMinimumSize(new Dimension(125, 50));
        MaximumSpeedLabel.setPreferredSize(new Dimension(125, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        SpeedLimitsPanel.add(MaximumSpeedLabel, gridBagConstraints);

        MinimumRatingLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        MinimumRatingLabel.setHorizontalAlignment(SwingConstants.CENTER);
        MinimumRatingLabel.setText("0");
        MinimumRatingLabel.setAlignmentY(0.0F);
        MinimumRatingLabel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Min Engine Rating", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 12))); // NOI18N
        MinimumRatingLabel.setMaximumSize(new Dimension(125, 50));
        MinimumRatingLabel.setMinimumSize(new Dimension(125, 50));
        MinimumRatingLabel.setPreferredSize(new Dimension(125, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        SpeedLimitsPanel.add(MinimumRatingLabel, gridBagConstraints);

        MaximumRatingLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        MaximumRatingLabel.setHorizontalAlignment(SwingConstants.CENTER);
        MaximumRatingLabel.setText("0");
        MaximumRatingLabel.setAlignmentY(0.0F);
        MaximumRatingLabel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Max Engine Rating", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 12))); // NOI18N
        MaximumRatingLabel.setMaximumSize(new Dimension(125, 50));
        MaximumRatingLabel.setMinimumSize(new Dimension(125, 50));
        MaximumRatingLabel.setPreferredSize(new Dimension(125, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        SpeedLimitsPanel.add(MaximumRatingLabel, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ChassisPanel.add(SpeedLimitsPanel, gridBagConstraints);

        AttributesPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Movement Range", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 11))); // NOI18N
        AttributesPanel.setFont(new Font("Moire", 0, 12)); // NOI18N
        AttributesPanel.setPreferredSize(new Dimension(275, 122));
        AttributesPanel.setLayout(new GridBagLayout());

        TorsoYawLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        TorsoYawLabel.setHorizontalAlignment(SwingConstants.CENTER);
        TorsoYawLabel.setText("0");
        TorsoYawLabel.setAlignmentY(0.0F);
        TorsoYawLabel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Max Torso Yaw", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 12))); // NOI18N
        TorsoYawLabel.setMaximumSize(new Dimension(125, 50));
        TorsoYawLabel.setMinimumSize(new Dimension(125, 50));
        TorsoYawLabel.setPreferredSize(new Dimension(125, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        AttributesPanel.add(TorsoYawLabel, gridBagConstraints);

        TorsoPitchLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        TorsoPitchLabel.setHorizontalAlignment(SwingConstants.CENTER);
        TorsoPitchLabel.setText("0");
        TorsoPitchLabel.setAlignmentY(0.0F);
        TorsoPitchLabel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Max Torso Pitch", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 12))); // NOI18N
        TorsoPitchLabel.setMaximumSize(new Dimension(125, 50));
        TorsoPitchLabel.setMinimumSize(new Dimension(125, 50));
        TorsoPitchLabel.setPreferredSize(new Dimension(125, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        AttributesPanel.add(TorsoPitchLabel, gridBagConstraints);

        ArmYawLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        ArmYawLabel.setHorizontalAlignment(SwingConstants.CENTER);
        ArmYawLabel.setText("0");
        ArmYawLabel.setAlignmentY(0.0F);
        ArmYawLabel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Max Arm Yaw", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 12))); // NOI18N
        ArmYawLabel.setMaximumSize(new Dimension(125, 50));
        ArmYawLabel.setMinimumSize(new Dimension(125, 50));
        ArmYawLabel.setPreferredSize(new Dimension(125, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        AttributesPanel.add(ArmYawLabel, gridBagConstraints);

        ArmPitchLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        ArmPitchLabel.setHorizontalAlignment(SwingConstants.CENTER);
        ArmPitchLabel.setText("0");
        ArmPitchLabel.setAlignmentY(0.0F);
        ArmPitchLabel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Max Arm Pitch", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 12))); // NOI18N
        ArmPitchLabel.setMaximumSize(new Dimension(125, 50));
        ArmPitchLabel.setMinimumSize(new Dimension(125, 50));
        ArmPitchLabel.setPreferredSize(new Dimension(125, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        AttributesPanel.add(ArmPitchLabel, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ChassisPanel.add(AttributesPanel, gridBagConstraints);

        ChassisScrollPane.setViewportView(ChassisPanel);

        MechTabPane.addTab("Chassis", ChassisScrollPane);

        InfoPanel.setAlignmentX(0.0F);
        InfoPanel.setAlignmentY(0.0F);
        InfoPanel.setFont(new Font("Moire", 0, 12)); // NOI18N
        InfoPanel.setMaximumSize(new Dimension(300, 500));
        InfoPanel.setMinimumSize(new Dimension(300, 500));
        InfoPanel.setPreferredSize(new Dimension(300, 500));
        InfoPanel.setLayout(new GridBagLayout());

        currentTonnageLabel.setFont(currentTonnageLabel.getFont().deriveFont((float)11));
        currentTonnageLabel.setText("Tonnage");
        currentTonnageLabel.setMaximumSize(new Dimension(150, 20));
        currentTonnageLabel.setMinimumSize(new Dimension(150, 20));
        currentTonnageLabel.setPreferredSize(new Dimension(150, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        InfoPanel.add(currentTonnageLabel, gridBagConstraints);

        tonnageProgressBar.setFont(new Font("Moire", 0, 11)); // NOI18N
        tonnageProgressBar.setAlignmentX(0.0F);
        tonnageProgressBar.setAlignmentY(0.0F);
        tonnageProgressBar.setMaximumSize(new Dimension(150, 20));
        tonnageProgressBar.setMinimumSize(new Dimension(150, 20));
        tonnageProgressBar.setPreferredSize(new Dimension(150, 20));
        tonnageProgressBar.setString("0.0");
        tonnageProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        InfoPanel.add(tonnageProgressBar, gridBagConstraints);

        currentSpeedLabel.setFont(currentSpeedLabel.getFont().deriveFont((float)11));
        currentSpeedLabel.setText("Speed");
        currentSpeedLabel.setMaximumSize(new Dimension(150, 20));
        currentSpeedLabel.setMinimumSize(new Dimension(150, 20));
        currentSpeedLabel.setPreferredSize(new Dimension(150, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        InfoPanel.add(currentSpeedLabel, gridBagConstraints);

        speedProgressBar.setFont(new Font("Moire", 0, 11)); // NOI18N
        speedProgressBar.setMaximum(140);
        speedProgressBar.setMinimum(32);
        speedProgressBar.setAlignmentX(0.0F);
        speedProgressBar.setAlignmentY(0.0F);
        speedProgressBar.setMaximumSize(new Dimension(150, 20));
        speedProgressBar.setMinimumSize(new Dimension(150, 20));
        speedProgressBar.setPreferredSize(new Dimension(150, 20));
        speedProgressBar.setString("0 kph");
        speedProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        InfoPanel.add(speedProgressBar, gridBagConstraints);

        alphaStrikeLabel.setFont(alphaStrikeLabel.getFont().deriveFont((float)11));
        alphaStrikeLabel.setText("Alpha Strike");
        alphaStrikeLabel.setMaximumSize(new Dimension(150, 20));
        alphaStrikeLabel.setMinimumSize(new Dimension(150, 20));
        alphaStrikeLabel.setPreferredSize(new Dimension(150, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        InfoPanel.add(alphaStrikeLabel, gridBagConstraints);

        alphaStrikeProgressBar.setFont(new Font("Moire", 0, 11)); // NOI18N
        alphaStrikeProgressBar.setMaximum(128);
        alphaStrikeProgressBar.setAlignmentX(0.0F);
        alphaStrikeProgressBar.setAlignmentY(0.0F);
        alphaStrikeProgressBar.setMaximumSize(new Dimension(150, 20));
        alphaStrikeProgressBar.setMinimumSize(new Dimension(150, 20));
        alphaStrikeProgressBar.setPreferredSize(new Dimension(150, 20));
        alphaStrikeProgressBar.setString("0");
        alphaStrikeProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        InfoPanel.add(alphaStrikeProgressBar, gridBagConstraints);

        firepowerLabel.setFont(firepowerLabel.getFont().deriveFont((float)11));
        firepowerLabel.setText("Firepower");
        firepowerLabel.setMaximumSize(new Dimension(150, 20));
        firepowerLabel.setMinimumSize(new Dimension(150, 20));
        firepowerLabel.setPreferredSize(new Dimension(150, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        InfoPanel.add(firepowerLabel, gridBagConstraints);

        firepowerProgressBar.setFont(new Font("Moire", 0, 11)); // NOI18N
        firepowerProgressBar.setMaximum(40);
        firepowerProgressBar.setAlignmentX(0.0F);
        firepowerProgressBar.setAlignmentY(0.0F);
        firepowerProgressBar.setMaximumSize(new Dimension(150, 20));
        firepowerProgressBar.setMinimumSize(new Dimension(150, 20));
        firepowerProgressBar.setPreferredSize(new Dimension(150, 20));
        firepowerProgressBar.setString("0 dps");
        firepowerProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        InfoPanel.add(firepowerProgressBar, gridBagConstraints);

        heatEfficiencyLabel.setFont(heatEfficiencyLabel.getFont().deriveFont((float)11));
        heatEfficiencyLabel.setText("Heat Efficiency");
        heatEfficiencyLabel.setMaximumSize(new Dimension(150, 20));
        heatEfficiencyLabel.setMinimumSize(new Dimension(150, 20));
        heatEfficiencyLabel.setPreferredSize(new Dimension(150, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        InfoPanel.add(heatEfficiencyLabel, gridBagConstraints);

        heatEfficiencyProgressBar.setFont(new Font("Moire", 0, 11)); // NOI18N
        heatEfficiencyProgressBar.setValue(100);
        heatEfficiencyProgressBar.setAlignmentX(0.0F);
        heatEfficiencyProgressBar.setAlignmentY(0.0F);
        heatEfficiencyProgressBar.setMaximumSize(new Dimension(150, 20));
        heatEfficiencyProgressBar.setMinimumSize(new Dimension(150, 20));
        heatEfficiencyProgressBar.setPreferredSize(new Dimension(150, 20));
        heatEfficiencyProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        InfoPanel.add(heatEfficiencyProgressBar, gridBagConstraints);

        currentArmorLabel.setFont(currentArmorLabel.getFont().deriveFont((float)11));
        currentArmorLabel.setText("Armor");
        currentArmorLabel.setMaximumSize(new Dimension(150, 20));
        currentArmorLabel.setMinimumSize(new Dimension(150, 20));
        currentArmorLabel.setPreferredSize(new Dimension(150, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        InfoPanel.add(currentArmorLabel, gridBagConstraints);

        currentArmorProgressBar.setFont(new Font("Moire", 0, 11)); // NOI18N
        currentArmorProgressBar.setAlignmentX(0.0F);
        currentArmorProgressBar.setAlignmentY(0.0F);
        currentArmorProgressBar.setMaximumSize(new Dimension(150, 20));
        currentArmorProgressBar.setMinimumSize(new Dimension(150, 20));
        currentArmorProgressBar.setPreferredSize(new Dimension(150, 20));
        currentArmorProgressBar.setString("0");
        currentArmorProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        InfoPanel.add(currentArmorProgressBar, gridBagConstraints);

        rangeLabel.setFont(rangeLabel.getFont().deriveFont((float)11));
        rangeLabel.setText("Range");
        rangeLabel.setMaximumSize(new Dimension(150, 20));
        rangeLabel.setMinimumSize(new Dimension(150, 20));
        rangeLabel.setPreferredSize(new Dimension(150, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        InfoPanel.add(rangeLabel, gridBagConstraints);

        rangeProgressBar.setFont(new Font("Moire", 0, 11)); // NOI18N
        rangeProgressBar.setMaximum(690);
        rangeProgressBar.setAlignmentX(0.0F);
        rangeProgressBar.setAlignmentY(0.0F);
        rangeProgressBar.setMaximumSize(new Dimension(150, 20));
        rangeProgressBar.setMinimumSize(new Dimension(150, 20));
        rangeProgressBar.setPreferredSize(new Dimension(150, 20));
        rangeProgressBar.setString("0 m");
        rangeProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        InfoPanel.add(rangeProgressBar, gridBagConstraints);

        alphaStrikeHeatLabel.setFont(alphaStrikeHeatLabel.getFont().deriveFont((float)11));
        alphaStrikeHeatLabel.setText("Alpha Strike Heat");
        alphaStrikeHeatLabel.setMaximumSize(new Dimension(150, 20));
        alphaStrikeHeatLabel.setMinimumSize(new Dimension(150, 20));
        alphaStrikeHeatLabel.setPreferredSize(new Dimension(150, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        InfoPanel.add(alphaStrikeHeatLabel, gridBagConstraints);

        alphaStrikeHeatProgressBar.setFont(new Font("Moire", 0, 11)); // NOI18N
        alphaStrikeHeatProgressBar.setValue(100);
        alphaStrikeHeatProgressBar.setAlignmentX(0.0F);
        alphaStrikeHeatProgressBar.setAlignmentY(0.0F);
        alphaStrikeHeatProgressBar.setMaximumSize(new Dimension(150, 20));
        alphaStrikeHeatProgressBar.setMinimumSize(new Dimension(150, 20));
        alphaStrikeHeatProgressBar.setPreferredSize(new Dimension(150, 20));
        alphaStrikeHeatProgressBar.setString("100%");
        alphaStrikeHeatProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        InfoPanel.add(alphaStrikeHeatProgressBar, gridBagConstraints);

        criticalsUsedLabel.setFont(criticalsUsedLabel.getFont().deriveFont((float)11));
        criticalsUsedLabel.setText("Criticals");
        criticalsUsedLabel.setMaximumSize(new Dimension(150, 20));
        criticalsUsedLabel.setMinimumSize(new Dimension(150, 20));
        criticalsUsedLabel.setPreferredSize(new Dimension(150, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        InfoPanel.add(criticalsUsedLabel, gridBagConstraints);

        criticalsUsedProgressBar.setFont(new Font("Moire", 0, 11)); // NOI18N
        criticalsUsedProgressBar.setMaximum(78);
        criticalsUsedProgressBar.setAlignmentX(0.0F);
        criticalsUsedProgressBar.setAlignmentY(0.0F);
        criticalsUsedProgressBar.setMaximumSize(new Dimension(150, 20));
        criticalsUsedProgressBar.setMinimumSize(new Dimension(150, 20));
        criticalsUsedProgressBar.setPreferredSize(new Dimension(150, 20));
        criticalsUsedProgressBar.setString("0/78");
        criticalsUsedProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 17;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        InfoPanel.add(criticalsUsedProgressBar, gridBagConstraints);

        MechTabPane.addTab("Stock Armament", InfoPanel);

        ComponentScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        ComponentScrollPane.setAlignmentX(0.0F);
        ComponentScrollPane.setAlignmentY(0.0F);
        ComponentScrollPane.setFont(new Font("Moire", 0, 12)); // NOI18N
        ComponentScrollPane.setMinimumSize(new Dimension(300, 500));
        ComponentScrollPane.setPreferredSize(new Dimension(300, 500));

        ComponentPanel.setAlignmentX(0.0F);
        ComponentPanel.setAlignmentY(0.0F);
        ComponentPanel.setFont(new Font("Moire", 0, 12)); // NOI18N
        ComponentPanel.setLayout(new GridBagLayout());

        EnginePanel.setBorder(BorderFactory.createTitledBorder(new SoftBevelBorder(BevelBorder.RAISED), "Engine", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 12))); // NOI18N
        EnginePanel.setAlignmentX(0.0F);
        EnginePanel.setAlignmentY(0.0F);
        EnginePanel.setFont(new Font("Moire", 0, 12)); // NOI18N
        EnginePanel.setMinimumSize(new Dimension(264, 174));
        EnginePanel.setPreferredSize(new Dimension(264, 174));
        EnginePanel.setLayout(new GridBagLayout());

        EngineTonnageLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        EngineTonnageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        EngineTonnageLabel.setText("00.00 Tons");
        EngineTonnageLabel.setAlignmentY(0.0F);
        EngineTonnageLabel.setBorder(BorderFactory.createTitledBorder(null, "Engine Tonnage", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 12))); // NOI18N
        EngineTonnageLabel.setMaximumSize(new Dimension(125, 50));
        EngineTonnageLabel.setMinimumSize(new Dimension(125, 50));
        EngineTonnageLabel.setPreferredSize(new Dimension(125, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        EnginePanel.add(EngineTonnageLabel, gridBagConstraints);

        EngineCostLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        EngineCostLabel.setHorizontalAlignment(SwingConstants.CENTER);
        EngineCostLabel.setText("0 C-Bills");
        EngineCostLabel.setAlignmentY(0.0F);
        EngineCostLabel.setBorder(BorderFactory.createTitledBorder(null, "Engine Cost", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 12))); // NOI18N
        EngineCostLabel.setMaximumSize(new Dimension(125, 50));
        EngineCostLabel.setMinimumSize(new Dimension(125, 50));
        EngineCostLabel.setPreferredSize(new Dimension(125, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        EnginePanel.add(EngineCostLabel, gridBagConstraints);

        EngineRatingLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        EngineRatingLabel.setHorizontalAlignment(SwingConstants.CENTER);
        EngineRatingLabel.setText("000");
        EngineRatingLabel.setAlignmentY(0.0F);
        EngineRatingLabel.setBorder(BorderFactory.createTitledBorder(null, "Engine Rating", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 12))); // NOI18N
        EngineRatingLabel.setMaximumSize(new Dimension(125, 50));
        EngineRatingLabel.setMinimumSize(new Dimension(125, 50));
        EngineRatingLabel.setPreferredSize(new Dimension(125, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        EnginePanel.add(EngineRatingLabel, gridBagConstraints);

        EngineTypeLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        EngineTypeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        EngineTypeLabel.setText("Unknown");
        EngineTypeLabel.setAlignmentY(0.0F);
        EngineTypeLabel.setBorder(BorderFactory.createTitledBorder(null, "Engine Type", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 12))); // NOI18N
        EngineTypeLabel.setMaximumSize(new Dimension(125, 50));
        EngineTypeLabel.setMinimumSize(new Dimension(125, 50));
        EngineTypeLabel.setPreferredSize(new Dimension(125, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        EnginePanel.add(EngineTypeLabel, gridBagConstraints);

        EngineCriticalsLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        EngineCriticalsLabel.setHorizontalAlignment(SwingConstants.CENTER);
        EngineCriticalsLabel.setText("00");
        EngineCriticalsLabel.setAlignmentY(0.0F);
        EngineCriticalsLabel.setBorder(BorderFactory.createTitledBorder(null, "Engine Criticals", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 12))); // NOI18N
        EngineCriticalsLabel.setMaximumSize(new Dimension(125, 50));
        EngineCriticalsLabel.setMinimumSize(new Dimension(125, 50));
        EngineCriticalsLabel.setPreferredSize(new Dimension(125, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        EnginePanel.add(EngineCriticalsLabel, gridBagConstraints);

        EngineHeatSinkLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        EngineHeatSinkLabel.setHorizontalAlignment(SwingConstants.CENTER);
        EngineHeatSinkLabel.setText("00");
        EngineHeatSinkLabel.setAlignmentY(0.0F);
        EngineHeatSinkLabel.setBorder(BorderFactory.createTitledBorder(null, "Engine Heat Sinks", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 12))); // NOI18N
        EngineHeatSinkLabel.setMaximumSize(new Dimension(125, 50));
        EngineHeatSinkLabel.setMinimumSize(new Dimension(125, 50));
        EngineHeatSinkLabel.setPreferredSize(new Dimension(125, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        EnginePanel.add(EngineHeatSinkLabel, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(10, 0, 10, 0);
        ComponentPanel.add(EnginePanel, gridBagConstraints);

        HeatSinkPanel.setBorder(BorderFactory.createTitledBorder(new SoftBevelBorder(BevelBorder.RAISED), "Heat Sinks", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 12))); // NOI18N
        HeatSinkPanel.setAlignmentX(0.0F);
        HeatSinkPanel.setAlignmentY(0.0F);
        HeatSinkPanel.setFont(new Font("Moire", 0, 12)); // NOI18N
        HeatSinkPanel.setLayout(new GridBagLayout());

        HeatSinkTypeLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        HeatSinkTypeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        HeatSinkTypeLabel.setText("Unknown");
        HeatSinkTypeLabel.setAlignmentY(0.0F);
        HeatSinkTypeLabel.setBorder(BorderFactory.createTitledBorder(null, "Heat Sink Type", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 12))); // NOI18N
        HeatSinkTypeLabel.setMaximumSize(new Dimension(125, 50));
        HeatSinkTypeLabel.setMinimumSize(new Dimension(125, 50));
        HeatSinkTypeLabel.setPreferredSize(new Dimension(125, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        HeatSinkPanel.add(HeatSinkTypeLabel, gridBagConstraints);

        HeatSinkCountLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        HeatSinkCountLabel.setHorizontalAlignment(SwingConstants.CENTER);
        HeatSinkCountLabel.setText("00");
        HeatSinkCountLabel.setAlignmentY(0.0F);
        HeatSinkCountLabel.setBorder(BorderFactory.createTitledBorder(null, "Heat Sink Count", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 12))); // NOI18N
        HeatSinkCountLabel.setMaximumSize(new Dimension(125, 50));
        HeatSinkCountLabel.setMinimumSize(new Dimension(125, 50));
        HeatSinkCountLabel.setPreferredSize(new Dimension(125, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        HeatSinkPanel.add(HeatSinkCountLabel, gridBagConstraints);

        HeatSinkCostLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        HeatSinkCostLabel.setHorizontalAlignment(SwingConstants.CENTER);
        HeatSinkCostLabel.setText("0 C-Bills");
        HeatSinkCostLabel.setAlignmentY(0.0F);
        HeatSinkCostLabel.setBorder(BorderFactory.createTitledBorder(null, "Heat Sink Cost", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 12))); // NOI18N
        HeatSinkCostLabel.setMaximumSize(new Dimension(125, 50));
        HeatSinkCostLabel.setMinimumSize(new Dimension(125, 50));
        HeatSinkCostLabel.setPreferredSize(new Dimension(125, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        HeatSinkPanel.add(HeatSinkCostLabel, gridBagConstraints);

        HeatSinkDissipationLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        HeatSinkDissipationLabel.setHorizontalAlignment(SwingConstants.CENTER);
        HeatSinkDissipationLabel.setText("00.00");
        HeatSinkDissipationLabel.setAlignmentY(0.0F);
        HeatSinkDissipationLabel.setBorder(BorderFactory.createTitledBorder(null, "Heat Dissipation", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 12))); // NOI18N
        HeatSinkDissipationLabel.setMaximumSize(new Dimension(125, 50));
        HeatSinkDissipationLabel.setMinimumSize(new Dimension(125, 50));
        HeatSinkDissipationLabel.setPreferredSize(new Dimension(125, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        HeatSinkPanel.add(HeatSinkDissipationLabel, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(10, 0, 10, 0);
        ComponentPanel.add(HeatSinkPanel, gridBagConstraints);

        ArmorPanel.setBorder(BorderFactory.createTitledBorder(new SoftBevelBorder(BevelBorder.RAISED), "Armor", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 12))); // NOI18N
        ArmorPanel.setAlignmentX(0.0F);
        ArmorPanel.setAlignmentY(0.0F);
        ArmorPanel.setFont(new Font("Moire", 0, 12)); // NOI18N
        ArmorPanel.setLayout(new GridBagLayout());

        ArmorTonnageLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        ArmorTonnageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        ArmorTonnageLabel.setText("00.00 Tons");
        ArmorTonnageLabel.setAlignmentY(0.0F);
        ArmorTonnageLabel.setBorder(BorderFactory.createTitledBorder(null, "Armor Tonnage", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 12))); // NOI18N
        ArmorTonnageLabel.setMaximumSize(new Dimension(125, 50));
        ArmorTonnageLabel.setMinimumSize(new Dimension(125, 50));
        ArmorTonnageLabel.setPreferredSize(new Dimension(125, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ArmorPanel.add(ArmorTonnageLabel, gridBagConstraints);

        ArmorCostLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        ArmorCostLabel.setHorizontalAlignment(SwingConstants.CENTER);
        ArmorCostLabel.setText("0 C-Bills");
        ArmorCostLabel.setAlignmentY(0.0F);
        ArmorCostLabel.setBorder(BorderFactory.createTitledBorder(null, "Armor Cost", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 12))); // NOI18N
        ArmorCostLabel.setMaximumSize(new Dimension(125, 50));
        ArmorCostLabel.setMinimumSize(new Dimension(125, 50));
        ArmorCostLabel.setPreferredSize(new Dimension(125, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ArmorPanel.add(ArmorCostLabel, gridBagConstraints);

        ArmorTypeLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        ArmorTypeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        ArmorTypeLabel.setText("Unknown");
        ArmorTypeLabel.setAlignmentY(0.0F);
        ArmorTypeLabel.setBorder(BorderFactory.createTitledBorder(null, "Armor Type", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 12))); // NOI18N
        ArmorTypeLabel.setMaximumSize(new Dimension(125, 50));
        ArmorTypeLabel.setMinimumSize(new Dimension(125, 50));
        ArmorTypeLabel.setPreferredSize(new Dimension(125, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ArmorPanel.add(ArmorTypeLabel, gridBagConstraints);

        ArmorCriticalsLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        ArmorCriticalsLabel.setHorizontalAlignment(SwingConstants.CENTER);
        ArmorCriticalsLabel.setText("00");
        ArmorCriticalsLabel.setAlignmentY(0.0F);
        ArmorCriticalsLabel.setBorder(BorderFactory.createTitledBorder(null, "Armor Criticals", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 12))); // NOI18N
        ArmorCriticalsLabel.setMaximumSize(new Dimension(125, 50));
        ArmorCriticalsLabel.setMinimumSize(new Dimension(125, 50));
        ArmorCriticalsLabel.setPreferredSize(new Dimension(125, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ArmorPanel.add(ArmorCriticalsLabel, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(10, 0, 10, 0);
        ComponentPanel.add(ArmorPanel, gridBagConstraints);

        InternalsPanel.setBorder(BorderFactory.createTitledBorder(new SoftBevelBorder(BevelBorder.RAISED), "Internals", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 12))); // NOI18N
        InternalsPanel.setAlignmentX(0.0F);
        InternalsPanel.setAlignmentY(0.0F);
        InternalsPanel.setFont(new Font("Moire", 0, 12)); // NOI18N
        InternalsPanel.setMinimumSize(new Dimension(264, 124));
        InternalsPanel.setPreferredSize(new Dimension(264, 124));
        InternalsPanel.setLayout(new GridBagLayout());

        InternalsTonnageLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        InternalsTonnageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        InternalsTonnageLabel.setText("00.00 Tons");
        InternalsTonnageLabel.setAlignmentY(0.0F);
        InternalsTonnageLabel.setBorder(BorderFactory.createTitledBorder(null, "Internals Tonnage", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 12))); // NOI18N
        InternalsTonnageLabel.setMaximumSize(new Dimension(125, 50));
        InternalsTonnageLabel.setMinimumSize(new Dimension(125, 50));
        InternalsTonnageLabel.setPreferredSize(new Dimension(125, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        InternalsPanel.add(InternalsTonnageLabel, gridBagConstraints);
        InternalsTonnageLabel.getAccessibleContext().setAccessibleName("");

        InternalsCostLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        InternalsCostLabel.setHorizontalAlignment(SwingConstants.CENTER);
        InternalsCostLabel.setText("0 C-Bills");
        InternalsCostLabel.setAlignmentY(0.0F);
        InternalsCostLabel.setBorder(BorderFactory.createTitledBorder(null, "Internals Cost", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 12))); // NOI18N
        InternalsCostLabel.setMaximumSize(new Dimension(125, 50));
        InternalsCostLabel.setMinimumSize(new Dimension(125, 50));
        InternalsCostLabel.setPreferredSize(new Dimension(125, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        InternalsPanel.add(InternalsCostLabel, gridBagConstraints);

        InternalsTypeLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        InternalsTypeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        InternalsTypeLabel.setText("Unknown");
        InternalsTypeLabel.setAlignmentY(0.0F);
        InternalsTypeLabel.setBorder(BorderFactory.createTitledBorder(null, "Internals Type", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 12))); // NOI18N
        InternalsTypeLabel.setMaximumSize(new Dimension(125, 50));
        InternalsTypeLabel.setMinimumSize(new Dimension(125, 50));
        InternalsTypeLabel.setPreferredSize(new Dimension(125, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        InternalsPanel.add(InternalsTypeLabel, gridBagConstraints);

        InternalsCriticalsLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        InternalsCriticalsLabel.setHorizontalAlignment(SwingConstants.CENTER);
        InternalsCriticalsLabel.setText("00");
        InternalsCriticalsLabel.setAlignmentY(0.0F);
        InternalsCriticalsLabel.setBorder(BorderFactory.createTitledBorder(null, "Internals Criticals", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 12))); // NOI18N
        InternalsCriticalsLabel.setMaximumSize(new Dimension(125, 50));
        InternalsCriticalsLabel.setMinimumSize(new Dimension(125, 50));
        InternalsCriticalsLabel.setPreferredSize(new Dimension(125, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        InternalsPanel.add(InternalsCriticalsLabel, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(10, 0, 10, 0);
        ComponentPanel.add(InternalsPanel, gridBagConstraints);

        GyroPanel.setBorder(BorderFactory.createTitledBorder(new SoftBevelBorder(BevelBorder.RAISED), "Gyro", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 12))); // NOI18N
        GyroPanel.setAlignmentX(0.0F);
        GyroPanel.setAlignmentY(0.0F);
        GyroPanel.setEnabled(false);
        GyroPanel.setFont(new Font("Moire", 0, 12)); // NOI18N
        GyroPanel.setMinimumSize(new Dimension(264, 124));
        GyroPanel.setPreferredSize(new Dimension(264, 124));
        GyroPanel.setLayout(new GridBagLayout());

        GyroTypeLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        GyroTypeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        GyroTypeLabel.setText("Unknown");
        GyroTypeLabel.setAlignmentY(0.0F);
        GyroTypeLabel.setBorder(BorderFactory.createTitledBorder(null, "Gyro Type", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 12))); // NOI18N
        GyroTypeLabel.setEnabled(false);
        GyroTypeLabel.setMaximumSize(new Dimension(125, 50));
        GyroTypeLabel.setMinimumSize(new Dimension(125, 50));
        GyroTypeLabel.setPreferredSize(new Dimension(125, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        GyroPanel.add(GyroTypeLabel, gridBagConstraints);

        GyroCostLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        GyroCostLabel.setHorizontalAlignment(SwingConstants.CENTER);
        GyroCostLabel.setText("0 C-Bills");
        GyroCostLabel.setAlignmentY(0.0F);
        GyroCostLabel.setBorder(BorderFactory.createTitledBorder(null, "Gyro Cost", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 12))); // NOI18N
        GyroCostLabel.setEnabled(false);
        GyroCostLabel.setMaximumSize(new Dimension(125, 50));
        GyroCostLabel.setMinimumSize(new Dimension(125, 50));
        GyroCostLabel.setPreferredSize(new Dimension(125, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        GyroPanel.add(GyroCostLabel, gridBagConstraints);

        GyroTonnageLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        GyroTonnageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        GyroTonnageLabel.setText("00.00 Tons");
        GyroTonnageLabel.setAlignmentY(0.0F);
        GyroTonnageLabel.setBorder(BorderFactory.createTitledBorder(null, "Gyro Tonnage", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 12))); // NOI18N
        GyroTonnageLabel.setEnabled(false);
        GyroTonnageLabel.setMaximumSize(new Dimension(125, 50));
        GyroTonnageLabel.setMinimumSize(new Dimension(125, 50));
        GyroTonnageLabel.setPreferredSize(new Dimension(125, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        GyroPanel.add(GyroTonnageLabel, gridBagConstraints);

        GyroCriticalsLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        GyroCriticalsLabel.setHorizontalAlignment(SwingConstants.CENTER);
        GyroCriticalsLabel.setText("0");
        GyroCriticalsLabel.setAlignmentY(0.0F);
        GyroCriticalsLabel.setBorder(BorderFactory.createTitledBorder(null, "Gyro Criticals", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 12))); // NOI18N
        GyroCriticalsLabel.setEnabled(false);
        GyroCriticalsLabel.setMaximumSize(new Dimension(125, 50));
        GyroCriticalsLabel.setMinimumSize(new Dimension(125, 50));
        GyroCriticalsLabel.setPreferredSize(new Dimension(125, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        GyroPanel.add(GyroCriticalsLabel, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(10, 0, 10, 0);
        ComponentPanel.add(GyroPanel, gridBagConstraints);

        CockpitPanel.setBorder(BorderFactory.createTitledBorder(new SoftBevelBorder(BevelBorder.RAISED), "Cockpit", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 12))); // NOI18N
        CockpitPanel.setAlignmentX(0.0F);
        CockpitPanel.setAlignmentY(0.0F);
        CockpitPanel.setEnabled(false);
        CockpitPanel.setFont(new Font("Moire", 0, 12)); // NOI18N
        CockpitPanel.setMinimumSize(new Dimension(264, 124));
        CockpitPanel.setPreferredSize(new Dimension(264, 124));
        CockpitPanel.setLayout(new GridBagLayout());

        CockpitTypeLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        CockpitTypeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        CockpitTypeLabel.setText("Unknown");
        CockpitTypeLabel.setAlignmentY(0.0F);
        CockpitTypeLabel.setBorder(BorderFactory.createTitledBorder(null, "Cockpit Type", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 12))); // NOI18N
        CockpitTypeLabel.setEnabled(false);
        CockpitTypeLabel.setMaximumSize(new Dimension(125, 50));
        CockpitTypeLabel.setMinimumSize(new Dimension(125, 50));
        CockpitTypeLabel.setPreferredSize(new Dimension(125, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        CockpitPanel.add(CockpitTypeLabel, gridBagConstraints);

        CockpitCostLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        CockpitCostLabel.setHorizontalAlignment(SwingConstants.CENTER);
        CockpitCostLabel.setText("0 C-Bills");
        CockpitCostLabel.setAlignmentY(0.0F);
        CockpitCostLabel.setBorder(BorderFactory.createTitledBorder(null, "Cockpit Cost", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 12))); // NOI18N
        CockpitCostLabel.setEnabled(false);
        CockpitCostLabel.setMaximumSize(new Dimension(125, 50));
        CockpitCostLabel.setMinimumSize(new Dimension(125, 50));
        CockpitCostLabel.setPreferredSize(new Dimension(125, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        CockpitPanel.add(CockpitCostLabel, gridBagConstraints);

        CockpitTonnageLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        CockpitTonnageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        CockpitTonnageLabel.setText("00.00 Tons");
        CockpitTonnageLabel.setAlignmentY(0.0F);
        CockpitTonnageLabel.setBorder(BorderFactory.createTitledBorder(null, "Cockpit Tonnage", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 12))); // NOI18N
        CockpitTonnageLabel.setEnabled(false);
        CockpitTonnageLabel.setMaximumSize(new Dimension(125, 50));
        CockpitTonnageLabel.setMinimumSize(new Dimension(125, 50));
        CockpitTonnageLabel.setPreferredSize(new Dimension(125, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        CockpitPanel.add(CockpitTonnageLabel, gridBagConstraints);

        CockpitCriticalsLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        CockpitCriticalsLabel.setHorizontalAlignment(SwingConstants.CENTER);
        CockpitCriticalsLabel.setText("0");
        CockpitCriticalsLabel.setAlignmentY(0.0F);
        CockpitCriticalsLabel.setBorder(BorderFactory.createTitledBorder(null, "Cockpit Criticals", TitledBorder.LEADING, TitledBorder.TOP, new Font("Moire", 0, 12))); // NOI18N
        CockpitCriticalsLabel.setEnabled(false);
        CockpitCriticalsLabel.setMaximumSize(new Dimension(125, 50));
        CockpitCriticalsLabel.setMinimumSize(new Dimension(125, 50));
        CockpitCriticalsLabel.setPreferredSize(new Dimension(125, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        CockpitPanel.add(CockpitCriticalsLabel, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(10, 0, 10, 0);
        ComponentPanel.add(CockpitPanel, gridBagConstraints);

        ComponentScrollPane.setViewportView(ComponentPanel);

        MechTabPane.addTab("Components", ComponentScrollPane);

        OtherPanel.setAlignmentX(0.0F);
        OtherPanel.setAlignmentY(0.0F);
        OtherPanel.setFont(new Font("Moire", 0, 12)); // NOI18N
        OtherPanel.setLayout(new GridBagLayout());

        MechTreesButton.setFont(new Font("Moire", 0, 11)); // NOI18N
        MechTreesButton.setText("Mech Trees");
        MechTreesButton.setMaximumSize(new Dimension(100, 40));
        MechTreesButton.setMinimumSize(new Dimension(100, 40));
        MechTreesButton.setPreferredSize(new Dimension(100, 40));
        MechTreesButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                MechTreesButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        OtherPanel.add(MechTreesButton, gridBagConstraints);

        PilotTreesButton.setFont(new Font("Moire", 0, 11)); // NOI18N
        PilotTreesButton.setText("Pilot Trees");
        PilotTreesButton.setMaximumSize(new Dimension(100, 40));
        PilotTreesButton.setMinimumSize(new Dimension(100, 40));
        PilotTreesButton.setPreferredSize(new Dimension(100, 40));
        PilotTreesButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                PilotTreesButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        OtherPanel.add(PilotTreesButton, gridBagConstraints);

        AboutButton.setFont(new Font("Moire", 0, 11)); // NOI18N
        AboutButton.setText("About");
        AboutButton.setMaximumSize(new Dimension(100, 40));
        AboutButton.setMinimumSize(new Dimension(100, 40));
        AboutButton.setPreferredSize(new Dimension(100, 40));
        AboutButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                AboutButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        OtherPanel.add(AboutButton, gridBagConstraints);

        MechTabPane.addTab("Other", OtherPanel);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        MechLabPanel.add(MechTabPane, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(MechLabPanel, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //<editor-fold defaultstate="collapsed" desc="Mechlab ComboBox Methods">
    private void setStockVariant(Mech nFlag) {
        userMech = nFlag;
        userVariant = new Variant();
        
        userTonnage = 0;
        userAlpha = 0;
        userAlphaHeat = 0;
        userFirepower = 0;
        userHeat = 0;
        userRange = 0;
        userSpeedMod = STANDARD_SPEED_MODIFIER;
        userCriticals = 0;
        
        MechImage.setIcon(new ImageIcon(getClass().getResource(userMech.getIconPath())));
        
        userVariant.heatSinks = 10 + userMech.getStockExtraHeatSinks();
        userVariant.engineHeatSinks = userMech.getStockEngineRating() / 25;
        userVariant.items = userMech.getStockArmament();
        loadCriticals();
        
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
            minRating = ((int)(userMech.getTonnage() * 2));
        
        temp = String.format("%.2f Tons", userMech.getTonnage());
        TonnageLabel.setText(temp);
        ModuleLabel.setText("" + userMech.getModules());
        
        if (userMech.getTonnage() > 75)
            ClassLabel.setText("Assault");
        else if (userMech.getTonnage() > 55)
            ClassLabel.setText("Heavy");
        else if (userMech.getTonnage() > 35)
            ClassLabel.setText("Medium");
        else
            ClassLabel.setText("Light");
        
        if (userMech.isJumpCapable())
            JumpCapabilityLabel.setText("Yes");
        else
            JumpCapabilityLabel.setText("No");
        
        temp = String.format("%,d C-Bills", userMech.getCost());
        ModuleLabel1.setText(temp);
        temp = String.format("%,d MC", userMech.getMCCost());
        JumpCapabilityLabel1.setText(temp);
        
        temp = String.format("%.2f kph", ((minRating / userMech.getTonnage()) * userSpeedMod));
        MinimumSpeedLabel.setText(temp);
        temp = String.format("%.2f kph", ((maxRating / userMech.getTonnage()) * userSpeedMod));
        MaximumSpeedLabel.setText(temp);
        MinimumRatingLabel.setText("" + minRating);
        MaximumRatingLabel.setText("" + maxRating);
        
        TorsoYawLabel.setText("" + userMech.getMovementLimits(TORSO, YAW));
        TorsoPitchLabel.setText("" + userMech.getMovementLimits(TORSO, PITCH));
        ArmYawLabel.setText("" + userMech.getMovementLimits(ARM, YAW));
        ArmPitchLabel.setText("" + userMech.getMovementLimits(ARM, PITCH));
        
        UnconfirmedLabel.setVisible(userMech.isUnconfirmed());
        UnreleasedLabel.setVisible(userMech.isUnreleased());
        
        {
            Armor tempA = new Armor(userMech.hasFerroFibrous(), userMech.getStockTotalArmor());
            Internals tempI = new Internals(userMech.hasEndoSteel(), userMech.getTonnage());
            Engine tempE = new Engine(userMech.hasXLEngine(), userMech.getStockEngineRating());
            
            userCriticals += tempA.getCriticals();
            userCriticals += tempI.getCriticals();
            userCriticals += tempE.getCriticals() * tempE.getNumberOfSections();
            
            userTonnage += tempA.getTonnage();
            userTonnage += tempI.getTonnage();
            userTonnage += tempE.getTonnage();
        }
        
        if (userVariant.heatSinks >= userVariant.engineHeatSinks)
            if (userVariant.engineHeatSinks > 10)
                userTonnage += (userVariant.engineHeatSinks - 10);
        if (userVariant.heatSinks < userVariant.engineHeatSinks)
            if (userVariant.engineHeatSinks > 10)
                userTonnage += (userVariant.heatSinks - 10);
        
        for (int i = 0; i < NUMBER_OF_CRITICAL_SECTIONS; i++) {
            for (int j = 0; j < userVariant.items[i].size(); j++) {
                Item item = userVariant.items[i].elementAt(j);
                
                switch(item.getItemType()) {
                    case WEAPON_ITEM_TYPE:
                        Weapon weapon = (Weapon)item;
                        userHeat += weapon.getHeatPerSecond();
                        userAlphaHeat += weapon.getHeat();
                        userFirepower += weapon.getDamagePerSecond();
                        userAlpha += weapon.getDamage();
                    case JUMP_JET_ITEM_TYPE:
                    case HEAT_SINK_ITEM_TYPE:
                    case EQUIPMENT_ITEM_TYPE:
                    case COMPONENT_ITEM_TYPE:
                    case CASE_ITEM_TYPE:
                    case MYOMER_ITEM_TYPE:
                    case AMMO_ITEM_TYPE:
                        userTonnage += item.getTonnage();
                        userCriticals += item.getCriticals();
                        break;
                    default:
                        break;
                }
            }
        }
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
        userSpeedMod = STANDARD_SPEED_MODIFIER;
        userCriticals = 0;
        
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
        
        TonnageLabel.setText("000.00 Tons");
        ModuleLabel.setText("0");
        ClassLabel.setText("Unknown");
        JumpCapabilityLabel.setText("Unknown");
        ModuleLabel1.setText("0 C-Bills");
        JumpCapabilityLabel1.setText("0 MC");
        MinimumSpeedLabel.setText("0 kph");
        MaximumSpeedLabel.setText("0 kph");
        MinimumRatingLabel.setText("0");
        MaximumRatingLabel.setText("0");
        TorsoYawLabel.setText("0");
        TorsoPitchLabel.setText("0");
        ArmYawLabel.setText("0");
        ArmPitchLabel.setText("0");
        UnconfirmedLabel.setVisible(false);
        UnreleasedLabel.setVisible(false);
    }
    private void setMechlabComboBoxes() {
        resetChassisComboBox(chassisTypes);
        resetModelComboBox("");
    }
    private void resetChassisComboBox(String[] modelNames) {
        ChassisTypeComboBoxModel.removeAllElements();
        for (int i = 0; i < modelNames.length; i++)
            ChassisTypeComboBoxModel.addElement(modelNames[i]);
    }
    private void resetModelComboBox(String[] modelNames) {
        ChassisModelComboBoxModel.removeAllElements();
        for (int i = 0; i < modelNames.length; i++)
            ChassisModelComboBoxModel.addElement(modelNames[i]);
    }
    private void resetModelComboBox(String modelName) {
        ChassisModelComboBoxModel.removeAllElements();
        ChassisModelComboBoxModel.addElement(modelName);
    }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Armor Component Methods">
    private void initArmorComponents() {
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

        HeadArmorProgressBar.setString("" + userMech.getStockArmor(HEAD));
        RightTorsoArmorProgressBar.setString("" + userMech.getStockArmor(RIGHT_TORSO));
        CenterTorsoArmorProgressBar.setString("" + userMech.getStockArmor(CENTER_TORSO));
        LeftTorsoArmorProgressBar.setString("" + userMech.getStockArmor(LEFT_TORSO));
        RearRightTorsoArmorProgressBar.setString("" + userMech.getStockArmor(RIGHT_REAR_TORSO));
        RearCenterTorsoArmorProgressBar.setString("" + userMech.getStockArmor(CENTER_REAR_TORSO));
        RearLeftTorsoArmorProgressBar.setString("" + userMech.getStockArmor(LEFT_REAR_TORSO));
        RightArmArmorProgressBar.setString("" + userMech.getStockArmor(RIGHT_ARM));
        LeftArmArmorProgressBar.setString("" + userMech.getStockArmor(LEFT_ARM));
        RightLegArmorProgressBar.setString("" + userMech.getStockArmor(RIGHT_LEG));
        LeftLegArmorProgressBar.setString("" + userMech.getStockArmor(LEFT_LEG));
    }
    //</editor-fold>
    private void MechTabPaneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_MechTabPaneStateChanged
        setDiagramVisibility(MechTabPane.getSelectedIndex());
    }//GEN-LAST:event_MechTabPaneStateChanged
    private void ModelComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModelComboBoxActionPerformed
        switch (ChassisComboBox.getSelectedIndex()) {
            case ATLAS_INDEX:
            switch (ModelComboBox.getSelectedIndex()) {
                default:
                setDefaultVariant(ASSAULT_INDEX);
                break;
                case AS7_D_INDEX:
                setStockVariant(new AS7_D());
                break;
                case AS7_D_DC_INDEX:
                setStockVariant(new AS7_D_DC());
                break;
                case AS7_K_INDEX:
                setStockVariant(new AS7_K());
                break;
                case AS7_RS_INDEX:
                setStockVariant(new AS7_RS());
                break;
                case AS7_S_INDEX:
                setStockVariant(new AS7_S());
                break;
            }
            break;
            case AWESOME_INDEX:
            switch (ModelComboBox.getSelectedIndex()) {
                default:
                setDefaultVariant(ASSAULT_INDEX);
                break;
                case AWS_8Q_INDEX:
                setStockVariant(new AWS_8Q());
                break;
                case AWS_8R_INDEX:
                setStockVariant(new AWS_8R());
                break;
                case AWS_8T_INDEX:
                setStockVariant(new AWS_8T());
                break;
                case AWS_8V_INDEX:
                setStockVariant(new AWS_8V());
                break;
                case AWS_9M_INDEX:
                setStockVariant(new AWS_9M());
                break;
            }
            break;
            case BLACKJACK_INDEX:
            switch (ModelComboBox.getSelectedIndex()) {
                default:
                setDefaultVariant(MEDIUM_INDEX);
                break;
                case BJ_1_INDEX:
                setStockVariant(new BJ_1());
                break;
                case BJ_1DB_INDEX:
                setStockVariant(new BJ_1DB());
                break;
                case BJ_1DC_INDEX:
                setStockVariant(new BJ_1DC());
                break;
                case BJ_1X_INDEX:
                setStockVariant(new BJ_1X());
                break;
                case BJ_3_INDEX:
                setStockVariant(new BJ_3());
                break;
            }
            break;
            case CATAPHRACT_INDEX:
            switch (ModelComboBox.getSelectedIndex()) {
                default:
                setDefaultVariant(HEAVY_INDEX);
                break;
                case CTF_1X_INDEX:
                setStockVariant(new CTF_1X());
                break;
                case CTF_2X_INDEX:
                setStockVariant(new CTF_2X());
                break;
                case CTF_3D_INDEX:
                setStockVariant(new CTF_3D());
                break;
                case CTF_3L_INDEX:
                setStockVariant(new CTF_3L());
                break;
                case CTF_4X_INDEX:
                setStockVariant(new CTF_4X());
                break;
                case CTF_IM_INDEX:
                setStockVariant(new CTF_IM());
                break;
            }
            break;
            case CATAPULT_INDEX:
            switch (ModelComboBox.getSelectedIndex()) {
                default:
                setDefaultVariant(HEAVY_INDEX);
                break;
                case CPLT_A1_INDEX:
                setStockVariant(new CPLT_A1());
                break;
                case CPLT_C1_INDEX:
                setStockVariant(new CPLT_C1());
                break;
                case CPLT_C4_INDEX:
                setStockVariant(new CPLT_C4());
                break;
                case CPLT_K2_INDEX:
                setStockVariant(new CPLT_K2());
                break;
                case CPLT_K3_INDEX:
                setStockVariant(new CPLT_K3());
                break;
            }
            break;
            case CENTURION_INDEX:
            switch (ModelComboBox.getSelectedIndex()) {
                default:
                setDefaultVariant(MEDIUM_INDEX);
                break;
                case CN9_A_INDEX:
                setStockVariant(new CN9_A());
                break;
                case CN9_AH_INDEX:
                setStockVariant(new CN9_AH());
                break;
                case CN9_AL_INDEX:
                setStockVariant(new CN9_AL());
                break;
                case CN9_D_INDEX:
                setStockVariant(new CN9_D());
                break;
                case CN9_YLW_INDEX:
                setStockVariant(new CN9_YLW());
                break;
            }
            break;
            case CICADA_INDEX:
            switch (ModelComboBox.getSelectedIndex()) {
                default:
                setDefaultVariant(MEDIUM_INDEX);
                break;
                case CDA_2A_INDEX:
                setStockVariant(new CDA_2A());
                break;
                case CDA_2B_INDEX:
                setStockVariant(new CDA_2B());
                break;
                case CDA_3C_INDEX:
                setStockVariant(new CDA_3C());
                break;
                case CDA_3M_INDEX:
                setStockVariant(new CDA_3M());
                break;
            }
            break;
            case COMMANDO_INDEX:
            switch (ModelComboBox.getSelectedIndex()) {
                default:
                setDefaultVariant(LIGHT_INDEX);
                break;
                case COM_1B_INDEX:
                setStockVariant(new COM_1B());
                break;
                case COM_1C_INDEX:
                setStockVariant(new COM_1C());
                break;
                case COM_1D_INDEX:
                setStockVariant(new COM_1D());
                break;
                case COM_2D_INDEX:
                setStockVariant(new COM_2D());
                break;
                case COM_3A_INDEX:
                setStockVariant(new COM_3A());
                break;
                case COM_5S_INDEX:
                setStockVariant(new COM_5S());
                break;
            }
            break;
            case DRAGON_INDEX:
            switch (ModelComboBox.getSelectedIndex()) {
                default:
                setDefaultVariant(HEAVY_INDEX);
                break;
                case DGN_1C_INDEX:
                setStockVariant(new DGN_1C());
                break;
                case DGN_1N_INDEX:
                setStockVariant(new DGN_1N());
                break;
                case DGN_5N_INDEX:
                setStockVariant(new DGN_5N());
                break;
            }
            break;
            case FLEA_INDEX:
            switch (ModelComboBox.getSelectedIndex()) {
                default:
                setDefaultVariant(LIGHT_INDEX);
                break;
                case FLE_4_INDEX:
                setStockVariant(new FLE_4());
                break;
                case FLE_15_INDEX:
                setStockVariant(new FLE_15());
                break;
                case FLE_17_INDEX:
                setStockVariant(new FLE_17());
                break;
            }
            break;
            case GRAND_DRAGON_INDEX:
            switch (ModelComboBox.getSelectedIndex()) {
                default:
                setDefaultVariant(HEAVY_INDEX);
                break;
                case DRG_1G_INDEX:
                setStockVariant(new DRG_1G());
                break;
                case DRG_5K_INDEX:
                setStockVariant(new DRG_5K());
                break;
                case DRG_5K_DC_INDEX:
                setStockVariant(new DRG_5K_DC());
                break;
            }
            break;
            case HIGHLANDER_INDEX:
            switch (ModelComboBox.getSelectedIndex()) {
                default:
                setDefaultVariant(ASSAULT_INDEX);
                break;
                case HGN_732_INDEX:
                setStockVariant(new HGN_732());
                break;
                case HGN_733_INDEX:
                setStockVariant(new HGN_733());
                break;
                case HGN_733C_INDEX:
                setStockVariant(new HGN_733C());
                break;
                case HGN_733P_INDEX:
                setStockVariant(new HGN_733P());
                break;
            }
            break;
            case HUNCHBACK_INDEX:
            switch (ModelComboBox.getSelectedIndex()) {
                default:
                setDefaultVariant(MEDIUM_INDEX);
                break;
                case HBK_4G_INDEX:
                setStockVariant(new NMS_1X());
                break;
                case HBK_4H_INDEX:
                setStockVariant(new HBK_4H());
                break;
                case HBK_4J_INDEX:
                setStockVariant(new HBK_4J());
                break;
                case HBK_4N_INDEX:
                setStockVariant(new HBK_4N());
                break;
                case HBK_4P_INDEX:
                setStockVariant(new HBK_4P());
                break;
                case HBK_4SP_INDEX:
                setStockVariant(new HBK_4SP());
                break;
                case HBK_5M_INDEX:
                setStockVariant(new HBK_5M());
                break;
            }
            break;
            case JAGERMECH_INDEX:
            switch (ModelComboBox.getSelectedIndex()) {
                default:
                setDefaultVariant(HEAVY_INDEX);
                break;
                case JM6_A_INDEX:
                setStockVariant(new JM6_A());
                break;
                case JM6_DD_INDEX:
                setStockVariant(new JM6_DD());
                break;
                case JM6_S_INDEX:
                setStockVariant(new JM6_S());
                break;
            }
            break;
            case JENNER_INDEX:
            switch (ModelComboBox.getSelectedIndex()) {
                default:
                setDefaultVariant(LIGHT_INDEX);
                break;
                case JR7_A_INDEX:
                setStockVariant(new JR7_A());
                break;
                case JR7_D_INDEX:
                setStockVariant(new JR7_D());
                break;
                case JR7_F_INDEX:
                setStockVariant(new JR7_F());
                break;
                case JR7_K_INDEX:
                setStockVariant(new JR7_K());
                break;
            }
            break;
            case RAVEN_INDEX:
            switch (ModelComboBox.getSelectedIndex()) {
                default:
                setDefaultVariant(LIGHT_INDEX);
                break;
                case RVN_2X_INDEX:
                setStockVariant(new RVN_2X());
                break;
                case RVN_3L_INDEX:
                setStockVariant(new RVN_3L());
                break;
                case RVN_4X_INDEX:
                setStockVariant(new RVN_4X());
                break;
            }
            break;
            case SPIDER_INDEX:
            switch (ModelComboBox.getSelectedIndex()) {
                default:
                setDefaultVariant(LIGHT_INDEX);
                break;
                case SDR_5D_INDEX:
                setStockVariant(new SDR_5D());
                break;
                case SDR_5K_INDEX:
                setStockVariant(new SDR_5K());
                break;
                case SDR_5V_INDEX:
                setStockVariant(new SDR_5V());
                break;
            }
            break;
            case STALKER_INDEX:
            switch (ModelComboBox.getSelectedIndex()) {
                default:
                setDefaultVariant(ASSAULT_INDEX);
                break;
                case STK_3F_INDEX:
                setStockVariant(new STK_3F());
                break;
                case STK_3H_INDEX:
                setStockVariant(new STK_3H());
                break;
                case STK_4N_INDEX:
                setStockVariant(new STK_4N());
                break;
                case STK_4P_INDEX:
                setStockVariant(new STK_4P());
                break;
                case STK_5M_INDEX:
                setStockVariant(new STK_5M());
                break;
                case STK_5S_INDEX:
                setStockVariant(new STK_5S());
                break;
            }
            break;
            case TREBUCHET_INDEX:
            switch (ModelComboBox.getSelectedIndex()) {
                default:
                setDefaultVariant(MEDIUM_INDEX);
                break;
                case TBT_3C_INDEX:
                setStockVariant(new TBT_3C());
                break;
                case TBT_5J_INDEX:
                setStockVariant(new TBT_5J());
                break;
                case TBT_5K_INDEX:
                setStockVariant(new TBT_5K());
                break;
                case TBT_5N_INDEX:
                setStockVariant(new TBT_5N());
                break;
                case TBT_5S_INDEX:
                setStockVariant(new TBT_5S());
                break;
                case TBT_7M_INDEX:
                setStockVariant(new TBT_7M());
                break;
            }
            break;
            default:
            setDefaultVariant(DEFAULT_INDEX);
            break;
        }

        initArmorComponents();
        initStatPanel();
        initComponentPanel();
        initAllProgressBars();
    }//GEN-LAST:event_ModelComboBoxActionPerformed
    private void ChassisComboBoxActionPerformed(ActionEvent evt) {//GEN-FIRST:event_ChassisComboBoxActionPerformed
        switch(ChassisComboBox.getSelectedIndex()) {
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
                resetModelComboBox("");
                break;
        }
    }//GEN-LAST:event_ChassisComboBoxActionPerformed
    private void MechTreesButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_MechTreesButtonActionPerformed
        MechTreeDialogBox dlgBox = new MechTreeDialogBox(this, true);
        dlgBox.setLocationRelativeTo(this);
        dlgBox.setVisible(true);
    }//GEN-LAST:event_MechTreesButtonActionPerformed
    private void PilotTreesButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_PilotTreesButtonActionPerformed
        PilotTreeDialogBox dlgBox = new PilotTreeDialogBox(this, true);
        dlgBox.setLocationRelativeTo(this);
        dlgBox.setVisible(true);
    }//GEN-LAST:event_PilotTreesButtonActionPerformed
    private void AboutButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_AboutButtonActionPerformed
        AboutDialogBox dlgBox = new AboutDialogBox(this, true, statlabVersion, MWOstage);
        dlgBox.setLocationRelativeTo(this);
        dlgBox.setVisible(true);
    }//GEN-LAST:event_AboutButtonActionPerformed
    private void formWindowClosing(WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (parent != null)
            parent.setVisible(true);
        else
            setDefaultCloseOperation(EXIT_ON_CLOSE);
    }//GEN-LAST:event_formWindowClosing
    private void setDiagramVisibility(int index) {
        if (index == 0)
            StatsPanel.setVisible(true);
        else
            StatsPanel.setVisible(false);
        
        if (index == 1)
            CriticalsPanel.setVisible(true);
        else
            CriticalsPanel.setVisible(false);
        
        if (index == 2)
            StockArmorPanel.setVisible(true);
        else
            StockArmorPanel.setVisible(false);
        
        if (index == 3)
            EquipmentTabbedPane.setVisible(true);
        else
            EquipmentTabbedPane.setVisible(false);
    }
    //<editor-fold defaultstate="collapsed" desc="Critical Methods">
    private void loadCriticals() {
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
    //<editor-fold defaultstate="collapsed" desc="Progress Bar Methods">
    public void initAllProgressBars() {
        tonnageProgressBar.setMaximum((int)userMech.getTonnage());
        currentArmorProgressBar.setMaximum(userMech.getMaxTotalArmor());
        currentArmorProgressBar.setValue(userMech.getStockTotalArmor());
        
        if ((userMech.getTonnage() * 8.6) > 400)
            speedProgressBar.setMaximum((int)Math.ceil((400 / userMech.getTonnage()) * userSpeedMod));
        else
            speedProgressBar.setMaximum((int)Math.ceil(8.6 * userSpeedMod));
        
        if ((userMech.getTonnage() * 2) < 100)
            speedProgressBar.setMinimum((int)Math.floor((100 / userMech.getTonnage()) * userSpeedMod));
        else
            speedProgressBar.setMinimum((int)Math.floor(userSpeedMod * 2));
        
        updateArmorProgressBar();
        updateTonnageProgressBar();
        updateFirepowerProgressBar();
        updateAlphaProgressBar();
        updateAlphaHeatProgressBar();
        updateRangeProgressBar();
        updateHeatProgressBar();
        updateSpeedProgressBar();
        updateCriticalsProgressBar();
    }
    public void updateArmorProgressBar() {
        if (userMech.getStockTotalArmor() >= userMech.getMaxTotalArmor())
            currentArmorProgressBar.setForeground(new Color(60,180,60));
        else if (userMech.getStockTotalArmor() >= (userMech.getMaxTotalArmor() / 2.0))
            currentArmorProgressBar.setForeground(new Color(180 - (int)(((userMech.getStockTotalArmor() - (userMech.getMaxTotalArmor() / 2.0)) / (userMech.getStockTotalArmor() / 2.0)) * 120),180,60));
        else
            currentArmorProgressBar.setForeground(new Color(180,60 + (int)((userMech.getStockTotalArmor() / (userMech.getMaxTotalArmor() / 2.0)) * 120),60));
        currentArmorProgressBar.setValue(userMech.getStockTotalArmor());
        currentArmorProgressBar.setString("" + userMech.getStockTotalArmor());
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
    public void updateFirepowerProgressBar() {
        if (userFirepower >= 40)
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
        if (userAlpha >= 128)
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
        Heat_Sink tempH = new Heat_Sink(userMech.hasDoubleHeatSinks());

        double temp2 = (userVariant.heatSinks * tempH.getHeatDissipation() * 10);
        
        if (userMech.hasDoubleHeatSinks()) {
            if (userVariant.heatSinks > 10)
                temp2 += 6;
            else
                temp2 += (userVariant.heatSinks * 0.6);
        }
        
        temp2 = userAlphaHeat / (temp2 + 30);
        
        temp = String.format("%.2f", (temp2 * 100));
        alphaStrikeHeatProgressBar.setString(temp + '%');
        
        if (temp2 > 1)
        {
            alphaStrikeHeatProgressBar.setValue(100);
            alphaStrikeHeatProgressBar.setForeground(new Color(180, 60, 60));
        }
        else
        {
            alphaStrikeHeatProgressBar.setValue((int)(temp2 * 100));
            if (temp2 >= 0.5)
                alphaStrikeHeatProgressBar.setForeground(new Color(180, 180 - (int)((temp2 / 0.5 - 1) * 120), 60));
            else if (temp2 >= 0)
                alphaStrikeHeatProgressBar.setForeground(new Color(60 + (int)(temp2 * 240), 180, 60));
        }
    }
    public void updateRangeProgressBar() {
        int closest = 1200;
        int range;
        int effectiveRange = 0;
        userRange = 0;
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
        if (effectiveRange >= 690)
            rangeProgressBar.setForeground(new Color(60,180,60));
        else if (effectiveRange >= 345)
            rangeProgressBar.setForeground(new Color(180 - (int)(((effectiveRange - 345) / 345) * 120),180,60));
        else
            rangeProgressBar.setForeground(new Color(180,60 + (int)((effectiveRange / 345) * 120),60));
        rangeProgressBar.setValue(effectiveRange);
        rangeProgressBar.setString("" + effectiveRange + "m");
    }
    public void updateHeatProgressBar() {
        Heat_Sink tempH = new Heat_Sink(userMech.hasDoubleHeatSinks());

        double temp2 = (userVariant.heatSinks * tempH.getHeatDissipation() / userHeat);
        
        if (userMech.hasDoubleHeatSinks()) {
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
        double temp2 = (userMech.getStockEngineRating() / userMech.getTonnage() * userSpeedMod);
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
    public void updateCriticalsProgressBar() {
        if (userCriticals <= 78)
            criticalsUsedProgressBar.setForeground(new Color(60 + (int)(((78 - userCriticals) / 78) * 120), 180, 60));
        else
            criticalsUsedProgressBar.setForeground(new Color(180,60,60));
        criticalsUsedProgressBar.setValue(userCriticals);
        criticalsUsedProgressBar.setString("" + userCriticals + '/' + 78);
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
        
        RightArmArmorLabel.setString("" + userMech.getMaxArmor(RIGHT_ARM));
        RightArmInternalLabel.setString("" + userMech.getMaxInternals(RIGHT_ARM));
        LeftArmArmorLabel.setString("" + userMech.getMaxArmor(LEFT_ARM));
        LeftArmInternalLabel.setString("" + userMech.getMaxInternals(LEFT_ARM));
        RightTorsoArmorLabel.setString("" + userMech.getMaxArmor(RIGHT_TORSO));
        RightTorsoInternalLabel.setString("" + userMech.getMaxInternals(RIGHT_TORSO));
        LeftTorsoArmorLabel.setString("" + userMech.getMaxArmor(LEFT_TORSO));
        LeftTorsoInternalLabel.setString("" + userMech.getMaxInternals(LEFT_TORSO));
        CenterTorsoArmorLabel.setString("" + userMech.getMaxArmor(CENTER_TORSO));
        CenterTorsoInternalLabel.setString("" + userMech.getMaxInternals(CENTER_TORSO));
        HeadArmorLabel.setString("" + userMech.getMaxArmor(HEAD));
        HeadInternalLabel.setString("" + userMech.getMaxInternals(HEAD));
        RightLegArmorLabel.setString("" + userMech.getMaxArmor(RIGHT_LEG));
        RightLegInternalLabel.setString("" + userMech.getMaxInternals(RIGHT_LEG));
        LeftLegArmorLabel.setString("" + userMech.getMaxArmor(LEFT_LEG));
        LeftLegInternalLabel.setString("" + userMech.getMaxInternals(LEFT_LEG));
        
        TotalInternalLabel.setString("" + userMech.getMaxTotalInternals());
        TotalArmorLabel.setString("" + userMech.getMaxTotalArmor());
            
        if (userMech.getTotalHardpoints(BALLISTIC) > 0)
            TotalBallisticLabel.setOpaque(true);
        else
            TotalBallisticLabel.setOpaque(false);
        
        TotalBallisticLabel.setText("" + userMech.getTotalHardpoints(BALLISTIC));
            
        if (userMech.getTotalHardpoints(ENERGY) > 0)
            TotalEnergyLabel.setOpaque(true);
        else
            TotalEnergyLabel.setOpaque(false);
        
        TotalEnergyLabel.setText("" + userMech.getTotalHardpoints(ENERGY));
            
        if (userMech.getTotalHardpoints(MISSILE) > 0)
            TotalMissileLabel.setOpaque(true);
        else
            TotalMissileLabel.setOpaque(false);
        
        TotalMissileLabel.setText("" + userMech.getTotalHardpoints(MISSILE));
            
        if (userMech.getTotalHardpoints(AMS) > 0)
            TotalAMSLabel.setOpaque(true);
        else
            TotalAMSLabel.setOpaque(false);
        
        TotalAMSLabel.setText("" + userMech.getTotalHardpoints(AMS));
        
        Color blank = new Color(240,240,240);
        Color ballistic = new Color(192,192,64);
        Color energy = new Color(192,64,64);
        Color missile = new Color(64,192,64);
        Color ams = new Color(64,64,192);
        
        if (userMech.getHardpoints(RIGHT_ARM, BALLISTIC) > 0)
            RightArmBallisticLabel.setBackground(ballistic);
        else
            RightArmBallisticLabel.setBackground(blank);
        
        if (userMech.getHardpoints(RIGHT_ARM, ENERGY) > 0)
            RightArmEnergyLabel.setBackground(energy);
        else
            RightArmEnergyLabel.setBackground(blank);
        
        if (userMech.getHardpoints(RIGHT_ARM, MISSILE) > 0)
            RightArmMissileLabel.setBackground(missile);
        else
            RightArmMissileLabel.setBackground(blank);
        
        if (userMech.getHardpoints(RIGHT_ARM, AMS) > 0)
            RightArmAMSLabel.setBackground(ams);
        else
            RightArmAMSLabel.setBackground(blank);
        
        if (userMech.getHardpoints(LEFT_ARM, BALLISTIC) > 0)
            LeftArmBallisticLabel.setBackground(ballistic);
        else
            LeftArmBallisticLabel.setBackground(blank);
        
        if (userMech.getHardpoints(LEFT_ARM, ENERGY) > 0)
            LeftArmEnergyLabel.setBackground(energy);
        else
            LeftArmEnergyLabel.setBackground(blank);
        
        if (userMech.getHardpoints(LEFT_ARM, MISSILE) > 0)
            LeftArmMissileLabel.setBackground(missile);
        else
            LeftArmMissileLabel.setBackground(blank);
        
        if (userMech.getHardpoints(LEFT_ARM, AMS) > 0)
            LeftArmAMSLabel.setBackground(ams);
        else
            LeftArmAMSLabel.setBackground(blank);
        
        if (userMech.getHardpoints(RIGHT_TORSO, BALLISTIC) > 0)
            RightTorsoBallisticLabel.setBackground(ballistic);
        else
            RightTorsoBallisticLabel.setBackground(blank);
        
        if (userMech.getHardpoints(RIGHT_TORSO, ENERGY) > 0)
            RightTorsoEnergyLabel.setBackground(energy);
        else
            RightTorsoEnergyLabel.setBackground(blank);
        
        if (userMech.getHardpoints(RIGHT_TORSO, MISSILE) > 0)
            RightTorsoMissileLabel.setBackground(missile);
        else
            RightTorsoMissileLabel.setBackground(blank);
        
        if (userMech.getHardpoints(RIGHT_TORSO, AMS) > 0)
            RightTorsoAMSLabel.setBackground(ams);
        else
            RightTorsoAMSLabel.setBackground(blank);
        
        if (userMech.getHardpoints(LEFT_TORSO, BALLISTIC) > 0)
            LeftTorsoBallisticLabel.setBackground(ballistic);
        else
            LeftTorsoBallisticLabel.setBackground(blank);
        
        if (userMech.getHardpoints(LEFT_TORSO, ENERGY) > 0)
            LeftTorsoEnergyLabel.setBackground(energy);
        else
            LeftTorsoEnergyLabel.setBackground(blank);
        
        if (userMech.getHardpoints(LEFT_TORSO, MISSILE) > 0)
            LeftTorsoMissileLabel.setBackground(missile);
        else
            LeftTorsoMissileLabel.setBackground(blank);
        
        if (userMech.getHardpoints(LEFT_TORSO, AMS) > 0)
            LeftTorsoAMSLabel.setBackground(ams);
        else
            LeftTorsoAMSLabel.setBackground(blank);
        
        if (userMech.getHardpoints(CENTER_TORSO, BALLISTIC) > 0)
            CenterTorsoBallisticLabel.setBackground(ballistic);
        else
            CenterTorsoBallisticLabel.setBackground(blank);
        
        if (userMech.getHardpoints(CENTER_TORSO, ENERGY) > 0)
            CenterTorsoEnergyLabel.setBackground(energy);
        else
            CenterTorsoEnergyLabel.setBackground(blank);
        
        if (userMech.getHardpoints(CENTER_TORSO, MISSILE) > 0)
            CenterTorsoMissileLabel.setBackground(missile);
        else
            CenterTorsoMissileLabel.setBackground(blank);
        
        if (userMech.getHardpoints(CENTER_TORSO, AMS) > 0)
            CenterTorsoAMSLabel.setBackground(ams);
        else
            CenterTorsoAMSLabel.setBackground(blank);
        
        if (userMech.getHardpoints(HEAD, BALLISTIC) > 0)
            HeadBallisticLabel.setBackground(ballistic);
        else
            HeadBallisticLabel.setBackground(blank);
        
        if (userMech.getHardpoints(HEAD, ENERGY) > 0)
            HeadEnergyLabel.setBackground(energy);
        else
            HeadEnergyLabel.setBackground(blank);
        
        if (userMech.getHardpoints(HEAD, MISSILE) > 0)
            HeadMissileLabel.setBackground(missile);
        else
            HeadMissileLabel.setBackground(blank);
        
        if (userMech.getHardpoints(HEAD, AMS) > 0)
            HeadAMSLabel.setBackground(ams);
        else
            HeadAMSLabel.setBackground(blank);
    }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Component Methods">
    private void initComponentPanel() {
        updateEngine();
        updateHeatSinks();
        updateInternals();
        updateArmor();
        updateGyro();
        updateCockpit();
    }
    private void updateEngine() {
        Engine tempE = new Engine(userMech.hasXLEngine(), userMech.getStockEngineRating());
        
        EngineTypeLabel.setText(tempE.getEquipmentName());
        temp = String.format("%,d C-Bills", tempE.getCost());
        EngineCostLabel.setText(temp);
        EngineRatingLabel.setText("" + tempE.getEngineRating());
        EngineHeatSinkLabel.setText("" + tempE.getNumberOfEngineHeatSinks());
        EngineCriticalsLabel.setText("" + (tempE.getNumberOfSections() * tempE.getCriticals()));
        temp = String.format("%.2f Tons", tempE.getTonnage());
        EngineTonnageLabel.setText(temp);
    }
    private void updateHeatSinks() {
        Heat_Sink tempHS = new Heat_Sink(userMech.hasDoubleHeatSinks());
        
        HeatSinkTypeLabel.setText(tempHS.getEquipmentName());
        HeatSinkCountLabel.setText("" + userVariant.heatSinks);
        temp = String.format("%.2f", (userVariant.heatSinks * tempHS.getHeatDissipation() * 10));
        HeatSinkDissipationLabel.setText(temp);
        temp = String.format("%,d C-Bills", userVariant.heatSinks * tempHS.getCost());
        HeatSinkCostLabel.setText(temp);
    }
    private void updateInternals() {
        Internals tempI = new Internals(userMech.hasEndoSteel(), userMech.getTonnage());
        
        InternalsTypeLabel.setText(tempI.getEquipmentName());
        temp = String.format("%.2f Tons", tempI.getTonnage());
        InternalsTonnageLabel.setText(temp);
        InternalsCriticalsLabel.setText("" + (14 * tempI.getCriticals()));
        temp = String.format("%,d C-Bills", tempI.getCost());
        InternalsCostLabel.setText(temp);
    }
    private void updateArmor() {
        Armor tempA = new Armor(userMech.hasFerroFibrous(), userMech.getStockTotalArmor());
        
        ArmorTypeLabel.setText(tempA.getEquipmentName());
        temp = String.format("%.2f Tons", tempA.getTonnage());
        ArmorTonnageLabel.setText(temp);
        ArmorCriticalsLabel.setText("" + (14 * tempA.getCriticals()));
        temp = String.format("%,d C-Bills", tempA.getCost());
        ArmorCostLabel.setText(temp);
    }
    private void updateGyro() {
        GyroTypeLabel.setText("Standard");
        GyroTonnageLabel.setText("0 Tons");
        GyroCriticalsLabel.setText("4");
        GyroCostLabel.setText("0 C-Bills");
    }
    private void updateCockpit() {
        if (cockpitTypeFlag) {
            CockpitTypeLabel.setText("Command Console");
            CockpitTonnageLabel.setText("3 Tons");
            CockpitCriticalsLabel.setText("6");
            CockpitCostLabel.setText("0 C-Bills");
        }
        else {
            CockpitTypeLabel.setText("Standard");
            CockpitTonnageLabel.setText("0 Tons");
            CockpitCriticalsLabel.setText("5");
            CockpitCostLabel.setText("0 C-Bills");
        }
    }
    //</editor-fold>
    private void initVariables() {
        loadEquipment();
        setMechlabComboBoxes();
    }
    private void loadEquipment() {
        for (int i = 0; i < 5; i ++)
            Equipment[i] = new Vector();
        
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
        
        ballisticSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        energySelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        missileSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
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
                    label.setBackground( LockedBG );
                    label.setForeground( LockedFG );
                        
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
                else /*if (equipment[sectionFlag].elementAt(criticalIndex).isRemovable())*/ {
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
                    
                    label.setBackground( NormalBG );
                    label.setForeground( NormalFG );
                    
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
            public customException(String message) {
                super(message);
            }
        }
    //<editor-fold defaultstate="collapsed" desc="JComponent Variable Declerations">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton AboutButton;
    private JPanel AmmoPanel;
    private JLabel ArmPitchLabel;
    private JLabel ArmYawLabel;
    private JLabel ArmorCostLabel;
    private JLabel ArmorCriticalsLabel;
    private JPanel ArmorPanel;
    private JLabel ArmorTonnageLabel;
    private JLabel ArmorTypeLabel;
    private JPanel AttributesPanel;
    private JPanel BallisticPanel;
    JLabel CenterTorsoAMSLabel;
    JProgressBar CenterTorsoArmorLabel;
    private JProgressBar CenterTorsoArmorProgressBar;
    JLabel CenterTorsoBallisticLabel;
    private JPanel CenterTorsoCriticalPanel;
    JLabel CenterTorsoEnergyLabel;
    private JPanel CenterTorsoFrontPanel;
    JProgressBar CenterTorsoInternalLabel;
    private JList CenterTorsoList;
    JLabel CenterTorsoMissileLabel;
    private JPanel CenterTorsoRearPanel;
    private JSplitPane CenterTorsoSplitPane;
    private JPanel CenterTorsoStatsPanel;
    private JComboBox ChassisComboBox;
    private JPanel ChassisPanel;
    private JScrollPane ChassisScrollPane;
    private JLabel ClassLabel;
    private JLabel CockpitCostLabel;
    private JLabel CockpitCriticalsLabel;
    private JPanel CockpitPanel;
    private JLabel CockpitTonnageLabel;
    private JLabel CockpitTypeLabel;
    private JPanel ComponentPanel;
    private JScrollPane ComponentScrollPane;
    private JPanel CriticalsPanel;
    private JPanel DiagramPanel;
    private JPanel EnergyPanel;
    private JLabel EngineCostLabel;
    private JLabel EngineCriticalsLabel;
    private JLabel EngineHeatSinkLabel;
    private JPanel EnginePanel;
    private JLabel EngineRatingLabel;
    private JLabel EngineTonnageLabel;
    private JLabel EngineTypeLabel;
    private JTabbedPane EquipmentTabbedPane;
    private JLabel GyroCostLabel;
    private JLabel GyroCriticalsLabel;
    private JPanel GyroPanel;
    private JLabel GyroTonnageLabel;
    private JLabel GyroTypeLabel;
    JLabel HeadAMSLabel;
    JProgressBar HeadArmorLabel;
    private JProgressBar HeadArmorProgressBar;
    JLabel HeadBallisticLabel;
    private JPanel HeadCriticalPanel;
    JLabel HeadEnergyLabel;
    JProgressBar HeadInternalLabel;
    private JList HeadList;
    JLabel HeadMissileLabel;
    private JPanel HeadStatsPanel;
    private JPanel HeadStockPanel;
    private JLabel HeatSinkCostLabel;
    private JLabel HeatSinkCountLabel;
    private JLabel HeatSinkDissipationLabel;
    private JPanel HeatSinkPanel;
    private JLabel HeatSinkTypeLabel;
    private JPanel InfoPanel;
    private JLabel InternalsCostLabel;
    private JLabel InternalsCriticalsLabel;
    private JPanel InternalsPanel;
    private JLabel InternalsTonnageLabel;
    private JLabel InternalsTypeLabel;
    private JLabel JumpCapabilityLabel;
    private JLabel JumpCapabilityLabel1;
    JLabel KeyAMSLabel;
    JProgressBar KeyArmorLabel;
    JLabel KeyBallisticLabel;
    JLabel KeyEnergyLabel;
    JProgressBar KeyInternalLabel;
    JLabel KeyMissileLabel;
    JPanel KeyPanel;
    JLabel LeftArmAMSLabel;
    JProgressBar LeftArmArmorLabel;
    private JProgressBar LeftArmArmorProgressBar;
    JLabel LeftArmBallisticLabel;
    private JPanel LeftArmCriticalPanel;
    JLabel LeftArmEnergyLabel;
    JProgressBar LeftArmInternalLabel;
    private JList LeftArmList;
    JLabel LeftArmMissileLabel;
    private JPanel LeftArmStatsPanel;
    private JPanel LeftArmStockPanel;
    JLabel LeftLegAMSLabel;
    JProgressBar LeftLegArmorLabel;
    private JProgressBar LeftLegArmorProgressBar;
    JLabel LeftLegBallisticLabel;
    private JPanel LeftLegCriticalPanel;
    JLabel LeftLegEnergyLabel;
    JProgressBar LeftLegInternalLabel;
    private JList LeftLegList;
    JLabel LeftLegMissileLabel;
    private JPanel LeftLegStatsPanel;
    private JPanel LeftLegStockPanel;
    JLabel LeftTorsoAMSLabel;
    JProgressBar LeftTorsoArmorLabel;
    private JProgressBar LeftTorsoArmorProgressBar;
    JLabel LeftTorsoBallisticLabel;
    private JPanel LeftTorsoCriticalPanel;
    JLabel LeftTorsoEnergyLabel;
    private JPanel LeftTorsoFrontPanel;
    JProgressBar LeftTorsoInternalLabel;
    private JList LeftTorsoList;
    JLabel LeftTorsoMissileLabel;
    private JPanel LeftTorsoRearPanel;
    private JSplitPane LeftTorsoSplitPane;
    private JPanel LeftTorsoStatsPanel;
    private JLabel MaximumRatingLabel;
    private JLabel MaximumSpeedLabel;
    private JLabel MechImage;
    JPanel MechLabPanel;
    private JTabbedPane MechTabPane;
    private JButton MechTreesButton;
    private JLabel MinimumRatingLabel;
    private JLabel MinimumSpeedLabel;
    private JPanel MissilePanel;
    private JComboBox ModelComboBox;
    private JLabel ModuleLabel;
    private JLabel ModuleLabel1;
    private JPanel OtherEquipmentPanel;
    private JPanel OtherPanel;
    private JPanel OverviewPanel;
    private JButton PilotTreesButton;
    private JProgressBar RearCenterTorsoArmorProgressBar;
    private JProgressBar RearLeftTorsoArmorProgressBar;
    private JProgressBar RearRightTorsoArmorProgressBar;
    JLabel RightArmAMSLabel;
    JProgressBar RightArmArmorLabel;
    private JProgressBar RightArmArmorProgressBar;
    JLabel RightArmBallisticLabel;
    private JPanel RightArmCriticalPanel;
    JLabel RightArmEnergyLabel;
    JProgressBar RightArmInternalLabel;
    private JList RightArmList;
    JLabel RightArmMissileLabel;
    private JPanel RightArmStatsPanel;
    private JPanel RightArmStockPanel;
    JLabel RightLegAMSLabel;
    JProgressBar RightLegArmorLabel;
    private JProgressBar RightLegArmorProgressBar;
    JLabel RightLegBallisticLabel;
    private JPanel RightLegCriticalPanel;
    JLabel RightLegEnergyLabel;
    JProgressBar RightLegInternalLabel;
    private JList RightLegList;
    JLabel RightLegMissileLabel;
    private JPanel RightLegStatsPanel;
    private JPanel RightLegStockPanel;
    JLabel RightTorsoAMSLabel;
    JProgressBar RightTorsoArmorLabel;
    private JProgressBar RightTorsoArmorProgressBar;
    JLabel RightTorsoBallisticLabel;
    private JPanel RightTorsoCriticalPanel;
    JLabel RightTorsoEnergyLabel;
    private JPanel RightTorsoFrontPanel;
    JProgressBar RightTorsoInternalLabel;
    private JList RightTorsoList;
    JLabel RightTorsoMissileLabel;
    private JPanel RightTorsoRearPanel;
    private JSplitPane RightTorsoSplitPane;
    private JPanel RightTorsoStatsPanel;
    private JPanel SpeculationPanel;
    private JPanel SpeedLimitsPanel;
    private JPanel StatsPanel;
    private JPanel StockArmorPanel;
    private JLabel TonnageLabel;
    private JLabel TorsoPitchLabel;
    private JLabel TorsoYawLabel;
    JLabel TotalAMSLabel;
    JProgressBar TotalArmorLabel;
    JLabel TotalBallisticLabel;
    JLabel TotalEnergyLabel;
    JProgressBar TotalInternalLabel;
    JLabel TotalMissileLabel;
    JPanel TotalPanel;
    private JLabel UnconfirmedLabel;
    private JLabel UnreleasedLabel;
    private JLabel alphaStrikeHeatLabel;
    private JProgressBar alphaStrikeHeatProgressBar;
    private JLabel alphaStrikeLabel;
    private JProgressBar alphaStrikeProgressBar;
    private JTable ammoTable1;
    private JTable ammoTable2;
    private JTable ammoTable3;
    private JTable armorTable;
    private JTable ballisticTable1;
    private JTable ballisticTable2;
    private JLabel criticalsUsedLabel;
    private JProgressBar criticalsUsedProgressBar;
    private JLabel currentArmorLabel;
    private JProgressBar currentArmorProgressBar;
    private JLabel currentSpeedLabel;
    private JLabel currentTonnageLabel;
    private JTable energyTable1;
    private JTable energyTable2;
    private JTable engineTable;
    private JLabel firepowerLabel;
    private JProgressBar firepowerProgressBar;
    private JLabel heatEfficiencyLabel;
    private JProgressBar heatEfficiencyProgressBar;
    private JTable heatSinkTable;
    private JTable internalTable;
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
    private JScrollPane jScrollPane20;
    private JScrollPane jScrollPane21;
    private JScrollPane jScrollPane8;
    private JScrollPane jScrollPane9;
    private JTable jumpJetTable;
    private JTable missileTable1;
    private JTable missileTable2;
    private JLabel rangeLabel;
    private JProgressBar rangeProgressBar;
    private JProgressBar speedProgressBar;
    private JProgressBar tonnageProgressBar;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
}