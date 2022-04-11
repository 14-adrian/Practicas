/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Eje1;

/**
 *
 * @author Leonidas Adrian Mendoza Flores
 */
public class Triangulo extends Figura{
    private double base, altura, lado;
    
    public Triangulo(double _base, double _altura, double _lado){
        this.base = _base;
        this.altura = _altura;
        this.lado = _lado;
    }
    
    @Override
    public double calcPer(){
        double r = 3*(this.lado);
        return r;
    }
    @Override
    public double calcArea(){
        double r = (this.base * this.altura)/2;
        return r;
    }
}
