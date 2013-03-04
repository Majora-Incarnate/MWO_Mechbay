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
public class LRM10 extends Weapon implements MechCommon, Serializable
{
    public LRM10(boolean artemisIVFlag) {
        super();
        hardpointType = MISSILE;
        velocity = LRM_SPEED;
        minimumRange = LRM_MIN_RANGE;
        effectiveRange = LRM_RANGE;
        maximumRange = LRM_MAX_RANGE;
        projectileCount = 10;
        damage = LRM_DAMAGE * projectileCount;
        heat = 4.0;
        duration = 0.0;
        heatToTarget = 0.0;
        recycle = 3.75;
        delay = LRM_DELAY;
        spread = 0.0;
        knock = LRM_IMPULSE;
        artemisIVCapable = true;
        
        if (artemisIVFlag) {
            equipmentName = "ALRM10";
            fullName = "Long Range Missile Launcher 10 w/Artemis IV";
            criticals = 2 + ARTEMIS_IV_CRITICALS;
            cost = 100000 * 2 * ARTEMIS_IV_COST;
            tonnage = 5.0 + ARTEMIS_IV_TONNAGE;
            damage = LRM_DAMAGE * projectileCount;
        }
        else {
            equipmentName = "LRM10";
            fullName = "Long Range Missile Launcher 10";
            criticals = 2;
            cost = 100000 * 2;
            tonnage = 5.0;
        }
    }
}
