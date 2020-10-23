package ba.edu.ssst.csis280;

public abstract class Vehicle {
    private String licencePlate;

    public Vehicle(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    public String getLicencePlate() {
        return this.licencePlate;
    }

    @Override
    public String toString() {
        return "Vehicle [" + this.getLicencePlate() + "]";
    }
}
