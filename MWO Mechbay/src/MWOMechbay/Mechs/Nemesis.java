package MWOMechbay.Mechs;

/**
 *
 * @author Quicksilver
 */
public class Nemesis extends Mech implements MechCommon {
    public Nemesis() {
        super();
        tonnage = 55.0;
        mechName = "Nemesis";
        modules = 0;
        baseCost = 0;
        stockDoubleHeatSinks = true;
        stockEndoSteel = true;
        stockXLEngine = true;
        jumpJetCapable = true;
        stockArtemisIV = true;
        stockEngineRating = 275;
        maxJumpJets = 5;
        iconPath = "/MWOMechbay/Resources/Default_Medium.gif";
        unreleased = true;
        unconfirmed = true;
        actuators = new boolean[][] {
            {false, false},
            {false, false}
        };
        
        limitsForPitchYaw = new int[][] {
            {120,20},
            {0,30}  };
        
        health = new int[]
        {   18,
            18,
            26,
            26,
            36,
            15,
            26,
            26   };
        
        stockArmor = new int[]
        {   36,
            36,
            36,
            36,
            52,
            18,
            52,
            52,
            16,
            16,
            18};
    }
}
