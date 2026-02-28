public class TransactionService {

    public void performDeposit(BankAccount account, double amount) {

        if (!account.isAccountActive()) {
            System.out.println("Transaction Failed: Account is inactive");
            return;
        }

        if (amount <= 0) {
            System.out.println("Invalid deposit amount");
            return;
        }

        account.deposit(amount);
        System.out.println("Deposited: " + amount);
    }

    public void performWithdrawal(BankAccount account, double amount) {
        if (account.withdraw(amount)) {
            System.out.println("Withdrawal Successful: " + amount);
        } else if (!account.isAccountActive()) {
            System.out.println("Transaction Failed: Account is inactive");
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
        }
        else {
            System.out.println("Insufficient Balance");
        }
    }
}
