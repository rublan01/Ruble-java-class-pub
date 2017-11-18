package exercise8;

/**
 * Class PhysicalMovie
 * MediaLIbrary code 1
 * @author rublan01
 */
public class PhysicalMovie extends Movie {
  private final String medium;
  private String location;

    public PhysicalMovie(String medium, String location, String director, int releaseYear, long id, String title, int quantity) {
        super(director, releaseYear, id, title, quantity);
        this.medium = medium;
        this.location = location;
    }

  /**
   * Get the value of medium
   * @return the value of medium
   */
  public String getMedium() {
    return medium;
  }
  
  /**
   * Get the value of location
   * @return the value of location
   */
  public String getLocation() {
    return location;
  }

  /**
   * Set the value of location
   * @param location new value of location
   */
  private void setLocation(String location) {
    this.location = location;
  }
  
  /**
   * Move an item to a new location
   * @param newLocation 
   */
  public void move(String newLocation) {
    location = newLocation;
  }
  
    public String getInfo() {
        return (title + " (" + releaseYear + ") by " + director + " is located at " + location);
    }  

}
