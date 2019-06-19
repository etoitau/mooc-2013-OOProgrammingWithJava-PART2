/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

package reference.comparator;

import java.util.Comparator;
import java.util.Map;
import reference.domain.Person;

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class PersonComparator implements Comparator<Person> {
    private Map<Person, Integer> peopleIdentities;
    
    public PersonComparator(Map<Person, Integer> peopleIdentities) {
        this.peopleIdentities = peopleIdentities;
    }
    
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.equals(o2))
            return 0;
        if (peopleIdentities.get(o1).equals(peopleIdentities.get(o2)))
            return 0;
        if (peopleIdentities.get(o1) < peopleIdentities.get(o2))
            return 1;
        return -1;
    }

}
