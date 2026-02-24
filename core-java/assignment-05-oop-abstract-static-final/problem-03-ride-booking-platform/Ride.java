public abstract class Ride {
    protected double distance;
    protected final double surgeMultiplier;

    public Ride(double distance, double surgeMultiplier) {
        this.distance = distance;
        this.surgeMultiplier = surgeMultiplier;
    }

    public abstract double calculateFare();
}
