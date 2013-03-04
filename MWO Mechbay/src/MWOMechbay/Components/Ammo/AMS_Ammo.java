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
public class AMS_Ammo extends AmmoBin implements Serializable {
    public AMS_Ammo() {
        super();
        equipmentName = "AMS Ammo";
        fullName = "Anti-Missile System Ammunition";
        cost = 2000;
        shotsPerTon = 1000;
    }
}
