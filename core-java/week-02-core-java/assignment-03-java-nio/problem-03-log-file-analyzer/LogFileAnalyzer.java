import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class LogFileAnalyzer {
    public static void main(String[] args) {

        Path logFile = Path.of("src/week2/day2/assign7_nio/problem3/source_log.txt");
        long lineCount = 0;
        long errorCount = 0;
        long warningCount = 0;

        try (FileChannel channel = FileChannel.open(logFile, StandardOpenOption.READ)) {

            MappedByteBuffer buffer = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size());
            StringBuilder lineBuilder = new StringBuilder();
            while (buffer.hasRemaining()) {
                char c = (char) buffer.get();
                if (c == '\n') {
                    lineCount++;
                    String line = lineBuilder.toString();
                    if (line.contains("ERROR")) {
                        errorCount++;
                    }

                    if (line.contains("WARNING")) {
                        warningCount++;
                    }

                    lineBuilder.setLength(0); // clear for next line
                }
                else {
                    lineBuilder.append(c);
                }
            }
            // Handle last line (if file doesn't end with newline)
            if (lineBuilder.length() > 0) {
                lineCount++;
                String line = lineBuilder.toString();
                if (line.contains("ERROR")) errorCount++;
                if (line.contains("WARNING")) warningCount++;
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Total Lines   : " + lineCount);
        System.out.println("ERROR Count   : " + errorCount);
        System.out.println("WARNING Count : " + warningCount);
    }
}
