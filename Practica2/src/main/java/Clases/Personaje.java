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
    public int atacar(int eSalud, int eDefensa)
    {
        Random r = new Random();
        double acierto = 1 + (99 + 1) * r.nextDouble();
        int daño = 0;
        if(this.precision > acierto)
        {
            daño = eSalud - this.ataque/eDefensa;
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
    }
    private String nombre = "";
    private int ataque = 0;
    private int salud = 0;
    private int defensa = 0;
    private double precision = 1;
    
}
