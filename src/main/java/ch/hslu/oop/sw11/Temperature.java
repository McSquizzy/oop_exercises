/**
 * 
 * @author Lukas Mettler
 * @version (a version number or a date)
 */

package ch.hslu.oop.sw11;

import java.util.Objects;
import java.util.Scanner;

public final class Temperature implements Comparable<Temperature>
{
    private float celsius;
    public static final float KELVIN_OFFSET = 273.15f;
    
    /**
     * Constructor for class Temperature
     * @param celsius 
     */
    public Temperature(final float celsius) {
        this.celsius = celsius;
    }

    /**
     * set temperature in Grad Celsius
     */
    public void setCelsius() {
        Scanner input = new Scanner(System.in);
        this.celsius = input.nextFloat();
    }

    public void setCelsius(float celsius) {
        this.celsius = celsius;
    }

    /**
     * return temperatures
     * @return 
     */
    public float getCelsius() {
        return this.celsius;
    }

    public float getKelvin() {
        return convertCelsiustoKelvin(this.celsius);
    }

    public float getFahrenheit() {
        return this.celsius * 1.8f + 32;
    }

    /**
     * convert methods
     * @param celsius
     * @return 
     */
    public static float convertCelsiustoKelvin(float celsius) {
        return celsius + Temperature.KELVIN_OFFSET;
    }
    
    /**
     * 
     * @param kelvin
     * @return 
     */
    public static float convertKelvintoCelsius(float kelvin) {
        return kelvin - Temperature.KELVIN_OFFSET;
    }
    
    @Override
    public String toString() {
        return "Temperatur{" + "celsius=" + celsius + '}';
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(this.celsius);
    }

    @Override
    public final boolean equals(Object object) {
        if (object == this) {                           //Test auf Identität
            return true;
        }
        if (!(object instanceof Temperature)) {          //Test auf denselben Typ und nicht null
            return false;
        }
        final Temperature other = (Temperature) object;   //Vergleich der Attributwerte
        return (0 == Float.compare(other.celsius, this.celsius));   //never use "==" for float --> use float.compare
    }

    @Override
    public int compareTo(Temperature other) {
        return Float.compare(this.celsius, other.celsius);
    }   
}