/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MWOMechbay;

import MWOMechbay.Components.Item;
import MWOMechbay.Mechs.MechCommon;
import java.io.Serializable;
import java.util.Vector;

/**
 *
 * @author Quicksilver
 */
public class Variant implements MechCommon, Serializable {
    public int engineRating;
    public String variantName;
    public boolean hasXLEngine;
    public boolean hasFerroFibrous;
    public boolean hasEndoSteel;
    public boolean hasDoubleHS;
    public boolean hasArtemisIV;
    public boolean hasCommandConsole;
    public boolean hasMASC;
    public int heatSinks;
    public int engineHeatSinks;
    public int jumpJets;
    public int armor[] = new int[NUMBER_OF_SECTIONS];
    
    public int[] criticals = new int[NUMBER_OF_CRITICAL_SECTIONS];
    public int[][] hardpoints = new int[NUMBER_OF_CRITICAL_SECTIONS][4];
    
    public Vector<Item>[] items = new Vector[NUMBER_OF_CRITICAL_SECTIONS];
    
    public Variant() {
        engineRating = 100;
        variantName = "";
        hasXLEngine = false;
        hasFerroFibrous = false;
        hasEndoSteel = false;
        hasDoubleHS = false;
        hasArtemisIV = false;
        hasCommandConsole = false;
        hasMASC = false;
        heatSinks = 10;
        engineHeatSinks = 0;
        jumpJets = 0;
        armor = new int[] 
        {   0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0   };

        criticals = new int[] {12,12,12,12,12,6,6,6};
        hardpoints = new int[][] 
        {   {0,0,0,0},
            {0,0,0,0},
            {0,0,0,0},
            {0,0,0,0},
            {0,0,0,0},
            {0,0,0,0},
            {0,0,0,0},
            {0,0,0,0}  };
        for (int i = 0; i < NUMBER_OF_CRITICAL_SECTIONS; i++)
            items[i] = new Vector();
    }
    
    public int getTotalArmor() {
        int total = 0;
        
        for (int i = 0; i < NUMBER_OF_SECTIONS; i++)
            total += armor[i];
        
        return total;
    }
    
    public int getTotalCriticals() {
        int total = 78;
        
        for (int i = 0; i < NUMBER_OF_CRITICAL_SECTIONS; i++)
            total -= criticals[i];
        
        return total;
    }
}
