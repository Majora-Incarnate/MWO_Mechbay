/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MWOMechbay.Components.SpecialEquipment;

import MWOMechbay.Components.Equipment;
import MWOMechbay.Mechs.MechCommon;

/**
 *
 * @author Nemesis
 */
public class Special_Equipment extends Equipment implements MechCommon {
    protected int range;
    
    public Special_Equipment() {
        super();
        itemType = EQUIPMENT_ITEM_TYPE;
        hardpointType = OMNI;
        range = 0;
    }
    
    public int getRange() {
        return range;
    }
}
