/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MWOMechbay.GUI;

import MWOMechbay.Components.Ammo.AmmoBin;
import MWOMechbay.Mechs.MechCommon;

/**
 *
 * @author Nemesis
 */
public class AmmoInfoDialogBox extends javax.swing.JDialog implements MechCommon
{
    String temp;
    
    public AmmoInfoDialogBox(java.awt.Frame parent, boolean modal, AmmoBin ammo)
    {
        super(parent, modal);
        initComponents();
        temp = String.format("%,d C-Bills", ammo.getCost());
        costLabel.setText(temp);
        projectileCountLabel.setText("" + ammo.getShotsPerTon());
        ammoNameLabel.setText(ammo.getFullName());
        
        if (ammo.getEquipmentName() == "LRM Ammo")
        {
            setSize(new java.awt.Dimension(360, 240));
            LRMPanel.setEnabled(true);
            LRMPanel.setVisible(true);
            temp = String.format("%.2f Salvos", (ammo.getShotsPerTon() / 5.0));
            LRM5SalvoLabel.setText(temp);
            temp = String.format("%.2f Salvos", (ammo.getShotsPerTon() / 10.0));
            LRM10SalvoLabel.setText(temp);
            temp = String.format("%.2f Salvos", (ammo.getShotsPerTon() / 15.0));
            LRM15SalvoLabel.setText(temp);
            temp = String.format("%.2f Salvos", (ammo.getShotsPerTon() / 20.0));
            LRM20SalvoLabel.setText(temp);
        }
        else if (ammo.getEquipmentName() == "SRM Ammo")
        {
            setSize(new java.awt.Dimension(360, 180));
            SRMPanel.setEnabled(true);
            SRMPanel.setVisible(true);
            temp = String.format("%.2f Salvos", (ammo.getShotsPerTon() / 2.0));
            SRM2SalvoLabel.setText(temp);
            temp = String.format("%.2f Salvos", (ammo.getShotsPerTon() / 4.0));
            SRM4SalvoLabel.setText(temp);
            temp = String.format("%.2f Salvos", (ammo.getShotsPerTon() / 6.0));
            SRM6SalvoLabel.setText(temp);
        }
        else if (ammo.getEquipmentName() == "Streak SRM Ammo")
        {
            setSize(new java.awt.Dimension(360, 180));
            SSRMPanel.setEnabled(true);
            SSRMPanel.setVisible(true);
            temp = String.format("%.2f Salvos", (ammo.getShotsPerTon() / 2.0));
            SSRM2SalvoLabel.setText(temp);
            temp = String.format("%.2f Salvos", (ammo.getShotsPerTon() / 4.0));
            SSRM4SalvoLabel.setText(temp);
            temp = String.format("%.2f Salvos", (ammo.getShotsPerTon() / 6.0));
            SSRM6SalvoLabel.setText(temp);
        }
        else
            setSize(new java.awt.Dimension(360, 120));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        AmmoPanel = new javax.swing.JPanel();
        ammoNameLabel = new javax.swing.JLabel();
        costLabel = new javax.swing.JLabel();
        projectileCountLabel = new javax.swing.JLabel();
        closeButton = new javax.swing.JButton();
        LRMPanel = new javax.swing.JPanel();
        LRM5SalvoLabel = new javax.swing.JLabel();
        LRM10SalvoLabel = new javax.swing.JLabel();
        LRM15SalvoLabel = new javax.swing.JLabel();
        LRM20SalvoLabel = new javax.swing.JLabel();
        SRMPanel = new javax.swing.JPanel();
        SRM2SalvoLabel = new javax.swing.JLabel();
        SRM4SalvoLabel = new javax.swing.JLabel();
        SRM6SalvoLabel = new javax.swing.JLabel();
        SSRMPanel = new javax.swing.JPanel();
        SSRM2SalvoLabel = new javax.swing.JLabel();
        SSRM4SalvoLabel = new javax.swing.JLabel();
        SSRM6SalvoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ammo Info");
        setMinimumSize(new java.awt.Dimension(360, 240));
        setName("Ammo Info"); // NOI18N
        getContentPane().setLayout(new java.awt.GridBagLayout());

        AmmoPanel.setMaximumSize(new java.awt.Dimension(360, 120));
        AmmoPanel.setMinimumSize(new java.awt.Dimension(360, 120));
        AmmoPanel.setPreferredSize(new java.awt.Dimension(360, 120));
        java.awt.GridBagLayout jPanel1Layout = new java.awt.GridBagLayout();
        jPanel1Layout.columnWidths = new int[] {0, 90, 0};
        jPanel1Layout.rowHeights = new int[] {0, 45, 0};
        AmmoPanel.setLayout(jPanel1Layout);

        ammoNameLabel.setFont(new java.awt.Font("Moire", 0, 16)); // NOI18N
        ammoNameLabel.setText("Particle Projection Cannon (PPC)");
        ammoNameLabel.setToolTipText("Name of the weapon");
        ammoNameLabel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Ammo Name", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Moire", 0, 10))); // NOI18N
        ammoNameLabel.setMaximumSize(new java.awt.Dimension(600, 60));
        ammoNameLabel.setMinimumSize(new java.awt.Dimension(600, 60));
        ammoNameLabel.setPreferredSize(new java.awt.Dimension(600, 60));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        AmmoPanel.add(ammoNameLabel, gridBagConstraints);

        costLabel.setFont(new java.awt.Font("Moire", 0, 12)); // NOI18N
        costLabel.setText("200,000 C-Bills");
        costLabel.setToolTipText("Cost of the weapon");
        costLabel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Cost", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Moire", 0, 10))); // NOI18N
        costLabel.setMaximumSize(new java.awt.Dimension(120, 60));
        costLabel.setMinimumSize(new java.awt.Dimension(120, 60));
        costLabel.setPreferredSize(new java.awt.Dimension(120, 60));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        AmmoPanel.add(costLabel, gridBagConstraints);

        projectileCountLabel.setFont(new java.awt.Font("Moire", 0, 12)); // NOI18N
        projectileCountLabel.setText("1");
        projectileCountLabel.setToolTipText("How many shots the ton of ammo carries");
        projectileCountLabel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Shots Per Ton", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Moire", 0, 10))); // NOI18N
        projectileCountLabel.setMaximumSize(new java.awt.Dimension(120, 60));
        projectileCountLabel.setMinimumSize(new java.awt.Dimension(120, 60));
        projectileCountLabel.setPreferredSize(new java.awt.Dimension(120, 60));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        AmmoPanel.add(projectileCountLabel, gridBagConstraints);

        closeButton.setFont(new java.awt.Font("Moire", 0, 12)); // NOI18N
        closeButton.setText("Close");
        closeButton.setMaximumSize(new java.awt.Dimension(120, 30));
        closeButton.setMinimumSize(new java.awt.Dimension(120, 30));
        closeButton.setPreferredSize(new java.awt.Dimension(120, 30));
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        AmmoPanel.add(closeButton, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        getContentPane().add(AmmoPanel, gridBagConstraints);

        LRMPanel.setEnabled(false);
        LRMPanel.setFont(new java.awt.Font("Moire", 0, 11)); // NOI18N
        LRMPanel.setMaximumSize(new java.awt.Dimension(360, 120));
        LRMPanel.setMinimumSize(new java.awt.Dimension(360, 120));
        LRMPanel.setPreferredSize(new java.awt.Dimension(360, 120));
        LRMPanel.setVisible(false);
        LRMPanel.setLayout(new java.awt.GridBagLayout());

        LRM5SalvoLabel.setFont(new java.awt.Font("Moire", 0, 11)); // NOI18N
        LRM5SalvoLabel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "LRM5 Salvos", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Moire", 0, 11))); // NOI18N
        LRM5SalvoLabel.setMaximumSize(new java.awt.Dimension(120, 60));
        LRM5SalvoLabel.setMinimumSize(new java.awt.Dimension(120, 60));
        LRM5SalvoLabel.setPreferredSize(new java.awt.Dimension(120, 60));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        LRMPanel.add(LRM5SalvoLabel, gridBagConstraints);

        LRM10SalvoLabel.setFont(new java.awt.Font("Moire", 0, 11)); // NOI18N
        LRM10SalvoLabel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "LRM10 Salvos", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Moire", 0, 11))); // NOI18N
        LRM10SalvoLabel.setMaximumSize(new java.awt.Dimension(120, 60));
        LRM10SalvoLabel.setMinimumSize(new java.awt.Dimension(120, 60));
        LRM10SalvoLabel.setPreferredSize(new java.awt.Dimension(120, 60));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        LRMPanel.add(LRM10SalvoLabel, gridBagConstraints);

        LRM15SalvoLabel.setFont(new java.awt.Font("Moire", 0, 11)); // NOI18N
        LRM15SalvoLabel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "LRM15 Salvos", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Moire", 0, 11))); // NOI18N
        LRM15SalvoLabel.setMaximumSize(new java.awt.Dimension(120, 60));
        LRM15SalvoLabel.setMinimumSize(new java.awt.Dimension(120, 60));
        LRM15SalvoLabel.setPreferredSize(new java.awt.Dimension(120, 60));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        LRMPanel.add(LRM15SalvoLabel, gridBagConstraints);

        LRM20SalvoLabel.setFont(new java.awt.Font("Moire", 0, 11)); // NOI18N
        LRM20SalvoLabel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "LRM20 Salvos", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Moire", 0, 11))); // NOI18N
        LRM20SalvoLabel.setMaximumSize(new java.awt.Dimension(120, 60));
        LRM20SalvoLabel.setMinimumSize(new java.awt.Dimension(120, 60));
        LRM20SalvoLabel.setPreferredSize(new java.awt.Dimension(120, 60));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        LRMPanel.add(LRM20SalvoLabel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        getContentPane().add(LRMPanel, gridBagConstraints);

        SRMPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Moire", 0, 11))); // NOI18N
        SRMPanel.setEnabled(false);
        SRMPanel.setFont(new java.awt.Font("Moire", 0, 11)); // NOI18N
        SRMPanel.setMaximumSize(new java.awt.Dimension(360, 60));
        SRMPanel.setMinimumSize(new java.awt.Dimension(360, 60));
        SRMPanel.setPreferredSize(new java.awt.Dimension(360, 60));
        SRMPanel.setVisible(false);
        SRMPanel.setLayout(new java.awt.GridBagLayout());

        SRM2SalvoLabel.setFont(new java.awt.Font("Moire", 0, 11)); // NOI18N
        SRM2SalvoLabel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "SRM2 Salvos", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Moire", 0, 11))); // NOI18N
        SRM2SalvoLabel.setMaximumSize(new java.awt.Dimension(120, 60));
        SRM2SalvoLabel.setMinimumSize(new java.awt.Dimension(120, 60));
        SRM2SalvoLabel.setPreferredSize(new java.awt.Dimension(120, 60));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        SRMPanel.add(SRM2SalvoLabel, gridBagConstraints);

        SRM4SalvoLabel.setFont(new java.awt.Font("Moire", 0, 11)); // NOI18N
        SRM4SalvoLabel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "SRM4 Salvos", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Moire", 0, 11))); // NOI18N
        SRM4SalvoLabel.setMaximumSize(new java.awt.Dimension(120, 60));
        SRM4SalvoLabel.setMinimumSize(new java.awt.Dimension(120, 60));
        SRM4SalvoLabel.setPreferredSize(new java.awt.Dimension(120, 60));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        SRMPanel.add(SRM4SalvoLabel, gridBagConstraints);

        SRM6SalvoLabel.setFont(new java.awt.Font("Moire", 0, 11)); // NOI18N
        SRM6SalvoLabel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "SRM6 Salvos", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Moire", 0, 11))); // NOI18N
        SRM6SalvoLabel.setMaximumSize(new java.awt.Dimension(120, 60));
        SRM6SalvoLabel.setMinimumSize(new java.awt.Dimension(120, 60));
        SRM6SalvoLabel.setPreferredSize(new java.awt.Dimension(120, 60));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        SRMPanel.add(SRM6SalvoLabel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        getContentPane().add(SRMPanel, gridBagConstraints);

        SSRMPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Moire", 0, 11))); // NOI18N
        SSRMPanel.setEnabled(false);
        SSRMPanel.setFont(new java.awt.Font("Moire", 0, 11)); // NOI18N
        SSRMPanel.setMaximumSize(new java.awt.Dimension(360, 60));
        SSRMPanel.setMinimumSize(new java.awt.Dimension(360, 60));
        SSRMPanel.setPreferredSize(new java.awt.Dimension(360, 60));
        SSRMPanel.setVisible(false);
        SSRMPanel.setLayout(new java.awt.GridBagLayout());

        SSRM2SalvoLabel.setFont(new java.awt.Font("Moire", 0, 11)); // NOI18N
        SSRM2SalvoLabel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "SSRM2 Salvos", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Moire", 0, 11))); // NOI18N
        SSRM2SalvoLabel.setMaximumSize(new java.awt.Dimension(120, 60));
        SSRM2SalvoLabel.setMinimumSize(new java.awt.Dimension(120, 60));
        SSRM2SalvoLabel.setPreferredSize(new java.awt.Dimension(120, 60));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        SSRMPanel.add(SSRM2SalvoLabel, gridBagConstraints);

        SSRM4SalvoLabel.setFont(new java.awt.Font("Moire", 0, 11)); // NOI18N
        SSRM4SalvoLabel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "SSRM4 Salvos", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Moire", 0, 11))); // NOI18N
        SSRM4SalvoLabel.setMaximumSize(new java.awt.Dimension(120, 60));
        SSRM4SalvoLabel.setMinimumSize(new java.awt.Dimension(120, 60));
        SSRM4SalvoLabel.setPreferredSize(new java.awt.Dimension(120, 60));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        SSRMPanel.add(SSRM4SalvoLabel, gridBagConstraints);

        SSRM6SalvoLabel.setFont(new java.awt.Font("Moire", 0, 11)); // NOI18N
        SSRM6SalvoLabel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "SSRM6 Salvos", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Moire", 0, 11))); // NOI18N
        SSRM6SalvoLabel.setMaximumSize(new java.awt.Dimension(120, 60));
        SSRM6SalvoLabel.setMinimumSize(new java.awt.Dimension(120, 60));
        SSRM6SalvoLabel.setPreferredSize(new java.awt.Dimension(120, 60));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        SSRMPanel.add(SSRM6SalvoLabel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        getContentPane().add(SSRMPanel, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        dispose();
    }//GEN-LAST:event_closeButtonActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JPanel AmmoPanel;
    javax.swing.JLabel LRM10SalvoLabel;
    javax.swing.JLabel LRM15SalvoLabel;
    javax.swing.JLabel LRM20SalvoLabel;
    javax.swing.JLabel LRM5SalvoLabel;
    javax.swing.JPanel LRMPanel;
    javax.swing.JLabel SRM2SalvoLabel;
    javax.swing.JLabel SRM4SalvoLabel;
    javax.swing.JLabel SRM6SalvoLabel;
    javax.swing.JPanel SRMPanel;
    javax.swing.JLabel SSRM2SalvoLabel;
    javax.swing.JLabel SSRM4SalvoLabel;
    javax.swing.JLabel SSRM6SalvoLabel;
    javax.swing.JPanel SSRMPanel;
    javax.swing.JLabel ammoNameLabel;
    javax.swing.JButton closeButton;
    javax.swing.JLabel costLabel;
    javax.swing.JLabel projectileCountLabel;
    // End of variables declaration//GEN-END:variables
}
