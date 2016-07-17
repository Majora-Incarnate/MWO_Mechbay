package com.quicksilver.mwo.mechbay.mechlab;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
import javax.swing.WindowConstants;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import com.quicksilver.mwo.mechbay.utility.ChassisBlueprint;
import com.quicksilver.mwo.mechbay.utility.Crittable;
import com.quicksilver.mwo.mechbay.utility.Database;
import com.quicksilver.mwo.mechbay.utility.HardpointType;
import com.quicksilver.mwo.mechbay.utility.ModelBlueprint;
import com.quicksilver.mwo.mechbay.utility.Section;
import com.quicksilver.mwo.mechbay.utility.SectionBlueprint;
import com.quicksilver.mwo.mechbay.utility.SectionType;
import com.quicksilver.mwo.mechbay.utility.TechBase;
import com.quicksilver.mwo.mechbay.utility.User;
import com.quicksilver.mwo.mechbay.utility.Variant;
import com.quicksilver.mwo.mechbay.utility.WeaponBlueprint;

/**
 *
 * @author Trevin
 */
public class Mechlab extends javax.swing.JFrame {

    private static final long serialVersionUID = 6308465251921338657L;
    
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

    public Mechlab() {
        masterDatabase = new Database();
        selectedDatabase = new Database(masterDatabase, TechBase.CLAN_TECH_BASE, User.mixtech_enabled, User.futuretech_enabled);
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
        
        this.rightArmCriticalList.setCellRenderer(new Mechlab.MechCriticalRenderer(0));
        this.leftArmCriticalList.setCellRenderer(new Mechlab.MechCriticalRenderer(1));
        this.rightLegCriticalList.setCellRenderer(new Mechlab.MechCriticalRenderer(6));
        this.leftLegCriticalList.setCellRenderer(new Mechlab.MechCriticalRenderer(7));
        this.rightTorsoCriticalList.setCellRenderer(new Mechlab.MechCriticalRenderer(2));
        this.leftTorsoCriticalList.setCellRenderer(new Mechlab.MechCriticalRenderer(3));
        this.centerTorsoCriticalList.setCellRenderer(new Mechlab.MechCriticalRenderer(4));
        this.headCriticalList.setCellRenderer(new Mechlab.MechCriticalRenderer(5));
        //this.special1CriticalList.setCellRenderer(new Mechlab.MechCriticalRenderer(8));
        //this.special2CriticalList.setCellRenderer(new Mechlab.MechCriticalRenderer(9));
        
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

        chassisComboBox = new JComboBox<>();
        modelComboBox = new JComboBox<>();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(1280, 720));
        getContentPane().setLayout(new GridBagLayout());

