/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characterstrategy.character;

import characterstrategy.i.WeaponBehavior;

/**
 *
 * @author dblackburn
 */
public abstract class Character {
    
    protected WeaponBehavior weaponBehavior;

    
    public void fight() {
        weaponBehavior.useWeapon();
    }
    
    public void setWeapon(WeaponBehavior behavior) {
        weaponBehavior = behavior;
    }

    public abstract void display();
    public abstract String getClassName();
}
