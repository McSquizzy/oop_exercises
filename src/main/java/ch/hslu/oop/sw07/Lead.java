/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.oop.sw07;

/**
 *
 * @author lmettler
 */
public class Lead extends Element {

    float boilingTemp;
    float meltingTemp;
    
    public Lead() {
        super("Lead");
    }
    
    @Override
    public float getBoilingTemp() {
        return this.boilingTemp = 327.46f;
    }
    
    @Override
    public float getMeltingTemp() {
        return this.meltingTemp = 1749f;
    }
    
}