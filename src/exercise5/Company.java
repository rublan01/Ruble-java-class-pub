package exercise5;

/**
 * Class Company
 * Task 4: Create a class Company with the following private data members: 
 * String name, double stockPrice. Implement a setter method for the stockPrice.
 * @author rublan01
 */
public class Company {
    private final String name;
    private double stockPrice;
    
    public Company(String name, double stockPrice) {
        this.name = name;
        this.stockPrice = stockPrice;
    }
    
    public String getName() {
        return name;
    }
    
    public double getStockPrice() {
        return stockPrice;
    }
    
    public double setStockPrice(double newStockPrice) {
        stockPrice = newStockPrice;
        return stockPrice;
    }
    
    @Override
    public String toString() {
        return String.format("%s trading at $%.2f", name, stockPrice);
    }
  
}
