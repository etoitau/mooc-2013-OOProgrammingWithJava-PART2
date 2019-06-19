/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

package personnel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class Employees {
    List<Person> people;
    
    public Employees() {
        people = new ArrayList<Person>();
    }
    
    public void add(Person person) {
        people.add(person);
    }
    
    public void add(List<Person> persons) {
        people.addAll(persons);
    }
    
    public void print() {
        Iterator<Person> it = people.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
    
    public void print(Education education) {
        Iterator<Person> it = people.iterator();
        while (it.hasNext()) {
            Person nextPerson = it.next();
            if (nextPerson.getEducation() == education) {
                System.out.println(nextPerson);
            }
        }
    }
    
    public void fire(Education education) {
        Iterator<Person> it = people.iterator();
        while (it.hasNext()) {
            Person nextPerson = it.next();
            if (nextPerson.getEducation() == education) {
                it.remove();
            }
        }
    }
}
