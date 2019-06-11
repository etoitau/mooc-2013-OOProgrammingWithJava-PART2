/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

package application;

import java.util.ArrayList;
import java.util.List;

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class AverageSensor implements Sensor {
    private List<Sensor> sensors;
    private List<Integer> readings;
    
    public AverageSensor() {
        sensors = new ArrayList<Sensor>();
        readings = new ArrayList<Integer>();
    }
    
    public void addSensor(Sensor additional) {
        sensors.add(additional);
    }
    
    public List<Integer> readings() {
        return readings;
    }
    
    @Override
    public boolean isOn() {
        for (Sensor sensor : sensors) {
            if (!sensor.isOn())
                return false;
        }
        return true;            
    }

    @Override
    public void on() {
        for (Sensor sensor : sensors) {
            sensor.on();
        }
    }

    @Override
    public void off() {
        for (Sensor sensor : sensors) {
            sensor.off();
        }
    }

    @Override
    public int measure() {
        long running = 0;
        if (!this.isOn() || sensors.isEmpty())
            throw new IllegalStateException();
        for (Sensor sensor : sensors) {
            running += sensor.measure();
        }
        int measurement = (int) running / sensors.size();
        readings.add(measurement);
        
        return measurement;
    }

}
