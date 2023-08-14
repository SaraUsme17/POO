/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Curso;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ServicioCurso {
    
    Scanner leer = new Scanner(System.in);
    public Curso crearCurso(){
        
        Curso curso = new Curso();
        System.out.println("Ingrese el nombre del curso");
        curso.setNombreCurso(leer.next());
        System.out.println("Ingrese la cantidad de horas por día que ve el curso");
        curso.setCantidadHorasPorDia(leer.nextDouble());
        System.out.println("Ingrese la cantidad de días por semana que ve el curso");
        curso.setCantidadDiasPorSemana(leer.nextInt());
        System.out.println("Ingrese el turno en el que ve el curso (Mañana/Tarde)");
        curso.setTurno(leer.next());
        System.out.println("Ingrese el precio del curso por hora");
        curso.setPrecioPorHora(leer.nextDouble());
        curso.setAlumnos(cargarAlumnos());
        
        
        return curso;
}
    
    public String[] cargarAlumnos(){
        String [] alumnos = new String[5];
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Ingrese el nombre del alumno " + (i+1));
            alumnos[i] = leer.next();
        }
        return alumnos;
    
    }
    
    public void calcularGananciaSemanal(Curso curso){
        double ganancia = curso.getCantidadHorasPorDia()*curso.getCantidadDiasPorSemana()*curso.getPrecioPorHora()*5;
        System.out.println("La ganancia semanal es igual a "+ ganancia);
    
    
    }
}
