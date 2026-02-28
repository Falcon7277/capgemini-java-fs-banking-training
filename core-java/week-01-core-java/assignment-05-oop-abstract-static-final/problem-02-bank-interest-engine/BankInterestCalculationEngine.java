public class BankInterestCalculationEngine {
    public static void main(String[] args) {
        BankAccount b1 = new SavingsAccount();
        BankAccount b2 = new FixedDepositAccount();
        b1.calculateInterest(20000.0);
        b2.calculateInterest(30000.0);
    }
}
