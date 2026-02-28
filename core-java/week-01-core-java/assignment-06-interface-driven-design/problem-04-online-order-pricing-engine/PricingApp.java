import java.util.Scanner;

public class PricingApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter base price:");
        double basePrice = sc.nextDouble();

        System.out.println("Enter pricing type (REGULAR/FESTIVAL/PREMIUM):");
        String pricingType = sc.next();

        PricingStrategy strategy = PricingStrategyFactory.getStrategy(pricingType);

        double finalPrice = strategy.calculatePrice(basePrice);

        System.out.println("Final price: " + finalPrice);
    }
}
