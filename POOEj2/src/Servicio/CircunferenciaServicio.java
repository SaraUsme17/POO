/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class CircunferenciaServicio {
    
    Scanner leer = new Scanner(System.in);
    
    public Circunferencia crearCircunferencia(){
        
        System.out.println("Ingrese el radio de la circunferencia");
        double radio = leer.nextDouble(); //Se guarda en el atributo del objeto el radio ingresado
        
        Circunferencia circle = new Circunferencia(radio);
        
        
        return circle;
    
    
    }
    
    public void area(Circunferencia circle){
    
        double area = (Math.PI)*Math.pow(circle.getRadio(),2);
        System.out.println("El área del círculo es " + area);
    
    }
    
    public void perimetro(Circunferencia circle){
    
        double perimetro = 2*(Math.PI)*circle.getRadio();
        System.out.println("El área del círculo es " + perimetro);
    
    }
    
    

    
}
