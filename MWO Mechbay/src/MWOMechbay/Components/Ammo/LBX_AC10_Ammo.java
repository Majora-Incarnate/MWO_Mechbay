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
public class LBX_AC10_Ammo extends AmmoBin implements Serializable {
    public LBX_AC10_Ammo() {
        super();
        equipmentName = "LBX10 Ammo";
        fullName = "Lubalin Ballistics-X Autocannon 10 Cluster Ammunition";
        cost = 19995;
        shotsPerTon = 15;
    }
}
