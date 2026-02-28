public abstract class DiscountPolicy {
    protected final double discountLimit;
    protected static int discountCounter = 0;

    protected DiscountPolicy(double discountLimit) {
        this.discountLimit = discountLimit;
    }

    public abstract double applyDiscount(double amount);

    public static int getDiscountCount(){
        return discountCounter;
    }
    protected double capDiscount(double discount) {// if discount exceeds the limit we cap it
        return Math.min(discount, discountLimit);
    }
}
