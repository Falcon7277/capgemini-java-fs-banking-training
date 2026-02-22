public class BankAccount {
    private final long accountNumber;   // account number can never change
    private String accountHolderName;
    private double balance;
    private boolean isActive;

    public BankAccount(long accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.isActive = true;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isAccountActive() {
        return isActive;
    }


    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void deposit(double amount) {
        if (!isActive) {
            return; // no transaction if inactive
        }

        if (amount <= 0) {
            return; // invalid deposit
        }

        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (!isActive || amount <= 0 || balance < amount) {
            return false;
        }
        balance -= amount;
        return true;
    }

    public void deactivateAccount() {
        isActive = false;
    }

}
