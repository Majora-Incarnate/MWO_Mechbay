package MWOMechbay.Mechs;

import MWOMechbay.Components.Weapons.AC20;
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
import MWOMechbay.Components.Components.Hand_Actuator;
import MWOMechbay.Components.Components.Foot_Actuator;
import MWOMechbay.Components.Components.Lower_Leg_Actuator;
import MWOMechbay.Components.Ammo.AC20_Ammo;
import MWOMechbay.Components.OtherEquipment.Heat_Sink;
import java.util.Vector;

/**
 *
 * @author Nemesis
 */
public class CN9_YLW extends Centurion implements MechCommon {
    public CN9_YLW() {
        super();
        modelName = "CN9-YLW";
        baseCost = 0;
        modules = 3;
        stockDoubleHeatSinks = false;
        stockEndoSteel = false;
        stockFerroFibrous = false;
        stockXLEngine = false;
        jumpJetCapable = false;
        stockEngineRating = 215;
        stockExtraHeatSinks = 0;
        iconPath = "/MWOMechbay/Resources/CN9-YLW.gif";
        actuators = new boolean[][] {
            {false, true},
            {false, true}
        };
        
        limitsForPitchYaw = new int[][] {
            {120,20},
            {0,30}  };
        
        hardpoints = new int[][]
        {   {2,0,0,0},
            {0,0,0,0},
            {0,0,0,1},
            {0,0,0,0},
            {0,2,0,0},
            {0,0,0,0},
            {0,0,0,0},
            {0,0,0,0}   };
        
        stockArmor = new int[]
        {   32,
            32,
            36,
            36,
            48,
            18,
            48,
            48,
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
        
        stockArmament[RIGHT_TORSO].add(new Heat_Sink(stockDoubleHeatSinks));
        stockArmament[RIGHT_TORSO].add(new AC20_Ammo());
        stockArmament[RIGHT_TORSO].add(new AC20_Ammo());
        stockArmament[RIGHT_TORSO].add(new AC20_Ammo());
        
        stockArmament[LEFT_TORSO].add(new Heat_Sink(stockDoubleHeatSinks));
        
        stockArmament[RIGHT_ARM].add(new Shoulder_Actuator());
        stockArmament[RIGHT_ARM].add(new Upper_Arm_Actuator());
        stockArmament[RIGHT_ARM].add(new AC20());
        
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
    
    public int getMaxEngineRating() {
        return 300;
    }
}
