/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.oop.sw07;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lmettler
 */
public class PointTest {
    
    /**
     * Test of equalsVerify method
     * verify whether the contract for equals and hashCode methods is met
     */
    @Test
    public void equalsVerify() {
        EqualsVerifier.forClass(Point.class).suppress(Warning.NONFINAL_FIELDS).verify(); //Warning cause of mutable variables x and y
    }
    
    /**
     * Test of equals method
     */
    @Test
    public void testEqualsIdentity() {
        Point point1 = new Point(1, 2);
        Point point2 = point1;
        assertEquals(true, point1.equals(point2));
    }
    
    @Test
    public void testEqualsWrongType() {
        Point point1 = new Point(1, 2);
        Object point2 = new Object();
        assertEquals(false, point1.equals(point2));
    }
    
    @Test
    public void testEqualsNull() {
        Point point = new Point(1, 2);
        assertEquals(false, point.equals(null));
    }
    
    @Test
    public void testEqualsTrue() {
        Point point1 = new Point(1, 2);
        Point point2 = new Point(1, 2);
        assertEquals(true, point1.equals(point2));
    }
    
    @Test
    public void testEqualsFalse() {
        Point point1 = new Point(1, 2);
        Point point2 = new Point(2, 1);
        assertEquals(false, point1.equals(point2));
    }

    
    /**
     * Test of hashCode method
     */
    @Test
    public void testHashCode() {
        Point point1 = new Point(1, 2);
        Point point2 = new Point(1, 2);
        assertEquals(point1.hashCode(), point2.hashCode());
    }
    
    @Test
    public void testHastCodeNotequal() {
        Point point1 = new Point(1, 2);
        Point point2 = new Point(2, 1);
        assertNotEquals(point1.hashCode(), point2.hashCode());
    }
    
}
