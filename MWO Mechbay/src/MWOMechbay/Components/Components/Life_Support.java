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
public class Life_Support extends Component implements Serializable 
{
    public Life_Support() {
        super();
        equipmentName = "Life Support";
        fullName = "Standard Life Support";
        criticals = 2;
    }
}
