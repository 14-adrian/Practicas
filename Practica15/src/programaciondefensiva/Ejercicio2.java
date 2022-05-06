
package programaciondefensiva;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Leonidas Adrian Mendoza Flores
 */
public class Ejercicio2 {
    public static void juego()
    {
        //Arreglo de palabras
        String[] palabras = {"Mapache","Oso","Caballo","Perro","Gato","Serpiente"};
        //Variables
        final int INTENTOS_PERMITIDOS = 9;
        int intentosRealizados = 0;
        int aciertos =0;
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        //Variable char para almacenar
        char respuesta;
        Random rnd = new Random();   
        do
        {          
            int num=rnd.nextInt(6);
            char[] letras = letras(palabras[num].toLowerCase());
            char[] letras2 = letras(palabras[num].toLowerCase());
            char[] tusRespuestas = new char[letras2.length];
            for(int i =0; i<tusRespuestas.length;i++)
            {
                tusRespuestas[i] = '-';
            }
            
            System.out.println("Adivina la palabra");
            boolean ganado = false;
            while(INTENTOS_PERMITIDOS>intentosRealizados && !ganado)
            {
                imprimeOculta(tusRespuestas);
                System.out.println("\nIntroduce una letra");
                respuesta = scanner.next().toLowerCase().charAt(0);
                for(int i=0;i<letras.length;i++)
                {
                    if(letras[i]==respuesta)
                    {
                        tusRespuestas[i] = letras[i];
                        letras[i] =' ';
                        aciertos++;
                    }
                }
                intentosRealizados++;
                ganado = (aciertos==tusRespuestas.length);
            }
            if(ganado)
            {
                System.out.println("\nFelicidades... Ganaste");
                imprimeOculta(tusRespuestas);
            }else
            {
                System.out.println("\nFracasaste... Te he vencido");
                System.out.print("Lo que encontraste fue: ");
                imprimeOculta(letras);
                System.out.println("\nLo que debias encontrar es: ");
                imprimeOculta(letras2);
            }
            intentosRealizados=0;
            aciertos=0;
            respuesta = pregunta("\n\nQuieres volver a jugar?", scanner);
        }while(respuesta !='n');
        System.out.println("\nHa sido un placer jugar contigo... Nos vemos pronto");
    }
    
    private static char[] letras(String palabra)
    {
        char[] letras = new char[palabra.length()];
        for(int i =0; i<palabra.length();i++) letras[i] = palabra.charAt(i);
        return letras;
    }
    
    private static void imprimeOculta(char[] tr)
    {
        for(int i = 0; i<tr.length;i++)  System.out.print(tr[i]+" ");
    }
    
    private static char pregunta(String m, Scanner teclado)
    {
        char resp;
        System.out.println(m + "(s/n)");
        resp = teclado.next().toLowerCase().charAt(0);
        while(resp != 's' && resp != 'n')
        {
            System.out.println(m + "(s/n)");
            resp = teclado.next().toLowerCase().charAt(0);
        }
        return resp;
    }
}
