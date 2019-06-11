/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

package application;

import java.util.Random;

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class Thermometer implements Sensor {
    private boolean on = false;
    private Random rand;
    
    public Thermometer() {
        rand = new Random();
    }
    
    @Override
    public boolean isOn() {
        return on;
    }

    @Override
    public void on() {
        on = true;
    }

    @Override
    public void off() {
        on = false;
    }

    @Override
    public int measure() {
        if (on) {
            return rand.nextInt(61) - 30;
        } else {
            throw new IllegalStateException();
        }
    }
    
}
