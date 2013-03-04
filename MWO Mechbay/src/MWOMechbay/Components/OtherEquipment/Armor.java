/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MWOMechbay.Components.OtherEquipment;

import java.io.Serializable;

/**
 *
 * @author Nemesis
 */
public class Armor extends Other_Equipment implements Serializable {
    protected static double pointsPerTon;
    protected static int costPerTon;
    protected static int upgradeCost;
    protected static int totalArmor;
    
    public Armor(boolean armorFlag, int armorAmount) {
        super();
        itemType = ARMOR_ITEM_TYPE;
        totalArmor = armorAmount;
        
        if (armorFlag) {
            criticals = 1;
            pointsPerTon = 35.84;
            costPerTon = 19999;//19530
            upgradeCost = 5000;
            equipmentName = "Ferro Fibrous";
            fullName = "Ferro Fibrous Armor";
        }
        else {
            criticals = 0;
            pointsPerTon = 32.00;
            costPerTon = 10016;
            upgradeCost = 2500;
            equipmentName = "Standard";
            fullName = "Standard Armor";
        }
        calculateValues();
    }
    
    public double getPointsPerTon() {
        return pointsPerTon;
    }
    
    public int getCostPerTon() {
        return costPerTon;
    }
    
    public void adjustArmor(int armorAmount) {
        totalArmor += armorAmount;
        calculateValues();
    }
    
    private void calculateValues() {
        tonnage = totalArmor / pointsPerTon;
        cost = (int)Math.ceil(tonnage) * costPerTon;
    }
    
    public int getUpgradeCost() {
        return upgradeCost;
    }
}
