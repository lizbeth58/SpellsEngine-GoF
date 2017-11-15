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
public class DamageSpell extends Spell{

    public DamageSpell(Player player) {
        this.player = player;
    }
    
    @Override
    protected void doSpell() {
        player.addDamage(1);
    }
    
}
