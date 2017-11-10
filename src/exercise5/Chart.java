package exercise5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class Chart
 * Task 8: Create a class Chart that contains a private data member 
 *  HashMap<Integer, Song> (reuse class Song from task 7). 
 * Its constructor must take file name as a parameter, read data from the file 
 * (sample top40pop.csv is provided), create a new Song object from each line, 
 * and put that object into a HashMap using a song position as a key. Implement 
 * method getSong that takes an integer position as a parameter and returns a 
 * Song at that position. 
 * 
 * @author rublan01
 */
//public class Chart {
//    
//    private HashMap<Integer, Song> map = new HashMap<>();
//    
//    public Chart(String filename) throws FileNotFoundException, IOException {
//        map = new HashMap();
//        BufferedReader inputFile = new BufferedReader(new FileReader(filename));
//        String line;
////        Pattern p = Pattern.compile("(\s+)");
////        while ((line = inputFile.readLine()) != null) {
////            Matcher m = p.matcher(line.trim());
////            if (m.matches()) {
////                map.add(new Song(
////                    Integer.parseInt(m.group(1)),
////                        m.group(2),
////                    Integer.parseInt(m.group(4))
////                )
////            }
//        }
//    }
//    
//    public HashMap<Integer, Song> getMap() {
//        return map;
//    }
//    
//    //
//}
