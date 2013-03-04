package MWOMechbay.Components.Weapons;

import MWOMechbay.Mechs.MechCommon;
import java.io.Serializable;

/**
 *
 * @author Nemesis
 */
public class Large_Pulse_Laser extends Weapon implements MechCommon, Serializable
{
    public Large_Pulse_Laser() {
        super();
        equipmentName = "Large Pulse Laser";
        fullName = "Large Pulse Laser";
        criticals = 2;
        cost = 175000 * 2;
        hardpointType = ENERGY;
        velocity = 0;
        minimumRange = 0;
        effectiveRange = 300;
        maximumRange = effectiveRange * LASER_RANGE_MODIFIER;
        projectileCount = 1;
        tonnage = 7.0;
        damage = 10.0;
        heat = 7.3;
        duration = 0.75;
        heatToTarget = 0.0;
        recycle = 3.25;
        delay = 0.0;
        spread = 0.0;
        knock = 0.0;
    }
}
