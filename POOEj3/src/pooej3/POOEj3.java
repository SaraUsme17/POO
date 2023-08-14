/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej3;

import Entidad.Operacion;
import Servicio.OperacionServicio;

/**
 *
 * @author user
 */
public class POOEj3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        OperacionServicio op = new OperacionServicio();
        Operacion num = op.crearOperacion();
        double sum = op.sumar(num.getNumero1(), num.getNumero2());
        System.out.println("La suma del numero 1 y el numero 2 es igual a " + sum);
        double rest = op.restar(num.getNumero1(), num.getNumero2());
        System.out.println("La resta del numero 1 y el numero 2 es igual a " + rest);
        
        double multi = op.multiplicar(num.getNumero1(), num.getNumero2());
        
        if(multi==0){
            System.out.println("No se pueden hacer multiplicaciones por 0 ");  
        
        }else{
            System.out.println("La multiplicación del numero 1 y el numero 2 es igual a "+ multi);  
        
        }
        
   
        double div = op.dividir(num.getNumero1(), num.getNumero2());
        if(div==0){
            System.out.println("No se pueden hacer divisiones por 0");
        
        }else{
           System.out.println("La división del numero 1 y el numero 2 es igual a " + div);
        
        }
  
    }
    
}
