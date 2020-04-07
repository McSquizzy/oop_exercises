/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.oop.sw06;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lmettler
 */
public class CalculatorImplementedTest {

    /**
     * Test of addition method, of class CalculatorImplemented.
     */
    @Test
    public void testAddition() {
        CalculatorImplemented instance = new CalculatorImplemented();
        assertEquals(3, instance.addition(1, 2));
    }
    
    @Test
    public void testAdditionZero() {
        CalculatorImplemented instance = new CalculatorImplemented();
        assertEquals(0, instance.addition(0, 0));
    }
    
    @Test
    public void testAdditionNegative() {
        CalculatorImplemented instance = new CalculatorImplemented();
        assertEquals(-21, instance.addition(-1, -20));
    }
    
}
