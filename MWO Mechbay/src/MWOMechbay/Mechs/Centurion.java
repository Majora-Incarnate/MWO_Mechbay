package MWOMechbay.Mechs;

/**
 *
 * @author Quicksilver
 */
public class Centurion extends Mech implements MechCommon {
    public Centurion() {
        super();
        tonnage = 50.0;
        mechName = "Centurion";
        modules = 2;
        actuators = new boolean[][] {
            {true, true},
            {false, true}
        };
        
        limitsForPitchYaw = new int[][] {
            {90,20},
            {35,30}  };
        
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
