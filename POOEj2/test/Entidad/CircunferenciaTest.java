/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

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
public class CircunferenciaTest {
    
    public CircunferenciaTest() {
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
     * Test of getRadio method, of class Circunferencia.
     */
    @Test
    public void testGetRadio() {
        System.out.println("getRadio");
        Circunferencia instance = null;
        double expResult = 0.0;
        double result = instance.getRadio();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRadio method, of class Circunferencia.
     */
    @Test
    public void testSetRadio() {
        System.out.println("setRadio");
        double radio = 0.0;
        Circunferencia instance = null;
        instance.setRadio(radio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Circunferencia.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Circunferencia instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
