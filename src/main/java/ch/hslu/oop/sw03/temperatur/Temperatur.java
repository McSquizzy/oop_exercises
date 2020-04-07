/**
 * Übung Klassen und Datentypen
 * 
 * @author Lukas Mettler
 * @version (a version number or a date)
 */

package ch.hslu.oop.sw03.temperatur;

import java.util.Scanner;

public final class Temperatur
{
    private float celsius;
    private String element;
    
    public static void main(String[] args) {
        
        Temperatur temp = new Temperatur(0);
        
        System.out.println("Set temperature in grad celsius: ");
        temp.setCelsius();
        System.out.printf("temperature (celsius) is: %f\n", temp.getCelsius());
        
        System.out.println("choose an element (N, Hg or Pb): ");
        temp.setElement();
        System.out.printf("Element: %s\n", temp.element);
        
        String phase = temp.getAggregatSwitch(temp.element);
        System.out.println(phase);
    }
    
    /**
     * Constructor for objects of class Temperatur
     * @param celsius 
     */
    public Temperatur(final float celsius)
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

    //Einfache Ausführung ohne Übergabe der Temperatur in Celsius
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
        return "Temperatur[celsius=" + this.celsius +"]";
    }
}