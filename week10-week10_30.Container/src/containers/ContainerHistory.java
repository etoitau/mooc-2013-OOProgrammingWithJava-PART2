/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

package containers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class ContainerHistory {
    private List<Double> history;
    
    public ContainerHistory() {
        history = new ArrayList<Double>();
    }
    
    public void add(double situation) {
        history.add(situation);
    }
    
    public void reset() {
        history.clear();
    }
    
    public double maxValue() {
        return Collections.max(history);
    }
    
    public double minValue() {
        return Collections.min(history);
    }
    
    public double average() {
        double sum = 0;
        for (double value : history)
            sum += value;
        return sum / history.size();
    }
    
    public double greatestFluctuation() {
        double max = 0;
        if (history.size() < 2)
            return 0;
        for (int i = 1; i < history.size(); i++) {
            double diff = Math.abs(history.get(i) - history.get(i - 1));
            max = (diff > max) ? diff : max;
        }
        return max;
    }
    
    public double variance() {
        double sumDiffSq = 0;
        double avg = this.average();
        if (history.isEmpty())
            return 0;
        for (int i = 0; i < history.size(); i++) {
            sumDiffSq += Math.pow(history.get(i) - avg, 2);
        }
        return sumDiffSq / (history.size() - 1);
    }
    
    @Override
    public String toString() {
        return history.toString();
    }
}
