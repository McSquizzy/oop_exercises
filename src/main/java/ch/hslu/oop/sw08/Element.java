/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.oop.sw08;

import java.util.Objects;

/**
 *
 * @author lmettler
 */
public abstract class Element { 
    
    protected String name;
    protected Temperature temp;
    
    public static void main(String[] args) {
        
        Element element = new Mercury(357f); //Element: statischer Datentyp, Mercury: dynamischer Datentyp
        System.out.println(element.toString());
    }
    
    /**
     * Constructor of class Element
     * @param temp
     */
    public Element(float temp) {
        this.temp = new Temperature(temp);
    }
    
    public ElementPhase getPhase(float temp) {
        
        if (temp >= getBoilingTemp()) {
            return ElementPhase.GAS;
        } else if (temp >= getMeltingTemp()) {
            return ElementPhase.LIQUID;
        } else {
            return ElementPhase.SOLID;
        }
    }
    
    /**
     * Methods to override if class extends Element class
     * @return 
     */
    public abstract float getBoilingTemp();
    
    public abstract float getMeltingTemp();


    /**
     * Override methods
     * @return 
     */
    @Override
    public String toString() {
        return "Element: " + name + " Temperatur: " + temp.getCelsius() + " °C Phase: " + this.getPhase(temp.getCelsius());
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
        if (!(object instanceof Element)) {          //Test auf denselben Typ und nicht null
            return false;
        }
        final Element other = (Element) object;   //Vergleich der Attributwerte
        return (Objects.equals(other.name, this.name));
    }
    
}
