package exercise6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Class LemurConspiracy
 * @author rublan01
 */
public class LemurConspiracy {
    
 private final HashSet<Lemur> lemurs;

    public LemurConspiracy(String filename) throws FileNotFoundException, IOException {
        lemurs = new HashSet();
        BufferedReader inputFile = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = inputFile.readLine()) != null) {
            Scanner lineContent = new Scanner(line);
            for (Lemur lemur: lemurs) {
                if (lineContent.hasNext()) {
                lemurs.add(lemur);
            }
        }
    }
    }
  
    public int size() {
        return lemurs.size();
    }
    
    public HashSet<Lemur> getChief(int maxAge) {
        HashSet<Lemur> oldest = new HashSet();
        for (Lemur lemur: lemurs) {
            if (lemur.getAge() >= maxAge) {
                 oldest.add(lemur);
            }
        } return oldest;
    }
    
}

