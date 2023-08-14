/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej8;

import Entidad.Cadena;
import Servicio.CadenaServicio;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class POOEj8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        CadenaServicio cs = new CadenaServicio();
        Cadena nuevaCadena = cs.crearCadena();
        cs.mostrarVocales(nuevaCadena.getCadena());
        cs.invertirFrase(nuevaCadena.getCadena());
        
        System.out.println("Ingrese un carácter para saber cuántas veces está repetido");
        String letra = leer.next();
        cs.vecesRepetido(letra, nuevaCadena.getCadena());
        
        System.out.println("Ingrese una nueva frase");
        String fraseNueva = leer.next();
        cs.compararLongitud(nuevaCadena.getCadena(), fraseNueva);
        cs.unirFrases(nuevaCadena.getCadena(),fraseNueva);
        
        System.out.println("Ingrese el caracter que quiere reemplazar en la frase");
        String letraR = leer.next();
        cs.reemplazar(letraR, nuevaCadena.getCadena());
        
        System.out.println("Ingrese el caracter que quiere buscar en la frase");
        String letraB = leer.next();
        cs.contiene(letraB, nuevaCadena.getCadena());
    }
    
}
