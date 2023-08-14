/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Operacion;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class OperacionServicioTest {
    
    public OperacionServicioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of crearOperacion method, of class OperacionServicio.
     */
    @Test
    public void testCrearOperacion() {
        System.out.println("crearOperacion");
        OperacionServicio instance = new OperacionServicio();
        Operacion expResult = null;
        Operacion result = instance.crearOperacion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sumar method, of class OperacionServicio.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        double numero1 = 0.0;
        double numero2 = 0.0;
        OperacionServicio instance = new OperacionServicio();
        double expResult = 0.0;
        double result = instance.sumar(numero1, numero2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of restar method, of class OperacionServicio.
     */
    @Test
    public void testRestar() {
        System.out.println("restar");
        double numero1 = 0.0;
        double numero2 = 0.0;
        OperacionServicio instance = new OperacionServicio();
        double expResult = 0.0;
        double result = instance.restar(numero1, numero2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiplicar method, of class OperacionServicio.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        double numero1 = 0.0;
        double numero2 = 0.0;
        OperacionServicio instance = new OperacionServicio();
        double expResult = 0.0;
        double result = instance.multiplicar(numero1, numero2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dividir method, of class OperacionServicio.
     */
    @Test
    public void testDividir() {
        System.out.println("dividir");
        double numero1 = 0.0;
        double numero2 = 0.0;
        OperacionServicio instance = new OperacionServicio();
        double expResult = 0.0;
        double result = instance.dividir(numero1, numero2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
