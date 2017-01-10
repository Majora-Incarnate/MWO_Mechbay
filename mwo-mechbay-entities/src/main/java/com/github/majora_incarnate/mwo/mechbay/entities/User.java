package com.github.majora_incarnate.mwo.mechbay.entities;

public class User {
    public static final Preferences PREFERENCES = new Preferences();
    public static final String MWO_STAGE = "";
    
    public Variant variant = new Variant();
    public int selectedSection = -1;
    public boolean frankenmechsEnabled = false;
    public boolean mixtechEnabled = false;
    public boolean futuretechEnabled = false;
    public boolean omniRestrictionsEnabled = true;
    
    public User() {
    }
}