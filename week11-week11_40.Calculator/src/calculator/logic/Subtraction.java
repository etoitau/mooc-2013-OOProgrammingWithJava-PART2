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

public class Subtraction extends Calculation {

    public Subtraction(JTextField in, JTextField out) {
        super(in, out);
    }

    @Override
    public String crunch() {
        if (!isInt()) {
            return out.getText();
        }
        return Integer.toString(Integer.parseInt(out.getText()) - 
                Integer.parseInt(in.getText()));
    }

}
