/**
 * 
 * @author Lukas Mettler
 * @version (a version number or a date)
 */

package ch.hslu.oop.sw07;

import java.util.Objects;
import java.util.Scanner;

public final class Temperature implements Comparable<Temperature>
{
    private float celsius;
    private String element;
    private String phase;
    
    public static void main(String[] args) {
        
        Temperature temp = new Temperature(0);
        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);
        
        System.out.println("Set temperature in grad celsius: ");
        temp.celsius = input.nextFloat();
                
        System.out.println("Choose an element (N, Hg or Pb): ");
        temp.element = input1.nextLine();
        
        temp.getPhase();
        
        System.out.println(temp.toString());
    }
    
    /**
     * Constructor for objects of class Temperatur
     * @param celsius 
     */
    public Temperature(final float celsius) {
        this.celsius = celsius;
    }
    
    public Temperature() {
        this(23f); //this ruft Konstruktor oben auf
    }

    /**
     * set temperature in Grad Celsius
     * @param celsius
     */
    public void setCelsius(final float celsius) {
        this.celsius = celsius;
    }
    
    public void setElement(final String element) {
        this.element = element;
    }

    /**
     * return temperatures
     * @return 
     */
    public float getCelsius() {
        return this.celsius;
    }

    public float getKelvin() {
        return celsius + 273.15f;
    }

    public float getFahrenheit() {
        return celsius * 1.8f + 32;
    }

    /**
     * return phase of element
     * @return 
     */
    public String getPhase() {
        return this.phase = getAggregatSwitch(element);
    }

    // d.)
    public String getAggregatSwitch(final String element) {
        
        switch (element){
        case "N":
            if (celsius >= -196f) {
                return "gasförmig";
            } else if (celsius >= -210.1f) {
                return "flüssig";
            } else {
                return "fest";
            }
        
        case "Hg":
            if (celsius >= 357f) {
                return "gasförmig";
            } else if (celsius >= -38.83f) {
                return "flüssig";
            } else {
                return "fest";
            }
        
        case "Pb":
            if (celsius >= 1744f) {
                return "gasförmig";
            } else if (celsius >= 327f) {
                return "gasförmig";
            } else {
                return "fest";
            }

        default:
            return "Ungültige Eingabe";
        }
    }
    
    @Override
    public String toString() {
        return "Temperatur{" + "celsius=" + celsius + ", element=" + element + ", phase=" + phase + '}';
    }

    @Override
    public final int hashCode() {
        return Objects.hash(this.celsius);
    }
    
    @Override
    public final boolean equals(final Object object) {
        if (object == this) {                           //Test auf Identität
            return true;
        }
        if (!(object instanceof Temperature)) {          //Test auf denselben TYP und nicht null
            return false;
        }
        final Temperature other = (Temperature) object;   //Vergleich der Attributwerte
        return (0 == Float.compare(this.celsius, other.celsius));   //never use "==" for float --> use float.compare
    }

    @Override
    public final int compareTo(Temperature other) {
        return Float.compare(this.celsius, other.celsius);
    }
    
}