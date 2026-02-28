//Base abstract Payment class
public abstract class Payment{
    static int numOfTransactions;//keeps track of transactions
    public abstract void processPayment(double amount);// common method for precessing payment
    public final void printReceipt(String mode, double amount){//final method for printing details
        System.out.println("===========================================");
        System.out.println("--------------Payment Receipt--------------");
        System.out.println("Mode of transaction: " + mode);
        System.out.println("Amount processed : " + amount);
        System.out.println("Total number of transactions: " + numOfTransactions);
        System.out.println("===========================================");
    }
}
