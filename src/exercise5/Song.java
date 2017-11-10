package exercise5;

import java.util.Objects;

/**
 * Class Song
 * Task 7: Create a class Song with the following private data members: 
 *          String title, String artist.
 * 
 * Implement method equals. Two objects of type Song are equal 
 * if their titles and artists are equal.
 * 
 * Implement method hashCode. Hash code of an object is calculated as follows: 
 * numeric value of each letter in the title of a song is multiplied by that 
 * letter's position in the title and added to the accumulator (integer).
 * Numeric value of each letter in the artist of a song is multiplied by that
 * letter's position in the artist and added to the accumulator.
 * 
 * @author rublan01
 */
public class Song {
  private final String title;
  private final String artist;
  
  public Song(String title, String artist) {
      this.title = title;
      this.artist = artist;
  }
  
  public String getTitle() {
      return title;
  }
  
  public String getArtist() {
      return artist;
  }

  @Override
  public int hashCode() {
      int hash = 0;
      for (int i = 0; i < title.length(); i++) {
          char character = title.charAt(i);
          int val = (int) character;
          hash = hash + (i * val);
      }
      
      for (int i = 0; i < artist.length(); i++) {
          char character = artist.charAt(i);
          int val = (int) character;
          hash = hash + (i * val);
      }
      return hash;
      
//        int hash = 7;
//        hash = 71 * hash + Objects.hashCode(this.title);
//        hash = 71 * hash + Objects.hashCode(this.artist);
//        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Song other = (Song) obj;
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.artist, other.artist)) {
            return false;
        }
        return true;
    }
  
  public String toString() {
      return String.format("%s by %s", title, artist);
  }
  
}  
