/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.oop.sw05;

/**
 *
 * @author lmettler
 */
public final class Engine implements Switchable {
    
    private int rpm;
    
    /**
     * Constructors
     * @param rpm
     */
    public Engine(int rpm) {
        this.rpm = rpm;
    }
    
    public Engine() {
        this(0);
    }
    
    /**
     * Override Methods
     */
    @Override
    public void switchOn() {
        if (this.isSwitchedOff()) {
            this.rpm = 1000;
        }
    }
    
    @Override
    public void switchOff() {
        if (this.isSwitchedOn()) {
            this.rpm = 0;
        }
    }
    
    @Override
    public boolean isSwitchedOn() {
        return this.rpm != 0;
    }
    
    @Override
    public boolean isSwitchedOff() {
        return this.rpm == 0;
    }
}