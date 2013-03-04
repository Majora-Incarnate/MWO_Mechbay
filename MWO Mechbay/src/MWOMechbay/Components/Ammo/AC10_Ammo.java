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
public class AC10_Ammo extends AmmoBin implements Serializable {
    public AC10_Ammo() {
        super();
        equipmentName = "AC10 Ammo";
        fullName = "Autocannon 10 Standard Ammunition";
        cost = 6000;
        shotsPerTon = 15;
    }
}
