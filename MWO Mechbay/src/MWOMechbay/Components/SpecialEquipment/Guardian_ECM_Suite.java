/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MWOMechbay.Components.SpecialEquipment;

import java.io.Serializable;

/**
 *
 * @author Nemesis
 */
public class Guardian_ECM_Suite extends Special_Equipment implements Serializable {
    public Guardian_ECM_Suite() {
        super();
        equipmentName = "ECM";
        fullName = "Guardian ECM Suite";
        cost = 200000;
        range = 180;
        criticals = 2;
        tonnage = 1.5;
        hardpointType = OMNI;
    }
}
