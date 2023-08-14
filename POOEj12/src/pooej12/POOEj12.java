/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej12;

import Entidad.Persona;
import Servicio.ServicioPersona;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class POOEj12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioPersona sp = new ServicioPersona();
        Persona persona = sp.newPersona();
        int edad1 = sp.calcularEdad(persona.getFechaN());
        System.out.println("Ingrese una edad");
        int edad2= leer.nextInt();
        boolean res = sp.menorQue(edad2, edad1);
        
        if(res){
            System.out.println("El receptor tiene menor edad que la persona que se recibe como parámetro");
        }else{
            System.out.println("El receptor tiene mayor edad que la persona que se recibe como parámetro");
        }
        
        System.out.println("Se muestra el objeto persona con su nombre y fecha de nacimiento");
        sp.mostrarPersona(persona);
    }
    
}
