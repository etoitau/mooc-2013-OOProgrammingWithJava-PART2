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

public class Both implements Criterion {
    private Criterion[] criteria;
    
    public Both(Criterion... criteria) {
        this.criteria = criteria;
    }
    
    // assignment checks require a constructor with this form even though 
    // covered by the above
    public Both(Criterion criterion1, Criterion criterion2) {
        this.criteria = new Criterion[]{criterion1, criterion2};
    }
    
    @Override
    public boolean complies(String line) {
        for (Criterion criterion: criteria) {
            if (!criterion.complies(line))
                return false;
        }
        return true;
    }

}
