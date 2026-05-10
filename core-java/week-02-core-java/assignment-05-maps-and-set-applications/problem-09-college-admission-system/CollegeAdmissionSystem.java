import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CollegeAdmissionSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // number of applications
        Set<Integer> applicationIds = new HashSet<>();

        for (int i = 0; i < n; i++) {
            applicationIds.add(sc.nextInt());
        }
        // Display unique application IDs
        for (int id : applicationIds) {
            System.out.println(id);
        }
    }
}
