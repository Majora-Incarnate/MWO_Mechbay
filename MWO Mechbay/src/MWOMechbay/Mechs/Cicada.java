package MWOMechbay.Mechs;

/**
 *
 * @author Quicksilver
 */
public class Cicada extends Mech implements MechCommon {
    public Cicada() {
        super();
        tonnage = 40.0;
        mechName = "Cicada";
        modules = 2;
        actuators = new boolean[][] {
            {false, false},
            {false, false}
        };
        
        limitsForPitchYaw = new int[][] {
            {120,20},
            {0,30}  };
        
        health = new int[]
        {   12,
            12,
            20,
            20,
            24,
            15,
            20,
            20   };
    }
}
