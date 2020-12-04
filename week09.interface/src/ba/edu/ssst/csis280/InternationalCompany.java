package ba.edu.ssst.csis280;

public class InternationalCompany implements IEarnings {
    private String name;
    private double monthlyRevenue;

    public InternationalCompany(String name, double monthlyRevenue) {
        this.name = name;
        this.monthlyRevenue = monthlyRevenue;
    }

    public String getName() {
        return name;
    }

    public double getMonthlyRevenue() {
        return monthlyRevenue;
    }

    @Override
    public double total() {
        return 12 * monthlyRevenue;
    }
}
