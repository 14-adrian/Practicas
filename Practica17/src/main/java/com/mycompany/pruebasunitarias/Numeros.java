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
public class Numeros {
     public boolean esPar(int numero){
         
        boolean resultado = false;
        if(numero%2 == 0){
            resultado = true;
        }
        return resultado;
    }
     
     public boolean esImpar(int numero){
         
        boolean resultado = false;
        if(numero%2 == 1){
            resultado = true;
        }
        return resultado;
    }
     
     public boolean esPrimo(int numero)
     {
         boolean resultado = true;
         int contador = 2;
         while(resultado && contador<numero)
         {
             if(numero%contador==0) resultado = false;
             contador++;
         }
         return resultado;
     }
}
