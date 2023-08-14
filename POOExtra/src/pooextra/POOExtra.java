/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooextra;

import Entidad.Alquiler;
import Entidad.Pelicula;
import Servicio.ServicioAlquiler;
import Servicio.ServicioPelicula;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class POOExtra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioPelicula sp = new ServicioPelicula();
        Pelicula [] pelicula = new Pelicula[2];
        ServicioAlquiler sa = new ServicioAlquiler();
        Alquiler [] alquiler = new Alquiler[2];
        
        menu();
        int opc = leer.nextInt();
        opciones(opc, sp, sa, pelicula, alquiler);
        
        
    }
    
    public static void menu() {
    System.out.println("1. Crear Película\n"
                + "2. Crear Alquiler\n"
                + "3. Listar todas las películas disponibles\n"
                + "4. Listar todas los alquileres\n"
                + "5. Buscar una película por título\n"
                + "6. Buscar una película por género\n"
                + "7. Buscar un alquiler por fecha\n"
                + "8. Calcular el ingreso total del servicion\n"
                + "9. Salir");
        System.out.print("Seleccione una opción: ");

    }
    
    
    public static void opciones(int opc, ServicioPelicula sp, ServicioAlquiler sa, Pelicula[] pelicula, Alquiler[] alquiler) {

        Scanner leer = new Scanner(System.in);

        int i = 0, j = 0;

        while (opc != 9) {
            switch (opc) {
                case 1:
                    pelicula[i] = sp.crearPelicula();
                    i++;
                    break;
                case 2:
                    alquiler[i] = sa.crearAlquiler();
                    j++;
                    break;
                case 3:
                    sp.listarPeliculas(pelicula);
                    break;
                case 4:
                    sa.listarAlq(alquiler);
                    break;
                case 5:
                    sp.buscarPeliculaT(pelicula);
                    break;
                case 6:
                    sp.buscarPeliculaG(pelicula);
                    break;
                case 7:
                    sa.buscarAlq(alquiler);
                    break;
                case 8:
                    sa.total(alquiler);
                    break;
                case 9:
                    break;
                default:
                    System.out.println("\nOpción no válida. Por favor, escriba una opción de selección válida.");
                    break;
            }

            menu();
            opc = leer.nextInt();
        }
    }
    
}
