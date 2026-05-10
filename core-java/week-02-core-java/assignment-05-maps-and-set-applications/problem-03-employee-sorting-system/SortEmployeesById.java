import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SortEmployeesById {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, String> employeeMap = new TreeMap<>();
        int n = sc.nextInt();//number of employee entries

        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            employeeMap.put(id, name);
        }

        // Display employees in ascending order of ID
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
