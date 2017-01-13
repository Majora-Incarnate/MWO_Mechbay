package com.github.majora_incarnate.mwo.mechbay.mechlab;

import java.awt.Color;
import java.awt.Dimension;
import java.util.function.Predicate;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JProgressBar;
import javax.swing.JToggleButton;
import javax.swing.SpinnerNumberModel;

import com.github.majora_incarnate.mwo.mechbay.entities.blueprints.*;
import com.github.majora_incarnate.mwo.mechbay.entities.Crittable;
import com.github.majora_incarnate.mwo.mechbay.entities.Database;
import com.github.majora_incarnate.mwo.mechbay.entities.Section;
import com.github.majora_incarnate.mwo.mechbay.entities.User;
import com.github.majora_incarnate.mwo.mechbay.entities.Variant;
import com.github.majora_incarnate.mwo.mechbay.entities.enums.*;

import java.util.HashMap;
import java.util.Map;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import com.github.majora_incarnate.mwo.mechbay.entities.Preferences;
import com.google.common.collect.ImmutableMap;

/**
 *
 * @author Trevin
 */
public class MechlabJPanel extends javax.swing.JPanel {
    private static final long serialVersionUID = 5605339237691950478L;
    
    private final Preferences preferences;
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
    private final User user;
    private Database selectedDatabase;

