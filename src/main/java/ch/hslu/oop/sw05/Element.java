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
public abstract class Element { 
    
    //protected float meltingTemp;
    //protected float boilingTemp;
    protected String name;
    
    public static void main(String[] args) {
        
        Element mercury = new Mercury();
        System.out.println(mercury.getPhase(23));
    }
    
    public final String getPhase(float celsius) {
        
        if (celsius >= getBoilingTemp()) {
            return "gasförmig";
        } else if (celsius >= getMeltingTemp()) {
            return "flüssig";
        } else {
            return "fest";
        }
    }
    
    public abstract float getBoilingTemp();
    
    public abstract float getMeltingTemp();

}
