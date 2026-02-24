public abstract class Order {

    protected final int orderId;
    protected double baseAmount;

    protected static double taxRate = 0.05; // 5%

    protected Order(int orderId, double baseAmount) {
        this.orderId = orderId;
        this.baseAmount = baseAmount;
    }

    protected double calculateTax(double amount) {
        return amount * taxRate;
    }

    public abstract double calculateBill();
}
