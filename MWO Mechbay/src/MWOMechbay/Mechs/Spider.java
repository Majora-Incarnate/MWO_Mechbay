package MWOMechbay.Mechs;

/**
 *
 * @author Quicksilver
 */
public class Spider extends Mech implements MechCommon {
    public Spider() {
        super();
        tonnage = 30.0;
        mechName = "Spider";
        actuators = new boolean[][] {
            {true, true},
            {true, true}
        };
        
        limitsForPitchYaw = new int[][] {
            {110,20},
            {40,30}  };
        
        health = new int[]
        {   10,
            10,
            14,
            14,
            20,
            15,
            14,
            14   };
    }
}
