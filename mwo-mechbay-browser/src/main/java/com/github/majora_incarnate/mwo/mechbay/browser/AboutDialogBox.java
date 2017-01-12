/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.majora_incarnate.mwo.mechbay.browser;

import com.github.majora_incarnate.mwo.mechbay.entities.Database;
import com.github.majora_incarnate.mwo.mechbay.entities.Preferences;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ResourceBundle;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.SwingConstants;

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

        setTitle("About MWO Mechbay");
        setName("Form"); // NOI18N
        getContentPane().setLayout(new GridBagLayout());

        imageLabel.setIcon(new ImageIcon(getClass().getResource("/Steel Jaguar.gif"))); // NOI18N
        imageLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        imageLabel.setName("imageLabel"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(imageLabel, gridBagConstraints);

        mechbayVersionLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        mechbayVersionLabel.setName("mechbayVersionLabel"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(mechbayVersionLabel, gridBagConstraints);

        mwoVersionLabel.setText(MASTER_DATABASE.MISCELLANEOUS.getOrDefault("mwoVersion", "Unknown"));
        mwoVersionLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        mwoVersionLabel.setName("mwoVersionLabel"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(mwoVersionLabel, gridBagConstraints);

        authorLabel.setText(MASTER_DATABASE.MISCELLANEOUS.getOrDefault("author", "Unknown"));
        authorLabel.setText("Quicksilver Kalasa");
        authorLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        authorLabel.setName("authorLabel"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(authorLabel, gridBagConstraints);

        emailLabel.setText(MASTER_DATABASE.MISCELLANEOUS.getOrDefault("email", "Unknown"));
        emailLabel.setText("tjteacutter1@cougars.ccis.edu");
        emailLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        emailLabel.setName("emailLabel"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(emailLabel, gridBagConstraints);

        disclaimerLabel.setText("This is not an official MWO tool.");
        disclaimerLabel.setHorizontalTextPosition(SwingConstants.CENTER);
        disclaimerLabel.setName("disclaimerLabel"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(disclaimerLabel, gridBagConstraints);

        closeButton.setText("Close");
        closeButton.setHorizontalTextPosition(SwingConstants.CENTER);
        closeButton.setName("closeButton"); // NOI18N
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
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
