import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentMarksLookup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Integer> marksMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int marks = sc.nextInt();
            marksMap.put(name, marks);
        }

        String searchName = sc.next();
        System.out.println(marksMap.get(searchName));
    }
}
