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
public class PersonTest {

    /**
     * Test constructor of class Person
     */
    @Test
    public void testPersonId() {
        Person person = new Person(1, "Max", "Muster");
        assertEquals(1, person.getId());
    }
    
    @Test
    public void testPersonFirstname() {
        Person person = new Person(1, "Max", "Muster");
        assertEquals("Max", person.getFirstname());
    }
    
    @Test
    public void testPersonLastname() {
        Person person = new Person(1, "Max", "Muster");
        assertEquals("Muster", person.getLastname());
    }
    
    /**
     * Test of getId method of class Person.
     */
    @Test
    public void testGetId() {
        Person person1 = new Person(1, "Hans", "Muster");
        Person person2 = new Person(2, "Chris", "Grein");
        assertNotEquals(person1.getId(), person2.getId());
    }

    /**
     * Test of getFirstname method of class Person.
     */
    @Test
    public void testGetFirstname() {
        Person person = new Person(1, "Max", "Muster");
        assertEquals("Max", person.getFirstname());
    }

    /**
     * Test of getLastname method of class Person.
     */
    @Test
    public void testGetLastname() {
        Person person = new Person(1, "Max", "Muster");
        assertEquals("Muster", person.getLastname());
    }
       
    /**
     * Test of equalsVerify method, of class Person.
     * verify whether the contract for equals and hashCode methods is met
     */
    @Test
    public void equalsVerify() {
        EqualsVerifier.forClass(Person.class).withOnlyTheseFields("id").verify(); //Warning cause of firstname and lastname not used in method equals
    }
    
    /**
     * Test of equals method
     */
    @Test
    public void testEqualsIdentity() {                      //object == this
        Person person = new Person(1, "Max", "Muster");
        Person person2 = person;
        assertEquals(true, person.equals(person2));
    }
    
    @Test
    public void testEqualsWrongType() {                     //!(object instanceof Person)
        Person person = new Person(1, "Max", "Muster");
        Object person2 = new Object();
        assertEquals(false, person.equals(person2));
    }
    
    @Test
    public void testEqualsNull() {                          //x.equals(null) liefert false
        Person person = new Person(1, "Max", "Muster");
        assertEquals(false, person.equals(null));
    }
    
    @Test
    public void testEqualsTrue() {
        Person person = new Person(1, "Max", "Muster");
        Person person2 = new Person(1, "Fredi", "Keller");
        assertEquals(true, person.equals(person2));
    }
    
    @Test
    public void testEqualsFalse() {
        Person person = new Person(1, "Max", "Muster");
        Person person2 = new Person(2, "Max", "Muster");
        assertEquals(false, person.equals(person2));
    }

    /**
     * Test of hashCode method
     */
    @Test
    public void testHashCode() {
        Person person1 = new Person(1, "Luke", "Miller");
        Person person2 = new Person(1, "Fredi", "Keller");
        assertEquals(person1.hashCode(), person2.hashCode());
    }
    
    @Test
    public void testHastCodeNotequal() {
        Person person1 = new Person(1, "Luke", "Miller");
        Person person2 = new Person(2, "Fredi", "Keller");
        assertNotEquals(person1.hashCode(), person2.hashCode());
    }
    
    /**
     * 
     * 3 test cases of compareTo() method
     */
    @Test
    public void testCompareToLower() {
        Person person1 = new Person(1, "Max", "Muster");
        Person person2 = new Person(2, "Max", "Muster");
        assertEquals(-1, person1.compareTo(person2) );  //Id of person 1 should be lower than id of person2 (=> -1)
    }
    
    @Test
    public void testCompareToHigher() {
        Person person1 = new Person(1, "Max", "Muster");
        Person person2 = new Person(2, "Max", "Muster");
        assertEquals(1, person2.compareTo(person1) );  //Id of person 2 should be higher than id of person1 (=> 1)
    }
    
    @Test
    public void testCompareToZero() {
        Person person1 = new Person(1, "Max", "Muster");
        assertEquals(0, person1.compareTo(person1) );  //Id of person 1 should be the same as id of person1 (=> 0)
    }
}
