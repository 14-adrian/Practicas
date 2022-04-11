/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Eje1;

/**
 *
 * @author Leonidas Adrian Mendoza Flores
 */
public class Cuadrado extends Figura{
    private double lado;
    
    public Cuadrado(double _lado){
        this.lado = _lado;
    }
    
    @Override
    public double calcPer(){
        double r = this.lado*4;
        return r;
    }
    @Override
    public double calcArea(){
        double r = Math.pow(lado, 2);
        return r;
    }
}
