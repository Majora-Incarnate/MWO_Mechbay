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
public class NARC extends Weapon implements MechCommon, Serializable
{
    public NARC() {
        super();
        equipmentName = "NARC";
        fullName = "NARC Beacon Launcher";
        criticals = 2;
        cost = 100000 * 2;
        hardpointType = MISSILE;
        velocity = SRM_SPEED;
        minimumRange = 0;
        effectiveRange = SRM_RANGE;
        maximumRange = effectiveRange;
        projectileCount = 1;
        tonnage = 3.0;
        damage = 0;
        heat = 2.0;
        duration = 0.0;
        heatToTarget = 0.0;
        recycle = SRM_RECYCLE;
        delay = SRM_DELAY;
        spread = 0.0;
        knock = 0;
    }
}
