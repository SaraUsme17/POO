/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Matematica;

/**
 *
 * @author user
 */
public class MatematicaServicio {
    
    public Matematica crearNum(){
        
        //Math.random() genera un número decimal aleatorio en el rango de [0, 1). 
        //Esto significa que el número generado puede ser 0 pero nunca alcanzará el 1.
        //Al multiplicar por 100 se obtiene un número decimal aleatorio en el rango de [0, 100)
        //(int) convierte el resultado de la multiplicación a un entero, eliminando la parte decimal. 
        //Esto truncará el número decimal generado y dará como resultado un número entero entre 0 (incluido) y 99 (incluido).
 
        double num1 = (int) (Math.random()*100); //Se genera un número aleatorio entre 0 y 99 (ambos inclusive)
        double num2 = (int) (Math.random()*100);
        System.out.println("Número 1: " + num1);
        System.out.println("Número 2: " + num2);
        Matematica nuevosNum = new Matematica(num1, num2);
        
        return nuevosNum;
        
    }
    
    public void devolverMayor(double num1, double num2){
        if(num1>num2){
            System.out.println("El número 1 es mayor que el número 2");
        }else{
            System.out.println("El número 2 es mayor que el número 1");
        
        }
    
    }
    
    public void calcularPotencia(double num1, double num2){
        double numMayor=0;double numMenor=0;
        
        if(num1>num2){
            numMayor = num1;
            numMenor = num2;
        
        }else{
            numMayor = num2;
            numMenor = num1;    
        }
    
        double potencia = Math.pow(Math.round(numMayor), Math.round(numMenor));
        System.out.println("El número mayor elevado a la potencia del número menor es igual a " + potencia);
    }
    
    public void calculaRaiz(double num1, double num2){
        double numMayor=0;double numMenor=0;
        if(num1>num2){
            numMayor = num1;
            numMenor = num2;
        
        }else{
            numMayor = num2;
            numMenor = num1;    
        }
        
        double raiz = Math.sqrt(Math.abs(numMenor));
        System.out.println("La raiz cuadrada del menor número es igual a " + raiz);
    
    } 
    
    }
