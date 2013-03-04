/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MWOMechbay.Components.SpecialEquipment;

import java.io.Serializable;

/**
 *
 * @author Nemesis
 */
public class Anti_Missile_System extends Special_Equipment implements Serializable {
    public Anti_Missile_System() {
        super();
        equipmentName = "AMS";
        fullName = "Anti-Missile System (AMS)";
        cost = 56000;
        range = 200;
        criticals = 1;
        tonnage = 0.5;
        hardpointType = AMS;
    }
}
