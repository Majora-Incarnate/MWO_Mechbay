package MWOMechbay.Components.SpecialEquipment;

import MWOMechbay.Components.Weapons.Weapon;
import java.io.Serializable;

/**
 *
 * @author Nemesis
 */
public class Target_Acquisition_Gear extends Special_Equipment implements Serializable {
    public Target_Acquisition_Gear() {
        super();
        equipmentName = "TAG";
        fullName = "Target Acquisition Gear (TAG)";
        cost = 50000;
        range = 750;
        criticals = 1;
        tonnage = 1.0;
        hardpointType = ENERGY;
    }
}
