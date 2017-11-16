package exercise7;

/**
 * @author anna
 */
public class SalariedEmployee extends Employee {
    
    private double salary;

    public SalariedEmployee(double salary, String name, String ssn) {
        super(name, ssn);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public void printWeeklyCheck() {
        double weekSalary = 0;
        weekSalary = salary / 52;
    }    
    
}
