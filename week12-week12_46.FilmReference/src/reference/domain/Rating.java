/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */
package reference.domain;

/**
 *
 * @author kchatman
 */

public enum Rating {
    BAD(-5),
    MEDIOCRE(-3),
    NOT_WATCHED(0),
    NEUTRAL(1),
    FINE(3),
    GOOD(5);
    
    int value;
    
    private Rating(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return value;
    }
}
