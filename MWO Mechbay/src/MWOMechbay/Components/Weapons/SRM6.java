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
public class SRM6 extends Weapon implements MechCommon, Serializable
{
    public SRM6(boolean artemisIVFlag) {
        super();
        hardpointType = MISSILE;
        velocity = SRM_SPEED;
        minimumRange = 0;
        effectiveRange = SRM_RANGE;
        maximumRange = effectiveRange;
        projectileCount = 6;
        damage = SRM_DAMAGE * projectileCount;
        heat = 4.0;
        duration = 0.0;
        heatToTarget = 0.0;
        recycle = 4.0;
        delay = SRM_DELAY;
        spread = 0.0;
        knock = 1.0;
        artemisIVCapable = true;
        
        if (artemisIVFlag) {
            equipmentName = "ASRM6";
            fullName = "Short Range Missile Launcher 6 w/Artemis IV";
            criticals = 2 + ARTEMIS_IV_CRITICALS;
            cost = 80000 * 2;
            tonnage = 3.0 + ARTEMIS_IV_TONNAGE;
        }
        else {
            equipmentName = "SRM6";
            fullName = "Short Range Missile Launcher 6";
            criticals = 2;
            cost = 80000 * 2;
            tonnage = 3.0;
        }
    }
}
