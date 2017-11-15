/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import model.Player;

/**
 *
 * @author elizabeth
 */
public class Ui {

    public static void menu() {
        System.out.println("Cast a Spell:\n");
        System.out.println("(A)rmor \n(D)amage \n(H)ealth \n(Q)uit \n:");
    }
    
    public static void partyStats(Player c, Player m, Player w) {
        System.out.println("Party Stats:\n");
        System.out.println(String.format("%20s %7s %10s", "Cleric","Mage","Warrior"));
        System.out.println(String.format("Armor %14s %7s %10s",c.getArmor(),m.getArmor(),w.getArmor()));
        System.out.println(String.format("Damage %13s %7s %10s",c.getDamage(),m.getDamage(),w.getDamage()));
        System.out.println(String.format("Health %13s %7s %10s\n\n",c.getHealth(),m.getHealth(),w.getHealth()));
        
    }
}
