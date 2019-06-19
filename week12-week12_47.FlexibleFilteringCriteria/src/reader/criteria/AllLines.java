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

public class AllLines implements Criterion {

    @Override
    public boolean complies(String line) {
        return true;
    }

}
