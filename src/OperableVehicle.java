public interface OperableVehicle {
    void start();

    void stop();

    default void refuel() {
        System.out.println("Refueling the vehicle with generic fuel.");
    }

    static void checkOil() {
        System.out.println("Performing a general oil check on a vehicle.");
    }
}