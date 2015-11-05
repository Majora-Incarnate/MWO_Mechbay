package GUI;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class SelectiveAllocationDialogBox
  extends JDialog
{
  private int itemTotal;
  private int itemLimit;
  private int k;
  private int[] itemCount = new int[8];
  private int[] sectionLimits;
  private int[] criticals;
  private MechlabForm nParent;
  private JLabel allocatedEquipmentLabel;
  private JLabel allocatedTotalLabel;
  private JPanel allocationPanel;
  private JPanel buttonPanel;
  private JButton cancelButton;
  private JLabel centerTorsoLabel;
  private JPanel centerTorsoPanel;
  private JSpinner centerTorsoSpinner;
  private JLabel headLabel;
  private JPanel headPanel;
  private JSpinner headSpinner;
  private JLabel leftArmLabel;
  private JPanel leftArmPanel;
  private JSpinner leftArmSpinner;
  private JLabel leftLegLabel;
  private JPanel leftLegPanel;
  private JSpinner leftLegSpinner;
  private JLabel leftTorsoLabel;
  private JPanel leftTorsoPanel;
  private JSpinner leftTorsoSpinner;
  private JButton okButton;
  private JLabel rightArmLabel;
  private JPanel rightArmPanel;
  private JSpinner rightArmSpinner;
  private JLabel rightLegLabel;
  private JPanel rightLegPanel;
  private JSpinner rightLegSpinner;
  private JLabel rightTorsoLabel;
  private JPanel rightTorsoPanel;
  private JSpinner rightTorsoSpinner;
  private JPanel titlePanel;
  
  public SelectiveAllocationDialogBox(MechlabForm paramMechlabForm, boolean paramBoolean, int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    super(paramMechlabForm, paramBoolean);
    this.nParent = paramMechlabForm;
    this.itemLimit = paramInt1;
    this.k = paramInt2;
    this.itemTotal = 0;
    for (int i = 0; i < 8; i++) {
      this.itemCount[i] = 0;
    }
    this.criticals = paramArrayOfInt;
    this.sectionLimits = ((int[])paramArrayOfInt.clone());
    System.arraycopy(paramArrayOfInt, 0, this.sectionLimits, 0, paramArrayOfInt.length);
    initComponents();
    this.headSpinner.setModel(new SpinnerNumberModel(0, 0, this.sectionLimits[5], 1));
    this.centerTorsoSpinner.setModel(new SpinnerNumberModel(0, 0, this.sectionLimits[4], 1));
    this.rightTorsoSpinner.setModel(new SpinnerNumberModel(0, 0, this.sectionLimits[2], 1));
    this.leftTorsoSpinner.setModel(new SpinnerNumberModel(0, 0, this.sectionLimits[3], 1));
    this.rightArmSpinner.setModel(new SpinnerNumberModel(0, 0, this.sectionLimits[0], 1));
    this.leftArmSpinner.setModel(new SpinnerNumberModel(0, 0, this.sectionLimits[1], 1));
    this.rightLegSpinner.setModel(new SpinnerNumberModel(0, 0, this.sectionLimits[6], 1));
    this.leftLegSpinner.setModel(new SpinnerNumberModel(0, 0, this.sectionLimits[7], 1));
  }
  
  private void initComponents()
  {
    this.buttonPanel = new JPanel();
    this.okButton = new JButton();
    this.cancelButton = new JButton();
    this.titlePanel = new JPanel();
    this.allocatedEquipmentLabel = new JLabel();
    this.allocatedTotalLabel = new JLabel();
    this.allocationPanel = new JPanel();
    this.headPanel = new JPanel();
    this.headSpinner = new JSpinner();
    this.headLabel = new JLabel();
    this.centerTorsoPanel = new JPanel();
    this.centerTorsoSpinner = new JSpinner();
    this.centerTorsoLabel = new JLabel();
    this.rightLegPanel = new JPanel();
    this.rightLegSpinner = new JSpinner();
    this.rightLegLabel = new JLabel();
    this.leftArmPanel = new JPanel();
    this.leftArmSpinner = new JSpinner();
    this.leftArmLabel = new JLabel();
    this.leftLegPanel = new JPanel();
    this.leftLegSpinner = new JSpinner();
    this.leftLegLabel = new JLabel();
    this.rightArmPanel = new JPanel();
    this.rightArmSpinner = new JSpinner();
    this.rightArmLabel = new JLabel();
    this.rightTorsoPanel = new JPanel();
    this.rightTorsoSpinner = new JSpinner();
    this.rightTorsoLabel = new JLabel();
    this.leftTorsoPanel = new JPanel();
    this.leftTorsoSpinner = new JSpinner();
    this.leftTorsoLabel = new JLabel();
    setDefaultCloseOperation(2);
    setTitle("Selective Allocation");
    setMinimumSize(new Dimension(300, 300));
    setName("Selective Dialog Box");
    setResizable(false);
    getContentPane().setLayout(new GridBagLayout());
    this.buttonPanel.setFont(new Font("Moire", 0, 11));
    this.buttonPanel.setMaximumSize(new Dimension(300, 60));
    this.buttonPanel.setMinimumSize(new Dimension(300, 60));
    this.buttonPanel.setPreferredSize(new Dimension(300, 60));
    this.buttonPanel.setLayout(new GridBagLayout());
    this.okButton.setFont(new Font("Moire", 0, 11));
    this.okButton.setText("OK");
    this.okButton.setDefaultCapable(false);
    this.okButton.setMargin(new Insets(0, 0, 0, 0));
    this.okButton.setMaximumSize(new Dimension(60, 20));
    this.okButton.setMinimumSize(new Dimension(60, 20));
    this.okButton.setPreferredSize(new Dimension(60, 20));
    this.okButton.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent paramAnonymousActionEvent)
      {
        SelectiveAllocationDialogBox.this.okButtonActionPerformed(paramAnonymousActionEvent);
      }
    });
    GridBagConstraints localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.gridy = 0;
    localGridBagConstraints.ipadx = 20;
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.weighty = 1.0D;
    localGridBagConstraints.insets = new Insets(15, 0, 15, 0);
    this.buttonPanel.add(this.okButton, localGridBagConstraints);
    getRootPane().setDefaultButton(this.okButton);
    this.cancelButton.setFont(new Font("Moire", 0, 11));
    this.cancelButton.setText("Cancel");
    this.cancelButton.setDefaultCapable(false);
    this.cancelButton.setMargin(new Insets(0, 0, 0, 0));
    this.cancelButton.setMaximumSize(new Dimension(60, 20));
    this.cancelButton.setMinimumSize(new Dimension(60, 20));
    this.cancelButton.setPreferredSize(new Dimension(60, 20));
    this.cancelButton.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent paramAnonymousActionEvent)
      {
        SelectiveAllocationDialogBox.this.cancelButtonActionPerformed(paramAnonymousActionEvent);
      }
    });
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 1;
    localGridBagConstraints.gridy = 0;
    localGridBagConstraints.ipadx = 20;
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.weighty = 1.0D;
    localGridBagConstraints.insets = new Insets(15, 0, 15, 0);
    this.buttonPanel.add(this.cancelButton, localGridBagConstraints);
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.gridy = 6;
    getContentPane().add(this.buttonPanel, localGridBagConstraints);
    this.titlePanel.setFont(new Font("Moire", 0, 11));
    this.titlePanel.setMaximumSize(new Dimension(300, 60));
    this.titlePanel.setMinimumSize(new Dimension(300, 60));
    this.titlePanel.setPreferredSize(new Dimension(300, 60));
    this.titlePanel.setLayout(new GridBagLayout());
    this.allocatedEquipmentLabel.setFont(new Font("Moire", 0, 11));
    this.allocatedEquipmentLabel.setHorizontalAlignment(0);
    this.allocatedEquipmentLabel.setMaximumSize(new Dimension(150, 20));
    this.allocatedEquipmentLabel.setMinimumSize(new Dimension(150, 20));
    this.allocatedEquipmentLabel.setPreferredSize(new Dimension(150, 20));
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.gridy = 0;
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.weighty = 1.0D;
    this.titlePanel.add(this.allocatedEquipmentLabel, localGridBagConstraints);
    this.allocatedTotalLabel.setFont(new Font("Moire", 0, 11));
    this.allocatedTotalLabel.setHorizontalAlignment(0);
    this.allocatedTotalLabel.setMaximumSize(new Dimension(150, 20));
    this.allocatedTotalLabel.setMinimumSize(new Dimension(150, 20));
    this.allocatedTotalLabel.setPreferredSize(new Dimension(150, 20));
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.gridy = 1;
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.weighty = 1.0D;
    this.titlePanel.add(this.allocatedTotalLabel, localGridBagConstraints);
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.gridy = 0;
    getContentPane().add(this.titlePanel, localGridBagConstraints);
    this.allocationPanel.setMaximumSize(new Dimension(300, 180));
    this.allocationPanel.setMinimumSize(new Dimension(300, 180));
    this.allocationPanel.setPreferredSize(new Dimension(300, 180));
    this.allocationPanel.setLayout(new GridBagLayout());
    this.headPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "HD", 2, 2, new Font("Moire", 0, 11)));
    this.headPanel.setFont(new Font("Moire", 0, 11));
    this.headPanel.setMaximumSize(new Dimension(60, 60));
    this.headPanel.setMinimumSize(new Dimension(60, 60));
    this.headPanel.setPreferredSize(new Dimension(60, 60));
    this.headPanel.setLayout(new GridBagLayout());
    this.headSpinner.setFont(new Font("Moire", 0, 10));
    this.headSpinner.setAlignmentX(0.0F);
    this.headSpinner.setAlignmentY(0.0F);
    this.headSpinner.setMaximumSize(new Dimension(50, 20));
    this.headSpinner.setMinimumSize(new Dimension(50, 20));
    this.headSpinner.setPreferredSize(new Dimension(50, 20));
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.gridy = 0;
    localGridBagConstraints.fill = 1;
    this.headPanel.add(this.headSpinner, localGridBagConstraints);
    this.headLabel.setFont(new Font("Moire", 0, 10));
    this.headLabel.setAlignmentY(0.0F);
    this.headLabel.setMaximumSize(new Dimension(50, 15));
    this.headLabel.setMinimumSize(new Dimension(50, 15));
    this.headLabel.setPreferredSize(new Dimension(50, 15));
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.gridy = 1;
    localGridBagConstraints.fill = 1;
    this.headPanel.add(this.headLabel, localGridBagConstraints);
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 2;
    localGridBagConstraints.gridy = 0;
    this.allocationPanel.add(this.headPanel, localGridBagConstraints);
    this.centerTorsoPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "CT", 2, 2, new Font("Moire", 0, 11)));
    this.centerTorsoPanel.setFont(new Font("Moire", 0, 11));
    this.centerTorsoPanel.setMaximumSize(new Dimension(60, 60));
    this.centerTorsoPanel.setMinimumSize(new Dimension(60, 60));
    this.centerTorsoPanel.setLayout(new GridBagLayout());
    this.centerTorsoSpinner.setFont(new Font("Moire", 0, 10));
    this.centerTorsoSpinner.setAlignmentX(0.0F);
    this.centerTorsoSpinner.setAlignmentY(0.0F);
    this.centerTorsoSpinner.setMaximumSize(new Dimension(50, 20));
    this.centerTorsoSpinner.setMinimumSize(new Dimension(50, 20));
    this.centerTorsoSpinner.setPreferredSize(new Dimension(50, 20));
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.gridy = 0;
    localGridBagConstraints.fill = 1;
    this.centerTorsoPanel.add(this.centerTorsoSpinner, localGridBagConstraints);
    this.centerTorsoLabel.setFont(new Font("Moire", 0, 10));
    this.centerTorsoLabel.setAlignmentY(0.0F);
    this.centerTorsoLabel.setMaximumSize(new Dimension(50, 15));
    this.centerTorsoLabel.setMinimumSize(new Dimension(50, 15));
    this.centerTorsoLabel.setPreferredSize(new Dimension(50, 15));
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.gridy = 1;
    localGridBagConstraints.fill = 1;
    this.centerTorsoPanel.add(this.centerTorsoLabel, localGridBagConstraints);
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 2;
    localGridBagConstraints.gridy = 1;
    this.allocationPanel.add(this.centerTorsoPanel, localGridBagConstraints);
    this.rightLegPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "RL", 2, 2, new Font("Moire", 0, 11)));
    this.rightLegPanel.setFont(new Font("Moire", 0, 11));
    this.rightLegPanel.setMaximumSize(new Dimension(60, 60));
    this.rightLegPanel.setMinimumSize(new Dimension(60, 60));
    this.rightLegPanel.setLayout(new GridBagLayout());
    this.rightLegSpinner.setFont(new Font("Moire", 0, 10));
    this.rightLegSpinner.setAlignmentX(0.0F);
    this.rightLegSpinner.setAlignmentY(0.0F);
    this.rightLegSpinner.setMaximumSize(new Dimension(50, 20));
    this.rightLegSpinner.setMinimumSize(new Dimension(50, 20));
    this.rightLegSpinner.setPreferredSize(new Dimension(50, 20));
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.gridy = 0;
    localGridBagConstraints.fill = 1;
    this.rightLegPanel.add(this.rightLegSpinner, localGridBagConstraints);
    this.rightLegLabel.setFont(new Font("Moire", 0, 10));
    this.rightLegLabel.setAlignmentY(0.0F);
    this.rightLegLabel.setMaximumSize(new Dimension(50, 15));
    this.rightLegLabel.setMinimumSize(new Dimension(50, 15));
    this.rightLegLabel.setPreferredSize(new Dimension(50, 15));
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.gridy = 1;
    localGridBagConstraints.fill = 1;
    this.rightLegPanel.add(this.rightLegLabel, localGridBagConstraints);
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 1;
    localGridBagConstraints.gridy = 2;
    this.allocationPanel.add(this.rightLegPanel, localGridBagConstraints);
    this.leftArmPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "LA", 2, 2, new Font("Moire", 0, 11)));
    this.leftArmPanel.setFont(new Font("Moire", 0, 11));
    this.leftArmPanel.setLayout(new GridBagLayout());
    this.leftArmSpinner.setFont(new Font("Moire", 0, 10));
    this.leftArmSpinner.setAlignmentX(0.0F);
    this.leftArmSpinner.setAlignmentY(0.0F);
    this.leftArmSpinner.setMaximumSize(new Dimension(50, 20));
    this.leftArmSpinner.setMinimumSize(new Dimension(50, 20));
    this.leftArmSpinner.setPreferredSize(new Dimension(50, 20));
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.gridy = 0;
    localGridBagConstraints.fill = 1;
    this.leftArmPanel.add(this.leftArmSpinner, localGridBagConstraints);
    this.leftArmLabel.setFont(new Font("Moire", 0, 10));
    this.leftArmLabel.setAlignmentY(0.0F);
    this.leftArmLabel.setMaximumSize(new Dimension(50, 15));
    this.leftArmLabel.setMinimumSize(new Dimension(50, 15));
    this.leftArmLabel.setPreferredSize(new Dimension(50, 15));
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.gridy = 1;
    localGridBagConstraints.fill = 1;
    this.leftArmPanel.add(this.leftArmLabel, localGridBagConstraints);
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 4;
    localGridBagConstraints.gridy = 1;
    this.allocationPanel.add(this.leftArmPanel, localGridBagConstraints);
    this.leftLegPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "LL", 2, 2, new Font("Moire", 0, 11)));
    this.leftLegPanel.setFont(new Font("Moire", 0, 11));
    this.leftLegPanel.setMaximumSize(new Dimension(60, 60));
    this.leftLegPanel.setMinimumSize(new Dimension(60, 60));
    this.leftLegPanel.setLayout(new GridBagLayout());
    this.leftLegSpinner.setFont(new Font("Moire", 0, 10));
    this.leftLegSpinner.setAlignmentX(0.0F);
    this.leftLegSpinner.setAlignmentY(0.0F);
    this.leftLegSpinner.setMaximumSize(new Dimension(50, 20));
    this.leftLegSpinner.setMinimumSize(new Dimension(50, 20));
    this.leftLegSpinner.setPreferredSize(new Dimension(50, 20));
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.gridy = 0;
    localGridBagConstraints.fill = 1;
    this.leftLegPanel.add(this.leftLegSpinner, localGridBagConstraints);
    this.leftLegLabel.setFont(new Font("Moire", 0, 10));
    this.leftLegLabel.setAlignmentY(0.0F);
    this.leftLegLabel.setMaximumSize(new Dimension(50, 15));
    this.leftLegLabel.setMinimumSize(new Dimension(50, 15));
    this.leftLegLabel.setPreferredSize(new Dimension(50, 15));
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.gridy = 1;
    localGridBagConstraints.fill = 1;
    this.leftLegPanel.add(this.leftLegLabel, localGridBagConstraints);
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 3;
    localGridBagConstraints.gridy = 2;
    this.allocationPanel.add(this.leftLegPanel, localGridBagConstraints);
    this.rightArmPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "RA", 2, 2, new Font("Moire", 0, 11)));
    this.rightArmPanel.setFont(new Font("Moire", 0, 11));
    this.rightArmPanel.setLayout(new GridBagLayout());
    this.rightArmSpinner.setFont(new Font("Moire", 0, 10));
    this.rightArmSpinner.setAlignmentX(0.0F);
    this.rightArmSpinner.setAlignmentY(0.0F);
    this.rightArmSpinner.setMaximumSize(new Dimension(50, 20));
    this.rightArmSpinner.setMinimumSize(new Dimension(50, 20));
    this.rightArmSpinner.setPreferredSize(new Dimension(50, 20));
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.gridy = 0;
    localGridBagConstraints.fill = 1;
    this.rightArmPanel.add(this.rightArmSpinner, localGridBagConstraints);
    this.rightArmLabel.setFont(new Font("Moire", 0, 10));
    this.rightArmLabel.setAlignmentY(0.0F);
    this.rightArmLabel.setMaximumSize(new Dimension(50, 15));
    this.rightArmLabel.setMinimumSize(new Dimension(50, 15));
    this.rightArmLabel.setPreferredSize(new Dimension(50, 15));
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.gridy = 1;
    localGridBagConstraints.fill = 1;
    this.rightArmPanel.add(this.rightArmLabel, localGridBagConstraints);
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.gridy = 1;
    this.allocationPanel.add(this.rightArmPanel, localGridBagConstraints);
    this.rightTorsoPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "RT", 2, 2, new Font("Moire", 0, 11)));
    this.rightTorsoPanel.setFont(new Font("Moire", 0, 11));
    this.rightTorsoPanel.setMaximumSize(new Dimension(60, 60));
    this.rightTorsoPanel.setMinimumSize(new Dimension(60, 60));
    this.rightTorsoPanel.setPreferredSize(new Dimension(60, 60));
    this.rightTorsoPanel.setLayout(new GridBagLayout());
    this.rightTorsoSpinner.setFont(new Font("Moire", 0, 10));
    this.rightTorsoSpinner.setAlignmentX(0.0F);
    this.rightTorsoSpinner.setAlignmentY(0.0F);
    this.rightTorsoSpinner.setMaximumSize(new Dimension(50, 20));
    this.rightTorsoSpinner.setMinimumSize(new Dimension(50, 20));
    this.rightTorsoSpinner.setPreferredSize(new Dimension(50, 20));
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.gridy = 0;
    localGridBagConstraints.fill = 1;
    this.rightTorsoPanel.add(this.rightTorsoSpinner, localGridBagConstraints);
    this.rightTorsoLabel.setFont(new Font("Moire", 0, 10));
    this.rightTorsoLabel.setAlignmentY(0.0F);
    this.rightTorsoLabel.setMaximumSize(new Dimension(50, 15));
    this.rightTorsoLabel.setMinimumSize(new Dimension(50, 15));
    this.rightTorsoLabel.setPreferredSize(new Dimension(50, 15));
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.gridy = 1;
    localGridBagConstraints.fill = 1;
    this.rightTorsoPanel.add(this.rightTorsoLabel, localGridBagConstraints);
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 1;
    localGridBagConstraints.gridy = 0;
    localGridBagConstraints.gridheight = 2;
    this.allocationPanel.add(this.rightTorsoPanel, localGridBagConstraints);
    this.leftTorsoPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "LT", 2, 2, new Font("Moire", 0, 11)));
    this.leftTorsoPanel.setFont(new Font("Moire", 0, 11));
    this.leftTorsoPanel.setMaximumSize(new Dimension(60, 60));
    this.leftTorsoPanel.setMinimumSize(new Dimension(60, 60));
    this.leftTorsoPanel.setLayout(new GridBagLayout());
    this.leftTorsoSpinner.setFont(new Font("Moire", 0, 10));
    this.leftTorsoSpinner.setAlignmentX(0.0F);
    this.leftTorsoSpinner.setAlignmentY(0.0F);
    this.leftTorsoSpinner.setMaximumSize(new Dimension(50, 20));
    this.leftTorsoSpinner.setMinimumSize(new Dimension(50, 20));
    this.leftTorsoSpinner.setPreferredSize(new Dimension(50, 20));
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.gridy = 0;
    localGridBagConstraints.fill = 1;
    this.leftTorsoPanel.add(this.leftTorsoSpinner, localGridBagConstraints);
    this.leftTorsoLabel.setFont(new Font("Moire", 0, 10));
    this.leftTorsoLabel.setAlignmentY(0.0F);
    this.leftTorsoLabel.setMaximumSize(new Dimension(50, 15));
    this.leftTorsoLabel.setMinimumSize(new Dimension(50, 15));
    this.leftTorsoLabel.setPreferredSize(new Dimension(50, 15));
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.gridy = 1;
    localGridBagConstraints.fill = 1;
    this.leftTorsoPanel.add(this.leftTorsoLabel, localGridBagConstraints);
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 3;
    localGridBagConstraints.gridy = 0;
    localGridBagConstraints.gridheight = 2;
    this.allocationPanel.add(this.leftTorsoPanel, localGridBagConstraints);
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.gridy = 1;
    localGridBagConstraints.gridheight = 3;
    localGridBagConstraints.fill = 1;
    getContentPane().add(this.allocationPanel, localGridBagConstraints);
    pack();
  }
  
  private void okButtonActionPerformed(ActionEvent paramActionEvent)
  {
    dispose();
  }
  
  private void cancelButtonActionPerformed(ActionEvent paramActionEvent)
  {
    dispose();
  }
}


/* Location:              C:\Users\Trevin\Dropbox\Public\MWO Mechbay.zip!\MWO_Mechbay.jar!\GUI\SelectiveAllocationDialogBox.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */