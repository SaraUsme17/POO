/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej6;

import Entidad.Cafetera;
import Servicio.CafeteraServicio;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class POOEj6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        CafeteraServicio cs = new CafeteraServicio();
        Cafetera cafet = cs.llenarCafetera();
        opc(cs,cafet);

        



        
    }
    
     public static void opc(CafeteraServicio cs, Cafetera cafet){
         
         Scanner leer = new Scanner(System.in);
         int opcion;


         do {
             System.out.println("Menú de opciones \n"
                     + "1. Llenar Cafetera \n"
                     + "2. Servir Taza \n"
                     + "3. Vaciar Cafetera \n"
                     + "4. Agregar Café \n"
                     + "5. Salir");
         System.out.println("Seleccione una opción");
         opcion = leer.nextInt();


             switch (opcion) {
                 case 1:

                     break;
                 case 2:
                     System.out.println("Ingrese la cantidad de la taza");
                     int tamañoTazaVacia = leer.nextInt();
                     cs.servirTaza(cafet, tamañoTazaVacia);
                     break;
                 case 3:
                     cs.vaciarCafetera(cafet);
                     break;
                 case 4:
                     System.out.println("Ingrese la cantidad de café que desea adicionar en la cafetera");
                     int cantidadCafe = leer.nextInt();
                     cs.agregarCafe(cantidadCafe, cafet);
                     break;
                 default:
                     System.out.println("Opción incorrecta");

             }

         } while (opcion < 5);
     }
}

