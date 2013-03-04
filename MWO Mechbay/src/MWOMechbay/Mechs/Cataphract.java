package MWOMechbay.Mechs;

/**
 *
 * @author Quicksilver
 */
public class Cataphract extends Mech implements MechCommon {
    public Cataphract() {
        super();
        tonnage = 70.0;
        mechName = "Cataphract";
        maxJumpJets = 4;
        actuators = new boolean[][] {
            {true, true},
            {false, true}
        };
        
        limitsForPitchYaw = new int[][] {
            {90,20},
            {20,30}  };
        
        health = new int[]
        {   22,
            22,
            30,
            30,
            44,
            15,
            30,
            30   };
    }
}
