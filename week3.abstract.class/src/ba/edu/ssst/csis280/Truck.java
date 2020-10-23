package ba.edu.ssst.csis280;

public class Truck extends Vehicle {
    private double numberOfKilograms;

    public Truck(double numberOfKilograms, String licencePlate) {
        super(licencePlate);
        this.numberOfKilograms = numberOfKilograms;
    }

    public double getNumberOfKilograms() {
        return this.numberOfKilograms;
    }

    @Override
    public String toString() {
        return "Truck [" + super.getLicencePlate() + "] with " + this.getNumberOfKilograms() + " available load.";
    }
}
