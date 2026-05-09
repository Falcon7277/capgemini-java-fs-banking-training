import java.util.*;

public class StudentAttendenceManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> studentsRollNo = new LinkedList<>();
        System.out.println("Enter the number of students: ");
        int n = sc.nextInt();
        System.out.println("Enter student roll numbers separated by space: ");
        for(int i = 0; i < n; i++){
            studentsRollNo.add(sc.nextInt());
        }
        Set<Integer> studentRollNoH = new LinkedHashSet<>(studentsRollNo);
        System.out.println("Final Attendence List: ");
        for(Integer i : studentRollNoH){
            System.out.println(i);
        }
    }
}
