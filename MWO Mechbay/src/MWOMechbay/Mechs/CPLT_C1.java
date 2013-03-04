package MWOMechbay.Mechs;

import MWOMechbay.Components.Weapons.LRM15;
import MWOMechbay.Components.Weapons.Medium_Laser;
import MWOMechbay.Components.OtherEquipment.Heat_Sink;
import MWOMechbay.Components.SpecialEquipment.Jump_Jet;
import MWOMechbay.Components.Components.Upper_Leg_Actuator;
import MWOMechbay.Components.Components.Sensors;
import MWOMechbay.Components.Components.Life_Support;
import MWOMechbay.Components.Components.Cockpit;
import MWOMechbay.Components.Components.Shoulder_Actuator;
import MWOMechbay.Components.Components.Upper_Arm_Actuator;
import MWOMechbay.Components.Components.Hip_Actuator;
import MWOMechbay.Components.Components.Gyro;
import MWOMechbay.Components.Components.Engine;
import MWOMechbay.Components.Components.Foot_Actuator;
import MWOMechbay.Components.Components.Lower_Leg_Actuator;
import MWOMechbay.Components.Ammo.LRM_Ammo;
import java.util.Vector;

/**
 *
 * @author Nemesis
 */
public class CPLT_C1 extends Catapult implements MechCommon {
    public CPLT_C1() {
        super();
        modelName = "CPLT-C1";
        baseCost = 5804127;
        stockDoubleHeatSinks = false;
        stockEndoSteel = false;
        stockFerroFibrous = false;
        stockXLEngine = false;
        jumpJetCapable = true;
        stockEngineRating = 260;
        stockExtraHeatSinks = 5;
        iconPath = "/MWOMechbay/Resources/CPLT-C1.gif";
        
        hardpoints = new int[][]
        {   {0,0,1,0},
            {0,0,1,0},
            {0,1,0,1},
            {0,1,0,0},
            {0,2,0,0},
            {0,0,0,0},
            {0,0,0,0},
            {0,0,0,0}   };
        
        stockArmor = new int[]
        {   26,
            26,
            38,
            38,
            48,
            18,
            36,
            36,
            16,
            16,
            22};
        
        stockArmament[HEAD].add(new Life_Support());
        stockArmament[HEAD].add(new Sensors());
        stockArmament[HEAD].add(new Cockpit(false));
        stockArmament[HEAD].add(new Heat_Sink(stockDoubleHeatSinks));
        
        stockArmament[CENTER_TORSO].add(new Engine(stockXLEngine, stockEngineRating));
        stockArmament[CENTER_TORSO].add(new Gyro());
        stockArmament[CENTER_TORSO].add(new Engine(stockXLEngine, stockEngineRating));
        stockArmament[CENTER_TORSO].add(new Medium_Laser());
        stockArmament[CENTER_TORSO].add(new Medium_Laser());
        
        stockArmament[RIGHT_TORSO].add(new Jump_Jet(tonnage));
        stockArmament[RIGHT_TORSO].add(new Jump_Jet(tonnage));
        stockArmament[RIGHT_TORSO].add(new Medium_Laser());
        stockArmament[RIGHT_TORSO].add(new LRM_Ammo(stockArtemisIV));
        
        stockArmament[LEFT_TORSO].add(new Jump_Jet(tonnage));
        stockArmament[LEFT_TORSO].add(new Jump_Jet(tonnage));
        stockArmament[LEFT_TORSO].add(new Medium_Laser());
        stockArmament[LEFT_TORSO].add(new LRM_Ammo(stockArtemisIV));
        
        stockArmament[RIGHT_ARM].add(new Shoulder_Actuator());
        stockArmament[RIGHT_ARM].add(new Upper_Arm_Actuator());
        stockArmament[RIGHT_ARM].add(new LRM15(stockArtemisIV));
        
        stockArmament[LEFT_ARM].add(new Shoulder_Actuator());
        stockArmament[LEFT_ARM].add(new Upper_Arm_Actuator());
        stockArmament[LEFT_ARM].add(new LRM15(stockArtemisIV));
        
        stockArmament[RIGHT_LEG].add(new Hip_Actuator());
        stockArmament[RIGHT_LEG].add(new Upper_Leg_Actuator());
        stockArmament[RIGHT_LEG].add(new Lower_Leg_Actuator());
        stockArmament[RIGHT_LEG].add(new Foot_Actuator());
        stockArmament[RIGHT_LEG].add(new Heat_Sink(stockDoubleHeatSinks));
        stockArmament[RIGHT_LEG].add(new Heat_Sink(stockDoubleHeatSinks));
        
        stockArmament[LEFT_LEG].add(new Hip_Actuator());
        stockArmament[LEFT_LEG].add(new Upper_Leg_Actuator());
        stockArmament[LEFT_LEG].add(new Lower_Leg_Actuator());
        stockArmament[LEFT_LEG].add(new Foot_Actuator());
        stockArmament[LEFT_LEG].add(new Heat_Sink(stockDoubleHeatSinks));
        stockArmament[LEFT_LEG].add(new Heat_Sink(stockDoubleHeatSinks));
    }
}
