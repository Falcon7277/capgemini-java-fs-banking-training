import java.io.IOException;
import java.nio.file.*;

import static java.nio.file.StandardWatchEventKinds.*;

public class DirectoryWatcher {
    public static void main(String[] args) {

        Path dir = Paths.get("src/week2/day2/assign7_nio/problem2"); // folder to monitor
        try (WatchService watchService = FileSystems.getDefault().newWatchService()) {
            // Register directory with events
            dir.register(watchService, ENTRY_CREATE, ENTRY_MODIFY, ENTRY_DELETE);
            System.out.println("Watching directory: " + dir.toAbsolutePath());

            while (true) {
                WatchKey key;
                // Wait for an event (blocking call)
                key = watchService.take();
                for (WatchEvent<?> event : key.pollEvents()) {
                    WatchEvent.Kind<?> kind = event.kind();
                    // Context gives a relative path of a file
                    Path fileName = (Path) event.context();
                    if (kind == ENTRY_CREATE) {
                        System.out.println("File Created: " + fileName);
                    } else if (kind == ENTRY_MODIFY) {
                        System.out.println("File Modified: " + fileName);
                    } else if (kind == ENTRY_DELETE) {
                        System.out.println("File Deleted: " + fileName);
                    }
                }

                // Reset key to receive further events
                boolean valid = key.reset();
                if (!valid) {
                    System.out.println("Directory access lost. Stopping watcher.");
                    break;
                }
            }

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
