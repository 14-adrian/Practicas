/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Leonidas Adrian Mendoza Flores
 */
import java.util.Random;
public class Personaje {
    
    public void setNombre(String name)
    {
        this.nombre = name;
    }
    public void setSalud(int hp)
    {
        this.salud = hp;
    }
    public void setAtaque(int atk)
    {
        this.ataque = atk;
    }
    public void setDefensa(int def)
    {
        this.defensa = def;
    }
    //Tiene que ser del 1 al 100
    public void setPrecision(double acc)
    {
        this.precision = acc;
    }
    public void atacar(int eSalud, int eDefensa)
    {
        Random r = new Random();
        double acierto = 1 + (99 + 1) * r.nextDouble();
        if(this.precision > acierto)
        {
            int daño = eSalud - this.ataque/eDefensa;
        }
        else
        {
            System.out.println("Fallo");
        }
    }
    private String nombre = "";
    private int ataque = 0;
    private int salud = 0;
    private int defensa = 0;
    private double precision = 1;
    
}
