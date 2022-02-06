package Clases;

/**
 *
 * @author Leonidas Adrian Mendoza Flores
 */
import java.util.Random;

public class Personaje {
    
   
    /**
    -----Prueba Guerrero-----
    public Personaje() 
    {
        this.setNombre("Guerrero");
        this.setAtaque(30);
        this.setSalud(90);
        this.setDefensa(40);
        this.setPrecision(70);
    }
    */
    /**
    ------Prueba Caballeria-----
    public Personaje() 
    {
        this.setNombre("Caballeria");
        this.setAtaque(40);
        this.setSalud(80);
        this.setDefensa(30);
        this.setPrecision(80);
    }
    */
    /**
     ------Prueba Mago-------
    public Personaje() 
    {
        this.setNombre("Mago");
        this.setAtaque(75);
        this.setSalud(30);
        this.setDefensa(20);
        this.setPrecision(60);
    }
    */
    /**
    ------Prueba Computadora------
    public Personaje()
    {
        this.setNombre("Computadora");
        this.setAtaque(50);
        this.setSalud(150);
        this.setDefensa(75);
        this.setPrecision(90);
    }
    */
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
    public int getSalud()
    {
        return salud;
    }
    public int getDefensa()
    {
        return defensa;
    }
    public int atacar(int saludRival, int defensaRival)
    {
        Random r = new Random();
        double acierto = 1 + (99 + 1) * r.nextDouble();
        int daño = 0;
        if(this.precision > acierto)
        {
            daño = saludRival - this.ataque/defensaRival;
        }
        else
        {
            System.out.println("Fallo");
        }
        return daño;
    }
    public void recibeDaño(int daño)
    {
        this.salud -= daño;
        if(this.salud < 0)
        {
            System.out.println(this.nombre +" fue derrotado");
            this.salud = 0;
        }
    }
    private String nombre = "";
    private int ataque = 1;
    private int salud = 1;
    private int defensa = 1;
    private double precision = 1;
    
}
