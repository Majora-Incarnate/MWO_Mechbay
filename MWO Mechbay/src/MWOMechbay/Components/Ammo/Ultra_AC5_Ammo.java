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
public class Ultra_AC5_Ammo extends AmmoBin implements Serializable {
    public Ultra_AC5_Ammo() {
        super();
        equipmentName = "Ultra AC5 Ammo";
        fullName = "Ultra Autocannon 5 Ammunition";
        cost = 9000;
        shotsPerTon = 25;
    }
}