    /**
     * Creates new form MechlabJPanel
     * @param preferences
     * @param masterDatabase
     */
    public MechlabJPanel(final Preferences preferences, final Database masterDatabase) {
        this.preferences = preferences;
        this.masterDatabase = masterDatabase;
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
        
        user = new User();
        
        initComponents();
        
        special1Panel.setVisible(false);
        special2Panel.setVisible(false);
        
        this.rightArmCriticalList.setCellRenderer(new MechCriticalRenderer(SectionType.RIGHT_ARM));
        this.leftArmCriticalList.setCellRenderer(new MechCriticalRenderer(SectionType.LEFT_ARM));
        this.rightLegCriticalList.setCellRenderer(new MechCriticalRenderer(SectionType.RIGHT_LEG));
        this.leftLegCriticalList.setCellRenderer(new MechCriticalRenderer(SectionType.LEFT_LEG));
        this.rightTorsoCriticalList.setCellRenderer(new MechCriticalRenderer(SectionType.RIGHT_TORSO));
        this.leftTorsoCriticalList.setCellRenderer(new MechCriticalRenderer(SectionType.LEFT_TORSO));
        this.centerTorsoCriticalList.setCellRenderer(new MechCriticalRenderer(SectionType.CENTER_TORSO));
        this.headCriticalList.setCellRenderer(new MechCriticalRenderer(SectionType.HEAD));
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
        chassisComboBox = new JComboBox<>();
        modelComboBox = new JComboBox<>();
        variantNameField = new javax.swing.JTextField();
        variantCostLabel = new JLabel();
        techBaseLabel = new JLabel();
        mechTypeLabel = new JLabel();
        unreleasedLabel = new JLabel();
        unconfirmedLabel = new JLabel();
        ecmCapableLabel = new JLabel();
        jumpCapableLabel = new JLabel();
        UpgradesScrollPane = new javax.swing.JScrollPane();
        UpgradesPanel = new javax.swing.JPanel();
        AdjustmentsPanel = new javax.swing.JPanel();
        engineRatingSpinner = new javax.swing.JSpinner();
        SystemsPanel = new javax.swing.JPanel();
        engineComboBox = new JComboBox<>();
        structureComboBox = new JComboBox<>();
        armorComboBox = new JComboBox<>();
        gyroComboBox = new JComboBox<>();
        cockpitComboBox = new JComboBox<>();
        heatSinkComboBox = new JComboBox<>();
        myomerComboBox = new JComboBox<>();
        jumpJetComboBox = new JComboBox<>();
        EfficienciesPanel = new javax.swing.JPanel();
        WeaponsPanel = new javax.swing.JPanel();
        ArmorPanel = new javax.swing.JPanel();
        pointsPerTonLabel = new JLabel();
        pointsPerTonAmountLabel = new JLabel();
        maximumArmorButton = new javax.swing.JButton();
        clearArmorButton = new javax.swing.JButton();
        efficientArmorButton = new javax.swing.JButton();
        tonnageArmorButton = new javax.swing.JButton();
        jLabel21 = new JLabel();
        jLabel22 = new JLabel();
        jLabel23 = new JLabel();
        jLabel24 = new JLabel();
        jLabel25 = new JLabel();
        headArmorAmountLabel = new JLabel();
        jLabel29 = new JLabel();
        centerTorsoArmorAmountLabel = new JLabel();
        jLabel33 = new JLabel();
        rightTorsoArmorAmountLabel = new JLabel();
        jLabel37 = new JLabel();
        leftTorsoArmorAmountLabel = new JLabel();
        jLabel41 = new JLabel();
        rightArmArmorAmountLabel = new JLabel();
        jLabel45 = new JLabel();
        leftArmArmorAmountLabel = new JLabel();
        jLabel49 = new JLabel();
        rightLegArmorAmountLabel = new JLabel();
        jLabel50 = new JLabel();
        leftLegArmorAmountLabel = new JLabel();
        jLabel51 = new JLabel();
        special1ArmorAmountLabel = new JLabel();
        jLabel55 = new JLabel();
        special2ArmorAmountLabel = new JLabel();
        totalArmorLabel = new JLabel();
        totalArmorAmountLabel = new JLabel();
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
        tonnageProgressBar = new JProgressBar();
        speedProgressBar = new JProgressBar();
        jumpDistanceProgressBar = new JProgressBar();
        jumpHeightProgressBar = new JProgressBar();
        armorProgressBar = new JProgressBar();
        alphaDamageProgressBar = new JProgressBar();
        alphaHeatProgressBar = new JProgressBar();
        firepowerProgressBar = new JProgressBar();
        heatEfficiencyProgressBar = new JProgressBar();
        rangeProgressBar = new JProgressBar();
        criticalsProgressBar = new JProgressBar();
        mechPanel = new javax.swing.JPanel();
        headPanel = new javax.swing.JPanel();
        headOmnipodComboBox = new JComboBox<>();
        headAMSHardpointLabel = new JLabel();
        headECMHardpointLabel = new JLabel();
        headEnergyHardpointLabel = new JLabel();
        headBallisticHardpointLabel = new JLabel();
        headMissileHardpointLabel = new JLabel();
        headStructureProgressBar = new JProgressBar();
        headArmorProgressBar = new JProgressBar();
        headCriticalList = new JList<>();
        centerTorsoPanel = new javax.swing.JPanel();
        centerTorsoOmnipodComboBox = new JComboBox<>();
        centerTorsoAMSHardpointLabel = new JLabel();
        centerTorsoECMHardpointLabel = new JLabel();
        centerTorsoEnergyHardpointLabel = new JLabel();
        centerTorsoBallisticHardpointLabel = new JLabel();
        centerTorsoMissileHardpointLabel = new JLabel();
        centerTorsoStructureProgressBar = new JProgressBar();
        centerTorsoFrontArmorProgressBar = new JProgressBar();
        centerTorsoRearArmorProgressBar = new JProgressBar();
        centerTorsoCriticalList = new JList<>();
        leftTorsoPanel = new javax.swing.JPanel();
        leftTorsoOmnipodComboBox = new JComboBox<>();
        leftTorsoBallisticHardpointLabel = new JLabel();
        leftTorsoEnergyHardpointLabel = new JLabel();
        leftTorsoAMSHardpointLabel = new JLabel();
        leftTorsoECMHardpointLabel = new JLabel();
        leftTorsoMissileHardpointLabel = new JLabel();
        leftTorsoStructureProgressBar = new JProgressBar();
        leftTorsoFrontArmorProgressBar = new JProgressBar();
        leftTorsoRearArmorProgressBar = new JProgressBar();
        leftTorsoCriticalList = new JList<>();
        leftTorsoCASEToggleButton = new JToggleButton();
        rightTorsoPanel = new javax.swing.JPanel();
        rightTorsoOmnipodComboBox = new JComboBox<>();
        rightTorsoBallisticHardpointLabel = new JLabel();
        rightTorsoEnergyHardpointLabel = new JLabel();
        rightTorsoAMSHardpointLabel = new JLabel();
        rightTorsoECMHardpointLabel = new JLabel();
        rightTorsoMissileHardpointLabel = new JLabel();
        rightTorsoStructureProgressBar = new JProgressBar();
        rightTorsoFrontArmorProgressBar = new JProgressBar();
        rightTorsoRearArmorProgressBar = new JProgressBar();
        rightTorsoCriticalList = new JList<>();
        rightTorsoCASEToggleButton = new JToggleButton();
        leftLegPanel = new javax.swing.JPanel();
        leftLegOmnipodComboBox = new JComboBox<>();
        leftLegBallisticHardpointLabel = new JLabel();
        leftLegEnergyHardpointLabel = new JLabel();
        leftLegAMSHardpointLabel = new JLabel();
        leftLegECMHardpointLabel = new JLabel();
        leftLegMissileHardpointLabel = new JLabel();
        leftLegStructureProgressBar = new JProgressBar();
        leftLegArmorProgressBar = new JProgressBar();
        leftLegCriticalList = new JList<>();
        rightLegPanel = new javax.swing.JPanel();
        rightLegOmnipodComboBox = new JComboBox<>();
        rightLegBallisticHardpointLabel = new JLabel();
        rightLegEnergyHardpointLabel = new JLabel();
        rightLegAMSHardpointLabel = new JLabel();
        rightLegECMHardpointLabel = new JLabel();
        rightLegMissileHardpointLabel = new JLabel();
        rightLegStructureProgressBar = new JProgressBar();
        rightLegArmorProgressBar = new JProgressBar();
        rightLegCriticalList = new JList<>();
        leftArmPanel = new javax.swing.JPanel();
        leftArmOmnipodComboBox = new JComboBox<>();
        leftArmECMHardpointLabel = new JLabel();
        leftArmEnergyHardpointLabel = new JLabel();
        leftArmMissileHardpointLabel = new JLabel();
        leftArmAMSHardpointLabel = new JLabel();
        leftArmBallisticHardpointLabel = new JLabel();
        leftLowerArmToggleButton = new JToggleButton();
        leftHandToggleButton = new JToggleButton();
        leftArmStructureProgressBar = new JProgressBar();
        leftArmArmorProgressBar = new JProgressBar();
        leftArmCriticalList = new JList<>();
        rightArmPanel = new javax.swing.JPanel();
        rightArmOmnipodComboBox = new JComboBox<>();
        rightArmECMHardpointLabel = new JLabel();
        rightArmEnergyHardpointLabel = new JLabel();
        rightArmMissileHardpointLabel = new JLabel();
        rightArmAMSHardpointLabel = new JLabel();
        rightArmBallisticHardpointLabel = new JLabel();
        rightLowerArmToggleButton = new JToggleButton();
        rightHandToggleButton = new JToggleButton();
        rightArmStructureProgressBar = new JProgressBar();
        rightArmArmorProgressBar = new JProgressBar();
        rightArmCriticalList = new JList<>();
        special1Panel = new javax.swing.JPanel();
        section1OmnipodComboBox = new JComboBox<>();
        section1AMSHardpointLabel = new JLabel();
        section1ECMHardpointLabel = new JLabel();
        section1EnergyHardpointLabel = new JLabel();
        section1BallisticHardpointLabel = new JLabel();
        section1MissileHardpointLabel = new JLabel();
        section1StructureProgressBar = new JProgressBar();
        section1ArmorProgressBar = new JProgressBar();
        section1CriticalList = new JList<>();
        special2Panel = new javax.swing.JPanel();
        section2OmnipodComboBox = new JComboBox<>();
        section2AMSHardpointLabel = new JLabel();
        section2ECMHardpointLabel = new JLabel();
        section2EnergyHardpointLabel = new JLabel();
        section2BallisticHardpointLabel = new JLabel();
        section2MissileHardpointLabel = new JLabel();
        section2StructureProgressBar = new JProgressBar();
        section2ArmorProgressBar = new JProgressBar();
        section2CriticalList = new JList<>();
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
        overviewComponentPanel = new ComponentPanel(preferences);
        hardpointComponentPanel = new ComponentPanel(preferences);
        ModelSpecificationsPanel = new javax.swing.JPanel();
        speedComponentPanel = new ComponentPanel(preferences);
        manueverabilityComponentPanel = new ComponentPanel(preferences);
        movementRangeComponentPanel = new ComponentPanel(preferences);
        movementSpeedComponentPanel = new ComponentPanel(preferences);
        InformationSpecificationsPanel = new javax.swing.JPanel();
        EquipmentSpecificationsPanel = new javax.swing.JPanel();
        OptionsPanel = new javax.swing.JPanel();
        FeaturesPanel = new javax.swing.JPanel();
        FrankenmechToggle = new JToggleButton();
        MixtechToggle = new JToggleButton();
        FuturetechToggle = new JToggleButton();
        OmniRestrictionsToggle = new JToggleButton();

        setMinimumSize(new Dimension(1280, 700));
        setPreferredSize(new Dimension(1280, 700));
        setLayout(new java.awt.GridBagLayout());

        MechTabPane.setMaximumSize(new Dimension(320, 470));
        MechTabPane.setMinimumSize(new Dimension(320, 470));
        MechTabPane.setPreferredSize(new Dimension(320, 512));
        MechTabPane.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                MechTabPaneStateChanged(evt);
            }
        });

        ChassisPanel.setLayout(new java.awt.GridBagLayout());

        loadButton.setText("Load");
        loadButton.setAlignmentY(0.0F);
        loadButton.setEnabled(false);
        loadButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        loadButton.setMaximumSize(new Dimension(39, 20));
        loadButton.setMinimumSize(new Dimension(39, 20));
        loadButton.setPreferredSize(new Dimension(39, 20));
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
        saveButton.setMaximumSize(new Dimension(39, 20));
        saveButton.setMinimumSize(new Dimension(39, 20));
        saveButton.setPreferredSize(new Dimension(39, 20));
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
        importButton.setMaximumSize(new Dimension(39, 20));
        importButton.setMinimumSize(new Dimension(39, 20));
        importButton.setPreferredSize(new Dimension(39, 20));
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
        exportButton.setMaximumSize(new Dimension(39, 20));
        exportButton.setMinimumSize(new Dimension(39, 20));
        exportButton.setPreferredSize(new Dimension(39, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        ChassisPanel.add(exportButton, gridBagConstraints);

        chassisComboBox.setModel(new DefaultComboBoxModel(masterDatabase.CHASSIS_BLUEPRINTS.toArray()));
        chassisComboBox.setMaximumSize(new Dimension(39, 20));
        chassisComboBox.setMinimumSize(new Dimension(39, 20));
        chassisComboBox.setPreferredSize(new Dimension(39, 20));
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

        modelComboBox.setMaximumSize(new Dimension(39, 20));
        modelComboBox.setMinimumSize(new Dimension(39, 20));
        modelComboBox.setPreferredSize(new Dimension(39, 20));
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

        variantNameField.setMaximumSize(new Dimension(39, 20));
        variantNameField.setMinimumSize(new Dimension(39, 20));
        variantNameField.setPreferredSize(new Dimension(39, 20));
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
        variantCostLabel.setMaximumSize(new Dimension(39, 20));
        variantCostLabel.setMinimumSize(new Dimension(39, 20));
        variantCostLabel.setPreferredSize(new Dimension(39, 20));
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
        techBaseLabel.setMaximumSize(new Dimension(39, 20));
        techBaseLabel.setMinimumSize(new Dimension(39, 20));
        techBaseLabel.setPreferredSize(new Dimension(39, 20));
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
        mechTypeLabel.setMaximumSize(new Dimension(39, 20));
        mechTypeLabel.setMinimumSize(new Dimension(39, 20));
        mechTypeLabel.setPreferredSize(new Dimension(39, 20));
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
        unreleasedLabel.setMaximumSize(new Dimension(39, 20));
        unreleasedLabel.setMinimumSize(new Dimension(39, 20));
        unreleasedLabel.setOpaque(true);
        unreleasedLabel.setPreferredSize(new Dimension(39, 20));
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
        unconfirmedLabel.setMaximumSize(new Dimension(39, 20));
        unconfirmedLabel.setMinimumSize(new Dimension(39, 20));
        unconfirmedLabel.setOpaque(true);
        unconfirmedLabel.setPreferredSize(new Dimension(39, 20));
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
        ecmCapableLabel.setMaximumSize(new Dimension(39, 20));
        ecmCapableLabel.setMinimumSize(new Dimension(39, 20));
        ecmCapableLabel.setPreferredSize(new Dimension(39, 20));
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
        jumpCapableLabel.setMaximumSize(new Dimension(39, 20));
        jumpCapableLabel.setMinimumSize(new Dimension(39, 20));
        jumpCapableLabel.setPreferredSize(new Dimension(39, 20));
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

        AdjustmentsPanel.setPreferredSize(new Dimension(0, 0));
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

        engineComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        SystemsPanel.add(engineComboBox, gridBagConstraints);

        structureComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        SystemsPanel.add(structureComboBox, gridBagConstraints);

        armorComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        SystemsPanel.add(armorComboBox, gridBagConstraints);

        gyroComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        SystemsPanel.add(gyroComboBox, gridBagConstraints);

        cockpitComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        SystemsPanel.add(cockpitComboBox, gridBagConstraints);

        heatSinkComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        SystemsPanel.add(heatSinkComboBox, gridBagConstraints);

        myomerComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        SystemsPanel.add(myomerComboBox, gridBagConstraints);

        jumpJetComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
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

        statisticsPanel.setMaximumSize(new Dimension(192, 470));
        statisticsPanel.setMinimumSize(new Dimension(192, 470));
        statisticsPanel.setPreferredSize(new Dimension(192, 512));
        statisticsPanel.setLayout(new java.awt.GridBagLayout());

        tonnageProgressBar.setAlignmentX(0.0F);
        tonnageProgressBar.setAlignmentY(0.0F);
        tonnageProgressBar.setBorder(BorderFactory.createTitledBorder(null, "Tonnage", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, preferences.DEFAULT_FONT_SIZE_12));
        tonnageProgressBar.setMaximumSize(new Dimension(0, 0));
        tonnageProgressBar.setMinimumSize(new Dimension(0, 0));
        tonnageProgressBar.setPreferredSize(new Dimension(0, 0));
        tonnageProgressBar.setStringPainted(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        statisticsPanel.add(tonnageProgressBar, gridBagConstraints);

        speedProgressBar.setBorder(BorderFactory.createTitledBorder(null, "Speed", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, preferences.DEFAULT_FONT_SIZE_12));
        speedProgressBar.setMaximumSize(new Dimension(0, 0));
        speedProgressBar.setMinimumSize(new Dimension(0, 0));
        speedProgressBar.setPreferredSize(new Dimension(0, 0));
        speedProgressBar.setStringPainted(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        statisticsPanel.add(speedProgressBar, gridBagConstraints);

        jumpDistanceProgressBar.setBorder(BorderFactory.createTitledBorder(null, "Jump Distance", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, preferences.DEFAULT_FONT_SIZE_12));
        jumpDistanceProgressBar.setMaximumSize(new Dimension(0, 0));
        jumpDistanceProgressBar.setMinimumSize(new Dimension(0, 0));
        jumpDistanceProgressBar.setPreferredSize(new Dimension(0, 0));
        jumpDistanceProgressBar.setStringPainted(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        statisticsPanel.add(jumpDistanceProgressBar, gridBagConstraints);

        jumpHeightProgressBar.setBorder(BorderFactory.createTitledBorder(null, "Jump Height", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, preferences.DEFAULT_FONT_SIZE_12));
        jumpHeightProgressBar.setMaximumSize(new Dimension(0, 0));
        jumpHeightProgressBar.setMinimumSize(new Dimension(0, 0));
        jumpHeightProgressBar.setPreferredSize(new Dimension(0, 0));
        jumpHeightProgressBar.setStringPainted(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        statisticsPanel.add(jumpHeightProgressBar, gridBagConstraints);

        armorProgressBar.setBorder(BorderFactory.createTitledBorder(null, "Armor", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, preferences.DEFAULT_FONT_SIZE_12));
        armorProgressBar.setMaximumSize(new Dimension(0, 0));
        armorProgressBar.setMinimumSize(new Dimension(0, 0));
        armorProgressBar.setPreferredSize(new Dimension(0, 0));
        armorProgressBar.setStringPainted(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        statisticsPanel.add(armorProgressBar, gridBagConstraints);

        alphaDamageProgressBar.setBorder(BorderFactory.createTitledBorder(null, "Alpha Damage", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, preferences.DEFAULT_FONT_SIZE_12));
        alphaDamageProgressBar.setMaximumSize(new Dimension(0, 0));
        alphaDamageProgressBar.setMinimumSize(new Dimension(0, 0));
        alphaDamageProgressBar.setPreferredSize(new Dimension(0, 0));
        alphaDamageProgressBar.setStringPainted(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        statisticsPanel.add(alphaDamageProgressBar, gridBagConstraints);

        alphaHeatProgressBar.setBorder(BorderFactory.createTitledBorder(null, "Alpha Heat", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, preferences.DEFAULT_FONT_SIZE_12));
        alphaHeatProgressBar.setMaximumSize(new Dimension(0, 0));
        alphaHeatProgressBar.setMinimumSize(new Dimension(0, 0));
        alphaHeatProgressBar.setPreferredSize(new Dimension(0, 0));
        alphaHeatProgressBar.setStringPainted(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        statisticsPanel.add(alphaHeatProgressBar, gridBagConstraints);

        firepowerProgressBar.setBorder(BorderFactory.createTitledBorder(null, "Firepower", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, preferences.DEFAULT_FONT_SIZE_12));
        firepowerProgressBar.setMaximumSize(new Dimension(0, 0));
        firepowerProgressBar.setMinimumSize(new Dimension(0, 0));
        firepowerProgressBar.setPreferredSize(new Dimension(0, 0));
        firepowerProgressBar.setStringPainted(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        statisticsPanel.add(firepowerProgressBar, gridBagConstraints);

        heatEfficiencyProgressBar.setBorder(BorderFactory.createTitledBorder(null, "Heat Efficiency", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, preferences.DEFAULT_FONT_SIZE_12));
        heatEfficiencyProgressBar.setMaximumSize(new Dimension(0, 0));
        heatEfficiencyProgressBar.setMinimumSize(new Dimension(0, 0));
        heatEfficiencyProgressBar.setPreferredSize(new Dimension(0, 0));
        heatEfficiencyProgressBar.setStringPainted(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        statisticsPanel.add(heatEfficiencyProgressBar, gridBagConstraints);

        rangeProgressBar.setBorder(BorderFactory.createTitledBorder(null, "Range", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, preferences.DEFAULT_FONT_SIZE_12));
        rangeProgressBar.setMaximumSize(new Dimension(0, 0));
        rangeProgressBar.setMinimumSize(new Dimension(0, 0));
        rangeProgressBar.setPreferredSize(new Dimension(0, 0));
        rangeProgressBar.setStringPainted(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        statisticsPanel.add(rangeProgressBar, gridBagConstraints);

        criticalsProgressBar.setBorder(BorderFactory.createTitledBorder(null, "Criticals", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, preferences.DEFAULT_FONT_SIZE_12));
        criticalsProgressBar.setMaximumSize(new Dimension(0, 0));
        criticalsProgressBar.setMinimumSize(new Dimension(0, 0));
        criticalsProgressBar.setPreferredSize(new Dimension(0, 0));
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

        mechPanel.setMaximumSize(new Dimension(512, 470));
        mechPanel.setMinimumSize(new Dimension(512, 470));
        mechPanel.setPreferredSize(new Dimension(512, 512));
        mechPanel.setLayout(new java.awt.GridBagLayout());

        headPanel.setMaximumSize(new Dimension(100, 128));
        headPanel.setMinimumSize(new Dimension(100, 128));
        headPanel.setPreferredSize(new Dimension(100, 128));
        headPanel.setLayout(new java.awt.GridBagLayout());

        headOmnipodComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
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

        centerTorsoPanel.setMaximumSize(new Dimension(100, 256));
        centerTorsoPanel.setMinimumSize(new Dimension(100, 256));
        centerTorsoPanel.setPreferredSize(new Dimension(100, 256));
        centerTorsoPanel.setLayout(new java.awt.GridBagLayout());

        centerTorsoOmnipodComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
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

        leftTorsoPanel.setMaximumSize(new Dimension(100, 256));
        leftTorsoPanel.setMinimumSize(new Dimension(100, 256));
        leftTorsoPanel.setPreferredSize(new Dimension(100, 256));
        leftTorsoPanel.setLayout(new java.awt.GridBagLayout());

        leftTorsoOmnipodComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
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

        rightTorsoPanel.setMaximumSize(new Dimension(100, 256));
        rightTorsoPanel.setMinimumSize(new Dimension(100, 256));
        rightTorsoPanel.setPreferredSize(new Dimension(100, 256));
        rightTorsoPanel.setLayout(new java.awt.GridBagLayout());

        rightTorsoOmnipodComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
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

        leftLegPanel.setMaximumSize(new Dimension(100, 128));
        leftLegPanel.setMinimumSize(new Dimension(100, 128));
        leftLegPanel.setPreferredSize(new Dimension(100, 128));
        leftLegPanel.setLayout(new java.awt.GridBagLayout());

        leftLegOmnipodComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
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

        rightLegPanel.setMaximumSize(new Dimension(100, 128));
        rightLegPanel.setMinimumSize(new Dimension(100, 128));
        rightLegPanel.setPreferredSize(new Dimension(100, 128));
        rightLegPanel.setLayout(new java.awt.GridBagLayout());

        rightLegOmnipodComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
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

        leftArmPanel.setMaximumSize(new Dimension(100, 256));
        leftArmPanel.setMinimumSize(new Dimension(100, 256));
        leftArmPanel.setPreferredSize(new Dimension(100, 256));
        leftArmPanel.setLayout(new java.awt.GridBagLayout());

        leftArmOmnipodComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
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

        rightArmPanel.setMaximumSize(new Dimension(100, 256));
        rightArmPanel.setMinimumSize(new Dimension(100, 256));
        rightArmPanel.setPreferredSize(new Dimension(100, 256));
        rightArmPanel.setLayout(new java.awt.GridBagLayout());

        rightArmOmnipodComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
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

        special1Panel.setPreferredSize(new Dimension(100, 128));
        special1Panel.setLayout(new java.awt.GridBagLayout());

        section1OmnipodComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
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

        special2Panel.setPreferredSize(new Dimension(100, 128));
        special2Panel.setLayout(new java.awt.GridBagLayout());

        section2OmnipodComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
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

        secondaryTabbedPane.setMaximumSize(new Dimension(256, 470));
        secondaryTabbedPane.setMinimumSize(new Dimension(256, 470));
        secondaryTabbedPane.setPreferredSize(new Dimension(256, 512));

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

        InformationTabbedPane.setMaximumSize(new Dimension(1024, 230));
        InformationTabbedPane.setMinimumSize(new Dimension(1024, 230));
        InformationTabbedPane.setPreferredSize(new Dimension(1024, 230));

        ModelOverviewPanel.setLayout(new java.awt.GridBagLayout());

        descriptionScrollPane.setMaximumSize(new Dimension(295, 100));
        descriptionScrollPane.setMinimumSize(new Dimension(295, 100));
        descriptionScrollPane.setPreferredSize(new Dimension(295, 100));

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

        OptionsPanel.setMaximumSize(new Dimension(256, 256));
        OptionsPanel.setMinimumSize(new Dimension(256, 256));
        OptionsPanel.setPreferredSize(new Dimension(256, 256));
        OptionsPanel.setLayout(new java.awt.GridBagLayout());

        FeaturesPanel.setMaximumSize(new Dimension(256, 230));
        FeaturesPanel.setMinimumSize(new Dimension(256, 230));
        FeaturesPanel.setPreferredSize(new Dimension(256, 230));
        FeaturesPanel.setLayout(new java.awt.GridBagLayout());

        FrankenmechToggle.setText("Frankenmechs");
        FrankenmechToggle.setEnabled(false);
        FrankenmechToggle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        FrankenmechToggle.setPreferredSize(new Dimension(0, 0));
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
        MixtechToggle.setPreferredSize(new Dimension(0, 0));
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
        FuturetechToggle.setPreferredSize(new Dimension(0, 0));
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
        OmniRestrictionsToggle.setPreferredSize(new Dimension(0, 0));
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
    }// </editor-fold>

    private void chassisComboBoxActionPerformed(java.awt.event.ActionEvent evt) {
        ChassisBlueprint chassis = (ChassisBlueprint)chassisComboBox.getSelectedItem();

        selectedDatabase.MODEL_BLUEPRINTS.clear();

        masterDatabase.MODEL_BLUEPRINTS.stream().
                filter((model) -> (model.chassisName.equals(chassis.name))).
                forEach((model) -> {
                    selectedDatabase.MODEL_BLUEPRINTS.add(model);
        });

        modelComboBox.setModel(new DefaultComboBoxModel(selectedDatabase.MODEL_BLUEPRINTS.toArray()));
        modelComboBox.setSelectedIndex(0);
    }

    private void modelComboBoxActionPerformed(java.awt.event.ActionEvent evt) {
        ChassisBlueprint chassis = (ChassisBlueprint)chassisComboBox.getSelectedItem();
        ModelBlueprint model = (ModelBlueprint)modelComboBox.getSelectedItem();

        user.variant = new Variant(selectedDatabase, chassis, model);

        techBaseLabel.setText(user.variant.chassisType.techBase.toString());
        mechTypeLabel.setText(user.variant.chassisType.mechType.toString());
        unreleasedLabel.setText(user.variant.modelType.isUnreleased ? "UNRELEASED" : "RELEASED");
        unconfirmedLabel.setText(user.variant.modelType.isUnconfirmed ? "UNCONFIRMED" : "CONFIRMED");
        unreleasedLabel.setBackground(user.variant.modelType.isUnreleased ? Color.RED : Color.GREEN);
        unconfirmedLabel.setBackground(user.variant.modelType.isUnconfirmed ? Color.RED : Color.GREEN);

        overviewComponentPanel.setOverview(user.variant);
        //hardpointComponentPanel.setTotalHardpoints(0, 0, 0, 0);
        speedComponentPanel.setSpeedLimits(user, 16.2, 1.0);
        manueverabilityComponentPanel.setManueverability(user.variant);
        movementRangeComponentPanel.setMovementRange(user.variant);
        movementSpeedComponentPanel.setMovementSpeed(user.variant);

        selectedDatabase = null;
        selectedDatabase = new Database(masterDatabase, getDatabaseFilter(user.variant.chassisType.techBase, user.mixtechEnabled, user.futuretechEnabled));

        SetSectionOmnipods(rightArmOmnipodComboBox, SectionType.RIGHT_ARM.index);
        SetSectionOmnipods(leftArmOmnipodComboBox, SectionType.LEFT_ARM.index);
        SetSectionOmnipods(rightTorsoOmnipodComboBox, SectionType.RIGHT_TORSO.index);
        SetSectionOmnipods(leftTorsoOmnipodComboBox, SectionType.LEFT_TORSO.index);
        SetSectionOmnipods(centerTorsoOmnipodComboBox, SectionType.CENTER_TORSO.index);
        SetSectionOmnipods(headOmnipodComboBox, SectionType.HEAD.index);
        SetSectionOmnipods(rightLegOmnipodComboBox, SectionType.RIGHT_LEG.index);
        SetSectionOmnipods(leftLegOmnipodComboBox, SectionType.LEFT_LEG.index);
        
        Map<String, Double> quirks = new HashMap<>();
        
        user.variant.sectionTypes.values().forEach((sectionBlueprint) -> {
            sectionBlueprint.quirks.keySet().forEach((key) -> {
                if (quirks.containsKey(key)) {
                    quirks.compute(key, (givenKey, value) -> value + sectionBlueprint.quirks.get(givenKey));
                } else {
                    quirks.put(key, sectionBlueprint.quirks.get(key));
                }
            });
        });
        
        quirksJTextArea.setText("");
        
        quirks.entrySet().forEach((quirk) -> {
            quirksJTextArea.append(String.format("%s: %.2f\n", quirk.getKey(), quirk.getValue()));
        });

        engineComboBox.setModel(new DefaultComboBoxModel(selectedDatabase.ENGINE_BLUEPRINTS.toArray()));
        armorComboBox.setModel(new DefaultComboBoxModel(selectedDatabase.ARMOR_BLUEPRINTS.toArray()));
        structureComboBox.setModel(new DefaultComboBoxModel(selectedDatabase.ENGINE_BLUEPRINTS.toArray()));
        myomerComboBox.setModel(new DefaultComboBoxModel(selectedDatabase.MYOMER_BLUEPRINTS.toArray()));
        heatSinkComboBox.setModel(new DefaultComboBoxModel(selectedDatabase.HEAT_SINK_BLUEPRINTS.toArray()));
        jumpJetComboBox.setModel(new DefaultComboBoxModel(selectedDatabase.JUMP_JET_BLUEPRINTS.toArray()));
        gyroComboBox.setModel(new DefaultComboBoxModel(selectedDatabase.GYRO_BLUEPRINTS.toArray()));
        cockpitComboBox.setModel(new DefaultComboBoxModel(selectedDatabase.COCKPIT_BLUEPRINTS.toArray()));

        updateCriticalPanelVisibility();

        engineRatingSpinnerModel.setMinimum(user.variant.modelType.minEngineRating);
        engineRatingSpinnerModel.setMaximum(user.variant.modelType.maxEngineRating);
        engineRatingSpinnerModel.setValue(user.variant.modelType.engineRating);

        tonnageProgressBar.setMinimum(0);
        tonnageProgressBar.setMaximum((int)user.variant.chassisType.tonnage);
        tonnageProgressBar.setValue((int)user.variant.currentTonnage);
        tonnageProgressBar.setString(String.format("%.2f tons", user.variant.currentTonnage));

        speedProgressBar.setMinimum(0);
        speedProgressBar.setMaximum(100);
        speedProgressBar.setValue((int)(user.variant.currentEngineRating * 100.0 / user.variant.modelType.maxEngineRating));
        speedProgressBar.setString(String.format("%.2f kph", user.variant.engine.getSpeed(user.variant.chassisType.tonnage, user.variant.currentEngineRating)));

        jumpDistanceProgressBar.setMinimum(0);
        jumpDistanceProgressBar.setMaximum(user.variant.maximumJumpJets);
        jumpDistanceProgressBar.setValue(user.variant.currentJumpJets);
        jumpDistanceProgressBar.setString(String.format("%.2fm", 0.0));

        jumpHeightProgressBar.setMinimum(0);
        jumpHeightProgressBar.setMaximum(user.variant.maximumJumpJets);
        jumpHeightProgressBar.setValue(user.variant.currentJumpJets);
        jumpHeightProgressBar.setString(String.format("%.2fm", 0.0));

        criticalsProgressBar.setMinimum(0);
        criticalsProgressBar.setMaximum(78);
        criticalsProgressBar.setValue(user.variant.currentCriticals);
        criticalsProgressBar.setString(String.format("%d/78", user.variant.currentCriticals));

        //engineComponentPanel.Set_Engine(user.variant.engine, user.variant.currentEngineRating);
        //gyroComponentPanel.Set_Gyro(user.variant.gyro, user.variant.currentEngineRating);
        //armorComponentPanel.Set_Armor(user.variant.armor, user.variant.GetCurrentArmorTotal());
        //structureComponentPanel.Set_Structure(user.variant.structure, user.variant.currentTonnage);
        //heatSinksComponentPanel.Set_Heatsinks(user.variant.heatsinks, user.variant.currentHeatSinkCount, user.variant.currentEngineRating);
        //jumpJetsComponentPanel.Set_Jumpjets(user.variant.jumpjets, user.variant.currentJumpJets, user.variant.currentTonnage);
        //cockpitComponentPanel.Set_Cockpit(user.variant.cockpit);
        //myomerComponentPanel.Set_Myomer(user.variant.myomer);
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
        updateHardpoints();
        this.updateArmorLabelVisibility(this.rightArmArmorProgressBar, null, this.rightArmStructureProgressBar);
        this.updateArmorLabelVisibility(this.leftArmArmorProgressBar, null, this.leftArmStructureProgressBar);
        this.updateArmorLabelVisibility(this.rightLegArmorProgressBar, null, this.rightLegStructureProgressBar);
        this.updateArmorLabelVisibility(this.leftLegArmorProgressBar, null, this.leftLegStructureProgressBar);
        this.updateArmorLabelVisibility(this.rightTorsoFrontArmorProgressBar, this.rightTorsoRearArmorProgressBar, this.rightTorsoStructureProgressBar);
        this.updateArmorLabelVisibility(this.leftTorsoFrontArmorProgressBar, this.leftTorsoRearArmorProgressBar, this.leftTorsoStructureProgressBar);
        this.updateArmorLabelVisibility(this.centerTorsoFrontArmorProgressBar, this.centerTorsoRearArmorProgressBar, this.centerTorsoStructureProgressBar);
        this.updateArmorLabelVisibility(this.headArmorProgressBar, null, this.headStructureProgressBar);
        this.updateCriticalItemVisibility(this.rightArmCriticalList, this.rightLowerArmToggleButton, this.rightHandToggleButton, null);
        this.updateCriticalItemVisibility(this.leftArmCriticalList, this.leftLowerArmToggleButton, this.leftHandToggleButton, null);
        this.updateCriticalItemVisibility(this.rightLegCriticalList, null, null, null);
        this.updateCriticalItemVisibility(this.leftLegCriticalList, null, null, null);
        this.updateCriticalItemVisibility(this.rightTorsoCriticalList, null, null, this.rightTorsoCASEToggleButton);
        this.updateCriticalItemVisibility(this.leftTorsoCriticalList, null, null, this.leftTorsoCASEToggleButton);
        this.updateCriticalItemVisibility(this.centerTorsoCriticalList, null, null, null);
        this.updateCriticalItemVisibility(this.headCriticalList, null, null, null);
        this.updateSectionOmnipodVisibility();
    }

    private void SetSectionOmnipods(JComboBox omnipodComboBox, int sectionIndex) {
        omnipodComboBox.removeAllItems();
        
        selectedDatabase.SECTION_BLUEPRINTS.stream().map((sectionBlueprint) -> {
            omnipodComboBox.addItem(sectionBlueprint);
            return sectionBlueprint;
        }).filter((sectionBlueprint) -> !(!sectionBlueprint.name.equals(user.variant.modelType.sectionModels.get(sectionBlueprint.section)))).forEachOrdered((sectionBlueprint) -> {
            omnipodComboBox.setSelectedItem(sectionBlueprint);
        });
        
        if (sectionIndex == SectionType.CENTER_TORSO.index)
            omnipodComboBox.setEnabled(false);
        else
            omnipodComboBox.setEnabled(user.variant.chassisType.mechType.equals(MechType.OMNIMECH) || user.frankenmechsEnabled);
    }

    private void updateSectionOmnipodVisibility() {
        boolean visibilityFlag;
        switch (this.MechTabPane.getSelectedIndex()) {
            case 0: {
                visibilityFlag = true;
                break;
            }
            default: {
                visibilityFlag = false;
            }
        }
        this.rightArmOmnipodComboBox.setVisible(visibilityFlag);
        this.leftArmOmnipodComboBox.setVisible(visibilityFlag);
        this.rightTorsoOmnipodComboBox.setVisible(visibilityFlag);
        this.leftTorsoOmnipodComboBox.setVisible(visibilityFlag);
        this.centerTorsoOmnipodComboBox.setVisible(visibilityFlag);
        this.headOmnipodComboBox.setVisible(visibilityFlag);
        this.rightLegOmnipodComboBox.setVisible(visibilityFlag);
        this.leftLegOmnipodComboBox.setVisible(visibilityFlag);
    }

    private void setCriticalItems(final JList criticalList, final JToggleButton lowerArmToggleButton, final JToggleButton handToggleButton, final JToggleButton caseToggleButton, final SectionType sectionIndex) {
        final Section section = user.variant == null ? null : user.variant.sections.get(sectionIndex);
        
        if (section == null) {
            return;
        }
        
        criticalList.setVisibleRowCount(section.maximumCriticals);
        criticalList.setMinimumSize(new Dimension(90, section.maximumCriticals * 12));
        
        final ChassisBlueprint chassisType = user.variant.chassisType;
        
        if (chassisType == null) {
            return;
        }

        if (lowerArmToggleButton != null) {
            lowerArmToggleButton.setEnabled(MechType.OMNIMECH.equals(chassisType.mechType) && user.variant.sectionTypes.get(sectionIndex).maximumActuatorCount > 2);
            lowerArmToggleButton.setSelected(false);
        }
        if (handToggleButton != null) {
            handToggleButton.setEnabled(MechType.OMNIMECH.equals(chassisType.mechType) && user.variant.sectionTypes.get(sectionIndex).maximumActuatorCount > 3);
            handToggleButton.setSelected(false);
        }
        if (caseToggleButton != null) {
            caseToggleButton.setEnabled(TechBase.INNER_SPHERE.equals(chassisType.techBase));
            caseToggleButton.setSelected(false);
        }
    }
    
    private void updateToggleButtonVisibility(final JToggleButton toggleButton, final boolean visibilityFlag) {
        if (toggleButton != null) {
            toggleButton.setVisible(visibilityFlag);
        }
    }

    private void updateCriticalItemVisibility(final JList criticalList, final JToggleButton lowerArmToggleButton, final JToggleButton handToggleButton, final JToggleButton caseToggleButton) {
        boolean visibilityFlag;
        
        switch (this.MechTabPane.getSelectedIndex()) {
            case 1:
            case 2: {
                visibilityFlag = true;
                break;
            }
            default: {
                visibilityFlag = false;
            }
        }
        
        criticalList.setVisible(visibilityFlag);
        
        updateToggleButtonVisibility(lowerArmToggleButton, visibilityFlag);
        updateToggleButtonVisibility(handToggleButton, visibilityFlag);
        updateToggleButtonVisibility(caseToggleButton, visibilityFlag);
    }

    private void setSelectedSection(int n) {
        user.selectedSection = n;
        this.rightArmPanel.setBackground(preferences.DEFAULT_CRITICAL_PANEL_COLOR);
        this.leftArmPanel.setBackground(preferences.DEFAULT_CRITICAL_PANEL_COLOR);
        this.rightLegPanel.setBackground(preferences.DEFAULT_CRITICAL_PANEL_COLOR);
        this.leftLegPanel.setBackground(preferences.DEFAULT_CRITICAL_PANEL_COLOR);
        this.rightTorsoPanel.setBackground(preferences.DEFAULT_CRITICAL_PANEL_COLOR);
        this.leftTorsoPanel.setBackground(preferences.DEFAULT_CRITICAL_PANEL_COLOR);
        this.centerTorsoPanel.setBackground(preferences.DEFAULT_CRITICAL_PANEL_COLOR);
        this.headPanel.setBackground(preferences.DEFAULT_CRITICAL_PANEL_COLOR);
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
                this.rightArmPanel.setBackground(preferences.SELECTED_CRITICAL_PANEL_COLOR);
                this.rightArmPanel.setOpaque(true);
                break;
            }
            case 1: {
                this.leftArmPanel.setBackground(preferences.SELECTED_CRITICAL_PANEL_COLOR);
                this.leftArmPanel.setOpaque(true);
                break;
            }
            case 6: {
                this.rightLegPanel.setBackground(preferences.SELECTED_CRITICAL_PANEL_COLOR);
                this.rightLegPanel.setOpaque(true);
                break;
            }
            case 7: {
                this.leftLegPanel.setBackground(preferences.SELECTED_CRITICAL_PANEL_COLOR);
                this.leftLegPanel.setOpaque(true);
                break;
            }
            case 2: {
                this.rightTorsoPanel.setBackground(preferences.SELECTED_CRITICAL_PANEL_COLOR);
                this.rightTorsoPanel.setOpaque(true);
                break;
            }
            case 3: {
                this.leftTorsoPanel.setBackground(preferences.SELECTED_CRITICAL_PANEL_COLOR);
                this.leftTorsoPanel.setOpaque(true);
                break;
            }
            case 4: {
                this.centerTorsoPanel.setBackground(preferences.SELECTED_CRITICAL_PANEL_COLOR);
                this.centerTorsoPanel.setOpaque(true);
                break;
            }
            case 5: {
                this.headPanel.setBackground(preferences.SELECTED_CRITICAL_PANEL_COLOR);
                this.headPanel.setOpaque(true);
            }
        }
    }

    private void updateArmorLabelVisibility(final JProgressBar frontArmorProgressBar, final JProgressBar rearArmorProgressBar, final JProgressBar structureProgressBar) {
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

    private void updateArmorLabels(final JProgressBar frontArmorProgressBar, final JProgressBar structureProgressBar, final JProgressBar rearArmorProgressBar, final SectionType sectionIndex) {
        if (user.variant == null) {
            return;
        }
        
        frontArmorProgressBar.setMaximum(user.variant.sections.get(sectionIndex).maximumArmor);
        frontArmorProgressBar.setValue(user.variant.sections.get(sectionIndex).frontArmor);
        frontArmorProgressBar.setString("" + user.variant.sections.get(sectionIndex).frontArmor);
        structureProgressBar.setMaximum(user.variant.sections.get(sectionIndex).health);
        structureProgressBar.setValue(user.variant.sections.get(sectionIndex).health);
        structureProgressBar.setString("" + user.variant.sections.get(sectionIndex).health);
        if (sectionIndex.hasRear && rearArmorProgressBar != null) {
            rearArmorProgressBar.setMaximum(user.variant.sections.get(sectionIndex).maximumArmor);
            rearArmorProgressBar.setValue(user.variant.sections.get(sectionIndex).rearArmor);
            rearArmorProgressBar.setString("" + user.variant.sections.get(sectionIndex).rearArmor);
        }
    }
    
    private void updateHardpointMaximumOnlyLabel(final JLabel label, final HardpointType hardpointType, final Section section) {
        label.setText(String.format("%d %s", section.maximumHardpoints.get(hardpointType), hardpointType));
    }
    
    private void updateHardpointCountLabel(final JLabel label, final HardpointType hardpointType, final Section section) {
        label.setText(String.format("%d/%d %s", section.currentHardpoints.get(hardpointType), section.maximumHardpoints.get(hardpointType), hardpointType));
    }

    private void updateHardpointLabels(final Map<HardpointType, JLabel> labels, final SectionType sectionIndex) {
        boolean visibilityFlag;
        final Section section = user.variant != null ? user.variant.sections.get(sectionIndex) : null;
        
        if (section == null) {
            return;
        }
        
        switch (this.MechTabPane.getSelectedIndex()) {
            case 0: {
                visibilityFlag = true;
                
                labels.entrySet().forEach((labelEntry) -> {
                    updateHardpointMaximumOnlyLabel(labelEntry.getValue(), labelEntry.getKey(), section);
                });
                break;
            }
            case 1:
            case 2: {
                visibilityFlag = true;
                
                labels.entrySet().forEach((labelEntry) -> {
                    updateHardpointCountLabel(labelEntry.getValue(), labelEntry.getKey(), section);
                });
                
                break;
            }
            default: {
                visibilityFlag = false;
            }
        }
                
        labels.entrySet().forEach((labelEntry) -> {
            labelEntry.getValue().setVisible(visibilityFlag && section.maximumHardpoints.get(labelEntry.getKey()) > 0);
        });
    }

    private void updateTotalHardpoints() {
        if (user.variant == null) {
            return;
        }
        
        final Map<HardpointType, Integer> hardpointTotals = new HashMap<>();
        
        for (final HardpointType hardpointType : HardpointType.values()) {
            hardpointTotals.put(hardpointType, 0);
        }
        
        user.variant.updateMech();
        
        user.variant.sectionTypes.values().stream().filter((sectionBlueprint) -> !(sectionBlueprint == null)).forEachOrdered((sectionBlueprint) -> {
            for (final HardpointType hardpointType : HardpointType.values()) {
                Integer hardpointCount = sectionBlueprint.hardpoints.get(hardpointType);
                hardpointTotals.put(hardpointType, hardpointTotals.get(hardpointType) + (hardpointCount == null ? 0 : hardpointCount));
            }
        });

        //this.hardpointComponentPanel.Set_Total_Hardpoints(n, n2, n3, n4);
        
        this.ecmCapableLabel.setVisible(hardpointTotals.get(HardpointType.ECM) > 0);
        this.jumpCapableLabel.setVisible(user.variant.maximumJumpJets > 0);
        this.jumpDistanceProgressBar.setMaximum(user.variant.maximumJumpJets);
        this.jumpHeightProgressBar.setMaximum(user.variant.maximumJumpJets);
    }

    private void updateHardpoints() {
        this.updateHardpointLabels(ImmutableMap.<HardpointType, JLabel>builder().put(HardpointType.AMS, this.rightArmAMSHardpointLabel).put(HardpointType.ECM, this.rightArmECMHardpointLabel).put(HardpointType.BALLISTIC, this.rightArmBallisticHardpointLabel).put(HardpointType.ENERGY, this.rightArmEnergyHardpointLabel).put(HardpointType.MISSILE, this.rightArmMissileHardpointLabel).build(), SectionType.RIGHT_ARM);
        this.updateHardpointLabels(ImmutableMap.<HardpointType, JLabel>builder().put(HardpointType.AMS, this.leftArmAMSHardpointLabel).put(HardpointType.ECM, this.leftArmECMHardpointLabel).put(HardpointType.BALLISTIC, this.leftArmBallisticHardpointLabel).put(HardpointType.ENERGY, this.leftArmEnergyHardpointLabel).put(HardpointType.MISSILE, this.leftArmMissileHardpointLabel).build(), SectionType.LEFT_ARM);
        this.updateHardpointLabels(ImmutableMap.<HardpointType, JLabel>builder().put(HardpointType.AMS, this.rightLegAMSHardpointLabel).put(HardpointType.ECM, this.rightLegECMHardpointLabel).put(HardpointType.BALLISTIC, this.rightLegBallisticHardpointLabel).put(HardpointType.ENERGY, this.rightLegEnergyHardpointLabel).put(HardpointType.MISSILE, this.rightLegMissileHardpointLabel).build(), SectionType.RIGHT_LEG);
        this.updateHardpointLabels(ImmutableMap.<HardpointType, JLabel>builder().put(HardpointType.AMS, this.leftLegAMSHardpointLabel).put(HardpointType.ECM, this.leftLegECMHardpointLabel).put(HardpointType.BALLISTIC, this.leftLegBallisticHardpointLabel).put(HardpointType.ENERGY, this.leftLegEnergyHardpointLabel).put(HardpointType.MISSILE, this.leftLegMissileHardpointLabel).build(), SectionType.LEFT_LEG);
        this.updateHardpointLabels(ImmutableMap.<HardpointType, JLabel>builder().put(HardpointType.AMS, this.rightTorsoAMSHardpointLabel).put(HardpointType.ECM, this.rightTorsoECMHardpointLabel).put(HardpointType.BALLISTIC, this.rightTorsoBallisticHardpointLabel).put(HardpointType.ENERGY, this.rightTorsoEnergyHardpointLabel).put(HardpointType.MISSILE, this.rightTorsoMissileHardpointLabel).build(), SectionType.RIGHT_TORSO);
        this.updateHardpointLabels(ImmutableMap.<HardpointType, JLabel>builder().put(HardpointType.AMS, this.leftTorsoAMSHardpointLabel).put(HardpointType.ECM, this.leftTorsoECMHardpointLabel).put(HardpointType.BALLISTIC, this.leftTorsoBallisticHardpointLabel).put(HardpointType.ENERGY, this.leftTorsoEnergyHardpointLabel).put(HardpointType.MISSILE, this.leftTorsoMissileHardpointLabel).build(), SectionType.LEFT_TORSO);
        this.updateHardpointLabels(ImmutableMap.<HardpointType, JLabel>builder().put(HardpointType.AMS, this.centerTorsoAMSHardpointLabel).put(HardpointType.ECM, this.centerTorsoECMHardpointLabel).put(HardpointType.BALLISTIC, this.centerTorsoBallisticHardpointLabel).put(HardpointType.ENERGY, this.centerTorsoEnergyHardpointLabel).put(HardpointType.MISSILE, this.centerTorsoMissileHardpointLabel).build(), SectionType.CENTER_TORSO);
        this.updateHardpointLabels(ImmutableMap.<HardpointType, JLabel>builder().put(HardpointType.AMS, this.headAMSHardpointLabel).put(HardpointType.ECM, this.headECMHardpointLabel).put(HardpointType.BALLISTIC, this.headBallisticHardpointLabel).put(HardpointType.ENERGY, this.headEnergyHardpointLabel).put(HardpointType.MISSILE, this.headMissileHardpointLabel).build(), SectionType.HEAD);
        this.updateTotalHardpoints();
    }

    private void updateEngine() {
        if (user.variant == null || user.variant.engine == null) {
            return;
        }
        
        user.variant.currentEngineRating = (Integer) this.engineRatingSpinner.getValue();
        
        this.speedProgressBar.setValue(user.variant.currentEngineRating);
        this.speedProgressBar.setString(String.format("%.1f kph", user.variant.engine.getSpeed(user.variant.chassisType.tonnage, user.variant.currentEngineRating)));
        //this.enginePanelsSetEngine(user.variant.engine, user.variant.currentEngineRating);
    }

    private void updateHeatsinks() {
        int n = user.variant.engine.getHeatSinkCapacity(user.variant.currentEngineRating);
        for (Section section : user.variant.sections.values()) {
            for (int j = section.components.size() - 1; j >= 0; --j) {
                if (!section.components.get(j).itemType.equals("Heat Sink")) continue;
                if (n >= user.variant.currentHeatSinkCount) {
                    section.components.remove(j);
                    continue;
                }
                ++n;
            }
        }
        n = user.variant.currentHeatSinkCount - n;
        //this.heatSinkComponentPanel.setHeatsinks(user.variant.heatsinks, user.variant.currentEngineRating, user.variant.currentHeatSinkCount);
    }

    private void updateJumpjets() {
        /*this.JumpJetSpinner.setEnabled(user.variant.maximumJumpJets > 0);
        user.variant.currentJumpJets = (Integer) this.JumpJetSpinner.getValue();
        if (user.variant.currentJumpJets > user.variant.maximumJumpJets) {
            user.variant.currentJumpJets = user.variant.maximumJumpJets;
            this.JumpJetSpinnerModel.setValue(user.variant.currentJumpJets);
        }
        this.JumpJetSpinnerModel.setMaximum(Integer.valueOf(user.variant.maximumJumpJets));
        int n = 0;
        for (int i = queued_items.size() - 1; i >= 0; --i) {
            if (!((Crittable) queued_items.get((int) i)).itemType.equals("Jump Jet")) continue;
            if (n >= user.variant.currentJumpJets) {
                queued_items.remove(i);
                continue;
            }
            ++n;
        }
        for (Section section : user.variant.sections) {
            for (int j = section.components.size() - 1; j >= 0; --j) {
                if (!section.components.get(j).itemType.equals("Jump Jet")) continue;
                if (n >= user.variant.currentJumpJets) {
                    section.components.remove(j);
                    continue;
                }
                ++n;
            }
        }*/
        this.jumpDistanceProgressBar.setValue(user.variant.currentJumpJets);
        this.jumpHeightProgressBar.setValue(user.variant.currentJumpJets);
        //this.jumpjetComponentPanel.setJumpjets(user.variant.jumpjets, user.variant.currentJumpJets, user.variant.chassisType.tonnage);
        this.manueverabilityComponentPanel.setManueverability(user.variant);
    }

    private void updateArmor() {
        if (user.variant.armor == null) {
            return;
        }
        //this.ArmorPanel.setArmor(user.variant.armor, user.variant.GetCurrentArmorTotal());
        this.pointsPerTonAmountLabel.setText(String.format("%.2f", user.variant.armor.pointsPerTon));
        this.armorProgressBar.setString("" + user.variant.getCurrentArmorTotal());
        this.armorProgressBar.setValue(user.variant.getCurrentArmorTotal());
        this.updateArmorLabels(this.rightArmArmorProgressBar, null, this.rightArmStructureProgressBar, SectionType.RIGHT_ARM);
        this.updateArmorLabels(this.leftArmArmorProgressBar, null, this.leftArmStructureProgressBar, SectionType.LEFT_ARM);
        this.updateArmorLabels(this.rightLegArmorProgressBar, null, this.rightLegStructureProgressBar, SectionType.RIGHT_LEG);
        this.updateArmorLabels(this.leftLegArmorProgressBar, null, this.leftLegStructureProgressBar, SectionType.LEFT_LEG);
        this.updateArmorLabels(this.rightTorsoFrontArmorProgressBar, this.rightTorsoRearArmorProgressBar, this.rightTorsoStructureProgressBar, SectionType.RIGHT_TORSO);
        this.updateArmorLabels(this.leftTorsoFrontArmorProgressBar, this.leftTorsoRearArmorProgressBar, this.leftTorsoStructureProgressBar, SectionType.LEFT_TORSO);
        this.updateArmorLabels(this.centerTorsoFrontArmorProgressBar, this.centerTorsoRearArmorProgressBar, this.centerTorsoStructureProgressBar, SectionType.CENTER_TORSO);
        this.updateArmorLabels(this.headArmorProgressBar, null, this.headStructureProgressBar, SectionType.HEAD);
        this.rightArmArmorAmountLabel.setText(String.format("%d/%d", user.variant.sections.get(SectionType.RIGHT_ARM).frontArmor, user.variant.sections.get(SectionType.RIGHT_ARM).maximumArmor));
        this.leftArmArmorAmountLabel.setText(String.format("%d/%d", user.variant.sections.get(SectionType.LEFT_ARM).frontArmor, user.variant.sections.get(SectionType.LEFT_ARM).maximumArmor));
        this.rightTorsoArmorAmountLabel.setText(String.format("%d/%d", user.variant.sections.get(SectionType.RIGHT_TORSO).frontArmor + user.variant.sections.get(SectionType.RIGHT_TORSO).rearArmor, user.variant.sections.get(SectionType.RIGHT_TORSO).maximumArmor));
        this.leftTorsoArmorAmountLabel.setText(String.format("%d/%d", user.variant.sections.get(SectionType.LEFT_TORSO).frontArmor + user.variant.sections.get(SectionType.LEFT_TORSO).rearArmor, user.variant.sections.get(SectionType.LEFT_TORSO).maximumArmor));
        this.centerTorsoArmorAmountLabel.setText(String.format("%d/%d", user.variant.sections.get(SectionType.CENTER_TORSO).frontArmor + user.variant.sections.get(SectionType.CENTER_TORSO).rearArmor, user.variant.sections.get(SectionType.CENTER_TORSO).maximumArmor));
        this.headArmorAmountLabel.setText(String.format("%d/%d", user.variant.sections.get(SectionType.HEAD).frontArmor, user.variant.sections.get(SectionType.HEAD).maximumArmor));
        this.rightLegArmorAmountLabel.setText(String.format("%d/%d", user.variant.sections.get(SectionType.RIGHT_LEG).frontArmor, user.variant.sections.get(SectionType.RIGHT_LEG).maximumArmor));
        this.leftLegArmorAmountLabel.setText(String.format("%d/%d", user.variant.sections.get(SectionType.LEFT_LEG).frontArmor, user.variant.sections.get(SectionType.LEFT_LEG).maximumArmor));
        this.totalArmorAmountLabel.setText(String.format("%d/%d", user.variant.getCurrentArmorTotal(), user.variant.getMaximumArmorTotal()));
    }

    private void updateSpeed() {
        this.speedProgressBar.setString(String.format("%.1f kph", user.variant.engine.getSpeed(user.variant.chassisType.tonnage, user.variant.currentEngineRating)));
        this.speedComponentPanel.setSpeedLimits(user, 16.2, 0.0);
    }

    private void updateWeapons() {
        WeaponBlueprint weaponBlueprint;
        
        double d = 0.0;
        double d2 = 0.0;
        double d3 = 0.0;
        double d4 = 0.0;
        double d5 = user.variant.heatsinks.getDissipation(user.variant.currentHeatSinkCount, user.variant.currentEngineRating);
        double d6 = user.variant.heatsinks.getThreshold(user.variant.currentHeatSinkCount);
        
        int n = 1000;
        int n2 = 0;
        int n3 = 0;
        
        for (Section section2 : user.variant.sections.values()) {
            for (Crittable crittable3 : section2.components) {
                if (!crittable3.itemType.equals("Weapon")) continue;
                weaponBlueprint = (WeaponBlueprint) crittable3.reference;
                d += weaponBlueprint.getEffectiveDamage();
                d2 += weaponBlueprint.heat;
                d3 += weaponBlueprint.getDPS(0.0);
                d4 += weaponBlueprint.getHPS(0.0);
            }
        }
        
        for (Section section2 : user.variant.sections.values()) {
            for (Crittable crittable3 : section2.components) {
                if (!crittable3.itemType.equals("Weapon")) continue;
                weaponBlueprint = (WeaponBlueprint) crittable3.reference;
                n3 = (int) ((double) n3 + (double) weaponBlueprint.effective_range * (weaponBlueprint.getDPS(0.0) / d3));
            }
        }
        
        for (Section section2 : user.variant.sections.values()) {
            for (Crittable crittable3 : section2.components) {
                if (!crittable3.itemType.equals("Weapon")) continue;
                weaponBlueprint = (WeaponBlueprint) crittable3.reference;
                int temp_int = Math.abs(weaponBlueprint.effective_range - n3);
                if (temp_int >= n) continue;
                n = temp_int;
                n2 = weaponBlueprint.effective_range;
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

    private void updateCriticals() {
        this.updateCriticals(this.rightArmCriticalList, SectionType.RIGHT_ARM);
        this.updateCriticals(this.leftArmCriticalList, SectionType.LEFT_ARM);
        this.updateCriticals(this.rightLegCriticalList, SectionType.RIGHT_LEG);
        this.updateCriticals(this.leftLegCriticalList, SectionType.LEFT_LEG);
        this.updateCriticals(this.rightTorsoCriticalList, SectionType.RIGHT_TORSO);
        this.updateCriticals(this.leftTorsoCriticalList, SectionType.LEFT_TORSO);
        this.updateCriticals(this.centerTorsoCriticalList, SectionType.CENTER_TORSO);
        this.updateCriticals(this.headCriticalList, SectionType.HEAD);
        user.variant.calculateCriticals();
        
        int temp_int = 0;
        
        this.criticalsProgressBar.setValue(user.variant.currentCriticals + temp_int);
        this.criticalsProgressBar.setString(String.format("%d/%d", user.variant.currentCriticals + temp_int, 78));
    }

    public void updateCriticals(final JList jList, final SectionType sectionType) {
        if (user.variant == null || user.variant.sections.isEmpty()) {
            return;
        }
        
        DefaultListModel<String> defaultListModel = new DefaultListModel<String>();
        for (Crittable crittable : user.variant.sections.get(sectionType).components) {
            for (int i = 0; i < crittable.criticals; ++i) {
                if (i == 0) {
                    defaultListModel.addElement(crittable.toString());
                    continue;
                }
                defaultListModel.addElement("----------");
            }
        }
        int n2 = user.variant.sections.get(sectionType).maximumCriticals - user.variant.sections.get(sectionType).currentCriticals;
        for (int i = 0; i < n2; ++i) {
            defaultListModel.addElement("-Empty-");
        }
        jList.setModel(defaultListModel);
    }

    private void updateTonnage() {
        user.variant.calculateTonnage();
        double temp_double = 0.0;
        
        this.tonnageProgressBar.setValue((int) Math.ceil(user.variant.currentTonnage + temp_double));
        this.tonnageProgressBar.setString(String.format("%.2f Tons", user.variant.currentTonnage + temp_double));
    }

    private void updateArmorSpinners(final SectionType sectionIndex) {
        int temp_int;
        
        switch (sectionIndex) {
            case HEAD: {
                user.variant.sections.get(sectionIndex).frontArmor = (Integer) this.headSpinner.getValue();
                break;
            }
            case RIGHT_TORSO: {
                user.variant.sections.get(sectionIndex).frontArmor = (Integer) this.rightTorsoSpinner.getValue();
                user.variant.sections.get(sectionIndex).rearArmor = (Integer) this.rightRearTorsoSpinner.getValue();
                temp_int = user.variant.sections.get(sectionIndex).maximumArmor - user.variant.sections.get(sectionIndex).rearArmor - user.variant.sections.get(sectionIndex).frontArmor;
                this.rightTorsoSpinnerModel.setMaximum(user.variant.sections.get(sectionIndex).frontArmor + temp_int);
                this.rightRearTorsoSpinnerModel.setMaximum(user.variant.sections.get(sectionIndex).rearArmor + temp_int);
                break;
            }
            case LEFT_TORSO: {
                user.variant.sections.get(sectionIndex).frontArmor = (Integer) this.leftTorsoSpinner.getValue();
                user.variant.sections.get(sectionIndex).rearArmor = (Integer) this.leftRearTorsoSpinner.getValue();
                temp_int = user.variant.sections.get(sectionIndex).maximumArmor - user.variant.sections.get(sectionIndex).rearArmor - user.variant.sections.get(sectionIndex).frontArmor;
                this.leftTorsoSpinnerModel.setMaximum(user.variant.sections.get(sectionIndex).frontArmor + temp_int);
                this.leftRearTorsoSpinnerModel.setMaximum(user.variant.sections.get(sectionIndex).rearArmor + temp_int);
                break;
            }
            case CENTER_TORSO: {
                user.variant.sections.get(sectionIndex).frontArmor = (Integer) this.centerTorsoSpinner.getValue();
                user.variant.sections.get(sectionIndex).rearArmor = (Integer) this.centerRearTorsoSpinner.getValue();
                temp_int = user.variant.sections.get(sectionIndex).maximumArmor - user.variant.sections.get(sectionIndex).rearArmor - user.variant.sections.get(sectionIndex).frontArmor;
                this.centerTorsoSpinnerModel.setMaximum(user.variant.sections.get(sectionIndex).frontArmor + temp_int);
                this.centerRearTorsoSpinnerModel.setMaximum(user.variant.sections.get(sectionIndex).rearArmor + temp_int);
                break;
            }
            case RIGHT_ARM: {
                user.variant.sections.get(sectionIndex).frontArmor = (Integer) this.rightArmSpinner.getValue();
                break;
            }
            case LEFT_ARM: {
                user.variant.sections.get(sectionIndex).frontArmor = (Integer) this.leftArmSpinner.getValue();
                break;
            }
            case RIGHT_LEG: {
                user.variant.sections.get(sectionIndex).frontArmor = (Integer) this.rightLegSpinner.getValue();
                break;
            }
            case LEFT_LEG: {
                user.variant.sections.get(sectionIndex).frontArmor = (Integer) this.leftLegSpinner.getValue();
                break;
            }
        }
        this.updateArmor();
        this.updateTonnage();
    }

    private class MechCriticalRenderer extends DefaultListCellRenderer {
        private final SectionType sectionIndex;

        MechCriticalRenderer(SectionType sectionIndex) {
            this.sectionIndex = sectionIndex;
        }

        @Override
        public JLabel getListCellRendererComponent(JList jList, Object object, int n, boolean bl, boolean bl2) {
            final JLabel jLabel = (JLabel) super.getListCellRendererComponent(jList, object, n, bl, bl2);
            
            int n2 = -1;
            int n3 = -1;
            
            jLabel.setBackground(preferences.EMPTY_CRITICAL_BG);
            jLabel.setForeground(preferences.EMPTY_CRITICAL_FG);
            jLabel.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
            
            final Section section = user.variant != null ? user.variant.sections.get(sectionIndex) : null;
            
            if (section == null) {
                return jLabel;
            }
                 
            int i = 0;
            
            for (Crittable crittable : section.components) {
                for (int j = 0; j < crittable.criticals; ++j) {
                    if (n == ++n2) {
                        break;
                    }
                }
                
                n3 += crittable.criticals;
                
                if (n != n2) {
                    i++;
                } else {
                    n2 = i;
                    break;
                }
            }
            
            if (n3 < n) {
                n2 = -1;
            }
            
            if (n2 < section.components.size() && n2 > -1) {
                if (section.components.get(n2).isLocked) {
                    if (bl && jList.hasFocus()) {
                        jLabel.setBackground(preferences.LOCKED_CRITICAL_FG);
                        jLabel.setForeground(preferences.LOCKED_CRITICAL_BG);
                    } else {
                        jLabel.setBackground(preferences.LOCKED_CRITICAL_BG);
                        jLabel.setForeground(preferences.LOCKED_CRITICAL_FG);
                    }
                } else {
                    Color color = section.components.get(n2).hardpointType.equals(HardpointType.values()[0]) ? preferences.BALLISTIC_COLOR : (section.components.get(n2).hardpointType.equals(HardpointType.values()[1]) ? preferences.ENERGY_COLOR : (section.components.get(n2).hardpointType.equals(HardpointType.values()[2]) ? preferences.MISSILE_COLOR : (section.components.get(n2).hardpointType.equals(HardpointType.values()[3]) ? preferences.AMS_COLOR : (section.components.get(n2).hardpointType.equals(HardpointType.values()[4]) ? preferences.ECM_COLOR : preferences.NORMAL_CRITICAL_BG))));
                    if (bl && jList.hasFocus()) {
                        jLabel.setBackground(preferences.NORMAL_CRITICAL_FG);
                        jLabel.setForeground(color);
                    } else {
                        jLabel.setBackground(color);
                        jLabel.setForeground(preferences.NORMAL_CRITICAL_FG);
                    }
                    if (section.components.get(n2).criticals > 1 && n3 != n) {
                        jLabel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.BLACK));
                    } else if (user.variant.sections.get(sectionIndex).components.get(n2).criticals > 1 && n3 == n) {
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
    private JToggleButton FrankenmechToggle;
    private JToggleButton FuturetechToggle;
    private javax.swing.JPanel InformationSpecificationsPanel;
    private javax.swing.JTabbedPane InformationTabbedPane;
    private javax.swing.JTabbedPane MechTabPane;
    private JToggleButton MixtechToggle;
    private javax.swing.JPanel ModelOverviewPanel;
    private javax.swing.JPanel ModelSpecificationsPanel;
    private JToggleButton OmniRestrictionsToggle;
    private javax.swing.JPanel OptionsPanel;
    private javax.swing.JPanel SystemsPanel;
    private javax.swing.JPanel UpgradesPanel;
    private javax.swing.JScrollPane UpgradesScrollPane;
    private javax.swing.JPanel WeaponsPanel;
    private JProgressBar alphaDamageProgressBar;
    private JProgressBar alphaHeatProgressBar;
    private JComboBox<String> armorComboBox;
    private JProgressBar armorProgressBar;
    private javax.swing.JSpinner centerRearTorsoSpinner;
    private JLabel centerTorsoAMSHardpointLabel;
    private JLabel centerTorsoArmorAmountLabel;
    private JLabel centerTorsoBallisticHardpointLabel;
    private JList<String> centerTorsoCriticalList;
    private JLabel centerTorsoECMHardpointLabel;
    private JLabel centerTorsoEnergyHardpointLabel;
    private JProgressBar centerTorsoFrontArmorProgressBar;
    private JLabel centerTorsoMissileHardpointLabel;
    private JComboBox<String> centerTorsoOmnipodComboBox;
    private javax.swing.JPanel centerTorsoPanel;
    private JProgressBar centerTorsoRearArmorProgressBar;
    private javax.swing.JSpinner centerTorsoSpinner;
    private JProgressBar centerTorsoStructureProgressBar;
    private JComboBox<String> chassisComboBox;
    private javax.swing.JButton clearArmorButton;
    private JComboBox<String> cockpitComboBox;
    private javax.swing.JPanel componentsPanel;
    private javax.swing.JScrollPane componentsScrollPane;
    private JProgressBar criticalsProgressBar;
    private javax.swing.JScrollPane descriptionScrollPane;
    private javax.swing.JTextArea descriptionTextArea;
    private JLabel ecmCapableLabel;
    private javax.swing.JButton efficientArmorButton;
    private JComboBox<String> engineComboBox;
    private javax.swing.JSpinner engineRatingSpinner;
    private javax.swing.JButton exportButton;
    private JProgressBar firepowerProgressBar;
    private JComboBox<String> gyroComboBox;
    private com.github.majora_incarnate.mwo.mechbay.mechlab.ComponentPanel hardpointComponentPanel;
    private JLabel headAMSHardpointLabel;
    private JLabel headArmorAmountLabel;
    private JProgressBar headArmorProgressBar;
    private JLabel headBallisticHardpointLabel;
    private JList<String> headCriticalList;
    private JLabel headECMHardpointLabel;
    private JLabel headEnergyHardpointLabel;
    private JLabel headMissileHardpointLabel;
    private JComboBox<String> headOmnipodComboBox;
    private javax.swing.JPanel headPanel;
    private javax.swing.JSpinner headSpinner;
    private JProgressBar headStructureProgressBar;
    private JProgressBar heatEfficiencyProgressBar;
    private JComboBox<String> heatSinkComboBox;
    private javax.swing.JButton importButton;
    private JLabel jLabel21;
    private JLabel jLabel22;
    private JLabel jLabel23;
    private JLabel jLabel24;
    private JLabel jLabel25;
    private JLabel jLabel29;
    private JLabel jLabel33;
    private JLabel jLabel37;
    private JLabel jLabel41;
    private JLabel jLabel45;
    private JLabel jLabel49;
    private JLabel jLabel50;
    private JLabel jLabel51;
    private JLabel jLabel55;
    private JLabel jumpCapableLabel;
    private JProgressBar jumpDistanceProgressBar;
    private JProgressBar jumpHeightProgressBar;
    private JComboBox<String> jumpJetComboBox;
    private JLabel leftArmAMSHardpointLabel;
    private JLabel leftArmArmorAmountLabel;
    private JProgressBar leftArmArmorProgressBar;
    private JLabel leftArmBallisticHardpointLabel;
    private JList<String> leftArmCriticalList;
    private JLabel leftArmECMHardpointLabel;
    private JLabel leftArmEnergyHardpointLabel;
    private JLabel leftArmMissileHardpointLabel;
    private JComboBox<String> leftArmOmnipodComboBox;
    private javax.swing.JPanel leftArmPanel;
    private javax.swing.JSpinner leftArmSpinner;
    private JProgressBar leftArmStructureProgressBar;
    private JToggleButton leftHandToggleButton;
    private JLabel leftLegAMSHardpointLabel;
    private JLabel leftLegArmorAmountLabel;
    private JProgressBar leftLegArmorProgressBar;
    private JLabel leftLegBallisticHardpointLabel;
    private JList<String> leftLegCriticalList;
    private JLabel leftLegECMHardpointLabel;
    private JLabel leftLegEnergyHardpointLabel;
    private JLabel leftLegMissileHardpointLabel;
    private JComboBox<String> leftLegOmnipodComboBox;
    private javax.swing.JPanel leftLegPanel;
    private javax.swing.JSpinner leftLegSpinner;
    private JProgressBar leftLegStructureProgressBar;
    private JToggleButton leftLowerArmToggleButton;
    private javax.swing.JSpinner leftRearTorsoSpinner;
    private JLabel leftTorsoAMSHardpointLabel;
    private JLabel leftTorsoArmorAmountLabel;
    private JLabel leftTorsoBallisticHardpointLabel;
    private JToggleButton leftTorsoCASEToggleButton;
    private JList<String> leftTorsoCriticalList;
    private JLabel leftTorsoECMHardpointLabel;
    private JLabel leftTorsoEnergyHardpointLabel;
    private JProgressBar leftTorsoFrontArmorProgressBar;
    private JLabel leftTorsoMissileHardpointLabel;
    private JComboBox<String> leftTorsoOmnipodComboBox;
    private javax.swing.JPanel leftTorsoPanel;
    private JProgressBar leftTorsoRearArmorProgressBar;
    private javax.swing.JSpinner leftTorsoSpinner;
    private JProgressBar leftTorsoStructureProgressBar;
    private javax.swing.JButton loadButton;
    private com.github.majora_incarnate.mwo.mechbay.mechlab.ComponentPanel manueverabilityComponentPanel;
    private javax.swing.JButton maximumArmorButton;
    private javax.swing.JPanel mechPanel;
    private JLabel mechTypeLabel;
    private JComboBox<String> modelComboBox;
    private com.github.majora_incarnate.mwo.mechbay.mechlab.ComponentPanel movementRangeComponentPanel;
    private com.github.majora_incarnate.mwo.mechbay.mechlab.ComponentPanel movementSpeedComponentPanel;
    private JComboBox<String> myomerComboBox;
    private com.github.majora_incarnate.mwo.mechbay.mechlab.ComponentPanel overviewComponentPanel;
    private JLabel pointsPerTonAmountLabel;
    private JLabel pointsPerTonLabel;
    private javax.swing.JScrollPane quirksJScrollPane;
    private javax.swing.JTextArea quirksJTextArea;
    private javax.swing.JPanel quirksPanel;
    private JProgressBar rangeProgressBar;
    private JLabel rightArmAMSHardpointLabel;
    private JLabel rightArmArmorAmountLabel;
    private JProgressBar rightArmArmorProgressBar;
    private JLabel rightArmBallisticHardpointLabel;
    private JList<String> rightArmCriticalList;
    private JLabel rightArmECMHardpointLabel;
    private JLabel rightArmEnergyHardpointLabel;
    private JLabel rightArmMissileHardpointLabel;
    private JComboBox<String> rightArmOmnipodComboBox;
    private javax.swing.JPanel rightArmPanel;
    private javax.swing.JSpinner rightArmSpinner;
    private JProgressBar rightArmStructureProgressBar;
    private JToggleButton rightHandToggleButton;
    private JLabel rightLegAMSHardpointLabel;
    private JLabel rightLegArmorAmountLabel;
    private JProgressBar rightLegArmorProgressBar;
    private JLabel rightLegBallisticHardpointLabel;
    private JList<String> rightLegCriticalList;
    private JLabel rightLegECMHardpointLabel;
    private JLabel rightLegEnergyHardpointLabel;
    private JLabel rightLegMissileHardpointLabel;
    private JComboBox<String> rightLegOmnipodComboBox;
    private javax.swing.JPanel rightLegPanel;
    private javax.swing.JSpinner rightLegSpinner;
    private JProgressBar rightLegStructureProgressBar;
    private JToggleButton rightLowerArmToggleButton;
    private javax.swing.JSpinner rightRearTorsoSpinner;
    private JLabel rightTorsoAMSHardpointLabel;
    private JLabel rightTorsoArmorAmountLabel;
    private JLabel rightTorsoBallisticHardpointLabel;
    private JToggleButton rightTorsoCASEToggleButton;
    private JList<String> rightTorsoCriticalList;
    private JLabel rightTorsoECMHardpointLabel;
    private JLabel rightTorsoEnergyHardpointLabel;
    private JProgressBar rightTorsoFrontArmorProgressBar;
    private JLabel rightTorsoMissileHardpointLabel;
    private JComboBox<String> rightTorsoOmnipodComboBox;
    private javax.swing.JPanel rightTorsoPanel;
    private JProgressBar rightTorsoRearArmorProgressBar;
    private javax.swing.JSpinner rightTorsoSpinner;
    private JProgressBar rightTorsoStructureProgressBar;
    private javax.swing.JButton saveButton;
    private javax.swing.JTabbedPane secondaryTabbedPane;
    private JLabel section1AMSHardpointLabel;
    private JProgressBar section1ArmorProgressBar;
    private JLabel section1BallisticHardpointLabel;
    private JList<String> section1CriticalList;
    private JLabel section1ECMHardpointLabel;
    private JLabel section1EnergyHardpointLabel;
    private JLabel section1MissileHardpointLabel;
    private JComboBox<String> section1OmnipodComboBox;
    private JProgressBar section1StructureProgressBar;
    private JLabel section2AMSHardpointLabel;
    private JProgressBar section2ArmorProgressBar;
    private JLabel section2BallisticHardpointLabel;
    private JList<String> section2CriticalList;
    private JLabel section2ECMHardpointLabel;
    private JLabel section2EnergyHardpointLabel;
    private JLabel section2MissileHardpointLabel;
    private JComboBox<String> section2OmnipodComboBox;
    private JProgressBar section2StructureProgressBar;
    private JLabel special1ArmorAmountLabel;
    private javax.swing.JPanel special1Panel;
    private javax.swing.JSpinner special1Spinner;
    private JLabel special2ArmorAmountLabel;
    private javax.swing.JPanel special2Panel;
    private javax.swing.JSpinner special2Spinner;
    private com.github.majora_incarnate.mwo.mechbay.mechlab.ComponentPanel speedComponentPanel;
    private JProgressBar speedProgressBar;
    private javax.swing.JPanel statisticsPanel;
    private JComboBox<String> structureComboBox;
    private JLabel techBaseLabel;
    private javax.swing.JButton tonnageArmorButton;
    private JProgressBar tonnageProgressBar;
    private JLabel totalArmorAmountLabel;
    private JLabel totalArmorLabel;
    private JLabel unconfirmedLabel;
    private JLabel unreleasedLabel;
    private JLabel variantCostLabel;
    private javax.swing.JTextField variantNameField;
    // End of variables declaration
}
