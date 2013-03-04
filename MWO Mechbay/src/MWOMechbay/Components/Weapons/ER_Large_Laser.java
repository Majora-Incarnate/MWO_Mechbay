package MWOMechbay.Components.Weapons;

import MWOMechbay.Mechs.MechCommon;
import java.io.Serializable;

/**
 *
 * @author Nemesis
 */
public class ER_Large_Laser extends Weapon implements MechCommon, Serializable
{
    public ER_Large_Laser() {
        super();
        equipmentName = "ER Large Laser";
        fullName = "ER Large Laser";
        criticals = 2;
        cost = 200000 * 2;
        hardpointType = ENERGY;
        velocity = 0;
        minimumRange = 0;
        effectiveRange = 675;
        maximumRange = effectiveRange * LASER_RANGE_MODIFIER;
        projectileCount = 1;
        tonnage = 5.0;
        damage = 9.0;
        heat = 9.5;
        duration = 1.00;
        heatToTarget = 0.0;
        recycle = 3.25;
        delay = 0.0;
        spread = 0.0;
        knock = 0.0;
    }
}
