/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.majora_incarnate.mwo.mechbay.browser;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Point;
import java.util.ResourceBundle;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.border.TitledBorder;

import com.github.majora_incarnate.mwo.mechbay.entities.Constants;
import com.github.majora_incarnate.mwo.mechbay.entities.Database;
import com.github.majora_incarnate.mwo.mechbay.entities.Preferences;

/**
 *
 * @author quicksilver
 */
public class AboutDialogBox extends JDialog {
    private final Preferences PREFERENCES;
    private final Database MASTER_DATABASE;

    /**
     * Creates new form AboutDialogBox2
     * @param parent
     * @param preferences
     * @param masterDatabase
     */
    public AboutDialogBox(final JFrame parent, final Preferences preferences, final Database masterDatabase) {
        super(parent, true);
        
        this.PREFERENCES = preferences;
        this.MASTER_DATABASE = masterDatabase;
        
        initComponents();
        
        closeButton.addActionListener(e -> dispose());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        GridBagConstraints gridBagConstraints;

        imageLabel = new JLabel();
        mechbayVersionLabel = new JLabel();
        mwoVersionLabel = new JLabel();
        authorLabel = new JLabel();
        emailLabel = new JLabel();
        disclaimerLabel = new JLabel();
        closeButton = new JButton();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("About MWO Mechbay");
        setLocation(new Point(0, 0));
        setMaximumSize(new Dimension(540, 320));
        setMinimumSize(new Dimension(540, 320));
        setName("Form"); // NOI18N
        setPreferredSize(new Dimension(540, 320));
        setSize(new Dimension(540, 320));
        getContentPane().setLayout(new GridBagLayout());

        imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        imageLabel.setIcon(new ImageIcon(getClass().getResource("/Steel Jaguar.gif"))); // NOI18N
        imageLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        imageLabel.setName("imageLabel"); // NOI18N
        imageLabel.setPreferredSize(new Dimension(250, 250));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(imageLabel, gridBagConstraints);

        mwoVersionLabel.setText(Constants.MECHBAY_VERSION);
        mechbayVersionLabel.setHorizontalAlignment(SwingConstants.CENTER);
        mechbayVersionLabel.setBorder(BorderFactory.createTitledBorder(null, "Mechbay Version", TitledBorder.LEADING, TitledBorder.TOP));
        mechbayVersionLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        mechbayVersionLabel.setMinimumSize(new Dimension(250, 50));
        mechbayVersionLabel.setName("mechbayVersionLabel"); // NOI18N
        mechbayVersionLabel.setPreferredSize(new Dimension(250, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        getContentPane().add(mechbayVersionLabel, gridBagConstraints);

        mwoVersionLabel.setText(MASTER_DATABASE.MISCELLANEOUS.getOrDefault("mwoVersion", "Unknown"));
        mwoVersionLabel.setHorizontalAlignment(SwingConstants.CENTER);
        mwoVersionLabel.setBorder(BorderFactory.createTitledBorder(null, "MWO Version", TitledBorder.LEADING, TitledBorder.TOP));
        mwoVersionLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        mwoVersionLabel.setMinimumSize(new Dimension(250, 50));
        mwoVersionLabel.setName("mwoVersionLabel"); // NOI18N
        mwoVersionLabel.setPreferredSize(new Dimension(250, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        getContentPane().add(mwoVersionLabel, gridBagConstraints);

        authorLabel.setText(MASTER_DATABASE.MISCELLANEOUS.getOrDefault("author", "Unknown"));
        authorLabel.setHorizontalAlignment(SwingConstants.CENTER);
        authorLabel.setText("Quicksilver Kalasa");
        authorLabel.setBorder(BorderFactory.createTitledBorder(null, "Author", TitledBorder.LEADING, TitledBorder.TOP));
        authorLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        authorLabel.setMinimumSize(new Dimension(250, 50));
        authorLabel.setName("authorLabel"); // NOI18N
        authorLabel.setPreferredSize(new Dimension(250, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        getContentPane().add(authorLabel, gridBagConstraints);

        emailLabel.setText(MASTER_DATABASE.MISCELLANEOUS.getOrDefault("email", "Unknown"));
        emailLabel.setHorizontalAlignment(SwingConstants.CENTER);
        emailLabel.setText("tjteacutter1@cougars.ccis.edu");
        emailLabel.setBorder(BorderFactory.createTitledBorder(null, "Email", TitledBorder.LEADING, TitledBorder.TOP));
        emailLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        emailLabel.setMinimumSize(new Dimension(250, 50));
        emailLabel.setName("emailLabel"); // NOI18N
        emailLabel.setPreferredSize(new Dimension(250, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        getContentPane().add(emailLabel, gridBagConstraints);

        disclaimerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        disclaimerLabel.setText("This is not an official MWO tool.");
        disclaimerLabel.setBorder(BorderFactory.createTitledBorder(null, "Disclaimer", TitledBorder.LEADING, TitledBorder.TOP));
        disclaimerLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        disclaimerLabel.setMaximumSize(new Dimension(375, 50));
        disclaimerLabel.setMinimumSize(new Dimension(375, 50));
        disclaimerLabel.setName("disclaimerLabel"); // NOI18N
        disclaimerLabel.setPreferredSize(new Dimension(375, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        getContentPane().add(disclaimerLabel, gridBagConstraints);

        closeButton.setText("Close");
        closeButton.setHorizontalTextPosition(SwingConstants.CENTER);
        closeButton.setMinimumSize(new Dimension(125, 50));
        closeButton.setName("closeButton"); // NOI18N
        closeButton.setPreferredSize(new Dimension(125, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        getContentPane().add(closeButton, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JLabel authorLabel;
    private JButton closeButton;
    private JLabel disclaimerLabel;
    private JLabel emailLabel;
    private JLabel imageLabel;
    private JLabel mechbayVersionLabel;
    private JLabel mwoVersionLabel;
    // End of variables declaration//GEN-END:variables
}