        MechTabPane.setMaximumSize(new Dimension(320, 512));
        MechTabPane.setMinimumSize(new Dimension(320, 512));
        MechTabPane.setPreferredSize(new Dimension(320, 512));
        MechTabPane.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                MechTabPaneStateChanged(evt);
            }
        });

        ChassisPanel.setLayout(new GridBagLayout());

        loadButton.setText("Load");
        loadButton.setAlignmentY(0.0F);
        loadButton.setEnabled(false);
        loadButton.setHorizontalTextPosition(SwingConstants.CENTER);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(15, 15, 15, 15);
        ChassisPanel.add(loadButton, gridBagConstraints);

        saveButton.setText("Save");
        saveButton.setAlignmentY(0.0F);
        saveButton.setEnabled(false);
        saveButton.setHorizontalTextPosition(SwingConstants.CENTER);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(15, 15, 15, 15);
        ChassisPanel.add(saveButton, gridBagConstraints);

        importButton.setText("Import");
        importButton.setAlignmentY(0.0F);
        importButton.setEnabled(false);
        importButton.setHorizontalTextPosition(SwingConstants.CENTER);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(15, 15, 15, 15);
        ChassisPanel.add(importButton, gridBagConstraints);

        exportButton.setText("Export");
        exportButton.setAlignmentY(0.0F);
        exportButton.setEnabled(false);
        exportButton.setHorizontalTextPosition(SwingConstants.CENTER);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(15, 15, 15, 15);
        ChassisPanel.add(exportButton, gridBagConstraints);

        chassisComboBox.setModel(new DefaultComboBoxModel(masterDatabase.CHASSIS_BLUEPRINTS.toArray()));
        chassisComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                chassisComboBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(15, 15, 15, 15);
        ChassisPanel.add(chassisComboBox, gridBagConstraints);

        modelComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                modelComboBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(15, 15, 15, 15);
        ChassisPanel.add(modelComboBox, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(15, 15, 15, 15);
        ChassisPanel.add(variantNameField, gridBagConstraints);

        variantCostLabel.setHorizontalAlignment(SwingConstants.CENTER);
        variantCostLabel.setText("0 C-Bills");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(15, 15, 15, 15);
        ChassisPanel.add(variantCostLabel, gridBagConstraints);

        techBaseLabel.setHorizontalAlignment(SwingConstants.CENTER);
        techBaseLabel.setText("CLAN TECH");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(15, 15, 15, 15);
        ChassisPanel.add(techBaseLabel, gridBagConstraints);

        mechTypeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        mechTypeLabel.setText("OMNIMECH");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(15, 15, 15, 15);
        ChassisPanel.add(mechTypeLabel, gridBagConstraints);

        unreleasedLabel.setHorizontalAlignment(SwingConstants.CENTER);
        unreleasedLabel.setText("UNRELEASED");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(15, 15, 15, 15);
        ChassisPanel.add(unreleasedLabel, gridBagConstraints);

        unconfirmedLabel.setHorizontalAlignment(SwingConstants.CENTER);
        unconfirmedLabel.setText("UNCONFIRMED");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(15, 15, 15, 15);
        ChassisPanel.add(unconfirmedLabel, gridBagConstraints);

        ecmCapableLabel.setHorizontalAlignment(SwingConstants.CENTER);
        ecmCapableLabel.setText("ECM CAPABLE");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(15, 15, 15, 15);
        ChassisPanel.add(ecmCapableLabel, gridBagConstraints);

        jumpCapableLabel.setHorizontalAlignment(SwingConstants.CENTER);
        jumpCapableLabel.setText("JUMP CAPABLE");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(15, 15, 15, 15);
        ChassisPanel.add(jumpCapableLabel, gridBagConstraints);

        MechTabPane.addTab("Chassis", ChassisPanel);

        UpgradesPanel.setLayout(new GridBagLayout());

        AdjustmentsPanel.setPreferredSize(new Dimension(0, 0));
        AdjustmentsPanel.setLayout(new GridBagLayout());

        engineRatingSpinner.setModel(engineRatingSpinnerModel);
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

        SystemsPanel.setLayout(new GridBagLayout());

        engineComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        SystemsPanel.add(engineComboBox, gridBagConstraints);

        structureComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        SystemsPanel.add(structureComboBox, gridBagConstraints);

        armorComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        SystemsPanel.add(armorComboBox, gridBagConstraints);

        gyroComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        SystemsPanel.add(gyroComboBox, gridBagConstraints);

        cockpitComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        SystemsPanel.add(cockpitComboBox, gridBagConstraints);

        heatSinkComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        SystemsPanel.add(heatSinkComboBox, gridBagConstraints);

        myomerComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        SystemsPanel.add(myomerComboBox, gridBagConstraints);

        jumpJetComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
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

        WeaponsPanel.setLayout(new GridBagLayout());
        MechTabPane.addTab("Weapons", WeaponsPanel);

        ArmorPanel.setLayout(new GridBagLayout());

        pointsPerTonLabel.setText("Points Per Ton");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ArmorPanel.add(pointsPerTonLabel, gridBagConstraints);

        pointsPerTonAmountLabel.setText("0.0");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ArmorPanel.add(pointsPerTonAmountLabel, gridBagConstraints);

        maximumArmorButton.setText("Maximum Armor");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ArmorPanel.add(maximumArmorButton, gridBagConstraints);

        clearArmorButton.setText("Clear Armor");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ArmorPanel.add(clearArmorButton, gridBagConstraints);

        efficientArmorButton.setText("Efficient Maximum");
        efficientArmorButton.setEnabled(false);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ArmorPanel.add(efficientArmorButton, gridBagConstraints);

        tonnageArmorButton.setText("Custom Tonnage");
        tonnageArmorButton.setEnabled(false);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ArmorPanel.add(tonnageArmorButton, gridBagConstraints);

        jLabel21.setText("Section");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        ArmorPanel.add(jLabel21, gridBagConstraints);

        jLabel22.setText("Front");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        ArmorPanel.add(jLabel22, gridBagConstraints);

        jLabel23.setText("Rear");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        ArmorPanel.add(jLabel23, gridBagConstraints);

        jLabel24.setText("Amount");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        ArmorPanel.add(jLabel24, gridBagConstraints);

        jLabel25.setText(SectionType.HEAD.short_name);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        ArmorPanel.add(jLabel25, gridBagConstraints);

        headArmorAmountLabel.setText("0/0");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        ArmorPanel.add(headArmorAmountLabel, gridBagConstraints);

        jLabel29.setText(SectionType.CENTER_TORSO.short_name);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        ArmorPanel.add(jLabel29, gridBagConstraints);

        centerTorsoArmorAmountLabel.setText("0/0");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        ArmorPanel.add(centerTorsoArmorAmountLabel, gridBagConstraints);

        jLabel33.setText(SectionType.RIGHT_TORSO.short_name);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        ArmorPanel.add(jLabel33, gridBagConstraints);

        rightTorsoArmorAmountLabel.setText("0/0");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        ArmorPanel.add(rightTorsoArmorAmountLabel, gridBagConstraints);

        jLabel37.setText(SectionType.LEFT_TORSO.short_name);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        ArmorPanel.add(jLabel37, gridBagConstraints);

        leftTorsoArmorAmountLabel.setText("0/0");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        ArmorPanel.add(leftTorsoArmorAmountLabel, gridBagConstraints);

        jLabel41.setText(SectionType.RIGHT_ARM.short_name);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        ArmorPanel.add(jLabel41, gridBagConstraints);

        rightArmArmorAmountLabel.setText("0/0");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        ArmorPanel.add(rightArmArmorAmountLabel, gridBagConstraints);

        jLabel45.setText(SectionType.LEFT_ARM.short_name);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        ArmorPanel.add(jLabel45, gridBagConstraints);

        leftArmArmorAmountLabel.setText("0/0");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 7;
        ArmorPanel.add(leftArmArmorAmountLabel, gridBagConstraints);

        jLabel49.setText(SectionType.RIGHT_LEG.short_name);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        ArmorPanel.add(jLabel49, gridBagConstraints);

        rightLegArmorAmountLabel.setText("0/0");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 8;
        ArmorPanel.add(rightLegArmorAmountLabel, gridBagConstraints);

        jLabel50.setText(SectionType.LEFT_LEG.short_name);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        ArmorPanel.add(jLabel50, gridBagConstraints);

        leftLegArmorAmountLabel.setText("0/0");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 9;
        ArmorPanel.add(leftLegArmorAmountLabel, gridBagConstraints);

        jLabel51.setText(SectionType.SPECIAL_ONE.short_name);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        ArmorPanel.add(jLabel51, gridBagConstraints);

        special1ArmorAmountLabel.setText("0/0");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 10;
        ArmorPanel.add(special1ArmorAmountLabel, gridBagConstraints);

        jLabel55.setText(SectionType.SPECIAL_TWO.short_name);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        ArmorPanel.add(jLabel55, gridBagConstraints);

        special2ArmorAmountLabel.setText("0/0");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 11;
        ArmorPanel.add(special2ArmorAmountLabel, gridBagConstraints);

        totalArmorLabel.setText("Total");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ArmorPanel.add(totalArmorLabel, gridBagConstraints);

        totalArmorAmountLabel.setText("0/0");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ArmorPanel.add(totalArmorAmountLabel, gridBagConstraints);

        centerTorsoSpinner.setModel(centerTorsoSpinnerModel);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        ArmorPanel.add(centerTorsoSpinner, gridBagConstraints);

        centerRearTorsoSpinner.setModel(centerRearTorsoSpinnerModel);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        ArmorPanel.add(centerRearTorsoSpinner, gridBagConstraints);

        rightTorsoSpinner.setModel(rightTorsoSpinnerModel);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        ArmorPanel.add(rightTorsoSpinner, gridBagConstraints);

        rightRearTorsoSpinner.setModel(rightRearTorsoSpinnerModel);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        ArmorPanel.add(rightRearTorsoSpinner, gridBagConstraints);

        leftTorsoSpinner.setModel(leftTorsoSpinnerModel);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        ArmorPanel.add(leftTorsoSpinner, gridBagConstraints);

        leftRearTorsoSpinner.setModel(leftRearTorsoSpinnerModel);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        ArmorPanel.add(leftRearTorsoSpinner, gridBagConstraints);

        headSpinner.setModel(headSpinnerModel);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        ArmorPanel.add(headSpinner, gridBagConstraints);

        rightArmSpinner.setModel(rightArmSpinnerModel);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        ArmorPanel.add(rightArmSpinner, gridBagConstraints);

        leftArmSpinner.setModel(leftArmSpinnerModel);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        ArmorPanel.add(leftArmSpinner, gridBagConstraints);

        leftLegSpinner.setModel(leftLegSpinnerModel);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        ArmorPanel.add(leftLegSpinner, gridBagConstraints);

        rightLegSpinner.setModel(rightLegSpinnerModel);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        ArmorPanel.add(rightLegSpinner, gridBagConstraints);

        special1Spinner.setModel(special1SpinnerModel);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        ArmorPanel.add(special1Spinner, gridBagConstraints);

        special2Spinner.setModel(special2SpinnerModel);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        ArmorPanel.add(special2Spinner, gridBagConstraints);

        MechTabPane.addTab("Armor", ArmorPanel);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        getContentPane().add(MechTabPane, gridBagConstraints);

        statisticsPanel.setMaximumSize(new Dimension(192, 512));
        statisticsPanel.setMinimumSize(new Dimension(192, 512));
        statisticsPanel.setPreferredSize(new Dimension(192, 512));
        statisticsPanel.setLayout(new GridBagLayout());

        tonnageProgressBar.setAlignmentX(0.0F);
        tonnageProgressBar.setAlignmentY(0.0F);
        tonnageProgressBar.setBorder(BorderFactory.createTitledBorder(null, "Tonnage", TitledBorder.LEADING, TitledBorder.TOP, User.preferences.DEFAULT_FONT_SIZE_12));
        tonnageProgressBar.setMaximumSize(new Dimension(0, 0));
        tonnageProgressBar.setMinimumSize(new Dimension(0, 0));
        tonnageProgressBar.setPreferredSize(new Dimension(0, 0));
        tonnageProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        statisticsPanel.add(tonnageProgressBar, gridBagConstraints);

        speedProgressBar.setBorder(BorderFactory.createTitledBorder(null, "Speed", TitledBorder.LEADING, TitledBorder.TOP, User.preferences.DEFAULT_FONT_SIZE_12));
        speedProgressBar.setMaximumSize(new Dimension(0, 0));
        speedProgressBar.setMinimumSize(new Dimension(0, 0));
        speedProgressBar.setPreferredSize(new Dimension(0, 0));
        speedProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        statisticsPanel.add(speedProgressBar, gridBagConstraints);

        jumpDistanceProgressBar.setBorder(BorderFactory.createTitledBorder(null, "Jump Distance", TitledBorder.LEADING, TitledBorder.TOP, User.preferences.DEFAULT_FONT_SIZE_12));
        jumpDistanceProgressBar.setMaximumSize(new Dimension(0, 0));
        jumpDistanceProgressBar.setMinimumSize(new Dimension(0, 0));
        jumpDistanceProgressBar.setPreferredSize(new Dimension(0, 0));
        jumpDistanceProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        statisticsPanel.add(jumpDistanceProgressBar, gridBagConstraints);

        jumpHeightProgressBar.setBorder(BorderFactory.createTitledBorder(null, "Jump Height", TitledBorder.LEADING, TitledBorder.TOP, User.preferences.DEFAULT_FONT_SIZE_12));
        jumpHeightProgressBar.setMaximumSize(new Dimension(0, 0));
        jumpHeightProgressBar.setMinimumSize(new Dimension(0, 0));
        jumpHeightProgressBar.setPreferredSize(new Dimension(0, 0));
        jumpHeightProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        statisticsPanel.add(jumpHeightProgressBar, gridBagConstraints);

        armorProgressBar.setBorder(BorderFactory.createTitledBorder(null, "Armor", TitledBorder.LEADING, TitledBorder.TOP, User.preferences.DEFAULT_FONT_SIZE_12));
        armorProgressBar.setMaximumSize(new Dimension(0, 0));
        armorProgressBar.setMinimumSize(new Dimension(0, 0));
        armorProgressBar.setPreferredSize(new Dimension(0, 0));
        armorProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        statisticsPanel.add(armorProgressBar, gridBagConstraints);

        alphaDamageProgressBar.setBorder(BorderFactory.createTitledBorder(null, "Alpha Damage", TitledBorder.LEADING, TitledBorder.TOP, User.preferences.DEFAULT_FONT_SIZE_12));
        alphaDamageProgressBar.setMaximumSize(new Dimension(0, 0));
        alphaDamageProgressBar.setMinimumSize(new Dimension(0, 0));
        alphaDamageProgressBar.setPreferredSize(new Dimension(0, 0));
        alphaDamageProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        statisticsPanel.add(alphaDamageProgressBar, gridBagConstraints);

        alphaHeatProgressBar.setBorder(BorderFactory.createTitledBorder(null, "Alpha Heat", TitledBorder.LEADING, TitledBorder.TOP, User.preferences.DEFAULT_FONT_SIZE_12));
        alphaHeatProgressBar.setMaximumSize(new Dimension(0, 0));
        alphaHeatProgressBar.setMinimumSize(new Dimension(0, 0));
        alphaHeatProgressBar.setPreferredSize(new Dimension(0, 0));
        alphaHeatProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        statisticsPanel.add(alphaHeatProgressBar, gridBagConstraints);

        firepowerProgressBar.setBorder(BorderFactory.createTitledBorder(null, "Firepower", TitledBorder.LEADING, TitledBorder.TOP, User.preferences.DEFAULT_FONT_SIZE_12));
        firepowerProgressBar.setMaximumSize(new Dimension(0, 0));
        firepowerProgressBar.setMinimumSize(new Dimension(0, 0));
        firepowerProgressBar.setPreferredSize(new Dimension(0, 0));
        firepowerProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        statisticsPanel.add(firepowerProgressBar, gridBagConstraints);

        heatEfficiencyProgressBar.setBorder(BorderFactory.createTitledBorder(null, "Heat Efficiency", TitledBorder.LEADING, TitledBorder.TOP, User.preferences.DEFAULT_FONT_SIZE_12));
        heatEfficiencyProgressBar.setMaximumSize(new Dimension(0, 0));
        heatEfficiencyProgressBar.setMinimumSize(new Dimension(0, 0));
        heatEfficiencyProgressBar.setPreferredSize(new Dimension(0, 0));
        heatEfficiencyProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        statisticsPanel.add(heatEfficiencyProgressBar, gridBagConstraints);

        rangeProgressBar.setBorder(BorderFactory.createTitledBorder(null, "Range", TitledBorder.LEADING, TitledBorder.TOP, User.preferences.DEFAULT_FONT_SIZE_12));
        rangeProgressBar.setMaximumSize(new Dimension(0, 0));
        rangeProgressBar.setMinimumSize(new Dimension(0, 0));
        rangeProgressBar.setPreferredSize(new Dimension(0, 0));
        rangeProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        statisticsPanel.add(rangeProgressBar, gridBagConstraints);

        criticalsProgressBar.setBorder(BorderFactory.createTitledBorder(null, "Criticals", TitledBorder.LEADING, TitledBorder.TOP, User.preferences.DEFAULT_FONT_SIZE_12));
        criticalsProgressBar.setMaximumSize(new Dimension(0, 0));
        criticalsProgressBar.setMinimumSize(new Dimension(0, 0));
        criticalsProgressBar.setPreferredSize(new Dimension(0, 0));
        criticalsProgressBar.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        statisticsPanel.add(criticalsProgressBar, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        getContentPane().add(statisticsPanel, gridBagConstraints);

        mechPanel.setMaximumSize(new Dimension(512, 512));
        mechPanel.setMinimumSize(new Dimension(512, 512));
        mechPanel.setPreferredSize(new Dimension(512, 512));
        mechPanel.setLayout(new GridBagLayout());

        headPanel.setMaximumSize(new Dimension(100, 128));
        headPanel.setMinimumSize(new Dimension(100, 128));
        headPanel.setPreferredSize(new Dimension(100, 128));
        headPanel.setLayout(new GridBagLayout());

        headOmnipodComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        headPanel.add(headOmnipodComboBox, gridBagConstraints);

        headAMSHardpointLabel.setText("jLabel21");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        headPanel.add(headAMSHardpointLabel, gridBagConstraints);

        headECMHardpointLabel.setText("jLabel21");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        headPanel.add(headECMHardpointLabel, gridBagConstraints);

        headEnergyHardpointLabel.setText("jLabel21");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        headPanel.add(headEnergyHardpointLabel, gridBagConstraints);

        headBallisticHardpointLabel.setText("jLabel21");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        headPanel.add(headBallisticHardpointLabel, gridBagConstraints);

        headMissileHardpointLabel.setText("jLabel21");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        headPanel.add(headMissileHardpointLabel, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        headPanel.add(headStructureProgressBar, gridBagConstraints);
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
        centerTorsoPanel.setPreferredSize(new Dimension(100, 256));
        centerTorsoPanel.setLayout(new GridBagLayout());

        centerTorsoOmnipodComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        centerTorsoPanel.add(centerTorsoOmnipodComboBox, gridBagConstraints);

        centerTorsoAMSHardpointLabel.setText("jLabel21");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        centerTorsoPanel.add(centerTorsoAMSHardpointLabel, gridBagConstraints);

        centerTorsoECMHardpointLabel.setText("jLabel21");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        centerTorsoPanel.add(centerTorsoECMHardpointLabel, gridBagConstraints);

        centerTorsoEnergyHardpointLabel.setText("jLabel21");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        centerTorsoPanel.add(centerTorsoEnergyHardpointLabel, gridBagConstraints);

        centerTorsoBallisticHardpointLabel.setText("jLabel21");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        centerTorsoPanel.add(centerTorsoBallisticHardpointLabel, gridBagConstraints);

        centerTorsoMissileHardpointLabel.setText("jLabel21");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        centerTorsoPanel.add(centerTorsoMissileHardpointLabel, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        centerTorsoPanel.add(centerTorsoStructureProgressBar, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        centerTorsoPanel.add(centerTorsoFrontArmorProgressBar, gridBagConstraints);
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
        leftTorsoPanel.setPreferredSize(new Dimension(100, 256));
        leftTorsoPanel.setLayout(new GridBagLayout());

        leftTorsoOmnipodComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftTorsoPanel.add(leftTorsoOmnipodComboBox, gridBagConstraints);

        leftTorsoBallisticHardpointLabel.setText("jLabel21");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftTorsoPanel.add(leftTorsoBallisticHardpointLabel, gridBagConstraints);

        leftTorsoEnergyHardpointLabel.setText("jLabel21");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftTorsoPanel.add(leftTorsoEnergyHardpointLabel, gridBagConstraints);

        leftTorsoAMSHardpointLabel.setText("jLabel21");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftTorsoPanel.add(leftTorsoAMSHardpointLabel, gridBagConstraints);

        leftTorsoECMHardpointLabel.setText("jLabel21");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftTorsoPanel.add(leftTorsoECMHardpointLabel, gridBagConstraints);

        leftTorsoMissileHardpointLabel.setText("jLabel21");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftTorsoPanel.add(leftTorsoMissileHardpointLabel, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftTorsoPanel.add(leftTorsoStructureProgressBar, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftTorsoPanel.add(leftTorsoFrontArmorProgressBar, gridBagConstraints);
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
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftTorsoPanel.add(leftTorsoCriticalList, gridBagConstraints);

        leftTorsoCASEToggleButton.setText("CASE");
        leftTorsoCASEToggleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                leftTorsoCASEToggleButtonActionPerformed(evt);
            }
        });
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
        rightTorsoPanel.setPreferredSize(new Dimension(100, 256));
        rightTorsoPanel.setLayout(new GridBagLayout());

        rightTorsoOmnipodComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightTorsoPanel.add(rightTorsoOmnipodComboBox, gridBagConstraints);

        rightTorsoBallisticHardpointLabel.setText("jLabel21");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightTorsoPanel.add(rightTorsoBallisticHardpointLabel, gridBagConstraints);

        rightTorsoEnergyHardpointLabel.setText("jLabel21");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightTorsoPanel.add(rightTorsoEnergyHardpointLabel, gridBagConstraints);

        rightTorsoAMSHardpointLabel.setText("jLabel21");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightTorsoPanel.add(rightTorsoAMSHardpointLabel, gridBagConstraints);

        rightTorsoECMHardpointLabel.setText("jLabel21");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightTorsoPanel.add(rightTorsoECMHardpointLabel, gridBagConstraints);

        rightTorsoMissileHardpointLabel.setText("jLabel21");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightTorsoPanel.add(rightTorsoMissileHardpointLabel, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightTorsoPanel.add(rightTorsoStructureProgressBar, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightTorsoPanel.add(rightTorsoFrontArmorProgressBar, gridBagConstraints);
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
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightTorsoPanel.add(rightTorsoCriticalList, gridBagConstraints);

        rightTorsoCASEToggleButton.setText("CASE");
        rightTorsoCASEToggleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                rightTorsoCASEToggleButtonActionPerformed(evt);
            }
        });
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
        leftLegPanel.setPreferredSize(new Dimension(100, 128));
        leftLegPanel.setLayout(new GridBagLayout());

        leftLegOmnipodComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftLegPanel.add(leftLegOmnipodComboBox, gridBagConstraints);

        leftLegBallisticHardpointLabel.setText("jLabel21");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftLegPanel.add(leftLegBallisticHardpointLabel, gridBagConstraints);

        leftLegEnergyHardpointLabel.setText("jLabel21");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftLegPanel.add(leftLegEnergyHardpointLabel, gridBagConstraints);

        leftLegAMSHardpointLabel.setText("jLabel21");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftLegPanel.add(leftLegAMSHardpointLabel, gridBagConstraints);

        leftLegECMHardpointLabel.setText("jLabel21");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftLegPanel.add(leftLegECMHardpointLabel, gridBagConstraints);

        leftLegMissileHardpointLabel.setText("jLabel21");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftLegPanel.add(leftLegMissileHardpointLabel, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftLegPanel.add(leftLegStructureProgressBar, gridBagConstraints);
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
        rightLegPanel.setPreferredSize(new Dimension(100, 128));
        rightLegPanel.setLayout(new GridBagLayout());

        rightLegOmnipodComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightLegPanel.add(rightLegOmnipodComboBox, gridBagConstraints);

        rightLegBallisticHardpointLabel.setText("jLabel21");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightLegPanel.add(rightLegBallisticHardpointLabel, gridBagConstraints);

        rightLegEnergyHardpointLabel.setText("jLabel21");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightLegPanel.add(rightLegEnergyHardpointLabel, gridBagConstraints);

        rightLegAMSHardpointLabel.setText("jLabel21");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightLegPanel.add(rightLegAMSHardpointLabel, gridBagConstraints);

        rightLegECMHardpointLabel.setText("jLabel21");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightLegPanel.add(rightLegECMHardpointLabel, gridBagConstraints);

        rightLegMissileHardpointLabel.setText("jLabel21");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightLegPanel.add(rightLegMissileHardpointLabel, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightLegPanel.add(rightLegStructureProgressBar, gridBagConstraints);
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
        leftArmPanel.setPreferredSize(new Dimension(100, 256));
        leftArmPanel.setLayout(new GridBagLayout());

        leftArmOmnipodComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftArmPanel.add(leftArmOmnipodComboBox, gridBagConstraints);

        leftArmECMHardpointLabel.setText("jLabel21");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftArmPanel.add(leftArmECMHardpointLabel, gridBagConstraints);

        leftArmEnergyHardpointLabel.setText("jLabel21");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftArmPanel.add(leftArmEnergyHardpointLabel, gridBagConstraints);

        leftArmMissileHardpointLabel.setText("jLabel21");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftArmPanel.add(leftArmMissileHardpointLabel, gridBagConstraints);

        leftArmAMSHardpointLabel.setText("jLabel21");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftArmPanel.add(leftArmAMSHardpointLabel, gridBagConstraints);

        leftArmBallisticHardpointLabel.setText("jLabel21");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftArmPanel.add(leftArmBallisticHardpointLabel, gridBagConstraints);

        leftLowerArmToggleButton.setText("Lower Arm");
        leftLowerArmToggleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                leftLowerArmToggleButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftArmPanel.add(leftLowerArmToggleButton, gridBagConstraints);

        leftHandToggleButton.setText("Hand");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftArmPanel.add(leftHandToggleButton, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        leftArmPanel.add(leftArmStructureProgressBar, gridBagConstraints);
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
        rightArmPanel.setPreferredSize(new Dimension(100, 256));
        rightArmPanel.setLayout(new GridBagLayout());

        rightArmOmnipodComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightArmPanel.add(rightArmOmnipodComboBox, gridBagConstraints);

        rightArmECMHardpointLabel.setText("jLabel21");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightArmPanel.add(rightArmECMHardpointLabel, gridBagConstraints);

        rightArmEnergyHardpointLabel.setText("jLabel21");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightArmPanel.add(rightArmEnergyHardpointLabel, gridBagConstraints);

        rightArmMissileHardpointLabel.setText("jLabel21");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightArmPanel.add(rightArmMissileHardpointLabel, gridBagConstraints);

        rightArmAMSHardpointLabel.setText("jLabel21");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightArmPanel.add(rightArmAMSHardpointLabel, gridBagConstraints);

        rightArmBallisticHardpointLabel.setText("jLabel21");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightArmPanel.add(rightArmBallisticHardpointLabel, gridBagConstraints);

        rightLowerArmToggleButton.setText("Lower Arm");
        rightLowerArmToggleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                rightLowerArmToggleButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightArmPanel.add(rightLowerArmToggleButton, gridBagConstraints);

        rightHandToggleButton.setText("Hand");
        rightHandToggleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                rightHandToggleButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightArmPanel.add(rightHandToggleButton, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        rightArmPanel.add(rightArmStructureProgressBar, gridBagConstraints);
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

        special1Panel.setPreferredSize(new Dimension(100, 128));
        special1Panel.setLayout(new GridBagLayout());

        section1OmnipodComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        special1Panel.add(section1OmnipodComboBox, gridBagConstraints);

        section1AMSHardpointLabel.setText("jLabel21");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        special1Panel.add(section1AMSHardpointLabel, gridBagConstraints);

        section1ECMHardpointLabel.setText("jLabel21");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        special1Panel.add(section1ECMHardpointLabel, gridBagConstraints);

        section1EnergyHardpointLabel.setText("jLabel21");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        special1Panel.add(section1EnergyHardpointLabel, gridBagConstraints);

        section1BallisticHardpointLabel.setText("jLabel21");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        special1Panel.add(section1BallisticHardpointLabel, gridBagConstraints);

        section1MissileHardpointLabel.setText("jLabel21");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        special1Panel.add(section1MissileHardpointLabel, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        special1Panel.add(section1StructureProgressBar, gridBagConstraints);
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

        special2Panel.setPreferredSize(new Dimension(100, 128));
        special2Panel.setLayout(new GridBagLayout());

        section2OmnipodComboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        special2Panel.add(section2OmnipodComboBox, gridBagConstraints);

        section2AMSHardpointLabel.setText("jLabel21");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        special2Panel.add(section2AMSHardpointLabel, gridBagConstraints);

        section2ECMHardpointLabel.setText("jLabel21");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        special2Panel.add(section2ECMHardpointLabel, gridBagConstraints);

        section2EnergyHardpointLabel.setText("jLabel21");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        special2Panel.add(section2EnergyHardpointLabel, gridBagConstraints);

        section2BallisticHardpointLabel.setText("jLabel21");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        special2Panel.add(section2BallisticHardpointLabel, gridBagConstraints);

        section2MissileHardpointLabel.setText("jLabel21");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        special2Panel.add(section2MissileHardpointLabel, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        special2Panel.add(section2StructureProgressBar, gridBagConstraints);
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
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(mechPanel, gridBagConstraints);

        secondaryTabbedPane.setMaximumSize(new Dimension(256, 512));
        secondaryTabbedPane.setMinimumSize(new Dimension(256, 512));
        secondaryTabbedPane.setPreferredSize(new Dimension(256, 512));

        quirksPanel.setLayout(new GridBagLayout());
        secondaryTabbedPane.addTab("Quirks", quirksPanel);

        componentsPanel.setLayout(new GridBagLayout());
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        componentsPanel.add(engineComponentPanel, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        componentsPanel.add(gyroComponentPanel, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        componentsPanel.add(armorComponentPanel, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        componentsPanel.add(structureComponentPanel, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        componentsPanel.add(heatSinksComponentPanel, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        componentsPanel.add(jumpJetsComponentPanel, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        componentsPanel.add(cockpitComponentPanel, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        componentsPanel.add(myomerComponentPanel, gridBagConstraints);

        componentsScrollPane.setViewportView(componentsPanel);

        secondaryTabbedPane.addTab("Components", componentsScrollPane);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        getContentPane().add(secondaryTabbedPane, gridBagConstraints);

        InformationTabbedPane.setMaximumSize(new Dimension(1024, 256));
        InformationTabbedPane.setMinimumSize(new Dimension(1024, 256));
        InformationTabbedPane.setPreferredSize(new Dimension(1024, 256));

        ModelOverviewPanel.setLayout(new GridBagLayout());
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ModelOverviewPanel.add(overviewComponentPanel, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ModelOverviewPanel.add(moduleComponentPanel, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ModelOverviewPanel.add(hardpointComponentPanel, gridBagConstraints);

        descriptionScrollPane.setMaximumSize(new Dimension(295, 100));
        descriptionScrollPane.setMinimumSize(new Dimension(295, 100));
        descriptionScrollPane.setPreferredSize(new Dimension(295, 100));

        descriptionTextArea.setColumns(20);
        descriptionTextArea.setRows(5);
        descriptionScrollPane.setViewportView(descriptionTextArea);

        ModelOverviewPanel.add(descriptionScrollPane, new GridBagConstraints());

        InformationTabbedPane.addTab("Model Overview", ModelOverviewPanel);

        ModelSpecificationsPanel.setLayout(new GridBagLayout());
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ModelSpecificationsPanel.add(manueverabilityComponentPanel, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ModelSpecificationsPanel.add(movementSpeedComponentPanel, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ModelSpecificationsPanel.add(speedComponentPanel, gridBagConstraints);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ModelSpecificationsPanel.add(movementRangeComponentPanel, gridBagConstraints);

        InformationTabbedPane.addTab("Model Specifications", ModelSpecificationsPanel);

        InformationSpecificationsPanel.setLayout(new GridBagLayout());
        InformationSpecificationsPanel.add(componentPanel5, new GridBagConstraints());
        InformationSpecificationsPanel.add(componentPanel6, new GridBagConstraints());

        InformationTabbedPane.addTab("Sensors/Targetting Specifications", InformationSpecificationsPanel);

        EquipmentSpecificationsPanel.setLayout(new GridBagLayout());
        InformationTabbedPane.addTab("Equipment Specifications", EquipmentSpecificationsPanel);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(InformationTabbedPane, gridBagConstraints);

        OptionsPanel.setMaximumSize(new Dimension(256, 256));
        OptionsPanel.setMinimumSize(new Dimension(256, 256));
        OptionsPanel.setPreferredSize(new Dimension(256, 256));
        OptionsPanel.setLayout(new GridBagLayout());

        InformationPanel.setPreferredSize(new Dimension(0, 0));
        InformationPanel.setLayout(new GridBagLayout());

        MechTreesButton.setText("Mech Trees");
        MechTreesButton.setPreferredSize(new Dimension(0, 0));
        MechTreesButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                MechTreesButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(15, 15, 15, 15);
        InformationPanel.add(MechTreesButton, gridBagConstraints);

        PilotTreesButton.setText("Pilot Trees");
        PilotTreesButton.setPreferredSize(new Dimension(0, 0));
        PilotTreesButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                PilotTreesButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(15, 15, 15, 15);
        InformationPanel.add(PilotTreesButton, gridBagConstraints);

        WeaponStatsButton.setText("Weapon Stats");
        WeaponStatsButton.setEnabled(false);
        WeaponStatsButton.setPreferredSize(new Dimension(0, 0));
        WeaponStatsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                WeaponStatsButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(15, 15, 15, 15);
        InformationPanel.add(WeaponStatsButton, gridBagConstraints);

        AboutButton.setText("About");
        AboutButton.setPreferredSize(new Dimension(0, 0));
        AboutButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                AboutButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(15, 15, 15, 15);
        InformationPanel.add(AboutButton, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        OptionsPanel.add(InformationPanel, gridBagConstraints);

        FeaturesPanel.setPreferredSize(new Dimension(0, 0));
        FeaturesPanel.setLayout(new GridBagLayout());

        FrankenmechToggle.setText("Frankenmechs");
        FrankenmechToggle.setEnabled(false);
        FrankenmechToggle.setHorizontalTextPosition(SwingConstants.CENTER);
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
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(OptionsPanel, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chassisComboBoxActionPerformed(ActionEvent evt) {//GEN-FIRST:event_chassisComboBoxActionPerformed
        ChassisBlueprint chassis = (ChassisBlueprint)chassisComboBox.getSelectedItem();
        
        selectedDatabase.MODEL_BLUEPRINTS.clear();
        
        for (ModelBlueprint model : masterDatabase.MODEL_BLUEPRINTS)
            if (model.chassis_name.equals(chassis.chassis_name))
                selectedDatabase.MODEL_BLUEPRINTS.add(model);
        
        modelComboBox.setModel(new DefaultComboBoxModel(selectedDatabase.MODEL_BLUEPRINTS.toArray()));
        modelComboBox.setSelectedIndex(0);
    }//GEN-LAST:event_chassisComboBoxActionPerformed

    private void modelComboBoxActionPerformed(ActionEvent evt) {//GEN-FIRST:event_modelComboBoxActionPerformed
        ChassisBlueprint chassis = (ChassisBlueprint)chassisComboBox.getSelectedItem();
        ModelBlueprint model = (ModelBlueprint)modelComboBox.getSelectedItem();
        
        User.variant = new Variant();
        User.variant.SetMech(selectedDatabase, chassis, model);
        
        techBaseLabel.setText(User.variant.chassis_type.tech_base.equals(TechBase.IS_TECH_BASE) ? "IS TECH" : "CLAN TECH");
        mechTypeLabel.setText(User.variant.chassis_type.is_omnimech ? "OMNIMECH" : "BATTLEMECH");
        unreleasedLabel.setText(User.variant.model_type.unreleased ? "UNRELEASED" : "RELEASED");
        unconfirmedLabel.setText(User.variant.model_type.unconfirmed ? "UNCONFIRMED" : "CONFIRMED");
        
        overviewComponentPanel.Set_Overview(User.variant.chassis_type, User.variant.model_type);
        moduleComponentPanel.Set_Modules(User.variant.chassis_type, User.variant.model_type, false);
        hardpointComponentPanel.Set_Total_Hardpoints(0, 0, 0, 0);
        speedComponentPanel.Set_Speed_Limits(User.variant.chassis_type, User.variant.model_type, 16.2, 1.0);
        manueverabilityComponentPanel.Set_Manueverability(User.variant.chassis_type, User.variant.model_type, User.variant.current_jump_jets);
        movementRangeComponentPanel.Set_Movement_Range(User.variant.chassis_type, User.variant.model_type);
        movementSpeedComponentPanel.Set_Movement_Speed(User.variant.chassis_type, User.variant.model_type);
        
        selectedDatabase = null;
        selectedDatabase = new Database(masterDatabase, User.variant.chassis_type.tech_base, User.mixtech_enabled, User.futuretech_enabled);
        
        SetSectionOmnipods(rightArmOmnipodComboBox, SectionType.RIGHT_ARM.index);
        SetSectionOmnipods(leftArmOmnipodComboBox, SectionType.LEFT_ARM.index);
        SetSectionOmnipods(rightTorsoOmnipodComboBox, SectionType.RIGHT_TORSO.index);
        SetSectionOmnipods(leftTorsoOmnipodComboBox, SectionType.LEFT_TORSO.index);
        SetSectionOmnipods(centerTorsoOmnipodComboBox, SectionType.CENTER_TORSO.index);
        SetSectionOmnipods(headOmnipodComboBox, SectionType.HEAD.index);
        SetSectionOmnipods(rightLegOmnipodComboBox, SectionType.RIGHT_LEG.index);
        SetSectionOmnipods(leftLegOmnipodComboBox, SectionType.LEFT_LEG.index);
        
        engineComboBox.setModel(new DefaultComboBoxModel(selectedDatabase.ENGINE_BLUEPRINTS.toArray()));
        armorComboBox.setModel(new DefaultComboBoxModel(selectedDatabase.ARMOR_BLUEPRINTS.toArray()));
        structureComboBox.setModel(new DefaultComboBoxModel(selectedDatabase.ENGINE_BLUEPRINTS.toArray()));
        myomerComboBox.setModel(new DefaultComboBoxModel(selectedDatabase.MYOMER_BLUEPRINTS.toArray()));
        heatSinkComboBox.setModel(new DefaultComboBoxModel(selectedDatabase.HEAT_SINK_BLUEPRINTS.toArray()));
        jumpJetComboBox.setModel(new DefaultComboBoxModel(selectedDatabase.JUMP_JET_BLUEPRINTS.toArray()));
        gyroComboBox.setModel(new DefaultComboBoxModel(selectedDatabase.GYRO_BLUEPRINTS.toArray()));
        cockpitComboBox.setModel(new DefaultComboBoxModel(selectedDatabase.COCKPIT_BLUEPRINTS.toArray()));
        
        updateCriticalPanelVisibility();
        
        engineRatingSpinnerModel.setMinimum(User.variant.model_type.min_engine_rating);
        engineRatingSpinnerModel.setMaximum(User.variant.model_type.max_engine_rating);
        engineRatingSpinnerModel.setValue(User.variant.model_type.engine_rating);
        
        tonnageProgressBar.setMinimum(0);
        tonnageProgressBar.setMaximum((int)User.variant.chassis_type.tonnage);
        tonnageProgressBar.setValue((int)User.variant.current_tonnage);
        tonnageProgressBar.setString(String.format("%.2f tons", User.variant.current_tonnage));
        
        speedProgressBar.setMinimum(0);
        speedProgressBar.setMaximum(100);
        speedProgressBar.setValue((int)(User.variant.current_engine_rating * 100.0 / User.variant.model_type.max_engine_rating));
        speedProgressBar.setString(String.format("%.2f kph", 0.0));//User.variant.engine.Get_Speed(User.variant.chassis_type.tonnage, User.variant.current_engine_rating)));
        
        jumpDistanceProgressBar.setMinimum(0);
        jumpDistanceProgressBar.setMaximum(User.variant.maximum_jump_jets);
        jumpDistanceProgressBar.setValue(User.variant.current_jump_jets);
        jumpDistanceProgressBar.setString(String.format("%.2fm", 0.0));
        
        jumpHeightProgressBar.setMinimum(0);
        jumpHeightProgressBar.setMaximum(User.variant.maximum_jump_jets);
        jumpHeightProgressBar.setValue(User.variant.current_jump_jets);
        jumpHeightProgressBar.setString(String.format("%.2fm", 0.0));
        
        criticalsProgressBar.setMinimum(0);
        criticalsProgressBar.setMaximum(78);
        criticalsProgressBar.setValue(User.variant.current_criticals);
        criticalsProgressBar.setString(String.format("%d/78", User.variant.current_criticals));
        
        //engineComponentPanel.Set_Engine(User.variant.engine, User.variant.current_engine_rating);
        //gyroComponentPanel.Set_Gyro(User.variant.gyro, User.variant.current_engine_rating);
        //armorComponentPanel.Set_Armor(User.variant.armor, User.variant.GetCurrentArmorTotal());
        //structureComponentPanel.Set_Structure(User.variant.structure, User.variant.current_tonnage);
        //heatSinksComponentPanel.Set_Heatsinks(User.variant.heatsinks, User.variant.current_heat_sink_count, User.variant.current_engine_rating);
        //jumpJetsComponentPanel.Set_Jumpjets(User.variant.jumpjets, User.variant.current_jump_jets, User.variant.current_tonnage);
        //cockpitComponentPanel.Set_Cockpit(User.variant.cockpit);
        //myomerComponentPanel.Set_Myomer(User.variant.myomer);
    }//GEN-LAST:event_modelComboBoxActionPerformed

    private void AboutButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_AboutButtonActionPerformed
        AboutDialogBox aboutDialogBox = new AboutDialogBox(this, true, "", User.mwo_stage);
        aboutDialogBox.setLocationRelativeTo(this);
        aboutDialogBox.setVisible(true);
    }//GEN-LAST:event_AboutButtonActionPerformed

    private void MechTreesButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_MechTreesButtonActionPerformed
        MechTreeDialogBox mechTreeDialogBox = new MechTreeDialogBox(this, true);
        mechTreeDialogBox.setLocationRelativeTo(this);
        mechTreeDialogBox.setVisible(true);
    }//GEN-LAST:event_MechTreesButtonActionPerformed

    private void PilotTreesButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_PilotTreesButtonActionPerformed
        PilotTreeDialogBox pilotTreeDialogBox = new PilotTreeDialogBox(this, true);
        pilotTreeDialogBox.setLocationRelativeTo(this);
        pilotTreeDialogBox.setVisible(true);
    }//GEN-LAST:event_PilotTreesButtonActionPerformed

    private void WeaponStatsButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_WeaponStatsButtonActionPerformed
        //
    }//GEN-LAST:event_WeaponStatsButtonActionPerformed

    private void MechTabPaneStateChanged(ChangeEvent evt) {//GEN-FIRST:event_MechTabPaneStateChanged
        this.updateCriticalPanelVisibility();
    }//GEN-LAST:event_MechTabPaneStateChanged

    private void rightHandToggleButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_rightHandToggleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rightHandToggleButtonActionPerformed

    private void rightLowerArmToggleButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_rightLowerArmToggleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rightLowerArmToggleButtonActionPerformed

    private void leftLowerArmToggleButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_leftLowerArmToggleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_leftLowerArmToggleButtonActionPerformed

    private void rightTorsoCASEToggleButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_rightTorsoCASEToggleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rightTorsoCASEToggleButtonActionPerformed

    private void leftTorsoCASEToggleButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_leftTorsoCASEToggleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_leftTorsoCASEToggleButtonActionPerformed

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
        
        for (SectionBlueprint section_Blueprint : selectedDatabase.SECTION_BLUEPRINTS) {
            jComboBox.addItem(section_Blueprint);
            if (!section_Blueprint.model.equals(User.variant.model_type.section_models[sectionIndex])) continue;
            jComboBox.setSelectedItem(section_Blueprint);
        }
        
        if (sectionIndex == SectionType.CENTER_TORSO.index)
            jComboBox.setEnabled(false);
        else
            jComboBox.setEnabled(User.variant.chassis_type.is_omnimech || User.frankenmechs_enabled);
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
                jLabel.setText(String.format("%d %s", User.variant.sections[n].maximum_hardpoints[3], HardpointType.values()[3]));
                jLabel2.setText(String.format("%d %s", User.variant.sections[n].maximum_hardpoints[4], HardpointType.values()[4]));
                jLabel3.setText(String.format("%d %s", User.variant.sections[n].maximum_hardpoints[0], HardpointType.values()[0]));
                jLabel4.setText(String.format("%d %s", User.variant.sections[n].maximum_hardpoints[1], HardpointType.values()[1]));
                jLabel5.setText(String.format("%d %s", User.variant.sections[n].maximum_hardpoints[2], HardpointType.values()[2]));
                break;
            }
            case 1:
            case 2: {
                bl = true;
                jLabel.setText(String.format("%d/%d %s", User.variant.sections[n].current_hardpoints[3], User.variant.sections[n].maximum_hardpoints[3], HardpointType.values()[3]));
                jLabel2.setText(String.format("%d/%d %s", User.variant.sections[n].current_hardpoints[4], User.variant.sections[n].maximum_hardpoints[4], HardpointType.values()[4]));
                jLabel3.setText(String.format("%d/%d %s", User.variant.sections[n].current_hardpoints[0], User.variant.sections[n].maximum_hardpoints[0], HardpointType.values()[0]));
                jLabel4.setText(String.format("%d/%d %s", User.variant.sections[n].current_hardpoints[1], User.variant.sections[n].maximum_hardpoints[1], HardpointType.values()[1]));
                jLabel5.setText(String.format("%d/%d %s", User.variant.sections[n].current_hardpoints[2], User.variant.sections[n].maximum_hardpoints[2], HardpointType.values()[2]));
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
        for (SectionBlueprint section_Blueprint : User.variant.section_types) {
            if (section_Blueprint == null) continue;
            n += section_Blueprint.hardpoints[0];
            n2 += section_Blueprint.hardpoints[1];
            n3 += section_Blueprint.hardpoints[2];
            n4 += section_Blueprint.hardpoints[3];
            n5 += section_Blueprint.hardpoints[4];
        }
        this.hardpointComponentPanel.Set_Total_Hardpoints(n, n2, n3, n4);
        this.ecmCapableLabel.setVisible(n5 > 0);
        this.jumpCapableLabel.setVisible(User.variant.maximum_jump_jets > 0);
        this.jumpDistanceProgressBar.setMaximum(User.variant.maximum_jump_jets);
        this.jumpHeightProgressBar.setMaximum(User.variant.maximum_jump_jets);
    }

    private void UpdateEngine() {
        if (User.variant.engine == null) {
            return;
        }
        //User.variant.current_engine_rating = (Integer) this.engineRatingSpinner.getValue();
        this.speedProgressBar.setValue(User.variant.current_engine_rating);
        this.speedProgressBar.setString(String.format("%.1f kph", User.variant.engine.Get_Speed(User.variant.chassis_type.tonnage, User.variant.current_engine_rating)));
        //this.enginePanel.Set_Engine(User.variant.engine, User.variant.current_engine_rating);
    }

    private void UpdateHeatsinks() {
        int n = User.variant.engine.Get_Heat_Sink_Capacity(User.variant.current_engine_rating);
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
        //this.heatSinkComponentPanel.Set_Heatsinks(User.variant.heatsinks, User.variant.current_engine_rating, User.variant.current_heat_sink_count);
    }

    private void UpdateJumpjets() {
        /*this.JumpJetSpinner.setEnabled(User.variant.maximum_jump_jets > 0);
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
        }*/
        this.jumpDistanceProgressBar.setValue(User.variant.current_jump_jets);
        this.jumpHeightProgressBar.setValue(User.variant.current_jump_jets);
        //this.jumpjetComponentPanel.Set_Jumpjets(User.variant.jumpjets, User.variant.current_jump_jets, User.variant.chassis_type.tonnage);
        this.manueverabilityComponentPanel.Set_Manueverability(User.variant.chassis_type, User.variant.model_type, User.variant.maximum_jump_jets);
    }

    private void UpdateArmor() {
        if (User.variant.armor == null) {
            return;
        }
        //this.ArmorPanel.Set_Armor(User.variant.armor, User.variant.GetCurrentArmorTotal());
        this.pointsPerTonAmountLabel.setText(String.format("%.2f", User.variant.armor.points_per_ton));
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
        this.rightArmArmorAmountLabel.setText(String.format("%d/%d", User.variant.sections[0].front_armor, User.variant.sections[0].maximum_armor));
        this.leftArmArmorAmountLabel.setText(String.format("%d/%d", User.variant.sections[1].front_armor, User.variant.sections[1].maximum_armor));
        this.rightTorsoArmorAmountLabel.setText(String.format("%d/%d", User.variant.sections[2].front_armor + User.variant.sections[2].rear_armor, User.variant.sections[2].maximum_armor));
        this.leftTorsoArmorAmountLabel.setText(String.format("%d/%d", User.variant.sections[3].front_armor + User.variant.sections[3].rear_armor, User.variant.sections[3].maximum_armor));
        this.centerTorsoArmorAmountLabel.setText(String.format("%d/%d", User.variant.sections[4].front_armor + User.variant.sections[4].rear_armor, User.variant.sections[4].maximum_armor));
        this.headArmorAmountLabel.setText(String.format("%d/%d", User.variant.sections[5].front_armor, User.variant.sections[5].maximum_armor));
        this.rightLegArmorAmountLabel.setText(String.format("%d/%d", User.variant.sections[6].front_armor, User.variant.sections[6].maximum_armor));
        this.leftLegArmorAmountLabel.setText(String.format("%d/%d", User.variant.sections[7].front_armor, User.variant.sections[7].maximum_armor));
        this.totalArmorAmountLabel.setText(String.format("%d/%d", User.variant.GetCurrentArmorTotal(), User.variant.GetMaximumArmorTotal()));
    }

    private void UpdateSpeed() {
        this.speedProgressBar.setString(String.format("%.1f kph", User.variant.engine.Get_Speed(User.variant.chassis_type.tonnage, User.variant.current_engine_rating) * User.speed_tweak_modifier));
        this.speedComponentPanel.Set_Speed_Limits(User.variant.chassis_type, User.variant.model_type, 16.2, User.speed_tweak_modifier);
    }

    private void UpdateWeapons() {
        WeaponBlueprint weapon_Blueprint;
        WeaponBlueprint weapon_Blueprint2;
        double d = 0.0;
        double d2 = 0.0;
        double d3 = 0.0;
        double d4 = 0.0;
        double d5 = User.variant.heatsinks.Get_Dissipation(User.variant.current_heat_sink_count, User.variant.current_engine_rating) * User.coolrun_modifier;
        double d6 = User.variant.heatsinks.Get_Threshold(User.variant.current_heat_sink_count) * User.heat_containment_modifier;
        int n = 1000;
        int n2 = 0;
        int n3 = 0;
        for (Section section2 : User.variant.sections) {
            for (Crittable crittable3 : section2.components) {
                if (!crittable3.item_type.equals("Weapon")) continue;
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
                if (!crittable3.item_type.equals("Weapon")) continue;
                weapon_Blueprint = (WeaponBlueprint) crittable3.reference;
                n3 = (int) ((double) n3 + (double) weapon_Blueprint.effective_range * (weapon_Blueprint.Get_DPS(User.fast_fire_modifier) / d3));
            }
        }
        arrsection = User.variant.sections;
        int n4 = arrsection.length;
        for (int i = 0; i < crittable5; ++i) {
            Section section2 = arrsection[i];
            for (Crittable crittable3 : section2.components) {
                if (!crittable3.item_type.equals("Weapon")) continue;
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
        this.criticalsProgressBar.setValue(User.variant.current_criticals + temp_int);
        this.criticalsProgressBar.setString(String.format("%d/%d", User.variant.current_criticals + temp_int, 78));
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
        double temp_double = 0.0;
        /*for (Crittable crittable : queued_items) {
            temp_double += crittable.tonnage;
        }*/
        this.tonnageProgressBar.setValue((int) Math.ceil(User.variant.current_tonnage + temp_double));
        this.tonnageProgressBar.setString(String.format("%.2f Tons", User.variant.current_tonnage + temp_double));
    }

    private void UpdateArmorSpinners(int n) {
        int temp_int;
        
        switch (n) {
            case 5: {
                User.variant.sections[5].front_armor = (Integer) this.headSpinner.getValue();
                break;
            }
            case 2: {
                User.variant.sections[2].front_armor = (Integer) this.rightTorsoSpinner.getValue();
                User.variant.sections[2].rear_armor = (Integer) this.rightRearTorsoSpinner.getValue();
                temp_int = User.variant.sections[2].maximum_armor - User.variant.sections[2].rear_armor - User.variant.sections[2].front_armor;
                this.rightTorsoSpinnerModel.setMaximum(Integer.valueOf(User.variant.sections[2].front_armor + temp_int));
                this.rightRearTorsoSpinnerModel.setMaximum(Integer.valueOf(User.variant.sections[2].rear_armor + temp_int));
                break;
            }
            case 3: {
                User.variant.sections[3].front_armor = (Integer) this.leftTorsoSpinner.getValue();
                User.variant.sections[3].rear_armor = (Integer) this.leftRearTorsoSpinner.getValue();
                temp_int = User.variant.sections[3].maximum_armor - User.variant.sections[3].rear_armor - User.variant.sections[3].front_armor;
                this.leftTorsoSpinnerModel.setMaximum(Integer.valueOf(User.variant.sections[3].front_armor + temp_int));
                this.leftRearTorsoSpinnerModel.setMaximum(Integer.valueOf(User.variant.sections[3].rear_armor + temp_int));
                break;
            }
            case 4: {
                User.variant.sections[4].front_armor = (Integer) this.centerTorsoSpinner.getValue();
                User.variant.sections[4].rear_armor = (Integer) this.centerRearTorsoSpinner.getValue();
                temp_int = User.variant.sections[4].maximum_armor - User.variant.sections[4].rear_armor - User.variant.sections[4].front_armor;
                this.centerTorsoSpinnerModel.setMaximum(Integer.valueOf(User.variant.sections[4].front_armor + temp_int));
                this.centerRearTorsoSpinnerModel.setMaximum(Integer.valueOf(User.variant.sections[4].rear_armor + temp_int));
                break;
            }
            case 0: {
                User.variant.sections[0].front_armor = (Integer) this.rightArmSpinner.getValue();
                break;
            }
            case 1: {
                User.variant.sections[1].front_armor = (Integer) this.leftArmSpinner.getValue();
                break;
            }
            case 6: {
                User.variant.sections[6].front_armor = (Integer) this.rightLegSpinner.getValue();
                break;
            }
            case 7: {
                User.variant.sections[7].front_armor = (Integer) this.leftLegSpinner.getValue();
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
                    Color color = User.variant.sections[this.section_id].components.get(n2).hardpoint_type.equals(HardpointType.values()[0]) ? User.preferences.BALLISTIC_COLOR : (User.variant.sections[this.section_id].components.get(n2).hardpoint_type.equals(HardpointType.values()[1]) ? User.preferences.ENERGY_COLOR : (User.variant.sections[this.section_id].components.get(n2).hardpoint_type.equals(HardpointType.values()[2]) ? User.preferences.MISSILE_COLOR : (User.variant.sections[this.section_id].components.get(n2).hardpoint_type.equals(HardpointType.values()[3]) ? User.preferences.AMS_COLOR : (User.variant.sections[this.section_id].components.get(n2).hardpoint_type.equals(HardpointType.values()[4]) ? User.preferences.ECM_COLOR : User.preferences.NORMAL_CRITICAL_BG))));
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
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Mechlab().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    final JButton AboutButton = new JButton();
    final JPanel AdjustmentsPanel = new JPanel();
    final JPanel ArmorPanel = new JPanel();
    final JPanel ChassisPanel = new JPanel();
    final JPanel EfficienciesPanel = new JPanel();
    final JPanel EquipmentSpecificationsPanel = new JPanel();
    final JPanel FeaturesPanel = new JPanel();
    final JToggleButton FrankenmechToggle = new JToggleButton();
    final JToggleButton FuturetechToggle = new JToggleButton();
    final JPanel InformationPanel = new JPanel();
    final JPanel InformationSpecificationsPanel = new JPanel();
    final JTabbedPane InformationTabbedPane = new JTabbedPane();
    final JTabbedPane MechTabPane = new JTabbedPane();
    final JButton MechTreesButton = new JButton();
    final JToggleButton MixtechToggle = new JToggleButton();
    final JPanel ModelOverviewPanel = new JPanel();
    final JPanel ModelSpecificationsPanel = new JPanel();
    final JToggleButton OmniRestrictionsToggle = new JToggleButton();
    final JPanel OptionsPanel = new JPanel();
    final JButton PilotTreesButton = new JButton();
    final JPanel SystemsPanel = new JPanel();
    final JPanel UpgradesPanel = new JPanel();
    final JScrollPane UpgradesScrollPane = new JScrollPane();
    final JButton WeaponStatsButton = new JButton();
    final JPanel WeaponsPanel = new JPanel();
    final JProgressBar alphaDamageProgressBar = new JProgressBar();
    final JProgressBar alphaHeatProgressBar = new JProgressBar();
    final JComboBox<String> armorComboBox = new JComboBox<>();
    final ComponentPanel armorComponentPanel = new ComponentPanel();
    final JProgressBar armorProgressBar = new JProgressBar();
    final JSpinner centerRearTorsoSpinner = new JSpinner();
    final JLabel centerTorsoAMSHardpointLabel = new JLabel();
    final JLabel centerTorsoArmorAmountLabel = new JLabel();
    final JLabel centerTorsoBallisticHardpointLabel = new JLabel();
    final JList<String> centerTorsoCriticalList = new JList<>();
    final JLabel centerTorsoECMHardpointLabel = new JLabel();
    final JLabel centerTorsoEnergyHardpointLabel = new JLabel();
    final JProgressBar centerTorsoFrontArmorProgressBar = new JProgressBar();
    final JLabel centerTorsoMissileHardpointLabel = new JLabel();
    final JComboBox<String> centerTorsoOmnipodComboBox = new JComboBox<>();
    final JPanel centerTorsoPanel = new JPanel();
    final JProgressBar centerTorsoRearArmorProgressBar = new JProgressBar();
    final JSpinner centerTorsoSpinner = new JSpinner();
    final JProgressBar centerTorsoStructureProgressBar = new JProgressBar();
    JComboBox<String> chassisComboBox;
    final JButton clearArmorButton = new JButton();
    final JComboBox<String> cockpitComboBox = new JComboBox<>();
    final ComponentPanel cockpitComponentPanel = new ComponentPanel();
    final ComponentPanel componentPanel5 = new ComponentPanel();
    final ComponentPanel componentPanel6 = new ComponentPanel();
    final JPanel componentsPanel = new JPanel();
    final JScrollPane componentsScrollPane = new JScrollPane();
    final JProgressBar criticalsProgressBar = new JProgressBar();
    final JScrollPane descriptionScrollPane = new JScrollPane();
    final JTextArea descriptionTextArea = new JTextArea();
    final JLabel ecmCapableLabel = new JLabel();
    final JButton efficientArmorButton = new JButton();
    final JComboBox<String> engineComboBox = new JComboBox<>();
    final ComponentPanel engineComponentPanel = new ComponentPanel();
    final JSpinner engineRatingSpinner = new JSpinner();
    final JButton exportButton = new JButton();
    final JProgressBar firepowerProgressBar = new JProgressBar();
    final JComboBox<String> gyroComboBox = new JComboBox<>();
    final ComponentPanel gyroComponentPanel = new ComponentPanel();
    final ComponentPanel hardpointComponentPanel = new ComponentPanel();
    final JLabel headAMSHardpointLabel = new JLabel();
    final JLabel headArmorAmountLabel = new JLabel();
    final JProgressBar headArmorProgressBar = new JProgressBar();
    final JLabel headBallisticHardpointLabel = new JLabel();
    final JList<String> headCriticalList = new JList<>();
    final JLabel headECMHardpointLabel = new JLabel();
    final JLabel headEnergyHardpointLabel = new JLabel();
    final JLabel headMissileHardpointLabel = new JLabel();
    final JComboBox<String> headOmnipodComboBox = new JComboBox<>();
    final JPanel headPanel = new JPanel();
    final JSpinner headSpinner = new JSpinner();
    final JProgressBar headStructureProgressBar = new JProgressBar();
    final JProgressBar heatEfficiencyProgressBar = new JProgressBar();
    final JComboBox<String> heatSinkComboBox = new JComboBox<>();
    final ComponentPanel heatSinksComponentPanel = new ComponentPanel();
    final JButton importButton = new JButton();
    final JLabel jLabel21 = new JLabel();
    final JLabel jLabel22 = new JLabel();
    final JLabel jLabel23 = new JLabel();
    final JLabel jLabel24 = new JLabel();
    final JLabel jLabel25 = new JLabel();
    final JLabel jLabel29 = new JLabel();
    final JLabel jLabel33 = new JLabel();
    final JLabel jLabel37 = new JLabel();
    final JLabel jLabel41 = new JLabel();
    final JLabel jLabel45 = new JLabel();
    final JLabel jLabel49 = new JLabel();
    final JLabel jLabel50 = new JLabel();
    final JLabel jLabel51 = new JLabel();
    final JLabel jLabel55 = new JLabel();
    final JLabel jumpCapableLabel = new JLabel();
    final JProgressBar jumpDistanceProgressBar = new JProgressBar();
    final JProgressBar jumpHeightProgressBar = new JProgressBar();
    final JComboBox<String> jumpJetComboBox = new JComboBox<>();
    final ComponentPanel jumpJetsComponentPanel = new ComponentPanel();
    final JLabel leftArmAMSHardpointLabel = new JLabel();
    final JLabel leftArmArmorAmountLabel = new JLabel();
    final JProgressBar leftArmArmorProgressBar = new JProgressBar();
    final JLabel leftArmBallisticHardpointLabel = new JLabel();
    final JList<String> leftArmCriticalList = new JList<>();
    final JLabel leftArmECMHardpointLabel = new JLabel();
    final JLabel leftArmEnergyHardpointLabel = new JLabel();
    final JLabel leftArmMissileHardpointLabel = new JLabel();
    final JComboBox<String> leftArmOmnipodComboBox = new JComboBox<>();
    final JPanel leftArmPanel = new JPanel();
    final JSpinner leftArmSpinner = new JSpinner();
    final JProgressBar leftArmStructureProgressBar = new JProgressBar();
    final JToggleButton leftHandToggleButton = new JToggleButton();
    final JLabel leftLegAMSHardpointLabel = new JLabel();
    final JLabel leftLegArmorAmountLabel = new JLabel();
    final JProgressBar leftLegArmorProgressBar = new JProgressBar();
    final JLabel leftLegBallisticHardpointLabel = new JLabel();
    final JList<String> leftLegCriticalList = new JList<>();
    final JLabel leftLegECMHardpointLabel = new JLabel();
    final JLabel leftLegEnergyHardpointLabel = new JLabel();
    final JLabel leftLegMissileHardpointLabel = new JLabel();
    final JComboBox<String> leftLegOmnipodComboBox = new JComboBox<>();
    final JPanel leftLegPanel = new JPanel();
    final JSpinner leftLegSpinner = new JSpinner();
    final JProgressBar leftLegStructureProgressBar = new JProgressBar();
    final JToggleButton leftLowerArmToggleButton = new JToggleButton();
    final JSpinner leftRearTorsoSpinner = new JSpinner();
    final JLabel leftTorsoAMSHardpointLabel = new JLabel();
    final JLabel leftTorsoArmorAmountLabel = new JLabel();
    final JLabel leftTorsoBallisticHardpointLabel = new JLabel();
    final JToggleButton leftTorsoCASEToggleButton = new JToggleButton();
    final JList<String> leftTorsoCriticalList = new JList<>();
    final JLabel leftTorsoECMHardpointLabel = new JLabel();
    final JLabel leftTorsoEnergyHardpointLabel = new JLabel();
    final JProgressBar leftTorsoFrontArmorProgressBar = new JProgressBar();
    final JLabel leftTorsoMissileHardpointLabel = new JLabel();
    final JComboBox<String> leftTorsoOmnipodComboBox = new JComboBox<>();
    final JPanel leftTorsoPanel = new JPanel();
    final JProgressBar leftTorsoRearArmorProgressBar = new JProgressBar();
    final JSpinner leftTorsoSpinner = new JSpinner();
    final JProgressBar leftTorsoStructureProgressBar = new JProgressBar();
    final JButton loadButton = new JButton();
    final ComponentPanel manueverabilityComponentPanel = new ComponentPanel();
    final JButton maximumArmorButton = new JButton();
    final JPanel mechPanel = new JPanel();
    final JLabel mechTypeLabel = new JLabel();
    JComboBox<String> modelComboBox;
    final ComponentPanel moduleComponentPanel = new ComponentPanel();
    final ComponentPanel movementRangeComponentPanel = new ComponentPanel();
    final ComponentPanel movementSpeedComponentPanel = new ComponentPanel();
    final JComboBox<String> myomerComboBox = new JComboBox<>();
    final ComponentPanel myomerComponentPanel = new ComponentPanel();
    final ComponentPanel overviewComponentPanel = new ComponentPanel();
    final JLabel pointsPerTonAmountLabel = new JLabel();
    final JLabel pointsPerTonLabel = new JLabel();
    final JPanel quirksPanel = new JPanel();
    final JProgressBar rangeProgressBar = new JProgressBar();
    final JLabel rightArmAMSHardpointLabel = new JLabel();
    final JLabel rightArmArmorAmountLabel = new JLabel();
    final JProgressBar rightArmArmorProgressBar = new JProgressBar();
    final JLabel rightArmBallisticHardpointLabel = new JLabel();
    final JList<String> rightArmCriticalList = new JList<>();
    final JLabel rightArmECMHardpointLabel = new JLabel();
    final JLabel rightArmEnergyHardpointLabel = new JLabel();
    final JLabel rightArmMissileHardpointLabel = new JLabel();
    final JComboBox<String> rightArmOmnipodComboBox = new JComboBox<>();
    final JPanel rightArmPanel = new JPanel();
    final JSpinner rightArmSpinner = new JSpinner();
    final JProgressBar rightArmStructureProgressBar = new JProgressBar();
    final JToggleButton rightHandToggleButton = new JToggleButton();
    final JLabel rightLegAMSHardpointLabel = new JLabel();
    final JLabel rightLegArmorAmountLabel = new JLabel();
    final JProgressBar rightLegArmorProgressBar = new JProgressBar();
    final JLabel rightLegBallisticHardpointLabel = new JLabel();
    final JList<String> rightLegCriticalList = new JList<>();
    final JLabel rightLegECMHardpointLabel = new JLabel();
    final JLabel rightLegEnergyHardpointLabel = new JLabel();
    final JLabel rightLegMissileHardpointLabel = new JLabel();
    final JComboBox<String> rightLegOmnipodComboBox = new JComboBox<>();
    final JPanel rightLegPanel = new JPanel();
    final JSpinner rightLegSpinner = new JSpinner();
    final JProgressBar rightLegStructureProgressBar = new JProgressBar();
    final JToggleButton rightLowerArmToggleButton = new JToggleButton();
    final JSpinner rightRearTorsoSpinner = new JSpinner();
    final JLabel rightTorsoAMSHardpointLabel = new JLabel();
    final JLabel rightTorsoArmorAmountLabel = new JLabel();
    final JLabel rightTorsoBallisticHardpointLabel = new JLabel();
    final JToggleButton rightTorsoCASEToggleButton = new JToggleButton();
    final JList<String> rightTorsoCriticalList = new JList<>();
    final JLabel rightTorsoECMHardpointLabel = new JLabel();
    final JLabel rightTorsoEnergyHardpointLabel = new JLabel();
    final JProgressBar rightTorsoFrontArmorProgressBar = new JProgressBar();
    final JLabel rightTorsoMissileHardpointLabel = new JLabel();
    final JComboBox<String> rightTorsoOmnipodComboBox = new JComboBox<>();
    final JPanel rightTorsoPanel = new JPanel();
    final JProgressBar rightTorsoRearArmorProgressBar = new JProgressBar();
    final JSpinner rightTorsoSpinner = new JSpinner();
    final JProgressBar rightTorsoStructureProgressBar = new JProgressBar();
    final JButton saveButton = new JButton();
    final JTabbedPane secondaryTabbedPane = new JTabbedPane();
    final JLabel section1AMSHardpointLabel = new JLabel();
    final JProgressBar section1ArmorProgressBar = new JProgressBar();
    final JLabel section1BallisticHardpointLabel = new JLabel();
    final JList<String> section1CriticalList = new JList<>();
    final JLabel section1ECMHardpointLabel = new JLabel();
    final JLabel section1EnergyHardpointLabel = new JLabel();
    final JLabel section1MissileHardpointLabel = new JLabel();
    final JComboBox<String> section1OmnipodComboBox = new JComboBox<>();
    final JProgressBar section1StructureProgressBar = new JProgressBar();
    final JLabel section2AMSHardpointLabel = new JLabel();
    final JProgressBar section2ArmorProgressBar = new JProgressBar();
    final JLabel section2BallisticHardpointLabel = new JLabel();
    final JList<String> section2CriticalList = new JList<>();
    final JLabel section2ECMHardpointLabel = new JLabel();
    final JLabel section2EnergyHardpointLabel = new JLabel();
    final JLabel section2MissileHardpointLabel = new JLabel();
    final JComboBox<String> section2OmnipodComboBox = new JComboBox<>();
    final JProgressBar section2StructureProgressBar = new JProgressBar();
    final JLabel special1ArmorAmountLabel = new JLabel();
    final JPanel special1Panel = new JPanel();
    final JSpinner special1Spinner = new JSpinner();
    final JLabel special2ArmorAmountLabel = new JLabel();
    final JPanel special2Panel = new JPanel();
    final JSpinner special2Spinner = new JSpinner();
    final ComponentPanel speedComponentPanel = new ComponentPanel();
    final JProgressBar speedProgressBar = new JProgressBar();
    final JPanel statisticsPanel = new JPanel();
    final JComboBox<String> structureComboBox = new JComboBox<>();
    final ComponentPanel structureComponentPanel = new ComponentPanel();
    final JLabel techBaseLabel = new JLabel();
    final JButton tonnageArmorButton = new JButton();
    final JProgressBar tonnageProgressBar = new JProgressBar();
    final JLabel totalArmorAmountLabel = new JLabel();
    final JLabel totalArmorLabel = new JLabel();
    final JLabel unconfirmedLabel = new JLabel();
    final JLabel unreleasedLabel = new JLabel();
    final JLabel variantCostLabel = new JLabel();
    final JTextField variantNameField = new JTextField();
    // End of variables declaration//GEN-END:variables
}
