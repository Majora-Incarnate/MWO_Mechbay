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
public class Streak_SRM_Ammo extends AmmoBin implements Serializable {
    public Streak_SRM_Ammo() {
        super();
        equipmentName = "Streak SRM Ammo";
        fullName = "Streak Short Range Missile Ammunition";
        cost = 54000;
        shotsPerTon = 100;
    }
}
