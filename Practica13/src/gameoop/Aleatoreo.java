
package gameoop;

import java.util.Random;

/**
 *
 * @author Leonidas Adrian Mendoza Flores
 */
public class Aleatoreo {
    //Metodo para usar la precisione
    public static boolean rndAtaque(double hr) {
        Random w = new Random();
        boolean flag = false;
        int a = w.nextInt(100);

        if (a < (int) (hr * 100)) {
            flag = true;
        }

        return flag;
    }
}
