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
public class AC20_Ammo extends AmmoBin implements Serializable {
    public AC20_Ammo() {
        super();
        equipmentName = "AC20 Ammo";
        fullName = "Autocannon 20 Standard Ammunition";
        cost = 10003;
        shotsPerTon = 7;
    }
}
