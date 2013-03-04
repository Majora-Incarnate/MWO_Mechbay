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
public class Upper_Leg_Actuator extends Component implements Serializable 
{
    public Upper_Leg_Actuator() {
        super();
        equipmentName = "Upper Leg";
        fullName = "Upper Leg Actuator";
        criticals = 1;
    }
}
