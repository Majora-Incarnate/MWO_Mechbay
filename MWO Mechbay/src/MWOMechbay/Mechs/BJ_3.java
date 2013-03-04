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
public class BJ_3 extends Blackjack implements MechCommon {
    public BJ_3() {
        super();
        modelName = "BJ-3";
        baseCost = 0;
        modules = 1;
        stockDoubleHeatSinks = true;
        stockEndoSteel = false;
        stockFerroFibrous = false;
        stockXLEngine = false;
        jumpJetCapable = true;
        stockEngineRating = 180;
        stockExtraHeatSinks = 0;
        iconPath = "/MWOMechbay/Resources/Default_Medium.gif";
        //iconPath = "/MWOMechbay/Resources/BJ-3.gif";
        
        hardpoints = new int[][]
        {   {0,2,0,0},
            {0,2,0,0},
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
        
        stockArmament[RIGHT_TORSO].add(new Heat_Sink(stockDoubleHeatSinks));
        stockArmament[RIGHT_TORSO].add(new Heat_Sink(stockDoubleHeatSinks));
        stockArmament[RIGHT_TORSO].add(new Medium_Laser());
       
        stockArmament[LEFT_TORSO].add(new Heat_Sink(stockDoubleHeatSinks));
        stockArmament[LEFT_TORSO].add(new Medium_Laser());
        
        stockArmament[RIGHT_ARM].add(new Shoulder_Actuator());
        stockArmament[RIGHT_ARM].add(new Upper_Arm_Actuator());
        stockArmament[RIGHT_ARM].add(new PPC());
        stockArmament[RIGHT_ARM].add(new Medium_Laser());
        
        stockArmament[LEFT_ARM].add(new Shoulder_Actuator());
        stockArmament[LEFT_ARM].add(new Upper_Arm_Actuator());
        stockArmament[LEFT_ARM].add(new PPC());
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

