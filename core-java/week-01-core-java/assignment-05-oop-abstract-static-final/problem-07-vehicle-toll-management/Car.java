public class Car extends Vehicle{
    private final double CAR_FACTOR = 2.0;

    protected Car(String vehicleNumber) {
        super(vehicleNumber);
    }

    @Override
    public double calculateToll() {
        return tollRate * CAR_FACTOR;
    }
}
