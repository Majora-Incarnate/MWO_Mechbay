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
public class AC2 extends Weapon implements MechCommon, Serializable
{
    public AC2() {
        super();
        equipmentName = "AC2";
        fullName = "Autocannon 2";
        criticals = 1;
        cost = 75000 * 2;
        hardpointType = BALLISTIC;
        velocity = 2000;
        minimumRange = 0;
        effectiveRange = 720;
        maximumRange = effectiveRange * PROJECTILE_RANGE_MODIFIER;
        projectileCount = 1;
        tonnage = 6.0;
        damage = 2.0;
        heat = 1.0;
        duration = 0.0;
        heatToTarget = 0.0;
        recycle = 0.5;
        delay = 0.0;
        spread = 0.0;
        knock = 1.0;
    }
}
