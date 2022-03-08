/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characterstrategy.i.impl;

import characterstrategy.i.WeaponBehavior;

/**
 *
 * @author nhendrix1
 */
public class WandBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Cast Fire Flare!");
    }
}