package exercise6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Class FrogArmy
 * @author rublan01
 */
public class FrogArmy {
    private final ArrayList<Frog> frogs;

    public FrogArmy(String filename) throws FileNotFoundException, IOException {
        frogs = new ArrayList();
        BufferedReader inputFile = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = inputFile.readLine()) != null) {
            Scanner lineContent = new Scanner(line);
            if (lineContent.hasNext()) {
                frogs.add(new Frog());
            }
        }
    }
    
    public int size() {
        return frogs.size();
    }
    
    public HashSet<Frog> getChief(int maxAge) {
        HashSet<Frog> oldest = new HashSet();
        for (Frog frog: frogs) {
            if (frog.getAge() >= maxAge) {
                 oldest.add(frog);
            }
        } return oldest;
    }
    
}
