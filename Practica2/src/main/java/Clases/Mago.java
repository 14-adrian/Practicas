
package Clases;

/**
 *
 * @author Leonidas Mendoza
 */
public class Mago extends Personaje{
    private int cont = 5;
    public Mago(){
        super("Mago", 75, 30, 20, 60);
    }
    public int reducirDefensas(int defRival){
        System.out.println("Descomponer");
        int reduccion = defRival/3;
        return reduccion;
    }
    public void aumentarAtaque(){
        if(cont > 0){
            System.out.println("Miagio");
            super.setAtaque(super.getAtaque()+10);
            this.cont--;
        }
        else System.out.println("Solo puedo hacer el hecizo 5 veces");
    }
    public void curacion(){
        System.out.println("Curacion");
        super.setSalud(super.getSalud()+10);
    }
}
