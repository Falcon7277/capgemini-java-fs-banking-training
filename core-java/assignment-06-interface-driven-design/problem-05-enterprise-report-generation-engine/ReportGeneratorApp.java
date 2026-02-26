import java.util.Scanner;

public class ReportGeneratorApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter report format (PDF / EXCEL / JSON): ");
        String format = sc.next();
        System.out.println("Enter report data:");
        String data = sc.next();

        assign9.prob5.ReportGenerator generator = assign9.prob5.ReportGeneratorFactory.getGenerator(format);
        generator.generateReport(data);
    }
}
