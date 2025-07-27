public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, String model, int year, int numberOfDoors) {
        super(brand, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car Info:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Number of Doors: " + numberOfDoors);
    }

    @Override
    public void start() {
        System.out.println("Car engine revving... Ready to go!");
    }

    @Override
    public void stop() {
        System.out.println("Car is braking and coming to a halt.");
    }

    @Override
    public void refuel() {
        System.out.println("Filling up the car with gasoline.");
    }
}