/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

package application;

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class ConstantSensor implements Sensor {
    private int value;
    
    public ConstantSensor(int value) {
        this.value = value;
    }
    
    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void on() {
        // does nothing
    }

    @Override
    public void off() {
        // does nothing
    }

    @Override
    public int measure() {
        return value;
    }

}
