package MWOMechbay.Mechs;

/**
 *
 * @author Quicksilver
 */
public class Dragon extends Mech implements MechCommon {
    public Dragon() {
        tonnage = 60.0;
        mechName = "Dragon";
        modules = 2;
        actuators = new boolean[][] {
            {true, true},
            {false, false}
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
