/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise9b;

/**
 *
 * @author anna
 */
public class Ex9BConverter {
    
    public Double kilo2mile(Double valueFrom) {
        double distance = (valueFrom * 0.621371);
        return distance;
    }
    
    public Double mile2kilo(Double valueFrom) {
        double distance = (valueFrom * 1.609344);
        return distance;
    }
    
    public Double gram2oz(Double valueFrom) {
        double weight = (valueFrom * 0.0353);
        return weight;
    }
    
    public Double oz2gram(Double valueFrom) {
        double weight = (valueFrom * 28.35);
        return weight;
    }
    
    
    
}
