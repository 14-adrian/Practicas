package Clases;

/**
 *
 * @author Leonidas Adrian Mendoza Flores
 */
import java.util.Random; //Metodo Random

public class Personaje {
    
    public Personaje(String name, int salud, int defensa, int ataque, double precision)
    {
        this.nombre = name;
        this.salud  = salud;
        this.ataque = ataque;
        this.defensa = defensa;
        this.precision = precision;
    }
    public void setNombre(String name) //Asignar nombre
    {
        this.nombre = name;
    }
    public void setSalud(int hp) //Asignar salud
    {
        this.salud = hp;
    }
    public void setAtaque(int atk) //Asignar ataque
    {
        this.ataque = atk;
    }
    public void setDefensa(int def) //Asignar defensa
    {
        this.defensa = def;
    }
    public void setPrecision(double acc) //Asignar precision o tasa de acierto
    {
        this.precision = acc;
    }
    public int getSalud() //Obtener salud para que el metodo ataque
    {
        return salud;
    }
    public int getAtaque() //Obtener defensa para el metodo ataque
    {
        return ataque;
    }
    public int getDefensa() //Obtener defensa para el metodo ataque
    {
        return defensa;
    }
    public double getPrecision() //Asignar precision o tasa de acierto
    {
        return precision;
    }
    public int atacar(int saludRival, int defensaRival) //Metodo atacar, necesita la defensa y vida del rival
    {
        Random r = new Random(); //Utiliza el metodo random
        double acierto = 1 + (99 + 1) * r.nextDouble(); //Obtener un numero aleatorio para el funcionamiento de la taza de acierto
        int daño = 0; //Variable que devuelve el metodo para el funcionamiento de la defensa
        if(this.precision > acierto)
        {
            daño = saludRival - this.ataque/defensaRival; //Funcionamiento del ataque
        }
        else
        {
            System.out.println("Fallo");
        }
        return daño;
    }
    public void recibeDaño(int daño) //Metodo para controlar la vida del personaje y recibir ataques, necesita el metodo "atacar"
    {
        this.salud -= daño;
        if(this.salud < 0)
        {
            System.out.println(this.nombre +" fue derrotado"); //Envia mensaje si el personaje fue derrotado
            this.salud = 0;
        }
    }
    private String nombre; //Atributo nombre del personaje
    private int ataque; //Atributo ataque del personaje
    private int salud; //Atributo salud del personaje
    private int defensa; //Atributo defensa del personaje
    private double precision; //Atributo tasa de aciertos del personaje
    
}
