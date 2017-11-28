package exercise6;

import java.util.Objects;

/**
 * Class Crow
 * @author rublan01
 */
public class Crow {
    private final String name;
    private int age;
    private int iq;
    
    public Crow() {
        this.name = "Sally";
        this.age = 0;
        this.iq = 100;
    }

    public Crow(String name, int age) {
        this.name = name;
        this.age = age;
        this.iq = 100;
    }
    public Crow(String name, int age, int iq) {
        this.name = name;
        this.age = age;
        this.iq = iq;
    }
    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
    public int getIQ() {
        return iq;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.name);
        hash = 79 * hash + this.age;
        hash = 79 * hash + this.iq;
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
        final Crow other = (Crow) obj;
        if (this.age != other.age) {
            return false;
        }
        if (this.iq != other.iq) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Crow{" + "name=" + name + ", age=" + age + ", iq=" + iq + '}';
    }

    
}
