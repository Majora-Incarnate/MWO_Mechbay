package MWOMechbay.GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.*;
import java.util.Vector;
import javax.swing.*;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Quicksilver
 */
public class DropCalculatorForm extends JFrame implements MainCommon {
    
    private int pilotCount;
    private int teamTonnage;
    private int teamMaxTonnage;
    
    private int[] mechTonnages = new int[MAX_TEAM_SIZE];
    private Vector<String> pilotNames = new Vector();
    private Vector<String> groupNames = new Vector();
    private Vector<String> variantNames = new Vector();
    
    private HubForm parent;
    public DropCalculatorForm(HubForm nParent) {
        parent = nParent;
        initTeam();
        loadFromFiles();
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        GridBagConstraints gridBagConstraints;

        opForScrollPane = new JScrollPane();
        opForPanel = new JPanel();
        pilotPanel1 = new JPanel();
        idLabel1 = new JLabel();
        mechTonnageLabel1 = new JLabel();
        mechIconLabel1 = new JLabel();
        pilotNameComboBox1 = new JComboBox(pilotNames);
        chassisComboBox1 = new JComboBox(chassisTypes);
        variantComboBox1 = new JComboBox();
        groupComboBox1 = new JComboBox(groupNames);
        roleComboBox1 = new JComboBox(variantNames);
        jScrollPane1 = new JScrollPane();
        jTextArea1 = new JTextArea();
        pilotPanel2 = new JPanel();
        idLabel2 = new JLabel();
        mechTonnageLabel2 = new JLabel();
        mechIconLabel2 = new JLabel();
        pilotNameComboBox2 = new JComboBox(pilotNames);
        chassisComboBox2 = new JComboBox(chassisTypes);
        variantComboBox2 = new JComboBox();
        groupComboBox2 = new JComboBox(groupNames);
        roleComboBox2 = new JComboBox(variantNames);
        jScrollPane2 = new JScrollPane();
        jTextArea2 = new JTextArea();
        pilotPanel3 = new JPanel();
        idLabel3 = new JLabel();
        mechTonnageLabel3 = new JLabel();
        mechIconLabel3 = new JLabel();
        pilotNameComboBox3 = new JComboBox(pilotNames);
        chassisComboBox3 = new JComboBox(chassisTypes);
        variantComboBox3 = new JComboBox();
        groupComboBox3 = new JComboBox(groupNames);
        roleComboBox3 = new JComboBox(variantNames);
        jScrollPane3 = new JScrollPane();
        jTextArea3 = new JTextArea();
        pilotPanel4 = new JPanel();
        idLabel4 = new JLabel();
        mechTonnageLabel4 = new JLabel();
        mechIconLabel4 = new JLabel();
        pilotNameComboBox4 = new JComboBox(pilotNames);
        chassisComboBox4 = new JComboBox(chassisTypes);
        variantComboBox4 = new JComboBox();
        groupComboBox4 = new JComboBox(groupNames);
        roleComboBox4 = new JComboBox(variantNames);
        jScrollPane4 = new JScrollPane();
        jTextArea4 = new JTextArea();
        pilotPanel5 = new JPanel();
        idLabel5 = new JLabel();
        mechTonnageLabel5 = new JLabel();
        mechIconLabel5 = new JLabel();
        pilotNameComboBox5 = new JComboBox(pilotNames);
        chassisComboBox5 = new JComboBox(chassisTypes);
        variantComboBox5 = new JComboBox();
        groupComboBox5 = new JComboBox(groupNames);
        roleComboBox5 = new JComboBox(variantNames);
        jScrollPane5 = new JScrollPane();
        jTextArea5 = new JTextArea();
        pilotPanel6 = new JPanel();
        idLabel6 = new JLabel();
        mechTonnageLabel6 = new JLabel();
        mechIconLabel6 = new JLabel();
        pilotNameComboBox6 = new JComboBox(pilotNames);
        chassisComboBox6 = new JComboBox(chassisTypes);
        variantComboBox6 = new JComboBox();
        groupComboBox6 = new JComboBox(groupNames);
        roleComboBox6 = new JComboBox(variantNames);
        jScrollPane6 = new JScrollPane();
        jTextArea6 = new JTextArea();
        pilotPanel7 = new JPanel();
        idLabel7 = new JLabel();
        mechTonnageLabel7 = new JLabel();
        mechIconLabel7 = new JLabel();
        pilotNameComboBox7 = new JComboBox(pilotNames);
        chassisComboBox7 = new JComboBox(chassisTypes);
        variantComboBox7 = new JComboBox();
        groupComboBox7 = new JComboBox(groupNames);
        roleComboBox7 = new JComboBox(variantNames);
        jScrollPane7 = new JScrollPane();
        jTextArea7 = new JTextArea();
        pilotPanel8 = new JPanel();
        idLabel8 = new JLabel();
        mechTonnageLabel8 = new JLabel();
        mechIconLabel8 = new JLabel();
        pilotNameComboBox8 = new JComboBox(pilotNames);
        chassisComboBox8 = new JComboBox(chassisTypes);
        variantComboBox8 = new JComboBox();
        groupComboBox8 = new JComboBox(groupNames);
        roleComboBox8 = new JComboBox(variantNames);
        jScrollPane8 = new JScrollPane();
        jTextArea8 = new JTextArea();
        pilotPanel9 = new JPanel();
        idLabel9 = new JLabel();
        mechTonnageLabel9 = new JLabel();
        mechIconLabel9 = new JLabel();
        pilotNameComboBox9 = new JComboBox(pilotNames);
        chassisComboBox9 = new JComboBox(chassisTypes);
        variantComboBox9 = new JComboBox();
        groupComboBox9 = new JComboBox(groupNames);
        roleComboBox9 = new JComboBox(variantNames);
        jScrollPane9 = new JScrollPane();
        jTextArea9 = new JTextArea();
        pilotPanel10 = new JPanel();
        idLabel10 = new JLabel();
        mechTonnageLabel10 = new JLabel();
        mechIconLabel10 = new JLabel();
        pilotNameComboBox10 = new JComboBox(pilotNames);
        chassisComboBox10 = new JComboBox(chassisTypes);
        variantComboBox10 = new JComboBox();
        groupComboBox10 = new JComboBox(groupNames);
        roleComboBox10 = new JComboBox(variantNames);
        jScrollPane10 = new JScrollPane();
        jTextArea10 = new JTextArea();
        pilotPanel11 = new JPanel();
        idLabel11 = new JLabel();
        mechTonnageLabel11 = new JLabel();
        mechIconLabel11 = new JLabel();
        pilotNameComboBox11 = new JComboBox(pilotNames);
        chassisComboBox11 = new JComboBox(chassisTypes);
        variantComboBox11 = new JComboBox();
        groupComboBox11 = new JComboBox(groupNames);
        roleComboBox11 = new JComboBox(variantNames);
        jScrollPane11 = new JScrollPane();
        jTextArea11 = new JTextArea();
        pilotPanel12 = new JPanel();
        idLabel12 = new JLabel();
        mechTonnageLabel12 = new JLabel();
        mechIconLabel12 = new JLabel();
        pilotNameComboBox12 = new JComboBox(pilotNames);
        chassisComboBox12 = new JComboBox(chassisTypes);
        variantComboBox12 = new JComboBox();
        groupComboBox12 = new JComboBox(groupNames);
        roleComboBox12 = new JComboBox(variantNames);
        jScrollPane12 = new JScrollPane();
        jTextArea12 = new JTextArea();
        EditPanel = new JPanel();
        forceSizePanel = new JPanel();
        forceSizeLabel = new JLabel();
        decrementForceSizeButton = new JButton();
        incrementForceSizeButton = new JButton();
        forceTonnagePanel = new JPanel();
        forceTonnageLabel = new JLabel();
        decrementForceTonnageButton = new JButton();
        incrementForceTonnageButton = new JButton();
        tonnagePanel = new JPanel();
        currentForceTonnageLabel = new JLabel();
        maxForceTonnageLabel = new JLabel();
        editCustomPanel = new JPanel();
        editPilotsButtons = new JButton();
        editGroupsButtons = new JButton();
        jMenuBar1 = new JMenuBar();
        fileMenu = new JMenu();
        exportForceDecMenuItem = new JMenuItem();
        exportResultsMenuItem = new JMenuItem();
        helpMenu = new JMenu();
        aboutMenuItem = new JMenuItem();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Drop Calculator");
        setLocationByPlatform(true);
        setMinimumSize(new Dimension(900, 510));
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new GridBagLayout());

        opForScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        opForScrollPane.setMaximumSize(new Dimension(800, 480));
        opForScrollPane.setMinimumSize(new Dimension(800, 480));
        opForScrollPane.setPreferredSize(new Dimension(800, 480));

        opForPanel.setFont(opForPanel.getFont().deriveFont((float)11));
        opForPanel.setMaximumSize(new Dimension(480, 1536));
        opForPanel.setMinimumSize(new Dimension(480, 1536));
        opForPanel.setPreferredSize(new Dimension(480, 768));
        opForPanel.setLayout(new GridLayout(12, 1));

        pilotPanel1.setFont(pilotPanel1.getFont().deriveFont((float)11));
        pilotPanel1.setMaximumSize(new Dimension(480, 128));
        pilotPanel1.setMinimumSize(new Dimension(480, 128));
        pilotPanel1.setPreferredSize(new Dimension(480, 128));
        pilotPanel1.setLayout(new GridBagLayout());

        idLabel1.setFont(idLabel1.getFont().deriveFont((float)12));
        idLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        idLabel1.setText("ID#: 1");
        idLabel1.setMaximumSize(new Dimension(64, 32));
        idLabel1.setMinimumSize(new Dimension(64, 32));
        idLabel1.setPreferredSize(new Dimension(64, 32));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        pilotPanel1.add(idLabel1, gridBagConstraints);

        mechTonnageLabel1.setFont(mechTonnageLabel1.getFont().deriveFont((float)12));
        mechTonnageLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        mechTonnageLabel1.setText("0 Tons");
        mechTonnageLabel1.setMaximumSize(new Dimension(64, 32));
        mechTonnageLabel1.setMinimumSize(new Dimension(64, 32));
        mechTonnageLabel1.setPreferredSize(new Dimension(64, 32));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        pilotPanel1.add(mechTonnageLabel1, gridBagConstraints);

        mechIconLabel1.setFont(mechIconLabel1.getFont().deriveFont((float)12));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        pilotPanel1.add(mechIconLabel1, gridBagConstraints);

        pilotNameComboBox1.setFont(pilotNameComboBox1.getFont().deriveFont((float)10));
        pilotNameComboBox1.setBorder(BorderFactory.createEtchedBorder());
        pilotNameComboBox1.setMaximumSize(new Dimension(128, 30));
        pilotNameComboBox1.setMinimumSize(new Dimension(128, 30));
        pilotNameComboBox1.setPreferredSize(new Dimension(128, 32));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        pilotPanel1.add(pilotNameComboBox1, gridBagConstraints);

        chassisComboBox1.setFont(chassisComboBox1.getFont().deriveFont((float)10));
        chassisComboBox1.setBorder(BorderFactory.createEtchedBorder());
        chassisComboBox1.setMaximumSize(new Dimension(128, 30));
        chassisComboBox1.setMinimumSize(new Dimension(128, 30));
        chassisComboBox1.setPreferredSize(new Dimension(128, 32));
        chassisComboBox1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                chassisComboBox1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        pilotPanel1.add(chassisComboBox1, gridBagConstraints);

        variantComboBox1.setFont(variantComboBox1.getFont().deriveFont((float)10));
        variantComboBox1.setModel(new DefaultComboBoxModel(new String[] { "Model" }));
        variantComboBox1.setBorder(BorderFactory.createEtchedBorder());
        variantComboBox1.setMaximumSize(new Dimension(128, 30));
        variantComboBox1.setMinimumSize(new Dimension(128, 30));
        variantComboBox1.setPreferredSize(new Dimension(128, 32));
        variantComboBox1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                variantComboBox1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        pilotPanel1.add(variantComboBox1, gridBagConstraints);

        groupComboBox1.setFont(groupComboBox1.getFont().deriveFont((float)10));
        groupComboBox1.setBorder(BorderFactory.createEtchedBorder());
        groupComboBox1.setMaximumSize(new Dimension(128, 30));
        groupComboBox1.setMinimumSize(new Dimension(128, 30));
        groupComboBox1.setPreferredSize(new Dimension(128, 32));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        pilotPanel1.add(groupComboBox1, gridBagConstraints);

        roleComboBox1.setFont(roleComboBox1.getFont().deriveFont((float)10));
        roleComboBox1.setBorder(BorderFactory.createEtchedBorder());
        roleComboBox1.setMaximumSize(new Dimension(128, 30));
        roleComboBox1.setMinimumSize(new Dimension(128, 30));
        roleComboBox1.setPreferredSize(new Dimension(128, 32));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        pilotPanel1.add(roleComboBox1, gridBagConstraints);

