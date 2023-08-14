/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej1;

import Entidad.Libro;
import Servicio.LibroServicio;

/**
 *
 * @author user
 */
public class POOEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Se crea o instancia un objeto de tipo servicio 
        LibroServicio bs = new LibroServicio();
        
        //se instancia el objeto con los métodos cargados
        //objeto que retorna la función con todos los métodos cargados
        Libro book = bs.cargarLibro();
        System.out.println(book);
    }
    
}
