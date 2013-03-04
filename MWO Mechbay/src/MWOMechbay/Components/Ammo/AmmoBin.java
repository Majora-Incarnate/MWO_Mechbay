/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MWOMechbay.Components.Ammo;

import MWOMechbay.Components.Equipment;
import MWOMechbay.Mechs.MechCommon;

/**
 *
 * @author Nemesis
 */
public class AmmoBin extends Equipment implements MechCommon {
    protected int shotsPerTon;
    
    public AmmoBin() {
        super();
        itemType = AMMO_ITEM_TYPE;
        hardpointType = OMNI;
        shotsPerTon = 0;
        tonnage = 1.0;
        criticals = 1;
    }
    
    public int getShotsPerTon() {
        return shotsPerTon;
    }
}
