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
public class Homing_Pod_Ammo extends AmmoBin implements Serializable {
    public Homing_Pod_Ammo() {
        super();
        equipmentName = "Homing Pod Ammo";
        fullName = "NARC Launcher Homing Poc Ammunition";
        cost = 6000;
        shotsPerTon = 6;
    }
}
