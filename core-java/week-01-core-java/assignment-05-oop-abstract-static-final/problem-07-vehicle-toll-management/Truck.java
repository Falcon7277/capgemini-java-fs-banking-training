public class Truck extends Vehicle{
    private final double TRUCK_FACTOR = 5.0;

    protected Truck(String vehicleNumber) {
        super(vehicleNumber);
    }

    @Override
    public double calculateToll() {
        return tollRate * TRUCK_FACTOR;
    }
}
