package wormgame;

public enum Direction {

    UP, RIGHT, DOWN, LEFT;
    
    public Direction opposite() {
        if (this == UP)
            return DOWN;
        if (this == DOWN)
            return UP;
        if (this == LEFT)
            return RIGHT;
        return LEFT;
    }
}
