package MWOMechbay.Components.Weapons;

import MWOMechbay.Mechs.MechCommon;
import java.io.Serializable;

/**
 *
 * @author Nemesis
 */
public class ER_PPC extends Weapon implements MechCommon, Serializable
{
    public ER_PPC() {
        super();
        equipmentName = "ERPPC";
        fullName = "Extended Range Particle Projection Cannon (ER PPC)";
        criticals = 3;
        cost = 300000;
        hardpointType = ENERGY;
        velocity = 2000;
        minimumRange = 0;
        effectiveRange = 810;
        maximumRange = effectiveRange * LASER_RANGE_MODIFIER;
        projectileCount = 1;
        tonnage = 7.0;
        damage = 10.0;
        heat = 11.0;
        duration = 0.0;
        heatToTarget = 0.0;
        recycle = 3.0;
        delay = 0.0;
        spread = 0.0;
        knock = 1.0;
    }
}
