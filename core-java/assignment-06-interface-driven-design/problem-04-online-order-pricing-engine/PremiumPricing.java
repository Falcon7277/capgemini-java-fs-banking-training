public class PremiumPricing implements PricingStrategy {

    @Override
    public double calculatePrice(double basePrice) {
        // considering 10 % discount for premium customers
        double price = basePrice * 0.9;
        return applyTax(price);
    }
}
