package MWOMechbay;

import java.awt.Color;
import java.awt.Font;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import javax.swing.JOptionPane;

/*
 * @author Quicksilver
 */
public class UserPreferences {
    public Font listFont = new Font("Moire", Font.PLAIN ,9);
    public Font labelFont = new Font("Moire", Font.PLAIN ,10);
    public Font titleFont = new Font("Moire", Font.PLAIN ,12);
    public Color SELECTED_CRITICAL_PANEL_COLOR;
    public Color DEFAULT_CRITICAL_PANEL_COLOR;
    public Color BLANK_COLOR;
    public Color BALLISTIC_COLOR;
    public Color ENERGY_COLOR;
    public Color MISSILE_COLOR;
    public Color AMS_COLOR;
    public Color ARMOR_COLOR;
    public Color INTERNAL_COLOR;
    public double REAR_ARMOR_PERCENTAGE = 0.25;
    
    public UserPreferences() {
        try {
            FileInputStream inFile = new FileInputStream("UserPreferences.pref");
            ObjectInputStream in = new ObjectInputStream(inFile);
            
            SELECTED_CRITICAL_PANEL_COLOR = (Color)in.readObject();
            DEFAULT_CRITICAL_PANEL_COLOR = (Color)in.readObject();
            BLANK_COLOR = (Color)in.readObject();
            BALLISTIC_COLOR = (Color)in.readObject();
            ENERGY_COLOR = (Color)in.readObject();
            MISSILE_COLOR = (Color)in.readObject();
            AMS_COLOR = (Color)in.readObject();
            ARMOR_COLOR = (Color)in.readObject();
            INTERNAL_COLOR = (Color)in.readObject();
            REAR_ARMOR_PERCENTAGE = in.readDouble();
            
            in.close();
            inFile.close();
        }
        catch (Exception e) {
            SELECTED_CRITICAL_PANEL_COLOR = new Color(51,153,255);
            DEFAULT_CRITICAL_PANEL_COLOR = new Color(240,240,240);
            BLANK_COLOR = new Color(240,240,240);
            BALLISTIC_COLOR = new Color(192,192,96);
            ENERGY_COLOR = new Color(192,96,96);
            MISSILE_COLOR = new Color(96,192,96);
            AMS_COLOR = new Color(96,96,192);
            ARMOR_COLOR = new Color(64,128,192);
            INTERNAL_COLOR = new Color(192,64,64);
        }
        /*
        catch (FileNotFoundException e)
        {   JOptionPane.showMessageDialog(this, "File Not Found Error: " + e.getMessage());    }
        catch (SecurityException e)
        {   JOptionPane.showMessageDialog(this, "Permission Error: Program has insufficient priveleges to write to the file.");    }
        catch (IOException e)
        {   JOptionPane.showMessageDialog(this, "IO Error: " + e.getMessage());    }
        catch (NullPointerException e)
        {   JOptionPane.showMessageDialog(this, "Null Pointer Error: Variant Class was not instanced.");    }
        catch (Exception e)
        {   JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());    }*/
    }
}
