/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.oop.sw03.ifelse;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lmettler
 */
public class DemoTest {
    
    public DemoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of max method, of class Demo.
     */
    @Test
    public void testMax() {
        Demo instance = new Demo();
        assertEquals(5, instance.max(5, -1));
    }

    /**
     * Test of min method, of class Demo.
     */
    @Test
    public void testMin() {
        Demo instance = new Demo();
        assertEquals(-1, instance.min(0, -1));
    }

    /**
     * Test of max1 method, of class Demo.
     */
    @Test
    public void testMax1() {
        Demo instance = new Demo();
        assertEquals(1, instance.max1(1, 0, -1));
    }

    /**
     * Test of max2 method, of class Demo.
     */
    @Test
    public void testMax2() {
        Demo instance = new Demo();
        assertEquals(-1, instance.max2(-1, -2, -3));
    }
    
}
