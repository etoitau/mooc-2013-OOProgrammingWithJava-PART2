/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

package containers;

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class ProductContainerRecorder extends ProductContainer {
    private ContainerHistory history;

    public ProductContainerRecorder(String name, double capacity, double initialVolume) {
        super(name, capacity);
        super.addToTheContainer(initialVolume);
        history = new ContainerHistory();
        history.add(initialVolume);
    }
    
    public String history() {
        return history.toString();
    }
    
    public void printAnalysis() {
        System.out.println("Product: " + this.getName());
        System.out.println("History: " + this.history());
        System.out.println("Greatest product amount: " + history.maxValue());
        System.out.println("Smallest product amount: " + history.minValue());
        System.out.println("Average: " + history.average());
        System.out.println("Greatest change: " + history.greatestFluctuation());
        System.out.println("Variance: " + history.variance());
    }
    
    @Override
    public void addToTheContainer(double amount) {
        super.addToTheContainer(amount);
        history.add(this.getVolume());
    }
    
    @Override
    public double takeFromTheContainer(double amount) {
        double took = super.takeFromTheContainer(amount);
        history.add(this.getVolume());
        return took;
    }
}
