package ba.edu.ssst.csis280;

public class Company implements IEarnings {
    private String name;
    private double monthlyRevenue;

    public Company(String name, double monthlyRevenue) {
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
        double yearTotal = 12 * monthlyRevenue;

        if (yearTotal > 50000) {
            return yearTotal - (yearTotal * 0.30);
        } else {
            return yearTotal - (yearTotal * 0.10);
        }
    }
}
