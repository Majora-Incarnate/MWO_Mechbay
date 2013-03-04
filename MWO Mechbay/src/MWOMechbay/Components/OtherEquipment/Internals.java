package MWOMechbay.Components.OtherEquipment;

import java.io.Serializable;

/**
 *
 * @author Nemesis
 */
public class Internals extends Other_Equipment implements Serializable {
    public Internals(boolean internalFlag, double mechTonnage) {
        super();
        itemType = INTERNAL_ITEM_TYPE;
        
        if (internalFlag) {
            tonnage = Math.ceil((mechTonnage / 20.0) / 0.5) * 0.5;
            equipmentName = "Endo Steel";
            fullName = "Endo Steel Internal Structure";
            criticals = 1;
            cost = 10000 * (int)mechTonnage;
        }
        else {
            tonnage = (mechTonnage / 10);
            equipmentName = "Standard";
            fullName = "Standard Internal Structure";
            criticals = 0;
            cost = 5000 * (int)mechTonnage;
        }
    }
}
