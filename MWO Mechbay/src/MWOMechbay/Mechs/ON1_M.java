package MWOMechbay.Mechs;

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
import MWOMechbay.Components.Ammo.Homing_Pod_Ammo;
import MWOMechbay.Components.Ammo.LBX_AC10_Ammo;
import MWOMechbay.Components.Ammo.LRM_Ammo;
import MWOMechbay.Components.Ammo.SRM_Ammo;
import MWOMechbay.Components.Components.CASE;
import MWOMechbay.Components.Weapons.LBX_AC10;
import MWOMechbay.Components.Weapons.LRM20;
import MWOMechbay.Components.Weapons.NARC;
import MWOMechbay.Components.Weapons.SRM4;
import java.util.Vector;

/**
 *
 * @author Nemesis
 */
public class ON1_M extends Orion implements MechCommon {
    public ON1_M() {
        super();
        modelName = "ON1-M";
        baseCost = 0;
        stockXLEngine = true;
        stockDoubleHeatSinks = true;
        stockExtraHeatSinks = 1;
        iconPath = "/MWOMechbay/Resources/Default_Heavy.gif";
        //iconPath = "/MWOMechbay/Resources/ON1-K.gif";
        
        hardpoints = new int[][]
        {   {0,2,0,0},
            {0,2,1,0},
            {1,0,0,0},
            {0,0,1,0},
            {0,0,1,0},
            {0,0,0,0},
            {0,0,0,0},
            {0,0,0,0}   };
        
        stockArmor = new int[]
        {   42,
            42,
            44,
            44,
            72,
            18,
            64,
            64,
            20,
            20,
            18};
        
        stockArmament[HEAD].add(new Life_Support());
        stockArmament[HEAD].add(new Sensors());
        stockArmament[HEAD].add(new Cockpit(false));
        
        stockArmament[CENTER_TORSO].add(new Engine(stockXLEngine, stockEngineRating));
        stockArmament[CENTER_TORSO].add(new Gyro());
        stockArmament[CENTER_TORSO].add(new Engine(stockXLEngine, stockEngineRating));
        stockArmament[CENTER_TORSO].add(new NARC());
        
        stockArmament[RIGHT_TORSO].add(new Engine(stockXLEngine, stockEngineRating));
        stockArmament[RIGHT_TORSO].add(new LBX_AC10());
        stockArmament[RIGHT_TORSO].add(new LBX_AC10_Ammo());
        stockArmament[RIGHT_TORSO].add(new LBX_AC10_Ammo());
        stockArmament[RIGHT_TORSO].add(new CASE());
        
        stockArmament[LEFT_TORSO].add(new Engine(stockXLEngine, stockEngineRating));
        stockArmament[LEFT_TORSO].add(new SRM4(stockArtemisIV));
        stockArmament[LEFT_TORSO].add(new SRM_Ammo(stockArtemisIV));
        stockArmament[LEFT_TORSO].add(new SRM_Ammo(stockArtemisIV));
        stockArmament[LEFT_TORSO].add(new LRM_Ammo(stockArtemisIV));
        stockArmament[LEFT_TORSO].add(new LRM_Ammo(stockArtemisIV));
        stockArmament[LEFT_TORSO].add(new Homing_Pod_Ammo());
        stockArmament[LEFT_TORSO].add(new Homing_Pod_Ammo());
        stockArmament[LEFT_TORSO].add(new CASE());
        
        stockArmament[RIGHT_ARM].add(new Shoulder_Actuator());
        stockArmament[RIGHT_ARM].add(new Upper_Arm_Actuator());
        stockArmament[RIGHT_ARM].add(new Lower_Arm_Actuator());
        stockArmament[RIGHT_ARM].add(new Medium_Laser());
        
        stockArmament[LEFT_ARM].add(new Shoulder_Actuator());
        stockArmament[LEFT_ARM].add(new Upper_Arm_Actuator());
        stockArmament[LEFT_ARM].add(new Lower_Arm_Actuator());
        stockArmament[LEFT_ARM].add(new LRM20(stockArtemisIV));
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
