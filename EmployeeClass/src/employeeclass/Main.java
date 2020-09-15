package employeeclass;

import java.util.Scanner;

public class Main {
    
    public void tripleSalary(Employee e) {
        e.raiseSalary(200);
    }
    
    public void start () {
        double x = 3.5;
        int nx = (int)x;  // how to change a variable from one type to another
        
        Person[] staff = new Person[4];
        staff[0] = new Employee("Keith Dent", 18500, 1996, 11, 21);
        staff[1] = new Employee("Robert Hedgpeth", 40000, 1998, 7, 9);
        staff[2] = new Student("Jack Flack", "Military Science");
        staff[3] = new Employee("Don Morrell", 28500, 2007, 5, 1);
        
        ((Employee)staff[0]).getSalary();
        
        for (Person e: staff) {
            if (e instanceof Employee) {  //like a boolean operator; if true, it was originally an employee
                ((Employee) e).raiseSalary(5);
            }
        }
        
        for (Person e: staff) {
            System.out.println(e.getDescription());
        }
        
        /*
        Scanner in = new Scanner(System.in); // making input so the user can add a new employee
        System.out.println("Enter: name, starting salary, and the y/m/d of a new employee:");
        String firstname = in.next();
        String lastname = in.next();
        double salary = in.nextDouble();
        int year = in.nextInt();
        int month = in.nextInt();
        int day = in.nextInt();
        
        // create an array of three Employee objects
        Employee[] staff = new Employee[3];       
        // output for the input
        //staff[0] = new Employee(firstname + " " + lastname, salary, year, month, day);
        tripleSalary(staff[0]); // triples the salary of the first employee, as well as includes the 5% raise
        
        staff[1] = new Employee("Robert Hedgpeth", 40000, 1998, 7, 9);
        staff[2] = new Employee("Don Morrell", 28500, 2007, 5, 1);
        
        // raise everyone's salary by 5%
        for (Employee e : staff) {
            e.raiseSalary(5);
        }
        
        //print all employee information
        for (Employee e : staff) {
            System.out.print("Name: " + e.getName() + ", Salary: $" + e.getSalary());
            System.out.print(", HireDay: " + e.getHireDay() + "\n\n");
        }
    }
*/     
    }
    public static void main(String[] args) {
        Main e = new Main();
        e.start();

    }
}