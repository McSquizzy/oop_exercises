/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.oop.sw07;

import java.util.Objects;

/**
 *
 * @author lmettler
 */
public abstract class Element { 
    
    protected String name;
    
    public static void main(String[] args) {
        
        Element element = (Element) new Mercury(); //Element: statischer Datentyp, Mercury: dynamischer Datentyp
        System.out.println(element.getPhase(23));
        System.out.println(element.toString());
    }
    
    /**
     * Constructor of class Element
     * @param name 
     */
    public Element(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "Element{" + "name=" + name + '}';
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(this.name);
    }

    @Override
    public final boolean equals(Object object) {
        if (object == this) {                           //Test auf Identität
            return true;
        }
        if (!(object instanceof Element)) {             //Test auf denselben Typ und nicht null
            return false;
        }
        final Element other = (Element) object;
        return (Objects.equals(this.name, other.name)); //Vergleich der Attributwerte
    }
    
}
