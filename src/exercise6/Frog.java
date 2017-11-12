package exercise6;

import java.util.Objects;

/**
 * Class Frog
 * @author rublan01
 */
public class Frog {
    
    private final String name;
    private int age;
    private String color = "green";
    
    public Frog() {
        this.name = "Ted";
        this.age = 0;
        this.color = "green";
    }    
    
    public Frog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
    public String getColor() {
        return color;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + this.age;
        hash = 97 * hash + Objects.hashCode(this.color);
        return hash;
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
        final Frog other = (Frog) obj;
        if (this.age != other.age) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Frog{" + "name=" + name + ", age=" + age + ", color=" + color + '}';
    }
}