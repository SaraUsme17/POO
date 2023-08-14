/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej14;

import Entidad.Movil;
import Servicio.MovilServicio;

/**
 *
 * @author user
 */
public class POOEj14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MovilServicio ms = new MovilServicio();
        Movil cel = ms.cargarCelular();
        
        System.out.println("El objeto es");
        System.out.println(cel);
    }
    
}
