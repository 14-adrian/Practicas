/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Eje1;

/**
 *
 * @author Leonidas Adrian Mendoza Flores
 */
public class Circulo extends Figura{
    private double radio;
    
    public Circulo(double _radio){
        this.radio = _radio;
    }
    
    @Override
    public double calcPer(){
        double r = this.radio*Math.PI*2;
        return r;
    }
    @Override
    public double calcArea(){
        double r = Math.PI*Math.pow(this.radio, 2);
        return r;
    }
}
