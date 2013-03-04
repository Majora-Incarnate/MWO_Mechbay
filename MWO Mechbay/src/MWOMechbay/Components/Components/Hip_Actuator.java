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
public class Hip_Actuator extends Component implements Serializable 
{
    public Hip_Actuator() {
        super();
        equipmentName = "Hip";
        fullName = "Hip Actuator";
        criticals = 1;
    }
}
