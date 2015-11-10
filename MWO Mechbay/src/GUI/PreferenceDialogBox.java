package GUI;

import Utility.Preferences;
import Utility.User;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.NotSerializableException;
import java.io.ObjectOutputStream;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;

public class PreferenceDialogBox extends JDialog {
  Preferences u = User.preferences;
  private JPanel ArmorDistributionPanel;
  private JPanel ButtonPanel;
  private JPanel ColorPanel;
  private JPanel FontPanel;
  private JButton jButton1;
  private JButton jButton10;
  private JButton jButton11;
  private JButton jButton12;
  private JButton jButton13;
  private JButton jButton14;
  private JButton jButton15;
  private JButton jButton16;
  private JButton jButton17;
  private JButton jButton18;
  private JButton jButton2;
  private JButton jButton3;
  private JButton jButton4;
  private JButton jButton5;
  private JButton jButton6;
  private JButton jButton7;
  private JButton jButton8;
  private JButton jButton9;
  private JComboBox jComboBox1;
  private JLabel jLabel1;
  private JLabel jLabel10;
  private JLabel jLabel2;
  private JLabel jLabel3;
  private JLabel jLabel4;
  private JLabel jLabel5;
  private JLabel jLabel6;
  private JLabel jLabel7;
  private JLabel jLabel8;
  private JLabel jLabel9;
  private JProgressBar jProgressBar1;
  private JProgressBar jProgressBar2;
  private JTextField jTextField1;
  private JTextField jTextField3;
  
  public PreferenceDialogBox(Frame paramFrame)
  {
    super(paramFrame, true);
    initComponents();
  }
  
