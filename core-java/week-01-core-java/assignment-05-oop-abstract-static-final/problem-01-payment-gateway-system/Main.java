//Client code
public class Main {
    public static void main(String[] args) {
        Payment p1 = new UPIPayment();
        Payment p2 = new CreditCardPayment();

        p1.processPayment(20000.0);
        p2.processPayment(30000.0);
    }
}
