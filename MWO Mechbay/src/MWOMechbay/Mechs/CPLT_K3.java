package MWOMechbay.Mechs;

import MWOMechbay.Components.Weapons.MG;
import MWOMechbay.Components.Weapons.PPC;
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
import MWOMechbay.Components.Ammo.MG_Ammo;
import MWOMechbay.Components.Weapons.ER_PPC;
import java.util.Vector;

/**
 *
 * @author Nemesis
 */
public class CPLT_K3 extends Catapult implements MechCommon {
    public CPLT_K3() {
        super();
        modelName = "CPLT-K3";
        baseCost = 0;
        modules = 1;
        stockDoubleHeatSinks = true;
        stockEndoSteel = false;
        stockFerroFibrous = false;
        stockXLEngine = false;
        jumpJetCapable = false;
        unconfirmed = true;
        stockEngineRating = 260;
        stockExtraHeatSinks = 10;
        iconPath = "/MWOMechbay/Resources/CPLT-K2.gif";
        
        hardpoints = new int[][]
        {   {0,1,0,0},
            {0,1,0,0},
            {1,1,0,1},
            {1,1,0,0},
            {0,0,0,0},
            {0,0,0,0},
            {0,0,0,0},
            {0,0,0,0}   };
        
        stockArmor = new int[]
        {   36,
            36,
            40,
            40,
            48,
            18,
            40,
            40,
            16,
            16,
            22};
        
        stockArmament[HEAD].add(new Life_Support());
        stockArmament[HEAD].add(new Sensors());
        stockArmament[HEAD].add(new Cockpit(false));
        
        stockArmament[CENTER_TORSO].add(new Engine(stockXLEngine, stockEngineRating));
        stockArmament[CENTER_TORSO].add(new Gyro());
        stockArmament[CENTER_TORSO].add(new Engine(stockXLEngine, stockEngineRating));
        stockArmament[CENTER_TORSO].add(new MG_Ammo());
        
        stockArmament[RIGHT_TORSO].add(new Heat_Sink(stockDoubleHeatSinks));
        stockArmament[RIGHT_TORSO].add(new Heat_Sink(stockDoubleHeatSinks));
        stockArmament[RIGHT_TORSO].add(new Heat_Sink(stockDoubleHeatSinks));
        stockArmament[RIGHT_TORSO].add(new Medium_Laser());
        stockArmament[RIGHT_TORSO].add(new MG());
        
        stockArmament[LEFT_TORSO].add(new Heat_Sink(stockDoubleHeatSinks));
        stockArmament[LEFT_TORSO].add(new Heat_Sink(stockDoubleHeatSinks));
        stockArmament[LEFT_TORSO].add(new Heat_Sink(stockDoubleHeatSinks));
        stockArmament[LEFT_TORSO].add(new Medium_Laser());
        stockArmament[LEFT_TORSO].add(new MG());
        
        stockArmament[RIGHT_ARM].add(new Shoulder_Actuator());
        stockArmament[RIGHT_ARM].add(new Upper_Arm_Actuator());
        stockArmament[RIGHT_ARM].add(new Heat_Sink(stockDoubleHeatSinks));
        stockArmament[RIGHT_ARM].add(new Heat_Sink(stockDoubleHeatSinks));
        stockArmament[RIGHT_ARM].add(new ER_PPC());
        
        stockArmament[LEFT_ARM].add(new Shoulder_Actuator());
        stockArmament[LEFT_ARM].add(new Upper_Arm_Actuator());
        stockArmament[LEFT_ARM].add(new Heat_Sink(stockDoubleHeatSinks));
        stockArmament[LEFT_ARM].add(new Heat_Sink(stockDoubleHeatSinks));
        stockArmament[LEFT_ARM].add(new ER_PPC());
        
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
