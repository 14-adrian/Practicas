/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameoop;

/**
 *
 * @author amand
 */
//Mago
public class Magician extends GameUtil {
    public Magician()
    {
        name = "Mago";
        life = 50;
        attack =25;
        defense =15;
        hr=0.75;
    }

    @Override
    public void evita() {
        System.out.println(this.name+" uso su varita magica y logro desviaar el ataque!!"); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