        jScrollPane1.setBorder(BorderFactory.createTitledBorder(null, "Description", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, new Font("Moire", 0, 10))); // NOI18N
        jScrollPane1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setMaximumSize(new Dimension(256, 64));
        jScrollPane1.setMinimumSize(new Dimension(256, 64));
        jScrollPane1.setPreferredSize(new Dimension(256, 64));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(jTextArea1.getFont().deriveFont((float)10));
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setMaximumSize(new Dimension(164, 60));
        jTextArea1.setMinimumSize(new Dimension(164, 60));
        jScrollPane1.setViewportView(jTextArea1);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        pilotPanel1.add(jScrollPane1, gridBagConstraints);

        opForPanel.add(pilotPanel1);

        pilotPanel2.setEnabled(false);
        pilotPanel2.setFont(pilotPanel2.getFont().deriveFont((float)11));
        pilotPanel2.setMaximumSize(new Dimension(480, 128));
        pilotPanel2.setMinimumSize(new Dimension(480, 128));
        pilotPanel2.setPreferredSize(new Dimension(480, 128));
        pilotPanel2.setVisible(false);
        pilotPanel2.setLayout(new GridBagLayout());

        idLabel2.setFont(idLabel2.getFont().deriveFont((float)12));
        idLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        idLabel2.setText("ID#: 2");
        idLabel2.setMaximumSize(new Dimension(64, 32));
        idLabel2.setMinimumSize(new Dimension(64, 32));
        idLabel2.setPreferredSize(new Dimension(64, 32));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        pilotPanel2.add(idLabel2, gridBagConstraints);

        mechTonnageLabel2.setFont(mechTonnageLabel2.getFont().deriveFont((float)12));
        mechTonnageLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        mechTonnageLabel2.setText("0 Tons");
        mechTonnageLabel2.setMaximumSize(new Dimension(64, 32));
        mechTonnageLabel2.setMinimumSize(new Dimension(64, 32));
        mechTonnageLabel2.setPreferredSize(new Dimension(64, 32));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        pilotPanel2.add(mechTonnageLabel2, gridBagConstraints);

        mechIconLabel2.setFont(mechIconLabel2.getFont().deriveFont((float)12));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        pilotPanel2.add(mechIconLabel2, gridBagConstraints);

        pilotNameComboBox2.setFont(pilotNameComboBox2.getFont().deriveFont((float)10));
        pilotNameComboBox2.setBorder(BorderFactory.createEtchedBorder());
        pilotNameComboBox2.setMaximumSize(new Dimension(128, 32));
        pilotNameComboBox2.setMinimumSize(new Dimension(128, 32));
        pilotNameComboBox2.setPreferredSize(new Dimension(128, 32));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        pilotPanel2.add(pilotNameComboBox2, gridBagConstraints);

        chassisComboBox2.setFont(chassisComboBox2.getFont().deriveFont((float)10));
        chassisComboBox2.setBorder(BorderFactory.createEtchedBorder());
        chassisComboBox2.setMaximumSize(new Dimension(128, 32));
        chassisComboBox2.setMinimumSize(new Dimension(128, 32));
        chassisComboBox2.setPreferredSize(new Dimension(128, 32));
        chassisComboBox2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                chassisComboBox2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        pilotPanel2.add(chassisComboBox2, gridBagConstraints);

        variantComboBox2.setFont(variantComboBox2.getFont().deriveFont((float)10));
        variantComboBox2.setModel(new DefaultComboBoxModel(new String[] { "Model" }));
        variantComboBox2.setBorder(BorderFactory.createEtchedBorder());
        variantComboBox2.setMaximumSize(new Dimension(128, 32));
        variantComboBox2.setMinimumSize(new Dimension(128, 32));
        variantComboBox2.setPreferredSize(new Dimension(128, 32));
        variantComboBox2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                variantComboBox2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        pilotPanel2.add(variantComboBox2, gridBagConstraints);

        groupComboBox2.setFont(groupComboBox2.getFont().deriveFont((float)10));
        groupComboBox2.setBorder(BorderFactory.createEtchedBorder());
        groupComboBox2.setMaximumSize(new Dimension(128, 32));
        groupComboBox2.setMinimumSize(new Dimension(128, 32));
        groupComboBox2.setPreferredSize(new Dimension(128, 32));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        pilotPanel2.add(groupComboBox2, gridBagConstraints);

        roleComboBox2.setFont(roleComboBox2.getFont().deriveFont((float)10));
        roleComboBox2.setBorder(BorderFactory.createEtchedBorder());
        roleComboBox2.setMaximumSize(new Dimension(128, 32));
        roleComboBox2.setMinimumSize(new Dimension(128, 32));
        roleComboBox2.setPreferredSize(new Dimension(128, 32));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        pilotPanel2.add(roleComboBox2, gridBagConstraints);

        jScrollPane2.setBorder(BorderFactory.createTitledBorder(null, "Description", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, new Font("Moire", 0, 10))); // NOI18N
        jScrollPane2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setMaximumSize(new Dimension(256, 64));
        jScrollPane2.setMinimumSize(new Dimension(256, 64));
        jScrollPane2.setPreferredSize(new Dimension(256, 64));

        jTextArea2.setColumns(20);
        jTextArea2.setFont(jTextArea2.getFont().deriveFont((float)10));
        jTextArea2.setRows(5);
        jTextArea2.setWrapStyleWord(true);
        jTextArea2.setMaximumSize(new Dimension(164, 60));
        jTextArea2.setMinimumSize(new Dimension(164, 60));
        jScrollPane2.setViewportView(jTextArea2);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        pilotPanel2.add(jScrollPane2, gridBagConstraints);

        opForPanel.add(pilotPanel2);

        pilotPanel3.setEnabled(false);
        pilotPanel3.setFont(pilotPanel3.getFont().deriveFont((float)11));
        pilotPanel3.setMaximumSize(new Dimension(480, 128));
        pilotPanel3.setMinimumSize(new Dimension(480, 128));
        pilotPanel3.setPreferredSize(new Dimension(480, 128));
        pilotPanel3.setVisible(false);
        pilotPanel3.setLayout(new GridBagLayout());

        idLabel3.setFont(idLabel3.getFont().deriveFont((float)12));
        idLabel3.setHorizontalAlignment(SwingConstants.CENTER);
        idLabel3.setText("ID#: 3");
        idLabel3.setMaximumSize(new Dimension(64, 32));
        idLabel3.setMinimumSize(new Dimension(64, 32));
        idLabel3.setPreferredSize(new Dimension(64, 32));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        pilotPanel3.add(idLabel3, gridBagConstraints);

        mechTonnageLabel3.setFont(mechTonnageLabel3.getFont().deriveFont((float)12));
        mechTonnageLabel3.setHorizontalAlignment(SwingConstants.CENTER);
        mechTonnageLabel3.setText("0 Tons");
        mechTonnageLabel3.setMaximumSize(new Dimension(64, 32));
        mechTonnageLabel3.setMinimumSize(new Dimension(64, 32));
        mechTonnageLabel3.setPreferredSize(new Dimension(64, 32));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        pilotPanel3.add(mechTonnageLabel3, gridBagConstraints);

        mechIconLabel3.setFont(mechIconLabel3.getFont().deriveFont((float)12));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        pilotPanel3.add(mechIconLabel3, gridBagConstraints);

        pilotNameComboBox3.setFont(pilotNameComboBox3.getFont().deriveFont((float)10));
        pilotNameComboBox3.setBorder(BorderFactory.createEtchedBorder());
        pilotNameComboBox3.setMaximumSize(new Dimension(128, 32));
        pilotNameComboBox3.setMinimumSize(new Dimension(128, 32));
        pilotNameComboBox3.setPreferredSize(new Dimension(128, 32));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        pilotPanel3.add(pilotNameComboBox3, gridBagConstraints);

        chassisComboBox3.setFont(chassisComboBox3.getFont().deriveFont((float)10));
        chassisComboBox3.setBorder(BorderFactory.createEtchedBorder());
        chassisComboBox3.setMaximumSize(new Dimension(128, 32));
        chassisComboBox3.setMinimumSize(new Dimension(128, 32));
        chassisComboBox3.setPreferredSize(new Dimension(128, 32));
        chassisComboBox3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                chassisComboBox3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        pilotPanel3.add(chassisComboBox3, gridBagConstraints);

        variantComboBox3.setFont(variantComboBox3.getFont().deriveFont((float)10));
        variantComboBox3.setModel(new DefaultComboBoxModel(new String[] { "Model" }));
        variantComboBox3.setBorder(BorderFactory.createEtchedBorder());
        variantComboBox3.setMaximumSize(new Dimension(128, 32));
        variantComboBox3.setMinimumSize(new Dimension(128, 32));
        variantComboBox3.setPreferredSize(new Dimension(128, 32));
        variantComboBox3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                variantComboBox3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        pilotPanel3.add(variantComboBox3, gridBagConstraints);

        groupComboBox3.setFont(groupComboBox3.getFont().deriveFont((float)10));
        groupComboBox3.setBorder(BorderFactory.createEtchedBorder());
        groupComboBox3.setMaximumSize(new Dimension(128, 32));
        groupComboBox3.setMinimumSize(new Dimension(128, 32));
        groupComboBox3.setPreferredSize(new Dimension(128, 32));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        pilotPanel3.add(groupComboBox3, gridBagConstraints);

        roleComboBox3.setFont(roleComboBox3.getFont().deriveFont((float)10));
        roleComboBox3.setBorder(BorderFactory.createEtchedBorder());
        roleComboBox3.setMaximumSize(new Dimension(128, 32));
        roleComboBox3.setMinimumSize(new Dimension(128, 32));
        roleComboBox3.setPreferredSize(new Dimension(128, 32));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        pilotPanel3.add(roleComboBox3, gridBagConstraints);

        jScrollPane3.setBorder(BorderFactory.createTitledBorder(null, "Description", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, new Font("Moire", 0, 10))); // NOI18N
        jScrollPane3.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setMaximumSize(new Dimension(256, 64));
        jScrollPane3.setMinimumSize(new Dimension(256, 64));
        jScrollPane3.setPreferredSize(new Dimension(256, 64));

        jTextArea3.setColumns(20);
        jTextArea3.setFont(jTextArea3.getFont().deriveFont((float)10));
        jTextArea3.setRows(5);
        jTextArea3.setWrapStyleWord(true);
        jTextArea3.setMaximumSize(new Dimension(164, 60));
        jTextArea3.setMinimumSize(new Dimension(164, 60));
        jScrollPane3.setViewportView(jTextArea3);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        pilotPanel3.add(jScrollPane3, gridBagConstraints);

        opForPanel.add(pilotPanel3);

        pilotPanel4.setEnabled(false);
        pilotPanel4.setFont(pilotPanel4.getFont().deriveFont((float)11));
        pilotPanel4.setMaximumSize(new Dimension(480, 128));
        pilotPanel4.setMinimumSize(new Dimension(480, 128));
        pilotPanel4.setPreferredSize(new Dimension(480, 128));
        pilotPanel4.setVisible(false);
        pilotPanel4.setLayout(new GridBagLayout());

        idLabel4.setFont(idLabel4.getFont().deriveFont((float)12));
        idLabel4.setHorizontalAlignment(SwingConstants.CENTER);
        idLabel4.setText("ID#: 4");
        idLabel4.setMaximumSize(new Dimension(64, 32));
        idLabel4.setMinimumSize(new Dimension(64, 32));
        idLabel4.setPreferredSize(new Dimension(64, 32));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        pilotPanel4.add(idLabel4, gridBagConstraints);

        mechTonnageLabel4.setFont(mechTonnageLabel4.getFont().deriveFont((float)12));
        mechTonnageLabel4.setHorizontalAlignment(SwingConstants.CENTER);
        mechTonnageLabel4.setText("0 Tons");
        mechTonnageLabel4.setMaximumSize(new Dimension(64, 32));
        mechTonnageLabel4.setMinimumSize(new Dimension(64, 32));
        mechTonnageLabel4.setPreferredSize(new Dimension(64, 32));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        pilotPanel4.add(mechTonnageLabel4, gridBagConstraints);

        mechIconLabel4.setFont(mechIconLabel4.getFont().deriveFont((float)12));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        pilotPanel4.add(mechIconLabel4, gridBagConstraints);

        pilotNameComboBox4.setFont(pilotNameComboBox4.getFont().deriveFont((float)10));
        pilotNameComboBox4.setBorder(BorderFactory.createEtchedBorder());
        pilotNameComboBox4.setMaximumSize(new Dimension(128, 32));
        pilotNameComboBox4.setMinimumSize(new Dimension(128, 32));
        pilotNameComboBox4.setPreferredSize(new Dimension(128, 32));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        pilotPanel4.add(pilotNameComboBox4, gridBagConstraints);

        chassisComboBox4.setFont(chassisComboBox4.getFont().deriveFont((float)10));
        chassisComboBox4.setBorder(BorderFactory.createEtchedBorder());
        chassisComboBox4.setMaximumSize(new Dimension(128, 32));
        chassisComboBox4.setMinimumSize(new Dimension(128, 32));
        chassisComboBox4.setPreferredSize(new Dimension(128, 32));
        chassisComboBox4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                chassisComboBox4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        pilotPanel4.add(chassisComboBox4, gridBagConstraints);

        variantComboBox4.setFont(variantComboBox4.getFont().deriveFont((float)10));
        variantComboBox4.setModel(new DefaultComboBoxModel(new String[] { "Model" }));
        variantComboBox4.setBorder(BorderFactory.createEtchedBorder());
        variantComboBox4.setMaximumSize(new Dimension(128, 32));
        variantComboBox4.setMinimumSize(new Dimension(128, 32));
        variantComboBox4.setPreferredSize(new Dimension(128, 32));
        variantComboBox4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                variantComboBox4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        pilotPanel4.add(variantComboBox4, gridBagConstraints);

