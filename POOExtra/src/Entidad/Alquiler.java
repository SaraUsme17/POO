/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Date;

/**
 *
 * @author user
 */
public class Alquiler {
    private String peliculaAlq;
    private Date fechaI;
    private Date fechaF;
    private double precio;

    public Alquiler() {
    }
    
    

    public Alquiler(String peliculaAlq, Date fechaI, Date fechaF, double precio) {
        this.peliculaAlq = peliculaAlq;
        this.fechaI = fechaI;
        this.fechaF = fechaF;
        this.precio = precio;
    }

    public String getPeliculaAlq() {
        return peliculaAlq;
    }

    public void setPeliculaAlq(String peliculaAlq) {
        this.peliculaAlq = peliculaAlq;
    }

    public Date getFechaI() {
        return fechaI;
    }

    public void setFechaI(Date fechaI) {
        this.fechaI = fechaI;
    }

    public Date getFechaF() {
        return fechaF;
    }

    public void setFechaF(Date fechaF) {
        this.fechaF = fechaF;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "peliculaAlq=" + peliculaAlq + ", fechaI=" + fechaI + ", fechaF=" + fechaF + ", precio=" + precio + '}';
    }
    
    
    
    
}
