package exercise6;

import java.util.Objects;

/**
 * Class Lemur
 * @author rublan01
 */
public class Lemur {
        
    private final String name;
    private int age;
    private int tailLength;
    
    public Lemur() {
        this.name = "Zubumafoo";
        this.age = 0;
        this.tailLength = 20;
    }     

    public Lemur(String name, int age, int tailLength) {
        this.name = name;
        this.age = age;
        this.tailLength = tailLength;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getTailLength() {
        return tailLength;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.name);
        hash = 83 * hash + this.age;
        hash = 83 * hash + this.tailLength;
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
        final Lemur other = (Lemur) obj;
        if (this.age != other.age) {
            return false;
        }
        if (this.tailLength != other.tailLength) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Lemur{" + "name=" + name + ", age=" + age + ", tailLength=" + tailLength + '}';
    }
    
}
