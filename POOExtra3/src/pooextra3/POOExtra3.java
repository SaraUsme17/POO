/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooextra3;

import Entidad.Raices;
import Servicio.ServicioRaices;

/**
 *
 * @author user
 */
public class POOExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServicioRaices sr = new ServicioRaices();
        Raices valores = sr.crearValores();
        double discriminante = sr.getDiscriminante(valores);
        sr.calcular(valores, discriminante);
    }
    
}
