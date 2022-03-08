/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characterstrategy.character;

import characterstrategy.i.impl.AxeBehavior;

/**
 *
 * @author nhendrix1
 */
public class Warrior extends Character{
    
    public Warrior () {
        weaponBehavior = new AxeBehavior();
    }
    
    @Override
    public void display(){
        System.out.println("I wil bring honor to my clan!");
    }

    @Override
    public String getClassName() {
        return "Warrior";
    }
}


