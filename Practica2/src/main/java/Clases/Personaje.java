package Clases;

/**
 *
 * @author Leonidas Adrian Mendoza Flores
 */
import java.util.Random; //Metodo Random

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
    public int getDefensa() //Obtener defensa para el metodo ataque
    {
        return defensa;
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
    private String nombre = ""; //Atributo nombre del personaje
    private int ataque = 1; //Atributo ataque del personaje
    private int salud = 1; //Atributo salud del personaje
    private int defensa = 1; //Atributo defensa del personaje
    private double precision = 1; //Atributo tasa de aciertos del personaje
    
}
