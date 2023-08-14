/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Alquiler;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ServicioAlquiler {
    
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
    public Alquiler crearAlquiler(){
        
        Alquiler alquiler = new Alquiler();
        System.out.println("Ingrese el título de la película alquilada");
        alquiler.setPeliculaAlq(leer.next());
        System.out.println("Ingrese la fecha de inicio");
        leer.nextLine();
        alquiler.setFechaI(new Date(leer.nextLine()));
        System.out.println("Ingrese la fecha de fin");
        alquiler.setFechaF(new Date(leer.nextLine()));
        System.out.println("Ingrese el precio");
        alquiler.setPrecio(leer.nextDouble());
        leer.nextLine();
        
        
        return alquiler;
    
    
    }
    
    public void listarAlq(Alquiler [] alquiler){
    
        for (int i = 0; i < alquiler.length; i++) {
        System.out.println((i+1)+ " - " + alquiler[i].getPeliculaAlq());
            
        }
    
    }
    
    public void buscarAlq(Alquiler [] alquiler){
        
        
        System.out.println("Ingrese la fecha del alquiler que desea buscar");
        Date fecha = new Date(leer.nextLine());
        
        for (int i = 0; i < alquiler.length; i++) {
            if(alquiler[i].getFechaI().equals(fecha) || alquiler[i].getFechaF().equals(fecha)){
                System.out.println("El alquiler existe");
                System.out.println("Fecha alquiler" + fecha);
            
            }else{
                System.out.println("El alquiler no existe");
            
            }
            
    }
        
    }

    public double total(Alquiler [] alquiler){
        double ganancia=0;
        for (int i = 0; i < alquiler.length; i++) {
            ganancia += alquiler[i].getPrecio();
        }
            return ganancia;
    
    
    }
}