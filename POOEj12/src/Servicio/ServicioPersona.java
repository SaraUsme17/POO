/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ServicioPersona {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona newPersona(){
        
        Persona persona = new Persona();
        System.out.println("Ingrese el nombre");
        persona.setNombre(leer.next());
        System.out.println("Ingrese la fecha de nacimiento (formato: dd/MM/yyyy)");
        System.out.println("Ingrese el día");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año");
        int anio = leer.nextInt();
         
        Date fechaN = new Date(anio-1900,mes-1,dia);
        persona.setFechaN(fechaN);
 
        return persona;

    }
    
    public int calcularEdad(Date fechaN){
        Date fechaA = new Date();
        int p1 = fechaN.getYear()+1900;
        int p2 = fechaA.getYear()+1900;
        int anios = p2-p1;
        
        System.out.println("Fecha ingresada:" + fechaN);
        System.out.println("Fecha actual:" + fechaA);
        System.out.println("La edad de la persona es " + anios + " años");
        
        return anios;
    
    }
    
    public boolean menorQue(int edad, int anios){
        boolean result = false;
        
        if(anios<edad){
            result = true;
        
        }
        
        return result;

    }
    
    public void mostrarPersona(Persona persona){
        System.out.println(persona);
    
    }
}
