import java.io.FileWriter;
import java.io.IOException;

public class ResourceManagement {
    public static void main(String[] args) {
        String filePath = "output.txt";
        String data = "Hello, this data is written to the file output.txt using FileWriter.";

        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(data);
            System.out.println("Data written successfully.");
        }
        catch (IOException e) {
            System.out.println("Error while writing to the file: " + e.getMessage());
        }
    }
}
