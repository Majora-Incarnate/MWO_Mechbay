package MWOMechbay.Mechs;

import MWOMechbay.Components.Ammo.Gauss_Ammo;
import MWOMechbay.Components.Components.Engine;
import MWOMechbay.Components.Components.Hip_Actuator;
import MWOMechbay.Components.Components.Upper_Arm_Actuator;
import MWOMechbay.Components.Components.Sensors;
import MWOMechbay.Components.Components.Upper_Leg_Actuator;
import MWOMechbay.Components.Components.Life_Support;
import MWOMechbay.Components.Components.Cockpit;
import MWOMechbay.Components.Components.Foot_Actuator;
import MWOMechbay.Components.Components.Shoulder_Actuator;
import MWOMechbay.Components.Components.Lower_Leg_Actuator;
import MWOMechbay.Components.Components.Gyro;
import MWOMechbay.Components.OtherEquipment.Internals;
import MWOMechbay.Components.SpecialEquipment.Jump_Jet;
import MWOMechbay.Components.Weapons.Gauss_Rifle;
import MWOMechbay.Components.Weapons.Medium_Pulse_Laser;
import java.util.Vector;

/**
 *
 * @author Nemesis
 */
public class NMS_5X extends Nemesis implements MechCommon {
    public NMS_5X() {
        super();
        modelName = "NMS-5X";
        stockExtraHeatSinks = 0;
        
        hardpoints = new int[][]
        {   {2,0,2,0},
            {0,4,0,0},
            {0,0,0,0},
            {0,0,0,0},
            {0,0,0,0},
            {0,0,0,0},
            {0,0,0,0},
            {0,0,0,0}   };
        
        stockArmament[HEAD].add(new Life_Support());
        stockArmament[HEAD].add(new Sensors());
        stockArmament[HEAD].add(new Cockpit(false));
        
        stockArmament[CENTER_TORSO].add(new Engine(stockXLEngine, stockEngineRating));
        stockArmament[CENTER_TORSO].add(new Gyro());
        stockArmament[CENTER_TORSO].add(new Engine(stockXLEngine, stockEngineRating));
        stockArmament[CENTER_TORSO].add(new Jump_Jet(tonnage));
        
        stockArmament[RIGHT_TORSO].add(new Engine(stockXLEngine, stockEngineRating));
        stockArmament[RIGHT_TORSO].add(new Jump_Jet(tonnage));
        stockArmament[RIGHT_TORSO].add(new Jump_Jet(tonnage));
        stockArmament[RIGHT_TORSO].add(new Internals(stockEndoSteel, tonnage));
        stockArmament[RIGHT_TORSO].add(new Internals(stockEndoSteel, tonnage));
        stockArmament[RIGHT_TORSO].add(new Internals(stockEndoSteel, tonnage));
        stockArmament[RIGHT_TORSO].add(new Internals(stockEndoSteel, tonnage));
        stockArmament[RIGHT_TORSO].add(new Internals(stockEndoSteel, tonnage));
        stockArmament[RIGHT_TORSO].add(new Internals(stockEndoSteel, tonnage));
        stockArmament[RIGHT_TORSO].add(new Internals(stockEndoSteel, tonnage));
        
        stockArmament[LEFT_TORSO].add(new Engine(stockXLEngine, stockEngineRating));
        stockArmament[LEFT_TORSO].add(new Jump_Jet(tonnage));
        stockArmament[LEFT_TORSO].add(new Jump_Jet(tonnage));
        stockArmament[LEFT_TORSO].add(new Internals(stockEndoSteel, tonnage));
        stockArmament[LEFT_TORSO].add(new Internals(stockEndoSteel, tonnage));
        stockArmament[LEFT_TORSO].add(new Internals(stockEndoSteel, tonnage));
        stockArmament[LEFT_TORSO].add(new Internals(stockEndoSteel, tonnage));
        stockArmament[LEFT_TORSO].add(new Internals(stockEndoSteel, tonnage));
        stockArmament[LEFT_TORSO].add(new Internals(stockEndoSteel, tonnage));
        stockArmament[LEFT_TORSO].add(new Internals(stockEndoSteel, tonnage));
        
        stockArmament[RIGHT_ARM].add(new Shoulder_Actuator());
        stockArmament[RIGHT_ARM].add(new Upper_Arm_Actuator());
        stockArmament[RIGHT_ARM].add(new Gauss_Rifle());
        stockArmament[RIGHT_ARM].add(new Gauss_Ammo());
        stockArmament[RIGHT_ARM].add(new Gauss_Ammo());
        stockArmament[RIGHT_ARM].add(new Gauss_Ammo());
        
        stockArmament[LEFT_ARM].add(new Shoulder_Actuator());
        stockArmament[LEFT_ARM].add(new Upper_Arm_Actuator());
        stockArmament[LEFT_ARM].add(new Medium_Pulse_Laser());
        stockArmament[LEFT_ARM].add(new Medium_Pulse_Laser());
        stockArmament[LEFT_ARM].add(new Medium_Pulse_Laser());
        
        stockArmament[RIGHT_LEG].add(new Hip_Actuator());
        stockArmament[RIGHT_LEG].add(new Upper_Leg_Actuator());
        stockArmament[RIGHT_LEG].add(new Lower_Leg_Actuator());
        stockArmament[RIGHT_LEG].add(new Foot_Actuator());
        
        stockArmament[LEFT_LEG].add(new Hip_Actuator());
        stockArmament[LEFT_LEG].add(new Upper_Leg_Actuator());
        stockArmament[LEFT_LEG].add(new Lower_Leg_Actuator());
        stockArmament[LEFT_LEG].add(new Foot_Actuator());
    }
}

