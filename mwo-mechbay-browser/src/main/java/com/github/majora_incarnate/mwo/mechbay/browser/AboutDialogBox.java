package com.github.majora_incarnate.mwo.mechbay.browser;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AboutDialogBox extends JDialog {
    private static final long serialVersionUID = -6163429021390520229L;

    private JPanel contentPane;
    private JButton closeButton;
    private JLabel mwoVersionTitle;
    private JLabel mwoVersionLabel;
    private JLabel authorLabel;
    private JLabel authorTitle;
    private JLabel disclaimerLabel;
    private JLabel emailLabel;
    private JLabel emailTitle;
    private JLabel insigniaLabel;
    private JLabel mechbayVersionLabel;
    private JLabel mechbayVersionTitle;
    private JPanel aboutPanel;
    private JLabel titleLabel;

    public AboutDialogBox(final String mechbayVersion, final String mwoVersion) {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(closeButton);

        setTitle("About MWO Mechbay");
        mechbayVersionLabel.setText(mechbayVersion);
        mwoVersionLabel.setText(mwoVersion);

        closeButton.addActionListener(e -> onClose());
    }

    private void onClose() {
        dispose();
    }
}
