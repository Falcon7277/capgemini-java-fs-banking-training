import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String sourceFile = "src/week2/day2/assign7/problem1/source.txt";
        String destinationFile = "src/week2/day2/assign7/problem1/destination.txt";

        copyFile(sourceFile, destinationFile);
    }

    private static void copyFile(String sourceFile, String destinationFile) {

        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destinationFile)) {

            byte[] buffer = new byte[1024];
            int bytes;

            while ((bytes = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytes);
            }

            System.out.println("File copied successfully.");
        }
        catch (FileNotFoundException e) {
            System.out.println("Error: Source file not found.");

        }
        catch (IOException e) {
            System.out.println("I/O error occurred: " + e.getMessage());
        }
    }
}
