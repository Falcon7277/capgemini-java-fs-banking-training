import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class LargeFileCopyUsingIO {
    public static void main(String[] args) {
        try {
            copyUsingIO("src/week2/day2/assign7_nio/problem1/source.txt",
                    "src/week2/day2/assign7_nio/problem1/destination.txt");
        }
        catch (Exception e){
            System.out.println("Error occurred while copying using IO: " + e.getMessage());
        }

    }
    public static void copyUsingIO(String source, String destination) throws IOException {

        long startTime = System.currentTimeMillis();
        try (FileInputStream fis = new FileInputStream(source);
                FileOutputStream fos = new FileOutputStream(destination)) {

            byte[] buffer = new byte[1024 * 1024]; // 1 MB buffer
            int bytes;
            while ((bytes = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytes);
            }
        }

        long endTime = System.currentTimeMillis();
        System.out.println("IO Copy Time: " + (endTime - startTime) + " ms");
    }


}
