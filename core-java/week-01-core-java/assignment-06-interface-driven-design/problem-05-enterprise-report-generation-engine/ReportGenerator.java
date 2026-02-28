import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public interface ReportGenerator {
    void generateReport(Object data);

    default boolean validate(Object data) {
        if (data == null) {
            System.out.println("Invalid data: null");
            return false;
        }
        return true;
    }

    //this method is used for timestamp generation of the report
    static String generateTimestamp() {
        return LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
}
