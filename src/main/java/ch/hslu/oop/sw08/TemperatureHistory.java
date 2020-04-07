/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.oop.sw08;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author lmettler
 */
public class TemperatureHistory {

    private final Collection<Temperature> history = new ArrayList<>();
    
    public void addTemperature(Temperature temp) {
        history.add(temp);
    }
    
    public void clearTemperature() {
        history.clear();
    }
    
    public int getCount() {
        return history.size();
    }
    
    public float getMaxTemp() {
        if (history.size() > 0) {
            return Collections.min(history).getCelsius();
        } else {
            return 0;
        }
    }
    
    public float getMinTemp() {
        if (history.size() > 0) {
            return Collections.max(history).getCelsius();
        } else {
            return 0;
        }
    }
    
    
    public float getAverageTemp() {
        if (history.size() > 0) {
            Iterator<Temperature> iterator = history.iterator();
            float sum = 0;
            while (iterator.hasNext()) {
                final Temperature next = iterator.next();
                sum += next.getCelsius();
            }
            return sum / getCount();
        } else {
            return 0;
        }
    }
    
    public static void main(String[] args) {
        TemperatureHistory obj = new TemperatureHistory();
        obj.addTemperature(new Temperature(12f));
        obj.addTemperature(new Temperature(85));
        obj.addTemperature(new Temperature(-200f));
        obj.addTemperature(new Temperature(0));
        System.out.println(obj.getAverageTemp());
        
        System.out.println(obj.getMinTemp());
        System.out.println(obj.getMaxTemp());
    }
    
}
