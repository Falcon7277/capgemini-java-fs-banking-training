public class BankAccountManagement {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(5000.0);
        try {
            account.withdraw(7000.0);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
