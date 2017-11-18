package exercise8;

import java.util.ArrayList;

/**
 * Class DigitalMovie
 * MediaLIbrary code 2
 * @author rublan01
 */
public class DigitalMovie extends Movie {
  private String service;

    public DigitalMovie(String service, String director, int releaseYear, long id, String title, int quantity) {
        super(director, releaseYear, id, title, quantity);
        this.service = service;
    }
    
    @Override
    public void checkout() {
        
    }
    
    @Override
    public void checkin() {
        
    }
    
    public String getInfo() {
        return (title + "(" + releaseYear + ") by " + director + "is avaliable via " + service);
    }
  
  /**
   * Get the value of service
   * @return the value of service
   */
  public String getService() {
    return service;
  }

  /**
   * Set the value of service
   * @param service new value of service
   */
  public void setService(String service) {
    this.service = service;
  }
  
}
