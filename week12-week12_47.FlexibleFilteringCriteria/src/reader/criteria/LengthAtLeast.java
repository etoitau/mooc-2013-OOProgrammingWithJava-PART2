/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

package reader.criteria;

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class LengthAtLeast implements Criterion {
    private int length;
    
    public LengthAtLeast(int length) {
        this.length = length;
    }
    
    @Override
    public boolean complies(String line) {
        return line.length() >= length;
    }

}
