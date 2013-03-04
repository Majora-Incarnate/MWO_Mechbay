package MWOMechbay.Components.Weapons;

import MWOMechbay.Mechs.MechCommon;
import java.io.Serializable;

/**
 *
 * @author Nemesis
 */
public class AC20 extends Weapon implements MechCommon, Serializable
{
    public AC20() {
        super();
        equipmentName = "AC20";
        fullName = "Autocannon 20";
        criticals = 10;
        cost = 300000 * 2;
        hardpointType = BALLISTIC;
        velocity = 900;
        minimumRange = 0;
        effectiveRange = 270;
        maximumRange = effectiveRange * PROJECTILE_RANGE_MODIFIER;
        projectileCount = 1;
        tonnage = 14.0;
        damage = 20.0;
        heat = 6.0;
        duration = 0.0;
        heatToTarget = 0.0;
        recycle = 4.0;
        delay = 0.0;
        spread = 0.0;
        knock = 1.0;
    }
}
