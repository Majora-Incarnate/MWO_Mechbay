/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MWOMechbay.Components.Weapons;

import MWOMechbay.Mechs.MechCommon;
import java.io.Serializable;

/**
 *
 * @author Nemesis
 */
public class Flamer extends Weapon implements MechCommon, Serializable
{
    public Flamer() {
        super();
        equipmentName = "Flamer";
        fullName = "Flamer";
        criticals = 1;
        cost = 7500 * 2;
        hardpointType = ENERGY;
        velocity = 0;
        minimumRange = 0;
        effectiveRange = 64;
        maximumRange = effectiveRange;
        projectileCount = 1;
        tonnage = 1.0;
        damage =0.4;
        heat = 0.6;
        duration = 0.5;
        heatToTarget = 0.2;
        recycle = 0.0;
        delay = 0.0;
        spread = 0.0;
        knock = 0.0;
    }
}
