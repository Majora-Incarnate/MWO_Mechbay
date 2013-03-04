package MWOMechbay.Mechs;

import MWOMechbay.Components.Weapons.SRM6;
import MWOMechbay.Components.Weapons.Streak_SRM2;
import MWOMechbay.Components.Weapons.AC20;
import MWOMechbay.Components.Weapons.LRM20;
import MWOMechbay.Components.Weapons.Medium_Laser;
import MWOMechbay.Components.OtherEquipment.Heat_Sink;
import MWOMechbay.Components.Components.Foot_Actuator;
import MWOMechbay.Components.Components.Gyro;
import MWOMechbay.Components.Components.Cockpit;
import MWOMechbay.Components.Components.Hip_Actuator;
import MWOMechbay.Components.Components.Lower_Leg_Actuator;
import MWOMechbay.Components.Components.Shoulder_Actuator;
import MWOMechbay.Components.Components.Engine;
import MWOMechbay.Components.Components.Sensors;
import MWOMechbay.Components.Components.Hand_Actuator;
import MWOMechbay.Components.Components.Upper_Leg_Actuator;
import MWOMechbay.Components.Components.Lower_Arm_Actuator;
import MWOMechbay.Components.Components.Life_Support;
import MWOMechbay.Components.Components.Upper_Arm_Actuator;
import MWOMechbay.Components.Ammo.LRM_Ammo;
import MWOMechbay.Components.Ammo.AC20_Ammo;
import MWOMechbay.Components.Ammo.Streak_SRM_Ammo;
import MWOMechbay.Components.Ammo.SRM_Ammo;
import java.io.Serializable;
import java.util.Vector;

/**
 *
 * @author Nemesis
 */
public class AS7_S extends Atlas implements MechCommon, Serializable
{   
    public AS7_S()
    {
        super();
        modelName = "AS7-S";
        baseCost = 0;
        unconfirmed = true;
        stockExtraHeatSinks = 5;
        iconPath = "/MWOMechbay/Resources/AS7-D-DC.gif";

        hardpoints = new int[][] {
            {0,1,0,1},
            {0,1,0,0},
            {1,0,0,0},
            {0,0,4,0},
            {0,2,0,0},
            {0,0,0,0},
            {0,0,0,0},
            {0,0,0,0}   };
        
        stockArmor = new int[] {
            68,
            68,
            64,
            64,
            94,
            18,
            82,
            82,
            20,
            20,
            28};
        
        stockArmament[HEAD].add(new Life_Support());
        stockArmament[HEAD].add(new Sensors());
        stockArmament[HEAD].add(new Cockpit(false));
        
        stockArmament[CENTER_TORSO].add(new Engine(stockXLEngine, stockEngineRating));
        stockArmament[CENTER_TORSO].add(new Gyro());
        stockArmament[CENTER_TORSO].add(new Engine(stockXLEngine, stockEngineRating));
        stockArmament[CENTER_TORSO].add(new Medium_Laser());
        stockArmament[CENTER_TORSO].add(new Medium_Laser());
        
        stockArmament[RIGHT_TORSO].add(new AC20());
        stockArmament[RIGHT_TORSO].add(new AC20_Ammo());
        stockArmament[RIGHT_TORSO].add(new AC20_Ammo());
        
        stockArmament[LEFT_TORSO].add(new LRM20(stockArtemisIV));
        stockArmament[LEFT_TORSO].add(new SRM6(stockArtemisIV));
        stockArmament[LEFT_TORSO].add(new Streak_SRM2());
        stockArmament[LEFT_TORSO].add(new Streak_SRM2());
        stockArmament[LEFT_TORSO].add(new LRM_Ammo(stockArtemisIV));
        stockArmament[LEFT_TORSO].add(new LRM_Ammo(stockArtemisIV));
        stockArmament[LEFT_TORSO].add(new SRM_Ammo(stockArtemisIV));
        
        stockArmament[RIGHT_ARM].add(new Shoulder_Actuator());
        stockArmament[RIGHT_ARM].add(new Upper_Arm_Actuator());
        stockArmament[RIGHT_ARM].add(new Lower_Arm_Actuator());
        stockArmament[RIGHT_ARM].add(new Hand_Actuator());
        stockArmament[RIGHT_ARM].add(new Heat_Sink(stockDoubleHeatSinks));
        stockArmament[RIGHT_ARM].add(new Medium_Laser());
        
        stockArmament[LEFT_ARM].add(new Shoulder_Actuator());
        stockArmament[LEFT_ARM].add(new Upper_Arm_Actuator());
        stockArmament[LEFT_ARM].add(new Lower_Arm_Actuator());
        stockArmament[LEFT_ARM].add(new Hand_Actuator());
        stockArmament[LEFT_ARM].add(new Heat_Sink(stockDoubleHeatSinks));
        stockArmament[LEFT_ARM].add(new Heat_Sink(stockDoubleHeatSinks));
        stockArmament[LEFT_ARM].add(new Medium_Laser());
        
        stockArmament[RIGHT_LEG].add(new Hip_Actuator());
        stockArmament[RIGHT_LEG].add(new Upper_Leg_Actuator());
        stockArmament[RIGHT_LEG].add(new Lower_Leg_Actuator());
        stockArmament[RIGHT_LEG].add(new Foot_Actuator());
        stockArmament[RIGHT_LEG].add(new AC20_Ammo());
        
        stockArmament[LEFT_LEG].add(new Hip_Actuator());
        stockArmament[LEFT_LEG].add(new Upper_Leg_Actuator());
        stockArmament[LEFT_LEG].add(new Lower_Leg_Actuator());
        stockArmament[LEFT_LEG].add(new Foot_Actuator());
        stockArmament[LEFT_LEG].add(new Streak_SRM_Ammo());
    }
}
