/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

package clicker.applicationlogic;

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class PersonalCalculator implements Calculator {
    private int value = 0;
    
    @Override
    public int giveValue() {
        return value;
    }

    @Override
    public void increase() {
        value++;
    }

}
