/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MWOMechbay.Components.OtherEquipment;

import MWOMechbay.Components.Equipment;
import MWOMechbay.Mechs.MechCommon;

/**
 *
 * @author Nemesis
 */
public class Other_Equipment extends Equipment implements MechCommon {
    public Other_Equipment() {
        super();
        itemType = OTHER_ITEM_TYPE;
        hardpointType = OMNI;
    }
}
