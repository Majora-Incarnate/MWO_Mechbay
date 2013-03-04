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
public class LRM15 extends Weapon implements MechCommon, Serializable
{
    public LRM15(boolean artemisIVFlag) {
        super();
        hardpointType = MISSILE;
        velocity = LRM_SPEED;
        minimumRange = LRM_MIN_RANGE;
        effectiveRange = LRM_RANGE;
        maximumRange = LRM_MAX_RANGE;
        projectileCount = 15;
        damage = LRM_DAMAGE * projectileCount;
        heat = 5.0;
        duration = 0.0;
        heatToTarget = 0.0;
        recycle = 4.25;
        delay = LRM_DELAY;
        spread = 0.0;
        knock = LRM_IMPULSE;
        artemisIVCapable = true;
        
        if (artemisIVFlag) {
            equipmentName = "ALRM15";
            fullName = "Long Range Missile Launcher 15 w/Artemis IV";
            criticals = 3 + ARTEMIS_IV_CRITICALS;
            cost = 175000 * 2 * ARTEMIS_IV_COST;
            tonnage = 7.0 + ARTEMIS_IV_TONNAGE;
        }
        else {
            equipmentName = "LRM15";
            fullName = "Long Range Missile Launcher 15";
            criticals = 3;
            cost = 175000 * 2;
            tonnage = 7.0;
        }
    }
}
