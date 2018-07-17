/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jhospital;

import jhospital.view.TelaPrincipal;

/**
 *
 * @author Rebecca
 */
public class jHospital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        telaPrincipal.validate();
        telaPrincipal.pack();
        telaPrincipal.setVisible(true);
        
        
     
    }
    
}
