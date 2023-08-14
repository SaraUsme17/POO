/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class PersonaServicio {
    
    Scanner leer = new Scanner(System.in);
    
    public Persona crearPersona(){
        
        Persona nuevaPersona = new Persona();
        System.out.println("Ingrese el nombre");
        nuevaPersona.setNombre(leer.next());
        System.out.println("Ingrese la edad");
        nuevaPersona.setEdad(leer.nextInt());
        System.out.println("Ingrese el sexo");
        nuevaPersona.setSexo(leer.next());
        System.out.println("Ingrese el peso en Kg");
        nuevaPersona.setPeso(leer.nextDouble());
        System.out.println("Ingrese la estatura en metros");
        nuevaPersona.setEstatura(leer.nextDouble());
        
        
        return nuevaPersona;
      
    }
    
    public int calcularIMC(double peso, double altura){
        double pesoIdeal = peso/(Math.pow(altura, 2));
        if(pesoIdeal<20){
            return -1;
        }else if(pesoIdeal>=20 && pesoIdeal<=25)
            return 0;   
        else{
            return 1;
        }
    }
    
    public boolean esMayorDeEdad(int edad){
        boolean mayor = false;
        
        if(edad>=18){
            mayor = true;      
        }
        
        return mayor;
    
    }
}
