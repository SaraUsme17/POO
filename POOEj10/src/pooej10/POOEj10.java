/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej10;

//import java.text.DecimalFormat;
import java.util.Arrays;

/**
 *
 * @author user
 */
public class POOEj10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        DecimalFormat decimal = new DecimalFormat("0.00");
        double [] arregloA = new double[50];
        double [] arregloB = new double[20];
        
        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i] = (double)(Math.random()*10);
            
        }
        
        System.out.println("Vector A con números aleatorios");
//        System.out.println(String.format("%.2f", arregloA));
        System.out.println((Arrays.toString(arregloA)));
        
        //ordenar arreglo de menor a mayor 
        
        Arrays.sort(arregloA);
        System.out.println("Vector A con los números ordenados de menor a mayor");
        System.out.println(Arrays.toString(arregloA));
        
        //copiar los primeros 10 números ordenados al arreglo B de 20 elementos
        
        System.arraycopy(arregloA, 0, arregloB, 0,9);
        Arrays.fill(arregloB, 9, arregloB.length, 0.5);
        
//        for (int i = 0; i < 9; i++) {
//            arregloB[i] = arregloA[i];
//        }
//        
//        for (int i = 9; i < 20; i++) {
//            arregloB[i] = 0.5;
//            
//        }
        
        System.out.println("Vector B con los primeros 10 números iguales al arregloA y con el resto en 0.5");
        System.out.println(Arrays.toString(arregloB));
  
    }
    
}