        groupComboBox4.setFont(groupComboBox4.getFont().deriveFont((float)10));
        groupComboBox4.setBorder(BorderFactory.createEtchedBorder());
        groupComboBox4.setMaximumSize(new Dimension(128, 32));
        groupComboBox4.setMinimumSize(new Dimension(128, 32));
        groupComboBox4.setPreferredSize(new Dimension(128, 32));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        pilotPanel4.add(groupComboBox4, gridBagConstraints);

        roleComboBox4.setFont(roleComboBox4.getFont().deriveFont((float)10));
        roleComboBox4.setBorder(BorderFactory.createEtchedBorder());
        roleComboBox4.setMaximumSize(new Dimension(128, 32));
        roleComboBox4.setMinimumSize(new Dimension(128, 32));
        roleComboBox4.setPreferredSize(new Dimension(128, 32));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        pilotPanel4.add(roleComboBox4, gridBagConstraints);

        jScrollPane4.setBorder(BorderFactory.createTitledBorder(null, "Description", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, new Font("Moire", 0, 10))); // NOI18N
        jScrollPane4.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setMaximumSize(new Dimension(256, 64));
        jScrollPane4.setMinimumSize(new Dimension(256, 64));
        jScrollPane4.setPreferredSize(new Dimension(256, 64));

        jTextArea4.setColumns(20);
        jTextArea4.setFont(jTextArea4.getFont().deriveFont((float)10));
        jTextArea4.setRows(5);
        jTextArea4.setWrapStyleWord(true);
        jTextArea4.setMaximumSize(new Dimension(164, 60));
        jTextArea4.setMinimumSize(new Dimension(164, 60));
        jScrollPane4.setViewportView(jTextArea4);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        pilotPanel4.add(jScrollPane4, gridBagConstraints);

        opForPanel.add(pilotPanel4);

        pilotPanel5.setEnabled(false);
        pilotPanel5.setFont(pilotPanel5.getFont().deriveFont((float)11));
        pilotPanel5.setMaximumSize(new Dimension(480, 128));
        pilotPanel5.setMinimumSize(new Dimension(480, 128));
        pilotPanel5.setPreferredSize(new Dimension(480, 128));
        pilotPanel5.setVisible(false);
        pilotPanel5.setLayout(new GridBagLayout());

        idLabel5.setFont(idLabel5.getFont().deriveFont((float)12));
        idLabel5.setHorizontalAlignment(SwingConstants.CENTER);
        idLabel5.setText("ID#: 5");
        idLabel5.setMaximumSize(new Dimension(64, 32));
        idLabel5.setMinimumSize(new Dimension(64, 32));
        idLabel5.setPreferredSize(new Dimension(64, 32));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        pilotPanel5.add(idLabel5, gridBagConstraints);

        mechTonnageLabel5.setFont(mechTonnageLabel5.getFont().deriveFont((float)12));
        mechTonnageLabel5.setHorizontalAlignment(SwingConstants.CENTER);
        mechTonnageLabel5.setText("0 Tons");
        mechTonnageLabel5.setMaximumSize(new Dimension(64, 32));
        mechTonnageLabel5.setMinimumSize(new Dimension(64, 32));
        mechTonnageLabel5.setPreferredSize(new Dimension(64, 32));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        pilotPanel5.add(mechTonnageLabel5, gridBagConstraints);

        mechIconLabel5.setFont(mechIconLabel5.getFont().deriveFont((float)12));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        pilotPanel5.add(mechIconLabel5, gridBagConstraints);

        pilotNameComboBox5.setFont(pilotNameComboBox5.getFont().deriveFont((float)10));
        pilotNameComboBox5.setBorder(BorderFactory.createEtchedBorder());
        pilotNameComboBox5.setMaximumSize(new Dimension(128, 32));
        pilotNameComboBox5.setMinimumSize(new Dimension(128, 32));
        pilotNameComboBox5.setPreferredSize(new Dimension(128, 32));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        pilotPanel5.add(pilotNameComboBox5, gridBagConstraints);

        chassisComboBox5.setFont(chassisComboBox5.getFont().deriveFont((float)10));
        chassisComboBox5.setBorder(BorderFactory.createEtchedBorder());
        chassisComboBox5.setMaximumSize(new Dimension(128, 32));
        chassisComboBox5.setMinimumSize(new Dimension(128, 32));
        chassisComboBox5.setPreferredSize(new Dimension(128, 32));
        chassisComboBox5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                chassisComboBox5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        pilotPanel5.add(chassisComboBox5, gridBagConstraints);

        variantComboBox5.setFont(variantComboBox5.getFont().deriveFont((float)10));
        variantComboBox5.setModel(new DefaultComboBoxModel(new String[] { "Model" }));
        variantComboBox5.setBorder(BorderFactory.createEtchedBorder());
        variantComboBox5.setMaximumSize(new Dimension(128, 32));
        variantComboBox5.setMinimumSize(new Dimension(128, 32));
        variantComboBox5.setPreferredSize(new Dimension(128, 32));
        variantComboBox5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                variantComboBox5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        pilotPanel5.add(variantComboBox5, gridBagConstraints);

        groupComboBox5.setFont(groupComboBox5.getFont().deriveFont((float)10));
        groupComboBox5.setBorder(BorderFactory.createEtchedBorder());
        groupComboBox5.setMaximumSize(new Dimension(128, 32));
        groupComboBox5.setMinimumSize(new Dimension(128, 32));
        groupComboBox5.setPreferredSize(new Dimension(128, 32));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        pilotPanel5.add(groupComboBox5, gridBagConstraints);

        roleComboBox5.setFont(roleComboBox5.getFont().deriveFont((float)10));
        roleComboBox5.setBorder(BorderFactory.createEtchedBorder());
        roleComboBox5.setMaximumSize(new Dimension(128, 32));
        roleComboBox5.setMinimumSize(new Dimension(128, 32));
        roleComboBox5.setPreferredSize(new Dimension(128, 32));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        pilotPanel5.add(roleComboBox5, gridBagConstraints);

        jScrollPane5.setBorder(BorderFactory.createTitledBorder(null, "Description", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, new Font("Moire", 0, 10))); // NOI18N
        jScrollPane5.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane5.setMaximumSize(new Dimension(256, 64));
        jScrollPane5.setMinimumSize(new Dimension(256, 64));
        jScrollPane5.setPreferredSize(new Dimension(256, 64));

        jTextArea5.setColumns(20);
        jTextArea5.setFont(jTextArea5.getFont().deriveFont((float)10));
        jTextArea5.setRows(5);
        jTextArea5.setWrapStyleWord(true);
        jTextArea5.setMaximumSize(new Dimension(164, 60));
        jTextArea5.setMinimumSize(new Dimension(164, 60));
        jScrollPane5.setViewportView(jTextArea5);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        pilotPanel5.add(jScrollPane5, gridBagConstraints);

        opForPanel.add(pilotPanel5);

        pilotPanel6.setEnabled(false);
        pilotPanel6.setFont(pilotPanel6.getFont().deriveFont((float)11));
        pilotPanel6.setMaximumSize(new Dimension(480, 128));
        pilotPanel6.setMinimumSize(new Dimension(480, 128));
        pilotPanel6.setPreferredSize(new Dimension(480, 128));
        pilotPanel6.setVisible(false);
        pilotPanel6.setLayout(new GridBagLayout());

        idLabel6.setFont(idLabel6.getFont().deriveFont((float)12));
        idLabel6.setHorizontalAlignment(SwingConstants.CENTER);
        idLabel6.setText("ID#: 6");
        idLabel6.setMaximumSize(new Dimension(64, 32));
        idLabel6.setMinimumSize(new Dimension(64, 32));
        idLabel6.setPreferredSize(new Dimension(64, 32));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        pilotPanel6.add(idLabel6, gridBagConstraints);

        mechTonnageLabel6.setFont(mechTonnageLabel6.getFont().deriveFont((float)12));
        mechTonnageLabel6.setHorizontalAlignment(SwingConstants.CENTER);
        mechTonnageLabel6.setText("0 Tons");
        mechTonnageLabel6.setMaximumSize(new Dimension(64, 32));
        mechTonnageLabel6.setMinimumSize(new Dimension(64, 32));
        mechTonnageLabel6.setPreferredSize(new Dimension(64, 32));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        pilotPanel6.add(mechTonnageLabel6, gridBagConstraints);

        mechIconLabel6.setFont(mechIconLabel6.getFont().deriveFont((float)12));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        pilotPanel6.add(mechIconLabel6, gridBagConstraints);

        pilotNameComboBox6.setFont(pilotNameComboBox6.getFont().deriveFont((float)10));
        pilotNameComboBox6.setBorder(BorderFactory.createEtchedBorder());
        pilotNameComboBox6.setMaximumSize(new Dimension(128, 32));
        pilotNameComboBox6.setMinimumSize(new Dimension(128, 32));
        pilotNameComboBox6.setPreferredSize(new Dimension(128, 32));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        pilotPanel6.add(pilotNameComboBox6, gridBagConstraints);

        chassisComboBox6.setFont(chassisComboBox6.getFont().deriveFont((float)10));
        chassisComboBox6.setBorder(BorderFactory.createEtchedBorder());
        chassisComboBox6.setMaximumSize(new Dimension(128, 32));
        chassisComboBox6.setMinimumSize(new Dimension(128, 32));
        chassisComboBox6.setPreferredSize(new Dimension(128, 32));
        chassisComboBox6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                chassisComboBox6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        pilotPanel6.add(chassisComboBox6, gridBagConstraints);

        variantComboBox6.setFont(variantComboBox6.getFont().deriveFont((float)10));
        variantComboBox6.setModel(new DefaultComboBoxModel(new String[] { "Model" }));
        variantComboBox6.setBorder(BorderFactory.createEtchedBorder());
        variantComboBox6.setMaximumSize(new Dimension(128, 32));
        variantComboBox6.setMinimumSize(new Dimension(128, 32));
        variantComboBox6.setPreferredSize(new Dimension(128, 32));
        variantComboBox6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                variantComboBox6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        pilotPanel6.add(variantComboBox6, gridBagConstraints);

        groupComboBox6.setFont(groupComboBox6.getFont().deriveFont((float)10));
        groupComboBox6.setBorder(BorderFactory.createEtchedBorder());
        groupComboBox6.setMaximumSize(new Dimension(128, 32));
        groupComboBox6.setMinimumSize(new Dimension(128, 32));
        groupComboBox6.setPreferredSize(new Dimension(128, 32));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        pilotPanel6.add(groupComboBox6, gridBagConstraints);

        roleComboBox6.setFont(roleComboBox6.getFont().deriveFont((float)10));
        roleComboBox6.setBorder(BorderFactory.createEtchedBorder());
        roleComboBox6.setMaximumSize(new Dimension(128, 32));
        roleComboBox6.setMinimumSize(new Dimension(128, 32));
        roleComboBox6.setPreferredSize(new Dimension(128, 32));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        pilotPanel6.add(roleComboBox6, gridBagConstraints);

        jScrollPane6.setBorder(BorderFactory.createTitledBorder(null, "Description", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, new Font("Moire", 0, 10))); // NOI18N
        jScrollPane6.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane6.setMaximumSize(new Dimension(256, 64));
        jScrollPane6.setMinimumSize(new Dimension(256, 64));
        jScrollPane6.setPreferredSize(new Dimension(256, 64));

        jTextArea6.setColumns(20);
        jTextArea6.setFont(jTextArea6.getFont().deriveFont((float)10));
        jTextArea6.setRows(5);
        jTextArea6.setWrapStyleWord(true);
        jTextArea6.setMaximumSize(new Dimension(164, 60));
        jTextArea6.setMinimumSize(new Dimension(164, 60));
        jScrollPane6.setViewportView(jTextArea6);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        pilotPanel6.add(jScrollPane6, gridBagConstraints);

        opForPanel.add(pilotPanel6);

        pilotPanel7.setEnabled(false);
        pilotPanel7.setFont(pilotPanel7.getFont().deriveFont((float)11));
        pilotPanel7.setMaximumSize(new Dimension(480, 128));
        pilotPanel7.setMinimumSize(new Dimension(480, 128));
        pilotPanel7.setPreferredSize(new Dimension(480, 128));
        pilotPanel7.setVisible(false);
        pilotPanel7.setLayout(new GridBagLayout());

        idLabel7.setFont(idLabel7.getFont().deriveFont((float)12));
        idLabel7.setHorizontalAlignment(SwingConstants.CENTER);
        idLabel7.setText("ID#: 7");
        idLabel7.setMaximumSize(new Dimension(64, 32));
        idLabel7.setMinimumSize(new Dimension(64, 32));
        idLabel7.setPreferredSize(new Dimension(64, 32));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        pilotPanel7.add(idLabel7, gridBagConstraints);

