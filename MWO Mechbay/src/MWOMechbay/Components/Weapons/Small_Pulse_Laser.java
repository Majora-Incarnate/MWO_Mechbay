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
public class Small_Pulse_Laser extends Weapon implements MechCommon, Serializable
{
    public Small_Pulse_Laser() {
        super();
        equipmentName = "Small Pulse Laser";
        fullName = "Small Pulse Laser";
        criticals = 1;
        cost = 16000 * 2;
        hardpointType = ENERGY;
        velocity = 0;
        minimumRange = 0;
        effectiveRange = 90;
        maximumRange = effectiveRange * LASER_RANGE_MODIFIER;
        projectileCount = 1;
        tonnage = 1.0;
        damage = 3.0;
        heat = 3.0;
        duration = 0.5;
        heatToTarget = 0.0;
        recycle = 2.25;
        delay = 0.0;
        spread = 0.0;
        knock = 0.0;
    }
}
