package com.github.majora_incarnate.mwo.mechbay.entities;

import java.awt.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Preferences {
    public Font DEFAULT_FONT_SIZE_8;
    public Font DEFAULT_FONT_SIZE_10;
    public Font DEFAULT_FONT_SIZE_12;
    public Font DEFAULT_FONT_SIZE_14;
    public Font DEFAULT_FONT_SIZE_16;
    public Color SELECTED_CRITICAL_PANEL_COLOR;
    public Color DEFAULT_CRITICAL_PANEL_COLOR;
    public Color DEFAULT_INFO_BAR_COLOR;
    public Color BALLISTIC_COLOR;
    public Color ENERGY_COLOR;
    public Color MISSILE_COLOR;
    public Color AMS_COLOR;
    public Color ECM_COLOR;
    public Color ARMOR_COLOR;
    public Color STRUCTURE_COLOR;
    public double REAR_ARMOR_PERCENTAGE;
    public Color EMPTY_CRITICAL_FG;
    public Color EMPTY_CRITICAL_BG;
    public Color NORMAL_CRITICAL_FG;
    public Color NORMAL_CRITICAL_BG;
    public Color LOCKED_CRITICAL_FG;
    public Color LOCKED_CRITICAL_BG;
    public Color HARDPOINT_CRITICAL_FG;

    public Preferences() {
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("UserPreferences.pref"));
            this.DEFAULT_FONT_SIZE_8 = ((Font) inputStream.readObject());
            this.DEFAULT_FONT_SIZE_10 = ((Font) inputStream.readObject());
            this.DEFAULT_FONT_SIZE_12 = ((Font) inputStream.readObject());
            this.DEFAULT_FONT_SIZE_14 = ((Font) inputStream.readObject());
            this.DEFAULT_FONT_SIZE_16 = ((Font) inputStream.readObject());
            this.SELECTED_CRITICAL_PANEL_COLOR = ((Color) inputStream.readObject());
            this.DEFAULT_CRITICAL_PANEL_COLOR = ((Color) inputStream.readObject());
            this.DEFAULT_INFO_BAR_COLOR = ((Color) inputStream.readObject());
            this.BALLISTIC_COLOR = ((Color) inputStream.readObject());
            this.ENERGY_COLOR = ((Color) inputStream.readObject());
            this.MISSILE_COLOR = ((Color) inputStream.readObject());
            this.AMS_COLOR = ((Color) inputStream.readObject());
            this.ECM_COLOR = ((Color) inputStream.readObject());
            this.ARMOR_COLOR = ((Color) inputStream.readObject());
            this.STRUCTURE_COLOR = ((Color) inputStream.readObject());
            this.REAR_ARMOR_PERCENTAGE = inputStream.readDouble();
            inputStream.close();
        } catch (IOException | ClassNotFoundException localException) {
            this.DEFAULT_FONT_SIZE_8 = new Font("Moire", 0, 8);
            this.DEFAULT_FONT_SIZE_10 = new Font("Moire", 0, 10);
            this.DEFAULT_FONT_SIZE_12 = new Font("Moire", 0, 12);
            this.DEFAULT_FONT_SIZE_14 = new Font("Moire", 0, 14);
            this.DEFAULT_FONT_SIZE_16 = new Font("Moire", 0, 16);
            this.SELECTED_CRITICAL_PANEL_COLOR = new Color(51, 153, 255);
            this.DEFAULT_CRITICAL_PANEL_COLOR = new Color(240, 240, 240);
            this.DEFAULT_INFO_BAR_COLOR = new Color(192, 160, 64);
            this.BALLISTIC_COLOR = new Color(192, 192, 96);
            this.ENERGY_COLOR = new Color(192, 96, 96);
            this.MISSILE_COLOR = new Color(96, 192, 96);
            this.AMS_COLOR = new Color(96, 96, 192);
            this.ECM_COLOR = new Color(128, 128, 128);
            this.ARMOR_COLOR = new Color(64, 128, 192);
            this.STRUCTURE_COLOR = new Color(192, 64, 64);
            this.REAR_ARMOR_PERCENTAGE = 0.25D;
        }
        this.EMPTY_CRITICAL_FG = new Color(64, 64, 64);
        this.EMPTY_CRITICAL_BG = new Color(192, 192, 192);
        this.NORMAL_CRITICAL_FG = new Color(64, 64, 64);
        this.NORMAL_CRITICAL_BG = new Color(128, 128, 128);
        this.LOCKED_CRITICAL_FG = new Color(64, 64, 64);
        this.LOCKED_CRITICAL_BG = new Color(128, 128, 128);
        this.HARDPOINT_CRITICAL_FG = new Color(64, 64, 64);
    }
}