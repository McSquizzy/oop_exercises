/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.oop.sw05;

/**
 * Spezialisiertes Interface von Switchable für Abfrage der Anzahl Schaltvorgänge
 * @author lmettler
 */
public interface CountingSwitchable extends Switchable {
    
    long getSwitchCount();
    
}
