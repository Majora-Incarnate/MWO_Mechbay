package MWOMechbay.Mechs;

import MWOMechbay.Components.Weapons.SRM6;
import MWOMechbay.Components.Weapons.Gauss_Rifle;
import MWOMechbay.Components.Weapons.LRM20;
import MWOMechbay.Components.Weapons.Medium_Laser;
import MWOMechbay.Components.OtherEquipment.Heat_Sink;
import MWOMechbay.Components.OtherEquipment.Armor;
import MWOMechbay.Components.SpecialEquipment.Jump_Jet;
import MWOMechbay.Components.Components.Upper_Leg_Actuator;
import MWOMechbay.Components.Components.Sensors;
import MWOMechbay.Components.Components.Life_Support;
import MWOMechbay.Components.Components.Cockpit;
import MWOMechbay.Components.Components.Shoulder_Actuator;
import MWOMechbay.Components.Components.CASE;
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
import MWOMechbay.Components.Ammo.Gauss_Ammo;
import java.util.Vector;

/**
 *
 * @author Nemesis
 */
public class HGN_732 extends Highlander implements MechCommon {
    public HGN_732() {
        super();
        modelName = "HGN-732";
        baseCost = 0;
        modules = 1;
        stockDoubleHeatSinks = false;
        stockEndoSteel = false;
        stockFerroFibrous = true;
        stockXLEngine = false;
        jumpJetCapable = true;
        stockEngineRating = 270;
        stockExtraHeatSinks = 2;
        iconPath = "/MWOMechbay/Resources/Default_Assault.gif";
        //iconPath = "/MWOMechbay/Resources/HGN-732.gif";
        
        hardpoints = new int[][]
        {   {2,0,0,0},
            {0,0,2,0},
            {0,3,0,0},
            {0,0,2,0},
            {0,0,0,0},
            {0,0,0,0},
            {0,0,0,0},
            {0,0,0,0}   };
        
        stockArmor = new int[]
        {   60,
            60,
            56,
            56,
            80,
            18,
            76,
            76,
            20,
            20,
            32};
        
        stockArmament[HEAD].add(new Life_Support());
        stockArmament[HEAD].add(new Sensors());
        stockArmament[HEAD].add(new Cockpit(false));
        
        stockArmament[CENTER_TORSO].add(new Engine(stockXLEngine, stockEngineRating));
        stockArmament[CENTER_TORSO].add(new Gyro());
        stockArmament[CENTER_TORSO].add(new Engine(stockXLEngine, stockEngineRating));
        stockArmament[CENTER_TORSO].add(new Jump_Jet(tonnage));
        
        stockArmament[RIGHT_TORSO].add(new Jump_Jet(tonnage));
        stockArmament[RIGHT_TORSO].add(new Medium_Laser());
        stockArmament[RIGHT_TORSO].add(new Medium_Laser());
        stockArmament[RIGHT_TORSO].add(new Gauss_Ammo());
        stockArmament[RIGHT_TORSO].add(new Gauss_Ammo());
        stockArmament[RIGHT_TORSO].add(new CASE());
        stockArmament[RIGHT_TORSO].add(new Armor(stockFerroFibrous, this.getStockTotalArmor()));
        stockArmament[RIGHT_TORSO].add(new Armor(stockFerroFibrous, this.getStockTotalArmor()));
        stockArmament[RIGHT_TORSO].add(new Armor(stockFerroFibrous, this.getStockTotalArmor()));
        stockArmament[RIGHT_TORSO].add(new Armor(stockFerroFibrous, this.getStockTotalArmor()));
        stockArmament[RIGHT_TORSO].add(new Armor(stockFerroFibrous, this.getStockTotalArmor()));
        
        stockArmament[LEFT_TORSO].add(new Jump_Jet(tonnage));
        stockArmament[LEFT_TORSO].add(new LRM20(stockArtemisIV));
        stockArmament[LEFT_TORSO].add(new LRM_Ammo(stockArtemisIV));
        stockArmament[LEFT_TORSO].add(new LRM_Ammo(stockArtemisIV));
        stockArmament[LEFT_TORSO].add(new SRM_Ammo(stockArtemisIV));
        stockArmament[LEFT_TORSO].add(new SRM_Ammo(stockArtemisIV));
        stockArmament[LEFT_TORSO].add(new CASE());
        stockArmament[LEFT_TORSO].add(new Armor(stockFerroFibrous, this.getStockTotalArmor()));
        
        stockArmament[RIGHT_ARM].add(new Shoulder_Actuator());
        stockArmament[RIGHT_ARM].add(new Upper_Arm_Actuator());
        stockArmament[RIGHT_ARM].add(new Lower_Arm_Actuator());
        stockArmament[RIGHT_ARM].add(new Gauss_Rifle());
        stockArmament[RIGHT_ARM].add(new Armor(stockFerroFibrous, this.getStockTotalArmor()));
        stockArmament[RIGHT_ARM].add(new Armor(stockFerroFibrous, this.getStockTotalArmor()));
        
        stockArmament[LEFT_ARM].add(new Shoulder_Actuator());
        stockArmament[LEFT_ARM].add(new Upper_Arm_Actuator());
        stockArmament[LEFT_ARM].add(new Lower_Arm_Actuator());
        stockArmament[LEFT_ARM].add(new Hand_Actuator());
        stockArmament[LEFT_ARM].add(new SRM6(stockArtemisIV));
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
