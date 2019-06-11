
import java.util.ArrayList;

/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class Changer {
    ArrayList<Change> changes;
    
    public Changer() {
        this.changes = new ArrayList<Change>();
    }
    
    public void addChange(Change change) {
        this.changes.add(change);
    }
    
    public String change(String characterString) {
        for (Change Change : changes) {
            characterString = Change.change(characterString);
        }
        return characterString;
    }
    
}
