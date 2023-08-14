/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class CuentaServicio {
    Scanner leer = new Scanner(System.in);
    
    public Cuenta nuevaCuenta(){
        
        Cuenta objCuenta = new Cuenta();
        System.out.println("Ingrese el número de cuenta");
        objCuenta.setNumCuenta(leer.nextInt());
        System.out.println("Ingrese el número DNI");
        objCuenta.setDNI(leer.nextInt());
        System.out.println("Ingrese el saldo actual");
        objCuenta.setSaldoActual(leer.nextInt());
        return objCuenta;
    }
    
    public void ingresar(double ingreso, int saldoActual){
        
       double suma = saldoActual + ingreso;
        System.out.println("El saldo ingresado fue $ " + ingreso);
        System.out.println("El saldo total de la cuenta es $ " + suma);
    
    }
    
    public void retirar(double retiro, int saldoActual){
        if(retiro>saldoActual){
            saldoActual=0;  
            System.out.println("La cuenta no tiene la cantidad de dinero a retirar");
        }else{
            double resta = saldoActual - retiro;
            System.out.println("El saldo a retirar fue $ " + retiro);
            System.out.println("El saldo total de la cuenta es $ " + resta);
        }
       
    }
    
    public void extraccionRapida(double retiro, int saldoActual){
        if(retiro != (saldoActual*0.2)){
            System.out.println("Sólo puede retirar el 20% de su saldo");
        }else{
            double resta = saldoActual - retiro;
            System.out.println("El saldo a retirar fue $ " + retiro);
            System.out.println("El saldo total de la cuenta es $ " + resta);
        
        }  
    }
    
    public void consultarSaldo(int saldoActual){
        System.out.println("El saldo actual de la cuenta es $" + saldoActual);
    
    }
    
    public void consultarDatos(Cuenta objCuenta){
        System.out.println("El número de la cuenta es " + objCuenta.getNumCuenta());
        System.out.println("El DNI de la cuenta es " + objCuenta.getDNI());
        System.out.println("El saldo actual de la cuenta es $ " + objCuenta.getSaldoActual());
    
    }
}
