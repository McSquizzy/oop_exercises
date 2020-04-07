/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.oop.sw07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author lmettler
 */
public class TemperaturVerlauf {
    
    public static void main(String[] args) {
        
        final List<Temperature> verlauf = new ArrayList<>();
    
        verlauf.add(new Temperature(23f));
        verlauf.add(new Temperature(0.0f));
        verlauf.add(new Temperature(144f));
        
        Collections.sort(verlauf);
        
        System.out.println("Anzahl Messwerte: " + verlauf.size());
        
        //verlauf.set(1, new Temperature(55.3f));
        
        System.out.println("Zweiter Messwert: " + verlauf.get(1).getCelsius());
    }
    
}
