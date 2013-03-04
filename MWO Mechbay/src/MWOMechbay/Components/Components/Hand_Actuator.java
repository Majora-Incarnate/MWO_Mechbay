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
public class Hand_Actuator extends Component implements Serializable 
{
    public Hand_Actuator() {
        super();
        equipmentName = "Hand";
        fullName = "Hand Actuator";
        criticals = 1;
    }
}
