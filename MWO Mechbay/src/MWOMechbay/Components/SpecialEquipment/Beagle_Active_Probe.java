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
public class Beagle_Active_Probe extends Special_Equipment implements Serializable {
    private static final double radarRangeModifier = 1.25;
    private static final double infoGatherModifier = 1.25;
    
    public Beagle_Active_Probe() {
        super();
        equipmentName = "BAP";
        fullName = "Beagle Active Probe (BAP)";
        cost = 200000;
        range = 120;
        criticals = 2;
        tonnage = 1.5;
        hardpointType = OMNI;
    }
    
    public double getRadarRangeMod() {
        return radarRangeModifier;
    }
    
    public double getInfoGatherMod() {
        return infoGatherModifier;
    }
}
