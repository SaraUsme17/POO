/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gimnasio;

import Entidad.Rutina;
import Servicio.ServicioCliente;
import Servicio.ServicioRutina;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Gimnasio {

    /**
     * @param args the command line arguments
     */
    
    public static void menu() {
        System.out.println("");
        System.out.println("1. Registrar cliente\n"
                + "2. Obtener clientes\n"
                + "3. Actualizar cliente\n"
                + "4. Eliminar cliente\n"
                + "5. Crear rutina\n"
                + "6. Obtener rutinas\n"
                + "7. Actualizar rutinas\n"
                + "8. Eliminar rutinas\n"
                + "9. Salir");
        System.out.println("");
        System.out.print("Seleccione una opción: ");
        System.out.println("");
    }
        
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        ServicioCliente sc = new ServicioCliente();
        ServicioRutina sr = new ServicioRutina();


            int opc;
        do {
            menu();
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    sc.registrarCliente();
                    break;
                case 2:
                    sc.obtenerClientes();
                    break;
                case 3:

                    System.out.println("Ingrese el id");
                    int id = leer.nextInt();
                    sc.actualizarCliente(id);

                    break;

                case 4:
                    System.out.println("Ingrese el id del usuario que desea eliminar");
                    int ide = leer.nextInt();
                    sc.eliminarCliente(ide);
                    break;

                case 5:
                    Rutina rutina = sr.crearObjeto();
                    sr.crearRutina(rutina);
                    break;

                case 6:
                    sr.obtenerRutinas();
                    break;

                case 7:

                    System.out.println("Ingrese el id");
                    int idR = leer.nextInt();
                    System.out.println("Ingrese el nombre");
                    String nombreR = leer.next();
                    System.out.println("Ingrese la duración");
                    int duracion = leer.nextInt();
                    System.out.println("Ingrese el nivel de dificultad");
                    String nivelDificultad = leer.next();
                    System.out.println("Ingrese la descripción");
                    String descripcion = leer.next();
                    sr.actualizarRutina(idR, nombreR, duracion, nivelDificultad, descripcion);
                    break;

                case 8:
                    System.out.println("Ingrese el id de la rutina que desea eliminar");
                    int ideR = leer.nextInt();
                    sr.eliminarRutina(ideR);
                    break;

                case 9:
                    System.out.println("Saliendo del programa");
                    break;

                case 10:
                    System.out.println("Opción inválida");
                    break;

            }

        } while (opc != 9);
    }
} 
    


