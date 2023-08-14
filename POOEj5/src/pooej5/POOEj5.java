/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej5;

import Entidad.Cuenta;
import Servicio.CuentaServicio;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class POOEj5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        CuentaServicio cs = new CuentaServicio();
        Cuenta objCuenta = cs.nuevaCuenta();
        int opcion;
        
        do {
            System.out.println("Elija una opción");
            System.out.println("1. Ingresar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Extracción rápida");
            System.out.println("4. Consultar saldo");
            System.out.println("5. Consultar datos");
            opcion = leer.nextInt();
            
            if(opcion<=0 || opcion>6){
                System.out.println("Opción incorrecta. Seleccione una de las opciones del menú");
            
            }
            
            switch(opcion){
                case 1:
                System.out.println("Digite la cantidad de dinero que desea ingresar");
                double ingreso = leer.nextDouble();
                cs.ingresar(ingreso, objCuenta.getSaldoActual());
                break;
                case 2:
                System.out.println("Ingrese la cantidad de dinero que desea retirar");
                double retiro = leer.nextDouble();
                cs.retirar(retiro, objCuenta.getSaldoActual());
                break;
                case 3:
                System.out.println("Ingrese la cantidad de dinero que desea retirar");
                double retiroRap = leer.nextDouble();
                cs.extraccionRapida(retiroRap, objCuenta.getSaldoActual());
                break;
                case 4:
                cs.consultarSaldo(objCuenta.getSaldoActual());
                break;
                case 5:
                cs.consultarDatos(objCuenta);
                break;
//                case 6:
//                System.out.println("Saliendo");
//                break;
     
                 
            }

        } while (opcion<=0 || opcion>5);


    }
    
}
