/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.oop.sw04;

/**
 * Interface für Schalter (on oder off)
 * @author lmettler
 */
public interface Switchable {
    
    void switchOn(); //Schalter an
    
    void switchOff(); //Schalter aus
    
    boolean isSwitchedOn(); //ist der Schalter an? true/false
    
    boolean isSwitchedOff(); //ist der Schalter aus? true/false
}
