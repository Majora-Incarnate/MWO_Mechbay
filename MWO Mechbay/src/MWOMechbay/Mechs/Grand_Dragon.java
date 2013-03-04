package MWOMechbay.Mechs;

/**
 *
 * @author Quicksilver
 */
public class Grand_Dragon extends Mech implements MechCommon {
    public Grand_Dragon() {
        super();
        tonnage = 60.0;
        mechName = "Grand Dragon";
        unreleased = true;
        unconfirmed = true;
        actuators = new boolean[][] {
            {true, true},
            {false, true}
        };
        
        limitsForPitchYaw = new int[][] {
            {90,20},
            {40,30}  };
        
        health = new int[]
        {   20,
            20,
            28,
            28,
            40,
            15,
            28,
            28   };
    }
}
