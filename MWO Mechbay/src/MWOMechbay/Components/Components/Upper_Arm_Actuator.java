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
public class Upper_Arm_Actuator extends Component implements Serializable 
{
    public Upper_Arm_Actuator() {
        super();
        equipmentName = "Upper Arm";
        fullName = "Upper Arm Actuator";
        criticals = 1;
    }
}
