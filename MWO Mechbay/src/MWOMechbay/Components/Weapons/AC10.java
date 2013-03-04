package MWOMechbay.Components.Weapons;

import MWOMechbay.Mechs.MechCommon;
import java.io.Serializable;

/**
 *
 * @author Nemesis
 */
public class AC10 extends Weapon implements MechCommon, Serializable
{
    public AC10() {
        super();
        equipmentName = "AC10";
        fullName = "Autocannon 10";
        criticals = 7;
        cost = 200000 * 2;
        hardpointType = BALLISTIC;
        velocity = 1100;
        minimumRange = 0;
        effectiveRange = 450;
        maximumRange = effectiveRange * PROJECTILE_RANGE_MODIFIER;
        projectileCount = 1;
        tonnage = 12.0;
        damage = 10.0;
        heat = 3;
        duration = 0.0;
        heatToTarget = 0.0;
        recycle = 2.5;
        delay = 0.0;
        spread = 0.0;
        knock = 1.0;
    }
}
