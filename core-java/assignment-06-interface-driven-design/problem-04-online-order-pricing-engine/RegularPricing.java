public class RegularPricing implements PricingStrategy {

    @Override
    public double calculatePrice(double basePrice) {
        // No discount for regular customers
        double price = basePrice;
        return applyTax(price);
    }
}

