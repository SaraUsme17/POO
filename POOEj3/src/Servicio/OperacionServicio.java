/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class OperacionServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
   
    
    public Operacion crearOperacion(){
        
        Operacion num = new Operacion();
        
        System.out.println("Ingrese el numero 1");
        num.setNumero1(leer.nextDouble());
        System.out.println("Ingrese el numero 2");
        num.setNumero2(leer.nextDouble());
        return num;
    
    }
    
    public double sumar(double numero1, double numero2){
        double suma = numero1 + numero2;
        return suma;
    
    }
    
    public double restar(double numero1, double numero2){
            double resta = numero1 - numero2;
            return resta;     
    
    }
    
    public double multiplicar(double numero1, double numero2){
        if(numero1==0 || numero2==0){
            return 0;
        }else{
            double multiplicacion = numero1 * numero2;
            return multiplicacion;
        
        }
    }
    
    public double dividir(double numero1, double numero2){
        if(numero1 ==0 || numero2==0){
            return 0;        
        
        }else{
           double division = numero1 / numero2;
            return division;
        }

        

    
    }
    
}
