package MWOMechbay.Components.Weapons;

import MWOMechbay.Mechs.MechCommon;
import java.io.Serializable;

/**
 *
 * @author Nemesis
 */
public class Ultra_AC5 extends Weapon implements MechCommon, Serializable
{
    public Ultra_AC5() {
        super();
        equipmentName = "Ultra AC5";
        fullName = "Ultra Autocannon 5";
        criticals = 5;
        cost = 200000 * 2;
        hardpointType = BALLISTIC;
        velocity = 1300;
        minimumRange = 0;
        effectiveRange = 600;
        maximumRange = effectiveRange * PROJECTILE_RANGE_MODIFIER;
        projectileCount = 2;
        tonnage = 9.0;
        damage = 5.0 * projectileCount;
        heat = 1.0 * projectileCount;
        duration = 0.0;
        heatToTarget = 0.0;
        recycle = 1.1;
        delay = 0.0;
        spread = 0.0;
        knock = 1.0;
    }
    
    public double getDamagePerSecond() {
        return (damage / (recycle + 2));
    }
    
    public double getHeatPerSecond() {
        return (heat / (recycle + 2));
    }
}
