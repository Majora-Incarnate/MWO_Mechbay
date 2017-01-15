/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.majora_incarnate.mwo.mechbay.mechlab;

import com.github.majora_incarnate.mwo.mechbay.entities.Crittable;
import com.github.majora_incarnate.mwo.mechbay.entities.Database;
import com.github.majora_incarnate.mwo.mechbay.entities.Preferences;
import com.github.majora_incarnate.mwo.mechbay.entities.Section;
import com.github.majora_incarnate.mwo.mechbay.entities.User;
import com.github.majora_incarnate.mwo.mechbay.entities.Variant;
import com.github.majora_incarnate.mwo.mechbay.entities.blueprints.Blueprint;
import com.github.majora_incarnate.mwo.mechbay.entities.blueprints.ChassisBlueprint;
import com.github.majora_incarnate.mwo.mechbay.entities.blueprints.ModelBlueprint;
import com.github.majora_incarnate.mwo.mechbay.entities.blueprints.WeaponBlueprint;
import com.github.majora_incarnate.mwo.mechbay.entities.enums.CriticalType;
import com.github.majora_incarnate.mwo.mechbay.entities.enums.HardpointType;
import com.github.majora_incarnate.mwo.mechbay.entities.enums.MechType;
import com.github.majora_incarnate.mwo.mechbay.entities.enums.SectionType;
import com.github.majora_incarnate.mwo.mechbay.entities.enums.TechBase;
import com.google.common.collect.ImmutableMap;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;
import javax.swing.AbstractListModel;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author quicksilver
 */
