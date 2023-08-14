/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej7;

import Entidad.Persona;
import Servicio.PersonaServicio;

/**
 *
 * @author user
 */
public class POOEj7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersonaServicio ps = new PersonaServicio();
        Persona [] personas = new Persona[4];
        personas[0] = ps.crearPersona();
        personas[1]  = ps.crearPersona();
        personas[2]  = ps.crearPersona();
        personas[3] = ps.crearPersona();
        double ideal=0; double noIdeal=0; double sobrepeso=0; double mayor=0; double menor=0;
        
        for (int i = 0; i < personas.length; i++) {
            System.out.println("Persona " + (i+1));
            int IMC =ps.calcularIMC(personas[i].getPeso(), personas[i].getEstatura());
            boolean mayorMenor = ps.esMayorDeEdad(personas[i].getEdad());
            
            if (IMC==-1){
                System.out.println("La persona " +(i+1) + " está por debajo de su peso ideal");
                noIdeal ++;
            }if(IMC==0){
                System.out.println("La persona " +(i+1) + " está en su peso ideal");
                ideal ++;
            }if(IMC==1){
            System.out.println("La persona " +(i+1) + " tiene sobrepeso");
                sobrepeso ++;
            
            }
            
            if(mayorMenor){
                System.out.println("La persona es mayor de edad");
                mayor ++;
            
            }else{
                System.out.println("La persona es menor de edad");
                menor ++;
            
            }
        }
        
        System.out.println("El " +((ideal/4)*100) + " % de personas está en su peso ideal");
        System.out.println("El " +((noIdeal/4)*100) + " % de personas no está en su peso ideal");
        System.out.println("El " +((sobrepeso/4)*100) + " % de personas está en sobrepeso");
        System.out.println("El " +((mayor/4)*100) + " % de personas son mayores de edad");
        System.out.println("El " +((menor/4)*100) + " % de personas son menores de edad");
    }
    
}
