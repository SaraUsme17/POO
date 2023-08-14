/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej2;

import Entidad.Circunferencia;
import Servicio.CircunferenciaServicio;

/**
 *
 * @author user
 */
public class POOEj2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CircunferenciaServicio cs = new CircunferenciaServicio();
        Circunferencia circle = cs.crearCircunferencia();
        cs.area(circle);
        cs.perimetro(circle);
        
        System.out.println(circle);
    }
    
}
