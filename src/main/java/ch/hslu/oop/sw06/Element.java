/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.oop.sw06;

/**
 *
 * @author lmettler
 */
public abstract class Element { 
    
    protected String name;
    
    public static void main(String[] args) {
        
        Element element = new Mercury(); //Element: statischer Datentyp, Mercury: dynamischer Datentyp
        System.out.println(element.getPhase(23));
        System.out.println(element.toString());
    }
    
    public String getPhase(float celsius) {
        
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
    
    @Override
    public String toString() {
        return "";
    }
    
}
