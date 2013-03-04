package MWOMechbay.Mechs;

/**
 *
 * @author Quicksilver
 */
public class Hunchback extends Mech implements MechCommon {
    public Hunchback() {
        super();
        tonnage = 50.0;
        mechName = "Hunchback";
        modules = 2;
        actuators = new boolean[][] {
            {true, true},
            {true, true}
        };
        
        limitsForPitchYaw = new int[][] {
            {120,16},
            {40,28}  };
        
        health = new int[]
        {   16,
            16,
            24,
            24,
            32,
            15,
            24,
            24   };
    }
}
