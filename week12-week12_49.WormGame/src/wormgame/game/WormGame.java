package wormgame.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Timer;
import wormgame.Direction;
import wormgame.domain.Apple;
import wormgame.domain.Piece;
import wormgame.domain.Worm;
import wormgame.gui.Updatable;

public class WormGame extends Timer implements ActionListener {

    private int width;
    private int height;
    private boolean continues;
    private Updatable updatable;
    private Worm worm;
    private Apple apple;

    public WormGame(int width, int height) {
        super(1000, null);

        this.width = width;
        this.height = height;
        this.continues = true;

        addActionListener(this);
        setInitialDelay(2000);
        
        worm = new Worm(width / 2, height / 2, Direction.DOWN);
        
        apple = newApple();
    }


    public boolean continues() {
        return continues;
    }

    public void setUpdatable(Updatable updatable) {
        this.updatable = updatable;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (!continues) {
            return;
        }
        worm.move();
        if (worm.runsInto(apple)) {
            worm.grow();
            apple = newApple();
        }
        continues = !worm.runsIntoItself();
        if (worm.getX() >= width || worm.getX() < 0 || 
                worm.getY() >= height || worm.getY() < 0)
            continues = false;
        updatable.update();
        setDelay(1000 / worm.getLength());    
    }
    
    public Apple newApple() {
        Random rand = new Random();
        Apple apple = new Apple(rand.nextInt(width), rand.nextInt(height));
        boolean valid = false;
        while(!valid) {
            valid = true;
            apple = new Apple(rand.nextInt(width), rand.nextInt(height));
            for (Piece piece : worm.getPieces()) {
                if (apple.runsInto(piece)) {
                    valid = false;
                    break;
                }
            }
        }
        return apple;
    }

    public Worm getWorm() {
        return worm;
    }

    public void setWorm(Worm worm) {
        this.worm = worm;
    }

    public Apple getApple() {
        return apple;
    }

    public void setApple(Apple apple) {
        this.apple = apple;
    }
    
    
}
