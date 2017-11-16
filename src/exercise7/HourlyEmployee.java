package exercise7;

/**
 * @author anna
 */
public class HourlyEmployee extends Employee {
    
    private double wageRate;
    private double hours;

    public HourlyEmployee(double wageRate, double hours, String name, String ssn) {
        super(name, ssn);
        this.wageRate = wageRate;
        this.hours = hours;
    }

    public double getWageRate() {
        return wageRate;
    }

    public void setWageRate(double wageRate) {
        this.wageRate = wageRate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }
    
    public double getNetPay() {
        return netPay;
    }
    
    public void printWeeklyCheck() {
        double sal = 0;
        sal = (wageRate * hours);
        System.out.printf("%s makes $%.2f", name, sal);
    }
    
}
