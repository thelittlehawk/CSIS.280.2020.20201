package ba.edu.ssst.csis280;

public class Car extends Vehicle {
    private int numberOfSeats;

    public Car(int numberOfSeats, String licencePlate) {
        super(licencePlate);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return this.numberOfSeats;
    }

    @Override
    public String toString() {
        return "Car [" + super.getLicencePlate() + "] with " + this.getNumberOfSeats() + " number of seats.";
    }
}
