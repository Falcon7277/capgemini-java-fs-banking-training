public class CreditCardPayment extends Payment{
    @Override
    public void processPayment(double amount) {
        System.out.println("===========================================");
        System.out.println("Processing CreditCard Payment for amount: " + amount);
        if(amount <= 0){
            System.out.println("Transaction failed : Invalid Amount");
            return;
        }
        System.out.println("Transaction Successful");
        numOfTransactions++;
        printReceipt("Credit Card", amount);
    }
}
