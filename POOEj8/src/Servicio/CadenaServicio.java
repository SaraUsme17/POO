/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class CadenaServicio {
    
    Scanner leer = new Scanner(System.in);
    
    public Cadena crearCadena(){
        Cadena nuevaCadena = new Cadena();
        
        System.out.println("Ingrese una frase");
        nuevaCadena.setCadena(leer.nextLine());
        nuevaCadena.setLongitud(nuevaCadena.getCadena().length());

        return nuevaCadena;
    
    }
 
    public void mostrarVocales(String frase){
        int vocales=0;
        for (int i = 0; i < frase.length(); i++) {
            if(frase.substring(i, i+1).equalsIgnoreCase("a") || frase.substring(i, i+1).equalsIgnoreCase("e") || frase.substring(i, i+1).equalsIgnoreCase("i") || frase.substring(i, i+1).equalsIgnoreCase("o") || frase.substring(i, i+1).equalsIgnoreCase("u")){
               vocales++;
            
            }
            
        }
    
        System.out.println("La frase ingresada tiene " + vocales + " vocales");
    }
    
    
    public void invertirFrase(String frase){
        String invertida = "";
        
        for (int i = frase.length()-1; i >= 0; i--) {
            invertida = invertida.concat(frase.substring(i, i+1));
            
        }
    
        System.out.println("La frase invertida es " + invertida);
    
    }
    
    public void vecesRepetido(String letra, String frase){
        int contadorletra =0;
    
        for (int i = 0; i < frase.length(); i++) {
            if(frase.substring(i, i+1).equalsIgnoreCase(letra)){
                contadorletra ++;
            
            }
            
        }
        
        System.out.println("La letra " + letra + " se encuentra " + contadorletra + " veces repetida en la frase");
    
    }
    
    public void compararLongitud(String frase, String fraseNueva){
        
        if(frase.length()==fraseNueva.length()){
            System.out.println("La longitud de la frase 1 es " + frase.length());
            System.out.println("La longitud de la frase 2 es " + fraseNueva.length());
            System.out.println("La longitud de las 2 frases es la misma");
 
         
        }else if(frase.length()>fraseNueva.length()){
            System.out.println("La longitud de la frase 1 es " + frase.length());
            System.out.println("La longitud de la frase 2 es " + fraseNueva.length());
            System.out.println("La longitud de la frase 1 es mayor que la frase 2");
        
        }else{
            System.out.println("La longitud de la frase 1 es " + frase.length());
            System.out.println("La longitud de la frase 2 es " + fraseNueva.length());
            System.out.println("La longitud de la frase 2 es mayor que la frase 1");
        
        }
 
    }
    
    public void unirFrases(String frase, String nuevaFrase){
        
        String unir = frase.concat(" ");
        String unirF = unir.concat(nuevaFrase);
        System.out.println("La frase unida es " + unirF + " " );

    }
    
    public void reemplazar(String letra, String frase){
        String reemplazo = "";
        
        for (int i = 0; i < frase.length(); i++) {
            if(frase.substring(i, i+1).equalsIgnoreCase("a")){
                reemplazo = reemplazo.concat(letra);
            
            }else{
                reemplazo = reemplazo.concat(frase.substring(i, i+1));
            }
            
        }
        
        System.out.println("La nueva frase es " + reemplazo);
        
    }
    
    public void contiene(String letra, String frase){

        boolean contiene = frase.contains(letra);
        System.out.println("El caracter ingresado está contenido en la frase ? " + contiene);
    
    }
}
