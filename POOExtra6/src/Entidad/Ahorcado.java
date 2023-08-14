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
public class Ahorcado {
    private String [] palabra;
    private int cantidad;
    private int jugadas;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int cantidad, int jugadas) {
        this.palabra = palabra;
        this.cantidad = cantidad;
        this.jugadas = jugadas;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getJugadas() {
        return jugadas;
    }

    public void setJugadas(int jugadas) {
        this.jugadas = jugadas;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "palabra=" + palabra + ", cantidad=" + cantidad + ", jugadas=" + jugadas + '}';
    }
    
    
    
}
