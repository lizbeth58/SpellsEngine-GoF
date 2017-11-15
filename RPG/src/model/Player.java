/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author elizabeth
 */
public class Player {
    
    private int armor;
    private int damage;
    private int health;

    public Player() {
        this.armor = 0;
        this.damage = 1;
        this.health = 10;
    }
    
    public void doStuff(String type) {
        SpellsFactory.getInstance().requestSpell(this, type).doSpell();
    }
    
    public void addArmor(int armor) {
        this.armor += armor;
    }

    public int getArmor() {
        return armor;
    }

    public void addDamage(int damage) {
        this.damage += damage;
    }

    public int getDamage() {
        return damage;
    }
    
    public void addHealth(int health) {
        this.health += health;
    }

    public int getHealth() {
        return health;
    }
}
