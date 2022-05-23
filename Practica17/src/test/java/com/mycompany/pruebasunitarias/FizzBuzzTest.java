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
public class FizzBuzzTest {
    
    public FizzBuzzTest() {
    }

    @Test
    public void testCalcular()
    {
        int numero = 15;
        String expResult = "FizzBuzz";
        String result = new FizzBuzz().calcular(numero);
        assertTrue(expResult.equals(result));
    }
}
