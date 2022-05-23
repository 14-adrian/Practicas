/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.pruebasunitarias;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Leonidas Adrian Mendoza Flores
 */
public class CalculosTest {
    
    public CalculosTest() {
    }

    /**
     * Test of sumar method, of class Calculos.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = Calculos.sumar(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of restar method, of class Calculos.
     */
    @Test
    public void testRestar() {
        System.out.println("restar");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = Calculos.restar(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of multiplicar method, of class Calculos.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = Calculos.multiplicar(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of dividir method, of class Calculos.
     */
    @Test
    public void testDividir() {
        System.out.println("dividir");
        int a = 2;
        int b = 2;
        int expResult = 1;
        int result = Calculos.dividir(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
