/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.oop.sw08;

/**
 *
 * @author lmettler
 */
public final class Nitrogen extends Element {

    float boilingTemp;
    float meltingTemp;
    
    public Nitrogen(float temp) {
        super(temp);
        super.name = "Nitrogen";
    }
    
    @Override
    public float getBoilingTemp() {
        return this.boilingTemp = -195.795f;
    }
    
    @Override
    public float getMeltingTemp() {
        return this.meltingTemp = -210f;
    }
}