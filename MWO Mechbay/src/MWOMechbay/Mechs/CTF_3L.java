package MWOMechbay.Mechs;

import MWOMechbay.Components.Weapons.LBX_AC10;
import MWOMechbay.Components.Weapons.Medium_Pulse_Laser;
import MWOMechbay.Components.Weapons.ER_PPC;
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
import MWOMechbay.Components.Ammo.LBX_AC10_Ammo;
import MWOMechbay.Components.SpecialEquipment.MASC;
import java.util.Vector;

/**
 *
 * @author Nemesis
 */
public class CTF_3L extends Cataphract implements MechCommon {
    public CTF_3L() {
        super();
        modelName = "CTF-3L";
        baseCost = 0;
        modules = 2;
        stockDoubleHeatSinks = true;
        stockEndoSteel = false;
        stockFerroFibrous = false;
        stockXLEngine = true;
        jumpJetCapable = false;
        stockEngineRating = 280;
        stockExtraHeatSinks = 6;
        unreleased = true;
        iconPath = "/MWOMechbay/Resources/CTF-3L.gif";
        actuators = new boolean[][] {
            {false, true},
            {false, true}
        };
        
        hardpoints = new int[][]
        {   {0,2,0,0},
            {0,1,0,0},
            {1,1,0,0},
            {0,1,0,1},
            {0,0,0,0},
            {0,0,0,0},
            {0,0,0,0},
            {0,0,0,0}   };
        
        stockArmor = new int[]
        {   44,
            44,
            32,
            32,
            52,
            18,
            38,
            38,
            18,
            18,
            18  };
        
        stockArmament[HEAD].add(new Life_Support());
        stockArmament[HEAD].add(new Sensors());
        stockArmament[HEAD].add(new Cockpit(false));
        
        stockArmament[CENTER_TORSO].add(new Engine(stockXLEngine, stockEngineRating));
        stockArmament[CENTER_TORSO].add(new Gyro());
        stockArmament[CENTER_TORSO].add(new Engine(stockXLEngine, stockEngineRating));
        
        stockArmament[RIGHT_TORSO].add(new Engine(stockXLEngine, stockEngineRating));
        stockArmament[RIGHT_TORSO].add(new LBX_AC10());
        stockArmament[RIGHT_TORSO].add(new Medium_Pulse_Laser());
        stockArmament[RIGHT_TORSO].add(new LBX_AC10_Ammo());
        stockArmament[RIGHT_TORSO].add(new LBX_AC10_Ammo());
        
        stockArmament[LEFT_TORSO].add(new Engine(stockXLEngine, stockEngineRating));
        stockArmament[LEFT_TORSO].add(new Heat_Sink(stockDoubleHeatSinks));
        stockArmament[LEFT_TORSO].add(new Medium_Pulse_Laser());
        stockArmament[LEFT_TORSO].add(new MASC(tonnage));
        
        stockArmament[RIGHT_ARM].add(new Shoulder_Actuator());
        stockArmament[RIGHT_ARM].add(new Upper_Arm_Actuator());
        stockArmament[RIGHT_ARM].add(new Heat_Sink(stockDoubleHeatSinks));
        stockArmament[RIGHT_ARM].add(new Heat_Sink(stockDoubleHeatSinks));
        stockArmament[RIGHT_ARM].add(new ER_PPC());
        stockArmament[RIGHT_ARM].add(new Medium_Pulse_Laser());
        
        stockArmament[LEFT_ARM].add(new Shoulder_Actuator());
        stockArmament[LEFT_ARM].add(new Upper_Arm_Actuator());
        stockArmament[LEFT_ARM].add(new Lower_Arm_Actuator());
        stockArmament[LEFT_ARM].add(new Hand_Actuator());
        stockArmament[LEFT_ARM].add(new Heat_Sink(stockDoubleHeatSinks));
        stockArmament[LEFT_ARM].add(new Heat_Sink(stockDoubleHeatSinks));
        stockArmament[LEFT_ARM].add(new Medium_Pulse_Laser());
        
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
