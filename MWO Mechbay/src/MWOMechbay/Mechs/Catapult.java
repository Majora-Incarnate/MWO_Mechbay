package MWOMechbay.Mechs;

/**
 *
 * @author Quicksilver
 */
public class Catapult extends Mech implements MechCommon {
    public Catapult() {
        super();
        tonnage = 65.0;
        mechName = "Catapult";
        modules = 2;
        maxJumpJets = 4;
        actuators = new boolean[][] {
            {false, false},
            {false, false}
        };
        
        limitsForPitchYaw = new int[][] {
            {140,16},
            {0,45}  };
        
        health = new int[]
        {   20,
            20,
            30,
            30,
            42,
            15,
            30,
            30   };
    }
}
