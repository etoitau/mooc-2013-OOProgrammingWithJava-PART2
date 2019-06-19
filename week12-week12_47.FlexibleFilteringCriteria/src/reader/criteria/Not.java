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

public class Not implements Criterion {
    Criterion crit;
    
    public Not(Criterion crit) {
        this.crit = crit;
    }

    @Override
    public boolean complies(String line) {
        return !crit.complies(line);
    }
}
