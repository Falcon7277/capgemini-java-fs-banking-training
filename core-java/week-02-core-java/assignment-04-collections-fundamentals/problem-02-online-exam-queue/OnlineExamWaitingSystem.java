import java.util.LinkedList;
import java.util.Queue;

public class OnlineExamWaitingSystem {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Tanishq");
        queue.offer("Ashwini");
        queue.offer("Netal");
        queue.offer("Jatin");
        queue.offer("Prateek");
        System.out.println("Students currently waiting queue: ");
        for(String s : queue){
            System.out.print(s + " ");
        }
        queue.poll();
        queue.poll();
        System.out.println("Student waiting at the front of the queue after serving two students: " + queue.peek());
    }
}