        mechTonnageLabel7.setFont(mechTonnageLabel7.getFont().deriveFont((float)12));
        mechTonnageLabel7.setHorizontalAlignment(SwingConstants.CENTER);
        mechTonnageLabel7.setText("0 Tons");
        mechTonnageLabel7.setMaximumSize(new Dimension(64, 32));
        mechTonnageLabel7.setMinimumSize(new Dimension(64, 32));
        mechTonnageLabel7.setPreferredSize(new Dimension(64, 32));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        pilotPanel7.add(mechTonnageLabel7, gridBagConstraints);

        mechIconLabel7.setFont(mechIconLabel7.getFont().deriveFont((float)12));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        pilotPanel7.add(mechIconLabel7, gridBagConstraints);

        pilotNameComboBox7.setFont(pilotNameComboBox7.getFont().deriveFont((float)10));
        pilotNameComboBox7.setBorder(BorderFactory.createEtchedBorder());
        pilotNameComboBox7.setMaximumSize(new Dimension(128, 32));
        pilotNameComboBox7.setMinimumSize(new Dimension(128, 32));
        pilotNameComboBox7.setPreferredSize(new Dimension(128, 32));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        pilotPanel7.add(pilotNameComboBox7, gridBagConstraints);

        chassisComboBox7.setFont(chassisComboBox7.getFont().deriveFont((float)10));
        chassisComboBox7.setBorder(BorderFactory.createEtchedBorder());
        chassisComboBox7.setMaximumSize(new Dimension(128, 32));
        chassisComboBox7.setMinimumSize(new Dimension(128, 32));
        chassisComboBox7.setPreferredSize(new Dimension(128, 32));
        chassisComboBox7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                chassisComboBox7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        pilotPanel7.add(chassisComboBox7, gridBagConstraints);

        variantComboBox7.setFont(variantComboBox7.getFont().deriveFont((float)10));
        variantComboBox7.setModel(new DefaultComboBoxModel(new String[] { "Model" }));
        variantComboBox7.setBorder(BorderFactory.createEtchedBorder());
        variantComboBox7.setMaximumSize(new Dimension(128, 32));
        variantComboBox7.setMinimumSize(new Dimension(128, 32));
        variantComboBox7.setPreferredSize(new Dimension(128, 32));
        variantComboBox7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                variantComboBox7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        pilotPanel7.add(variantComboBox7, gridBagConstraints);

        groupComboBox7.setFont(groupComboBox7.getFont().deriveFont((float)10));
        groupComboBox7.setBorder(BorderFactory.createEtchedBorder());
        groupComboBox7.setMaximumSize(new Dimension(128, 32));
        groupComboBox7.setMinimumSize(new Dimension(128, 32));
        groupComboBox7.setPreferredSize(new Dimension(128, 32));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        pilotPanel7.add(groupComboBox7, gridBagConstraints);

        roleComboBox7.setFont(roleComboBox7.getFont().deriveFont((float)10));
        roleComboBox7.setBorder(BorderFactory.createEtchedBorder());
        roleComboBox7.setMaximumSize(new Dimension(128, 32));
        roleComboBox7.setMinimumSize(new Dimension(128, 32));
        roleComboBox7.setPreferredSize(new Dimension(128, 32));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        pilotPanel7.add(roleComboBox7, gridBagConstraints);

        jScrollPane7.setBorder(BorderFactory.createTitledBorder(null, "Description", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, new Font("Moire", 0, 10))); // NOI18N
        jScrollPane7.setMaximumSize(new Dimension(256, 64));
        jScrollPane7.setMinimumSize(new Dimension(256, 64));
        jScrollPane7.setPreferredSize(new Dimension(256, 64));

        jTextArea7.setColumns(20);
        jTextArea7.setFont(jTextArea7.getFont().deriveFont((float)10));
        jTextArea7.setRows(5);
        jTextArea7.setWrapStyleWord(true);
        jTextArea7.setMaximumSize(new Dimension(164, 60));
        jTextArea7.setMinimumSize(new Dimension(164, 60));
        jScrollPane7.setViewportView(jTextArea7);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        pilotPanel7.add(jScrollPane7, gridBagConstraints);

        opForPanel.add(pilotPanel7);

        pilotPanel8.setEnabled(false);
        pilotPanel8.setFont(pilotPanel8.getFont().deriveFont((float)11));
        pilotPanel8.setMaximumSize(new Dimension(480, 128));
        pilotPanel8.setMinimumSize(new Dimension(480, 128));
        pilotPanel8.setPreferredSize(new Dimension(480, 128));
        pilotPanel8.setVisible(false);
        pilotPanel8.setLayout(new GridBagLayout());

        idLabel8.setFont(idLabel8.getFont().deriveFont((float)12));
        idLabel8.setHorizontalAlignment(SwingConstants.CENTER);
        idLabel8.setText("ID#: 8");
        idLabel8.setMaximumSize(new Dimension(64, 32));
        idLabel8.setMinimumSize(new Dimension(64, 32));
        idLabel8.setPreferredSize(new Dimension(64, 32));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        pilotPanel8.add(idLabel8, gridBagConstraints);

        mechTonnageLabel8.setFont(mechTonnageLabel8.getFont().deriveFont((float)12));
        mechTonnageLabel8.setHorizontalAlignment(SwingConstants.CENTER);
        mechTonnageLabel8.setText("0 Tons");
        mechTonnageLabel8.setMaximumSize(new Dimension(64, 32));
        mechTonnageLabel8.setMinimumSize(new Dimension(64, 32));
        mechTonnageLabel8.setPreferredSize(new Dimension(64, 32));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        pilotPanel8.add(mechTonnageLabel8, gridBagConstraints);

        mechIconLabel8.setFont(mechIconLabel8.getFont().deriveFont((float)12));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        pilotPanel8.add(mechIconLabel8, gridBagConstraints);

        pilotNameComboBox8.setFont(pilotNameComboBox8.getFont().deriveFont((float)10));
        pilotNameComboBox8.setBorder(BorderFactory.createEtchedBorder());
        pilotNameComboBox8.setMaximumSize(new Dimension(128, 32));
        pilotNameComboBox8.setMinimumSize(new Dimension(128, 32));
        pilotNameComboBox8.setPreferredSize(new Dimension(128, 32));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        pilotPanel8.add(pilotNameComboBox8, gridBagConstraints);

        chassisComboBox8.setFont(chassisComboBox8.getFont().deriveFont((float)10));
        chassisComboBox8.setBorder(BorderFactory.createEtchedBorder());
        chassisComboBox8.setMaximumSize(new Dimension(128, 32));
        chassisComboBox8.setMinimumSize(new Dimension(128, 32));
        chassisComboBox8.setPreferredSize(new Dimension(128, 32));
        chassisComboBox8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                chassisComboBox8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        pilotPanel8.add(chassisComboBox8, gridBagConstraints);

        variantComboBox8.setFont(variantComboBox8.getFont().deriveFont((float)10));
        variantComboBox8.setModel(new DefaultComboBoxModel(new String[] { "Model" }));
        variantComboBox8.setBorder(BorderFactory.createEtchedBorder());
        variantComboBox8.setMaximumSize(new Dimension(128, 32));
        variantComboBox8.setMinimumSize(new Dimension(128, 32));
        variantComboBox8.setPreferredSize(new Dimension(128, 32));
        variantComboBox8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                variantComboBox8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        pilotPanel8.add(variantComboBox8, gridBagConstraints);

        groupComboBox8.setFont(groupComboBox8.getFont().deriveFont((float)10));
        groupComboBox8.setBorder(BorderFactory.createEtchedBorder());
        groupComboBox8.setMaximumSize(new Dimension(128, 32));
        groupComboBox8.setMinimumSize(new Dimension(128, 32));
        groupComboBox8.setPreferredSize(new Dimension(128, 32));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        pilotPanel8.add(groupComboBox8, gridBagConstraints);

        roleComboBox8.setFont(roleComboBox8.getFont().deriveFont((float)10));
        roleComboBox8.setBorder(BorderFactory.createEtchedBorder());
        roleComboBox8.setMaximumSize(new Dimension(128, 32));
        roleComboBox8.setMinimumSize(new Dimension(128, 32));
        roleComboBox8.setPreferredSize(new Dimension(128, 32));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        pilotPanel8.add(roleComboBox8, gridBagConstraints);

        jScrollPane8.setBorder(BorderFactory.createTitledBorder(null, "Description", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, new Font("Moire", 0, 10))); // NOI18N
        jScrollPane8.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane8.setMaximumSize(new Dimension(256, 64));
        jScrollPane8.setMinimumSize(new Dimension(256, 64));
        jScrollPane8.setPreferredSize(new Dimension(256, 64));

        jTextArea8.setColumns(20);
        jTextArea8.setFont(jTextArea8.getFont().deriveFont((float)10));
        jTextArea8.setRows(5);
        jTextArea8.setWrapStyleWord(true);
        jTextArea8.setMaximumSize(new Dimension(164, 60));
        jTextArea8.setMinimumSize(new Dimension(164, 60));
        jScrollPane8.setViewportView(jTextArea8);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        pilotPanel8.add(jScrollPane8, gridBagConstraints);

        opForPanel.add(pilotPanel8);

        pilotPanel9.setEnabled(false);
        pilotPanel9.setFont(pilotPanel9.getFont().deriveFont((float)11));
        pilotPanel9.setMaximumSize(new Dimension(480, 128));
        pilotPanel9.setMinimumSize(new Dimension(480, 128));
        pilotPanel9.setPreferredSize(new Dimension(480, 128));
        pilotPanel9.setVisible(false);
        pilotPanel9.setLayout(new GridBagLayout());

        idLabel9.setFont(idLabel9.getFont().deriveFont((float)12));
        idLabel9.setHorizontalAlignment(SwingConstants.CENTER);
        idLabel9.setText("ID#: 9");
        idLabel9.setMaximumSize(new Dimension(64, 32));
        idLabel9.setMinimumSize(new Dimension(64, 32));
        idLabel9.setPreferredSize(new Dimension(64, 32));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        pilotPanel9.add(idLabel9, gridBagConstraints);

        mechTonnageLabel9.setFont(mechTonnageLabel9.getFont().deriveFont((float)12));
        mechTonnageLabel9.setHorizontalAlignment(SwingConstants.CENTER);
        mechTonnageLabel9.setText("0 Tons");
        mechTonnageLabel9.setMaximumSize(new Dimension(64, 32));
        mechTonnageLabel9.setMinimumSize(new Dimension(64, 32));
        mechTonnageLabel9.setPreferredSize(new Dimension(64, 32));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        pilotPanel9.add(mechTonnageLabel9, gridBagConstraints);

        mechIconLabel9.setFont(mechIconLabel9.getFont().deriveFont((float)12));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        pilotPanel9.add(mechIconLabel9, gridBagConstraints);

        pilotNameComboBox9.setFont(pilotNameComboBox9.getFont().deriveFont((float)10));
        pilotNameComboBox9.setBorder(BorderFactory.createEtchedBorder());
        pilotNameComboBox9.setMaximumSize(new Dimension(128, 32));
        pilotNameComboBox9.setMinimumSize(new Dimension(128, 32));
        pilotNameComboBox9.setPreferredSize(new Dimension(128, 32));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        pilotPanel9.add(pilotNameComboBox9, gridBagConstraints);

        chassisComboBox9.setFont(chassisComboBox9.getFont().deriveFont((float)10));
        chassisComboBox9.setBorder(BorderFactory.createEtchedBorder());
        chassisComboBox9.setMaximumSize(new Dimension(128, 32));
        chassisComboBox9.setMinimumSize(new Dimension(128, 32));
        chassisComboBox9.setPreferredSize(new Dimension(128, 32));
        chassisComboBox9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                chassisComboBox9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        pilotPanel9.add(chassisComboBox9, gridBagConstraints);

        variantComboBox9.setFont(variantComboBox9.getFont().deriveFont((float)10));
        variantComboBox9.setModel(new DefaultComboBoxModel(new String[] { "Model" }));
        variantComboBox9.setBorder(BorderFactory.createEtchedBorder());
        variantComboBox9.setMaximumSize(new Dimension(128, 32));
        variantComboBox9.setMinimumSize(new Dimension(128, 32));
        variantComboBox9.setPreferredSize(new Dimension(128, 32));
        variantComboBox9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                variantComboBox9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        pilotPanel9.add(variantComboBox9, gridBagConstraints);

        groupComboBox9.setFont(groupComboBox9.getFont().deriveFont((float)10));
        groupComboBox9.setBorder(BorderFactory.createEtchedBorder());
        groupComboBox9.setMaximumSize(new Dimension(128, 32));
        groupComboBox9.setMinimumSize(new Dimension(128, 32));
        groupComboBox9.setPreferredSize(new Dimension(128, 32));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        pilotPanel9.add(groupComboBox9, gridBagConstraints);

        roleComboBox9.setFont(roleComboBox9.getFont().deriveFont((float)10));
        roleComboBox9.setBorder(BorderFactory.createEtchedBorder());
        roleComboBox9.setMaximumSize(new Dimension(128, 32));
        roleComboBox9.setMinimumSize(new Dimension(128, 32));
        roleComboBox9.setPreferredSize(new Dimension(128, 32));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        pilotPanel9.add(roleComboBox9, gridBagConstraints);

        jScrollPane9.setBorder(BorderFactory.createTitledBorder(null, "Description", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, new Font("Moire", 0, 10))); // NOI18N
        jScrollPane9.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane9.setMaximumSize(new Dimension(256, 64));
        jScrollPane9.setMinimumSize(new Dimension(256, 64));
        jScrollPane9.setPreferredSize(new Dimension(256, 64));

