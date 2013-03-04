package MWOMechbay.Mechs;

import MWOMechbay.Components.Item;
import java.util.Vector;

/**
 *
 * @author Nemesis
 */
public class Mech implements MechCommon
{
    protected double tonnage;
    protected String mechName;
    protected String modelName;
    protected long baseCost;
    protected int modules;
    protected boolean stockDoubleHeatSinks;
    protected boolean stockEndoSteel;
    protected boolean stockFerroFibrous;
    protected boolean stockXLEngine;
    protected boolean stockArtemisIV;
    protected boolean jumpJetCapable;
    protected boolean ECMCapable;
    protected int stockEngineRating;
    protected int stockExtraHeatSinks;
    protected int maxJumpJets;
    protected boolean unconfirmed;
    protected boolean unreleased;
    protected String iconPath;
    protected boolean[][] actuators;
    
    protected int[][] limitsForPitchYaw;
    
    protected int[][] hardpoints;
    
    protected int[] health;
    
    protected int[] stockArmor;
    
    protected Vector<Item>[] stockArmament;
    
    public Mech()
    {
        tonnage = 0.0;
        mechName = "";
        modelName = "";
        baseCost = 0;
        modules = 0;
        stockDoubleHeatSinks = false;
        stockEndoSteel = false;
        stockFerroFibrous = false;
        stockXLEngine = false;
        stockArtemisIV = false;
        jumpJetCapable = false;
        ECMCapable = false;
        unconfirmed = false;
        unreleased = false;
        stockEngineRating = 100;
        stockExtraHeatSinks = 0;
        maxJumpJets = 0;
        iconPath = "/MWOMechbay/Resources/Default_Medium.gif";
        actuators = new boolean[2][2];
        limitsForPitchYaw = new int[NUMBER_OF_MOVING_SECTIONS][AXIS_OF_MOVEMENT];
        hardpoints = new int[NUMBER_OF_CRITICAL_SECTIONS][NUMBER_OF_HARDPOINT_TYPES];
        health = new int[NUMBER_OF_CRITICAL_SECTIONS];
        stockArmor = new int[NUMBER_OF_SECTIONS];
        
        stockArmament = new Vector[NUMBER_OF_CRITICAL_SECTIONS];
    
        for (int i = 0; i < NUMBER_OF_CRITICAL_SECTIONS; i++)
            stockArmament[i] = new Vector();
    }
    
    public double getTonnage() {
        return tonnage;
    }
    
    public String getChassis() {
        return mechName;
    }
    
    public String getModel() {
        return modelName;
    }
    
    public int getStockEngineRating() {
        return stockEngineRating;
    }
    
    private double getEngineMod() {
        if (tonnage > 55)
            return 1.2;
        else if (tonnage > 35)
            return 1.3;
        else
            return 1.4;
    }
    
    public int getMaxEngineRating() {
        if (stockEngineRating * getEngineMod() >= 400 && tonnage * 8.6 >= 400)
            return 400;
        else if (tonnage * 8.6 < stockEngineRating * getEngineMod())
            return (int) ((tonnage * 8.6) - (tonnage * 8.6) % 5);
        else
            return (int) (Math.ceil((stockEngineRating * getEngineMod()) / 5) * 5);
    }
    
    public int getMinEngineRating() {
        if ((int)(tonnage * 2) < 100)
            return 100;
        else
            return (int)(tonnage * 2);
    }
    
    public int getStockTotalArmor() {
        int total = 0;
        
        for (int i = 0; i < NUMBER_OF_SECTIONS; i++)
            total += stockArmor[i];
        
        return total;
    }
    
    public int getMaxTotalInternals() {
        int total = 0;
        
        for (int i = 0; i < NUMBER_OF_CRITICAL_SECTIONS; i++)
            total += health[i];
        
        return total;
    }
    
    public int getMaxTotalArmor() {
        int total = 0;
        
        for (int i = 0; i < NUMBER_OF_CRITICAL_SECTIONS; i++)
            total += getMaxArmor(i);
        
        return total;
    }
    
    public int getStockExtraHeatSinks() {
        return stockExtraHeatSinks;
    }
    
    public boolean hasXLEngine() {
        return stockXLEngine;
    }
    
    public boolean hasJumpJets() {
        return jumpJetCapable;
    }
    
    public boolean isECMCapable() {
        return ECMCapable;
    }
    
    public boolean isUnconfirmed() {
        return unconfirmed;
    }
    
    public boolean isUnreleased() {
        return unreleased;
    }
    
    public boolean hasArtemisIV() {
        return stockArtemisIV;
    }
    
    public int getHardpoints(int section, int hardpointType) {
        return hardpoints[section][hardpointType];
    }
    
    public int getTotalHardpoints(int hardpointType) {
        int total = 0;
        
        for (int i = 0; i < NUMBER_OF_CRITICAL_SECTIONS; i++)
            total += hardpoints[i][hardpointType];
        
        return total;
    }
    
    public int getMaxArmor(int section) {
        if (section == HEAD)
            return 18;
        
        return (health[section] * 2);
    }
    
    public int getMaxInternals(int section) {
        return health[section];
    }
    
    public int getStockArmor(int x) {
        return stockArmor[x];
    }
    
    public Vector<Item>[] getStockArmament() {
        return stockArmament.clone();
    }
    
    public Item getItem(int section, int index) {
        return stockArmament[section].elementAt(index);
    }
    
    public int getNumberOfItems(int section) {
        return stockArmament[section].size();
    }
    
    public long getCost() {
        return baseCost;
    }
    
    public int getMCCost() {
        if (baseCost == 0)
            return (int)(tonnage * 75);
        else
            return (int)Math.ceil((baseCost / 2500) / 5.0) * 5;
    }
    
    public boolean hasDoubleHeatSinks() {
        return stockDoubleHeatSinks;
    }
    
    public boolean hasEndoSteel() {
        return stockEndoSteel;
    }
    
    public boolean hasFerroFibrous() {
        return stockFerroFibrous;
    }
    
    public boolean isJumpCapable() {
        return jumpJetCapable;
    }
    
    public int getModules() {
        return modules;
    }
    public int getMovementLimits(int sectionIndex, int axisIndex) {
        return limitsForPitchYaw[sectionIndex][axisIndex];
    }
    
    public String getIconPath() {
        return iconPath;
    }
    
    public boolean getActuator(int x, int y) {
        return actuators[x][y];
    }
    
    public int getMaxJumpJets() {
        return maxJumpJets;
    }
}