package exercise6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Class KangarooMob
 * @author rublan01
 */
public class KangarooMob { 
    private final HashSet<Kangaroo> kangs;

    public KangarooMob(String filename) throws FileNotFoundException, IOException {
        kangs = new HashSet();
        BufferedReader inputFile = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = inputFile.readLine()) != null) {
            Scanner lineContent = new Scanner(line);
            if (lineContent.hasNext()) {
                kangs.add(new Kangaroo());
            }
        }
    }
    
    public int size() {
        return kangs.size();
    }
    
    public HashSet<Kangaroo> getChief(int maxAge) {
        HashSet<Kangaroo> oldest = new HashSet();
        for (Kangaroo kang: kangs) {
            if (kang.getAge() >= maxAge) {
                 oldest.add(kang);
            }
        } return oldest;
    }
    
}