        jTextArea9.setColumns(20);
        jTextArea9.setFont(jTextArea9.getFont().deriveFont((float)10));
        jTextArea9.setRows(5);
        jTextArea9.setWrapStyleWord(true);
        jTextArea9.setMaximumSize(new Dimension(164, 60));
        jTextArea9.setMinimumSize(new Dimension(164, 60));
        jScrollPane9.setViewportView(jTextArea9);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        pilotPanel9.add(jScrollPane9, gridBagConstraints);

        opForPanel.add(pilotPanel9);

        pilotPanel10.setEnabled(false);
        pilotPanel10.setFont(pilotPanel10.getFont().deriveFont((float)11));
        pilotPanel10.setMaximumSize(new Dimension(480, 128));
        pilotPanel10.setMinimumSize(new Dimension(480, 128));
        pilotPanel10.setPreferredSize(new Dimension(480, 128));
        pilotPanel10.setVisible(false);
        pilotPanel10.setLayout(new GridBagLayout());

        idLabel10.setFont(idLabel10.getFont().deriveFont((float)12));
        idLabel10.setHorizontalAlignment(SwingConstants.CENTER);
        idLabel10.setText("ID#: 10");
        idLabel10.setMaximumSize(new Dimension(64, 32));
        idLabel10.setMinimumSize(new Dimension(64, 32));
        idLabel10.setPreferredSize(new Dimension(64, 32));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        pilotPanel10.add(idLabel10, gridBagConstraints);

        mechTonnageLabel10.setFont(mechTonnageLabel10.getFont().deriveFont((float)12));
        mechTonnageLabel10.setHorizontalAlignment(SwingConstants.CENTER);
        mechTonnageLabel10.setText("0 Tons");
        mechTonnageLabel10.setMaximumSize(new Dimension(64, 32));
        mechTonnageLabel10.setMinimumSize(new Dimension(64, 32));
        mechTonnageLabel10.setPreferredSize(new Dimension(64, 32));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        pilotPanel10.add(mechTonnageLabel10, gridBagConstraints);

        mechIconLabel10.setFont(mechIconLabel10.getFont().deriveFont((float)12));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        pilotPanel10.add(mechIconLabel10, gridBagConstraints);

        pilotNameComboBox10.setFont(pilotNameComboBox10.getFont().deriveFont((float)10));
        pilotNameComboBox10.setBorder(BorderFactory.createEtchedBorder());
        pilotNameComboBox10.setMaximumSize(new Dimension(128, 32));
        pilotNameComboBox10.setMinimumSize(new Dimension(128, 32));
        pilotNameComboBox10.setPreferredSize(new Dimension(128, 32));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        pilotPanel10.add(pilotNameComboBox10, gridBagConstraints);

        chassisComboBox10.setFont(chassisComboBox10.getFont().deriveFont((float)10));
        chassisComboBox10.setBorder(BorderFactory.createEtchedBorder());
        chassisComboBox10.setMaximumSize(new Dimension(128, 32));
        chassisComboBox10.setMinimumSize(new Dimension(128, 32));
        chassisComboBox10.setPreferredSize(new Dimension(128, 32));
        chassisComboBox10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                chassisComboBox10ActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        pilotPanel10.add(chassisComboBox10, gridBagConstraints);

        variantComboBox10.setFont(variantComboBox10.getFont().deriveFont((float)10));
        variantComboBox10.setModel(new DefaultComboBoxModel(new String[] { "Model" }));
        variantComboBox10.setBorder(BorderFactory.createEtchedBorder());
        variantComboBox10.setMaximumSize(new Dimension(128, 32));
        variantComboBox10.setMinimumSize(new Dimension(128, 32));
        variantComboBox10.setPreferredSize(new Dimension(128, 32));
        variantComboBox10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                variantComboBox10ActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        pilotPanel10.add(variantComboBox10, gridBagConstraints);

        groupComboBox10.setFont(groupComboBox10.getFont().deriveFont((float)10));
        groupComboBox10.setBorder(BorderFactory.createEtchedBorder());
        groupComboBox10.setMaximumSize(new Dimension(128, 32));
        groupComboBox10.setMinimumSize(new Dimension(128, 32));
        groupComboBox10.setPreferredSize(new Dimension(128, 32));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        pilotPanel10.add(groupComboBox10, gridBagConstraints);

        roleComboBox10.setFont(roleComboBox10.getFont().deriveFont((float)10));
        roleComboBox10.setBorder(BorderFactory.createEtchedBorder());
        roleComboBox10.setMaximumSize(new Dimension(128, 32));
        roleComboBox10.setMinimumSize(new Dimension(128, 32));
        roleComboBox10.setPreferredSize(new Dimension(128, 32));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        pilotPanel10.add(roleComboBox10, gridBagConstraints);

        jScrollPane10.setBorder(BorderFactory.createTitledBorder(null, "Description", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, new Font("Moire", 0, 10))); // NOI18N
        jScrollPane10.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane10.setMaximumSize(new Dimension(256, 64));
        jScrollPane10.setMinimumSize(new Dimension(256, 64));
        jScrollPane10.setPreferredSize(new Dimension(256, 64));

        jTextArea10.setColumns(20);
        jTextArea10.setFont(jTextArea10.getFont().deriveFont((float)10));
        jTextArea10.setRows(5);
        jTextArea10.setWrapStyleWord(true);
        jTextArea10.setMaximumSize(new Dimension(164, 60));
        jTextArea10.setMinimumSize(new Dimension(164, 60));
        jScrollPane10.setViewportView(jTextArea10);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        pilotPanel10.add(jScrollPane10, gridBagConstraints);

        opForPanel.add(pilotPanel10);

        pilotPanel11.setEnabled(false);
        pilotPanel11.setFont(pilotPanel11.getFont().deriveFont((float)11));
        pilotPanel11.setMaximumSize(new Dimension(480, 128));
        pilotPanel11.setMinimumSize(new Dimension(480, 128));
        pilotPanel11.setPreferredSize(new Dimension(480, 128));
        pilotPanel11.setVisible(false);
        pilotPanel11.setLayout(new GridBagLayout());

        idLabel11.setFont(idLabel11.getFont().deriveFont((float)12));
        idLabel11.setHorizontalAlignment(SwingConstants.CENTER);
        idLabel11.setText("ID#: 11");
        idLabel11.setMaximumSize(new Dimension(64, 32));
        idLabel11.setMinimumSize(new Dimension(64, 32));
        idLabel11.setPreferredSize(new Dimension(64, 32));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        pilotPanel11.add(idLabel11, gridBagConstraints);

        mechTonnageLabel11.setFont(mechTonnageLabel11.getFont().deriveFont((float)12));
        mechTonnageLabel11.setHorizontalAlignment(SwingConstants.CENTER);
        mechTonnageLabel11.setText("0 Tons");
        mechTonnageLabel11.setMaximumSize(new Dimension(64, 32));
        mechTonnageLabel11.setMinimumSize(new Dimension(64, 32));
        mechTonnageLabel11.setPreferredSize(new Dimension(64, 32));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        pilotPanel11.add(mechTonnageLabel11, gridBagConstraints);

        mechIconLabel11.setFont(mechIconLabel11.getFont().deriveFont((float)12));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        pilotPanel11.add(mechIconLabel11, gridBagConstraints);

        pilotNameComboBox11.setFont(pilotNameComboBox11.getFont().deriveFont((float)10));
        pilotNameComboBox11.setBorder(BorderFactory.createEtchedBorder());
        pilotNameComboBox11.setMaximumSize(new Dimension(128, 32));
        pilotNameComboBox11.setMinimumSize(new Dimension(128, 32));
        pilotNameComboBox11.setPreferredSize(new Dimension(128, 32));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        pilotPanel11.add(pilotNameComboBox11, gridBagConstraints);

        chassisComboBox11.setFont(chassisComboBox11.getFont().deriveFont((float)10));
        chassisComboBox11.setBorder(BorderFactory.createEtchedBorder());
        chassisComboBox11.setMaximumSize(new Dimension(128, 32));
        chassisComboBox11.setMinimumSize(new Dimension(128, 32));
        chassisComboBox11.setPreferredSize(new Dimension(128, 32));
        chassisComboBox11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                chassisComboBox11ActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        pilotPanel11.add(chassisComboBox11, gridBagConstraints);

        variantComboBox11.setFont(variantComboBox11.getFont().deriveFont((float)10));
        variantComboBox11.setModel(new DefaultComboBoxModel(new String[] { "Model" }));
        variantComboBox11.setBorder(BorderFactory.createEtchedBorder());
        variantComboBox11.setMaximumSize(new Dimension(128, 32));
        variantComboBox11.setMinimumSize(new Dimension(128, 32));
        variantComboBox11.setPreferredSize(new Dimension(128, 32));
        variantComboBox11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                variantComboBox11ActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        pilotPanel11.add(variantComboBox11, gridBagConstraints);

        groupComboBox11.setFont(groupComboBox11.getFont().deriveFont((float)10));
        groupComboBox11.setBorder(BorderFactory.createEtchedBorder());
        groupComboBox11.setMaximumSize(new Dimension(128, 32));
        groupComboBox11.setMinimumSize(new Dimension(128, 32));
        groupComboBox11.setPreferredSize(new Dimension(128, 32));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        pilotPanel11.add(groupComboBox11, gridBagConstraints);

        roleComboBox11.setFont(roleComboBox11.getFont().deriveFont((float)10));
        roleComboBox11.setBorder(BorderFactory.createEtchedBorder());
        roleComboBox11.setMaximumSize(new Dimension(128, 32));
        roleComboBox11.setMinimumSize(new Dimension(128, 32));
        roleComboBox11.setPreferredSize(new Dimension(128, 32));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        pilotPanel11.add(roleComboBox11, gridBagConstraints);

        jScrollPane11.setBorder(BorderFactory.createTitledBorder(null, "Description", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, new Font("Moire", 0, 10))); // NOI18N
        jScrollPane11.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane11.setMaximumSize(new Dimension(256, 64));
        jScrollPane11.setMinimumSize(new Dimension(256, 64));
        jScrollPane11.setPreferredSize(new Dimension(256, 64));

        jTextArea11.setColumns(20);
        jTextArea11.setFont(jTextArea11.getFont().deriveFont((float)10));
        jTextArea11.setRows(5);
        jTextArea11.setWrapStyleWord(true);
        jTextArea11.setMaximumSize(new Dimension(164, 60));
        jTextArea11.setMinimumSize(new Dimension(164, 60));
        jScrollPane11.setViewportView(jTextArea11);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        pilotPanel11.add(jScrollPane11, gridBagConstraints);

        opForPanel.add(pilotPanel11);

        pilotPanel12.setEnabled(false);
        pilotPanel12.setFont(pilotPanel12.getFont().deriveFont((float)11));
        pilotPanel12.setMaximumSize(new Dimension(480, 128));
        pilotPanel12.setMinimumSize(new Dimension(480, 128));
        pilotPanel12.setPreferredSize(new Dimension(480, 128));
        pilotPanel12.setVisible(false);
        pilotPanel12.setLayout(new GridBagLayout());

        idLabel12.setFont(idLabel12.getFont().deriveFont((float)12));
        idLabel12.setHorizontalAlignment(SwingConstants.CENTER);
        idLabel12.setText("ID#: 12");
        idLabel12.setMaximumSize(new Dimension(64, 32));
        idLabel12.setMinimumSize(new Dimension(64, 32));
        idLabel12.setPreferredSize(new Dimension(64, 32));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        pilotPanel12.add(idLabel12, gridBagConstraints);

        mechTonnageLabel12.setFont(mechTonnageLabel12.getFont().deriveFont((float)12));
        mechTonnageLabel12.setHorizontalAlignment(SwingConstants.CENTER);
        mechTonnageLabel12.setText("0 Tons");
        mechTonnageLabel12.setMaximumSize(new Dimension(64, 32));
        mechTonnageLabel12.setMinimumSize(new Dimension(64, 32));
        mechTonnageLabel12.setPreferredSize(new Dimension(64, 32));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        pilotPanel12.add(mechTonnageLabel12, gridBagConstraints);

        mechIconLabel12.setFont(mechIconLabel12.getFont().deriveFont((float)12));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        pilotPanel12.add(mechIconLabel12, gridBagConstraints);

        pilotNameComboBox12.setFont(pilotNameComboBox12.getFont().deriveFont((float)10));
        pilotNameComboBox12.setBorder(BorderFactory.createEtchedBorder());
        pilotNameComboBox12.setMaximumSize(new Dimension(128, 32));
        pilotNameComboBox12.setMinimumSize(new Dimension(128, 32));
        pilotNameComboBox12.setPreferredSize(new Dimension(128, 32));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        pilotPanel12.add(pilotNameComboBox12, gridBagConstraints);

        chassisComboBox12.setFont(chassisComboBox12.getFont().deriveFont((float)10));
        chassisComboBox12.setBorder(BorderFactory.createEtchedBorder());
        chassisComboBox12.setMaximumSize(new Dimension(128, 32));
        chassisComboBox12.setMinimumSize(new Dimension(128, 32));
        chassisComboBox12.setPreferredSize(new Dimension(128, 32));
        chassisComboBox12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                chassisComboBox12ActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        pilotPanel12.add(chassisComboBox12, gridBagConstraints);

