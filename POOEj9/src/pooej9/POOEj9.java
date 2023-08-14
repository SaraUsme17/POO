/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej9;

import Entidad.Matematica;
import Servicio.MatematicaServicio;

/**
 *
 * @author user
 */
public class POOEj9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MatematicaServicio ms = new MatematicaServicio();
        Matematica nuevosNum = ms.crearNum();
        ms.devolverMayor(nuevosNum.getNum1(), nuevosNum.getNum2());
        ms.calcularPotencia(nuevosNum.getNum1(), nuevosNum.getNum2());
        ms.calculaRaiz(nuevosNum.getNum1(), nuevosNum.getNum2());
    }
    
}
