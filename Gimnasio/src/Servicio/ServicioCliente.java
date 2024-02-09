/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cliente;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ServicioCliente {
    
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
     ArrayList <Cliente> lista = new ArrayList <>();
    
    public void registrarCliente(){
        
        Cliente cliente = new Cliente();
        
        System.out.println("Ingrese el número de cédula");
        cliente.setId(leer.nextInt());
        System.out.println("Ingrese el nombre");
        cliente.setNombre(leer.next());
        System.out.println("Ingrese la edad");
        cliente.setEdad(leer.nextInt());
        System.out.println("Ingrese la altura en metros");
        cliente.setAltura(leer.nextDouble());
        System.out.println("Ingrese el peso en Kg");
        cliente.setPeso(leer.nextDouble());
        System.out.println("Ingrese el objetivo");
        cliente.setObjetivo(leer.next()); 
        
        lista.add(cliente);
        
        System.out.println("");
        System.out.println("Cliente añadido con éxito");
        System.out.println("");
    
    }
    
//    public ArrayList<Cliente> obtenerClientes(ArrayList<Cliente> lista){
//        
//         return null;
//    
//    
//    }
    
    public void obtenerClientes(){
        
        System.out.println("");
        System.out.println("Los clientes ingresados son");
        
        for(Cliente cli: lista){

            System.out.println(cli.toString());
        
        }
    
    }
    
    public void actualizarCliente(int id){
        
        for (Cliente cli : lista) {

            if (cli.getId() == id) {
                
                System.out.println("Que atributo desea modificar");
                System.out.println("1. Nombre \n"
                + "2. Edad \n"
                + "3. Altura  \n"
                + "4. Peso \n"
                + "5.  Objetivo \n");
                
                int opc=leer.nextInt();
                
                
                switch (opc) {
                    case 1:
                        System.out.println("Ingrese el nombre");
                        cli.setNombre(leer.next());
                        break;
                    case 2:
                        System.out.println("Ingrese la edad");
                        cli.setEdad(leer.nextInt());
                        break;
                    case 3:
                        System.out.println("Ingrese la altura");
                        cli.setAltura(leer.nextDouble());
                        break;
                    case 4:
                        System.out.println("Ingrese el peso");
                        cli.setPeso(leer.nextDouble());
                        break;
                    case 5:
                        System.out.println("Ingrese el objetivo");
                        cli.setObjetivo(leer.next());
                        break;
                    default:
                        System.out.println("Opción incorrecta");
                        break;
                }

            }else{
                System.out.println("");
                System.out.println("El usuario no ha sido encontrado");
                
            }

        }
        
    
    }
    
    public void eliminarCliente(int id){
        
            boolean eliminado = lista.removeIf(cli -> cli.getId()== id);
            if(eliminado){
                        System.out.println("El usuario ha sido eliminado");
            }else{
                        System.out.println("El usuario no ha sido encontrado ");
            }

            }
    
    }
    
    

