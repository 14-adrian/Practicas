
package Clases;


/**
 *
 * @author Leonidas Mendoza
 */
public class Guerrero extends Personaje{
    
    public Guerrero() {
        super("Guerrero", 30, 90, 40, 70);
    } public void superAtaque(){
        System.out.println("Guerrero: SUPER ATAQUE");
        super.setAtaque(super.getAtaque()+10);
    }
    @Override
    public void ganador() {
        System.out.println("Guerrero: Lastima, parece que no eras tan fuerte!");
    }
}
