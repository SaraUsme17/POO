/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.NIF;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ServicioNIF {
    
    Scanner leer = new Scanner(System.in);
    
    public long crearNif(){
        System.out.println("Ingrese el número DNI");
        long DNI = leer.nextLong();
        return DNI;
    
    
    }
    
    public char calcular(long DNI){
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X','B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int resto = (int)(DNI % 23);
        
        if (resto>=0 && resto <=22){
         char letra = letras[resto];
            System.out.println("La letra correspondiente es " + letra);
            return letra;
        }else{
            System.out.println("Valor no válido");
            return '0';
        
        }
    
    }
     
    public void mostrar(long DNI, char letra){
        System.out.println("El número NIF es igual a "+ DNI + "-" + letra);
    
    }

   
    
}
