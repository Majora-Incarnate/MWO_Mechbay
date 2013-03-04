package MWOMechbay.Mechs;

import MWOMechbay.Components.Weapons.Ultra_AC5;
import MWOMechbay.Components.Weapons.AC2;
import MWOMechbay.Components.Weapons.Medium_Pulse_Laser;
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
import MWOMechbay.Components.Ammo.Ultra_AC5_Ammo;
import MWOMechbay.Components.Ammo.AC2_Ammo;
import java.util.Vector;

/**
 *
 * @author Nemesis
 */
public class JM6_DD extends JagerMech implements MechCommon {
    public JM6_DD() {
        super();
        modelName = "JM6-DD";
        baseCost = 0;
        modules = 1;
        stockDoubleHeatSinks = false;
        stockEndoSteel = false;
        stockFerroFibrous = true;
        stockXLEngine = true;
        jumpJetCapable = false;
        stockEngineRating = 260;
        stockExtraHeatSinks = 0;
        iconPath = "/MWOMechbay/Resources/Default_Heavy.gif";
        //iconPath = "/MWOMechbay/Resources/JM6-DD.gif";
        
        hardpoints = new int[][]
        {   {3,0,0,0},
            {3,0,0,0},
            {0,1,0,0},
            {0,1,0,0},
            {0,0,0,0},
            {0,0,0,0},
            {0,0,0,0},
            {0,0,0,0}   };
        
        stockArmor = new int[]
        {   16,
            16,
            34,
            34,
            36,
            18,
            24,
            24,
            10,
            10,
            10};
        
        stockArmament[HEAD].add(new Life_Support());
        stockArmament[HEAD].add(new Sensors());
        stockArmament[HEAD].add(new Cockpit(false));
        
        stockArmament[CENTER_TORSO].add(new Engine(stockXLEngine, stockEngineRating));
        stockArmament[CENTER_TORSO].add(new Gyro());
        stockArmament[CENTER_TORSO].add(new Engine(stockXLEngine, stockEngineRating));
        
        stockArmament[RIGHT_TORSO].add(new Engine(stockXLEngine, stockEngineRating));
        stockArmament[RIGHT_TORSO].add(new Medium_Pulse_Laser());
        stockArmament[RIGHT_TORSO].add(new Ultra_AC5_Ammo());
        stockArmament[RIGHT_TORSO].add(new AC2_Ammo());
        stockArmament[RIGHT_TORSO].add(new CASE());
        stockArmament[RIGHT_TORSO].add(new Armor(stockFerroFibrous, this.getStockTotalArmor()));
        stockArmament[RIGHT_TORSO].add(new Armor(stockFerroFibrous, this.getStockTotalArmor()));
        stockArmament[RIGHT_TORSO].add(new Armor(stockFerroFibrous, this.getStockTotalArmor()));
        stockArmament[RIGHT_TORSO].add(new Armor(stockFerroFibrous, this.getStockTotalArmor()));
        
        stockArmament[LEFT_TORSO].add(new Engine(stockXLEngine, stockEngineRating));
        stockArmament[LEFT_TORSO].add(new Medium_Pulse_Laser());
        stockArmament[LEFT_TORSO].add(new Ultra_AC5_Ammo());
        stockArmament[LEFT_TORSO].add(new AC2_Ammo());
        stockArmament[LEFT_TORSO].add(new CASE());
        stockArmament[LEFT_TORSO].add(new Armor(stockFerroFibrous, this.getStockTotalArmor()));
        stockArmament[LEFT_TORSO].add(new Armor(stockFerroFibrous, this.getStockTotalArmor()));
        stockArmament[LEFT_TORSO].add(new Armor(stockFerroFibrous, this.getStockTotalArmor()));
        stockArmament[LEFT_TORSO].add(new Armor(stockFerroFibrous, this.getStockTotalArmor()));
        
        stockArmament[RIGHT_ARM].add(new Shoulder_Actuator());
        stockArmament[RIGHT_ARM].add(new Upper_Arm_Actuator());
        stockArmament[RIGHT_ARM].add(new Ultra_AC5());
        stockArmament[RIGHT_ARM].add(new AC2());
        stockArmament[RIGHT_ARM].add(new Armor(stockFerroFibrous, this.getStockTotalArmor()));
        stockArmament[RIGHT_ARM].add(new Armor(stockFerroFibrous, this.getStockTotalArmor()));
        stockArmament[RIGHT_ARM].add(new Armor(stockFerroFibrous, this.getStockTotalArmor()));
        
        stockArmament[LEFT_ARM].add(new Shoulder_Actuator());
        stockArmament[LEFT_ARM].add(new Upper_Arm_Actuator());
        stockArmament[LEFT_ARM].add(new Ultra_AC5());
        stockArmament[LEFT_ARM].add(new AC2());
        stockArmament[LEFT_ARM].add(new Armor(stockFerroFibrous, this.getStockTotalArmor()));
        stockArmament[LEFT_ARM].add(new Armor(stockFerroFibrous, this.getStockTotalArmor()));
        stockArmament[LEFT_ARM].add(new Armor(stockFerroFibrous, this.getStockTotalArmor()));
        
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
