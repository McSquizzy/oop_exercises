/**
 * 
 * @author Lukas Mettler
 * @version (a version number or a date)
 */

package ch.hslu.oop.sw06;

import java.util.Scanner;

public final class Temperature
{
    private float celsius;
    private String element;
    private String phase;
    
    public static void main(String[] args) {
        
        Temperature temp = new Temperature(0);
        
        System.out.println("Set temperature in grad celsius: ");
        temp.setCelsius();
                
        System.out.println("choose an element (N, Hg or Pb): ");
        temp.setElement();
        
        temp.getPhase();
        
        System.out.println(temp.toString());
    }
    
    /**
     * Constructor for objects of class Temperatur
     * @param celsius 
     */
    public Temperature(final float celsius)
    {
        this.celsius = celsius;
    }

    /**
     * set temperature in Grad Celsius
     */
    public final void setCelsius() {
        Scanner input = new Scanner(System.in);
        this.celsius = input.nextFloat();
    }
    
    public final void setElement() {
        Scanner input = new Scanner(System.in);
        this.element = input.nextLine();
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

    //Einfache Ausführung ohne Übergabe der Temperature in Celsius
    public String getAggregatifElse(final String element) {
        if (element.equals("N") || element.equals("n")){
            return "gasförmig";
        } else if (element.equals("Hg") || element.equals("hg")){
            return "flüssig";
        } else if (element.equals("Pb") || element.equals("pb")){
            return "fest";
        } else {
            return "Ungültige Eingabe";
        }
    }

    @Override
    public String toString() {
        return "Temperatur{" + "celsius=" + celsius + ", element=" + element + ", phase=" + phase + '}';
    }
    
}