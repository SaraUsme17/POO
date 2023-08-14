/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Pelicula;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ServicioPelicula {
    
    Scanner leer = new Scanner(System.in);
    public Pelicula crearPelicula(){
        
        Pelicula pelicula = new Pelicula();
        System.out.println("Ingrese el nombre de la película");
        pelicula.setTitulo(leer.next());
        System.out.println("Ingrese el género de la película");
        pelicula.setGenero(leer.next());
        System.out.println("Ingrese el año de la película");
        pelicula.setAnio(leer.nextInt());
        System.out.println("Ingrese la duración de la película en minutos");
        pelicula.setDuracion(leer.nextInt());

        return pelicula;
    
    }
    
    public void listarPeliculas(Pelicula [] pelicula){
        
        for (int i = 0; i < pelicula.length; i++) {
            System.out.println((i+1)+ " - " + pelicula[i].getTitulo());
            
        }
    
    }
    
    public void buscarPeliculaT(Pelicula [] pelicula){
        System.out.println("Ingrese el título de la película que desea buscar");
        String nombreP = leer.next();
        for (int i = 0; i < pelicula.length; i++) {
            if(nombreP.equalsIgnoreCase(pelicula[i].getTitulo())){
                System.out.println("La película existe");
            
            }else{
                System.out.println("La película no existe");
            
            }
            
        }
    
    }
    
    public void buscarPeliculaG(Pelicula [] pelicula){
        System.out.println("Ingrese el género de la película que desea buscar");
        String nombreG = leer.next();
        
        for (int i = 0; i < pelicula.length; i++) {
            if(nombreG.equalsIgnoreCase(pelicula[i].getGenero())){
                System.out.println("La película de ese género existe");
            
            }else{
                System.out.println("La película de ese género no existe");
            
            }
            
        }
    
    }
}
