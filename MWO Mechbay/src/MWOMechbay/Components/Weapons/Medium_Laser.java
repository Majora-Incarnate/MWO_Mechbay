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
public class Medium_Laser extends Weapon implements MechCommon, Serializable
{
    public Medium_Laser() {
        super();
        equipmentName = "Medium Laser";
        fullName = "Medium Laser";
        criticals = 1;
        cost = 80000;
        hardpointType = ENERGY;
        velocity = 0;
        minimumRange = 0;
        effectiveRange = 270;
        maximumRange = effectiveRange * LASER_RANGE_MODIFIER;
        projectileCount = 1;
        tonnage = 1.0;
        damage = 5.0;
        heat = 4.0;
        duration = 1.0;
        heatToTarget = 0.0;
        recycle = 3.0;
        delay = 0.0;
        spread = 0.0;
        knock = 0.0;
    }
}
