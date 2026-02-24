public class DiscountApp {
    public static void main(String[] args) {
        DiscountPolicy seasonal = new SeasonalDiscount(500);
        DiscountPolicy loyalty = new LoyaltyDiscount(300);

        double bill1 = seasonal.applyDiscount(4000);
        double bill2 = loyalty.applyDiscount(2500);

        System.out.println("Seasonal Bill Amount: " + bill1);
        System.out.println("Loyalty Bill Amount: " + bill2);

        System.out.println("Total Discounts Applied: "
                + DiscountPolicy.getDiscountCount());
    }
}
