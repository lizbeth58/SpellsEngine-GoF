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
public class SpellsFactory {
    
    private static SpellsFactory instance = null;
    
    public static SpellsFactory getInstance() {
        if(instance == null){
            instance = new SpellsFactory();
        }
        return instance;
    }
    
    public Spell requestSpell(Player player, String type) {
        
        if(type.equals("ArmorSpell")){    
            ArmorSpell spell = new ArmorSpell(player);
            return spell;
        }
        
        if(type.equals("DamageSpell")){    
            DamageSpell spell = new DamageSpell(player);
            return spell;
        }
        
        if(type.equals("HealthSpell")){    
            HealthSpell spell = new HealthSpell(player);
            return spell;
        }
        
        return null;
    }
}
