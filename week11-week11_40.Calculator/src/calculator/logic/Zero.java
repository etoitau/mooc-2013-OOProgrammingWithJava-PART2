/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

package calculator.logic;

import javax.swing.JTextField;

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class Zero extends Calculation {

    public Zero(JTextField in, JTextField out) {
        super(in, out);
    }

    @Override
    public String crunch() {
        return "0";
    }

}
