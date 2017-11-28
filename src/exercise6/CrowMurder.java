package exercise6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Class CrowMurder
 * @author rublan01
 */
public class CrowMurder {
    private final ArrayList<Crow> crows;

    public CrowMurder(String filename) {
        crows = new ArrayList();
        BufferedReader inputFile = null;
        try {
            inputFile = new BufferedReader(new FileReader(filename));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CrowMurder.class.getName()).log(Level.SEVERE, null, ex);
        }
        String line;
        try {
            while ((line = inputFile.readLine()) != null) {
                Scanner lineContent = new Scanner(line);
                if (lineContent.hasNext()) {
                    crows.add(new Crow());
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(CrowMurder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int size() {
        return crows.size();
    }
    
    public Crow getChief() {
        int maxAge = Integer.MIN_VALUE;
        Crow chief = null;
        for (Crow crow: crows) {
            if (crow.getAge() >= maxAge) {
                 chief = crow;
            }
        } return chief;
    }
    
}
