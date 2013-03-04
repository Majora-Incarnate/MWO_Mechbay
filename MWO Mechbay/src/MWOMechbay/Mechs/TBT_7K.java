package MWOMechbay.Mechs;

import MWOMechbay.Components.Weapons.PPC;
import MWOMechbay.Components.Weapons.SRM2;
import MWOMechbay.Components.Weapons.AC5;
import MWOMechbay.Components.OtherEquipment.Heat_Sink;
import MWOMechbay.Components.Components.Engine;
import MWOMechbay.Components.Components.Hip_Actuator;
import MWOMechbay.Components.Components.Upper_Arm_Actuator;
import MWOMechbay.Components.Components.Sensors;
import MWOMechbay.Components.Components.Upper_Leg_Actuator;
import MWOMechbay.Components.Components.Life_Support;
import MWOMechbay.Components.Components.Cockpit;
import MWOMechbay.Components.Components.Lower_Arm_Actuator;
import MWOMechbay.Components.Components.Foot_Actuator;
import MWOMechbay.Components.Components.Shoulder_Actuator;
import MWOMechbay.Components.Components.Lower_Leg_Actuator;
import MWOMechbay.Components.Components.Hand_Actuator;
import MWOMechbay.Components.Components.Gyro;
import MWOMechbay.Components.Ammo.SRM_Ammo;
import MWOMechbay.Components.Ammo.AC5_Ammo;
import java.util.Vector;

/**
 *
 * @author Nemesis
 */
public class TBT_7K extends Trebuchet implements MechCommon {
    public TBT_7K() {
        super();
        modelName = "TBT-7K";
        baseCost = 3867177;
        modules = 1;
        stockDoubleHeatSinks = false;
        stockEndoSteel = false;
        stockFerroFibrous = false;
        stockXLEngine = false;
        jumpJetCapable = false;
        stockEngineRating = 250;
        stockExtraHeatSinks = 1;
        iconPath = "/MWOMechbay/Resources/TBT-7K.gif";
        
        limitsForPitchYaw = new int[][] {
            {115,25},
            {40,15}  };
        
        hardpoints = new int[][]
        {   {0,0,2,0},
            {0,0,0,0},
            {0,2,0,1},
            {2,0,0,0},
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
        stockArmament[CENTER_TORSO].add(new Heat_Sink(stockDoubleHeatSinks));
        
        stockArmament[RIGHT_TORSO].add(new PPC());
        stockArmament[RIGHT_TORSO].add(new AC5_Ammo());
        
        stockArmament[LEFT_TORSO].add(new AC5());
        
        stockArmament[RIGHT_ARM].add(new Shoulder_Actuator());
        stockArmament[RIGHT_ARM].add(new Upper_Arm_Actuator());
        stockArmament[RIGHT_ARM].add(new Lower_Arm_Actuator());
        stockArmament[RIGHT_ARM].add(new SRM2(stockArtemisIV));
        stockArmament[RIGHT_ARM].add(new SRM_Ammo(stockArtemisIV));
        
        stockArmament[LEFT_ARM].add(new Shoulder_Actuator());
        stockArmament[LEFT_ARM].add(new Upper_Arm_Actuator());
        stockArmament[LEFT_ARM].add(new Lower_Arm_Actuator());
        stockArmament[LEFT_ARM].add(new Hand_Actuator());
        
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

