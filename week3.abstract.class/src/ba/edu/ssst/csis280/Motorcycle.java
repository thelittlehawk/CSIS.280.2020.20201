package ba.edu.ssst.csis280;

public class Motorcycle extends Vehicle {
    public Motorcycle(String licencePlate) {
        super(licencePlate);
    }

    @Override
    public String toString() {
        return "Motorcycle [" + this.getLicencePlate() + "]";
    }
}
