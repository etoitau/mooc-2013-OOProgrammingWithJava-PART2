/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

package dictionary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {
    private Map<String, Set<String>> dict;
    
    public PersonalMultipleEntryDictionary() {
        dict = new HashMap<String, Set<String>>();
    }
            
    @Override
    public void add(String word, String entry) {
        if ( !dict.containsKey(word) ) {
            dict.put(word, new HashSet<String>());
        }
        dict.get(word).add(entry);
    }

    @Override
    public Set<String> translate(String word) {
        return dict.get(word);
    }

    @Override
    public void remove(String word) {
        dict.remove(word);
    }

}
