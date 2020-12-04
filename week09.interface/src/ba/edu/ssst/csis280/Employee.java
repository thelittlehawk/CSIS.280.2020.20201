package ba.edu.ssst.csis280;

public class Employee implements IEarnings {
    private String fullName;
    private double monthlySalary;

    public Employee(String fullName, double monthlySalary) {
        this.fullName = fullName;
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public double total() {
        double yearTotal = 12 * monthlySalary;
        return yearTotal - (yearTotal * 0.15);
    }
}