        variantComboBox12.setFont(variantComboBox12.getFont().deriveFont((float)10));
        variantComboBox12.setModel(new DefaultComboBoxModel(new String[] { "Model" }));
        variantComboBox12.setBorder(BorderFactory.createEtchedBorder());
        variantComboBox12.setMaximumSize(new Dimension(128, 32));
        variantComboBox12.setMinimumSize(new Dimension(128, 32));
        variantComboBox12.setPreferredSize(new Dimension(128, 32));
        variantComboBox12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                variantComboBox12ActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        pilotPanel12.add(variantComboBox12, gridBagConstraints);

        groupComboBox12.setFont(groupComboBox12.getFont().deriveFont((float)10));
        groupComboBox12.setBorder(BorderFactory.createEtchedBorder());
        groupComboBox12.setMaximumSize(new Dimension(128, 32));
        groupComboBox12.setMinimumSize(new Dimension(128, 32));
        groupComboBox12.setPreferredSize(new Dimension(128, 32));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        pilotPanel12.add(groupComboBox12, gridBagConstraints);

        roleComboBox12.setFont(roleComboBox12.getFont().deriveFont((float)10));
        roleComboBox12.setBorder(BorderFactory.createEtchedBorder());
        roleComboBox12.setMaximumSize(new Dimension(128, 32));
        roleComboBox12.setMinimumSize(new Dimension(128, 32));
        roleComboBox12.setPreferredSize(new Dimension(128, 32));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        pilotPanel12.add(roleComboBox12, gridBagConstraints);

        jScrollPane12.setBorder(BorderFactory.createTitledBorder(null, "Description", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, new Font("Moire", 0, 10))); // NOI18N
        jScrollPane12.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane12.setMaximumSize(new Dimension(256, 64));
        jScrollPane12.setMinimumSize(new Dimension(256, 64));
        jScrollPane12.setPreferredSize(new Dimension(256, 64));

        jTextArea12.setColumns(20);
        jTextArea12.setFont(jTextArea12.getFont().deriveFont((float)10));
        jTextArea12.setRows(5);
        jTextArea12.setWrapStyleWord(true);
        jTextArea12.setMaximumSize(new Dimension(164, 60));
        jTextArea12.setMinimumSize(new Dimension(164, 60));
        jScrollPane12.setViewportView(jTextArea12);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        pilotPanel12.add(jScrollPane12, gridBagConstraints);

        opForPanel.add(pilotPanel12);

        opForScrollPane.setViewportView(opForPanel);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        getContentPane().add(opForScrollPane, gridBagConstraints);

        EditPanel.setFont(EditPanel.getFont().deriveFont((float)11));
        EditPanel.setMaximumSize(new Dimension(100, 480));
        EditPanel.setMinimumSize(new Dimension(100, 480));
        EditPanel.setPreferredSize(new Dimension(100, 480));
        EditPanel.setLayout(new GridBagLayout());

        forceSizePanel.setBorder(BorderFactory.createEtchedBorder());
        forceSizePanel.setAlignmentX(0.0F);
        forceSizePanel.setAlignmentY(0.0F);
        forceSizePanel.setMaximumSize(new Dimension(100, 80));
        forceSizePanel.setMinimumSize(new Dimension(100, 80));
        forceSizePanel.setPreferredSize(new Dimension(100, 80));
        forceSizePanel.setLayout(new GridBagLayout());

