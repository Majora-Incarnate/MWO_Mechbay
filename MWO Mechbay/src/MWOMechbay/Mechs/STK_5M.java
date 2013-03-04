package MWOMechbay.Mechs;

import MWOMechbay.Components.Weapons.NARC;
import MWOMechbay.Components.Weapons.SRM6;
import MWOMechbay.Components.Weapons.LRM10;
import MWOMechbay.Components.Weapons.ER_Large_Laser;
import MWOMechbay.Components.Weapons.Medium_Laser;
import MWOMechbay.Components.OtherEquipment.Heat_Sink;
import MWOMechbay.Components.Components.Engine;
import MWOMechbay.Components.Components.Foot_Actuator;
import MWOMechbay.Components.Components.Shoulder_Actuator;
import MWOMechbay.Components.Components.Lower_Leg_Actuator;
import MWOMechbay.Components.Components.Gyro;
import MWOMechbay.Components.Components.Upper_Arm_Actuator;
import MWOMechbay.Components.Components.Hip_Actuator;
import MWOMechbay.Components.Components.Sensors;
import MWOMechbay.Components.Components.Upper_Leg_Actuator;
import MWOMechbay.Components.Components.Life_Support;
import MWOMechbay.Components.Components.Cockpit;
import MWOMechbay.Components.Ammo.LRM_Ammo;
import MWOMechbay.Components.Ammo.Homing_Pod_Ammo;
import MWOMechbay.Components.Ammo.SRM_Ammo;
import java.util.Vector;

/**
 *
 * @author Nemesis
 */
public class STK_5M extends Stalker implements MechCommon {
    public STK_5M() {
        super();
        modelName = "STK-5M";
        baseCost = 8064616;
        stockDoubleHeatSinks = true;
        stockExtraHeatSinks = 7;
        iconPath = "/MWOMechbay/Resources/STK-5M.gif";
        
        hardpoints = new int[][]
        {   {0,2,1,0},
            {0,2,1,0},
            {0,0,1,1},
            {0,0,2,0},
            {0,1,0,0},
            {0,0,0,0},
            {0,0,0,0},
            {0,0,0,0}   };
        
        stockArmor = new int[]
        {   50,
            50,
            54,
            54,
            72,
            18,
            54,
            54,
            18,
            18,
            22};
        
        stockArmament[HEAD].add(new Life_Support());
        stockArmament[HEAD].add(new Sensors());
        stockArmament[HEAD].add(new Cockpit(false));
        
        stockArmament[CENTER_TORSO].add(new Engine(stockXLEngine, stockEngineRating));
        stockArmament[CENTER_TORSO].add(new Gyro());
        stockArmament[CENTER_TORSO].add(new Engine(stockXLEngine, stockEngineRating));
        stockArmament[CENTER_TORSO].add(new ER_Large_Laser());
        
        stockArmament[RIGHT_TORSO].add(new Heat_Sink(stockDoubleHeatSinks));
        stockArmament[RIGHT_TORSO].add(new Heat_Sink(stockDoubleHeatSinks));
        stockArmament[RIGHT_TORSO].add(new Heat_Sink(stockDoubleHeatSinks));
        stockArmament[RIGHT_TORSO].add(new SRM6(stockArtemisIV));
        stockArmament[RIGHT_TORSO].add(new SRM_Ammo(stockArtemisIV));
        
        stockArmament[LEFT_TORSO].add(new Heat_Sink(stockDoubleHeatSinks));
        stockArmament[LEFT_TORSO].add(new Heat_Sink(stockDoubleHeatSinks));
        stockArmament[LEFT_TORSO].add(new SRM6(stockArtemisIV));
        stockArmament[LEFT_TORSO].add(new NARC());
        stockArmament[LEFT_TORSO].add(new SRM_Ammo(stockArtemisIV));
        
        stockArmament[RIGHT_ARM].add(new Shoulder_Actuator());
        stockArmament[RIGHT_ARM].add(new Upper_Arm_Actuator());
        stockArmament[RIGHT_ARM].add(new Heat_Sink(stockDoubleHeatSinks));
        stockArmament[RIGHT_ARM].add(new LRM10(stockArtemisIV));
        stockArmament[RIGHT_ARM].add(new Medium_Laser());
        stockArmament[RIGHT_ARM].add(new Medium_Laser());
        stockArmament[RIGHT_ARM].add(new LRM_Ammo(stockArtemisIV));
        stockArmament[RIGHT_ARM].add(new LRM_Ammo(stockArtemisIV));
        
        stockArmament[LEFT_ARM].add(new Shoulder_Actuator());
        stockArmament[LEFT_ARM].add(new Upper_Arm_Actuator());
        stockArmament[LEFT_ARM].add(new Heat_Sink(stockDoubleHeatSinks));
        stockArmament[LEFT_ARM].add(new LRM10(stockArtemisIV));
        stockArmament[LEFT_ARM].add(new Medium_Laser());
        stockArmament[LEFT_ARM].add(new Medium_Laser());
        stockArmament[LEFT_ARM].add(new LRM_Ammo(stockArtemisIV));
        stockArmament[LEFT_ARM].add(new LRM_Ammo(stockArtemisIV));
        
        stockArmament[RIGHT_LEG].add(new Hip_Actuator());
        stockArmament[RIGHT_LEG].add(new Upper_Leg_Actuator());
        stockArmament[RIGHT_LEG].add(new Lower_Leg_Actuator());
        stockArmament[RIGHT_LEG].add(new Foot_Actuator());
        
        stockArmament[LEFT_LEG].add(new Hip_Actuator());
        stockArmament[LEFT_LEG].add(new Upper_Leg_Actuator());
        stockArmament[LEFT_LEG].add(new Lower_Leg_Actuator());
        stockArmament[LEFT_LEG].add(new Foot_Actuator());
        stockArmament[LEFT_LEG].add(new Homing_Pod_Ammo());
        stockArmament[LEFT_LEG].add(new Homing_Pod_Ammo());
    }
}
