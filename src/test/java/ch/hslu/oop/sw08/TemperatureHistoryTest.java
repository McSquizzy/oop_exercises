/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.oop.sw08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lmettler
 */
public class TemperatureHistoryTest {

    /**
     * Test of addTemperature method, of class TemperatureHistory.
     */
    @Test
    public void testAddTemperature() {
        Temperature temp1 = new Temperature(30f);
        
        TemperatureHistory history = new TemperatureHistory();
        history.addTemperature(temp1);
        assertEquals(1, history.getCount());
    }

    /**
     * Test of clearTemperature method, of class TemperatureHistory.
     */
    @Test
    public void testClearTemperature() {
        Temperature temp1 = new Temperature(30f);
        Temperature temp2 = new Temperature(12f);
        TemperatureHistory history = new TemperatureHistory();
        history.addTemperature(temp1);
        history.addTemperature(temp2);
        history.clearTemperature();
        assertEquals(0, history.getCount());
    }

    /**
     * Test of getCount method, of class TemperatureHistory.
     */
    @Test
    public void testGetCount() {
        TemperatureHistory history = new TemperatureHistory();
        TemperatureHistory history1 = new TemperatureHistory();
        Temperature temp1 = new Temperature(13f);
        history.addTemperature(temp1);
        history1.addTemperature(temp1);
        assertEquals(history.getCount(), history1.getCount());
    }
    
}