  private void initComponents()
  {
    this.ColorPanel = new JPanel();
    this.jLabel1 = new JLabel();
    this.jLabel2 = new JLabel();
    this.jLabel3 = new JLabel();
    this.jLabel4 = new JLabel();
    this.jLabel5 = new JLabel();
    this.jLabel6 = new JLabel();
    this.jProgressBar1 = new JProgressBar();
    this.jProgressBar2 = new JProgressBar();
    this.jButton1 = new JButton();
    this.jButton2 = new JButton();
    this.jButton3 = new JButton();
    this.jButton4 = new JButton();
    this.jButton5 = new JButton();
    this.jButton6 = new JButton();
    this.jButton7 = new JButton();
    this.jButton8 = new JButton();
    this.jButton9 = new JButton();
    this.jButton10 = new JButton();
    this.jButton11 = new JButton();
    this.jButton12 = new JButton();
    this.jButton13 = new JButton();
    this.jButton14 = new JButton();
    this.jButton15 = new JButton();
    this.jButton16 = new JButton();
    this.FontPanel = new JPanel();
    this.jLabel7 = new JLabel();
    this.jComboBox1 = new JComboBox();
    this.ArmorDistributionPanel = new JPanel();
    this.jLabel8 = new JLabel();
    this.jLabel9 = new JLabel();
    this.jLabel10 = new JLabel();
    this.jTextField1 = new JTextField();
    this.jTextField3 = new JTextField();
    this.ButtonPanel = new JPanel();
    this.jButton17 = new JButton();
    this.jButton18 = new JButton();
    setDefaultCloseOperation(2);
    setTitle("User Preferences");
    setAlwaysOnTop(true);
    setLocationByPlatform(true);
    setMinimumSize(new Dimension(550, 300));
    setModal(true);
    setName("");
    getContentPane().setLayout(new GridBagLayout());
    this.ColorPanel.setBorder(BorderFactory.createEtchedBorder());
    this.ColorPanel.setAlignmentX(0.0F);
    this.ColorPanel.setAlignmentY(0.0F);
    this.ColorPanel.setMaximumSize(new Dimension(250, 200));
    this.ColorPanel.setName("ColorPanel");
    this.ColorPanel.setPreferredSize(new Dimension(250, 200));
    this.ColorPanel.setLayout(new GridBagLayout());
    this.jLabel1.setBackground(this.u.SELECTED_CRITICAL_PANEL_COLOR);
    this.jLabel1.setFont(this.u.DEFAULT_FONT_SIZE_10);
    this.jLabel1.setHorizontalAlignment(0);
    this.jLabel1.setText("Selected Section");
    this.jLabel1.setAlignmentY(0.0F);
    this.jLabel1.setMaximumSize(new Dimension(150, 25));
    this.jLabel1.setMinimumSize(new Dimension(150, 25));
    this.jLabel1.setName("jLabel1");
    this.jLabel1.setOpaque(true);
    this.jLabel1.setPreferredSize(new Dimension(150, 25));
    GridBagConstraints localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.weighty = 1.0D;
    this.ColorPanel.add(this.jLabel1, localGridBagConstraints);
    this.jLabel2.setBackground(this.u.DEFAULT_CRITICAL_PANEL_COLOR);
    this.jLabel2.setFont(this.u.DEFAULT_FONT_SIZE_10);
    this.jLabel2.setHorizontalAlignment(0);
    this.jLabel2.setText("Unselected Section");
    this.jLabel2.setAlignmentY(0.0F);
    this.jLabel2.setMaximumSize(new Dimension(150, 25));
    this.jLabel2.setMinimumSize(new Dimension(150, 25));
    this.jLabel2.setName("jLabel2");
    this.jLabel2.setOpaque(true);
    this.jLabel2.setPreferredSize(new Dimension(150, 25));
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.weighty = 1.0D;
    this.ColorPanel.add(this.jLabel2, localGridBagConstraints);
    this.jLabel3.setBackground(this.u.AMS_COLOR);
    this.jLabel3.setFont(this.u.DEFAULT_FONT_SIZE_10);
    this.jLabel3.setHorizontalAlignment(0);
    this.jLabel3.setText("AMS Label Color");
    this.jLabel3.setAlignmentY(0.0F);
    this.jLabel3.setMaximumSize(new Dimension(150, 25));
    this.jLabel3.setMinimumSize(new Dimension(150, 25));
    this.jLabel3.setName("jLabel3");
    this.jLabel3.setOpaque(true);
    this.jLabel3.setPreferredSize(new Dimension(150, 25));
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.weighty = 1.0D;
    this.ColorPanel.add(this.jLabel3, localGridBagConstraints);
    this.jLabel4.setBackground(this.u.BALLISTIC_COLOR);
    this.jLabel4.setFont(this.u.DEFAULT_FONT_SIZE_10);
    this.jLabel4.setHorizontalAlignment(0);
    this.jLabel4.setText("Ballistic Label Color");
    this.jLabel4.setAlignmentY(0.0F);
    this.jLabel4.setMaximumSize(new Dimension(150, 25));
    this.jLabel4.setMinimumSize(new Dimension(150, 25));
    this.jLabel4.setName("jLabel4");
    this.jLabel4.setOpaque(true);
    this.jLabel4.setPreferredSize(new Dimension(150, 25));
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.weighty = 1.0D;
    this.ColorPanel.add(this.jLabel4, localGridBagConstraints);
    this.jLabel5.setBackground(this.u.ENERGY_COLOR);
    this.jLabel5.setFont(this.u.DEFAULT_FONT_SIZE_10);
    this.jLabel5.setHorizontalAlignment(0);
    this.jLabel5.setText("Energy Label Color");
    this.jLabel5.setAlignmentY(0.0F);
    this.jLabel5.setMaximumSize(new Dimension(150, 25));
    this.jLabel5.setMinimumSize(new Dimension(150, 25));
    this.jLabel5.setName("jLabel5");
    this.jLabel5.setOpaque(true);
    this.jLabel5.setPreferredSize(new Dimension(150, 25));
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.weighty = 1.0D;
    this.ColorPanel.add(this.jLabel5, localGridBagConstraints);
    this.jLabel6.setBackground(this.u.MISSILE_COLOR);
    this.jLabel6.setFont(this.u.DEFAULT_FONT_SIZE_10);
    this.jLabel6.setHorizontalAlignment(0);
    this.jLabel6.setText("Missile Label Color");
    this.jLabel6.setAlignmentY(0.0F);
    this.jLabel6.setMaximumSize(new Dimension(150, 25));
    this.jLabel6.setMinimumSize(new Dimension(150, 25));
    this.jLabel6.setName("jLabel6");
    this.jLabel6.setOpaque(true);
    this.jLabel6.setPreferredSize(new Dimension(150, 25));
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.weighty = 1.0D;
    this.ColorPanel.add(this.jLabel6, localGridBagConstraints);
    this.jProgressBar1.setFont(this.u.DEFAULT_FONT_SIZE_10);
    this.jProgressBar1.setForeground(this.u.ARMOR_COLOR);
    this.jProgressBar1.setToolTipText("");
    this.jProgressBar1.setValue(100);
    this.jProgressBar1.setAlignmentX(0.0F);
    this.jProgressBar1.setAlignmentY(0.0F);
    this.jProgressBar1.setMaximumSize(new Dimension(150, 25));
    this.jProgressBar1.setMinimumSize(new Dimension(150, 25));
    this.jProgressBar1.setName("jProgressBar1");
    this.jProgressBar1.setPreferredSize(new Dimension(150, 25));
    this.jProgressBar1.setString("Armor Bar Color");
    this.jProgressBar1.setStringPainted(true);
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 0;
    this.ColorPanel.add(this.jProgressBar1, localGridBagConstraints);
    this.jProgressBar2.setFont(this.u.DEFAULT_FONT_SIZE_10);
    this.jProgressBar2.setForeground(this.u.STRUCTURE_COLOR);
    this.jProgressBar2.setToolTipText("");
    this.jProgressBar2.setValue(100);
    this.jProgressBar2.setAlignmentX(0.0F);
    this.jProgressBar2.setAlignmentY(0.0F);
    this.jProgressBar2.setMaximumSize(new Dimension(150, 25));
    this.jProgressBar2.setMinimumSize(new Dimension(150, 25));
    this.jProgressBar2.setName("jProgressBar2");
    this.jProgressBar2.setPreferredSize(new Dimension(150, 25));
    this.jProgressBar2.setString("Internal Bar Color");
    this.jProgressBar2.setStringPainted(true);
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 0;
    this.ColorPanel.add(this.jProgressBar2, localGridBagConstraints);
    this.jButton1.setFont(this.u.DEFAULT_FONT_SIZE_10);
    this.jButton1.setText("Fore");
    this.jButton1.setAlignmentY(0.0F);
    this.jButton1.setEnabled(false);
    this.jButton1.setMargin(new Insets(0, 0, 0, 0));
    this.jButton1.setMaximumSize(new Dimension(50, 25));
    this.jButton1.setMinimumSize(new Dimension(50, 25));
    this.jButton1.setName("jButton1");
    this.jButton1.setPreferredSize(new Dimension(50, 25));
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 1;
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.weighty = 1.0D;
    this.ColorPanel.add(this.jButton1, localGridBagConstraints);
    this.jButton2.setFont(this.u.DEFAULT_FONT_SIZE_10);
    this.jButton2.setText("Fore");
    this.jButton2.setAlignmentY(0.0F);
    this.jButton2.setEnabled(false);
    this.jButton2.setMargin(new Insets(0, 0, 0, 0));
    this.jButton2.setMaximumSize(new Dimension(50, 25));
    this.jButton2.setMinimumSize(new Dimension(50, 25));
    this.jButton2.setName("jButton2");
    this.jButton2.setPreferredSize(new Dimension(50, 25));
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 1;
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.weighty = 1.0D;
    this.ColorPanel.add(this.jButton2, localGridBagConstraints);
    this.jButton3.setFont(this.u.DEFAULT_FONT_SIZE_10);
    this.jButton3.setText("Fore");
    this.jButton3.setAlignmentY(0.0F);
    this.jButton3.setEnabled(false);
    this.jButton3.setMargin(new Insets(0, 0, 0, 0));
    this.jButton3.setMaximumSize(new Dimension(50, 25));
    this.jButton3.setMinimumSize(new Dimension(50, 25));
    this.jButton3.setName("jButton3");
    this.jButton3.setPreferredSize(new Dimension(50, 25));
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 1;
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.weighty = 1.0D;
    this.ColorPanel.add(this.jButton3, localGridBagConstraints);
    this.jButton4.setFont(this.u.DEFAULT_FONT_SIZE_10);
    this.jButton4.setText("Fore");
    this.jButton4.setAlignmentY(0.0F);
    this.jButton4.setEnabled(false);
    this.jButton4.setMargin(new Insets(0, 0, 0, 0));
    this.jButton4.setMaximumSize(new Dimension(50, 25));
    this.jButton4.setMinimumSize(new Dimension(50, 25));
    this.jButton4.setName("jButton4");
    this.jButton4.setPreferredSize(new Dimension(50, 25));
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 1;
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.weighty = 1.0D;
    this.ColorPanel.add(this.jButton4, localGridBagConstraints);
    this.jButton5.setFont(this.u.DEFAULT_FONT_SIZE_10);
    this.jButton5.setText("Fore");
    this.jButton5.setAlignmentY(0.0F);
    this.jButton5.setEnabled(false);
    this.jButton5.setMargin(new Insets(0, 0, 0, 0));
    this.jButton5.setMaximumSize(new Dimension(50, 25));
    this.jButton5.setMinimumSize(new Dimension(50, 25));
    this.jButton5.setName("jButton5");
    this.jButton5.setPreferredSize(new Dimension(50, 25));
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 1;
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.weighty = 1.0D;
    this.ColorPanel.add(this.jButton5, localGridBagConstraints);
    this.jButton6.setFont(this.u.DEFAULT_FONT_SIZE_10);
    this.jButton6.setText("Fore");
    this.jButton6.setAlignmentY(0.0F);
    this.jButton6.setEnabled(false);
    this.jButton6.setMargin(new Insets(0, 0, 0, 0));
    this.jButton6.setMaximumSize(new Dimension(50, 25));
    this.jButton6.setMinimumSize(new Dimension(50, 25));
    this.jButton6.setName("jButton6");
    this.jButton6.setPreferredSize(new Dimension(50, 25));
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 1;
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.weighty = 1.0D;
    this.ColorPanel.add(this.jButton6, localGridBagConstraints);
    this.jButton7.setFont(this.u.DEFAULT_FONT_SIZE_10);
    this.jButton7.setText("Fore");
    this.jButton7.setAlignmentY(0.0F);
    this.jButton7.setMargin(new Insets(0, 0, 0, 0));
    this.jButton7.setMaximumSize(new Dimension(50, 25));
    this.jButton7.setMinimumSize(new Dimension(50, 25));
    this.jButton7.setName("jButton7");
    this.jButton7.setPreferredSize(new Dimension(50, 25));
    this.jButton7.addActionListener(new ActionListener()
    {
      @Override
      public void actionPerformed(ActionEvent paramAnonymousActionEvent)
      {
        PreferenceDialogBox.this.jButton7ActionPerformed(paramAnonymousActionEvent);
      }
    });
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 1;
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.weighty = 1.0D;
    this.ColorPanel.add(this.jButton7, localGridBagConstraints);
    this.jButton8.setFont(this.u.DEFAULT_FONT_SIZE_10);
    this.jButton8.setText("Fore");
    this.jButton8.setAlignmentY(0.0F);
    this.jButton8.setMargin(new Insets(0, 0, 0, 0));
    this.jButton8.setMaximumSize(new Dimension(50, 25));
    this.jButton8.setMinimumSize(new Dimension(50, 25));
    this.jButton8.setName("jButton8");
    this.jButton8.setPreferredSize(new Dimension(50, 25));
    this.jButton8.addActionListener(new ActionListener()
    {
      @Override
      public void actionPerformed(ActionEvent paramAnonymousActionEvent)
      {
        PreferenceDialogBox.this.jButton8ActionPerformed(paramAnonymousActionEvent);
      }
    });
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 1;
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.weighty = 1.0D;
    this.ColorPanel.add(this.jButton8, localGridBagConstraints);
    this.jButton9.setFont(this.u.DEFAULT_FONT_SIZE_10);
    this.jButton9.setText("Back");
    this.jButton9.setAlignmentY(0.0F);
    this.jButton9.setMargin(new Insets(0, 0, 0, 0));
    this.jButton9.setMaximumSize(new Dimension(50, 25));
    this.jButton9.setMinimumSize(new Dimension(50, 25));
    this.jButton9.setName("jButton9");
    this.jButton9.setPreferredSize(new Dimension(50, 25));
    this.jButton9.addActionListener(new ActionListener()
    {
      @Override
      public void actionPerformed(ActionEvent paramAnonymousActionEvent)
      {
        PreferenceDialogBox.this.jButton9ActionPerformed(paramAnonymousActionEvent);
      }
    });
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 2;
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.weighty = 1.0D;
    this.ColorPanel.add(this.jButton9, localGridBagConstraints);
    this.jButton10.setFont(this.u.DEFAULT_FONT_SIZE_10);
    this.jButton10.setText("Back");
    this.jButton10.setAlignmentY(0.0F);
    this.jButton10.setMargin(new Insets(0, 0, 0, 0));
    this.jButton10.setMaximumSize(new Dimension(50, 25));
    this.jButton10.setMinimumSize(new Dimension(50, 25));
    this.jButton10.setName("jButton10");
    this.jButton10.setPreferredSize(new Dimension(50, 25));
    this.jButton10.addActionListener(new ActionListener()
    {
      @Override
      public void actionPerformed(ActionEvent paramAnonymousActionEvent)
      {
        PreferenceDialogBox.this.jButton10ActionPerformed(paramAnonymousActionEvent);
      }
    });
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 2;
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.weighty = 1.0D;
    this.ColorPanel.add(this.jButton10, localGridBagConstraints);
    this.jButton11.setFont(this.u.DEFAULT_FONT_SIZE_10);
    this.jButton11.setText("Back");
    this.jButton11.setAlignmentY(0.0F);
    this.jButton11.setMargin(new Insets(0, 0, 0, 0));
    this.jButton11.setMaximumSize(new Dimension(50, 25));
    this.jButton11.setMinimumSize(new Dimension(50, 25));
    this.jButton11.setName("jButton11");
    this.jButton11.setPreferredSize(new Dimension(50, 25));
    this.jButton11.addActionListener(new ActionListener()
    {
      @Override
      public void actionPerformed(ActionEvent paramAnonymousActionEvent)
      {
        PreferenceDialogBox.this.jButton11ActionPerformed(paramAnonymousActionEvent);
      }
    });
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 2;
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.weighty = 1.0D;
    this.ColorPanel.add(this.jButton11, localGridBagConstraints);
    this.jButton12.setFont(this.u.DEFAULT_FONT_SIZE_10);
    this.jButton12.setText("Back");
    this.jButton12.setAlignmentY(0.0F);
    this.jButton12.setMargin(new Insets(0, 0, 0, 0));
    this.jButton12.setMaximumSize(new Dimension(50, 25));
    this.jButton12.setMinimumSize(new Dimension(50, 25));
    this.jButton12.setName("jButton12");
    this.jButton12.setPreferredSize(new Dimension(50, 25));
    this.jButton12.addActionListener(new ActionListener()
    {
      @Override
      public void actionPerformed(ActionEvent paramAnonymousActionEvent)
      {
        PreferenceDialogBox.this.jButton12ActionPerformed(paramAnonymousActionEvent);
      }
    });
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 2;
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.weighty = 1.0D;
    this.ColorPanel.add(this.jButton12, localGridBagConstraints);
    this.jButton13.setFont(this.u.DEFAULT_FONT_SIZE_10);
    this.jButton13.setText("Back");
    this.jButton13.setAlignmentY(0.0F);
    this.jButton13.setMargin(new Insets(0, 0, 0, 0));
    this.jButton13.setMaximumSize(new Dimension(50, 25));
    this.jButton13.setMinimumSize(new Dimension(50, 25));
    this.jButton13.setName("jButton13");
    this.jButton13.setPreferredSize(new Dimension(50, 25));
    this.jButton13.addActionListener(new ActionListener()
    {
      @Override
      public void actionPerformed(ActionEvent paramAnonymousActionEvent)
      {
        PreferenceDialogBox.this.jButton13ActionPerformed(paramAnonymousActionEvent);
      }
    });
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 2;
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.weighty = 1.0D;
    this.ColorPanel.add(this.jButton13, localGridBagConstraints);
    this.jButton14.setFont(this.u.DEFAULT_FONT_SIZE_10);
    this.jButton14.setText("Back");
    this.jButton14.setAlignmentY(0.0F);
    this.jButton14.setMargin(new Insets(0, 0, 0, 0));
    this.jButton14.setMaximumSize(new Dimension(50, 25));
    this.jButton14.setMinimumSize(new Dimension(50, 25));
    this.jButton14.setName("jButton14");
    this.jButton14.setPreferredSize(new Dimension(50, 25));
    this.jButton14.addActionListener(new ActionListener()
    {
      @Override
      public void actionPerformed(ActionEvent paramAnonymousActionEvent)
      {
        PreferenceDialogBox.this.jButton14ActionPerformed(paramAnonymousActionEvent);
      }
    });
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 2;
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.weighty = 1.0D;
    this.ColorPanel.add(this.jButton14, localGridBagConstraints);
    this.jButton15.setFont(this.u.DEFAULT_FONT_SIZE_10);
    this.jButton15.setText("Back");
    this.jButton15.setAlignmentY(0.0F);
    this.jButton15.setEnabled(false);
    this.jButton15.setMargin(new Insets(0, 0, 0, 0));
    this.jButton15.setMaximumSize(new Dimension(50, 25));
    this.jButton15.setMinimumSize(new Dimension(50, 25));
    this.jButton15.setName("jButton15");
    this.jButton15.setPreferredSize(new Dimension(50, 25));
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 2;
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.weighty = 1.0D;
    this.ColorPanel.add(this.jButton15, localGridBagConstraints);
    this.jButton16.setFont(this.u.DEFAULT_FONT_SIZE_10);
    this.jButton16.setText("Back");
    this.jButton16.setAlignmentY(0.0F);
    this.jButton16.setEnabled(false);
    this.jButton16.setMargin(new Insets(0, 0, 0, 0));
    this.jButton16.setMaximumSize(new Dimension(50, 25));
    this.jButton16.setMinimumSize(new Dimension(50, 25));
    this.jButton16.setName("jButton16");
    this.jButton16.setPreferredSize(new Dimension(50, 25));
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 2;
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.weighty = 1.0D;
    this.ColorPanel.add(this.jButton16, localGridBagConstraints);
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.gridy = 0;
    localGridBagConstraints.gridheight = 2;
    localGridBagConstraints.fill = 1;
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.weighty = 1.0D;
    getContentPane().add(this.ColorPanel, localGridBagConstraints);
    this.FontPanel.setBorder(BorderFactory.createEtchedBorder());
    this.FontPanel.setAlignmentX(0.0F);
    this.FontPanel.setAlignmentY(0.0F);
    this.FontPanel.setName("FontPanel");
    this.FontPanel.setLayout(new GridBagLayout());
    this.jLabel7.setFont(this.u.DEFAULT_FONT_SIZE_10);
    this.jLabel7.setHorizontalAlignment(0);
    this.jLabel7.setText("Program Font");
    this.jLabel7.setAlignmentY(0.0F);
    this.jLabel7.setMaximumSize(new Dimension(150, 25));
    this.jLabel7.setMinimumSize(new Dimension(150, 25));
    this.jLabel7.setName("jLabel7");
    this.jLabel7.setPreferredSize(new Dimension(150, 25));
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.weighty = 1.0D;
    this.FontPanel.add(this.jLabel7, localGridBagConstraints);
    this.jComboBox1.setFont(this.u.DEFAULT_FONT_SIZE_10);
    this.jComboBox1.setAlignmentX(0.0F);
    this.jComboBox1.setAlignmentY(0.0F);
    this.jComboBox1.setMaximumSize(new Dimension(150, 25));
    this.jComboBox1.setMinimumSize(new Dimension(150, 25));
    this.jComboBox1.setName("jComboBox1");
    this.jComboBox1.setPreferredSize(new Dimension(150, 25));
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.weighty = 1.0D;
    this.FontPanel.add(this.jComboBox1, localGridBagConstraints);
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 1;
    localGridBagConstraints.gridy = 0;
    localGridBagConstraints.fill = 1;
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.weighty = 1.0D;
    getContentPane().add(this.FontPanel, localGridBagConstraints);
    this.ArmorDistributionPanel.setBorder(BorderFactory.createEtchedBorder());
    this.ArmorDistributionPanel.setAlignmentX(0.0F);
    this.ArmorDistributionPanel.setAlignmentY(0.0F);
    this.ArmorDistributionPanel.setName("ArmorDistributionPanel");
    this.ArmorDistributionPanel.setLayout(new GridBagLayout());
    this.jLabel8.setFont(this.u.DEFAULT_FONT_SIZE_10);
    this.jLabel8.setHorizontalAlignment(0);
    this.jLabel8.setText("Armor Distribution");
    this.jLabel8.setAlignmentY(0.0F);
    this.jLabel8.setMaximumSize(new Dimension(200, 25));
    this.jLabel8.setMinimumSize(new Dimension(200, 25));
    this.jLabel8.setName("jLabel8");
    this.jLabel8.setOpaque(true);
    this.jLabel8.setPreferredSize(new Dimension(200, 25));
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.gridy = 0;
    localGridBagConstraints.gridwidth = 2;
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.weighty = 1.0D;
    this.ArmorDistributionPanel.add(this.jLabel8, localGridBagConstraints);
    this.jLabel9.setFont(this.u.DEFAULT_FONT_SIZE_10);
    this.jLabel9.setHorizontalAlignment(0);
    this.jLabel9.setText("Percentage of CT to CTR");
    this.jLabel9.setAlignmentY(0.0F);
    this.jLabel9.setMaximumSize(new Dimension(150, 25));
    this.jLabel9.setMinimumSize(new Dimension(150, 25));
    this.jLabel9.setName("jLabel9");
    this.jLabel9.setOpaque(true);
    this.jLabel9.setPreferredSize(new Dimension(150, 25));
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.gridy = 1;
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.weighty = 1.0D;
    this.ArmorDistributionPanel.add(this.jLabel9, localGridBagConstraints);
    this.jLabel10.setFont(this.u.DEFAULT_FONT_SIZE_10);
    this.jLabel10.setHorizontalAlignment(0);
    this.jLabel10.setText("Percentage of ST to STR");
    this.jLabel10.setAlignmentY(0.0F);
    this.jLabel10.setEnabled(false);
    this.jLabel10.setMaximumSize(new Dimension(150, 25));
    this.jLabel10.setMinimumSize(new Dimension(150, 25));
    this.jLabel10.setName("jLabel10");
    this.jLabel10.setOpaque(true);
    this.jLabel10.setPreferredSize(new Dimension(150, 25));
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.gridy = 2;
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.weighty = 1.0D;
    this.ArmorDistributionPanel.add(this.jLabel10, localGridBagConstraints);
    this.jTextField1.setFont(this.u.DEFAULT_FONT_SIZE_10);
    this.jTextField1.setHorizontalAlignment(0);
    this.jTextField1.setText("" + this.u.REAR_ARMOR_PERCENTAGE);
    this.jTextField1.setMaximumSize(new Dimension(50, 25));
    this.jTextField1.setMinimumSize(new Dimension(50, 25));
    this.jTextField1.setName("jTextField1");
    this.jTextField1.setPreferredSize(new Dimension(50, 25));
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 1;
    localGridBagConstraints.gridy = 1;
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.weighty = 1.0D;
    this.ArmorDistributionPanel.add(this.jTextField1, localGridBagConstraints);
    this.jTextField3.setFont(this.u.DEFAULT_FONT_SIZE_10);
    this.jTextField3.setHorizontalAlignment(0);
    this.jTextField3.setText("25");
    this.jTextField3.setEnabled(false);
    this.jTextField3.setMaximumSize(new Dimension(50, 25));
    this.jTextField3.setMinimumSize(new Dimension(50, 25));
    this.jTextField3.setName("jTextField3");
    this.jTextField3.setPreferredSize(new Dimension(50, 25));
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 1;
    localGridBagConstraints.gridy = 2;
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.weighty = 1.0D;
    this.ArmorDistributionPanel.add(this.jTextField3, localGridBagConstraints);
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 1;
    localGridBagConstraints.gridy = 1;
    localGridBagConstraints.fill = 1;
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.weighty = 1.0D;
    getContentPane().add(this.ArmorDistributionPanel, localGridBagConstraints);
    this.ButtonPanel.setBorder(BorderFactory.createEtchedBorder());
    this.ButtonPanel.setAlignmentX(0.0F);
    this.ButtonPanel.setAlignmentY(0.0F);
    this.ButtonPanel.setName("ButtonPanel");
    this.ButtonPanel.setLayout(new GridBagLayout());
    this.jButton17.setFont(this.u.DEFAULT_FONT_SIZE_10);
    this.jButton17.setText("Save");
    this.jButton17.setAlignmentY(0.0F);
    this.jButton17.setMargin(new Insets(0, 0, 0, 0));
    this.jButton17.setMaximumSize(new Dimension(75, 25));
    this.jButton17.setMinimumSize(new Dimension(75, 25));
    this.jButton17.setName("");
    this.jButton17.setPreferredSize(new Dimension(75, 25));
    this.jButton17.addActionListener(new ActionListener()
    {
      @Override
      public void actionPerformed(ActionEvent paramAnonymousActionEvent)
      {
        PreferenceDialogBox.this.jButton17ActionPerformed(paramAnonymousActionEvent);
      }
    });
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.gridy = 0;
    this.ButtonPanel.add(this.jButton17, localGridBagConstraints);
    this.jButton18.setFont(this.u.DEFAULT_FONT_SIZE_10);
    this.jButton18.setText("Cancel");
    this.jButton18.setAlignmentY(0.0F);
    this.jButton18.setMargin(new Insets(0, 0, 0, 0));
    this.jButton18.setMaximumSize(new Dimension(75, 25));
    this.jButton18.setMinimumSize(new Dimension(75, 25));
    this.jButton18.setName("");
    this.jButton18.setPreferredSize(new Dimension(75, 25));
    this.jButton18.addActionListener(new ActionListener()
    {
      @Override
      public void actionPerformed(ActionEvent paramAnonymousActionEvent)
      {
        PreferenceDialogBox.this.jButton18ActionPerformed(paramAnonymousActionEvent);
      }
    });
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 1;
    localGridBagConstraints.gridy = 0;
    this.ButtonPanel.add(this.jButton18, localGridBagConstraints);
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.gridy = 2;
    localGridBagConstraints.gridwidth = 2;
    localGridBagConstraints.fill = 1;
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.weighty = 1.0D;
    getContentPane().add(this.ButtonPanel, localGridBagConstraints);
    pack();
  }
  
