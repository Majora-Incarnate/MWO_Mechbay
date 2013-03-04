package MWOMechbay.Mechs;

import MWOMechbay.Components.Weapons.AC10;
import MWOMechbay.Components.Weapons.SRM4;
import MWOMechbay.Components.Weapons.LRM15;
import MWOMechbay.Components.Weapons.Large_Laser;
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
import MWOMechbay.Components.Ammo.AC10_Ammo;
import MWOMechbay.Components.Ammo.SRM_Ammo;
import MWOMechbay.Components.Ammo.LRM_Ammo;
import java.io.Serializable;
import java.util.Vector;

/**
 *
 * @author Nemesis
 */
public class AS7_RS extends Atlas implements MechCommon, Serializable
{
    public AS7_RS()
    {
        super();
        modelName = "AS7-RS";
        baseCost = 9358066;
        stockExtraHeatSinks = 10;
        iconPath = "/MWOMechbay/Resources/AS7-RS.gif";

        hardpoints = new int[][] {
            {0,2,0,0},
            {0,2,0,1},
            {1,0,0,0},
            {0,0,2,0},
            {0,0,0,0},
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
        stockArmament[HEAD].add(new Heat_Sink(stockDoubleHeatSinks));
        
        stockArmament[CENTER_TORSO].add(new Engine(stockXLEngine, stockEngineRating));
        stockArmament[CENTER_TORSO].add(new Gyro());
        stockArmament[CENTER_TORSO].add(new Engine(stockXLEngine, stockEngineRating));
        
        stockArmament[RIGHT_TORSO].add(new AC10());
        stockArmament[RIGHT_TORSO].add(new AC10_Ammo());
        stockArmament[RIGHT_TORSO].add(new AC10_Ammo());
        
        stockArmament[LEFT_TORSO].add(new Heat_Sink(stockDoubleHeatSinks));
        stockArmament[LEFT_TORSO].add(new LRM15(stockArtemisIV));
        stockArmament[LEFT_TORSO].add(new SRM4(stockArtemisIV));
        stockArmament[LEFT_TORSO].add(new LRM_Ammo(stockArtemisIV));
        stockArmament[LEFT_TORSO].add(new LRM_Ammo(stockArtemisIV));
        stockArmament[LEFT_TORSO].add(new SRM_Ammo(stockArtemisIV));
        
        stockArmament[RIGHT_ARM].add(new Shoulder_Actuator());
        stockArmament[RIGHT_ARM].add(new Upper_Arm_Actuator());
        stockArmament[RIGHT_ARM].add(new Lower_Arm_Actuator());
        stockArmament[RIGHT_ARM].add(new Hand_Actuator());
        stockArmament[RIGHT_ARM].add(new Heat_Sink(stockDoubleHeatSinks));
        stockArmament[RIGHT_ARM].add(new Large_Laser());
        
        stockArmament[LEFT_ARM].add(new Shoulder_Actuator());
        stockArmament[LEFT_ARM].add(new Upper_Arm_Actuator());
        stockArmament[LEFT_ARM].add(new Lower_Arm_Actuator());
        stockArmament[LEFT_ARM].add(new Hand_Actuator());
        stockArmament[LEFT_ARM].add(new Heat_Sink(stockDoubleHeatSinks));
        stockArmament[LEFT_ARM].add(new Large_Laser());
        
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
