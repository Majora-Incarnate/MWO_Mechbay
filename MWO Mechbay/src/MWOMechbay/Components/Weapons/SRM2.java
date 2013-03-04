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
public class SRM2 extends Weapon implements MechCommon, Serializable
{
    public SRM2(boolean artemisIVFlag) {
        super();
        hardpointType = MISSILE;
        velocity = SRM_SPEED;
        minimumRange = 0;
        effectiveRange = SRM_RANGE;
        maximumRange = effectiveRange;
        projectileCount = 2;
        damage = SRM_DAMAGE * projectileCount;
        heat = 2.0;
        duration = 0.0;
        heatToTarget = 0.0;
        recycle = 3.5;
        delay = SRM_DELAY;
        spread = 0.0;
        knock = 1.0;
        artemisIVCapable = true;
        
        if (artemisIVFlag) {
            equipmentName = "ASRM2";
            fullName = "Short Range Missile Launcher 2 w/Artemis IV";
            criticals = 1 + ARTEMIS_IV_CRITICALS;
            cost = 10000 * 2;
            tonnage = 1.0 + ARTEMIS_IV_TONNAGE;
        }
        else {
            equipmentName = "SRM2";
            fullName = "Short Range Missile Launcher 2";
            criticals = 1;
            cost = 10000 * 2;
            tonnage = 1.0;
        }
    }
}
