package employeeclass;
import java.time.LocalDate;

public class Employee extends Person {
    // instance fields
    private double salary;
    private LocalDate hireDay;
    
    // constructor
    public Employee(String n, double s, int year, int month, int day) {
        super(n);
        salary = s;
        hireDay = LocalDate.of(year, month, day);
        //s = s * 2;
    }
    
    /*
    // method(s)
    public String getName() { return name; }
    public double getSalary() { return salary; }
    public LocalDate getHireDay() { return hireDay; }
    */

    // using "Insert Code\Getter" when right clicking
    public void raiseSalary(double raise) {
        double increase = (salary / 100) * raise;
        salary += increase;
    }

    public double getSalary() { return salary; }

    public LocalDate getHireDay() { return hireDay; }
    
    @Override
    public String getDescription() {
        return super.getName() + ", an employee makint " + salary;
    }
}