public class VehicleInsurance extends InsurancePolicy {

    private String vehicleType; // either Car or Bike
    private int engineCC;

    public VehicleInsurance(String policyNumber, int policyTerm, String vehicleType, int engineCC) {
        super(policyNumber, policyTerm);
        this.vehicleType = vehicleType;
        this.engineCC = engineCC;
    }

    @Override
    public double calculatePremium() {
        double premium = basePremium;

        if (engineCC > 1500) {
            premium += 2500;
        }
        if ("Car".equalsIgnoreCase(vehicleType)) {
            premium += 1500;
        }

        return premium * policyTerm;
    }
}
