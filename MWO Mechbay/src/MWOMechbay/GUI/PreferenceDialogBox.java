package MWOMechbay.GUI;

import MWOMechbay.UserPreferences;
import java.awt.Dimension;
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
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

/**
 *
 * @author Quicksilver
 */
public class PreferenceDialogBox extends javax.swing.JDialog implements MainCommon {
    UserPreferences u;
    
    public PreferenceDialogBox(java.awt.Frame parentF, UserPreferences parentUP) {
        super(parentF, true);
        u = parentUP;
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        GridBagConstraints gridBagConstraints;

        ColorPanel = new JPanel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jProgressBar1 = new JProgressBar();
        jProgressBar2 = new JProgressBar();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jButton4 = new JButton();
        jButton5 = new JButton();
        jButton6 = new JButton();
        jButton7 = new JButton();
        jButton8 = new JButton();
        jButton9 = new JButton();
        jButton10 = new JButton();
        jButton11 = new JButton();
        jButton12 = new JButton();
        jButton13 = new JButton();
        jButton14 = new JButton();
        jButton15 = new JButton();
        jButton16 = new JButton();
        FontPanel = new JPanel();
        jLabel7 = new JLabel();
        jComboBox1 = new JComboBox();
        ArmorDistributionPanel = new JPanel();
        jLabel8 = new JLabel();
        jLabel9 = new JLabel();
        jLabel10 = new JLabel();
        jTextField1 = new JTextField();
        jTextField3 = new JTextField();
        ButtonPanel = new JPanel();
        jButton17 = new JButton();
        jButton18 = new JButton();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("User Preferences");
        setAlwaysOnTop(true);
        setLocationByPlatform(true);
        setMaximumSize(new Dimension(550, 300));
        setMinimumSize(new Dimension(550, 300));
        setModal(true);
        setName(""); // NOI18N
        setPreferredSize(new Dimension(550, 300));
        getContentPane().setLayout(new GridBagLayout());

        ColorPanel.setBorder(BorderFactory.createEtchedBorder());
        ColorPanel.setAlignmentX(0.0F);
        ColorPanel.setAlignmentY(0.0F);
        ColorPanel.setMaximumSize(new Dimension(250, 200));
        ColorPanel.setName("ColorPanel"); // NOI18N
        ColorPanel.setPreferredSize(new Dimension(250, 200));
        ColorPanel.setLayout(new GridBagLayout());

        jLabel1.setBackground(u.SELECTED_CRITICAL_PANEL_COLOR);
        jLabel1.setFont(u.labelFont);
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel1.setText("Selected Section");
        jLabel1.setAlignmentY(0.0F);
        jLabel1.setMaximumSize(new Dimension(150, 25));
        jLabel1.setMinimumSize(new Dimension(150, 25));
        jLabel1.setName("jLabel1"); // NOI18N
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new Dimension(150, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ColorPanel.add(jLabel1, gridBagConstraints);

        jLabel2.setBackground(u.DEFAULT_CRITICAL_PANEL_COLOR);
        jLabel2.setFont(u.labelFont);
        jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel2.setText("Unselected Section");
        jLabel2.setAlignmentY(0.0F);
        jLabel2.setMaximumSize(new Dimension(150, 25));
        jLabel2.setMinimumSize(new Dimension(150, 25));
        jLabel2.setName("jLabel2"); // NOI18N
        jLabel2.setOpaque(true);
        jLabel2.setPreferredSize(new Dimension(150, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ColorPanel.add(jLabel2, gridBagConstraints);

        jLabel3.setBackground(u.AMS_COLOR);
        jLabel3.setFont(u.labelFont);
        jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel3.setText("AMS Label Color");
        jLabel3.setAlignmentY(0.0F);
        jLabel3.setMaximumSize(new Dimension(150, 25));
        jLabel3.setMinimumSize(new Dimension(150, 25));
        jLabel3.setName("jLabel3"); // NOI18N
        jLabel3.setOpaque(true);
        jLabel3.setPreferredSize(new Dimension(150, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ColorPanel.add(jLabel3, gridBagConstraints);

        jLabel4.setBackground(u.BALLISTIC_COLOR);
        jLabel4.setFont(u.labelFont);
        jLabel4.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel4.setText("Ballistic Label Color");
        jLabel4.setAlignmentY(0.0F);
        jLabel4.setMaximumSize(new Dimension(150, 25));
        jLabel4.setMinimumSize(new Dimension(150, 25));
        jLabel4.setName("jLabel4"); // NOI18N
        jLabel4.setOpaque(true);
        jLabel4.setPreferredSize(new Dimension(150, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ColorPanel.add(jLabel4, gridBagConstraints);

        jLabel5.setBackground(u.ENERGY_COLOR);
        jLabel5.setFont(u.labelFont);
        jLabel5.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel5.setText("Energy Label Color");
        jLabel5.setAlignmentY(0.0F);
        jLabel5.setMaximumSize(new Dimension(150, 25));
        jLabel5.setMinimumSize(new Dimension(150, 25));
        jLabel5.setName("jLabel5"); // NOI18N
        jLabel5.setOpaque(true);
        jLabel5.setPreferredSize(new Dimension(150, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ColorPanel.add(jLabel5, gridBagConstraints);

        jLabel6.setBackground(u.MISSILE_COLOR);
        jLabel6.setFont(u.labelFont);
        jLabel6.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel6.setText("Missile Label Color");
        jLabel6.setAlignmentY(0.0F);
        jLabel6.setMaximumSize(new Dimension(150, 25));
        jLabel6.setMinimumSize(new Dimension(150, 25));
        jLabel6.setName("jLabel6"); // NOI18N
        jLabel6.setOpaque(true);
        jLabel6.setPreferredSize(new Dimension(150, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ColorPanel.add(jLabel6, gridBagConstraints);

        jProgressBar1.setFont(u.labelFont);
        jProgressBar1.setForeground(u.ARMOR_COLOR);
        jProgressBar1.setToolTipText("");
        jProgressBar1.setValue(100);
        jProgressBar1.setAlignmentX(0.0F);
        jProgressBar1.setAlignmentY(0.0F);
        jProgressBar1.setMaximumSize(new Dimension(150, 25));
        jProgressBar1.setMinimumSize(new Dimension(150, 25));
        jProgressBar1.setName("jProgressBar1"); // NOI18N
        jProgressBar1.setPreferredSize(new Dimension(150, 25));
        jProgressBar1.setString("Armor Bar Color");
        jProgressBar1.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        ColorPanel.add(jProgressBar1, gridBagConstraints);

        jProgressBar2.setFont(u.labelFont);
        jProgressBar2.setForeground(u.INTERNAL_COLOR);
        jProgressBar2.setToolTipText("");
        jProgressBar2.setValue(100);
        jProgressBar2.setAlignmentX(0.0F);
        jProgressBar2.setAlignmentY(0.0F);
        jProgressBar2.setMaximumSize(new Dimension(150, 25));
        jProgressBar2.setMinimumSize(new Dimension(150, 25));
        jProgressBar2.setName("jProgressBar2"); // NOI18N
        jProgressBar2.setPreferredSize(new Dimension(150, 25));
        jProgressBar2.setString("Internal Bar Color");
        jProgressBar2.setStringPainted(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        ColorPanel.add(jProgressBar2, gridBagConstraints);

        jButton1.setFont(u.labelFont);
        jButton1.setText("Fore");
        jButton1.setAlignmentY(0.0F);
        jButton1.setEnabled(false);
        jButton1.setMargin(new Insets(0, 0, 0, 0));
        jButton1.setMaximumSize(new Dimension(50, 25));
        jButton1.setMinimumSize(new Dimension(50, 25));
        jButton1.setName("jButton1"); // NOI18N
        jButton1.setPreferredSize(new Dimension(50, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ColorPanel.add(jButton1, gridBagConstraints);

        jButton2.setFont(u.labelFont);
        jButton2.setText("Fore");
        jButton2.setAlignmentY(0.0F);
        jButton2.setEnabled(false);
        jButton2.setMargin(new Insets(0, 0, 0, 0));
        jButton2.setMaximumSize(new Dimension(50, 25));
        jButton2.setMinimumSize(new Dimension(50, 25));
        jButton2.setName("jButton2"); // NOI18N
        jButton2.setPreferredSize(new Dimension(50, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ColorPanel.add(jButton2, gridBagConstraints);

        jButton3.setFont(u.labelFont);
        jButton3.setText("Fore");
        jButton3.setAlignmentY(0.0F);
        jButton3.setEnabled(false);
        jButton3.setMargin(new Insets(0, 0, 0, 0));
        jButton3.setMaximumSize(new Dimension(50, 25));
        jButton3.setMinimumSize(new Dimension(50, 25));
        jButton3.setName("jButton3"); // NOI18N
        jButton3.setPreferredSize(new Dimension(50, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ColorPanel.add(jButton3, gridBagConstraints);

        jButton4.setFont(u.labelFont);
        jButton4.setText("Fore");
        jButton4.setAlignmentY(0.0F);
        jButton4.setEnabled(false);
        jButton4.setMargin(new Insets(0, 0, 0, 0));
        jButton4.setMaximumSize(new Dimension(50, 25));
        jButton4.setMinimumSize(new Dimension(50, 25));
        jButton4.setName("jButton4"); // NOI18N
        jButton4.setPreferredSize(new Dimension(50, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ColorPanel.add(jButton4, gridBagConstraints);

        jButton5.setFont(u.labelFont);
        jButton5.setText("Fore");
        jButton5.setAlignmentY(0.0F);
        jButton5.setEnabled(false);
        jButton5.setMargin(new Insets(0, 0, 0, 0));
        jButton5.setMaximumSize(new Dimension(50, 25));
        jButton5.setMinimumSize(new Dimension(50, 25));
        jButton5.setName("jButton5"); // NOI18N
        jButton5.setPreferredSize(new Dimension(50, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ColorPanel.add(jButton5, gridBagConstraints);

        jButton6.setFont(u.labelFont);
        jButton6.setText("Fore");
        jButton6.setAlignmentY(0.0F);
        jButton6.setEnabled(false);
        jButton6.setMargin(new Insets(0, 0, 0, 0));
        jButton6.setMaximumSize(new Dimension(50, 25));
        jButton6.setMinimumSize(new Dimension(50, 25));
        jButton6.setName("jButton6"); // NOI18N
        jButton6.setPreferredSize(new Dimension(50, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ColorPanel.add(jButton6, gridBagConstraints);

        jButton7.setFont(u.labelFont);
        jButton7.setText("Fore");
        jButton7.setAlignmentY(0.0F);
        jButton7.setMargin(new Insets(0, 0, 0, 0));
        jButton7.setMaximumSize(new Dimension(50, 25));
        jButton7.setMinimumSize(new Dimension(50, 25));
        jButton7.setName("jButton7"); // NOI18N
        jButton7.setPreferredSize(new Dimension(50, 25));
        jButton7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ColorPanel.add(jButton7, gridBagConstraints);

        jButton8.setFont(u.labelFont);
        jButton8.setText("Fore");
        jButton8.setAlignmentY(0.0F);
        jButton8.setMargin(new Insets(0, 0, 0, 0));
        jButton8.setMaximumSize(new Dimension(50, 25));
        jButton8.setMinimumSize(new Dimension(50, 25));
        jButton8.setName("jButton8"); // NOI18N
        jButton8.setPreferredSize(new Dimension(50, 25));
        jButton8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ColorPanel.add(jButton8, gridBagConstraints);

        jButton9.setFont(u.labelFont);
        jButton9.setText("Back");
        jButton9.setAlignmentY(0.0F);
        jButton9.setMargin(new Insets(0, 0, 0, 0));
        jButton9.setMaximumSize(new Dimension(50, 25));
        jButton9.setMinimumSize(new Dimension(50, 25));
        jButton9.setName("jButton9"); // NOI18N
        jButton9.setPreferredSize(new Dimension(50, 25));
        jButton9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ColorPanel.add(jButton9, gridBagConstraints);

        jButton10.setFont(u.labelFont);
        jButton10.setText("Back");
        jButton10.setAlignmentY(0.0F);
        jButton10.setMargin(new Insets(0, 0, 0, 0));
        jButton10.setMaximumSize(new Dimension(50, 25));
        jButton10.setMinimumSize(new Dimension(50, 25));
        jButton10.setName("jButton10"); // NOI18N
        jButton10.setPreferredSize(new Dimension(50, 25));
        jButton10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ColorPanel.add(jButton10, gridBagConstraints);

        jButton11.setFont(u.labelFont);
        jButton11.setText("Back");
        jButton11.setAlignmentY(0.0F);
        jButton11.setMargin(new Insets(0, 0, 0, 0));
        jButton11.setMaximumSize(new Dimension(50, 25));
        jButton11.setMinimumSize(new Dimension(50, 25));
        jButton11.setName("jButton11"); // NOI18N
        jButton11.setPreferredSize(new Dimension(50, 25));
        jButton11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ColorPanel.add(jButton11, gridBagConstraints);

        jButton12.setFont(u.labelFont);
        jButton12.setText("Back");
        jButton12.setAlignmentY(0.0F);
        jButton12.setMargin(new Insets(0, 0, 0, 0));
        jButton12.setMaximumSize(new Dimension(50, 25));
        jButton12.setMinimumSize(new Dimension(50, 25));
        jButton12.setName("jButton12"); // NOI18N
        jButton12.setPreferredSize(new Dimension(50, 25));
        jButton12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ColorPanel.add(jButton12, gridBagConstraints);

        jButton13.setFont(u.labelFont);
        jButton13.setText("Back");
        jButton13.setAlignmentY(0.0F);
        jButton13.setMargin(new Insets(0, 0, 0, 0));
        jButton13.setMaximumSize(new Dimension(50, 25));
        jButton13.setMinimumSize(new Dimension(50, 25));
        jButton13.setName("jButton13"); // NOI18N
        jButton13.setPreferredSize(new Dimension(50, 25));
        jButton13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ColorPanel.add(jButton13, gridBagConstraints);

        jButton14.setFont(u.labelFont);
        jButton14.setText("Back");
        jButton14.setAlignmentY(0.0F);
        jButton14.setMargin(new Insets(0, 0, 0, 0));
        jButton14.setMaximumSize(new Dimension(50, 25));
        jButton14.setMinimumSize(new Dimension(50, 25));
        jButton14.setName("jButton14"); // NOI18N
        jButton14.setPreferredSize(new Dimension(50, 25));
        jButton14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ColorPanel.add(jButton14, gridBagConstraints);

        jButton15.setFont(u.labelFont);
        jButton15.setText("Back");
        jButton15.setAlignmentY(0.0F);
        jButton15.setEnabled(false);
        jButton15.setMargin(new Insets(0, 0, 0, 0));
        jButton15.setMaximumSize(new Dimension(50, 25));
        jButton15.setMinimumSize(new Dimension(50, 25));
        jButton15.setName("jButton15"); // NOI18N
        jButton15.setPreferredSize(new Dimension(50, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ColorPanel.add(jButton15, gridBagConstraints);

        jButton16.setFont(u.labelFont);
        jButton16.setText("Back");
        jButton16.setAlignmentY(0.0F);
        jButton16.setEnabled(false);
        jButton16.setMargin(new Insets(0, 0, 0, 0));
        jButton16.setMaximumSize(new Dimension(50, 25));
        jButton16.setMinimumSize(new Dimension(50, 25));
        jButton16.setName("jButton16"); // NOI18N
        jButton16.setPreferredSize(new Dimension(50, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ColorPanel.add(jButton16, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(ColorPanel, gridBagConstraints);

        FontPanel.setBorder(BorderFactory.createEtchedBorder());
        FontPanel.setAlignmentX(0.0F);
        FontPanel.setAlignmentY(0.0F);
        FontPanel.setName("FontPanel"); // NOI18N
        FontPanel.setLayout(new GridBagLayout());

        jLabel7.setFont(u.labelFont);
        jLabel7.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel7.setText("Program Font");
        jLabel7.setAlignmentY(0.0F);
        jLabel7.setMaximumSize(new Dimension(150, 25));
        jLabel7.setMinimumSize(new Dimension(150, 25));
        jLabel7.setName("jLabel7"); // NOI18N
        jLabel7.setPreferredSize(new Dimension(150, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        FontPanel.add(jLabel7, gridBagConstraints);

        jComboBox1.setFont(u.labelFont);
        jComboBox1.setAlignmentX(0.0F);
        jComboBox1.setAlignmentY(0.0F);
        jComboBox1.setMaximumSize(new Dimension(150, 25));
        jComboBox1.setMinimumSize(new Dimension(150, 25));
        jComboBox1.setName("jComboBox1"); // NOI18N
        jComboBox1.setPreferredSize(new Dimension(150, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        FontPanel.add(jComboBox1, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(FontPanel, gridBagConstraints);

        ArmorDistributionPanel.setBorder(BorderFactory.createEtchedBorder());
        ArmorDistributionPanel.setAlignmentX(0.0F);
        ArmorDistributionPanel.setAlignmentY(0.0F);
        ArmorDistributionPanel.setName("ArmorDistributionPanel"); // NOI18N
        ArmorDistributionPanel.setLayout(new GridBagLayout());

        jLabel8.setFont(u.labelFont);
        jLabel8.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel8.setText("Armor Distribution");
        jLabel8.setAlignmentY(0.0F);
        jLabel8.setMaximumSize(new Dimension(200, 25));
        jLabel8.setMinimumSize(new Dimension(200, 25));
        jLabel8.setName("jLabel8"); // NOI18N
        jLabel8.setOpaque(true);
        jLabel8.setPreferredSize(new Dimension(200, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ArmorDistributionPanel.add(jLabel8, gridBagConstraints);

        jLabel9.setFont(u.labelFont);
        jLabel9.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel9.setText("Percentage of CT to CTR");
        jLabel9.setAlignmentY(0.0F);
        jLabel9.setMaximumSize(new Dimension(150, 25));
        jLabel9.setMinimumSize(new Dimension(150, 25));
        jLabel9.setName("jLabel9"); // NOI18N
        jLabel9.setOpaque(true);
        jLabel9.setPreferredSize(new Dimension(150, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ArmorDistributionPanel.add(jLabel9, gridBagConstraints);

        jLabel10.setFont(u.labelFont);
        jLabel10.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel10.setText("Percentage of ST to STR");
        jLabel10.setAlignmentY(0.0F);
        jLabel10.setEnabled(false);
        jLabel10.setMaximumSize(new Dimension(150, 25));
        jLabel10.setMinimumSize(new Dimension(150, 25));
        jLabel10.setName("jLabel10"); // NOI18N
        jLabel10.setOpaque(true);
        jLabel10.setPreferredSize(new Dimension(150, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ArmorDistributionPanel.add(jLabel10, gridBagConstraints);

        jTextField1.setFont(u.labelFont);
        jTextField1.setHorizontalAlignment(JTextField.CENTER);
        jTextField1.setText("" + u.REAR_ARMOR_PERCENTAGE);
        jTextField1.setMargin(new Insets(0, 0, 0, 0));
        jTextField1.setMaximumSize(new Dimension(50, 25));
        jTextField1.setMinimumSize(new Dimension(50, 25));
        jTextField1.setName("jTextField1"); // NOI18N
        jTextField1.setPreferredSize(new Dimension(50, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ArmorDistributionPanel.add(jTextField1, gridBagConstraints);

        jTextField3.setFont(u.labelFont);
        jTextField3.setHorizontalAlignment(JTextField.CENTER);
        jTextField3.setText("25");
        jTextField3.setEnabled(false);
        jTextField3.setMargin(new Insets(0, 0, 0, 0));
        jTextField3.setMaximumSize(new Dimension(50, 25));
        jTextField3.setMinimumSize(new Dimension(50, 25));
        jTextField3.setName("jTextField3"); // NOI18N
        jTextField3.setPreferredSize(new Dimension(50, 25));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ArmorDistributionPanel.add(jTextField3, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(ArmorDistributionPanel, gridBagConstraints);

        ButtonPanel.setBorder(BorderFactory.createEtchedBorder());
        ButtonPanel.setAlignmentX(0.0F);
        ButtonPanel.setAlignmentY(0.0F);
        ButtonPanel.setName("ButtonPanel"); // NOI18N
        ButtonPanel.setLayout(new GridBagLayout());

        jButton17.setFont(u.labelFont);
        jButton17.setText("Save");
        jButton17.setAlignmentY(0.0F);
        jButton17.setMargin(new Insets(0, 0, 0, 0));
        jButton17.setMaximumSize(new Dimension(75, 25));
        jButton17.setMinimumSize(new Dimension(75, 25));
        jButton17.setName(""); // NOI18N
        jButton17.setPreferredSize(new Dimension(75, 25));
        jButton17.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        ButtonPanel.add(jButton17, gridBagConstraints);

        jButton18.setFont(u.labelFont);
        jButton18.setText("Cancel");
        jButton18.setAlignmentY(0.0F);
        jButton18.setMargin(new Insets(0, 0, 0, 0));
        jButton18.setMaximumSize(new Dimension(75, 25));
        jButton18.setMinimumSize(new Dimension(75, 25));
        jButton18.setName(""); // NOI18N
        jButton18.setPreferredSize(new Dimension(75, 25));
        jButton18.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        ButtonPanel.add(jButton18, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(ButtonPanel, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jButton18ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton18ActionPerformed
    private void jButton17ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        try {
            FileOutputStream outFile = new FileOutputStream("UserPreferences.pref");
            ObjectOutputStream out = new ObjectOutputStream(outFile);

            out.writeObject(u.SELECTED_CRITICAL_PANEL_COLOR);
            out.writeObject(u.DEFAULT_CRITICAL_PANEL_COLOR);
            out.writeObject(u.BLANK_COLOR);
            out.writeObject(u.BALLISTIC_COLOR);
            out.writeObject(u.ENERGY_COLOR);
            out.writeObject(u.MISSILE_COLOR);
            out.writeObject(u.AMS_COLOR);
            out.writeObject(u.ARMOR_COLOR);
            out.writeObject(u.INTERNAL_COLOR);
            out.writeDouble(Integer.parseInt(jTextField1.getText()) / 100.0);
            out.close();
            outFile.close();
            
            System.out.println("Saved Correctly");
        }
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
        dispose();
    }//GEN-LAST:event_jButton17ActionPerformed
    private void jButton9ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        ColorDialog dlgBox = new ColorDialog(this, u.SELECTED_CRITICAL_PANEL_COLOR);
        dlgBox.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed
    private void jButton10ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        ColorDialog dlgBox = new ColorDialog(this, u.DEFAULT_CRITICAL_PANEL_COLOR);
        dlgBox.setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed
    private void jButton11ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        ColorDialog dlgBox = new ColorDialog(this, u.AMS_COLOR);
        dlgBox.setVisible(true);
    }//GEN-LAST:event_jButton11ActionPerformed
    private void jButton12ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        ColorDialog dlgBox = new ColorDialog(this, u.BALLISTIC_COLOR);
        dlgBox.setVisible(true);
    }//GEN-LAST:event_jButton12ActionPerformed
    private void jButton13ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        ColorDialog dlgBox = new ColorDialog(this, u.ENERGY_COLOR);
        dlgBox.setVisible(true);
    }//GEN-LAST:event_jButton13ActionPerformed
    private void jButton14ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        ColorDialog dlgBox = new ColorDialog(this, u.MISSILE_COLOR);
        dlgBox.setVisible(true);
    }//GEN-LAST:event_jButton14ActionPerformed
    private void jButton7ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        ColorDialog dlgBox = new ColorDialog(this, u.ARMOR_COLOR);
        dlgBox.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed
    private void jButton8ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        ColorDialog dlgBox = new ColorDialog(this, u.INTERNAL_COLOR);
        dlgBox.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    // End of variables declaration//GEN-END:variables
}
