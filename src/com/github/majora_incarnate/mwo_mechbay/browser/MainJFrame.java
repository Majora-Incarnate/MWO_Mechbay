/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.majora_incarnate.mwo_mechbay.browser;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JTabbedPane;
import javax.swing.WindowConstants;

import com.github.majora_incarnate.mwo_mechbay.creator.CreatorJPanel;
import com.github.majora_incarnate.mwo_mechbay.entities.Constants;
import com.github.majora_incarnate.mwo_mechbay.mechlab.MechlabJPanel;
import com.github.majora_incarnate.mwo_mechbay.encyclopedia.EncyclopediaJPanel;
import com.github.majora_incarnate.mwo_mechbay.entities.Database;

/**
 *
 * @author Trevin
 */
public class MainJFrame extends javax.swing.JFrame {

    private static final long serialVersionUID = -2306357614590126175L;
    
    private final Database MASTER_DATABASE;

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        MASTER_DATABASE = new Database();
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        GridBagConstraints gridBagConstraints;

        browserJTabbedPane = new JTabbedPane();
        mainJMenuBar = new JMenuBar();
        fileJMenu = new JMenu();
        aboutJMenuItem = new JMenuItem();
        exitJMenuItem = new JMenuItem();
        tabJMenu = new JMenu();
        newMechlabTabJMenuItem = new JMenuItem();
        newCreatorTabJMenuItem = new JMenuItem();
        newEncyclopediaTabJMenuItem = new JMenuItem();
        tabJSeparator = new JPopupMenu.Separator();
        closeTabJMenuItem = new JMenuItem();
        closeOtherTabJMenuItem = new JMenuItem();
        closeAllTabsJMenuItem = new JMenuItem();
        parserJMenu = new JMenu();
        helpJMenu = new JMenu();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(1280, 720));
        setName("Form"); // NOI18N
        getContentPane().setLayout(new GridBagLayout());

        browserJTabbedPane.setMaximumSize(new Dimension(0, 0));
        browserJTabbedPane.setMinimumSize(new Dimension(0, 0));
        browserJTabbedPane.setName("browserJTabbedPane"); // NOI18N
        browserJTabbedPane.setPreferredSize(new Dimension(0, 0));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(browserJTabbedPane, gridBagConstraints);

        mainJMenuBar.setName("mainJMenuBar"); // NOI18N

        fileJMenu.setText("File");
        fileJMenu.setName("fileJMenu"); // NOI18N

        aboutJMenuItem.setText("About");
        aboutJMenuItem.setName("aboutJMenuItem"); // NOI18N
        aboutJMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                aboutJMenuItemActionPerformed(evt);
            }
        });
        fileJMenu.add(aboutJMenuItem);

        exitJMenuItem.setText("Exit");
        exitJMenuItem.setName("exitJMenuItem"); // NOI18N
        exitJMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                exitJMenuItemActionPerformed(evt);
            }
        });
        fileJMenu.add(exitJMenuItem);

        mainJMenuBar.add(fileJMenu);

        tabJMenu.setText("Tab");
        tabJMenu.setName("tabJMenu"); // NOI18N

        newMechlabTabJMenuItem.setText("New Mechlab");
        newMechlabTabJMenuItem.setName("newMechlabTabJMenuItem"); // NOI18N
        newMechlabTabJMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                newMechlabTabJMenuItemActionPerformed(evt);
            }
        });
        tabJMenu.add(newMechlabTabJMenuItem);

        newCreatorTabJMenuItem.setText("New Creator");
        newCreatorTabJMenuItem.setName("newCreatorTabJMenuItem"); // NOI18N
        newCreatorTabJMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                newCreatorTabJMenuItemActionPerformed(evt);
            }
        });
        tabJMenu.add(newCreatorTabJMenuItem);

        newEncyclopediaTabJMenuItem.setText("New Encyclopedia");
        newEncyclopediaTabJMenuItem.setName("newEncyclopediaTabJMenuItem"); // NOI18N
        newEncyclopediaTabJMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                newEncyclopediaTabJMenuItemActionPerformed(evt);
            }
        });
        tabJMenu.add(newEncyclopediaTabJMenuItem);

        tabJSeparator.setName("tabJSeparator"); // NOI18N
        tabJMenu.add(tabJSeparator);

        closeTabJMenuItem.setText("Close Tab");
        closeTabJMenuItem.setName("closeTabJMenuItem"); // NOI18N
        closeTabJMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                closeTabJMenuItemActionPerformed(evt);
            }
        });
        tabJMenu.add(closeTabJMenuItem);

        closeOtherTabJMenuItem.setText("Close Other");
        closeOtherTabJMenuItem.setName("closeOtherTabJMenuItem"); // NOI18N
        closeOtherTabJMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                closeOtherTabJMenuItemActionPerformed(evt);
            }
        });
        tabJMenu.add(closeOtherTabJMenuItem);

        closeAllTabsJMenuItem.setText("Close All");
        closeAllTabsJMenuItem.setName("closeAllTabsJMenuItem"); // NOI18N
        closeAllTabsJMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                closeAllTabsJMenuItemActionPerformed(evt);
            }
        });
        tabJMenu.add(closeAllTabsJMenuItem);

        mainJMenuBar.add(tabJMenu);

        parserJMenu.setText("Parser");
        parserJMenu.setEnabled(false);
        parserJMenu.setName("parserJMenu"); // NOI18N
        mainJMenuBar.add(parserJMenu);

        helpJMenu.setText("Help");
        helpJMenu.setName("helpJMenu"); // NOI18N
        mainJMenuBar.add(helpJMenu);

        setJMenuBar(mainJMenuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newMechlabTabJMenuItemActionPerformed(ActionEvent evt) {//GEN-FIRST:event_newMechlabTabJMenuItemActionPerformed
        browserJTabbedPane.addTab("Mechlab", new MechlabJPanel(MASTER_DATABASE));
    }//GEN-LAST:event_newMechlabTabJMenuItemActionPerformed

    private void newCreatorTabJMenuItemActionPerformed(ActionEvent evt) {//GEN-FIRST:event_newCreatorTabJMenuItemActionPerformed
        browserJTabbedPane.addTab("Creator", new CreatorJPanel());
    }//GEN-LAST:event_newCreatorTabJMenuItemActionPerformed

    private void newEncyclopediaTabJMenuItemActionPerformed(ActionEvent evt) {//GEN-FIRST:event_newEncyclopediaTabJMenuItemActionPerformed
        browserJTabbedPane.addTab("Encyclopedia", new EncyclopediaJPanel());
    }//GEN-LAST:event_newEncyclopediaTabJMenuItemActionPerformed

    private void exitJMenuItemActionPerformed(ActionEvent evt) {//GEN-FIRST:event_exitJMenuItemActionPerformed
        dispose();
    }//GEN-LAST:event_exitJMenuItemActionPerformed

    private void closeTabJMenuItemActionPerformed(ActionEvent evt) {//GEN-FIRST:event_closeTabJMenuItemActionPerformed
        browserJTabbedPane.removeTabAt(browserJTabbedPane.getSelectedIndex());
    }//GEN-LAST:event_closeTabJMenuItemActionPerformed

    private void closeOtherTabJMenuItemActionPerformed(ActionEvent evt) {//GEN-FIRST:event_closeOtherTabJMenuItemActionPerformed
        for (int i = browserJTabbedPane.getTabCount() - 1;i >= 0;i--) {
            if (i != browserJTabbedPane.getSelectedIndex()) {
                browserJTabbedPane.removeTabAt(i);
            }
        }
    }//GEN-LAST:event_closeOtherTabJMenuItemActionPerformed

    private void closeAllTabsJMenuItemActionPerformed(ActionEvent evt) {//GEN-FIRST:event_closeAllTabsJMenuItemActionPerformed
        for (int i = browserJTabbedPane.getTabCount() - 1;i >= 0;i--) {
            browserJTabbedPane.removeTabAt(i);
        }
    }//GEN-LAST:event_closeAllTabsJMenuItemActionPerformed

    private void aboutJMenuItemActionPerformed(ActionEvent evt) {//GEN-FIRST:event_aboutJMenuItemActionPerformed
        final AboutDialogBox aboutDialogBox = new AboutDialogBox(this, true, Constants.MECHBAY_VERSION, "1.3.3");
        aboutDialogBox.setLocationRelativeTo(this);
        aboutDialogBox.setVisible(true);
    }//GEN-LAST:event_aboutJMenuItemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new MainJFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JMenuItem aboutJMenuItem;
    private JTabbedPane browserJTabbedPane;
    private JMenuItem closeAllTabsJMenuItem;
    private JMenuItem closeOtherTabJMenuItem;
    private JMenuItem closeTabJMenuItem;
    private JMenuItem exitJMenuItem;
    private JMenu fileJMenu;
    private JMenu helpJMenu;
    private JMenuBar mainJMenuBar;
    private JMenuItem newCreatorTabJMenuItem;
    private JMenuItem newEncyclopediaTabJMenuItem;
    private JMenuItem newMechlabTabJMenuItem;
    private JMenu parserJMenu;
    private JMenu tabJMenu;
    private JPopupMenu.Separator tabJSeparator;
    // End of variables declaration//GEN-END:variables
}
