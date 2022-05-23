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
public class NumerosTest {
    
    public NumerosTest() {
    }

    /**
     * Test of esPar method, of class Numeros.
     */
    @Test
    public void testEsPar() {
        System.out.println("esPar");
        int numero = 1;
        Numeros instance = new Numeros();
        boolean expResult = false;
        boolean result = instance.esPar(numero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of esImpar method, of class Numeros.
     */
    @Test
    public void testEsImpar() {
        System.out.println("esImpar");
        int numero = 12;
        Numeros instance = new Numeros();
        boolean expResult = false;
        boolean result = instance.esImpar(numero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of esPrimo method, of class Numeros.
     */
    @Test
    public void testEsPrimo() {
        System.out.println("esPrimo");
        int numero = 8;
        Numeros instance = new Numeros();
        boolean expResult = false;
        boolean result = instance.esPrimo(numero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
