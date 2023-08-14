/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej01;

import Entidad.Persona;

/**
 *
 * @author user
 */
public class POOEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Crear una instancia de persona
        Persona p1 = new Persona("Sara", "Usme", 1);
        p1.setNombre("Daniela");
        p1.setApellido("Sepúlveda");
        p1.setId(20);
        
//        System.out.println(p1.nombre + " " +  p1.apellido + " " +  p1.id);
//        System.out.println(p1);
//        Lammar al método para mostrar los atributos de una persona 
        mostrarAtributos(p1);
        
    }
        //método que muestra los atributos de una persona
        /**
         * 
         * @param p1 
         */

        public static void mostrarAtributos(Persona p1){
            
        // Utilizar los métodos "get" para obtener los atributos
//        String nombre = p1.getNombre();
//        int id = p1.getId();
        
        System.out.println(p1);
        
        
        }
    
}
