
package characterstrategy.i.impl;

import characterstrategy.i.WeaponBehavior;


public class BowBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Arrow Shot!");
    }

}
