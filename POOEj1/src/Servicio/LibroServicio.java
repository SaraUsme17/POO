/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class LibroServicio {
    
    //Vamos a crear un método que retorne un objeto de tipo Libro
    
    public Libro cargarLibro(){
        
        //instanciar (crear) un objeto de tipo Libro vacío
        Libro book = new Libro();
        
        //Llenando los atributos que están vacíos desde el paso anterior
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el código ISBN del libro");
        book.setISBN(leer.next());
        System.out.println("Ingrese el título del libro");
        book.setTitulo(leer.next());
        System.out.println("Ingrese el autor del libro");
        book.setAutor(leer.next());
        System.out.println("Ingrese el número de páginas del libro");
        book.setNumPaginas(leer.nextInt());
        
        //Se retorna el objeto con los atributos ya cargados 
        return book;
        
        
    }
    
}
