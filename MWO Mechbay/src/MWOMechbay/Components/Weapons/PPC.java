package MWOMechbay.Components.Weapons;

import MWOMechbay.Mechs.MechCommon;
import java.io.Serializable;

/**
 *
 * @author Nemesis
 */
public class PPC extends Weapon implements MechCommon, Serializable
{
    public PPC() {
        super();
        equipmentName = "PPC";
        fullName = "Particle Projection Cannon (PPC)";
        criticals = 3;
        cost = 200000 * 2;
        hardpointType = ENERGY;
        velocity = 2000;
        minimumRange = 90;
        effectiveRange = 540;
        maximumRange = effectiveRange * LASER_RANGE_MODIFIER;
        projectileCount = 1;
        tonnage = 7.0;
        damage = 10.0;
        heat = 8.0;
        duration = 0.0;
        heatToTarget = 0.0;
        recycle = 3.0;
        delay = 0.0;
        spread = 0.0;
        knock = 1.0;
    }
}
