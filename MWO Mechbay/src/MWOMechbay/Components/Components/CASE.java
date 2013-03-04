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
public class CASE extends Component implements Serializable 
{
    public CASE() {
        super();
        equipmentName = "CASE";
        fullName = "Cellular Ammunition Storage Equipment";
        criticals = 1;
        tonnage = 0.5;
        itemType = CASE_ITEM_TYPE;
    }
}
