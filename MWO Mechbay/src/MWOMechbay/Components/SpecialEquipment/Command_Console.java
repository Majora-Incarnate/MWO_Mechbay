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
public class Command_Console extends Special_Equipment implements Serializable 
{
    public Command_Console() {
        super();
        equipmentName = "Command Console";
        fullName = "Command Console Cockpit";
        criticals = 1;
        tonnage = 3.0;
    }
}
