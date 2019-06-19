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

public class AtLeastOne implements Criterion {
    private Criterion[] crits;
    
    public AtLeastOne(Criterion... crits) {
        this.crits = crits;
    }

    @Override
    public boolean complies(String line) {
        for (Criterion criterion: crits) {
            if (criterion.complies(line))
                return true;
        }
        return false;
    }
}
