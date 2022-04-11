/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Eje3;

/**
 *
 * @author Leonidas Adrian Mendoza Flores
 */
public class Padres implements Persona{
    private String nombre;
    public Padres(String _nombre){
        this.nombre = _nombre;
    }
    @Override
    public void saludo(){
        System.out.println("Hola mi nombre es "+this.nombre+" y padre");
    }
}
