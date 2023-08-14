/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Movil;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class MovilServicio {
    
    Scanner leer = new Scanner(System.in);
    /*los atributos marca, precio, modelo, memoriaRam, almacenamiento y codigo.*/
    public Movil cargarCelular(){
        
        Movil cel = new Movil();
        System.out.println("Ingrese la marca del celular");
        cel.setMarca(leer.next());
        System.out.println("Ingrese el precio del celular");
        cel.setPrecio(leer.nextDouble());
        System.out.println("Ingrese el modelo del celular");
        cel.setModelo(leer.next());
        System.out.println("Ingrese la memoria RAM del celular");
        cel.setMemoriaRam(leer.nextInt());
        System.out.println("Ingrese el almacenamiento del celular");
        cel.setAlmacenamiento(leer.nextInt());
        cel.setCodigo(ingresarCodigo());
 
        return cel;
    
   
    }
    
    public int [] ingresarCodigo(){
        int [] codigo = new int[7];
        
        for (int i = 0; i < codigo.length; i++) {
            System.out.println("Ingrese el número " + (i+1) + " del código");
            codigo[i] = leer.nextInt();
            
        }
        
        System.out.println("El código ingresado es");
        System.out.println(Arrays.toString(codigo));
        return codigo;
    
    }
}
