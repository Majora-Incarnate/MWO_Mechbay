package com.github.majora_incarnate.mwo.mechbay.browser;

import javax.swing.*;

public class AboutDialogBox extends JDialog {
    private static final long serialVersionUID = -6163429021390520229L;

    private JButton closeButton;
    private JLabel mwoVersionLabel;
    private JLabel authorLabel;
    private JLabel disclaimerLabel;
    private JLabel emailLabel;
    private JLabel insigniaLabel;
    private JLabel mechbayVersionLabel;
    private JPanel aboutPanel;
    private JLabel titleLabel;

    public AboutDialogBox(final String mechbayVersion, final String mwoVersion) {
        setModal(true);
        setTitle("About MWO Mechbay");

        mechbayVersionLabel.setText(mechbayVersion);
        mwoVersionLabel.setText(mwoVersion);

        closeButton.addActionListener(e -> onClose());
    }

    private void onClose() {
        dispose();
    }
}
