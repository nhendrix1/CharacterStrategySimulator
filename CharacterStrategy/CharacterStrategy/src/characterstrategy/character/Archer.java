/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characterstrategy.character;

import characterstrategy.i.impl.BowBehavior;

/**
 *
 * @author nhendrix1
 */
public class Archer extends Character{
        public Archer () {
        weaponBehavior = new BowBehavior();
    }

    @Override
    public void display() {
        System.out.println("My father taught me to be an apex predator!");
    }

    @Override
    public String getClassName() {
       return "Archer";
    }
}
