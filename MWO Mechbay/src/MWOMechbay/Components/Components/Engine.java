/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MWOMechbay.Components.Components;

import MWOMechbay.Components.Component;
import java.io.Serializable;

/**
 *
 * @author Nemesis
 */
public class Engine extends Component implements Serializable 
{
    private int numberOfSections;
    private int engineRating;
    // <editor-fold defaultstate="collapsed" desc="Standard Engine Table">
    static final double[][] StdEngineTable = {
                {5,-5.5},
                {10,-5.5},
                {15,-5.5},
                {20,-5.5},
                {25,-4.5},
                {30,-4},
                {35,-4},
                {40,-4},
                {45,-4},
                {50,-2.5},
                {55,-2.5},
                {60,-2.5},
                {65,-2},
                {70,-2},
                {75,-1},
                {80,-0.5},
                {85,-0.5},
                {90,0},
                {95,0},
                {100,1},
                {105,2.5},
                {110,2.5},
                {115,3},
                {120,3},
                {125,4},
                {130,4.5},
                {135,4.5},
                {140,5},
                {145,5},
                {150,6.5},
                {155,6.5},
                {160,7},
                {165,7},
                {170,7},
                {175,9},
                {180,9},
                {185,9.5},
                {190,9.5},
                {195,10},
                {200,11.5},
                {205,12.5},
                {210,13},
                {215,13.5},
                {220,14},
                {225,15},
                {230,15.5},
                {235,16},
                {240,16.5},
                {245,17},
                {250,18.5},
                {255,19},
                {260,19.5},
                {265,20},
                {270,20.5},
                {275,21.5},
                {280,22},
                {285,22.5},
                {290,23.5},
                {295,24},
                {300,25},
                {305,26.5},
                {310,27.5},
                {315,28.5},
                {320,29.5},
                {325,30.5},
                {330,31.5},
                {335,32.5},
                {340,34},
                {345,35.5},
                {350,36.5},
                {355,38.5},
                {360,40},
                {365,41.5},
                {370,43.5},
                {375,45.5},
                {380,48},
                {385,50.5},
                {390,53},
                {395,56},
                {400,59.5}  };
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="XL Engine">
    static final double[][] XLEngineTable = {
                {5,-5.5},
                {10,-5.5},
                {15,-5.5},
                {20,-5.5},
                {25,-4.5},
                {30,-4.5},
                {35,-4.5},
                {40,-4.5},
                {45,-4.5},
                {50,-3},
                {55,-3},
                {60,-3},
                {65,-3},
                {70,-3},
                {75,-2},
                {80,-1.5},
                {85,-1.5},
                {90,-1.5},
                {95,-1.5},
                {100,0.5},
                {105,1},
                {110,1},
                {115,1},
                {120,1},
                {125,2},
                {130,2.5},
                {135,2.5},
                {140,2.5},
                {145,2.5},
                {150,4},
                {155,4},
                {160,4},
                {165,4},
                {170,4},
                {175,5.5},
                {180,5.5},
                {185,6},
                {190,6},
                {195,6},
                {200,7.5},
                {205,8.5},
                {210,8.5},
                {215,9},
                {220,9},
                {225,10},
                {230,10.5},
                {235,10.5},
                {240,11},
                {245,11},
                {250,12.5},
                {255,12.5},
                {260,13},
                {265,13},
                {270,13.5},
                {275,14},
                {280,14},
                {285,14.5},
                {290,15},
                {295,15},
                {300,15.5},
                {305,17},
                {310,17.5},
                {315,18},
                {320,18.5},
                {325,19},
                {330,19.5},
                {335,20},
                {340,20.5},
                {345,21.5},
                {350,22},
                {355,23},
                {360,23.5},
                {365,24.5},
                {370,25.5},
                {375,27.5},
                {380,27.5},
                {385,29},
                {390,30},
                {395,31.5},
                {400,33.5}  };
    // </editor-fold>
    
    public Engine(boolean engineFlag, int nRating) {
        super();
        itemType = ENGINE_ITEM_TYPE;
        engineRating = nRating;
        criticals = 3;
        
        if (engineFlag) {
            equipmentName = "XL Engine";
            fullName = "Extra Light Fusion Engine";
            tonnage = XLEngineTable[(engineRating - 5) / 5][1];
            double temp;
            temp = ((engineRating) * 16333 ) + ((engineRating * 2) / 3);
            if (engineRating < 250) {
                temp -= ((10 - (engineRating / 25)) * (500.0 / 6.0));
                cost = (int)Math.round(temp);
            }
            else
                cost = (int)Math.round(temp);
            
            numberOfSections = 4;
        }
        else {
            equipmentName = "Fusion Engine";
            fullName = "Standard Fusion Engine";
            tonnage = StdEngineTable[(engineRating - 5) / 5][1];
            double temp;
            temp = (engineRating * 6133 ) + (engineRating / 3);
            if (engineRating < 250) {
                temp -= ((10 - (engineRating / 25)) * (200.0 / 6.0));
                cost = (int)Math.round(temp);
            }
            else
                cost = (int)Math.round(temp);
            
            numberOfSections = 2;
        }
    }
    
    public int getNumberOfSections() {
        return numberOfSections;
    }
    
    public int getEngineRating() {
        return engineRating;
    }
    
    public int getNumberOfEngineHeatSinks() {
        return (engineRating / 25);
    }
}
