public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {

        if (amount > balance) {
            throw new InsufficientFundsException(
                    "Withdrawal failed! Insufficient balance. Available balance: ₹" + balance);
        }

        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: ₹" + balance);
    }
}
