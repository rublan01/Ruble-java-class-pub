package exercise10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class BookShop
 * @author rublan01
 */
public class BookShop {
    ArrayList<Book> catalog;


  public BookShop() {
      catalog = new ArrayList();
  }
  
  public BookShop(String filename) throws FileNotFoundException {
      new BookShop();
  }
  
  public BookShop(BookShop anotherBookShop) {
    this();
    catalog = (ArrayList<Book>)anotherBookShop.catalog.clone();      
  }
  
  public void addNewTitle(Book book) {
      catalog.add(book);
  }
  
  public int size() {
      return catalog.size();
  }
  
  public void discountAll(Double discountPercent) {
  }
  
  public void printCatalog() {
  }
  
  public void order(Comparator<Book> comp) {
  }
  
  public ArrayList<Book> getCatalog() {
  }

}
