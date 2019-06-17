/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

package calculator.logic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

/**
 * by Kyle Chatman
 * kchatman.com
 */

public abstract class Calculation implements ActionListener {
    
    protected JTextField in;
    protected JTextField out;
    
    public Calculation(JTextField in, JTextField out) {
        this.in = in;
        this.out = out;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        out.setText(crunch());
        in.setText("");
    }
    
    public boolean isInt() {
        // thanks to https://stackoverflow.com/a/5439547/11517662
        String s = in.getText().trim();
        if(s.isEmpty()) return false;
        for(int i = 0; i < s.length(); i++) {
            if(i == 0 && s.charAt(i) == '-') {
                if(s.length() == 1) return false;
                else continue;
            }
            if(Character.digit(s.charAt(i), 10) < 0) return false;
        }
        return true;
    }

    
    public abstract String crunch();

}
