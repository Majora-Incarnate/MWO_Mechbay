/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MWOMechbay.Components.Ammo;

import java.io.Serializable;

/**
 *
 * @author Nemesis
 */
public class LRM_Ammo extends AmmoBin implements Serializable {
    public LRM_Ammo(boolean artemisFlag) {
        super();
        shotsPerTon = 180;
        
        if (artemisFlag) {
            equipmentName = "ALRM Ammo";
            fullName = "Artemis Long Range Missile Standard Ammunition";
            cost = 60120;
        }
        else {
            equipmentName = "LRM Ammo";
            fullName = "Long Range Missile Standard Ammunition";
            cost = 30060;
        }
    }
}
