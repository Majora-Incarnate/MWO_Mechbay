/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MWOMechbay.Mechs;

import MWOMechbay.Components.Weapons.Small_Laser;
import MWOMechbay.Components.Weapons.PPC;
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
import java.util.Vector;

/**
 *
 * @author Nemesis
 */
public class AWS_8Q extends Awesome implements MechCommon
{
    public AWS_8Q()
    {
        super();
        modelName = "AWS-8Q";
        baseCost = 6764270;
        stockDoubleHeatSinks = false;
        stockEndoSteel = false;
        stockFerroFibrous = false;
        stockXLEngine = false;
        jumpJetCapable = false;
        stockEngineRating = 240;
        stockExtraHeatSinks = 18;
        iconPath = "/MWOMechbay/Resources/AWS-8Q.gif";

        hardpoints = new int[][] {
            {0,2,0,0},
            {0,0,0,0},
            {0,2,0,1},
            {0,2,0,0},
            {0,0,0,0},
            {0,1,0,0},
            {0,0,0,0},
            {0,0,0,0}   };
        
        stockArmor = new int[] {
            48,
            48,
            48,
            48,
            60,
            18,
            66,
            66,
            20,
            20,
            38};
        
        stockArmament[HEAD].add(new Life_Support());
        stockArmament[HEAD].add(new Sensors());
        stockArmament[HEAD].add(new Cockpit(false));
        stockArmament[HEAD].add(new Small_Laser());
        
        stockArmament[CENTER_TORSO].add(new Engine(stockXLEngine, stockEngineRating));
        stockArmament[CENTER_TORSO].add(new Gyro());
        stockArmament[CENTER_TORSO].add(new Engine(stockXLEngine, stockEngineRating));
        stockArmament[CENTER_TORSO].add(new Heat_Sink(stockDoubleHeatSinks));
        stockArmament[CENTER_TORSO].add(new Heat_Sink(stockDoubleHeatSinks));
        
        stockArmament[RIGHT_TORSO].add(new PPC());
        stockArmament[RIGHT_TORSO].add(new Heat_Sink(stockDoubleHeatSinks));
        stockArmament[RIGHT_TORSO].add(new Heat_Sink(stockDoubleHeatSinks));
        stockArmament[RIGHT_TORSO].add(new Heat_Sink(stockDoubleHeatSinks));
        
        stockArmament[LEFT_TORSO].add(new PPC());
        stockArmament[LEFT_TORSO].add(new Heat_Sink(stockDoubleHeatSinks));
        stockArmament[LEFT_TORSO].add(new Heat_Sink(stockDoubleHeatSinks));
        stockArmament[LEFT_TORSO].add(new Heat_Sink(stockDoubleHeatSinks));
        stockArmament[LEFT_TORSO].add(new Heat_Sink(stockDoubleHeatSinks));
        stockArmament[LEFT_TORSO].add(new Heat_Sink(stockDoubleHeatSinks));
        
        stockArmament[RIGHT_ARM].add(new Shoulder_Actuator());
        stockArmament[RIGHT_ARM].add(new Upper_Arm_Actuator());
        stockArmament[RIGHT_ARM].add(new Lower_Arm_Actuator());
        stockArmament[RIGHT_ARM].add(new PPC());
        stockArmament[RIGHT_ARM].add(new Heat_Sink(stockDoubleHeatSinks));
        stockArmament[RIGHT_ARM].add(new Heat_Sink(stockDoubleHeatSinks));
        stockArmament[RIGHT_ARM].add(new Heat_Sink(stockDoubleHeatSinks));
        stockArmament[RIGHT_ARM].add(new Heat_Sink(stockDoubleHeatSinks));
        stockArmament[RIGHT_ARM].add(new Heat_Sink(stockDoubleHeatSinks));
        
        stockArmament[LEFT_ARM].add(new Shoulder_Actuator());
        stockArmament[LEFT_ARM].add(new Upper_Arm_Actuator());
        stockArmament[LEFT_ARM].add(new Lower_Arm_Actuator());
        stockArmament[LEFT_ARM].add(new Hand_Actuator());
        
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
    
    public int getMaxEngineRating() {
        return 300;
    }
}
