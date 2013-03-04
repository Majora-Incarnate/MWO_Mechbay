/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MWOMechbay;

import MWOMechbay.GUI.DropCalculatorForm;

/**
 *
 * @author Quicksilver
 */
public class DropCalcMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new DropCalculatorForm(null).setVisible(true);
            }
        });
    }
}
