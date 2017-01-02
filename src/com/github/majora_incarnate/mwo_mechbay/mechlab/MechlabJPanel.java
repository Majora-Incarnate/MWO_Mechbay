package com.github.majora_incarnate.mwo_mechbay.mechlab;

import java.awt.Color;
import java.awt.Dimension;
import java.util.function.Predicate;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JProgressBar;
import javax.swing.JToggleButton;
import javax.swing.SpinnerNumberModel;

import com.github.majora_incarnate.mwo_mechbay.entities.Blueprint;
import com.github.majora_incarnate.mwo_mechbay.entities.ChassisBlueprint;
import com.github.majora_incarnate.mwo_mechbay.entities.Crittable;
import com.github.majora_incarnate.mwo_mechbay.entities.Database;
import com.github.majora_incarnate.mwo_mechbay.entities.HardpointType;
import com.github.majora_incarnate.mwo_mechbay.entities.MechType;
import com.github.majora_incarnate.mwo_mechbay.entities.ModelBlueprint;
import com.github.majora_incarnate.mwo_mechbay.entities.Section;
import com.github.majora_incarnate.mwo_mechbay.entities.SectionBlueprint;
import com.github.majora_incarnate.mwo_mechbay.entities.SectionType;
import com.github.majora_incarnate.mwo_mechbay.entities.TechBase;
import com.github.majora_incarnate.mwo_mechbay.entities.User;
import com.github.majora_incarnate.mwo_mechbay.entities.Variant;
import com.github.majora_incarnate.mwo_mechbay.entities.WeaponBlueprint;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Trevin
 */
public class MechlabJPanel extends javax.swing.JPanel {
    private static final long serialVersionUID = 5605339237691950478L;
    
    private final SpinnerNumberModel engineRatingSpinnerModel;
    private final SpinnerNumberModel rightArmSpinnerModel;
    private final SpinnerNumberModel leftArmSpinnerModel;
    private final SpinnerNumberModel rightTorsoSpinnerModel;
    private final SpinnerNumberModel leftTorsoSpinnerModel;
    private final SpinnerNumberModel rightRearTorsoSpinnerModel;
    private final SpinnerNumberModel leftRearTorsoSpinnerModel;
    private final SpinnerNumberModel centerTorsoSpinnerModel;
    private final SpinnerNumberModel centerRearTorsoSpinnerModel;
    private final SpinnerNumberModel headSpinnerModel;
    private final SpinnerNumberModel rightLegSpinnerModel;
    private final SpinnerNumberModel leftLegSpinnerModel;
    private final SpinnerNumberModel special1SpinnerModel;
    private final SpinnerNumberModel special2SpinnerModel;
    private final Database masterDatabase;
    private Database selectedDatabase;

