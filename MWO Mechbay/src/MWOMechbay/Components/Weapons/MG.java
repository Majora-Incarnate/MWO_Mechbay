/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MWOMechbay.Components.Weapons;

import MWOMechbay.Mechs.MechCommon;
import java.io.Serializable;

/*
 * @author Nemesis
 */
public class MG extends Weapon implements MechCommon, Serializable
{
    public MG() {
        super();
        equipmentName = "Machine Gun";
        fullName = "Machine Gun";
        criticals = 1;
        cost = 5000 * 2;
        hardpointType = BALLISTIC;
        velocity = 90;
        minimumRange = 0;
        effectiveRange = 100;
        maximumRange = effectiveRange * LASER_RANGE_MODIFIER;
        projectileCount = 1;
        tonnage = 0.5;
        damage = 0.04;
        heat = 0.0;
        duration = 0.5;
        heatToTarget = 0.0;
        recycle = 0.0;
        delay = 0.0;
        spread = 0.0;
        knock = 0.001;
    }
}
