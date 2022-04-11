/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Eje1;
/**
 *
 * @author Leonidas Adrian Mendoza Flores
 */
public class Prueba1 {
    public static void main(String[] args){
        Circulo c = new Circulo(3);
        Cuadrado cu = new Cuadrado(5.5);
        Triangulo t = new Triangulo(8.7, 3, 9);
        Rectangulo r = new Rectangulo(22, 3.5);
        
        System.out.println("Circulo:\n Area: "+c.calcArea()+" ,Perimetro: "+c.calcPer());
        System.out.println("Cuadrado:\n Area: "+cu.calcArea()+" ,Perimetro: "+cu.calcPer());
        System.out.println("Triangulo:\n Area: "+t.calcArea()+" ,Perimetro: "+t.calcPer());
        System.out.println("Rectangulo:\n Area: "+r.calcArea()+" ,Perimetro: "+r.calcPer());
    }
    
}
