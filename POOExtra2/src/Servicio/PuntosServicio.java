/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Puntos;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class PuntosServicio {
    
    Scanner leer = new Scanner(System.in);
    
    public Puntos crearPuntos(){
        
        Puntos coordenadas = new Puntos();
        System.out.println("Ingrese la coordenadas x1 del punto 1");
        coordenadas.setX1(leer.nextInt());
         System.out.println("Ingrese la coordenadas y1 del punto 1");
        coordenadas.setY1(leer.nextInt());
        System.out.println("Ingrese la coordenadas x2 del punto 2");
        coordenadas.setX2(leer.nextInt());
         System.out.println("Ingrese la coordenadas y2 del punto 2");
        coordenadas.setY2(leer.nextInt());
        
        
        return coordenadas;
    
    }
    
    public void calcularDistancia(Puntos coordenadas){
        
        double distancia = Math.sqrt((Math.pow((coordenadas.getX2()-coordenadas.getX1()), 2)+Math.pow((coordenadas.getY2()-coordenadas.getY1()), 2)));
        System.out.println("La distancia de los 2 puntos es " + distancia);
    
    }
    
}
