package MWOMechbay.Mechs;

/**
 *
 * @author Quicksilver
 */
public class Trebuchet extends Mech implements MechCommon {
    public Trebuchet() {
        super();
        tonnage = 50.0;
        mechName = "Trebuchet";
        actuators = new boolean[][] {
            {true, true},
            {false, true}
        };
        
        limitsForPitchYaw = new int[][] {
            {90,25},
            {40,15}  };
        
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
