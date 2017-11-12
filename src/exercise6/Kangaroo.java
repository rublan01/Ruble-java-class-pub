package exercise6;

import java.util.Objects;

/**
 * Class Kangaroo
 * @author rublan01
 */
public class Kangaroo {
        
    private final String name;
    private int age;
    private int babies;
    
    public Kangaroo() {
        this.name = "George";
        this.age = 0;
        this.babies = 1;
    }

    public Kangaroo(String name, int age, int babies) {
        this.name = name;
        this.age = age;
        this.babies = babies;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getBabies() {
        return babies;
    } 

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.name);
        hash = 79 * hash + this.age;
        hash = 79 * hash + this.babies;
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
        final Kangaroo other = (Kangaroo) obj;
        if (this.age != other.age) {
            return false;
        }
        if (this.babies != other.babies) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Kangaroo{" + "name=" + name + ", age=" + age + ", babies=" + babies + '}';
    }
    
    
}
