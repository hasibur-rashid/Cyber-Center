/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cybercenter;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Md. Hasibur Rashid
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        

        Splashscreen H = new Splashscreen();
        H.setVisible(true);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        //H.setVisible(false);
        H.dispose();
        new Login().setVisible(true);
       // new Sinup_window().setVisible(false);
        new Main_window().setVisible(false);
    }
}
