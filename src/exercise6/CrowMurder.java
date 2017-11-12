package exercise6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Class CrowMurder
 * @author rublan01
 */
public class CrowMurder {
    private final ArrayList<Crow> crows;

    public CrowMurder(String filename) throws FileNotFoundException, IOException {
        crows = new ArrayList();
        BufferedReader inputFile = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = inputFile.readLine()) != null) {
            Scanner lineContent = new Scanner(line);
            if (lineContent.hasNext()) {
                crows.add(new Crow());
            }
        }
    }
    
    public int size() {
        return crows.size();
    }
    
    public HashSet<Crow> getChief(int maxAge) {
        HashSet<Crow> oldest = new HashSet();
        for (Crow crow: crows) {
            if (crow.getAge() >= maxAge) {
                 oldest.add(crow);
            }
        } return oldest;
    }
    
}
