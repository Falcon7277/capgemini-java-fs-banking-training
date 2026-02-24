public class FoodDeliveryApp {
    public static void main(String[] args) {
        Order veg = new VegOrder(101, 200);
        Order nonVeg = new NonVegOrder(102, 300);

        System.out.println("Veg Order Bill: " + veg.calculateBill());
        System.out.println("Non-Veg Order Bill: " + nonVeg.calculateBill());
    }
}
