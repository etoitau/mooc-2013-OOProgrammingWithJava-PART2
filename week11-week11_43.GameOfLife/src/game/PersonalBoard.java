/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

package game;

import gameoflife.GameOfLifeBoard;
import java.util.Random;

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class PersonalBoard extends GameOfLifeBoard {

    public PersonalBoard(int width, int height) {
        super(width, height);
    }

    public boolean inBoard(int x, int y) {
        if (x < 0 || y < 0)
            return false;
        if (x >= this.getWidth() || y >= this.getHeight()) 
            return false;
        return true;            
    }
    
    @Override
    public void initiateRandomCells(double d) {
        Random rand = new Random();
        for (int i = 0; i < this.getBoard().length; i++) {
            for (int j = 0; j < this.getBoard()[i].length; j++) {
                if (d > rand.nextDouble()) {
                    turnToLiving(i, j);
                } else {
                    turnToDead(i,j);
                }
            }
        }
    }

    @Override
    public boolean isAlive(int x, int y) {
        if (inBoard(x, y))
            return this.getBoard()[x][y];
        return false;
    }

    @Override
    public void turnToLiving(int x, int y) {
        if (inBoard(x, y))
            this.getBoard()[x][y] = true;
    }

    @Override
    public void turnToDead(int x, int y) {
        if (inBoard(x, y))
            this.getBoard()[x][y] = false;
    }

    @Override
    public int getNumberOfLivingNeighbours(int x, int y) {
        int count = 0;
        int[] d = {-1, 0, 1};
        for (int dx : d) {
            for (int dy : d) {
                if (inBoard(x + dx, y + dy)) {
                    if (!(dx == 0 && dy == 0)) {
                        if (isAlive(x + dx, y + dy)) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }

    @Override
    public void manageCell(int x, int y, int liveNeighbors) {
        if (isAlive(x, y)) {
            if (liveNeighbors < 2 || liveNeighbors > 3) 
                turnToDead(x, y);
        } else {
            if (liveNeighbors == 3)
                turnToLiving(x, y);
        }
    }

}
