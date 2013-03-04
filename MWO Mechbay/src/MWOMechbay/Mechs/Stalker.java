package MWOMechbay.Mechs;

/**
 *
 * @author Quicksilver
 */
public class Stalker extends Mech implements MechCommon {
    public Stalker() {
        super();
        tonnage = 85.0;
        mechName = "Stalker";
        modules = 1;
        stockEngineRating = 255;
        actuators = new boolean[][] {
            {false, false},
            {false, false}
        };
        
        limitsForPitchYaw = new int[][] {
            {60,20},
            {0,30}  };
        
        health = new int[]
        {   28,
            28,
            36,
            36,
            54,
            15,
            36,
            36   };
    }
    
    public int getMinEngineRating() {
        return 100;
    }
}
