public class SavingsAccount extends BankAccount {
    @Override
    public void calculateInterest(double amount) {
        double interestAmount = INTEREST_RATE * amount;
        System.out.println("Interest amount for savings account is: " + interestAmount);
    }
}
