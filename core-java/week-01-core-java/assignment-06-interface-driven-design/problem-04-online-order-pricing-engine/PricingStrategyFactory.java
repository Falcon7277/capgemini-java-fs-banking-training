import java.util.Map;

public class PricingStrategyFactory {

    private static final Map<String, PricingStrategy> strategies = Map.of(
            "REGULAR", new RegularPricing(),
            "FESTIVAL", new FestivalPricing(),
            "PREMIUM", new PremiumPricing()
    );

    public static PricingStrategy getStrategy(String type) {
        PricingStrategy strategy = strategies.get(type.toUpperCase());
        if (strategy == null) {
            throw new IllegalArgumentException("Unsupported pricing strategy");
        }
        return strategy;
    }
}

