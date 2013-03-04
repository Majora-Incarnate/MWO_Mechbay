/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MWOMechbay.Components.SpecialEquipment;

import MWOMechbay.GUI.MainCommon;
import java.io.Serializable;

/**
 *
 * @author Nemesis
 */
public class MASC extends Special_Equipment implements Serializable, MainCommon {
    public MASC(double mechTonnage)
    {
        super();
        equipmentName = "MASC";
        fullName = "Myomer Accelerator Signal Circuitry";
        itemType = MYOMER_ITEM_TYPE;
        double classIndex;
        
        if (mechTonnage > 80) {   classIndex = 5.0; }
        else if (mechTonnage > 65) {    classIndex = 4.0; }
        else if (mechTonnage > 45) {    classIndex = 3.0; }
        else if (mechTonnage > 25) {    classIndex = 2.0; }
        else {  classIndex = 1.0; }
        
        cost = (int)classIndex * 10000;
        criticals = (int)classIndex;
        tonnage = classIndex;
    }
}
