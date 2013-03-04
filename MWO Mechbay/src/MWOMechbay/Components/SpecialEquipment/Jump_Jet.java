package MWOMechbay.Components.SpecialEquipment;

import java.io.Serializable;

/**
 *
 * @author Nemesis
 */
public class Jump_Jet extends Special_Equipment implements Serializable {
    public Jump_Jet(double mechTonnage) {
        super();
        equipmentName = "Jump Jet";
        criticals = 1;
        itemType = JUMP_JET_ITEM_TYPE;
        
        if (mechTonnage > 85) {
            fullName = equipmentName + " Mark I";
            tonnage = 2.0;
            cost = 172000;
        }
        else if (mechTonnage > 75) {
            fullName = equipmentName + " Mark II";
            tonnage = 1.0;
            cost = 140000;
        }
        else if (mechTonnage > 55) {
            fullName = equipmentName + " Mark III";
            tonnage = 1.0;
            cost = 108000;
        }
        else if (mechTonnage > 35) {
            fullName = equipmentName + " Mark IV";
            tonnage = 0.5;
            cost = 76000;
        }
        else {
            fullName = equipmentName + " Mark V";
            tonnage = 0.5;
            cost = 44000;
        }
    }
}
