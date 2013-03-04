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
public class Foot_Actuator extends Component implements Serializable 
{
    public Foot_Actuator() {
        super();
        equipmentName = "Foot";
        fullName = "Foot Actuator";
        criticals = 1;
    }
}
