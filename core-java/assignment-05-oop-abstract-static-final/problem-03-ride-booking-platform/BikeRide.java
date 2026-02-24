public class BikeRide extends Ride{
    private static final double baseFarePerKm = 10.0;// base fare has been taken per km

    public BikeRide(double distance, double surgeMultiplier) {
        super(distance, surgeMultiplier);
    }

    @Override
    public double calculateFare() {
        return distance * baseFarePerKm * surgeMultiplier;
    }
}
