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
public class Streak_SRM2 extends Weapon implements MechCommon, Serializable
{
    public Streak_SRM2() {
        super();
        equipmentName = "Streak SRM2";
        fullName = "Streak Short Range Missile Launcher 2";
        criticals = 1;
        cost = 15000 * 2;
        hardpointType = MISSILE;
        velocity = STREAK_SRM_SPEED;
        minimumRange = 0;
        effectiveRange = SRM_RANGE;
        maximumRange = effectiveRange;
        projectileCount = 2;
        tonnage = 1.5;
        damage = SRM_DAMAGE * projectileCount;
        heat = 2.0;
        duration = 0.0;
        heatToTarget = 0.0;
        recycle = 3.5;
        delay = SRM_DELAY;
        spread = 0.0;
        knock = 1.0;
    }
}
