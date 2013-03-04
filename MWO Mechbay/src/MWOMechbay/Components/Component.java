/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MWOMechbay.Components;

import MWOMechbay.Mechs.MechCommon;

/**
 *
 * @author Nemesis
 */
public class Component extends Item implements MechCommon {
    public Component() {
        super();
        itemType = COMPONENT_ITEM_TYPE;
        hardpointType = OMNI;
        removable = false;
    }
}
