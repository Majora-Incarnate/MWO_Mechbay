package MWOMechbay.Mechs;

/**
 *
 * @author Quicksilver
 */
public class Blackjack extends Mech implements MechCommon {
    public Blackjack() {
        super();
        tonnage = 45.0;
        mechName = "Blackjack";
        unreleased = true;
        unconfirmed = true;
        maxJumpJets = 4;
        actuators = new boolean[][] {
            {false, false},
            {false, false}
        };
        
        limitsForPitchYaw = new int[][] {
            {120,20},
            {0,30}  };
        
        health = new int[]
        {   14,
            14,
            22,
            22,
            28,
            15,
            22,
            22   };
    }
}
