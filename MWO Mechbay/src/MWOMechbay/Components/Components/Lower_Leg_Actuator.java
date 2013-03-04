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
public class Lower_Leg_Actuator extends Component implements Serializable 
{
    public Lower_Leg_Actuator() {
        super();
        equipmentName = "Lower Leg";
        fullName = "Lower Leg Actuator";
        criticals = 1;
    }
}
