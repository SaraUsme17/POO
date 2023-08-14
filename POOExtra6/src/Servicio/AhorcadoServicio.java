/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Ahorcado;
import java.util.Scanner;


/**
 *
 * @author user
 */
public class AhorcadoServicio {
    Scanner leer = new Scanner(System.in);
    
    public int longitud(String palabraV){
        int longitud = palabraV.length();
        System.out.println("La longitud de la palabra ingresada es igual a "+ longitud);
        return longitud;
   
    }
    
    public Ahorcado crearJuego(){
        
        Scanner leer = new Scanner(System.in);
        int cantidad = 0;
        System.out.println("Ingrese la cantidad de jugadas máximas");
        int jugadas=leer.nextInt();
        System.out.println("Ingrese la palabra");
        String palabraV = leer.next();

//        palabraV = input.toCharArray();
        int longitud = longitud(palabraV);

        String [] palabra = new String[longitud];
          
        for (int i = 0; i < longitud; i++) {
            palabra[i] = palabraV.substring(i, i+1);
                
        }
        
        Ahorcado obj = new Ahorcado(palabra, cantidad, jugadas);
        return obj;
      
    }
    

    
    public boolean buscar(String letra, Ahorcado obj){
        
//        int cantidadJugadas = obj.getJugadas();
//        int cantidadEncontradas = obj.getCantidad();
        int resta=0;
        int jug=0;
        boolean encontrada =false;
        
//        while(cantidadJugadas > 0 && cantidadEncontradas < obj.getPalabra().length){
//            encontrada =false;
            for (int i = 0; i < obj.getPalabra().length; i++) {
                if (obj.getPalabra()[i].equalsIgnoreCase(letra)) {

                    System.out.println("La letra ingresada hace parte de la palabra");
                    obj.setCantidad(obj.getCantidad()+1);
//                    cantidadEncontradas++;
                    resta = obj.getPalabra().length - obj.getCantidad();
                    System.out.println("Número de letras (encontradas, faltantes):" + obj.getCantidad() + "," + resta);
                    encontrada = true;

                }

            }

            if (!encontrada) {

                System.out.println("La letra ingresada NO hace parte de la palabra");
                obj.setJugadas(obj.getJugadas()-1);
                System.out.println("Número de oportunidades restantes:" + obj.getJugadas());
                encontrada = false;

            }
        
//        }

        return encontrada;
}

    
    
    public void encontradas(String letra, Ahorcado obj){
        boolean resp = buscar(letra, obj);
    
}
    
    public void juego(){
        
            Ahorcado obj  = crearJuego();        
            while(obj.getJugadas()>0 && obj.getPalabra().length != obj.getCantidad()){
            System.out.println("Ingrese una letra");
            String letra = leer.next();
            boolean resp = buscar(letra, obj);
            if(obj.getJugadas()==0){
                System.out.println("Te quedaste sin jugadas");
            
            }
            
            if(obj.getPalabra().length == obj.getCantidad()){
                System.out.println("Adivinaste la palabra!");
            
            }
            
            
            }

        }
    
}
