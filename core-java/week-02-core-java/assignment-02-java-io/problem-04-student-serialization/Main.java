import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String fileName = "src/week2/day2/assign7/problem4/students.ser";

        // creating list of Student objects
        List<Student> students = new ArrayList<>();
        students.add(new Student("Tanishq", 101, 8.9));
        students.add(new Student("Jatin", 102, 8.5));
        students.add(new Student("Ashwini", 103, 9.1));

        serializeStudents(fileName, students);
        deserializeStudents(fileName);
    }

    //perform serialization
    private static void serializeStudents(String fileName, List<Student> students) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {

            oos.writeObject(students);
            System.out.println("Students serialized successfully.");
        }
        catch (IOException e) {
            System.out.println("Serialization error: " + e.getMessage());
        }
    }

    //perform deserialization
    private static void deserializeStudents(String fileName) {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {

            List<Student> deserializedStudents = (List<Student>) ois.readObject();
            System.out.println("\nDeserialized Student Details:");
            for (Student s : deserializedStudents) {
                System.out.println(s);
            }
        }
        catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization error: " + e.getMessage());
        }
    }
}
