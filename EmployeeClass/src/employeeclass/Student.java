
package employeeclass;

public class Student extends Person {
    private String major;
    public Student (String name, String major) {
        super(name);
        this.major = major;
    }

    @Override
    public String getDescription() {
        return super.getName() + ", a student majoring in " + major;
    }
}
