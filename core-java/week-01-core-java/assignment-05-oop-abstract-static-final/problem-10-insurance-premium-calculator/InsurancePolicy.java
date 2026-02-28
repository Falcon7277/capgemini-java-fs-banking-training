public abstract class InsurancePolicy {

    protected final String policyNumber;
    protected int policyTerm; // consdering in years
    protected static double basePremium = 5000.0;

    protected InsurancePolicy(String policyNumber, int policyTerm) {
        this.policyNumber = policyNumber;
        this.policyTerm = policyTerm;
    }

    public static double getBasePremium() {
        return basePremium;
    }

    public abstract double calculatePremium();
}
