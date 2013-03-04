package MWOMechbay.Mechs;

import MWOMechbay.Components.SpecialEquipment.Jump_Jet;
import MWOMechbay.Components.Ammo.*;
import MWOMechbay.Components.Weapons.*;
import MWOMechbay.Components.OtherEquipment.*;
import MWOMechbay.Components.Components.*;
import java.util.Vector;

/**
 *
 * @author Nemesis
 */
public class BJ_1 extends Blackjack implements MechCommon {
    public BJ_1() {
        super();
        modelName = "BJ-1";
        baseCost = 0;
        modules = 1;
        stockDoubleHeatSinks = false;
        stockEndoSteel = false;
        stockFerroFibrous = false;
        stockXLEngine = false;
        jumpJetCapable = true;
        stockEngineRating = 180;
        stockExtraHeatSinks = 1;
        iconPath = "/MWOMechbay/Resources/Default_Medium.gif";
        //iconPath = "/MWOMechbay/Resources/BJ-1.gif";
        
        hardpoints = new int[][]
        {   {2,1,0,0},
            {2,1,0,0},
            {0,1,0,0},
            {0,1,0,0},
            {0,0,0,0},
            {0,0,0,0},
            {0,0,0,0},
            {0,0,0,0}  };
        
        stockArmor = new int[]
        {   24,
            24,
            30,
            30,
            36,
            18,
            34,
            34,
            12,
            12,
            18};
        
        stockArmament[HEAD].add(new Life_Support());
        stockArmament[HEAD].add(new Sensors());
        stockArmament[HEAD].add(new Cockpit(false));
        
        stockArmament[CENTER_TORSO].add(new Engine(stockXLEngine, stockEngineRating));
        stockArmament[CENTER_TORSO].add(new Gyro());
        stockArmament[CENTER_TORSO].add(new Engine(stockXLEngine, stockEngineRating));
        stockArmament[CENTER_TORSO].add(new AC2_Ammo());
        
        stockArmament[RIGHT_TORSO].add(new Heat_Sink(stockDoubleHeatSinks));
        stockArmament[RIGHT_TORSO].add(new Heat_Sink(stockDoubleHeatSinks));
        stockArmament[RIGHT_TORSO].add(new Medium_Laser());
       
        stockArmament[LEFT_TORSO].add(new Heat_Sink(stockDoubleHeatSinks));
        stockArmament[LEFT_TORSO].add(new Heat_Sink(stockDoubleHeatSinks));
        stockArmament[LEFT_TORSO].add(new Medium_Laser());
        
        stockArmament[RIGHT_ARM].add(new Shoulder_Actuator());
        stockArmament[RIGHT_ARM].add(new Upper_Arm_Actuator());
        stockArmament[RIGHT_ARM].add(new AC2());
        stockArmament[RIGHT_ARM].add(new Medium_Laser());
        
        stockArmament[LEFT_ARM].add(new Shoulder_Actuator());
        stockArmament[LEFT_ARM].add(new Upper_Arm_Actuator());
        stockArmament[LEFT_ARM].add(new AC2());
        stockArmament[LEFT_ARM].add(new Medium_Laser());
        
        stockArmament[RIGHT_LEG].add(new Hip_Actuator());
        stockArmament[RIGHT_LEG].add(new Upper_Leg_Actuator());
        stockArmament[RIGHT_LEG].add(new Lower_Leg_Actuator());
        stockArmament[RIGHT_LEG].add(new Foot_Actuator());
        stockArmament[RIGHT_LEG].add(new Jump_Jet(tonnage));
        stockArmament[RIGHT_LEG].add(new Jump_Jet(tonnage));
        
        stockArmament[LEFT_LEG].add(new Hip_Actuator());
        stockArmament[LEFT_LEG].add(new Upper_Leg_Actuator());
        stockArmament[LEFT_LEG].add(new Lower_Leg_Actuator());
        stockArmament[LEFT_LEG].add(new Foot_Actuator());
        stockArmament[LEFT_LEG].add(new Jump_Jet(tonnage));
        stockArmament[LEFT_LEG].add(new Jump_Jet(tonnage));
    }
}

