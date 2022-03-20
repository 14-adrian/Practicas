
package Clases;

import java.util.Random;

/**
 *
 * @author Leonidas Mendoza
 */
public class Guerrero extends Personaje{
    
    public Guerrero() {
        super("Guerrero", 30, 90, 40, 70);
    }
    public int superAtaque(int saludRival, int defensaRival){
        Random r = new Random(); //Utiliza el metodo random
        double acierto = 1 + (99 + 1) * r.nextDouble(); //Obtener un numero aleatorio para el funcionamiento de la taza de acierto
        int daño = 0; //Variable que devuelve el metodo para el funcionamiento de la defensa
        System.out.println("!!!Preparate!!!");
        if(super.getPrecision() > acierto)
        {
            daño = saludRival - (super.getAtaque() * 2)/defensaRival; //Funcionamiento del ataque
        }
        else
        {
            System.out.println("Fallo");
        }
        return daño;
    }
}
