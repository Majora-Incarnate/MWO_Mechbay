package MWOMechbay.Mechs;

/**
 *
 * @author Quicksilver
 */
public class Raven extends Mech implements MechCommon {
    public Raven() {
        super();
        tonnage = 35.0;
        mechName = "Raven";
        modules = 2;
        maxJumpJets = 5;
        actuators = new boolean[][] {
            {false, false},
            {false, false}
        };
        
        limitsForPitchYaw = new int[][] {
            {120,20},
            {0,30}  };
        
        health = new int[]
        {   12,
            12,
            16,
            16,
            22,
            15,
            16,
            16   };
    }
}
