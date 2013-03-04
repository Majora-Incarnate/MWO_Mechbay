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
public class MG_Ammo extends AmmoBin implements Serializable {
    public MG_Ammo() {
        super();
        equipmentName = "MG Ammo";
        fullName = "Machine Gun Ammunition";
        cost = 2000;
        shotsPerTon = 2000;
    }
}
