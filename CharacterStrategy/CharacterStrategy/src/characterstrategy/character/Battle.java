/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characterstrategy.character;

import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author nhendrix1
 */
public class Battle {
         public void doBattle() throws InterruptedException{
         System.out.println("Select name for Army 1");
         String nameSelect;
         Scanner scanner = new Scanner(System.in);
         nameSelect=scanner.nextLine();
         Army army1 = new Army(nameSelect);
         System.out.println("Select name for Army 2");
         nameSelect=scanner.nextLine();
         Army army2 = new Army(nameSelect);
         pickSoldiers(army1);
         pickSoldiers(army2);
         System.out.println("Select non-default weapons for Army 1? Y/N");
         nameSelect = scanner.nextLine();
         if (Objects.equals(nameSelect, "Y"))
             selectWeapons(army1);
         System.out.println("Select non-default weapons for Army 2? Y/N");
         nameSelect = scanner.nextLine();
         if (Objects.equals(nameSelect,"Y"))
             selectWeapons(army2);

             System.out.println("Battle will commence in \n 5");
         TimeUnit.SECONDS.sleep(1);
          System.out.println("4");
         TimeUnit.SECONDS.sleep(1);
          System.out.println("3");
         TimeUnit.SECONDS.sleep(1);
          System.out.println("2");
         TimeUnit.SECONDS.sleep(1);
          System.out.println("1");
         TimeUnit.SECONDS.sleep(1);
          System.out.println("0");
          death(army1, army2);
          
          
         }
         
         void death(Army army1,Army army2) throws InterruptedException {
             Random rand = new Random();
             String combatant1;
             String combatant2;
             Integer chance;
             while(army1.soldierList.isEmpty()==false && army2.soldierList.isEmpty()==false) {
                 chance = rand.nextInt(2);
                 //VeSystem.out.println(chance);
                 army1.soldierList.get(0).fight();
                 army2.soldierList.get(0).fight();
                 TimeUnit.SECONDS.sleep(1);
                 combatant1 = army1.soldierList.get(0).getClassName();
                 combatant2 = army2.soldierList.get(0).getClassName();
                 if (chance == 1) {
                     System.out.println(army1.name +"'s "+combatant1+" has slain "+army2.name+"'s "+combatant2);
                     army2.soldierList.remove(0);
                 }
                 else {
                     System.out.println(army2.name +"'s "+combatant2+" " +
                             "has slain "+army1.name+"'s "+combatant1);
                     army1.soldierList.remove(0);
                 }
                 TimeUnit.SECONDS.sleep(2);
             }
             if (army1.soldierList.isEmpty())
                 System.out.println(army1.name+" has fallen! "+army2.name+ " is victorious!");
             else
                 System.out.println(army2.name + " has fallen! " + army1.name + " is victorious!");
         }

         void selectWeapons(Army army){
             String weaponSelect;
             Scanner scanner = new Scanner(System.in);
             for(int i=0; i<5;i++){
                System.out.println("Select a Weapon for "+army.soldierList.get(i).getClassName()+
                        "\n Type \n 1 for Axe \n 2 For Bow \n 3 for Knife \n 4 for Staff \n 5 For Sword \n 6 for Wand");
                weaponSelect= scanner.nextLine();
                army.changeWeapon(weaponSelect,army.soldierList.get(i));

             }
         }

         void pickSoldiers(Army army){
            System.out.println("Pick 5 soldiers for " + army.name);
            String soldierSelect;
            Scanner scanner = new Scanner(System.in);
           
            System.out.println("Type \n 1 for Archer \n 2 For Bishop \n 3 for Knight \n 4 for Warrior \n 5 For Wizard");
            for(int i=0;i<5;i++){
                soldierSelect=scanner.nextLine();
                army.addSoldier(soldierSelect);
            }
        }

            

}
