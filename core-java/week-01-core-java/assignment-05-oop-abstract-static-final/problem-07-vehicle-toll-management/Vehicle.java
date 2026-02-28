public abstract class Vehicle {
    protected static double tollRate = 50.0;// base toll rate
    protected final String vehicleNumber;

    protected Vehicle(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public abstract double calculateToll();
}
