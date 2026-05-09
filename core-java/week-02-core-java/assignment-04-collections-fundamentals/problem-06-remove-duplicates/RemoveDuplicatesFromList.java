import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesFromList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(8);
        numbers.add(5);
        numbers.add(3);
        numbers.add(10);
        numbers.add(1);

        System.out.println("Original List:");
        System.out.println(numbers);
        Set<Integer> uniqueSortedNumbers = new TreeSet<>(numbers);
        System.out.println("After removing duplicates (Sorted Order):");
        System.out.println(uniqueSortedNumbers);
    }
}
