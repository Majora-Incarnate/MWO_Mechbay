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
public class Gauss_Ammo extends AmmoBin implements Serializable {
    public Gauss_Ammo() {
        super();
        equipmentName = "Gauss Ammo";
        fullName = "Gauss Rifle Ammunition";
        cost = 20000;
        shotsPerTon = 10;
    }
}
