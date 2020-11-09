package ba.edu.ssst.csis280;

public class Employee extends Person {
    private double salary;

    public Employee(String firstName, String lastName, int yearOfBirth, double salary) {
        super(firstName, lastName, yearOfBirth);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [" + this.getFirstName() + " " + this.getLastName() + "]";
    }
}
