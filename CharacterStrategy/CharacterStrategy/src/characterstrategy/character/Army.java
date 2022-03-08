/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characterstrategy.character;

import characterstrategy.i.impl.BowBehavior;
import characterstrategy.i.impl.StaffBehavior;
import characterstrategy.i.impl.AxeBehavior;
import characterstrategy.i.impl.KnifeBehavior;
import characterstrategy.i.impl.SwordBehavior;
import characterstrategy.i.impl.WandBehavior;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nhendrix1
 */
public class Army {
    String name;
    protected List<Character> soldierList = new ArrayList<>();

    public Army(String n) {
        name=n;
    }
  
    
    void addSoldier(String ws){
                    Character tba;
                    switch(ws) {
                    case "1":
                        tba = new Archer();
                        break;
                    case "2":
                        tba = new Bishop();
                        break;
                    case "3":
                        tba = new Knight();
                        break;
                    case "4":
                        tba = new Warrior();
                        break;
                    case "5":
                        tba= new Wizard();
                        break;
                    default:
                        tba= new Knight();
                        break;
                    }
                    tba.display();
                    soldierList.add(tba);
                    System.out.println(tba.getClassName()+" added to "+ name);

    }

    void changeWeapon (String ws, Character character){
        String weapon;
        switch(ws) {
            case "1":
                weapon = "Axe";
                character.setWeapon(new AxeBehavior());
                break;
            case "2":
                weapon = "Bow";
                character.setWeapon(new BowBehavior());
                break;
            case "3":
                weapon = "Knife";
                character.setWeapon(new KnifeBehavior());
                break;
            case "4":
                weapon = "Staff";
                character.setWeapon(new StaffBehavior());
                break;
            case "5":
                weapon = "Sword";
                character.setWeapon(new SwordBehavior());
                break;
            case "6":
                weapon = "Wand";
                character.setWeapon(new WandBehavior());
            default:
                weapon = "Knife";
                character.setWeapon(new KnifeBehavior());
                break;
        }

        System.out.println(weapon+" added to "+ character.getClassName());
    }
}
    

