/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MWOMechbay.Components;

/**
 *
 * @author Nemesis
 */
public class Item extends Object {
    protected String equipmentName;
    protected String fullName;
    protected int criticals;
    protected int cost;
    protected int itemType;
    protected int hardpointType;
    protected double tonnage;
    protected boolean removable;
    
    public Item() {
        equipmentName = "";
        fullName = "";
        criticals = 0;
        cost = 0;
        itemType = -1;
        hardpointType = -1;
        tonnage = 0;
        removable = true;
    }
    
    public String getEquipmentName() {
        return equipmentName;
    }
    
    public String getFullName() {
        return fullName;
    }
    
    public int getCriticals() {
        return criticals;
    }
    
    public int getCost() {
        return cost;
    }
    
    public int getItemType() {
        return itemType;
    }
    
    public int getHardpointType() {
        return hardpointType;
    }
    
    public double getTonnage() {
        return tonnage;
    }
    
    public boolean isRemovable() {
        return removable;
    }
    
    public String toString() {
        return equipmentName;
    }
}
