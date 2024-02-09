/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cliente;
import Entidad.Rutina;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ServicioRutina {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList <Rutina> listaR = new ArrayList <>();
    
    public Rutina crearObjeto(){
        
        Rutina rutina = new Rutina();
        System.out.println("Ingrese el número de cédula");
        rutina.setId(leer.nextInt());
        System.out.println("Ingrese el nombre");
        rutina.setNombre(leer.next());
        System.out.println("Ingrese la duracion");
        rutina.setDuracion(leer.nextInt());
        System.out.println("Ingrese el nivel de dificultad");
        rutina.setNivelDificultad(leer.next());
        System.out.println("Ingrese la descripción");
        rutina.setDescripcion(leer.next());
        
        return rutina;
    
    }
    
    public void crearRutina(Rutina rutina){
        
        listaR.add(rutina);
    
    }
    
    public void obtenerRutinas(){
        
        System.out.println("Las rutinas ingresadas son");
        for(Rutina rut: listaR){
            System.out.println(rut.toString());
        
        }
    
    }
    
     public void actualizarRutina(int id, String nombre, int duracion, String nivelDificultad, String descripcion){
        
        for (Rutina rut : listaR) {

            if (rut.getId() == id) {
                
//                rut.setId(id);
                rut.setNombre(nombre);
                rut.setDuracion(duracion);
                rut.setNivelDificultad(nivelDificultad);
                rut.setDescripcion(descripcion);


            }else{
                System.out.println("El usuario no ha sido encontrado");
                
            }

        }
        
    
     }
     
      public void eliminarRutina(int id){
        
         boolean eliminado =  listaR.removeIf(rut -> rut.getId()== id);
         if(eliminado){
            System.out.println("La rutina ha sido eliminada");
         }else{
             System.out.println("El usuario no ha sido encontrado");
         }


    }
}
