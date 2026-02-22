public class BankApp {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(1001L, "Tanishq Sawarkar", 3000);
        TransactionService service = new TransactionService();

        System.out.println("Account Created Successfully");

        service.performDeposit(acc1, 5000);
        service.performWithdrawal(acc1, 2000);
        service.performWithdrawal(acc1, 10000);

        acc1.deactivateAccount();
        System.out.println("Account Deactivated");

        service.performDeposit(acc1, 1000);

        System.out.println("Final Balance: " + acc1.getBalance());
    }
}
