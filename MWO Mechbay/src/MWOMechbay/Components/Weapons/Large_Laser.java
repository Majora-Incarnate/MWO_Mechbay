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
public class Large_Laser extends Weapon implements MechCommon, Serializable
{
    public Large_Laser() {
        super();
        equipmentName = "Large Laser";
        fullName = "Large Laser";
        criticals = 2;
        cost = 100000 * 2;
        hardpointType = ENERGY;
        velocity = 0;
        minimumRange = 0;
        effectiveRange = 450;
        maximumRange = effectiveRange * LASER_RANGE_MODIFIER;
        projectileCount = 1;
        tonnage = 5.0;
        damage = 9.0;
        heat = 7.0;
        duration = 1.00;
        heatToTarget = 0.0;
        recycle = 3.25;
        delay = 0.0;
        spread = 0.0;
        knock = 0.0;
    }
}
