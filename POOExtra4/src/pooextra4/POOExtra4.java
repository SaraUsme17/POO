/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooextra4;

import Entidad.NIF;
import Servicio.ServicioNIF;

/**
 *
 * @author user
 */
public class POOExtra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServicioNIF sn = new ServicioNIF();
        long dni = sn.crearNif();
        char letra = sn.calcular(dni);
        sn.mostrar(dni, letra);

        
    }
    
}
