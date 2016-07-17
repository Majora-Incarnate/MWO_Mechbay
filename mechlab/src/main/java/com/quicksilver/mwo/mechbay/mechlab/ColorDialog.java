package com.quicksilver.mwo.mechbay.mechlab;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JDialog;

public class ColorDialog
        extends JDialog {
    private Color editedColor;
    private JButton cancelButton;
    private JColorChooser jColorChooser1;
    private JButton okButton;

    public ColorDialog(JDialog paramJDialog, Color paramColor) {
        super(paramJDialog, true);
        this.editedColor = paramColor;
        initComponents();
    }

    private void initComponents() {
        this.okButton = new JButton();
        this.cancelButton = new JButton();
        this.jColorChooser1 = new JColorChooser(this.editedColor);
        getContentPane().setLayout(new GridBagLayout());
        this.okButton.setText("OK");
        this.okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent paramAnonymousActionEvent) {
                ColorDialog.this.okButtonActionPerformed(paramAnonymousActionEvent);
            }
        });
        GridBagConstraints localGridBagConstraints = new GridBagConstraints();
        localGridBagConstraints.gridx = 0;
        localGridBagConstraints.gridy = 1;
        localGridBagConstraints.weightx = 1.0D;
        getContentPane().add(this.okButton, localGridBagConstraints);
        getRootPane().setDefaultButton(this.okButton);
        this.cancelButton.setText("Cancel");
        this.cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent paramAnonymousActionEvent) {
                ColorDialog.this.cancelButtonActionPerformed(paramAnonymousActionEvent);
            }
        });
        localGridBagConstraints = new GridBagConstraints();
        localGridBagConstraints.gridx = 1;
        localGridBagConstraints.gridy = 1;
        localGridBagConstraints.weightx = 1.0D;
        getContentPane().add(this.cancelButton, localGridBagConstraints);
        this.jColorChooser1.setName("jColorChooser1");
        localGridBagConstraints = new GridBagConstraints();
        localGridBagConstraints.gridx = 0;
        localGridBagConstraints.gridy = 0;
        localGridBagConstraints.gridwidth = 2;
        localGridBagConstraints.weightx = 1.0D;
        getContentPane().add(this.jColorChooser1, localGridBagConstraints);
        pack();
    }

    private void okButtonActionPerformed(ActionEvent paramActionEvent) {
        this.editedColor = this.jColorChooser1.getColor();
        dispose();
    }

    private void cancelButtonActionPerformed(ActionEvent paramActionEvent) {
        dispose();
    }
}
