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
public class TemperatureTest {
    
    /**
     * Test of equalsVerify method
     * verify whether the contract for equals and hashCode methods is met
     */
    @Test
    public void equalsVerify() {
        EqualsVerifier.forClass(Temperature.class).suppress(Warning.NONFINAL_FIELDS).suppress(Warning.ALL_FIELDS_SHOULD_BE_USED).verify(); 
        //Warning cause of mutable variable celsius and field "element" not used
    }
    
    /**
     * Test of equals method
     */
    @Test
    public void testEqualsIdentity() {
        Temperature temp1 = new Temperature(23);
        Temperature temp2 = temp1;
        assertEquals(true, temp1.equals(temp2));
    }
    @Test
    public void testEqualsWrongType() {
        Temperature temp1 = new Temperature(23);
        Object temp2 = new Object();
        assertEquals(false, temp1.equals(temp2));
    }
    
    @Test
    public void testEqualsNull() {
        Temperature temp1 = new Temperature(23);
        assertEquals(false, temp1.equals(null));
    }
    
    @Test
    public void testEqualsTrue() {
        Temperature temp1 = new Temperature(23);
        Temperature temp2 = new Temperature(23);
        assertEquals(true, temp1.equals(temp2));
    }
    
    @Test
    public void testEqualsFalse() {
        Temperature temp1 = new Temperature(23);
        Temperature temp2 = new Temperature(-23);
        assertEquals(false, temp1.equals(temp2));
    }

    
    /**
     * Test of hashCode method
     */
    @Test
    public void testHashCode() {
        Temperature temp1 = new Temperature(23);
        Temperature temp2 = new Temperature(23);
        assertEquals(temp1.hashCode(), temp2.hashCode());
    }
    
    @Test
    public void testHastCodeNotequal() {
        Temperature temp1 = new Temperature(23);
        Temperature temp2 = new Temperature(-23);
        assertNotEquals(temp1.hashCode(), temp2.hashCode());
    }
}
