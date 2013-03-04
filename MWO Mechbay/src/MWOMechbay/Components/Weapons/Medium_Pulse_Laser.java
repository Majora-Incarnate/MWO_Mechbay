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
public class Medium_Pulse_Laser extends Weapon implements MechCommon, Serializable
{
    public Medium_Pulse_Laser() {
        super();
        equipmentName = "Medium Pulse Laser";
        fullName = "Medium Pulse Laser";
        criticals = 1;
        cost = 60000 * 2;
        hardpointType = ENERGY;
        velocity = 0;
        minimumRange = 0;
        effectiveRange = 180;
        maximumRange = effectiveRange * LASER_RANGE_MODIFIER;
        projectileCount = 1;
        tonnage = 2.0;
        damage = 6.0;
        heat = 5.0;
        duration = 0.75;
        heatToTarget = 0.0;
        recycle = 3.0;
        delay = 0.0;
        spread = 0.0;
        knock = 0.0;
    }
}
