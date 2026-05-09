import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class FirstNonRepeatedCharacterFinder {
    public static void main(String[] args) {
        String input = "aabbcdeff";
        Queue<Character> queue = new LinkedList<>();
        Set<Character> repeated = new HashSet<>();

        for (char ch : input.toCharArray()) {

            if (!repeated.contains(ch)) {
                if (queue.contains(ch)) {
                    queue.remove(ch);
                    repeated.add(ch);
                }
                else {
                    queue.add(ch);
                }
            }
        }

        if (!queue.isEmpty()) {
            System.out.println("First non-repeated character: " + queue.peek());
        } else {
            System.out.println("No unique character found.");
        }
    }
}
