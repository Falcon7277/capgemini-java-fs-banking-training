import java.util.LinkedList;
import java.util.Queue;

public class QueueOperationsSimulator {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        queue.remove();
        queue.remove();

        System.out.println("Remaining elements in queue:");
        for (Integer num : queue) {
            System.out.println(num);
        }
        System.out.println("Front element using peek(): " + queue.peek());
    }
}
