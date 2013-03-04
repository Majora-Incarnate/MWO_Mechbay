package MWOMechbay.Mechs;

/**
 *
 * @author Quicksilver
 */
public class Highlander extends Mech implements MechCommon {
    public Highlander() {
        super();
        tonnage = 90.0;
        mechName = "Highlander";
        unreleased = true;
        unconfirmed = true;
        maxJumpJets = 3;
        actuators = new boolean[][] {
            {true, true},
            {false, true}
        };
        
        limitsForPitchYaw = new int[][] {
            {90,20},
            {40,30}  };
        
        health = new int[]
        {   30,
            30,
            38,
            38,
            58,
            15,
            38,
            38   };
    }
}
