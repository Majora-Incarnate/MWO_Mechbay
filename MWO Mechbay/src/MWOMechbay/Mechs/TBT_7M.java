package MWOMechbay.Mechs;

import MWOMechbay.Components.Weapons.NARC;
import MWOMechbay.Components.Weapons.LRM15;
import MWOMechbay.Components.Weapons.Medium_Laser;
import MWOMechbay.Components.OtherEquipment.Internals;
import MWOMechbay.Components.SpecialEquipment.Jump_Jet;
import MWOMechbay.Components.Components.Engine;
import MWOMechbay.Components.Components.Hip_Actuator;
import MWOMechbay.Components.Components.Upper_Arm_Actuator;
import MWOMechbay.Components.Components.Sensors;
import MWOMechbay.Components.Components.Upper_Leg_Actuator;
import MWOMechbay.Components.Components.Life_Support;
import MWOMechbay.Components.Components.Cockpit;
import MWOMechbay.Components.Components.CASE;
import MWOMechbay.Components.Components.Lower_Arm_Actuator;
import MWOMechbay.Components.Components.Foot_Actuator;
import MWOMechbay.Components.Components.Shoulder_Actuator;
import MWOMechbay.Components.Components.Hand_Actuator;
import MWOMechbay.Components.Components.Lower_Leg_Actuator;
import MWOMechbay.Components.Components.Gyro;
import MWOMechbay.Components.Ammo.LRM_Ammo;
import MWOMechbay.Components.Ammo.Homing_Pod_Ammo;
import java.util.Vector;

/**
 *
 * @author Nemesis
 */
public class TBT_7M extends Trebuchet implements MechCommon {
    public TBT_7M() {
        super();
        modelName = "TBT-7M";
        baseCost = 7623797;
        modules = 1;
        stockDoubleHeatSinks = true;
        stockEndoSteel = true;
        stockFerroFibrous = false;
        stockXLEngine = true;
        jumpJetCapable = true;
        maxJumpJets = 5;
        stockEngineRating = 250;
        stockExtraHeatSinks = 0;
        iconPath = "/MWOMechbay/Resources/TBT-7M.gif";
        
        hardpoints = new int[][]
        {   {0,2,0,0},
            {0,1,1,0},
            {0,0,1,1},
            {0,0,1,0},
            {0,0,0,0},
            {0,0,0,0},
            {0,0,0,0},
            {0,0,0,0}   };
        
        stockArmor = new int[]
        {   20,
            20,
            22,
            22,
            44,
            18,
            30,
            30,
            10,
            10,
            14};
        
        stockArmament[HEAD].add(new Life_Support());
        stockArmament[HEAD].add(new Sensors());
        stockArmament[HEAD].add(new Cockpit(false));
        
        stockArmament[CENTER_TORSO].add(new Engine(stockXLEngine, stockEngineRating));
        stockArmament[CENTER_TORSO].add(new Gyro());
        stockArmament[CENTER_TORSO].add(new Engine(stockXLEngine, stockEngineRating));
        stockArmament[CENTER_TORSO].add(new Jump_Jet(tonnage));
        
        stockArmament[RIGHT_TORSO].add(new Engine(stockXLEngine, stockEngineRating));
        stockArmament[RIGHT_TORSO].add(new LRM15(stockArtemisIV));
        stockArmament[RIGHT_TORSO].add(new LRM_Ammo(stockArtemisIV));
        stockArmament[RIGHT_TORSO].add(new CASE());
        stockArmament[RIGHT_TORSO].add(new Internals(stockEndoSteel, tonnage));
        stockArmament[RIGHT_TORSO].add(new Internals(stockEndoSteel, tonnage));
        stockArmament[RIGHT_TORSO].add(new Internals(stockEndoSteel, tonnage));
        
        stockArmament[LEFT_TORSO].add(new Engine(stockXLEngine, stockEngineRating));
        stockArmament[LEFT_TORSO].add(new NARC());
        stockArmament[LEFT_TORSO].add(new Homing_Pod_Ammo());
        stockArmament[LEFT_TORSO].add(new Homing_Pod_Ammo());
        stockArmament[LEFT_TORSO].add(new LRM_Ammo(stockArtemisIV));
        stockArmament[LEFT_TORSO].add(new CASE());
        stockArmament[LEFT_TORSO].add(new Internals(stockEndoSteel, tonnage));
        stockArmament[LEFT_TORSO].add(new Internals(stockEndoSteel, tonnage));
        stockArmament[LEFT_TORSO].add(new Internals(stockEndoSteel, tonnage));
        
        stockArmament[RIGHT_ARM].add(new Shoulder_Actuator());
        stockArmament[RIGHT_ARM].add(new Upper_Arm_Actuator());
        stockArmament[RIGHT_ARM].add(new Lower_Arm_Actuator());
        stockArmament[RIGHT_ARM].add(new Medium_Laser());
        stockArmament[RIGHT_ARM].add(new Medium_Laser());
        stockArmament[RIGHT_ARM].add(new Internals(stockEndoSteel, tonnage));
        stockArmament[RIGHT_ARM].add(new Internals(stockEndoSteel, tonnage));
        stockArmament[RIGHT_ARM].add(new Internals(stockEndoSteel, tonnage));
        stockArmament[RIGHT_ARM].add(new Internals(stockEndoSteel, tonnage));
        
        stockArmament[LEFT_ARM].add(new Shoulder_Actuator());
        stockArmament[LEFT_ARM].add(new Upper_Arm_Actuator());
        stockArmament[LEFT_ARM].add(new Lower_Arm_Actuator());
        stockArmament[LEFT_ARM].add(new Hand_Actuator());
        stockArmament[LEFT_ARM].add(new LRM15(stockArtemisIV));
        stockArmament[LEFT_ARM].add(new Medium_Laser());
        stockArmament[LEFT_ARM].add(new Internals(stockEndoSteel, tonnage));
        stockArmament[LEFT_ARM].add(new Internals(stockEndoSteel, tonnage));
        stockArmament[LEFT_ARM].add(new Internals(stockEndoSteel, tonnage));
        stockArmament[LEFT_ARM].add(new Internals(stockEndoSteel, tonnage));
        
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

