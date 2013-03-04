package MWOMechbay.Mechs;

import MWOMechbay.Components.Weapons.SRM6;
import MWOMechbay.Components.Weapons.Streak_SRM2;
import MWOMechbay.Components.Weapons.Medium_Laser;
import MWOMechbay.Components.OtherEquipment.Internals;
import MWOMechbay.Components.OtherEquipment.Heat_Sink;
import MWOMechbay.Components.OtherEquipment.Armor;
import MWOMechbay.Components.Components.Engine;
import MWOMechbay.Components.Components.Hip_Actuator;
import MWOMechbay.Components.Components.Upper_Arm_Actuator;
import MWOMechbay.Components.Components.Sensors;
import MWOMechbay.Components.Components.Upper_Leg_Actuator;
import MWOMechbay.Components.Components.Life_Support;
import MWOMechbay.Components.Components.Cockpit;
import MWOMechbay.Components.Components.CASE;
import MWOMechbay.Components.Components.Lower_Arm_Actuator;
import MWOMechbay.Components.Components.Foot_Actuator;
import MWOMechbay.Components.Components.Shoulder_Actuator;
import MWOMechbay.Components.Components.Hand_Actuator;
import MWOMechbay.Components.Components.Lower_Leg_Actuator;
import MWOMechbay.Components.Components.Gyro;
import MWOMechbay.Components.Ammo.SRM_Ammo;
import MWOMechbay.Components.Ammo.Streak_SRM_Ammo;
import java.util.Vector;

/**
 *
 * @author Nemesis
 */
public class COM_5S extends Commando implements MechCommon {
    public COM_5S() {
        super();
        modelName = "COM-5S";
        baseCost = 0;
        modules = 1;
        stockDoubleHeatSinks = false;
        stockEndoSteel = true;
        stockFerroFibrous = true;
        stockXLEngine = false;
        jumpJetCapable = false;
        stockArtemisIV = true;
        unconfirmed = true;
        stockEngineRating = 150;
        stockExtraHeatSinks = 0;
        iconPath = "/MWOMechbay/Resources/Default_Light.gif";
        //iconPath = "/MWOMechbay/Resources/COM-5S.gif";
        
        hardpoints = new int[][]
        {   {0,0,1,0},
            {0,1,0,0},
            {0,0,0,1},
            {0,0,1,0},
            {0,0,0,0},
            {0,0,0,0},
            {0,0,0,0},
            {0,0,0,0}   };
        
        stockArmor = new int[]
        {   10,
            10,
            12,
            12,
            16,
            10,
            12,
            12,
            4,
            4,
            4};
        
        stockArmament[HEAD].add(new Life_Support());
        stockArmament[HEAD].add(new Sensors());
        stockArmament[HEAD].add(new Cockpit(false));
        
        stockArmament[CENTER_TORSO].add(new Engine(stockXLEngine, stockEngineRating));
        stockArmament[CENTER_TORSO].add(new Gyro());
        stockArmament[CENTER_TORSO].add(new Engine(stockXLEngine, stockEngineRating));
        
        stockArmament[RIGHT_TORSO].add(new SRM_Ammo(stockArtemisIV));
        stockArmament[RIGHT_TORSO].add(new SRM_Ammo(stockArtemisIV));
        stockArmament[RIGHT_TORSO].add(new Streak_SRM_Ammo());
        stockArmament[RIGHT_TORSO].add(new CASE());
        stockArmament[RIGHT_TORSO].add(new Internals(stockEndoSteel, tonnage));
        stockArmament[RIGHT_TORSO].add(new Internals(stockEndoSteel, tonnage));
        stockArmament[RIGHT_TORSO].add(new Internals(stockEndoSteel, tonnage));
        stockArmament[RIGHT_TORSO].add(new Internals(stockEndoSteel, tonnage));
        stockArmament[RIGHT_TORSO].add(new Internals(stockEndoSteel, tonnage));
        stockArmament[RIGHT_TORSO].add(new Internals(stockEndoSteel, tonnage));
        stockArmament[RIGHT_TORSO].add(new Internals(stockEndoSteel, tonnage));
        
        stockArmament[LEFT_TORSO].add(new SRM6(stockArtemisIV));
        stockArmament[LEFT_TORSO].add(new Internals(stockEndoSteel, tonnage));
        stockArmament[LEFT_TORSO].add(new Internals(stockEndoSteel, tonnage));
        stockArmament[LEFT_TORSO].add(new Internals(stockEndoSteel, tonnage));
        stockArmament[LEFT_TORSO].add(new Internals(stockEndoSteel, tonnage));
        stockArmament[LEFT_TORSO].add(new Internals(stockEndoSteel, tonnage));
        stockArmament[LEFT_TORSO].add(new Internals(stockEndoSteel, tonnage));
        stockArmament[LEFT_TORSO].add(new Internals(stockEndoSteel, tonnage));
        
        stockArmament[RIGHT_ARM].add(new Shoulder_Actuator());
        stockArmament[RIGHT_ARM].add(new Upper_Arm_Actuator());
        stockArmament[RIGHT_ARM].add(new Lower_Arm_Actuator());
        stockArmament[RIGHT_ARM].add(new Hand_Actuator());
        stockArmament[RIGHT_ARM].add(new Streak_SRM2());
        stockArmament[RIGHT_ARM].add(new Armor(stockFerroFibrous, this.getStockTotalArmor()));
        stockArmament[RIGHT_ARM].add(new Armor(stockFerroFibrous, this.getStockTotalArmor()));
        stockArmament[RIGHT_ARM].add(new Armor(stockFerroFibrous, this.getStockTotalArmor()));
        stockArmament[RIGHT_ARM].add(new Armor(stockFerroFibrous, this.getStockTotalArmor()));
        stockArmament[RIGHT_ARM].add(new Armor(stockFerroFibrous, this.getStockTotalArmor()));
        stockArmament[RIGHT_ARM].add(new Armor(stockFerroFibrous, this.getStockTotalArmor()));
        stockArmament[RIGHT_ARM].add(new Armor(stockFerroFibrous, this.getStockTotalArmor()));
        
        stockArmament[LEFT_ARM].add(new Shoulder_Actuator());
        stockArmament[LEFT_ARM].add(new Upper_Arm_Actuator());
        stockArmament[LEFT_ARM].add(new Lower_Arm_Actuator());
        stockArmament[LEFT_ARM].add(new Hand_Actuator());
        stockArmament[LEFT_ARM].add(new Medium_Laser());
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
        stockArmament[RIGHT_LEG].add(new Heat_Sink(stockDoubleHeatSinks));
        
        stockArmament[LEFT_LEG].add(new Hip_Actuator());
        stockArmament[LEFT_LEG].add(new Upper_Leg_Actuator());
        stockArmament[LEFT_LEG].add(new Lower_Leg_Actuator());
        stockArmament[LEFT_LEG].add(new Foot_Actuator());
        stockArmament[LEFT_LEG].add(new Heat_Sink(stockDoubleHeatSinks));
        stockArmament[LEFT_LEG].add(new Heat_Sink(stockDoubleHeatSinks));
    }
}
