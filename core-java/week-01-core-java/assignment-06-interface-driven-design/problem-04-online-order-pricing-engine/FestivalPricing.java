public class FestivalPricing implements PricingStrategy {

    @Override
    public double calculatePrice(double basePrice) {
        // considering 20% discount during festival
        double price = basePrice * 0.8;
        return applyTax(price);
    }
}

