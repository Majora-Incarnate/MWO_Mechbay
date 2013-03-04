package MWOMechbay.Mechs;

/**
 *
 * @author Quicksilver
 */
public class Commando extends Mech implements MechCommon {
    public Commando() {
        super();
        tonnage = 25.0;
        mechName = "Commando";
        modules = 2;
        actuators = new boolean[][] {
            {true, true},
            {true, true}
        };
        
        limitsForPitchYaw = new int[][] {
            {90,20},
            {40,30}  };
        
        health = new int[]
        {   8,
            8,
            12,
            12,
            16,
            15,
            12,
            12   };
    }
}