  private void jButton18ActionPerformed(ActionEvent paramActionEvent)
  {
    dispose();
  }
  
  private void jButton17ActionPerformed(ActionEvent paramActionEvent)
  {
    try
    {
        try (FileOutputStream localFileOutputStream = new FileOutputStream("UserPreferences.pref"); ObjectOutputStream localObjectOutputStream = new ObjectOutputStream(localFileOutputStream)) {
            localObjectOutputStream.writeObject(this.u.SELECTED_CRITICAL_PANEL_COLOR);
            localObjectOutputStream.writeObject(this.u.DEFAULT_CRITICAL_PANEL_COLOR);
            localObjectOutputStream.writeObject(this.u.BALLISTIC_COLOR);
            localObjectOutputStream.writeObject(this.u.ENERGY_COLOR);
            localObjectOutputStream.writeObject(this.u.MISSILE_COLOR);
            localObjectOutputStream.writeObject(this.u.AMS_COLOR);
            localObjectOutputStream.writeObject(this.u.ARMOR_COLOR);
            localObjectOutputStream.writeObject(this.u.STRUCTURE_COLOR);
            localObjectOutputStream.writeDouble(Integer.parseInt(this.jTextField1.getText()) / 100.0D);
        }
      System.out.println("Saved Correctly");
    }
    catch (InvalidClassException localInvalidClassException)
    {
      JOptionPane.showMessageDialog(this, "Invalid Class Error: " + localInvalidClassException.getMessage());
    }
    catch (NotSerializableException localNotSerializableException)
    {
      JOptionPane.showMessageDialog(this, "Serialization Error: " + localNotSerializableException.getMessage());
    }
    catch (SecurityException localSecurityException)
    {
      JOptionPane.showMessageDialog(this, "Permission Error: Program has insufficient priveleges to write to the file.");
    }
    catch (NullPointerException localNullPointerException)
    {
      JOptionPane.showMessageDialog(this, "Null Pointer Error: Variant Class was not instanced.");
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      JOptionPane.showMessageDialog(this, "File Not Found Error: " + localFileNotFoundException.getMessage());
    }
    catch (IOException localIOException)
    {
      JOptionPane.showMessageDialog(this, "IO Error: " + localIOException.getMessage());
    }
    catch (NumberFormatException localException)
    {
      JOptionPane.showMessageDialog(this, "Error: " + localException.getMessage());
    }
    dispose();
  }
  
