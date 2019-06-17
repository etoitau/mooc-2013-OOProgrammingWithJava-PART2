/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

package movingfigure;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class KeyboardListener implements KeyListener {
    private Component comp;
    private Figure fig;
    
    public KeyboardListener(Component component, Figure figure) {
        this.comp = component;
        this.fig = figure;
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
        // nothing
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_LEFT) {
            fig.move(-1, 0);
        } else if (code == KeyEvent.VK_UP) {
            fig.move(0, -1);
        } else if (code == KeyEvent.VK_RIGHT) {
            fig.move(1, 0);
        } else if (code == KeyEvent.VK_DOWN) {
            fig.move(0, 1);
        }
        comp.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // nothing
    }

}
