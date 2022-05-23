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
public class ImpresoraNumeros {
    
    /**
     *
     * @param limite
     * @throws RuntimeException
     */
    public static int imprimirNumeros(int limite)
    {
        if(limite<1) throw new RuntimeException("El limite debe de ser >=1");
        for(int i = 1; i<limite; i++)
        {
            System.out.println(new FizzBuzz().calcular(i));
        }
        return 8;
    }
}


