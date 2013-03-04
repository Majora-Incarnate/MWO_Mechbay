/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MWOMechbay.Components.Components;

import MWOMechbay.Components.Component;
import java.io.Serializable;

/**
 *
 * @author Nemesis
 */
public class Shoulder_Actuator extends Component implements Serializable 
{
    public Shoulder_Actuator() {
        super();
        equipmentName = "Shoulder";
        fullName = "Shoulder Actuator";
        criticals = 1;
    }
}
