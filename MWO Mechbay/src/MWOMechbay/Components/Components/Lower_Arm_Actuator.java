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
public class Lower_Arm_Actuator extends Component implements Serializable 
{
    public Lower_Arm_Actuator() {
        super();
        equipmentName = "Lower Arm";
        fullName = "Lower Arm Actuator";
        criticals = 1;
    }
}