  private void jButton9ActionPerformed(ActionEvent paramActionEvent)
  {
    ColorDialog localColorDialog = new ColorDialog(this, this.u.SELECTED_CRITICAL_PANEL_COLOR);
    localColorDialog.setVisible(true);
  }
  
  private void jButton10ActionPerformed(ActionEvent paramActionEvent)
  {
    ColorDialog localColorDialog = new ColorDialog(this, this.u.DEFAULT_CRITICAL_PANEL_COLOR);
    localColorDialog.setVisible(true);
  }
  
  private void jButton11ActionPerformed(ActionEvent paramActionEvent)
  {
    ColorDialog localColorDialog = new ColorDialog(this, this.u.AMS_COLOR);
    localColorDialog.setVisible(true);
  }
  
  private void jButton12ActionPerformed(ActionEvent paramActionEvent)
  {
    ColorDialog localColorDialog = new ColorDialog(this, this.u.BALLISTIC_COLOR);
    localColorDialog.setVisible(true);
  }
  
  private void jButton13ActionPerformed(ActionEvent paramActionEvent)
  {
    ColorDialog localColorDialog = new ColorDialog(this, this.u.ENERGY_COLOR);
    localColorDialog.setVisible(true);
  }
  
  private void jButton14ActionPerformed(ActionEvent paramActionEvent)
  {
    ColorDialog localColorDialog = new ColorDialog(this, this.u.MISSILE_COLOR);
    localColorDialog.setVisible(true);
  }
  
  private void jButton7ActionPerformed(ActionEvent paramActionEvent)
  {
    ColorDialog localColorDialog = new ColorDialog(this, this.u.ARMOR_COLOR);
    localColorDialog.setVisible(true);
  }
  
  private void jButton8ActionPerformed(ActionEvent paramActionEvent)
  {
    ColorDialog localColorDialog = new ColorDialog(this, this.u.STRUCTURE_COLOR);
    localColorDialog.setVisible(true);
  }
}


/* Location:              C:\Users\Trevin\Dropbox\Public\MWO Mechbay.zip!\MWO_Mechbay.jar!\GUI\PreferenceDialogBox.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */