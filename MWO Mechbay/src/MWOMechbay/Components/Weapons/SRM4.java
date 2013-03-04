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
public class SRM4 extends Weapon implements MechCommon, Serializable
{
    public SRM4(boolean artemisIVFlag) {
        super();
        hardpointType = MISSILE;
        velocity = SRM_SPEED;
        minimumRange = 0;
        effectiveRange = SRM_RANGE;
        maximumRange = effectiveRange;
        projectileCount = 4;
        damage = SRM_DAMAGE * projectileCount;
        heat = 3.0;
        duration = 0.0;
        heatToTarget = 0.0;
        recycle = 3.75;
        delay = SRM_DELAY;
        spread = 0.0;
        knock = 1.0;
        artemisIVCapable = true;
        cost = 120000;
        
        if (artemisIVFlag) {
            equipmentName = "ASRM4";
            fullName = "Short Range Missile Launcher 4 w/Artemis IV";
            criticals = 1 + ARTEMIS_IV_CRITICALS;
            tonnage = 2.0 + ARTEMIS_IV_TONNAGE;
        }
        else {
            equipmentName = "SRM4";
            fullName = "Short Range Missile Launcher 4";
            criticals = 1;
            tonnage = 2.0;
        }
    }
}
