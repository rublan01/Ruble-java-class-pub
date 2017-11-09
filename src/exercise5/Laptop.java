package exercise5;

/**
 * Class Laptop
 * Task 6: Create a class Laptop with the following private data members: 
 *      String manufacturer, double price, String color. 
 * Implement setters for color and price.
 * @author rublan01
 */
public class Laptop {
    
    private final String manufacturer;
    private double price;
    private String color;
    
    public Laptop(String manufacturer, double price, String color) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.color = color;
    }
    
    public String getManufacturer() {
        return manufacturer;
    }
    
    public double getPrice() {
        return price;
    }
    
    public double setPrice(double newPrice) {
        price = newPrice;
        return price;
    }
    
    public String getColor() {
        return color;
    }
    
    public String setColor(String newColor) {
        color = newColor;
        return color;
    }
    
    @Override
    public String toString() {
        return String.format("%s makes a laptop in the color %s for $(%d)",
                manufacturer, color, price);
    }
  
}
