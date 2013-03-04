package MWOMechbay.Mechs;

import MWOMechbay.Components.Weapons.LBX_AC10;
import MWOMechbay.Components.Weapons.LRM10;
import MWOMechbay.Components.Weapons.Medium_Laser;
import MWOMechbay.Components.Components.Upper_Leg_Actuator;
import MWOMechbay.Components.Components.Sensors;
import MWOMechbay.Components.Components.Life_Support;
import MWOMechbay.Components.Components.Cockpit;
import MWOMechbay.Components.Components.Shoulder_Actuator;
import MWOMechbay.Components.Components.CASE;
import MWOMechbay.Components.Components.Upper_Arm_Actuator;
import MWOMechbay.Components.Components.Lower_Arm_Actuator;
import MWOMechbay.Components.Components.Hip_Actuator;
import MWOMechbay.Components.Components.Gyro;
import MWOMechbay.Components.Components.Engine;
import MWOMechbay.Components.Components.Hand_Actuator;
import MWOMechbay.Components.Components.Foot_Actuator;
import MWOMechbay.Components.Components.Lower_Leg_Actuator;
import MWOMechbay.Components.Ammo.LBX_AC10_Ammo;
import MWOMechbay.Components.Ammo.LRM_Ammo;
import MWOMechbay.Components.OtherEquipment.Internals;
import java.util.Vector;

/**
 *
 * @author Nemesis
 */
public class CN9_D extends Centurion implements MechCommon {
    public CN9_D() {
        super();
        modelName = "CN9-D";
        baseCost = 8158590;
        modules = 1;
        stockDoubleHeatSinks = false;
        stockEndoSteel = true;
        stockFerroFibrous = false;
        stockXLEngine = true;
        stockArtemisIV = true;
        jumpJetCapable = false;
        stockEngineRating = 300;
        stockExtraHeatSinks = 0;
        iconPath = "/MWOMechbay/Resources/CN9-D.gif";
        
        hardpoints = new int[][]
        {   {2,0,0,0},
            {0,0,0,0},
            {0,0,0,1},
            {0,0,2,0},
            {0,2,0,0},
            {0,0,0,0},
            {0,0,0,0},
            {0,0,0,0}   };
        
        stockArmor = new int[]
        {   32,
            32,
            26,
            26,
            36,
            18,
            32,
            32,
            12,
            12,
            14};
        
        stockArmament[HEAD].add(new Life_Support());
        stockArmament[HEAD].add(new Sensors());
        stockArmament[HEAD].add(new Cockpit(false));
        
        stockArmament[CENTER_TORSO].add(new Engine(stockXLEngine, stockEngineRating));
        stockArmament[CENTER_TORSO].add(new Gyro());
        stockArmament[CENTER_TORSO].add(new Engine(stockXLEngine, stockEngineRating));
        stockArmament[CENTER_TORSO].add(new Medium_Laser());
        stockArmament[CENTER_TORSO].add(new Medium_Laser());
        
        stockArmament[RIGHT_TORSO].add(new Engine(stockXLEngine, stockEngineRating));
        stockArmament[RIGHT_TORSO].add(new LBX_AC10_Ammo());
        stockArmament[RIGHT_TORSO].add(new LBX_AC10_Ammo());
        stockArmament[RIGHT_TORSO].add(new LRM_Ammo(stockArtemisIV));
        stockArmament[RIGHT_TORSO].add(new LRM_Ammo(stockArtemisIV));
        stockArmament[RIGHT_TORSO].add(new CASE());
        stockArmament[RIGHT_TORSO].add(new Internals(stockEndoSteel, tonnage));
        stockArmament[RIGHT_TORSO].add(new Internals(stockEndoSteel, tonnage));
        stockArmament[RIGHT_TORSO].add(new Internals(stockEndoSteel, tonnage));
        stockArmament[RIGHT_TORSO].add(new Internals(stockEndoSteel, tonnage));
        
        stockArmament[LEFT_TORSO].add(new Engine(stockXLEngine, stockEngineRating));
        stockArmament[LEFT_TORSO].add(new LRM10(stockArtemisIV));
        stockArmament[LEFT_TORSO].add(new Internals(stockEndoSteel, tonnage));
        stockArmament[LEFT_TORSO].add(new Internals(stockEndoSteel, tonnage));
        stockArmament[LEFT_TORSO].add(new Internals(stockEndoSteel, tonnage));
        stockArmament[LEFT_TORSO].add(new Internals(stockEndoSteel, tonnage));
        
        stockArmament[RIGHT_ARM].add(new Shoulder_Actuator());
        stockArmament[RIGHT_ARM].add(new Upper_Arm_Actuator());
        stockArmament[RIGHT_ARM].add(new Lower_Arm_Actuator());
        stockArmament[RIGHT_ARM].add(new LBX_AC10());
        stockArmament[RIGHT_ARM].add(new Internals(stockEndoSteel, tonnage));
        stockArmament[RIGHT_ARM].add(new Internals(stockEndoSteel, tonnage));
        stockArmament[RIGHT_ARM].add(new Internals(stockEndoSteel, tonnage));
        
        stockArmament[LEFT_ARM].add(new Shoulder_Actuator());
        stockArmament[LEFT_ARM].add(new Upper_Arm_Actuator());
        stockArmament[LEFT_ARM].add(new Lower_Arm_Actuator());
        stockArmament[LEFT_ARM].add(new Hand_Actuator());
        stockArmament[LEFT_ARM].add(new Internals(stockEndoSteel, tonnage));
        stockArmament[LEFT_ARM].add(new Internals(stockEndoSteel, tonnage));
        stockArmament[LEFT_ARM].add(new Internals(stockEndoSteel, tonnage));
        
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
