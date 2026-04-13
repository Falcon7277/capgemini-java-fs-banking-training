import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class LargeFileCopyUsingNIO {

    public static void main(String[] args){
        try{
            Path source = Path.of("src/week2/day2/assign7_nio/problem1/source.txt");
            Path destination = Path.of("src/week2/day2/assign7_nio/problem1/destination.txt");

            copyUsingNIO(source, destination);
        }
        catch (IOException e) {
            System.out.println("Error occurred while copying using NIO: " + e.getMessage());
        }
    }

    public static void copyUsingNIO(Path source, Path destination) throws IOException {

        long startTime = System.currentTimeMillis();
        try (FileChannel srcChannel = FileChannel.open(source, StandardOpenOption.READ);
                FileChannel destChannel = FileChannel.open(
                        destination,
                        StandardOpenOption.CREATE,// will create the file if does not exist
                        StandardOpenOption.WRITE,// allow writing in the file
                        StandardOpenOption.TRUNCATE_EXISTING// truncate file if it already exists
                ))
        {

            ByteBuffer buffer = ByteBuffer.allocateDirect(1024 * 1024); // 1 MB buffer
            while (srcChannel.read(buffer) > 0) {
                buffer.flip();          // switch to read mode
                destChannel.write(buffer);
                buffer.clear();         // switch to write mode
            }
        }

        long endTime = System.currentTimeMillis();
        System.out.println("NIO Copy Time: " + (endTime - startTime) + " ms");
    }
}