public class MechlabPanel extends JPanel {
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
    public MechlabPanel(final Preferences preferences, final Database masterDatabase) {
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
        GridBagConstraints gridBagConstraints;

        MechTabPane = new JTabbedPane();
        ChassisPanel = new JPanel();
        loadButton = new JButton();
        saveButton = new JButton();
        importButton = new JButton();
        exportButton = new JButton();
        chassisComboBox = new JComboBox<>();
        modelComboBox = new JComboBox<>();
        variantNameField = new JTextField();
        variantCostLabel = new JLabel();
        techBaseLabel = new JLabel();
        mechTypeLabel = new JLabel();
        unreleasedLabel = new JLabel();
        unconfirmedLabel = new JLabel();
        ecmCapableLabel = new JLabel();
        jumpCapableLabel = new JLabel();
        UpgradesScrollPane = new JScrollPane();
        UpgradesPanel = new JPanel();
        AdjustmentsPanel = new JPanel();
        engineRatingSpinner = new JSpinner();
        SystemsPanel = new JPanel();
        engineComboBox = new JComboBox<>();
        structureComboBox = new JComboBox<>();
        armorComboBox = new JComboBox<>();
        gyroComboBox = new JComboBox<>();
        cockpitComboBox = new JComboBox<>();
        heatSinkComboBox = new JComboBox<>();
        myomerComboBox = new JComboBox<>();
        jumpJetComboBox = new JComboBox<>();
        EfficienciesPanel = new JPanel();
        WeaponsPanel = new JPanel();
        ArmorPanel = new JPanel();
        armorPointsPerTonTitle = new JLabel();
        armorPointsPerTonLabel = new JLabel();
        maximumArmorButton = new JButton();
        clearArmorButton = new JButton();
        efficientArmorButton = new JButton();
        tonnageArmorButton = new JButton();
        armorSectionTitle = new JLabel();
        armorFrontTitle = new JLabel();
        armorRearTitle = new JLabel();
        armorAmountTitle = new JLabel();
        armorSection1Title = new JLabel();
        headArmorAmountLabel = new JLabel();
        armorSection2Title = new JLabel();
        centerTorsoArmorAmountLabel = new JLabel();
        armorSection3Title = new JLabel();
        rightTorsoArmorAmountLabel = new JLabel();
        armorSection4Title = new JLabel();
        leftTorsoArmorAmountLabel = new JLabel();
        armorSection5Title = new JLabel();
        rightArmArmorAmountLabel = new JLabel();
        armorSection6Title = new JLabel();
        leftArmArmorAmountLabel = new JLabel();
        armorSection7Title = new JLabel();
        rightLegArmorAmountLabel = new JLabel();
        armorSection8Title = new JLabel();
        leftLegArmorAmountLabel = new JLabel();
        armorSection9Title = new JLabel();
        special1ArmorAmountLabel = new JLabel();
        armorSection10Title = new JLabel();
        special2ArmorAmountLabel = new JLabel();
        armorTotalTitle = new JLabel();
        armorTotalLabel = new JLabel();
        centerTorsoSpinner = new JSpinner();
        centerRearTorsoSpinner = new JSpinner();
        rightTorsoSpinner = new JSpinner();
        rightRearTorsoSpinner = new JSpinner();
        leftTorsoSpinner = new JSpinner();
        leftRearTorsoSpinner = new JSpinner();
        headSpinner = new JSpinner();
        rightArmSpinner = new JSpinner();
        leftArmSpinner = new JSpinner();
        leftLegSpinner = new JSpinner();
        rightLegSpinner = new JSpinner();
        special1Spinner = new JSpinner();
        special2Spinner = new JSpinner();
        statisticsPanel = new JPanel();
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
        mechPanel = new JPanel();
        headPanel = new JPanel();
        headOmnipodComboBox = new JComboBox<>();
        headAMSHardpointLabel = new JLabel();
        headECMHardpointLabel = new JLabel();
        headEnergyHardpointLabel = new JLabel();
        headBallisticHardpointLabel = new JLabel();
        headMissileHardpointLabel = new JLabel();
        headStructureProgressBar = new JProgressBar();
        headArmorProgressBar = new JProgressBar();
        headCriticalList = new JList<>();
        centerTorsoPanel = new JPanel();
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
        leftTorsoPanel = new JPanel();
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
        rightTorsoPanel = new JPanel();
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
        leftLegPanel = new JPanel();
        leftLegOmnipodComboBox = new JComboBox<>();
        leftLegBallisticHardpointLabel = new JLabel();
        leftLegEnergyHardpointLabel = new JLabel();
        leftLegAMSHardpointLabel = new JLabel();
        leftLegECMHardpointLabel = new JLabel();
        leftLegMissileHardpointLabel = new JLabel();
        leftLegStructureProgressBar = new JProgressBar();
        leftLegArmorProgressBar = new JProgressBar();
        leftLegCriticalList = new JList<>();
        rightLegPanel = new JPanel();
        rightLegOmnipodComboBox = new JComboBox<>();
        rightLegBallisticHardpointLabel = new JLabel();
        rightLegEnergyHardpointLabel = new JLabel();
        rightLegAMSHardpointLabel = new JLabel();
        rightLegECMHardpointLabel = new JLabel();
        rightLegMissileHardpointLabel = new JLabel();
        rightLegStructureProgressBar = new JProgressBar();
        rightLegArmorProgressBar = new JProgressBar();
        rightLegCriticalList = new JList<>();
        leftArmPanel = new JPanel();
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
        rightArmPanel = new JPanel();
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
        special1Panel = new JPanel();
        section1OmnipodComboBox = new JComboBox<>();
        section1AMSHardpointLabel = new JLabel();
        section1ECMHardpointLabel = new JLabel();
        section1EnergyHardpointLabel = new JLabel();
        section1BallisticHardpointLabel = new JLabel();
        section1MissileHardpointLabel = new JLabel();
        section1StructureProgressBar = new JProgressBar();
        section1ArmorProgressBar = new JProgressBar();
        section1CriticalList = new JList<>();
        special2Panel = new JPanel();
        section2OmnipodComboBox = new JComboBox<>();
        section2AMSHardpointLabel = new JLabel();
        section2ECMHardpointLabel = new JLabel();
        section2EnergyHardpointLabel = new JLabel();
        section2BallisticHardpointLabel = new JLabel();
        section2MissileHardpointLabel = new JLabel();
        section2StructureProgressBar = new JProgressBar();
        section2ArmorProgressBar = new JProgressBar();
        section2CriticalList = new JList<>();
        secondaryTabbedPane = new JTabbedPane();
        quirksPanel = new JPanel();
        quirksJScrollPane = new JScrollPane();
        quirksJTextArea = new JTextArea();
        componentsScrollPane = new JScrollPane();
        componentsPanel = new JPanel();
        engineComponentPanel = new ComponentPanel();
        heatsinkComponentPanel = new ComponentPanel();
        structureComponentPanel = new ComponentPanel();
        armorComponentPanel = new ComponentPanel();
        gyroComponentPanel = new ComponentPanel();
        myomerComponentPanel = new ComponentPanel();
        jumpjetComponentPanel = new ComponentPanel();
        cockpitComponentPanel = new ComponentPanel();
        InformationTabbedPane = new JTabbedPane();
        ModelOverviewPanel = new JPanel();
        descriptionScrollPane = new JScrollPane();
        descriptionTextArea = new JTextArea();
        overviewComponentPanel = new ComponentPanel();
        hardpointComponentPanel = new ComponentPanel();
        ModelSpecificationsPanel = new JPanel();
        speedComponentPanel = new ComponentPanel();
        manueverabilityComponentPanel = new ComponentPanel();
        movementRangeComponentPanel = new ComponentPanel();
        movementSpeedComponentPanel = new ComponentPanel();
        InformationSpecificationsPanel = new JPanel();
        EquipmentSpecificationsPanel = new JPanel();
        OptionsPanel = new JPanel();
        FeaturesPanel = new JPanel();
        FrankenmechToggle = new JToggleButton();
        MixtechToggle = new JToggleButton();
        FuturetechToggle = new JToggleButton();
        OmniRestrictionsToggle = new JToggleButton();

        FormListener formListener = new FormListener();

        setMinimumSize(new Dimension(1280, 700));
        setName("Form"); // NOI18N
        setPreferredSize(new Dimension(1280, 700));
        setLayout(new GridBagLayout());

        MechTabPane.setMinimumSize(new Dimension(320, 470));
        MechTabPane.setName("MechTabPane"); // NOI18N
        MechTabPane.setPreferredSize(new Dimension(320, 470));
        MechTabPane.addChangeListener(formListener);

        ChassisPanel.setName("ChassisPanel"); // NOI18N
        ChassisPanel.setLayout(new GridBagLayout());

        loadButton.setText("Load");
        loadButton.setAlignmentY(0.0F);
        loadButton.setEnabled(false);
        loadButton.setHorizontalTextPosition(SwingConstants.CENTER);
        loadButton.setMaximumSize(new Dimension(39, 20));
        loadButton.setMinimumSize(new Dimension(39, 20));
        loadButton.setName("loadButton"); // NOI18N
        loadButton.setPreferredSize(new Dimension(39, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(10, 10, 10, 10);
        ChassisPanel.add(loadButton, gridBagConstraints);

        saveButton.setText("Save");
        saveButton.setAlignmentY(0.0F);
        saveButton.setEnabled(false);
        saveButton.setHorizontalTextPosition(SwingConstants.CENTER);
        saveButton.setMaximumSize(new Dimension(39, 20));
        saveButton.setMinimumSize(new Dimension(39, 20));
        saveButton.setName("saveButton"); // NOI18N
        saveButton.setPreferredSize(new Dimension(39, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(10, 10, 10, 10);
        ChassisPanel.add(saveButton, gridBagConstraints);

        importButton.setText("Import");
        importButton.setAlignmentY(0.0F);
        importButton.setEnabled(false);
        importButton.setHorizontalTextPosition(SwingConstants.CENTER);
        importButton.setMaximumSize(new Dimension(39, 20));
        importButton.setMinimumSize(new Dimension(39, 20));
        importButton.setName("importButton"); // NOI18N
        importButton.setPreferredSize(new Dimension(39, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(10, 10, 10, 10);
        ChassisPanel.add(importButton, gridBagConstraints);

        exportButton.setText("Export");
        exportButton.setAlignmentY(0.0F);
        exportButton.setEnabled(false);
        exportButton.setHorizontalTextPosition(SwingConstants.CENTER);
        exportButton.setMaximumSize(new Dimension(39, 20));
        exportButton.setMinimumSize(new Dimension(39, 20));
        exportButton.setName("exportButton"); // NOI18N
        exportButton.setPreferredSize(new Dimension(39, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(10, 10, 10, 10);
        ChassisPanel.add(exportButton, gridBagConstraints);

        chassisComboBox.setModel(new DefaultComboBoxModel(masterDatabase.CHASSIS_BLUEPRINTS.toArray()));
        chassisComboBox.setMaximumSize(new Dimension(39, 20));
        chassisComboBox.setMinimumSize(new Dimension(39, 20));
        chassisComboBox.setName("chassisComboBox"); // NOI18N
        chassisComboBox.setPreferredSize(new Dimension(39, 20));
        chassisComboBox.addActionListener(formListener);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(10, 10, 10, 10);
        ChassisPanel.add(chassisComboBox, gridBagConstraints);

        modelComboBox.setMaximumSize(new Dimension(39, 20));
        modelComboBox.setMinimumSize(new Dimension(39, 20));
        modelComboBox.setName("modelComboBox"); // NOI18N
        modelComboBox.setPreferredSize(new Dimension(39, 20));
        modelComboBox.addActionListener(formListener);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(10, 10, 10, 10);
        ChassisPanel.add(modelComboBox, gridBagConstraints);

        variantNameField.setMaximumSize(new Dimension(39, 20));
        variantNameField.setMinimumSize(new Dimension(39, 20));
        variantNameField.setName("variantNameField"); // NOI18N
        variantNameField.setPreferredSize(new Dimension(39, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(10, 10, 10, 10);
        ChassisPanel.add(variantNameField, gridBagConstraints);

        variantCostLabel.setHorizontalAlignment(SwingConstants.CENTER);
        variantCostLabel.setText("0 C-Bills");
        variantCostLabel.setMaximumSize(new Dimension(39, 20));
        variantCostLabel.setMinimumSize(new Dimension(39, 20));
        variantCostLabel.setName("variantCostLabel"); // NOI18N
        variantCostLabel.setPreferredSize(new Dimension(39, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(10, 10, 10, 10);
        ChassisPanel.add(variantCostLabel, gridBagConstraints);

        techBaseLabel.setHorizontalAlignment(SwingConstants.CENTER);
        techBaseLabel.setText("CLAN TECH");
        techBaseLabel.setMaximumSize(new Dimension(39, 20));
        techBaseLabel.setMinimumSize(new Dimension(39, 20));
        techBaseLabel.setName("techBaseLabel"); // NOI18N
        techBaseLabel.setPreferredSize(new Dimension(39, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(10, 10, 10, 10);
        ChassisPanel.add(techBaseLabel, gridBagConstraints);

        mechTypeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        mechTypeLabel.setText("OMNIMECH");
        mechTypeLabel.setMaximumSize(new Dimension(39, 20));
        mechTypeLabel.setMinimumSize(new Dimension(39, 20));
        mechTypeLabel.setName("mechTypeLabel"); // NOI18N
        mechTypeLabel.setPreferredSize(new Dimension(39, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(10, 10, 10, 10);
        ChassisPanel.add(mechTypeLabel, gridBagConstraints);

        unreleasedLabel.setHorizontalAlignment(SwingConstants.CENTER);
        unreleasedLabel.setText("UNRELEASED");
        unreleasedLabel.setMaximumSize(new Dimension(39, 20));
        unreleasedLabel.setMinimumSize(new Dimension(39, 20));
        unreleasedLabel.setName("unreleasedLabel"); // NOI18N
        unreleasedLabel.setOpaque(true);
        unreleasedLabel.setPreferredSize(new Dimension(39, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(10, 10, 10, 10);
        ChassisPanel.add(unreleasedLabel, gridBagConstraints);

        unconfirmedLabel.setHorizontalAlignment(SwingConstants.CENTER);
        unconfirmedLabel.setText("UNCONFIRMED");
        unconfirmedLabel.setMaximumSize(new Dimension(39, 20));
        unconfirmedLabel.setMinimumSize(new Dimension(39, 20));
        unconfirmedLabel.setName("unconfirmedLabel"); // NOI18N
        unconfirmedLabel.setOpaque(true);
        unconfirmedLabel.setPreferredSize(new Dimension(39, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(10, 10, 10, 10);
        ChassisPanel.add(unconfirmedLabel, gridBagConstraints);

        ecmCapableLabel.setHorizontalAlignment(SwingConstants.CENTER);
        ecmCapableLabel.setText("ECM CAPABLE");
        ecmCapableLabel.setMaximumSize(new Dimension(39, 20));
        ecmCapableLabel.setMinimumSize(new Dimension(39, 20));
        ecmCapableLabel.setName("ecmCapableLabel"); // NOI18N
        ecmCapableLabel.setPreferredSize(new Dimension(39, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(10, 10, 10, 10);
        ChassisPanel.add(ecmCapableLabel, gridBagConstraints);

        jumpCapableLabel.setHorizontalAlignment(SwingConstants.CENTER);
        jumpCapableLabel.setText("JUMP CAPABLE");
        jumpCapableLabel.setMaximumSize(new Dimension(39, 20));
        jumpCapableLabel.setMinimumSize(new Dimension(39, 20));
        jumpCapableLabel.setName("jumpCapableLabel"); // NOI18N
        jumpCapableLabel.setPreferredSize(new Dimension(39, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(10, 10, 10, 10);
        ChassisPanel.add(jumpCapableLabel, gridBagConstraints);

        MechTabPane.addTab("Chassis", ChassisPanel);

        UpgradesScrollPane.setName("UpgradesScrollPane"); // NOI18N

        UpgradesPanel.setName("UpgradesPanel"); // NOI18N
        UpgradesPanel.setLayout(new GridBagLayout());

        AdjustmentsPanel.setName("AdjustmentsPanel"); // NOI18N
        AdjustmentsPanel.setPreferredSize(new Dimension(0, 0));
        AdjustmentsPanel.setLayout(new GridBagLayout());

        engineRatingSpinner.setModel(engineRatingSpinnerModel);
        engineRatingSpinner.setName("engineRatingSpinner"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        AdjustmentsPanel.add(engineRatingSpinner, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        UpgradesPanel.add(AdjustmentsPanel, gridBagConstraints);

        SystemsPanel.setName("SystemsPanel"); // NOI18N
        SystemsPanel.setLayout(new GridBagLayout());

        engineComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        engineComboBox.setName("engineComboBox"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        SystemsPanel.add(engineComboBox, gridBagConstraints);

        structureComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        structureComboBox.setName("structureComboBox"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        SystemsPanel.add(structureComboBox, gridBagConstraints);

        armorComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        armorComboBox.setName("armorComboBox"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        SystemsPanel.add(armorComboBox, gridBagConstraints);

        gyroComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gyroComboBox.setName("gyroComboBox"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        SystemsPanel.add(gyroComboBox, gridBagConstraints);

        cockpitComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cockpitComboBox.setName("cockpitComboBox"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        SystemsPanel.add(cockpitComboBox, gridBagConstraints);

        heatSinkComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        heatSinkComboBox.setName("heatSinkComboBox"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        SystemsPanel.add(heatSinkComboBox, gridBagConstraints);

        myomerComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        myomerComboBox.setName("myomerComboBox"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        SystemsPanel.add(myomerComboBox, gridBagConstraints);

        jumpJetComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jumpJetComboBox.setName("jumpJetComboBox"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        SystemsPanel.add(jumpJetComboBox, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        UpgradesPanel.add(SystemsPanel, gridBagConstraints);

        EfficienciesPanel.setName("EfficienciesPanel"); // NOI18N
        EfficienciesPanel.setLayout(new GridBagLayout());
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        UpgradesPanel.add(EfficienciesPanel, gridBagConstraints);

        UpgradesScrollPane.setViewportView(UpgradesPanel);

        MechTabPane.addTab("Upgrades", UpgradesScrollPane);

        WeaponsPanel.setName("WeaponsPanel"); // NOI18N
        WeaponsPanel.setLayout(new GridBagLayout());
        MechTabPane.addTab("Equipment", WeaponsPanel);

        ArmorPanel.setName("ArmorPanel"); // NOI18N
        ArmorPanel.setLayout(new GridBagLayout());

        armorPointsPerTonTitle.setText("Points Per Ton");
        armorPointsPerTonTitle.setName("armorPointsPerTonTitle"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ArmorPanel.add(armorPointsPerTonTitle, gridBagConstraints);

        armorPointsPerTonLabel.setText("0.0");
        armorPointsPerTonLabel.setName("armorPointsPerTonLabel"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ArmorPanel.add(armorPointsPerTonLabel, gridBagConstraints);

        maximumArmorButton.setText("Maximum Armor");
        maximumArmorButton.setName("maximumArmorButton"); // NOI18N
        maximumArmorButton.addActionListener(formListener);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ArmorPanel.add(maximumArmorButton, gridBagConstraints);

        clearArmorButton.setText("Clear Armor");
        clearArmorButton.setName("clearArmorButton"); // NOI18N
        clearArmorButton.addActionListener(formListener);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ArmorPanel.add(clearArmorButton, gridBagConstraints);

        efficientArmorButton.setText("Efficient Maximum");
        efficientArmorButton.setEnabled(false);
        efficientArmorButton.setName("efficientArmorButton"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ArmorPanel.add(efficientArmorButton, gridBagConstraints);

        tonnageArmorButton.setText("Custom Tonnage");
        tonnageArmorButton.setEnabled(false);
        tonnageArmorButton.setName("tonnageArmorButton"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ArmorPanel.add(tonnageArmorButton, gridBagConstraints);

        armorSectionTitle.setText("Section");
        armorSectionTitle.setName("armorSectionTitle"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        ArmorPanel.add(armorSectionTitle, gridBagConstraints);

        armorFrontTitle.setText("Front");
        armorFrontTitle.setName("armorFrontTitle"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        ArmorPanel.add(armorFrontTitle, gridBagConstraints);

        armorRearTitle.setText("Rear");
        armorRearTitle.setName("armorRearTitle"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        ArmorPanel.add(armorRearTitle, gridBagConstraints);

        armorAmountTitle.setText("Amount");
        armorAmountTitle.setName("armorAmountTitle"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        ArmorPanel.add(armorAmountTitle, gridBagConstraints);

        armorSection1Title.setText(SectionType.HEAD.shortName);
        armorSection1Title.setName("armorSection1Title"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        ArmorPanel.add(armorSection1Title, gridBagConstraints);

        headArmorAmountLabel.setText("0/0");
        headArmorAmountLabel.setName("headArmorAmountLabel"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        ArmorPanel.add(headArmorAmountLabel, gridBagConstraints);

        armorSection2Title.setText(SectionType.CENTER_TORSO.shortName);
        armorSection2Title.setName("armorSection2Title"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        ArmorPanel.add(armorSection2Title, gridBagConstraints);

        centerTorsoArmorAmountLabel.setText("0/0");
        centerTorsoArmorAmountLabel.setName("centerTorsoArmorAmountLabel"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        ArmorPanel.add(centerTorsoArmorAmountLabel, gridBagConstraints);

        armorSection3Title.setText(SectionType.RIGHT_TORSO.shortName);
        armorSection3Title.setName("armorSection3Title"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        ArmorPanel.add(armorSection3Title, gridBagConstraints);

        rightTorsoArmorAmountLabel.setText("0/0");
        rightTorsoArmorAmountLabel.setName("rightTorsoArmorAmountLabel"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        ArmorPanel.add(rightTorsoArmorAmountLabel, gridBagConstraints);

        armorSection4Title.setText(SectionType.LEFT_TORSO.shortName);
        armorSection4Title.setName("armorSection4Title"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        ArmorPanel.add(armorSection4Title, gridBagConstraints);

        leftTorsoArmorAmountLabel.setText("0/0");
        leftTorsoArmorAmountLabel.setName("leftTorsoArmorAmountLabel"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        ArmorPanel.add(leftTorsoArmorAmountLabel, gridBagConstraints);

        armorSection5Title.setText(SectionType.RIGHT_ARM.shortName);
        armorSection5Title.setName("armorSection5Title"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        ArmorPanel.add(armorSection5Title, gridBagConstraints);

        rightArmArmorAmountLabel.setText("0/0");
        rightArmArmorAmountLabel.setName("rightArmArmorAmountLabel"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        ArmorPanel.add(rightArmArmorAmountLabel, gridBagConstraints);

        armorSection6Title.setText(SectionType.LEFT_ARM.shortName);
        armorSection6Title.setName("armorSection6Title"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        ArmorPanel.add(armorSection6Title, gridBagConstraints);

        leftArmArmorAmountLabel.setText("0/0");
        leftArmArmorAmountLabel.setName("leftArmArmorAmountLabel"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 7;
        ArmorPanel.add(leftArmArmorAmountLabel, gridBagConstraints);

        armorSection7Title.setText(SectionType.RIGHT_LEG.shortName);
        armorSection7Title.setName("armorSection7Title"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        ArmorPanel.add(armorSection7Title, gridBagConstraints);

        rightLegArmorAmountLabel.setText("0/0");
        rightLegArmorAmountLabel.setName("rightLegArmorAmountLabel"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 8;
        ArmorPanel.add(rightLegArmorAmountLabel, gridBagConstraints);

        armorSection8Title.setText(SectionType.LEFT_LEG.shortName);
        armorSection8Title.setName("armorSection8Title"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        ArmorPanel.add(armorSection8Title, gridBagConstraints);

        leftLegArmorAmountLabel.setText("0/0");
        leftLegArmorAmountLabel.setName("leftLegArmorAmountLabel"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 9;
        ArmorPanel.add(leftLegArmorAmountLabel, gridBagConstraints);

        armorSection9Title.setText(SectionType.SPECIAL_ONE.shortName);
        armorSection9Title.setEnabled(false);
        armorSection9Title.setName("armorSection9Title"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        ArmorPanel.add(armorSection9Title, gridBagConstraints);

        special1ArmorAmountLabel.setText("0/0");
        special1ArmorAmountLabel.setEnabled(false);
        special1ArmorAmountLabel.setName("special1ArmorAmountLabel"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 10;
        ArmorPanel.add(special1ArmorAmountLabel, gridBagConstraints);

        armorSection10Title.setText(SectionType.SPECIAL_TWO.shortName);
        armorSection10Title.setEnabled(false);
        armorSection10Title.setName("armorSection10Title"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        ArmorPanel.add(armorSection10Title, gridBagConstraints);

        special2ArmorAmountLabel.setText("0/0");
        special2ArmorAmountLabel.setEnabled(false);
        special2ArmorAmountLabel.setName("special2ArmorAmountLabel"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 11;
        ArmorPanel.add(special2ArmorAmountLabel, gridBagConstraints);

        armorTotalTitle.setText("Total");
        armorTotalTitle.setName("armorTotalTitle"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ArmorPanel.add(armorTotalTitle, gridBagConstraints);

        armorTotalLabel.setText("0/0");
        armorTotalLabel.setName("armorTotalLabel"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ArmorPanel.add(armorTotalLabel, gridBagConstraints);

        centerTorsoSpinner.setModel(centerTorsoSpinnerModel);
        centerTorsoSpinner.setName("centerTorsoSpinner"); // NOI18N
        centerTorsoSpinner.addChangeListener(formListener);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        ArmorPanel.add(centerTorsoSpinner, gridBagConstraints);

        centerRearTorsoSpinner.setModel(centerRearTorsoSpinnerModel);
        centerRearTorsoSpinner.setName("centerRearTorsoSpinner"); // NOI18N
        centerRearTorsoSpinner.addChangeListener(formListener);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        ArmorPanel.add(centerRearTorsoSpinner, gridBagConstraints);

        rightTorsoSpinner.setModel(rightTorsoSpinnerModel);
        rightTorsoSpinner.setName("rightTorsoSpinner"); // NOI18N
        rightTorsoSpinner.addChangeListener(formListener);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        ArmorPanel.add(rightTorsoSpinner, gridBagConstraints);

        rightRearTorsoSpinner.setModel(rightRearTorsoSpinnerModel);
        rightRearTorsoSpinner.setName("rightRearTorsoSpinner"); // NOI18N
        rightRearTorsoSpinner.addChangeListener(formListener);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        ArmorPanel.add(rightRearTorsoSpinner, gridBagConstraints);

        leftTorsoSpinner.setModel(leftTorsoSpinnerModel);
        leftTorsoSpinner.setName("leftTorsoSpinner"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        ArmorPanel.add(leftTorsoSpinner, gridBagConstraints);

        leftRearTorsoSpinner.setModel(leftRearTorsoSpinnerModel);
        leftRearTorsoSpinner.setName("leftRearTorsoSpinner"); // NOI18N
        leftRearTorsoSpinner.addChangeListener(formListener);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        ArmorPanel.add(leftRearTorsoSpinner, gridBagConstraints);

        headSpinner.setModel(headSpinnerModel);
        headSpinner.setName("headSpinner"); // NOI18N
        headSpinner.addChangeListener(formListener);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        ArmorPanel.add(headSpinner, gridBagConstraints);

        rightArmSpinner.setModel(rightArmSpinnerModel);
        rightArmSpinner.setName("rightArmSpinner"); // NOI18N
        rightArmSpinner.addChangeListener(formListener);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        ArmorPanel.add(rightArmSpinner, gridBagConstraints);

        leftArmSpinner.setModel(leftArmSpinnerModel);
        leftArmSpinner.setName("leftArmSpinner"); // NOI18N
        leftArmSpinner.addChangeListener(formListener);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        ArmorPanel.add(leftArmSpinner, gridBagConstraints);

        leftLegSpinner.setModel(leftLegSpinnerModel);
        leftLegSpinner.setName("leftLegSpinner"); // NOI18N
        leftLegSpinner.addChangeListener(formListener);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        ArmorPanel.add(leftLegSpinner, gridBagConstraints);

        rightLegSpinner.setModel(rightLegSpinnerModel);
        rightLegSpinner.setName("rightLegSpinner"); // NOI18N
        rightLegSpinner.addChangeListener(formListener);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        ArmorPanel.add(rightLegSpinner, gridBagConstraints);

        special1Spinner.setModel(special1SpinnerModel);
        special1Spinner.setEnabled(false);
        special1Spinner.setName("special1Spinner"); // NOI18N
        special1Spinner.addChangeListener(formListener);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        ArmorPanel.add(special1Spinner, gridBagConstraints);

        special2Spinner.setModel(special2SpinnerModel);
        special2Spinner.setEnabled(false);
        special2Spinner.setName("special2Spinner"); // NOI18N
        special2Spinner.addChangeListener(formListener);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        ArmorPanel.add(special2Spinner, gridBagConstraints);

        MechTabPane.addTab("Armor", ArmorPanel);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        add(MechTabPane, gridBagConstraints);

        statisticsPanel.setMinimumSize(new Dimension(192, 470));
        statisticsPanel.setName("statisticsPanel"); // NOI18N
        statisticsPanel.setPreferredSize(new Dimension(192, 470));
        statisticsPanel.setLayout(new GridBagLayout());

        tonnageProgressBar.setAlignmentX(0.0F);
        tonnageProgressBar.setAlignmentY(0.0F);
        tonnageProgressBar.setBorder(BorderFactory.createTitledBorder(null, "Tonnage", TitledBorder.LEADING, TitledBorder.TOP, preferences.DEFAULT_FONT_SIZE_12));
        tonnageProgressBar.setMaximumSize(new Dimension(0, 0));
        tonnageProgressBar.setMinimumSize(new Dimension(0, 0));
        tonnageProgressBar.setName("tonnageProgressBar"); // NOI18N
        tonnageProgressBar.setPreferredSize(new Dimension(0, 0));
        tonnageProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        statisticsPanel.add(tonnageProgressBar, gridBagConstraints);

        speedProgressBar.setBorder(BorderFactory.createTitledBorder(null, "Speed", TitledBorder.LEADING, TitledBorder.TOP, preferences.DEFAULT_FONT_SIZE_12));
        speedProgressBar.setMaximumSize(new Dimension(0, 0));
        speedProgressBar.setMinimumSize(new Dimension(0, 0));
        speedProgressBar.setName("speedProgressBar"); // NOI18N
        speedProgressBar.setPreferredSize(new Dimension(0, 0));
        speedProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        statisticsPanel.add(speedProgressBar, gridBagConstraints);

        jumpDistanceProgressBar.setBorder(BorderFactory.createTitledBorder(null, "Jump Distance", TitledBorder.LEADING, TitledBorder.TOP, preferences.DEFAULT_FONT_SIZE_12));
        jumpDistanceProgressBar.setMaximumSize(new Dimension(0, 0));
        jumpDistanceProgressBar.setMinimumSize(new Dimension(0, 0));
        jumpDistanceProgressBar.setName("jumpDistanceProgressBar"); // NOI18N
        jumpDistanceProgressBar.setPreferredSize(new Dimension(0, 0));
        jumpDistanceProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        statisticsPanel.add(jumpDistanceProgressBar, gridBagConstraints);

        jumpHeightProgressBar.setBorder(BorderFactory.createTitledBorder(null, "Jump Height", TitledBorder.LEADING, TitledBorder.TOP, preferences.DEFAULT_FONT_SIZE_12));
        jumpHeightProgressBar.setMaximumSize(new Dimension(0, 0));
        jumpHeightProgressBar.setMinimumSize(new Dimension(0, 0));
        jumpHeightProgressBar.setName("jumpHeightProgressBar"); // NOI18N
        jumpHeightProgressBar.setPreferredSize(new Dimension(0, 0));
        jumpHeightProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        statisticsPanel.add(jumpHeightProgressBar, gridBagConstraints);

        armorProgressBar.setBorder(BorderFactory.createTitledBorder(null, "Armor", TitledBorder.LEADING, TitledBorder.TOP, preferences.DEFAULT_FONT_SIZE_12));
        armorProgressBar.setMaximumSize(new Dimension(0, 0));
        armorProgressBar.setMinimumSize(new Dimension(0, 0));
        armorProgressBar.setName("armorProgressBar"); // NOI18N
        armorProgressBar.setPreferredSize(new Dimension(0, 0));
        armorProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        statisticsPanel.add(armorProgressBar, gridBagConstraints);

        alphaDamageProgressBar.setBorder(BorderFactory.createTitledBorder(null, "Alpha Damage", TitledBorder.LEADING, TitledBorder.TOP, preferences.DEFAULT_FONT_SIZE_12));
        alphaDamageProgressBar.setMaximumSize(new Dimension(0, 0));
        alphaDamageProgressBar.setMinimumSize(new Dimension(0, 0));
        alphaDamageProgressBar.setName("alphaDamageProgressBar"); // NOI18N
        alphaDamageProgressBar.setPreferredSize(new Dimension(0, 0));
        alphaDamageProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        statisticsPanel.add(alphaDamageProgressBar, gridBagConstraints);

        alphaHeatProgressBar.setBorder(BorderFactory.createTitledBorder(null, "Alpha Heat", TitledBorder.LEADING, TitledBorder.TOP, preferences.DEFAULT_FONT_SIZE_12));
        alphaHeatProgressBar.setMaximumSize(new Dimension(0, 0));
        alphaHeatProgressBar.setMinimumSize(new Dimension(0, 0));
        alphaHeatProgressBar.setName("alphaHeatProgressBar"); // NOI18N
        alphaHeatProgressBar.setPreferredSize(new Dimension(0, 0));
        alphaHeatProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        statisticsPanel.add(alphaHeatProgressBar, gridBagConstraints);

        firepowerProgressBar.setBorder(BorderFactory.createTitledBorder(null, "Firepower", TitledBorder.LEADING, TitledBorder.TOP, preferences.DEFAULT_FONT_SIZE_12));
        firepowerProgressBar.setMaximumSize(new Dimension(0, 0));
        firepowerProgressBar.setMinimumSize(new Dimension(0, 0));
        firepowerProgressBar.setName("firepowerProgressBar"); // NOI18N
        firepowerProgressBar.setPreferredSize(new Dimension(0, 0));
        firepowerProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        statisticsPanel.add(firepowerProgressBar, gridBagConstraints);

        heatEfficiencyProgressBar.setBorder(BorderFactory.createTitledBorder(null, "Heat Efficiency", TitledBorder.LEADING, TitledBorder.TOP, preferences.DEFAULT_FONT_SIZE_12));
        heatEfficiencyProgressBar.setMaximumSize(new Dimension(0, 0));
        heatEfficiencyProgressBar.setMinimumSize(new Dimension(0, 0));
        heatEfficiencyProgressBar.setName("heatEfficiencyProgressBar"); // NOI18N
        heatEfficiencyProgressBar.setPreferredSize(new Dimension(0, 0));
        heatEfficiencyProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        statisticsPanel.add(heatEfficiencyProgressBar, gridBagConstraints);

        rangeProgressBar.setBorder(BorderFactory.createTitledBorder(null, "Range", TitledBorder.LEADING, TitledBorder.TOP, preferences.DEFAULT_FONT_SIZE_12));
        rangeProgressBar.setMaximumSize(new Dimension(0, 0));
        rangeProgressBar.setMinimumSize(new Dimension(0, 0));
        rangeProgressBar.setName("rangeProgressBar"); // NOI18N
        rangeProgressBar.setPreferredSize(new Dimension(0, 0));
        rangeProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        statisticsPanel.add(rangeProgressBar, gridBagConstraints);

        criticalsProgressBar.setBorder(BorderFactory.createTitledBorder(null, "Criticals", TitledBorder.LEADING, TitledBorder.TOP, preferences.DEFAULT_FONT_SIZE_12));
        criticalsProgressBar.setMaximumSize(new Dimension(0, 0));
        criticalsProgressBar.setMinimumSize(new Dimension(0, 0));
        criticalsProgressBar.setName("criticalsProgressBar"); // NOI18N
        criticalsProgressBar.setPreferredSize(new Dimension(0, 0));
        criticalsProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        statisticsPanel.add(criticalsProgressBar, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        add(statisticsPanel, gridBagConstraints);

        mechPanel.setMinimumSize(new Dimension(512, 470));
        mechPanel.setName("mechPanel"); // NOI18N
        mechPanel.setPreferredSize(new Dimension(512, 470));
        mechPanel.setLayout(new GridBagLayout());

        headPanel.setMaximumSize(new Dimension(100, 128));
        headPanel.setMinimumSize(new Dimension(100, 128));
        headPanel.setName("headPanel"); // NOI18N
        headPanel.setPreferredSize(new Dimension(100, 128));
        headPanel.setLayout(new GridBagLayout());

        headOmnipodComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        headOmnipodComboBox.setMinimumSize(new Dimension(80, 20));
        headOmnipodComboBox.setName("headOmnipodComboBox"); // NOI18N
        headOmnipodComboBox.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        headPanel.add(headOmnipodComboBox, gridBagConstraints);

        headAMSHardpointLabel.setText("jLabel21");
        headAMSHardpointLabel.setMinimumSize(new Dimension(80, 20));
        headAMSHardpointLabel.setName("headAMSHardpointLabel"); // NOI18N
        headAMSHardpointLabel.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        headPanel.add(headAMSHardpointLabel, gridBagConstraints);

        headECMHardpointLabel.setText("jLabel21");
        headECMHardpointLabel.setMinimumSize(new Dimension(80, 20));
        headECMHardpointLabel.setName("headECMHardpointLabel"); // NOI18N
        headECMHardpointLabel.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        headPanel.add(headECMHardpointLabel, gridBagConstraints);

        headEnergyHardpointLabel.setText("jLabel21");
        headEnergyHardpointLabel.setMinimumSize(new Dimension(80, 20));
        headEnergyHardpointLabel.setName("headEnergyHardpointLabel"); // NOI18N
        headEnergyHardpointLabel.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        headPanel.add(headEnergyHardpointLabel, gridBagConstraints);

        headBallisticHardpointLabel.setText("jLabel21");
        headBallisticHardpointLabel.setMinimumSize(new Dimension(80, 20));
        headBallisticHardpointLabel.setName("headBallisticHardpointLabel"); // NOI18N
        headBallisticHardpointLabel.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        headPanel.add(headBallisticHardpointLabel, gridBagConstraints);

        headMissileHardpointLabel.setText("jLabel21");
        headMissileHardpointLabel.setMinimumSize(new Dimension(80, 20));
        headMissileHardpointLabel.setName("headMissileHardpointLabel"); // NOI18N
        headMissileHardpointLabel.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        headPanel.add(headMissileHardpointLabel, gridBagConstraints);

        headStructureProgressBar.setMinimumSize(new Dimension(80, 20));
        headStructureProgressBar.setName("headStructureProgressBar"); // NOI18N
        headStructureProgressBar.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        headPanel.add(headStructureProgressBar, gridBagConstraints);

        headArmorProgressBar.setMinimumSize(new Dimension(80, 20));
        headArmorProgressBar.setName("headArmorProgressBar"); // NOI18N
        headArmorProgressBar.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        headPanel.add(headArmorProgressBar, gridBagConstraints);

        headCriticalList.setModel(new AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        headCriticalList.setName("headCriticalList"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        headPanel.add(headCriticalList, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        mechPanel.add(headPanel, gridBagConstraints);

        centerTorsoPanel.setMaximumSize(new Dimension(100, 256));
        centerTorsoPanel.setMinimumSize(new Dimension(100, 256));
        centerTorsoPanel.setName("centerTorsoPanel"); // NOI18N
        centerTorsoPanel.setPreferredSize(new Dimension(100, 256));
        centerTorsoPanel.setLayout(new GridBagLayout());

        centerTorsoOmnipodComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        centerTorsoOmnipodComboBox.setMinimumSize(new Dimension(80, 20));
        centerTorsoOmnipodComboBox.setName("centerTorsoOmnipodComboBox"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        centerTorsoPanel.add(centerTorsoOmnipodComboBox, gridBagConstraints);

        centerTorsoAMSHardpointLabel.setText("jLabel21");
        centerTorsoAMSHardpointLabel.setMinimumSize(new Dimension(80, 20));
        centerTorsoAMSHardpointLabel.setName("centerTorsoAMSHardpointLabel"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        centerTorsoPanel.add(centerTorsoAMSHardpointLabel, gridBagConstraints);

        centerTorsoECMHardpointLabel.setText("jLabel21");
        centerTorsoECMHardpointLabel.setMinimumSize(new Dimension(80, 20));
        centerTorsoECMHardpointLabel.setName("centerTorsoECMHardpointLabel"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        centerTorsoPanel.add(centerTorsoECMHardpointLabel, gridBagConstraints);

        centerTorsoEnergyHardpointLabel.setText("jLabel21");
        centerTorsoEnergyHardpointLabel.setMinimumSize(new Dimension(80, 20));
        centerTorsoEnergyHardpointLabel.setName("centerTorsoEnergyHardpointLabel"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        centerTorsoPanel.add(centerTorsoEnergyHardpointLabel, gridBagConstraints);

        centerTorsoBallisticHardpointLabel.setText("jLabel21");
        centerTorsoBallisticHardpointLabel.setMinimumSize(new Dimension(80, 20));
        centerTorsoBallisticHardpointLabel.setName("centerTorsoBallisticHardpointLabel"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        centerTorsoPanel.add(centerTorsoBallisticHardpointLabel, gridBagConstraints);

        centerTorsoMissileHardpointLabel.setText("jLabel21");
        centerTorsoMissileHardpointLabel.setMinimumSize(new Dimension(80, 20));
        centerTorsoMissileHardpointLabel.setName("centerTorsoMissileHardpointLabel"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        centerTorsoPanel.add(centerTorsoMissileHardpointLabel, gridBagConstraints);

        centerTorsoStructureProgressBar.setMinimumSize(new Dimension(80, 20));
        centerTorsoStructureProgressBar.setName("centerTorsoStructureProgressBar"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        centerTorsoPanel.add(centerTorsoStructureProgressBar, gridBagConstraints);

        centerTorsoFrontArmorProgressBar.setMinimumSize(new Dimension(80, 20));
        centerTorsoFrontArmorProgressBar.setName("centerTorsoFrontArmorProgressBar"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        centerTorsoPanel.add(centerTorsoFrontArmorProgressBar, gridBagConstraints);

        centerTorsoRearArmorProgressBar.setMinimumSize(new Dimension(80, 20));
        centerTorsoRearArmorProgressBar.setName("centerTorsoRearArmorProgressBar"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        centerTorsoPanel.add(centerTorsoRearArmorProgressBar, gridBagConstraints);

        centerTorsoCriticalList.setModel(new AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        centerTorsoCriticalList.setName("centerTorsoCriticalList"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        centerTorsoPanel.add(centerTorsoCriticalList, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        mechPanel.add(centerTorsoPanel, gridBagConstraints);

        leftTorsoPanel.setMaximumSize(new Dimension(100, 256));
        leftTorsoPanel.setMinimumSize(new Dimension(100, 256));
        leftTorsoPanel.setName("leftTorsoPanel"); // NOI18N
        leftTorsoPanel.setPreferredSize(new Dimension(100, 256));
        leftTorsoPanel.setLayout(new GridBagLayout());

        leftTorsoOmnipodComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        leftTorsoOmnipodComboBox.setMinimumSize(new Dimension(80, 20));
        leftTorsoOmnipodComboBox.setName("leftTorsoOmnipodComboBox"); // NOI18N
        leftTorsoOmnipodComboBox.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftTorsoPanel.add(leftTorsoOmnipodComboBox, gridBagConstraints);

        leftTorsoBallisticHardpointLabel.setText("jLabel21");
        leftTorsoBallisticHardpointLabel.setMinimumSize(new Dimension(80, 20));
        leftTorsoBallisticHardpointLabel.setName("leftTorsoBallisticHardpointLabel"); // NOI18N
        leftTorsoBallisticHardpointLabel.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftTorsoPanel.add(leftTorsoBallisticHardpointLabel, gridBagConstraints);

        leftTorsoEnergyHardpointLabel.setText("jLabel21");
        leftTorsoEnergyHardpointLabel.setMinimumSize(new Dimension(80, 20));
        leftTorsoEnergyHardpointLabel.setName("leftTorsoEnergyHardpointLabel"); // NOI18N
        leftTorsoEnergyHardpointLabel.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftTorsoPanel.add(leftTorsoEnergyHardpointLabel, gridBagConstraints);

        leftTorsoAMSHardpointLabel.setText("jLabel21");
        leftTorsoAMSHardpointLabel.setMinimumSize(new Dimension(80, 20));
        leftTorsoAMSHardpointLabel.setName("leftTorsoAMSHardpointLabel"); // NOI18N
        leftTorsoAMSHardpointLabel.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftTorsoPanel.add(leftTorsoAMSHardpointLabel, gridBagConstraints);

        leftTorsoECMHardpointLabel.setText("jLabel21");
        leftTorsoECMHardpointLabel.setMinimumSize(new Dimension(80, 20));
        leftTorsoECMHardpointLabel.setName("leftTorsoECMHardpointLabel"); // NOI18N
        leftTorsoECMHardpointLabel.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftTorsoPanel.add(leftTorsoECMHardpointLabel, gridBagConstraints);

        leftTorsoMissileHardpointLabel.setText("jLabel21");
        leftTorsoMissileHardpointLabel.setMinimumSize(new Dimension(80, 20));
        leftTorsoMissileHardpointLabel.setName("leftTorsoMissileHardpointLabel"); // NOI18N
        leftTorsoMissileHardpointLabel.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftTorsoPanel.add(leftTorsoMissileHardpointLabel, gridBagConstraints);

        leftTorsoStructureProgressBar.setMinimumSize(new Dimension(80, 20));
        leftTorsoStructureProgressBar.setName("leftTorsoStructureProgressBar"); // NOI18N
        leftTorsoStructureProgressBar.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftTorsoPanel.add(leftTorsoStructureProgressBar, gridBagConstraints);

        leftTorsoFrontArmorProgressBar.setMinimumSize(new Dimension(80, 20));
        leftTorsoFrontArmorProgressBar.setName("leftTorsoFrontArmorProgressBar"); // NOI18N
        leftTorsoFrontArmorProgressBar.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftTorsoPanel.add(leftTorsoFrontArmorProgressBar, gridBagConstraints);

        leftTorsoRearArmorProgressBar.setMinimumSize(new Dimension(80, 20));
        leftTorsoRearArmorProgressBar.setName("leftTorsoRearArmorProgressBar"); // NOI18N
        leftTorsoRearArmorProgressBar.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftTorsoPanel.add(leftTorsoRearArmorProgressBar, gridBagConstraints);

        leftTorsoCriticalList.setModel(new AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        leftTorsoCriticalList.setName("leftTorsoCriticalList"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftTorsoPanel.add(leftTorsoCriticalList, gridBagConstraints);

        leftTorsoCASEToggleButton.setText("CASE");
        leftTorsoCASEToggleButton.setMinimumSize(new Dimension(80, 20));
        leftTorsoCASEToggleButton.setName("leftTorsoCASEToggleButton"); // NOI18N
        leftTorsoCASEToggleButton.setPreferredSize(new Dimension(80, 20));
        leftTorsoCASEToggleButton.addActionListener(formListener);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftTorsoPanel.add(leftTorsoCASEToggleButton, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        mechPanel.add(leftTorsoPanel, gridBagConstraints);

        rightTorsoPanel.setMaximumSize(new Dimension(100, 256));
        rightTorsoPanel.setMinimumSize(new Dimension(100, 256));
        rightTorsoPanel.setName("rightTorsoPanel"); // NOI18N
        rightTorsoPanel.setPreferredSize(new Dimension(100, 256));
        rightTorsoPanel.setLayout(new GridBagLayout());

        rightTorsoOmnipodComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        rightTorsoOmnipodComboBox.setMinimumSize(new Dimension(80, 20));
        rightTorsoOmnipodComboBox.setName("rightTorsoOmnipodComboBox"); // NOI18N
        rightTorsoOmnipodComboBox.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightTorsoPanel.add(rightTorsoOmnipodComboBox, gridBagConstraints);

        rightTorsoBallisticHardpointLabel.setText("jLabel21");
        rightTorsoBallisticHardpointLabel.setMinimumSize(new Dimension(80, 20));
        rightTorsoBallisticHardpointLabel.setName("rightTorsoBallisticHardpointLabel"); // NOI18N
        rightTorsoBallisticHardpointLabel.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightTorsoPanel.add(rightTorsoBallisticHardpointLabel, gridBagConstraints);

        rightTorsoEnergyHardpointLabel.setText("jLabel21");
        rightTorsoEnergyHardpointLabel.setMinimumSize(new Dimension(80, 20));
        rightTorsoEnergyHardpointLabel.setName("rightTorsoEnergyHardpointLabel"); // NOI18N
        rightTorsoEnergyHardpointLabel.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightTorsoPanel.add(rightTorsoEnergyHardpointLabel, gridBagConstraints);

        rightTorsoAMSHardpointLabel.setText("jLabel21");
        rightTorsoAMSHardpointLabel.setMinimumSize(new Dimension(80, 20));
        rightTorsoAMSHardpointLabel.setName("rightTorsoAMSHardpointLabel"); // NOI18N
        rightTorsoAMSHardpointLabel.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightTorsoPanel.add(rightTorsoAMSHardpointLabel, gridBagConstraints);

        rightTorsoECMHardpointLabel.setText("jLabel21");
        rightTorsoECMHardpointLabel.setMinimumSize(new Dimension(80, 20));
        rightTorsoECMHardpointLabel.setName("rightTorsoECMHardpointLabel"); // NOI18N
        rightTorsoECMHardpointLabel.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightTorsoPanel.add(rightTorsoECMHardpointLabel, gridBagConstraints);

        rightTorsoMissileHardpointLabel.setText("jLabel21");
        rightTorsoMissileHardpointLabel.setMinimumSize(new Dimension(80, 20));
        rightTorsoMissileHardpointLabel.setName("rightTorsoMissileHardpointLabel"); // NOI18N
        rightTorsoMissileHardpointLabel.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightTorsoPanel.add(rightTorsoMissileHardpointLabel, gridBagConstraints);

        rightTorsoStructureProgressBar.setMinimumSize(new Dimension(80, 20));
        rightTorsoStructureProgressBar.setName("rightTorsoStructureProgressBar"); // NOI18N
        rightTorsoStructureProgressBar.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightTorsoPanel.add(rightTorsoStructureProgressBar, gridBagConstraints);

        rightTorsoFrontArmorProgressBar.setMinimumSize(new Dimension(80, 20));
        rightTorsoFrontArmorProgressBar.setName("rightTorsoFrontArmorProgressBar"); // NOI18N
        rightTorsoFrontArmorProgressBar.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightTorsoPanel.add(rightTorsoFrontArmorProgressBar, gridBagConstraints);

        rightTorsoRearArmorProgressBar.setMinimumSize(new Dimension(80, 20));
        rightTorsoRearArmorProgressBar.setName("rightTorsoRearArmorProgressBar"); // NOI18N
        rightTorsoRearArmorProgressBar.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightTorsoPanel.add(rightTorsoRearArmorProgressBar, gridBagConstraints);

        rightTorsoCriticalList.setModel(new AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        rightTorsoCriticalList.setName("rightTorsoCriticalList"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightTorsoPanel.add(rightTorsoCriticalList, gridBagConstraints);

        rightTorsoCASEToggleButton.setText("CASE");
        rightTorsoCASEToggleButton.setMinimumSize(new Dimension(80, 20));
        rightTorsoCASEToggleButton.setName("rightTorsoCASEToggleButton"); // NOI18N
        rightTorsoCASEToggleButton.setPreferredSize(new Dimension(80, 20));
        rightTorsoCASEToggleButton.addActionListener(formListener);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightTorsoPanel.add(rightTorsoCASEToggleButton, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        mechPanel.add(rightTorsoPanel, gridBagConstraints);

        leftLegPanel.setMaximumSize(new Dimension(100, 128));
        leftLegPanel.setMinimumSize(new Dimension(100, 128));
        leftLegPanel.setName("leftLegPanel"); // NOI18N
        leftLegPanel.setPreferredSize(new Dimension(100, 128));
        leftLegPanel.setLayout(new GridBagLayout());

        leftLegOmnipodComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        leftLegOmnipodComboBox.setMinimumSize(new Dimension(80, 20));
        leftLegOmnipodComboBox.setName("leftLegOmnipodComboBox"); // NOI18N
        leftLegOmnipodComboBox.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftLegPanel.add(leftLegOmnipodComboBox, gridBagConstraints);

        leftLegBallisticHardpointLabel.setText("jLabel21");
        leftLegBallisticHardpointLabel.setMinimumSize(new Dimension(80, 20));
        leftLegBallisticHardpointLabel.setName("leftLegBallisticHardpointLabel"); // NOI18N
        leftLegBallisticHardpointLabel.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftLegPanel.add(leftLegBallisticHardpointLabel, gridBagConstraints);

        leftLegEnergyHardpointLabel.setText("jLabel21");
        leftLegEnergyHardpointLabel.setMinimumSize(new Dimension(80, 20));
        leftLegEnergyHardpointLabel.setName("leftLegEnergyHardpointLabel"); // NOI18N
        leftLegEnergyHardpointLabel.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftLegPanel.add(leftLegEnergyHardpointLabel, gridBagConstraints);

        leftLegAMSHardpointLabel.setText("jLabel21");
        leftLegAMSHardpointLabel.setMinimumSize(new Dimension(80, 20));
        leftLegAMSHardpointLabel.setName("leftLegAMSHardpointLabel"); // NOI18N
        leftLegAMSHardpointLabel.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftLegPanel.add(leftLegAMSHardpointLabel, gridBagConstraints);

        leftLegECMHardpointLabel.setText("jLabel21");
        leftLegECMHardpointLabel.setMinimumSize(new Dimension(80, 20));
        leftLegECMHardpointLabel.setName("leftLegECMHardpointLabel"); // NOI18N
        leftLegECMHardpointLabel.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftLegPanel.add(leftLegECMHardpointLabel, gridBagConstraints);

        leftLegMissileHardpointLabel.setText("jLabel21");
        leftLegMissileHardpointLabel.setMinimumSize(new Dimension(80, 20));
        leftLegMissileHardpointLabel.setName("leftLegMissileHardpointLabel"); // NOI18N
        leftLegMissileHardpointLabel.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftLegPanel.add(leftLegMissileHardpointLabel, gridBagConstraints);

        leftLegStructureProgressBar.setMinimumSize(new Dimension(80, 20));
        leftLegStructureProgressBar.setName("leftLegStructureProgressBar"); // NOI18N
        leftLegStructureProgressBar.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftLegPanel.add(leftLegStructureProgressBar, gridBagConstraints);

        leftLegArmorProgressBar.setMinimumSize(new Dimension(80, 20));
        leftLegArmorProgressBar.setName("leftLegArmorProgressBar"); // NOI18N
        leftLegArmorProgressBar.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftLegPanel.add(leftLegArmorProgressBar, gridBagConstraints);

        leftLegCriticalList.setModel(new AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        leftLegCriticalList.setName("leftLegCriticalList"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftLegPanel.add(leftLegCriticalList, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        mechPanel.add(leftLegPanel, gridBagConstraints);

        rightLegPanel.setMaximumSize(new Dimension(100, 128));
        rightLegPanel.setMinimumSize(new Dimension(100, 128));
        rightLegPanel.setName("rightLegPanel"); // NOI18N
        rightLegPanel.setPreferredSize(new Dimension(100, 128));
        rightLegPanel.setLayout(new GridBagLayout());

        rightLegOmnipodComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        rightLegOmnipodComboBox.setMinimumSize(new Dimension(80, 20));
        rightLegOmnipodComboBox.setName("rightLegOmnipodComboBox"); // NOI18N
        rightLegOmnipodComboBox.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightLegPanel.add(rightLegOmnipodComboBox, gridBagConstraints);

        rightLegBallisticHardpointLabel.setText("jLabel21");
        rightLegBallisticHardpointLabel.setMinimumSize(new Dimension(80, 20));
        rightLegBallisticHardpointLabel.setName("rightLegBallisticHardpointLabel"); // NOI18N
        rightLegBallisticHardpointLabel.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightLegPanel.add(rightLegBallisticHardpointLabel, gridBagConstraints);

        rightLegEnergyHardpointLabel.setText("jLabel21");
        rightLegEnergyHardpointLabel.setMinimumSize(new Dimension(80, 20));
        rightLegEnergyHardpointLabel.setName("rightLegEnergyHardpointLabel"); // NOI18N
        rightLegEnergyHardpointLabel.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightLegPanel.add(rightLegEnergyHardpointLabel, gridBagConstraints);

        rightLegAMSHardpointLabel.setText("jLabel21");
        rightLegAMSHardpointLabel.setMinimumSize(new Dimension(80, 20));
        rightLegAMSHardpointLabel.setName("rightLegAMSHardpointLabel"); // NOI18N
        rightLegAMSHardpointLabel.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightLegPanel.add(rightLegAMSHardpointLabel, gridBagConstraints);

        rightLegECMHardpointLabel.setText("jLabel21");
        rightLegECMHardpointLabel.setMinimumSize(new Dimension(80, 20));
        rightLegECMHardpointLabel.setName("rightLegECMHardpointLabel"); // NOI18N
        rightLegECMHardpointLabel.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightLegPanel.add(rightLegECMHardpointLabel, gridBagConstraints);

        rightLegMissileHardpointLabel.setText("jLabel21");
        rightLegMissileHardpointLabel.setMinimumSize(new Dimension(80, 20));
        rightLegMissileHardpointLabel.setName("rightLegMissileHardpointLabel"); // NOI18N
        rightLegMissileHardpointLabel.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightLegPanel.add(rightLegMissileHardpointLabel, gridBagConstraints);

        rightLegStructureProgressBar.setMinimumSize(new Dimension(80, 20));
        rightLegStructureProgressBar.setName("rightLegStructureProgressBar"); // NOI18N
        rightLegStructureProgressBar.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightLegPanel.add(rightLegStructureProgressBar, gridBagConstraints);

        rightLegArmorProgressBar.setMinimumSize(new Dimension(80, 20));
        rightLegArmorProgressBar.setName("rightLegArmorProgressBar"); // NOI18N
        rightLegArmorProgressBar.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightLegPanel.add(rightLegArmorProgressBar, gridBagConstraints);

        rightLegCriticalList.setModel(new AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        rightLegCriticalList.setName("rightLegCriticalList"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightLegPanel.add(rightLegCriticalList, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        mechPanel.add(rightLegPanel, gridBagConstraints);

        leftArmPanel.setMaximumSize(new Dimension(100, 256));
        leftArmPanel.setMinimumSize(new Dimension(100, 256));
        leftArmPanel.setName("leftArmPanel"); // NOI18N
        leftArmPanel.setPreferredSize(new Dimension(100, 256));
        leftArmPanel.setLayout(new GridBagLayout());

        leftArmOmnipodComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        leftArmOmnipodComboBox.setMinimumSize(new Dimension(80, 20));
        leftArmOmnipodComboBox.setName("leftArmOmnipodComboBox"); // NOI18N
        leftArmOmnipodComboBox.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftArmPanel.add(leftArmOmnipodComboBox, gridBagConstraints);

        leftArmECMHardpointLabel.setText("jLabel21");
        leftArmECMHardpointLabel.setMinimumSize(new Dimension(80, 20));
        leftArmECMHardpointLabel.setName("leftArmECMHardpointLabel"); // NOI18N
        leftArmECMHardpointLabel.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftArmPanel.add(leftArmECMHardpointLabel, gridBagConstraints);

        leftArmEnergyHardpointLabel.setText("jLabel21");
        leftArmEnergyHardpointLabel.setMinimumSize(new Dimension(80, 20));
        leftArmEnergyHardpointLabel.setName("leftArmEnergyHardpointLabel"); // NOI18N
        leftArmEnergyHardpointLabel.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftArmPanel.add(leftArmEnergyHardpointLabel, gridBagConstraints);

        leftArmMissileHardpointLabel.setText("jLabel21");
        leftArmMissileHardpointLabel.setMinimumSize(new Dimension(80, 20));
        leftArmMissileHardpointLabel.setName("leftArmMissileHardpointLabel"); // NOI18N
        leftArmMissileHardpointLabel.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftArmPanel.add(leftArmMissileHardpointLabel, gridBagConstraints);

        leftArmAMSHardpointLabel.setText("jLabel21");
        leftArmAMSHardpointLabel.setMinimumSize(new Dimension(80, 20));
        leftArmAMSHardpointLabel.setName("leftArmAMSHardpointLabel"); // NOI18N
        leftArmAMSHardpointLabel.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftArmPanel.add(leftArmAMSHardpointLabel, gridBagConstraints);

        leftArmBallisticHardpointLabel.setText("jLabel21");
        leftArmBallisticHardpointLabel.setMinimumSize(new Dimension(80, 20));
        leftArmBallisticHardpointLabel.setName("leftArmBallisticHardpointLabel"); // NOI18N
        leftArmBallisticHardpointLabel.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftArmPanel.add(leftArmBallisticHardpointLabel, gridBagConstraints);

        leftLowerArmToggleButton.setText("Lower Arm");
        leftLowerArmToggleButton.setMinimumSize(new Dimension(80, 20));
        leftLowerArmToggleButton.setName("leftLowerArmToggleButton"); // NOI18N
        leftLowerArmToggleButton.setPreferredSize(new Dimension(80, 20));
        leftLowerArmToggleButton.addActionListener(formListener);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftArmPanel.add(leftLowerArmToggleButton, gridBagConstraints);

        leftHandToggleButton.setText("Hand");
        leftHandToggleButton.setMinimumSize(new Dimension(80, 20));
        leftHandToggleButton.setName("leftHandToggleButton"); // NOI18N
        leftHandToggleButton.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftArmPanel.add(leftHandToggleButton, gridBagConstraints);

        leftArmStructureProgressBar.setMinimumSize(new Dimension(80, 20));
        leftArmStructureProgressBar.setName("leftArmStructureProgressBar"); // NOI18N
        leftArmStructureProgressBar.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftArmPanel.add(leftArmStructureProgressBar, gridBagConstraints);

        leftArmArmorProgressBar.setMinimumSize(new Dimension(80, 20));
        leftArmArmorProgressBar.setName("leftArmArmorProgressBar"); // NOI18N
        leftArmArmorProgressBar.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftArmPanel.add(leftArmArmorProgressBar, gridBagConstraints);

        leftArmCriticalList.setModel(new AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        leftArmCriticalList.setName("leftArmCriticalList"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftArmPanel.add(leftArmCriticalList, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        mechPanel.add(leftArmPanel, gridBagConstraints);

        rightArmPanel.setMaximumSize(new Dimension(100, 256));
        rightArmPanel.setMinimumSize(new Dimension(100, 256));
        rightArmPanel.setName("rightArmPanel"); // NOI18N
        rightArmPanel.setPreferredSize(new Dimension(100, 256));
        rightArmPanel.setLayout(new GridBagLayout());

        rightArmOmnipodComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        rightArmOmnipodComboBox.setMinimumSize(new Dimension(80, 20));
        rightArmOmnipodComboBox.setName("rightArmOmnipodComboBox"); // NOI18N
        rightArmOmnipodComboBox.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightArmPanel.add(rightArmOmnipodComboBox, gridBagConstraints);

        rightArmECMHardpointLabel.setText("jLabel21");
        rightArmECMHardpointLabel.setMinimumSize(new Dimension(80, 20));
        rightArmECMHardpointLabel.setName("rightArmECMHardpointLabel"); // NOI18N
        rightArmECMHardpointLabel.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightArmPanel.add(rightArmECMHardpointLabel, gridBagConstraints);

        rightArmEnergyHardpointLabel.setText("jLabel21");
        rightArmEnergyHardpointLabel.setMinimumSize(new Dimension(80, 20));
        rightArmEnergyHardpointLabel.setName("rightArmEnergyHardpointLabel"); // NOI18N
        rightArmEnergyHardpointLabel.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightArmPanel.add(rightArmEnergyHardpointLabel, gridBagConstraints);

        rightArmMissileHardpointLabel.setText("jLabel21");
        rightArmMissileHardpointLabel.setMinimumSize(new Dimension(80, 20));
        rightArmMissileHardpointLabel.setName("rightArmMissileHardpointLabel"); // NOI18N
        rightArmMissileHardpointLabel.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightArmPanel.add(rightArmMissileHardpointLabel, gridBagConstraints);

        rightArmAMSHardpointLabel.setText("jLabel21");
        rightArmAMSHardpointLabel.setMinimumSize(new Dimension(80, 20));
        rightArmAMSHardpointLabel.setName("rightArmAMSHardpointLabel"); // NOI18N
        rightArmAMSHardpointLabel.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightArmPanel.add(rightArmAMSHardpointLabel, gridBagConstraints);

        rightArmBallisticHardpointLabel.setText("jLabel21");
        rightArmBallisticHardpointLabel.setMinimumSize(new Dimension(80, 20));
        rightArmBallisticHardpointLabel.setName("rightArmBallisticHardpointLabel"); // NOI18N
        rightArmBallisticHardpointLabel.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightArmPanel.add(rightArmBallisticHardpointLabel, gridBagConstraints);

        rightLowerArmToggleButton.setText("Lower Arm");
        rightLowerArmToggleButton.setMinimumSize(new Dimension(80, 20));
        rightLowerArmToggleButton.setName("rightLowerArmToggleButton"); // NOI18N
        rightLowerArmToggleButton.setPreferredSize(new Dimension(80, 20));
        rightLowerArmToggleButton.addActionListener(formListener);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightArmPanel.add(rightLowerArmToggleButton, gridBagConstraints);

        rightHandToggleButton.setText("Hand");
        rightHandToggleButton.setMinimumSize(new Dimension(80, 20));
        rightHandToggleButton.setName("rightHandToggleButton"); // NOI18N
        rightHandToggleButton.setPreferredSize(new Dimension(80, 20));
        rightHandToggleButton.addActionListener(formListener);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightArmPanel.add(rightHandToggleButton, gridBagConstraints);

        rightArmStructureProgressBar.setMinimumSize(new Dimension(80, 20));
        rightArmStructureProgressBar.setName("rightArmStructureProgressBar"); // NOI18N
        rightArmStructureProgressBar.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightArmPanel.add(rightArmStructureProgressBar, gridBagConstraints);

        rightArmArmorProgressBar.setMinimumSize(new Dimension(80, 20));
        rightArmArmorProgressBar.setName("rightArmArmorProgressBar"); // NOI18N
        rightArmArmorProgressBar.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightArmPanel.add(rightArmArmorProgressBar, gridBagConstraints);

        rightArmCriticalList.setModel(new AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        rightArmCriticalList.setName("rightArmCriticalList"); // NOI18N
        rightArmCriticalList.setPreferredSize(new Dimension(80, 135));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightArmPanel.add(rightArmCriticalList, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        mechPanel.add(rightArmPanel, gridBagConstraints);

        special1Panel.setName("special1Panel"); // NOI18N
        special1Panel.setPreferredSize(new Dimension(100, 128));
        special1Panel.setLayout(new GridBagLayout());

        section1OmnipodComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        section1OmnipodComboBox.setMinimumSize(new Dimension(80, 20));
        section1OmnipodComboBox.setName("section1OmnipodComboBox"); // NOI18N
        section1OmnipodComboBox.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        special1Panel.add(section1OmnipodComboBox, gridBagConstraints);

        section1AMSHardpointLabel.setText("jLabel21");
        section1AMSHardpointLabel.setMinimumSize(new Dimension(80, 20));
        section1AMSHardpointLabel.setName("section1AMSHardpointLabel"); // NOI18N
        section1AMSHardpointLabel.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        special1Panel.add(section1AMSHardpointLabel, gridBagConstraints);

        section1ECMHardpointLabel.setText("jLabel21");
        section1ECMHardpointLabel.setMinimumSize(new Dimension(80, 20));
        section1ECMHardpointLabel.setName("section1ECMHardpointLabel"); // NOI18N
        section1ECMHardpointLabel.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        special1Panel.add(section1ECMHardpointLabel, gridBagConstraints);

        section1EnergyHardpointLabel.setText("jLabel21");
        section1EnergyHardpointLabel.setMinimumSize(new Dimension(80, 20));
        section1EnergyHardpointLabel.setName("section1EnergyHardpointLabel"); // NOI18N
        section1EnergyHardpointLabel.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        special1Panel.add(section1EnergyHardpointLabel, gridBagConstraints);

        section1BallisticHardpointLabel.setText("jLabel21");
        section1BallisticHardpointLabel.setMinimumSize(new Dimension(80, 20));
        section1BallisticHardpointLabel.setName("section1BallisticHardpointLabel"); // NOI18N
        section1BallisticHardpointLabel.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        special1Panel.add(section1BallisticHardpointLabel, gridBagConstraints);

        section1MissileHardpointLabel.setText("jLabel21");
        section1MissileHardpointLabel.setMinimumSize(new Dimension(80, 20));
        section1MissileHardpointLabel.setName("section1MissileHardpointLabel"); // NOI18N
        section1MissileHardpointLabel.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        special1Panel.add(section1MissileHardpointLabel, gridBagConstraints);

        section1StructureProgressBar.setMinimumSize(new Dimension(80, 20));
        section1StructureProgressBar.setName("section1StructureProgressBar"); // NOI18N
        section1StructureProgressBar.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        special1Panel.add(section1StructureProgressBar, gridBagConstraints);

        section1ArmorProgressBar.setMinimumSize(new Dimension(80, 20));
        section1ArmorProgressBar.setName("section1ArmorProgressBar"); // NOI18N
        section1ArmorProgressBar.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        special1Panel.add(section1ArmorProgressBar, gridBagConstraints);

        section1CriticalList.setModel(new AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        section1CriticalList.setName("section1CriticalList"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        special1Panel.add(section1CriticalList, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        mechPanel.add(special1Panel, gridBagConstraints);

        special2Panel.setName("special2Panel"); // NOI18N
        special2Panel.setPreferredSize(new Dimension(100, 128));
        special2Panel.setLayout(new GridBagLayout());

        section2OmnipodComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        section2OmnipodComboBox.setMinimumSize(new Dimension(80, 20));
        section2OmnipodComboBox.setName("section2OmnipodComboBox"); // NOI18N
        section2OmnipodComboBox.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        special2Panel.add(section2OmnipodComboBox, gridBagConstraints);

        section2AMSHardpointLabel.setText("jLabel21");
        section2AMSHardpointLabel.setMinimumSize(new Dimension(80, 20));
        section2AMSHardpointLabel.setName("section2AMSHardpointLabel"); // NOI18N
        section2AMSHardpointLabel.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        special2Panel.add(section2AMSHardpointLabel, gridBagConstraints);

        section2ECMHardpointLabel.setText("jLabel21");
        section2ECMHardpointLabel.setMinimumSize(new Dimension(80, 20));
        section2ECMHardpointLabel.setName("section2ECMHardpointLabel"); // NOI18N
        section2ECMHardpointLabel.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        special2Panel.add(section2ECMHardpointLabel, gridBagConstraints);

        section2EnergyHardpointLabel.setText("jLabel21");
        section2EnergyHardpointLabel.setMinimumSize(new Dimension(80, 20));
        section2EnergyHardpointLabel.setName("section2EnergyHardpointLabel"); // NOI18N
        section2EnergyHardpointLabel.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        special2Panel.add(section2EnergyHardpointLabel, gridBagConstraints);

        section2BallisticHardpointLabel.setText("jLabel21");
        section2BallisticHardpointLabel.setMinimumSize(new Dimension(80, 20));
        section2BallisticHardpointLabel.setName("section2BallisticHardpointLabel"); // NOI18N
        section2BallisticHardpointLabel.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        special2Panel.add(section2BallisticHardpointLabel, gridBagConstraints);

        section2MissileHardpointLabel.setText("jLabel21");
        section2MissileHardpointLabel.setMinimumSize(new Dimension(80, 20));
        section2MissileHardpointLabel.setName("section2MissileHardpointLabel"); // NOI18N
        section2MissileHardpointLabel.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        special2Panel.add(section2MissileHardpointLabel, gridBagConstraints);

        section2StructureProgressBar.setMinimumSize(new Dimension(80, 20));
        section2StructureProgressBar.setName("section2StructureProgressBar"); // NOI18N
        section2StructureProgressBar.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        special2Panel.add(section2StructureProgressBar, gridBagConstraints);

        section2ArmorProgressBar.setMinimumSize(new Dimension(80, 20));
        section2ArmorProgressBar.setName("section2ArmorProgressBar"); // NOI18N
        section2ArmorProgressBar.setPreferredSize(new Dimension(80, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        special2Panel.add(section2ArmorProgressBar, gridBagConstraints);

        section2CriticalList.setModel(new AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        section2CriticalList.setName("section2CriticalList"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        special2Panel.add(section2CriticalList, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        mechPanel.add(special2Panel, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        add(mechPanel, gridBagConstraints);

        secondaryTabbedPane.setMinimumSize(new Dimension(256, 470));
        secondaryTabbedPane.setName("secondaryTabbedPane"); // NOI18N
        secondaryTabbedPane.setPreferredSize(new Dimension(256, 470));

        quirksPanel.setName("quirksPanel"); // NOI18N
        quirksPanel.setLayout(new GridBagLayout());

        quirksJScrollPane.setName("quirksJScrollPane"); // NOI18N

        quirksJTextArea.setEditable(false);
        quirksJTextArea.setColumns(20);
        quirksJTextArea.setRows(5);
        quirksJTextArea.setName("quirksJTextArea"); // NOI18N
        quirksJScrollPane.setViewportView(quirksJTextArea);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        quirksPanel.add(quirksJScrollPane, gridBagConstraints);

        secondaryTabbedPane.addTab("Quirks", quirksPanel);

        componentsScrollPane.setName("componentsScrollPane"); // NOI18N

        componentsPanel.setName("componentsPanel"); // NOI18N
        componentsPanel.setLayout(new GridBagLayout());

        engineComponentPanel.setName("engineComponentPanel"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        componentsPanel.add(engineComponentPanel, gridBagConstraints);

        heatsinkComponentPanel.setName("heatsinkComponentPanel"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        componentsPanel.add(heatsinkComponentPanel, gridBagConstraints);

        structureComponentPanel.setName("structureComponentPanel"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        componentsPanel.add(structureComponentPanel, gridBagConstraints);

        armorComponentPanel.setName("armorComponentPanel"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        componentsPanel.add(armorComponentPanel, gridBagConstraints);

        gyroComponentPanel.setName("gyroComponentPanel"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        componentsPanel.add(gyroComponentPanel, gridBagConstraints);

        myomerComponentPanel.setName("myomerComponentPanel"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        componentsPanel.add(myomerComponentPanel, gridBagConstraints);

        jumpjetComponentPanel.setName("jumpjetComponentPanel"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        componentsPanel.add(jumpjetComponentPanel, gridBagConstraints);

        cockpitComponentPanel.setName("cockpitComponentPanel"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        componentsPanel.add(cockpitComponentPanel, gridBagConstraints);

        componentsScrollPane.setViewportView(componentsPanel);

        secondaryTabbedPane.addTab("Components", componentsScrollPane);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        add(secondaryTabbedPane, gridBagConstraints);

        InformationTabbedPane.setMinimumSize(new Dimension(1024, 230));
        InformationTabbedPane.setName("InformationTabbedPane"); // NOI18N
        InformationTabbedPane.setPreferredSize(new Dimension(1024, 230));

        ModelOverviewPanel.setName("ModelOverviewPanel"); // NOI18N
        ModelOverviewPanel.setLayout(new GridBagLayout());

        descriptionScrollPane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Mech Overview"));
        descriptionScrollPane.setMaximumSize(new Dimension(295, 100));
        descriptionScrollPane.setMinimumSize(new Dimension(295, 100));
        descriptionScrollPane.setName("descriptionScrollPane"); // NOI18N
        descriptionScrollPane.setPreferredSize(new Dimension(295, 100));

        descriptionTextArea.setColumns(20);
        descriptionTextArea.setRows(5);
        descriptionTextArea.setName("descriptionTextArea"); // NOI18N
        descriptionScrollPane.setViewportView(descriptionTextArea);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ModelOverviewPanel.add(descriptionScrollPane, gridBagConstraints);

        overviewComponentPanel.setName("overviewComponentPanel"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ModelOverviewPanel.add(overviewComponentPanel, gridBagConstraints);

        hardpointComponentPanel.setName("hardpointComponentPanel"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ModelOverviewPanel.add(hardpointComponentPanel, gridBagConstraints);

        InformationTabbedPane.addTab("Model Overview", ModelOverviewPanel);

        ModelSpecificationsPanel.setName("ModelSpecificationsPanel"); // NOI18N
        ModelSpecificationsPanel.setLayout(new GridBagLayout());

        speedComponentPanel.setName("speedComponentPanel"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ModelSpecificationsPanel.add(speedComponentPanel, gridBagConstraints);

        manueverabilityComponentPanel.setName("manueverabilityComponentPanel"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ModelSpecificationsPanel.add(manueverabilityComponentPanel, gridBagConstraints);

        movementRangeComponentPanel.setName("movementRangeComponentPanel"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ModelSpecificationsPanel.add(movementRangeComponentPanel, gridBagConstraints);

        movementSpeedComponentPanel.setName("movementSpeedComponentPanel"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ModelSpecificationsPanel.add(movementSpeedComponentPanel, gridBagConstraints);

        InformationTabbedPane.addTab("Model Specifications", ModelSpecificationsPanel);

        InformationSpecificationsPanel.setName("InformationSpecificationsPanel"); // NOI18N
        InformationSpecificationsPanel.setLayout(new GridBagLayout());
        InformationTabbedPane.addTab("Sensors/Targetting Specifications", InformationSpecificationsPanel);

        EquipmentSpecificationsPanel.setName("EquipmentSpecificationsPanel"); // NOI18N
        EquipmentSpecificationsPanel.setLayout(new GridBagLayout());
        InformationTabbedPane.addTab("Equipment Specifications", EquipmentSpecificationsPanel);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        add(InformationTabbedPane, gridBagConstraints);

        OptionsPanel.setName("OptionsPanel"); // NOI18N
        OptionsPanel.setLayout(new GridBagLayout());

        FeaturesPanel.setMaximumSize(new Dimension(256, 230));
        FeaturesPanel.setMinimumSize(new Dimension(256, 230));
        FeaturesPanel.setName("FeaturesPanel"); // NOI18N
        FeaturesPanel.setPreferredSize(new Dimension(256, 230));
        FeaturesPanel.setLayout(new GridBagLayout());

        FrankenmechToggle.setText("Frankenmechs");
        FrankenmechToggle.setEnabled(false);
        FrankenmechToggle.setHorizontalTextPosition(SwingConstants.CENTER);
        FrankenmechToggle.setName("FrankenmechToggle"); // NOI18N
        FrankenmechToggle.setPreferredSize(new Dimension(0, 0));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(15, 15, 15, 15);
        FeaturesPanel.add(FrankenmechToggle, gridBagConstraints);

        MixtechToggle.setText("Mixtech");
        MixtechToggle.setEnabled(false);
        MixtechToggle.setHorizontalTextPosition(SwingConstants.CENTER);
        MixtechToggle.setName("MixtechToggle"); // NOI18N
        MixtechToggle.setPreferredSize(new Dimension(0, 0));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(15, 15, 15, 15);
        FeaturesPanel.add(MixtechToggle, gridBagConstraints);

        FuturetechToggle.setText("Futuretech");
        FuturetechToggle.setEnabled(false);
        FuturetechToggle.setHorizontalTextPosition(SwingConstants.CENTER);
        FuturetechToggle.setName("FuturetechToggle"); // NOI18N
        FuturetechToggle.setPreferredSize(new Dimension(0, 0));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(15, 15, 15, 15);
        FeaturesPanel.add(FuturetechToggle, gridBagConstraints);

        OmniRestrictionsToggle.setText("Omni Restrictions");
        OmniRestrictionsToggle.setEnabled(false);
        OmniRestrictionsToggle.setHorizontalTextPosition(SwingConstants.CENTER);
        OmniRestrictionsToggle.setName("OmniRestrictionsToggle"); // NOI18N
        OmniRestrictionsToggle.setPreferredSize(new Dimension(0, 0));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(15, 15, 15, 15);
        FeaturesPanel.add(OmniRestrictionsToggle, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        OptionsPanel.add(FeaturesPanel, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        add(OptionsPanel, gridBagConstraints);
    }

    // Code for dispatching events from components to event handlers.

    private class FormListener implements ActionListener, ChangeListener {
        FormListener() {}
        public void actionPerformed(ActionEvent evt) {
            if (evt.getSource() == chassisComboBox) {
                MechlabPanel.this.chassisComboBoxActionPerformed(evt);
            }
            else if (evt.getSource() == modelComboBox) {
                MechlabPanel.this.modelComboBoxActionPerformed(evt);
            }
            else if (evt.getSource() == maximumArmorButton) {
                MechlabPanel.this.maximumArmorButtonActionPerformed(evt);
            }
            else if (evt.getSource() == leftTorsoCASEToggleButton) {
                MechlabPanel.this.leftTorsoCASEToggleButtonActionPerformed(evt);
            }
            else if (evt.getSource() == rightTorsoCASEToggleButton) {
                MechlabPanel.this.rightTorsoCASEToggleButtonActionPerformed(evt);
            }
            else if (evt.getSource() == leftLowerArmToggleButton) {
                MechlabPanel.this.leftLowerArmToggleButtonActionPerformed(evt);
            }
            else if (evt.getSource() == rightLowerArmToggleButton) {
                MechlabPanel.this.rightLowerArmToggleButtonActionPerformed(evt);
            }
            else if (evt.getSource() == rightHandToggleButton) {
                MechlabPanel.this.rightHandToggleButtonActionPerformed(evt);
            }
            else if (evt.getSource() == clearArmorButton) {
                MechlabPanel.this.clearArmorButtonActionPerformed(evt);
            }
        }

        public void stateChanged(ChangeEvent evt) {
            if (evt.getSource() == MechTabPane) {
                MechlabPanel.this.MechTabPaneStateChanged(evt);
            }
            else if (evt.getSource() == rightArmSpinner) {
                MechlabPanel.this.armorSpinnerStateChanged(evt);
            }
            else if (evt.getSource() == headSpinner) {
                MechlabPanel.this.armorSpinnerStateChanged(evt);
            }
            else if (evt.getSource() == centerTorsoSpinner) {
                MechlabPanel.this.armorSpinnerStateChanged(evt);
            }
            else if (evt.getSource() == rightTorsoSpinner) {
                MechlabPanel.this.armorSpinnerStateChanged(evt);
            }
            else if (evt.getSource() == centerRearTorsoSpinner) {
                MechlabPanel.this.armorSpinnerStateChanged(evt);
            }
            else if (evt.getSource() == rightRearTorsoSpinner) {
                MechlabPanel.this.armorSpinnerStateChanged(evt);
            }
            else if (evt.getSource() == leftRearTorsoSpinner) {
                MechlabPanel.this.armorSpinnerStateChanged(evt);
            }
            else if (evt.getSource() == rightLegSpinner) {
                MechlabPanel.this.armorSpinnerStateChanged(evt);
            }
            else if (evt.getSource() == special2Spinner) {
                MechlabPanel.this.armorSpinnerStateChanged(evt);
            }
            else if (evt.getSource() == special1Spinner) {
                MechlabPanel.this.armorSpinnerStateChanged(evt);
            }
            else if (evt.getSource() == leftLegSpinner) {
                MechlabPanel.this.armorSpinnerStateChanged(evt);
            }
            else if (evt.getSource() == leftArmSpinner) {
                MechlabPanel.this.armorSpinnerStateChanged(evt);
            }
        }
    }// </editor-fold>//GEN-END:initComponents

    private void chassisComboBoxActionPerformed(ActionEvent evt) {//GEN-FIRST:event_chassisComboBoxActionPerformed
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

    private void modelComboBoxActionPerformed(ActionEvent evt) {//GEN-FIRST:event_modelComboBoxActionPerformed
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

        SetSectionOmnipods(rightArmOmnipodComboBox, SectionType.RIGHT_ARM);
        SetSectionOmnipods(leftArmOmnipodComboBox, SectionType.LEFT_ARM);
        SetSectionOmnipods(rightTorsoOmnipodComboBox, SectionType.RIGHT_TORSO);
        SetSectionOmnipods(leftTorsoOmnipodComboBox, SectionType.LEFT_TORSO);
        SetSectionOmnipods(centerTorsoOmnipodComboBox, SectionType.CENTER_TORSO);
        SetSectionOmnipods(headOmnipodComboBox, SectionType.HEAD);
        SetSectionOmnipods(rightLegOmnipodComboBox, SectionType.RIGHT_LEG);
        SetSectionOmnipods(leftLegOmnipodComboBox, SectionType.LEFT_LEG);
        
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
        
        headSpinnerModel.setMaximum(user.variant.sections.get(SectionType.HEAD).maximumArmor);
        leftArmSpinnerModel.setMaximum(user.variant.sections.get(SectionType.LEFT_ARM).maximumArmor);
        rightArmSpinnerModel.setMaximum(user.variant.sections.get(SectionType.RIGHT_ARM).maximumArmor);
        leftLegSpinnerModel.setMaximum(user.variant.sections.get(SectionType.LEFT_LEG).maximumArmor);
        rightLegSpinnerModel.setMaximum(user.variant.sections.get(SectionType.RIGHT_LEG).maximumArmor);
        leftTorsoSpinnerModel.setMaximum(user.variant.sections.get(SectionType.LEFT_TORSO).maximumArmor);
        rightTorsoSpinnerModel.setMaximum(user.variant.sections.get(SectionType.RIGHT_TORSO).maximumArmor);
        centerTorsoSpinnerModel.setMaximum(user.variant.sections.get(SectionType.CENTER_TORSO).maximumArmor);
        rightRearTorsoSpinnerModel.setMaximum(user.variant.sections.get(SectionType.LEFT_TORSO).maximumArmor);
        leftRearTorsoSpinnerModel.setMaximum(user.variant.sections.get(SectionType.RIGHT_TORSO).maximumArmor);
        centerRearTorsoSpinnerModel.setMaximum(user.variant.sections.get(SectionType.CENTER_TORSO).maximumArmor);

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
        criticalsProgressBar.setMaximum(user.variant.maximumCriticals);
        criticalsProgressBar.setValue(user.variant.currentCriticals);
        criticalsProgressBar.setString(String.format("%d/%d", user.variant.currentCriticals, user.variant.maximumCriticals));

        engineComponentPanel.setEngine(user.variant);
        gyroComponentPanel.setGyro(user.variant);
        armorComponentPanel.setArmor(user.variant);
        structureComponentPanel.setStructure(user.variant);
        heatsinkComponentPanel.setHeatsinks(user.variant);
        jumpjetComponentPanel.setJumpjets(user.variant);
        cockpitComponentPanel.setCockpit(user.variant);
        myomerComponentPanel.setMyomer(user.variant);
    }//GEN-LAST:event_modelComboBoxActionPerformed

    private void MechTabPaneStateChanged(ChangeEvent evt) {//GEN-FIRST:event_MechTabPaneStateChanged
        this.updateCriticalPanelVisibility();
    }//GEN-LAST:event_MechTabPaneStateChanged

    private void leftTorsoCASEToggleButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_leftTorsoCASEToggleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_leftTorsoCASEToggleButtonActionPerformed

    private void rightTorsoCASEToggleButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_rightTorsoCASEToggleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rightTorsoCASEToggleButtonActionPerformed

    private void leftLowerArmToggleButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_leftLowerArmToggleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_leftLowerArmToggleButtonActionPerformed

    private void rightLowerArmToggleButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_rightLowerArmToggleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rightLowerArmToggleButtonActionPerformed

    private void rightHandToggleButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_rightHandToggleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rightHandToggleButtonActionPerformed

    private void armorSpinnerStateChanged(ChangeEvent evt) {//GEN-FIRST:event_armorSpinnerStateChanged
        updateArmor();
    }//GEN-LAST:event_armorSpinnerStateChanged

    private void maximumArmorButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_maximumArmorButtonActionPerformed
        headSpinnerModel.setValue(headSpinnerModel.getMaximum());
        setMaximumTorsoArmor(SectionType.CENTER_TORSO, centerTorsoSpinnerModel, centerRearTorsoSpinnerModel);
        setMaximumTorsoArmor(SectionType.RIGHT_TORSO, rightTorsoSpinnerModel, rightRearTorsoSpinnerModel);
        setMaximumTorsoArmor(SectionType.LEFT_TORSO, leftTorsoSpinnerModel, leftRearTorsoSpinnerModel);
        rightArmSpinnerModel.setValue(rightArmSpinnerModel.getMaximum());
        leftArmSpinnerModel.setValue(leftArmSpinnerModel.getMaximum());
        rightLegSpinnerModel.setValue(rightLegSpinnerModel.getMaximum());
        leftLegSpinnerModel.setValue(leftLegSpinnerModel.getMaximum());
    }//GEN-LAST:event_maximumArmorButtonActionPerformed

    private void clearArmorButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_clearArmorButtonActionPerformed
        headSpinnerModel.setValue(0);                                                 
        centerTorsoSpinnerModel.setValue(0);                                                 
        rightTorsoSpinnerModel.setValue(0);                                                 
        leftTorsoSpinnerModel.setValue(0);                                                 
        centerRearTorsoSpinnerModel.setValue(0);                                                 
        rightRearTorsoSpinnerModel.setValue(0);                                                 
        leftRearTorsoSpinnerModel.setValue(0);                                              
        rightArmSpinnerModel.setValue(0);                                                 
        leftArmSpinnerModel.setValue(0);                                                 
        rightLegSpinnerModel.setValue(0);                                                 
        leftLegSpinnerModel.setValue(0);
    }//GEN-LAST:event_clearArmorButtonActionPerformed

    private void setMaximumTorsoArmor(final SectionType sectionIndex, final SpinnerNumberModel frontSpinnerModel, final SpinnerNumberModel rearSpinnerModel) {
        final int rearDistribution = (int) Math.round(user.variant.sections.get(sectionIndex).maximumArmor * preferences.REAR_ARMOR_PERCENTAGE);
        final int frontDistribution = user.variant.sections.get(sectionIndex).maximumArmor - rearDistribution;
        
        frontSpinnerModel.setValue(frontDistribution);
        rearSpinnerModel.setValue(rearDistribution);
    }
    
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

    private void SetSectionOmnipods(JComboBox omnipodComboBox, SectionType sectionIndex) {
        omnipodComboBox.removeAllItems();
        
        selectedDatabase.SECTION_BLUEPRINTS.stream()
                .filter((sectionBlueprint) -> (sectionBlueprint.name.equals(user.variant.modelType.sectionModels.get(sectionBlueprint.section))))
                .filter((sectionBlueprint) -> (sectionBlueprint.section.equals(sectionIndex)))
                .map((sectionBlueprint) -> {
                    omnipodComboBox.addItem(sectionBlueprint);
                    return sectionBlueprint;
                }).forEachOrdered((sectionBlueprint) -> {
                    omnipodComboBox.setSelectedItem(sectionBlueprint);
                });
        
        if (sectionIndex == SectionType.CENTER_TORSO)
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

    private void updateArmorLabels(final JProgressBar frontArmorProgressBar, final JProgressBar rearArmorProgressBar, final JProgressBar structureProgressBar, final SectionType sectionIndex) {
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
        
        speedProgressBar.setValue(user.variant.currentEngineRating);
        speedProgressBar.setString(String.format("%.1f kph", user.variant.engine.getSpeed(user.variant.chassisType.tonnage, user.variant.currentEngineRating)));
        engineComponentPanel.setEngine(user.variant);
    }

    private void updateHeatsinks() {
        int n = user.variant.engine.getHeatSinkCapacity(user.variant.currentEngineRating);
        for (Section section : user.variant.sections.values()) {
            for (int j = section.components.size() - 1; j >= 0; --j) {
                if (!CriticalType.HEAT_SINK.equals(section.components.get(j).itemType)) {
                    continue;
                }
                if (n >= user.variant.currentHeatSinkCount) {
                    section.components.remove(j);
                    continue;
                }
                ++n;
            }
        }
        
        n = user.variant.currentHeatSinkCount - n;
        
        heatsinkComponentPanel.setHeatsinks(user.variant);
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
        jumpjetComponentPanel.setJumpjets(user.variant);
        this.manueverabilityComponentPanel.setManueverability(user.variant);
    }
    
    private void updateArmorSpinnerModel(final SectionType sectionIndex, final SpinnerNumberModel frontSpinnerModel) {
        if (frontSpinnerModel == null) {
            //log error
            return;
        }
        
        final Section section = user.variant.sections.get(sectionIndex);
        
        if (section.hasRearArmor) {
            //log error
            return;
        }
        
        user.variant.sections.get(sectionIndex).frontArmor = (int) frontSpinnerModel.getValue();
    }
    
    private void updateArmorSpinnerModel(final SectionType sectionIndex, final SpinnerNumberModel frontSpinnerModel, final SpinnerNumberModel rearSpinnerModel) {
        if (frontSpinnerModel == null) {
            //log error
            return;
        }
        
        final Section section = user.variant.sections.get(sectionIndex);
        
        if (!section.hasRearArmor || rearSpinnerModel == null) {
            //log error
            return;
        }
        
        user.variant.sections.get(sectionIndex).frontArmor = (int) frontSpinnerModel.getValue();
        user.variant.sections.get(sectionIndex).rearArmor = (int) rearSpinnerModel.getValue();

        frontSpinnerModel.setMaximum(section.maximumArmor - section.rearArmor);
        rearSpinnerModel.setMaximum(section.maximumArmor - section.frontArmor);
    }

    private void updateArmor() {
        if (user.variant.armor == null) {
            return;
        }
        
        updateArmorSpinnerModel(SectionType.HEAD, headSpinnerModel);
        updateArmorSpinnerModel(SectionType.CENTER_TORSO, centerTorsoSpinnerModel, centerRearTorsoSpinnerModel);
        updateArmorSpinnerModel(SectionType.RIGHT_TORSO, rightTorsoSpinnerModel, rightRearTorsoSpinnerModel);
        updateArmorSpinnerModel(SectionType.LEFT_TORSO, leftTorsoSpinnerModel, leftRearTorsoSpinnerModel);
        updateArmorSpinnerModel(SectionType.RIGHT_ARM, rightArmSpinnerModel);
        updateArmorSpinnerModel(SectionType.LEFT_ARM, leftArmSpinnerModel);
        updateArmorSpinnerModel(SectionType.RIGHT_LEG, rightLegSpinnerModel);
        updateArmorSpinnerModel(SectionType.LEFT_LEG, leftLegSpinnerModel);
        
        armorComponentPanel.setArmor(user.variant);
        armorPointsPerTonLabel.setText(String.format("%.2f", user.variant.armor.pointsPerTon));
        armorProgressBar.setString("" + user.variant.getCurrentArmorTotal());
        armorProgressBar.setValue(user.variant.getCurrentArmorTotal());
        
        this.updateArmorLabels(this.rightArmArmorProgressBar, null, this.rightArmStructureProgressBar, SectionType.RIGHT_ARM);
        this.updateArmorLabels(this.leftArmArmorProgressBar, null, this.leftArmStructureProgressBar, SectionType.LEFT_ARM);
        this.updateArmorLabels(this.rightLegArmorProgressBar, null, this.rightLegStructureProgressBar, SectionType.RIGHT_LEG);
        this.updateArmorLabels(this.leftLegArmorProgressBar, null, this.leftLegStructureProgressBar, SectionType.LEFT_LEG);
        this.updateArmorLabels(this.rightTorsoFrontArmorProgressBar, this.rightTorsoRearArmorProgressBar, this.rightTorsoStructureProgressBar, SectionType.RIGHT_TORSO);
        this.updateArmorLabels(this.leftTorsoFrontArmorProgressBar, this.leftTorsoRearArmorProgressBar, this.leftTorsoStructureProgressBar, SectionType.LEFT_TORSO);
        this.updateArmorLabels(this.centerTorsoFrontArmorProgressBar, this.centerTorsoRearArmorProgressBar, this.centerTorsoStructureProgressBar, SectionType.CENTER_TORSO);
        this.updateArmorLabels(this.headArmorProgressBar, null, this.headStructureProgressBar, SectionType.HEAD);
        
        this.headArmorAmountLabel.setText(String.format("%d/%d", user.variant.sections.get(SectionType.HEAD).frontArmor, user.variant.sections.get(SectionType.HEAD).maximumArmor));
        this.centerTorsoArmorAmountLabel.setText(String.format("%d/%d", user.variant.sections.get(SectionType.CENTER_TORSO).frontArmor + user.variant.sections.get(SectionType.CENTER_TORSO).rearArmor, user.variant.sections.get(SectionType.CENTER_TORSO).maximumArmor));
        this.rightTorsoArmorAmountLabel.setText(String.format("%d/%d", user.variant.sections.get(SectionType.RIGHT_TORSO).frontArmor + user.variant.sections.get(SectionType.RIGHT_TORSO).rearArmor, user.variant.sections.get(SectionType.RIGHT_TORSO).maximumArmor));
        this.leftTorsoArmorAmountLabel.setText(String.format("%d/%d", user.variant.sections.get(SectionType.LEFT_TORSO).frontArmor + user.variant.sections.get(SectionType.LEFT_TORSO).rearArmor, user.variant.sections.get(SectionType.LEFT_TORSO).maximumArmor));
        this.rightArmArmorAmountLabel.setText(String.format("%d/%d", user.variant.sections.get(SectionType.RIGHT_ARM).frontArmor, user.variant.sections.get(SectionType.RIGHT_ARM).maximumArmor));
        this.leftArmArmorAmountLabel.setText(String.format("%d/%d", user.variant.sections.get(SectionType.LEFT_ARM).frontArmor, user.variant.sections.get(SectionType.LEFT_ARM).maximumArmor));
        this.rightLegArmorAmountLabel.setText(String.format("%d/%d", user.variant.sections.get(SectionType.RIGHT_LEG).frontArmor, user.variant.sections.get(SectionType.RIGHT_LEG).maximumArmor));
        this.leftLegArmorAmountLabel.setText(String.format("%d/%d", user.variant.sections.get(SectionType.LEFT_LEG).frontArmor, user.variant.sections.get(SectionType.LEFT_LEG).maximumArmor));
        this.armorTotalLabel.setText(String.format("%d/%d", user.variant.getCurrentArmorTotal(), user.variant.getMaximumArmorTotal()));
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
                if (!CriticalType.WEAPON.equals(crittable3.itemType)) {
                    continue;
                }
                
                weaponBlueprint = (WeaponBlueprint) crittable3.reference;
                d += weaponBlueprint.getEffectiveDamage();
                d2 += weaponBlueprint.heat;
                d3 += weaponBlueprint.getDPS(0.0);
                d4 += weaponBlueprint.getHPS(0.0);
            }
        }
        
        for (Section section2 : user.variant.sections.values()) {
            for (Crittable crittable3 : section2.components) {
                if (!CriticalType.WEAPON.equals(crittable3.itemType)) {
                    continue;
                }
                
                weaponBlueprint = (WeaponBlueprint) crittable3.reference;
                n3 = (int) ((double) n3 + (double) weaponBlueprint.effective_range * (weaponBlueprint.getDPS(0.0) / d3));
            }
        }
        
        for (Section section2 : user.variant.sections.values()) {
            for (Crittable crittable3 : section2.components) {
                if (!CriticalType.WEAPON.equals(crittable3.itemType)) {
                    continue;
                }
                
                weaponBlueprint = (WeaponBlueprint) crittable3.reference;
                int temp_int = Math.abs(weaponBlueprint.effective_range - n3);
                
                if (temp_int >= n) {
                    continue;
                }
                
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
        
        DefaultListModel<String> defaultListModel = new DefaultListModel<>();
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
    private JPanel AdjustmentsPanel;
    private JPanel ArmorPanel;
    private JPanel ChassisPanel;
    private JPanel EfficienciesPanel;
    private JPanel EquipmentSpecificationsPanel;
    private JPanel FeaturesPanel;
    private JToggleButton FrankenmechToggle;
    private JToggleButton FuturetechToggle;
    private JPanel InformationSpecificationsPanel;
    private JTabbedPane InformationTabbedPane;
    private JTabbedPane MechTabPane;
    private JToggleButton MixtechToggle;
    private JPanel ModelOverviewPanel;
    private JPanel ModelSpecificationsPanel;
    private JToggleButton OmniRestrictionsToggle;
    private JPanel OptionsPanel;
    private JPanel SystemsPanel;
    private JPanel UpgradesPanel;
    private JScrollPane UpgradesScrollPane;
    private JPanel WeaponsPanel;
    private JProgressBar alphaDamageProgressBar;
    private JProgressBar alphaHeatProgressBar;
    private JLabel armorAmountTitle;
    private JComboBox<String> armorComboBox;
    private ComponentPanel armorComponentPanel;
    private JLabel armorFrontTitle;
    private JLabel armorPointsPerTonLabel;
    private JLabel armorPointsPerTonTitle;
    private JProgressBar armorProgressBar;
    private JLabel armorRearTitle;
    private JLabel armorSection10Title;
    private JLabel armorSection1Title;
    private JLabel armorSection2Title;
    private JLabel armorSection3Title;
    private JLabel armorSection4Title;
    private JLabel armorSection5Title;
    private JLabel armorSection6Title;
    private JLabel armorSection7Title;
    private JLabel armorSection8Title;
    private JLabel armorSection9Title;
    private JLabel armorSectionTitle;
    private JLabel armorTotalLabel;
    private JLabel armorTotalTitle;
    private JSpinner centerRearTorsoSpinner;
    private JLabel centerTorsoAMSHardpointLabel;
    private JLabel centerTorsoArmorAmountLabel;
    private JLabel centerTorsoBallisticHardpointLabel;
    private JList<String> centerTorsoCriticalList;
    private JLabel centerTorsoECMHardpointLabel;
    private JLabel centerTorsoEnergyHardpointLabel;
    private JProgressBar centerTorsoFrontArmorProgressBar;
    private JLabel centerTorsoMissileHardpointLabel;
    private JComboBox<String> centerTorsoOmnipodComboBox;
    private JPanel centerTorsoPanel;
    private JProgressBar centerTorsoRearArmorProgressBar;
    private JSpinner centerTorsoSpinner;
    private JProgressBar centerTorsoStructureProgressBar;
    JComboBox<String> chassisComboBox;
    private JButton clearArmorButton;
    private JComboBox<String> cockpitComboBox;
    private ComponentPanel cockpitComponentPanel;
    private JPanel componentsPanel;
    private JScrollPane componentsScrollPane;
    private JProgressBar criticalsProgressBar;
    private JScrollPane descriptionScrollPane;
    private JTextArea descriptionTextArea;
    private JLabel ecmCapableLabel;
    private JButton efficientArmorButton;
    private JComboBox<String> engineComboBox;
    private ComponentPanel engineComponentPanel;
    private JSpinner engineRatingSpinner;
    private JButton exportButton;
    private JProgressBar firepowerProgressBar;
    private JComboBox<String> gyroComboBox;
    private ComponentPanel gyroComponentPanel;
    private ComponentPanel hardpointComponentPanel;
    private JLabel headAMSHardpointLabel;
    private JLabel headArmorAmountLabel;
    private JProgressBar headArmorProgressBar;
    private JLabel headBallisticHardpointLabel;
    private JList<String> headCriticalList;
    private JLabel headECMHardpointLabel;
    private JLabel headEnergyHardpointLabel;
    private JLabel headMissileHardpointLabel;
    private JComboBox<String> headOmnipodComboBox;
    private JPanel headPanel;
    private JSpinner headSpinner;
    private JProgressBar headStructureProgressBar;
    private JProgressBar heatEfficiencyProgressBar;
    private JComboBox<String> heatSinkComboBox;
    private ComponentPanel heatsinkComponentPanel;
    private JButton importButton;
    private JLabel jumpCapableLabel;
    private JProgressBar jumpDistanceProgressBar;
    private JProgressBar jumpHeightProgressBar;
    private JComboBox<String> jumpJetComboBox;
    private ComponentPanel jumpjetComponentPanel;
    private JLabel leftArmAMSHardpointLabel;
    private JLabel leftArmArmorAmountLabel;
    private JProgressBar leftArmArmorProgressBar;
    private JLabel leftArmBallisticHardpointLabel;
    private JList<String> leftArmCriticalList;
    private JLabel leftArmECMHardpointLabel;
    private JLabel leftArmEnergyHardpointLabel;
    private JLabel leftArmMissileHardpointLabel;
    private JComboBox<String> leftArmOmnipodComboBox;
    private JPanel leftArmPanel;
    private JSpinner leftArmSpinner;
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
    private JPanel leftLegPanel;
    private JSpinner leftLegSpinner;
    private JProgressBar leftLegStructureProgressBar;
    private JToggleButton leftLowerArmToggleButton;
    private JSpinner leftRearTorsoSpinner;
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
    private JPanel leftTorsoPanel;
    private JProgressBar leftTorsoRearArmorProgressBar;
    private JSpinner leftTorsoSpinner;
    private JProgressBar leftTorsoStructureProgressBar;
    private JButton loadButton;
    private ComponentPanel manueverabilityComponentPanel;
    private JButton maximumArmorButton;
    private JPanel mechPanel;
    private JLabel mechTypeLabel;
    JComboBox<String> modelComboBox;
    private ComponentPanel movementRangeComponentPanel;
    private ComponentPanel movementSpeedComponentPanel;
    private JComboBox<String> myomerComboBox;
    private ComponentPanel myomerComponentPanel;
    private ComponentPanel overviewComponentPanel;
    private JScrollPane quirksJScrollPane;
    private JTextArea quirksJTextArea;
    private JPanel quirksPanel;
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
    private JPanel rightArmPanel;
    private JSpinner rightArmSpinner;
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
    private JPanel rightLegPanel;
    private JSpinner rightLegSpinner;
    private JProgressBar rightLegStructureProgressBar;
    private JToggleButton rightLowerArmToggleButton;
    private JSpinner rightRearTorsoSpinner;
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
    private JPanel rightTorsoPanel;
    private JProgressBar rightTorsoRearArmorProgressBar;
    private JSpinner rightTorsoSpinner;
    private JProgressBar rightTorsoStructureProgressBar;
    private JButton saveButton;
    private JTabbedPane secondaryTabbedPane;
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
    private JPanel special1Panel;
    private JSpinner special1Spinner;
    private JLabel special2ArmorAmountLabel;
    private JPanel special2Panel;
    private JSpinner special2Spinner;
    private ComponentPanel speedComponentPanel;
    private JProgressBar speedProgressBar;
    private JPanel statisticsPanel;
    private JComboBox<String> structureComboBox;
    private ComponentPanel structureComponentPanel;
    private JLabel techBaseLabel;
    private JButton tonnageArmorButton;
    private JProgressBar tonnageProgressBar;
    private JLabel unconfirmedLabel;
    private JLabel unreleasedLabel;
    private JLabel variantCostLabel;
    private JTextField variantNameField;
    // End of variables declaration//GEN-END:variables
}
