/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Vector;

/**
 *
 * @author elizabeth
 */
public class SpellsEngine {
    
    private Vector<Player> subscribers;

    public SpellsEngine() {
        subscribers = new Vector<>(5);
    }
    
    public void subscribe(Player player) {
        subscribers.add(player);
    }
    
    public void publish(String type) {
        for(int x = 0; x < subscribers.size(); x++){
            subscribers.get(x).doStuff(type);
        }
    }
    
    public void unsubscribe(Player player) {
        subscribers.removeElement(player);
    }
}
