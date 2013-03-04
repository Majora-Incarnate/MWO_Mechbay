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
public class AC2_Ammo extends AmmoBin implements Serializable {
    public AC2_Ammo() {
        super();
        equipmentName = "AC2 Ammo";
        fullName = "Autocannon 2 Standard Ammunition";
        cost = 975;
        shotsPerTon = 75;
    }
}
