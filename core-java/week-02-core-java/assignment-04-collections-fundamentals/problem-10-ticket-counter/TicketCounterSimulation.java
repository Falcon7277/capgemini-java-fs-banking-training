import java.util.LinkedList;
import java.util.Queue;

public class TicketCounterSimulation {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("Customer 1");
        queue.add("Customer 2");
        queue.add("Customer 3");
        queue.add("Customer 4");

        System.out.println("Customers in queue:");
        System.out.println(queue);
        System.out.println("\nServing Order:");
        while (!queue.isEmpty()) {
            String customer = queue.poll();
            System.out.println("Serving: " + customer);
        }
    }
}
