import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.FileTime;
import java.util.stream.Stream;

public class SecureBackupTool{
    public static void main(String[] args) {
        Path sourceDir = Paths.get("D:/source");
        Path backupDir = Paths.get("D:/backup");

        try {
            backupDirectory(sourceDir, backupDir);
            System.out.println("Backup completed successfully.");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void backupDirectory(Path sourceDir, Path backupDir) throws IOException {

        try (Stream<Path> paths = Files.walk(sourceDir)) {
            paths.forEach(sourcePath -> {
                try {
                    Path targetPath = backupDir.resolve(
                            sourceDir.relativize(sourcePath));
                    // Create directories if needed
                    if (Files.isDirectory(sourcePath)) {
                        if (!Files.exists(targetPath)) {
                            Files.createDirectories(targetPath);
                        }
                        return;
                    }

                    // Copy new file
                    if (!Files.exists(targetPath)) {
                        Files.copy(sourcePath, targetPath,
                                StandardCopyOption.COPY_ATTRIBUTES);
                        System.out.println("New file backed up: " + targetPath);
                    }
                    else {
                        FileTime sourceTime =
                                Files.getLastModifiedTime(sourcePath);
                        FileTime targetTime =
                                Files.getLastModifiedTime(targetPath);
                        // Replace if source file is newer
                        if (sourceTime.compareTo(targetTime) > 0) {
                            Files.copy(sourcePath, targetPath,
                                    StandardCopyOption.REPLACE_EXISTING,
                                    StandardCopyOption.COPY_ATTRIBUTES);
                            System.out.println("Updated file backed up: " + targetPath);
                        }
                    }
                }
                catch (IOException e) {
                    System.err.println("Failed to backup: " + sourcePath);
                }
            });
        }
    }
}
