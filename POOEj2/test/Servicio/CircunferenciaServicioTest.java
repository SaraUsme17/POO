/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Circunferencia;
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
public class CircunferenciaServicioTest {
    
    public CircunferenciaServicioTest() {
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
     * Test of crearCircunferencia method, of class CircunferenciaServicio.
     */
    @Test
    public void testCrearCircunferencia() {
        System.out.println("crearCircunferencia");
        CircunferenciaServicio instance = new CircunferenciaServicio();
        Circunferencia expResult = null;
        Circunferencia result = instance.crearCircunferencia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of area method, of class CircunferenciaServicio.
     */
    @Test
    public void testArea() {
        System.out.println("area");
        Circunferencia circle = null;
        CircunferenciaServicio instance = new CircunferenciaServicio();
        instance.area(circle);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of perimetro method, of class CircunferenciaServicio.
     */
    @Test
    public void testPerimetro() {
        System.out.println("perimetro");
        Circunferencia circle = null;
        CircunferenciaServicio instance = new CircunferenciaServicio();
        instance.perimetro(circle);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
