public class InsuranceApp {

    public static void main(String[] args) {
        InsurancePolicy health = new HealthInsurance("H-101", 2, 50, true);
        InsurancePolicy vehicle = new VehicleInsurance("V-202", 1, "Car", 1800);

        System.out.println("Health Insurance Premium: " + health.calculatePremium());
        System.out.println("Vehicle Insurance Premium: " + vehicle.calculatePremium());
    }
}
