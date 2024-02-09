/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author user
 */
public class Libro {
    private String ISBN;
    private String titulo;
    private String autor;
    private int numPaginas;
    
    //Private limita el acceso y controla cómo se puede acceder y modificar la información interna de una clase.
    //solo puede ser accedido directamente dentro de la propia clase en la que se define. 
    //No puede ser accesible desde fuera de esa clase, incluso por otras clases del mismo paquete.
    
    //Private, public, protected 
    
    
    //CONSTRUCTORES: Métodos especiales que se utilizan para inicializar los atributos de un objeto 
    //cuando se crea una instancia de la clase
    
    //Define como se debe crear y configurar un objeto de una clase específica
    
    
    //Constructor por parámetros

    public Libro(String ISBN, String titulo, String autor, int numPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }
    
    //Constructor por defecto o constructor vacío

    public Libro() {
    }
    
    //Getter and Setter
    //Métodos para acceder y modificar los valores de los atributos de una clase. 
    //Un getter es un método que se utiliza para obtener el valor actual de un atributo privado de una clase.
    //Un setter es un método que se utiliza para modificar el valor de un atributo privado de una clase.

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    
    //Retorna el objeto con todos sus atributos detallados (impresión)
    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", numPaginas=" + numPaginas + '}';
    }
    
    
}

