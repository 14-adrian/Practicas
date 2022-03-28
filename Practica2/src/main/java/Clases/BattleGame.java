
package Clases;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Leonidas Adrian Mendoza Flores
 */
public class BattleGame {
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Personajes del juego
        Caballeria caballero = new Caballeria();
        Computadora computadora = new Computadora();
        Mago mago = new Mago();
        Guerrero guerrero = new Guerrero();
        
        //Contador de las rondas a Jugar
        int ronda =0;
        
        // Variables para el personaje principal, oponente,y batalla 
        String pers=" ", opon=" ", bat=" ";
        Scanner sc = new Scanner(System.in);
        
        System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        System.out.println("Bienvenidos a Battle Game");
        System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=\n\n");
        System.out.println("Elige un personaje para jugar:\n");
        System.out.println("A. Caballero");
        System.out.println("B. Guerrero");
        System.out.println("C. Mago");
        pers = sc.next().toUpperCase();
           
        System.out.println("Elige un oponente para jugar:\n");
        System.out.println("A. Caballero");
        System.out.println("B. Guerrero");
        System.out.println("C. Mago");
        System.out.println("D. Computadora");
        opon = sc.next().toUpperCase();
        while(pers.contains(opon))
        {
            System.out.println("No puedes elegir el mismo jugador como personaje principal y oponente.");
            System.out.println("Elige un oponente para jugar:\n");
            System.out.println("A. Caballero");
            System.out.println("B. Guerrero");
            System.out.println("C. Mago");
            System.out.println("D. Computadora");
            opon = sc.next();
        }
        bat = pers.trim()+opon.trim();
        switch(bat)
        {
            case "AB":
            {
                while(caballero.vive()&&guerrero.vive())
                {
                    ronda++;
                    System.out.println();
                    System.out.println("Ronda #"+ronda);
                    if(pelea(caballero.getPrecision())==1)
                    {
                        guerrero.atacado(caballero.getAtaque());
                    }else
                    {
                        guerrero.evitar();
                    }
                    if(pelea(guerrero.getPrecision())==1)
                    {
                        caballero.atacado(guerrero.getAtaque());
                    }else
                    {
                        caballero.evitar();
                    }
                    guerrero.superAtaque();
                    caballero.superDefensa();
                }
                System.out.println();
                if(caballero.vive()) caballero.ganador();
                else guerrero.ganador();
                break;
            }
            
            case "AC":
            {
                    while(caballero.vive()&&mago.vive())
                    {
                        ronda++;
                        System.out.println();
                        System.out.println("Ronda #"+ronda);
                        if(pelea(caballero.getPrecision())==1)
                        {
                            mago.atacado(caballero.getAtaque());
                        }else
                        {
                            mago.evitar();
                        }
                        if(pelea(mago.getPrecision())==1)
                        {
                            caballero.atacado(mago.getAtaque());
                        }else
                        {
                            caballero.evitar();
                        }
                        caballero.superDefensa();
                        caballero.setDefensa(mago.reducirDefensas(caballero.getDefensa()));
                        mago.aumentarAtaque();
                        mago.curacion();
                    }
                    if(caballero.vive()) caballero.ganador();
                    else mago.ganador();
                    break;
            }
            case "AD":
            {
                    while(caballero.vive()&& computadora.vive())
                    {
                        ronda++;
                        System.out.println();
                        System.out.println("Ronda #"+ronda);
                        if(pelea(caballero.getPrecision())==1)
                        {
                            computadora.atacado(caballero.getAtaque());
                        }else
                        {
                            computadora.evitar();
                        }
                        if(pelea(computadora.getPrecision())==1)
                        {
                            caballero.atacado(computadora.getAtaque());
                        }else
                        {
                            caballero.evitar();
                        }
                        caballero.superDefensa();
                        computadora.superAtaque();
                        computadora.aumentoPrecision();
                    }
                    if(caballero.vive()) caballero.ganador();
                    else computadora.ganador();
                    break;
            }
            case "BA":
            {
                while(caballero.vive()&&guerrero.vive())
                {
                    ronda++;
                    System.out.println();
                    System.out.println("Ronda #"+ronda);
                    if(pelea(guerrero.getPrecision())==1)
                    {
                        caballero.atacado(guerrero.getAtaque());
                    }else
                    {
                        caballero.evitar();
                    }
                    if(pelea(caballero.getPrecision())==1)
                    {
                        guerrero.atacado(caballero.getAtaque());
                    }else
                    {
                        guerrero.evitar();
                    }
                    
                    guerrero.superAtaque();
                    caballero.superDefensa();
                }
                System.out.println();
                if(caballero.vive()) caballero.ganador();
                else guerrero.ganador();
                break;
            }
            case "BC":
            {
                    while(guerrero.vive()&&mago.vive())
                    {
                        ronda++;
                        System.out.println();
                        System.out.println("Ronda #"+ronda);
                        if(pelea(guerrero.getPrecision())==1)
                        {
                            mago.atacado(guerrero.getAtaque());
                        }else
                        {
                            mago.evitar();
                        }
                        if(pelea(mago.getPrecision())==1)
                        {
                            guerrero.atacado(mago.getAtaque());
                        }else
                        {
                            guerrero.evitar();
                        }
                        guerrero.superAtaque();
                        guerrero.setDefensa(mago.reducirDefensas(guerrero.getDefensa()));
                        mago.aumentarAtaque();
                        mago.curacion();
                    }
                    if(guerrero.vive()) guerrero.ganador();
                    else mago.ganador();
                    break;
            }
            case "BD":
            {
                while(guerrero.vive()&& computadora.vive())
                {
                    ronda++;
                    System.out.println();
                    System.out.println("Ronda #"+ronda);
                    if(pelea(guerrero.getPrecision())==1)
                    {
                        computadora.atacado(guerrero.getAtaque());
                    }else
                    {
                        computadora.evitar();
                    }
                    if(pelea(computadora.getPrecision())==1)
                    {
                        guerrero.atacado(computadora.getAtaque());
                    }else
                    {
                        guerrero.evitar();
                    }
                    guerrero.superAtaque();
                    computadora.aumentoPrecision();
                }
                if(guerrero.vive()) guerrero.ganador();
                else computadora.ganador();
                break;
            }
            case "CA":
            {
                while(caballero.vive()&&mago.vive())
                {
                    ronda++;
                    System.out.println();
                    System.out.println("Ronda #"+ronda);
                    
                    if(pelea(mago.getPrecision())==1)
                    {
                        caballero.atacado(mago.getAtaque());
                    }else
                    {
                        caballero.evitar();
                    }
                    if(pelea(caballero.getPrecision())==1)
                    {
                        mago.atacado(caballero.getAtaque());
                    }else
                    {
                        mago.evitar();
                    }
                    caballero.superDefensa();
                    caballero.setDefensa(mago.reducirDefensas(caballero.getDefensa()));
                    mago.aumentarAtaque();
                    mago.curacion();
                }
                if(caballero.vive()) caballero.ganador();
                else mago.ganador();
                break;
            }
            case "CB":
            {
                while(guerrero.vive()&&mago.vive())
                {
                    ronda++;
                    System.out.println();
                    System.out.println("Ronda #"+ronda);
                    if(pelea(mago.getPrecision())==1)
                    {
                        guerrero.atacado(mago.getAtaque());
                    }else
                    {
                        guerrero.evitar();
                    }
                    if(pelea(guerrero.getPrecision())==1)
                    {
                        mago.atacado(guerrero.getAtaque());
                    }else
                    {
                        mago.evitar();
                    }
                    guerrero.superAtaque();
                    caballero.setDefensa(mago.reducirDefensas(caballero.getDefensa()));
                    mago.aumentarAtaque();
                    mago.curacion();
                }
                if(guerrero.vive()) guerrero.ganador();
                else mago.ganador();
                break;
            }
            case "CD":
            {
                while(computadora.vive()&&mago.vive())
                {
                    ronda++;
                    System.out.println();
                    System.out.println("Ronda #"+ronda);
                    if(pelea(mago.getPrecision())==1)
                    {
                        computadora.atacado(mago.getAtaque());
                    }else
                    {
                        computadora.evitar();
                    }
                    if(pelea(computadora.getPrecision())==1)
                    {
                        mago.atacado(computadora.getAtaque());
                    }else
                    {
                        mago.evitar();
                    }
                    computadora.aumentoPrecision();
                    caballero.setDefensa(mago.reducirDefensas(caballero.getDefensa()));
                    mago.aumentarAtaque();
                    mago.curacion();
                }
                if(computadora.vive()) computadora.ganador();
                else mago.ganador();
                break;
            }
            default:
            {
                System.out.println("Las opciones que ingresaste no estan disponlibles... intenta ingresar al juego otra vez");
                break;
            }
        }       
    }
    public static int pelea(double ta)
    {
        Random r = new Random();
        int flag = 0; //Significa que no hay ataque
        
        int a = r.nextInt(100);
        
        if(a< (int)(ta*100)){
            flag =1;
        }
        
        return flag;
    }
}
