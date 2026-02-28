public class FixedDepositAccount extends BankAccount {
    @Override
    public void calculateInterest(double amount) {
        double interestAmount = INTEREST_RATE * amount;
        System.out.println("Interest amount for fixed deposit account is: " + interestAmount);
    }
}
