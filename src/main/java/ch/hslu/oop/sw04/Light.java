/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.oop.sw04;

/**
 *
 * @author lmettler
 */
public final class Light implements Switchable {
    
    private int lumen;
    public static final int MAX_LUMEN = 1200; //Konstante

    /**
     * Constructors
     */
    public Light() {
        this.lumen = 0;
    }
    
    public Light(int lumen) {
        this.lumen = lumen;
    }
    
    @Override
    public void switchOn() {
        this.lumen = MAX_LUMEN;
    }

    @Override
    public void switchOff() {
        this.lumen = 0;
    }

    @Override
    public boolean isSwitchedOn() {
        return this.lumen != 0;
    }

    @Override
    public boolean isSwitchedOff() {
        return this.lumen == 0;
    }
    
}
