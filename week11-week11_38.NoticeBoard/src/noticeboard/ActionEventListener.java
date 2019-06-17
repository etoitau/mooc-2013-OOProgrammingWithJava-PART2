/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

package noticeboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class ActionEventListener implements ActionListener {
    private JTextField from;
    private JLabel to;
    
    public ActionEventListener(JTextField from, JLabel to) {
        this.from = from;
        this.to = to;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        to.setText(from.getText());
        from.setText("");
    }

}
