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
public class LRM5 extends Weapon implements MechCommon, Serializable
{
    public LRM5(boolean artemisIVFlag) {
        super();
        hardpointType = MISSILE;
        velocity = LRM_SPEED;
        minimumRange = LRM_MIN_RANGE;
        effectiveRange = LRM_RANGE;
        maximumRange = LRM_MAX_RANGE;
        projectileCount = 5;
        damage = LRM_DAMAGE * projectileCount;
        heat = 2.0;
        duration = 0.0;
        heatToTarget = 0.0;
        recycle = 3.25;
        delay = LRM_DELAY;
        spread = 0.0;
        knock = LRM_IMPULSE;
        artemisIVCapable = true;
        
        if (artemisIVFlag) {
            equipmentName = "ALRM5";
            fullName = "Long Range Missile Launcher 5 w/Artemis IV";
            criticals = 1 + ARTEMIS_IV_CRITICALS;
            cost = 30000 * 2 * ARTEMIS_IV_COST;
            tonnage = 2.0 + ARTEMIS_IV_TONNAGE;
        }
        else {
            equipmentName = "LRM5";
            cost = 30000 * 2;
            fullName = "Long Range Missile Launcher 5";
            criticals = 1;
            projectileCount = 5;
            tonnage = 2.0;
        }
    }
}
