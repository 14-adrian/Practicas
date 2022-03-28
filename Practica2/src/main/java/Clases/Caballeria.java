
package Clases;

/**
 *
 * @author Leonidas Mendoza
 */
public class Caballeria extends Personaje {
    public Caballeria(){
        super("Caballeria", 40, 80, 30, 80);
    }
    public void superDefensa(){
        System.out.println("Caballero: Veamos si me puedes hacer un rasguño");
        super.setDefensa(super.getDefensa()+5);
    }
    @Override
    public void ganador() {
        System.out.println("Caballero: Victoria suprema para la realeza!!!");
    }
}
