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
public class AC5_Ammo extends AmmoBin implements Serializable {
    public AC5_Ammo() {
        super();
        equipmentName = "AC5 Ammo";
        fullName = "Autocannon 5 Standard Ammunition";
        cost = 4500;
        shotsPerTon = 30;
    }
}
