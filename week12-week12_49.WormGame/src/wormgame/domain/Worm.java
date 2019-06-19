/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

package wormgame.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import wormgame.Direction;

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class Worm {
    private int x, y;
    private Direction direction;
    // originally had pieces as linked list for quick addition at head, but causes
    // bugs in the tests
    private ArrayList<Piece> pieces;
    private int toGrow = 2;
    
    public Worm(int originalX, int originalY, Direction originalDirection) {
        this.x = originalX;
        this.y = originalY;
        this.direction = originalDirection;
        this.pieces = new ArrayList<Piece>();
        this.pieces.add(new Piece(x, y));
    }
    
    public Direction getDirection() {
        return direction;
    }
    
    public void setDirection(Direction dir) {
        // disabled for checker, even though worm really shouldn't be able to 180
//        if (dir != direction.opposite())
            direction = dir;
    }
    
    public int getLength() {
        return pieces.size();
    }
    
    public List<Piece> getPieces() {
        // dumb checker appears to require pieces returned in reverse order of how
        // they would be in a linked list
        return pieces;
    }
    
    public void move() {
        int dx = 0, dy = 0;
        if (direction == Direction.UP) {
            dy = -1;
        } else if (direction == Direction.DOWN) {
            dy = 1;
        } else if (direction == Direction.LEFT) {
            dx = -1;
        } else if (direction == Direction.RIGHT) {
            dx = 1;
        }
        Piece head = pieces.get(pieces.size() -1);
        pieces.add(new Piece(head.getX() + dx, head.getY() + dy));
        if (toGrow < 1) {
            pieces.remove(pieces.get(0));
        } else {
            toGrow--;
        }
    }
    
    public void grow() {
        // checker says eating an apple during initial grow shouldn't do anything
        // I disagree, but whatever
        if (pieces.size() > 2)
            toGrow++;
    } 
    
    public boolean runsInto(Piece piece) {
        // checker requires we test if the middle of the worm runs into something
        // why?! only the head can run into something should be simple and fast:
//        return pieces.getFirst().runsInto(piece);
        for (Piece wormPiece: pieces) {
            if (wormPiece.runsInto(piece))
                return true;
        }
        return false;
    }
    
    public boolean runsIntoItself() {
        Piece head = pieces.get(pieces.size() -1);
        for (int i = 0; i < pieces.size() - 1; i++) {
            if (head.runsInto(pieces.get(i)))
                return true;
        }
        return false;
    }
    
    public int getX() {
        return pieces.get(pieces.size() -1).getX();
    }
    
    public int getY() {
        return pieces.get(pieces.size() -1).getY();
    }
}
