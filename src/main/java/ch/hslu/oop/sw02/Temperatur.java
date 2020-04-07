
/**
 * Übung Klassen und Datentypen
 * 
 * @author Lukas Mettler
 * @version (a version number or a date)
 */

package ch.hslu.oop.sw02;

public final class Temperatur
{
    private float celsius;

    /**
     * 
     * @param celsius 
     * Constructor for objects of class Temperatur
     */
    public Temperatur(final float celsius) {
        //c = 20;
        this.celsius = celsius;
    }

    public static void main(String[] args) {
        
        Temperatur temp = new Temperatur(23);
        
        System.out.println(temp.getCelsius());
        System.out.println(temp.getKelvin());
        System.out.println(temp.getFahrenheit());
        
        temp.setCelsius(50);
        System.out.println(temp.getCelsius());
    }
    
    /**
     * 
     * @return celsius
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
    * set temperature in Grad Celsius
    */
    public void setCelsius(final float celsius) {
        this.celsius = celsius;
    }
}
