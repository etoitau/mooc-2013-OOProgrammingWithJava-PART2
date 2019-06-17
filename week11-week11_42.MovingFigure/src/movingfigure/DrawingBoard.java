/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

package movingfigure;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class DrawingBoard extends JPanel {
    private Figure fig;
    
    public DrawingBoard(Figure fig) {
        this.fig = fig;
        super.setBackground(Color.WHITE);
    }
    
    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        fig.draw(graphics);
    }
    
    
}
