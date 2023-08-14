/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cafetera;

/**
 *
 * @author user
 */
public class CafeteraServicio {
    
    public Cafetera llenarCafetera(){
        
        Cafetera cafet = new Cafetera();
        cafet.setCapacidadActual(cafet.getCapacidadMax());
        
        
        return cafet;
   
    }
    
    public void servirTaza(Cafetera cafet, int tamañoTazaVacia){
       
        
        if(cafet.getCapacidadActual()<tamañoTazaVacia){
            int diferencia = tamañoTazaVacia - cafet.getCapacidadActual();
            System.out.println("No había suficiente café para llenar la taza");
            System.out.println("La taza se llenó con " + cafet.getCapacidadActual()+ " ml pero hicieron falta " + diferencia + " ml");
        
        
        }else{
            int diferencia = cafet.getCapacidadActual()-tamañoTazaVacia;
            System.out.println("Se llenó la taza");
            System.out.println("Cantidad sobrante en la cafetera " + diferencia + " ml");
            cafet.setCapacidadActual(diferencia);
        
        }   
    }
    
    public void vaciarCafetera(Cafetera cafet){
        cafet.setCapacidadActual(0);
        System.out.println("La cafetera está vacía");
    
    
    }
    
    public void agregarCafe(int cantidadCafe, Cafetera cafet){
        
            
//            cafet.setCapacidadActual(cafet.getCapacidadMax());
            int cantidad = cantidadCafe + cafet.getCapacidadActual();
            System.out.println("La cantidad de café ingresada es " + cantidadCafe);
            System.out.println("La cantidad total de café es igual a " + cantidad);
            cafet.setCapacidadActual(cantidad);
        
        
        }
       
    
}
