import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create objects
        Car car = new Car("Toyota", "Camry", 2022, 4);
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Street 750", 2021, true);

        // Polymorphic list
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(motorcycle);

        // Iterate and call methods
        for (Vehicle v : vehicles) {
            v.displayInfo();
            v.start();
            v.stop();
            v.honk();
            v.refuel();
            System.out.println("---");
        }

        // Call static interface method
        OperableVehicle.checkOil();

        // Direct interface usage (optional)
        OperableVehicle myRide = new Car("Honda", "Civic", 2023, 4);
        myRide.start();
        myRide.refuel();
    }
}