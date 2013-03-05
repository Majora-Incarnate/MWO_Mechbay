package MWOMechbay.Mechs;

import MWOMechbay.Components.Ammo.SRM_Ammo;
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
import MWOMechbay.Components.OtherEquipment.Armor;
import MWOMechbay.Components.OtherEquipment.Internals;
import MWOMechbay.Components.Weapons.Medium_Laser;
import MWOMechbay.Components.Weapons.SRM2;
import java.util.Vector;

/**
 *
 * @author Nemesis
 */
public class CDA_X_5 extends Cicada implements MechCommon
{
    public CDA_X_5()
    {
        super();
        modelName = "CDA-X-5";
        baseCost = 0;
        stockDoubleHeatSinks = true;
        stockEndoSteel = true;
        stockFerroFibrous = true;
        stockXLEngine = true;
        jumpJetCapable = false;
        stockArtemisIV = false;
        stockEngineRating = 330;
        stockExtraHeatSinks = 3;
        iconPath = "/MWOMechbay/Resources/CDA-X-5.gif";

        hardpoints = new int[][] {
            {0,1,0,0},
            {0,1,0,0},
            {0,1,1,1},
            {0,1,1,0},
            {0,0,0,0},
            {0,0,0,0},
            {0,0,0,0},
            {0,0,0,0}   };
        
        stockArmor = new int[] {
            21,
            21,
            30,
            30,
            36,
            18,
            40,
            40,
            10,
            10,
            12};
        
        stockArmament[HEAD].add(new Life_Support());
        stockArmament[HEAD].add(new Sensors());
        stockArmament[HEAD].add(new Cockpit(false));
        
        stockArmament[CENTER_TORSO].add(new Engine(stockXLEngine, stockEngineRating));
        stockArmament[CENTER_TORSO].add(new Gyro());
        stockArmament[CENTER_TORSO].add(new Engine(stockXLEngine, stockEngineRating));
        stockArmament[CENTER_TORSO].add(new Armor(stockFerroFibrous, this.getStockTotalArmor()));
        stockArmament[CENTER_TORSO].add(new Armor(stockFerroFibrous, this.getStockTotalArmor()));
        
        stockArmament[RIGHT_TORSO].add(new Engine(stockXLEngine, stockEngineRating));
        stockArmament[RIGHT_TORSO].add(new Medium_Laser());
        stockArmament[RIGHT_TORSO].add(new SRM2(stockArtemisIV));
        stockArmament[RIGHT_TORSO].add(new SRM_Ammo(stockArtemisIV));
        stockArmament[RIGHT_TORSO].add(new Armor(stockFerroFibrous, this.getStockTotalArmor()));
        stockArmament[RIGHT_TORSO].add(new Armor(stockFerroFibrous, this.getStockTotalArmor()));
        stockArmament[RIGHT_TORSO].add(new Armor(stockFerroFibrous, this.getStockTotalArmor()));
        stockArmament[RIGHT_TORSO].add(new Armor(stockFerroFibrous, this.getStockTotalArmor()));
        
        stockArmament[LEFT_TORSO].add(new Engine(stockXLEngine, stockEngineRating));
        stockArmament[LEFT_TORSO].add(new Medium_Laser());
        stockArmament[LEFT_TORSO].add(new SRM2(stockArtemisIV));
        stockArmament[LEFT_TORSO].add(new SRM_Ammo(stockArtemisIV));
        stockArmament[LEFT_TORSO].add(new Armor(stockFerroFibrous, this.getStockTotalArmor()));
        stockArmament[LEFT_TORSO].add(new Armor(stockFerroFibrous, this.getStockTotalArmor()));
        stockArmament[LEFT_TORSO].add(new Armor(stockFerroFibrous, this.getStockTotalArmor()));
        stockArmament[LEFT_TORSO].add(new Armor(stockFerroFibrous, this.getStockTotalArmor()));
        
        stockArmament[RIGHT_ARM].add(new Shoulder_Actuator());
        stockArmament[RIGHT_ARM].add(new Upper_Arm_Actuator());
        stockArmament[RIGHT_ARM].add(new Medium_Laser());
        stockArmament[RIGHT_ARM].add(new Internals(stockEndoSteel, tonnage));
        stockArmament[RIGHT_ARM].add(new Internals(stockEndoSteel, tonnage));
        stockArmament[RIGHT_ARM].add(new Internals(stockEndoSteel, tonnage));
        stockArmament[RIGHT_ARM].add(new Internals(stockEndoSteel, tonnage));
        stockArmament[RIGHT_ARM].add(new Internals(stockEndoSteel, tonnage));
        stockArmament[RIGHT_ARM].add(new Internals(stockEndoSteel, tonnage));
        stockArmament[RIGHT_ARM].add(new Internals(stockEndoSteel, tonnage));
        
        stockArmament[LEFT_ARM].add(new Shoulder_Actuator());
        stockArmament[LEFT_ARM].add(new Upper_Arm_Actuator());
        stockArmament[LEFT_ARM].add(new Medium_Laser());
        stockArmament[LEFT_ARM].add(new Internals(stockEndoSteel, tonnage));
        stockArmament[LEFT_ARM].add(new Internals(stockEndoSteel, tonnage));
        stockArmament[LEFT_ARM].add(new Internals(stockEndoSteel, tonnage));
        stockArmament[LEFT_ARM].add(new Internals(stockEndoSteel, tonnage));
        stockArmament[LEFT_ARM].add(new Internals(stockEndoSteel, tonnage));
        stockArmament[LEFT_ARM].add(new Internals(stockEndoSteel, tonnage));
        stockArmament[LEFT_ARM].add(new Internals(stockEndoSteel, tonnage));
        
        stockArmament[RIGHT_LEG].add(new Hip_Actuator());
        stockArmament[RIGHT_LEG].add(new Upper_Leg_Actuator());
        stockArmament[RIGHT_LEG].add(new Lower_Leg_Actuator());
        stockArmament[RIGHT_LEG].add(new Foot_Actuator());
        stockArmament[RIGHT_LEG].add(new Armor(stockFerroFibrous, this.getStockTotalArmor()));
        stockArmament[RIGHT_LEG].add(new Armor(stockFerroFibrous, this.getStockTotalArmor()));
        
        stockArmament[LEFT_LEG].add(new Hip_Actuator());
        stockArmament[LEFT_LEG].add(new Upper_Leg_Actuator());
        stockArmament[LEFT_LEG].add(new Lower_Leg_Actuator());
        stockArmament[LEFT_LEG].add(new Foot_Actuator());
        stockArmament[LEFT_LEG].add(new Armor(stockFerroFibrous, this.getStockTotalArmor()));
        stockArmament[LEFT_LEG].add(new Armor(stockFerroFibrous, this.getStockTotalArmor()));
    }
}
