package Clases;

/**
 *
 * @author Leonidas Adrian Mendoza Flores
 */

public abstract class Personaje {
    
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
    public String getNombre()
    {
        return this.nombre;
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
    
    public abstract void ganador();
    
    public void atacado(int _ataque)
    {
        int vidaRestante=this.getSalud();
        int daño = _ataque-this.getDefensa();
        if(daño>0)
        {
            vidaRestante-=daño;
            System.out.println(this.getNombre() + " ha recibido un "+tipoAtaque+"... Ha perdido "+daño+" vida");
            
        }else{
            System.out.println(this.getNombre()+" se ha librado de un "+tipoAtaque+"... Se prepara para atacar");
        }
        if(vidaRestante<0) vidaRestante=0;
        this.setSalud(vidaRestante);
        System.out.println("La vida de "+ this.getNombre()+" es de " +this.salud);
    }
    
    public void evitar()
    {
        System.out.println(this.getNombre()+ " evito el golpe con exito!");
    }
    
    public boolean vive()
    {
        boolean flag = true;
        
        if(this.getSalud()<=0) flag = false;
        
        return flag;
    }
    private String nombre; //Atributo nombre del personaje
    private int ataque; //Atributo ataque del personaje
    private int salud; //Atributo salud del personaje
    private int defensa; //Atributo defensa del personaje
    private double precision; //Atributo tasa de aciertos del personaje
    
    private String tipoAtaque="golpe";
    
}
