package employeeclass;

public class Manager extends Employee {
    private double bonus;
    
    public Manager(String n, double s, int year, int month, int day, double b) {
        super (n, s, year, month, day);
        this.bonus = b;
    }
    @Override
    public double getSalary() {  // overrides getSalary() from Employee class
        return super.getSalary() + bonus;  // must use getter to access Employee field!
    }
    public void setBonus (double bonuns) {
        this.bonus = bonus;
    }
}
