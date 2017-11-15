/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;

import View.Ui;
import java.util.Scanner;
import model.SpellsEngine;
import model.Player;

/**
 *
 * @author elizabeth
 */
public class driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        SpellsEngine spellsEngine = new SpellsEngine();
        Scanner in = new Scanner(System.in);
        String input;
        
        Player c = new Player();
        Player m = new Player();
        Player w = new Player();
        
        spellsEngine.subscribe(c);
        spellsEngine.subscribe(m);
        spellsEngine.subscribe(w);
        
        while(true){
            Ui.menu();
            
            input = in.nextLine();
            
            if(input.equals("q") == true || input.equals("Q") == true){
                break;
            }
            
            switch(input){
                case "A":
                case "a":
                    spellsEngine.publish("ArmorSpell");
                    break;
                case "D":
                case "d":
                    spellsEngine.publish("DamageSpell");
                    break;
                case "H":
                case "h":
                    spellsEngine.publish("HealthSpell");
                    break;
            }
            
            Ui.partyStats(c, m, w);   
        }
    }
    
}
