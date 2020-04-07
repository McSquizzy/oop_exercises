/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.oop.sw10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author lmettler
 */
public class TempHistoryTest {
    private final Collection<Temperature> history = new ArrayList<>();
    
    public void addTemp(Temperature temp) {
        history.add(temp);
    }
    
    public float getMin() {
        return Collections.min(history).getCelsius();
    }
    
    public float getMax() {
        return Collections.max(history).getCelsius();
    }
    
    public static void main(String[] args) {
        TempHistoryTest obj = new TempHistoryTest();
        Temperature temp = new Temperature(23f);
        Temperature temp1 = new Temperature(12f);
        obj.addTemp(temp);
        obj.addTemp(temp1);
        obj.getMin();
        obj.getMax();
    }
    
}
