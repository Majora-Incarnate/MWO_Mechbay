package MWOMechbay.Components.Components;

import MWOMechbay.Components.Component;
import MWOMechbay.GUI.MainCommon;
import java.io.Serializable;

/**
 *
 * @author Nemesis
 */
public class Cockpit extends Component implements MainCommon, Serializable
{
    public Cockpit(boolean cockpitFlag) {
        super();
        itemType = COCKPIT_ITEM_TYPE;
        
        if (!cockpitFlag) {
            equipmentName = "Cockpit";
            fullName = "Standard Cockpit";
            criticals = 1;
        }
        else {
            equipmentName = "Command Console";
            fullName = "Command Console Cockpit";
            criticals = 2;
            tonnage = 3.0;
            cost = 300000;
        }
    }
}
