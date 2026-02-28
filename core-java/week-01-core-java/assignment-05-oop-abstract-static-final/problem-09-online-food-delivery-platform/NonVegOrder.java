public class NonVegOrder extends Order {

    private static final double SERVICE_CHARGE = 40;
    private static final double NON_VEG_CHARGE = 30; //extra charge for handling non veg

    public NonVegOrder(int orderId, double baseAmount) {
        super(orderId, baseAmount);
    }

    @Override
    public double calculateBill() {
        double total = baseAmount + SERVICE_CHARGE + NON_VEG_CHARGE;
        total += calculateTax(total);
        return total;
    }
}
