import java.util.LinkedHashMap;
import java.util.Map;

public class OrderHistoryTracker {
    public static void main(String[] args) {
        Map<Integer, String> orderHistory = new LinkedHashMap<>();
        orderHistory.put(501, "Laptop");
        orderHistory.put(502, "Mobile");
        orderHistory.put(503, "Headphones");
        orderHistory.put(504, "Keyboard");

        //Displaying all orders in insertion order
        System.out.println("Order History:");
        for (Map.Entry<Integer, String> entry : orderHistory.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        //Removing a canceled order
        int cancelledOrderId = 502;
        orderHistory.remove(cancelledOrderId);

        //Displaying updated order history
        System.out.println("\nAfter Cancellation:");
        for (Map.Entry<Integer, String> entry : orderHistory.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
