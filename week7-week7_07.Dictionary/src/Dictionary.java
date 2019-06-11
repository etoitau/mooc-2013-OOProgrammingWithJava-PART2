
import java.util.ArrayList;
import java.util.HashMap;

/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class Dictionary {
    private HashMap<String, String> dictionary;
    
    public Dictionary() {
        dictionary = new HashMap<String, String>();
    }
    
    public void add(String word, String translation) {
        dictionary.put(word, translation);
    }
    
    public String translate(String word) {
        return dictionary.get(word);
    }
    
    public int amountOfWords() {
        return dictionary.size();
    }
    
    public ArrayList<String> translationList() {
        ArrayList<String> out = new ArrayList<String>();
        for (String word : dictionary.keySet()) {
            out.add(word + " = " + dictionary.get(word));
        }
        return out;
    }
}