    /**
     * Creates new form MechlabJPanel
     * @param parentDatabase
     */
    public MechlabJPanel(final Database parentDatabase) {
        masterDatabase = parentDatabase;
        selectedDatabase = new Database(masterDatabase, (blueprint) -> true);
        engineRatingSpinnerModel = new SpinnerNumberModel(0, 0, 400, 5);
        rightArmSpinnerModel = new SpinnerNumberModel(0, 0, 0, 1);
        leftArmSpinnerModel = new SpinnerNumberModel(0, 0, 0, 1);
        rightTorsoSpinnerModel = new SpinnerNumberModel(0, 0, 0, 1);
        leftTorsoSpinnerModel = new SpinnerNumberModel(0, 0, 0, 1);
        rightRearTorsoSpinnerModel = new SpinnerNumberModel(0, 0, 0, 1);
        leftRearTorsoSpinnerModel = new SpinnerNumberModel(0, 0, 0, 1);
        centerTorsoSpinnerModel = new SpinnerNumberModel(0, 0, 0, 1);
        centerRearTorsoSpinnerModel = new SpinnerNumberModel(0, 0, 0, 1);
        headSpinnerModel = new SpinnerNumberModel(0, 0, 0, 1);
        rightLegSpinnerModel = new SpinnerNumberModel(0, 0, 0, 1);
        leftLegSpinnerModel = new SpinnerNumberModel(0, 0, 0, 1);
        special1SpinnerModel = new SpinnerNumberModel(0, 0, 0, 1);
        special2SpinnerModel = new SpinnerNumberModel(0, 0, 0, 1);
        
        initComponents();
        
        special1Panel.setVisible(false);
        special2Panel.setVisible(false);
        
        this.rightArmCriticalList.setCellRenderer(new MechCriticalRenderer(0));
        this.leftArmCriticalList.setCellRenderer(new MechCriticalRenderer(1));
        this.rightLegCriticalList.setCellRenderer(new MechCriticalRenderer(6));
        this.leftLegCriticalList.setCellRenderer(new MechCriticalRenderer(7));
        this.rightTorsoCriticalList.setCellRenderer(new MechCriticalRenderer(2));
        this.leftTorsoCriticalList.setCellRenderer(new MechCriticalRenderer(3));
        this.centerTorsoCriticalList.setCellRenderer(new MechCriticalRenderer(4));
        this.headCriticalList.setCellRenderer(new MechCriticalRenderer(5));
        //this.special1CriticalList.setCellRenderer(new MechCriticalRenderer(8));
        //this.special2CriticalList.setCellRenderer(new MechCriticalRenderer(9));
        
        this.updateCriticalPanelVisibility();
        chassisComboBox.setSelectedIndex(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        MechTabPane = new javax.swing.JTabbedPane();
        ChassisPanel = new javax.swing.JPanel();
        loadButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        importButton = new javax.swing.JButton();
        exportButton = new javax.swing.JButton();
        chassisComboBox = new javax.swing.JComboBox<>();
        modelComboBox = new javax.swing.JComboBox<>();
        variantNameField = new javax.swing.JTextField();
        variantCostLabel = new javax.swing.JLabel();
        techBaseLabel = new javax.swing.JLabel();
        mechTypeLabel = new javax.swing.JLabel();
        unreleasedLabel = new javax.swing.JLabel();
        unconfirmedLabel = new javax.swing.JLabel();
        ecmCapableLabel = new javax.swing.JLabel();
        jumpCapableLabel = new javax.swing.JLabel();
        UpgradesScrollPane = new javax.swing.JScrollPane();
        UpgradesPanel = new javax.swing.JPanel();
        AdjustmentsPanel = new javax.swing.JPanel();
        engineRatingSpinner = new javax.swing.JSpinner();
        SystemsPanel = new javax.swing.JPanel();
        engineComboBox = new javax.swing.JComboBox<>();
        structureComboBox = new javax.swing.JComboBox<>();
        armorComboBox = new javax.swing.JComboBox<>();
        gyroComboBox = new javax.swing.JComboBox<>();
        cockpitComboBox = new javax.swing.JComboBox<>();
        heatSinkComboBox = new javax.swing.JComboBox<>();
        myomerComboBox = new javax.swing.JComboBox<>();
        jumpJetComboBox = new javax.swing.JComboBox<>();
        EfficienciesPanel = new javax.swing.JPanel();
        WeaponsPanel = new javax.swing.JPanel();
        ArmorPanel = new javax.swing.JPanel();
        pointsPerTonLabel = new javax.swing.JLabel();
        pointsPerTonAmountLabel = new javax.swing.JLabel();
        maximumArmorButton = new javax.swing.JButton();
        clearArmorButton = new javax.swing.JButton();
        efficientArmorButton = new javax.swing.JButton();
        tonnageArmorButton = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        headArmorAmountLabel = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        centerTorsoArmorAmountLabel = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        rightTorsoArmorAmountLabel = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        leftTorsoArmorAmountLabel = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        rightArmArmorAmountLabel = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        leftArmArmorAmountLabel = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        rightLegArmorAmountLabel = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        leftLegArmorAmountLabel = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        special1ArmorAmountLabel = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        special2ArmorAmountLabel = new javax.swing.JLabel();
        totalArmorLabel = new javax.swing.JLabel();
        totalArmorAmountLabel = new javax.swing.JLabel();
        centerTorsoSpinner = new javax.swing.JSpinner();
        centerRearTorsoSpinner = new javax.swing.JSpinner();
        rightTorsoSpinner = new javax.swing.JSpinner();
        rightRearTorsoSpinner = new javax.swing.JSpinner();
        leftTorsoSpinner = new javax.swing.JSpinner();
        leftRearTorsoSpinner = new javax.swing.JSpinner();
        headSpinner = new javax.swing.JSpinner();
        rightArmSpinner = new javax.swing.JSpinner();
        leftArmSpinner = new javax.swing.JSpinner();
        leftLegSpinner = new javax.swing.JSpinner();
        rightLegSpinner = new javax.swing.JSpinner();
        special1Spinner = new javax.swing.JSpinner();
        special2Spinner = new javax.swing.JSpinner();
        statisticsPanel = new javax.swing.JPanel();
        tonnageProgressBar = new javax.swing.JProgressBar();
        speedProgressBar = new javax.swing.JProgressBar();
        jumpDistanceProgressBar = new javax.swing.JProgressBar();
        jumpHeightProgressBar = new javax.swing.JProgressBar();
        armorProgressBar = new javax.swing.JProgressBar();
        alphaDamageProgressBar = new javax.swing.JProgressBar();
        alphaHeatProgressBar = new javax.swing.JProgressBar();
        firepowerProgressBar = new javax.swing.JProgressBar();
        heatEfficiencyProgressBar = new javax.swing.JProgressBar();
        rangeProgressBar = new javax.swing.JProgressBar();
        criticalsProgressBar = new javax.swing.JProgressBar();
        mechPanel = new javax.swing.JPanel();
        headPanel = new javax.swing.JPanel();
        headOmnipodComboBox = new javax.swing.JComboBox<>();
        headAMSHardpointLabel = new javax.swing.JLabel();
        headECMHardpointLabel = new javax.swing.JLabel();
        headEnergyHardpointLabel = new javax.swing.JLabel();
        headBallisticHardpointLabel = new javax.swing.JLabel();
        headMissileHardpointLabel = new javax.swing.JLabel();
        headStructureProgressBar = new javax.swing.JProgressBar();
        headArmorProgressBar = new javax.swing.JProgressBar();
        headCriticalList = new javax.swing.JList<>();
        centerTorsoPanel = new javax.swing.JPanel();
        centerTorsoOmnipodComboBox = new javax.swing.JComboBox<>();
        centerTorsoAMSHardpointLabel = new javax.swing.JLabel();
        centerTorsoECMHardpointLabel = new javax.swing.JLabel();
        centerTorsoEnergyHardpointLabel = new javax.swing.JLabel();
        centerTorsoBallisticHardpointLabel = new javax.swing.JLabel();
        centerTorsoMissileHardpointLabel = new javax.swing.JLabel();
        centerTorsoStructureProgressBar = new javax.swing.JProgressBar();
        centerTorsoFrontArmorProgressBar = new javax.swing.JProgressBar();
        centerTorsoRearArmorProgressBar = new javax.swing.JProgressBar();
        centerTorsoCriticalList = new javax.swing.JList<>();
        leftTorsoPanel = new javax.swing.JPanel();
        leftTorsoOmnipodComboBox = new javax.swing.JComboBox<>();
        leftTorsoBallisticHardpointLabel = new javax.swing.JLabel();
        leftTorsoEnergyHardpointLabel = new javax.swing.JLabel();
        leftTorsoAMSHardpointLabel = new javax.swing.JLabel();
        leftTorsoECMHardpointLabel = new javax.swing.JLabel();
        leftTorsoMissileHardpointLabel = new javax.swing.JLabel();
        leftTorsoStructureProgressBar = new javax.swing.JProgressBar();
        leftTorsoFrontArmorProgressBar = new javax.swing.JProgressBar();
        leftTorsoRearArmorProgressBar = new javax.swing.JProgressBar();
        leftTorsoCriticalList = new javax.swing.JList<>();
        leftTorsoCASEToggleButton = new javax.swing.JToggleButton();
        rightTorsoPanel = new javax.swing.JPanel();
        rightTorsoOmnipodComboBox = new javax.swing.JComboBox<>();
        rightTorsoBallisticHardpointLabel = new javax.swing.JLabel();
        rightTorsoEnergyHardpointLabel = new javax.swing.JLabel();
        rightTorsoAMSHardpointLabel = new javax.swing.JLabel();
        rightTorsoECMHardpointLabel = new javax.swing.JLabel();
        rightTorsoMissileHardpointLabel = new javax.swing.JLabel();
        rightTorsoStructureProgressBar = new javax.swing.JProgressBar();
        rightTorsoFrontArmorProgressBar = new javax.swing.JProgressBar();
        rightTorsoRearArmorProgressBar = new javax.swing.JProgressBar();
        rightTorsoCriticalList = new javax.swing.JList<>();
        rightTorsoCASEToggleButton = new javax.swing.JToggleButton();
        leftLegPanel = new javax.swing.JPanel();
        leftLegOmnipodComboBox = new javax.swing.JComboBox<>();
        leftLegBallisticHardpointLabel = new javax.swing.JLabel();
        leftLegEnergyHardpointLabel = new javax.swing.JLabel();
        leftLegAMSHardpointLabel = new javax.swing.JLabel();
        leftLegECMHardpointLabel = new javax.swing.JLabel();
        leftLegMissileHardpointLabel = new javax.swing.JLabel();
        leftLegStructureProgressBar = new javax.swing.JProgressBar();
        leftLegArmorProgressBar = new javax.swing.JProgressBar();
        leftLegCriticalList = new javax.swing.JList<>();
        rightLegPanel = new javax.swing.JPanel();
        rightLegOmnipodComboBox = new javax.swing.JComboBox<>();
        rightLegBallisticHardpointLabel = new javax.swing.JLabel();
        rightLegEnergyHardpointLabel = new javax.swing.JLabel();
        rightLegAMSHardpointLabel = new javax.swing.JLabel();
        rightLegECMHardpointLabel = new javax.swing.JLabel();
        rightLegMissileHardpointLabel = new javax.swing.JLabel();
        rightLegStructureProgressBar = new javax.swing.JProgressBar();
        rightLegArmorProgressBar = new javax.swing.JProgressBar();
        rightLegCriticalList = new javax.swing.JList<>();
        leftArmPanel = new javax.swing.JPanel();
        leftArmOmnipodComboBox = new javax.swing.JComboBox<>();
        leftArmECMHardpointLabel = new javax.swing.JLabel();
        leftArmEnergyHardpointLabel = new javax.swing.JLabel();
        leftArmMissileHardpointLabel = new javax.swing.JLabel();
        leftArmAMSHardpointLabel = new javax.swing.JLabel();
        leftArmBallisticHardpointLabel = new javax.swing.JLabel();
        leftLowerArmToggleButton = new javax.swing.JToggleButton();
        leftHandToggleButton = new javax.swing.JToggleButton();
        leftArmStructureProgressBar = new javax.swing.JProgressBar();
        leftArmArmorProgressBar = new javax.swing.JProgressBar();
        leftArmCriticalList = new javax.swing.JList<>();
        rightArmPanel = new javax.swing.JPanel();
        rightArmOmnipodComboBox = new javax.swing.JComboBox<>();
        rightArmECMHardpointLabel = new javax.swing.JLabel();
        rightArmEnergyHardpointLabel = new javax.swing.JLabel();
        rightArmMissileHardpointLabel = new javax.swing.JLabel();
        rightArmAMSHardpointLabel = new javax.swing.JLabel();
        rightArmBallisticHardpointLabel = new javax.swing.JLabel();
        rightLowerArmToggleButton = new javax.swing.JToggleButton();
        rightHandToggleButton = new javax.swing.JToggleButton();
        rightArmStructureProgressBar = new javax.swing.JProgressBar();
        rightArmArmorProgressBar = new javax.swing.JProgressBar();
        rightArmCriticalList = new javax.swing.JList<>();
        special1Panel = new javax.swing.JPanel();
        section1OmnipodComboBox = new javax.swing.JComboBox<>();
        section1AMSHardpointLabel = new javax.swing.JLabel();
        section1ECMHardpointLabel = new javax.swing.JLabel();
        section1EnergyHardpointLabel = new javax.swing.JLabel();
        section1BallisticHardpointLabel = new javax.swing.JLabel();
        section1MissileHardpointLabel = new javax.swing.JLabel();
        section1StructureProgressBar = new javax.swing.JProgressBar();
        section1ArmorProgressBar = new javax.swing.JProgressBar();
        section1CriticalList = new javax.swing.JList<>();
        special2Panel = new javax.swing.JPanel();
        section2OmnipodComboBox = new javax.swing.JComboBox<>();
        section2AMSHardpointLabel = new javax.swing.JLabel();
        section2ECMHardpointLabel = new javax.swing.JLabel();
        section2EnergyHardpointLabel = new javax.swing.JLabel();
        section2BallisticHardpointLabel = new javax.swing.JLabel();
        section2MissileHardpointLabel = new javax.swing.JLabel();
        section2StructureProgressBar = new javax.swing.JProgressBar();
        section2ArmorProgressBar = new javax.swing.JProgressBar();
        section2CriticalList = new javax.swing.JList<>();
        secondaryTabbedPane = new javax.swing.JTabbedPane();
        quirksPanel = new javax.swing.JPanel();
        quirksJScrollPane = new javax.swing.JScrollPane();
        quirksJTextArea = new javax.swing.JTextArea();
        componentsScrollPane = new javax.swing.JScrollPane();
        componentsPanel = new javax.swing.JPanel();
        InformationTabbedPane = new javax.swing.JTabbedPane();
        ModelOverviewPanel = new javax.swing.JPanel();
        descriptionScrollPane = new javax.swing.JScrollPane();
        descriptionTextArea = new javax.swing.JTextArea();
        overviewComponentPanel = new com.github.majora_incarnate.mwo_mechbay.mechlab.ComponentPanel();
        hardpointComponentPanel = new com.github.majora_incarnate.mwo_mechbay.mechlab.ComponentPanel();
        ModelSpecificationsPanel = new javax.swing.JPanel();
        speedComponentPanel = new com.github.majora_incarnate.mwo_mechbay.mechlab.ComponentPanel();
        manueverabilityComponentPanel = new com.github.majora_incarnate.mwo_mechbay.mechlab.ComponentPanel();
        movementRangeComponentPanel = new com.github.majora_incarnate.mwo_mechbay.mechlab.ComponentPanel();
        movementSpeedComponentPanel = new com.github.majora_incarnate.mwo_mechbay.mechlab.ComponentPanel();
        InformationSpecificationsPanel = new javax.swing.JPanel();
        EquipmentSpecificationsPanel = new javax.swing.JPanel();
        OptionsPanel = new javax.swing.JPanel();
        FeaturesPanel = new javax.swing.JPanel();
        FrankenmechToggle = new javax.swing.JToggleButton();
        MixtechToggle = new javax.swing.JToggleButton();
        FuturetechToggle = new javax.swing.JToggleButton();
        OmniRestrictionsToggle = new javax.swing.JToggleButton();

        setMinimumSize(new java.awt.Dimension(1280, 700));
        setPreferredSize(new java.awt.Dimension(1280, 700));
        setLayout(new java.awt.GridBagLayout());

        MechTabPane.setMaximumSize(new java.awt.Dimension(320, 470));
        MechTabPane.setMinimumSize(new java.awt.Dimension(320, 470));
        MechTabPane.setPreferredSize(new java.awt.Dimension(320, 512));
        MechTabPane.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                MechTabPaneStateChanged(evt);
            }
        });

        ChassisPanel.setLayout(new java.awt.GridBagLayout());

        loadButton.setText("Load");
        loadButton.setAlignmentY(0.0F);
        loadButton.setEnabled(false);
        loadButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        loadButton.setMaximumSize(new java.awt.Dimension(39, 20));
        loadButton.setMinimumSize(new java.awt.Dimension(39, 20));
        loadButton.setPreferredSize(new java.awt.Dimension(39, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        ChassisPanel.add(loadButton, gridBagConstraints);

        saveButton.setText("Save");
        saveButton.setAlignmentY(0.0F);
        saveButton.setEnabled(false);
        saveButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        saveButton.setMaximumSize(new java.awt.Dimension(39, 20));
        saveButton.setMinimumSize(new java.awt.Dimension(39, 20));
        saveButton.setPreferredSize(new java.awt.Dimension(39, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        ChassisPanel.add(saveButton, gridBagConstraints);

        importButton.setText("Import");
        importButton.setAlignmentY(0.0F);
        importButton.setEnabled(false);
        importButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        importButton.setMaximumSize(new java.awt.Dimension(39, 20));
        importButton.setMinimumSize(new java.awt.Dimension(39, 20));
        importButton.setPreferredSize(new java.awt.Dimension(39, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        ChassisPanel.add(importButton, gridBagConstraints);

        exportButton.setText("Export");
        exportButton.setAlignmentY(0.0F);
        exportButton.setEnabled(false);
        exportButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        exportButton.setMaximumSize(new java.awt.Dimension(39, 20));
        exportButton.setMinimumSize(new java.awt.Dimension(39, 20));
        exportButton.setPreferredSize(new java.awt.Dimension(39, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        ChassisPanel.add(exportButton, gridBagConstraints);

        chassisComboBox.setModel(new DefaultComboBoxModel(masterDatabase.CHASSIS_BLUEPRINTS.toArray()));
        chassisComboBox.setMaximumSize(new java.awt.Dimension(39, 20));
        chassisComboBox.setMinimumSize(new java.awt.Dimension(39, 20));
        chassisComboBox.setPreferredSize(new java.awt.Dimension(39, 20));
        chassisComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chassisComboBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        ChassisPanel.add(chassisComboBox, gridBagConstraints);

        modelComboBox.setMaximumSize(new java.awt.Dimension(39, 20));
        modelComboBox.setMinimumSize(new java.awt.Dimension(39, 20));
        modelComboBox.setPreferredSize(new java.awt.Dimension(39, 20));
        modelComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelComboBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        ChassisPanel.add(modelComboBox, gridBagConstraints);

        variantNameField.setMaximumSize(new java.awt.Dimension(39, 20));
        variantNameField.setMinimumSize(new java.awt.Dimension(39, 20));
        variantNameField.setPreferredSize(new java.awt.Dimension(39, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        ChassisPanel.add(variantNameField, gridBagConstraints);

        variantCostLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        variantCostLabel.setText("0 C-Bills");
        variantCostLabel.setMaximumSize(new java.awt.Dimension(39, 20));
        variantCostLabel.setMinimumSize(new java.awt.Dimension(39, 20));
        variantCostLabel.setPreferredSize(new java.awt.Dimension(39, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        ChassisPanel.add(variantCostLabel, gridBagConstraints);

        techBaseLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        techBaseLabel.setText("CLAN TECH");
        techBaseLabel.setMaximumSize(new java.awt.Dimension(39, 20));
        techBaseLabel.setMinimumSize(new java.awt.Dimension(39, 20));
        techBaseLabel.setPreferredSize(new java.awt.Dimension(39, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        ChassisPanel.add(techBaseLabel, gridBagConstraints);

        mechTypeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mechTypeLabel.setText("OMNIMECH");
        mechTypeLabel.setMaximumSize(new java.awt.Dimension(39, 20));
        mechTypeLabel.setMinimumSize(new java.awt.Dimension(39, 20));
        mechTypeLabel.setPreferredSize(new java.awt.Dimension(39, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        ChassisPanel.add(mechTypeLabel, gridBagConstraints);

        unreleasedLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        unreleasedLabel.setText("UNRELEASED");
        unreleasedLabel.setMaximumSize(new java.awt.Dimension(39, 20));
        unreleasedLabel.setMinimumSize(new java.awt.Dimension(39, 20));
        unreleasedLabel.setOpaque(true);
        unreleasedLabel.setPreferredSize(new java.awt.Dimension(39, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        ChassisPanel.add(unreleasedLabel, gridBagConstraints);

        unconfirmedLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        unconfirmedLabel.setText("UNCONFIRMED");
        unconfirmedLabel.setMaximumSize(new java.awt.Dimension(39, 20));
        unconfirmedLabel.setMinimumSize(new java.awt.Dimension(39, 20));
        unconfirmedLabel.setOpaque(true);
        unconfirmedLabel.setPreferredSize(new java.awt.Dimension(39, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        ChassisPanel.add(unconfirmedLabel, gridBagConstraints);

        ecmCapableLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ecmCapableLabel.setText("ECM CAPABLE");
        ecmCapableLabel.setMaximumSize(new java.awt.Dimension(39, 20));
        ecmCapableLabel.setMinimumSize(new java.awt.Dimension(39, 20));
        ecmCapableLabel.setPreferredSize(new java.awt.Dimension(39, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        ChassisPanel.add(ecmCapableLabel, gridBagConstraints);

        jumpCapableLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jumpCapableLabel.setText("JUMP CAPABLE");
        jumpCapableLabel.setMaximumSize(new java.awt.Dimension(39, 20));
        jumpCapableLabel.setMinimumSize(new java.awt.Dimension(39, 20));
        jumpCapableLabel.setPreferredSize(new java.awt.Dimension(39, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        ChassisPanel.add(jumpCapableLabel, gridBagConstraints);

        MechTabPane.addTab("Chassis", ChassisPanel);

        UpgradesPanel.setLayout(new java.awt.GridBagLayout());

        AdjustmentsPanel.setPreferredSize(new java.awt.Dimension(0, 0));
        AdjustmentsPanel.setLayout(new java.awt.GridBagLayout());

        engineRatingSpinner.setModel(engineRatingSpinnerModel);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        AdjustmentsPanel.add(engineRatingSpinner, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        UpgradesPanel.add(AdjustmentsPanel, gridBagConstraints);

        SystemsPanel.setLayout(new java.awt.GridBagLayout());

        engineComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        SystemsPanel.add(engineComboBox, gridBagConstraints);

        structureComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        SystemsPanel.add(structureComboBox, gridBagConstraints);

        armorComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        SystemsPanel.add(armorComboBox, gridBagConstraints);

        gyroComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        SystemsPanel.add(gyroComboBox, gridBagConstraints);

        cockpitComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        SystemsPanel.add(cockpitComboBox, gridBagConstraints);

        heatSinkComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        SystemsPanel.add(heatSinkComboBox, gridBagConstraints);

        myomerComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        SystemsPanel.add(myomerComboBox, gridBagConstraints);

        jumpJetComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        SystemsPanel.add(jumpJetComboBox, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        UpgradesPanel.add(SystemsPanel, gridBagConstraints);

        EfficienciesPanel.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        UpgradesPanel.add(EfficienciesPanel, gridBagConstraints);

        UpgradesScrollPane.setViewportView(UpgradesPanel);

        MechTabPane.addTab("Upgrades", UpgradesScrollPane);

        WeaponsPanel.setLayout(new java.awt.GridBagLayout());
        MechTabPane.addTab("Weapons", WeaponsPanel);

        ArmorPanel.setLayout(new java.awt.GridBagLayout());

        pointsPerTonLabel.setText("Points Per Ton");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ArmorPanel.add(pointsPerTonLabel, gridBagConstraints);

        pointsPerTonAmountLabel.setText("0.0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ArmorPanel.add(pointsPerTonAmountLabel, gridBagConstraints);

        maximumArmorButton.setText("Maximum Armor");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ArmorPanel.add(maximumArmorButton, gridBagConstraints);

        clearArmorButton.setText("Clear Armor");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ArmorPanel.add(clearArmorButton, gridBagConstraints);

        efficientArmorButton.setText("Efficient Maximum");
        efficientArmorButton.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ArmorPanel.add(efficientArmorButton, gridBagConstraints);

        tonnageArmorButton.setText("Custom Tonnage");
        tonnageArmorButton.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ArmorPanel.add(tonnageArmorButton, gridBagConstraints);

        jLabel21.setText("Section");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        ArmorPanel.add(jLabel21, gridBagConstraints);

        jLabel22.setText("Front");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        ArmorPanel.add(jLabel22, gridBagConstraints);

        jLabel23.setText("Rear");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        ArmorPanel.add(jLabel23, gridBagConstraints);

        jLabel24.setText("Amount");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        ArmorPanel.add(jLabel24, gridBagConstraints);

        jLabel25.setText(SectionType.HEAD.shortName);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        ArmorPanel.add(jLabel25, gridBagConstraints);

        headArmorAmountLabel.setText("0/0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        ArmorPanel.add(headArmorAmountLabel, gridBagConstraints);

        jLabel29.setText(SectionType.CENTER_TORSO.shortName);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        ArmorPanel.add(jLabel29, gridBagConstraints);

        centerTorsoArmorAmountLabel.setText("0/0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        ArmorPanel.add(centerTorsoArmorAmountLabel, gridBagConstraints);

        jLabel33.setText(SectionType.RIGHT_TORSO.shortName);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        ArmorPanel.add(jLabel33, gridBagConstraints);

        rightTorsoArmorAmountLabel.setText("0/0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        ArmorPanel.add(rightTorsoArmorAmountLabel, gridBagConstraints);

        jLabel37.setText(SectionType.LEFT_TORSO.shortName);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        ArmorPanel.add(jLabel37, gridBagConstraints);

        leftTorsoArmorAmountLabel.setText("0/0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        ArmorPanel.add(leftTorsoArmorAmountLabel, gridBagConstraints);

        jLabel41.setText(SectionType.RIGHT_ARM.shortName);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        ArmorPanel.add(jLabel41, gridBagConstraints);

        rightArmArmorAmountLabel.setText("0/0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        ArmorPanel.add(rightArmArmorAmountLabel, gridBagConstraints);

        jLabel45.setText(SectionType.LEFT_ARM.shortName);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        ArmorPanel.add(jLabel45, gridBagConstraints);

        leftArmArmorAmountLabel.setText("0/0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 7;
        ArmorPanel.add(leftArmArmorAmountLabel, gridBagConstraints);

        jLabel49.setText(SectionType.RIGHT_LEG.shortName);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        ArmorPanel.add(jLabel49, gridBagConstraints);

        rightLegArmorAmountLabel.setText("0/0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 8;
        ArmorPanel.add(rightLegArmorAmountLabel, gridBagConstraints);

        jLabel50.setText(SectionType.LEFT_LEG.shortName);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        ArmorPanel.add(jLabel50, gridBagConstraints);

        leftLegArmorAmountLabel.setText("0/0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 9;
        ArmorPanel.add(leftLegArmorAmountLabel, gridBagConstraints);

        jLabel51.setText(SectionType.SPECIAL_ONE.shortName);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        ArmorPanel.add(jLabel51, gridBagConstraints);

        special1ArmorAmountLabel.setText("0/0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 10;
        ArmorPanel.add(special1ArmorAmountLabel, gridBagConstraints);

        jLabel55.setText(SectionType.SPECIAL_TWO.shortName);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        ArmorPanel.add(jLabel55, gridBagConstraints);

        special2ArmorAmountLabel.setText("0/0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 11;
        ArmorPanel.add(special2ArmorAmountLabel, gridBagConstraints);

        totalArmorLabel.setText("Total");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ArmorPanel.add(totalArmorLabel, gridBagConstraints);

        totalArmorAmountLabel.setText("0/0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ArmorPanel.add(totalArmorAmountLabel, gridBagConstraints);

        centerTorsoSpinner.setModel(centerTorsoSpinnerModel);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        ArmorPanel.add(centerTorsoSpinner, gridBagConstraints);

        centerRearTorsoSpinner.setModel(centerRearTorsoSpinnerModel);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        ArmorPanel.add(centerRearTorsoSpinner, gridBagConstraints);

        rightTorsoSpinner.setModel(rightTorsoSpinnerModel);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        ArmorPanel.add(rightTorsoSpinner, gridBagConstraints);

        rightRearTorsoSpinner.setModel(rightRearTorsoSpinnerModel);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        ArmorPanel.add(rightRearTorsoSpinner, gridBagConstraints);

        leftTorsoSpinner.setModel(leftTorsoSpinnerModel);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        ArmorPanel.add(leftTorsoSpinner, gridBagConstraints);

        leftRearTorsoSpinner.setModel(leftRearTorsoSpinnerModel);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        ArmorPanel.add(leftRearTorsoSpinner, gridBagConstraints);

        headSpinner.setModel(headSpinnerModel);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        ArmorPanel.add(headSpinner, gridBagConstraints);

        rightArmSpinner.setModel(rightArmSpinnerModel);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        ArmorPanel.add(rightArmSpinner, gridBagConstraints);

        leftArmSpinner.setModel(leftArmSpinnerModel);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        ArmorPanel.add(leftArmSpinner, gridBagConstraints);

        leftLegSpinner.setModel(leftLegSpinnerModel);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        ArmorPanel.add(leftLegSpinner, gridBagConstraints);

        rightLegSpinner.setModel(rightLegSpinnerModel);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        ArmorPanel.add(rightLegSpinner, gridBagConstraints);

        special1Spinner.setModel(special1SpinnerModel);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        ArmorPanel.add(special1Spinner, gridBagConstraints);

        special2Spinner.setModel(special2SpinnerModel);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        ArmorPanel.add(special2Spinner, gridBagConstraints);

        MechTabPane.addTab("Armor", ArmorPanel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(MechTabPane, gridBagConstraints);

        statisticsPanel.setMaximumSize(new java.awt.Dimension(192, 470));
        statisticsPanel.setMinimumSize(new java.awt.Dimension(192, 470));
        statisticsPanel.setPreferredSize(new java.awt.Dimension(192, 512));
        statisticsPanel.setLayout(new java.awt.GridBagLayout());

        tonnageProgressBar.setAlignmentX(0.0F);
        tonnageProgressBar.setAlignmentY(0.0F);
        tonnageProgressBar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tonnage", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, User.preferences.DEFAULT_FONT_SIZE_12));
        tonnageProgressBar.setMaximumSize(new java.awt.Dimension(0, 0));
        tonnageProgressBar.setMinimumSize(new java.awt.Dimension(0, 0));
        tonnageProgressBar.setPreferredSize(new java.awt.Dimension(0, 0));
        tonnageProgressBar.setStringPainted(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        statisticsPanel.add(tonnageProgressBar, gridBagConstraints);

        speedProgressBar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Speed", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, User.preferences.DEFAULT_FONT_SIZE_12));
        speedProgressBar.setMaximumSize(new java.awt.Dimension(0, 0));
        speedProgressBar.setMinimumSize(new java.awt.Dimension(0, 0));
        speedProgressBar.setPreferredSize(new java.awt.Dimension(0, 0));
        speedProgressBar.setStringPainted(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        statisticsPanel.add(speedProgressBar, gridBagConstraints);

        jumpDistanceProgressBar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Jump Distance", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, User.preferences.DEFAULT_FONT_SIZE_12));
        jumpDistanceProgressBar.setMaximumSize(new java.awt.Dimension(0, 0));
        jumpDistanceProgressBar.setMinimumSize(new java.awt.Dimension(0, 0));
        jumpDistanceProgressBar.setPreferredSize(new java.awt.Dimension(0, 0));
        jumpDistanceProgressBar.setStringPainted(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        statisticsPanel.add(jumpDistanceProgressBar, gridBagConstraints);

        jumpHeightProgressBar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Jump Height", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, User.preferences.DEFAULT_FONT_SIZE_12));
        jumpHeightProgressBar.setMaximumSize(new java.awt.Dimension(0, 0));
        jumpHeightProgressBar.setMinimumSize(new java.awt.Dimension(0, 0));
        jumpHeightProgressBar.setPreferredSize(new java.awt.Dimension(0, 0));
        jumpHeightProgressBar.setStringPainted(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        statisticsPanel.add(jumpHeightProgressBar, gridBagConstraints);

        armorProgressBar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Armor", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, User.preferences.DEFAULT_FONT_SIZE_12));
        armorProgressBar.setMaximumSize(new java.awt.Dimension(0, 0));
        armorProgressBar.setMinimumSize(new java.awt.Dimension(0, 0));
        armorProgressBar.setPreferredSize(new java.awt.Dimension(0, 0));
        armorProgressBar.setStringPainted(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        statisticsPanel.add(armorProgressBar, gridBagConstraints);

        alphaDamageProgressBar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alpha Damage", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, User.preferences.DEFAULT_FONT_SIZE_12));
        alphaDamageProgressBar.setMaximumSize(new java.awt.Dimension(0, 0));
        alphaDamageProgressBar.setMinimumSize(new java.awt.Dimension(0, 0));
        alphaDamageProgressBar.setPreferredSize(new java.awt.Dimension(0, 0));
        alphaDamageProgressBar.setStringPainted(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        statisticsPanel.add(alphaDamageProgressBar, gridBagConstraints);

        alphaHeatProgressBar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alpha Heat", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, User.preferences.DEFAULT_FONT_SIZE_12));
        alphaHeatProgressBar.setMaximumSize(new java.awt.Dimension(0, 0));
        alphaHeatProgressBar.setMinimumSize(new java.awt.Dimension(0, 0));
        alphaHeatProgressBar.setPreferredSize(new java.awt.Dimension(0, 0));
        alphaHeatProgressBar.setStringPainted(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        statisticsPanel.add(alphaHeatProgressBar, gridBagConstraints);

        firepowerProgressBar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Firepower", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, User.preferences.DEFAULT_FONT_SIZE_12));
        firepowerProgressBar.setMaximumSize(new java.awt.Dimension(0, 0));
        firepowerProgressBar.setMinimumSize(new java.awt.Dimension(0, 0));
        firepowerProgressBar.setPreferredSize(new java.awt.Dimension(0, 0));
        firepowerProgressBar.setStringPainted(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        statisticsPanel.add(firepowerProgressBar, gridBagConstraints);

        heatEfficiencyProgressBar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Heat Efficiency", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, User.preferences.DEFAULT_FONT_SIZE_12));
        heatEfficiencyProgressBar.setMaximumSize(new java.awt.Dimension(0, 0));
        heatEfficiencyProgressBar.setMinimumSize(new java.awt.Dimension(0, 0));
        heatEfficiencyProgressBar.setPreferredSize(new java.awt.Dimension(0, 0));
        heatEfficiencyProgressBar.setStringPainted(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        statisticsPanel.add(heatEfficiencyProgressBar, gridBagConstraints);

        rangeProgressBar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Range", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, User.preferences.DEFAULT_FONT_SIZE_12));
        rangeProgressBar.setMaximumSize(new java.awt.Dimension(0, 0));
        rangeProgressBar.setMinimumSize(new java.awt.Dimension(0, 0));
        rangeProgressBar.setPreferredSize(new java.awt.Dimension(0, 0));
        rangeProgressBar.setStringPainted(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        statisticsPanel.add(rangeProgressBar, gridBagConstraints);

        criticalsProgressBar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Criticals", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, User.preferences.DEFAULT_FONT_SIZE_12));
        criticalsProgressBar.setMaximumSize(new java.awt.Dimension(0, 0));
        criticalsProgressBar.setMinimumSize(new java.awt.Dimension(0, 0));
        criticalsProgressBar.setPreferredSize(new java.awt.Dimension(0, 0));
        criticalsProgressBar.setStringPainted(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        statisticsPanel.add(criticalsProgressBar, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(statisticsPanel, gridBagConstraints);

        mechPanel.setMaximumSize(new java.awt.Dimension(512, 470));
        mechPanel.setMinimumSize(new java.awt.Dimension(512, 470));
        mechPanel.setPreferredSize(new java.awt.Dimension(512, 512));
        mechPanel.setLayout(new java.awt.GridBagLayout());

        headPanel.setMaximumSize(new java.awt.Dimension(100, 128));
        headPanel.setMinimumSize(new java.awt.Dimension(100, 128));
        headPanel.setPreferredSize(new java.awt.Dimension(100, 128));
        headPanel.setLayout(new java.awt.GridBagLayout());

        headOmnipodComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        headPanel.add(headOmnipodComboBox, gridBagConstraints);

        headAMSHardpointLabel.setText("jLabel21");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        headPanel.add(headAMSHardpointLabel, gridBagConstraints);

        headECMHardpointLabel.setText("jLabel21");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        headPanel.add(headECMHardpointLabel, gridBagConstraints);

        headEnergyHardpointLabel.setText("jLabel21");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        headPanel.add(headEnergyHardpointLabel, gridBagConstraints);

        headBallisticHardpointLabel.setText("jLabel21");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        headPanel.add(headBallisticHardpointLabel, gridBagConstraints);

        headMissileHardpointLabel.setText("jLabel21");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        headPanel.add(headMissileHardpointLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        headPanel.add(headStructureProgressBar, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        headPanel.add(headArmorProgressBar, gridBagConstraints);

        headCriticalList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        headPanel.add(headCriticalList, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        mechPanel.add(headPanel, gridBagConstraints);

        centerTorsoPanel.setMaximumSize(new java.awt.Dimension(100, 256));
        centerTorsoPanel.setMinimumSize(new java.awt.Dimension(100, 256));
        centerTorsoPanel.setPreferredSize(new java.awt.Dimension(100, 256));
        centerTorsoPanel.setLayout(new java.awt.GridBagLayout());

        centerTorsoOmnipodComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        centerTorsoPanel.add(centerTorsoOmnipodComboBox, gridBagConstraints);

        centerTorsoAMSHardpointLabel.setText("jLabel21");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        centerTorsoPanel.add(centerTorsoAMSHardpointLabel, gridBagConstraints);

        centerTorsoECMHardpointLabel.setText("jLabel21");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        centerTorsoPanel.add(centerTorsoECMHardpointLabel, gridBagConstraints);

        centerTorsoEnergyHardpointLabel.setText("jLabel21");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        centerTorsoPanel.add(centerTorsoEnergyHardpointLabel, gridBagConstraints);

        centerTorsoBallisticHardpointLabel.setText("jLabel21");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        centerTorsoPanel.add(centerTorsoBallisticHardpointLabel, gridBagConstraints);

        centerTorsoMissileHardpointLabel.setText("jLabel21");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        centerTorsoPanel.add(centerTorsoMissileHardpointLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        centerTorsoPanel.add(centerTorsoStructureProgressBar, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        centerTorsoPanel.add(centerTorsoFrontArmorProgressBar, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        centerTorsoPanel.add(centerTorsoRearArmorProgressBar, gridBagConstraints);

        centerTorsoCriticalList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        centerTorsoPanel.add(centerTorsoCriticalList, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        mechPanel.add(centerTorsoPanel, gridBagConstraints);

        leftTorsoPanel.setMaximumSize(new java.awt.Dimension(100, 256));
        leftTorsoPanel.setMinimumSize(new java.awt.Dimension(100, 256));
        leftTorsoPanel.setPreferredSize(new java.awt.Dimension(100, 256));
        leftTorsoPanel.setLayout(new java.awt.GridBagLayout());

        leftTorsoOmnipodComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftTorsoPanel.add(leftTorsoOmnipodComboBox, gridBagConstraints);

        leftTorsoBallisticHardpointLabel.setText("jLabel21");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftTorsoPanel.add(leftTorsoBallisticHardpointLabel, gridBagConstraints);

        leftTorsoEnergyHardpointLabel.setText("jLabel21");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftTorsoPanel.add(leftTorsoEnergyHardpointLabel, gridBagConstraints);

        leftTorsoAMSHardpointLabel.setText("jLabel21");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftTorsoPanel.add(leftTorsoAMSHardpointLabel, gridBagConstraints);

        leftTorsoECMHardpointLabel.setText("jLabel21");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftTorsoPanel.add(leftTorsoECMHardpointLabel, gridBagConstraints);

        leftTorsoMissileHardpointLabel.setText("jLabel21");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftTorsoPanel.add(leftTorsoMissileHardpointLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftTorsoPanel.add(leftTorsoStructureProgressBar, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftTorsoPanel.add(leftTorsoFrontArmorProgressBar, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftTorsoPanel.add(leftTorsoRearArmorProgressBar, gridBagConstraints);

        leftTorsoCriticalList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftTorsoPanel.add(leftTorsoCriticalList, gridBagConstraints);

        leftTorsoCASEToggleButton.setText("CASE");
        leftTorsoCASEToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftTorsoCASEToggleButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftTorsoPanel.add(leftTorsoCASEToggleButton, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        mechPanel.add(leftTorsoPanel, gridBagConstraints);

        rightTorsoPanel.setMaximumSize(new java.awt.Dimension(100, 256));
        rightTorsoPanel.setMinimumSize(new java.awt.Dimension(100, 256));
        rightTorsoPanel.setPreferredSize(new java.awt.Dimension(100, 256));
        rightTorsoPanel.setLayout(new java.awt.GridBagLayout());

        rightTorsoOmnipodComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightTorsoPanel.add(rightTorsoOmnipodComboBox, gridBagConstraints);

        rightTorsoBallisticHardpointLabel.setText("jLabel21");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightTorsoPanel.add(rightTorsoBallisticHardpointLabel, gridBagConstraints);

        rightTorsoEnergyHardpointLabel.setText("jLabel21");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightTorsoPanel.add(rightTorsoEnergyHardpointLabel, gridBagConstraints);

        rightTorsoAMSHardpointLabel.setText("jLabel21");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightTorsoPanel.add(rightTorsoAMSHardpointLabel, gridBagConstraints);

        rightTorsoECMHardpointLabel.setText("jLabel21");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightTorsoPanel.add(rightTorsoECMHardpointLabel, gridBagConstraints);

        rightTorsoMissileHardpointLabel.setText("jLabel21");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightTorsoPanel.add(rightTorsoMissileHardpointLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightTorsoPanel.add(rightTorsoStructureProgressBar, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightTorsoPanel.add(rightTorsoFrontArmorProgressBar, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightTorsoPanel.add(rightTorsoRearArmorProgressBar, gridBagConstraints);

        rightTorsoCriticalList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightTorsoPanel.add(rightTorsoCriticalList, gridBagConstraints);

        rightTorsoCASEToggleButton.setText("CASE");
        rightTorsoCASEToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightTorsoCASEToggleButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightTorsoPanel.add(rightTorsoCASEToggleButton, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        mechPanel.add(rightTorsoPanel, gridBagConstraints);

        leftLegPanel.setMaximumSize(new java.awt.Dimension(100, 128));
        leftLegPanel.setMinimumSize(new java.awt.Dimension(100, 128));
        leftLegPanel.setPreferredSize(new java.awt.Dimension(100, 128));
        leftLegPanel.setLayout(new java.awt.GridBagLayout());

        leftLegOmnipodComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftLegPanel.add(leftLegOmnipodComboBox, gridBagConstraints);

        leftLegBallisticHardpointLabel.setText("jLabel21");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftLegPanel.add(leftLegBallisticHardpointLabel, gridBagConstraints);

        leftLegEnergyHardpointLabel.setText("jLabel21");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftLegPanel.add(leftLegEnergyHardpointLabel, gridBagConstraints);

        leftLegAMSHardpointLabel.setText("jLabel21");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftLegPanel.add(leftLegAMSHardpointLabel, gridBagConstraints);

        leftLegECMHardpointLabel.setText("jLabel21");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftLegPanel.add(leftLegECMHardpointLabel, gridBagConstraints);

        leftLegMissileHardpointLabel.setText("jLabel21");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftLegPanel.add(leftLegMissileHardpointLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftLegPanel.add(leftLegStructureProgressBar, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftLegPanel.add(leftLegArmorProgressBar, gridBagConstraints);

        leftLegCriticalList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftLegPanel.add(leftLegCriticalList, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        mechPanel.add(leftLegPanel, gridBagConstraints);

        rightLegPanel.setMaximumSize(new java.awt.Dimension(100, 128));
        rightLegPanel.setMinimumSize(new java.awt.Dimension(100, 128));
        rightLegPanel.setPreferredSize(new java.awt.Dimension(100, 128));
        rightLegPanel.setLayout(new java.awt.GridBagLayout());

        rightLegOmnipodComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightLegPanel.add(rightLegOmnipodComboBox, gridBagConstraints);

        rightLegBallisticHardpointLabel.setText("jLabel21");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightLegPanel.add(rightLegBallisticHardpointLabel, gridBagConstraints);

        rightLegEnergyHardpointLabel.setText("jLabel21");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightLegPanel.add(rightLegEnergyHardpointLabel, gridBagConstraints);

        rightLegAMSHardpointLabel.setText("jLabel21");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightLegPanel.add(rightLegAMSHardpointLabel, gridBagConstraints);

        rightLegECMHardpointLabel.setText("jLabel21");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightLegPanel.add(rightLegECMHardpointLabel, gridBagConstraints);

        rightLegMissileHardpointLabel.setText("jLabel21");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightLegPanel.add(rightLegMissileHardpointLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightLegPanel.add(rightLegStructureProgressBar, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightLegPanel.add(rightLegArmorProgressBar, gridBagConstraints);

        rightLegCriticalList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightLegPanel.add(rightLegCriticalList, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        mechPanel.add(rightLegPanel, gridBagConstraints);

        leftArmPanel.setMaximumSize(new java.awt.Dimension(100, 256));
        leftArmPanel.setMinimumSize(new java.awt.Dimension(100, 256));
        leftArmPanel.setPreferredSize(new java.awt.Dimension(100, 256));
        leftArmPanel.setLayout(new java.awt.GridBagLayout());

        leftArmOmnipodComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftArmPanel.add(leftArmOmnipodComboBox, gridBagConstraints);

        leftArmECMHardpointLabel.setText("jLabel21");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftArmPanel.add(leftArmECMHardpointLabel, gridBagConstraints);

        leftArmEnergyHardpointLabel.setText("jLabel21");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftArmPanel.add(leftArmEnergyHardpointLabel, gridBagConstraints);

        leftArmMissileHardpointLabel.setText("jLabel21");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftArmPanel.add(leftArmMissileHardpointLabel, gridBagConstraints);

        leftArmAMSHardpointLabel.setText("jLabel21");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftArmPanel.add(leftArmAMSHardpointLabel, gridBagConstraints);

        leftArmBallisticHardpointLabel.setText("jLabel21");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftArmPanel.add(leftArmBallisticHardpointLabel, gridBagConstraints);

        leftLowerArmToggleButton.setText("Lower Arm");
        leftLowerArmToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftLowerArmToggleButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftArmPanel.add(leftLowerArmToggleButton, gridBagConstraints);

        leftHandToggleButton.setText("Hand");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftArmPanel.add(leftHandToggleButton, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftArmPanel.add(leftArmStructureProgressBar, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftArmPanel.add(leftArmArmorProgressBar, gridBagConstraints);

        leftArmCriticalList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftArmPanel.add(leftArmCriticalList, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        mechPanel.add(leftArmPanel, gridBagConstraints);

        rightArmPanel.setMaximumSize(new java.awt.Dimension(100, 256));
        rightArmPanel.setMinimumSize(new java.awt.Dimension(100, 256));
        rightArmPanel.setPreferredSize(new java.awt.Dimension(100, 256));
        rightArmPanel.setLayout(new java.awt.GridBagLayout());

        rightArmOmnipodComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightArmPanel.add(rightArmOmnipodComboBox, gridBagConstraints);

        rightArmECMHardpointLabel.setText("jLabel21");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightArmPanel.add(rightArmECMHardpointLabel, gridBagConstraints);

        rightArmEnergyHardpointLabel.setText("jLabel21");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightArmPanel.add(rightArmEnergyHardpointLabel, gridBagConstraints);

        rightArmMissileHardpointLabel.setText("jLabel21");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightArmPanel.add(rightArmMissileHardpointLabel, gridBagConstraints);

        rightArmAMSHardpointLabel.setText("jLabel21");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightArmPanel.add(rightArmAMSHardpointLabel, gridBagConstraints);

        rightArmBallisticHardpointLabel.setText("jLabel21");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightArmPanel.add(rightArmBallisticHardpointLabel, gridBagConstraints);

        rightLowerArmToggleButton.setText("Lower Arm");
        rightLowerArmToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightLowerArmToggleButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightArmPanel.add(rightLowerArmToggleButton, gridBagConstraints);

        rightHandToggleButton.setText("Hand");
        rightHandToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightHandToggleButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightArmPanel.add(rightHandToggleButton, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightArmPanel.add(rightArmStructureProgressBar, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightArmPanel.add(rightArmArmorProgressBar, gridBagConstraints);

        rightArmCriticalList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightArmPanel.add(rightArmCriticalList, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        mechPanel.add(rightArmPanel, gridBagConstraints);

        special1Panel.setPreferredSize(new java.awt.Dimension(100, 128));
        special1Panel.setLayout(new java.awt.GridBagLayout());

        section1OmnipodComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        special1Panel.add(section1OmnipodComboBox, gridBagConstraints);

        section1AMSHardpointLabel.setText("jLabel21");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        special1Panel.add(section1AMSHardpointLabel, gridBagConstraints);

        section1ECMHardpointLabel.setText("jLabel21");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        special1Panel.add(section1ECMHardpointLabel, gridBagConstraints);

        section1EnergyHardpointLabel.setText("jLabel21");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        special1Panel.add(section1EnergyHardpointLabel, gridBagConstraints);

        section1BallisticHardpointLabel.setText("jLabel21");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        special1Panel.add(section1BallisticHardpointLabel, gridBagConstraints);

        section1MissileHardpointLabel.setText("jLabel21");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        special1Panel.add(section1MissileHardpointLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        special1Panel.add(section1StructureProgressBar, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        special1Panel.add(section1ArmorProgressBar, gridBagConstraints);

        section1CriticalList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        special1Panel.add(section1CriticalList, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        mechPanel.add(special1Panel, gridBagConstraints);

        special2Panel.setPreferredSize(new java.awt.Dimension(100, 128));
        special2Panel.setLayout(new java.awt.GridBagLayout());

        section2OmnipodComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        special2Panel.add(section2OmnipodComboBox, gridBagConstraints);

        section2AMSHardpointLabel.setText("jLabel21");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        special2Panel.add(section2AMSHardpointLabel, gridBagConstraints);

        section2ECMHardpointLabel.setText("jLabel21");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        special2Panel.add(section2ECMHardpointLabel, gridBagConstraints);

        section2EnergyHardpointLabel.setText("jLabel21");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        special2Panel.add(section2EnergyHardpointLabel, gridBagConstraints);

        section2BallisticHardpointLabel.setText("jLabel21");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        special2Panel.add(section2BallisticHardpointLabel, gridBagConstraints);

        section2MissileHardpointLabel.setText("jLabel21");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        special2Panel.add(section2MissileHardpointLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        special2Panel.add(section2StructureProgressBar, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        special2Panel.add(section2ArmorProgressBar, gridBagConstraints);

        section2CriticalList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        special2Panel.add(section2CriticalList, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        mechPanel.add(special2Panel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(mechPanel, gridBagConstraints);

        secondaryTabbedPane.setMaximumSize(new java.awt.Dimension(256, 470));
        secondaryTabbedPane.setMinimumSize(new java.awt.Dimension(256, 470));
        secondaryTabbedPane.setPreferredSize(new java.awt.Dimension(256, 512));

        quirksPanel.setLayout(new java.awt.GridBagLayout());

        quirksJTextArea.setEditable(false);
        quirksJTextArea.setColumns(20);
        quirksJTextArea.setRows(5);
        quirksJScrollPane.setViewportView(quirksJTextArea);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        quirksPanel.add(quirksJScrollPane, gridBagConstraints);

        secondaryTabbedPane.addTab("Quirks", quirksPanel);

        componentsPanel.setLayout(new java.awt.GridBagLayout());
        componentsScrollPane.setViewportView(componentsPanel);

        secondaryTabbedPane.addTab("Components", componentsScrollPane);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(secondaryTabbedPane, gridBagConstraints);

        InformationTabbedPane.setMaximumSize(new java.awt.Dimension(1024, 230));
        InformationTabbedPane.setMinimumSize(new java.awt.Dimension(1024, 230));
        InformationTabbedPane.setPreferredSize(new java.awt.Dimension(1024, 230));

        ModelOverviewPanel.setLayout(new java.awt.GridBagLayout());

        descriptionScrollPane.setMaximumSize(new java.awt.Dimension(295, 100));
        descriptionScrollPane.setMinimumSize(new java.awt.Dimension(295, 100));
        descriptionScrollPane.setPreferredSize(new java.awt.Dimension(295, 100));

        descriptionTextArea.setColumns(20);
        descriptionTextArea.setRows(5);
        descriptionScrollPane.setViewportView(descriptionTextArea);

        ModelOverviewPanel.add(descriptionScrollPane, new java.awt.GridBagConstraints());
        ModelOverviewPanel.add(overviewComponentPanel, new java.awt.GridBagConstraints());
        ModelOverviewPanel.add(hardpointComponentPanel, new java.awt.GridBagConstraints());

        InformationTabbedPane.addTab("Model Overview", ModelOverviewPanel);

        ModelSpecificationsPanel.setLayout(new java.awt.GridBagLayout());
        ModelSpecificationsPanel.add(speedComponentPanel, new java.awt.GridBagConstraints());
        ModelSpecificationsPanel.add(manueverabilityComponentPanel, new java.awt.GridBagConstraints());
        ModelSpecificationsPanel.add(movementRangeComponentPanel, new java.awt.GridBagConstraints());
        ModelSpecificationsPanel.add(movementSpeedComponentPanel, new java.awt.GridBagConstraints());

        InformationTabbedPane.addTab("Model Specifications", ModelSpecificationsPanel);

        InformationSpecificationsPanel.setLayout(new java.awt.GridBagLayout());
        InformationTabbedPane.addTab("Sensors/Targetting Specifications", InformationSpecificationsPanel);

        EquipmentSpecificationsPanel.setLayout(new java.awt.GridBagLayout());
        InformationTabbedPane.addTab("Equipment Specifications", EquipmentSpecificationsPanel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(InformationTabbedPane, gridBagConstraints);

        OptionsPanel.setMaximumSize(new java.awt.Dimension(256, 256));
        OptionsPanel.setMinimumSize(new java.awt.Dimension(256, 256));
        OptionsPanel.setPreferredSize(new java.awt.Dimension(256, 256));
        OptionsPanel.setLayout(new java.awt.GridBagLayout());

        FeaturesPanel.setMaximumSize(new java.awt.Dimension(256, 230));
        FeaturesPanel.setMinimumSize(new java.awt.Dimension(256, 230));
        FeaturesPanel.setPreferredSize(new java.awt.Dimension(256, 230));
        FeaturesPanel.setLayout(new java.awt.GridBagLayout());

        FrankenmechToggle.setText("Frankenmechs");
        FrankenmechToggle.setEnabled(false);
        FrankenmechToggle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        FrankenmechToggle.setPreferredSize(new java.awt.Dimension(0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 15, 15);
        FeaturesPanel.add(FrankenmechToggle, gridBagConstraints);

        MixtechToggle.setText("Mixtech");
        MixtechToggle.setEnabled(false);
        MixtechToggle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MixtechToggle.setPreferredSize(new java.awt.Dimension(0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 15, 15);
        FeaturesPanel.add(MixtechToggle, gridBagConstraints);

        FuturetechToggle.setText("Futuretech");
        FuturetechToggle.setEnabled(false);
        FuturetechToggle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        FuturetechToggle.setPreferredSize(new java.awt.Dimension(0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 15, 15);
        FeaturesPanel.add(FuturetechToggle, gridBagConstraints);

        OmniRestrictionsToggle.setText("Omni Restrictions");
        OmniRestrictionsToggle.setEnabled(false);
        OmniRestrictionsToggle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        OmniRestrictionsToggle.setPreferredSize(new java.awt.Dimension(0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 15, 15);
        FeaturesPanel.add(OmniRestrictionsToggle, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        OptionsPanel.add(FeaturesPanel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(OptionsPanel, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void chassisComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chassisComboBoxActionPerformed
        ChassisBlueprint chassis = (ChassisBlueprint)chassisComboBox.getSelectedItem();

        selectedDatabase.MODEL_BLUEPRINTS.clear();

        masterDatabase.MODEL_BLUEPRINTS.stream().
                filter((model) -> (model.chassisName.equals(chassis.name))).
                forEach((model) -> {
                    selectedDatabase.MODEL_BLUEPRINTS.add(model);
        });

        modelComboBox.setModel(new DefaultComboBoxModel(selectedDatabase.MODEL_BLUEPRINTS.toArray()));
        modelComboBox.setSelectedIndex(0);
    }//GEN-LAST:event_chassisComboBoxActionPerformed

    private void modelComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelComboBoxActionPerformed
        ChassisBlueprint chassis = (ChassisBlueprint)chassisComboBox.getSelectedItem();
        ModelBlueprint model = (ModelBlueprint)modelComboBox.getSelectedItem();

        User.variant = new Variant();
        User.variant.SetMech(selectedDatabase, chassis, model);

        techBaseLabel.setText(User.variant.chassisType.techBase.toString());
        mechTypeLabel.setText(User.variant.chassisType.mechType.toString());
        unreleasedLabel.setText(User.variant.modelType.isUnreleased ? "UNRELEASED" : "RELEASED");
        unconfirmedLabel.setText(User.variant.modelType.isUnconfirmed ? "UNCONFIRMED" : "CONFIRMED");
        unreleasedLabel.setBackground(User.variant.modelType.isUnreleased ? Color.RED : Color.GREEN);
        unconfirmedLabel.setBackground(User.variant.modelType.isUnconfirmed ? Color.RED : Color.GREEN);

        overviewComponentPanel.Set_Overview(User.variant.chassisType, User.variant.modelType);
        hardpointComponentPanel.Set_Total_Hardpoints(0, 0, 0, 0);
        speedComponentPanel.Set_Speed_Limits(User.variant.chassisType, User.variant.modelType, 16.2, 1.0);
        manueverabilityComponentPanel.Set_Manueverability(User.variant.chassisType, User.variant.modelType, User.variant.currentJumpJets);
        movementRangeComponentPanel.Set_Movement_Range(User.variant.chassisType, User.variant.modelType);
        movementSpeedComponentPanel.Set_Movement_Speed(User.variant.chassisType, User.variant.modelType);

        selectedDatabase = null;
        selectedDatabase = new Database(masterDatabase, getDatabaseFilter(User.variant.chassisType.techBase, User.mixtech_enabled, User.futuretech_enabled));

        SetSectionOmnipods(rightArmOmnipodComboBox, SectionType.RIGHT_ARM.index);
        SetSectionOmnipods(leftArmOmnipodComboBox, SectionType.LEFT_ARM.index);
        SetSectionOmnipods(rightTorsoOmnipodComboBox, SectionType.RIGHT_TORSO.index);
        SetSectionOmnipods(leftTorsoOmnipodComboBox, SectionType.LEFT_TORSO.index);
        SetSectionOmnipods(centerTorsoOmnipodComboBox, SectionType.CENTER_TORSO.index);
        SetSectionOmnipods(headOmnipodComboBox, SectionType.HEAD.index);
        SetSectionOmnipods(rightLegOmnipodComboBox, SectionType.RIGHT_LEG.index);
        SetSectionOmnipods(leftLegOmnipodComboBox, SectionType.LEFT_LEG.index);
        
        Map<String, Double> quirks = new HashMap<>();
        
        for (SectionBlueprint sectionBlueprint : User.variant.sectionTypes.values()) {
            for (String key : sectionBlueprint.quirks.keySet()) {
                if (quirks.containsKey(key)) {
                    quirks.compute(key, (givenKey, value) -> value + sectionBlueprint.quirks.get(givenKey));
                } else {
                    quirks.put(key, sectionBlueprint.quirks.get(key));
                }
            }
        }
        
        quirksJTextArea.setText("");
        
        for (Map.Entry<String, Double> quirk : quirks.entrySet()) {
            quirksJTextArea.append(String.format("%s: %.2f\n", quirk.getKey(), quirk.getValue()));
        }

        engineComboBox.setModel(new DefaultComboBoxModel(selectedDatabase.ENGINE_BLUEPRINTS.toArray()));
        armorComboBox.setModel(new DefaultComboBoxModel(selectedDatabase.ARMOR_BLUEPRINTS.toArray()));
        structureComboBox.setModel(new DefaultComboBoxModel(selectedDatabase.ENGINE_BLUEPRINTS.toArray()));
        myomerComboBox.setModel(new DefaultComboBoxModel(selectedDatabase.MYOMER_BLUEPRINTS.toArray()));
        heatSinkComboBox.setModel(new DefaultComboBoxModel(selectedDatabase.HEAT_SINK_BLUEPRINTS.toArray()));
        jumpJetComboBox.setModel(new DefaultComboBoxModel(selectedDatabase.JUMP_JET_BLUEPRINTS.toArray()));
        gyroComboBox.setModel(new DefaultComboBoxModel(selectedDatabase.GYRO_BLUEPRINTS.toArray()));
        cockpitComboBox.setModel(new DefaultComboBoxModel(selectedDatabase.COCKPIT_BLUEPRINTS.toArray()));

        updateCriticalPanelVisibility();

        engineRatingSpinnerModel.setMinimum(User.variant.modelType.minEngineRating);
        engineRatingSpinnerModel.setMaximum(User.variant.modelType.maxEngineRating);
        engineRatingSpinnerModel.setValue(User.variant.modelType.engineRating);

        tonnageProgressBar.setMinimum(0);
        tonnageProgressBar.setMaximum((int)User.variant.chassisType.tonnage);
        tonnageProgressBar.setValue((int)User.variant.currentTonnage);
        tonnageProgressBar.setString(String.format("%.2f tons", User.variant.currentTonnage));

        speedProgressBar.setMinimum(0);
        speedProgressBar.setMaximum(100);
        speedProgressBar.setValue((int)(User.variant.currentEngineRating * 100.0 / User.variant.modelType.maxEngineRating));
        speedProgressBar.setString(String.format("%.2f kph", 0.0));//User.variant.engine.Get_Speed(User.variant.chassisType.tonnage, User.variant.currentEngineRating)));

        jumpDistanceProgressBar.setMinimum(0);
        jumpDistanceProgressBar.setMaximum(User.variant.maximumJumpJets);
        jumpDistanceProgressBar.setValue(User.variant.currentJumpJets);
        jumpDistanceProgressBar.setString(String.format("%.2fm", 0.0));

        jumpHeightProgressBar.setMinimum(0);
        jumpHeightProgressBar.setMaximum(User.variant.maximumJumpJets);
        jumpHeightProgressBar.setValue(User.variant.currentJumpJets);
        jumpHeightProgressBar.setString(String.format("%.2fm", 0.0));

        criticalsProgressBar.setMinimum(0);
        criticalsProgressBar.setMaximum(78);
        criticalsProgressBar.setValue(User.variant.currentCriticals);
        criticalsProgressBar.setString(String.format("%d/78", User.variant.currentCriticals));

        //engineComponentPanel.Set_Engine(User.variant.engine, User.variant.currentEngineRating);
        //gyroComponentPanel.Set_Gyro(User.variant.gyro, User.variant.currentEngineRating);
        //armorComponentPanel.Set_Armor(User.variant.armor, User.variant.GetCurrentArmorTotal());
        //structureComponentPanel.Set_Structure(User.variant.structure, User.variant.currentTonnage);
        //heatSinksComponentPanel.Set_Heatsinks(User.variant.heatsinks, User.variant.currentHeatSinkCount, User.variant.currentEngineRating);
        //jumpJetsComponentPanel.Set_Jumpjets(User.variant.jumpjets, User.variant.currentJumpJets, User.variant.currentTonnage);
        //cockpitComponentPanel.Set_Cockpit(User.variant.cockpit);
        //myomerComponentPanel.Set_Myomer(User.variant.myomer);
    }//GEN-LAST:event_modelComboBoxActionPerformed

    private void MechTabPaneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_MechTabPaneStateChanged
        this.updateCriticalPanelVisibility();
    }//GEN-LAST:event_MechTabPaneStateChanged

    private void leftTorsoCASEToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftTorsoCASEToggleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_leftTorsoCASEToggleButtonActionPerformed

    private void rightTorsoCASEToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightTorsoCASEToggleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rightTorsoCASEToggleButtonActionPerformed

    private void leftLowerArmToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftLowerArmToggleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_leftLowerArmToggleButtonActionPerformed

    private void rightLowerArmToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightLowerArmToggleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rightLowerArmToggleButtonActionPerformed

    private void rightHandToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightHandToggleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rightHandToggleButtonActionPerformed

    private void updateCriticalPanelVisibility() {
        this.UpdateHardpointLabels(this.rightArmAMSHardpointLabel, this.rightArmECMHardpointLabel, this.rightArmBallisticHardpointLabel, this.rightArmEnergyHardpointLabel, this.rightArmMissileHardpointLabel, 0);
        this.UpdateHardpointLabels(this.leftArmAMSHardpointLabel, this.leftArmECMHardpointLabel, this.leftArmBallisticHardpointLabel, this.leftArmEnergyHardpointLabel, this.leftArmMissileHardpointLabel, 1);
        this.UpdateHardpointLabels(this.rightLegAMSHardpointLabel, this.rightLegECMHardpointLabel, this.rightLegBallisticHardpointLabel, this.rightLegEnergyHardpointLabel, this.rightLegMissileHardpointLabel, 6);
        this.UpdateHardpointLabels(this.leftLegAMSHardpointLabel, this.leftLegECMHardpointLabel, this.leftLegBallisticHardpointLabel, this.leftLegEnergyHardpointLabel, this.leftLegMissileHardpointLabel, 7);
        this.UpdateHardpointLabels(this.rightTorsoAMSHardpointLabel, this.rightTorsoECMHardpointLabel, this.rightTorsoBallisticHardpointLabel, this.rightTorsoEnergyHardpointLabel, this.rightTorsoMissileHardpointLabel, 2);
        this.UpdateHardpointLabels(this.leftTorsoAMSHardpointLabel, this.leftTorsoECMHardpointLabel, this.leftTorsoBallisticHardpointLabel, this.leftTorsoEnergyHardpointLabel, this.leftTorsoMissileHardpointLabel, 3);
        this.UpdateHardpointLabels(this.centerTorsoAMSHardpointLabel, this.centerTorsoECMHardpointLabel, this.centerTorsoBallisticHardpointLabel, this.centerTorsoEnergyHardpointLabel, this.centerTorsoMissileHardpointLabel, 4);
        this.UpdateHardpointLabels(this.headAMSHardpointLabel, this.headECMHardpointLabel, this.headBallisticHardpointLabel, this.headEnergyHardpointLabel, this.headMissileHardpointLabel, 5);
        this.UpdateArmorLabelVisibility(this.rightArmArmorProgressBar, null, this.rightArmStructureProgressBar);
        this.UpdateArmorLabelVisibility(this.leftArmArmorProgressBar, null, this.leftArmStructureProgressBar);
        this.UpdateArmorLabelVisibility(this.rightLegArmorProgressBar, null, this.rightLegStructureProgressBar);
        this.UpdateArmorLabelVisibility(this.leftLegArmorProgressBar, null, this.leftLegStructureProgressBar);
        this.UpdateArmorLabelVisibility(this.rightTorsoFrontArmorProgressBar, this.rightTorsoRearArmorProgressBar, this.rightTorsoStructureProgressBar);
        this.UpdateArmorLabelVisibility(this.leftTorsoFrontArmorProgressBar, this.leftTorsoRearArmorProgressBar, this.leftTorsoStructureProgressBar);
        this.UpdateArmorLabelVisibility(this.centerTorsoFrontArmorProgressBar, this.centerTorsoRearArmorProgressBar, this.centerTorsoStructureProgressBar);
        this.UpdateArmorLabelVisibility(this.headArmorProgressBar, null, this.headStructureProgressBar);
        this.UpdateCriticalItemVisibility(this.rightArmCriticalList, this.rightLowerArmToggleButton, this.rightHandToggleButton, null, 0);
        this.UpdateCriticalItemVisibility(this.leftArmCriticalList, this.leftLowerArmToggleButton, this.leftHandToggleButton, null, 1);
        this.UpdateCriticalItemVisibility(this.rightLegCriticalList, null, null, null, 6);
        this.UpdateCriticalItemVisibility(this.leftLegCriticalList, null, null, null, 7);
        this.UpdateCriticalItemVisibility(this.rightTorsoCriticalList, null, null, this.rightTorsoCASEToggleButton, 2);
        this.UpdateCriticalItemVisibility(this.leftTorsoCriticalList, null, null, this.leftTorsoCASEToggleButton, 3);
        this.UpdateCriticalItemVisibility(this.centerTorsoCriticalList, null, null, null, 4);
        this.UpdateCriticalItemVisibility(this.headCriticalList, null, null, null, 5);
        this.UpdateSectionOmnipodVisibility();
    }

    private void SetSectionOmnipods(JComboBox jComboBox, int sectionIndex) {
        jComboBox.removeAllItems();
        
        for (SectionBlueprint sectionBlueprint : selectedDatabase.SECTION_BLUEPRINTS) {
            jComboBox.addItem(sectionBlueprint);
            
            if (!sectionBlueprint.name.equals(User.variant.modelType.sectionModels.get(sectionBlueprint.section)))
                continue;
            
            jComboBox.setSelectedItem(sectionBlueprint);
        }
        
        if (sectionIndex == SectionType.CENTER_TORSO.index)
            jComboBox.setEnabled(false);
        else
            jComboBox.setEnabled(User.variant.chassisType.mechType.equals(MechType.OMNIMECH) || User.frankenmechs_enabled);
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
        this.rightArmOmnipodComboBox.setVisible(bl);
        this.leftArmOmnipodComboBox.setVisible(bl);
        this.rightTorsoOmnipodComboBox.setVisible(bl);
        this.leftTorsoOmnipodComboBox.setVisible(bl);
        this.centerTorsoOmnipodComboBox.setVisible(bl);
        this.headOmnipodComboBox.setVisible(bl);
        this.rightLegOmnipodComboBox.setVisible(bl);
        this.leftLegOmnipodComboBox.setVisible(bl);
    }

    private void SetCriticalItems(JList jList, JToggleButton jToggleButton, JToggleButton jToggleButton2, JToggleButton jToggleButton3, int n) {
//        jList.setVisibleRowCount(User.variant.sections[n].maximumCriticals);
//        jList.setMinimumSize(new Dimension(90, User.variant.sections[n].maximumCriticals * 12));
//        if (jToggleButton != null) {
//            jToggleButton.setEnabled(User.variant.chassisType.equals(MechType.OMNIMECH) && User.variant.sectionTypes[n].maximumActuatorCount > 2);
//            jToggleButton.setSelected(false);
//        }
//        if (jToggleButton2 != null) {
//            jToggleButton2.setEnabled(User.variant.chassisType.equals(MechType.OMNIMECH) && User.variant.sectionTypes[n].maximumActuatorCount > 3);
//            jToggleButton2.setSelected(false);
//        }
//        if (jToggleButton3 != null) {
//            jToggleButton3.setEnabled(User.variant.chassisType.techBase.equals("IS"));
//            jToggleButton3.setSelected(false);
//        }
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
        this.rightArmPanel.setBackground(User.preferences.DEFAULT_CRITICAL_PANEL_COLOR);
        this.leftArmPanel.setBackground(User.preferences.DEFAULT_CRITICAL_PANEL_COLOR);
        this.rightLegPanel.setBackground(User.preferences.DEFAULT_CRITICAL_PANEL_COLOR);
        this.leftLegPanel.setBackground(User.preferences.DEFAULT_CRITICAL_PANEL_COLOR);
        this.rightTorsoPanel.setBackground(User.preferences.DEFAULT_CRITICAL_PANEL_COLOR);
        this.leftTorsoPanel.setBackground(User.preferences.DEFAULT_CRITICAL_PANEL_COLOR);
        this.centerTorsoPanel.setBackground(User.preferences.DEFAULT_CRITICAL_PANEL_COLOR);
        this.headPanel.setBackground(User.preferences.DEFAULT_CRITICAL_PANEL_COLOR);
        this.rightArmPanel.setOpaque(false);
        this.leftArmPanel.setOpaque(false);
        this.rightLegPanel.setOpaque(false);
        this.leftLegPanel.setOpaque(false);
        this.rightTorsoPanel.setOpaque(false);
        this.leftTorsoPanel.setOpaque(false);
        this.centerTorsoPanel.setOpaque(false);
        this.headPanel.setOpaque(false);
        switch (n) {
            case 0: {
                this.rightArmPanel.setBackground(User.preferences.SELECTED_CRITICAL_PANEL_COLOR);
                this.rightArmPanel.setOpaque(true);
                break;
            }
            case 1: {
                this.leftArmPanel.setBackground(User.preferences.SELECTED_CRITICAL_PANEL_COLOR);
                this.leftArmPanel.setOpaque(true);
                break;
            }
            case 6: {
                this.rightLegPanel.setBackground(User.preferences.SELECTED_CRITICAL_PANEL_COLOR);
                this.rightLegPanel.setOpaque(true);
                break;
            }
            case 7: {
                this.leftLegPanel.setBackground(User.preferences.SELECTED_CRITICAL_PANEL_COLOR);
                this.leftLegPanel.setOpaque(true);
                break;
            }
            case 2: {
                this.rightTorsoPanel.setBackground(User.preferences.SELECTED_CRITICAL_PANEL_COLOR);
                this.rightTorsoPanel.setOpaque(true);
                break;
            }
            case 3: {
                this.leftTorsoPanel.setBackground(User.preferences.SELECTED_CRITICAL_PANEL_COLOR);
                this.leftTorsoPanel.setOpaque(true);
                break;
            }
            case 4: {
                this.centerTorsoPanel.setBackground(User.preferences.SELECTED_CRITICAL_PANEL_COLOR);
                this.centerTorsoPanel.setOpaque(true);
                break;
            }
            case 5: {
                this.headPanel.setBackground(User.preferences.SELECTED_CRITICAL_PANEL_COLOR);
                this.headPanel.setOpaque(true);
            }
        }
    }

    private void UpdateArmorLabelVisibility(JProgressBar frontArmorProgressBar, JProgressBar rearArmorProgressBar, JProgressBar structureProgressBar) {
        boolean temp;
        switch (this.MechTabPane.getSelectedIndex()) {
            case 3:
                temp = true;
                break;
            default:
                temp = false;
                break;
        }
        
        if (rearArmorProgressBar != null)
            rearArmorProgressBar.setVisible(temp);
        
        frontArmorProgressBar.setVisible(temp);
        structureProgressBar.setVisible(temp);
    }

    private void UpdateArmorLabels(JProgressBar jProgressBar, JProgressBar jProgressBar2, JProgressBar jProgressBar3, int n) {
        jProgressBar.setMaximum(User.variant.sections[n].maximumArmor);
        jProgressBar.setValue(User.variant.sections[n].frontArmor);
        jProgressBar.setString("" + User.variant.sections[n].frontArmor);
        jProgressBar3.setMaximum(User.variant.sections[n].health);
        jProgressBar3.setValue(User.variant.sections[n].health);
        jProgressBar3.setString("" + User.variant.sections[n].health);
        if (jProgressBar2 != null) {
            jProgressBar2.setMaximum(User.variant.sections[n].maximumArmor);
            jProgressBar2.setValue(User.variant.sections[n].rearArmor);
            jProgressBar2.setString("" + User.variant.sections[n].rearArmor);
        }
    }

    private void UpdateHardpointLabels(JLabel jLabel, JLabel jLabel2, JLabel jLabel3, JLabel jLabel4, JLabel jLabel5, int n) {
//        boolean bl;
//        switch (this.MechTabPane.getSelectedIndex()) {
//            case 0: {
//                bl = true;
//                jLabel.setText(String.format("%d %s", User.variant.sections[n].maximum_hardpoints[3], HardpointType.values()[3]));
//                jLabel2.setText(String.format("%d %s", User.variant.sections[n].maximum_hardpoints[4], HardpointType.values()[4]));
//                jLabel3.setText(String.format("%d %s", User.variant.sections[n].maximum_hardpoints[0], HardpointType.values()[0]));
//                jLabel4.setText(String.format("%d %s", User.variant.sections[n].maximum_hardpoints[1], HardpointType.values()[1]));
//                jLabel5.setText(String.format("%d %s", User.variant.sections[n].maximum_hardpoints[2], HardpointType.values()[2]));
//                break;
//            }
//            case 1:
//            case 2: {
//                bl = true;
//                jLabel.setText(String.format("%d/%d %s", User.variant.sections[n].current_hardpoints[3], User.variant.sections[n].maximum_hardpoints[3], HardpointType.values()[3]));
//                jLabel2.setText(String.format("%d/%d %s", User.variant.sections[n].current_hardpoints[4], User.variant.sections[n].maximum_hardpoints[4], HardpointType.values()[4]));
//                jLabel3.setText(String.format("%d/%d %s", User.variant.sections[n].current_hardpoints[0], User.variant.sections[n].maximum_hardpoints[0], HardpointType.values()[0]));
//                jLabel4.setText(String.format("%d/%d %s", User.variant.sections[n].current_hardpoints[1], User.variant.sections[n].maximum_hardpoints[1], HardpointType.values()[1]));
//                jLabel5.setText(String.format("%d/%d %s", User.variant.sections[n].current_hardpoints[2], User.variant.sections[n].maximum_hardpoints[2], HardpointType.values()[2]));
//                break;
//            }
//            default: {
//                bl = false;
//            }
//        }
//        jLabel3.setVisible(bl && User.variant.sections[n].maximum_hardpoints[0] > 0);
//        jLabel4.setVisible(bl && User.variant.sections[n].maximum_hardpoints[1] > 0);
//        jLabel5.setVisible(bl && User.variant.sections[n].maximum_hardpoints[2] > 0);
//        jLabel.setVisible(bl && User.variant.sections[n].maximum_hardpoints[3] > 0);
//        jLabel2.setVisible(bl && User.variant.sections[n].maximum_hardpoints[4] > 0);
    }

    private void UpdateHardpoints() {
        this.UpdateHardpointLabels(this.rightArmAMSHardpointLabel, this.rightArmECMHardpointLabel, this.rightArmBallisticHardpointLabel, this.rightArmEnergyHardpointLabel, this.rightArmMissileHardpointLabel, 0);
        this.UpdateHardpointLabels(this.leftArmAMSHardpointLabel, this.leftArmECMHardpointLabel, this.leftArmBallisticHardpointLabel, this.leftArmEnergyHardpointLabel, this.leftArmMissileHardpointLabel, 1);
        this.UpdateHardpointLabels(this.rightLegAMSHardpointLabel, this.rightLegECMHardpointLabel, this.rightLegBallisticHardpointLabel, this.rightLegEnergyHardpointLabel, this.rightLegMissileHardpointLabel, 6);
        this.UpdateHardpointLabels(this.leftLegAMSHardpointLabel, this.leftLegECMHardpointLabel, this.leftLegBallisticHardpointLabel, this.leftLegEnergyHardpointLabel, this.leftLegMissileHardpointLabel, 7);
        this.UpdateHardpointLabels(this.rightTorsoAMSHardpointLabel, this.rightTorsoECMHardpointLabel, this.rightTorsoBallisticHardpointLabel, this.rightTorsoEnergyHardpointLabel, this.rightTorsoMissileHardpointLabel, 2);
        this.UpdateHardpointLabels(this.leftTorsoAMSHardpointLabel, this.leftTorsoECMHardpointLabel, this.leftTorsoBallisticHardpointLabel, this.leftTorsoEnergyHardpointLabel, this.leftTorsoMissileHardpointLabel, 3);
        this.UpdateHardpointLabels(this.centerTorsoAMSHardpointLabel, this.centerTorsoECMHardpointLabel, this.centerTorsoBallisticHardpointLabel, this.centerTorsoEnergyHardpointLabel, this.centerTorsoMissileHardpointLabel, 4);
        this.UpdateHardpointLabels(this.headAMSHardpointLabel, this.headECMHardpointLabel, this.headBallisticHardpointLabel, this.headEnergyHardpointLabel, this.headMissileHardpointLabel, 5);
        this.UpdateTotalHardpoints();
    }

    private void UpdateTotalHardpoints() {
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        User.variant.UpdateMech();
//        for (SectionBlueprint sectionBlueprint : User.variant.section_types) {
//            if (sectionBlueprint == null) continue;
//            n += sectionBlueprint.hardpoints[0];
//            n2 += sectionBlueprint.hardpoints[1];
//            n3 += sectionBlueprint.hardpoints[2];
//            n4 += sectionBlueprint.hardpoints[3];
//            n5 += sectionBlueprint.hardpoints[4];
//        }
        //this.hardpointComponentPanel.Set_Total_Hardpoints(n, n2, n3, n4);
        this.ecmCapableLabel.setVisible(n5 > 0);
        this.jumpCapableLabel.setVisible(User.variant.maximumJumpJets > 0);
        this.jumpDistanceProgressBar.setMaximum(User.variant.maximumJumpJets);
        this.jumpHeightProgressBar.setMaximum(User.variant.maximumJumpJets);
    }

    private void UpdateEngine() {
        if (User.variant.engine == null) {
            return;
        }
        //User.variant.currentEngineRating = (Integer) this.engineRatingSpinner.getValue();
        this.speedProgressBar.setValue(User.variant.currentEngineRating);
        this.speedProgressBar.setString(String.format("%.1f kph", User.variant.engine.Get_Speed(User.variant.chassisType.tonnage, User.variant.currentEngineRating)));
        //this.enginePanel.Set_Engine(User.variant.engine, User.variant.currentEngineRating);
    }

    private void UpdateHeatsinks() {
        int n = User.variant.engine.Get_Heat_Sink_Capacity(User.variant.currentEngineRating);
        for (Section section : User.variant.sections) {
            for (int j = section.components.size() - 1; j >= 0; --j) {
                if (!section.components.get(j).itemType.equals("Heat Sink")) continue;
                if (n >= User.variant.currentHeatSinkCount) {
                    section.components.remove(j);
                    continue;
                }
                ++n;
            }
        }
        n = User.variant.currentHeatSinkCount - n;
        //this.heatSinkComponentPanel.Set_Heatsinks(User.variant.heatsinks, User.variant.currentEngineRating, User.variant.currentHeatSinkCount);
    }

    private void UpdateJumpjets() {
        /*this.JumpJetSpinner.setEnabled(User.variant.maximumJumpJets > 0);
        User.variant.currentJumpJets = (Integer) this.JumpJetSpinner.getValue();
        if (User.variant.currentJumpJets > User.variant.maximumJumpJets) {
            User.variant.currentJumpJets = User.variant.maximumJumpJets;
            this.JumpJetSpinnerModel.setValue(User.variant.currentJumpJets);
        }
        this.JumpJetSpinnerModel.setMaximum(Integer.valueOf(User.variant.maximumJumpJets));
        int n = 0;
        for (int i = queued_items.size() - 1; i >= 0; --i) {
            if (!((Crittable) queued_items.get((int) i)).itemType.equals("Jump Jet")) continue;
            if (n >= User.variant.currentJumpJets) {
                queued_items.remove(i);
                continue;
            }
            ++n;
        }
        for (Section section : User.variant.sections) {
            for (int j = section.components.size() - 1; j >= 0; --j) {
                if (!section.components.get(j).itemType.equals("Jump Jet")) continue;
                if (n >= User.variant.currentJumpJets) {
                    section.components.remove(j);
                    continue;
                }
                ++n;
            }
        }*/
        this.jumpDistanceProgressBar.setValue(User.variant.currentJumpJets);
        this.jumpHeightProgressBar.setValue(User.variant.currentJumpJets);
        //this.jumpjetComponentPanel.Set_Jumpjets(User.variant.jumpjets, User.variant.currentJumpJets, User.variant.chassisType.tonnage);
        //this.manueverabilityComponentPanel.Set_Manueverability(User.variant.chassisType, User.variant.modelType, User.variant.maximumJumpJets);
    }

    private void UpdateArmor() {
        if (User.variant.armor == null) {
            return;
        }
        //this.ArmorPanel.Set_Armor(User.variant.armor, User.variant.GetCurrentArmorTotal());
        this.pointsPerTonAmountLabel.setText(String.format("%.2f", User.variant.armor.pointsPerTon));
        this.armorProgressBar.setString("" + User.variant.GetCurrentArmorTotal());
        this.armorProgressBar.setValue(User.variant.GetCurrentArmorTotal());
        this.UpdateArmorLabels(this.rightArmArmorProgressBar, null, this.rightArmStructureProgressBar, 0);
        this.UpdateArmorLabels(this.leftArmArmorProgressBar, null, this.leftArmStructureProgressBar, 1);
        this.UpdateArmorLabels(this.rightLegArmorProgressBar, null, this.rightLegStructureProgressBar, 6);
        this.UpdateArmorLabels(this.leftLegArmorProgressBar, null, this.leftLegStructureProgressBar, 7);
        this.UpdateArmorLabels(this.rightTorsoFrontArmorProgressBar, this.rightTorsoRearArmorProgressBar, this.rightTorsoStructureProgressBar, 2);
        this.UpdateArmorLabels(this.leftTorsoFrontArmorProgressBar, this.leftTorsoRearArmorProgressBar, this.leftTorsoStructureProgressBar, 3);
        this.UpdateArmorLabels(this.centerTorsoFrontArmorProgressBar, this.centerTorsoRearArmorProgressBar, this.centerTorsoStructureProgressBar, 4);
        this.UpdateArmorLabels(this.headArmorProgressBar, null, this.headStructureProgressBar, 5);
        this.rightArmArmorAmountLabel.setText(String.format("%d/%d", User.variant.sections[0].frontArmor, User.variant.sections[0].maximumArmor));
        this.leftArmArmorAmountLabel.setText(String.format("%d/%d", User.variant.sections[1].frontArmor, User.variant.sections[1].maximumArmor));
        this.rightTorsoArmorAmountLabel.setText(String.format("%d/%d", User.variant.sections[2].frontArmor + User.variant.sections[2].rearArmor, User.variant.sections[2].maximumArmor));
        this.leftTorsoArmorAmountLabel.setText(String.format("%d/%d", User.variant.sections[3].frontArmor + User.variant.sections[3].rearArmor, User.variant.sections[3].maximumArmor));
        this.centerTorsoArmorAmountLabel.setText(String.format("%d/%d", User.variant.sections[4].frontArmor + User.variant.sections[4].rearArmor, User.variant.sections[4].maximumArmor));
        this.headArmorAmountLabel.setText(String.format("%d/%d", User.variant.sections[5].frontArmor, User.variant.sections[5].maximumArmor));
        this.rightLegArmorAmountLabel.setText(String.format("%d/%d", User.variant.sections[6].frontArmor, User.variant.sections[6].maximumArmor));
        this.leftLegArmorAmountLabel.setText(String.format("%d/%d", User.variant.sections[7].frontArmor, User.variant.sections[7].maximumArmor));
        this.totalArmorAmountLabel.setText(String.format("%d/%d", User.variant.GetCurrentArmorTotal(), User.variant.GetMaximumArmorTotal()));
    }

    private void UpdateSpeed() {
        this.speedProgressBar.setString(String.format("%.1f kph", User.variant.engine.Get_Speed(User.variant.chassisType.tonnage, User.variant.currentEngineRating) * User.speed_tweak_modifier));
        //this.speedComponentPanel.Set_Speed_Limits(User.variant.chassisType, User.variant.modelType, 16.2, User.speed_tweak_modifier);
    }

    private void UpdateWeapons() {
        WeaponBlueprint weapon_Blueprint;
        WeaponBlueprint weapon_Blueprint2;
        double d = 0.0;
        double d2 = 0.0;
        double d3 = 0.0;
        double d4 = 0.0;
        double d5 = User.variant.heatsinks.Get_Dissipation(User.variant.currentHeatSinkCount, User.variant.currentEngineRating) * User.coolrun_modifier;
        double d6 = User.variant.heatsinks.Get_Threshold(User.variant.currentHeatSinkCount) * User.heat_containment_modifier;
        int n = 1000;
        int n2 = 0;
        int n3 = 0;
        for (Section section2 : User.variant.sections) {
            for (Crittable crittable3 : section2.components) {
                if (!crittable3.itemType.equals("Weapon")) continue;
                weapon_Blueprint = (WeaponBlueprint) crittable3.reference;
                d += weapon_Blueprint.Get_Effective_Damage();
                d2 += weapon_Blueprint.heat;
                d3 += weapon_Blueprint.Get_DPS(User.fast_fire_modifier);
                d4 += weapon_Blueprint.Get_HPS(User.fast_fire_modifier);
            }
        }
        Section[] arrsection = User.variant.sections;
        int crittable5 = arrsection.length;
        for (int i = 0; i < crittable5; ++i) {
            Section section2 = arrsection[i];
            for (Crittable crittable3 : section2.components) {
                if (!crittable3.itemType.equals("Weapon")) continue;
                weapon_Blueprint = (WeaponBlueprint) crittable3.reference;
                n3 = (int) ((double) n3 + (double) weapon_Blueprint.effective_range * (weapon_Blueprint.Get_DPS(User.fast_fire_modifier) / d3));
            }
        }
        arrsection = User.variant.sections;
        int n4 = arrsection.length;
        for (int i = 0; i < crittable5; ++i) {
            Section section2 = arrsection[i];
            for (Crittable crittable3 : section2.components) {
                if (!crittable3.itemType.equals("Weapon")) continue;
                weapon_Blueprint = (WeaponBlueprint) crittable3.reference;
                int temp_int = Math.abs(weapon_Blueprint.effective_range - n3);
                if (temp_int >= n) continue;
                n = temp_int;
                n2 = weapon_Blueprint.effective_range;
            }
        }
        this.alphaDamageProgressBar.setValue((int) Math.round(d));
        this.alphaDamageProgressBar.setString(String.format("%.2f", d));
        this.firepowerProgressBar.setValue((int) Math.round(d3));
        this.firepowerProgressBar.setString(String.format("%.2f dps", d3));
        this.heatEfficiencyProgressBar.setValue((int) Math.round(d5 * 10.0 / d4));
        this.heatEfficiencyProgressBar.setString(String.format("%.2f", d5 * 10.0 / d4) + '%');
        this.alphaHeatProgressBar.setValue((int) Math.round(d2 * 100.0 / d6));
        this.alphaHeatProgressBar.setString(String.format("%.2f", d2 * 100.0 / d6) + '%');
        this.rangeProgressBar.setValue(n2);
        this.rangeProgressBar.setString("" + n2 + "m");
    }

    private void UpdateCriticals() {
        this.UpdateCriticals(this.rightArmCriticalList, 0);
        this.UpdateCriticals(this.leftArmCriticalList, 1);
        this.UpdateCriticals(this.rightLegCriticalList, 6);
        this.UpdateCriticals(this.leftLegCriticalList, 7);
        this.UpdateCriticals(this.rightTorsoCriticalList, 2);
        this.UpdateCriticals(this.leftTorsoCriticalList, 3);
        this.UpdateCriticals(this.centerTorsoCriticalList, 4);
        this.UpdateCriticals(this.headCriticalList, 5);
        User.variant.CalculateCriticals();
        int temp_int = 0;
        /*for (Crittable crittable : queued_items) {
            temp_int += crittable.criticals;
        }*/
        this.criticalsProgressBar.setValue(User.variant.currentCriticals + temp_int);
        this.criticalsProgressBar.setString(String.format("%d/%d", User.variant.currentCriticals + temp_int, 78));
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
        int n2 = User.variant.sections[n].maximumCriticals - User.variant.sections[n].currentCriticals;
        for (int i = 0; i < n2; ++i) {
            defaultListModel.addElement("-Empty-");
        }
        jList.setModel(defaultListModel);
    }

    private void UpdateTonnage() {
        User.variant.CalculateTonnage();
        double temp_double = 0.0;
        /*for (Crittable crittable : queued_items) {
            temp_double += crittable.tonnage;
        }*/
        this.tonnageProgressBar.setValue((int) Math.ceil(User.variant.currentTonnage + temp_double));
        this.tonnageProgressBar.setString(String.format("%.2f Tons", User.variant.currentTonnage + temp_double));
    }

    private void UpdateArmorSpinners(int n) {
        int temp_int;
        
        switch (n) {
            case 5: {
                User.variant.sections[5].frontArmor = (Integer) this.headSpinner.getValue();
                break;
            }
            case 2: {
                User.variant.sections[2].frontArmor = (Integer) this.rightTorsoSpinner.getValue();
                User.variant.sections[2].rearArmor = (Integer) this.rightRearTorsoSpinner.getValue();
                temp_int = User.variant.sections[2].maximumArmor - User.variant.sections[2].rearArmor - User.variant.sections[2].frontArmor;
                this.rightTorsoSpinnerModel.setMaximum(Integer.valueOf(User.variant.sections[2].frontArmor + temp_int));
                this.rightRearTorsoSpinnerModel.setMaximum(Integer.valueOf(User.variant.sections[2].rearArmor + temp_int));
                break;
            }
            case 3: {
                User.variant.sections[3].frontArmor = (Integer) this.leftTorsoSpinner.getValue();
                User.variant.sections[3].rearArmor = (Integer) this.leftRearTorsoSpinner.getValue();
                temp_int = User.variant.sections[3].maximumArmor - User.variant.sections[3].rearArmor - User.variant.sections[3].frontArmor;
                this.leftTorsoSpinnerModel.setMaximum(Integer.valueOf(User.variant.sections[3].frontArmor + temp_int));
                this.leftRearTorsoSpinnerModel.setMaximum(Integer.valueOf(User.variant.sections[3].rearArmor + temp_int));
                break;
            }
            case 4: {
                User.variant.sections[4].frontArmor = (Integer) this.centerTorsoSpinner.getValue();
                User.variant.sections[4].rearArmor = (Integer) this.centerRearTorsoSpinner.getValue();
                temp_int = User.variant.sections[4].maximumArmor - User.variant.sections[4].rearArmor - User.variant.sections[4].frontArmor;
                this.centerTorsoSpinnerModel.setMaximum(Integer.valueOf(User.variant.sections[4].frontArmor + temp_int));
                this.centerRearTorsoSpinnerModel.setMaximum(Integer.valueOf(User.variant.sections[4].rearArmor + temp_int));
                break;
            }
            case 0: {
                User.variant.sections[0].frontArmor = (Integer) this.rightArmSpinner.getValue();
                break;
            }
            case 1: {
                User.variant.sections[1].frontArmor = (Integer) this.leftArmSpinner.getValue();
                break;
            }
            case 6: {
                User.variant.sections[6].frontArmor = (Integer) this.rightLegSpinner.getValue();
                break;
            }
            case 7: {
                User.variant.sections[7].frontArmor = (Integer) this.leftLegSpinner.getValue();
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
                if (User.variant.sections[this.section_id].components.get(n2).isLocked) {
                    if (bl && jList.hasFocus()) {
                        jLabel.setBackground(User.preferences.LOCKED_CRITICAL_FG);
                        jLabel.setForeground(User.preferences.LOCKED_CRITICAL_BG);
                    } else {
                        jLabel.setBackground(User.preferences.LOCKED_CRITICAL_BG);
                        jLabel.setForeground(User.preferences.LOCKED_CRITICAL_FG);
                    }
                } else {
                    Color color = User.variant.sections[this.section_id].components.get(n2).hardpointType.equals(HardpointType.values()[0]) ? User.preferences.BALLISTIC_COLOR : (User.variant.sections[this.section_id].components.get(n2).hardpointType.equals(HardpointType.values()[1]) ? User.preferences.ENERGY_COLOR : (User.variant.sections[this.section_id].components.get(n2).hardpointType.equals(HardpointType.values()[2]) ? User.preferences.MISSILE_COLOR : (User.variant.sections[this.section_id].components.get(n2).hardpointType.equals(HardpointType.values()[3]) ? User.preferences.AMS_COLOR : (User.variant.sections[this.section_id].components.get(n2).hardpointType.equals(HardpointType.values()[4]) ? User.preferences.ECM_COLOR : User.preferences.NORMAL_CRITICAL_BG))));
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
    
    Predicate<Blueprint> getDatabaseFilter(final TechBase techBase, final boolean mixtechEnabled, final boolean futuretechEnabled) {
        return blueprint -> mixtechEnabled || blueprint.techBase.equals(TechBase.UNIVERSAL) || techBase.equals(blueprint.techBase) || techBase.equals(TechBase.UNIVERSAL);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AdjustmentsPanel;
    private javax.swing.JPanel ArmorPanel;
    private javax.swing.JPanel ChassisPanel;
    private javax.swing.JPanel EfficienciesPanel;
    private javax.swing.JPanel EquipmentSpecificationsPanel;
    private javax.swing.JPanel FeaturesPanel;
    private javax.swing.JToggleButton FrankenmechToggle;
    private javax.swing.JToggleButton FuturetechToggle;
    private javax.swing.JPanel InformationSpecificationsPanel;
    private javax.swing.JTabbedPane InformationTabbedPane;
    private javax.swing.JTabbedPane MechTabPane;
    private javax.swing.JToggleButton MixtechToggle;
    private javax.swing.JPanel ModelOverviewPanel;
    private javax.swing.JPanel ModelSpecificationsPanel;
    private javax.swing.JToggleButton OmniRestrictionsToggle;
    private javax.swing.JPanel OptionsPanel;
    private javax.swing.JPanel SystemsPanel;
    private javax.swing.JPanel UpgradesPanel;
    private javax.swing.JScrollPane UpgradesScrollPane;
    private javax.swing.JPanel WeaponsPanel;
    private javax.swing.JProgressBar alphaDamageProgressBar;
    private javax.swing.JProgressBar alphaHeatProgressBar;
    private javax.swing.JComboBox<String> armorComboBox;
    private javax.swing.JProgressBar armorProgressBar;
    private javax.swing.JSpinner centerRearTorsoSpinner;
    private javax.swing.JLabel centerTorsoAMSHardpointLabel;
    private javax.swing.JLabel centerTorsoArmorAmountLabel;
    private javax.swing.JLabel centerTorsoBallisticHardpointLabel;
    private javax.swing.JList<String> centerTorsoCriticalList;
    private javax.swing.JLabel centerTorsoECMHardpointLabel;
    private javax.swing.JLabel centerTorsoEnergyHardpointLabel;
    private javax.swing.JProgressBar centerTorsoFrontArmorProgressBar;
    private javax.swing.JLabel centerTorsoMissileHardpointLabel;
    private javax.swing.JComboBox<String> centerTorsoOmnipodComboBox;
    private javax.swing.JPanel centerTorsoPanel;
    private javax.swing.JProgressBar centerTorsoRearArmorProgressBar;
    private javax.swing.JSpinner centerTorsoSpinner;
    private javax.swing.JProgressBar centerTorsoStructureProgressBar;
    javax.swing.JComboBox<String> chassisComboBox;
    private javax.swing.JButton clearArmorButton;
    private javax.swing.JComboBox<String> cockpitComboBox;
    private javax.swing.JPanel componentsPanel;
    private javax.swing.JScrollPane componentsScrollPane;
    private javax.swing.JProgressBar criticalsProgressBar;
    private javax.swing.JScrollPane descriptionScrollPane;
    private javax.swing.JTextArea descriptionTextArea;
    private javax.swing.JLabel ecmCapableLabel;
    private javax.swing.JButton efficientArmorButton;
    private javax.swing.JComboBox<String> engineComboBox;
    private javax.swing.JSpinner engineRatingSpinner;
    private javax.swing.JButton exportButton;
    private javax.swing.JProgressBar firepowerProgressBar;
    private javax.swing.JComboBox<String> gyroComboBox;
    private com.github.majora_incarnate.mwo_mechbay.mechlab.ComponentPanel hardpointComponentPanel;
    private javax.swing.JLabel headAMSHardpointLabel;
    private javax.swing.JLabel headArmorAmountLabel;
    private javax.swing.JProgressBar headArmorProgressBar;
    private javax.swing.JLabel headBallisticHardpointLabel;
    private javax.swing.JList<String> headCriticalList;
    private javax.swing.JLabel headECMHardpointLabel;
    private javax.swing.JLabel headEnergyHardpointLabel;
    private javax.swing.JLabel headMissileHardpointLabel;
    private javax.swing.JComboBox<String> headOmnipodComboBox;
    private javax.swing.JPanel headPanel;
    private javax.swing.JSpinner headSpinner;
    private javax.swing.JProgressBar headStructureProgressBar;
    private javax.swing.JProgressBar heatEfficiencyProgressBar;
    private javax.swing.JComboBox<String> heatSinkComboBox;
    private javax.swing.JButton importButton;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jumpCapableLabel;
    private javax.swing.JProgressBar jumpDistanceProgressBar;
    private javax.swing.JProgressBar jumpHeightProgressBar;
    private javax.swing.JComboBox<String> jumpJetComboBox;
    private javax.swing.JLabel leftArmAMSHardpointLabel;
    private javax.swing.JLabel leftArmArmorAmountLabel;
    private javax.swing.JProgressBar leftArmArmorProgressBar;
    private javax.swing.JLabel leftArmBallisticHardpointLabel;
    private javax.swing.JList<String> leftArmCriticalList;
    private javax.swing.JLabel leftArmECMHardpointLabel;
    private javax.swing.JLabel leftArmEnergyHardpointLabel;
    private javax.swing.JLabel leftArmMissileHardpointLabel;
    private javax.swing.JComboBox<String> leftArmOmnipodComboBox;
    private javax.swing.JPanel leftArmPanel;
    private javax.swing.JSpinner leftArmSpinner;
    private javax.swing.JProgressBar leftArmStructureProgressBar;
    private javax.swing.JToggleButton leftHandToggleButton;
    private javax.swing.JLabel leftLegAMSHardpointLabel;
    private javax.swing.JLabel leftLegArmorAmountLabel;
    private javax.swing.JProgressBar leftLegArmorProgressBar;
    private javax.swing.JLabel leftLegBallisticHardpointLabel;
    private javax.swing.JList<String> leftLegCriticalList;
    private javax.swing.JLabel leftLegECMHardpointLabel;
    private javax.swing.JLabel leftLegEnergyHardpointLabel;
    private javax.swing.JLabel leftLegMissileHardpointLabel;
    private javax.swing.JComboBox<String> leftLegOmnipodComboBox;
    private javax.swing.JPanel leftLegPanel;
    private javax.swing.JSpinner leftLegSpinner;
    private javax.swing.JProgressBar leftLegStructureProgressBar;
    private javax.swing.JToggleButton leftLowerArmToggleButton;
    private javax.swing.JSpinner leftRearTorsoSpinner;
    private javax.swing.JLabel leftTorsoAMSHardpointLabel;
    private javax.swing.JLabel leftTorsoArmorAmountLabel;
    private javax.swing.JLabel leftTorsoBallisticHardpointLabel;
    private javax.swing.JToggleButton leftTorsoCASEToggleButton;
    private javax.swing.JList<String> leftTorsoCriticalList;
    private javax.swing.JLabel leftTorsoECMHardpointLabel;
    private javax.swing.JLabel leftTorsoEnergyHardpointLabel;
    private javax.swing.JProgressBar leftTorsoFrontArmorProgressBar;
    private javax.swing.JLabel leftTorsoMissileHardpointLabel;
    private javax.swing.JComboBox<String> leftTorsoOmnipodComboBox;
    private javax.swing.JPanel leftTorsoPanel;
    private javax.swing.JProgressBar leftTorsoRearArmorProgressBar;
    private javax.swing.JSpinner leftTorsoSpinner;
    private javax.swing.JProgressBar leftTorsoStructureProgressBar;
    private javax.swing.JButton loadButton;
    private com.github.majora_incarnate.mwo_mechbay.mechlab.ComponentPanel manueverabilityComponentPanel;
    private javax.swing.JButton maximumArmorButton;
    private javax.swing.JPanel mechPanel;
    private javax.swing.JLabel mechTypeLabel;
    javax.swing.JComboBox<String> modelComboBox;
    private com.github.majora_incarnate.mwo_mechbay.mechlab.ComponentPanel movementRangeComponentPanel;
    private com.github.majora_incarnate.mwo_mechbay.mechlab.ComponentPanel movementSpeedComponentPanel;
    private javax.swing.JComboBox<String> myomerComboBox;
    private com.github.majora_incarnate.mwo_mechbay.mechlab.ComponentPanel overviewComponentPanel;
    private javax.swing.JLabel pointsPerTonAmountLabel;
    private javax.swing.JLabel pointsPerTonLabel;
    private javax.swing.JScrollPane quirksJScrollPane;
    private javax.swing.JTextArea quirksJTextArea;
    private javax.swing.JPanel quirksPanel;
    private javax.swing.JProgressBar rangeProgressBar;
    private javax.swing.JLabel rightArmAMSHardpointLabel;
    private javax.swing.JLabel rightArmArmorAmountLabel;
    private javax.swing.JProgressBar rightArmArmorProgressBar;
    private javax.swing.JLabel rightArmBallisticHardpointLabel;
    private javax.swing.JList<String> rightArmCriticalList;
    private javax.swing.JLabel rightArmECMHardpointLabel;
    private javax.swing.JLabel rightArmEnergyHardpointLabel;
    private javax.swing.JLabel rightArmMissileHardpointLabel;
    private javax.swing.JComboBox<String> rightArmOmnipodComboBox;
    private javax.swing.JPanel rightArmPanel;
    private javax.swing.JSpinner rightArmSpinner;
    private javax.swing.JProgressBar rightArmStructureProgressBar;
    private javax.swing.JToggleButton rightHandToggleButton;
    private javax.swing.JLabel rightLegAMSHardpointLabel;
    private javax.swing.JLabel rightLegArmorAmountLabel;
    private javax.swing.JProgressBar rightLegArmorProgressBar;
    private javax.swing.JLabel rightLegBallisticHardpointLabel;
    private javax.swing.JList<String> rightLegCriticalList;
    private javax.swing.JLabel rightLegECMHardpointLabel;
    private javax.swing.JLabel rightLegEnergyHardpointLabel;
    private javax.swing.JLabel rightLegMissileHardpointLabel;
    private javax.swing.JComboBox<String> rightLegOmnipodComboBox;
    private javax.swing.JPanel rightLegPanel;
    private javax.swing.JSpinner rightLegSpinner;
    private javax.swing.JProgressBar rightLegStructureProgressBar;
    private javax.swing.JToggleButton rightLowerArmToggleButton;
    private javax.swing.JSpinner rightRearTorsoSpinner;
    private javax.swing.JLabel rightTorsoAMSHardpointLabel;
    private javax.swing.JLabel rightTorsoArmorAmountLabel;
    private javax.swing.JLabel rightTorsoBallisticHardpointLabel;
    private javax.swing.JToggleButton rightTorsoCASEToggleButton;
    private javax.swing.JList<String> rightTorsoCriticalList;
    private javax.swing.JLabel rightTorsoECMHardpointLabel;
    private javax.swing.JLabel rightTorsoEnergyHardpointLabel;
    private javax.swing.JProgressBar rightTorsoFrontArmorProgressBar;
    private javax.swing.JLabel rightTorsoMissileHardpointLabel;
    private javax.swing.JComboBox<String> rightTorsoOmnipodComboBox;
    private javax.swing.JPanel rightTorsoPanel;
    private javax.swing.JProgressBar rightTorsoRearArmorProgressBar;
    private javax.swing.JSpinner rightTorsoSpinner;
    private javax.swing.JProgressBar rightTorsoStructureProgressBar;
    private javax.swing.JButton saveButton;
    private javax.swing.JTabbedPane secondaryTabbedPane;
    private javax.swing.JLabel section1AMSHardpointLabel;
    private javax.swing.JProgressBar section1ArmorProgressBar;
    private javax.swing.JLabel section1BallisticHardpointLabel;
    private javax.swing.JList<String> section1CriticalList;
    private javax.swing.JLabel section1ECMHardpointLabel;
    private javax.swing.JLabel section1EnergyHardpointLabel;
    private javax.swing.JLabel section1MissileHardpointLabel;
    private javax.swing.JComboBox<String> section1OmnipodComboBox;
    private javax.swing.JProgressBar section1StructureProgressBar;
    private javax.swing.JLabel section2AMSHardpointLabel;
    private javax.swing.JProgressBar section2ArmorProgressBar;
    private javax.swing.JLabel section2BallisticHardpointLabel;
    private javax.swing.JList<String> section2CriticalList;
    private javax.swing.JLabel section2ECMHardpointLabel;
    private javax.swing.JLabel section2EnergyHardpointLabel;
    private javax.swing.JLabel section2MissileHardpointLabel;
    private javax.swing.JComboBox<String> section2OmnipodComboBox;
    private javax.swing.JProgressBar section2StructureProgressBar;
    private javax.swing.JLabel special1ArmorAmountLabel;
    private javax.swing.JPanel special1Panel;
    private javax.swing.JSpinner special1Spinner;
    private javax.swing.JLabel special2ArmorAmountLabel;
    private javax.swing.JPanel special2Panel;
    private javax.swing.JSpinner special2Spinner;
    private com.github.majora_incarnate.mwo_mechbay.mechlab.ComponentPanel speedComponentPanel;
    private javax.swing.JProgressBar speedProgressBar;
    private javax.swing.JPanel statisticsPanel;
    private javax.swing.JComboBox<String> structureComboBox;
    private javax.swing.JLabel techBaseLabel;
    private javax.swing.JButton tonnageArmorButton;
    private javax.swing.JProgressBar tonnageProgressBar;
    private javax.swing.JLabel totalArmorAmountLabel;
    private javax.swing.JLabel totalArmorLabel;
    private javax.swing.JLabel unconfirmedLabel;
    private javax.swing.JLabel unreleasedLabel;
    private javax.swing.JLabel variantCostLabel;
    private javax.swing.JTextField variantNameField;
    // End of variables declaration//GEN-END:variables
}
