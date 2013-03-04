package MWOMechbay.Components.Weapons;

import MWOMechbay.Mechs.MechCommon;
import java.io.Serializable;

/**
 *
 * @author Nemesis
 */
public class AC5 extends Weapon implements MechCommon, Serializable
{
    public AC5() {
        super();
        equipmentName = "AC5";
        fullName = "Autocannon 5";
        criticals = 4;
        cost = 125000 * 2;
        hardpointType = BALLISTIC;
        velocity = 1300;
        minimumRange = 0;
        effectiveRange = 540;
        maximumRange = effectiveRange * PROJECTILE_RANGE_MODIFIER;
        projectileCount = 1;
        tonnage = 8.0;
        damage = 5.0;
        heat = 1.0;
        duration = 0.0;
        heatToTarget = 0.0;
        recycle = 1.7;
        delay = 0.0;
        spread = 0.0;
        knock = 1.0;
    }
}
