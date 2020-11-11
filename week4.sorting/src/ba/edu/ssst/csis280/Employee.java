package ba.edu.ssst.csis280;

public class Employee implements Comparable {

    private final String fullName;
    private final int salary;

    Employee(String fullName, int salary) {

        this.fullName = fullName;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return this.getFullName() + " " + this.getSalary();
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
