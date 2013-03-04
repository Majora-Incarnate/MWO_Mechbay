package MWOMechbay.GUI;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Quicksilver
 */
public class HubForm extends javax.swing.JFrame implements MainCommon {

    public HubForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        GridBagConstraints gridBagConstraints;

        TitleLabel = new JLabel();
        VersionLabel = new JLabel();
        DropCalcButton = new JButton();
        MechlabButton = new JButton();
        DropCalcVersionLabel = new JLabel();
        MechlabVersionLabel = new JLabel();
        CompactMechlabVersionLabel = new JLabel();
        CompactMechlabButton = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("MWO Mechbay");
        setLocationByPlatform(true);
        setMinimumSize(new Dimension(330, 430));
        setName("MainMenu"); // NOI18N
        setPreferredSize(new Dimension(330, 430));
        getContentPane().setLayout(new GridBagLayout());

        TitleLabel.setFont(new Font("Moire", 0, 24)); // NOI18N
        TitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        TitleLabel.setText("MWO Mechbay");
        TitleLabel.setAlignmentY(0.0F);
        TitleLabel.setMaximumSize(new Dimension(300, 100));
        TitleLabel.setMinimumSize(new Dimension(300, 100));
        TitleLabel.setPreferredSize(new Dimension(300, 100));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        getContentPane().add(TitleLabel, gridBagConstraints);

        VersionLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        VersionLabel.setHorizontalAlignment(SwingConstants.CENTER);
        VersionLabel.setAlignmentY(0.0F);
        VersionLabel.setMaximumSize(new Dimension(300, 50));
        VersionLabel.setMinimumSize(new Dimension(300, 50));
        VersionLabel.setPreferredSize(new Dimension(300, 50));
        VersionLabel.setText("Mechbay Version: " + mechbayVersion);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        getContentPane().add(VersionLabel, gridBagConstraints);

        DropCalcButton.setFont(new Font("Moire", 0, 12)); // NOI18N
        DropCalcButton.setText("DropCalc");
        DropCalcButton.setAlignmentY(0.0F);
        DropCalcButton.setMargin(new Insets(0, 0, 0, 0));
        DropCalcButton.setMaximumSize(new Dimension(150, 50));
        DropCalcButton.setMinimumSize(new Dimension(150, 50));
        DropCalcButton.setPreferredSize(new Dimension(150, 50));
        DropCalcButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                DropCalcButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        getContentPane().add(DropCalcButton, gridBagConstraints);

        MechlabButton.setFont(new Font("Moire", 0, 12)); // NOI18N
        MechlabButton.setText("Mechlab");
        MechlabButton.setAlignmentY(0.0F);
        MechlabButton.setMargin(new Insets(0, 0, 0, 0));
        MechlabButton.setMaximumSize(new Dimension(150, 50));
        MechlabButton.setMinimumSize(new Dimension(150, 50));
        MechlabButton.setPreferredSize(new Dimension(150, 50));
        MechlabButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                MechlabButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        getContentPane().add(MechlabButton, gridBagConstraints);

        DropCalcVersionLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        DropCalcVersionLabel.setHorizontalAlignment(SwingConstants.CENTER);
        DropCalcVersionLabel.setText(dropCalcVersion);
        DropCalcVersionLabel.setAlignmentY(0.0F);
        DropCalcVersionLabel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Version", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 10))); // NOI18N
        DropCalcVersionLabel.setMaximumSize(new Dimension(150, 50));
        DropCalcVersionLabel.setMinimumSize(new Dimension(150, 50));
        DropCalcVersionLabel.setPreferredSize(new Dimension(150, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        getContentPane().add(DropCalcVersionLabel, gridBagConstraints);

        MechlabVersionLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        MechlabVersionLabel.setHorizontalAlignment(SwingConstants.CENTER);
        MechlabVersionLabel.setText(newMechlabVersion);
        MechlabVersionLabel.setAlignmentY(0.0F);
        MechlabVersionLabel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Version", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 10))); // NOI18N
        MechlabVersionLabel.setMaximumSize(new Dimension(150, 50));
        MechlabVersionLabel.setMinimumSize(new Dimension(150, 50));
        MechlabVersionLabel.setPreferredSize(new Dimension(150, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        getContentPane().add(MechlabVersionLabel, gridBagConstraints);

        CompactMechlabVersionLabel.setFont(new Font("Moire", 0, 12)); // NOI18N
        CompactMechlabVersionLabel.setHorizontalAlignment(SwingConstants.CENTER);
        CompactMechlabVersionLabel.setText(compactMechlabVersion);
        CompactMechlabVersionLabel.setAlignmentY(0.0F);
        CompactMechlabVersionLabel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Version", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 10))); // NOI18N
        CompactMechlabVersionLabel.setMaximumSize(new Dimension(150, 50));
        CompactMechlabVersionLabel.setMinimumSize(new Dimension(150, 50));
        CompactMechlabVersionLabel.setPreferredSize(new Dimension(150, 50));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        getContentPane().add(CompactMechlabVersionLabel, gridBagConstraints);

        CompactMechlabButton.setFont(new Font("Moire", 0, 12)); // NOI18N
        CompactMechlabButton.setText("Compact Mechlab");
        CompactMechlabButton.setAlignmentY(0.0F);
        CompactMechlabButton.setMargin(new Insets(0, 0, 0, 0));
        CompactMechlabButton.setMaximumSize(new Dimension(150, 50));
        CompactMechlabButton.setMinimumSize(new Dimension(150, 50));
        CompactMechlabButton.setPreferredSize(new Dimension(150, 50));
        CompactMechlabButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                CompactMechlabButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        getContentPane().add(CompactMechlabButton, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void DropCalcButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_DropCalcButtonActionPerformed
        setVisible(false);
        new DropCalculatorForm(this).setVisible(true);
    }//GEN-LAST:event_DropCalcButtonActionPerformed
    private void MechlabButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_MechlabButtonActionPerformed
        setVisible(false);
        new MechlabForm(this).setVisible(true);
    }//GEN-LAST:event_MechlabButtonActionPerformed
    private void CompactMechlabButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_CompactMechlabButtonActionPerformed
        setVisible(false);
        new CompactMechlabForm(this).setVisible(true);
    }//GEN-LAST:event_CompactMechlabButtonActionPerformed
    //<editor-fold defaultstate="Collapsed" desc="Variable Declerations">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton CompactMechlabButton;
    private JLabel CompactMechlabVersionLabel;
    private JButton DropCalcButton;
    private JLabel DropCalcVersionLabel;
    private JButton MechlabButton;
    private JLabel MechlabVersionLabel;
    private JLabel TitleLabel;
    private JLabel VersionLabel;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
}
