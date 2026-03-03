import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class NestedExceptions {
    public static void main(String[] args) {
        String filePath;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the filepath: ");
        filePath = sc.next();
        try{
            FileReader reader = new FileReader(filePath);
        }
        catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
            try {
                int result = 10 / 0;
                System.out.println(result);

            } catch (ArithmeticException ex) {
                System.out.println("Error: Cannot divide by zero.");
            }
        }
    }
}
