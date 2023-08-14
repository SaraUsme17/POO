/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooextra5;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class POOExtra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String [] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        String mesSecreto = meses[9];
        
        System.out.println("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas:");
        
        while(true){
        String mesadivinado = leer.nextLine();
        
            if (mesadivinado.equals(mesSecreto)) {
                System.out.println("Ha acertado");
                break;
                
            }else{
                System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes:");
            }
        
        }
        
        
    }
    
}
