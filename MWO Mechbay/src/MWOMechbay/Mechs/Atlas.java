package MWOMechbay.Mechs;

/**
 *
 * @author Quicksilver
 */
public class Atlas extends Mech implements MechCommon {
    public Atlas() {
        super();
        tonnage = 100.0;
        mechName = "Atlas";
        modules = 2;
        stockEngineRating = 300;
        actuators = new boolean[][] {
            {true, true},
            {true, true}
        };
        
        limitsForPitchYaw = new int[][] {
            {80,16},
            {40,30}  };
        
        health = new int[] {
            34,
            34,
            42,
            42,
            62,
            15,
            42,
            42   };
    }
}
