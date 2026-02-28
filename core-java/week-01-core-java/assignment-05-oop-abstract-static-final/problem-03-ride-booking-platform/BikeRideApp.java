public class BikeRideApp {
    public static void main(String[] args) {
        Ride bike = new BikeRide(5, 1.2);
        Ride cab = new CabRide(5, 1.5);

        System.out.println("Bike Fare: " + bike.calculateFare());
        System.out.println("Cab Fare: " + cab.calculateFare());
    }
}
