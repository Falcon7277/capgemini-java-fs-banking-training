import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FilesReader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean readSuccesfull = false;
        while (!readSuccesfull) {
            System.out.print("Enter file path: ");
            String filePath = sc.nextLine();

            try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
                String line;
                System.out.println("\n--- File Content ---");
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
                readSuccesfull = true;
            }
            catch (FileNotFoundException e) {
                System.out.println("Error: File not found, please enter a valid file path.");
            }
            catch (IOException e) {
                System.out.println("Error while reading the file: " + e.getMessage());
            }
        }
        sc.close();
    }
}
