package MWOMechbay.Mechs;

/**
 *
 * @author Quicksilver
 */
public class Awesome extends Mech implements MechCommon {
    public Awesome() {
        super();
        tonnage = 80.0;
        mechName = "Awesome";
        modules = 2;
        actuators = new boolean[][] {
            {true, true},
            {false, true}
        };
        
        limitsForPitchYaw = new int[][] {
            {100,20},
            {40,30}  };
        
        health = new int[]
        {   26,
            26,
            34,
            34,
            50,
            15,
            34,
            34   };
    }
}
