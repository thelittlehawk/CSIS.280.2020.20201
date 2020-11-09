package ba.edu.ssst.csis280;

public class Main {

    private static String[] validLicencePlates = { "G24", "M28-J-123" };

    private static boolean IsRegistered(Vehicle vehicle) {
        boolean isValid = false;
        for (String licencePlate : validLicencePlates) {
            if (vehicle.getLicencePlate() == licencePlate) {
                isValid = true;
                break;
            }
        }
        return isValid;
    }

    public static void main(String[] args) {
        Car car = new Car(4, "M28-J-123");
        Truck truck = new Truck(1200.5, "M10-J-1G3");
        Motorcycle motorcycle = new Motorcycle("G24");

        Vehicle[] vehicles = { car, truck, motorcycle };
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
            System.out.println("Is registered? " + IsRegistered(vehicle));
            if (Car.class == vehicle.getClass()) {
                System.out.println("Number of seats " + ((Car) vehicle).getNumberOfSeats());
            }
            System.out.println();
        }
    }
}
