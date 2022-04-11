/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Eje1;

/**
 *
 * @author Leonidas Adrian Mendoza Flores
 */
public class Rectangulo extends Figura{
    private double base, altura;
    
    public Rectangulo(double _base, double _altura){
        this.base = _base;
        this.altura = _altura;
    }
    
    @Override
    public double calcPer(){
        double r = 2*(this.base + this.altura);
        return r;
    }
    @Override
    public double calcArea(){
        double r = this.base * this.altura;
        return r;
    }
}
