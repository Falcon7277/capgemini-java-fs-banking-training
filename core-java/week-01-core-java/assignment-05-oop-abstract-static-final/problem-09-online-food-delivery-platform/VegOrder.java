public class VegOrder extends Order {

    private static final double SERVICE_CHARGE = 20;

    public VegOrder(int orderId, double baseAmount) {
        super(orderId, baseAmount);
    }

    @Override
    public double calculateBill() {
        double total = baseAmount + SERVICE_CHARGE;
        total += calculateTax(total);
        return total;
    }
}
