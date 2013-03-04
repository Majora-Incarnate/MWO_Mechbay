package MWOMechbay.Mechs;

import MWOMechbay.Components.Weapons.LRM10;
import MWOMechbay.Components.Weapons.AC5;
import MWOMechbay.Components.Weapons.Medium_Laser;
import MWOMechbay.Components.Components.Upper_Leg_Actuator;
import MWOMechbay.Components.Components.Sensors;
import MWOMechbay.Components.Components.Life_Support;
import MWOMechbay.Components.Components.Cockpit;
import MWOMechbay.Components.Components.Shoulder_Actuator;
import MWOMechbay.Components.Components.Upper_Arm_Actuator;
import MWOMechbay.Components.Components.Lower_Arm_Actuator;
import MWOMechbay.Components.Components.Hip_Actuator;
import MWOMechbay.Components.Components.Gyro;
import MWOMechbay.Components.Components.Engine;
import MWOMechbay.Components.Components.Foot_Actuator;
import MWOMechbay.Components.Components.Lower_Leg_Actuator;
import MWOMechbay.Components.Ammo.LRM_Ammo;
import MWOMechbay.Components.Ammo.AC5_Ammo;
import java.util.Vector;

/**
 *
 * @author Nemesis
 */
public class DGN_1N extends Dragon implements MechCommon {
    public DGN_1N() {
        super();
        modelName = "DGN-1N";
        baseCost = 4827559;
        stockDoubleHeatSinks = false;
        stockEndoSteel = false;
        stockFerroFibrous = false;
        stockXLEngine = false;
        jumpJetCapable = false;
        stockEngineRating = 300;
        stockExtraHeatSinks = 0;
        iconPath = "/MWOMechbay/Resources/DGN-1N.gif";
        
        hardpoints = new int[][]
        {   {2,0,0,0},
            {0,1,0,0},
            {0,0,0,1},
            {0,1,0,0},
            {0,0,2,0},
            {0,0,0,0},
            {0,0,0,0},
            {0,0,0,0}   };
        
        stockArmor = new int[]
        {   28,
            28,
            32,
            32,
            54,
            18,
            36,
            36,
            16,
            16,
            24};
        
        stockArmament[HEAD].add(new Life_Support());
        stockArmament[HEAD].add(new Sensors());
        stockArmament[HEAD].add(new Cockpit(false));
        
        stockArmament[CENTER_TORSO].add(new Engine(stockXLEngine, stockEngineRating));
        stockArmament[CENTER_TORSO].add(new Gyro());
        stockArmament[CENTER_TORSO].add(new Engine(stockXLEngine, stockEngineRating));
        stockArmament[CENTER_TORSO].add(new LRM10(stockArtemisIV));
        
        stockArmament[RIGHT_TORSO].add(new AC5_Ammo());
        stockArmament[RIGHT_TORSO].add(new AC5_Ammo());
        
        stockArmament[LEFT_TORSO].add(new Medium_Laser());
        stockArmament[LEFT_TORSO].add(new LRM_Ammo(stockArtemisIV));
        stockArmament[LEFT_TORSO].add(new LRM_Ammo(stockArtemisIV));
        
        stockArmament[RIGHT_ARM].add(new Shoulder_Actuator());
        stockArmament[RIGHT_ARM].add(new Upper_Arm_Actuator());
        stockArmament[RIGHT_ARM].add(new Lower_Arm_Actuator());
        stockArmament[RIGHT_ARM].add(new AC5());
        
        stockArmament[LEFT_ARM].add(new Shoulder_Actuator());
        stockArmament[LEFT_ARM].add(new Upper_Arm_Actuator());
        stockArmament[LEFT_ARM].add(new Lower_Arm_Actuator());
        stockArmament[LEFT_ARM].add(new Medium_Laser());
        
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
