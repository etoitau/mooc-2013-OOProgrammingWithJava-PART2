
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Exercise for Object Oriented Programming with Java, Part II
 * Course by University of Helsinki's Department of Computer Science
 * see https://mooc.fi/en/
 */

/**
 * by Kyle Chatman
 * kchatman.com
 */

public class Storehouse {
    private Map<String, Integer> prices, stocks;
    
    public Storehouse() {
        this.prices = new HashMap<String, Integer>();
        this.stocks = new HashMap<String, Integer>();
    }
    
    public void addProduct(String product, int price, int stock) {
        prices.put(product, price);
        stocks.put(product, stock);
    }
    
    public int price(String product) {
        if (!prices.containsKey(product))
            return -99;
        if (stocks.get(product) < 1)
            return -99;
        return prices.get(product);
    }
    
    public int stock(String product) {
        if (!stocks.containsKey(product))
            return 0;
        return stocks.get(product);
    }
    
    public boolean take(String product) {
        if (!stocks.containsKey(product))
            return false;
        if (stocks.get(product) < 1)
            return false;
        stocks.put(product, stocks.get(product) - 1);
        return true;
    }
    
    public Set<String> products() {
        return prices.keySet();
    }
}
