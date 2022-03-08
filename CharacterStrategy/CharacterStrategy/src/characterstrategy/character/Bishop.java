
package characterstrategy.character;

import characterstrategy.i.impl.StaffBehavior;

/**
 *
 * @author nhendrix1
 */
public class Bishop extends Character {
    
    public Bishop () {
        weaponBehavior = new StaffBehavior();
    }

    @Override
    public void display() {
        System.out.println("I receive my divine power from the creator, Omegan.");
    }

    @Override
    public String getClassName() {
        return "Bishop";
    }
    
}