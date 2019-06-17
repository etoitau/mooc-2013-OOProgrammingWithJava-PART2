/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

package clicker.ui;

import clicker.applicationlogic.Calculator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class ClickListener implements ActionListener {
    private Calculator calc;
    private JLabel label;
    
    public ClickListener(Calculator calc, JLabel label) {
        this.calc = calc;
        this.label = label;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        calc.increase();
        label.setText(Integer.toString(calc.giveValue()));
    }

}
