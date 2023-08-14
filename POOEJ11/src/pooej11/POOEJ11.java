/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej11;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class POOEJ11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el día");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año");
        int anio = leer.nextInt();
         
        Date fecha = new Date(anio-1900,mes-1,dia);
        Date fechaActual = new Date();
        
        int anio1 = fecha.getYear()+1900;
        int anio2 = fechaActual.getYear()+1900;
        
        int diferencia = anio2-anio1;
        
        System.out.println("La diferencia de años entre la fecha ingresada y la fecha actual es igual a " + diferencia);
    }
    
}
