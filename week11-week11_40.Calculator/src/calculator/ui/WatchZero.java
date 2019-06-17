/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

package calculator.ui;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class WatchZero implements DocumentListener {
    JTextField field;
    JButton zButton;
    
    public WatchZero(JTextField field, JButton zButton) {
        this.field = field;
        this.zButton = zButton;
    }
    
    @Override
    public void insertUpdate(DocumentEvent e) {
        action();
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        action();
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        action();
    }
    
    private void action() {
        if (field.getText().equals("0")) {
            zButton.setEnabled(false);
        } else {
            zButton.setEnabled(true);
        }
    }

}