        forceSizeLabel.setFont(forceSizeLabel.getFont().deriveFont((float)10));
        forceSizeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        forceSizeLabel.setText("Force Size");
        forceSizeLabel.setAlignmentY(0.0F);
        forceSizeLabel.setBorder(BorderFactory.createEtchedBorder());
        forceSizeLabel.setMaximumSize(new Dimension(100, 20));
        forceSizeLabel.setMinimumSize(new Dimension(100, 20));
        forceSizeLabel.setPreferredSize(new Dimension(100, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        forceSizePanel.add(forceSizeLabel, gridBagConstraints);

        decrementForceSizeButton.setFont(decrementForceSizeButton.getFont().deriveFont((float)10));
        decrementForceSizeButton.setText("-");
        decrementForceSizeButton.setAlignmentY(0.0F);
        decrementForceSizeButton.setHorizontalTextPosition(SwingConstants.CENTER);
        decrementForceSizeButton.setMargin(new Insets(0, 0, 0, 0));
        decrementForceSizeButton.setMaximumSize(new Dimension(15, 15));
        decrementForceSizeButton.setMinimumSize(new Dimension(15, 15));
        decrementForceSizeButton.setPreferredSize(new Dimension(15, 15));
        decrementForceSizeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                decrementForceSizeButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        forceSizePanel.add(decrementForceSizeButton, gridBagConstraints);

        incrementForceSizeButton.setFont(incrementForceSizeButton.getFont().deriveFont((float)10));
        incrementForceSizeButton.setText("+");
        incrementForceSizeButton.setAlignmentY(0.0F);
        incrementForceSizeButton.setHorizontalTextPosition(SwingConstants.CENTER);
        incrementForceSizeButton.setMargin(new Insets(0, 0, 0, 0));
        incrementForceSizeButton.setMaximumSize(new Dimension(15, 15));
        incrementForceSizeButton.setMinimumSize(new Dimension(15, 15));
        incrementForceSizeButton.setPreferredSize(new Dimension(15, 15));
        incrementForceSizeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                incrementForceSizeButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        forceSizePanel.add(incrementForceSizeButton, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        EditPanel.add(forceSizePanel, gridBagConstraints);

        forceTonnagePanel.setBorder(BorderFactory.createEtchedBorder());
        forceTonnagePanel.setAlignmentX(0.0F);
        forceTonnagePanel.setAlignmentY(0.0F);
        forceTonnagePanel.setMaximumSize(new Dimension(100, 80));
        forceTonnagePanel.setMinimumSize(new Dimension(100, 80));
        forceTonnagePanel.setPreferredSize(new Dimension(100, 80));
        forceTonnagePanel.setLayout(new GridBagLayout());

        forceTonnageLabel.setFont(forceTonnageLabel.getFont().deriveFont((float)10));
        forceTonnageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        forceTonnageLabel.setText("Force Tonnage");
        forceTonnageLabel.setAlignmentY(0.0F);
        forceTonnageLabel.setBorder(BorderFactory.createEtchedBorder());
        forceTonnageLabel.setMaximumSize(new Dimension(100, 20));
        forceTonnageLabel.setMinimumSize(new Dimension(100, 20));
        forceTonnageLabel.setPreferredSize(new Dimension(100, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        forceTonnagePanel.add(forceTonnageLabel, gridBagConstraints);

        decrementForceTonnageButton.setFont(decrementForceTonnageButton.getFont().deriveFont((float)10));
        decrementForceTonnageButton.setText("-");
        decrementForceTonnageButton.setAlignmentY(0.0F);
        decrementForceTonnageButton.setHorizontalTextPosition(SwingConstants.CENTER);
        decrementForceTonnageButton.setMargin(new Insets(0, 0, 0, 0));
        decrementForceTonnageButton.setMaximumSize(new Dimension(15, 15));
        decrementForceTonnageButton.setMinimumSize(new Dimension(15, 15));
        decrementForceTonnageButton.setPreferredSize(new Dimension(15, 15));
        decrementForceTonnageButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                decrementForceTonnageButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        forceTonnagePanel.add(decrementForceTonnageButton, gridBagConstraints);

        incrementForceTonnageButton.setFont(incrementForceTonnageButton.getFont().deriveFont((float)10));
        incrementForceTonnageButton.setText("+");
        incrementForceTonnageButton.setAlignmentY(0.0F);
        incrementForceTonnageButton.setHorizontalTextPosition(SwingConstants.CENTER);
        incrementForceTonnageButton.setMargin(new Insets(0, 0, 0, 0));
        incrementForceTonnageButton.setMaximumSize(new Dimension(15, 15));
        incrementForceTonnageButton.setMinimumSize(new Dimension(15, 15));
        incrementForceTonnageButton.setPreferredSize(new Dimension(15, 15));
        incrementForceTonnageButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                incrementForceTonnageButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        forceTonnagePanel.add(incrementForceTonnageButton, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        EditPanel.add(forceTonnagePanel, gridBagConstraints);

        tonnagePanel.setAlignmentX(0.0F);
        tonnagePanel.setAlignmentY(0.0F);
        tonnagePanel.setMaximumSize(new Dimension(100, 80));
        tonnagePanel.setMinimumSize(new Dimension(100, 80));
        tonnagePanel.setPreferredSize(new Dimension(100, 80));
        tonnagePanel.setLayout(new GridBagLayout());

        currentForceTonnageLabel.setFont(currentForceTonnageLabel.getFont().deriveFont((float)10));
        currentForceTonnageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        currentForceTonnageLabel.setText("0 Tons");
        currentForceTonnageLabel.setAlignmentY(0.0F);
        currentForceTonnageLabel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Current Tonnage", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 10))); // NOI18N
        currentForceTonnageLabel.setMaximumSize(new Dimension(100, 40));
        currentForceTonnageLabel.setMinimumSize(new Dimension(100, 40));
        currentForceTonnageLabel.setPreferredSize(new Dimension(100, 40));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        tonnagePanel.add(currentForceTonnageLabel, gridBagConstraints);

        maxForceTonnageLabel.setFont(maxForceTonnageLabel.getFont().deriveFont((float)10));
        maxForceTonnageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        maxForceTonnageLabel.setText("50 Tons");
        maxForceTonnageLabel.setAlignmentY(0.0F);
        maxForceTonnageLabel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Max Tonnage", TitledBorder.CENTER, TitledBorder.TOP, new Font("Moire", 0, 10))); // NOI18N
        maxForceTonnageLabel.setMaximumSize(new Dimension(100, 40));
        maxForceTonnageLabel.setMinimumSize(new Dimension(100, 40));
        maxForceTonnageLabel.setPreferredSize(new Dimension(100, 40));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        tonnagePanel.add(maxForceTonnageLabel, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        EditPanel.add(tonnagePanel, gridBagConstraints);

        editCustomPanel.setBorder(BorderFactory.createEtchedBorder());
        editCustomPanel.setAlignmentX(0.0F);
        editCustomPanel.setAlignmentY(0.0F);
        editCustomPanel.setMaximumSize(new Dimension(100, 80));
        editCustomPanel.setMinimumSize(new Dimension(100, 80));
        editCustomPanel.setPreferredSize(new Dimension(100, 80));
        editCustomPanel.setLayout(new GridBagLayout());

        editPilotsButtons.setFont(editPilotsButtons.getFont().deriveFont((float)10));
        editPilotsButtons.setText("Edit Pilots");
        editPilotsButtons.setMargin(new Insets(0, 0, 0, 0));
        editPilotsButtons.setMaximumSize(new Dimension(90, 25));
        editPilotsButtons.setMinimumSize(new Dimension(90, 25));
        editPilotsButtons.setPreferredSize(new Dimension(90, 25));
        editPilotsButtons.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                editPilotsButtonsActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        editCustomPanel.add(editPilotsButtons, gridBagConstraints);

        editGroupsButtons.setFont(editGroupsButtons.getFont().deriveFont((float)10));
        editGroupsButtons.setText("Edit Groups");
        editGroupsButtons.setMargin(new Insets(0, 0, 0, 0));
        editGroupsButtons.setMaximumSize(new Dimension(90, 25));
        editGroupsButtons.setMinimumSize(new Dimension(90, 25));
        editGroupsButtons.setPreferredSize(new Dimension(90, 25));
        editGroupsButtons.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                editGroupsButtonsActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        editCustomPanel.add(editGroupsButtons, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        EditPanel.add(editCustomPanel, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        getContentPane().add(EditPanel, gridBagConstraints);

        jMenuBar1.setAlignmentX(0.0F);
        jMenuBar1.setFont(jMenuBar1.getFont().deriveFont((float)10));
        jMenuBar1.setMaximumSize(new Dimension(900, 30));
        jMenuBar1.setMinimumSize(new Dimension(900, 30));
        jMenuBar1.setPreferredSize(new Dimension(900, 30));

        fileMenu.setText("File");
        fileMenu.setFont(fileMenu.getFont().deriveFont((float)10));

        exportForceDecMenuItem.setFont(exportForceDecMenuItem.getFont().deriveFont((float)10));
        exportForceDecMenuItem.setText("Export ForceDec");
        exportForceDecMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                exportForceDecMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exportForceDecMenuItem);

        exportResultsMenuItem.setFont(exportResultsMenuItem.getFont().deriveFont((float)10));
        exportResultsMenuItem.setText("Export Results");
        fileMenu.add(exportResultsMenuItem);

        jMenuBar1.add(fileMenu);

        helpMenu.setText("Help");
        helpMenu.setFont(helpMenu.getFont().deriveFont((float)10));

        aboutMenuItem.setFont(aboutMenuItem.getFont().deriveFont((float)10));
        aboutMenuItem.setText("About");
        aboutMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(aboutMenuItem);

        jMenuBar1.add(helpMenu);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void chassisComboBox1ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_chassisComboBox1ActionPerformed
        setVariant(0, mechTonnageLabel1, chassisComboBox1, variantComboBox1);
    }//GEN-LAST:event_chassisComboBox1ActionPerformed
    private void chassisComboBox2ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_chassisComboBox2ActionPerformed
        setVariant(1, mechTonnageLabel2, chassisComboBox2, variantComboBox2);
    }//GEN-LAST:event_chassisComboBox2ActionPerformed
    private void chassisComboBox3ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_chassisComboBox3ActionPerformed
        setVariant(2, mechTonnageLabel3, chassisComboBox3, variantComboBox3);
    }//GEN-LAST:event_chassisComboBox3ActionPerformed
    private void chassisComboBox4ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_chassisComboBox4ActionPerformed
        setVariant(3, mechTonnageLabel4, chassisComboBox4, variantComboBox4);
    }//GEN-LAST:event_chassisComboBox4ActionPerformed
    private void chassisComboBox5ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_chassisComboBox5ActionPerformed
        setVariant(4, mechTonnageLabel5, chassisComboBox5, variantComboBox5);
    }//GEN-LAST:event_chassisComboBox5ActionPerformed
    private void chassisComboBox6ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_chassisComboBox6ActionPerformed
        setVariant(5, mechTonnageLabel6, chassisComboBox6, variantComboBox6);
    }//GEN-LAST:event_chassisComboBox6ActionPerformed
    private void chassisComboBox7ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_chassisComboBox7ActionPerformed
        setVariant(6, mechTonnageLabel7, chassisComboBox7, variantComboBox7);
    }//GEN-LAST:event_chassisComboBox7ActionPerformed
    private void chassisComboBox8ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_chassisComboBox8ActionPerformed
        setVariant(7, mechTonnageLabel8, chassisComboBox8, variantComboBox8);
    }//GEN-LAST:event_chassisComboBox8ActionPerformed
    private void chassisComboBox9ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_chassisComboBox9ActionPerformed
        setVariant(8, mechTonnageLabel9, chassisComboBox9, variantComboBox9);
    }//GEN-LAST:event_chassisComboBox9ActionPerformed
    private void chassisComboBox10ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_chassisComboBox10ActionPerformed
        setVariant(9, mechTonnageLabel10, chassisComboBox10, variantComboBox10);
    }//GEN-LAST:event_chassisComboBox10ActionPerformed
    private void chassisComboBox11ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_chassisComboBox11ActionPerformed
        setVariant(10, mechTonnageLabel11, chassisComboBox11, variantComboBox11);
    }//GEN-LAST:event_chassisComboBox11ActionPerformed
    private void chassisComboBox12ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_chassisComboBox12ActionPerformed
        setVariant(11, mechTonnageLabel12, chassisComboBox12, variantComboBox12);
    }//GEN-LAST:event_chassisComboBox12ActionPerformed
    private void variantComboBox1ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_variantComboBox1ActionPerformed
        setMechIcon(mechIconLabel1, chassisComboBox1, variantComboBox1);
    }//GEN-LAST:event_variantComboBox1ActionPerformed
    private void variantComboBox2ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_variantComboBox2ActionPerformed
        setMechIcon(mechIconLabel2, chassisComboBox2, variantComboBox2);
    }//GEN-LAST:event_variantComboBox2ActionPerformed
    private void variantComboBox3ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_variantComboBox3ActionPerformed
        setMechIcon(mechIconLabel3, chassisComboBox3, variantComboBox3);
    }//GEN-LAST:event_variantComboBox3ActionPerformed
    private void variantComboBox4ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_variantComboBox4ActionPerformed
        setMechIcon(mechIconLabel4, chassisComboBox4, variantComboBox4);
    }//GEN-LAST:event_variantComboBox4ActionPerformed
    private void variantComboBox5ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_variantComboBox5ActionPerformed
        setMechIcon(mechIconLabel5, chassisComboBox5, variantComboBox5);
    }//GEN-LAST:event_variantComboBox5ActionPerformed
    private void variantComboBox6ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_variantComboBox6ActionPerformed
        setMechIcon(mechIconLabel6, chassisComboBox6, variantComboBox6);
    }//GEN-LAST:event_variantComboBox6ActionPerformed
    private void variantComboBox7ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_variantComboBox7ActionPerformed
        setMechIcon(mechIconLabel7, chassisComboBox7, variantComboBox7);
    }//GEN-LAST:event_variantComboBox7ActionPerformed
    private void variantComboBox8ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_variantComboBox8ActionPerformed
        setMechIcon(mechIconLabel8, chassisComboBox8, variantComboBox8);
    }//GEN-LAST:event_variantComboBox8ActionPerformed
    private void variantComboBox9ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_variantComboBox9ActionPerformed
        setMechIcon(mechIconLabel9, chassisComboBox9, variantComboBox9);
    }//GEN-LAST:event_variantComboBox9ActionPerformed
    private void variantComboBox10ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_variantComboBox10ActionPerformed
        setMechIcon(mechIconLabel10, chassisComboBox10, variantComboBox10);
    }//GEN-LAST:event_variantComboBox10ActionPerformed
    private void variantComboBox11ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_variantComboBox11ActionPerformed
        setMechIcon(mechIconLabel11, chassisComboBox11, variantComboBox11);
    }//GEN-LAST:event_variantComboBox11ActionPerformed
    private void variantComboBox12ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_variantComboBox12ActionPerformed
        setMechIcon(mechIconLabel12, chassisComboBox12, variantComboBox12);
    }//GEN-LAST:event_variantComboBox12ActionPerformed
    private void decrementForceSizeButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_decrementForceSizeButtonActionPerformed
        if (pilotCount > 1)
            pilotCount--;
        
        switch(pilotCount)
        {
            case 1:
                mechTonnages[1] = 0;
                pilotPanel2.setEnabled(false);
                pilotPanel2.setVisible(false);
                break;
            case 2:
                mechTonnages[2] = 0;
                pilotPanel3.setEnabled(false);
                pilotPanel3.setVisible(false);
                break;
            case 3:
                mechTonnages[3] = 0;
                pilotPanel4.setEnabled(false);
                pilotPanel4.setVisible(false);
                break;
            case 4:
                mechTonnages[4] = 0;
                pilotPanel5.setEnabled(false);
                pilotPanel5.setVisible(false);
                break;
            case 5:
                mechTonnages[5] = 0;
                pilotPanel6.setEnabled(false);
                pilotPanel6.setVisible(false);
                break;
            case 6:
                mechTonnages[6] = 0;
                pilotPanel7.setEnabled(false);
                pilotPanel7.setVisible(false);
                break;
            case 7:
                mechTonnages[7] = 0;
                pilotPanel8.setEnabled(false);
                pilotPanel8.setVisible(false);
                break;
            case 8:
                mechTonnages[8] = 0;
                pilotPanel9.setEnabled(false);
                pilotPanel9.setVisible(false);
                break;
            case 9:
                mechTonnages[9] = 0;
                pilotPanel10.setEnabled(false);
                pilotPanel10.setVisible(false);
                break;
            case 10:
                mechTonnages[10] = 0;
                pilotPanel11.setEnabled(false);
                pilotPanel11.setVisible(false);
                break;
            case 11:
                mechTonnages[11] = 0;
                pilotPanel12.setEnabled(false);
                pilotPanel12.setVisible(false);
                break;
        }
        checkForceTonnage();
        updateForceTonnageLabels();
    }//GEN-LAST:event_decrementForceSizeButtonActionPerformed
    private void incrementForceSizeButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_incrementForceSizeButtonActionPerformed
        if (pilotCount < MAX_TEAM_SIZE)
            pilotCount++;
        
        switch(pilotCount)
        {
            case 2:
                pilotPanel2.setEnabled(true);
                pilotPanel2.setVisible(true);
                break;
            case 3:
                pilotPanel3.setEnabled(true);
                pilotPanel3.setVisible(true);
                break;
            case 4:
                pilotPanel4.setEnabled(true);
                pilotPanel4.setVisible(true);
                break;
            case 5:
                pilotPanel5.setEnabled(true);
                pilotPanel5.setVisible(true);
                break;
            case 6:
                pilotPanel6.setEnabled(true);
                pilotPanel6.setVisible(true);
                break;
            case 7:
                pilotPanel7.setEnabled(true);
                pilotPanel7.setVisible(true);
                break;
            case 8:
                pilotPanel8.setEnabled(true);
                pilotPanel8.setVisible(true);
                break;
            case 9:
                pilotPanel9.setEnabled(true);
                pilotPanel9.setVisible(true);
                break;
            case 10:
                pilotPanel10.setEnabled(true);
                pilotPanel10.setVisible(true);
                break;
            case 11:
                pilotPanel11.setEnabled(true);
                pilotPanel11.setVisible(true);
            case 12:
                pilotPanel12.setEnabled(true);
                pilotPanel12.setVisible(true);
                break;
        }
        checkForceTonnage();
        updateForceTonnageLabels();
    }//GEN-LAST:event_incrementForceSizeButtonActionPerformed
    private void decrementForceTonnageButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_decrementForceTonnageButtonActionPerformed
        decrementForceTonnage();
        updateForceTonnageLabels();
    }//GEN-LAST:event_decrementForceTonnageButtonActionPerformed
    private void incrementForceTonnageButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_incrementForceTonnageButtonActionPerformed
        incrementForceTonange();
        updateForceTonnageLabels();
    }//GEN-LAST:event_incrementForceTonnageButtonActionPerformed
    private void editGroupsButtonsActionPerformed(ActionEvent evt) {//GEN-FIRST:event_editGroupsButtonsActionPerformed
        EditDialogBox dlgBox = new EditDialogBox(this, false, groupNames);
        dlgBox.setLocationRelativeTo(this);
        dlgBox.setVisible(true);
    }//GEN-LAST:event_editGroupsButtonsActionPerformed
    private void editPilotsButtonsActionPerformed(ActionEvent evt) {//GEN-FIRST:event_editPilotsButtonsActionPerformed
        EditDialogBox dlgBox = new EditDialogBox(this, false, pilotNames);
        dlgBox.setLocationRelativeTo(this);
        dlgBox.setVisible(true);
    }//GEN-LAST:event_editPilotsButtonsActionPerformed
    private void aboutMenuItemActionPerformed(ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        AboutDialogBox dlgBox = new AboutDialogBox(this, false, dropCalcVersion, MWOstage);
        dlgBox.setLocationRelativeTo(this);
        dlgBox.setVisible(true);
    }//GEN-LAST:event_aboutMenuItemActionPerformed
    private void exportForceDecMenuItemActionPerformed(ActionEvent evt) {//GEN-FIRST:event_exportForceDecMenuItemActionPerformed
        try {
            FileWriter fstream = new FileWriter("DropDec.txt");
            BufferedWriter out = new BufferedWriter(fstream);
            
            switch(pilotCount)
            {
                case 12:
                    out.write(buildPilotInfo(pilotNameComboBox12, chassisComboBox12, variantComboBox12, roleComboBox12, groupComboBox12));
                case 11:
                    out.write(buildPilotInfo(pilotNameComboBox11, chassisComboBox11, variantComboBox11, roleComboBox11, groupComboBox11));
                case 10:
                    out.write(buildPilotInfo(pilotNameComboBox10, chassisComboBox10, variantComboBox10, roleComboBox10, groupComboBox10));
                case 9:
                    out.write(buildPilotInfo(pilotNameComboBox9, chassisComboBox9, variantComboBox9, roleComboBox9, groupComboBox9));
                case 8:
                    out.write(buildPilotInfo(pilotNameComboBox8, chassisComboBox8, variantComboBox8, roleComboBox8, groupComboBox8));
                case 7:
                    out.write(buildPilotInfo(pilotNameComboBox7, chassisComboBox7, variantComboBox7, roleComboBox7, groupComboBox7));
                case 6:
                    out.write(buildPilotInfo(pilotNameComboBox6, chassisComboBox6, variantComboBox6, roleComboBox6, groupComboBox6));
                case 5:
                    out.write(buildPilotInfo(pilotNameComboBox5, chassisComboBox5, variantComboBox5, roleComboBox5, groupComboBox5));
                case 4:
                    out.write(buildPilotInfo(pilotNameComboBox4, chassisComboBox4, variantComboBox4, roleComboBox4, groupComboBox4));
                case 3:
                    out.write(buildPilotInfo(pilotNameComboBox3, chassisComboBox3, variantComboBox3, roleComboBox3, groupComboBox3));
                case 2:
                    out.write(buildPilotInfo(pilotNameComboBox2, chassisComboBox2, variantComboBox2, roleComboBox2, groupComboBox2));
                case 1:
                    out.write(buildPilotInfo(pilotNameComboBox1, chassisComboBox1, variantComboBox1, roleComboBox1, groupComboBox1));
                    break;
            }
            out.close();
            fstream.close();
            JOptionPane.showMessageDialog(this, "DropDec Exported");
        }
        catch (FileNotFoundException e)
        {   JOptionPane.showMessageDialog(this, "File Not Found Error: " + e.getMessage());    }
        catch (IOException e)
        {   JOptionPane.showMessageDialog(this, "IO Error: " + e.getMessage());    }
        catch (Exception e)
        {   JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());    }
    }//GEN-LAST:event_exportForceDecMenuItemActionPerformed
    private String buildPilotInfo(JComboBox name, JComboBox chassis, JComboBox model, JComboBox variant, JComboBox proword) {
        String pilotInfo = "";
        
        pilotInfo += name.getSelectedItem();
        pilotInfo += "\t\t";
        pilotInfo += chassis.getSelectedItem();
        pilotInfo += "\t\t";
        pilotInfo += model.getSelectedItem();
        pilotInfo += "\t\t";
        pilotInfo += variant.getSelectedItem();
        pilotInfo += "\t\t";
        pilotInfo += proword.getSelectedItem();
        pilotInfo += "\n";
        
        return pilotInfo;
    }
    private void formWindowClosing(WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (parent != null)
            parent.setVisible(true);
        else
            setDefaultCloseOperation(EXIT_ON_CLOSE);
    }//GEN-LAST:event_formWindowClosing
    private void decrementForceTonnage() {
        if ((teamMaxTonnage - 50) > (50 * Math.round(pilotCount / 2.0)))
            teamMaxTonnage -= 50;
        else
            teamMaxTonnage = (int) (50 * Math.round(pilotCount / 2.0));
    }
    private void incrementForceTonange() {
        if ((teamMaxTonnage + 50) < (100 * pilotCount))
            teamMaxTonnage += 50;
        else
            teamMaxTonnage = (int) (100 * pilotCount);
    }
    private void checkForceTonnage() {
        if (teamMaxTonnage > 100 * pilotCount)
            teamMaxTonnage = 100 * pilotCount;
        else if (teamMaxTonnage < (50 * Math.round(pilotCount / 2.0)))
            teamMaxTonnage = (int) (50 * Math.round(pilotCount / 2.0));
    }
    private void updateForceTonnageLabels() {
        currentForceTonnageLabel.setText(teamTonnage + " Tons");
        maxForceTonnageLabel.setText(teamMaxTonnage + " Tons");
        
        if (teamTonnage < teamMaxTonnage - 50)
            currentForceTonnageLabel.setForeground( new Color(128,128,48));
        else if (teamTonnage < teamMaxTonnage)
            currentForceTonnageLabel.setForeground( new Color(88,128,48));
        else if (teamTonnage == teamMaxTonnage)
            currentForceTonnageLabel.setForeground( new Color(48,128,48));
        else
            currentForceTonnageLabel.setForeground( new Color(128,48,48));
    }
    private void setVariant(int index, JLabel tonnageLabel, JComboBox chassisCB, JComboBox variantCB) {
        switch (chassisCB.getSelectedIndex())
        {
            case FLEA_INDEX:
                setComboBoxData(variantCB, fleaModels);
                mechTonnages[index] = 20;
                break;
            case COMMANDO_INDEX:
                setComboBoxData(variantCB, commandoModels);
                mechTonnages[index] = 25;
                break;
            case SPIDER_INDEX:
                setComboBoxData(variantCB, spiderModels);
                mechTonnages[index] = 30;
                break;
            case JENNER_INDEX:
                setComboBoxData(variantCB, jennerModels);
                mechTonnages[index] = 35;
                break;
            case RAVEN_INDEX:
                setComboBoxData(variantCB, ravenModels);
                mechTonnages[index] = 35;
                break;
            case CICADA_INDEX:
                setComboBoxData(variantCB, cicadaModels);
                mechTonnages[index] = 40;
                break;
            case BLACKJACK_INDEX:
                setComboBoxData(variantCB, blackjackModels);
                mechTonnages[index] = 45;
                break;
            case CENTURION_INDEX:
                setComboBoxData(variantCB, centurionModels);
                mechTonnages[index] = 50;
                break;
            case HUNCHBACK_INDEX:
                setComboBoxData(variantCB, hunchbackModels);
                mechTonnages[index] = 50;
                break;
            case TREBUCHET_INDEX:
                setComboBoxData(variantCB, trebuchetModels);
                mechTonnages[index] = 50;
                break;
            case DRAGON_INDEX:
                setComboBoxData(variantCB, dragonModels);
                mechTonnages[index] = 60;
                break;
            case GRAND_DRAGON_INDEX:
                setComboBoxData(variantCB, grandDragonModels);
                mechTonnages[index] = 60;
                break;
            case CATAPULT_INDEX:
                setComboBoxData(variantCB, catapultModels);
                mechTonnages[index] = 65;
                break;
            case JAGERMECH_INDEX:
                setComboBoxData(variantCB, jagermechModels);
                mechTonnages[index] = 65;
                break;
            case CATAPHRACT_INDEX:
                setComboBoxData(variantCB, cataphractModels);
                mechTonnages[index] = 70;
                break;
            case ORION_INDEX:
                setComboBoxData(variantCB, orionModels);
                mechTonnages[index] = 75;
                break;
            case AWESOME_INDEX:
                setComboBoxData(variantCB, awesomeModels);
                mechTonnages[index] = 80;
                break;
            case STALKER_INDEX:
                setComboBoxData(variantCB, stalkerModels);
                mechTonnages[index] = 85;
                break;
            case HIGHLANDER_INDEX:
                setComboBoxData(variantCB, highlanderModels);
                mechTonnages[index] = 90;
                break;
            case ATLAS_INDEX:
                setComboBoxData(variantCB, atlasModels);
                mechTonnages[index] = 100;
                break;
            default:
                variantCB.removeAllItems();
                variantCB.addItem("Variant");
                mechTonnages[index] = 0;
        }
        
        updateTeamTonnage();
        updateForceTonnageLabels();
        tonnageLabel.setText(mechTonnages[index] + " Tons");
    }
    public void setMechIcon(JLabel mechIconLabel, JComboBox chassisCB, JComboBox variantCB) {
    }
    private void setComboBoxData(JComboBox variantCB, String[] str) {
        variantCB.removeAllItems();
        for (int i = 0; i < str.length; i++)
            variantCB.addItem(str[i]);
    }
    private void updateTeamTonnage() {
        teamTonnage = 0;
        for (int i = 0; i < MAX_TEAM_SIZE; i++)
            teamTonnage += mechTonnages[i];
    }
    private void resetPilotPanel(JPanel pilotPanel) {
        //Do stuff here:
    }
    private void initTeam() {
        teamTonnage = 0;
        pilotCount = 1;
        teamMaxTonnage = 50;
        for (int i = 0; i < MAX_TEAM_SIZE; i++)
            mechTonnages[i] = 0;
    }
    private void loadFromFiles() {
        pilotNames.add("Pilot");
        
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new DataInputStream(new FileInputStream(PILOTS_PATH))));
            String line;
            while ((line = reader.readLine()) != null)
            {
                pilotNames.add(line);
            }
        }
        catch (IOException x) 
        {   System.err.println(x);  }
        
        groupNames.add("Group");
        
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new DataInputStream(new FileInputStream(GROUPS_PATH))));
            String line;
            while ((line = reader.readLine()) != null)
            {
                groupNames.add(line);
            }
        }
        catch (IOException x)
        {   System.err.println(x);  }
        
        variantNames.add("Variant");
        
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new DataInputStream(new FileInputStream(VARIANTS_PATH))));
            String line;
            while ((line = reader.readLine()) != null)
            {
                variantNames.add(line);
            }
        }
        catch (IOException x)
        {   System.err.println(x);  }
    }
    //<editor-fold desc="Variable Declerations">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JPanel EditPanel;
    private JMenuItem aboutMenuItem;
    private JComboBox chassisComboBox1;
    private JComboBox chassisComboBox10;
    private JComboBox chassisComboBox11;
    private JComboBox chassisComboBox12;
    private JComboBox chassisComboBox2;
    private JComboBox chassisComboBox3;
    private JComboBox chassisComboBox4;
    private JComboBox chassisComboBox5;
    private JComboBox chassisComboBox6;
    private JComboBox chassisComboBox7;
    private JComboBox chassisComboBox8;
    private JComboBox chassisComboBox9;
    private JLabel currentForceTonnageLabel;
    private JButton decrementForceSizeButton;
    private JButton decrementForceTonnageButton;
    private JPanel editCustomPanel;
    private JButton editGroupsButtons;
    private JButton editPilotsButtons;
    private JMenuItem exportForceDecMenuItem;
    private JMenuItem exportResultsMenuItem;
    private JMenu fileMenu;
    private JLabel forceSizeLabel;
    private JPanel forceSizePanel;
    private JLabel forceTonnageLabel;
    private JPanel forceTonnagePanel;
    private JComboBox groupComboBox1;
    private JComboBox groupComboBox10;
    private JComboBox groupComboBox11;
    private JComboBox groupComboBox12;
    private JComboBox groupComboBox2;
    private JComboBox groupComboBox3;
    private JComboBox groupComboBox4;
    private JComboBox groupComboBox5;
    private JComboBox groupComboBox6;
    private JComboBox groupComboBox7;
    private JComboBox groupComboBox8;
    private JComboBox groupComboBox9;
    private JMenu helpMenu;
    private JLabel idLabel1;
    private JLabel idLabel10;
    private JLabel idLabel11;
    private JLabel idLabel12;
    private JLabel idLabel2;
    private JLabel idLabel3;
    private JLabel idLabel4;
    private JLabel idLabel5;
    private JLabel idLabel6;
    private JLabel idLabel7;
    private JLabel idLabel8;
    private JLabel idLabel9;
    private JButton incrementForceSizeButton;
    private JButton incrementForceTonnageButton;
    private JMenuBar jMenuBar1;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane10;
    private JScrollPane jScrollPane11;
    private JScrollPane jScrollPane12;
    private JScrollPane jScrollPane2;
    private JScrollPane jScrollPane3;
    private JScrollPane jScrollPane4;
    private JScrollPane jScrollPane5;
    private JScrollPane jScrollPane6;
    private JScrollPane jScrollPane7;
    private JScrollPane jScrollPane8;
    private JScrollPane jScrollPane9;
    private JTextArea jTextArea1;
    private JTextArea jTextArea10;
    private JTextArea jTextArea11;
    private JTextArea jTextArea12;
    private JTextArea jTextArea2;
    private JTextArea jTextArea3;
    private JTextArea jTextArea4;
    private JTextArea jTextArea5;
    private JTextArea jTextArea6;
    private JTextArea jTextArea7;
    private JTextArea jTextArea8;
    private JTextArea jTextArea9;
    private JLabel maxForceTonnageLabel;
    private JLabel mechIconLabel1;
    private JLabel mechIconLabel10;
    private JLabel mechIconLabel11;
    private JLabel mechIconLabel12;
    private JLabel mechIconLabel2;
    private JLabel mechIconLabel3;
    private JLabel mechIconLabel4;
    private JLabel mechIconLabel5;
    private JLabel mechIconLabel6;
    private JLabel mechIconLabel7;
    private JLabel mechIconLabel8;
    private JLabel mechIconLabel9;
    private JLabel mechTonnageLabel1;
    private JLabel mechTonnageLabel10;
    private JLabel mechTonnageLabel11;
    private JLabel mechTonnageLabel12;
    private JLabel mechTonnageLabel2;
    private JLabel mechTonnageLabel3;
    private JLabel mechTonnageLabel4;
    private JLabel mechTonnageLabel5;
    private JLabel mechTonnageLabel6;
    private JLabel mechTonnageLabel7;
    private JLabel mechTonnageLabel8;
    private JLabel mechTonnageLabel9;
    private JPanel opForPanel;
    private JScrollPane opForScrollPane;
    private JComboBox pilotNameComboBox1;
    private JComboBox pilotNameComboBox10;
    private JComboBox pilotNameComboBox11;
    private JComboBox pilotNameComboBox12;
    private JComboBox pilotNameComboBox2;
    private JComboBox pilotNameComboBox3;
    private JComboBox pilotNameComboBox4;
    private JComboBox pilotNameComboBox5;
    private JComboBox pilotNameComboBox6;
    private JComboBox pilotNameComboBox7;
    private JComboBox pilotNameComboBox8;
    private JComboBox pilotNameComboBox9;
    private JPanel pilotPanel1;
    private JPanel pilotPanel10;
    private JPanel pilotPanel11;
    private JPanel pilotPanel12;
    private JPanel pilotPanel2;
    private JPanel pilotPanel3;
    private JPanel pilotPanel4;
    private JPanel pilotPanel5;
    private JPanel pilotPanel6;
    private JPanel pilotPanel7;
    private JPanel pilotPanel8;
    private JPanel pilotPanel9;
    private JComboBox roleComboBox1;
    private JComboBox roleComboBox10;
    private JComboBox roleComboBox11;
    private JComboBox roleComboBox12;
    private JComboBox roleComboBox2;
    private JComboBox roleComboBox3;
    private JComboBox roleComboBox4;
    private JComboBox roleComboBox5;
    private JComboBox roleComboBox6;
    private JComboBox roleComboBox7;
    private JComboBox roleComboBox8;
    private JComboBox roleComboBox9;
    private JPanel tonnagePanel;
    private JComboBox variantComboBox1;
    private JComboBox variantComboBox10;
    private JComboBox variantComboBox11;
    private JComboBox variantComboBox12;
    private JComboBox variantComboBox2;
    private JComboBox variantComboBox3;
    private JComboBox variantComboBox4;
    private JComboBox variantComboBox5;
    private JComboBox variantComboBox6;
    private JComboBox variantComboBox7;
    private JComboBox variantComboBox8;
    private JComboBox variantComboBox9;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
}
