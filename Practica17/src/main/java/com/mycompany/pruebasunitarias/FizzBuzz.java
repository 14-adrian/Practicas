/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pruebasunitarias;

/**
 *
 * @author amand
 */

public class FizzBuzz {
    private static final int CINCO = 5;
    private static final int TRES = 3;
    public String calcular(int numero)
    {
        if(esDivisiblePor(numero, CINCO) && esDivisiblePor(numero, TRES)) return "FizzBuzz";
        if(esDivisiblePor(numero, CINCO)) return "Buzz";
        if( esDivisiblePor(numero, TRES)) return "Fizz";
        return ""+numero;
    }
    
    private boolean esDivisiblePor(int dividendo, int divisor)
    {
        return dividendo%divisor==0;
    }
}
