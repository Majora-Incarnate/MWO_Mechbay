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
public class SRM_Ammo extends AmmoBin implements Serializable {
    public SRM_Ammo(boolean artemisFlag) {
        super();
        shotsPerTon = 100;
        
        if (artemisFlag) {
            equipmentName = "ASRM Ammo";
            fullName = "Artemis Short Range Missile Standard Ammunition";
            cost = 54000;
        }
        else {
            equipmentName = "SRM Ammo";
            fullName = "Short Range Missile Standard Ammunition";
            cost = 27000;
        }
    }
}
