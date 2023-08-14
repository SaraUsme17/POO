/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooextra2;

import Entidad.Puntos;
import Servicio.PuntosServicio;

/**
 *
 * @author user
 */
public class POOExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PuntosServicio ps = new PuntosServicio();
        Puntos coordenadas = ps.crearPuntos();
        ps.calcularDistancia(coordenadas);
    }
    
}
