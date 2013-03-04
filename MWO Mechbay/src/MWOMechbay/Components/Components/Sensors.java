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
public class Sensors extends Component implements Serializable 
{
    public Sensors() {
        super();
        equipmentName = "Sensors";
        fullName = "Standard Sensors";
        criticals = 2;
    }
}
