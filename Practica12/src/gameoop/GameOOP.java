
package gameoop;

import java.util.Scanner;

/**
 *
 * @author Leonidas Adrian Mendoza Flores
 */
public class GameOOP {

    public static void main(String[] args) {
        //Creacion computadora personajes
        
        Juego game = new Juego();
        Scanner sc = new Scanner(System.in);

        String role = "";
        String opponent = "";
        String battle = "";

        System.out.println("Por favor seleccione un personaje e ingrese el literal computadoral personaje: ");
        System.out.println("A: Guerrero");
        System.out.println("B: caballeria");
        System.out.println("C: Mago ");
        role = sc.nextLine();

        System.out.println("Por favor seleccione un oponente e ingrese el literal computadoral personaje: ");
        System.out.println("A: Guerrero");
        System.out.println("B: Caballero");
        System.out.println("C: Mago ");
        System.out.println("D: Computadora ");
        opponent = sc.nextLine();

        if (role.equals(opponent)) {
            System.out.println("El personaje principal y el oponente no puecomputadoran ser el mismo... Elija otro oponente");
            opponent = sc.nextLine();
        }

        battle = role + opponent;
        
        game.jugar(battle);
    }

    
}
