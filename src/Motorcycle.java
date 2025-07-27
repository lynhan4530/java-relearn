// filepath: d:\RelearnJava\java-relearn\src\Motorcycle.java
public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String brand, String model, int year, boolean hasSidecar) {
        super(brand, model, year);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void displayInfo() {
        System.out.println("Motorcycle Info:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
    }

    @Override
    public void start() {
        System.out.println("Motorcycle roaring to life! Vroom!");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle is slowing down and parking.");
    }

    @Override
    public void refuel() {
        System.out.println("Topping up the motorcycle tank with petrol.");
    }
}