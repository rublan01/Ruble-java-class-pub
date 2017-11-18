package exercise8;

/**
 * Class Item
 * @author rublan01
 */
public abstract class Item {
  protected final long id;
  protected final String title;
  protected int quantity;

  public Item(long id, String title, int quantity) {
    this.id = id;
    this.title = title;
    this.quantity = quantity;
   }
  
    public long getID() {
        return id;
    }
    
    public String getTitle() {
        return title;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

  /**
   * Get the item availability
   * @return true if quantity > 0
   */
  public boolean isAvailable() {
    throw new UnsupportedOperationException();
  }

  /**
   * Check out an item (decrease quantity by 1, if possible
   */
  public void checkout() {
    if (quantity > 0) {
        quantity = quantity - 1;
    }
    else {
        System.out.println("Cannot checkout");
    }
  }

  /**
   * Check in an item
   */
  public void checkin() {
      quantity = quantity + 1;
  }
  
  @Override
  public String toString() {
      if (quantity > 1) {
          return ("We have " + quantity +  " copies of " + title);
      }
      else if (quantity == 1) {
          return ("We have a copy of " + title);
      }
      else {
          return ("No copies avaliable");
      }
  }

  /**
   * Get the item information
   * @return item information, type-specific
   */
  public abstract String getInfo();
  
}
