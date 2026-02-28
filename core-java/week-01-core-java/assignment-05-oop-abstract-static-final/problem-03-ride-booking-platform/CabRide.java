public class CabRide extends Ride{
    private static final double baseFarePerKm = 20.0;

    public CabRide(double distance, double surgeMultiplier) {
        super(distance, surgeMultiplier);
    }

    @Override
    public double calculateFare() {
        return distance * baseFarePerKm * surgeMultiplier;
    }
}
