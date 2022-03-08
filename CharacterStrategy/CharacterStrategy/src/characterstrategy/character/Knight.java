/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characterstrategy.character;

import characterstrategy.i.impl.SwordBehavior;

/**
 *
 * @author dblackburn
 */
public class Knight extends Character {

    
    public Knight() {
        weaponBehavior = new SwordBehavior();
    }

    @Override
    public void display() {
        System.out.println("I was knighted by the queen.");
    }

    @Override
    public String getClassName() {
        return "Knight";
    }
    
}
