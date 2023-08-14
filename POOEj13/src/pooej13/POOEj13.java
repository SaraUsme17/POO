/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej13;

import Entidad.Curso;
import Servicio.ServicioCurso;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class POOEj13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioCurso sc = new ServicioCurso();
        Curso curso = sc.crearCurso();
        sc.calcularGananciaSemanal(curso);
        System.out.println(curso);
    }
    
}
