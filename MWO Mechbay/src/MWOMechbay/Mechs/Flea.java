package MWOMechbay.Mechs;

/**
 *
 * @author Quicksilver
 */
public class Flea extends Mech implements MechCommon {
    public Flea() {
        tonnage = 20.0;
        mechName = "Flea";
        unreleased = true;
        unconfirmed = true;
        actuators = new boolean[][] {
            {false, false},
            {false, false}
        };
        
        limitsForPitchYaw = new int[][] {
            {90,20},
            {40,30}  };
        
        health = new int[]
        {   6,
            6,
            10,
            10,
            12,
            15,
            8,
            8   };
    }
}
