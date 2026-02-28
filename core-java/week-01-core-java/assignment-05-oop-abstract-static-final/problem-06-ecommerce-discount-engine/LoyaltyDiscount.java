public class LoyaltyDiscount extends DiscountPolicy {

    private static final double LOYALTY_DISCOUNT = 0.10;

    public LoyaltyDiscount(double discountLimit) {
        super(discountLimit);
    }

    @Override
    public double applyDiscount(double amount) {
        double discount = amount * LOYALTY_DISCOUNT;
        discount = capDiscount(discount);

        discountCounter++;
        return amount - discount;
    }
}
