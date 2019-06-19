/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

package wormgame.gui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import wormgame.domain.Piece;
import wormgame.game.WormGame;

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class DrawingBoard extends JPanel implements Updatable {
    private int pieceLength;
    private WormGame game;
    
    public DrawingBoard(WormGame game, int pieceLength) {
        super.setBackground(Color.GRAY);
        this.pieceLength = pieceLength;
        this.game = game;
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        for (Piece piece: game.getWorm().getPieces()) {
            g.fill3DRect(piece.getX() * pieceLength, piece.getY() * pieceLength, 
                    pieceLength, pieceLength, true);
        }
        g.setColor(Color.RED);
        g.fillOval(game.getApple().getX() * pieceLength, 
                game.getApple().getY() * pieceLength, 
                pieceLength, pieceLength);
    }

    @Override
    public void update() {
        this.repaint();
    }
    
}
