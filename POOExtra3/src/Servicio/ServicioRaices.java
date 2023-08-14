/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Raices;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ServicioRaices {
    
    Scanner leer = new Scanner(System.in);
    
    public Raices crearValores(){
        
         Raices valores = new Raices();
         System.out.println("Ingrese el valor del coeficiente a");
         valores.setA(leer.nextDouble());
         System.out.println("Ingrese el valor del coeficiente b");
         valores.setB(leer.nextDouble());
         System.out.println("Ingrese el valor del coeficiente c");
         valores.setC(leer.nextDouble());
        
        return valores;
    
    } 
    
    public double getDiscriminante(Raices valores){
        double discriminante = (Math.pow(valores.getB(), 2))-4*valores.getA()*valores.getC();
        System.out.println("El discriminante es igual a " + discriminante);
        return discriminante;
    
    }
    
    public boolean tieneRaices(double discriminante){
        boolean sln = false;
        
        if(discriminante>=0){
            sln = true;
        }
       
        return sln;
    
    }
    
    public boolean tieneRaiz(double discriminante){
        boolean sln = false;
        
        if(discriminante==0){
            sln = true;
        }
       
        return sln;
    
    }
        
    public void obtenerRaices(Raices valores, double discriminante){
        if(tieneRaices(discriminante)){
            
        double raiz1 = ((-valores.getB())+Math.sqrt(discriminante))/(2*valores.getA());
        double raiz2 = ((-valores.getB())-Math.sqrt(discriminante))/(2*valores.getA());
            System.out.println("La raíz 1 es igual a "+ raiz1);
            System.out.println("La raíz 2 es igual a "+ raiz2);
            
        }else{
                System.out.println("No existen raices reales para esta ecuación");
        }
    }
    
    public void obtenerRaiz(Raices valores, double discriminante){
        if(tieneRaiz(discriminante)){
            
        double raiz = -valores.getB() / (2 * valores.getA());
            System.out.println("La única raíz es igual a "+ raiz);

            
        }else{
                System.out.println("No existe una única raíz real para esta ecuación");
        }
    }
    
    public void calcular(Raices valores, double discriminante){
        if (tieneRaices(discriminante)) {
            obtenerRaices(valores, discriminante);
        } else if (tieneRaiz(discriminante)) {
            obtenerRaiz(valores, discriminante);
        } else {
            System.out.println("No existen soluciones reales para esta ecuación.");
        }
    }
    
    
    }
            
           
