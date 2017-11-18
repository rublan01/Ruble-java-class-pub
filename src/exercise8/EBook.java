package exercise8;

/**
 * Class EBook
 * MediaLIbrary code 4
 * @author rublan01
 */
public class EBook extends Book {
  private final String format;

    public EBook(String format, String author, int publishingYear, long id, String title, int quantity) {
        super(author, publishingYear, id, title, quantity);
        this.format = format;
    }
  
    @Override
    public void checkout() {
        
    }
    
    @Override
    public void checkin() {
        
    }
  
  /**
   * Get the book format
   * @return the value of format
   */
  public String getFormat() {
    return format;
  }
  
  public String getInfo() {
      return (title + " (" + publishingYear + ") by " + author + " is avaliable for " + format);
  }
  
}
