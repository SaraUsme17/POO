/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class RectanguloServicio {
    
    Scanner leer = new Scanner(System.in);
    
   public Rectangulo nuevoRectangulo(){
       
       Rectangulo rec = new Rectangulo();
       System.out.println("Ingrese la base del rectángulo");
       rec.setBase(leer.nextInt());
       System.out.println("Ingrese la altura del rectángulo");
       rec.setAltura(leer.nextInt());
       
       return rec;
      
}
   public void Superficie(int base, int altura){
       int sup = base*altura;
       System.out.println("La superficie del rectángulo es igual a " + sup);
   
   }
   
    public void perimetro(int base, int altura){
       int per = (base+altura)*2;
       System.out.println("El perímetro del rectángulo es igual a " + per);
   
   }
    
    public void dibujar(int base, int altura){
        String [][] matriz = new String[altura][base];
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if(i==0 || i==altura-1 || j==0 || j==base-1 ){
                    matriz[i][j] = "*";
                
                }else{
                    matriz[i][j] = " ";
                
                }
                
            }
            
        }
        
        imprimir(matriz);
   
    }
    
    public void imprimir(String [][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
                
            }
            System.out.println("");
        }
    
    
    
    }
    
}
