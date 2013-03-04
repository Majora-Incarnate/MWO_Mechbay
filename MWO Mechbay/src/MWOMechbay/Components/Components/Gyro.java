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
public class Gyro extends Component implements Serializable 
{
    public Gyro() {
        super();
        equipmentName = "Gyro";
        fullName = "Standard Gyro";
        criticals = 4;
    }
}
