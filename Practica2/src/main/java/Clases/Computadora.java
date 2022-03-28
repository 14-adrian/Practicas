
package Clases;

import java.util.Random;

/**
 *
 * @author Leonidas Mendoza
 */
public class Computadora extends Personaje{
    public Computadora(){
        super("Computadora", 50, 150, 45, 60);
    }
    public void superAtaque()
    {
        System.out.println("Computadora: SUPER ATAQUE");
        super.setAtaque(super.getAtaque()+10);
    }
    public void aumentoPrecision(){
        System.out.println("Computadora: Ahora no fallare mas");
        super.setPrecision(super.getPrecision()+10);
    }
     @Override
    public void ganador() {
        System.out.println("Computadora: La era de los robots invadirá el mundo... victoria!");
    }
}
