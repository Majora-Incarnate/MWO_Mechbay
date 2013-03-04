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
public class Gauss_Rifle extends Weapon implements MechCommon, Serializable
{
    public Gauss_Rifle() {
        super();
        equipmentName = "Gauss Rifle";
        fullName = "Gauss Rifle";
        criticals = 7;
        cost = 300000 * 2;
        hardpointType = BALLISTIC;
        velocity = 1200;
        minimumRange = 0;
        effectiveRange = 660;
        maximumRange = effectiveRange * PROJECTILE_RANGE_MODIFIER;
        projectileCount = 1;
        tonnage = 15.0;
        damage = 15.0;
        heat = 1.0;
        duration = 0.0;
        heatToTarget = 0.0;
        recycle = 4.0;
        delay = 0.0;
        spread = 0.0;
        knock = 1.0;
    }
}
