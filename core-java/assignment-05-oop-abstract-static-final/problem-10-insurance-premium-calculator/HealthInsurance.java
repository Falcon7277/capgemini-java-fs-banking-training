public class HealthInsurance extends InsurancePolicy {

    private int age;
    private boolean hasPreExistingDisease;

    public HealthInsurance(String policyNumber, int policyTerm, int age, boolean hasPreExistingDisease) {
        super(policyNumber, policyTerm);
        this.age = age;
        this.hasPreExistingDisease = hasPreExistingDisease;
    }

    @Override
    public double calculatePremium() {
        double premium = basePremium;

        if (age > 45) {
            premium += 2000;
        }
        if (hasPreExistingDisease) {
            premium += 3000;
        }

        return premium * policyTerm;
    }
}
