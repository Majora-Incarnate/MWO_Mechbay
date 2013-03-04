package MWOMechbay.Mechs;

import MWOMechbay.Components.Weapons.Ultra_AC5;
import MWOMechbay.Components.Weapons.Small_Pulse_Laser;
import MWOMechbay.Components.Weapons.Medium_Laser;
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
import MWOMechbay.Components.Components.CASE;
import MWOMechbay.Components.Ammo.Ultra_AC5_Ammo;
import java.util.Vector;

/**
 *
 * @author Nemesis
 */
public class CDA_3M extends Cicada implements MechCommon
{
    public CDA_3M()
    {
        super();
        modelName = "CDA-3M";
        baseCost = 7097444;
        stockDoubleHeatSinks = false;
        stockEndoSteel = false;
        stockFerroFibrous = false;
        stockXLEngine = true;
        jumpJetCapable = false;
        ECMCapable = true;
        stockEngineRating = 320;
        stockExtraHeatSinks = 0;
        iconPath = "/MWOMechbay/Resources/CDA-3M.gif";

        hardpoints = new int[][] {
            {0,0,0,0},
            {0,0,0,0},
            {0,1,0,1},
            {1,1,0,0},
            {0,2,0,0},
            {0,0,0,0},
            {0,0,0,0},
            {0,0,0,0}   };
        
        stockArmor = new int[] {
            8,
            8,
            12,
            12,
            22,
            18,
            12,
            12,
            6,
            6,
            12};
        
        stockArmament[HEAD].add(new Life_Support());
        stockArmament[HEAD].add(new Sensors());
        stockArmament[HEAD].add(new Cockpit(false));
        
        stockArmament[CENTER_TORSO].add(new Engine(stockXLEngine, stockEngineRating));
        stockArmament[CENTER_TORSO].add(new Gyro());
        stockArmament[CENTER_TORSO].add(new Engine(stockXLEngine, stockEngineRating));
        stockArmament[CENTER_TORSO].add(new Small_Pulse_Laser());
        
        stockArmament[RIGHT_TORSO].add(new Engine(stockXLEngine, stockEngineRating));
        stockArmament[RIGHT_TORSO].add(new Medium_Laser());
        stockArmament[RIGHT_TORSO].add(new Ultra_AC5_Ammo());
        stockArmament[RIGHT_TORSO].add(new CASE());
        
        stockArmament[LEFT_TORSO].add(new Engine(stockXLEngine, stockEngineRating));
        stockArmament[LEFT_TORSO].add(new Ultra_AC5());
        stockArmament[LEFT_TORSO].add(new Medium_Laser());
        
        stockArmament[RIGHT_ARM].add(new Shoulder_Actuator());
        stockArmament[RIGHT_ARM].add(new Upper_Arm_Actuator());
        
        stockArmament[LEFT_ARM].add(new Shoulder_Actuator());
        stockArmament[LEFT_ARM].add(new Upper_Arm_Actuator());
        
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
