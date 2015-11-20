package GUI;

import Utility.Preferences;
import Utility.User;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;

public class AboutDialogBox
  extends JDialog
{
  private JLabel MWOLabel;
  private JLabel MWOTitle;
  private JLabel authorLabel;
  private JLabel authorTitle;
  private JButton closeButton;
  private JLabel disclaimerLabel;
  private JLabel emailLabel;
  private JLabel emailTitle;
  private JLabel insigniaLabel;
  private JLabel titleLabel;
  private JLabel versionLabel;
  private JLabel versionTitle;
  
  public AboutDialogBox(Frame paramFrame, boolean paramBoolean, String paramString)
  {
    super(paramFrame, paramBoolean);
    initComponents();
    setTitle("About " + paramFrame.getTitle());
    this.titleLabel.setText(paramFrame.getTitle());
    this.versionLabel.setText(paramString);
    this.MWOLabel.setText(User.mwo_stage);
  }
  
  private void initComponents()
  {
    this.closeButton = new JButton();
    this.insigniaLabel = new JLabel();
    this.titleLabel = new JLabel();
    this.versionTitle = new JLabel();
    this.versionLabel = new JLabel();
    this.authorTitle = new JLabel();
    this.authorLabel = new JLabel();
    this.emailLabel = new JLabel();
    this.emailTitle = new JLabel();
    this.disclaimerLabel = new JLabel();
    this.MWOLabel = new JLabel();
    this.MWOTitle = new JLabel();
    setDefaultCloseOperation(2);
    setTitle("About MWO Mechbay");
    setAlwaysOnTop(true);
    setMaximumSize(new Dimension(432, 242));
    setMinimumSize(new Dimension(432, 242));
    setName("About");
    setResizable(false);
    getContentPane().setLayout(new GridBagLayout());
    this.closeButton.setFont(User.preferences.DEFAULT_FONT_SIZE_12);
    this.closeButton.setText("Close");
    this.closeButton.setHorizontalTextPosition(0);
    this.closeButton.setMargin(new Insets(0, 0, 0, 0));
    this.closeButton.setMaximumSize(new Dimension(128, 24));
    this.closeButton.setMinimumSize(new Dimension(128, 24));
    this.closeButton.setPreferredSize(new Dimension(128, 24));
    this.closeButton.addActionListener(new ActionListener()
    {
      @Override
      public void actionPerformed(ActionEvent paramAnonymousActionEvent)
      {
        AboutDialogBox.this.closeButtonActionPerformed(paramAnonymousActionEvent);
      }
    });
    GridBagConstraints localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 1;
    localGridBagConstraints.gridy = 6;
    localGridBagConstraints.gridwidth = 3;
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.weighty = 1.0D;
    getContentPane().add(this.closeButton, localGridBagConstraints);
    getRootPane().setDefaultButton(this.closeButton);
    this.insigniaLabel.setHorizontalAlignment(0);
    this.insigniaLabel.setIcon(new ImageIcon(getClass().getResource("/Resource/Widowmaker Insignia.gif")));
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.gridy = 0;
    localGridBagConstraints.gridheight = 7;
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.weighty = 1.0D;
    getContentPane().add(this.insigniaLabel, localGridBagConstraints);
    this.titleLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_16);
    this.titleLabel.setHorizontalAlignment(0);
    this.titleLabel.setText("MWO Mechbay");
    this.titleLabel.setMaximumSize(new Dimension(288, 36));
    this.titleLabel.setMinimumSize(new Dimension(288, 36));
    this.titleLabel.setPreferredSize(new Dimension(288, 36));
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 1;
    localGridBagConstraints.gridy = 0;
    localGridBagConstraints.gridwidth = 3;
    localGridBagConstraints.fill = 2;
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.weighty = 1.0D;
    getContentPane().add(this.titleLabel, localGridBagConstraints);
    this.versionTitle.setFont(User.preferences.DEFAULT_FONT_SIZE_12);
    this.versionTitle.setHorizontalAlignment(0);
    this.versionTitle.setText("Version:");
    this.versionTitle.setMaximumSize(new Dimension(96, 18));
    this.versionTitle.setMinimumSize(new Dimension(96, 18));
    this.versionTitle.setPreferredSize(new Dimension(96, 18));
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 1;
    localGridBagConstraints.gridy = 3;
    localGridBagConstraints.fill = 2;
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.weighty = 1.0D;
    getContentPane().add(this.versionTitle, localGridBagConstraints);
    this.versionLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_12);
    this.versionLabel.setText("0.0.0");
    this.versionLabel.setMaximumSize(new Dimension(192, 18));
    this.versionLabel.setMinimumSize(new Dimension(192, 18));
    this.versionLabel.setPreferredSize(new Dimension(192, 18));
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 2;
    localGridBagConstraints.gridy = 3;
    localGridBagConstraints.gridwidth = 2;
    localGridBagConstraints.fill = 2;
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.weighty = 1.0D;
    getContentPane().add(this.versionLabel, localGridBagConstraints);
    this.authorTitle.setFont(User.preferences.DEFAULT_FONT_SIZE_12);
    this.authorTitle.setHorizontalAlignment(0);
    this.authorTitle.setText("Author:");
    this.authorTitle.setMaximumSize(new Dimension(96, 18));
    this.authorTitle.setMinimumSize(new Dimension(96, 18));
    this.authorTitle.setPreferredSize(new Dimension(96, 18));
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 1;
    localGridBagConstraints.gridy = 1;
    localGridBagConstraints.fill = 2;
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.weighty = 1.0D;
    getContentPane().add(this.authorTitle, localGridBagConstraints);
    this.authorLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_12);
    this.authorLabel.setText("WM Quicksilver");
    this.authorLabel.setMaximumSize(new Dimension(192, 18));
    this.authorLabel.setMinimumSize(new Dimension(192, 18));
    this.authorLabel.setPreferredSize(new Dimension(192, 18));
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 2;
    localGridBagConstraints.gridy = 1;
    localGridBagConstraints.gridwidth = 2;
    localGridBagConstraints.fill = 2;
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.weighty = 1.0D;
    getContentPane().add(this.authorLabel, localGridBagConstraints);
    this.emailLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_12);
    this.emailLabel.setText("cjf-qssb@hotmail.com");
    this.emailLabel.setMaximumSize(new Dimension(192, 18));
    this.emailLabel.setMinimumSize(new Dimension(192, 18));
    this.emailLabel.setPreferredSize(new Dimension(192, 18));
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 2;
    localGridBagConstraints.gridy = 2;
    localGridBagConstraints.gridwidth = 2;
    localGridBagConstraints.fill = 2;
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.weighty = 1.0D;
    getContentPane().add(this.emailLabel, localGridBagConstraints);
    this.emailTitle.setFont(User.preferences.DEFAULT_FONT_SIZE_12);
    this.emailTitle.setHorizontalAlignment(0);
    this.emailTitle.setText("E-Mail:");
    this.emailTitle.setMaximumSize(new Dimension(96, 18));
    this.emailTitle.setMinimumSize(new Dimension(96, 18));
    this.emailTitle.setPreferredSize(new Dimension(96, 18));
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 1;
    localGridBagConstraints.gridy = 2;
    localGridBagConstraints.fill = 2;
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.weighty = 1.0D;
    getContentPane().add(this.emailTitle, localGridBagConstraints);
    this.disclaimerLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_14);
    this.disclaimerLabel.setHorizontalAlignment(0);
    this.disclaimerLabel.setText("Unofficial Program for MWO");
    this.disclaimerLabel.setMaximumSize(new Dimension(192, 36));
    this.disclaimerLabel.setMinimumSize(new Dimension(192, 36));
    this.disclaimerLabel.setPreferredSize(new Dimension(192, 36));
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 1;
    localGridBagConstraints.gridy = 5;
    localGridBagConstraints.gridwidth = 3;
    localGridBagConstraints.fill = 2;
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.weighty = 1.0D;
    getContentPane().add(this.disclaimerLabel, localGridBagConstraints);
    this.MWOLabel.setFont(User.preferences.DEFAULT_FONT_SIZE_12);
    this.MWOLabel.setText("0.0.0");
    this.MWOLabel.setMaximumSize(new Dimension(192, 18));
    this.MWOLabel.setMinimumSize(new Dimension(192, 18));
    this.MWOLabel.setPreferredSize(new Dimension(192, 18));
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 2;
    localGridBagConstraints.gridy = 4;
    localGridBagConstraints.gridwidth = 2;
    localGridBagConstraints.fill = 2;
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.weighty = 1.0D;
    getContentPane().add(this.MWOLabel, localGridBagConstraints);
    this.MWOTitle.setFont(User.preferences.DEFAULT_FONT_SIZE_12);
    this.MWOTitle.setHorizontalAlignment(0);
    this.MWOTitle.setText("MWO Stage:");
    this.MWOTitle.setMaximumSize(new Dimension(96, 18));
    this.MWOTitle.setMinimumSize(new Dimension(96, 18));
    this.MWOTitle.setPreferredSize(new Dimension(96, 18));
    localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.gridx = 1;
    localGridBagConstraints.gridy = 4;
    localGridBagConstraints.fill = 2;
    localGridBagConstraints.weightx = 1.0D;
    localGridBagConstraints.weighty = 1.0D;
    getContentPane().add(this.MWOTitle, localGridBagConstraints);
    pack();
  }
  
  private void closeButtonActionPerformed(ActionEvent paramActionEvent)
  {
    dispose();
  }
}


/* Location:              C:\Users\Trevin\Dropbox\Public\MWO Mechbay.zip!\MWO_Mechbay.jar!\GUI\AboutDialogBox.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */