 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.oop.sw07;

import java.util.Comparator;

/**
 *
 * @author lmettler
 */
public class PersonNameComparator implements Comparator<Person> {

    /**
     * method compare sort by lastname, then firstname
     * @param p1
     * @param p2
     * @return
     */
    @Override
    public int compare(Person p1, Person p2) {
        int compare = p1.getLastname().compareTo(p2.getLastname()); //-1, 0 or 1
        if (compare == 0) {
            compare = p1.getFirstname().compareTo(p2.getFirstname());
        }
        return compare;
    }
    
}
