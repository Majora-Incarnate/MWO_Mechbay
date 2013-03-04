package MWOMechbay.GUI;

import MWOMechbay.Components.Ammo.AmmoBin;
import MWOMechbay.Components.Ammo.LRM_Ammo;
import MWOMechbay.Components.Ammo.SRM_Ammo;
import MWOMechbay.Components.Ammo.Streak_SRM_Ammo;
import MWOMechbay.Components.Item;
import MWOMechbay.Components.Weapons.Weapon;
import MWOMechbay.UserPreferences;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.Vector;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.WindowConstants;

/**
 *
 * @author Quicksilver
 */
public class EquipmentStatsDialogBox extends javax.swing.JDialog implements MainCommon {
    private Vector<Item>[] Equipment = new Vector[4];
    
    private DefaultListSelectionModel ballisticSelectionModel = new DefaultListSelectionModel();
    private DefaultListSelectionModel energySelectionModel = new DefaultListSelectionModel();
    private DefaultListSelectionModel missileSelectionModel = new DefaultListSelectionModel();
    
    private UserPreferences u = new UserPreferences();
    
    private String temp;
    
    public EquipmentStatsDialogBox(java.awt.Frame parent, Vector<Weapon>[] weapons, Vector<Item>[] other) {
        super(parent, false);
        for (int i = 0; i < 4; i++)
            Equipment[i] = new Vector();
        for (int i = 0; i < weapons[BALLISTIC].size(); i++)
            Equipment[BALLISTIC].add(weapons[BALLISTIC].elementAt(i));
        for (int i = 0; i < weapons[ENERGY].size(); i++)
            Equipment[ENERGY].add(weapons[ENERGY].elementAt(i));
        for (int i = 0; i < weapons[MISSILE].size(); i++)
            Equipment[MISSILE].add(weapons[MISSILE].elementAt(i));
        Equipment[AMMO] = other[0];
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        GridBagConstraints gridBagConstraints;

        EquipmentTabbedPane = new JTabbedPane();
        AmmoPanel = new JPanel();
        jScrollPane8 = new JScrollPane();
        Object[][] data = new Object[Equipment[AMMO].size()][3];
        for (int i = 0; i < Equipment[AMMO].size(); i++) {
            AmmoBin ammo = (AmmoBin) Equipment[AMMO].elementAt(i);
            data[i][0] = ammo.toString();
            data[i][1] = ammo.getShotsPerTon();
            temp = String.format("%,d C-Bills", ammo.getCost());
            data[i][2] = temp;
        }
        String[] colnames = {   "Ammunition Name",
            "Shots Per Ton",
            "Cost"};
        ammoTable1 = new JTable(data, colnames);
        jScrollPane9 = new JScrollPane();
        data = new Object[Equipment[MISSILE].size()][3];
        for (int i = 0; i < Equipment[MISSILE].size(); i++) {
            if (i == 4)
            continue;
            Weapon weapon = (Weapon) Equipment[MISSILE].elementAt(i);
            AmmoBin ammo;
            data[i][0] = weapon.toString();
            if (i < 4) {
                ammo = new LRM_Ammo(false);
            } else if (i < 8) {
                ammo = new SRM_Ammo(false);
            } else {
                ammo = new Streak_SRM_Ammo();
            }

            data[i][1] = ammo.toString();
            temp = String.format("%.2f", ammo.getShotsPerTon() / (double)weapon.getProjectileCount());
            data[i][2] = temp;
        }

        colnames = new String[3];
        colnames[0] = "Weapon Name";
        colnames[1] = "Ammunition Name";
        colnames[2] = "Salvos Per Ton";
        ammoTable2 = new JTable(data, colnames);
        BallisticPanel = new JPanel();
        jScrollPane10 = new JScrollPane();
        data = new Object[Equipment[BALLISTIC].size()][8];
        for (int i = 0; i < Equipment[BALLISTIC].size(); i++) {
            Weapon weapon = (Weapon) Equipment[BALLISTIC].elementAt(i);
            data[i][0] = weapon.getMinimumRange() + "m";
            data[i][1] = weapon.getRange() + "m";
            data[i][2] = weapon.getMaximumRange() + "m";
            data[i][3] = weapon.getVelocity();
            temp = String.format("%.2f", weapon.getKnock());
            data[i][4] = temp;
            temp = String.format("%.2f", weapon.getSpread());
            data[i][5] = temp;
            temp = String.format("%.2f", weapon.getDamagePerSecond());
            data[i][6] = temp;
            temp = String.format("%.2f", weapon.getHeatPerSecond());
            data[i][7] = temp;
        }

        colnames = new String[8];
        colnames[0] = "Min Range";
        colnames[1] = "Range";
        colnames[2] = "Max Range";
        colnames[3] = "Velocity";
        colnames[4] = "'Knock'";
        colnames[5] = "Spread";
        colnames[6] = "DPS";
        colnames[7] = "HPS";
        ballisticTable2 = new JTable(data, colnames);
        jScrollPane11 = new JScrollPane();
        data = new Object[Equipment[BALLISTIC].size()][8];
        for (int i = 0; i < Equipment[BALLISTIC].size(); i++) {
            Weapon weapon = (Weapon) Equipment[BALLISTIC].elementAt(i);
            data[i][0] = weapon.toString();
            temp = String.format("%.2f", weapon.getTonnage());
            data[i][1] = temp;
            data[i][2] = weapon.getCriticals();
            temp = String.format("%.2f", weapon.getDamage());
            data[i][3] = temp;
            temp = String.format("%.2f", weapon.getHeat());
            data[i][4] = temp;
            temp = String.format("%.2f", weapon.getRecycle());
            data[i][5] = temp;
            data[i][6] = weapon.getProjectileCount();
            temp = String.format("%,d C-Bills", weapon.getCost());
            data[i][7] = temp;
        }

        colnames = new String[8];
        colnames[0] = "Weapon Name";
        colnames[1] = "Tonnage";
        colnames[2] = "Criticals";
        colnames[3] = "Damage";
        colnames[4] = "Heat";
        colnames[5] = "Recycle";
        colnames[6] = "Projectile Count";
        colnames[7] = "Cost";
        ballisticTable1 = new JTable(data, colnames);
        EnergyPanel = new JPanel();
        jScrollPane12 = new JScrollPane();
        data = new Object[Equipment[ENERGY].size()][8];
        for (int i = 0; i < Equipment[ENERGY].size(); i++) {
            Weapon weapon = (Weapon) Equipment[ENERGY].elementAt(i);
            data[i][0] = weapon.getMinimumRange() + "m";
            data[i][1] = weapon.getRange() + "m";
            data[i][2] = weapon.getMaximumRange() + "m";
            data[i][3] = weapon.getVelocity();
            temp = String.format("%.2f", weapon.getKnock());
            data[i][4] = temp;
            temp = String.format("%.2f", weapon.getHeatToTarget());
            data[i][5] = temp;
            temp = String.format("%.2f", weapon.getDamagePerSecond());
            data[i][6] = temp;
            temp = String.format("%.2f", weapon.getHeatPerSecond());
            data[i][7] = temp;
        }

        colnames = new String[8];
        colnames[0] = "Min Range";
        colnames[1] = "Range";
        colnames[2] = "Max Range";
        colnames[3] = "Velocity";
        colnames[4] = "'Knock'";
        colnames[5] = "HTT";
        colnames[6] = "DPS";
        colnames[7] = "HPS";
        energyTable2 = new JTable(data, colnames);
        jScrollPane13 = new JScrollPane();
        data = new Object[Equipment[ENERGY].size()][8];
        for (int i = 0; i < Equipment[ENERGY].size(); i++) {
            Weapon weapon = (Weapon) Equipment[ENERGY].elementAt(i);
            data[i][0] = weapon.toString();
            temp = String.format("%.2f", weapon.getTonnage());
            data[i][1] = temp;
            data[i][2] = weapon.getCriticals();
            temp = String.format("%.2f", weapon.getDamage());
            data[i][3] = temp;
            temp = String.format("%.2f", weapon.getHeat());
            data[i][4] = temp;
            temp = String.format("%.2f", weapon.getRecycle());
            data[i][5] = temp;
            temp = String.format("%.2f sec", weapon.getDuration());
            data[i][6] = temp;
            temp = String.format("%,d C-Bills", weapon.getCost());
            data[i][7] = temp;
        }

        colnames = new String[8];
        colnames[0] = "Weapon Name";
        colnames[1] = "Tonnage";
        colnames[2] = "Criticals";
        colnames[3] = "Damage";
        colnames[4] = "Heat";
        colnames[5] = "Recycle";
        colnames[6] = "Duration";
        colnames[7] = "Cost";
        energyTable1 = new JTable(data, colnames);
        MissilePanel = new JPanel();
        jScrollPane14 = new JScrollPane();
        data = new Object[Equipment[MISSILE].size()][8];
        for (int i = 0; i < Equipment[MISSILE].size(); i++) {
            Weapon weapon = (Weapon) Equipment[MISSILE].elementAt(i);
            data[i][0] = weapon.toString();
            temp = String.format("%.2f", weapon.getTonnage());
            data[i][1] = temp;
            data[i][2] = weapon.getCriticals();
            temp = String.format("%.2f", weapon.getDamage());
            data[i][3] = temp;
            temp = String.format("%.2f", weapon.getHeat());
            data[i][4] = temp;
            temp = String.format("%.2f", weapon.getRecycle());
            data[i][5] = temp;
            data[i][6] = weapon.getProjectileCount();
            temp = String.format("%,d C-Bills", weapon.getCost());
            data[i][7] = temp;
        }

        colnames = new String[8];
        colnames[0] = "Weapon Name";
        colnames[1] = "Tonnage";
        colnames[2] = "Criticals";
        colnames[3] = "Damage";
        colnames[4] = "Heat";
        colnames[5] = "Recycle";
        colnames[6] = "Projectile Count";
        colnames[7] = "Cost";
        missileTable1 = new JTable(data, colnames);
        jScrollPane15 = new JScrollPane();
        data = new Object[Equipment[MISSILE].size()][8];
        for (int i = 0; i < Equipment[MISSILE].size(); i++) {
            Weapon weapon = (Weapon) Equipment[MISSILE].elementAt(i);
            data[i][0] = weapon.getMinimumRange() + "m";
            data[i][1] = weapon.getRange() + "m";
            data[i][2] = weapon.getMaximumRange() + "m";
            data[i][3] = weapon.getVelocity();
            temp = String.format("%.2f", weapon.getKnock());
            data[i][4] = temp;
            temp = String.format("%.2f sec", weapon.getDelay());
            data[i][5] = temp;
            temp = String.format("%.2f", weapon.getDamagePerSecond());
            data[i][6] = temp;
            temp = String.format("%.2f", weapon.getHeatPerSecond());
            data[i][7] = temp;
        }

        colnames = new String[8];
        colnames[0] = "Min Range";
        colnames[1] = "Range";
        colnames[2] = "Max Range";
        colnames[3] = "Velocity";
        colnames[4] = "'Knock'";
        colnames[5] = "Delay";
        colnames[6] = "DPS";
        colnames[7] = "HPS";
        missileTable2 = new JTable(data, colnames);

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Weapon Stats");
        setMinimumSize(new Dimension(768, 512));
        getContentPane().setLayout(new GridBagLayout());

        EquipmentTabbedPane.setAlignmentX(0.0F);
        EquipmentTabbedPane.setAlignmentY(0.0F);
        EquipmentTabbedPane.setFont(u.titleFont);
        EquipmentTabbedPane.setMinimumSize(new Dimension(768, 512));
        EquipmentTabbedPane.setName("EquipmentTabbedPane"); // NOI18N
        EquipmentTabbedPane.setPreferredSize(new Dimension(768, 512));

        AmmoPanel.setAlignmentX(0.0F);
        AmmoPanel.setAlignmentY(0.0F);
        AmmoPanel.setFont(u.titleFont);
        AmmoPanel.setMinimumSize(new Dimension(512, 512));
        AmmoPanel.setName("AmmoPanel"); // NOI18N
        AmmoPanel.setOpaque(false);
        AmmoPanel.setPreferredSize(new Dimension(512, 512));
        AmmoPanel.setLayout(new GridBagLayout());

        jScrollPane8.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane8.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane8.setAlignmentX(0.0F);
        jScrollPane8.setAlignmentY(0.0F);
        jScrollPane8.setFont(u.titleFont);
        jScrollPane8.setMaximumSize(new Dimension(0, 0));
        jScrollPane8.setMinimumSize(new Dimension(0, 0));
        jScrollPane8.setName("jScrollPane8"); // NOI18N
        jScrollPane8.setPreferredSize(new Dimension(0, 0));

        ammoTable1.setFont(u.listFont);
        ammoTable1.setAlignmentX(0.0F);
        ammoTable1.setAlignmentY(0.0F);
        ammoTable1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        ammoTable1.setName("ammoTable1"); // NOI18N
        ammoTable1.setOpaque(false);
        ammoTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jScrollPane8.setViewportView(ammoTable1);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        AmmoPanel.add(jScrollPane8, gridBagConstraints);

        jScrollPane9.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane9.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane9.setAlignmentX(0.0F);
        jScrollPane9.setAlignmentY(0.0F);
        jScrollPane9.setFont(u.titleFont);
        jScrollPane9.setMaximumSize(new Dimension(0, 0));
        jScrollPane9.setMinimumSize(new Dimension(0, 0));
        jScrollPane9.setName("jScrollPane9"); // NOI18N
        jScrollPane9.setPreferredSize(new Dimension(0, 0));

        ammoTable2.setFont(u.listFont);
        ammoTable2.setAlignmentX(0.0F);
        ammoTable2.setAlignmentY(0.0F);
        ammoTable2.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        ammoTable2.setName("ammoTable2"); // NOI18N
        ammoTable2.setOpaque(false);
        ammoTable2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jScrollPane9.setViewportView(ammoTable2);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        AmmoPanel.add(jScrollPane9, gridBagConstraints);

        EquipmentTabbedPane.addTab("Ammo Stats", AmmoPanel);

        BallisticPanel.setAlignmentX(0.0F);
        BallisticPanel.setAlignmentY(0.0F);
        BallisticPanel.setFont(u.titleFont);
        BallisticPanel.setMinimumSize(new Dimension(512, 512));
        BallisticPanel.setName("BallisticPanel"); // NOI18N
        BallisticPanel.setOpaque(false);
        BallisticPanel.setPreferredSize(new Dimension(512, 512));
        BallisticPanel.setLayout(new GridBagLayout());

        jScrollPane10.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane10.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane10.setAlignmentX(0.0F);
        jScrollPane10.setAlignmentY(0.0F);
        jScrollPane10.setFont(u.titleFont);
        jScrollPane10.setMaximumSize(new Dimension(0, 0));
        jScrollPane10.setMinimumSize(new Dimension(0, 0));
        jScrollPane10.setName("jScrollPane10"); // NOI18N
        jScrollPane10.setPreferredSize(new Dimension(0, 0));

        ballisticTable2.setFont(u.listFont);
        ballisticTable2.setAlignmentX(0.0F);
        ballisticTable2.setAlignmentY(0.0F);
        ballisticTable2.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        ballisticTable2.setName("ballisticTable2"); // NOI18N
        ballisticTable2.setOpaque(false);
        ballisticTable2.setSelectionModel(ballisticSelectionModel);
        jScrollPane10.setViewportView(ballisticTable2);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        BallisticPanel.add(jScrollPane10, gridBagConstraints);

        jScrollPane11.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane11.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane11.setAlignmentX(0.0F);
        jScrollPane11.setAlignmentY(0.0F);
        jScrollPane11.setFont(u.titleFont);
        jScrollPane11.setMaximumSize(new Dimension(0, 0));
        jScrollPane11.setMinimumSize(new Dimension(0, 0));
        jScrollPane11.setName("jScrollPane11"); // NOI18N
        jScrollPane11.setPreferredSize(new Dimension(0, 0));

        ballisticTable1.setFont(u.listFont);
        ballisticTable1.setAlignmentX(0.0F);
        ballisticTable1.setAlignmentY(0.0F);
        ballisticTable1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        ballisticTable1.setName("ballisticTable1"); // NOI18N
        ballisticTable1.setOpaque(false);
        ballisticTable1.setSelectionModel(ballisticSelectionModel);
        jScrollPane11.setViewportView(ballisticTable1);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        BallisticPanel.add(jScrollPane11, gridBagConstraints);

        EquipmentTabbedPane.addTab("Ballistic Stats", BallisticPanel);

        EnergyPanel.setAlignmentX(0.0F);
        EnergyPanel.setAlignmentY(0.0F);
        EnergyPanel.setFont(u.titleFont);
        EnergyPanel.setMinimumSize(new Dimension(512, 512));
        EnergyPanel.setName("EnergyPanel"); // NOI18N
        EnergyPanel.setOpaque(false);
        EnergyPanel.setPreferredSize(new Dimension(512, 512));
        EnergyPanel.setLayout(new GridBagLayout());

        jScrollPane12.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane12.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane12.setAlignmentX(0.0F);
        jScrollPane12.setAlignmentY(0.0F);
        jScrollPane12.setFont(u.titleFont);
        jScrollPane12.setMaximumSize(new Dimension(0, 0));
        jScrollPane12.setMinimumSize(new Dimension(0, 0));
        jScrollPane12.setName("jScrollPane12"); // NOI18N
        jScrollPane12.setPreferredSize(new Dimension(0, 0));

        energyTable2.setFont(u.listFont);
        energyTable2.setAlignmentX(0.0F);
        energyTable2.setAlignmentY(0.0F);
        energyTable2.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        energyTable2.setName("energyTable2"); // NOI18N
        energyTable2.setOpaque(false);
        energyTable2.setSelectionModel(energySelectionModel);
        jScrollPane12.setViewportView(energyTable2);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        EnergyPanel.add(jScrollPane12, gridBagConstraints);

        jScrollPane13.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane13.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane13.setAlignmentX(0.0F);
        jScrollPane13.setAlignmentY(0.0F);
        jScrollPane13.setFont(u.titleFont);
        jScrollPane13.setMaximumSize(new Dimension(0, 0));
        jScrollPane13.setMinimumSize(new Dimension(0, 0));
        jScrollPane13.setName("jScrollPane13"); // NOI18N
        jScrollPane13.setPreferredSize(new Dimension(0, 0));

        energyTable1.setFont(u.listFont);
        energyTable1.setAlignmentX(0.0F);
        energyTable1.setAlignmentY(0.0F);
        energyTable1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        energyTable1.setName("energyTable1"); // NOI18N
        energyTable1.setOpaque(false);
        energyTable1.setSelectionModel(energySelectionModel);
        jScrollPane13.setViewportView(energyTable1);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        EnergyPanel.add(jScrollPane13, gridBagConstraints);

        EquipmentTabbedPane.addTab("Energy Stats", EnergyPanel);

        MissilePanel.setAlignmentX(0.0F);
        MissilePanel.setAlignmentY(0.0F);
        MissilePanel.setFont(u.titleFont);
        MissilePanel.setMinimumSize(new Dimension(512, 512));
        MissilePanel.setName("MissilePanel"); // NOI18N
        MissilePanel.setOpaque(false);
        MissilePanel.setPreferredSize(new Dimension(512, 512));
        MissilePanel.setLayout(new GridBagLayout());

        jScrollPane14.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane14.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane14.setAlignmentX(0.0F);
        jScrollPane14.setAlignmentY(0.0F);
        jScrollPane14.setFont(u.titleFont);
        jScrollPane14.setMaximumSize(new Dimension(0, 0));
        jScrollPane14.setMinimumSize(new Dimension(0, 0));
        jScrollPane14.setName("jScrollPane14"); // NOI18N
        jScrollPane14.setPreferredSize(new Dimension(0, 0));

        missileTable1.setFont(u.listFont);
        missileTable1.setAlignmentX(0.0F);
        missileTable1.setAlignmentY(0.0F);
        missileTable1.setName("missileTable1"); // NOI18N
        missileTable1.setOpaque(false);
        missileTable1.setSelectionModel(missileSelectionModel);
        jScrollPane14.setViewportView(missileTable1);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        MissilePanel.add(jScrollPane14, gridBagConstraints);

        jScrollPane15.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane15.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane15.setAlignmentX(0.0F);
        jScrollPane15.setAlignmentY(0.0F);
        jScrollPane15.setFont(u.titleFont);
        jScrollPane15.setMaximumSize(new Dimension(0, 0));
        jScrollPane15.setMinimumSize(new Dimension(0, 0));
        jScrollPane15.setName("jScrollPane15"); // NOI18N
        jScrollPane15.setPreferredSize(new Dimension(0, 0));

        missileTable2.setFont(u.listFont);
        missileTable2.setAlignmentX(0.0F);
        missileTable2.setAlignmentY(0.0F);
        missileTable2.setName("missileTable2"); // NOI18N
        missileTable2.setOpaque(false);
        missileTable2.setSelectionModel(missileSelectionModel);
        jScrollPane15.setViewportView(missileTable2);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        MissilePanel.add(jScrollPane15, gridBagConstraints);

        EquipmentTabbedPane.addTab("Missile Stats", MissilePanel);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        getContentPane().add(EquipmentTabbedPane, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JPanel AmmoPanel;
    private JPanel BallisticPanel;
    private JPanel EnergyPanel;
    private JTabbedPane EquipmentTabbedPane;
    private JPanel MissilePanel;
    private JTable ammoTable1;
    private JTable ammoTable2;
    private JTable ballisticTable1;
    private JTable ballisticTable2;
    private JTable energyTable1;
    private JTable energyTable2;
    private JScrollPane jScrollPane10;
    private JScrollPane jScrollPane11;
    private JScrollPane jScrollPane12;
    private JScrollPane jScrollPane13;
    private JScrollPane jScrollPane14;
    private JScrollPane jScrollPane15;
    private JScrollPane jScrollPane8;
    private JScrollPane jScrollPane9;
    private JTable missileTable1;
    private JTable missileTable2;
    // End of variables declaration//GEN-END:variables
}
