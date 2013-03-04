package MWOMechbay.Mechs;

/**
 *
 * @author Quicksilver
 */
public class Orion extends Mech implements MechCommon {
    public Orion() {
        tonnage = 75.0;
        mechName = "Orion";
        modules = 2;
        stockEngineRating = 300;
        unreleased = true;
        unconfirmed = true;
        actuators = new boolean[][] {
            {true, true},
            {false, false}
        };
        
        limitsForPitchYaw = new int[][] {
            {90,20},
            {40,30}  };
        
        health = new int[]
        {   24,
            24,
            36,
            36,
            46,
            15,
            36,
            36   };
    }
}
