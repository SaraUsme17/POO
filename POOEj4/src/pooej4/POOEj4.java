/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej4;

import Entidad.Rectangulo;
import Servicio.RectanguloServicio;

/**
 *
 * @author user
 */
public class POOEj4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        RectanguloServicio rs = new RectanguloServicio();
        Rectangulo rec = rs.nuevoRectangulo();
        rs.Superficie(rec.getBase(), rec.getAltura());
        rs.perimetro(rec.getBase(), rec.getAltura());
        rs.dibujar(rec.getBase(), rec.getAltura());

    }
    
}
