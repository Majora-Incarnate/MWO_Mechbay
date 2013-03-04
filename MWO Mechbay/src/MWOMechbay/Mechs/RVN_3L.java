package MWOMechbay.Mechs;

import MWOMechbay.Components.Weapons.NARC;
import MWOMechbay.Components.Weapons.SRM6;
import MWOMechbay.Components.Weapons.Medium_Laser;
import MWOMechbay.Components.SpecialEquipment.Target_Acquisition_Gear;
import MWOMechbay.Components.SpecialEquipment.Guardian_ECM_Suite;
import MWOMechbay.Components.SpecialEquipment.Beagle_Active_Probe;
import MWOMechbay.Components.OtherEquipment.Heat_Sink;
import MWOMechbay.Components.OtherEquipment.Armor;
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
import MWOMechbay.Components.Ammo.SRM_Ammo;
import MWOMechbay.Components.Ammo.Homing_Pod_Ammo;
import java.util.Vector;

/**
 *
 * @author Nemesis
 */
public class RVN_3L extends Raven implements MechCommon
{
    public RVN_3L() {
        super();
        modelName = "RVN-3L";
        baseCost = 5862992;
        modules = 3;
        stockDoubleHeatSinks = false;
        stockEndoSteel = false;
        stockFerroFibrous = true;
        stockXLEngine = true;
        jumpJetCapable = false;
        ECMCapable = true;
        stockEngineRating = 210;
        stockExtraHeatSinks = 1;
        iconPath = "/MWOMechbay/Resources/RVN-3L.gif";
        
        hardpoints = new int[][]
        {   {0,2,0,0},
            {0,0,1,0},
            {0,1,1,0},
            {0,0,0,1},
            {0,0,0,0},
            {0,0,0,0},
            {0,0,0,0},
            {0,0,0,0}   };
        
        stockArmor = new int[]
        {   16,
            16,
            22,
            22,
            22,
            12,
            16,
            16,
            6,
            6,
            6};
        
        stockArmament[HEAD].add(new Life_Support());
        stockArmament[HEAD].add(new Sensors());
        stockArmament[HEAD].add(new Cockpit(false));
        stockArmament[HEAD].add(new Heat_Sink(stockDoubleHeatSinks));
        
        stockArmament[CENTER_TORSO].add(new Engine(stockXLEngine, stockEngineRating));
        stockArmament[CENTER_TORSO].add(new Gyro());
        stockArmament[CENTER_TORSO].add(new Engine(stockXLEngine, stockEngineRating));
        stockArmament[CENTER_TORSO].add(new Beagle_Active_Probe());
        
        stockArmament[RIGHT_TORSO].add(new Engine(stockXLEngine, stockEngineRating));
        stockArmament[RIGHT_TORSO].add(new SRM6(stockArtemisIV));
        stockArmament[RIGHT_TORSO].add(new Target_Acquisition_Gear());
        
        stockArmament[LEFT_TORSO].add(new Engine(stockXLEngine, stockEngineRating));
        stockArmament[LEFT_TORSO].add(new Homing_Pod_Ammo());
        stockArmament[LEFT_TORSO].add(new Homing_Pod_Ammo());
        stockArmament[LEFT_TORSO].add(new SRM_Ammo(stockArtemisIV));
        stockArmament[LEFT_TORSO].add(new Guardian_ECM_Suite());
        stockArmament[LEFT_TORSO].add(new CASE());
        
        stockArmament[RIGHT_ARM].add(new Shoulder_Actuator());
        stockArmament[RIGHT_ARM].add(new Upper_Arm_Actuator());
        stockArmament[RIGHT_ARM].add(new Medium_Laser());
        stockArmament[RIGHT_ARM].add(new Medium_Laser());
        stockArmament[RIGHT_ARM].add(new Armor(stockFerroFibrous, this.getStockTotalArmor()));
        stockArmament[RIGHT_ARM].add(new Armor(stockFerroFibrous, this.getStockTotalArmor()));
        stockArmament[RIGHT_ARM].add(new Armor(stockFerroFibrous, this.getStockTotalArmor()));
        stockArmament[RIGHT_ARM].add(new Armor(stockFerroFibrous, this.getStockTotalArmor()));
        stockArmament[RIGHT_ARM].add(new Armor(stockFerroFibrous, this.getStockTotalArmor()));
        stockArmament[RIGHT_ARM].add(new Armor(stockFerroFibrous, this.getStockTotalArmor()));
        stockArmament[RIGHT_ARM].add(new Armor(stockFerroFibrous, this.getStockTotalArmor()));
        
        stockArmament[LEFT_ARM].add(new Shoulder_Actuator());
        stockArmament[LEFT_ARM].add(new Upper_Arm_Actuator());
        stockArmament[LEFT_ARM].add(new NARC());
        stockArmament[LEFT_ARM].add(new Armor(stockFerroFibrous, this.getStockTotalArmor()));
        stockArmament[LEFT_ARM].add(new Armor(stockFerroFibrous, this.getStockTotalArmor()));
        stockArmament[LEFT_ARM].add(new Armor(stockFerroFibrous, this.getStockTotalArmor()));
        stockArmament[LEFT_ARM].add(new Armor(stockFerroFibrous, this.getStockTotalArmor()));
        stockArmament[LEFT_ARM].add(new Armor(stockFerroFibrous, this.getStockTotalArmor()));
        stockArmament[LEFT_ARM].add(new Armor(stockFerroFibrous, this.getStockTotalArmor()));
        stockArmament[LEFT_ARM].add(new Armor(stockFerroFibrous, this.getStockTotalArmor()));
        
        stockArmament[RIGHT_LEG].add(new Hip_Actuator());
        stockArmament[RIGHT_LEG].add(new Upper_Leg_Actuator());
        stockArmament[RIGHT_LEG].add(new Lower_Leg_Actuator());
        stockArmament[RIGHT_LEG].add(new Foot_Actuator());
        stockArmament[RIGHT_LEG].add(new Heat_Sink(stockDoubleHeatSinks));
        
        stockArmament[LEFT_LEG].add(new Hip_Actuator());
        stockArmament[LEFT_LEG].add(new Upper_Leg_Actuator());
        stockArmament[LEFT_LEG].add(new Lower_Leg_Actuator());
        stockArmament[LEFT_LEG].add(new Foot_Actuator());
        stockArmament[LEFT_LEG].add(new Heat_Sink(stockDoubleHeatSinks));
    }
}
