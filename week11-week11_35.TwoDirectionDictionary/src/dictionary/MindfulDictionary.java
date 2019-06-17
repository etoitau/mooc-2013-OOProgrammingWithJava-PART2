/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

package dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class MindfulDictionary {
    private Map<String, String> finnEng, engFinn;
    private File file;
    
    public MindfulDictionary() {
        finnEng = new HashMap<String, String>();
        engFinn = new HashMap<String, String>();
    }
    
    public MindfulDictionary(String file) {
        this();
        this.file = new File(file);
    }
    
    public void add(String word, String translation) {
        if (!finnEng.containsKey(word)) {
            finnEng.put(word, translation);
            engFinn.put(translation, word);
        }  
    }
    
    public String translate(String word) {
        if (!finnEng.containsKey(word)) {
            if (!engFinn.containsKey(word)) {
                return null;
            }
            return engFinn.get(word);
        }
        return finnEng.get(word);
    }
    
    public void remove(String word) {
        if (finnEng.containsKey(word)) {
            engFinn.remove(finnEng.get(word));
            finnEng.remove(word);
        } else if (engFinn.containsKey(word)) {
            finnEng.remove(engFinn.get(word));
            engFinn.remove(word);
        }
    }
    
    public boolean load() {
        Scanner reader;
        try {
            reader = new Scanner(file);
        } catch (FileNotFoundException e) {
            return false;
        }
        while (reader.hasNext()) {
            String[] parts = reader.nextLine().split(":");
            finnEng.put(parts[0], parts[1]);
            engFinn.put(parts[1], parts[0]);
        }
        reader.close();
        return true;
    }
    
    public boolean save() {
        FileWriter writer;
        try {
            writer = new FileWriter(file);
            for (Map.Entry<String, String> entry : finnEng.entrySet()) {
                writer.write(entry.getKey() + ":" + entry.getValue() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            return false;
        }
        return true;
    }
}
