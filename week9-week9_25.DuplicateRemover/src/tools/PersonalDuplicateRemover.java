/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

package tools;

import java.util.HashSet;
import java.util.Set;

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class PersonalDuplicateRemover implements DuplicateRemover {
    private Set<String> set;
    private int count = 0;
    
    public PersonalDuplicateRemover() {
        set = new HashSet<String>();
    }
    
    @Override
    public void add(String characterString) {
        if (set.contains(characterString))
            count++;
        set.add(characterString);
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return count;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return set;
    }

    @Override
    public void empty() {
        set.clear();
        count = 0;
    }

}
