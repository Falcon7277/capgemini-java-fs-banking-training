public class Bike extends Vehicle{
    private final double BIKE_FACTOR = 1.0;

    protected Bike(String vehicleNumber) {
        super(vehicleNumber);
    }

    @Override
    public double calculateToll() {
        return tollRate * BIKE_FACTOR;
    }
}
