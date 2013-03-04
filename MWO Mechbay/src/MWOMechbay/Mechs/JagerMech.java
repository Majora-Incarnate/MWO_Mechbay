package MWOMechbay.Mechs;

/**
 *
 * @author Quicksilver
 */
public class JagerMech extends Mech implements MechCommon {
    public JagerMech() {
        super();
        tonnage = 65.0;
        mechName = "JagerMech";
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
