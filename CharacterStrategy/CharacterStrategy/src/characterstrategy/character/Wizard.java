/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characterstrategy.character;

import characterstrategy.i.impl.WandBehavior;

/**
 *
 * @author nhendrix1
 */
public class Wizard extends Character {
    
    public Wizard () {
        weaponBehavior = new WandBehavior();
    }
    
    @Override
    public void display() {
        System.out.println("I trained to gain control of the four elements.");
    }

    @Override
    public String getClassName() {
        return "Wizard";
    }
    
}
