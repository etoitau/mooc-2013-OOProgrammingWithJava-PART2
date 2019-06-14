package dungeon;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Dungeon(length, height, number of vampires, vampires can move)
        new Dungeon(10, 5, 4, 5, true).run();
    }
}
