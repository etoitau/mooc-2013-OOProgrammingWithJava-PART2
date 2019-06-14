/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

package dungeon;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class Dungeon {
    private static final char[] DIRECTIONS = {'w', 'a', 's', 'd'};
    private final int length, height, nVamps;
    private int charge;
    private final boolean vampsMove;
    private Scanner reader = new Scanner(System.in);
    private final Hero hero;
    private final List<Vampire> vamps;
    
    
    public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove) {
        this.length = length;
        this.height = height;
        this.nVamps = vampires;
        this.charge = moves;
        this.vampsMove = vampiresMove;
        this.hero = new Hero(this);
        this.vamps = new ArrayList<Vampire>(vampires);
        for (int i = 0; i < nVamps; i++) {
            vamps.add(new Vampire(this));
        }
    }
    
    public void run() {
        while (true) {
            if (charge == 0) {
                System.out.println("YOU LOSE");
                break;
            }
            System.out.println(charge);
            System.out.println("\n" + hero);
            for (Vampire vamp : vamps) {
                System.out.println(vamp);
            }
            System.out.println("");
            printMap();
            String input = reader.nextLine();
            runMoves(input);
            if (vamps.isEmpty()) {
                System.out.println("YOU WIN");
                break;
            }
            charge--;
        }
        
    }
    
    public Hero getHero() {
        return hero;
    }
    
    public List<Vampire> getVampires() {
        return vamps;
    }
    
    public int getLength() {
        return length;
    }
    
    public int getHeight() {
        return height;
    }
    
    public boolean getVampsMove() {
        return vampsMove;
    }
    
    public boolean inBounds(Coordinate coord) {
        return (coord.getX() < length && coord.getX() >= 0 && 
                coord.getY() < height && coord.getY() >= 0);
    }
    
    private static char randWASD() {
        return DIRECTIONS[new Random().nextInt(4)];
    }
    
    private void runMoves(String input) {
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            hero.move(c);
            cleanVamps();
            for (Vampire vamp : vamps) {
                vamp.move(Dungeon.randWASD());
            }
            cleanVamps();
        }
    }
    
    private void cleanVamps() {
        List<Vampire> toRemove = new ArrayList<Vampire>();
        for (Vampire vampire : vamps) {
            if (!vampire.isAlive())
                toRemove.add(vampire);
        }
        vamps.removeAll(toRemove);
    }
    
    public boolean vampHere(Coordinate point) {
        boolean vampHere = false;
        for (Vampire vamp : vamps) {
            if (vamp.getCoordinate().equals(point)){
                vampHere = true;
                break;
            } 
        }
        return vampHere;
    }
    
    private void printMap() {
        for (int y = 0; y < height; y++) {
            StringBuilder sb = new StringBuilder();
            for (int x = 0; x < length; x++) {
                Coordinate point = new Coordinate(x, y);
                if (hero.getCoordinate().equals(point)) {
                    sb.append("@");
                } else {
                    if (vampHere(point)) {
                        sb.append("v");
                    } else {
                        sb.append(".");
                    }
                }
            }
            System.out.println(sb);
        }
        System.out.println("");
    }
}
