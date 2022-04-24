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
//Guerrero
public class Soldier extends GameUtil{
    public Soldier()
    {
        name = "Guerrero";
        life = 100;
        attack =10;
        defense =12;
        hr=0.7;
    }

    @Override
    public void evita() {
        System.out.println(this.name+" realizo un salto y escapo!"); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
