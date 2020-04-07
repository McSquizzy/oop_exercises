/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.oop.sw07;


import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author lmettler
 */
public class Person implements Comparable<Person>{
    
    private final long id; //Immutable
    private String firstname;
    private String lastname;
    
    public Person(long id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public static void main(String[] args) {
        Person person = new Person(1, "Luke", "Miller");
        System.out.println(person.toString());
        
        List<Person> list = new ArrayList<>();
        list.add(new Person(101,"Anton", "Alvarez"));  
        list.add(new Person(106,"Bob","Buhler"));  
        list.add(new Person(105,"Chris","Clabberlang"));
        list.add(new Person(113, "Alfred", "Schulz"));
        list.add(new Person(100, "Pablo", "Alvarez"));
        
        System.out.println("Anzahl Personen: " + list.size());
        
        Collections.sort(list, new PersonNameComparator());
        //Collections.sort(list);
        Iterator<Person> iterator = list.iterator();
        while (iterator.hasNext()) {
            Person pers = iterator.next();
            System.out.println(pers.toString());
        }
    }
    
    public final void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public final void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    @Override
    public final boolean equals(Object object) {
        if (object == this) {                   //Test auf Identität
            return true;
        }
        if (!(object instanceof Person)) {      //Test auf denselben Typ und nicht null
            return false;
        }
        
        final Person other = (Person) object;   //Vergleich der Attributwerte
        return (other.id == this.id);           //Vergleich der ID, weil diese unique ist
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(this.id);
    }
    
    @Override
    public int compareTo(Person other) {
        return Long.compare(this.id, other.id);
    }
    
    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + '}';
    }
    
}
