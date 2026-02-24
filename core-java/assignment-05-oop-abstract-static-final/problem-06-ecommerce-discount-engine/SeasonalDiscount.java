public class SeasonalDiscount extends DiscountPolicy{
    private static final double SEASONAL_DISCOUNT = 0.20;
    protected SeasonalDiscount(double discountLimit) {
        super(discountLimit);
    }

    @Override
    public double applyDiscount(double amount) {
        double discount = amount * SEASONAL_DISCOUNT;
        discount = capDiscount(discount);

        discountCounter++;
        return amount - discount;
    }
}
