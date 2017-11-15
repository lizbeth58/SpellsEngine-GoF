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
public class ArmorSpell extends Spell{

    public ArmorSpell(Player player) {
        this.player = player;
    }

    @Override
    protected void doSpell() {
        player.addArmor(3);
    }
    
    
    
}
