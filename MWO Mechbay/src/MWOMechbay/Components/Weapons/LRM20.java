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
public class LRM20 extends Weapon implements MechCommon, Serializable
{
    public LRM20(boolean artemisIVFlag) {
        super();
        hardpointType = MISSILE;
        velocity = LRM_SPEED;
        minimumRange = LRM_MIN_RANGE;
        effectiveRange = LRM_RANGE;
        maximumRange = LRM_MAX_RANGE;
        projectileCount = 20;
        damage = LRM_DAMAGE * projectileCount;
        heat = 6.0;
        duration = 0.0;
        heatToTarget = 0.0;
        recycle = 4.75;
        delay = LRM_DELAY;
        spread = 0.0;
        knock = LRM_IMPULSE;
        artemisIVCapable = true;
        
        if (artemisIVFlag) {
            equipmentName = "ALRM20";
            fullName = "Long Range Missile Launcher 20 w/Artemis IV";
            criticals = 5 + ARTEMIS_IV_CRITICALS;
            cost = 250000 * 2 * ARTEMIS_IV_COST;
            tonnage = 10.0 + ARTEMIS_IV_TONNAGE;
        }
        else {
            equipmentName = "LRM20";
            fullName = "Long Range Missile Launcher 20";
            criticals = 5;
            cost = 250000 * 2;
            tonnage = 10.0;
        }
    }
}
