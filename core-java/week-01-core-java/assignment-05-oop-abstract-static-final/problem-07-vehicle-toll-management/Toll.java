//This is the main code for this problem
public class Toll {
    public static void main(String[] args) {
        Vehicle car = new Car("MH12AB1234");
        Vehicle truck = new Truck("MH14TR5678");
        Vehicle bike = new Bike("MH31BK4321");

        System.out.println("Car Toll: " + car.calculateToll() + " for car: " + car.getVehicleNumber());
        System.out.println("Truck Toll: " + truck.calculateToll() + " for truck: " + truck.getVehicleNumber());
        System.out.println("Bike Toll: " + bike.calculateToll() + " for bike: " + bike.getVehicleNumber());
    }
}
