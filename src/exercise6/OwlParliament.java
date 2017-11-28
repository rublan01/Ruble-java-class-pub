package exercise6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Class OwlParliament
 * @author rublan01
 */
public class OwlParliament {
    private final HashSet<Owl> owls;

    public OwlParliament(String filename) throws FileNotFoundException, IOException {
        owls = new HashSet();
        BufferedReader inputFile = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = inputFile.readLine()) != null) {
            Scanner lineContent = new Scanner(line);
            if (lineContent.hasNext()) {
                owls.add(new Owl());
            }
        }
    }
    
    public int size() {
        return owls.size();
    }
    
    public HashSet<Owl> getChief(int maxAge) {
        HashSet<Owl> oldest = new HashSet();
        for (Owl owl: owls) {
            if (owl.getAge() >= maxAge) {
                 oldest.add(owl);
            }
        } return oldest;
    }
    
}
