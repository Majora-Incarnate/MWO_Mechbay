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
public class Heat_Sink extends Other_Equipment implements Serializable {
    protected static double heatDissipation;
    protected static int upgradeCost;
    
    public Heat_Sink(boolean typeFlag) {
        super();
        tonnage = 1.0;
        itemType = HEAT_SINK_ITEM_TYPE;
        
        if (typeFlag) {
            equipmentName = "Double Heat Sink";
            fullName = "Double Heat Sink";
            criticals = 3;
            cost = 12000;
            upgradeCost = 1500000;
            heatDissipation = 0.14;
        }
        else {
            equipmentName = "Heat Sink";
            fullName = "Standard Heat Sink";
            criticals = 1;
            cost = 4000;
            upgradeCost = 750000;
            heatDissipation = 0.1;
        }
    }
    
    public double getHeatDissipation() {
        return heatDissipation;
    }
    
    public int getUpgradeCost() {
        return upgradeCost;
    }
}
