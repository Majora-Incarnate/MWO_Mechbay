/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MWOMechbay.Mechs;

import MWOMechbay.Components.Weapons.Small_Laser;
import MWOMechbay.Components.Weapons.PPC;
import MWOMechbay.Components.Weapons.LRM15;
import MWOMechbay.Components.Weapons.Large_Laser;
import MWOMechbay.Components.OtherEquipment.Heat_Sink;
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
import MWOMechbay.Components.Ammo.LRM_Ammo;
import MWOMechbay.Components.Ammo.SRM_Ammo;
import MWOMechbay.Components.SpecialEquipment.Guardian_ECM_Suite;
import MWOMechbay.Components.Weapons.Medium_Laser;
import MWOMechbay.Components.Weapons.SRM4;
import java.util.Vector;

/**
 *
 * @author Nemesis
 */
public class AWS_PB extends Awesome implements MechCommon
{
    public AWS_PB()
    {
        super();
        modelName = "AWS-PB";
        baseCost = 0;
        stockDoubleHeatSinks = true;
        stockXLEngine = true;
        stockEngineRating = 340;
        stockExtraHeatSinks = 9;
        iconPath = "/MWOMechbay/Resources/AWS-PB.gif";

        hardpoints = new int[][] {
            {0,1,0,0},
            {0,0,2,0},
            {0,0,1,1},
            {0,1,0,0},
            {0,0,0,0},
            {0,1,0,0},
            {0,0,0,0},
            {0,0,0,0}   };
        
        stockArmor = new int[] {
            52,
            52,
            48,
            48,
            60,
            18,
            68,
            68,
            20,
            20,
            40};
        
        stockArmament[HEAD].add(new Life_Support());
        stockArmament[HEAD].add(new Sensors());
        stockArmament[HEAD].add(new Cockpit(false));
        stockArmament[HEAD].add(new Medium_Laser());
        
        stockArmament[CENTER_TORSO].add(new Engine(stockXLEngine, stockEngineRating));
        stockArmament[CENTER_TORSO].add(new Gyro());
        stockArmament[CENTER_TORSO].add(new Engine(stockXLEngine, stockEngineRating));
        stockArmament[CENTER_TORSO].add(new SRM_Ammo(stockArtemisIV));
        stockArmament[CENTER_TORSO].add(new SRM_Ammo(stockArtemisIV));
        
        stockArmament[RIGHT_TORSO].add(new Engine(stockXLEngine, stockEngineRating));
        stockArmament[RIGHT_TORSO].add(new Heat_Sink(stockDoubleHeatSinks));
        stockArmament[RIGHT_TORSO].add(new LRM15(stockArtemisIV));
        stockArmament[RIGHT_TORSO].add(new LRM_Ammo(stockArtemisIV));
        stockArmament[RIGHT_TORSO].add(new LRM_Ammo(stockArtemisIV));
        
        stockArmament[LEFT_TORSO].add(new Engine(stockXLEngine, stockEngineRating));
        stockArmament[LEFT_TORSO].add(new Heat_Sink(stockDoubleHeatSinks));
        stockArmament[LEFT_TORSO].add(new Heat_Sink(stockDoubleHeatSinks));
        stockArmament[LEFT_TORSO].add(new Large_Laser());
        stockArmament[LEFT_TORSO].add(new LRM_Ammo(stockArtemisIV));
        
        stockArmament[RIGHT_ARM].add(new Shoulder_Actuator());
        stockArmament[RIGHT_ARM].add(new Upper_Arm_Actuator());
        stockArmament[RIGHT_ARM].add(new Lower_Arm_Actuator());
        stockArmament[RIGHT_ARM].add(new PPC());
        stockArmament[RIGHT_ARM].add(new Heat_Sink(stockDoubleHeatSinks));
        stockArmament[RIGHT_ARM].add(new Heat_Sink(stockDoubleHeatSinks));
        
        stockArmament[LEFT_ARM].add(new Shoulder_Actuator());
        stockArmament[LEFT_ARM].add(new Upper_Arm_Actuator());
        stockArmament[LEFT_ARM].add(new Lower_Arm_Actuator());
        stockArmament[LEFT_ARM].add(new Hand_Actuator());
        stockArmament[LEFT_ARM].add(new SRM4(stockArtemisIV));
        stockArmament[LEFT_ARM].add(new Heat_Sink(stockDoubleHeatSinks));
        
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
