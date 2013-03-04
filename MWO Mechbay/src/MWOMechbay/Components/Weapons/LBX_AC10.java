package MWOMechbay.Components.Weapons;

import MWOMechbay.Mechs.MechCommon;
import java.io.Serializable;

/**
 *
 * @author Nemesis
 */
public class LBX_AC10 extends Weapon implements MechCommon, Serializable
{
    public LBX_AC10() {
        super();
        equipmentName = "LBX10";
        fullName = "Lubalin Ballistics-X Autocannon 10";
        criticals = 6;
        cost = 400000 * 2;
        hardpointType = BALLISTIC;
        velocity = 1100;
        minimumRange = 0;
        effectiveRange = 540;
        maximumRange = effectiveRange * PROJECTILE_RANGE_MODIFIER;
        projectileCount = 10;
        tonnage = 11.0;
        damage = 1.0 * projectileCount;
        heat = 2.0;
        duration = 0.0;
        heatToTarget = 0.0;
        recycle = 2.5;
        delay = 0.0;
        spread = 3.0;
        knock = 1.0;
    }
}
