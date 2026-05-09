import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueWordCounter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        String[] words = sentence.toLowerCase().split("\\s+");

        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));
        System.out.println("Number of unique words: " + uniqueWords.size());
        sc.close();
    }
}
