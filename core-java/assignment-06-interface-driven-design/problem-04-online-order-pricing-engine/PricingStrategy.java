public interface PricingStrategy {

    double calculatePrice(double basePrice);

    default double applyTax(double price) {
        double taxRate = 0.1; // considering 10% tax
        return price + (price * taxRate);
    }
}

